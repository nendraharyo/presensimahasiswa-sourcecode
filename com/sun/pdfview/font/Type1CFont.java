package com.sun.pdfview.font;

import android.graphics.Matrix;
import android.graphics.Path;
import c.a.a.e.b;
import com.sun.pdfview.PDFObject;
import java.io.PrintStream;

public class Type1CFont
  extends OutlineFont
{
  static int CMD = 0;
  static int FLT = 2;
  static int NUM = 1;
  Matrix at;
  int charsetbase;
  int charstringbase;
  int charstringtype;
  String[] chr2name;
  byte[] data;
  int[] encoding;
  int encodingbase;
  float fnum;
  String fontname;
  int[] glyphnames;
  int gsubrbase;
  int gsubrsoffset;
  int lsubrbase;
  int lsubrsoffset;
  String[] names;
  int nglyphs;
  int num;
  int pos;
  int privatebase;
  int privatesize;
  float[] stack;
  int stackptr;
  byte[] subrs;
  float[] temps;
  int type;
  
  public Type1CFont(String paramString, PDFObject paramPDFObject, PDFFontDescriptor paramPDFFontDescriptor)
  {
    super(paramString, paramPDFObject, paramPDFFontDescriptor);
    Object localObject1 = new String[i];
    this.chr2name = ((String[])localObject1);
    localObject1 = new float[100];
    this.stack = ((float[])localObject1);
    this.stackptr = 0;
    localObject1 = new int[i];
    this.encoding = ((int[])localObject1);
    localObject1 = null;
    i = 981668463;
    Object localObject2 = b.a(f, 0.0F, 0.0F, f, 0.0F, 0.0F);
    this.at = ((Matrix)localObject2);
    this.charstringtype = 2;
    localObject2 = new float[32];
    this.temps = ((float[])localObject2);
    this.charsetbase = 0;
    this.encodingbase = 0;
    this.charstringbase = 0;
    this.privatebase = 0;
    this.privatesize = 0;
    this.gsubrbase = 0;
    this.lsubrbase = 0;
    this.gsubrsoffset = 0;
    this.lsubrsoffset = 0;
    f = Float.MIN_VALUE;
    this.nglyphs = 1;
    boolean bool = PDFFont.sUseFontSubstitution;
    if (!bool)
    {
      localObject2 = paramPDFFontDescriptor.getFontFile3().getStream();
      this.data = ((byte[])localObject2);
    }
    this.pos = 0;
    bool = PDFFont.sUseFontSubstitution;
    if (!bool) {
      parse();
    }
  }
  
  private void buildAccentChar(float paramFloat1, float paramFloat2, char paramChar1, char paramChar2, Path paramPath)
  {
    float f1 = getWidth(paramChar2, null);
    Path localPath = getOutline(paramChar2, f1);
    Object localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    ((Matrix)localObject).setTranslate(paramFloat1, paramFloat2);
    Matrix localMatrix1 = new android/graphics/Matrix;
    Matrix localMatrix2 = this.at;
    localMatrix1.<init>(localMatrix2);
    localMatrix2 = this.at;
    boolean bool = localMatrix2.invert(localMatrix1);
    if (bool) {
      ((Matrix)localObject).preConcat(localMatrix1);
    }
    localPath.transform((Matrix)localObject);
    float f2 = getWidth(paramChar1, null);
    localObject = getOutline(paramChar1, f2);
    localMatrix1 = new android/graphics/Matrix;
    localMatrix1.<init>();
    localMatrix2 = this.at;
    bool = localMatrix2.invert(localMatrix1);
    if (bool) {
      ((Path)localObject).transform(localMatrix1);
    }
    paramPath.addPath((Path)localObject);
    paramPath.addPath(localPath);
  }
  
  private int getNameIndex(String paramString)
  {
    int i = -1;
    String[] arrayOfString1 = FontSupport.stdNames;
    int j = FontSupport.findName(paramString, arrayOfString1);
    if (j == i)
    {
      arrayOfString1 = this.names;
      j = FontSupport.findName(paramString, arrayOfString1);
      String[] arrayOfString2 = FontSupport.stdNames;
      int k = arrayOfString2.length;
      j += k;
    }
    if (j == i)
    {
      j = 0;
      arrayOfString1 = null;
    }
    return j;
  }
  
  private void parse()
  {
    int i = 2;
    readByte();
    readByte();
    int j = readByte();
    readByte();
    int k = getIndexSize(j) + j;
    int m = getIndexSize(k) + k;
    int n = getIndexSize(m) + m;
    this.gsubrbase = n;
    n = this.gsubrbase;
    n = calcoffset(n);
    this.gsubrsoffset = n;
    readNames(m);
    this.pos = k;
    m = readInt(i);
    n = 1;
    if (m != n)
    {
      printData();
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("More than one font in this file!");
      throw ((Throwable)localObject);
    }
    Object localObject = getIndexEntry(j, 0);
    String str = new java/lang/String;
    byte[] arrayOfByte = this.data;
    int i1 = ((Type1CFont.Range)localObject).getStart();
    j = ((Type1CFont.Range)localObject).getLen();
    str.<init>(arrayOfByte, i1, j);
    this.fontname = str;
    localObject = getIndexEntry(k, 0);
    readDict((Type1CFont.Range)localObject);
    localObject = new com/sun/pdfview/font/Type1CFont$Range;
    k = this.privatebase;
    m = this.privatesize;
    ((Type1CFont.Range)localObject).<init>(this, k, m);
    readDict((Type1CFont.Range)localObject);
    j = this.charstringbase;
    this.pos = j;
    j = readInt(i);
    this.nglyphs = j;
    j = this.charsetbase;
    readGlyphNames(j);
    j = this.encodingbase;
    readEncodingData(j);
  }
  
  private void printData()
  {
    int i = 32;
    char[] arrayOfChar = new char[17];
    int j = 0;
    int k = 0;
    PrintStream localPrintStream = null;
    Object localObject = this.data;
    int m = localObject.length;
    if (j >= m)
    {
      System.out.println();
      return;
    }
    localObject = this.data;
    m = localObject[j];
    int n = m & 0xFF;
    int i1;
    label81:
    String str2;
    if (n == 0)
    {
      m = k + 1;
      i1 = 46;
      arrayOfChar[k] = i1;
      k = 16;
      if (n >= k) {
        break label273;
      }
      localPrintStream = System.out;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      String str1 = "0";
      localStringBuilder.<init>(str1);
      str2 = Integer.toHexString(n);
      str2 = str2;
      localPrintStream.print(str2);
      label139:
      k = j & 0xF;
      n = 15;
      if (k != n) {
        break label295;
      }
      localPrintStream = System.out;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("      ");
      str2 = new java/lang/String;
      str2.<init>(arrayOfChar);
      localObject = str2;
      localPrintStream.println((String)localObject);
      k = 0;
      localPrintStream = null;
    }
    for (;;)
    {
      j += 1;
      break;
      if (n >= i)
      {
        m = 127;
        if (n < m) {}
      }
      else
      {
        m = k + 1;
        i1 = 63;
        arrayOfChar[k] = i1;
        break label81;
      }
      m = k + 1;
      i1 = (char)n;
      arrayOfChar[k] = i1;
      break label81;
      label273:
      localPrintStream = System.out;
      str2 = Integer.toHexString(n);
      localPrintStream.print(str2);
      break label139;
      label295:
      k = j & 0x7;
      n = 7;
      if (k == n)
      {
        localPrintStream = System.out;
        str2 = "  ";
        localPrintStream.print(str2);
        k = m + 1;
        arrayOfChar[m] = i;
      }
      else
      {
        k = j & 0x1;
        n = 1;
        if (k == n)
        {
          localPrintStream = System.out;
          str2 = " ";
          localPrintStream.print(str2);
        }
        k = m;
      }
    }
  }
  
  private int readByte()
  {
    byte[] arrayOfByte = this.data;
    int i = this.pos;
    int j = i + 1;
    this.pos = j;
    return arrayOfByte[i] & 0xFF;
  }
  
  private int readCommand(boolean paramBoolean)
  {
    int i = readNext(paramBoolean);
    int j = CMD;
    if (i == j) {
      return this.num;
    }
    float[] arrayOfFloat = this.stack;
    int k = this.stackptr;
    int m = k + 1;
    this.stackptr = m;
    m = NUM;
    if (i == m) {
      i = this.num;
    }
    for (float f = i;; f = this.fnum)
    {
      arrayOfFloat[k] = f;
      break;
    }
  }
  
  private void readDict(Type1CFont.Range paramRange)
  {
    int i = paramRange.getStart();
    this.pos = i;
    i = this.pos;
    int j = paramRange.getEnd();
    if (i >= j) {
      return;
    }
    float f1 = 0.0F;
    Object localObject = null;
    i = readCommand(false);
    j = 1006;
    float f2 = 1.41E-42F;
    float[] arrayOfFloat1;
    if (i == j)
    {
      localObject = this.stack;
      j = 0;
      f2 = 0.0F;
      arrayOfFloat1 = null;
      f1 = localObject[0];
      i = (int)f1;
      this.charstringtype = i;
    }
    for (;;)
    {
      i = 0;
      f1 = 0.0F;
      localObject = null;
      this.stackptr = 0;
      break;
      j = 1007;
      f2 = 1.411E-42F;
      int k;
      float[] arrayOfFloat2;
      float f3;
      if (i == j)
      {
        i = this.stackptr;
        j = 4;
        f2 = 5.6E-45F;
        int m;
        float[] arrayOfFloat3;
        float f4;
        int n;
        float f5;
        float[] arrayOfFloat4;
        int i1;
        float f6;
        float[] arrayOfFloat5;
        if (i == j)
        {
          localObject = this.stack;
          j = 0;
          f1 = localObject[0];
          arrayOfFloat1 = this.stack;
          k = 1;
          f2 = arrayOfFloat1[k];
          arrayOfFloat2 = this.stack;
          m = 2;
          f3 = arrayOfFloat2[m];
          arrayOfFloat3 = this.stack;
          f4 = arrayOfFloat3[3];
          n = 0;
          f5 = 0.0F;
          arrayOfFloat4 = null;
          i1 = 0;
          f6 = 0.0F;
          arrayOfFloat5 = null;
          localObject = b.a(f1, f2, f3, f4, 0.0F, 0.0F);
          this.at = ((Matrix)localObject);
        }
        else
        {
          localObject = this.stack;
          j = 0;
          f1 = localObject[0];
          arrayOfFloat1 = this.stack;
          k = 1;
          f2 = arrayOfFloat1[k];
          arrayOfFloat2 = this.stack;
          m = 2;
          f3 = arrayOfFloat2[m];
          arrayOfFloat3 = this.stack;
          n = 3;
          f4 = arrayOfFloat3[n];
          arrayOfFloat4 = this.stack;
          i1 = 4;
          f5 = arrayOfFloat4[i1];
          arrayOfFloat5 = this.stack;
          int i2 = 5;
          f6 = arrayOfFloat5[i2];
          localObject = b.a(f1, f2, f3, f4, f5, f6);
          this.at = ((Matrix)localObject);
        }
      }
      else
      {
        j = 15;
        f2 = 2.1E-44F;
        if (i == j)
        {
          localObject = this.stack;
          j = 0;
          f2 = 0.0F;
          arrayOfFloat1 = null;
          f1 = localObject[0];
          i = (int)f1;
          this.charsetbase = i;
        }
        else
        {
          j = 16;
          f2 = 2.24E-44F;
          if (i == j)
          {
            localObject = this.stack;
            j = 0;
            f2 = 0.0F;
            arrayOfFloat1 = null;
            f1 = localObject[0];
            i = (int)f1;
            this.encodingbase = i;
          }
          else
          {
            j = 17;
            f2 = 2.4E-44F;
            if (i == j)
            {
              localObject = this.stack;
              j = 0;
              f2 = 0.0F;
              arrayOfFloat1 = null;
              f1 = localObject[0];
              i = (int)f1;
              this.charstringbase = i;
            }
            else
            {
              j = 18;
              f2 = 2.5E-44F;
              if (i == j)
              {
                localObject = this.stack;
                arrayOfFloat1 = null;
                i = (int)localObject[0];
                this.privatesize = i;
                localObject = this.stack;
                j = 1;
                f2 = Float.MIN_VALUE;
                f1 = localObject[j];
                i = (int)f1;
                this.privatebase = i;
              }
              else
              {
                j = 19;
                f2 = 2.7E-44F;
                if (i == j)
                {
                  i = this.privatebase;
                  arrayOfFloat1 = this.stack;
                  k = 0;
                  f3 = 0.0F;
                  arrayOfFloat2 = null;
                  f2 = arrayOfFloat1[0];
                  j = (int)f2;
                  i += j;
                  this.lsubrbase = i;
                  i = this.lsubrbase;
                  i = calcoffset(i);
                  this.lsubrsoffset = i;
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void readEncodingData(int paramInt)
  {
    int i = 0;
    PrintStream localPrintStream = null;
    int j = 1;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int k;
    if (paramInt == 0)
    {
      localObject1 = FontSupport.standardEncoding;
      localObject2 = this.encoding;
      localObject3 = FontSupport.standardEncoding;
      k = localObject3.length;
      System.arraycopy(localObject1, 0, localObject2, 0, k);
    }
    for (;;)
    {
      return;
      if (paramInt == j)
      {
        localPrintStream = System.out;
        localObject1 = "**** EXPERT ENCODING!";
        localPrintStream.println((String)localObject1);
      }
      else
      {
        this.pos = paramInt;
        int m = readByte();
        k = m & 0x7F;
        if (k == 0)
        {
          i = readByte();
          for (;;)
          {
            m = i + 1;
            if (j >= m) {
              break;
            }
            m = readByte() & 0xFF;
            localObject3 = this.encoding;
            localObject3[m] = j;
            j += 1;
          }
        }
        k = m & 0x7F;
        if (k == j)
        {
          int n = readByte();
          int i1 = 0;
          i = j;
          label166:
          int i2;
          if (i1 < n)
          {
            m = readByte();
            i2 = readByte();
            j = i;
            i = m;
          }
          for (;;)
          {
            k = m + i2 + 1;
            if (i >= k)
            {
              i1 += 1;
              i = j;
              break label166;
              break;
            }
            int[] arrayOfInt = this.encoding;
            k = j + 1;
            arrayOfInt[i] = j;
            i += 1;
            j = k;
          }
        }
        localPrintStream = System.out;
        localObject2 = new java/lang/StringBuilder;
        localObject3 = "Bad encoding type: ";
        ((StringBuilder)localObject2).<init>((String)localObject3);
        localObject1 = m;
        localPrintStream.println((String)localObject1);
      }
    }
  }
  
  private Path readGlyph(int paramInt1, int paramInt2)
  {
    try
    {
      Object localObject1 = new com/sun/pdfview/font/FlPoint;
      ((FlPoint)localObject1).<init>();
      Type1CFont.Range localRange = getIndexEntry(paramInt1, paramInt2);
      Path localPath = new android/graphics/Path;
      localPath.<init>();
      int i = this.pos;
      this.stackptr = 0;
      parseGlyph(localRange, localPath, (FlPoint)localObject1);
      this.pos = i;
      localObject1 = this.at;
      localPath.transform((Matrix)localObject1);
      return localPath;
    }
    finally {}
  }
  
  private void readGlyphNames(int paramInt)
  {
    int i = 1;
    int j = 0;
    int[] arrayOfInt1 = null;
    int k = 2;
    int[] arrayOfInt2;
    if (paramInt == 0)
    {
      i = 229;
      arrayOfInt2 = new int[i];
      this.glyphnames = arrayOfInt2;
      arrayOfInt2 = this.glyphnames;
      i = arrayOfInt2.length;
      if (j < i) {}
    }
    label102:
    int[] arrayOfInt3;
    int m;
    int n;
    int i1;
    int[] arrayOfInt4;
    int i2;
    int i3;
    do
    {
      for (;;)
      {
        return;
        arrayOfInt2 = this.glyphnames;
        arrayOfInt2[j] = j;
        j += 1;
        break;
        if (paramInt == i)
        {
          arrayOfInt1 = FontSupport.type1CExpertCharset;
          this.glyphnames = arrayOfInt1;
        }
        else
        {
          if (paramInt != k) {
            break label102;
          }
          arrayOfInt1 = FontSupport.type1CExpertSubCharset;
          this.glyphnames = arrayOfInt1;
        }
      }
      arrayOfInt3 = new int[this.nglyphs];
      this.glyphnames = arrayOfInt3;
      arrayOfInt3 = this.glyphnames;
      arrayOfInt3[0] = 0;
      this.pos = paramInt;
      m = readByte();
      if (m == 0)
      {
        j = i;
        for (;;)
        {
          i = this.nglyphs;
          if (j >= i) {
            break;
          }
          arrayOfInt2 = this.glyphnames;
          m = readInt(k);
          arrayOfInt2[j] = m;
          j += 1;
        }
      }
      if (m == i) {
        for (;;)
        {
          m = this.nglyphs;
          if (i >= m) {
            break;
          }
          m = readInt(k);
          n = readByte() + 1;
          i1 = m;
          m = 0;
          arrayOfInt3 = null;
          while (m < n)
          {
            arrayOfInt4 = this.glyphnames;
            i2 = i + 1;
            i3 = i1 + 1;
            arrayOfInt4[i] = i1;
            m += 1;
            i1 = i3;
            i = i2;
          }
        }
      }
    } while (m != k);
    for (;;)
    {
      m = this.nglyphs;
      if (i >= m) {
        break;
      }
      m = readInt(k);
      n = readInt(k) + 1;
      i1 = m;
      m = 0;
      arrayOfInt3 = null;
      while (m < n)
      {
        arrayOfInt4 = this.glyphnames;
        i2 = i + 1;
        i3 = i1 + 1;
        arrayOfInt4[i] = i1;
        m += 1;
        i1 = i3;
        i = i2;
      }
    }
  }
  
  private int readInt(int paramInt)
  {
    int i = 0;
    int j = 0;
    for (;;)
    {
      if (i >= paramInt) {
        return j;
      }
      j <<= 8;
      byte[] arrayOfByte = this.data;
      int k = this.pos;
      int m = k + 1;
      this.pos = m;
      int n = arrayOfByte[k] & 0xFF;
      j |= n;
      i += 1;
    }
  }
  
  private void readNames(int paramInt)
  {
    this.pos = paramInt;
    int i = readInt(2);
    String[] arrayOfString1 = new String[i];
    this.names = arrayOfString1;
    int j = 0;
    arrayOfString1 = null;
    for (;;)
    {
      if (j >= i) {
        return;
      }
      Type1CFont.Range localRange = getIndexEntry(paramInt, j);
      String[] arrayOfString2 = this.names;
      String str = new java/lang/String;
      byte[] arrayOfByte = this.data;
      int k = localRange.getStart();
      int m = localRange.getLen();
      str.<init>(arrayOfByte, k, m);
      arrayOfString2[j] = str;
      j += 1;
    }
  }
  
  private int readNext(boolean paramBoolean)
  {
    Object localObject = this.data;
    int i = this.pos;
    int j = i + 1;
    this.pos = j;
    int k = localObject[i] & 0xFF;
    this.num = k;
    k = this.num;
    i = 30;
    float f1 = 4.2E-44F;
    if ((k == i) && (!paramBoolean))
    {
      readFNum();
      k = FLT;
      this.type = k;
    }
    for (;;)
    {
      return k;
      k = this.num;
      i = 28;
      f1 = 3.9E-44F;
      byte[] arrayOfByte;
      if (k == i)
      {
        localObject = this.data;
        i = this.pos;
        k = localObject[i] << 8;
        arrayOfByte = this.data;
        j = this.pos + 1;
        i = arrayOfByte[j] & 0xFF;
        k += i;
        this.num = k;
        k = this.pos + 2;
        this.pos = k;
        k = NUM;
        this.type = k;
      }
      else
      {
        k = this.num;
        i = 29;
        f1 = 4.1E-44F;
        if ((k == i) && (!paramBoolean))
        {
          localObject = this.data;
          i = this.pos;
          k = (localObject[i] & 0xFF) << 24;
          arrayOfByte = this.data;
          j = this.pos + 1;
          i = (arrayOfByte[j] & 0xFF) << 16;
          k |= i;
          arrayOfByte = this.data;
          j = this.pos + 2;
          i = (arrayOfByte[j] & 0xFF) << 8;
          k |= i;
          arrayOfByte = this.data;
          j = this.pos + 3;
          i = arrayOfByte[j] & 0xFF;
          k |= i;
          this.num = k;
          k = this.pos + 4;
          this.pos = k;
          k = NUM;
          this.type = k;
        }
        else
        {
          k = this.num;
          i = 12;
          f1 = 1.7E-44F;
          if (k == i)
          {
            localObject = this.data;
            i = this.pos;
            j = i + 1;
            this.pos = j;
            k = (localObject[i] & 0xFF) + 1000;
            this.num = k;
            k = CMD;
            this.type = k;
          }
          else
          {
            k = this.num;
            i = 32;
            f1 = 4.5E-44F;
            if (k < i)
            {
              k = CMD;
              this.type = k;
            }
            else
            {
              k = this.num;
              i = 247;
              f1 = 3.46E-43F;
              if (k < i)
              {
                k = this.num + 65397;
                this.num = k;
                k = NUM;
                this.type = k;
              }
              else
              {
                k = this.num;
                i = 251;
                f1 = 3.52E-43F;
                int m;
                if (k < i)
                {
                  k = (this.num + 65289) * 256;
                  arrayOfByte = this.data;
                  j = this.pos;
                  m = j + 1;
                  this.pos = m;
                  i = arrayOfByte[j] & 0xFF;
                  k = k + i + 108;
                  this.num = k;
                  k = NUM;
                  this.type = k;
                }
                else
                {
                  k = this.num;
                  i = 255;
                  f1 = 3.57E-43F;
                  if (k < i)
                  {
                    k = -(this.num + 65285) * 256;
                    arrayOfByte = this.data;
                    j = this.pos;
                    m = j + 1;
                    this.pos = m;
                    i = arrayOfByte[j] & 0xFF;
                    k = k - i + -108;
                    this.num = k;
                    k = NUM;
                    this.type = k;
                  }
                  else
                  {
                    if (!paramBoolean)
                    {
                      printData();
                      localObject = new java/lang/RuntimeException;
                      ((RuntimeException)localObject).<init>("Got a 255 code while reading dict");
                      throw ((Throwable)localObject);
                    }
                    localObject = this.data;
                    i = this.pos;
                    k = (localObject[i] & 0xFF) << 24;
                    arrayOfByte = this.data;
                    j = this.pos + 1;
                    i = (arrayOfByte[j] & 0xFF) << 16;
                    k |= i;
                    arrayOfByte = this.data;
                    j = this.pos + 2;
                    i = (arrayOfByte[j] & 0xFF) << 8;
                    k |= i;
                    arrayOfByte = this.data;
                    j = this.pos + 3;
                    i = arrayOfByte[j] & 0xFF;
                    float f2 = k | i;
                    i = 1199570944;
                    f1 = 65536.0F;
                    f2 /= f1;
                    this.fnum = f2;
                    k = this.pos + 4;
                    this.pos = k;
                    k = FLT;
                    this.type = k;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private String safe(String paramString)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    int i = 0;
    int j = paramString.length();
    if (i >= j) {
      return localStringBuffer.toString();
    }
    j = paramString.charAt(i);
    int k = 32;
    if (j >= k)
    {
      int m = 128;
      if (j < m) {
        localStringBuffer.append(j);
      }
    }
    for (;;)
    {
      i += 1;
      break;
      Object localObject1 = new java/lang/StringBuilder;
      String str = "<";
      ((StringBuilder)localObject1).<init>(str);
      Object localObject2 = ((StringBuilder)localObject1).append(j);
      localObject1 = ">";
      localObject2 = (String)localObject1;
      localStringBuffer.append((String)localObject2);
    }
  }
  
  public int calcoffset(int paramInt)
  {
    int i = getTableLength(paramInt);
    int j = 1240;
    if (i < j) {
      i = 107;
    }
    for (;;)
    {
      return i;
      j = 33900;
      if (i < j) {
        i = 1131;
      } else {
        i = 32768;
      }
    }
  }
  
  Type1CFont.Range getIndexEntry(int paramInt1, int paramInt2)
  {
    int i = this.pos;
    this.pos = paramInt1;
    int j = readInt(2);
    int k = readByte();
    int m = 1;
    if (k >= m)
    {
      m = 4;
      if (k <= m) {}
    }
    else
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("Offsize: ");
      localObject = k + ", must be in range 1-4.";
      localRuntimeException.<init>((String)localObject);
      throw localRuntimeException;
    }
    m = this.pos;
    int n = k * paramInt2;
    m += n;
    this.pos = m;
    m = readInt(k);
    Type1CFont.Range localRange = new com/sun/pdfview/font/Type1CFont$Range;
    int i1 = m + 2 + paramInt1;
    j = (j + 1) * k + i1;
    k = readInt(k) - m;
    localRange.<init>(this, j, k);
    this.pos = i;
    return localRange;
  }
  
  public int getIndexSize(int paramInt)
  {
    int i = 2;
    int j = this.pos;
    this.pos = paramInt;
    int k = readInt(i);
    if (k <= 0) {}
    for (;;)
    {
      return i;
      i = readByte();
      int m = 1;
      if (i >= m)
      {
        m = 4;
        if (i <= m) {}
      }
      else
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Offsize: ");
        String str = i + ", must be in range 1-4.";
        localRuntimeException.<init>(str);
        throw localRuntimeException;
      }
      m = this.pos;
      int n = k * i;
      m += n;
      this.pos = m;
      m = readInt(i);
      this.pos = j;
      j = k + 1;
      i = i * j + 2 + m;
    }
  }
  
  protected Path getOutline(char paramChar, float paramFloat)
  {
    int i = 0;
    int[] arrayOfInt1 = null;
    int j = paramChar & 0xFF;
    int k = this.encodingbase;
    int m;
    Object localObject;
    int[] arrayOfInt2;
    if (k != 0)
    {
      k = this.encodingbase;
      m = 1;
      if (k != m) {}
    }
    else
    {
      k = 0;
      localObject = null;
      arrayOfInt2 = this.glyphnames;
      m = arrayOfInt2.length;
      if (k >= m)
      {
        label63:
        k = this.charstringbase;
        localObject = readGlyph(k, 0);
      }
    }
    for (;;)
    {
      return (Path)localObject;
      arrayOfInt2 = this.glyphnames;
      m = arrayOfInt2[k];
      int[] arrayOfInt3 = this.encoding;
      int n = arrayOfInt3[j];
      if (m == n)
      {
        i = this.charstringbase;
        localObject = readGlyph(i, k);
      }
      else
      {
        k += 1;
        break;
        if (j <= 0) {
          break label63;
        }
        localObject = this.encoding;
        k = localObject.length;
        if (j >= k) {
          break label63;
        }
        k = this.charstringbase;
        arrayOfInt1 = this.encoding;
        i = arrayOfInt1[j];
        localObject = readGlyph(k, i);
      }
    }
  }
  
  protected Path getOutline(String paramString, float paramFloat)
  {
    int i = 0;
    int j = getNameIndex(paramString);
    int k = 0;
    Path localPath = null;
    for (;;)
    {
      int[] arrayOfInt = this.glyphnames;
      int m = arrayOfInt.length;
      if (k >= m) {
        k = this.charstringbase;
      }
      for (localPath = readGlyph(k, 0);; localPath = readGlyph(i, k))
      {
        return localPath;
        arrayOfInt = this.glyphnames;
        m = arrayOfInt[k];
        if (m != j) {
          break;
        }
        i = this.charstringbase;
      }
      k += 1;
    }
  }
  
  public String getSID(int paramInt)
  {
    Object localObject = FontSupport.stdNames;
    int i = localObject.length;
    if (paramInt < i) {}
    String[] arrayOfString;
    for (localObject = FontSupport.stdNames[paramInt];; localObject = arrayOfString[i])
    {
      return (String)localObject;
      i = FontSupport.stdNames.length;
      i = paramInt - i;
      arrayOfString = this.names;
    }
  }
  
  public int getTableLength(int paramInt)
  {
    int i = 2;
    int j = this.pos;
    this.pos = paramInt;
    int k = readInt(i);
    if (k <= 0) {}
    for (;;)
    {
      return i;
      this.pos = j;
      i = k;
    }
  }
  
  void parseGlyph(Type1CFont.Range paramRange, Path paramPath, FlPoint paramFlPoint)
  {
    int i = paramRange.getStart();
    this.pos = i;
    i = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int i4 = 0;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    float f2;
    float f3;
    float f4;
    int i9;
    int i6;
    int i12;
    int i13;
    float f5;
    float f6;
    float f7;
    Object localObject5;
    int i8;
    int i11;
    for (;;)
    {
      i = this.pos;
      int i5 = paramRange.getEnd();
      if (i >= i5) {
        return;
      }
      i5 = readCommand(true);
      i = 0;
      f1 = 0.0F;
      localObject1 = null;
      int i7;
      int j;
      int k;
      int i10;
      int m;
      switch (i5)
      {
      case 11: 
      default: 
        localObject1 = System.out;
        localObject2 = new java/lang/StringBuilder;
        localObject3 = "ERROR! TYPE1C CHARSTRING CMD IS ";
        ((StringBuilder)localObject2).<init>((String)localObject3);
        localObject4 = i5;
        ((PrintStream)localObject1).println((String)localObject4);
        break;
      case 1: 
      case 3: 
        i = 0;
        f1 = 0.0F;
        localObject1 = null;
        this.stackptr = 0;
        break;
      case 4: 
        i = this.stackptr;
        i5 = 1;
        f2 = Float.MIN_VALUE;
        if (i > i5)
        {
          localObject1 = this.stack;
          i5 = 0;
          f2 = 0.0F;
          localObject4 = null;
          localObject2 = this.stack;
          i7 = 1;
          f3 = Float.MIN_VALUE;
          f4 = localObject2[i7];
          localObject1[0] = f4;
        }
        f1 = paramFlPoint.y;
        localObject4 = this.stack;
        i9 = 0;
        f4 = 0.0F;
        localObject2 = null;
        f2 = localObject4[0];
        f1 += f2;
        paramFlPoint.y = f1;
        j = paramFlPoint.open;
        if (j != 0) {
          paramPath.close();
        }
        paramFlPoint.open = false;
        f1 = paramFlPoint.x;
        f2 = paramFlPoint.y;
        paramPath.moveTo(f1, f2);
        j = 0;
        f1 = 0.0F;
        localObject1 = null;
        this.stackptr = 0;
        break;
      case 5: 
        j = 0;
        f1 = 0.0F;
        localObject1 = null;
        for (;;)
        {
          i5 = this.stackptr;
          if (j >= i5)
          {
            paramFlPoint.open = true;
            j = 0;
            f1 = 0.0F;
            localObject1 = null;
            this.stackptr = 0;
            break;
          }
          f2 = paramFlPoint.x;
          localObject2 = this.stack;
          i7 = j + 1;
          f1 = localObject2[j] + f2;
          paramFlPoint.x = f1;
          f2 = paramFlPoint.y;
          localObject2 = this.stack;
          k = i7 + 1;
          f4 = localObject2[i7];
          f2 += f4;
          paramFlPoint.y = f2;
          f2 = paramFlPoint.x;
          f4 = paramFlPoint.y;
          paramPath.lineTo(f2, f4);
        }
      case 6: 
        k = 0;
        f1 = 0.0F;
        localObject1 = null;
        i6 = this.stackptr;
        if (k >= i6)
        {
          paramFlPoint.open = true;
          k = 0;
          f1 = 0.0F;
          localObject1 = null;
          this.stackptr = 0;
        }
        else
        {
          i6 = k & 0x1;
          if (i6 == 0)
          {
            f4 = paramFlPoint.x;
            localObject3 = this.stack;
            i6 = k + 1;
            f1 = localObject3[k] + f4;
            paramFlPoint.x = f1;
          }
          for (k = i6;; k = i6)
          {
            f2 = paramFlPoint.x;
            f4 = paramFlPoint.y;
            paramPath.lineTo(f2, f4);
            break;
            f4 = paramFlPoint.y;
            localObject3 = this.stack;
            i6 = k + 1;
            f1 = localObject3[k] + f4;
            paramFlPoint.y = f1;
          }
        }
        break;
      case 7: 
        k = 0;
        f1 = 0.0F;
        localObject1 = null;
        i6 = this.stackptr;
        if (k >= i6)
        {
          paramFlPoint.open = true;
          k = 0;
          f1 = 0.0F;
          localObject1 = null;
          this.stackptr = 0;
        }
        else
        {
          i6 = k & 0x1;
          if (i6 == 0)
          {
            f4 = paramFlPoint.y;
            localObject3 = this.stack;
            i6 = k + 1;
            f1 = localObject3[k] + f4;
            paramFlPoint.y = f1;
          }
          for (k = i6;; k = i6)
          {
            f2 = paramFlPoint.x;
            f4 = paramFlPoint.y;
            paramPath.lineTo(f2, f4);
            break;
            f4 = paramFlPoint.x;
            localObject3 = this.stack;
            i6 = k + 1;
            f1 = localObject3[k] + f4;
            paramFlPoint.x = f1;
          }
        }
        break;
      case 8: 
        k = 0;
        f1 = 0.0F;
        localObject1 = null;
        for (;;)
        {
          i6 = this.stackptr;
          if (k >= i6)
          {
            paramFlPoint.open = true;
            k = 0;
            f1 = 0.0F;
            localObject1 = null;
            this.stackptr = 0;
            break;
          }
          f2 = paramFlPoint.x;
          localObject2 = this.stack;
          i7 = k + 1;
          f1 = localObject2[k];
          f2 += f1;
          f1 = paramFlPoint.y;
          localObject2 = this.stack;
          i10 = i7 + 1;
          f4 = localObject2[i7] + f1;
          localObject1 = this.stack;
          i12 = i10 + 1;
          f1 = localObject1[i10];
          f3 = f2 + f1;
          localObject1 = this.stack;
          i13 = i12 + 1;
          f1 = localObject1[i12];
          f5 = f4 + f1;
          localObject1 = this.stack;
          i12 = i13 + 1;
          f1 = localObject1[i13] + f3;
          paramFlPoint.x = f1;
          localObject1 = this.stack;
          i14 = i12 + 1;
          f1 = localObject1[i12] + f5;
          paramFlPoint.y = f1;
          f6 = paramFlPoint.x;
          f7 = paramFlPoint.y;
          localObject1 = paramPath;
          paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
          k = i14;
        }
      case 10: 
        k = this.pos;
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        this.stackptr = i9;
        f2 = localObject4[i9];
        i6 = (int)f2;
        i9 = this.lsubrsoffset;
        i6 += i9;
        i9 = this.lsubrbase;
        localObject4 = getIndexEntry(i9, i6);
        parseGlyph((Type1CFont.Range)localObject4, paramPath, paramFlPoint);
        this.pos = k;
        break;
      case 14: 
        k = this.stackptr;
        i6 = 5;
        f2 = 7.0E-45F;
        if (k == i6)
        {
          localObject1 = this.stack;
          i6 = 1;
          f2 = localObject1[i6];
          localObject1 = this.stack;
          i9 = 2;
          f4 = localObject1[i9];
          localObject1 = this.stack;
          f3 = 4.2E-45F;
          i7 = (char)(int)localObject1[3];
          localObject1 = this.stack;
          f5 = 5.6E-45F;
          f1 = localObject1[4];
          k = (int)f1;
          i10 = (char)k;
          localObject1 = this;
          localObject5 = paramPath;
          buildAccentChar(f2, f4, i7, i10, paramPath);
        }
        boolean bool1 = paramFlPoint.open;
        if (bool1) {
          paramPath.close();
        }
        paramFlPoint.open = false;
        bool1 = false;
        f1 = 0.0F;
        localObject1 = null;
        this.stackptr = 0;
        break;
      case 18: 
        m = this.stackptr / 2 + i4;
        i6 = 0;
        f2 = 0.0F;
        localObject4 = null;
        this.stackptr = 0;
        i4 = m;
        break;
      case 19: 
      case 20: 
        m = this.stackptr / 2 + i4;
        i6 = this.pos;
        i9 = (m + -1) / 8 + 1;
        i6 += i9;
        this.pos = i6;
        i6 = 0;
        f2 = 0.0F;
        localObject4 = null;
        this.stackptr = 0;
        i4 = m;
        break;
      case 21: 
        m = this.stackptr;
        i6 = 2;
        f2 = 2.8E-45F;
        if (m > i6)
        {
          localObject1 = this.stack;
          localObject4 = null;
          f4 = this.stack[1];
          localObject1[0] = f4;
          localObject1 = this.stack;
          i6 = 1;
          f2 = Float.MIN_VALUE;
          localObject2 = this.stack;
          i8 = 2;
          f3 = 2.8E-45F;
          f4 = localObject2[i8];
          localObject1[i6] = f4;
        }
        f1 = paramFlPoint.x;
        localObject4 = this.stack;
        localObject2 = null;
        f2 = localObject4[0];
        f1 += f2;
        paramFlPoint.x = f1;
        f1 = paramFlPoint.y;
        localObject4 = this.stack;
        i9 = 1;
        f4 = Float.MIN_VALUE;
        f2 = localObject4[i9];
        f1 += f2;
        paramFlPoint.y = f1;
        boolean bool2 = paramFlPoint.open;
        if (bool2) {
          paramPath.close();
        }
        f1 = paramFlPoint.x;
        f2 = paramFlPoint.y;
        paramPath.moveTo(f1, f2);
        paramFlPoint.open = false;
        bool2 = false;
        f1 = 0.0F;
        localObject1 = null;
        this.stackptr = 0;
        break;
      case 22: 
        int n = this.stackptr;
        i6 = 1;
        f2 = Float.MIN_VALUE;
        if (n > i6)
        {
          localObject1 = this.stack;
          i6 = 0;
          f2 = 0.0F;
          localObject4 = null;
          localObject2 = this.stack;
          i8 = 1;
          f3 = Float.MIN_VALUE;
          f4 = localObject2[i8];
          localObject1[0] = f4;
        }
        f1 = paramFlPoint.x;
        localObject4 = this.stack;
        i9 = 0;
        f4 = 0.0F;
        localObject2 = null;
        f2 = localObject4[0];
        f1 += f2;
        paramFlPoint.x = f1;
        boolean bool3 = paramFlPoint.open;
        if (bool3) {
          paramPath.close();
        }
        f1 = paramFlPoint.x;
        f2 = paramFlPoint.y;
        paramPath.moveTo(f1, f2);
        paramFlPoint.open = false;
        bool3 = false;
        f1 = 0.0F;
        localObject1 = null;
        this.stackptr = 0;
        break;
      case 23: 
        i1 = this.stackptr / 2 + i4;
        i6 = 0;
        f2 = 0.0F;
        localObject4 = null;
        this.stackptr = 0;
        i4 = i1;
        break;
      case 24: 
        i1 = 0;
        f1 = 0.0F;
        localObject1 = null;
        for (;;)
        {
          i6 = this.stackptr + -2;
          if (i1 >= i6)
          {
            f2 = paramFlPoint.x;
            localObject2 = this.stack;
            i8 = i1 + 1;
            f1 = localObject2[i1] + f2;
            paramFlPoint.x = f1;
            f1 = paramFlPoint.y;
            localObject4 = this.stack;
            i9 = i8 + 1;
            f2 = localObject4[i8];
            f1 += f2;
            paramFlPoint.y = f1;
            f1 = paramFlPoint.x;
            f2 = paramFlPoint.y;
            paramPath.lineTo(f1, f2);
            paramFlPoint.open = true;
            i1 = 0;
            f1 = 0.0F;
            localObject1 = null;
            this.stackptr = 0;
            break;
          }
          f2 = paramFlPoint.x;
          localObject2 = this.stack;
          i8 = i1 + 1;
          f1 = localObject2[i1];
          f2 += f1;
          f1 = paramFlPoint.y;
          localObject2 = this.stack;
          i11 = i8 + 1;
          f4 = localObject2[i8] + f1;
          localObject1 = this.stack;
          i12 = i11 + 1;
          f1 = localObject1[i11];
          f3 = f2 + f1;
          localObject1 = this.stack;
          i13 = i12 + 1;
          f1 = localObject1[i12];
          f5 = f4 + f1;
          localObject1 = this.stack;
          i12 = i13 + 1;
          f1 = localObject1[i13] + f3;
          paramFlPoint.x = f1;
          localObject1 = this.stack;
          i14 = i12 + 1;
          f1 = localObject1[i12] + f5;
          paramFlPoint.y = f1;
          f6 = paramFlPoint.x;
          f7 = paramFlPoint.y;
          localObject1 = paramPath;
          paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
          i1 = i14;
        }
      case 25: 
        i1 = 0;
        f1 = 0.0F;
        localObject1 = null;
        for (;;)
        {
          i6 = this.stackptr + -6;
          if (i1 >= i6)
          {
            f2 = paramFlPoint.x;
            localObject2 = this.stack;
            i8 = i1 + 1;
            f1 = localObject2[i1];
            f2 += f1;
            f1 = paramFlPoint.y;
            localObject2 = this.stack;
            i11 = i8 + 1;
            f4 = localObject2[i8] + f1;
            localObject1 = this.stack;
            i12 = i11 + 1;
            f1 = localObject1[i11];
            f3 = f2 + f1;
            localObject1 = this.stack;
            i13 = i12 + 1;
            f1 = localObject1[i12];
            f5 = f4 + f1;
            localObject1 = this.stack;
            i12 = i13 + 1;
            f1 = localObject1[i13] + f3;
            paramFlPoint.x = f1;
            localObject1 = this.stack;
            i13 = i12 + 1;
            f1 = localObject1[i12] + f5;
            paramFlPoint.y = f1;
            f6 = paramFlPoint.x;
            f7 = paramFlPoint.y;
            localObject1 = paramPath;
            paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
            paramFlPoint.open = true;
            i1 = 0;
            f1 = 0.0F;
            localObject1 = null;
            this.stackptr = 0;
            break;
          }
          f2 = paramFlPoint.x;
          localObject2 = this.stack;
          i8 = i1 + 1;
          f1 = localObject2[i1] + f2;
          paramFlPoint.x = f1;
          f2 = paramFlPoint.y;
          localObject2 = this.stack;
          i1 = i8 + 1;
          f4 = localObject2[i8];
          f2 += f4;
          paramFlPoint.y = f2;
          f2 = paramFlPoint.x;
          f4 = paramFlPoint.y;
          paramPath.lineTo(f2, f4);
        }
      case 26: 
        i6 = 0;
        f2 = 0.0F;
        localObject4 = null;
        i1 = this.stackptr & 0x1;
        i9 = 1;
        f4 = Float.MIN_VALUE;
        if (i1 != i9) {
          break label7103;
        }
        f4 = paramFlPoint.x;
        localObject3 = this.stack;
        i1 = 1;
        f1 = Float.MIN_VALUE;
        f2 = localObject3[0] + f4;
        paramFlPoint.x = f2;
        for (;;)
        {
          i6 = this.stackptr;
          if (i1 >= i6)
          {
            paramFlPoint.open = true;
            i1 = 0;
            f1 = 0.0F;
            localObject1 = null;
            this.stackptr = 0;
            break;
          }
          f2 = paramFlPoint.x;
          f4 = paramFlPoint.y;
          localObject3 = this.stack;
          i11 = i1 + 1;
          f1 = localObject3[i1];
          f4 += f1;
          localObject1 = this.stack;
          i12 = i11 + 1;
          f1 = localObject1[i11];
          f3 = f2 + f1;
          localObject1 = this.stack;
          i13 = i12 + 1;
          f1 = localObject1[i12];
          f5 = f4 + f1;
          paramFlPoint.x = f3;
          localObject1 = this.stack;
          i14 = i13 + 1;
          f1 = localObject1[i13] + f5;
          paramFlPoint.y = f1;
          f6 = paramFlPoint.x;
          f7 = paramFlPoint.y;
          localObject1 = paramPath;
          paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
          i1 = i14;
        }
      case 27: 
        i6 = 0;
        f2 = 0.0F;
        localObject4 = null;
        i1 = this.stackptr & 0x1;
        i9 = 1;
        f4 = Float.MIN_VALUE;
        if (i1 != i9) {
          break label7091;
        }
        f4 = paramFlPoint.y;
        localObject3 = this.stack;
        i1 = 1;
        f1 = Float.MIN_VALUE;
        f2 = localObject3[0] + f4;
        paramFlPoint.y = f2;
        for (;;)
        {
          i6 = this.stackptr;
          if (i1 >= i6)
          {
            paramFlPoint.open = true;
            i1 = 0;
            f1 = 0.0F;
            localObject1 = null;
            this.stackptr = 0;
            break;
          }
          f2 = paramFlPoint.x;
          localObject2 = this.stack;
          i8 = i1 + 1;
          f1 = localObject2[i1];
          f2 += f1;
          f4 = paramFlPoint.y;
          localObject1 = this.stack;
          i11 = i8 + 1;
          f1 = localObject1[i8];
          f3 = f2 + f1;
          localObject1 = this.stack;
          i12 = i11 + 1;
          f1 = localObject1[i11];
          f5 = f4 + f1;
          localObject1 = this.stack;
          i14 = i12 + 1;
          f1 = localObject1[i12] + f3;
          paramFlPoint.x = f1;
          paramFlPoint.y = f5;
          f6 = paramFlPoint.x;
          f7 = paramFlPoint.y;
          localObject1 = paramPath;
          paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
          i1 = i14;
        }
      case 29: 
        label2865:
        label3127:
        i1 = this.pos;
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        this.stackptr = i9;
        f2 = localObject4[i9];
        i6 = (int)f2;
        i9 = this.gsubrsoffset;
        i6 += i9;
        i9 = this.gsubrbase;
        localObject4 = getIndexEntry(i9, i6);
        parseGlyph((Type1CFont.Range)localObject4, paramPath, paramFlPoint);
        this.pos = i1;
      }
    }
    int i1 = 4;
    f1 = 5.6E-45F;
    int i14 = i1;
    for (float f8 = f1;; f8 = 0.0F)
    {
      i1 = 0;
      f1 = 0.0F;
      localObject1 = null;
      label3433:
      i6 = this.stackptr;
      if (i1 >= i6)
      {
        paramFlPoint.open = true;
        i1 = 0;
        f1 = 0.0F;
        localObject1 = null;
        this.stackptr = 0;
        break;
      }
      i6 = i1 + i14 & 0x4;
      label3497:
      label3531:
      label3562:
      label3635:
      int i15;
      if (i6 == 0)
      {
        i6 = 1;
        f2 = Float.MIN_VALUE;
        i12 = i6;
        f6 = f2;
        f3 = paramFlPoint.x;
        if (i12 == 0) {
          break label3806;
        }
        localObject2 = this.stack;
        i6 = i1 + 1;
        f1 = localObject2[i1];
        i9 = i6;
        f2 = f3 + f1;
        f5 = paramFlPoint.y;
        if (i12 == 0) {
          break label3831;
        }
        i1 = 0;
        f1 = 0.0F;
        localObject1 = null;
        i8 = i9;
        f4 = f5 + f1;
        localObject1 = this.stack;
        i11 = i8 + 1;
        f1 = localObject1[i8];
        f3 = f2 + f1;
        localObject1 = this.stack;
        i13 = i11 + 1;
        f1 = localObject1[i11];
        f5 = f4 + f1;
        if (i12 == 0) {
          break label3853;
        }
        i1 = 0;
        f1 = 0.0F;
        localObject1 = null;
        f1 += f3;
        paramFlPoint.x = f1;
        if (i12 == 0) {
          break label3879;
        }
        localObject1 = this.stack;
        i15 = i13 + 1;
        f1 = localObject1[i13];
        i13 = i15;
        label3676:
        f1 += f5;
        paramFlPoint.y = f1;
        i1 = this.stackptr + -1;
        if (i13 != i1) {
          break label7084;
        }
        if (i12 == 0) {
          break label3891;
        }
        f1 = paramFlPoint.x;
        localObject5 = this.stack;
        i15 = i13 + 1;
        f6 = localObject5[i13];
        f1 += f6;
        paramFlPoint.x = f1;
      }
      for (;;)
      {
        f6 = paramFlPoint.x;
        f7 = paramFlPoint.y;
        localObject1 = paramPath;
        paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
        i1 = i15;
        break label3433;
        i6 = 0;
        f2 = 0.0F;
        localObject4 = null;
        i12 = 0;
        localObject5 = null;
        f6 = 0.0F;
        break label3497;
        label3806:
        i6 = 0;
        f2 = 0.0F;
        localObject4 = null;
        i9 = i1;
        i1 = 0;
        localObject1 = null;
        f1 = 0.0F;
        break label3531;
        label3831:
        localObject1 = this.stack;
        i8 = i9 + 1;
        f1 = localObject1[i9];
        break label3562;
        label3853:
        localObject1 = this.stack;
        i15 = i13 + 1;
        f1 = localObject1[i13];
        i13 = i15;
        break label3635;
        label3879:
        i1 = 0;
        f1 = 0.0F;
        localObject1 = null;
        break label3676;
        label3891:
        f1 = paramFlPoint.y;
        localObject5 = this.stack;
        i15 = i13 + 1;
        f6 = localObject5[i13];
        f1 += f6;
        paramFlPoint.y = f1;
        continue;
        i1 = 0;
        f1 = 0.0F;
        localObject1 = null;
        this.stackptr = 0;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        this.stackptr = i6;
        f1 = localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        this.stackptr = i9;
        f2 = localObject4[i9];
        localObject2 = this.stack;
        i8 = this.stackptr;
        i11 = i8 + 1;
        this.stackptr = i11;
        i11 = 0;
        f5 = 0.0F;
        boolean bool4 = f1 < 0.0F;
        if (bool4)
        {
          f1 = 0.0F;
          localObject1 = null;
          bool4 = f2 < 0.0F;
          if (bool4)
          {
            bool4 = true;
            f1 = Float.MIN_VALUE;
          }
        }
        for (;;)
        {
          f1 = bool4;
          localObject2[i8] = f1;
          break;
          bool4 = false;
          f1 = 0.0F;
          localObject1 = null;
        }
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        this.stackptr = i6;
        f1 = localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        this.stackptr = i9;
        f2 = localObject4[i9];
        localObject2 = this.stack;
        i8 = this.stackptr;
        i11 = i8 + 1;
        this.stackptr = i11;
        i11 = 0;
        f5 = 0.0F;
        bool4 = f1 < 0.0F;
        if (!bool4)
        {
          f1 = 0.0F;
          localObject1 = null;
          bool4 = f2 < 0.0F;
          if (!bool4) {}
        }
        else
        {
          bool4 = true;
          f1 = Float.MIN_VALUE;
        }
        for (;;)
        {
          f1 = bool4;
          localObject2[i8] = f1;
          break;
          bool4 = false;
          f1 = 0.0F;
          localObject1 = null;
        }
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        this.stackptr = i6;
        f1 = localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr;
        i8 = i9 + 1;
        this.stackptr = i8;
        i8 = 0;
        f3 = 0.0F;
        localObject3 = null;
        bool4 = f1 < 0.0F;
        if (!bool4)
        {
          bool4 = true;
          f1 = Float.MIN_VALUE;
        }
        for (;;)
        {
          f1 = bool4;
          localObject4[i9] = f1;
          break;
          bool4 = false;
          f1 = 0.0F;
          localObject1 = null;
        }
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        localObject2 = this.stack;
        i8 = this.stackptr + -1;
        f4 = Math.abs(localObject2[i8]);
        localObject1[i6] = f4;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        this.stackptr = i6;
        f1 = localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        this.stackptr = i9;
        f2 = localObject4[i9];
        localObject2 = this.stack;
        i8 = this.stackptr;
        i11 = i8 + 1;
        this.stackptr = i11;
        f1 += f2;
        localObject2[i8] = f1;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        this.stackptr = i6;
        f1 = localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        this.stackptr = i9;
        f2 = localObject4[i9];
        localObject2 = this.stack;
        i8 = this.stackptr;
        i11 = i8 + 1;
        this.stackptr = i11;
        f1 = f2 - f1;
        localObject2[i8] = f1;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        this.stackptr = i6;
        f1 = localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        this.stackptr = i9;
        f2 = localObject4[i9];
        localObject2 = this.stack;
        i8 = this.stackptr;
        i11 = i8 + 1;
        this.stackptr = i11;
        f1 = f2 / f1;
        localObject2[i8] = f1;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        localObject2 = this.stack;
        i8 = this.stackptr + -1;
        f4 = -localObject2[i8];
        localObject1[i6] = f4;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        this.stackptr = i6;
        f1 = localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        this.stackptr = i9;
        f2 = localObject4[i9];
        localObject2 = this.stack;
        i8 = this.stackptr;
        i11 = i8 + 1;
        this.stackptr = i11;
        bool4 = f1 < f2;
        if (!bool4)
        {
          bool4 = true;
          f1 = Float.MIN_VALUE;
        }
        for (;;)
        {
          f1 = bool4;
          localObject2[i8] = f1;
          break;
          bool4 = false;
          f1 = 0.0F;
          localObject1 = null;
        }
        int i2 = this.stackptr + -1;
        this.stackptr = i2;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        this.stackptr = i6;
        f1 = localObject1[i6];
        i2 = (int)f1;
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        this.stackptr = i9;
        f2 = localObject4[i9];
        localObject2 = this.temps;
        localObject2[i2] = f2;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        this.stackptr = i6;
        i2 = (int)localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr;
        i8 = i9 + 1;
        this.stackptr = i8;
        localObject3 = this.temps;
        f1 = localObject3[i2];
        localObject4[i9] = f1;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -2;
        f1 = localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        f2 = localObject4[i9];
        boolean bool5 = f1 < f2;
        if (bool5)
        {
          localObject1 = this.stack;
          i6 = this.stackptr + -4;
          localObject2 = this.stack;
          i8 = this.stackptr + -3;
          f4 = localObject2[i8];
          localObject1[i6] = f4;
        }
        int i3 = this.stackptr + -3;
        this.stackptr = i3;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr;
        i9 = i6 + 1;
        this.stackptr = i9;
        double d = Math.random();
        f4 = (float)d;
        localObject1[i6] = f4;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        this.stackptr = i6;
        f1 = localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        this.stackptr = i9;
        f2 = localObject4[i9];
        localObject2 = this.stack;
        i8 = this.stackptr;
        i11 = i8 + 1;
        this.stackptr = i11;
        f1 *= f2;
        localObject2[i8] = f1;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        localObject2 = this.stack;
        i8 = this.stackptr + -1;
        d = Math.sqrt(localObject2[i8]);
        f4 = (float)d;
        localObject1[i6] = f4;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        f1 = localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr;
        i8 = i9 + 1;
        this.stackptr = i8;
        localObject4[i9] = f1;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        f1 = localObject1[i6];
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        localObject3 = this.stack;
        i11 = this.stackptr + -2;
        f3 = localObject3[i11];
        localObject4[i9] = f3;
        localObject4 = this.stack;
        i9 = this.stackptr + -2;
        localObject4[i9] = f1;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        f1 = localObject1[i6];
        i3 = (int)f1;
        if (i3 < 0)
        {
          i3 = 0;
          f1 = 0.0F;
          localObject1 = null;
        }
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        localObject3 = this.stack;
        i11 = this.stackptr + -2;
        i3 = i11 - i3;
        f1 = localObject3[i3];
        localObject4[i9] = f1;
        break;
        localObject1 = this.stack;
        i6 = this.stackptr + -1;
        this.stackptr = i6;
        f1 = localObject1[i6];
        i3 = (int)f1;
        localObject4 = this.stack;
        i9 = this.stackptr + -1;
        this.stackptr = i9;
        f2 = localObject4[i9];
        i6 = (int)f2;
        if (i3 > 0) {
          i3 %= i6;
        }
        while (i3 > 0)
        {
          localObject2 = new float[i6];
          localObject3 = this.stack;
          i11 = this.stackptr + -1 - i3;
          f6 = 0.0F;
          localObject5 = null;
          System.arraycopy(localObject3, i11, localObject2, 0, i3);
          localObject3 = this.stack;
          i11 = this.stackptr + -1 - i6;
          i12 = i6 - i3;
          System.arraycopy(localObject3, i11, localObject2, i3, i12);
          i3 = 0;
          f1 = 0.0F;
          localObject1 = null;
          localObject3 = this.stack;
          i11 = this.stackptr + -1 - i6;
          System.arraycopy(localObject2, 0, localObject3, i11, i6);
          break;
          i3 = -i3 % i6;
          i3 = i6 - i3;
        }
        f1 = paramFlPoint.x;
        localObject4 = this.stack;
        i9 = 0;
        localObject2 = null;
        f2 = localObject4[0] + f1;
        f4 = paramFlPoint.y;
        f1 = this.stack[1];
        f3 = f2 + f1;
        localObject1 = this.stack;
        i11 = 2;
        f1 = localObject1[i11];
        f5 = f4 + f1;
        localObject1 = this.stack;
        i12 = 3;
        f1 = localObject1[i12] + f3;
        paramFlPoint.x = f1;
        paramFlPoint.y = f5;
        f6 = paramFlPoint.x;
        f7 = paramFlPoint.y;
        localObject1 = paramPath;
        paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
        f1 = paramFlPoint.x;
        localObject4 = this.stack;
        i8 = 4;
        f3 = 5.6E-45F;
        f2 = localObject4[i8];
        f5 = f1 + f2;
        f6 = paramFlPoint.y;
        f1 = this.stack[5];
        f7 = f5 + f1;
        localObject1 = this.stack;
        i6 = 6;
        f2 = 8.4E-45F;
        f1 = localObject1[i6] + f7;
        paramFlPoint.x = f1;
        paramFlPoint.y = f4;
        float f9 = paramFlPoint.x;
        float f10 = paramFlPoint.y;
        localObject3 = paramPath;
        f8 = f4;
        paramPath.cubicTo(f5, f6, f7, f4, f9, f10);
        paramFlPoint.open = true;
        i3 = 0;
        f1 = 0.0F;
        localObject1 = null;
        this.stackptr = 0;
        break;
        f1 = paramFlPoint.x;
        f2 = this.stack[0] + f1;
        f1 = paramFlPoint.y;
        f4 = this.stack[1] + f1;
        f1 = this.stack[2];
        f3 = f2 + f1;
        f1 = this.stack[3];
        f5 = f4 + f1;
        f1 = this.stack[4] + f3;
        paramFlPoint.x = f1;
        f1 = this.stack[5] + f5;
        paramFlPoint.y = f1;
        f6 = paramFlPoint.x;
        f7 = paramFlPoint.y;
        localObject1 = paramPath;
        paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
        f1 = paramFlPoint.x;
        localObject4 = this.stack;
        i9 = 6;
        f2 = localObject4[i9] + f1;
        f1 = paramFlPoint.y;
        localObject2 = this.stack;
        f4 = localObject2[7] + f1;
        localObject1 = this.stack;
        i8 = 8;
        f1 = localObject1[i8];
        f3 = f2 + f1;
        localObject1 = this.stack;
        i11 = 9;
        f1 = localObject1[i11];
        f5 = f4 + f1;
        f1 = this.stack[10] + f3;
        paramFlPoint.x = f1;
        localObject1 = this.stack;
        i12 = 11;
        f1 = localObject1[i12] + f5;
        paramFlPoint.y = f1;
        f6 = paramFlPoint.x;
        f7 = paramFlPoint.y;
        localObject1 = paramPath;
        paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
        paramFlPoint.open = true;
        i3 = 0;
        f1 = 0.0F;
        localObject1 = null;
        this.stackptr = 0;
        break;
        f8 = paramFlPoint.y;
        f1 = paramFlPoint.x;
        f2 = this.stack[0] + f1;
        f1 = paramFlPoint.y;
        localObject2 = this.stack;
        f4 = localObject2[1] + f1;
        f1 = this.stack[2];
        f3 = f2 + f1;
        f1 = this.stack[3];
        f5 = f4 + f1;
        f1 = this.stack[4] + f3;
        paramFlPoint.x = f1;
        paramFlPoint.y = f5;
        f6 = paramFlPoint.x;
        f7 = paramFlPoint.y;
        localObject1 = paramPath;
        paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
        f1 = paramFlPoint.x;
        localObject4 = this.stack;
        i9 = 5;
        f2 = localObject4[i9] + f1;
        f4 = paramFlPoint.y;
        localObject1 = this.stack;
        i8 = 6;
        f1 = localObject1[i8];
        f3 = f2 + f1;
        localObject1 = this.stack;
        i11 = 7;
        f1 = localObject1[i11];
        f5 = f4 + f1;
        localObject1 = this.stack;
        i12 = 8;
        f1 = localObject1[i12] + f3;
        paramFlPoint.x = f1;
        paramFlPoint.y = f8;
        f6 = paramFlPoint.x;
        f7 = paramFlPoint.y;
        localObject1 = paramPath;
        paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
        paramFlPoint.open = true;
        i3 = 0;
        f1 = 0.0F;
        localObject1 = null;
        this.stackptr = 0;
        break;
        f8 = paramFlPoint.y;
        f9 = paramFlPoint.x;
        f1 = paramFlPoint.x;
        f2 = this.stack[0] + f1;
        f1 = paramFlPoint.y;
        f4 = this.stack[1] + f1;
        f1 = this.stack[2];
        f3 = f2 + f1;
        f1 = this.stack[3];
        f5 = f4 + f1;
        f1 = this.stack[4] + f3;
        paramFlPoint.x = f1;
        localObject1 = this.stack;
        i12 = 5;
        f1 = localObject1[i12] + f5;
        paramFlPoint.y = f1;
        f6 = paramFlPoint.x;
        f7 = paramFlPoint.y;
        localObject1 = paramPath;
        paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
        f1 = paramFlPoint.x;
        localObject4 = this.stack;
        i9 = 6;
        f2 = localObject4[i9] + f1;
        f1 = paramFlPoint.y;
        localObject2 = this.stack;
        f4 = localObject2[7] + f1;
        localObject1 = this.stack;
        i8 = 8;
        f1 = localObject1[i8];
        f3 = f2 + f1;
        localObject1 = this.stack;
        i11 = 9;
        f1 = localObject1[i11];
        f5 = f4 + f1;
        f1 = Math.abs(f3 - f9);
        f6 = Math.abs(f5 - f8);
        bool6 = f1 < f6;
        if (bool6)
        {
          localObject1 = this.stack;
          i12 = 10;
          f6 = 1.4E-44F;
          f1 = localObject1[i12] + f3;
          paramFlPoint.x = f1;
        }
        for (paramFlPoint.y = f8;; paramFlPoint.y = f1)
        {
          f6 = paramFlPoint.x;
          f7 = paramFlPoint.y;
          localObject1 = paramPath;
          paramPath.cubicTo(f2, f4, f3, f5, f6, f7);
          paramFlPoint.open = true;
          bool6 = false;
          f1 = 0.0F;
          localObject1 = null;
          this.stackptr = 0;
          break;
          paramFlPoint.x = f9;
          localObject1 = this.stack;
          i12 = 10;
          f6 = 1.4E-44F;
          f1 = localObject1[i12] + f5;
        }
        label7084:
        i15 = i13;
      }
      label7091:
      boolean bool6 = false;
      localObject1 = null;
      f1 = 0.0F;
      break label3127;
      label7103:
      bool6 = false;
      localObject1 = null;
      f1 = 0.0F;
      break label2865;
      i14 = 0;
    }
  }
  
  public void readFNum()
  {
    int i = -1;
    float f1 = 0.0F / 0.0F;
    float f2 = 10.0F;
    float f3 = 1.0F;
    int j = 1;
    float f4 = Float.MIN_VALUE;
    byte[] arrayOfByte = this.data;
    int k = this.pos;
    int m = k + 1;
    this.pos = m;
    int n = arrayOfByte[k];
    k = 0;
    m = 0;
    float f5 = 0.0F;
    int i1 = 0;
    float f6 = f3;
    for (;;)
    {
      int i2 = -35;
      float f7 = 0.0F / 0.0F;
      if (n == i2)
      {
        arrayOfByte = this.data;
        i2 = this.pos;
        i3 = i2 + 1;
        this.pos = i3;
        n = arrayOfByte[i2];
      }
      i2 = n >> 4 & 0xF;
      n = (byte)(n << 4 | 0xD);
      int i3 = 10;
      if (i2 < i3)
      {
        if (k != 0)
        {
          i1 = i1 * 10 + i2;
        }
        else
        {
          boolean bool = f6 < f3;
          if (!bool)
          {
            f5 *= f2;
            f7 = i2;
            f5 += f7;
          }
          else
          {
            f7 = i2 * f6;
            f5 += f7;
            f6 /= f2;
          }
        }
      }
      else
      {
        int i4 = 10;
        if (i2 == i4)
        {
          f6 = 0.1F;
        }
        else
        {
          i4 = 11;
          if (i2 == i4)
          {
            k = j;
          }
          else
          {
            i4 = 12;
            if (i2 == i4)
            {
              k = i;
            }
            else
            {
              i4 = 14;
              if (i2 != i4) {
                break;
              }
              m = j;
            }
          }
        }
      }
    }
    if (m != 0) {}
    for (;;)
    {
      f1 = i * f5;
      double d = i1 * k;
      f4 = (float)Math.pow(10.0D, d);
      f1 *= f4;
      this.fnum = f1;
      return;
      i = j;
      f1 = f4;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\Type1CFont.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */