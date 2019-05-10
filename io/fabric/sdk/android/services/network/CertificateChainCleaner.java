package io.fabric.sdk.android.services.network;

import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import javax.security.auth.x500.X500Principal;

final class CertificateChainCleaner
{
  public static X509Certificate[] getCleanChain(X509Certificate[] paramArrayOfX509Certificate, SystemKeyStore paramSystemKeyStore)
  {
    int i = 0;
    float f1 = 0.0F;
    X509Certificate localX509Certificate1 = null;
    int j = 1;
    float f2 = Float.MIN_VALUE;
    LinkedList localLinkedList = new java/util/LinkedList;
    localLinkedList.<init>();
    Object localObject = paramArrayOfX509Certificate[0];
    int k = paramSystemKeyStore.isTrustRoot((X509Certificate)localObject);
    if (k != 0) {
      k = j;
    }
    for (float f3 = f2;; f3 = 0.0F)
    {
      localX509Certificate1 = paramArrayOfX509Certificate[0];
      localLinkedList.add(localX509Certificate1);
      i = k;
      f1 = f3;
      k = j;
      f3 = f2;
      for (;;)
      {
        int n = paramArrayOfX509Certificate.length;
        if (k >= n) {
          break;
        }
        X509Certificate localX509Certificate2 = paramArrayOfX509Certificate[k];
        boolean bool = paramSystemKeyStore.isTrustRoot(localX509Certificate2);
        if (bool)
        {
          i = j;
          f1 = f2;
        }
        localX509Certificate2 = paramArrayOfX509Certificate[k];
        int i1 = k + -1;
        X509Certificate localX509Certificate3 = paramArrayOfX509Certificate[i1];
        bool = isValidLink(localX509Certificate2, localX509Certificate3);
        if (!bool) {
          break;
        }
        localX509Certificate2 = paramArrayOfX509Certificate[k];
        localLinkedList.add(localX509Certificate2);
        k += 1;
      }
      m += -1;
      localObject = paramArrayOfX509Certificate[m];
      localObject = paramSystemKeyStore.getTrustRootFor((X509Certificate)localObject);
      if (localObject != null) {
        localLinkedList.add(localObject);
      }
      for (;;)
      {
        if (j != 0)
        {
          localObject = new X509Certificate[localLinkedList.size()];
          return (X509Certificate[])localLinkedList.toArray((Object[])localObject);
        }
        localObject = new java/security/cert/CertificateException;
        ((CertificateException)localObject).<init>("Didn't find a trust anchor in chain cleanup!");
        throw ((Throwable)localObject);
        j = i;
        f2 = f1;
      }
      int m = 0;
      localObject = null;
    }
  }
  
  private static boolean isValidLink(X509Certificate paramX509Certificate1, X509Certificate paramX509Certificate2)
  {
    boolean bool1 = false;
    Object localObject = paramX509Certificate1.getSubjectX500Principal();
    X500Principal localX500Principal = paramX509Certificate2.getIssuerX500Principal();
    boolean bool2 = ((X500Principal)localObject).equals(localX500Principal);
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      try
      {
        localObject = paramX509Certificate1.getPublicKey();
        paramX509Certificate2.verify((PublicKey)localObject);
        bool1 = true;
      }
      catch (GeneralSecurityException localGeneralSecurityException) {}
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\CertificateChainCleaner.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */