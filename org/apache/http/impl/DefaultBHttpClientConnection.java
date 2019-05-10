package org.apache.http.impl;

import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.io.DefaultHttpRequestWriterFactory;
import org.apache.http.impl.io.DefaultHttpResponseParserFactory;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageParserFactory;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.HttpMessageWriterFactory;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;

public class DefaultBHttpClientConnection
  extends BHttpConnectionBase
  implements HttpClientConnection
{
  private final HttpMessageWriter requestWriter;
  private final HttpMessageParser responseParser;
  
  public DefaultBHttpClientConnection(int paramInt)
  {
    this(paramInt, paramInt, null, null, null, null, null, null, null);
  }
  
  public DefaultBHttpClientConnection(int paramInt1, int paramInt2, CharsetDecoder paramCharsetDecoder, CharsetEncoder paramCharsetEncoder, MessageConstraints paramMessageConstraints, ContentLengthStrategy paramContentLengthStrategy1, ContentLengthStrategy paramContentLengthStrategy2, HttpMessageWriterFactory paramHttpMessageWriterFactory, HttpMessageParserFactory paramHttpMessageParserFactory)
  {
    super(paramInt1, paramInt2, paramCharsetDecoder, paramCharsetEncoder, paramMessageConstraints, paramContentLengthStrategy1, paramContentLengthStrategy2);
    Object localObject;
    if (paramHttpMessageWriterFactory != null)
    {
      localObject = getSessionOutputBuffer();
      localObject = paramHttpMessageWriterFactory.create((SessionOutputBuffer)localObject);
      this.requestWriter = ((HttpMessageWriter)localObject);
      if (paramHttpMessageParserFactory == null) {
        break label82;
      }
    }
    for (;;)
    {
      localObject = getSessionInputBuffer();
      localObject = paramHttpMessageParserFactory.create((SessionInputBuffer)localObject, paramMessageConstraints);
      this.responseParser = ((HttpMessageParser)localObject);
      return;
      paramHttpMessageWriterFactory = DefaultHttpRequestWriterFactory.INSTANCE;
      break;
      label82:
      paramHttpMessageParserFactory = DefaultHttpResponseParserFactory.INSTANCE;
    }
  }
  
  public DefaultBHttpClientConnection(int paramInt, CharsetDecoder paramCharsetDecoder, CharsetEncoder paramCharsetEncoder, MessageConstraints paramMessageConstraints)
  {
    this(paramInt, paramInt, paramCharsetDecoder, paramCharsetEncoder, paramMessageConstraints, null, null, null, null);
  }
  
  public void bind(Socket paramSocket)
  {
    super.bind(paramSocket);
  }
  
  public void flush()
  {
    ensureOpen();
    doFlush();
  }
  
  public boolean isResponseAvailable(int paramInt)
  {
    ensureOpen();
    try
    {
      bool = awaitInput(paramInt);
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
    return bool;
  }
  
  protected void onRequestSubmitted(HttpRequest paramHttpRequest) {}
  
  protected void onResponseReceived(HttpResponse paramHttpResponse) {}
  
  public void receiveResponseEntity(HttpResponse paramHttpResponse)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    ensureOpen();
    HttpEntity localHttpEntity = prepareInput(paramHttpResponse);
    paramHttpResponse.setEntity(localHttpEntity);
  }
  
  public HttpResponse receiveResponseHeader()
  {
    ensureOpen();
    HttpResponse localHttpResponse = (HttpResponse)this.responseParser.parse();
    onResponseReceived(localHttpResponse);
    StatusLine localStatusLine = localHttpResponse.getStatusLine();
    int i = localStatusLine.getStatusCode();
    int j = 200;
    if (i >= j) {
      incrementResponseCount();
    }
    return localHttpResponse;
  }
  
  public void sendRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    Args.notNull(paramHttpEntityEnclosingRequest, "HTTP request");
    ensureOpen();
    HttpEntity localHttpEntity = paramHttpEntityEnclosingRequest.getEntity();
    if (localHttpEntity == null) {}
    for (;;)
    {
      return;
      OutputStream localOutputStream = prepareOutput(paramHttpEntityEnclosingRequest);
      localHttpEntity.writeTo(localOutputStream);
      localOutputStream.close();
    }
  }
  
  public void sendRequestHeader(HttpRequest paramHttpRequest)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    ensureOpen();
    this.requestWriter.write(paramHttpRequest);
    onRequestSubmitted(paramHttpRequest);
    incrementRequestCount();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\DefaultBHttpClientConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */