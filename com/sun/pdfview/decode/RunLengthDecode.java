package com.sun.pdfview.decode;

import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import java.io.ByteArrayOutputStream;

public class RunLengthDecode
{
  private static final int RUN_LENGTH_EOD = 128;
  private b buf;
  
  private RunLengthDecode(b paramb)
  {
    this.buf = paramb;
  }
  
  private b decode()
  {
    int i = 128;
    b localb1 = this.buf;
    localb1.e();
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    byte[] arrayOfByte = new byte[i];
    int j;
    for (;;)
    {
      localb1 = this.buf;
      j = localb1.b();
      k = -1;
      if ((j == k) || (j == i)) {
        return b.d(localByteArrayOutputStream.toByteArray());
      }
      k = 127;
      if (j > k) {
        break;
      }
      k = j + 1;
      while (k > 0)
      {
        b localb2 = this.buf;
        localb2.a(arrayOfByte, 0, k);
        localByteArrayOutputStream.write(arrayOfByte, 0, k);
      }
    }
    int m = this.buf.b();
    int k = 0;
    localb1 = null;
    for (;;)
    {
      int n = j & 0xFF;
      n = 257 - n;
      if (k >= n) {
        break;
      }
      localByteArrayOutputStream.write(m);
      k += 1;
    }
  }
  
  public static b decode(b paramb, PDFObject paramPDFObject)
  {
    RunLengthDecode localRunLengthDecode = new com/sun/pdfview/decode/RunLengthDecode;
    localRunLengthDecode.<init>(paramb);
    return localRunLengthDecode.decode();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decode\RunLengthDecode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */