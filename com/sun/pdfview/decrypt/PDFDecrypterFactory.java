package com.sun.pdfview.decrypt;

import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PDFDecrypterFactory
{
  public static final String CF_IDENTITY = "Identity";
  private static final int DEFAULT_KEY_LENGTH = 40;
  
  static
  {
    Class localClass = PDFDecrypterFactory.class;
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
  
  private static PDFDecrypter createCryptFilterDecrypter(PDFObject paramPDFObject1, PDFObject paramPDFObject2, PDFPassword paramPDFPassword, int paramInt)
  {
    int i = 1;
    boolean bool1 = $assertionsDisabled;
    if (!bool1)
    {
      int j = 4;
      if (paramInt < j)
      {
        localObject1 = new java/lang/AssertionError;
        ((AssertionError)localObject1).<init>("crypt filter decrypter not supported for standard encryption prior to version 4");
        throw ((Throwable)localObject1);
      }
    }
    Object localObject1 = paramPDFObject1.getDictRef("EncryptMetadata");
    if (localObject1 != null)
    {
      int k = ((PDFObject)localObject1).getType();
      if (k == i) {
        i = ((PDFObject)localObject1).getBooleanValue();
      }
    }
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localObject1 = "CF";
    PDFObject localPDFObject = paramPDFObject1.getDictRef((String)localObject1);
    if (localPDFObject == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("No CF value present in Encrypt dict for V4 encryption");
      throw ((Throwable)localObject1);
    }
    Iterator localIterator = localPDFObject.getDictKeys();
    boolean bool2 = localIterator.hasNext();
    if (!bool2)
    {
      localObject2 = IdentityDecrypter.getInstance();
      localHashMap.put("Identity", localObject2);
      localObject1 = paramPDFObject1.getDictRef("StmF");
      if (localObject1 == null) {
        break label483;
      }
      localObject1 = ((PDFObject)localObject1).getStringValue();
      label171:
      localObject2 = paramPDFObject1.getDictRef("StrF");
      if (localObject2 == null) {
        break label490;
      }
    }
    label270:
    label295:
    label339:
    label346:
    label444:
    label483:
    label490:
    for (Object localObject2 = ((PDFObject)localObject2).getStringValue();; localObject2 = "Identity")
    {
      Object localObject3 = new com/sun/pdfview/decrypt/CryptFilterDecrypter;
      ((CryptFilterDecrypter)localObject3).<init>(localHashMap, (String)localObject1, (String)localObject2);
      return (PDFDecrypter)localObject3;
      localObject1 = localIterator.next();
      Object localObject4 = localObject1;
      localObject4 = (String)localObject1;
      localObject1 = localPDFObject.getDictRef((String)localObject4);
      localObject2 = ((PDFObject)localObject1).getDictRef("Length");
      Integer localInteger;
      boolean bool3;
      if (localObject2 != null)
      {
        int m = ((PDFObject)localObject2).getIntValue() * 8;
        localInteger = Integer.valueOf(m);
        localObject2 = "CFM";
        localObject1 = ((PDFObject)localObject1).getDictRef((String)localObject2);
        if (localObject1 == null) {
          break label339;
        }
        localObject1 = ((PDFObject)localObject1).getStringValue();
        localObject2 = "None";
        bool3 = ((String)localObject2).equals(localObject1);
        if (!bool3) {
          break label346;
        }
        localObject1 = IdentityDecrypter.getInstance();
      }
      for (;;)
      {
        localHashMap.put(localObject4, localObject1);
        break;
        localInteger = null;
        break label270;
        localObject1 = "None";
        break label295;
        localObject2 = "V2";
        bool3 = ((String)localObject2).equals(localObject1);
        StandardDecrypter.EncryptionAlgorithm localEncryptionAlgorithm;
        if (bool3)
        {
          localEncryptionAlgorithm = StandardDecrypter.EncryptionAlgorithm.RC4;
          localObject1 = paramPDFObject1;
          localObject2 = paramPDFObject2;
          localObject3 = paramPDFPassword;
          localObject1 = createStandardDecrypter(paramPDFObject1, paramPDFObject2, paramPDFPassword, localInteger, i, localEncryptionAlgorithm);
        }
        else
        {
          localObject2 = "AESV2";
          bool3 = ((String)localObject2).equals(localObject1);
          if (!bool3) {
            break label444;
          }
          localEncryptionAlgorithm = StandardDecrypter.EncryptionAlgorithm.AESV2;
          localObject1 = paramPDFObject1;
          localObject2 = paramPDFObject2;
          localObject3 = paramPDFPassword;
          localObject1 = createStandardDecrypter(paramPDFObject1, paramPDFObject2, paramPDFPassword, localInteger, i, localEncryptionAlgorithm);
        }
      }
      localObject2 = new java/lang/UnsupportedOperationException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("Unknown CryptFilter method: ");
      localObject1 = (String)localObject1;
      ((UnsupportedOperationException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      localObject1 = "Identity";
      break label171;
    }
  }
  
  public static PDFDecrypter createDecryptor(PDFObject paramPDFObject1, PDFObject paramPDFObject2, PDFPassword paramPDFPassword)
  {
    Object localObject1 = PDFPassword.nonNullPassword(paramPDFPassword);
    if (paramPDFObject1 == null) {
      localObject2 = IdentityDecrypter.getInstance();
    }
    label75:
    int m;
    for (;;)
    {
      return (PDFDecrypter)localObject2;
      localObject2 = paramPDFObject1.getDictRef("Filter");
      if (localObject2 == null) {
        break label223;
      }
      localObject3 = "Standard";
      Object localObject4 = ((PDFObject)localObject2).getStringValue();
      int i = ((String)localObject3).equals(localObject4);
      if (i == 0) {
        break label223;
      }
      localObject2 = paramPDFObject1.getDictRef("V");
      if (localObject2 != null)
      {
        int k = ((PDFObject)localObject2).getIntValue();
        i = 1;
        if (k != i)
        {
          j = 2;
          if (k != j) {
            break label164;
          }
        }
        localObject2 = paramPDFObject1.getDictRef("Length");
        if (localObject2 == null) {
          break label158;
        }
        m = ((PDFObject)localObject2).getIntValue();
      }
      label158:
      for (localObject4 = Integer.valueOf(m);; localObject4 = null)
      {
        StandardDecrypter.EncryptionAlgorithm localEncryptionAlgorithm = StandardDecrypter.EncryptionAlgorithm.RC4;
        localObject2 = paramPDFObject1;
        localObject3 = paramPDFObject2;
        localObject2 = createStandardDecrypter(paramPDFObject1, paramPDFObject2, (PDFPassword)localObject1, (Integer)localObject4, false, localEncryptionAlgorithm);
        break;
        m = 0;
        localObject2 = null;
        break label75;
      }
      label164:
      int j = 4;
      if (m != j) {
        break;
      }
      localObject2 = createCryptFilterDecrypter(paramPDFObject1, paramPDFObject2, (PDFPassword)localObject1, m);
    }
    Object localObject3 = new com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("Unsupported encryption version: ");
    Object localObject2 = m;
    ((EncryptionUnsupportedByPlatformException)localObject3).<init>((String)localObject2);
    throw ((Throwable)localObject3);
    label223:
    if (localObject2 == null)
    {
      localObject2 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject2).<init>("No Filter specified in Encrypt dictionary");
      throw ((Throwable)localObject2);
    }
    localObject3 = new com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("Unsupported encryption Filter: ");
    localObject2 = localObject2 + "; only Standard is supported.";
    ((EncryptionUnsupportedByPlatformException)localObject3).<init>((String)localObject2);
    throw ((Throwable)localObject3);
  }
  
  private static PDFDecrypter createStandardDecrypter(PDFObject paramPDFObject1, PDFObject paramPDFObject2, PDFPassword paramPDFPassword, Integer paramInteger, boolean paramBoolean, StandardDecrypter.EncryptionAlgorithm paramEncryptionAlgorithm)
  {
    int i = 32;
    if (paramInteger == null)
    {
      j = 40;
      paramInteger = Integer.valueOf(j);
    }
    Object localObject1 = paramPDFObject1.getDictRef("R");
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("No R entry present in Encrypt dictionary");
      throw ((Throwable)localObject1);
    }
    int k = ((PDFObject)localObject1).getIntValue();
    int j = 2;
    if (k >= j)
    {
      j = 4;
      if (k <= j) {}
    }
    else
    {
      localObject1 = new com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Unsupported Standard security handler revision; R=");
      localObject2 = k;
      ((EncryptionUnsupportedByPlatformException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = paramPDFObject1.getDictRef("O");
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("No O entry present in Encrypt dictionary");
      throw ((Throwable)localObject1);
    }
    byte[] arrayOfByte1 = ((PDFObject)localObject1).getStream();
    j = arrayOfByte1.length;
    int m;
    if (j != i)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Expected owner key O value of 32 bytes; found ");
      m = arrayOfByte1.length;
      localObject2 = m;
      ((PDFParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = paramPDFObject1.getDictRef("U");
    if (localObject1 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("No U entry present in Encrypt dictionary");
      throw ((Throwable)localObject1);
    }
    byte[] arrayOfByte2 = ((PDFObject)localObject1).getStream();
    j = arrayOfByte2.length;
    if (j != i)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Expected user key U value of 32 bytes; found ");
      m = arrayOfByte1.length;
      localObject2 = m;
      ((PDFParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = "P";
    Object localObject2 = paramPDFObject1.getDictRef((String)localObject1);
    if (localObject2 == null)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject1).<init>("Required P entry in Encrypt dictionary not found");
      throw ((Throwable)localObject1);
    }
    localObject1 = new com/sun/pdfview/decrypt/StandardDecrypter;
    int n = paramInteger.intValue();
    int i1 = ((PDFObject)localObject2).getIntValue();
    localObject2 = paramEncryptionAlgorithm;
    ((StandardDecrypter)localObject1).<init>(paramEncryptionAlgorithm, paramPDFObject2, n, k, arrayOfByte1, arrayOfByte2, i1, paramBoolean, paramPDFPassword);
    return (PDFDecrypter)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decrypt\PDFDecrypterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */