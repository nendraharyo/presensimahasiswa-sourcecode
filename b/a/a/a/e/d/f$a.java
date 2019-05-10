package b.a.a.a.e.d;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.X509KeyManager;

class f$a
  implements X509KeyManager
{
  private final X509KeyManager a;
  private final e b;
  
  f$a(X509KeyManager paramX509KeyManager, e parame)
  {
    this.a = paramX509KeyManager;
    this.b = parame;
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
      X509KeyManager localX509KeyManager = this.a;
      String[] arrayOfString = localX509KeyManager.getClientAliases(str1, paramArrayOfPrincipal);
      if (arrayOfString != null)
      {
        int k = arrayOfString.length;
        m = 0;
        localX509KeyManager = null;
        while (m < k)
        {
          String str2 = arrayOfString[m];
          d locald = new b/a/a/a/e/d/d;
          X509Certificate[] arrayOfX509Certificate = this.a.getCertificateChain(str2);
          locald.<init>(str1, arrayOfX509Certificate);
          localHashMap.put(str2, locald);
          m += 1;
        }
      }
      m = j + 1;
    }
    return this.b.a(localHashMap, paramSocket);
  }
  
  public String chooseServerAlias(String paramString, Principal[] paramArrayOfPrincipal, Socket paramSocket)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    X509KeyManager localX509KeyManager = this.a;
    String[] arrayOfString = localX509KeyManager.getServerAliases(paramString, paramArrayOfPrincipal);
    if (arrayOfString != null)
    {
      int i = arrayOfString.length;
      int j = 0;
      localX509KeyManager = null;
      while (j < i)
      {
        String str = arrayOfString[j];
        d locald = new b/a/a/a/e/d/d;
        X509Certificate[] arrayOfX509Certificate = this.a.getCertificateChain(str);
        locald.<init>(paramString, arrayOfX509Certificate);
        localHashMap.put(str, locald);
        j += 1;
      }
    }
    return this.b.a(localHashMap, paramSocket);
  }
  
  public X509Certificate[] getCertificateChain(String paramString)
  {
    return this.a.getCertificateChain(paramString);
  }
  
  public String[] getClientAliases(String paramString, Principal[] paramArrayOfPrincipal)
  {
    return this.a.getClientAliases(paramString, paramArrayOfPrincipal);
  }
  
  public PrivateKey getPrivateKey(String paramString)
  {
    return this.a.getPrivateKey(paramString);
  }
  
  public String[] getServerAliases(String paramString, Principal[] paramArrayOfPrincipal)
  {
    return this.a.getServerAliases(paramString, paramArrayOfPrincipal);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\d\f$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */