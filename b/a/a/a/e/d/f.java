package b.a.a.a.e.d;

import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;

public class f
{
  private String a;
  private Set b;
  private Set c;
  private SecureRandom d;
  
  public f()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.b = localHashSet;
    localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.c = localHashSet;
  }
  
  public f a(String paramString)
  {
    this.a = paramString;
    return this;
  }
  
  public f a(KeyStore paramKeyStore)
  {
    return a(paramKeyStore, null);
  }
  
  public f a(KeyStore paramKeyStore, k paramk)
  {
    int i = 0;
    Object localObject1 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    ((TrustManagerFactory)localObject1).init(paramKeyStore);
    TrustManager[] arrayOfTrustManager = ((TrustManagerFactory)localObject1).getTrustManagers();
    if (arrayOfTrustManager != null)
    {
      TrustManager localTrustManager;
      Object localObject2;
      if (paramk != null)
      {
        int j = 0;
        localTrustManager = null;
        for (;;)
        {
          k = arrayOfTrustManager.length;
          if (j >= k) {
            break;
          }
          localObject1 = arrayOfTrustManager[j];
          boolean bool = localObject1 instanceof X509TrustManager;
          if (bool)
          {
            localObject2 = new b/a/a/a/e/d/f$b;
            localObject1 = (X509TrustManager)localObject1;
            ((f.b)localObject2).<init>((X509TrustManager)localObject1, paramk);
            arrayOfTrustManager[j] = localObject2;
          }
          k = j + 1;
          j = k;
        }
      }
      int k = arrayOfTrustManager.length;
      while (i < k)
      {
        localTrustManager = arrayOfTrustManager[i];
        localObject2 = this.c;
        ((Set)localObject2).add(localTrustManager);
        i += 1;
      }
    }
    return this;
  }
  
  public f a(KeyStore paramKeyStore, char[] paramArrayOfChar)
  {
    a(paramKeyStore, paramArrayOfChar, null);
    return this;
  }
  
  public f a(KeyStore paramKeyStore, char[] paramArrayOfChar, e parame)
  {
    int i = 0;
    Object localObject1 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
    ((KeyManagerFactory)localObject1).init(paramKeyStore, paramArrayOfChar);
    KeyManager[] arrayOfKeyManager = ((KeyManagerFactory)localObject1).getKeyManagers();
    if (arrayOfKeyManager != null)
    {
      KeyManager localKeyManager;
      Object localObject2;
      if (parame != null)
      {
        int j = 0;
        localKeyManager = null;
        for (;;)
        {
          k = arrayOfKeyManager.length;
          if (j >= k) {
            break;
          }
          localObject1 = arrayOfKeyManager[j];
          boolean bool = localObject1 instanceof X509KeyManager;
          if (bool)
          {
            localObject2 = new b/a/a/a/e/d/f$a;
            localObject1 = (X509KeyManager)localObject1;
            ((f.a)localObject2).<init>((X509KeyManager)localObject1, parame);
            arrayOfKeyManager[j] = localObject2;
          }
          k = j + 1;
          j = k;
        }
      }
      int k = arrayOfKeyManager.length;
      while (i < k)
      {
        localKeyManager = arrayOfKeyManager[i];
        localObject2 = this.b;
        ((Set)localObject2).add(localKeyManager);
        i += 1;
      }
    }
    return this;
  }
  
  public f a(SecureRandom paramSecureRandom)
  {
    this.d = paramSecureRandom;
    return this;
  }
  
  public SSLContext a()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = this.a;
    SSLContext localSSLContext;
    boolean bool;
    int j;
    Object localObject3;
    if (localObject2 != null)
    {
      localObject2 = this.a;
      localSSLContext = SSLContext.getInstance((String)localObject2);
      localObject2 = this.b;
      bool = ((Set)localObject2).isEmpty();
      if (bool) {
        break label152;
      }
      localObject2 = this.b;
      j = this.b.size();
      localObject3 = new KeyManager[j];
      localObject2 = (KeyManager[])((Set)localObject2).toArray((Object[])localObject3);
      localObject3 = localObject2;
      label80:
      localObject2 = this.c;
      bool = ((Set)localObject2).isEmpty();
      if (bool) {
        break label161;
      }
      localObject2 = this.c;
      i = this.c.size();
      localObject1 = new TrustManager[i];
    }
    for (localObject2 = (TrustManager[])((Set)localObject2).toArray((Object[])localObject1);; localObject2 = null)
    {
      localObject1 = this.d;
      localSSLContext.init((KeyManager[])localObject3, (TrustManager[])localObject2, (SecureRandom)localObject1);
      return localSSLContext;
      localObject2 = "TLS";
      break;
      label152:
      j = 0;
      localObject3 = null;
      break label80;
      label161:
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\d\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */