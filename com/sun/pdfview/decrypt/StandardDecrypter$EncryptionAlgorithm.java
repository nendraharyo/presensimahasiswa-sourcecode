package com.sun.pdfview.decrypt;

public enum StandardDecrypter$EncryptionAlgorithm
{
  static
  {
    int i = 1;
    Object localObject = new com/sun/pdfview/decrypt/StandardDecrypter$EncryptionAlgorithm;
    ((EncryptionAlgorithm)localObject).<init>("RC4", 0);
    RC4 = (EncryptionAlgorithm)localObject;
    localObject = new com/sun/pdfview/decrypt/StandardDecrypter$EncryptionAlgorithm;
    ((EncryptionAlgorithm)localObject).<init>("AESV2", i);
    AESV2 = (EncryptionAlgorithm)localObject;
    localObject = new EncryptionAlgorithm[2];
    EncryptionAlgorithm localEncryptionAlgorithm = RC4;
    localObject[0] = localEncryptionAlgorithm;
    localEncryptionAlgorithm = AESV2;
    localObject[i] = localEncryptionAlgorithm;
    ENUM$VALUES = (EncryptionAlgorithm[])localObject;
  }
  
  boolean isAES()
  {
    EncryptionAlgorithm localEncryptionAlgorithm = AESV2;
    boolean bool;
    if (this == localEncryptionAlgorithm) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localEncryptionAlgorithm = null;
    }
  }
  
  boolean isRC4()
  {
    EncryptionAlgorithm localEncryptionAlgorithm = RC4;
    boolean bool;
    if (this == localEncryptionAlgorithm) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localEncryptionAlgorithm = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decrypt\StandardDecrypter$EncryptionAlgorithm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */