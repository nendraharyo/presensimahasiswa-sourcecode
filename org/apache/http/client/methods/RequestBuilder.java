package org.apache.http.client.methods;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.HeaderGroup;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

public class RequestBuilder
{
  private RequestConfig config;
  private HttpEntity entity;
  private HeaderGroup headergroup;
  private String method;
  private LinkedList parameters;
  private URI uri;
  private ProtocolVersion version;
  
  RequestBuilder()
  {
    this(null);
  }
  
  RequestBuilder(String paramString)
  {
    this.method = paramString;
  }
  
  public static RequestBuilder copy(HttpRequest paramHttpRequest)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    RequestBuilder localRequestBuilder = new org/apache/http/client/methods/RequestBuilder;
    localRequestBuilder.<init>();
    return localRequestBuilder.doCopy(paramHttpRequest);
  }
  
  public static RequestBuilder create(String paramString)
  {
    Args.notBlank(paramString, "HTTP method");
    RequestBuilder localRequestBuilder = new org/apache/http/client/methods/RequestBuilder;
    localRequestBuilder.<init>(paramString);
    return localRequestBuilder;
  }
  
  public static RequestBuilder delete()
  {
    RequestBuilder localRequestBuilder = new org/apache/http/client/methods/RequestBuilder;
    localRequestBuilder.<init>("DELETE");
    return localRequestBuilder;
  }
  
  private RequestBuilder doCopy(HttpRequest paramHttpRequest)
  {
    if (paramHttpRequest == null) {
      return this;
    }
    Object localObject = paramHttpRequest.getRequestLine().getMethod();
    this.method = ((String)localObject);
    localObject = paramHttpRequest.getRequestLine().getProtocolVersion();
    this.version = ((ProtocolVersion)localObject);
    boolean bool = paramHttpRequest instanceof HttpUriRequest;
    if (bool)
    {
      localObject = paramHttpRequest;
      localObject = ((HttpUriRequest)paramHttpRequest).getURI();
      this.uri = ((URI)localObject);
      label66:
      localObject = this.headergroup;
      if (localObject == null)
      {
        localObject = new org/apache/http/message/HeaderGroup;
        ((HeaderGroup)localObject).<init>();
        this.headergroup = ((HeaderGroup)localObject);
      }
      this.headergroup.clear();
      localObject = this.headergroup;
      Header[] arrayOfHeader = ((HttpRequest)paramHttpRequest).getAllHeaders();
      ((HeaderGroup)localObject).setHeaders(arrayOfHeader);
      bool = paramHttpRequest instanceof HttpEntityEnclosingRequest;
      if (!bool) {
        break label200;
      }
      localObject = paramHttpRequest;
      localObject = ((HttpEntityEnclosingRequest)paramHttpRequest).getEntity();
      this.entity = ((HttpEntity)localObject);
      label143:
      bool = paramHttpRequest instanceof Configurable;
      if (!bool) {
        break label208;
      }
      paramHttpRequest = (Configurable)paramHttpRequest;
      localObject = paramHttpRequest.getConfig();
    }
    label200:
    label208:
    for (this.config = ((RequestConfig)localObject);; this.config = null)
    {
      this.parameters = null;
      break;
      localObject = URI.create(paramHttpRequest.getRequestLine().getUri());
      this.uri = ((URI)localObject);
      break label66;
      this.entity = null;
      break label143;
    }
  }
  
  public static RequestBuilder get()
  {
    RequestBuilder localRequestBuilder = new org/apache/http/client/methods/RequestBuilder;
    localRequestBuilder.<init>("GET");
    return localRequestBuilder;
  }
  
  public static RequestBuilder head()
  {
    RequestBuilder localRequestBuilder = new org/apache/http/client/methods/RequestBuilder;
    localRequestBuilder.<init>("HEAD");
    return localRequestBuilder;
  }
  
  public static RequestBuilder options()
  {
    RequestBuilder localRequestBuilder = new org/apache/http/client/methods/RequestBuilder;
    localRequestBuilder.<init>("OPTIONS");
    return localRequestBuilder;
  }
  
  public static RequestBuilder post()
  {
    RequestBuilder localRequestBuilder = new org/apache/http/client/methods/RequestBuilder;
    localRequestBuilder.<init>("POST");
    return localRequestBuilder;
  }
  
  public static RequestBuilder put()
  {
    RequestBuilder localRequestBuilder = new org/apache/http/client/methods/RequestBuilder;
    localRequestBuilder.<init>("PUT");
    return localRequestBuilder;
  }
  
  public static RequestBuilder trace()
  {
    RequestBuilder localRequestBuilder = new org/apache/http/client/methods/RequestBuilder;
    localRequestBuilder.<init>("TRACE");
    return localRequestBuilder;
  }
  
  public RequestBuilder addHeader(String paramString1, String paramString2)
  {
    HeaderGroup localHeaderGroup = this.headergroup;
    if (localHeaderGroup == null)
    {
      localHeaderGroup = new org/apache/http/message/HeaderGroup;
      localHeaderGroup.<init>();
      this.headergroup = localHeaderGroup;
    }
    localHeaderGroup = this.headergroup;
    BasicHeader localBasicHeader = new org/apache/http/message/BasicHeader;
    localBasicHeader.<init>(paramString1, paramString2);
    localHeaderGroup.addHeader(localBasicHeader);
    return this;
  }
  
  public RequestBuilder addHeader(Header paramHeader)
  {
    HeaderGroup localHeaderGroup = this.headergroup;
    if (localHeaderGroup == null)
    {
      localHeaderGroup = new org/apache/http/message/HeaderGroup;
      localHeaderGroup.<init>();
      this.headergroup = localHeaderGroup;
    }
    this.headergroup.addHeader(paramHeader);
    return this;
  }
  
  public RequestBuilder addParameter(String paramString1, String paramString2)
  {
    BasicNameValuePair localBasicNameValuePair = new org/apache/http/message/BasicNameValuePair;
    localBasicNameValuePair.<init>(paramString1, paramString2);
    return addParameter(localBasicNameValuePair);
  }
  
  public RequestBuilder addParameter(NameValuePair paramNameValuePair)
  {
    Args.notNull(paramNameValuePair, "Name value pair");
    LinkedList localLinkedList = this.parameters;
    if (localLinkedList == null)
    {
      localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      this.parameters = localLinkedList;
    }
    this.parameters.add(paramNameValuePair);
    return this;
  }
  
  public RequestBuilder addParameters(NameValuePair... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      NameValuePair localNameValuePair = paramVarArgs[j];
      addParameter(localNameValuePair);
      j += 1;
    }
    return this;
  }
  
  public HttpUriRequest build()
  {
    Object localObject1 = this.uri;
    Object localObject2;
    Object localObject3;
    Object localObject5;
    if (localObject1 != null)
    {
      localObject1 = this.uri;
      localObject2 = this.entity;
      localObject3 = this.parameters;
      if (localObject3 == null) {
        break label253;
      }
      localObject3 = this.parameters;
      boolean bool = ((LinkedList)localObject3).isEmpty();
      if (bool) {
        break label253;
      }
      if (localObject2 != null) {
        break label191;
      }
      localObject3 = "POST";
      localObject5 = this.method;
      bool = ((String)localObject3).equalsIgnoreCase((String)localObject5);
      if (!bool)
      {
        localObject3 = "PUT";
        localObject5 = this.method;
        bool = ((String)localObject3).equalsIgnoreCase((String)localObject5);
        if (!bool) {
          break label191;
        }
      }
      localObject2 = new org/apache/http/client/entity/UrlEncodedFormEntity;
      localObject3 = this.parameters;
      localObject5 = HTTP.DEF_CONTENT_CHARSET;
      ((UrlEncodedFormEntity)localObject2).<init>((Iterable)localObject3, (Charset)localObject5);
      localObject3 = localObject1;
    }
    for (;;)
    {
      label115:
      if (localObject2 == null)
      {
        localObject1 = new org/apache/http/client/methods/RequestBuilder$InternalRequest;
        localObject2 = this.method;
        ((RequestBuilder.InternalRequest)localObject1).<init>((String)localObject2);
      }
      for (;;)
      {
        localObject2 = this.version;
        ((HttpRequestBase)localObject1).setProtocolVersion((ProtocolVersion)localObject2);
        ((HttpRequestBase)localObject1).setURI((URI)localObject3);
        localObject2 = this.headergroup;
        if (localObject2 != null)
        {
          localObject2 = this.headergroup.getAllHeaders();
          ((HttpRequestBase)localObject1).setHeaders((Header[])localObject2);
        }
        localObject2 = this.config;
        ((HttpRequestBase)localObject1).setConfig((RequestConfig)localObject2);
        return (HttpUriRequest)localObject1;
        localObject1 = URI.create("/");
        break;
        try
        {
          label191:
          localObject3 = new org/apache/http/client/utils/URIBuilder;
          ((URIBuilder)localObject3).<init>((URI)localObject1);
          localObject5 = this.parameters;
          localObject3 = ((URIBuilder)localObject3).addParameters((List)localObject5);
          localObject1 = ((URIBuilder)localObject3).build();
          localObject3 = localObject1;
        }
        catch (URISyntaxException localURISyntaxException)
        {
          localObject4 = localObject1;
        }
        break label115;
        localObject1 = new org/apache/http/client/methods/RequestBuilder$InternalEntityEclosingRequest;
        localObject5 = this.method;
        ((RequestBuilder.InternalEntityEclosingRequest)localObject1).<init>((String)localObject5);
        ((RequestBuilder.InternalEntityEclosingRequest)localObject1).setEntity((HttpEntity)localObject2);
      }
      label253:
      Object localObject4 = localObject1;
    }
  }
  
  public RequestConfig getConfig()
  {
    return this.config;
  }
  
  public HttpEntity getEntity()
  {
    return this.entity;
  }
  
  public Header getFirstHeader(String paramString)
  {
    Object localObject = this.headergroup;
    if (localObject != null) {}
    for (localObject = this.headergroup.getFirstHeader(paramString);; localObject = null) {
      return (Header)localObject;
    }
  }
  
  public Header[] getHeaders(String paramString)
  {
    Object localObject = this.headergroup;
    if (localObject != null) {}
    for (localObject = this.headergroup.getHeaders(paramString);; localObject = null) {
      return (Header[])localObject;
    }
  }
  
  public Header getLastHeader(String paramString)
  {
    Object localObject = this.headergroup;
    if (localObject != null) {}
    for (localObject = this.headergroup.getLastHeader(paramString);; localObject = null) {
      return (Header)localObject;
    }
  }
  
  public String getMethod()
  {
    return this.method;
  }
  
  public List getParameters()
  {
    Object localObject = this.parameters;
    if (localObject != null)
    {
      localObject = new java/util/ArrayList;
      LinkedList localLinkedList = this.parameters;
      ((ArrayList)localObject).<init>(localLinkedList);
    }
    for (;;)
    {
      return (List)localObject;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
    }
  }
  
  public URI getUri()
  {
    return this.uri;
  }
  
  public ProtocolVersion getVersion()
  {
    return this.version;
  }
  
  public RequestBuilder removeHeader(Header paramHeader)
  {
    HeaderGroup localHeaderGroup = this.headergroup;
    if (localHeaderGroup == null)
    {
      localHeaderGroup = new org/apache/http/message/HeaderGroup;
      localHeaderGroup.<init>();
      this.headergroup = localHeaderGroup;
    }
    this.headergroup.removeHeader(paramHeader);
    return this;
  }
  
  public RequestBuilder removeHeaders(String paramString)
  {
    if (paramString != null)
    {
      localObject = this.headergroup;
      if (localObject != null) {}
    }
    else
    {
      return this;
    }
    Object localObject = this.headergroup.iterator();
    for (;;)
    {
      boolean bool = ((HeaderIterator)localObject).hasNext();
      if (!bool) {
        break;
      }
      String str = ((HeaderIterator)localObject).nextHeader().getName();
      bool = paramString.equalsIgnoreCase(str);
      if (bool) {
        ((HeaderIterator)localObject).remove();
      }
    }
  }
  
  public RequestBuilder setConfig(RequestConfig paramRequestConfig)
  {
    this.config = paramRequestConfig;
    return this;
  }
  
  public RequestBuilder setEntity(HttpEntity paramHttpEntity)
  {
    this.entity = paramHttpEntity;
    return this;
  }
  
  public RequestBuilder setHeader(String paramString1, String paramString2)
  {
    HeaderGroup localHeaderGroup = this.headergroup;
    if (localHeaderGroup == null)
    {
      localHeaderGroup = new org/apache/http/message/HeaderGroup;
      localHeaderGroup.<init>();
      this.headergroup = localHeaderGroup;
    }
    localHeaderGroup = this.headergroup;
    BasicHeader localBasicHeader = new org/apache/http/message/BasicHeader;
    localBasicHeader.<init>(paramString1, paramString2);
    localHeaderGroup.updateHeader(localBasicHeader);
    return this;
  }
  
  public RequestBuilder setHeader(Header paramHeader)
  {
    HeaderGroup localHeaderGroup = this.headergroup;
    if (localHeaderGroup == null)
    {
      localHeaderGroup = new org/apache/http/message/HeaderGroup;
      localHeaderGroup.<init>();
      this.headergroup = localHeaderGroup;
    }
    this.headergroup.updateHeader(paramHeader);
    return this;
  }
  
  public RequestBuilder setUri(String paramString)
  {
    if (paramString != null) {}
    for (URI localURI = URI.create(paramString);; localURI = null)
    {
      this.uri = localURI;
      return this;
    }
  }
  
  public RequestBuilder setUri(URI paramURI)
  {
    this.uri = paramURI;
    return this;
  }
  
  public RequestBuilder setVersion(ProtocolVersion paramProtocolVersion)
  {
    this.version = paramProtocolVersion;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\methods\RequestBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */