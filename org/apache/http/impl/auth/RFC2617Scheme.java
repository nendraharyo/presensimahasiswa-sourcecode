package org.apache.http.impl.auth;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Consts;
import org.apache.http.HeaderElement;
import org.apache.http.HttpRequest;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.HeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

public abstract class RFC2617Scheme
  extends AuthSchemeBase
{
  private final Charset credentialsCharset;
  private final Map params;
  
  public RFC2617Scheme()
  {
    this(localCharset);
  }
  
  public RFC2617Scheme(Charset paramCharset)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.params = localHashMap;
    if (paramCharset != null) {}
    for (;;)
    {
      this.credentialsCharset = paramCharset;
      return;
      paramCharset = Consts.ASCII;
    }
  }
  
  public RFC2617Scheme(ChallengeState paramChallengeState)
  {
    super(paramChallengeState);
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.params = ((Map)localObject);
    localObject = Consts.ASCII;
    this.credentialsCharset = ((Charset)localObject);
  }
  
  String getCredentialsCharset(HttpRequest paramHttpRequest)
  {
    Object localObject = paramHttpRequest.getParams();
    String str = "http.auth.credential-charset";
    localObject = (String)((HttpParams)localObject).getParameter(str);
    if (localObject == null) {
      localObject = getCredentialsCharset().name();
    }
    return (String)localObject;
  }
  
  public Charset getCredentialsCharset()
  {
    return this.credentialsCharset;
  }
  
  public String getParameter(String paramString)
  {
    if (paramString == null) {}
    Object localObject2;
    for (Object localObject1 = null;; localObject1 = (String)((Map)localObject1).get(localObject2))
    {
      return (String)localObject1;
      localObject1 = this.params;
      localObject2 = Locale.ENGLISH;
      localObject2 = paramString.toLowerCase((Locale)localObject2);
    }
  }
  
  protected Map getParameters()
  {
    return this.params;
  }
  
  public String getRealm()
  {
    return getParameter("realm");
  }
  
  protected void parseChallenge(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2)
  {
    Object localObject1 = BasicHeaderValueParser.INSTANCE;
    Object localObject2 = new org/apache/http/message/ParserCursor;
    int i = paramCharArrayBuffer.length();
    ((ParserCursor)localObject2).<init>(paramInt1, i);
    localObject2 = ((HeaderValueParser)localObject1).parseElements(paramCharArrayBuffer, (ParserCursor)localObject2);
    int j = localObject2.length;
    if (j == 0)
    {
      localObject1 = new org/apache/http/auth/MalformedChallengeException;
      ((MalformedChallengeException)localObject1).<init>("Authentication challenge is empty");
      throw ((Throwable)localObject1);
    }
    this.params.clear();
    i = localObject2.length;
    j = 0;
    localObject1 = null;
    while (j < i)
    {
      String str1 = localObject2[j];
      Map localMap = this.params;
      String str2 = str1.getName();
      Locale localLocale = Locale.ENGLISH;
      str2 = str2.toLowerCase(localLocale);
      str1 = str1.getValue();
      localMap.put(str2, str1);
      j += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\auth\RFC2617Scheme.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */