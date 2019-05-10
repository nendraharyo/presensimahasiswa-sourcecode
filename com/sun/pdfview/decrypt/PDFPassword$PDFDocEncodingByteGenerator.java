package com.sun.pdfview.decrypt;

import com.sun.pdfview.PDFDocCharsetEncoder;
import java.nio.charset.CharsetEncoder;

class PDFPassword$PDFDocEncodingByteGenerator
  extends PDFPassword.CharsetEncoderGenerator
{
  private PDFPassword$PDFDocEncodingByteGenerator(Byte paramByte)
  {
    super(paramByte);
  }
  
  protected CharsetEncoder createCharsetEncoder()
  {
    PDFDocCharsetEncoder localPDFDocCharsetEncoder = new com/sun/pdfview/PDFDocCharsetEncoder;
    localPDFDocCharsetEncoder.<init>();
    return localPDFDocCharsetEncoder;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decrypt\PDFPassword$PDFDocEncodingByteGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */