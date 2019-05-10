package org.apache.http.impl.client;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractAuthenticationHandler
  implements AuthenticationHandler
{
  private static final List DEFAULT_SCHEME_PRIORITY;
  private final Log log;
  
  static
  {
    String[] arrayOfString = new String[4];
    arrayOfString[0] = "negotiate";
    arrayOfString[1] = "NTLM";
    arrayOfString[2] = "Digest";
    arrayOfString[3] = "Basic";
    DEFAULT_SCHEME_PRIORITY = Collections.unmodifiableList(Arrays.asList(arrayOfString));
  }
  
  public AbstractAuthenticationHandler()
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
  }
  
  protected List getAuthPreferences()
  {
    return DEFAULT_SCHEME_PRIORITY;
  }
  
  protected List getAuthPreferences(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    return getAuthPreferences();
  }
  
  protected Map parseChallenges(Header[] paramArrayOfHeader)
  {
    HashMap localHashMap = new java/util/HashMap;
    int i = paramArrayOfHeader.length;
    localHashMap.<init>(i);
    int k = paramArrayOfHeader.length;
    int j;
    for (int m = 0; m < k; m = j)
    {
      Header localHeader = paramArrayOfHeader[m];
      boolean bool1 = localHeader instanceof FormattedHeader;
      if (bool1)
      {
        localObject1 = localHeader;
        localObject2 = ((FormattedHeader)localHeader).getBuffer();
        localObject1 = localHeader;
        localObject1 = (FormattedHeader)localHeader;
        j = ((FormattedHeader)localObject1).getValuePos();
      }
      for (;;)
      {
        int n = ((CharArrayBuffer)localObject2).length();
        if (j >= n) {
          break;
        }
        boolean bool2 = HTTP.isWhitespace(((CharArrayBuffer)localObject2).charAt(j));
        if (!bool2) {
          break;
        }
        j += 1;
        continue;
        localObject2 = localHeader.getValue();
        if (localObject2 == null)
        {
          localObject1 = new org/apache/http/auth/MalformedChallengeException;
          ((MalformedChallengeException)localObject1).<init>("Header value is null");
          throw ((Throwable)localObject1);
        }
        localObject1 = new org/apache/http/util/CharArrayBuffer;
        i1 = ((String)localObject2).length();
        ((CharArrayBuffer)localObject1).<init>(i1);
        ((CharArrayBuffer)localObject1).append((String)localObject2);
        localObject2 = localObject1;
        j = 0;
        localObject1 = null;
      }
      int i1 = j;
      for (;;)
      {
        int i2 = ((CharArrayBuffer)localObject2).length();
        if (i1 >= i2) {
          break;
        }
        boolean bool3 = HTTP.isWhitespace(((CharArrayBuffer)localObject2).charAt(i1));
        if (bool3) {
          break;
        }
        i1 += 1;
      }
      Object localObject1 = ((CharArrayBuffer)localObject2).substring(j, i1);
      Object localObject2 = Locale.ENGLISH;
      localObject1 = ((String)localObject1).toLowerCase((Locale)localObject2);
      localHashMap.put(localObject1, localHeader);
      j = m + 1;
    }
    return localHashMap;
  }
  
  public AuthScheme selectScheme(Map paramMap, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Object localObject1 = (AuthSchemeRegistry)paramHttpContext.getAttribute("http.authscheme-registry");
    Asserts.notNull(localObject1, "AuthScheme registry");
    Object localObject2 = getAuthPreferences(paramHttpResponse, paramHttpContext);
    if (localObject2 == null) {
      localObject2 = DEFAULT_SCHEME_PRIORITY;
    }
    Object localObject3 = this.log;
    boolean bool1 = ((Log)localObject3).isDebugEnabled();
    if (bool1)
    {
      localObject3 = this.log;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject5 = "Authentication schemes in the order of preference: ";
      localObject4 = (String)localObject5 + localObject2;
      ((Log)localObject3).debug(localObject4);
    }
    Object localObject4 = null;
    Object localObject5 = ((Collection)localObject2).iterator();
    boolean bool2 = ((Iterator)localObject5).hasNext();
    Object localObject6;
    String str;
    if (bool2)
    {
      localObject2 = (String)((Iterator)localObject5).next();
      localObject3 = Locale.ENGLISH;
      localObject3 = ((String)localObject2).toLowerCase((Locale)localObject3);
      localObject3 = (Header)paramMap.get(localObject3);
      if (localObject3 != null)
      {
        localObject3 = this.log;
        bool1 = ((Log)localObject3).isDebugEnabled();
        if (bool1)
        {
          localObject3 = this.log;
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          localObject6 = ((StringBuilder)localObject6).append((String)localObject2);
          str = " authentication scheme selected";
          localObject6 = str;
          ((Log)localObject3).debug(localObject6);
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject3 = paramHttpResponse.getParams();
        localObject1 = ((AuthSchemeRegistry)localObject1).getAuthScheme((String)localObject2, (HttpParams)localObject3);
        if (localObject1 != null) {
          break label475;
        }
        localObject1 = new org/apache/http/auth/AuthenticationException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Unable to respond to any of these challenges: " + paramMap;
        ((AuthenticationException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        localLog = this.log;
        bool1 = localLog.isWarnEnabled();
      }
      if (!bool1) {
        break;
      }
      Log localLog = this.log;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      str = "Authentication scheme ";
      localObject2 = ((StringBuilder)localObject6).append(str).append((String)localObject2);
      localObject6 = " not supported";
      localObject2 = (String)localObject6;
      localLog.warn(localObject2);
      break;
      localLog = this.log;
      bool1 = localLog.isDebugEnabled();
      if (!bool1) {
        break;
      }
      localLog = this.log;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      str = "Challenge for ";
      localObject2 = ((StringBuilder)localObject6).append(str).append((String)localObject2);
      localObject6 = " authentication scheme not available";
      localObject2 = (String)localObject6;
      localLog.debug(localObject2);
      break;
      label475:
      return (AuthScheme)localObject1;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\AbstractAuthenticationHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */