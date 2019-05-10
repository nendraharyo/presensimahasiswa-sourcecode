package org.apache.http.impl.auth;

import java.util.Locale;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public abstract class AuthSchemeBase
  implements ContextAwareAuthScheme
{
  private ChallengeState challengeState;
  
  public AuthSchemeBase() {}
  
  public AuthSchemeBase(ChallengeState paramChallengeState)
  {
    this.challengeState = paramChallengeState;
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    return authenticate(paramCredentials, paramHttpRequest);
  }
  
  public ChallengeState getChallengeState()
  {
    return this.challengeState;
  }
  
  public boolean isProxy()
  {
    ChallengeState localChallengeState1 = this.challengeState;
    boolean bool;
    if (localChallengeState1 != null)
    {
      localChallengeState1 = this.challengeState;
      ChallengeState localChallengeState2 = ChallengeState.PROXY;
      if (localChallengeState1 == localChallengeState2) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localChallengeState1 = null;
    }
  }
  
  protected abstract void parseChallenge(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2);
  
  public void processChallenge(Header paramHeader)
  {
    Args.notNull(paramHeader, "Header");
    Object localObject1 = paramHeader.getName();
    Object localObject2 = "WWW-Authenticate";
    boolean bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
    if (bool1)
    {
      localObject1 = ChallengeState.TARGET;
      this.challengeState = ((ChallengeState)localObject1);
      boolean bool2 = paramHeader instanceof FormattedHeader;
      if (!bool2) {
        break label177;
      }
      localObject1 = paramHeader;
      localObject1 = (FormattedHeader)paramHeader;
      localObject2 = ((FormattedHeader)localObject1).getBuffer();
      paramHeader = (FormattedHeader)paramHeader;
      i = paramHeader.getValuePos();
    }
    StringBuilder localStringBuilder;
    for (;;)
    {
      int j = ((CharArrayBuffer)localObject2).length();
      if (i >= j) {
        break label229;
      }
      boolean bool3 = HTTP.isWhitespace(((CharArrayBuffer)localObject2).charAt(i));
      if (!bool3) {
        break label229;
      }
      i += 1;
      continue;
      localObject2 = "Proxy-Authenticate";
      bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
      if (bool1)
      {
        localObject1 = ChallengeState.PROXY;
        this.challengeState = ((ChallengeState)localObject1);
        break;
      }
      localObject2 = new org/apache/http/auth/MalformedChallengeException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject1 = "Unexpected header name: " + (String)localObject1;
      ((MalformedChallengeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      label177:
      localObject1 = paramHeader.getValue();
      if (localObject1 == null)
      {
        localObject1 = new org/apache/http/auth/MalformedChallengeException;
        ((MalformedChallengeException)localObject1).<init>("Header value is null");
        throw ((Throwable)localObject1);
      }
      localObject2 = new org/apache/http/util/CharArrayBuffer;
      k = ((String)localObject1).length();
      ((CharArrayBuffer)localObject2).<init>(k);
      ((CharArrayBuffer)localObject2).append((String)localObject1);
      i = 0;
      localObject1 = null;
    }
    label229:
    int k = i;
    for (;;)
    {
      int m = ((CharArrayBuffer)localObject2).length();
      if (k >= m) {
        break;
      }
      bool4 = HTTP.isWhitespace(((CharArrayBuffer)localObject2).charAt(k));
      if (bool4) {
        break;
      }
      k += 1;
    }
    localObject1 = ((CharArrayBuffer)localObject2).substring(i, k);
    String str = getSchemeName();
    boolean bool4 = ((String)localObject1).equalsIgnoreCase(str);
    if (!bool4)
    {
      localObject2 = new org/apache/http/auth/MalformedChallengeException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject1 = "Invalid scheme identifier: " + (String)localObject1;
      ((MalformedChallengeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    int i = ((CharArrayBuffer)localObject2).length();
    parseChallenge((CharArrayBuffer)localObject2, k, i);
  }
  
  public String toString()
  {
    String str = getSchemeName();
    Locale localLocale;
    if (str != null) {
      localLocale = Locale.ENGLISH;
    }
    for (str = str.toUpperCase(localLocale);; str = super.toString()) {
      return str;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\AuthSchemeBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */