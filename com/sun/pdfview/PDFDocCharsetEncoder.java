package com.sun.pdfview;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.HashMap;
import java.util.Map;

public class PDFDocCharsetEncoder
  extends CharsetEncoder
{
  static final Map EXTENDED_TO_PDF_DOC_ENCODING_MAP;
  static final boolean[] IDENT_PDF_DOC_ENCODING_MAP = new boolean['Ā'];
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    EXTENDED_TO_PDF_DOC_ENCODING_MAP = localHashMap;
    int i = 0;
    localHashMap = null;
    Object localObject1 = PDFStringUtil.PDF_DOC_ENCODING_MAP;
    int j = localObject1.length;
    if (i >= j) {
      return;
    }
    localObject1 = PDFStringUtil.PDF_DOC_ENCODING_MAP;
    int m = localObject1[i];
    int k;
    if (m == i) {
      k = 1;
    }
    for (;;)
    {
      Object localObject2 = IDENT_PDF_DOC_ENCODING_MAP;
      localObject2[i] = k;
      if (k == 0)
      {
        localObject1 = EXTENDED_TO_PDF_DOC_ENCODING_MAP;
        Character localCharacter = Character.valueOf(m);
        localObject2 = Byte.valueOf(i);
        ((Map)localObject1).put(localCharacter, localObject2);
      }
      i = (byte)(i + 1);
      break;
      k = 0;
      localObject1 = null;
    }
  }
  
  public PDFDocCharsetEncoder()
  {
    super(null, f, f);
  }
  
  public static boolean isIdentityEncoding(char paramChar)
  {
    char c;
    boolean[] arrayOfBoolean;
    if (paramChar >= 0)
    {
      c = 'ÿ';
      if (paramChar <= c)
      {
        arrayOfBoolean = IDENT_PDF_DOC_ENCODING_MAP;
        c = arrayOfBoolean[paramChar];
        if (c != 0) {
          c = '\001';
        }
      }
    }
    for (;;)
    {
      return c;
      c = '\000';
      arrayOfBoolean = null;
    }
  }
  
  protected CoderResult encodeLoop(CharBuffer paramCharBuffer, ByteBuffer paramByteBuffer)
  {
    int i = 1;
    int j = paramCharBuffer.remaining();
    Object localObject1;
    if (j <= 0) {
      localObject1 = CoderResult.UNDERFLOW;
    }
    for (;;)
    {
      return (CoderResult)localObject1;
      j = paramByteBuffer.remaining();
      if (j < i)
      {
        localObject1 = CoderResult.OVERFLOW;
      }
      else
      {
        j = paramCharBuffer.get();
        if (j >= 0)
        {
          int k = 256;
          if (j < k)
          {
            localObject2 = IDENT_PDF_DOC_ENCODING_MAP;
            int m = localObject2[j];
            if (m != 0)
            {
              j = (byte)j;
              paramByteBuffer.put(j);
              break;
            }
          }
        }
        Object localObject2 = EXTENDED_TO_PDF_DOC_ENCODING_MAP;
        localObject1 = Character.valueOf(j);
        localObject1 = (Byte)((Map)localObject2).get(localObject1);
        if (localObject1 != null)
        {
          byte b = ((Byte)localObject1).byteValue();
          paramByteBuffer.put(b);
          break;
        }
        localObject1 = CoderResult.unmappableForLength(i);
      }
    }
  }
  
  public boolean isLegalReplacement(byte[] paramArrayOfByte)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFDocCharsetEncoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */