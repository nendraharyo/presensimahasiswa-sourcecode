package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

class SSLContextBuilder$TrustManagerDelegate
  implements X509TrustManager
{
  private final X509TrustManager trustManager;
  private final TrustStrategy trustStrategy;
  
  SSLContextBuilder$TrustManagerDelegate(X509TrustManager paramX509TrustManager, TrustStrategy paramTrustStrategy)
  {
    this.trustManager = paramX509TrustManager;
    this.trustStrategy = paramTrustStrategy;
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    this.trustManager.checkClientTrusted(paramArrayOfX509Certificate, paramString);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    Object localObject = this.trustStrategy;
    boolean bool = ((TrustStrategy)localObject).isTrusted(paramArrayOfX509Certificate, paramString);
    if (!bool)
    {
      localObject = this.trustManager;
      ((X509TrustManager)localObject).checkServerTrusted(paramArrayOfX509Certificate, paramString);
    }
  }
  
  public X509Certificate[] getAcceptedIssuers()
  {
    return this.trustManager.getAcceptedIssuers();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\ssl\SSLContextBuilder$TrustManagerDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */