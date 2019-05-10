package org.apache.http.conn.ssl;

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

public class SSLContextBuilder
{
  static final String SSL = "SSL";
  static final String TLS = "TLS";
  private Set keymanagers;
  private String protocol;
  private SecureRandom secureRandom;
  private Set trustmanagers;
  
  public SSLContextBuilder()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.keymanagers = localHashSet;
    localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.trustmanagers = localHashSet;
  }
  
  public SSLContext build()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = this.protocol;
    SSLContext localSSLContext;
    boolean bool;
    int j;
    Object localObject3;
    if (localObject2 != null)
    {
      localObject2 = this.protocol;
      localSSLContext = SSLContext.getInstance((String)localObject2);
      localObject2 = this.keymanagers;
      bool = ((Set)localObject2).isEmpty();
      if (bool) {
        break label152;
      }
      localObject2 = this.keymanagers;
      j = this.keymanagers.size();
      localObject3 = new KeyManager[j];
      localObject2 = (KeyManager[])((Set)localObject2).toArray((Object[])localObject3);
      localObject3 = localObject2;
      label80:
      localObject2 = this.trustmanagers;
      bool = ((Set)localObject2).isEmpty();
      if (bool) {
        break label161;
      }
      localObject2 = this.trustmanagers;
      i = this.trustmanagers.size();
      localObject1 = new TrustManager[i];
    }
    for (localObject2 = (TrustManager[])((Set)localObject2).toArray((Object[])localObject1);; localObject2 = null)
    {
      localObject1 = this.secureRandom;
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
  
  public SSLContextBuilder loadKeyMaterial(KeyStore paramKeyStore, char[] paramArrayOfChar)
  {
    loadKeyMaterial(paramKeyStore, paramArrayOfChar, null);
    return this;
  }
  
  public SSLContextBuilder loadKeyMaterial(KeyStore paramKeyStore, char[] paramArrayOfChar, PrivateKeyStrategy paramPrivateKeyStrategy)
  {
    int i = 0;
    Object localObject1 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
    ((KeyManagerFactory)localObject1).init(paramKeyStore, paramArrayOfChar);
    KeyManager[] arrayOfKeyManager = ((KeyManagerFactory)localObject1).getKeyManagers();
    if (arrayOfKeyManager != null)
    {
      KeyManager localKeyManager;
      Object localObject2;
      if (paramPrivateKeyStrategy != null)
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
            localObject2 = new org/apache/http/conn/ssl/SSLContextBuilder$KeyManagerDelegate;
            localObject1 = (X509KeyManager)localObject1;
            ((SSLContextBuilder.KeyManagerDelegate)localObject2).<init>((X509KeyManager)localObject1, paramPrivateKeyStrategy);
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
        localObject2 = this.keymanagers;
        ((Set)localObject2).add(localKeyManager);
        i += 1;
      }
    }
    return this;
  }
  
  public SSLContextBuilder loadTrustMaterial(KeyStore paramKeyStore)
  {
    return loadTrustMaterial(paramKeyStore, null);
  }
  
  public SSLContextBuilder loadTrustMaterial(KeyStore paramKeyStore, TrustStrategy paramTrustStrategy)
  {
    int i = 0;
    Object localObject1 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    ((TrustManagerFactory)localObject1).init(paramKeyStore);
    TrustManager[] arrayOfTrustManager = ((TrustManagerFactory)localObject1).getTrustManagers();
    if (arrayOfTrustManager != null)
    {
      TrustManager localTrustManager;
      Object localObject2;
      if (paramTrustStrategy != null)
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
            localObject2 = new org/apache/http/conn/ssl/SSLContextBuilder$TrustManagerDelegate;
            localObject1 = (X509TrustManager)localObject1;
            ((SSLContextBuilder.TrustManagerDelegate)localObject2).<init>((X509TrustManager)localObject1, paramTrustStrategy);
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
        localObject2 = this.trustmanagers;
        ((Set)localObject2).add(localTrustManager);
        i += 1;
      }
    }
    return this;
  }
  
  public SSLContextBuilder setSecureRandom(SecureRandom paramSecureRandom)
  {
    this.secureRandom = paramSecureRandom;
    return this;
  }
  
  public SSLContextBuilder useProtocol(String paramString)
  {
    this.protocol = paramString;
    return this;
  }
  
  public SSLContextBuilder useSSL()
  {
    this.protocol = "SSL";
    return this;
  }
  
  public SSLContextBuilder useTLS()
  {
    this.protocol = "TLS";
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\ssl\SSLContextBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */