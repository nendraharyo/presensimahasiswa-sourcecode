package org.apache.http.impl.auth;

import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class NTLMSchemeFactory
  implements AuthSchemeFactory, AuthSchemeProvider
{
  public AuthScheme create(HttpContext paramHttpContext)
  {
    NTLMScheme localNTLMScheme = new org/apache/http/impl/auth/NTLMScheme;
    localNTLMScheme.<init>();
    return localNTLMScheme;
  }
  
  public AuthScheme newInstance(HttpParams paramHttpParams)
  {
    NTLMScheme localNTLMScheme = new org/apache/http/impl/auth/NTLMScheme;
    localNTLMScheme.<init>();
    return localNTLMScheme;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\NTLMSchemeFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */