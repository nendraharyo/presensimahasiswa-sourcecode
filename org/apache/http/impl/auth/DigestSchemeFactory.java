package org.apache.http.impl.auth;

import java.nio.charset.Charset;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class DigestSchemeFactory
  implements AuthSchemeFactory, AuthSchemeProvider
{
  private final Charset charset;
  
  public DigestSchemeFactory()
  {
    this(null);
  }
  
  public DigestSchemeFactory(Charset paramCharset)
  {
    this.charset = paramCharset;
  }
  
  public AuthScheme create(HttpContext paramHttpContext)
  {
    DigestScheme localDigestScheme = new org/apache/http/impl/auth/DigestScheme;
    Charset localCharset = this.charset;
    localDigestScheme.<init>(localCharset);
    return localDigestScheme;
  }
  
  public AuthScheme newInstance(HttpParams paramHttpParams)
  {
    DigestScheme localDigestScheme = new org/apache/http/impl/auth/DigestScheme;
    localDigestScheme.<init>();
    return localDigestScheme;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\DigestSchemeFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */