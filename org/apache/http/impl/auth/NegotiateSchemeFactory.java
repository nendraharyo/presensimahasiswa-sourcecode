package org.apache.http.impl.auth;

import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.params.HttpParams;

public class NegotiateSchemeFactory
  implements AuthSchemeFactory
{
  private final SpnegoTokenGenerator spengoGenerator;
  private final boolean stripPort;
  
  public NegotiateSchemeFactory()
  {
    this(null, false);
  }
  
  public NegotiateSchemeFactory(SpnegoTokenGenerator paramSpnegoTokenGenerator)
  {
    this(paramSpnegoTokenGenerator, false);
  }
  
  public NegotiateSchemeFactory(SpnegoTokenGenerator paramSpnegoTokenGenerator, boolean paramBoolean)
  {
    this.spengoGenerator = paramSpnegoTokenGenerator;
    this.stripPort = paramBoolean;
  }
  
  public SpnegoTokenGenerator getSpengoGenerator()
  {
    return this.spengoGenerator;
  }
  
  public boolean isStripPort()
  {
    return this.stripPort;
  }
  
  public AuthScheme newInstance(HttpParams paramHttpParams)
  {
    NegotiateScheme localNegotiateScheme = new org/apache/http/impl/auth/NegotiateScheme;
    SpnegoTokenGenerator localSpnegoTokenGenerator = this.spengoGenerator;
    boolean bool = this.stripPort;
    localNegotiateScheme.<init>(localSpnegoTokenGenerator, bool);
    return localNegotiateScheme;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\NegotiateSchemeFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */