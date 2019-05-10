package com.sun.pdfview.decrypt;

import c.a.a.a.a;
import c.a.a.b.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.PDFParseException;
import com.sun.pdfview.PDFStringUtil;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class StandardDecrypter
  implements PDFDecrypter
{
  private static final byte[] AESV2_SALT;
  private static final String CIPHER_AES = "AES/CBC/PKCS5Padding";
  private static final String CIPHER_RC4 = "RC4";
  private static final String KEY_AES = "AES";
  private static final String KEY_RC4 = "RC4";
  private static final byte[] PW_PADDING;
  private StandardDecrypter.EncryptionAlgorithm encryptionAlgorithm;
  private byte[] generalKeyBytes;
  private boolean ownerAuthorised;
  
  static
  {
    int i = 8;
    int j = 4;
    int k = 78;
    boolean bool1 = true;
    Object localObject = StandardDecrypter.class;
    boolean bool2 = ((Class)localObject).desiredAssertionStatus();
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      $assertionsDisabled = bool2;
      localObject = new byte[j];
      Object tmp41_39 = localObject;
      Object tmp42_41 = tmp41_39;
      Object tmp42_41 = tmp41_39;
      tmp42_41[0] = 115;
      tmp42_41[1] = 65;
      tmp42_41[2] = 108;
      tmp42_41[3] = 84;
      AESV2_SALT = (byte[])localObject;
      localObject = new byte[32];
      localObject[0] = 40;
      localObject[bool1] = -65;
      localObject[2] = k;
      localObject[3] = 94;
      localObject[j] = k;
      localObject[5] = 117;
      localObject[6] = -118;
      localObject[7] = 65;
      localObject[i] = 100;
      localObject[10] = k;
      localObject[11] = 86;
      localObject[12] = -1;
      localObject[13] = -6;
      localObject[14] = bool1;
      localObject[15] = i;
      localObject[16] = 46;
      localObject[17] = 46;
      localObject[19] = -74;
      localObject[20] = -48;
      localObject[21] = 104;
      localObject[22] = 62;
      localObject[23] = -128;
      localObject[24] = 47;
      localObject[25] = 12;
      localObject[26] = -87;
      localObject[27] = -2;
      localObject[28] = 100;
      localObject[29] = 83;
      localObject[30] = 105;
      localObject[31] = 122;
      PW_PADDING = (byte[])localObject;
      return;
      bool2 = false;
      localObject = null;
    }
  }
  
  public StandardDecrypter(StandardDecrypter.EncryptionAlgorithm paramEncryptionAlgorithm, PDFObject paramPDFObject, int paramInt1, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt3, boolean paramBoolean, PDFPassword paramPDFPassword)
  {
    int i = 0;
    Object localObject1 = null;
    this.ownerAuthorised = false;
    this.encryptionAlgorithm = paramEncryptionAlgorithm;
    Object localObject2;
    if (paramPDFObject == null)
    {
      i = 0;
      localObject1 = (byte[])null;
      localObject2 = null;
    }
    for (;;)
    {
      testJceAvailability(paramInt1);
      i = 0;
      localObject1 = null;
      try
      {
        List localList = paramPDFPassword.getPasswordBytes(false);
        i = 0;
        localObject1 = null;
        int j = 0;
        localObject1 = this.generalKeyBytes;
        if (localObject1 == null)
        {
          i = localList.size();
          if (j < i) {}
        }
        else
        {
          localObject1 = this.generalKeyBytes;
          if (localObject1 != null) {
            break;
          }
          localObject1 = new com/sun/pdfview/decrypt/PDFAuthenticationFailureException;
          ((PDFAuthenticationFailureException)localObject1).<init>("Password failed authentication for both owner and user password");
          throw ((Throwable)localObject1);
          i = 0;
          localObject1 = paramPDFObject.getAt(0);
          localObject2 = ((PDFObject)localObject1).getStream();
          continue;
        }
        Object localObject3 = localList.get(j);
        localObject3 = (byte[])localObject3;
        localObject1 = this;
        localObject1 = checkOwnerPassword((byte[])localObject3, (byte[])localObject2, paramInt1, paramInt2, paramArrayOfByte1, paramArrayOfByte2, paramInt3, paramBoolean);
        this.generalKeyBytes = ((byte[])localObject1);
        localObject1 = this.generalKeyBytes;
        if (localObject1 != null)
        {
          i = 1;
          this.ownerAuthorised = i;
        }
        for (;;)
        {
          i = j + 1;
          j = i;
          break;
          localObject1 = this;
          localObject1 = checkUserPassword((byte[])localObject3, (byte[])localObject2, paramInt1, paramInt2, paramArrayOfByte1, paramArrayOfByte2, paramInt3, paramBoolean);
          this.generalKeyBytes = ((byte[])localObject1);
        }
        String str;
        return;
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        localObject3 = new com/sun/pdfview/PDFParseException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("Unable to check passwords: ");
        str = localGeneralSecurityException.getMessage();
        localObject2 = str;
        ((PDFParseException)localObject3).<init>((String)localObject2, localGeneralSecurityException);
        throw ((Throwable)localObject3);
      }
    }
  }
  
  private byte[] calculateGeneralEncryptionKey(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, byte[] paramArrayOfByte3, int paramInt3, boolean paramBoolean)
  {
    int i = 4;
    byte[] arrayOfByte1 = padPassword(paramArrayOfByte1);
    MessageDigest localMessageDigest = createMD5Digest();
    localMessageDigest.reset();
    localMessageDigest.update(arrayOfByte1);
    localMessageDigest.update(paramArrayOfByte3);
    int j = (byte)(paramInt3 & 0xFF);
    localMessageDigest.update(j);
    j = (byte)(paramInt3 >> 8 & 0xFF);
    localMessageDigest.update(j);
    j = (byte)(paramInt3 >> 16 & 0xFF);
    localMessageDigest.update(j);
    j = (byte)(paramInt3 >> 24);
    localMessageDigest.update(j);
    if (paramArrayOfByte2 != null) {
      localMessageDigest.update(paramArrayOfByte2);
    }
    byte[] arrayOfByte2;
    label159:
    byte[] arrayOfByte3;
    if ((paramInt2 >= i) && (!paramBoolean))
    {
      j = 0;
      arrayOfByte1 = null;
      if (j < i) {}
    }
    else
    {
      arrayOfByte2 = localMessageDigest.digest();
      j = 2;
      if (paramInt2 != j) {
        break label230;
      }
      j = 5;
      arrayOfByte3 = new byte[j];
      j = 3;
      if (paramInt2 >= j)
      {
        j = 0;
        arrayOfByte1 = null;
      }
    }
    for (;;)
    {
      int k = 50;
      if (j >= k)
      {
        j = arrayOfByte3.length;
        System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, j);
        return arrayOfByte3;
        byte b = -1;
        localMessageDigest.update(b);
        j += 1;
        break;
        label230:
        j = paramInt1 / 8;
        break label159;
      }
      k = arrayOfByte3.length;
      localMessageDigest.update(arrayOfByte2, 0, k);
      digestTo(localMessageDigest, arrayOfByte2);
      j += 1;
    }
  }
  
  private byte[] calculateUValue(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    int i = 16;
    int j = 2;
    if (paramInt == j)
    {
      localObject1 = createRC4Cipher();
      localObject2 = createRC4Key(paramArrayOfByte1);
      initEncryption((a)localObject1, (SecretKey)localObject2);
      localObject2 = PW_PADDING;
      localObject1 = crypt((a)localObject1, (byte[])localObject2);
    }
    for (;;)
    {
      return (byte[])localObject1;
      j = 3;
      if (paramInt < j) {
        break;
      }
      localObject1 = createMD5Digest();
      localObject2 = PW_PADDING;
      ((MessageDigest)localObject1).update((byte[])localObject2);
      if (paramArrayOfByte2 != null) {
        ((MessageDigest)localObject1).update(paramArrayOfByte2);
      }
      localObject1 = ((MessageDigest)localObject1).digest();
      localObject2 = createRC4Cipher();
      Object localObject3 = createRC4Key(paramArrayOfByte1);
      initEncryption((a)localObject2, (SecretKey)localObject3);
      localObject3 = crypt((a)localObject2, (byte[])localObject1);
      rc4shuffle((byte[])localObject3, paramArrayOfByte1, (a)localObject2);
      boolean bool = $assertionsDisabled;
      if (!bool)
      {
        k = localObject3.length;
        if (k != i)
        {
          localObject1 = new java/lang/AssertionError;
          ((AssertionError)localObject1).<init>();
          throw ((Throwable)localObject1);
        }
      }
      int k = 32;
      localObject1 = new byte[k];
      int m = localObject3.length;
      System.arraycopy(localObject3, 0, localObject1, 0, m);
      m = localObject3.length;
      System.arraycopy(localObject3, 0, localObject1, i, m);
    }
    Object localObject1 = new com/sun/pdfview/decrypt/EncryptionUnsupportedByProductException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("Unsupported standard security handler revision ");
    localObject2 = paramInt;
    ((EncryptionUnsupportedByProductException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private byte[] calculuateOValue(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2)
  {
    Object localObject1 = getInitialOwnerPasswordKeyBytes(paramArrayOfByte1, paramInt1, paramInt2);
    a locala = createRC4Cipher();
    Object localObject2 = createRC4Key((byte[])localObject1);
    initEncryption(locala, (SecretKey)localObject2);
    localObject2 = padPassword(paramArrayOfByte2);
    localObject2 = crypt(locala, (byte[])localObject2);
    int i = 3;
    if (paramInt2 >= i) {
      rc4shuffle((byte[])localObject2, (byte[])localObject1, locala);
    }
    boolean bool = $assertionsDisabled;
    if (!bool)
    {
      int j = localObject2.length;
      int k = 32;
      if (j != k)
      {
        localObject1 = new java/lang/AssertionError;
        ((AssertionError)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    return (byte[])localObject2;
  }
  
  private void checkNums(int paramInt1, int paramInt2)
  {
    PDFParseException localPDFParseException;
    if (paramInt1 < 0)
    {
      localPDFParseException = new com/sun/pdfview/PDFParseException;
      localPDFParseException.<init>("Internal error: Object has bogus object number");
      throw localPDFParseException;
    }
    if (paramInt2 < 0)
    {
      localPDFParseException = new com/sun/pdfview/PDFParseException;
      localPDFParseException.<init>("Internal error: Object has bogus generation number");
      throw localPDFParseException;
    }
  }
  
  private byte[] checkOwnerPassword(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, int paramInt3, boolean paramBoolean)
  {
    Object localObject1 = getInitialOwnerPasswordKeyBytes(paramArrayOfByte1, paramInt1, paramInt2);
    Object localObject2 = createRC4Cipher();
    Object localObject3 = createRC4Key((byte[])localObject1);
    initDecryption((a)localObject2, (Key)localObject3);
    int i = 2;
    if (paramInt2 == i) {
      localObject3 = crypt((a)localObject2, paramArrayOfByte3);
    }
    for (;;)
    {
      localObject1 = this;
      localObject2 = paramArrayOfByte2;
      return checkUserPassword((byte[])localObject3, paramArrayOfByte2, paramInt1, paramInt2, paramArrayOfByte3, paramArrayOfByte4, paramInt3, paramBoolean);
      i = 3;
      if (paramInt2 < i) {
        break;
      }
      i = 32;
      localObject3 = new byte[i];
      int j = localObject3.length;
      System.arraycopy(paramArrayOfByte3, 0, localObject3, 0, j);
      rc4unshuffle((a)localObject2, (byte[])localObject3, (byte[])localObject1);
    }
    localObject1 = new com/sun/pdfview/decrypt/EncryptionUnsupportedByProductException;
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>("Unsupported revision: ");
    localObject3 = paramInt2;
    ((EncryptionUnsupportedByProductException)localObject1).<init>((String)localObject3);
    throw ((Throwable)localObject1);
  }
  
  private byte[] checkUserPassword(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, int paramInt3, boolean paramBoolean)
  {
    Object localObject1 = this;
    Object localObject2 = paramArrayOfByte1;
    int i = paramInt2;
    localObject2 = calculateGeneralEncryptionKey(paramArrayOfByte1, paramArrayOfByte2, paramInt1, paramInt2, paramArrayOfByte3, paramInt3, paramBoolean);
    byte[] arrayOfByte = calculateUValue((byte[])localObject2, paramArrayOfByte2, paramInt2);
    boolean bool = $assertionsDisabled;
    if (!bool)
    {
      j = arrayOfByte.length;
      k = 32;
      if (j != k)
      {
        localObject1 = new java/lang/AssertionError;
        ((AssertionError)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    int j = paramArrayOfByte4.length;
    int k = arrayOfByte.length;
    if (j != k)
    {
      localObject1 = new com/sun/pdfview/PDFParseException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("Improper U entry length; expected 32, is ");
      k = paramArrayOfByte4.length;
      localObject2 = k;
      ((PDFParseException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    j = 2;
    if (paramInt2 == j)
    {
      j = 32;
      k = 0;
    }
    for (;;)
    {
      if (k >= j) {}
      for (localObject1 = localObject2;; localObject1 = null)
      {
        return (byte[])localObject1;
        j = 16;
        break;
        i = paramArrayOfByte4[k];
        int m = arrayOfByte[k];
        if (i == m) {
          break label207;
        }
        j = 0;
      }
      label207:
      k += 1;
    }
  }
  
  private a createAESCipher()
  {
    return a.a("AES/CBC/PKCS5Padding");
  }
  
  private a createAndInitialiseContentCipher(b paramb, byte[] paramArrayOfByte)
  {
    int i = 2;
    Object localObject1 = this.encryptionAlgorithm;
    boolean bool = ((StandardDecrypter.EncryptionAlgorithm)localObject1).isRC4();
    if (bool)
    {
      localObject1 = a.a("RC4");
      localObject2 = createRC4Key(paramArrayOfByte);
      ((a)localObject1).a(i, (SecretKeySpec)localObject2);
    }
    for (;;)
    {
      return (a)localObject1;
      localObject1 = this.encryptionAlgorithm;
      bool = ((StandardDecrypter.EncryptionAlgorithm)localObject1).isAES();
      if (!bool) {
        break label157;
      }
      localObject1 = createAESCipher();
      int j = 16;
      localObject2 = new byte[j];
      int k = paramb.c();
      int m = localObject2.length;
      if (k < m) {
        break;
      }
      paramb.a((byte[])localObject2);
      localObject3 = new javax/crypto/spec/SecretKeySpec;
      ((SecretKeySpec)localObject3).<init>(paramArrayOfByte, "AES");
      IvParameterSpec localIvParameterSpec = new javax/crypto/spec/IvParameterSpec;
      localIvParameterSpec.<init>((byte[])localObject2);
      ((a)localObject1).a(i, (SecretKeySpec)localObject3, localIvParameterSpec);
    }
    localObject1 = new com/sun/pdfview/PDFParseException;
    ((PDFParseException)localObject1).<init>("AES encrypted stream too short - no room for initialisation vector");
    throw ((Throwable)localObject1);
    label157:
    localObject1 = new com/sun/pdfview/PDFParseException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>("Internal error - unhandled cipher type: ");
    Object localObject3 = this.encryptionAlgorithm;
    localObject2 = localObject3;
    ((PDFParseException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private MessageDigest createMD5Digest()
  {
    return MessageDigest.getInstance("MD5");
  }
  
  private a createRC4Cipher()
  {
    return a.a("RC4");
  }
  
  private SecretKeySpec createRC4Key(byte[] paramArrayOfByte)
  {
    SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
    localSecretKeySpec.<init>(paramArrayOfByte, "RC4");
    return localSecretKeySpec;
  }
  
  private byte[] crypt(a parama, byte[] paramArrayOfByte)
  {
    return parama.a(paramArrayOfByte);
  }
  
  private void cryptInPlace(a parama, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    parama.a(paramArrayOfByte, 0, i, paramArrayOfByte);
  }
  
  /* Error */
  private b decryptBuffer(b paramb, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial 320	com/sun/pdfview/decrypt/StandardDecrypter:createAndInitialiseContentCipher	(Lc/a/a/b/b;[B)Lc/a/a/a/a;
    //   6: astore_3
    //   7: aload_1
    //   8: invokevirtual 284	c/a/a/b/b:c	()I
    //   11: istore 4
    //   13: iload 4
    //   15: invokestatic 326	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   18: astore 5
    //   20: aload_1
    //   21: invokevirtual 330	c/a/a/b/b:r	()Ljava/nio/ByteBuffer;
    //   24: astore 6
    //   26: aload_3
    //   27: aload 6
    //   29: aload 5
    //   31: invokevirtual 333	c/a/a/a/a:a	(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V
    //   34: aload 5
    //   36: invokevirtual 337	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   39: pop
    //   40: aload 5
    //   42: invokestatic 340	c/a/a/b/b:a	(Ljava/nio/ByteBuffer;)Lc/a/a/b/b;
    //   45: areturn
    //   46: astore_3
    //   47: new 141	com/sun/pdfview/PDFParseException
    //   50: astore 5
    //   52: new 143	java/lang/StringBuilder
    //   55: astore 6
    //   57: aload 6
    //   59: ldc_w 342
    //   62: invokespecial 146	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   65: aload_3
    //   66: invokevirtual 152	java/security/GeneralSecurityException:getMessage	()Ljava/lang/String;
    //   69: astore 7
    //   71: aload 6
    //   73: aload 7
    //   75: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: astore 6
    //   83: aload 5
    //   85: aload 6
    //   87: aload_3
    //   88: invokespecial 162	com/sun/pdfview/PDFParseException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   91: aload 5
    //   93: athrow
    //   94: astore_3
    //   95: new 141	com/sun/pdfview/PDFParseException
    //   98: astore 5
    //   100: new 143	java/lang/StringBuilder
    //   103: astore 6
    //   105: aload 6
    //   107: ldc_w 344
    //   110: invokespecial 146	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   113: aload_3
    //   114: invokevirtual 152	java/security/GeneralSecurityException:getMessage	()Ljava/lang/String;
    //   117: astore 7
    //   119: aload 6
    //   121: aload 7
    //   123: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: astore 6
    //   131: aload 5
    //   133: aload 6
    //   135: aload_3
    //   136: invokespecial 162	com/sun/pdfview/PDFParseException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   139: aload 5
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	StandardDecrypter
    //   0	142	1	paramb	b
    //   0	142	2	paramArrayOfByte	byte[]
    //   6	21	3	locala	a
    //   46	42	3	localGeneralSecurityException1	GeneralSecurityException
    //   94	42	3	localGeneralSecurityException2	GeneralSecurityException
    //   11	3	4	i	int
    //   18	122	5	localObject1	Object
    //   24	110	6	localObject2	Object
    //   69	53	7	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	46	java/security/GeneralSecurityException
    //   7	11	94	java/security/GeneralSecurityException
    //   13	18	94	java/security/GeneralSecurityException
    //   20	24	94	java/security/GeneralSecurityException
    //   29	34	94	java/security/GeneralSecurityException
    //   34	40	94	java/security/GeneralSecurityException
    //   40	45	94	java/security/GeneralSecurityException
  }
  
  private void digestTo(MessageDigest paramMessageDigest, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    paramMessageDigest.digest(paramArrayOfByte, 0, i);
  }
  
  private byte[] getInitialOwnerPasswordKeyBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    MessageDigest localMessageDigest = createMD5Digest();
    byte[] arrayOfByte1 = padPassword(paramArrayOfByte);
    localMessageDigest.update(arrayOfByte1);
    byte[] arrayOfByte2 = localMessageDigest.digest();
    int i = 3;
    if (paramInt2 >= i)
    {
      i = 0;
      arrayOfByte1 = null;
    }
    for (;;)
    {
      int j = 50;
      if (i >= j)
      {
        arrayOfByte1 = new byte[paramInt1 / 8];
        int k = arrayOfByte1.length;
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, k);
        return arrayOfByte1;
      }
      localMessageDigest.update(arrayOfByte2);
      digestTo(localMessageDigest, arrayOfByte2);
      i += 1;
    }
  }
  
  private byte[] getObjectSaltedDecryptionKey(int paramInt1, int paramInt2)
  {
    try
    {
      Object localObject1 = createMD5Digest();
      localObject2 = this.generalKeyBytes;
      ((MessageDigest)localObject1).update((byte[])localObject2);
      byte b = (byte)paramInt1;
      ((MessageDigest)localObject1).update(b);
      b = (byte)(paramInt1 >> 8);
      ((MessageDigest)localObject1).update(b);
      b = (byte)(paramInt1 >> 16);
      ((MessageDigest)localObject1).update(b);
      b = (byte)paramInt2;
      ((MessageDigest)localObject1).update(b);
      b = (byte)(paramInt2 >> 8);
      ((MessageDigest)localObject1).update(b);
      localObject2 = this.encryptionAlgorithm;
      Object localObject3 = StandardDecrypter.EncryptionAlgorithm.AESV2;
      if (localObject2 == localObject3)
      {
        localObject2 = AESV2_SALT;
        ((MessageDigest)localObject1).update((byte[])localObject2);
      }
      localObject1 = ((MessageDigest)localObject1).digest();
      int i = getSaltedContentKeyByteLength();
      localObject3 = new byte[i];
      System.arraycopy(localObject1, 0, localObject3, 0, i);
      return (byte[])localObject3;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      Object localObject2 = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject2).<init>("Unable to get MD5 digester", localNoSuchAlgorithmException);
      throw ((Throwable)localObject2);
    }
  }
  
  private int getSaltedContentKeyByteLength()
  {
    int i = this.generalKeyBytes.length;
    return getSaltedContentKeyByteLength(i);
  }
  
  private int getSaltedContentKeyByteLength(int paramInt)
  {
    return Math.min(paramInt + 5, 16);
  }
  
  private byte[] getUnsaltedDecryptionKey()
  {
    return this.generalKeyBytes;
  }
  
  private void initDecryption(a parama, Key paramKey)
  {
    parama.a(2, paramKey);
  }
  
  private void initEncryption(a parama, SecretKey paramSecretKey)
  {
    parama.a(1, paramSecretKey);
  }
  
  private byte[] padPassword(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      paramArrayOfByte = new byte[0];
    }
    byte[] arrayOfByte1 = new byte[32];
    int i = paramArrayOfByte.length;
    int j = arrayOfByte1.length;
    if (i > j) {}
    for (i = arrayOfByte1.length;; i = paramArrayOfByte.length)
    {
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 0, i);
      i = paramArrayOfByte.length;
      j = arrayOfByte1.length;
      if (i < j)
      {
        byte[] arrayOfByte2 = PW_PADDING;
        j = paramArrayOfByte.length;
        int k = arrayOfByte1.length;
        int m = paramArrayOfByte.length;
        k -= m;
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, j, k);
      }
      return arrayOfByte1;
    }
  }
  
  private void rc4shuffle(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, a parama)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte2.length];
    int i = 1;
    int j = i;
    i = 19;
    if (j > i) {
      return;
    }
    i = 0;
    SecretKeySpec localSecretKeySpec = null;
    for (;;)
    {
      int k = arrayOfByte.length;
      if (i >= k)
      {
        localSecretKeySpec = createRC4Key(arrayOfByte);
        initEncryption(parama, localSecretKeySpec);
        cryptInPlace(parama, paramArrayOfByte1);
        i = j + 1;
        j = i;
        break;
      }
      k = (byte)(paramArrayOfByte2[i] ^ j);
      arrayOfByte[i] = k;
      i += 1;
    }
  }
  
  private void rc4unshuffle(a parama, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte2.length];
    int i = 19;
    int j = i;
    if (j < 0) {
      return;
    }
    i = 0;
    SecretKeySpec localSecretKeySpec = null;
    for (;;)
    {
      int k = arrayOfByte.length;
      if (i >= k)
      {
        localSecretKeySpec = createRC4Key(arrayOfByte);
        initDecryption(parama, localSecretKeySpec);
        cryptInPlace(parama, paramArrayOfByte1);
        i = j + -1;
        j = i;
        break;
      }
      k = (byte)(paramArrayOfByte2[i] ^ j);
      arrayOfByte[i] = k;
      i += 1;
    }
  }
  
  /* Error */
  private void testJceAvailability(int paramInt)
  {
    // Byte code:
    //   0: bipush -82
    //   2: istore_2
    //   3: bipush 16
    //   5: istore_3
    //   6: iload_3
    //   7: newarray <illegal type>
    //   9: astore 4
    //   11: aload 4
    //   13: iload_2
    //   14: invokestatic 382	java/util/Arrays:fill	([BB)V
    //   17: iload_1
    //   18: bipush 8
    //   20: idiv
    //   21: istore 5
    //   23: aload_0
    //   24: iload 5
    //   26: invokespecial 360	com/sun/pdfview/decrypt/StandardDecrypter:getSaltedContentKeyByteLength	(I)I
    //   29: istore 5
    //   31: iload 5
    //   33: newarray <illegal type>
    //   35: astore 6
    //   37: aload 6
    //   39: iload_2
    //   40: invokestatic 382	java/util/Arrays:fill	([BB)V
    //   43: aload 4
    //   45: invokestatic 386	c/a/a/b/b:d	([B)Lc/a/a/b/b;
    //   48: astore 4
    //   50: aload_0
    //   51: aload 4
    //   53: aload 6
    //   55: invokespecial 320	com/sun/pdfview/decrypt/StandardDecrypter:createAndInitialiseContentCipher	(Lc/a/a/b/b;[B)Lc/a/a/a/a;
    //   58: pop
    //   59: aload_0
    //   60: invokespecial 170	com/sun/pdfview/decrypt/StandardDecrypter:createMD5Digest	()Ljava/security/MessageDigest;
    //   63: pop
    //   64: aload_0
    //   65: getfield 92	com/sun/pdfview/decrypt/StandardDecrypter:encryptionAlgorithm	Lcom/sun/pdfview/decrypt/StandardDecrypter$EncryptionAlgorithm;
    //   68: astore 4
    //   70: getstatic 388	com/sun/pdfview/decrypt/StandardDecrypter$EncryptionAlgorithm:RC4	Lcom/sun/pdfview/decrypt/StandardDecrypter$EncryptionAlgorithm;
    //   73: astore 7
    //   75: aload 4
    //   77: aload 7
    //   79: if_acmpeq +40 -> 119
    //   82: aload_0
    //   83: invokespecial 203	com/sun/pdfview/decrypt/StandardDecrypter:createRC4Cipher	()Lc/a/a/a/a;
    //   86: astore 4
    //   88: iconst_5
    //   89: istore 8
    //   91: iload 8
    //   93: newarray <illegal type>
    //   95: astore 7
    //   97: aload 6
    //   99: iload_2
    //   100: invokestatic 382	java/util/Arrays:fill	([BB)V
    //   103: aload_0
    //   104: aload 7
    //   106: invokespecial 207	com/sun/pdfview/decrypt/StandardDecrypter:createRC4Key	([B)Ljavax/crypto/spec/SecretKeySpec;
    //   109: astore 6
    //   111: aload_0
    //   112: aload 4
    //   114: aload 6
    //   116: invokespecial 243	com/sun/pdfview/decrypt/StandardDecrypter:initDecryption	(Lc/a/a/a/a;Ljava/security/Key;)V
    //   119: return
    //   120: astore 4
    //   122: new 141	com/sun/pdfview/PDFParseException
    //   125: astore 6
    //   127: new 143	java/lang/StringBuilder
    //   130: astore 7
    //   132: aload 7
    //   134: ldc_w 390
    //   137: invokespecial 146	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   140: aload 4
    //   142: invokevirtual 391	com/sun/pdfview/PDFParseException:getMessage	()Ljava/lang/String;
    //   145: astore 4
    //   147: aload 7
    //   149: aload 4
    //   151: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: astore 4
    //   159: aload 6
    //   161: aload 4
    //   163: invokespecial 237	com/sun/pdfview/PDFParseException:<init>	(Ljava/lang/String;)V
    //   166: aload 6
    //   168: athrow
    //   169: astore 4
    //   171: new 393	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException
    //   174: astore 6
    //   176: aload 6
    //   178: ldc_w 395
    //   181: aload 4
    //   183: invokespecial 396	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   186: aload 6
    //   188: athrow
    //   189: astore 4
    //   191: new 393	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException
    //   194: astore 6
    //   196: aload 6
    //   198: ldc_w 398
    //   201: aload 4
    //   203: invokespecial 396	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   206: aload 6
    //   208: athrow
    //   209: astore 4
    //   211: new 393	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException
    //   214: astore 6
    //   216: new 143	java/lang/StringBuilder
    //   219: astore 7
    //   221: aload 7
    //   223: ldc_w 400
    //   226: invokespecial 146	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   229: aload_0
    //   230: invokespecial 353	com/sun/pdfview/decrypt/StandardDecrypter:getSaltedContentKeyByteLength	()I
    //   233: bipush 8
    //   235: imul
    //   236: istore_2
    //   237: aload 7
    //   239: iload_2
    //   240: invokevirtual 229	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   243: ldc_w 402
    //   246: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   252: astore 7
    //   254: aload 6
    //   256: aload 7
    //   258: aload 4
    //   260: invokespecial 396	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   263: aload 6
    //   265: athrow
    //   266: astore 4
    //   268: new 393	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException
    //   271: astore 6
    //   273: aload 6
    //   275: ldc_w 404
    //   278: aload 4
    //   280: invokespecial 396	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   283: aload 6
    //   285: athrow
    //   286: astore 4
    //   288: new 393	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException
    //   291: astore 6
    //   293: aload 6
    //   295: ldc_w 406
    //   298: aload 4
    //   300: invokespecial 396	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   303: aload 6
    //   305: athrow
    //   306: astore 4
    //   308: new 393	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException
    //   311: astore 6
    //   313: aload 6
    //   315: ldc_w 408
    //   318: aload 4
    //   320: invokespecial 396	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   323: aload 6
    //   325: athrow
    //   326: astore 4
    //   328: new 393	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException
    //   331: astore 6
    //   333: aload 6
    //   335: ldc_w 410
    //   338: aload 4
    //   340: invokespecial 396	com/sun/pdfview/decrypt/EncryptionUnsupportedByPlatformException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   343: aload 6
    //   345: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	346	0	this	StandardDecrypter
    //   0	346	1	paramInt	int
    //   2	98	2	b	byte
    //   236	4	2	i	int
    //   5	2	3	j	int
    //   9	104	4	localObject1	Object
    //   120	21	4	localPDFParseException	PDFParseException
    //   145	17	4	str	String
    //   169	13	4	localNoSuchAlgorithmException1	NoSuchAlgorithmException
    //   189	13	4	localNoSuchPaddingException	javax.crypto.NoSuchPaddingException
    //   209	50	4	localInvalidKeyException1	java.security.InvalidKeyException
    //   266	13	4	localInvalidAlgorithmParameterException	java.security.InvalidAlgorithmParameterException
    //   286	13	4	localNoSuchAlgorithmException2	NoSuchAlgorithmException
    //   306	13	4	localGeneralSecurityException	GeneralSecurityException
    //   326	13	4	localInvalidKeyException2	java.security.InvalidKeyException
    //   21	11	5	k	int
    //   35	309	6	localObject2	Object
    //   73	184	7	localObject3	Object
    //   89	3	8	m	int
    // Exception table:
    //   from	to	target	type
    //   43	48	120	com/sun/pdfview/PDFParseException
    //   53	59	120	com/sun/pdfview/PDFParseException
    //   43	48	169	java/security/NoSuchAlgorithmException
    //   53	59	169	java/security/NoSuchAlgorithmException
    //   43	48	189	javax/crypto/NoSuchPaddingException
    //   53	59	189	javax/crypto/NoSuchPaddingException
    //   43	48	209	java/security/InvalidKeyException
    //   53	59	209	java/security/InvalidKeyException
    //   43	48	266	java/security/InvalidAlgorithmParameterException
    //   53	59	266	java/security/InvalidAlgorithmParameterException
    //   59	64	286	java/security/NoSuchAlgorithmException
    //   82	86	306	java/security/GeneralSecurityException
    //   104	109	326	java/security/InvalidKeyException
    //   114	119	326	java/security/InvalidKeyException
  }
  
  public b decryptBuffer(String paramString, PDFObject paramPDFObject, b paramb)
  {
    if (paramString != null)
    {
      localObject = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject).<init>("This encryption version does not support Crypt filters");
      throw ((Throwable)localObject);
    }
    int i;
    int j;
    if (paramPDFObject != null)
    {
      i = paramPDFObject.getObjNum();
      j = paramPDFObject.getObjGen();
      checkNums(i, j);
    }
    if (paramPDFObject == null) {}
    for (Object localObject = getUnsaltedDecryptionKey();; localObject = getObjectSaltedDecryptionKey(i, j))
    {
      return decryptBuffer(paramb, (byte[])localObject);
      i = paramPDFObject.getObjNum();
      j = paramPDFObject.getObjGen();
    }
  }
  
  public String decryptString(int paramInt1, int paramInt2, String paramString)
  {
    Object localObject = PDFStringUtil.asBytes(paramString);
    byte[] arrayOfByte = getObjectSaltedDecryptionKey(paramInt1, paramInt2);
    localObject = b.d((byte[])localObject);
    localObject = decryptBuffer((b)localObject, arrayOfByte);
    arrayOfByte = ((b)localObject).i();
    int i = ((b)localObject).h();
    int j = ((b)localObject).f();
    return PDFStringUtil.asBasicString(arrayOfByte, i, j);
  }
  
  public boolean isEncryptionPresent()
  {
    return true;
  }
  
  public boolean isOwnerAuthorised()
  {
    return this.ownerAuthorised;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decrypt\StandardDecrypter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */