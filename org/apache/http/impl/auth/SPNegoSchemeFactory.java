package org.apache.http.impl.auth;

import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class SPNegoSchemeFactory
  implements AuthSchemeFactory, AuthSchemeProvider
{
  private final boolean stripPort;
  
  public SPNegoSchemeFactory()
  {
    this(false);
  }
  
  public SPNegoSchemeFactory(boolean paramBoolean)
  {
    this.stripPort = paramBoolean;
  }
  
  public AuthScheme create(HttpContext paramHttpContext)
  {
    SPNegoScheme localSPNegoScheme = new org/apache/http/impl/auth/SPNegoScheme;
    boolean bool = this.stripPort;
    localSPNegoScheme.<init>(bool);
    return localSPNegoScheme;
  }
  
  public boolean isStripPort()
  {
    return this.stripPort;
  }
  
  public AuthScheme newInstance(HttpParams paramHttpParams)
  {
    SPNegoScheme localSPNegoScheme = new org/apache/http/impl/auth/SPNegoScheme;
    boolean bool = this.stripPort;
    localSPNegoScheme.<init>(bool);
    return localSPNegoScheme;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\SPNegoSchemeFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */