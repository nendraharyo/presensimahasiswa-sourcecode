package org.apache.http.impl.auth;

import java.nio.charset.Charset;
import java.security.Principal;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.Credentials;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

public class BasicScheme
  extends RFC2617Scheme
{
  private final Base64 base64codec;
  private boolean complete;
  
  public BasicScheme()
  {
    this(localCharset);
  }
  
  public BasicScheme(Charset paramCharset)
  {
    super(paramCharset);
    Base64 localBase64 = new org/apache/commons/codec/binary/Base64;
    localBase64.<init>(0);
    this.base64codec = localBase64;
    this.complete = false;
  }
  
  public BasicScheme(ChallengeState paramChallengeState)
  {
    super(paramChallengeState);
    Base64 localBase64 = new org/apache/commons/codec/binary/Base64;
    localBase64.<init>(0);
    this.base64codec = localBase64;
  }
  
  public static Header authenticate(Credentials paramCredentials, String paramString, boolean paramBoolean)
  {
    Args.notNull(paramCredentials, "Credentials");
    Args.notNull(paramString, "charset");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramCredentials.getUserPrincipal().getName();
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(":");
    localObject2 = paramCredentials.getPassword();
    int i;
    String str;
    if (localObject2 == null)
    {
      localObject2 = "null";
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = Base64.encodeBase64(EncodingUtils.getBytes(((StringBuilder)localObject1).toString(), paramString), false);
      localObject1 = new org/apache/http/util/CharArrayBuffer;
      i = 32;
      ((CharArrayBuffer)localObject1).<init>(i);
      if (!paramBoolean) {
        break label160;
      }
      str = "Proxy-Authorization";
      ((CharArrayBuffer)localObject1).append(str);
    }
    for (;;)
    {
      ((CharArrayBuffer)localObject1).append(": Basic ");
      i = localObject2.length;
      ((CharArrayBuffer)localObject1).append((byte[])localObject2, 0, i);
      localObject2 = new org/apache/http/message/BufferedHeader;
      ((BufferedHeader)localObject2).<init>((CharArrayBuffer)localObject1);
      return (Header)localObject2;
      localObject2 = paramCredentials.getPassword();
      break;
      label160:
      str = "Authorization";
      ((CharArrayBuffer)localObject1).append(str);
    }
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest)
  {
    BasicHttpContext localBasicHttpContext = new org/apache/http/protocol/BasicHttpContext;
    localBasicHttpContext.<init>();
    return authenticate(paramCredentials, paramHttpRequest, localBasicHttpContext);
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    Args.notNull(paramCredentials, "Credentials");
    Args.notNull(paramHttpRequest, "HTTP request");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramCredentials.getUserPrincipal().getName();
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(":");
    localObject2 = paramCredentials.getPassword();
    String str;
    if (localObject2 == null)
    {
      localObject2 = "null";
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = this.base64codec;
      localObject1 = ((StringBuilder)localObject1).toString();
      str = getCredentialsCharset(paramHttpRequest);
      localObject1 = EncodingUtils.getBytes((String)localObject1, str);
      localObject2 = ((Base64)localObject2).encode((byte[])localObject1);
      localObject1 = new org/apache/http/util/CharArrayBuffer;
      ((CharArrayBuffer)localObject1).<init>(32);
      boolean bool = isProxy();
      if (!bool) {
        break label198;
      }
      str = "Proxy-Authorization";
      ((CharArrayBuffer)localObject1).append(str);
    }
    for (;;)
    {
      ((CharArrayBuffer)localObject1).append(": Basic ");
      int i = localObject2.length;
      ((CharArrayBuffer)localObject1).append((byte[])localObject2, 0, i);
      localObject2 = new org/apache/http/message/BufferedHeader;
      ((BufferedHeader)localObject2).<init>((CharArrayBuffer)localObject1);
      return (Header)localObject2;
      localObject2 = paramCredentials.getPassword();
      break;
      label198:
      str = "Authorization";
      ((CharArrayBuffer)localObject1).append(str);
    }
  }
  
  public String getSchemeName()
  {
    return "basic";
  }
  
  public boolean isComplete()
  {
    return this.complete;
  }
  
  public boolean isConnectionBased()
  {
    return false;
  }
  
  public void processChallenge(Header paramHeader)
  {
    super.processChallenge(paramHeader);
    this.complete = true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\BasicScheme.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */