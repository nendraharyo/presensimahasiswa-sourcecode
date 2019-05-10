package org.apache.http.impl.auth;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

public class NegotiateScheme
  extends GGSSchemeBase
{
  private static final String KERBEROS_OID = "1.2.840.113554.1.2.2";
  private static final String SPNEGO_OID = "1.3.6.1.5.5.2";
  private final Log log;
  private final SpnegoTokenGenerator spengoGenerator;
  
  public NegotiateScheme()
  {
    this(null, false);
  }
  
  public NegotiateScheme(SpnegoTokenGenerator paramSpnegoTokenGenerator)
  {
    this(paramSpnegoTokenGenerator, false);
  }
  
  public NegotiateScheme(SpnegoTokenGenerator paramSpnegoTokenGenerator, boolean paramBoolean)
  {
    super(paramBoolean);
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
    this.spengoGenerator = paramSpnegoTokenGenerator;
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest)
  {
    return authenticate(paramCredentials, paramHttpRequest, null);
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    return super.authenticate(paramCredentials, paramHttpRequest, paramHttpContext);
  }
  
  protected byte[] generateToken(byte[] paramArrayOfByte, String paramString)
  {
    localObject1 = new org/ietf/jgss/Oid;
    ((Oid)localObject1).<init>("1.3.6.1.5.5.2");
    i = 0;
    byte[] arrayOfByte = null;
    try
    {
      paramArrayOfByte = generateGSSToken(paramArrayOfByte, (Oid)localObject1, paramString);
      j = 0;
      localObject1 = null;
      arrayOfByte = paramArrayOfByte;
    }
    catch (GSSException localGSSException)
    {
      for (;;)
      {
        int j = localGSSException.getMajor();
        k = 2;
        if (j != k) {
          break;
        }
        localObject2 = this.log;
        localObject1 = "GSSException BAD_MECH, retry with Kerberos MECH";
        ((Log)localObject2).debug(localObject1);
        i = 1;
        j = i;
        localObject2 = paramArrayOfByte;
      }
      throw ((Throwable)localObject2);
    }
    if (j != 0)
    {
      this.log.debug("Using Kerberos MECH 1.2.840.113554.1.2.2");
      localObject1 = new org/ietf/jgss/Oid;
      localObject3 = "1.2.840.113554.1.2.2";
      ((Oid)localObject1).<init>((String)localObject3);
      arrayOfByte = generateGSSToken(arrayOfByte, (Oid)localObject1, paramString);
      if (arrayOfByte != null)
      {
        localObject1 = this.spengoGenerator;
        if (localObject1 == null) {}
      }
    }
    try
    {
      localObject1 = this.spengoGenerator;
      arrayOfByte = ((SpnegoTokenGenerator)localObject1).generateSpnegoDERObject(arrayOfByte);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        int k;
        Object localObject2;
        localObject3 = this.log;
        String str = localIOException.getMessage();
        ((Log)localObject3).error(str, localIOException);
      }
    }
    return arrayOfByte;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\NegotiateScheme.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */