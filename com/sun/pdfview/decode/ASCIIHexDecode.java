package com.sun.pdfview.decode;

import c.a.a.b.b;
import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import java.io.ByteArrayOutputStream;

public class ASCIIHexDecode
{
  private b buf;
  
  private ASCIIHexDecode(b paramb)
  {
    this.buf = paramb;
  }
  
  private b decode()
  {
    int i = -1;
    this.buf.e();
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    for (;;)
    {
      int j = readHexDigit();
      int k = readHexDigit();
      if (j == i) {}
      for (;;)
      {
        return b.d(localByteArrayOutputStream.toByteArray());
        if (k != i) {
          break;
        }
        j = (byte)(j << 4);
        localByteArrayOutputStream.write(j);
      }
      j = (byte)((j << 4) + k);
      localByteArrayOutputStream.write(j);
    }
  }
  
  public static b decode(b paramb, PDFObject paramPDFObject)
  {
    ASCIIHexDecode localASCIIHexDecode = new com/sun/pdfview/decode/ASCIIHexDecode;
    localASCIIHexDecode.<init>(paramb);
    return localASCIIHexDecode.decode();
  }
  
  private int readHexDigit()
  {
    int i;
    boolean bool;
    do
    {
      localObject = this.buf;
      i = ((b)localObject).c();
      if (i <= 0)
      {
        localObject = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject).<init>("Short stream in ASCIIHex decode");
        throw ((Throwable)localObject);
      }
      localObject = this.buf;
      i = ((b)localObject).b();
      bool = PDFFile.isWhiteSpace((char)i);
    } while (bool);
    int j = 48;
    if (i >= j)
    {
      j = 57;
      if (i <= j) {
        i += -48;
      }
    }
    for (;;)
    {
      return i;
      j = 97;
      if (i >= j)
      {
        j = 102;
        if (i <= j)
        {
          i += -87;
          continue;
        }
      }
      j = 65;
      if (i >= j)
      {
        j = 70;
        if (i <= j)
        {
          i += -55;
          continue;
        }
      }
      j = 62;
      if (i != j) {
        break;
      }
      i = -1;
    }
    PDFParseException localPDFParseException = new com/sun/pdfview/PDFParseException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("Bad character ");
    Object localObject = i + "in ASCIIHex decode";
    localPDFParseException.<init>((String)localObject);
    throw localPDFParseException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decode\ASCIIHexDecode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */