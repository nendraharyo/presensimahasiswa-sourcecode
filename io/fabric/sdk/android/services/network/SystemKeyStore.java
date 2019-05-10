package io.fabric.sdk.android.services.network;

import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;
import javax.security.auth.x500.X500Principal;

class SystemKeyStore
{
  private final HashMap trustRoots;
  final KeyStore trustStore;
  
  public SystemKeyStore(InputStream paramInputStream, String paramString)
  {
    KeyStore localKeyStore = getTrustStore(paramInputStream, paramString);
    HashMap localHashMap = initializeTrustedRoots(localKeyStore);
    this.trustRoots = localHashMap;
    this.trustStore = localKeyStore;
  }
  
  /* Error */
  private KeyStore getTrustStore(InputStream paramInputStream, String paramString)
  {
    // Byte code:
    //   0: ldc 26
    //   2: astore_3
    //   3: aload_3
    //   4: invokestatic 32	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   7: astore_3
    //   8: new 34	java/io/BufferedInputStream
    //   11: astore 4
    //   13: aload 4
    //   15: aload_1
    //   16: invokespecial 37	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   19: aload_2
    //   20: invokevirtual 43	java/lang/String:toCharArray	()[C
    //   23: astore 5
    //   25: aload_3
    //   26: aload 4
    //   28: aload 5
    //   30: invokevirtual 47	java/security/KeyStore:load	(Ljava/io/InputStream;[C)V
    //   33: aload 4
    //   35: invokevirtual 50	java/io/BufferedInputStream:close	()V
    //   38: aload_3
    //   39: areturn
    //   40: astore_3
    //   41: aload 4
    //   43: invokevirtual 50	java/io/BufferedInputStream:close	()V
    //   46: aload_3
    //   47: athrow
    //   48: astore_3
    //   49: new 52	java/lang/AssertionError
    //   52: astore 4
    //   54: aload 4
    //   56: aload_3
    //   57: invokespecial 55	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   60: aload 4
    //   62: athrow
    //   63: astore_3
    //   64: new 52	java/lang/AssertionError
    //   67: astore 4
    //   69: aload 4
    //   71: aload_3
    //   72: invokespecial 55	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   75: aload 4
    //   77: athrow
    //   78: astore_3
    //   79: new 52	java/lang/AssertionError
    //   82: astore 4
    //   84: aload 4
    //   86: aload_3
    //   87: invokespecial 55	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   90: aload 4
    //   92: athrow
    //   93: astore_3
    //   94: new 52	java/lang/AssertionError
    //   97: astore 4
    //   99: aload 4
    //   101: aload_3
    //   102: invokespecial 55	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   105: aload 4
    //   107: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	SystemKeyStore
    //   0	108	1	paramInputStream	InputStream
    //   0	108	2	paramString	String
    //   2	37	3	localObject1	Object
    //   40	7	3	localObject2	Object
    //   48	9	3	localKeyStoreException	KeyStoreException
    //   63	9	3	localNoSuchAlgorithmException	java.security.NoSuchAlgorithmException
    //   78	9	3	localCertificateException	java.security.cert.CertificateException
    //   93	9	3	localIOException	java.io.IOException
    //   11	95	4	localObject3	Object
    //   23	6	5	arrayOfChar	char[]
    // Exception table:
    //   from	to	target	type
    //   19	23	40	finally
    //   28	33	40	finally
    //   3	7	48	java/security/KeyStoreException
    //   8	11	48	java/security/KeyStoreException
    //   15	19	48	java/security/KeyStoreException
    //   33	38	48	java/security/KeyStoreException
    //   41	46	48	java/security/KeyStoreException
    //   46	48	48	java/security/KeyStoreException
    //   3	7	63	java/security/NoSuchAlgorithmException
    //   8	11	63	java/security/NoSuchAlgorithmException
    //   15	19	63	java/security/NoSuchAlgorithmException
    //   33	38	63	java/security/NoSuchAlgorithmException
    //   41	46	63	java/security/NoSuchAlgorithmException
    //   46	48	63	java/security/NoSuchAlgorithmException
    //   3	7	78	java/security/cert/CertificateException
    //   8	11	78	java/security/cert/CertificateException
    //   15	19	78	java/security/cert/CertificateException
    //   33	38	78	java/security/cert/CertificateException
    //   41	46	78	java/security/cert/CertificateException
    //   46	48	78	java/security/cert/CertificateException
    //   3	7	93	java/io/IOException
    //   8	11	93	java/io/IOException
    //   15	19	93	java/io/IOException
    //   33	38	93	java/io/IOException
    //   41	46	93	java/io/IOException
    //   46	48	93	java/io/IOException
  }
  
  private HashMap initializeTrustedRoots(KeyStore paramKeyStore)
  {
    try
    {
      Object localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      Enumeration localEnumeration = paramKeyStore.aliases();
      for (;;)
      {
        boolean bool = localEnumeration.hasMoreElements();
        if (!bool) {
          break;
        }
        Object localObject2 = localEnumeration.nextElement();
        localObject2 = (String)localObject2;
        localObject2 = paramKeyStore.getCertificate((String)localObject2);
        localObject2 = (X509Certificate)localObject2;
        if (localObject2 != null)
        {
          X500Principal localX500Principal = ((X509Certificate)localObject2).getSubjectX500Principal();
          ((HashMap)localObject1).put(localX500Principal, localObject2);
        }
      }
      return (HashMap)localObject1;
    }
    catch (KeyStoreException localKeyStoreException)
    {
      localObject1 = new java/lang/AssertionError;
      ((AssertionError)localObject1).<init>(localKeyStoreException);
      throw ((Throwable)localObject1);
    }
  }
  
  public X509Certificate getTrustRootFor(X509Certificate paramX509Certificate)
  {
    Object localObject1 = this.trustRoots;
    Object localObject3 = paramX509Certificate.getIssuerX500Principal();
    localObject1 = (X509Certificate)((HashMap)localObject1).get(localObject3);
    if (localObject1 == null) {
      localObject1 = null;
    }
    for (;;)
    {
      return (X509Certificate)localObject1;
      localObject3 = ((X509Certificate)localObject1).getSubjectX500Principal();
      X500Principal localX500Principal = paramX509Certificate.getSubjectX500Principal();
      boolean bool = ((X500Principal)localObject3).equals(localX500Principal);
      if (bool) {
        localObject1 = null;
      } else {
        try
        {
          localObject3 = ((X509Certificate)localObject1).getPublicKey();
          paramX509Certificate.verify((PublicKey)localObject3);
        }
        catch (GeneralSecurityException localGeneralSecurityException)
        {
          Object localObject2 = null;
        }
      }
    }
  }
  
  public boolean isTrustRoot(X509Certificate paramX509Certificate)
  {
    Object localObject1 = this.trustRoots;
    Object localObject2 = paramX509Certificate.getSubjectX500Principal();
    localObject1 = (X509Certificate)((HashMap)localObject1).get(localObject2);
    boolean bool;
    if (localObject1 != null)
    {
      localObject1 = ((X509Certificate)localObject1).getPublicKey();
      localObject2 = paramX509Certificate.getPublicKey();
      bool = localObject1.equals(localObject2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\SystemKeyStore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */