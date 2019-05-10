package org.apache.http.impl.auth;

import java.nio.charset.Charset;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class BasicSchemeFactory
  implements AuthSchemeFactory, AuthSchemeProvider
{
  private final Charset charset;
  
  public BasicSchemeFactory()
  {
    this(null);
  }
  
  public BasicSchemeFactory(Charset paramCharset)
  {
    this.charset = paramCharset;
  }
  
  public AuthScheme create(HttpContext paramHttpContext)
  {
    BasicScheme localBasicScheme = new org/apache/http/impl/auth/BasicScheme;
    Charset localCharset = this.charset;
    localBasicScheme.<init>(localCharset);
    return localBasicScheme;
  }
  
  public AuthScheme newInstance(HttpParams paramHttpParams)
  {
    BasicScheme localBasicScheme = new org/apache/http/impl/auth/BasicScheme;
    localBasicScheme.<init>();
    return localBasicScheme;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\BasicSchemeFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */