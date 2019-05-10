package com.sun.pdfview.decrypt;

import com.sun.pdfview.PDFStringUtil;

class PDFPassword$1
  implements PDFPassword.PasswordByteGenerator
{
  public byte[] generateBytes(String paramString)
  {
    return PDFStringUtil.asBytes(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decrypt\PDFPassword$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */