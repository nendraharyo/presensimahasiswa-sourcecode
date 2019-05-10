package org.apache.http.impl.client;

import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import java.net.PasswordAuthentication;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.util.Args;

public class SystemDefaultCredentialsProvider
  implements CredentialsProvider
{
  private static final Map SCHEME_MAP;
  private final BasicCredentialsProvider internal;
  
  static
  {
    Object localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    SCHEME_MAP = (Map)localObject;
    localObject = SCHEME_MAP;
    Locale localLocale = Locale.ENGLISH;
    String str = "Basic".toUpperCase(localLocale);
    ((Map)localObject).put(str, "Basic");
    localObject = SCHEME_MAP;
    localLocale = Locale.ENGLISH;
    str = "Digest".toUpperCase(localLocale);
    ((Map)localObject).put(str, "Digest");
    localObject = SCHEME_MAP;
    localLocale = Locale.ENGLISH;
    str = "NTLM".toUpperCase(localLocale);
    ((Map)localObject).put(str, "NTLM");
    localObject = SCHEME_MAP;
    localLocale = Locale.ENGLISH;
    str = "negotiate".toUpperCase(localLocale);
    ((Map)localObject).put(str, "SPNEGO");
    localObject = SCHEME_MAP;
    localLocale = Locale.ENGLISH;
    str = "Kerberos".toUpperCase(localLocale);
    ((Map)localObject).put(str, "Kerberos");
  }
  
  public SystemDefaultCredentialsProvider()
  {
    BasicCredentialsProvider localBasicCredentialsProvider = new org/apache/http/impl/client/BasicCredentialsProvider;
    localBasicCredentialsProvider.<init>();
    this.internal = localBasicCredentialsProvider;
  }
  
  private static PasswordAuthentication getSystemCreds(AuthScope paramAuthScope, Authenticator.RequestorType paramRequestorType)
  {
    String str1 = paramAuthScope.getHost();
    int i = paramAuthScope.getPort();
    int j = 443;
    if (i == j) {}
    for (String str2 = "https";; str2 = "http")
    {
      String str3 = translateScheme(paramAuthScope.getScheme());
      return Authenticator.requestPasswordAuthentication(str1, null, i, str2, null, str3, null, paramRequestorType);
    }
  }
  
  private static String translateScheme(String paramString)
  {
    String str;
    if (paramString == null) {
      str = null;
    }
    for (;;)
    {
      return str;
      str = (String)SCHEME_MAP.get(paramString);
      if (str == null) {
        str = paramString;
      }
    }
  }
  
  public void clear()
  {
    this.internal.clear();
  }
  
  public Credentials getCredentials(AuthScope paramAuthScope)
  {
    String str1 = null;
    Args.notNull(paramAuthScope, "Auth scope");
    Object localObject1 = this.internal.getCredentials(paramAuthScope);
    if (localObject1 != null) {
      return (Credentials)localObject1;
    }
    localObject1 = paramAuthScope.getHost();
    if (localObject1 != null)
    {
      localObject1 = Authenticator.RequestorType.SERVER;
      localObject1 = getSystemCreds(paramAuthScope, (Authenticator.RequestorType)localObject1);
      if (localObject1 != null) {
        break label235;
      }
      localObject1 = Authenticator.RequestorType.PROXY;
      localObject1 = getSystemCreds(paramAuthScope, (Authenticator.RequestorType)localObject1);
    }
    label235:
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      if (localObject2 != null)
      {
        localObject1 = "http.auth.ntlm.domain";
        String str2 = System.getProperty((String)localObject1);
        String str3;
        if (str2 != null)
        {
          localObject1 = new org/apache/http/auth/NTCredentials;
          str3 = ((PasswordAuthentication)localObject2).getUserName();
          String str4 = new java/lang/String;
          localObject2 = ((PasswordAuthentication)localObject2).getPassword();
          str4.<init>((char[])localObject2);
          ((NTCredentials)localObject1).<init>(str3, str4, null, str2);
          break;
        }
        localObject1 = "NTLM";
        str2 = paramAuthScope.getScheme();
        bool = ((String)localObject1).equalsIgnoreCase(str2);
        if (bool)
        {
          localObject1 = new org/apache/http/auth/NTCredentials;
          str2 = ((PasswordAuthentication)localObject2).getUserName();
          str3 = new java/lang/String;
          localObject2 = ((PasswordAuthentication)localObject2).getPassword();
          str3.<init>((char[])localObject2);
          ((NTCredentials)localObject1).<init>(str2, str3, null, null);
          break;
        }
        localObject1 = new org/apache/http/auth/UsernamePasswordCredentials;
        str1 = ((PasswordAuthentication)localObject2).getUserName();
        str2 = new java/lang/String;
        localObject2 = ((PasswordAuthentication)localObject2).getPassword();
        str2.<init>((char[])localObject2);
        ((UsernamePasswordCredentials)localObject1).<init>(str1, str2);
        break;
      }
      boolean bool = false;
      localObject1 = null;
      break;
    }
  }
  
  public void setCredentials(AuthScope paramAuthScope, Credentials paramCredentials)
  {
    this.internal.setCredentials(paramAuthScope, paramCredentials);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\SystemDefaultCredentialsProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */