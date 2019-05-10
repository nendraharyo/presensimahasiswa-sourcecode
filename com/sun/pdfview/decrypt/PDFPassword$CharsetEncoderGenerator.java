package com.sun.pdfview.decrypt;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

abstract class PDFPassword$CharsetEncoderGenerator
  implements PDFPassword.PasswordByteGenerator
{
  private Byte replacementByte;
  
  protected PDFPassword$CharsetEncoderGenerator(Byte paramByte)
  {
    this.replacementByte = paramByte;
  }
  
  protected abstract CharsetEncoder createCharsetEncoder();
  
  public byte[] generateBytes(String paramString)
  {
    Object localObject1 = createCharsetEncoder();
    Object localObject3 = this.replacementByte;
    if (localObject3 != null)
    {
      int i = 1;
      localObject3 = new byte[i];
      Byte localByte = this.replacementByte;
      int j = localByte.byteValue();
      localObject3[0] = j;
      ((CharsetEncoder)localObject1).replaceWith((byte[])localObject3);
      localObject3 = CodingErrorAction.REPLACE;
      ((CharsetEncoder)localObject1).onUnmappableCharacter((CodingErrorAction)localObject3);
    }
    for (;;)
    {
      try
      {
        localObject3 = CharBuffer.wrap(paramString);
        localObject3 = ((CharsetEncoder)localObject1).encode((CharBuffer)localObject3);
        k = ((ByteBuffer)localObject3).remaining();
        localObject1 = new byte[k];
        ((ByteBuffer)localObject3).get((byte[])localObject1);
      }
      catch (CharacterCodingException localCharacterCodingException)
      {
        int k = 0;
        Object localObject2 = null;
        continue;
      }
      return (byte[])localObject1;
      localObject3 = CodingErrorAction.IGNORE;
      ((CharsetEncoder)localObject1).onUnmappableCharacter((CodingErrorAction)localObject3);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decrypt\PDFPassword$CharsetEncoderGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */