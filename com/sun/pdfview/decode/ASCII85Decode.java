package com.sun.pdfview.decode;

import c.a.a.b.b;
import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import java.io.ByteArrayOutputStream;

public class ASCII85Decode
{
  private b buf;
  
  private ASCII85Decode(b paramb)
  {
    this.buf = paramb;
  }
  
  private b decode()
  {
    this.buf.e();
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    boolean bool;
    do
    {
      bool = decode5(localByteArrayOutputStream);
    } while (bool);
    return b.d(localByteArrayOutputStream.toByteArray());
  }
  
  public static b decode(b paramb, PDFObject paramPDFObject)
  {
    ASCII85Decode localASCII85Decode = new com/sun/pdfview/decode/ASCII85Decode;
    localASCII85Decode.<init>(paramb);
    return localASCII85Decode.decode();
  }
  
  private boolean decode5(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    int i = 5;
    int j = 1;
    int k = 4;
    int m = 0;
    int[] arrayOfInt = new int[i];
    int n = 0;
    Object localObject = null;
    label27:
    int i3;
    int i4;
    int i5;
    if (n >= i)
    {
      if (n > 0) {
        n += -1;
      }
      i3 = arrayOfInt[0] * 85 * 85 * 85 * 85;
      i4 = arrayOfInt[j] * 85 * 85 * 85;
      i3 += i4;
      i4 = arrayOfInt[2] * 85 * 85;
      i3 += i4;
      i4 = arrayOfInt[3] * 85;
      i3 += i4;
      i5 = arrayOfInt[k];
      i3 += i5;
      i5 = 0;
      arrayOfInt = null;
      label133:
      if (i5 < n) {
        break label402;
      }
      if (n != k) {
        break label438;
      }
      n = j;
    }
    for (;;)
    {
      return n;
      i3 = nextChar();
      arrayOfInt[n] = i3;
      i3 = arrayOfInt[n];
      i4 = 126;
      if (i3 == i4)
      {
        i3 = nextChar();
        i4 = 62;
        if (i3 == i4) {
          break label27;
        }
        localObject = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject).<init>("Bad character in ASCII85Decode: not ~>");
        throw ((Throwable)localObject);
      }
      i3 = arrayOfInt[n];
      i4 = 33;
      if (i3 >= i4)
      {
        i3 = arrayOfInt[n];
        i4 = 117;
        if (i3 <= i4)
        {
          i3 = arrayOfInt[n] + -33;
          arrayOfInt[n] = i3;
        }
      }
      for (;;)
      {
        n += 1;
        break;
        i3 = arrayOfInt[i1];
        i4 = 122;
        if (i3 != i4) {
          break label329;
        }
        if (i1 != 0) {
          break label314;
        }
        arrayOfInt[i1] = 0;
        i1 = k;
      }
      label314:
      localObject = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject).<init>("Inappropriate 'z' in ASCII85Decode");
      throw ((Throwable)localObject);
      label329:
      PDFParseException localPDFParseException = new com/sun/pdfview/PDFParseException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("Bad character in ASCII85Decode: ");
      m = arrayOfInt[i1];
      localStringBuilder = localStringBuilder.append(m).append(" (");
      int i1 = (char)arrayOfInt[i1];
      localObject = i1 + ")";
      localPDFParseException.<init>((String)localObject);
      throw localPDFParseException;
      label402:
      i4 = (3 - i5) * 8;
      i4 = (byte)(i3 >> i4 & 0xFF);
      paramByteArrayOutputStream.write(i4);
      int i6;
      i5 += 1;
      break label133;
      label438:
      int i2 = 0;
      localObject = null;
    }
  }
  
  private int nextChar()
  {
    b localb = this.buf;
    int i = localb.c();
    if (i <= 0) {
      i = -1;
    }
    for (;;)
    {
      return i;
      localb = this.buf;
      i = (char)localb.b();
      boolean bool = PDFFile.isWhiteSpace(i);
      if (bool) {
        break;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decode\ASCII85Decode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */