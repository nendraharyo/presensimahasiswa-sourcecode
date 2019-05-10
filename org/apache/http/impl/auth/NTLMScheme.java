package org.apache.http.impl.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.NTCredentials;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class NTLMScheme
  extends AuthSchemeBase
{
  private String challenge;
  private final NTLMEngine engine;
  private NTLMScheme.State state;
  
  public NTLMScheme()
  {
    this(localNTLMEngineImpl);
  }
  
  public NTLMScheme(NTLMEngine paramNTLMEngine)
  {
    Args.notNull(paramNTLMEngine, "NTLM engine");
    this.engine = paramNTLMEngine;
    NTLMScheme.State localState = NTLMScheme.State.UNINITIATED;
    this.state = localState;
    this.challenge = null;
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest)
  {
    Object localObject4;
    try
    {
      paramCredentials = (NTCredentials)paramCredentials;
      Object localObject1 = this.state;
      localObject3 = NTLMScheme.State.FAILED;
      if (localObject1 == localObject3)
      {
        localObject1 = new org/apache/http/auth/AuthenticationException;
        ((AuthenticationException)localObject1).<init>("NTLM authentication failed");
        throw ((Throwable)localObject1);
      }
    }
    catch (ClassCastException localClassCastException)
    {
      localObject2 = new org/apache/http/auth/InvalidCredentialsException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Credentials cannot be used for NTLM authentication: ");
      localObject4 = paramCredentials.getClass().getName();
      localObject3 = (String)localObject4;
      ((InvalidCredentialsException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
    }
    Object localObject2 = this.state;
    Object localObject3 = NTLMScheme.State.CHALLENGE_RECEIVED;
    if (localObject2 == localObject3)
    {
      localObject2 = this.engine;
      localObject3 = paramCredentials.getDomain();
      localObject4 = paramCredentials.getWorkstation();
      localObject2 = ((NTLMEngine)localObject2).generateType1Msg((String)localObject3, (String)localObject4);
      localObject3 = NTLMScheme.State.MSG_TYPE1_GENERATED;
      this.state = ((NTLMScheme.State)localObject3);
      localObject3 = new org/apache/http/util/CharArrayBuffer;
      ((CharArrayBuffer)localObject3).<init>(32);
      boolean bool = isProxy();
      if (!bool) {
        break label331;
      }
      localObject4 = "Proxy-Authorization";
      ((CharArrayBuffer)localObject3).append((String)localObject4);
    }
    for (;;)
    {
      ((CharArrayBuffer)localObject3).append(": NTLM ");
      ((CharArrayBuffer)localObject3).append((String)localObject2);
      localObject2 = new org/apache/http/message/BufferedHeader;
      ((BufferedHeader)localObject2).<init>((CharArrayBuffer)localObject3);
      return (Header)localObject2;
      localObject2 = this.state;
      localObject3 = NTLMScheme.State.MSG_TYPE2_RECEVIED;
      if (localObject2 == localObject3)
      {
        localObject2 = this.engine;
        localObject3 = paramCredentials.getUserName();
        localObject4 = paramCredentials.getPassword();
        String str1 = paramCredentials.getDomain();
        String str2 = paramCredentials.getWorkstation();
        String str3 = this.challenge;
        localObject2 = ((NTLMEngine)localObject2).generateType3Msg((String)localObject3, (String)localObject4, str1, str2, str3);
        localObject3 = NTLMScheme.State.MSG_TYPE3_GENERATED;
        this.state = ((NTLMScheme.State)localObject3);
        break;
      }
      localObject2 = new org/apache/http/auth/AuthenticationException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Unexpected state: ");
      localObject4 = this.state;
      localObject3 = localObject4;
      ((AuthenticationException)localObject2).<init>((String)localObject3);
      throw ((Throwable)localObject2);
      label331:
      localObject4 = "Authorization";
      ((CharArrayBuffer)localObject3).append((String)localObject4);
    }
  }
  
  public String getParameter(String paramString)
  {
    return null;
  }
  
  public String getRealm()
  {
    return null;
  }
  
  public String getSchemeName()
  {
    return "ntlm";
  }
  
  public boolean isComplete()
  {
    NTLMScheme.State localState1 = this.state;
    NTLMScheme.State localState2 = NTLMScheme.State.MSG_TYPE3_GENERATED;
    boolean bool;
    if (localState1 != localState2)
    {
      localState1 = this.state;
      localState2 = NTLMScheme.State.FAILED;
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
  
  public boolean isConnectionBased()
  {
    return true;
  }
  
  protected void parseChallenge(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2)
  {
    Object localObject = paramCharArrayBuffer.substringTrimmed(paramInt1, paramInt2);
    this.challenge = ((String)localObject);
    localObject = this.challenge;
    int i = ((String)localObject).length();
    NTLMScheme.State localState;
    if (i == 0)
    {
      localObject = this.state;
      localState = NTLMScheme.State.UNINITIATED;
      if (localObject == localState)
      {
        localObject = NTLMScheme.State.CHALLENGE_RECEIVED;
        this.state = ((NTLMScheme.State)localObject);
      }
    }
    for (;;)
    {
      return;
      localObject = NTLMScheme.State.FAILED;
      this.state = ((NTLMScheme.State)localObject);
      continue;
      localObject = this.state;
      localState = NTLMScheme.State.MSG_TYPE1_GENERATED;
      i = ((NTLMScheme.State)localObject).compareTo(localState);
      if (i < 0)
      {
        localObject = NTLMScheme.State.FAILED;
        this.state = ((NTLMScheme.State)localObject);
        localObject = new org/apache/http/auth/MalformedChallengeException;
        ((MalformedChallengeException)localObject).<init>("Out of sequence NTLM response message");
        throw ((Throwable)localObject);
      }
      localObject = this.state;
      localState = NTLMScheme.State.MSG_TYPE1_GENERATED;
      if (localObject == localState)
      {
        localObject = NTLMScheme.State.MSG_TYPE2_RECEVIED;
        this.state = ((NTLMScheme.State)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\NTLMScheme.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */