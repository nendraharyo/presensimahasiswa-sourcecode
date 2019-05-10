package org.apache.http.impl;

import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.StatusLine;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.DefaultHttpResponseParser;
import org.apache.http.impl.io.HttpRequestWriter;
import org.apache.http.io.EofSensor;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public abstract class AbstractHttpClientConnection
  implements HttpClientConnection
{
  private final EntityDeserializer entitydeserializer;
  private final EntitySerializer entityserializer;
  private EofSensor eofSensor = null;
  private SessionInputBuffer inbuffer = null;
  private HttpConnectionMetricsImpl metrics = null;
  private SessionOutputBuffer outbuffer = null;
  private HttpMessageWriter requestWriter = null;
  private HttpMessageParser responseParser = null;
  
  public AbstractHttpClientConnection()
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
    LaxContentLengthStrategy localLaxContentLengthStrategy = new org/apache/http/impl/entity/LaxContentLengthStrategy;
    localLaxContentLengthStrategy.<init>();
    localEntityDeserializer.<init>(localLaxContentLengthStrategy);
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
  
  protected HttpResponseFactory createHttpResponseFactory()
  {
    return DefaultHttpResponseFactory.INSTANCE;
  }
  
  protected HttpMessageWriter createRequestWriter(SessionOutputBuffer paramSessionOutputBuffer, HttpParams paramHttpParams)
  {
    HttpRequestWriter localHttpRequestWriter = new org/apache/http/impl/io/HttpRequestWriter;
    localHttpRequestWriter.<init>(paramSessionOutputBuffer, null, paramHttpParams);
    return localHttpRequestWriter;
  }
  
  protected HttpMessageParser createResponseParser(SessionInputBuffer paramSessionInputBuffer, HttpResponseFactory paramHttpResponseFactory, HttpParams paramHttpParams)
  {
    DefaultHttpResponseParser localDefaultHttpResponseParser = new org/apache/http/impl/io/DefaultHttpResponseParser;
    localDefaultHttpResponseParser.<init>(paramSessionInputBuffer, null, paramHttpResponseFactory, paramHttpParams);
    return localDefaultHttpResponseParser;
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
    localObject = createHttpResponseFactory();
    localObject = createResponseParser((SessionInputBuffer)paramSessionInputBuffer, (HttpResponseFactory)localObject, paramHttpParams);
    this.responseParser = ((HttpMessageParser)localObject);
    localObject = createRequestWriter(paramSessionOutputBuffer, paramHttpParams);
    this.requestWriter = ((HttpMessageWriter)localObject);
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
  
  public boolean isResponseAvailable(int paramInt)
  {
    assertOpen();
    try
    {
      SessionInputBuffer localSessionInputBuffer = this.inbuffer;
      bool = localSessionInputBuffer.isDataAvailable(paramInt);
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
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
        catch (SocketTimeoutException localSocketTimeoutException)
        {
          bool1 = false;
        }
        catch (IOException localIOException) {}
      }
    }
  }
  
  public void receiveResponseEntity(HttpResponse paramHttpResponse)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    assertOpen();
    Object localObject = this.entitydeserializer;
    SessionInputBuffer localSessionInputBuffer = this.inbuffer;
    localObject = ((EntityDeserializer)localObject).deserialize(localSessionInputBuffer, paramHttpResponse);
    paramHttpResponse.setEntity((HttpEntity)localObject);
  }
  
  public HttpResponse receiveResponseHeader()
  {
    assertOpen();
    HttpResponse localHttpResponse = (HttpResponse)this.responseParser.parse();
    Object localObject = localHttpResponse.getStatusLine();
    int i = ((StatusLine)localObject).getStatusCode();
    int j = 200;
    if (i >= j)
    {
      localObject = this.metrics;
      ((HttpConnectionMetricsImpl)localObject).incrementResponseCount();
    }
    return localHttpResponse;
  }
  
  public void sendRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    Args.notNull(paramHttpEntityEnclosingRequest, "HTTP request");
    assertOpen();
    Object localObject = paramHttpEntityEnclosingRequest.getEntity();
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = this.entityserializer;
      SessionOutputBuffer localSessionOutputBuffer = this.outbuffer;
      HttpEntity localHttpEntity = paramHttpEntityEnclosingRequest.getEntity();
      ((EntitySerializer)localObject).serialize(localSessionOutputBuffer, paramHttpEntityEnclosingRequest, localHttpEntity);
    }
  }
  
  public void sendRequestHeader(HttpRequest paramHttpRequest)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    assertOpen();
    this.requestWriter.write(paramHttpRequest);
    this.metrics.incrementRequestCount();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\AbstractHttpClientConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */