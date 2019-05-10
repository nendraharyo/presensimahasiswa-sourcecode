package org.apache.http.client.utils;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.message.BasicNameValuePair;

public class URIBuilder
{
  private String encodedAuthority;
  private String encodedFragment;
  private String encodedPath;
  private String encodedQuery;
  private String encodedSchemeSpecificPart;
  private String encodedUserInfo;
  private String fragment;
  private String host;
  private String path;
  private int port;
  private String query;
  private List queryParams;
  private String scheme;
  private String userInfo;
  
  public URIBuilder()
  {
    this.port = -1;
  }
  
  public URIBuilder(String paramString)
  {
    URI localURI = new java/net/URI;
    localURI.<init>(paramString);
    digestURI(localURI);
  }
  
  public URIBuilder(URI paramURI)
  {
    digestURI(paramURI);
  }
  
  private String buildString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = this.scheme;
    if (localObject1 != null)
    {
      localObject1 = this.scheme;
      localObject1 = localStringBuilder.append((String)localObject1);
      char c = ':';
      ((StringBuilder)localObject1).append(c);
    }
    localObject1 = this.encodedSchemeSpecificPart;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.encodedSchemeSpecificPart;
      localStringBuilder.append((String)localObject1);
      localObject1 = this.encodedFragment;
      if (localObject1 == null) {
        break label467;
      }
      localObject1 = localStringBuilder.append("#");
      localObject2 = this.encodedFragment;
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localObject1 = this.encodedAuthority;
      if (localObject1 != null)
      {
        localObject1 = localStringBuilder.append("//");
        localObject2 = this.encodedAuthority;
        ((StringBuilder)localObject1).append((String)localObject2);
        label120:
        localObject1 = this.encodedPath;
        if (localObject1 == null) {
          break label355;
        }
        localObject1 = normalizePath(this.encodedPath);
        localStringBuilder.append((String)localObject1);
      }
      for (;;)
      {
        localObject1 = this.encodedQuery;
        if (localObject1 == null) {
          break label387;
        }
        localObject1 = localStringBuilder.append("?");
        localObject2 = this.encodedQuery;
        ((StringBuilder)localObject1).append((String)localObject2);
        break;
        localObject1 = this.host;
        if (localObject1 == null) {
          break label120;
        }
        localStringBuilder.append("//");
        localObject1 = this.encodedUserInfo;
        if (localObject1 != null)
        {
          localObject1 = this.encodedUserInfo;
          localObject1 = localStringBuilder.append((String)localObject1);
          localObject2 = "@";
          ((StringBuilder)localObject1).append((String)localObject2);
          label222:
          localObject1 = this.host;
          boolean bool = InetAddressUtils.isIPv6Address((String)localObject1);
          if (!bool) {
            break label341;
          }
          localObject1 = localStringBuilder.append("[");
          localObject2 = this.host;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = "]";
          ((StringBuilder)localObject1).append((String)localObject2);
        }
        for (;;)
        {
          int j = this.port;
          if (j < 0) {
            break;
          }
          localObject1 = localStringBuilder.append(":");
          int i = this.port;
          ((StringBuilder)localObject1).append(i);
          break;
          localObject1 = this.userInfo;
          if (localObject1 == null) {
            break label222;
          }
          localObject1 = this.userInfo;
          localObject1 = encodeUserInfo((String)localObject1);
          localObject1 = localStringBuilder.append((String)localObject1);
          localObject2 = "@";
          ((StringBuilder)localObject1).append((String)localObject2);
          break label222;
          label341:
          localObject1 = this.host;
          localStringBuilder.append((String)localObject1);
        }
        label355:
        localObject1 = this.path;
        if (localObject1 != null)
        {
          localObject1 = normalizePath(this.path);
          localObject1 = encodePath((String)localObject1);
          localStringBuilder.append((String)localObject1);
        }
      }
      label387:
      localObject1 = this.queryParams;
      if (localObject1 != null)
      {
        localObject1 = localStringBuilder.append("?");
        localObject2 = this.queryParams;
        localObject2 = encodeUrlForm((List)localObject2);
        ((StringBuilder)localObject1).append((String)localObject2);
        break;
      }
      localObject1 = this.query;
      if (localObject1 == null) {
        break;
      }
      localObject1 = localStringBuilder.append("?");
      localObject2 = this.query;
      localObject2 = encodeUric((String)localObject2);
      ((StringBuilder)localObject1).append((String)localObject2);
      break;
      label467:
      localObject1 = this.fragment;
      if (localObject1 != null)
      {
        localObject1 = localStringBuilder.append("#");
        localObject2 = this.fragment;
        localObject2 = encodeUric((String)localObject2);
        ((StringBuilder)localObject1).append((String)localObject2);
      }
    }
  }
  
  private void digestURI(URI paramURI)
  {
    Object localObject = paramURI.getScheme();
    this.scheme = ((String)localObject);
    localObject = paramURI.getRawSchemeSpecificPart();
    this.encodedSchemeSpecificPart = ((String)localObject);
    localObject = paramURI.getRawAuthority();
    this.encodedAuthority = ((String)localObject);
    localObject = paramURI.getHost();
    this.host = ((String)localObject);
    int i = paramURI.getPort();
    this.port = i;
    localObject = paramURI.getRawUserInfo();
    this.encodedUserInfo = ((String)localObject);
    localObject = paramURI.getUserInfo();
    this.userInfo = ((String)localObject);
    localObject = paramURI.getRawPath();
    this.encodedPath = ((String)localObject);
    localObject = paramURI.getPath();
    this.path = ((String)localObject);
    localObject = paramURI.getRawQuery();
    this.encodedQuery = ((String)localObject);
    localObject = paramURI.getRawQuery();
    Charset localCharset = Consts.UTF_8;
    localObject = parseQuery((String)localObject, localCharset);
    this.queryParams = ((List)localObject);
    localObject = paramURI.getRawFragment();
    this.encodedFragment = ((String)localObject);
    localObject = paramURI.getFragment();
    this.fragment = ((String)localObject);
  }
  
  private String encodePath(String paramString)
  {
    Charset localCharset = Consts.UTF_8;
    return URLEncodedUtils.encPath(paramString, localCharset);
  }
  
  private String encodeUric(String paramString)
  {
    Charset localCharset = Consts.UTF_8;
    return URLEncodedUtils.encUric(paramString, localCharset);
  }
  
  private String encodeUrlForm(List paramList)
  {
    Charset localCharset = Consts.UTF_8;
    return URLEncodedUtils.format(paramList, localCharset);
  }
  
  private String encodeUserInfo(String paramString)
  {
    Charset localCharset = Consts.UTF_8;
    return URLEncodedUtils.encUserInfo(paramString, localCharset);
  }
  
  private static String normalizePath(String paramString)
  {
    if (paramString == null)
    {
      paramString = null;
      return paramString;
    }
    int i = 0;
    for (;;)
    {
      int j = paramString.length();
      if (i < j)
      {
        j = paramString.charAt(i);
        int k = 47;
        if (j == k) {}
      }
      else
      {
        j = 1;
        if (i <= j) {
          break;
        }
        i += -1;
        paramString = paramString.substring(i);
        break;
      }
      i += 1;
    }
  }
  
  private List parseQuery(String paramString, Charset paramCharset)
  {
    int i;
    if (paramString != null)
    {
      i = paramString.length();
      if (i <= 0) {}
    }
    for (List localList = URLEncodedUtils.parse(paramString, paramCharset);; localList = null)
    {
      return localList;
      i = 0;
    }
  }
  
  public URIBuilder addParameter(String paramString1, String paramString2)
  {
    Object localObject = this.queryParams;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.queryParams = ((List)localObject);
    }
    localObject = this.queryParams;
    BasicNameValuePair localBasicNameValuePair = new org/apache/http/message/BasicNameValuePair;
    localBasicNameValuePair.<init>(paramString1, paramString2);
    ((List)localObject).add(localBasicNameValuePair);
    this.encodedQuery = null;
    this.encodedSchemeSpecificPart = null;
    this.query = null;
    return this;
  }
  
  public URIBuilder addParameters(List paramList)
  {
    Object localObject = this.queryParams;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.queryParams = ((List)localObject);
    }
    this.queryParams.addAll(paramList);
    this.encodedQuery = null;
    this.encodedSchemeSpecificPart = null;
    this.query = null;
    return this;
  }
  
  public URI build()
  {
    URI localURI = new java/net/URI;
    String str = buildString();
    localURI.<init>(str);
    return localURI;
  }
  
  public URIBuilder clearParameters()
  {
    this.queryParams = null;
    this.encodedQuery = null;
    this.encodedSchemeSpecificPart = null;
    return this;
  }
  
  public String getFragment()
  {
    return this.fragment;
  }
  
  public String getHost()
  {
    return this.host;
  }
  
  public String getPath()
  {
    return this.path;
  }
  
  public int getPort()
  {
    return this.port;
  }
  
  public List getQueryParams()
  {
    Object localObject = this.queryParams;
    if (localObject != null)
    {
      localObject = new java/util/ArrayList;
      List localList = this.queryParams;
      ((ArrayList)localObject).<init>(localList);
    }
    for (;;)
    {
      return (List)localObject;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
    }
  }
  
  public String getScheme()
  {
    return this.scheme;
  }
  
  public String getUserInfo()
  {
    return this.userInfo;
  }
  
  public boolean isAbsolute()
  {
    String str = this.scheme;
    boolean bool;
    if (str != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public boolean isOpaque()
  {
    String str = this.path;
    boolean bool;
    if (str == null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public URIBuilder removeQuery()
  {
    this.queryParams = null;
    this.query = null;
    this.encodedQuery = null;
    this.encodedSchemeSpecificPart = null;
    return this;
  }
  
  public URIBuilder setCustomQuery(String paramString)
  {
    this.query = paramString;
    this.encodedQuery = null;
    this.encodedSchemeSpecificPart = null;
    this.queryParams = null;
    return this;
  }
  
  public URIBuilder setFragment(String paramString)
  {
    this.fragment = paramString;
    this.encodedFragment = null;
    return this;
  }
  
  public URIBuilder setHost(String paramString)
  {
    this.host = paramString;
    this.encodedSchemeSpecificPart = null;
    this.encodedAuthority = null;
    return this;
  }
  
  public URIBuilder setParameter(String paramString1, String paramString2)
  {
    Object localObject1 = this.queryParams;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.queryParams = ((List)localObject1);
    }
    localObject1 = this.queryParams;
    boolean bool = ((List)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = this.queryParams;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = ((NameValuePair)((Iterator)localObject2).next()).getName();
        bool = ((String)localObject1).equals(paramString1);
        if (bool) {
          ((Iterator)localObject2).remove();
        }
      }
    }
    localObject1 = this.queryParams;
    Object localObject2 = new org/apache/http/message/BasicNameValuePair;
    ((BasicNameValuePair)localObject2).<init>(paramString1, paramString2);
    ((List)localObject1).add(localObject2);
    this.encodedQuery = null;
    this.encodedSchemeSpecificPart = null;
    this.query = null;
    return this;
  }
  
  public URIBuilder setParameters(List paramList)
  {
    Object localObject = this.queryParams;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.queryParams = ((List)localObject);
    }
    for (;;)
    {
      this.queryParams.addAll(paramList);
      this.encodedQuery = null;
      this.encodedSchemeSpecificPart = null;
      this.query = null;
      return this;
      localObject = this.queryParams;
      ((List)localObject).clear();
    }
  }
  
  public URIBuilder setParameters(NameValuePair... paramVarArgs)
  {
    Object localObject = this.queryParams;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.queryParams = ((List)localObject);
    }
    for (;;)
    {
      int i = paramVarArgs.length;
      int j = 0;
      localObject = null;
      while (j < i)
      {
        NameValuePair localNameValuePair = paramVarArgs[j];
        List localList = this.queryParams;
        localList.add(localNameValuePair);
        j += 1;
      }
      localObject = this.queryParams;
      ((List)localObject).clear();
    }
    this.encodedQuery = null;
    this.encodedSchemeSpecificPart = null;
    this.query = null;
    return this;
  }
  
  public URIBuilder setPath(String paramString)
  {
    this.path = paramString;
    this.encodedSchemeSpecificPart = null;
    this.encodedPath = null;
    return this;
  }
  
  public URIBuilder setPort(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = -1;
    }
    this.port = paramInt;
    this.encodedSchemeSpecificPart = null;
    this.encodedAuthority = null;
    return this;
  }
  
  public URIBuilder setQuery(String paramString)
  {
    Object localObject = Consts.UTF_8;
    localObject = parseQuery(paramString, (Charset)localObject);
    this.queryParams = ((List)localObject);
    this.query = null;
    this.encodedQuery = null;
    this.encodedSchemeSpecificPart = null;
    return this;
  }
  
  public URIBuilder setScheme(String paramString)
  {
    this.scheme = paramString;
    return this;
  }
  
  public URIBuilder setUserInfo(String paramString)
  {
    this.userInfo = paramString;
    this.encodedSchemeSpecificPart = null;
    this.encodedAuthority = null;
    this.encodedUserInfo = null;
    return this;
  }
  
  public URIBuilder setUserInfo(String paramString1, String paramString2)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString1 + ':' + paramString2;
    return setUserInfo((String)localObject);
  }
  
  public String toString()
  {
    return buildString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\clien\\utils\URIBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */