package com.sun.pdfview.decode;

import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;

public class LZWDecode
{
  static int CLEARDICT = 256;
  static int STOP = 257;
  int bitpos;
  int bitspercode;
  b buf;
  int bytepos;
  byte[][] dict;
  int dictlen;
  
  private LZWDecode(b paramb)
  {
    byte[][] arrayOfByte = new byte['က'][];
    this.dict = arrayOfByte;
    this.dictlen = 0;
    this.bitspercode = i;
    int j = 0;
    arrayOfByte = null;
    for (;;)
    {
      int k = 256;
      if (j >= k)
      {
        this.dictlen = 258;
        this.bitspercode = i;
        this.buf = paramb;
        this.bytepos = 0;
        this.bitpos = 0;
        return;
      }
      Object localObject = this.dict;
      byte[] arrayOfByte1 = new byte[1];
      localObject[j] = arrayOfByte1;
      localObject = this.dict[j];
      int m = (byte)j;
      localObject[0] = m;
      j += 1;
    }
  }
  
  private b decode()
  {
    int i = CLEARDICT;
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    for (;;)
    {
      int j = nextCode();
      int k = -1;
      Object localObject1;
      if (j == k)
      {
        localObject1 = new com/sun/pdfview/PDFParseException;
        ((PDFParseException)localObject1).<init>("Missed the stop code in LZWDecode!");
        throw ((Throwable)localObject1);
      }
      k = STOP;
      if (j == k) {
        return b.d(localByteArrayOutputStream.toByteArray());
      }
      k = CLEARDICT;
      if (j == k)
      {
        resetDict();
        i = j;
      }
      else
      {
        k = CLEARDICT;
        byte[] arrayOfByte1;
        if (i == k)
        {
          localObject1 = this.dict[j];
          arrayOfByte1 = this.dict[j];
          k = arrayOfByte1.length;
          localByteArrayOutputStream.write((byte[])localObject1, 0, k);
          i = j;
        }
        else
        {
          k = this.dictlen;
          int m;
          Object localObject2;
          byte[] arrayOfByte2;
          int n;
          if (j < k)
          {
            arrayOfByte1 = this.dict[j];
            m = this.dict[j].length;
            localByteArrayOutputStream.write(arrayOfByte1, 0, m);
            k = this.dict[i].length + 1;
            arrayOfByte1 = new byte[k];
            localObject2 = this.dict[i];
            arrayOfByte2 = this.dict[i];
            n = arrayOfByte2.length;
            System.arraycopy(localObject2, 0, arrayOfByte1, 0, n);
            i = this.dict[i].length;
            localObject2 = this.dict[j];
            m = localObject2[0];
            arrayOfByte1[i] = m;
            localObject1 = this.dict;
            m = this.dictlen;
            n = m + 1;
            this.dictlen = n;
            localObject1[m] = arrayOfByte1;
          }
          for (;;)
          {
            i = this.dictlen;
            m = this.bitspercode;
            k = (1 << m) + -1;
            if (i < k) {
              break label448;
            }
            i = this.bitspercode;
            k = 12;
            if (i >= k) {
              break label448;
            }
            i = this.bitspercode + 1;
            this.bitspercode = i;
            i = j;
            break;
            k = this.dict[i].length + 1;
            arrayOfByte1 = new byte[k];
            localObject2 = this.dict[i];
            arrayOfByte2 = this.dict[i];
            n = arrayOfByte2.length;
            System.arraycopy(localObject2, 0, arrayOfByte1, 0, n);
            localObject2 = this.dict;
            i = localObject2[i].length;
            m = arrayOfByte1[0];
            arrayOfByte1[i] = m;
            i = arrayOfByte1.length;
            localByteArrayOutputStream.write(arrayOfByte1, 0, i);
            localObject1 = this.dict;
            m = this.dictlen;
            n = m + 1;
            this.dictlen = n;
            localObject1[m] = arrayOfByte1;
          }
          label448:
          i = j;
        }
      }
    }
  }
  
  public static b decode(b paramb, PDFObject paramPDFObject)
  {
    Object localObject1 = new com/sun/pdfview/decode/LZWDecode;
    ((LZWDecode)localObject1).<init>(paramb);
    localObject1 = ((LZWDecode)localObject1).decode();
    if (paramPDFObject != null)
    {
      Object localObject2 = paramPDFObject.getDictionary();
      String str = "Predictor";
      boolean bool = ((HashMap)localObject2).containsKey(str);
      if (bool)
      {
        localObject2 = Predictor.getPredictor(paramPDFObject);
        if (localObject2 != null) {
          localObject1 = ((Predictor)localObject2).unpredict((b)localObject1);
        }
      }
    }
    return (b)localObject1;
  }
  
  private int nextCode()
  {
    int i = this.bitspercode;
    int j = this.bytepos;
    b localb1 = this.buf;
    int k = localb1.f() + -1;
    if (j >= k)
    {
      j = -1;
      return j;
    }
    label201:
    for (;;)
    {
      b localb2 = this.buf;
      int m = this.bytepos;
      m = localb2.b(m);
      j = this.bitpos;
      j = 8 - j;
      if (j > i) {
        j = i;
      }
      int n = this.bitpos;
      n = 8 - n - j;
      m >>= n;
      int i1 = 8 - j;
      n = 255 >> i1;
      m &= n;
      n = i - j;
      m <<= n;
      k |= m;
      i -= j;
      m = this.bitpos;
      j += m;
      this.bitpos = j;
      j = this.bitpos;
      m = 8;
      if (j >= m)
      {
        this.bitpos = 0;
        j = this.bytepos + 1;
        this.bytepos = j;
      }
      for (;;)
      {
        if (i > 0) {
          break label201;
        }
        j = k;
        break;
        k = 0;
        localb1 = null;
      }
    }
  }
  
  private void resetDict()
  {
    this.dictlen = 258;
    this.bitspercode = 9;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decode\LZWDecode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */