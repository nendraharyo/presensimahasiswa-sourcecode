package com.sun.pdfview.decrypt;

import c.a.a.b.b;
import com.sun.pdfview.PDFObject;

public abstract interface PDFDecrypter
{
  public abstract b decryptBuffer(String paramString, PDFObject paramPDFObject, b paramb);
  
  public abstract String decryptString(int paramInt1, int paramInt2, String paramString);
  
  public abstract boolean isEncryptionPresent();
  
  public abstract boolean isOwnerAuthorised();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decrypt\PDFDecrypter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */