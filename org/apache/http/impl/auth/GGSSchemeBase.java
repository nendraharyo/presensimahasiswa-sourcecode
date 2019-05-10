package org.apache.http.impl.auth;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

public abstract class GGSSchemeBase
  extends AuthSchemeBase
{
  private final Base64 base64codec;
  private final Log log;
  private GGSSchemeBase.State state;
  private final boolean stripPort;
  private byte[] token;
  
  GGSSchemeBase()
  {
    this(false);
  }
  
  GGSSchemeBase(boolean paramBoolean)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    localObject = new org/apache/commons/codec/binary/Base64;
    ((Base64)localObject).<init>(0);
    this.base64codec = ((Base64)localObject);
    this.stripPort = paramBoolean;
    localObject = GGSSchemeBase.State.UNINITIATED;
    this.state = ((GGSSchemeBase.State)localObject);
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest)
  {
    return authenticate(paramCredentials, paramHttpRequest, null);
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject1 = GGSSchemeBase.1.$SwitchMap$org$apache$http$impl$auth$GGSSchemeBase$State;
    Object localObject3 = this.state;
    int i = ((GGSSchemeBase.State)localObject3).ordinal();
    int m = localObject1[i];
    Object localObject4;
    boolean bool1;
    Object localObject2;
    switch (m)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Illegal state: ");
      localObject4 = this.state;
      localObject3 = localObject4;
      ((IllegalStateException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = new org/apache/http/auth/AuthenticationException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = getSchemeName();
      localObject3 = (String)localObject4 + " authentication has not been initiated";
      ((AuthenticationException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    case 2: 
      localObject1 = new org/apache/http/auth/AuthenticationException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = getSchemeName();
      localObject3 = (String)localObject4 + " authentication has failed";
      ((AuthenticationException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    case 3: 
      localObject1 = "http.route";
      try
      {
        localObject1 = paramHttpContext.getAttribute((String)localObject1);
        localObject1 = (HttpRoute)localObject1;
        if (localObject1 == null)
        {
          localObject1 = new org/apache/http/auth/AuthenticationException;
          localObject3 = "Connection route is not available";
          ((AuthenticationException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
      }
      catch (GSSException localGSSException)
      {
        localObject3 = GGSSchemeBase.State.FAILED;
        this.state = ((GGSSchemeBase.State)localObject3);
        i = localGSSException.getMajor();
        int n = 9;
        if (i != n)
        {
          i = localGSSException.getMajor();
          n = 8;
          if (i != n) {
            break label688;
          }
        }
        localObject3 = new org/apache/http/auth/InvalidCredentialsException;
        localObject4 = localGSSException.getMessage();
        ((InvalidCredentialsException)localObject3).<init>((String)localObject4, localGSSException);
        throw ((Throwable)localObject3);
      }
      bool1 = isProxy();
      if (bool1)
      {
        localObject3 = localGSSException.getProxyHost();
        if (localObject3 != null) {
          break label844;
        }
        localObject2 = localGSSException.getTargetHost();
      }
      break;
    }
    for (;;)
    {
      bool1 = this.stripPort;
      if (!bool1)
      {
        int j = ((HttpHost)localObject2).getPort();
        if (j > 0)
        {
          localObject2 = ((HttpHost)localObject2).toHostString();
          label390:
          localObject3 = this.log;
          boolean bool2 = ((Log)localObject3).isDebugEnabled();
          String str;
          if (bool2)
          {
            localObject3 = this.log;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            str = "init ";
            localObject4 = ((StringBuilder)localObject4).append(str);
            localObject4 = ((StringBuilder)localObject4).append((String)localObject2);
            localObject4 = ((StringBuilder)localObject4).toString();
            ((Log)localObject3).debug(localObject4);
          }
          localObject3 = this.token;
          localObject2 = generateToken((byte[])localObject3, (String)localObject2);
          this.token = ((byte[])localObject2);
          localObject2 = GGSSchemeBase.State.TOKEN_GENERATED;
          this.state = ((GGSSchemeBase.State)localObject2);
          localObject2 = new java/lang/String;
          localObject3 = this.base64codec;
          localObject4 = this.token;
          localObject3 = ((Base64)localObject3).encode((byte[])localObject4);
          ((String)localObject2).<init>((byte[])localObject3);
          localObject3 = this.log;
          bool2 = ((Log)localObject3).isDebugEnabled();
          if (bool2)
          {
            localObject3 = this.log;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject4 = ((StringBuilder)localObject4).append("Sending response '").append((String)localObject2);
            str = "' back to the auth server";
            localObject4 = str;
            ((Log)localObject3).debug(localObject4);
          }
          localObject3 = new org/apache/http/util/CharArrayBuffer;
          ((CharArrayBuffer)localObject3).<init>(32);
          boolean bool3 = isProxy();
          if (!bool3) {
            break label830;
          }
          localObject4 = "Proxy-Authorization";
          ((CharArrayBuffer)localObject3).append((String)localObject4);
        }
      }
      for (;;)
      {
        ((CharArrayBuffer)localObject3).append(": Negotiate ");
        ((CharArrayBuffer)localObject3).append((String)localObject2);
        localObject2 = new org/apache/http/message/BufferedHeader;
        ((BufferedHeader)localObject2).<init>((CharArrayBuffer)localObject3);
        return (Header)localObject2;
        localObject2 = ((HttpRoute)localObject2).getTargetHost();
        break;
        localObject2 = ((HttpHost)localObject2).getHostName();
        break label390;
        label688:
        int k = ((GSSException)localObject2).getMajor();
        int i1 = 13;
        if (k == i1)
        {
          localObject3 = new org/apache/http/auth/InvalidCredentialsException;
          localObject4 = ((GSSException)localObject2).getMessage();
          ((InvalidCredentialsException)localObject3).<init>((String)localObject4, (Throwable)localObject2);
          throw ((Throwable)localObject3);
        }
        k = ((GSSException)localObject2).getMajor();
        i1 = 10;
        if (k != i1)
        {
          k = ((GSSException)localObject2).getMajor();
          i1 = 19;
          if (k != i1)
          {
            k = ((GSSException)localObject2).getMajor();
            i1 = 20;
            if (k != i1) {
              break label808;
            }
          }
        }
        localObject3 = new org/apache/http/auth/AuthenticationException;
        localObject4 = ((GSSException)localObject2).getMessage();
        ((AuthenticationException)localObject3).<init>((String)localObject4, (Throwable)localObject2);
        throw ((Throwable)localObject3);
        label808:
        localObject3 = new org/apache/http/auth/AuthenticationException;
        localObject2 = ((GSSException)localObject2).getMessage();
        ((AuthenticationException)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
        label830:
        localObject4 = "Authorization";
        ((CharArrayBuffer)localObject3).append((String)localObject4);
      }
      label844:
      localObject2 = localObject3;
    }
  }
  
  protected byte[] generateGSSToken(byte[] paramArrayOfByte, Oid paramOid, String paramString)
  {
    boolean bool = true;
    if (paramArrayOfByte == null) {
      paramArrayOfByte = new byte[0];
    }
    Object localObject1 = getManager();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "HTTP@" + paramString;
    Oid localOid = GSSName.NT_HOSTBASED_SERVICE;
    localObject2 = ((GSSManager)localObject1).createName((String)localObject2, localOid).canonicalize(paramOid);
    localObject1 = ((GSSManager)localObject1).createContext((GSSName)localObject2, paramOid, null, 0);
    ((GSSContext)localObject1).requestMutualAuth(bool);
    ((GSSContext)localObject1).requestCredDeleg(bool);
    int i = paramArrayOfByte.length;
    return ((GSSContext)localObject1).initSecContext(paramArrayOfByte, 0, i);
  }
  
  protected abstract byte[] generateToken(byte[] paramArrayOfByte, String paramString);
  
  protected GSSManager getManager()
  {
    return GSSManager.getInstance();
  }
  
  public boolean isComplete()
  {
    GGSSchemeBase.State localState1 = this.state;
    GGSSchemeBase.State localState2 = GGSSchemeBase.State.TOKEN_GENERATED;
    boolean bool;
    if (localState1 != localState2)
    {
      localState1 = this.state;
      localState2 = GGSSchemeBase.State.FAILED;
      if (localState1 != localState2) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localState1 = null;
    }
  }
  
  protected void parseChallenge(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2)
  {
    Object localObject1 = paramCharArrayBuffer.substringTrimmed(paramInt1, paramInt2);
    Object localObject2 = this.log;
    boolean bool = ((Log)localObject2).isDebugEnabled();
    if (bool)
    {
      localObject2 = this.log;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Received challenge '").append((String)localObject1);
      String str = "' from the auth server";
      localObject3 = str;
      ((Log)localObject2).debug(localObject3);
    }
    localObject2 = this.state;
    Object localObject3 = GGSSchemeBase.State.UNINITIATED;
    if (localObject2 == localObject3)
    {
      localObject1 = Base64.decodeBase64(((String)localObject1).getBytes());
      this.token = ((byte[])localObject1);
      localObject1 = GGSSchemeBase.State.CHALLENGE_RECEIVED;
    }
    for (this.state = ((GGSSchemeBase.State)localObject1);; this.state = ((GGSSchemeBase.State)localObject1))
    {
      return;
      localObject1 = this.log;
      localObject2 = "Authentication already attempted";
      ((Log)localObject1).debug(localObject2);
      localObject1 = GGSSchemeBase.State.FAILED;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\GGSSchemeBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */