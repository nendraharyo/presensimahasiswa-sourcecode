package org.apache.http.impl;

import java.io.IOException;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.StatusLine;
import org.apache.http.impl.entity.DisallowIdentityContentLengthStrategy;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.DefaultHttpRequestParser;
import org.apache.http.impl.io.HttpResponseWriter;
import org.apache.http.io.EofSensor;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public abstract class AbstractHttpServerConnection
  implements HttpServerConnection
{
  private final EntityDeserializer entitydeserializer;
  private final EntitySerializer entityserializer;
  private EofSensor eofSensor = null;
  private SessionInputBuffer inbuffer = null;
  private HttpConnectionMetricsImpl metrics = null;
  private SessionOutputBuffer outbuffer = null;
  private HttpMessageParser requestParser = null;
  private HttpMessageWriter responseWriter = null;
  
  public AbstractHttpServerConnection()
  {
    Object localObject = createEntitySerializer();
    this.entityserializer = ((EntitySerializer)localObject);
    localObject = createEntityDeserializer();
    this.entitydeserializer = ((EntityDeserializer)localObject);
  }
  
  protected abstract void assertOpen();
  
  protected HttpConnectionMetricsImpl createConnectionMetrics(HttpTransportMetrics paramHttpTransportMetrics1, HttpTransportMetrics paramHttpTransportMetrics2)
  {
    HttpConnectionMetricsImpl localHttpConnectionMetricsImpl = new org/apache/http/impl/HttpConnectionMetricsImpl;
    localHttpConnectionMetricsImpl.<init>(paramHttpTransportMetrics1, paramHttpTransportMetrics2);
    return localHttpConnectionMetricsImpl;
  }
  
  protected EntityDeserializer createEntityDeserializer()
  {
    EntityDeserializer localEntityDeserializer = new org/apache/http/impl/entity/EntityDeserializer;
    DisallowIdentityContentLengthStrategy localDisallowIdentityContentLengthStrategy = new org/apache/http/impl/entity/DisallowIdentityContentLengthStrategy;
    LaxContentLengthStrategy localLaxContentLengthStrategy = new org/apache/http/impl/entity/LaxContentLengthStrategy;
    localLaxContentLengthStrategy.<init>(0);
    localDisallowIdentityContentLengthStrategy.<init>(localLaxContentLengthStrategy);
    localEntityDeserializer.<init>(localDisallowIdentityContentLengthStrategy);
    return localEntityDeserializer;
  }
  
  protected EntitySerializer createEntitySerializer()
  {
    EntitySerializer localEntitySerializer = new org/apache/http/impl/entity/EntitySerializer;
    StrictContentLengthStrategy localStrictContentLengthStrategy = new org/apache/http/impl/entity/StrictContentLengthStrategy;
    localStrictContentLengthStrategy.<init>();
    localEntitySerializer.<init>(localStrictContentLengthStrategy);
    return localEntitySerializer;
  }
  
  protected HttpRequestFactory createHttpRequestFactory()
  {
    return DefaultHttpRequestFactory.INSTANCE;
  }
  
  protected HttpMessageParser createRequestParser(SessionInputBuffer paramSessionInputBuffer, HttpRequestFactory paramHttpRequestFactory, HttpParams paramHttpParams)
  {
    DefaultHttpRequestParser localDefaultHttpRequestParser = new org/apache/http/impl/io/DefaultHttpRequestParser;
    localDefaultHttpRequestParser.<init>(paramSessionInputBuffer, null, paramHttpRequestFactory, paramHttpParams);
    return localDefaultHttpRequestParser;
  }
  
  protected HttpMessageWriter createResponseWriter(SessionOutputBuffer paramSessionOutputBuffer, HttpParams paramHttpParams)
  {
    HttpResponseWriter localHttpResponseWriter = new org/apache/http/impl/io/HttpResponseWriter;
    localHttpResponseWriter.<init>(paramSessionOutputBuffer, null, paramHttpParams);
    return localHttpResponseWriter;
  }
  
  protected void doFlush()
  {
    this.outbuffer.flush();
  }
  
  public void flush()
  {
    assertOpen();
    doFlush();
  }
  
  public HttpConnectionMetrics getMetrics()
  {
    return this.metrics;
  }
  
  protected void init(SessionInputBuffer paramSessionInputBuffer, SessionOutputBuffer paramSessionOutputBuffer, HttpParams paramHttpParams)
  {
    Object localObject = (SessionInputBuffer)Args.notNull(paramSessionInputBuffer, "Input session buffer");
    this.inbuffer = ((SessionInputBuffer)localObject);
    localObject = (SessionOutputBuffer)Args.notNull(paramSessionOutputBuffer, "Output session buffer");
    this.outbuffer = ((SessionOutputBuffer)localObject);
    boolean bool = paramSessionInputBuffer instanceof EofSensor;
    if (bool)
    {
      localObject = paramSessionInputBuffer;
      localObject = (EofSensor)paramSessionInputBuffer;
      this.eofSensor = ((EofSensor)localObject);
    }
    localObject = createHttpRequestFactory();
    localObject = createRequestParser((SessionInputBuffer)paramSessionInputBuffer, (HttpRequestFactory)localObject, paramHttpParams);
    this.requestParser = ((HttpMessageParser)localObject);
    localObject = createResponseWriter(paramSessionOutputBuffer, paramHttpParams);
    this.responseWriter = ((HttpMessageWriter)localObject);
    localObject = ((SessionInputBuffer)paramSessionInputBuffer).getMetrics();
    HttpTransportMetrics localHttpTransportMetrics = paramSessionOutputBuffer.getMetrics();
    localObject = createConnectionMetrics((HttpTransportMetrics)localObject, localHttpTransportMetrics);
    this.metrics = ((HttpConnectionMetricsImpl)localObject);
  }
  
  protected boolean isEof()
  {
    EofSensor localEofSensor = this.eofSensor;
    boolean bool;
    if (localEofSensor != null)
    {
      localEofSensor = this.eofSensor;
      bool = localEofSensor.isEof();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localEofSensor = null;
    }
  }
  
  public boolean isStale()
  {
    boolean bool1 = true;
    boolean bool2 = isOpen();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = isEof();
      if (!bool2) {
        try
        {
          SessionInputBuffer localSessionInputBuffer = this.inbuffer;
          int i = 1;
          localSessionInputBuffer.isDataAvailable(i);
          bool1 = isEof();
        }
        catch (IOException localIOException) {}
      }
    }
  }
  
  public void receiveRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    Args.notNull(paramHttpEntityEnclosingRequest, "HTTP request");
    assertOpen();
    Object localObject = this.entitydeserializer;
    SessionInputBuffer localSessionInputBuffer = this.inbuffer;
    localObject = ((EntityDeserializer)localObject).deserialize(localSessionInputBuffer, paramHttpEntityEnclosingRequest);
    paramHttpEntityEnclosingRequest.setEntity((HttpEntity)localObject);
  }
  
  public HttpRequest receiveRequestHeader()
  {
    assertOpen();
    HttpRequest localHttpRequest = (HttpRequest)this.requestParser.parse();
    this.metrics.incrementRequestCount();
    return localHttpRequest;
  }
  
  public void sendResponseEntity(HttpResponse paramHttpResponse)
  {
    Object localObject = paramHttpResponse.getEntity();
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = this.entityserializer;
      SessionOutputBuffer localSessionOutputBuffer = this.outbuffer;
      HttpEntity localHttpEntity = paramHttpResponse.getEntity();
      ((EntitySerializer)localObject).serialize(localSessionOutputBuffer, paramHttpResponse, localHttpEntity);
    }
  }
  
  public void sendResponseHeader(HttpResponse paramHttpResponse)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    assertOpen();
    this.responseWriter.write(paramHttpResponse);
    Object localObject = paramHttpResponse.getStatusLine();
    int i = ((StatusLine)localObject).getStatusCode();
    int j = 200;
    if (i >= j)
    {
      localObject = this.metrics;
      ((HttpConnectionMetricsImpl)localObject).incrementResponseCount();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\AbstractHttpServerConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */