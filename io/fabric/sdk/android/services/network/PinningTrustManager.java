package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

class PinningTrustManager
  implements X509TrustManager
{
  private static final X509Certificate[] NO_ISSUERS = new X509Certificate[0];
  private static final long PIN_FRESHNESS_DURATION_MILLIS = 15552000000L;
  private final Set cache;
  private final long pinCreationTimeMillis;
  private final List pins;
  private final SystemKeyStore systemKeyStore;
  private final TrustManager[] systemTrustManagers;
  
  public PinningTrustManager(SystemKeyStore paramSystemKeyStore, PinningInfoProvider paramPinningInfoProvider)
  {
    Object localObject1 = new java/util/LinkedList;
    ((LinkedList)localObject1).<init>();
    this.pins = ((List)localObject1);
    localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    localObject1 = Collections.synchronizedSet((Set)localObject1);
    this.cache = ((Set)localObject1);
    localObject1 = initializeSystemTrustManagers(paramSystemKeyStore);
    this.systemTrustManagers = ((TrustManager[])localObject1);
    this.systemKeyStore = paramSystemKeyStore;
    long l = paramPinningInfoProvider.getPinCreationTimeInMillis();
    this.pinCreationTimeMillis = l;
    String[] arrayOfString = paramPinningInfoProvider.getPins();
    int i = arrayOfString.length;
    int j = 0;
    localObject1 = null;
    while (j < i)
    {
      Object localObject2 = arrayOfString[j];
      List localList = this.pins;
      localObject2 = hexStringToByteArray((String)localObject2);
      localList.add(localObject2);
      j += 1;
    }
  }
  
  private void checkPinTrust(X509Certificate[] paramArrayOfX509Certificate)
  {
    long l1 = 15552000000L;
    long l2 = this.pinCreationTimeMillis;
    long l3 = -1;
    int i = l2 < l3;
    String str;
    if (i != 0)
    {
      l2 = System.currentTimeMillis();
      l3 = this.pinCreationTimeMillis;
      l2 -= l3;
      i = l2 < l1;
      if (i > 0)
      {
        localObject1 = Fabric.getLogger();
        localObject2 = "Fabric";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Certificate pins are stale, (");
        long l4 = System.currentTimeMillis();
        long l5 = this.pinCreationTimeMillis;
        l4 -= l5;
        localObject3 = ((StringBuilder)localObject3).append(l4).append(" millis vs ").append(l1);
        str = " millis) falling back to system trust.";
        localObject3 = str;
        ((Logger)localObject1).w((String)localObject2, (String)localObject3);
        return;
      }
    }
    Object localObject1 = this.systemKeyStore;
    Object localObject2 = CertificateChainCleaner.getCleanChain(paramArrayOfX509Certificate, (SystemKeyStore)localObject1);
    int k = localObject2.length;
    i = 0;
    localObject1 = null;
    for (;;)
    {
      if (i >= k) {
        break label208;
      }
      str = localObject2[i];
      boolean bool = isValidPin(str);
      if (bool) {
        break;
      }
      int j;
      i += 1;
    }
    label208:
    localObject1 = new java/security/cert/CertificateException;
    ((CertificateException)localObject1).<init>("No valid pins found in chain!");
    throw ((Throwable)localObject1);
  }
  
  private void checkSystemTrust(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    TrustManager[] arrayOfTrustManager = this.systemTrustManagers;
    int i = arrayOfTrustManager.length;
    int j = 0;
    X509TrustManager localX509TrustManager = null;
    for (int k = 0; k < i; k = j)
    {
      localX509TrustManager = (X509TrustManager)arrayOfTrustManager[k];
      localX509TrustManager.checkServerTrusted(paramArrayOfX509Certificate, paramString);
      j = k + 1;
    }
  }
  
  private byte[] hexStringToByteArray(String paramString)
  {
    int i = 16;
    int j = paramString.length();
    byte[] arrayOfByte = new byte[j / 2];
    int k = 0;
    while (k < j)
    {
      int m = k / 2;
      int n = Character.digit(paramString.charAt(k), i) << 4;
      int i1 = k + 1;
      i1 = Character.digit(paramString.charAt(i1), i);
      n = (byte)(n + i1);
      arrayOfByte[m] = n;
      k += 2;
    }
    return arrayOfByte;
  }
  
  private TrustManager[] initializeSystemTrustManagers(SystemKeyStore paramSystemKeyStore)
  {
    Object localObject1 = "X509";
    try
    {
      localObject1 = TrustManagerFactory.getInstance((String)localObject1);
      localObject2 = paramSystemKeyStore.trustStore;
      ((TrustManagerFactory)localObject1).init((KeyStore)localObject2);
      return ((TrustManagerFactory)localObject1).getTrustManagers();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localObject2 = new java/lang/AssertionError;
      ((AssertionError)localObject2).<init>(localNoSuchAlgorithmException);
      throw ((Throwable)localObject2);
    }
    catch (KeyStoreException localKeyStoreException)
    {
      Object localObject2 = new java/lang/AssertionError;
      ((AssertionError)localObject2).<init>(localKeyStoreException);
      throw ((Throwable)localObject2);
    }
  }
  
  /* Error */
  private boolean isValidPin(X509Certificate paramX509Certificate)
  {
    // Byte code:
    //   0: ldc -68
    //   2: astore_2
    //   3: aload_2
    //   4: invokestatic 193	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   7: astore_2
    //   8: aload_1
    //   9: invokevirtual 197	java/security/cert/X509Certificate:getPublicKey	()Ljava/security/PublicKey;
    //   12: astore_3
    //   13: aload_3
    //   14: invokeinterface 203 1 0
    //   19: astore_3
    //   20: aload_2
    //   21: aload_3
    //   22: invokevirtual 207	java/security/MessageDigest:digest	([B)[B
    //   25: astore_3
    //   26: aload_0
    //   27: getfield 35	io/fabric/sdk/android/services/network/PinningTrustManager:pins	Ljava/util/List;
    //   30: astore_2
    //   31: aload_2
    //   32: invokeinterface 211 1 0
    //   37: astore 4
    //   39: aload 4
    //   41: invokeinterface 217 1 0
    //   46: istore 5
    //   48: iload 5
    //   50: ifeq +34 -> 84
    //   53: aload 4
    //   55: invokeinterface 221 1 0
    //   60: astore_2
    //   61: aload_2
    //   62: checkcast 223	[B
    //   65: astore_2
    //   66: aload_2
    //   67: aload_3
    //   68: invokestatic 229	java/util/Arrays:equals	([B[B)Z
    //   71: istore 5
    //   73: iload 5
    //   75: ifeq -36 -> 39
    //   78: iconst_1
    //   79: istore 5
    //   81: iload 5
    //   83: ireturn
    //   84: iconst_0
    //   85: istore 5
    //   87: aconst_null
    //   88: astore_2
    //   89: goto -8 -> 81
    //   92: astore_2
    //   93: new 129	java/security/cert/CertificateException
    //   96: astore_3
    //   97: aload_3
    //   98: aload_2
    //   99: invokespecial 233	java/security/cert/CertificateException:<init>	(Ljava/lang/Throwable;)V
    //   102: aload_3
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	PinningTrustManager
    //   0	104	1	paramX509Certificate	X509Certificate
    //   2	87	2	localObject1	Object
    //   92	7	2	localNoSuchAlgorithmException	NoSuchAlgorithmException
    //   12	91	3	localObject2	Object
    //   37	17	4	localIterator	java.util.Iterator
    //   46	40	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	7	92	java/security/NoSuchAlgorithmException
    //   8	12	92	java/security/NoSuchAlgorithmException
    //   13	19	92	java/security/NoSuchAlgorithmException
    //   21	25	92	java/security/NoSuchAlgorithmException
    //   26	30	92	java/security/NoSuchAlgorithmException
    //   31	37	92	java/security/NoSuchAlgorithmException
    //   39	46	92	java/security/NoSuchAlgorithmException
    //   53	60	92	java/security/NoSuchAlgorithmException
    //   61	65	92	java/security/NoSuchAlgorithmException
    //   67	71	92	java/security/NoSuchAlgorithmException
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    CertificateException localCertificateException = new java/security/cert/CertificateException;
    localCertificateException.<init>("Client certificates not supported!");
    throw localCertificateException;
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    Set localSet = this.cache;
    X509Certificate localX509Certificate = paramArrayOfX509Certificate[0];
    boolean bool = localSet.contains(localX509Certificate);
    if (bool) {}
    for (;;)
    {
      return;
      checkSystemTrust(paramArrayOfX509Certificate, paramString);
      checkPinTrust(paramArrayOfX509Certificate);
      localSet = this.cache;
      localX509Certificate = paramArrayOfX509Certificate[0];
      localSet.add(localX509Certificate);
    }
  }
  
  public X509Certificate[] getAcceptedIssuers()
  {
    return NO_ISSUERS;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\PinningTrustManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */