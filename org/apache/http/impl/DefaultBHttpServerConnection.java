package org.apache.http.impl;

import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.StatusLine;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageParserFactory;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.HttpMessageWriterFactory;
import org.apache.http.util.Args;

public class DefaultBHttpServerConnection
  extends BHttpConnectionBase
  implements HttpServerConnection
{
  private final HttpMessageParser requestParser;
  private final HttpMessageWriter responseWriter;
  
  public DefaultBHttpServerConnection(int paramInt)
  {
    this(paramInt, paramInt, null, null, null, null, null, null, null);
  }
  
  public DefaultBHttpServerConnection(int paramInt1, int paramInt2, CharsetDecoder paramCharsetDecoder, CharsetEncoder paramCharsetEncoder, MessageConstraints paramMessageConstraints, ContentLengthStrategy paramContentLengthStrategy1, ContentLengthStrategy paramContentLengthStrategy2, HttpMessageParserFactory paramHttpMessageParserFactory, HttpMessageWriterFactory paramHttpMessageWriterFactory) {}
  
  public DefaultBHttpServerConnection(int paramInt, CharsetDecoder paramCharsetDecoder, CharsetEncoder paramCharsetEncoder, MessageConstraints paramMessageConstraints)
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
  
  protected void onRequestReceived(HttpRequest paramHttpRequest) {}
  
  protected void onResponseSubmitted(HttpResponse paramHttpResponse) {}
  
  public void receiveRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    Args.notNull(paramHttpEntityEnclosingRequest, "HTTP request");
    ensureOpen();
    HttpEntity localHttpEntity = prepareInput(paramHttpEntityEnclosingRequest);
    paramHttpEntityEnclosingRequest.setEntity(localHttpEntity);
  }
  
  public HttpRequest receiveRequestHeader()
  {
    ensureOpen();
    HttpRequest localHttpRequest = (HttpRequest)this.requestParser.parse();
    onRequestReceived(localHttpRequest);
    incrementRequestCount();
    return localHttpRequest;
  }
  
  public void sendResponseEntity(HttpResponse paramHttpResponse)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    ensureOpen();
    HttpEntity localHttpEntity = paramHttpResponse.getEntity();
    if (localHttpEntity == null) {}
    for (;;)
    {
      return;
      OutputStream localOutputStream = prepareOutput(paramHttpResponse);
      localHttpEntity.writeTo(localOutputStream);
      localOutputStream.close();
    }
  }
  
  public void sendResponseHeader(HttpResponse paramHttpResponse)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    ensureOpen();
    this.responseWriter.write(paramHttpResponse);
    onResponseSubmitted(paramHttpResponse);
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    int i = localStatusLine.getStatusCode();
    int j = 200;
    if (i >= j) {
      incrementResponseCount();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\DefaultBHttpServerConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */