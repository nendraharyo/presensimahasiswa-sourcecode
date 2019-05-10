package org.apache.http.conn.ssl;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.X509KeyManager;

class SSLContextBuilder$KeyManagerDelegate
  implements X509KeyManager
{
  private final PrivateKeyStrategy aliasStrategy;
  private final X509KeyManager keyManager;
  
  SSLContextBuilder$KeyManagerDelegate(X509KeyManager paramX509KeyManager, PrivateKeyStrategy paramPrivateKeyStrategy)
  {
    this.keyManager = paramX509KeyManager;
    this.aliasStrategy = paramPrivateKeyStrategy;
  }
  
  public String chooseClientAlias(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    int i = paramArrayOfString.length;
    int m;
    for (int j = 0; j < i; j = m)
    {
      String str1 = paramArrayOfString[j];
      X509KeyManager localX509KeyManager = this.keyManager;
      String[] arrayOfString = localX509KeyManager.getClientAliases(str1, paramArrayOfPrincipal);
      if (arrayOfString != null)
      {
        int k = arrayOfString.length;
        m = 0;
        localX509KeyManager = null;
        while (m < k)
        {
          String str2 = arrayOfString[m];
          PrivateKeyDetails localPrivateKeyDetails = new org/apache/http/conn/ssl/PrivateKeyDetails;
          X509Certificate[] arrayOfX509Certificate = this.keyManager.getCertificateChain(str2);
          localPrivateKeyDetails.<init>(str1, arrayOfX509Certificate);
          localHashMap.put(str2, localPrivateKeyDetails);
          m += 1;
        }
      }
      m = j + 1;
    }
    return this.aliasStrategy.chooseAlias(localHashMap, paramSocket);
  }
  
  public String chooseServerAlias(String paramString, Principal[] paramArrayOfPrincipal, Socket paramSocket)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    X509KeyManager localX509KeyManager = this.keyManager;
    String[] arrayOfString = localX509KeyManager.getServerAliases(paramString, paramArrayOfPrincipal);
    if (arrayOfString != null)
    {
      int i = arrayOfString.length;
      int j = 0;
      localX509KeyManager = null;
      while (j < i)
      {
        String str = arrayOfString[j];
        PrivateKeyDetails localPrivateKeyDetails = new org/apache/http/conn/ssl/PrivateKeyDetails;
        X509Certificate[] arrayOfX509Certificate = this.keyManager.getCertificateChain(str);
        localPrivateKeyDetails.<init>(paramString, arrayOfX509Certificate);
        localHashMap.put(str, localPrivateKeyDetails);
        j += 1;
      }
    }
    return this.aliasStrategy.chooseAlias(localHashMap, paramSocket);
  }
  
  public X509Certificate[] getCertificateChain(String paramString)
  {
    return this.keyManager.getCertificateChain(paramString);
  }
  
  public String[] getClientAliases(String paramString, Principal[] paramArrayOfPrincipal)
  {
    return this.keyManager.getClientAliases(paramString, paramArrayOfPrincipal);
  }
  
  public PrivateKey getPrivateKey(String paramString)
  {
    return this.keyManager.getPrivateKey(paramString);
  }
  
  public String[] getServerAliases(String paramString, Principal[] paramArrayOfPrincipal)
  {
    return this.keyManager.getServerAliases(paramString, paramArrayOfPrincipal);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\ssl\SSLContextBuilder$KeyManagerDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */