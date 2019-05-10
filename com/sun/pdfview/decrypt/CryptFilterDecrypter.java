package com.sun.pdfview.decrypt;

import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class CryptFilterDecrypter
  implements PDFDecrypter
{
  private Map decrypters;
  private PDFDecrypter defaultStreamDecrypter;
  private PDFDecrypter defaultStringDecrypter;
  
  static
  {
    Class localClass = CryptFilterDecrypter.class;
    boolean bool = localClass.desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      $assertionsDisabled = bool;
      return;
      bool = false;
      localClass = null;
    }
  }
  
  public CryptFilterDecrypter(Map paramMap, String paramString1, String paramString2)
  {
    this.decrypters = paramMap;
    boolean bool = $assertionsDisabled;
    Object localObject2;
    if (!bool)
    {
      localObject1 = this.decrypters;
      localObject2 = "Identity";
      bool = ((Map)localObject1).containsKey(localObject2);
      if (!bool)
      {
        localObject1 = new java/lang/AssertionError;
        ((AssertionError)localObject1).<init>("Crypt Filter map does not contain required Identity filter");
        throw ((Throwable)localObject1);
      }
    }
    Object localObject1 = (PDFDecrypter)this.decrypters.get(paramString1);
    this.defaultStreamDecrypter = ((PDFDecrypter)localObject1);
    localObject1 = this.defaultStreamDecrypter;
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Unknown crypt filter specified as default for streams: ");
      localObject2 = paramString1;
      ((PDFParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = (PDFDecrypter)this.decrypters.get(paramString2);
    this.defaultStringDecrypter = ((PDFDecrypter)localObject1);
    localObject1 = this.defaultStringDecrypter;
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Unknown crypt filter specified as default for strings: ");
      localObject2 = paramString2;
      ((PDFParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  public b decryptBuffer(String paramString, PDFObject paramPDFObject, b paramb)
  {
    Object localObject1 = null;
    if (paramString == null) {
      localObject2 = this.defaultStreamDecrypter;
    }
    do
    {
      if (paramString != null) {
        paramPDFObject = null;
      }
      return ((PDFDecrypter)localObject2).decryptBuffer(null, paramPDFObject, paramb);
      localObject2 = (PDFDecrypter)this.decrypters.get(paramString);
    } while (localObject2 != null);
    Object localObject2 = new com/sun/pdfview/PDFParseException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("Unknown CryptFilter: ");
    localObject1 = paramString;
    ((PDFParseException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  public String decryptString(int paramInt1, int paramInt2, String paramString)
  {
    return this.defaultStringDecrypter.decryptString(paramInt1, paramInt2, paramString);
  }
  
  public boolean isEncryptionPresent()
  {
    Object localObject = this.decrypters.values();
    Iterator localIterator = ((Collection)localObject).iterator();
    boolean bool = localIterator.hasNext();
    if (!bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = (PDFDecrypter)localIterator.next();
      bool = ((PDFDecrypter)localObject).isEncryptionPresent();
      if (!bool) {
        break;
      }
      bool = true;
    }
  }
  
  public boolean isOwnerAuthorised()
  {
    Object localObject = this.decrypters.values();
    Iterator localIterator = ((Collection)localObject).iterator();
    boolean bool = localIterator.hasNext();
    if (!bool)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      localObject = (PDFDecrypter)localIterator.next();
      bool = ((PDFDecrypter)localObject).isOwnerAuthorised();
      if (!bool) {
        break;
      }
      bool = true;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decrypt\CryptFilterDecrypter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */