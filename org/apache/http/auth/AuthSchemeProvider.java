package org.apache.http.auth;

import org.apache.http.protocol.HttpContext;

public abstract interface AuthSchemeProvider
{
  public abstract AuthScheme create(HttpContext paramHttpContext);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\AuthSchemeProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */