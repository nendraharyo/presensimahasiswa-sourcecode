package org.apache.http.protocol;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.HttpServerConnection;
import org.apache.http.HttpVersion;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.UnsupportedHttpVersionException;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.EncodingUtils;
import org.apache.http.util.EntityUtils;

public class HttpService
{
  private volatile ConnectionReuseStrategy connStrategy = null;
  private volatile HttpExpectationVerifier expectationVerifier = null;
  private volatile HttpRequestHandlerMapper handlerMapper = null;
  private volatile HttpParams params = null;
  private volatile HttpProcessor processor = null;
  private volatile HttpResponseFactory responseFactory = null;
  
  public HttpService(HttpProcessor paramHttpProcessor, ConnectionReuseStrategy paramConnectionReuseStrategy, HttpResponseFactory paramHttpResponseFactory)
  {
    setHttpProcessor(paramHttpProcessor);
    setConnReuseStrategy(paramConnectionReuseStrategy);
    setResponseFactory(paramHttpResponseFactory);
  }
  
  public HttpService(HttpProcessor paramHttpProcessor, ConnectionReuseStrategy paramConnectionReuseStrategy, HttpResponseFactory paramHttpResponseFactory, HttpRequestHandlerMapper paramHttpRequestHandlerMapper)
  {
    this(paramHttpProcessor, paramConnectionReuseStrategy, paramHttpResponseFactory, paramHttpRequestHandlerMapper, null);
  }
  
  public HttpService(HttpProcessor paramHttpProcessor, ConnectionReuseStrategy paramConnectionReuseStrategy, HttpResponseFactory paramHttpResponseFactory, HttpRequestHandlerMapper paramHttpRequestHandlerMapper, HttpExpectationVerifier paramHttpExpectationVerifier)
  {
    HttpProcessor localHttpProcessor = (HttpProcessor)Args.notNull(paramHttpProcessor, "HTTP processor");
    this.processor = localHttpProcessor;
    if (paramConnectionReuseStrategy != null)
    {
      this.connStrategy = paramConnectionReuseStrategy;
      if (paramHttpResponseFactory == null) {
        break label89;
      }
    }
    for (;;)
    {
      this.responseFactory = paramHttpResponseFactory;
      this.handlerMapper = paramHttpRequestHandlerMapper;
      this.expectationVerifier = paramHttpExpectationVerifier;
      return;
      paramConnectionReuseStrategy = DefaultConnectionReuseStrategy.INSTANCE;
      break;
      label89:
      paramHttpResponseFactory = DefaultHttpResponseFactory.INSTANCE;
    }
  }
  
  public HttpService(HttpProcessor paramHttpProcessor, ConnectionReuseStrategy paramConnectionReuseStrategy, HttpResponseFactory paramHttpResponseFactory, HttpRequestHandlerResolver paramHttpRequestHandlerResolver, HttpParams paramHttpParams)
  {
    this(paramHttpProcessor, paramConnectionReuseStrategy, paramHttpResponseFactory, localHttpRequestHandlerResolverAdapter, null);
  }
  
  public HttpService(HttpProcessor paramHttpProcessor, ConnectionReuseStrategy paramConnectionReuseStrategy, HttpResponseFactory paramHttpResponseFactory, HttpRequestHandlerResolver paramHttpRequestHandlerResolver, HttpExpectationVerifier paramHttpExpectationVerifier, HttpParams paramHttpParams)
  {
    this(paramHttpProcessor, paramConnectionReuseStrategy, paramHttpResponseFactory, localHttpRequestHandlerResolverAdapter, paramHttpExpectationVerifier);
  }
  
  public HttpService(HttpProcessor paramHttpProcessor, HttpRequestHandlerMapper paramHttpRequestHandlerMapper)
  {
    this(paramHttpProcessor, null, null, paramHttpRequestHandlerMapper, null);
  }
  
  protected void doService(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    int i = 0;
    HttpRequestHandler localHttpRequestHandler = null;
    HttpRequestHandlerMapper localHttpRequestHandlerMapper = this.handlerMapper;
    if (localHttpRequestHandlerMapper != null) {
      localHttpRequestHandler = this.handlerMapper.lookup(paramHttpRequest);
    }
    if (localHttpRequestHandler != null) {
      localHttpRequestHandler.handle(paramHttpRequest, paramHttpResponse, paramHttpContext);
    }
    for (;;)
    {
      return;
      i = 501;
      paramHttpResponse.setStatusCode(i);
    }
  }
  
  public HttpParams getParams()
  {
    return this.params;
  }
  
  protected void handleException(HttpException paramHttpException, HttpResponse paramHttpResponse)
  {
    boolean bool1 = paramHttpException instanceof MethodNotSupportedException;
    if (bool1)
    {
      int i = 501;
      paramHttpResponse.setStatusCode(i);
    }
    for (;;)
    {
      Object localObject = ((HttpException)paramHttpException).getMessage();
      if (localObject == null) {
        localObject = ((HttpException)paramHttpException).toString();
      }
      localObject = EncodingUtils.getAsciiBytes((String)localObject);
      ByteArrayEntity localByteArrayEntity = new org/apache/http/entity/ByteArrayEntity;
      localByteArrayEntity.<init>((byte[])localObject);
      localByteArrayEntity.setContentType("text/plain; charset=US-ASCII");
      paramHttpResponse.setEntity(localByteArrayEntity);
      return;
      boolean bool2 = paramHttpException instanceof UnsupportedHttpVersionException;
      if (bool2)
      {
        int j = 505;
        paramHttpResponse.setStatusCode(j);
      }
      else
      {
        boolean bool3 = paramHttpException instanceof ProtocolException;
        int k;
        if (bool3)
        {
          k = 400;
          paramHttpResponse.setStatusCode(k);
        }
        else
        {
          k = 500;
          paramHttpResponse.setStatusCode(k);
        }
      }
    }
  }
  
  public void handleRequest(HttpServerConnection paramHttpServerConnection, HttpContext paramHttpContext)
  {
    boolean bool1 = false;
    localObject1 = null;
    i = 500;
    int j = 200;
    Object localObject2 = "http.connection";
    paramHttpContext.setAttribute((String)localObject2, paramHttpServerConnection);
    for (;;)
    {
      try
      {
        localObject4 = paramHttpServerConnection.receiveRequestHeader();
        bool2 = localObject4 instanceof HttpEntityEnclosingRequest;
        if (!bool2) {
          continue;
        }
        localObject5 = localObject4;
        localObject5 = (HttpEntityEnclosingRequest)localObject4;
        localObject2 = localObject5;
        bool2 = ((HttpEntityEnclosingRequest)localObject5).expectContinue();
        if (!bool2) {
          continue;
        }
        localObject2 = this.responseFactory;
        localObject6 = HttpVersion.HTTP_1_1;
        int k = 100;
        localObject2 = ((HttpResponseFactory)localObject2).newHttpResponse((ProtocolVersion)localObject6, k, paramHttpContext);
        localObject6 = this.expectationVerifier;
        if (localObject6 == null) {}
      }
      catch (HttpException localHttpException2)
      {
        Object localObject4;
        boolean bool2;
        Object localObject5;
        Object localObject6;
        int m;
        Object localObject3 = this.responseFactory;
        localObject1 = HttpVersion.HTTP_1_0;
        localObject3 = ((HttpResponseFactory)localObject3).newHttpResponse((ProtocolVersion)localObject1, i, paramHttpContext);
        handleException(localHttpException2, (HttpResponse)localObject3);
        continue;
      }
      try
      {
        localObject6 = this.expectationVerifier;
        ((HttpExpectationVerifier)localObject6).verify((HttpRequest)localObject4, (HttpResponse)localObject2, paramHttpContext);
      }
      catch (HttpException localHttpException1)
      {
        localObject6 = this.responseFactory;
        localHttpVersion = HttpVersion.HTTP_1_0;
        n = 500;
        localObject6 = ((HttpResponseFactory)localObject6).newHttpResponse(localHttpVersion, n, paramHttpContext);
        handleException(localHttpException1, (HttpResponse)localObject6);
        localObject3 = localObject6;
      }
    }
    localObject6 = ((HttpResponse)localObject2).getStatusLine();
    m = ((StatusLine)localObject6).getStatusCode();
    if (m < j)
    {
      paramHttpServerConnection.sendResponseHeader((HttpResponse)localObject2);
      paramHttpServerConnection.flush();
      localObject5 = localObject4;
      localObject5 = (HttpEntityEnclosingRequest)localObject4;
      localObject2 = localObject5;
      paramHttpServerConnection.receiveRequestEntity((HttpEntityEnclosingRequest)localObject5);
      bool2 = false;
    }
    for (localObject2 = null;; localObject3 = null)
    {
      localObject1 = "http.request";
      paramHttpContext.setAttribute((String)localObject1, localObject4);
      if (localObject2 == null)
      {
        localObject2 = this.responseFactory;
        localObject1 = HttpVersion.HTTP_1_1;
        m = 200;
        localObject2 = ((HttpResponseFactory)localObject2).newHttpResponse((ProtocolVersion)localObject1, m, paramHttpContext);
        localObject1 = this.processor;
        ((HttpProcessor)localObject1).process((HttpRequest)localObject4, paramHttpContext);
        doService((HttpRequest)localObject4, (HttpResponse)localObject2, paramHttpContext);
      }
      bool1 = localObject4 instanceof HttpEntityEnclosingRequest;
      if (bool1)
      {
        localObject4 = (HttpEntityEnclosingRequest)localObject4;
        localObject4 = ((HttpEntityEnclosingRequest)localObject4).getEntity();
        EntityUtils.consume((HttpEntity)localObject4);
      }
      paramHttpContext.setAttribute("http.response", localObject2);
      this.processor.process((HttpResponse)localObject2, paramHttpContext);
      paramHttpServerConnection.sendResponseHeader((HttpResponse)localObject2);
      paramHttpServerConnection.sendResponseEntity((HttpResponse)localObject2);
      paramHttpServerConnection.flush();
      localObject4 = this.connStrategy;
      bool2 = ((ConnectionReuseStrategy)localObject4).keepAlive((HttpResponse)localObject2, paramHttpContext);
      if (!bool2) {
        paramHttpServerConnection.close();
      }
      return;
      HttpVersion localHttpVersion;
      int n;
      localObject5 = localObject4;
      localObject5 = (HttpEntityEnclosingRequest)localObject4;
      localObject3 = localObject5;
      paramHttpServerConnection.receiveRequestEntity((HttpEntityEnclosingRequest)localObject5);
      bool2 = false;
    }
  }
  
  public void setConnReuseStrategy(ConnectionReuseStrategy paramConnectionReuseStrategy)
  {
    Args.notNull(paramConnectionReuseStrategy, "Connection reuse strategy");
    this.connStrategy = paramConnectionReuseStrategy;
  }
  
  public void setExpectationVerifier(HttpExpectationVerifier paramHttpExpectationVerifier)
  {
    this.expectationVerifier = paramHttpExpectationVerifier;
  }
  
  public void setHandlerResolver(HttpRequestHandlerResolver paramHttpRequestHandlerResolver)
  {
    HttpService.HttpRequestHandlerResolverAdapter localHttpRequestHandlerResolverAdapter = new org/apache/http/protocol/HttpService$HttpRequestHandlerResolverAdapter;
    localHttpRequestHandlerResolverAdapter.<init>(paramHttpRequestHandlerResolver);
    this.handlerMapper = localHttpRequestHandlerResolverAdapter;
  }
  
  public void setHttpProcessor(HttpProcessor paramHttpProcessor)
  {
    Args.notNull(paramHttpProcessor, "HTTP processor");
    this.processor = paramHttpProcessor;
  }
  
  public void setParams(HttpParams paramHttpParams)
  {
    this.params = paramHttpParams;
  }
  
  public void setResponseFactory(HttpResponseFactory paramHttpResponseFactory)
  {
    Args.notNull(paramHttpResponseFactory, "Response factory");
    this.responseFactory = paramHttpResponseFactory;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\HttpService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */