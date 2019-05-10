package org.apache.http.auth;

import java.util.Locale;
import org.apache.http.HttpHost;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

public class AuthScope
{
  public static final AuthScope ANY;
  public static final String ANY_HOST = null;
  public static final int ANY_PORT = 255;
  public static final String ANY_REALM = null;
  public static final String ANY_SCHEME = null;
  private final String host;
  private final int port;
  private final String realm;
  private final String scheme;
  
  static
  {
    AuthScope localAuthScope = new org/apache/http/auth/AuthScope;
    String str1 = ANY_HOST;
    String str2 = ANY_REALM;
    String str3 = ANY_SCHEME;
    localAuthScope.<init>(str1, -1, str2, str3);
    ANY = localAuthScope;
  }
  
  public AuthScope(String paramString, int paramInt)
  {
    this(paramString, paramInt, str1, str2);
  }
  
  public AuthScope(String paramString1, int paramInt, String paramString2)
  {
    this(paramString1, paramInt, paramString2, str);
  }
  
  public AuthScope(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    if (paramString1 == null)
    {
      localObject = ANY_HOST;
      this.host = ((String)localObject);
      if (paramInt < 0) {
        paramInt = -1;
      }
      this.port = paramInt;
      if (paramString2 == null) {
        paramString2 = ANY_REALM;
      }
      this.realm = paramString2;
      if (paramString3 != null) {
        break label76;
      }
    }
    for (Object localObject = ANY_SCHEME;; localObject = paramString3.toUpperCase((Locale)localObject))
    {
      this.scheme = ((String)localObject);
      return;
      localObject = Locale.ENGLISH;
      localObject = paramString1.toLowerCase((Locale)localObject);
      break;
      label76:
      localObject = Locale.ENGLISH;
    }
  }
  
  public AuthScope(HttpHost paramHttpHost)
  {
    this(paramHttpHost, str1, str2);
  }
  
  public AuthScope(HttpHost paramHttpHost, String paramString1, String paramString2)
  {
    this(str, i, paramString1, paramString2);
  }
  
  public AuthScope(AuthScope paramAuthScope)
  {
    Args.notNull(paramAuthScope, "Scope");
    String str = paramAuthScope.getHost();
    this.host = str;
    int i = paramAuthScope.getPort();
    this.port = i;
    str = paramAuthScope.getRealm();
    this.realm = str;
    str = paramAuthScope.getScheme();
    this.scheme = str;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == null) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      if (paramObject != this)
      {
        boolean bool2 = paramObject instanceof AuthScope;
        if (!bool2)
        {
          bool1 = super.equals(paramObject);
        }
        else
        {
          paramObject = (AuthScope)paramObject;
          String str1 = this.host;
          String str2 = ((AuthScope)paramObject).host;
          bool2 = LangUtils.equals(str1, str2);
          if (bool2)
          {
            int i = this.port;
            int j = ((AuthScope)paramObject).port;
            if (i == j)
            {
              str1 = this.realm;
              str2 = ((AuthScope)paramObject).realm;
              boolean bool3 = LangUtils.equals(str1, str2);
              if (bool3)
              {
                str1 = this.scheme;
                str2 = ((AuthScope)paramObject).scheme;
                bool3 = LangUtils.equals(str1, str2);
                if (bool3) {
                  continue;
                }
              }
            }
          }
          bool1 = false;
        }
      }
    }
  }
  
  public String getHost()
  {
    return this.host;
  }
  
  public int getPort()
  {
    return this.port;
  }
  
  public String getRealm()
  {
    return this.realm;
  }
  
  public String getScheme()
  {
    return this.scheme;
  }
  
  public int hashCode()
  {
    String str = this.host;
    int i = LangUtils.hashCode(17, str);
    int j = this.port;
    i = LangUtils.hashCode(i, j);
    str = this.realm;
    i = LangUtils.hashCode(i, str);
    str = this.scheme;
    return LangUtils.hashCode(i, str);
  }
  
  public int match(AuthScope paramAuthScope)
  {
    int i = -1;
    int j = 0;
    String str1 = this.scheme;
    String str2 = paramAuthScope.scheme;
    boolean bool1 = LangUtils.equals(str1, str2);
    if (bool1)
    {
      j = 1;
      str1 = this.realm;
      str2 = paramAuthScope.realm;
      bool1 = LangUtils.equals(str1, str2);
      if (!bool1) {
        break label159;
      }
      j += 2;
      label62:
      int k = this.port;
      int n = paramAuthScope.port;
      if (k != n) {
        break label200;
      }
      j += 4;
      label85:
      str1 = this.host;
      str2 = paramAuthScope.host;
      boolean bool2 = LangUtils.equals(str1, str2);
      if (!bool2) {
        break label229;
      }
      j += 8;
    }
    for (;;)
    {
      return j;
      str1 = this.scheme;
      str2 = ANY_SCHEME;
      if (str1 == str2) {
        break;
      }
      str1 = paramAuthScope.scheme;
      str2 = ANY_SCHEME;
      if (str1 == str2) {
        break;
      }
      j = i;
      continue;
      label159:
      str1 = this.realm;
      str2 = ANY_REALM;
      if (str1 == str2) {
        break label62;
      }
      str1 = paramAuthScope.realm;
      str2 = ANY_REALM;
      if (str1 == str2) {
        break label62;
      }
      j = i;
      continue;
      label200:
      int m = this.port;
      if (m == i) {
        break label85;
      }
      m = paramAuthScope.port;
      if (m == i) {
        break label85;
      }
      j = i;
      continue;
      label229:
      str1 = this.host;
      str2 = ANY_HOST;
      if (str1 != str2)
      {
        str1 = paramAuthScope.host;
        str2 = ANY_HOST;
        if (str1 != str2) {
          j = i;
        }
      }
    }
  }
  
  public String toString()
  {
    char c1 = '\'';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.scheme;
    if (str != null)
    {
      str = this.scheme;
      Locale localLocale = Locale.ENGLISH;
      str = str.toUpperCase(localLocale);
      localStringBuilder.append(str);
      char c2 = ' ';
      localStringBuilder.append(c2);
    }
    str = this.realm;
    if (str != null)
    {
      localStringBuilder.append(c1);
      str = this.realm;
      localStringBuilder.append(str);
      localStringBuilder.append(c1);
    }
    for (;;)
    {
      str = this.host;
      if (str != null)
      {
        localStringBuilder.append('@');
        str = this.host;
        localStringBuilder.append(str);
        int i = this.port;
        if (i >= 0)
        {
          localStringBuilder.append(':');
          i = this.port;
          localStringBuilder.append(i);
        }
      }
      return localStringBuilder.toString();
      str = "<any realm>";
      localStringBuilder.append(str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\auth\AuthScope.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */