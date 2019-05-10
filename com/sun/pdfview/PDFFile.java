package com.sun.pdfview;

import a.a.a;
import android.graphics.RectF;
import c.a.a.b.b;
import com.sun.pdfview.action.GoToAction;
import com.sun.pdfview.action.PDFAction;
import com.sun.pdfview.decrypt.IdentityDecrypter;
import com.sun.pdfview.decrypt.PDFDecrypter;
import com.sun.pdfview.decrypt.PDFDecrypterFactory;
import com.sun.pdfview.decrypt.PDFPassword;
import com.sun.pdfview.decrypt.UnsupportedEncryptionException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class PDFFile
{
  public static final int FF_CHAR = 12;
  public static final int NUL_CHAR = 0;
  private static final String VERSION_COMMENT = "%PDF-";
  b buf;
  Cache cache;
  private PDFDecrypter defaultDecrypter;
  PDFObject encrypt;
  PDFObject info;
  private int majorVersion;
  private int minorVersion;
  PDFXref[] objIdx;
  private boolean printable;
  PDFObject root;
  private boolean saveable;
  private String versionString = "1.1";
  
  public PDFFile(b paramb)
  {
    this(paramb, null);
  }
  
  public PDFFile(b paramb, PDFPassword paramPDFPassword)
  {
    this.majorVersion = i;
    this.minorVersion = i;
    this.root = null;
    this.encrypt = null;
    this.info = null;
    this.printable = i;
    this.saveable = i;
    Object localObject = IdentityDecrypter.getInstance();
    this.defaultDecrypter = ((PDFDecrypter)localObject);
    this.buf = paramb;
    localObject = new com/sun/pdfview/Cache;
    ((Cache)localObject).<init>();
    this.cache = ((Cache)localObject);
    parseFile(paramPDFPassword);
  }
  
  private PDFPage createPage(int paramInt, PDFObject paramPDFObject)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = getInheritedValue(paramPDFObject, "MediaBox");
    if (localObject2 != null) {}
    for (localObject2 = parseRect((PDFObject)localObject2);; localObject2 = null)
    {
      Object localObject3 = getInheritedValue(paramPDFObject, "CropBox");
      if (localObject3 != null) {
        localObject1 = parseRect((PDFObject)localObject3);
      }
      localObject3 = getInheritedValue(paramPDFObject, "Rotate");
      if (localObject3 != null) {
        i = ((PDFObject)localObject3).getIntValue();
      }
      if (localObject1 == null) {}
      for (;;)
      {
        localObject1 = new com/sun/pdfview/PDFPage;
        localObject3 = this.cache;
        ((PDFPage)localObject1).<init>(paramInt, (RectF)localObject2, i, (Cache)localObject3);
        return (PDFPage)localObject1;
        localObject2 = localObject1;
      }
    }
  }
  
  private PDFObject findPage(PDFObject paramPDFObject, int paramInt1, int paramInt2, Map paramMap)
  {
    Object localObject = paramPDFObject.getDictRef("Resources");
    if (localObject != null)
    {
      localObject = ((PDFObject)localObject).getDictionary();
      paramMap.putAll((Map)localObject);
    }
    localObject = paramPDFObject.getDictRef("Type");
    int i;
    if (localObject != null)
    {
      localObject = ((PDFObject)localObject).getStringValue();
      String str1 = "Page";
      i = ((String)localObject).equals(str1);
      if (i != 0) {
        return paramPDFObject;
      }
    }
    localObject = paramPDFObject.getDictRef("Kids");
    PDFObject[] arrayOfPDFObject;
    if (localObject != null)
    {
      arrayOfPDFObject = ((PDFObject)localObject).getArray();
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      int k = arrayOfPDFObject.length;
      if (i >= k)
      {
        paramPDFObject = null;
        break;
      }
      int m = 1;
      PDFObject localPDFObject = arrayOfPDFObject[i];
      String str2 = "Count";
      localPDFObject = localPDFObject.getDictRef(str2);
      if (localPDFObject != null) {
        m = localPDFObject.getIntValue();
      }
      int n = paramInt1 + m;
      if (n >= paramInt2)
      {
        localObject = arrayOfPDFObject[i];
        paramPDFObject = findPage((PDFObject)localObject, paramInt1, paramInt2, paramMap);
        break;
      }
      paramInt1 += m;
      int j;
      i += 1;
    }
  }
  
  private byte[] getContents(PDFObject paramPDFObject)
  {
    PDFParseException localPDFParseException = null;
    Object localObject = paramPDFObject.getDictRef("Contents");
    if (localObject == null)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("No page contents!");
      throw ((Throwable)localObject);
    }
    PDFObject[] arrayOfPDFObject = ((PDFObject)localObject).getArray();
    int i = arrayOfPDFObject.length;
    int j = 1;
    if (i == j)
    {
      localObject = arrayOfPDFObject[0].getStream();
      return (byte[])localObject;
    }
    i = 0;
    localObject = null;
    j = 0;
    StringBuilder localStringBuilder = null;
    label67:
    int k = arrayOfPDFObject.length;
    byte[] arrayOfByte1;
    if (i >= k)
    {
      arrayOfByte1 = new byte[j];
      i = 0;
      localObject = null;
      j = 0;
      localStringBuilder = null;
    }
    for (;;)
    {
      int m = arrayOfPDFObject.length;
      if (i >= m)
      {
        localObject = arrayOfByte1;
        break;
        arrayOfByte1 = arrayOfPDFObject[i].getStream();
        if (arrayOfByte1 == null)
        {
          localPDFParseException = new com/sun/pdfview/PDFParseException;
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("No stream on content ");
          localStringBuilder = localStringBuilder.append(i).append(": ");
          localObject = arrayOfPDFObject[i];
          localObject = localObject;
          localPDFParseException.<init>((String)localObject);
          throw localPDFParseException;
        }
        k = arrayOfByte1.length;
        j += k;
        i += 1;
        break label67;
      }
      byte[] arrayOfByte2 = arrayOfPDFObject[i].getStream();
      int n = arrayOfByte2.length;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, j, n);
      m = arrayOfByte2.length;
      j += m;
      i += 1;
    }
  }
  
  private PDFObject getInheritedValue(PDFObject paramPDFObject, String paramString)
  {
    PDFObject localPDFObject = paramPDFObject.getDictRef(paramString);
    if (localPDFObject != null) {}
    for (;;)
    {
      return localPDFObject;
      localPDFObject = paramPDFObject.getDictRef("Parent");
      if (localPDFObject != null) {
        localPDFObject = getInheritedValue(localPDFObject, paramString);
      } else {
        localPDFObject = null;
      }
    }
  }
  
  public static boolean isDelimiter(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static boolean isRegularCharacter(int paramInt)
  {
    boolean bool = isWhiteSpace(paramInt);
    if (!bool)
    {
      bool = isDelimiter(paramInt);
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = false;; bool = true) {
      return bool;
    }
  }
  
  public static boolean isWhiteSpace(int paramInt)
  {
    switch (paramInt)
    {
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
  
  private boolean nextItemIs(String paramString)
  {
    boolean bool1 = false;
    do
    {
      localb1 = this.buf;
      i = localb1.b();
      bool2 = isWhiteSpace(i);
    } while (bool2);
    boolean bool2 = i;
    int i = 0;
    b localb1 = null;
    for (;;)
    {
      int k = paramString.length();
      if (i >= k) {
        bool1 = true;
      }
      int j;
      do
      {
        return bool1;
        if (i > 0)
        {
          b localb2 = this.buf;
          j = localb2.b();
        }
        k = paramString.charAt(i);
      } while (j != k);
      i += 1;
    }
  }
  
  private void parseFile(PDFPassword paramPDFPassword)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 32;
    this.buf.e();
    localObject2 = readLine();
    str1 = "%PDF-";
    boolean bool = ((String)localObject2).startsWith(str1);
    if (bool)
    {
      str1 = "%PDF-";
      k = str1.length();
      localObject2 = ((String)localObject2).substring(k);
      processVersion((String)localObject2);
    }
    this.buf.e();
    byte[] arrayOfByte = new byte[j];
    int m = this.buf.c();
    int k = arrayOfByte.length;
    k = m - k;
    m = 0;
    localObject2 = null;
    int n;
    for (;;)
    {
      if (k < 0)
      {
        i = m;
        m = k;
      }
      for (;;)
      {
        if (m >= 0) {
          break label249;
        }
        localObject1 = new java/io/IOException;
        ((IOException)localObject1).<init>("This may not be a PDF File");
        throw ((Throwable)localObject1);
        this.buf.a(k);
        this.buf.a(arrayOfByte);
        localObject2 = new java/lang/String;
        ((String)localObject2).<init>(arrayOfByte);
        String str2 = "startxref";
        m = ((String)localObject2).indexOf(str2);
        if (m <= 0) {
          break label231;
        }
        n = k + m;
        int i1 = arrayOfByte.length;
        n += i1;
        b localb = this.buf;
        i1 = localb.f();
        if (n > i1) {
          break;
        }
        m += k;
      }
      label231:
      n = arrayOfByte.length + -10;
      k -= n;
    }
    label249:
    this.buf.a(m);
    localObject2 = this.buf;
    ((b)localObject2).a(arrayOfByte);
    str1 = new java/lang/String;
    str1.<init>(arrayOfByte);
    i += 10;
    m = str1.charAt(i);
    if (m < j) {
      i += 1;
    }
    m = str1.charAt(i);
    if (m != j) {
      m = i;
    }
    for (;;)
    {
      int i2 = str1.length();
      if (m < i2)
      {
        i2 = str1.charAt(m);
        n = 48;
        if (i2 >= n)
        {
          i2 = str1.charAt(m);
          n = 57;
          if (i2 <= n) {
            break label418;
          }
        }
      }
      localObject1 = str1.substring(i, m);
      i = Integer.parseInt((String)localObject1);
      localObject2 = this.buf;
      ((b)localObject2).a(i);
      try
      {
        readTrailer(paramPDFPassword);
        return;
      }
      catch (UnsupportedEncryptionException localUnsupportedEncryptionException)
      {
        localObject2 = new com/sun/pdfview/PDFParseException;
        str1 = localUnsupportedEncryptionException.getMessage();
        ((PDFParseException)localObject2).<init>(str1, localUnsupportedEncryptionException);
        throw ((Throwable)localObject2);
      }
      i += 1;
      break;
      label418:
      m += 1;
    }
  }
  
  private void processVersion(String paramString)
  {
    try
    {
      Object localObject = new java/util/StringTokenizer;
      String str = ".";
      ((StringTokenizer)localObject).<init>(paramString, str);
      str = ((StringTokenizer)localObject).nextToken();
      int i = Integer.parseInt(str);
      this.majorVersion = i;
      localObject = ((StringTokenizer)localObject).nextToken();
      int j = Integer.parseInt((String)localObject);
      this.minorVersion = j;
      this.versionString = paramString;
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private PDFObject readArray(int paramInt1, int paramInt2, PDFDecrypter paramPDFDecrypter)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      localObject = readObject(paramInt1, paramInt2, paramPDFDecrypter);
      if (localObject == null)
      {
        localObject = this.buf;
        i = ((b)localObject).b();
        j = 93;
        if (i == j) {
          break;
        }
        localObject = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject).<init>("Array should end with ']'");
        throw ((Throwable)localObject);
      }
      localArrayList.add(localObject);
    }
    PDFObject[] arrayOfPDFObject = new PDFObject[localArrayList.size()];
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      i = arrayOfPDFObject.length;
      if (j >= i)
      {
        localObject = new com/sun/pdfview/PDFObject;
        ((PDFObject)localObject).<init>(this, 5, arrayOfPDFObject);
        return (PDFObject)localObject;
      }
      localObject = (PDFObject)localArrayList.get(j);
      arrayOfPDFObject[j] = localObject;
      i = j + 1;
    }
  }
  
  private PDFObject readDictionary(int paramInt1, int paramInt2, PDFDecrypter paramPDFDecrypter)
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    for (;;)
    {
      localObject2 = readObject(paramInt1, paramInt2, paramPDFDecrypter);
      if (localObject2 == null)
      {
        localObject2 = ">>";
        boolean bool = nextItemIs((String)localObject2);
        if (bool) {
          break;
        }
        localObject1 = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject1).<init>("End of dictionary wasn't '>>'");
        throw ((Throwable)localObject1);
      }
      int i = ((PDFObject)localObject2).getType();
      int j = 4;
      if (i != j)
      {
        localObject1 = new com/sun/pdfview/PDFParseException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("First item in dictionary must be a /Name.  (Was ");
        localObject2 = localObject2 + ")";
        ((PDFParseException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      Object localObject3 = readObject(paramInt1, paramInt2, paramPDFDecrypter);
      if (localObject3 != null)
      {
        localObject2 = ((PDFObject)localObject2).getStringValue();
        ((HashMap)localObject1).put(localObject2, localObject3);
      }
    }
    Object localObject2 = new com/sun/pdfview/PDFObject;
    ((PDFObject)localObject2).<init>(this, 6, localObject1);
    return (PDFObject)localObject2;
  }
  
  private int readHexDigit()
  {
    int i;
    boolean bool;
    do
    {
      b localb = this.buf;
      i = localb.b();
      bool = isWhiteSpace(i);
    } while (bool);
    switch (i)
    {
    default: 
      i = -1;
    }
    for (;;)
    {
      return i;
      i += -48;
      continue;
      i += -87;
      continue;
      i += -55;
    }
  }
  
  private int readHexPair()
  {
    int i = readHexDigit();
    b localb2;
    int j;
    if (i < 0)
    {
      b localb1 = this.buf;
      localb2 = this.buf;
      j = localb2.a() + -1;
      localb1.a(j);
      i = -1;
    }
    for (;;)
    {
      return i;
      j = readHexDigit();
      if (j < 0)
      {
        localb2 = this.buf;
        b localb3 = this.buf;
        int k = localb3.a() + -1;
        localb2.a(k);
        i <<= 4;
      }
      else
      {
        i = (i << 4) + j;
      }
    }
  }
  
  private PDFObject readHexString(int paramInt1, int paramInt2, PDFDecrypter paramPDFDecrypter)
  {
    Object localObject1 = new java/lang/StringBuffer;
    ((StringBuffer)localObject1).<init>();
    for (;;)
    {
      int i = readHexPair();
      if (i < 0)
      {
        localObject2 = this.buf;
        i = ((b)localObject2).b();
        int j = 62;
        if (i == j) {
          break;
        }
        localObject1 = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject1).<init>("Bad character in Hex String");
        throw ((Throwable)localObject1);
      }
      i = (char)i;
      ((StringBuffer)localObject1).append(i);
    }
    Object localObject2 = new com/sun/pdfview/PDFObject;
    localObject1 = ((StringBuffer)localObject1).toString();
    localObject1 = paramPDFDecrypter.decryptString(paramInt1, paramInt2, (String)localObject1);
    ((PDFObject)localObject2).<init>(this, 3, localObject1);
    return (PDFObject)localObject2;
  }
  
  private PDFObject readKeyword(char paramChar)
  {
    Object localObject1 = new java/lang/StringBuffer;
    Object localObject2 = String.valueOf(paramChar);
    ((StringBuffer)localObject1).<init>((String)localObject2);
    for (;;)
    {
      localObject2 = this.buf;
      int i = ((b)localObject2).b();
      boolean bool = isRegularCharacter(i);
      if (!bool)
      {
        localObject2 = this.buf;
        int j = this.buf.a() + -1;
        ((b)localObject2).a(j);
        localObject2 = new com/sun/pdfview/PDFObject;
        localObject1 = ((StringBuffer)localObject1).toString();
        ((PDFObject)localObject2).<init>(this, 9, localObject1);
        return (PDFObject)localObject2;
      }
      i = (char)i;
      ((StringBuffer)localObject1).append(i);
    }
  }
  
  private String readLine()
  {
    int i = 10;
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    for (;;)
    {
      b localb1 = this.buf;
      int j = localb1.c();
      if (j <= 0) {}
      do
      {
        for (;;)
        {
          return localStringBuffer.toString();
          localb1 = this.buf;
          j = (char)localb1.b();
          int k = 13;
          if (j != k) {
            break;
          }
          localb1 = this.buf;
          j = localb1.c();
          if (j > 0)
          {
            localb1 = this.buf;
            b localb2 = this.buf;
            int m = localb2.a();
            j = (char)localb1.b(m);
            if (j == i)
            {
              localb1 = this.buf;
              localb1.b();
            }
          }
        }
      } while (j == i);
      localStringBuffer.append(j);
    }
  }
  
  private PDFObject readLiteralString(int paramInt1, int paramInt2, PDFDecrypter paramPDFDecrypter)
  {
    int i = 13;
    int j = 3;
    int k = -1;
    int m = 10;
    int n = 1;
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    label32:
    label482:
    for (;;)
    {
      if (n <= 0)
      {
        PDFObject localPDFObject = new com/sun/pdfview/PDFObject;
        localObject = localStringBuffer.toString();
        localObject = paramPDFDecrypter.decryptString(paramInt1, paramInt2, (String)localObject);
        localPDFObject.<init>(this, j, localObject);
        return localPDFObject;
      }
      Object localObject = this.buf;
      int i1 = ((b)localObject).b() & 0xFF;
      int i3 = 40;
      if (i1 == i3) {
        n += 1;
      }
      for (;;)
      {
        if (i1 < 0) {
          break label482;
        }
        i1 = (char)i1;
        localStringBuffer.append(i1);
        break;
        int i4 = 41;
        if (i1 == i4)
        {
          n += -1;
          if (n != 0) {
            continue;
          }
          break label32;
        }
        int i5 = 92;
        if (i1 == i5)
        {
          localObject = this.buf;
          int i2 = ((b)localObject).b() & 0xFF;
          int i6 = 48;
          b localb1;
          if (i2 >= i6)
          {
            i6 = 56;
            if (i2 < i6)
            {
              i6 = 0;
              localb1 = null;
              int i7 = i2;
              i2 = 0;
              localObject = null;
              for (;;)
              {
                int i8 = 48;
                if (i7 >= i8)
                {
                  i8 = 56;
                  if ((i7 < i8) && (i6 < j)) {}
                }
                else
                {
                  localb1 = this.buf;
                  localb2 = this.buf;
                  i7 = localb2.a() + -1;
                  localb1.a(i7);
                  break;
                }
                i2 = i2 * 8 + i7 + -48;
                b localb2 = this.buf;
                i7 = localb2.b() & 0xFF;
                i6 += 1;
              }
            }
          }
          i6 = 110;
          if (i2 == i6)
          {
            i2 = m;
          }
          else
          {
            i6 = 114;
            if (i2 == i6)
            {
              i2 = i;
            }
            else
            {
              i6 = 116;
              if (i2 == i6)
              {
                i2 = 9;
              }
              else
              {
                i6 = 98;
                if (i2 == i6)
                {
                  i2 = 8;
                }
                else
                {
                  i6 = 102;
                  if (i2 == i6)
                  {
                    i2 = 12;
                  }
                  else if (i2 == i)
                  {
                    localObject = this.buf;
                    i2 = ((b)localObject).b() & 0xFF;
                    if (i2 != m)
                    {
                      localObject = this.buf;
                      localb1 = this.buf;
                      i6 = localb1.a() + -1;
                      ((b)localObject).a(i6);
                    }
                    i2 = k;
                  }
                  else if (i2 == m)
                  {
                    i2 = k;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private PDFObject readName()
  {
    int i = 1;
    Object localObject1 = new java/lang/StringBuffer;
    ((StringBuffer)localObject1).<init>();
    for (;;)
    {
      localObject2 = this.buf;
      int j = ((b)localObject2).b();
      boolean bool = isRegularCharacter(j);
      if (!bool) {}
      int m;
      do
      {
        localObject2 = this.buf;
        int k = this.buf.a() + -1;
        ((b)localObject2).a(k);
        localObject2 = new com/sun/pdfview/PDFObject;
        localObject1 = ((StringBuffer)localObject1).toString();
        ((PDFObject)localObject2).<init>(this, 4, localObject1);
        return (PDFObject)localObject2;
        k = 33;
        if (j >= k) {
          break;
        }
        m = 126;
      } while (j > m);
      int n = 35;
      if (j == n)
      {
        int i1 = this.majorVersion;
        if (i1 != i)
        {
          i1 = this.minorVersion;
          if (i1 != i)
          {
            j = readHexPair();
            if (j < 0) {
              break;
            }
          }
        }
      }
      j = (char)j;
      ((StringBuffer)localObject1).append(j);
    }
    Object localObject2 = new com/sun/pdfview/PDFParseException;
    ((PDFParseException)localObject2).<init>("Bad #hex in /Name");
    throw ((Throwable)localObject2);
  }
  
  private int readNum(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    for (;;)
    {
      if (i >= paramInt2) {
        return j;
      }
      j <<= 8;
      int k = paramInt1 + i;
      k = paramArrayOfByte[k] & 0xFF;
      j += k;
      i += 1;
    }
  }
  
  private PDFObject readNumber(char paramChar)
  {
    char c1 = '0';
    char c2 = '.';
    int i = 1;
    int j = 0;
    PDFParseException localPDFParseException = null;
    double d1 = 0.1D;
    char c3 = '-';
    int k;
    int m;
    label43:
    double d2;
    label52:
    double d3;
    if (paramChar == c3)
    {
      k = i;
      if (paramChar != c2) {
        break label124;
      }
      m = i;
      if (m == 0) {
        break label130;
      }
      d2 = d1;
      if (paramChar >= c1)
      {
        c3 = '9';
        if (paramChar <= c3) {
          j = paramChar + '￐';
        }
      }
      d3 = j;
    }
    for (;;)
    {
      b localb1 = this.buf;
      char c4 = localb1.b();
      if (c4 == c2)
      {
        if (m != 0)
        {
          localPDFParseException = new com/sun/pdfview/PDFParseException;
          localPDFParseException.<init>("Can't have two '.' in a number");
          throw localPDFParseException;
          k = 0;
          break;
          label124:
          m = 0;
          break label43;
          label130:
          d2 = 1.0D;
          break label52;
        }
        d2 = d1;
        m = i;
        continue;
      }
      if (c4 < c1) {
        break label226;
      }
      char c5 = '9';
      if (c4 > c5) {
        break label226;
      }
      c4 += '￐';
      double d4;
      if (m != 0)
      {
        d4 = c4 * d2;
        d3 += d4;
        d2 *= d1;
      }
      else
      {
        d3 *= 10.0D;
        d4 = c4;
        d3 += d4;
      }
    }
    label226:
    Object localObject = this.buf;
    b localb2 = this.buf;
    int n = localb2.a() + -1;
    ((b)localObject).a(n);
    if (k != 0) {
      d3 = -d3;
    }
    localObject = new com/sun/pdfview/PDFObject;
    Double localDouble = new java/lang/Double;
    localDouble.<init>(d3);
    ((PDFObject)localObject).<init>(this, 2, localDouble);
    return (PDFObject)localObject;
  }
  
  private PDFObject readObject(int paramInt1, int paramInt2, PDFDecrypter paramPDFDecrypter)
  {
    return readObject(paramInt1, paramInt2, false, paramPDFDecrypter);
  }
  
  private PDFObject readObject(int paramInt1, int paramInt2, boolean paramBoolean, PDFDecrypter paramPDFDecrypter)
  {
    int i = 60;
    int j = 9;
    boolean bool1 = true;
    int k = -1;
    int m = 0;
    Object localObject1 = null;
    if (localObject1 != null) {}
    for (;;)
    {
      return (PDFObject)localObject1;
      boolean bool2;
      do
      {
        localObject2 = this.buf;
        i1 = ((b)localObject2).b();
        bool2 = isWhiteSpace(i1);
      } while (bool2);
      if (i1 == i)
      {
        localObject1 = this.buf;
        m = ((b)localObject1).b();
        if (m == i)
        {
          localObject1 = readDictionary(paramInt1, paramInt2, paramPDFDecrypter);
          break;
        }
        localObject1 = this.buf;
        localObject2 = this.buf;
        i1 = ((b)localObject2).a() + -1;
        ((b)localObject1).a(i1);
        localObject1 = readHexString(paramInt1, paramInt2, paramPDFDecrypter);
        break;
      }
      int i2 = 40;
      if (i1 == i2)
      {
        localObject1 = readLiteralString(paramInt1, paramInt2, paramPDFDecrypter);
        break;
      }
      i2 = 91;
      if (i1 == i2)
      {
        localObject1 = readArray(paramInt1, paramInt2, paramPDFDecrypter);
        break;
      }
      i2 = 47;
      if (i1 == i2)
      {
        localObject1 = readName();
        break;
      }
      i2 = 37;
      if (i1 == i2)
      {
        readLine();
        break;
      }
      i2 = 48;
      if (i1 >= i2)
      {
        i2 = 57;
        if (i1 <= i2) {}
      }
      else
      {
        i2 = 45;
        if (i1 != i2)
        {
          i2 = 43;
          if (i1 != i2)
          {
            i2 = 46;
            if (i1 != i2) {
              break label551;
            }
          }
        }
      }
      m = (char)i1;
      localObject1 = readNumber(m);
      if (paramBoolean) {
        break;
      }
      Object localObject2 = this.buf;
      int i1 = ((b)localObject2).a();
      Object localObject3 = readObject(k, k, bool1, paramPDFDecrypter);
      if (localObject3 != null)
      {
        int i3 = ((PDFObject)localObject3).getType();
        int i4 = 2;
        if (i3 == i4)
        {
          Object localObject4 = readObject(k, k, bool1, paramPDFDecrypter);
          String str1;
          if (localObject4 != null)
          {
            i4 = ((PDFObject)localObject4).getType();
            if (i4 == j)
            {
              str1 = ((PDFObject)localObject4).getStringValue();
              String str2 = "R";
              boolean bool4 = str1.equals(str2);
              if (bool4)
              {
                localObject2 = new com/sun/pdfview/PDFXref;
                n = ((PDFObject)localObject1).getIntValue();
                i2 = ((PDFObject)localObject3).getIntValue();
                ((PDFXref)localObject2).<init>(n, i2);
                localObject1 = new com/sun/pdfview/PDFObject;
                ((PDFObject)localObject1).<init>(this, (PDFXref)localObject2);
                break;
              }
            }
          }
          if (localObject4 != null)
          {
            int i5 = ((PDFObject)localObject4).getType();
            if (i5 == j)
            {
              localObject4 = ((PDFObject)localObject4).getStringValue();
              str1 = "obj";
              boolean bool3 = ((String)localObject4).equals(str1);
              if (bool3)
              {
                n = ((PDFObject)localObject1).getIntValue();
                i1 = ((PDFObject)localObject3).getIntValue();
                localObject1 = readObjectDescription(n, i1, paramPDFDecrypter);
                break;
              }
            }
          }
          localObject3 = this.buf;
          ((b)localObject3).a(i1);
          break;
        }
      }
      localObject3 = this.buf;
      ((b)localObject3).a(i1);
      break;
      label551:
      i2 = 97;
      if (i1 >= i2)
      {
        i2 = 122;
        if (i1 <= i2) {}
      }
      else
      {
        i2 = 65;
        if (i1 < i2) {
          break label611;
        }
        i2 = 90;
        if (i1 > i2) {
          break label611;
        }
      }
      int n = (char)i1;
      localObject1 = readKeyword(n);
      break;
      label611:
      localObject2 = this.buf;
      localObject3 = this.buf;
      i2 = ((b)localObject3).a() + -1;
      ((b)localObject2).a(i2);
    }
  }
  
  private PDFObject readObjectDescription(int paramInt1, int paramInt2, PDFDecrypter paramPDFDecrypter)
  {
    int i = this.buf.a();
    long l = i;
    PDFObject localPDFObject = readObject(paramInt1, paramInt2, paramPDFDecrypter);
    Object localObject1 = readObject(paramInt1, paramInt2, paramPDFDecrypter);
    int j = ((PDFObject)localObject1).getType();
    int k = 9;
    if (j != k)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("Expected 'stream' or 'endobj'");
      throw ((Throwable)localObject1);
    }
    j = localPDFObject.getType();
    k = 6;
    Object localObject2;
    String str1;
    if (j == k)
    {
      localObject2 = ((PDFObject)localObject1).getStringValue();
      str1 = "stream";
      boolean bool2 = ((String)localObject2).equals(str1);
      if (bool2)
      {
        readLine();
        localObject1 = readStream(localPDFObject);
        if (localObject1 == null)
        {
          i = 0;
          localObject1 = b.g(0);
        }
        localPDFObject.setStream((b)localObject1);
        localObject1 = readObject(paramInt1, paramInt2, paramPDFDecrypter);
      }
    }
    localObject1 = ((PDFObject)localObject1).getStringValue();
    if (localObject1 != null)
    {
      localObject2 = "endobj";
      boolean bool1 = ((String)localObject1).equals(localObject2);
      if (bool1) {}
    }
    else
    {
      localObject1 = System.out;
      localObject2 = new java/lang/StringBuilder;
      str1 = "WARNING: object at ";
      ((StringBuilder)localObject2).<init>(str1);
      Object localObject3 = ((StringBuilder)localObject2).append(l);
      String str2 = " didn't end with 'endobj'";
      localObject3 = str2;
      ((PrintStream)localObject1).println((String)localObject3);
    }
    localPDFObject.setObjectId(paramInt1, paramInt2);
    return localPDFObject;
  }
  
  private b readStream(PDFObject paramPDFObject)
  {
    Object localObject1 = "Length";
    Object localObject2 = paramPDFObject.getDictRef((String)localObject1);
    int i = -1;
    if (localObject2 != null) {
      i = ((PDFObject)localObject2).getIntValue();
    }
    if (i < 0)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("Unknown length for stream");
      throw ((Throwable)localObject1);
    }
    localObject2 = this.buf;
    int j = ((b)localObject2).a();
    Object localObject3 = this.buf.d();
    ((b)localObject3).d(i);
    b localb = this.buf;
    int k = this.buf.a() + i;
    localb.a(k);
    localb = this.buf;
    int m = localb.a();
    Object localObject4 = "endstream";
    boolean bool = nextItemIs((String)localObject4);
    if (!bool)
    {
      localObject3 = System.out;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>("read ");
      localObject1 = i + " chars from " + j + " to " + m;
      ((PrintStream)localObject3).println((String)localObject1);
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("Stream ended inappropriately");
      throw ((Throwable)localObject1);
    }
    return (b)localObject3;
  }
  
  private void readTrailer(PDFPassword paramPDFPassword)
  {
    boolean bool1 = false;
    PDFObject localPDFObject = null;
    int j = 2;
    int k = 1;
    int m = -1;
    Object localObject1 = new PDFXref[50];
    this.objIdx = ((PDFXref[])localObject1);
    int n = this.buf.a();
    localObject1 = null;
    Object localObject2;
    int i1;
    Object localObject5;
    for (;;)
    {
      localObject2 = "xref";
      boolean bool2 = nextItemIs((String)localObject2);
      if (!bool2)
      {
        localObject1 = this.buf;
        ((b)localObject1).a(n);
        readTrailer15(paramPDFPassword);
        return;
      }
      int i2;
      int i7;
      Object localObject6;
      do
      {
        i2 = ((PDFObject)localObject2).getIntValue();
        readLine();
        i1 = i3 + i2;
        localObject3 = this.objIdx;
        i6 = localObject3.length;
        if (i1 >= i6)
        {
          i1 = i3 + i2;
          localObject2 = new PDFXref[i1];
          localObject3 = this.objIdx;
          localObject4 = this.objIdx;
          i7 = localObject4.length;
          System.arraycopy(localObject3, 0, localObject2, 0, i7);
          this.objIdx = ((PDFXref[])localObject2);
        }
        i1 = i3;
        i6 = i3 + i2;
        if (i1 < i6) {
          break;
        }
        localObject2 = IdentityDecrypter.getInstance();
        localObject2 = readObject(m, m, (PDFDecrypter)localObject2);
        int i3 = ((PDFObject)localObject2).getType();
        i2 = 9;
        if (i3 == i2)
        {
          localObject5 = ((PDFObject)localObject2).getStringValue();
          localObject6 = "trailer";
          boolean bool3 = ((String)localObject5).equals(localObject6);
          if (bool3)
          {
            localObject2 = IdentityDecrypter.getInstance();
            localObject2 = readObject(m, m, (PDFDecrypter)localObject2);
            i4 = ((PDFObject)localObject2).getType();
            i2 = 6;
            if (i4 == i2) {
              break label489;
            }
            localObject1 = new java/io/IOException;
            ((IOException)localObject1).<init>("Expected dictionary after \"trailer\"");
            throw ((Throwable)localObject1);
          }
        }
        int i4 = ((PDFObject)localObject2).getType();
        if (i4 != j)
        {
          localObject1 = new com/sun/pdfview/PDFParseException;
          ((PDFParseException)localObject1).<init>("Expected number for first xref entry");
          throw ((Throwable)localObject1);
        }
        i4 = ((PDFObject)localObject2).getIntValue();
        localObject2 = IdentityDecrypter.getInstance();
        localObject2 = readObject(m, m, (PDFDecrypter)localObject2);
        i2 = ((PDFObject)localObject2).getType();
      } while (i2 == j);
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("Expected number for length of xref table");
      throw ((Throwable)localObject1);
      int i6 = 20;
      Object localObject3 = new byte[i6];
      this.buf.a((byte[])localObject3);
      Object localObject4 = this.objIdx[i1];
      if (localObject4 != null) {}
      for (;;)
      {
        i1 += 1;
        break;
        i7 = localObject3[17];
        int i8 = 110;
        if (i7 == i8)
        {
          localObject4 = this.objIdx;
          PDFXref localPDFXref = new com/sun/pdfview/PDFXref;
          localPDFXref.<init>((byte[])localObject3);
          localObject4[i1] = localPDFXref;
        }
        else
        {
          localObject3 = this.objIdx;
          localObject4 = new com/sun/pdfview/PDFXref;
          ((PDFXref)localObject4).<init>(null);
          localObject3[i1] = localObject4;
        }
      }
      label489:
      localObject5 = this.root;
      if (localObject5 == null)
      {
        localObject5 = ((PDFObject)localObject2).getDictRef("Root");
        this.root = ((PDFObject)localObject5);
        localObject5 = this.root;
        if (localObject5 != null)
        {
          localObject5 = this.root;
          ((PDFObject)localObject5).setObjectId(m, m);
        }
      }
      localObject5 = this.encrypt;
      if (localObject5 == null)
      {
        localObject1 = ((PDFObject)localObject2).getDictRef("Encrypt");
        this.encrypt = ((PDFObject)localObject1);
        localObject1 = this.encrypt;
        if (localObject1 != null)
        {
          localObject1 = this.encrypt;
          ((PDFObject)localObject1).setObjectId(m, m);
        }
        localObject1 = this.encrypt;
        localObject5 = ((PDFObject)localObject2).getDictRef("ID");
        localObject1 = PDFDecrypterFactory.createDecryptor((PDFObject)localObject1, (PDFObject)localObject5, paramPDFPassword);
      }
      localObject5 = this.info;
      if (localObject5 == null)
      {
        localObject5 = ((PDFObject)localObject2).getDictRef("Info");
        this.info = ((PDFObject)localObject5);
        localObject5 = this.info;
        if (localObject5 != null)
        {
          localObject5 = this.info;
          boolean bool4 = ((PDFObject)localObject5).isIndirect();
          if (!bool4)
          {
            localObject1 = new com/sun/pdfview/PDFParseException;
            ((PDFParseException)localObject1).<init>("Info in trailer must be an indirect reference");
            throw ((Throwable)localObject1);
          }
          localObject5 = this.info;
          ((PDFObject)localObject5).setObjectId(m, m);
        }
      }
      localObject5 = ((PDFObject)localObject2).getDictRef("XRefStm");
      if (localObject5 != null)
      {
        localObject6 = System.out;
        localObject3 = new java/lang/StringBuilder;
        localObject4 = "XRefStm:";
        ((StringBuilder)localObject3).<init>((String)localObject4);
        i7 = ((PDFObject)localObject5).getIntValue();
        localObject3 = i7;
        ((PrintStream)localObject6).println((String)localObject3);
        localObject6 = this.buf;
        i2 = ((b)localObject6).a();
        localObject3 = this.buf;
        int i5 = ((PDFObject)localObject5).getIntValue();
        ((b)localObject3).a(i5);
        readTrailer15(paramPDFPassword);
        localObject5 = this.buf;
        ((b)localObject5).a(i2);
      }
      localObject5 = "Prev";
      localObject2 = ((PDFObject)localObject2).getDictRef((String)localObject5);
      if (localObject2 == null) {
        break;
      }
      localObject5 = this.buf;
      i1 = ((PDFObject)localObject2).getIntValue();
      ((b)localObject5).a(i1);
      localObject2 = this.root;
      localObject5 = "Version";
      localObject2 = ((PDFObject)localObject2).getDictRef((String)localObject5);
      if (localObject2 != null)
      {
        localObject2 = this.root;
        localObject5 = "Version";
        localObject2 = ((PDFObject)localObject2).getDictRef((String)localObject5).getStringValue();
        processVersion((String)localObject2);
      }
    }
    localPDFObject = this.root;
    if (localPDFObject == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("No /Root key found in trailer dictionary");
      throw ((Throwable)localObject1);
    }
    localPDFObject = this.encrypt;
    int i;
    if (localPDFObject != null)
    {
      localPDFObject = this.encrypt;
      localObject2 = "P";
      localObject5 = localPDFObject.getDictRef((String)localObject2);
      if (localObject5 != null)
      {
        bool1 = ((PDFDecrypter)localObject1).isOwnerAuthorised();
        if (!bool1)
        {
          if (localObject5 == null) {
            break label1060;
          }
          i = ((PDFObject)localObject5).getIntValue();
          i1 = i;
          label1001:
          if (localObject5 != null)
          {
            i = i1 & 0x4;
            if (i == 0) {
              break label1069;
            }
            i = k;
            label1018:
            this.printable = i;
            i = i1 & 0x10;
            if (i == 0) {
              break label1076;
            }
          }
        }
      }
    }
    for (;;)
    {
      this.saveable = k;
      this.defaultDecrypter = ((PDFDecrypter)localObject1);
      localObject1 = this.root;
      ((PDFObject)localObject1).dereference();
      break;
      label1060:
      i1 = 0;
      localObject2 = null;
      break label1001;
      label1069:
      i = 0;
      localPDFObject = null;
      break label1018;
      label1076:
      k = 0;
    }
  }
  
  private void readTrailer15(PDFPassword paramPDFPassword)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2;
    int n;
    Object localObject5;
    for (;;)
    {
      localObject2 = IdentityDecrypter.getInstance();
      localObject3 = this;
      PDFObject localPDFObject = readObject(-1, -1, (PDFDecrypter)localObject2);
      localObject4 = ((PDFObject)localPDFObject.getDictionary().get("W")).getArray();
      int j = localObject4[0].getIntValue();
      int k = localObject4[1].getIntValue();
      int m = localObject4[2].getIntValue();
      n = j + k + m;
      localObject4 = localPDFObject.getDictionary();
      localObject2 = "Size";
      int i1 = ((PDFObject)((HashMap)localObject4).get(localObject2)).getIntValue();
      byte[] arrayOfByte = localPDFObject.getStream();
      int i2 = arrayOfByte.length / n;
      int i6 = 0;
      PDFXref[] arrayOfPDFXref = null;
      localObject4 = localPDFObject.getDictionary();
      localObject5 = "Index";
      localObject4 = (PDFObject)((HashMap)localObject4).get(localObject5);
      int i7;
      if (localObject4 == null)
      {
        i2 = 2;
        localObject4 = new int[i2];
        n = 1;
        localObject4[n] = i1;
        i7 = localObject4.length;
        i1 = 0;
        localObject2 = null;
        n = 0;
        localObject5 = null;
      }
      Object localObject7;
      int i11;
      PDFXref localPDFXref;
      int i15;
      for (;;)
      {
        if (i1 >= i7)
        {
          localObject5 = localPDFObject.getDictionary();
          localObject3 = this;
          localObject4 = this.root;
          if (localObject4 == null)
          {
            localObject4 = (PDFObject)((HashMap)localObject5).get("Root");
            this.root = ((PDFObject)localObject4);
            localObject4 = this.root;
            if (localObject4 != null)
            {
              localObject4 = this.root;
              i1 = -1;
              i6 = -1;
              ((PDFObject)localObject4).setObjectId(i1, i6);
            }
          }
          localObject3 = this;
          localObject4 = this.encrypt;
          if (localObject4 == null)
          {
            localObject4 = (PDFObject)((HashMap)localObject5).get("Encrypt");
            this.encrypt = ((PDFObject)localObject4);
            localObject4 = this.encrypt;
            if (localObject4 != null)
            {
              localObject4 = this.encrypt;
              i = -1;
              i1 = -1;
              ((PDFObject)localObject4).setObjectId(i, i1);
            }
            localObject3 = this;
            localObject1 = this.encrypt;
            localObject4 = (PDFObject)((HashMap)localObject5).get("ID");
            localObject3 = paramPDFPassword;
            localObject4 = PDFDecrypterFactory.createDecryptor((PDFObject)localObject1, (PDFObject)localObject4, paramPDFPassword);
            localObject1 = localObject4;
          }
          localObject3 = this;
          localObject4 = this.info;
          if (localObject4 != null) {
            break label940;
          }
          localObject4 = (PDFObject)((HashMap)localObject5).get("Info");
          this.info = ((PDFObject)localObject4);
          localObject4 = this.info;
          if (localObject4 == null) {
            break label940;
          }
          localObject4 = this.info;
          int i3 = ((PDFObject)localObject4).isIndirect();
          if (i3 != 0) {
            break label919;
          }
          localObject4 = new com/sun/pdfview/PDFParseException;
          ((PDFParseException)localObject4).<init>("Info in trailer must be an indirect reference");
          throw ((Throwable)localObject4);
          localObject2 = ((PDFObject)localObject4).getArray();
          localObject5 = new int[localObject2.length];
          i3 = 0;
          localObject4 = null;
          for (;;)
          {
            int i8 = localObject2.length;
            if (i3 >= i8)
            {
              localObject4 = localObject5;
              break;
            }
            Object localObject6 = localObject2[i3];
            i9 = ((PDFObject)localObject6).getIntValue();
            localObject5[i3] = i9;
            i3 += 1;
          }
        }
        i6 = i1 + 1;
        i1 = localObject4[i1];
        int i9 = i6 + 1;
        int i10 = localObject4[i6];
        i6 = i1 + i10;
        localObject3 = this;
        localObject3 = this.objIdx;
        localObject7 = localObject3;
        i11 = localObject3.length;
        i12 = i11;
        if (i6 >= i11)
        {
          i6 = i1 + i10;
          arrayOfPDFXref = new PDFXref[i6];
          localObject3 = this;
          localObject7 = this.objIdx;
          i13 = 0;
          localPDFXref = null;
          i14 = 0;
          localObject3 = this;
          localObject3 = this.objIdx;
          localObject8 = localObject3;
          i11 = localObject3.length;
          i15 = i11;
          localObject3 = localObject7;
          System.arraycopy(localObject7, 0, arrayOfPDFXref, 0, i11);
          localObject3 = this;
          this.objIdx = arrayOfPDFXref;
        }
        i6 = n;
        n = i1;
        i12 = i1 + i10;
        i11 = i12;
        if (n < i12) {
          break label693;
        }
        i1 = i9;
        n = i6;
      }
      label693:
      localObject3 = this;
      int i12 = readNum(arrayOfByte, i6, j);
      i6 += j;
      int i13 = readNum(arrayOfByte, i6, k);
      i6 += k;
      int i14 = readNum(arrayOfByte, i6, m);
      i6 += m;
      localObject3 = this.objIdx;
      Object localObject8 = localObject3;
      localObject8 = localObject3[n];
      if (localObject8 != null) {}
      for (;;)
      {
        n += 1;
        break;
        if (i12 == 0)
        {
          localObject3 = this;
          localObject3 = this.objIdx;
          localObject7 = localObject3;
          localPDFXref = new com/sun/pdfview/PDFXref;
          i14 = 0;
          localPDFXref.<init>(null);
          localObject3[n] = localPDFXref;
        }
        else
        {
          i15 = 1;
          i11 = i12;
          if (i12 == i15)
          {
            localObject3 = this;
            localObject7 = this.objIdx;
            localObject8 = new com/sun/pdfview/PDFXref;
            localObject3 = localObject8;
            ((PDFXref)localObject8).<init>(i13, i14);
            localObject7[n] = localObject8;
          }
          else
          {
            localObject3 = this;
            localObject7 = this.objIdx;
            localObject8 = new com/sun/pdfview/PDFXref;
            boolean bool2 = true;
            localObject3 = localObject8;
            ((PDFXref)localObject8).<init>(i13, i14, bool2);
            localObject7[n] = localObject8;
          }
        }
      }
      label919:
      localObject4 = this.info;
      i1 = -1;
      i6 = -1;
      ((PDFObject)localObject4).setObjectId(i1, i6);
      label940:
      localObject4 = (PDFObject)((HashMap)localObject5).get("Prev");
      if (localObject4 == null) {
        break;
      }
      localObject3 = this;
      localObject5 = this.buf;
      int i4 = ((PDFObject)localObject4).getIntValue();
      ((b)localObject5).a(i4);
      localObject4 = this.root;
      localObject5 = "Version";
      localObject4 = ((PDFObject)localObject4).getDictRef((String)localObject5);
      if (localObject4 != null)
      {
        localObject4 = this.root;
        localObject5 = "Version";
        localObject4 = ((PDFObject)localObject4).getDictRef((String)localObject5).getStringValue();
        processVersion((String)localObject4);
      }
    }
    Object localObject3 = this;
    Object localObject4 = this.root;
    if (localObject4 == null)
    {
      localObject4 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject4).<init>("No /Root key found in trailer dictionary");
      throw ((Throwable)localObject4);
    }
    localObject4 = this.encrypt;
    int i5;
    if (localObject4 != null)
    {
      localObject4 = this.encrypt;
      localObject5 = "P";
      localObject2 = ((PDFObject)localObject4).getDictRef((String)localObject5);
      if (localObject2 != null)
      {
        boolean bool1 = ((PDFDecrypter)localObject1).isOwnerAuthorised();
        if (!bool1)
        {
          if (localObject2 == null) {
            break label1205;
          }
          i5 = ((PDFObject)localObject2).getIntValue();
          n = i5;
          if (localObject2 != null)
          {
            i5 = n & 0x4;
            if (i5 == 0) {
              break label1220;
            }
            i5 = 1;
            label1152:
            localObject3 = this;
            this.printable = i5;
            i5 = n & 0x10;
            if (i5 == 0) {
              break label1229;
            }
            i5 = 1;
          }
        }
      }
    }
    for (;;)
    {
      localObject3 = this;
      this.saveable = i5;
      localObject3 = this;
      this.defaultDecrypter = ((PDFDecrypter)localObject1);
      localObject3 = this;
      this.root.dereference();
      return;
      label1205:
      i5 = 0;
      localObject4 = null;
      n = 0;
      localObject5 = null;
      break;
      label1220:
      i5 = 0;
      localObject4 = null;
      break label1152;
      label1229:
      i5 = 0;
      localObject4 = null;
    }
  }
  
  public PDFObject dereference(PDFXref paramPDFXref, PDFDecrypter paramPDFDecrypter)
  {
    int i = 0;
    Object localObject1 = null;
    for (;;)
    {
      int j;
      try
      {
        j = paramPDFXref.getID();
        Object localObject2 = this.objIdx;
        int k = localObject2.length;
        if (j < k)
        {
          localObject2 = this.objIdx;
          localObject2 = localObject2[j];
          if (localObject2 != null) {}
        }
        else
        {
          localObject2 = PDFObject.nullObj;
          return (PDFObject)localObject2;
        }
        localObject2 = this.objIdx;
        localObject2 = localObject2[j];
        localObject2 = ((PDFXref)localObject2).getObject();
        if (localObject2 != null) {
          continue;
        }
        localObject2 = this.buf;
        int n = ((b)localObject2).a();
        localObject2 = this.objIdx;
        localObject2 = localObject2[j];
        boolean bool1 = ((PDFXref)localObject2).getCompressed();
        if (!bool1)
        {
          localObject2 = this.objIdx;
          localObject2 = localObject2[j];
          m = ((PDFXref)localObject2).getFilePos();
          if (m < 0)
          {
            localObject2 = PDFObject.nullObj;
            continue;
          }
          localObject1 = this.buf;
          ((b)localObject1).a(m);
          m = paramPDFXref.getID();
          i = paramPDFXref.getGeneration();
          localObject2 = readObject(m, i, paramPDFDecrypter);
          if (localObject2 == null) {
            localObject2 = PDFObject.nullObj;
          }
          localObject1 = this.objIdx;
          localObject1 = localObject1[j];
          ((PDFXref)localObject1).setObject((PDFObject)localObject2);
          localObject1 = this.buf;
          ((b)localObject1).a(n);
          continue;
        }
        localObject4 = this.objIdx;
      }
      finally {}
      Object localObject4 = localObject4[j];
      int m = ((PDFXref)localObject4).getID();
      Object localObject5 = this.objIdx;
      localObject5 = localObject5[j];
      int i1 = ((PDFXref)localObject5).getIndex();
      if (i1 < 0)
      {
        localObject4 = PDFObject.nullObj;
      }
      else
      {
        Object localObject6 = new com/sun/pdfview/PDFXref;
        int i3 = 0;
        String str = null;
        ((PDFXref)localObject6).<init>(m, 0);
        localObject6 = dereference((PDFXref)localObject6, paramPDFDecrypter);
        localObject4 = ((PDFObject)localObject6).getDictionary();
        str = "First";
        localObject4 = ((HashMap)localObject4).get(str);
        localObject4 = (PDFObject)localObject4;
        i3 = ((PDFObject)localObject4).getIntValue();
        localObject4 = ((PDFObject)localObject6).getDictionary();
        Object localObject7 = "Length";
        localObject4 = ((HashMap)localObject4).get(localObject7);
        localObject4 = (PDFObject)localObject4;
        ((PDFObject)localObject4).getIntValue();
        localObject4 = ((PDFObject)localObject6).getDictionary();
        localObject7 = "N";
        localObject4 = ((HashMap)localObject4).get(localObject7);
        localObject4 = (PDFObject)localObject4;
        m = ((PDFObject)localObject4).getIntValue();
        if (i1 >= m)
        {
          localObject4 = PDFObject.nullObj;
        }
        else
        {
          localObject4 = ((PDFObject)localObject6).getStreamBuffer();
          localObject6 = this.buf;
          this.buf = ((b)localObject4);
          m = 0;
          localObject4 = null;
          for (;;)
          {
            if (m >= i1)
            {
              m = -1;
              i = -1;
              i1 = 1;
              localObject7 = IdentityDecrypter.getInstance();
              localObject4 = readObject(m, i, i1, (PDFDecrypter)localObject7);
              i = -1;
              int i2 = -1;
              boolean bool2 = true;
              IdentityDecrypter localIdentityDecrypter1 = IdentityDecrypter.getInstance();
              localObject1 = readObject(i, i2, bool2, localIdentityDecrypter1);
              m = ((PDFObject)localObject4).getIntValue();
              i = ((PDFObject)localObject1).getIntValue();
              if (m == j) {
                break label613;
              }
              localObject4 = PDFObject.nullObj;
              break;
            }
            i = -1;
            int i4 = -1;
            boolean bool3 = true;
            IdentityDecrypter localIdentityDecrypter2 = IdentityDecrypter.getInstance();
            readObject(i, i4, bool3, localIdentityDecrypter2);
            i = -1;
            i4 = -1;
            bool3 = true;
            localIdentityDecrypter2 = IdentityDecrypter.getInstance();
            readObject(i, i4, bool3, localIdentityDecrypter2);
            m += 1;
          }
          label613:
          localObject5 = this.buf;
          i += i3;
          ((b)localObject5).a(i);
          i = 0;
          localObject1 = null;
          localObject5 = IdentityDecrypter.getInstance();
          localObject4 = readObject(m, 0, (PDFDecrypter)localObject5);
          this.buf = ((b)localObject6);
        }
      }
    }
  }
  
  public PDFDecrypter getDefaultDecrypter()
  {
    return this.defaultDecrypter;
  }
  
  public int getMajorVersion()
  {
    return this.majorVersion;
  }
  
  public Iterator getMetadataKeys()
  {
    Object localObject = this.info;
    if (localObject != null) {}
    for (localObject = this.info.getDictKeys();; localObject = Collections.emptyList().iterator()) {
      return (Iterator)localObject;
    }
  }
  
  public int getMinorVersion()
  {
    return this.minorVersion;
  }
  
  public int getNumPages()
  {
    try
    {
      localPDFObject = this.root;
      String str = "Pages";
      localPDFObject = localPDFObject.getDictRef(str);
      str = "Count";
      localPDFObject = localPDFObject.getDictRef(str);
      i = localPDFObject.getIntValue();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        int i = 0;
        PDFObject localPDFObject = null;
      }
    }
    return i;
  }
  
  public OutlineNode getOutline()
  {
    Object localObject1 = this.root;
    Object localObject3 = "Outlines";
    localObject1 = ((PDFObject)localObject1).getDictRef((String)localObject3);
    OutlineNode localOutlineNode;
    Object localObject4;
    if (localObject1 != null)
    {
      localObject3 = ((PDFObject)localObject1).getDictRef("First");
      localOutlineNode = new com/sun/pdfview/OutlineNode;
      localObject1 = "<top>";
      localOutlineNode.<init>((String)localObject1);
      localObject4 = localOutlineNode;
      if (localObject3 != null) {}
    }
    Object localObject2;
    for (localObject1 = localOutlineNode;; localObject2 = null)
    {
      return (OutlineNode)localObject1;
      localObject1 = ((PDFObject)localObject3).getDictRef("Title").getTextStringValue();
      Object localObject5 = new com/sun/pdfview/OutlineNode;
      ((OutlineNode)localObject5).<init>((String)localObject1);
      ((OutlineNode)localObject4).add((a)localObject5);
      localObject1 = ((PDFObject)localObject3).getDictRef("A");
      Object localObject6;
      if (localObject1 != null)
      {
        localObject6 = getRoot();
        localObject1 = PDFAction.getAction((PDFObject)localObject1, (PDFObject)localObject6);
      }
      for (;;)
      {
        if (localObject1 != null) {
          ((OutlineNode)localObject5).setAction((PDFAction)localObject1);
        }
        localObject1 = ((PDFObject)localObject3).getDictRef("First");
        if (localObject1 != null)
        {
          localObject3 = localObject1;
          localObject4 = localObject5;
          break;
          localObject1 = ((PDFObject)localObject3).getDictRef("Dest");
          if (localObject1 == null) {
            break label256;
          }
          try
          {
            localObject6 = getRoot();
            localObject6 = PDFDestination.getDestination((PDFObject)localObject1, (PDFObject)localObject6);
            localObject1 = new com/sun/pdfview/action/GoToAction;
            ((GoToAction)localObject1).<init>((PDFDestination)localObject6);
          }
          catch (IOException localIOException)
          {
            localObject2 = null;
          }
          continue;
        }
        localObject2 = ((PDFObject)localObject3).getDictRef("Next");
        for (;;)
        {
          if (localObject2 != null) {
            localObject3 = localObject4;
          }
          for (;;)
          {
            localObject4 = localObject3;
            localObject3 = localObject2;
            break;
            localObject5 = ((PDFObject)localObject3).getDictRef("Parent");
            localObject3 = ((PDFObject)localObject5).getDictRef("Next");
            localObject2 = (OutlineNode)((OutlineNode)localObject4).getParent();
            if (localObject2 != null) {
              break label245;
            }
            Object localObject7 = localObject3;
            localObject3 = localObject2;
            localObject2 = localObject7;
          }
          label245:
          localObject4 = localObject2;
          localObject2 = localObject3;
          localObject3 = localObject5;
        }
        label256:
        localObject2 = null;
      }
    }
  }
  
  public PDFPage getPage(int paramInt)
  {
    return getPage(paramInt, false);
  }
  
  public PDFPage getPage(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = null;
    Object localObject2 = new java/lang/Integer;
    ((Integer)localObject2).<init>(paramInt);
    Object localObject3 = this.cache.getPage((Integer)localObject2);
    Object localObject4 = this.cache.getPageParser((Integer)localObject2);
    if (localObject3 == null) {}
    for (;;)
    {
      try
      {
        localObject5 = new java/util/HashMap;
        ((HashMap)localObject5).<init>();
        localObject4 = this.root;
        localObject3 = "Pages";
        localObject4 = ((PDFObject)localObject4).getDictRef((String)localObject3);
        bool = false;
        localObject3 = null;
        localObject4 = findPage((PDFObject)localObject4, 0, paramInt, (Map)localObject5);
        if (localObject4 != null) {
          continue;
        }
      }
      catch (IOException localIOException)
      {
        Object localObject5;
        boolean bool;
        byte[] arrayOfByte;
        localObject3 = System.out;
        localObject2 = "GetPage inner loop:";
        ((PrintStream)localObject3).println((String)localObject2);
        localIOException.printStackTrace();
        continue;
      }
      return (PDFPage)localObject1;
      localObject3 = createPage(paramInt, (PDFObject)localObject4);
      arrayOfByte = getContents((PDFObject)localObject4);
      localObject4 = new com/sun/pdfview/PDFParser;
      ((PDFParser)localObject4).<init>((PDFPage)localObject3, arrayOfByte, (HashMap)localObject5);
      localObject5 = this.cache;
      ((Cache)localObject5).addPage((Integer)localObject2, (PDFPage)localObject3, (PDFParser)localObject4);
      localObject1 = localObject3;
      if (localObject4 != null)
      {
        bool = ((PDFParser)localObject4).isFinished();
        if (!bool)
        {
          ((PDFParser)localObject4).go(paramBoolean);
          continue;
          localObject1 = localObject3;
        }
      }
    }
  }
  
  public int getPageNumber(PDFObject paramPDFObject)
  {
    int i = paramPDFObject.getType();
    int m = 5;
    if (i == m) {
      paramPDFObject = paramPDFObject.getAt(0);
    }
    Object localObject1 = paramPDFObject.getDictRef("Type");
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject1 = ((PDFObject)localObject1).getStringValue();
      localObject2 = "Page";
      j = ((String)localObject1).equals(localObject2);
      if (j != 0) {}
    }
    else
    {
      j = 0;
      localObject1 = null;
    }
    int k;
    do
    {
      return j;
      k = 0;
      localObject1 = null;
      localObject2 = paramPDFObject.getDictRef("Parent");
    } while (localObject2 == null);
    PDFObject[] arrayOfPDFObject = ((PDFObject)localObject2).getDictRef("Kids").getArray();
    int n = 0;
    int i1 = arrayOfPDFObject.length;
    if (n >= i1) {}
    boolean bool;
    do
    {
      paramPDFObject = (PDFObject)localObject2;
      break;
      localPDFObject = arrayOfPDFObject[n];
      bool = localPDFObject.equals(paramPDFObject);
    } while (bool);
    PDFObject localPDFObject = arrayOfPDFObject[n];
    String str = "Count";
    localPDFObject = localPDFObject.getDictRef(str);
    if (localPDFObject != null) {}
    for (int i2 = localPDFObject.getIntValue() + k;; i2 = k + 1)
    {
      n += 1;
      k = i2;
      break;
    }
  }
  
  public PDFObject getRoot()
  {
    return this.root;
  }
  
  public String getStringMetadata(String paramString)
  {
    String str = null;
    PDFObject localPDFObject = this.info;
    if (localPDFObject != null)
    {
      localPDFObject = this.info.getDictRef(paramString);
      if (localPDFObject != null) {
        str = localPDFObject.getTextStringValue();
      }
    }
    return str;
  }
  
  public String getVersionString()
  {
    return this.versionString;
  }
  
  public boolean isPrintable()
  {
    return this.printable;
  }
  
  public boolean isSaveable()
  {
    return this.saveable;
  }
  
  public RectF parseRect(PDFObject paramPDFObject)
  {
    int i = paramPDFObject.getType();
    int j = 5;
    if (i == j)
    {
      localObject = paramPDFObject.getArray();
      j = localObject.length;
      int k = 4;
      float f1 = 5.6E-45F;
      if (j == k)
      {
        RectF localRectF = new android/graphics/RectF;
        f1 = localObject[0].getFloatValue();
        float f2 = localObject[1].getFloatValue();
        float f3 = localObject[2].getFloatValue();
        float f4 = localObject[3].getFloatValue();
        localRectF.<init>(f1, f2, f3, f4);
        return localRectF;
      }
      localObject = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject).<init>("Rectangle definition didn't have 4 elements");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/sun/pdfview/PDFParseException;
    ((PDFParseException)localObject).<init>("Rectangle definition not an array");
    throw ((Throwable)localObject);
  }
  
  public void stop(int paramInt)
  {
    Object localObject = this.cache;
    Integer localInteger = new java/lang/Integer;
    localInteger.<init>(paramInt);
    localObject = ((Cache)localObject).getPageParser(localInteger);
    if (localObject != null) {
      ((PDFParser)localObject).stop();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */