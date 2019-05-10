package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;

public class TrustSelfSignedStrategy
  implements TrustStrategy
{
  public boolean isTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    int i = 1;
    int j = paramArrayOfX509Certificate.length;
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\ssl\TrustSelfSignedStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */