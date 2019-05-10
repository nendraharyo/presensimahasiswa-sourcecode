package com.sun.pdfview;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

public class Identity8BitCharsetEncoder
  extends CharsetEncoder
{
  public Identity8BitCharsetEncoder()
  {
    super(null, f, f);
  }
  
  protected CoderResult encodeLoop(CharBuffer paramCharBuffer, ByteBuffer paramByteBuffer)
  {
    int i = 1;
    int j = paramCharBuffer.remaining();
    CoderResult localCoderResult;
    if (j <= 0) {
      localCoderResult = CoderResult.UNDERFLOW;
    }
    for (;;)
    {
      return localCoderResult;
      j = paramByteBuffer.remaining();
      if (j < i)
      {
        localCoderResult = CoderResult.OVERFLOW;
      }
      else
      {
        j = paramCharBuffer.get();
        if (j >= 0)
        {
          int k = 256;
          if (j < k)
          {
            j = (byte)j;
            paramByteBuffer.put(j);
            break;
          }
        }
        localCoderResult = CoderResult.unmappableForLength(i);
      }
    }
  }
  
  public boolean isLegalReplacement(byte[] paramArrayOfByte)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\Identity8BitCharsetEncoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */