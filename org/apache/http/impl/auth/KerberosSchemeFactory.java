package org.apache.http.impl.auth;

import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class KerberosSchemeFactory
  implements AuthSchemeFactory, AuthSchemeProvider
{
  private final boolean stripPort;
  
  public KerberosSchemeFactory()
  {
    this(false);
  }
  
  public KerberosSchemeFactory(boolean paramBoolean)
  {
    this.stripPort = paramBoolean;
  }
  
  public AuthScheme create(HttpContext paramHttpContext)
  {
    KerberosScheme localKerberosScheme = new org/apache/http/impl/auth/KerberosScheme;
    boolean bool = this.stripPort;
    localKerberosScheme.<init>(bool);
    return localKerberosScheme;
  }
  
  public boolean isStripPort()
  {
    return this.stripPort;
  }
  
  public AuthScheme newInstance(HttpParams paramHttpParams)
  {
    KerberosScheme localKerberosScheme = new org/apache/http/impl/auth/KerberosScheme;
    boolean bool = this.stripPort;
    localKerberosScheme.<init>(bool);
    return localKerberosScheme;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\KerberosSchemeFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */