package com.sun.pdfview.decrypt;

import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;

public class IdentityDecrypter
  implements PDFDecrypter
{
  private static IdentityDecrypter INSTANCE;
  
  static
  {
    IdentityDecrypter localIdentityDecrypter = new com/sun/pdfview/decrypt/IdentityDecrypter;
    localIdentityDecrypter.<init>();
    INSTANCE = localIdentityDecrypter;
  }
  
  public static IdentityDecrypter getInstance()
  {
    return INSTANCE;
  }
  
  public b decryptBuffer(String paramString, PDFObject paramPDFObject, b paramb)
  {
    if (paramString != null)
    {
      PDFParseException localPDFParseException = new com/sun/pdfview/PDFParseException;
      localPDFParseException.<init>("This Encryption version does not support Crypt filters");
      throw localPDFParseException;
    }
    return paramb;
  }
  
  public String decryptString(int paramInt1, int paramInt2, String paramString)
  {
    return paramString;
  }
  
  public boolean isEncryptionPresent()
  {
    return false;
  }
  
  public boolean isOwnerAuthorised()
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decrypt\IdentityDecrypter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */