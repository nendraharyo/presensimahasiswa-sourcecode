package com.sun.pdfview.font;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import c.a.a.e.b;
import com.sun.pdfview.PDFObject;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Type1Font
  extends OutlineFont
{
  Matrix at;
  int callcount;
  String[] chr2name;
  int lenIV;
  Map name2outline;
  Map name2width;
  int password;
  int psLoc;
  float[] psStack;
  int sloc;
  float[] stack;
  byte[][] subrs;
  
  public Type1Font(String paramString, PDFObject paramPDFObject, PDFFontDescriptor paramPDFFontDescriptor)
  {
    super(paramString, paramPDFObject, paramPDFFontDescriptor);
    Object localObject = new float[100];
    this.stack = ((float[])localObject);
    this.sloc = 0;
    int j = 3;
    localObject = new float[j];
    this.psStack = ((float[])localObject);
    this.psLoc = 0;
    this.callcount = 0;
    if (paramPDFFontDescriptor != null)
    {
      localObject = paramPDFFontDescriptor.getFontFile();
      if (localObject != null)
      {
        localObject = paramPDFFontDescriptor.getFontFile().getDictRef("Length1");
        j = ((PDFObject)localObject).getIntValue();
        localPDFObject = paramPDFFontDescriptor.getFontFile().getDictRef("Length2");
        i = localPDFObject.getIntValue();
        byte[] arrayOfByte = paramPDFFontDescriptor.getFontFile().getStream();
        parseFont(arrayOfByte, j, i);
      }
    }
  }
  
  private void buildAccentChar(float paramFloat1, float paramFloat2, char paramChar1, char paramChar2, Path paramPath)
  {
    boolean bool1 = false;
    Matrix localMatrix = null;
    float f = getWidth(paramChar1, null);
    Object localObject1 = getOutline(paramChar1, f);
    Path localPath = new android/graphics/Path;
    localPath.<init>((Path)localObject1);
    localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    Object localObject2 = this.at;
    boolean bool2 = ((Matrix)localObject2).invert((Matrix)localObject1);
    if (bool2)
    {
      localPath.transform((Matrix)localObject1);
      localObject1 = new android/graphics/Matrix;
      ((Matrix)localObject1).<init>();
      ((Matrix)localObject1).setTranslate(0.0F, paramFloat2);
      localPath.transform((Matrix)localObject1);
    }
    for (;;)
    {
      f = getWidth(paramChar2, null);
      localObject1 = getOutline(paramChar2, f);
      localObject2 = new android/graphics/Path;
      ((Path)localObject2).<init>((Path)localObject1);
      localObject1 = new android/graphics/Matrix;
      ((Matrix)localObject1).<init>();
      localMatrix = this.at;
      bool1 = localMatrix.invert((Matrix)localObject1);
      if (bool1) {
        ((Path)localObject2).transform((Matrix)localObject1);
      }
      paramPath.addPath((Path)localObject2);
      paramPath.addPath(localPath);
      return;
      localObject1 = new android/graphics/Matrix;
      ((Matrix)localObject1).<init>();
      ((Matrix)localObject1).setTranslate(0.0F, paramFloat2);
      localPath.transform((Matrix)localObject1);
    }
  }
  
  private byte[] decrypt(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt2 - paramInt1 - paramInt4;
    if (i < 0) {
      paramInt4 = 0;
    }
    byte[] arrayOfByte = new byte[paramInt2 - paramInt1 - paramInt4];
    int j = 52845;
    int k = 22719;
    i = paramInt1;
    for (;;)
    {
      if (i >= paramInt2) {
        return arrayOfByte;
      }
      int m = paramArrayOfByte[i] & 0xFF;
      int n = (paramInt3 >> 8 ^ m) & 0xFF;
      m = (m + paramInt3) * j + k;
      int i1 = (char)-1;
      paramInt3 = m & i1;
      m = i - paramInt1 - paramInt4;
      if (m >= 0)
      {
        m = i - paramInt1 - paramInt4;
        n = (byte)n;
        arrayOfByte[m] = n;
      }
      i += 1;
    }
  }
  
  private int findSlashName(byte[] paramArrayOfByte, String paramString)
  {
    int i = 0;
    int j = paramArrayOfByte.length;
    if (i >= j)
    {
      i = -1;
      label14:
      return i;
    }
    j = paramArrayOfByte[i];
    int k = 47;
    if (j == k)
    {
      k = 1;
      j = 0;
    }
    for (;;)
    {
      int m = paramString.length();
      if (j >= m) {}
      for (j = k;; j = 0)
      {
        if (j != 0) {
          break label100;
        }
        i += 1;
        break;
        m = i + j + 1;
        m = paramArrayOfByte[m];
        int n = paramString.charAt(j);
        if (m == n) {
          break label102;
        }
      }
      label100:
      break label14;
      label102:
      j += 1;
    }
  }
  
  private boolean isASCII(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    int k = paramInt + 4;
    if (i >= k) {}
    int j;
    label78:
    label100:
    for (i = 1;; j = 0)
    {
      return i;
      int m = (char)(paramArrayOfByte[i] & 0xFF);
      int n = 48;
      if (m >= n)
      {
        n = 57;
        if (m > n) {}
      }
      do
      {
        do
        {
          i += 1;
          break;
          n = 97;
          if (m < n) {
            break label78;
          }
          n = 102;
        } while (m <= n);
        n = 65;
        if (m < n) {
          break label100;
        }
        n = 70;
      } while (m <= n);
    }
  }
  
  private void parse(byte[] paramArrayOfByte, Path paramPath, FlPoint paramFlPoint1, FlPoint paramFlPoint2)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int j;
    int k;
    float f2;
    int m;
    int n;
    float f3;
    Object localObject2;
    for (;;)
    {
      j = paramArrayOfByte.length;
      if (i >= j) {
        return;
      }
      k = i + 1;
      i = paramArrayOfByte[i] & 0xFF;
      j = 255;
      f2 = 3.57E-43F;
      if (i == j)
      {
        localObject1 = this.stack;
        j = this.sloc;
        m = j + 1;
        this.sloc = m;
        m = (paramArrayOfByte[k] & 0xFF) << 24;
        n = k + 1;
        n = (paramArrayOfByte[n] & 0xFF) << 16;
        m += n;
        n = k + 2;
        n = (paramArrayOfByte[n] & 0xFF) << 8;
        m += n;
        n = k + 3;
        n = paramArrayOfByte[n] & 0xFF;
        m += n;
        f3 = m;
        localObject1[j] = f3;
        i = k + 4;
      }
      else
      {
        j = 251;
        f2 = 3.52E-43F;
        if (i >= j)
        {
          localObject2 = this.stack;
          m = this.sloc;
          n = m + 1;
          this.sloc = n;
          i = -(i + 65285 << 8);
          n = paramArrayOfByte[k] & 0xFF;
          f1 = i - n + -108;
          localObject2[m] = f1;
          i = k + 1;
        }
        else
        {
          j = 247;
          f2 = 3.46E-43F;
          if (i >= j)
          {
            localObject2 = this.stack;
            m = this.sloc;
            n = m + 1;
            this.sloc = n;
            i = i + 65289 << 8;
            n = paramArrayOfByte[k] & 0xFF;
            f1 = i + n + 108;
            localObject2[m] = f1;
            i = k + 1;
          }
          else
          {
            j = 32;
            f2 = 4.5E-44F;
            if (i < j) {
              break;
            }
            localObject2 = this.stack;
            m = this.sloc;
            n = m + 1;
            this.sloc = n;
            f1 = i + 65397;
            localObject2[m] = f1;
            i = k;
          }
        }
      }
    }
    switch (i)
    {
    }
    for (;;)
    {
      i = k;
      break;
      localObject2 = new java/lang/RuntimeException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Bad command (");
      localObject1 = i + ")";
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      localObject2 = new java/lang/RuntimeException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Bad command (");
      localObject1 = i + ")";
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      f1 = paramFlPoint1.y;
      f2 = pop();
      f1 += f2;
      paramFlPoint1.y = f1;
      f1 = paramFlPoint1.x;
      f2 = paramFlPoint1.y;
      paramPath.moveTo(f1, f2);
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      f1 = paramFlPoint1.y;
      f2 = pop();
      f1 += f2;
      paramFlPoint1.y = f1;
      f1 = paramFlPoint1.x;
      f2 = pop();
      f1 += f2;
      paramFlPoint1.x = f1;
      f1 = paramFlPoint1.x;
      f2 = paramFlPoint1.y;
      paramPath.lineTo(f1, f2);
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      f1 = paramFlPoint1.x;
      f2 = pop();
      f1 += f2;
      paramFlPoint1.x = f1;
      f1 = paramFlPoint1.x;
      f2 = paramFlPoint1.y;
      paramPath.lineTo(f1, f2);
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      f1 = paramFlPoint1.y;
      f2 = pop();
      f1 += f2;
      paramFlPoint1.y = f1;
      f1 = paramFlPoint1.x;
      f2 = paramFlPoint1.y;
      paramPath.lineTo(f1, f2);
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      float f4 = pop();
      float f5 = pop();
      float f6 = pop();
      float f7 = pop();
      float f8 = pop();
      float f9 = pop();
      f2 = paramFlPoint1.x + f9;
      f3 = paramFlPoint1.y + f8;
      float f10 = paramFlPoint1.x + f9 + f7;
      float f11 = paramFlPoint1.y + f8 + f6;
      float f12 = paramFlPoint1.x + f9 + f7 + f5;
      float f13 = paramFlPoint1.y + f8 + f6 + f4;
      localObject1 = paramPath;
      paramPath.cubicTo(f2, f3, f10, f11, f12, f13);
      f1 = paramFlPoint1.x;
      f2 = f9 + f7 + f5;
      f1 += f2;
      paramFlPoint1.x = f1;
      f1 = paramFlPoint1.y;
      f2 = f8 + f6 + f4;
      f1 += f2;
      paramFlPoint1.y = f1;
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      paramPath.close();
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      f1 = pop();
      i = (int)f1;
      localObject2 = this.subrs[i];
      if (localObject2 == null)
      {
        localObject2 = System.out;
        localObject3 = new java/lang/StringBuilder;
        String str = "No subroutine #";
        ((StringBuilder)localObject3).<init>(str);
        localObject1 = i;
        ((PrintStream)localObject2).println((String)localObject1);
        i = k;
        break;
      }
      j = this.callcount + 1;
      this.callcount = j;
      j = this.callcount;
      m = 10;
      f3 = 1.4E-44F;
      if (j > m)
      {
        localObject1 = System.out;
        localObject2 = "Call stack too large";
        ((PrintStream)localObject1).println((String)localObject2);
      }
      for (;;)
      {
        i = this.callcount + -1;
        this.callcount = i;
        i = k;
        break;
        localObject2 = this.subrs;
        localObject1 = localObject2[i];
        parse((byte[])localObject1, paramPath, paramFlPoint1, paramFlPoint2);
      }
      int i2 = k + 1;
      i = paramArrayOfByte[k] & 0xFF;
      j = 6;
      f2 = 8.4E-45F;
      if (i == j)
      {
        n = (char)(int)pop();
        char c = (char)(int)pop();
        f3 = pop();
        f2 = pop();
        localObject1 = this;
        buildAccentChar(f2, f3, n, c, paramPath);
        f1 = 0.0F;
        localObject1 = null;
        this.sloc = 0;
        i = i2;
        break;
      }
      j = 7;
      f2 = 9.8E-45F;
      if (i == j)
      {
        f1 = pop();
        paramFlPoint2.y = f1;
        f1 = pop();
        paramFlPoint2.x = f1;
        f1 = pop();
        paramFlPoint1.y = f1;
        f1 = pop();
        paramFlPoint1.x = f1;
        f1 = 0.0F;
        localObject1 = null;
        this.sloc = 0;
        i = i2;
        break;
      }
      j = 12;
      f2 = 1.7E-44F;
      int i1;
      int i3;
      if (i == j)
      {
        f1 = pop();
        f2 = pop();
        localObject3 = this.stack;
        i1 = this.sloc;
        i3 = i1 + 1;
        this.sloc = i3;
        f1 = f2 / f1;
        localObject3[i1] = f1;
        i = i2;
        break;
      }
      j = 33;
      f2 = 4.6E-44F;
      if (i == j)
      {
        f1 = pop();
        paramFlPoint1.y = f1;
        f1 = pop();
        paramFlPoint1.x = f1;
        f1 = paramFlPoint1.x;
        f2 = paramFlPoint1.y;
        paramPath.moveTo(f1, f2);
        f1 = 0.0F;
        localObject1 = null;
        this.sloc = 0;
        i = i2;
        break;
      }
      if (i == 0)
      {
        f1 = 0.0F;
        localObject1 = null;
        this.sloc = 0;
        i = i2;
        break;
      }
      j = 1;
      f2 = Float.MIN_VALUE;
      if (i == j)
      {
        f1 = 0.0F;
        localObject1 = null;
        this.sloc = 0;
        i = i2;
        break;
      }
      j = 2;
      f2 = 2.8E-45F;
      if (i == j)
      {
        f1 = 0.0F;
        localObject1 = null;
        this.sloc = 0;
        i = i2;
        break;
      }
      j = 16;
      f2 = 2.24E-44F;
      if (i == j)
      {
        f1 = pop();
        i = (int)f1;
        f2 = pop();
        j = (int)f2;
        switch (i)
        {
        default: 
          i = 0;
          f1 = 0.0F;
          localObject1 = null;
        }
        for (;;)
        {
          if (i <= j)
          {
            i = i2;
            break;
            localObject1 = this.psStack;
            j = this.psLoc;
            m = j + 1;
            this.psLoc = m;
            f3 = pop();
            localObject1[j] = f3;
            localObject1 = this.psStack;
            j = this.psLoc;
            m = j + 1;
            this.psLoc = m;
            f3 = pop();
            localObject1[j] = f3;
            pop();
            i = i2;
            break;
            localObject1 = this.psStack;
            j = this.psLoc;
            m = j + 1;
            this.psLoc = m;
            m = 1077936128;
            f3 = 3.0F;
            localObject1[j] = f3;
            i = i2;
            break;
          }
          localObject3 = this.psStack;
          i1 = this.psLoc;
          i3 = i1 + 1;
          this.psLoc = i3;
          f11 = pop();
          localObject3[i1] = f11;
          i += -1;
        }
      }
      j = 17;
      f2 = 2.4E-44F;
      if (i == j)
      {
        localObject1 = this.stack;
        j = this.sloc;
        m = j + 1;
        this.sloc = m;
        localObject3 = this.psStack;
        i1 = this.psLoc + -1;
        f3 = localObject3[i1];
        localObject1[j] = f3;
        i = this.psLoc + -1;
        this.psLoc = i;
        i = i2;
        break;
      }
      localObject2 = new java/lang/RuntimeException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Bad command (");
      localObject1 = i + ")";
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      f1 = pop();
      paramFlPoint2.x = f1;
      paramFlPoint2.y = 0.0F;
      f1 = pop();
      paramFlPoint1.x = f1;
      paramFlPoint1.y = 0.0F;
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      i = k;
      break;
      localObject2 = new java/lang/RuntimeException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Bad command (");
      localObject1 = i + ")";
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      f1 = paramFlPoint1.y;
      f2 = pop();
      f1 += f2;
      paramFlPoint1.y = f1;
      f1 = paramFlPoint1.x;
      f2 = pop();
      f1 += f2;
      paramFlPoint1.x = f1;
      f1 = paramFlPoint1.x;
      f2 = paramFlPoint1.y;
      paramPath.moveTo(f1, f2);
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      f1 = paramFlPoint1.x;
      f2 = pop();
      f1 += f2;
      paramFlPoint1.x = f1;
      f1 = paramFlPoint1.x;
      f2 = paramFlPoint1.y;
      paramPath.moveTo(f1, f2);
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      localObject2 = new java/lang/RuntimeException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Bad command (");
      localObject1 = i + ")";
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      f4 = pop();
      f5 = pop();
      f6 = pop();
      f7 = pop();
      f2 = paramFlPoint1.x;
      f3 = paramFlPoint1.y + f7;
      f10 = paramFlPoint1.x + f6;
      f11 = paramFlPoint1.y + f7 + f5;
      f12 = paramFlPoint1.x + f6 + f4;
      f13 = paramFlPoint1.y + f7 + f5;
      localObject1 = paramPath;
      paramPath.cubicTo(f2, f3, f10, f11, f12, f13);
      f1 = paramFlPoint1.x;
      f2 = f6 + f4;
      f1 += f2;
      paramFlPoint1.x = f1;
      f1 = paramFlPoint1.y;
      f2 = f7 + f5;
      f1 += f2;
      paramFlPoint1.y = f1;
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
      i = k;
      break;
      f4 = pop();
      f5 = pop();
      f6 = pop();
      f7 = pop();
      f2 = paramFlPoint1.x + f7;
      f3 = paramFlPoint1.y;
      f10 = paramFlPoint1.x + f7 + f6;
      f11 = paramFlPoint1.y + f5;
      f12 = paramFlPoint1.x + f7 + f6;
      f13 = paramFlPoint1.y + f5 + f4;
      localObject1 = paramPath;
      paramPath.cubicTo(f2, f3, f10, f11, f12, f13);
      f1 = paramFlPoint1.x;
      f2 = f7 + f6;
      f1 += f2;
      paramFlPoint1.x = f1;
      f1 = paramFlPoint1.y;
      f2 = f5 + f4;
      f1 += f2;
      paramFlPoint1.y = f1;
      i = 0;
      f1 = 0.0F;
      localObject1 = null;
      this.sloc = 0;
    }
  }
  
  private Path parseGlyph(byte[] paramArrayOfByte, FlPoint paramFlPoint, Matrix paramMatrix)
  {
    try
    {
      Path localPath = new android/graphics/Path;
      localPath.<init>();
      FlPoint localFlPoint = new com/sun/pdfview/font/FlPoint;
      localFlPoint.<init>();
      this.sloc = 0;
      parse(paramArrayOfByte, localPath, localFlPoint, paramFlPoint);
      localPath.transform(paramMatrix);
      return localPath;
    }
    finally {}
  }
  
  private float pop()
  {
    float f = 0.0F;
    float[] arrayOfFloat = null;
    int i = this.sloc;
    if (i > 0)
    {
      arrayOfFloat = this.stack;
      i = this.sloc + -1;
      this.sloc = i;
      f = arrayOfFloat[i];
    }
    return f;
  }
  
  private byte[] readASCII(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = (paramInt2 - paramInt1) / 2;
    byte[] arrayOfByte = new byte[j];
    int k = 0;
    if (paramInt1 >= paramInt2) {
      return arrayOfByte;
    }
    j = (char)(paramArrayOfByte[paramInt1] & 0xFF);
    int m = 48;
    if (j >= m)
    {
      m = 57;
      if (j <= m)
      {
        j = (byte)(j + -48);
        label67:
        m = i + 1;
        i %= 2;
        if (i != 0) {
          break label193;
        }
        j = (byte)(j << 4);
        arrayOfByte[k] = j;
        j = m;
        m = k;
      }
    }
    for (;;)
    {
      paramInt1 += 1;
      i = j;
      k = m;
      break;
      m = 97;
      if (j >= m)
      {
        m = 102;
        if (j <= m)
        {
          j = (byte)(j + -97 + 10);
          break label67;
        }
      }
      m = 65;
      if (j >= m)
      {
        m = 70;
        if (j <= m)
        {
          j = (byte)(j + -65 + 10);
          break label67;
          label193:
          i = k + 1;
          int n = arrayOfByte[k];
          j = (byte)(j | n);
          arrayOfByte[k] = j;
          j = m;
          m = i;
          continue;
        }
      }
      j = i;
      m = k;
    }
  }
  
  private byte[][] readArray(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    int i = 0;
    Object localObject1 = null;
    int j = findSlashName(paramArrayOfByte, paramString1);
    if (j < 0) {
      localObject1 = new byte[0][];
    }
    for (;;)
    {
      return (byte[][])localObject1;
      Type1Font.PSParser localPSParser = new com/sun/pdfview/font/Type1Font$PSParser;
      localPSParser.<init>(this, paramArrayOfByte, j);
      localPSParser.readThing();
      Object localObject2 = localPSParser.readThing();
      Object localObject3 = "StandardEncoding";
      boolean bool2 = ((String)localObject2).equals(localObject3);
      if (bool2)
      {
        j = FontSupport.standardEncoding.length;
        localObject2 = new byte[j][];
        for (;;)
        {
          int k = localObject2.length;
          if (i >= k)
          {
            localObject1 = localObject2;
            break;
          }
          k = FontSupport.standardEncoding[i];
          localObject3 = FontSupport.getName(k).getBytes();
          localObject2[i] = localObject3;
          i += 1;
        }
      }
      j = Integer.parseInt((String)localObject2);
      localObject3 = new byte[j][];
      do
      {
        for (;;)
        {
          localObject2 = localPSParser.readThing();
          String str1 = "dup";
          boolean bool3 = ((String)localObject2).equals(str1);
          if (bool3) {
            localObject2 = localPSParser.readThing();
          }
          try
          {
            int m = Integer.parseInt((String)localObject2);
            String str2 = localPSParser.readThing();
            localObject2 = str2.getBytes();
            boolean bool4 = Character.isDigit(str2.charAt(0));
            if (bool4)
            {
              int i1 = Integer.parseInt(str2);
              String str3 = localPSParser.readThing();
              String str4 = "-|";
              boolean bool5 = str3.equals(str4);
              if (!bool5)
              {
                str4 = "RD";
                bool4 = str3.equals(str4);
                if (!bool4) {}
              }
              else
              {
                j = localPSParser.getLoc() + 1;
                localPSParser.setLoc(j);
                j = this.password;
                int n = this.lenIV;
                localObject2 = localPSParser.getNEncodedBytes(i1, j, n);
              }
            }
            localObject3[m] = localObject2;
          }
          catch (Exception localException)
          {
            boolean bool1;
            for (;;) {}
          }
        }
        bool1 = ((String)localObject2).equals(paramString2);
      } while (!bool1);
      localObject1 = localObject3;
    }
  }
  
  private HashMap readChars(byte[] paramArrayOfByte)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    String str1 = "CharStrings";
    int i = findSlashName(paramArrayOfByte, str1);
    if (i < 0) {}
    for (;;)
    {
      return localHashMap;
      Type1Font.PSParser localPSParser = new com/sun/pdfview/font/Type1Font$PSParser;
      localPSParser.<init>(this, paramArrayOfByte, i);
      boolean bool1;
      do
      {
        for (;;)
        {
          str1 = localPSParser.readThing();
          localObject = null;
          int j = str1.charAt(0);
          int k = 47;
          if (j != k) {
            break;
          }
          localObject = localPSParser.readThing();
          j = Integer.parseInt((String)localObject);
          String str2 = localPSParser.readThing();
          String str3 = "-|";
          boolean bool3 = str2.equals(str3);
          if (!bool3)
          {
            str3 = "RD";
            boolean bool2 = str2.equals(str3);
            if (!bool2) {}
          }
          else
          {
            int m = localPSParser.getLoc() + 1;
            localPSParser.setLoc(m);
            m = this.password;
            int n = this.lenIV;
            localObject = localPSParser.getNEncodedBytes(j, m, n);
            m = 1;
            str1 = str1.substring(m);
            localHashMap.put(str1, localObject);
          }
        }
        Object localObject = "end";
        bool1 = str1.equals(localObject);
      } while (!bool1);
    }
  }
  
  private String[] readEncoding(byte[] paramArrayOfByte)
  {
    byte[][] arrayOfByte = readArray(paramArrayOfByte, "Encoding", "def");
    String[] arrayOfString = new String['Ā'];
    int i = 0;
    int j = arrayOfByte.length;
    if (i >= j) {
      return arrayOfString;
    }
    Object localObject = arrayOfByte[i];
    byte[] arrayOfByte1;
    if (localObject != null)
    {
      localObject = arrayOfByte[i];
      j = localObject[0];
      int k = 47;
      if (j == k)
      {
        localObject = new java/lang/String;
        arrayOfByte1 = arrayOfByte[i];
        ((String)localObject).<init>(arrayOfByte1);
        k = 1;
        localObject = ((String)localObject).substring(k);
        arrayOfString[i] = localObject;
      }
    }
    for (;;)
    {
      i += 1;
      break;
      localObject = new java/lang/String;
      arrayOfByte1 = arrayOfByte[i];
      ((String)localObject).<init>(arrayOfByte1);
      arrayOfString[i] = localObject;
      continue;
      j = 0;
      localObject = null;
      arrayOfString[i] = null;
    }
  }
  
  private byte[][] readSubrs(byte[] paramArrayOfByte)
  {
    return readArray(paramArrayOfByte, "Subrs", "index");
  }
  
  protected Path getOutline(char paramChar, float paramFloat)
  {
    Object localObject = this.chr2name;
    int i = paramChar & 0xFF;
    localObject = localObject[i];
    return getOutline((String)localObject, paramFloat);
  }
  
  protected Path getOutline(String paramString, float paramFloat)
  {
    int i = 1;
    int j = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    if (paramString != null)
    {
      localObject2 = this.name2outline;
      boolean bool1 = ((Map)localObject2).containsKey(paramString);
      if (bool1) {}
    }
    else
    {
      paramString = ".notdef";
    }
    Object localObject2 = this.name2outline.get(paramString);
    boolean bool2 = localObject2 instanceof Path;
    if (bool2) {
      localObject2 = (Path)localObject2;
    }
    for (;;)
    {
      return (Path)localObject2;
      localObject2 = (byte[])localObject2;
      FlPoint localFlPoint = new com/sun/pdfview/font/FlPoint;
      localFlPoint.<init>();
      Object localObject3 = this.at;
      localObject2 = parseGlyph((byte[])localObject2, localFlPoint, (Matrix)localObject3);
      boolean bool3 = paramFloat < 0.0F;
      if (bool3)
      {
        float f2 = localFlPoint.x;
        bool3 = f2 < 0.0F;
        if (bool3)
        {
          localObject3 = new android/graphics/PointF;
          f1 = localFlPoint.x;
          float f3 = localFlPoint.y;
          ((PointF)localObject3).<init>(f1, f3);
          j = 2;
          localObject1 = new float[j];
          f3 = ((PointF)localObject3).x;
          localObject1[0] = f3;
          f3 = ((PointF)localObject3).y;
          localObject1[i] = f3;
          Matrix localMatrix = this.at;
          localMatrix.mapPoints((float[])localObject1);
          f3 = localObject1[0];
          ((PointF)localObject3).x = f3;
          f1 = localObject1[i];
          ((PointF)localObject3).y = f1;
          f2 = ((PointF)localObject3).x;
          f2 = paramFloat / f2;
          localObject1 = new android/graphics/Matrix;
          ((Matrix)localObject1).<init>();
          f3 = 1.0F;
          ((Matrix)localObject1).setScale(f2, f3);
          ((Path)localObject2).transform((Matrix)localObject1);
        }
      }
      this.name2outline.put(paramString, localObject2);
      localObject3 = this.name2width;
      ((Map)localObject3).put(paramString, localFlPoint);
    }
  }
  
  public float getWidth(char paramChar, String paramString)
  {
    int i = -1;
    int j = 0;
    float f1 = 0.0F;
    int k = getFirstChar();
    Object localObject;
    if (k != i)
    {
      k = getLastChar();
      if (k != i) {}
    }
    else
    {
      localObject = this.chr2name;
      i = paramChar & 0xFF;
      localObject = localObject[i];
      if (paramString == null) {
        break label178;
      }
    }
    for (;;)
    {
      boolean bool;
      float f2;
      if (paramString != null)
      {
        localObject = this.name2outline;
        bool = ((Map)localObject).containsKey(paramString);
        if (bool)
        {
          localObject = this.name2width;
          bool = ((Map)localObject).containsKey(paramString);
          if (!bool) {
            getOutline(paramString, 0.0F);
          }
          localObject = (FlPoint)this.name2width.get(paramString);
          if (localObject != null)
          {
            f2 = ((FlPoint)localObject).x;
            j = getDefaultWidth();
            f1 = j;
            f2 /= f1;
          }
        }
      }
      for (;;)
      {
        return f2;
        bool = false;
        localObject = null;
        f2 = 0.0F;
        continue;
        f2 = super.getWidth(paramChar, paramString);
      }
      label178:
      paramString = (String)localObject;
    }
  }
  
  protected void parseFont(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.name2width = ((Map)localObject1);
    float f1 = 0.0F;
    localObject1 = (byte[])null;
    boolean bool = isASCII(paramArrayOfByte, paramInt1);
    int i;
    Object localObject2;
    int j;
    int k;
    int m;
    Object localObject3;
    if (bool)
    {
      i = paramInt1 + paramInt2;
      localObject2 = readASCII(paramArrayOfByte, paramInt1, i);
      j = localObject2.length;
      k = 55665;
      m = 4;
      localObject1 = this;
      localObject1 = decrypt((byte[])localObject2, 0, j, k, m);
      localObject3 = localObject1;
      localObject1 = readEncoding(paramArrayOfByte);
      this.chr2name = ((String[])localObject1);
      localObject1 = "lenIV";
      i = findSlashName((byte[])localObject3, (String)localObject1);
      localObject2 = new com/sun/pdfview/font/Type1Font$PSParser;
      ((Type1Font.PSParser)localObject2).<init>(this, (byte[])localObject3, 0);
      if (i >= 0) {
        break label318;
      }
      i = 4;
      f1 = 5.6E-45F;
      this.lenIV = i;
      label149:
      f1 = 6.068E-42F;
      this.password = 4330;
      localObject1 = "FontMatrix";
      i = findSlashName(paramArrayOfByte, (String)localObject1);
      if (i >= 0) {
        break label355;
      }
      System.out.println("No FontMatrix!");
      i = 981668463;
      f1 = 0.001F;
      localObject2 = null;
      j = 981668463;
      float f2 = 0.001F;
      k = 0;
      m = 0;
      localObject1 = b.a(f1, 0.0F, 0.0F, f2, 0.0F, 0.0F);
    }
    for (this.at = ((Matrix)localObject1);; this.at = ((Matrix)localObject1))
    {
      localObject1 = readSubrs((byte[])localObject3);
      this.subrs = ((byte[][])localObject1);
      localObject1 = new java/util/TreeMap;
      localObject2 = readChars((byte[])localObject3);
      ((TreeMap)localObject1).<init>((Map)localObject2);
      this.name2outline = ((Map)localObject1);
      return;
      j = paramInt1 + paramInt2;
      k = 55665;
      m = 4;
      localObject1 = this;
      localObject2 = paramArrayOfByte;
      localObject1 = decrypt(paramArrayOfByte, paramInt1, j, k, m);
      localObject3 = localObject1;
      break;
      label318:
      i += 6;
      ((Type1Font.PSParser)localObject2).setLoc(i);
      localObject1 = ((Type1Font.PSParser)localObject2).readThing();
      i = Integer.parseInt((String)localObject1);
      this.lenIV = i;
      break label149;
      label355:
      localObject2 = new com/sun/pdfview/font/Type1Font$PSParser;
      i += 11;
      ((Type1Font.PSParser)localObject2).<init>(this, paramArrayOfByte, i);
      i = 6;
      f1 = 8.4E-45F;
      localObject1 = b.a(((Type1Font.PSParser)localObject2).readArray(i));
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\Type1Font.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */