package com.sun.pdfview.decrypt;

import com.sun.pdfview.Identity8BitCharsetEncoder;
import java.nio.charset.CharsetEncoder;

class PDFPassword$IdentityEncodingByteGenerator
  extends PDFPassword.CharsetEncoderGenerator
{
  private PDFPassword$IdentityEncodingByteGenerator(Byte paramByte)
  {
    super(paramByte);
  }
  
  protected CharsetEncoder createCharsetEncoder()
  {
    Identity8BitCharsetEncoder localIdentity8BitCharsetEncoder = new com/sun/pdfview/Identity8BitCharsetEncoder;
    localIdentity8BitCharsetEncoder.<init>();
    return localIdentity8BitCharsetEncoder;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decrypt\PDFPassword$IdentityEncodingByteGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */