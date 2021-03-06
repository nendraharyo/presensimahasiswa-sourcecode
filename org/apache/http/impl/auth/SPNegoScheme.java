package org.apache.http.impl.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.ietf.jgss.Oid;

public class SPNegoScheme
  extends GGSSchemeBase
{
  private static final String SPNEGO_OID = "1.3.6.1.5.5.2";
  
  public SPNegoScheme()
  {
    super(false);
  }
  
  public SPNegoScheme(boolean paramBoolean)
  {
    super(paramBoolean);
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    return super.authenticate(paramCredentials, paramHttpRequest, paramHttpContext);
  }
  
  protected byte[] generateToken(byte[] paramArrayOfByte, String paramString)
  {
    Oid localOid = new org/ietf/jgss/Oid;
    localOid.<init>("1.3.6.1.5.5.2");
    return generateGSSToken(paramArrayOfByte, localOid, paramString);
  }
  
  public String getParameter(String paramString)
  {
    Args.notNull(paramString, "Parameter name");
    return null;
  }
  
  public String getRealm()
  {
    return null;
  }
  
  public String getSchemeName()
  {
    return "Negotiate";
  }
  
  public boolean isConnectionBased()
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\SPNegoScheme.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */