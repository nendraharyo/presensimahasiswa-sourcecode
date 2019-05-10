package org.apache.http.client.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import org.apache.http.HttpHost;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

public class URIUtils
{
  public static URI createURI(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, String paramString5)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    if (paramString2 != null)
    {
      if (paramString1 != null)
      {
        ((StringBuilder)localObject1).append(paramString1);
        localObject2 = "://";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      ((StringBuilder)localObject1).append(paramString2);
      if (paramInt > 0)
      {
        char c1 = ':';
        ((StringBuilder)localObject1).append(c1);
        ((StringBuilder)localObject1).append(paramInt);
      }
    }
    char c2;
    if (paramString3 != null)
    {
      localObject2 = "/";
      boolean bool = paramString3.startsWith((String)localObject2);
      if (bool) {}
    }
    else
    {
      c2 = '/';
      ((StringBuilder)localObject1).append(c2);
    }
    if (paramString3 != null) {
      ((StringBuilder)localObject1).append(paramString3);
    }
    if (paramString4 != null)
    {
      c2 = '?';
      ((StringBuilder)localObject1).append(c2);
      ((StringBuilder)localObject1).append(paramString4);
    }
    if (paramString5 != null)
    {
      c2 = '#';
      ((StringBuilder)localObject1).append(c2);
      ((StringBuilder)localObject1).append(paramString5);
    }
    Object localObject2 = new java/net/URI;
    localObject1 = ((StringBuilder)localObject1).toString();
    ((URI)localObject2).<init>((String)localObject1);
    return (URI)localObject2;
  }
  
  public static HttpHost extractHost(URI paramURI)
  {
    Object localObject1 = null;
    if (paramURI == null) {
      return (HttpHost)localObject1;
    }
    boolean bool1 = paramURI.isAbsolute();
    int j;
    Object localObject2;
    int k;
    int m;
    int n;
    Object localObject4;
    if (bool1)
    {
      j = paramURI.getPort();
      localObject2 = paramURI.getHost();
      if (localObject2 == null)
      {
        localObject2 = paramURI.getAuthority();
        if (localObject2 != null)
        {
          k = ((String)localObject2).indexOf('@');
          if (k < 0) {
            break label293;
          }
          m = ((String)localObject2).length();
          n = k + 1;
          if (m > n)
          {
            k += 1;
            localObject4 = ((String)localObject2).substring(k);
          }
        }
      }
    }
    for (;;)
    {
      int i;
      String str;
      if (localObject4 != null)
      {
        i = 58;
        int i1 = ((String)localObject4).indexOf(i);
        if (i1 >= 0)
        {
          k = i1 + 1;
          i = k;
          m = 0;
          str = null;
          for (;;)
          {
            int i2 = ((String)localObject4).length();
            if (i >= i2) {
              break;
            }
            boolean bool3 = Character.isDigit(((String)localObject4).charAt(i));
            if (!bool3) {
              break;
            }
            m += 1;
            i += 1;
          }
          n = 0;
          localObject4 = null;
          continue;
          if (m > 0)
          {
            i = k + m;
            try
            {
              localObject2 = ((String)localObject4).substring(k, i);
              i = Integer.parseInt((String)localObject2);
            }
            catch (NumberFormatException localNumberFormatException)
            {
              for (;;)
              {
                label207:
                Object localObject5;
                i = j;
              }
            }
            localObject5 = ((String)localObject4).substring(0, i1);
            j = i;
          }
        }
      }
      Object localObject3;
      for (localObject2 = localObject5;; localObject3 = localObject4)
      {
        str = paramURI.getScheme();
        boolean bool2 = TextUtils.isBlank((CharSequence)localObject2);
        if (!bool2)
        {
          localObject5 = new org/apache/http/HttpHost;
          ((HttpHost)localObject5).<init>((String)localObject2, j, str);
        }
        for (localObject2 = localObject5;; localObject3 = null)
        {
          localObject1 = localObject2;
          break;
          i = 0;
        }
        i = j;
        break label207;
      }
      label293:
      localObject4 = localObject3;
    }
  }
  
  private static URI normalizeSyntax(URI paramURI)
  {
    char c1 = '/';
    int i = paramURI.isOpaque();
    Object localObject1;
    if (i == 0)
    {
      localObject1 = paramURI.getAuthority();
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = paramURI;
    }
    for (;;)
    {
      return (URI)localObject1;
      i = paramURI.isAbsolute();
      Object localObject2 = "Base URI must be absolute";
      Args.check(i, (String)localObject2);
      localObject1 = paramURI.getPath();
      Object localObject4;
      label83:
      Object localObject5;
      String str;
      boolean bool2;
      if (localObject1 == null)
      {
        localObject1 = "";
        localObject2 = localObject1;
        localObject3 = ((String)localObject2).split("/");
        localObject4 = new java/util/Stack;
        ((Stack)localObject4).<init>();
        int m = localObject3.length;
        i = 0;
        localObject1 = null;
        if (i >= m) {
          break label193;
        }
        localObject5 = localObject3[i];
        int i1 = ((String)localObject5).length();
        if (i1 != 0)
        {
          str = ".";
          bool2 = str.equals(localObject5);
          if (!bool2) {
            break label143;
          }
        }
      }
      label143:
      boolean bool3;
      for (;;)
      {
        int j;
        i += 1;
        break label83;
        localObject1 = paramURI.getPath();
        localObject2 = localObject1;
        break;
        str = "..";
        bool2 = str.equals(localObject5);
        if (bool2)
        {
          bool3 = ((Stack)localObject4).isEmpty();
          if (!bool3) {
            ((Stack)localObject4).pop();
          }
        }
        else
        {
          ((Stack)localObject4).push(localObject5);
        }
      }
      label193:
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject3 = ((Stack)localObject4).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject3).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (String)((Iterator)localObject3).next();
        localObject4 = localStringBuilder.append(c1);
        ((StringBuilder)localObject4).append((String)localObject1);
      }
      int k = ((String)localObject2).lastIndexOf(c1);
      int i2 = ((String)localObject2).length() + -1;
      if (k == i2) {
        localStringBuilder.append(c1);
      }
      try
      {
        localObject1 = paramURI.getScheme();
        localObject2 = Locale.ENGLISH;
        localObject2 = ((String)localObject1).toLowerCase((Locale)localObject2);
        localObject1 = paramURI.getAuthority();
        localObject3 = Locale.ENGLISH;
        localObject3 = ((String)localObject1).toLowerCase((Locale)localObject3);
        localObject1 = new java/net/URI;
        localObject4 = localStringBuilder.toString();
        int n = 0;
        localStringBuilder = null;
        bool3 = false;
        localObject5 = null;
        ((URI)localObject1).<init>((String)localObject2, (String)localObject3, (String)localObject4, null, null);
        localObject2 = paramURI.getQuery();
        if (localObject2 == null)
        {
          localObject2 = paramURI.getFragment();
          if (localObject2 == null) {
            continue;
          }
        }
        localObject2 = new java/lang/StringBuilder;
        localObject1 = ((URI)localObject1).toASCIIString();
        ((StringBuilder)localObject2).<init>((String)localObject1);
        localObject1 = paramURI.getQuery();
        if (localObject1 != null)
        {
          k = 63;
          localObject1 = ((StringBuilder)localObject2).append(k);
          localObject3 = paramURI.getRawQuery();
          ((StringBuilder)localObject1).append((String)localObject3);
        }
        localObject1 = paramURI.getFragment();
        if (localObject1 != null)
        {
          char c2 = '#';
          localObject1 = ((StringBuilder)localObject2).append(c2);
          localObject3 = paramURI.getRawFragment();
          ((StringBuilder)localObject1).append((String)localObject3);
        }
        localObject1 = ((StringBuilder)localObject2).toString();
        localObject1 = URI.create((String)localObject1);
      }
      catch (URISyntaxException localURISyntaxException)
      {
        localObject2 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject2).<init>(localURISyntaxException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public static URI resolve(URI paramURI, String paramString)
  {
    URI localURI = URI.create(paramString);
    return resolve(paramURI, localURI);
  }
  
  public static URI resolve(URI paramURI1, URI paramURI2)
  {
    Args.notNull(paramURI1, "Base URI");
    Args.notNull(paramURI2, "Reference URI");
    Object localObject = paramURI2.toString();
    String str = "?";
    boolean bool = ((String)localObject).startsWith(str);
    if (bool)
    {
      localObject = resolveReferenceStartingWithQueryString(paramURI1, paramURI2);
      return (URI)localObject;
    }
    int j = ((String)localObject).length();
    if (j == 0)
    {
      j = 1;
      bool = j;
    }
    for (;;)
    {
      if (bool)
      {
        localObject = "#";
        paramURI2 = URI.create((String)localObject);
      }
      localObject = paramURI1.resolve(paramURI2);
      if (bool)
      {
        localObject = ((URI)localObject).toString();
        i = ((String)localObject).indexOf('#');
        localObject = URI.create(((String)localObject).substring(0, i));
      }
      localObject = normalizeSyntax((URI)localObject);
      break;
      int i = 0;
      str = null;
    }
  }
  
  public static URI resolve(URI paramURI, HttpHost paramHttpHost, List paramList)
  {
    Object localObject1 = "Request URI";
    Args.notNull(paramURI, (String)localObject1);
    if (paramList != null)
    {
      boolean bool1 = paramList.isEmpty();
      if (!bool1) {}
    }
    else
    {
      localObject1 = new org/apache/http/client/utils/URIBuilder;
      ((URIBuilder)localObject1).<init>(paramURI);
    }
    for (;;)
    {
      Object localObject2 = ((URIBuilder)localObject1).getFragment();
      if (localObject2 == null)
      {
        localObject2 = paramURI.getFragment();
        ((URIBuilder)localObject1).setFragment((String)localObject2);
      }
      if (paramHttpHost != null)
      {
        boolean bool2 = ((URIBuilder)localObject1).isAbsolute();
        if (!bool2)
        {
          localObject2 = paramHttpHost.getSchemeName();
          ((URIBuilder)localObject1).setScheme((String)localObject2);
          localObject2 = paramHttpHost.getHostName();
          ((URIBuilder)localObject1).setHost((String)localObject2);
          int j = paramHttpHost.getPort();
          ((URIBuilder)localObject1).setPort(j);
        }
      }
      return ((URIBuilder)localObject1).build();
      localObject2 = new org/apache/http/client/utils/URIBuilder;
      int i = paramList.size() + -1;
      localObject1 = (URI)paramList.get(i);
      ((URIBuilder)localObject2).<init>((URI)localObject1);
      String str1 = ((URIBuilder)localObject2).getFragment();
      i = paramList.size() + -1;
      localObject1 = str1;
      int k = i;
      while ((localObject1 == null) && (k >= 0))
      {
        String str2 = ((URI)paramList.get(k)).getFragment();
        i = k + -1;
        k = i;
        localObject1 = str2;
      }
      ((URIBuilder)localObject2).setFragment((String)localObject1);
      localObject1 = localObject2;
    }
  }
  
  private static URI resolveReferenceStartingWithQueryString(URI paramURI1, URI paramURI2)
  {
    int i = 63;
    Object localObject1 = paramURI1.toString();
    int j = ((String)localObject1).indexOf(i);
    int k = -1;
    if (j > k)
    {
      j = 0;
      localObject2 = null;
      k = ((String)localObject1).indexOf(i);
      localObject1 = ((String)localObject1).substring(0, k);
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
    localObject2 = paramURI2.toString();
    return URI.create((String)localObject2);
  }
  
  public static URI rewriteURI(URI paramURI)
  {
    Object localObject = "URI";
    Args.notNull(paramURI, (String)localObject);
    boolean bool1 = paramURI.isOpaque();
    if (bool1) {}
    for (;;)
    {
      return paramURI;
      localObject = new org/apache/http/client/utils/URIBuilder;
      ((URIBuilder)localObject).<init>(paramURI);
      String str = ((URIBuilder)localObject).getUserInfo();
      if (str != null) {
        ((URIBuilder)localObject).setUserInfo(null);
      }
      str = ((URIBuilder)localObject).getPath();
      boolean bool2 = TextUtils.isEmpty(str);
      if (bool2)
      {
        str = "/";
        ((URIBuilder)localObject).setPath(str);
      }
      str = ((URIBuilder)localObject).getHost();
      if (str != null)
      {
        str = ((URIBuilder)localObject).getHost();
        Locale localLocale = Locale.ENGLISH;
        str = str.toLowerCase(localLocale);
        ((URIBuilder)localObject).setHost(str);
      }
      ((URIBuilder)localObject).setFragment(null);
      paramURI = ((URIBuilder)localObject).build();
    }
  }
  
  public static URI rewriteURI(URI paramURI, HttpHost paramHttpHost)
  {
    return rewriteURI(paramURI, paramHttpHost, false);
  }
  
  public static URI rewriteURI(URI paramURI, HttpHost paramHttpHost, boolean paramBoolean)
  {
    Object localObject = "URI";
    Args.notNull(paramURI, (String)localObject);
    boolean bool1 = paramURI.isOpaque();
    if (bool1) {
      return paramURI;
    }
    localObject = new org/apache/http/client/utils/URIBuilder;
    ((URIBuilder)localObject).<init>(paramURI);
    String str;
    if (paramHttpHost != null)
    {
      str = paramHttpHost.getSchemeName();
      ((URIBuilder)localObject).setScheme(str);
      str = paramHttpHost.getHostName();
      ((URIBuilder)localObject).setHost(str);
      int i = paramHttpHost.getPort();
      ((URIBuilder)localObject).setPort(i);
    }
    for (;;)
    {
      if (paramBoolean) {
        ((URIBuilder)localObject).setFragment(null);
      }
      str = ((URIBuilder)localObject).getPath();
      boolean bool2 = TextUtils.isEmpty(str);
      if (bool2)
      {
        str = "/";
        ((URIBuilder)localObject).setPath(str);
      }
      paramURI = ((URIBuilder)localObject).build();
      break;
      ((URIBuilder)localObject).setScheme(null);
      ((URIBuilder)localObject).setHost(null);
      int j = -1;
      ((URIBuilder)localObject).setPort(j);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\clien\\utils\URIUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */