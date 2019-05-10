package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;

public abstract interface TrustStrategy
{
  public abstract boolean isTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\ssl\TrustStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */