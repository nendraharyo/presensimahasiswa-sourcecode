package b.a.a.a.e.d;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

class f$b
  implements X509TrustManager
{
  private final X509TrustManager a;
  private final k b;
  
  f$b(X509TrustManager paramX509TrustManager, k paramk)
  {
    this.a = paramX509TrustManager;
    this.b = paramk;
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    this.a.checkClientTrusted(paramArrayOfX509Certificate, paramString);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    Object localObject = this.b;
    boolean bool = ((k)localObject).a(paramArrayOfX509Certificate, paramString);
    if (!bool)
    {
      localObject = this.a;
      ((X509TrustManager)localObject).checkServerTrusted(paramArrayOfX509Certificate, paramString);
    }
  }
  
  public X509Certificate[] getAcceptedIssuers()
  {
    return this.a.getAcceptedIssuers();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\d\f$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */