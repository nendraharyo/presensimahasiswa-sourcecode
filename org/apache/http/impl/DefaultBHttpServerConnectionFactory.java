package org.apache.http.impl;

import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.io.HttpMessageParserFactory;
import org.apache.http.io.HttpMessageWriterFactory;

public class DefaultBHttpServerConnectionFactory
  implements HttpConnectionFactory
{
  public static final DefaultBHttpServerConnectionFactory INSTANCE;
  private final ConnectionConfig cconfig;
  private final ContentLengthStrategy incomingContentStrategy;
  private final ContentLengthStrategy outgoingContentStrategy;
  private final HttpMessageParserFactory requestParserFactory;
  private final HttpMessageWriterFactory responseWriterFactory;
  
  static
  {
    DefaultBHttpServerConnectionFactory localDefaultBHttpServerConnectionFactory = new org/apache/http/impl/DefaultBHttpServerConnectionFactory;
    localDefaultBHttpServerConnectionFactory.<init>();
    INSTANCE = localDefaultBHttpServerConnectionFactory;
  }
  
  public DefaultBHttpServerConnectionFactory()
  {
    this(null, null, null, null, null);
  }
  
  public DefaultBHttpServerConnectionFactory(ConnectionConfig paramConnectionConfig)
  {
    this(paramConnectionConfig, null, null, null, null);
  }
  
  public DefaultBHttpServerConnectionFactory(ConnectionConfig paramConnectionConfig, ContentLengthStrategy paramContentLengthStrategy1, ContentLengthStrategy paramContentLengthStrategy2, HttpMessageParserFactory paramHttpMessageParserFactory, HttpMessageWriterFactory paramHttpMessageWriterFactory)
  {
    if (paramConnectionConfig != null) {}
    for (;;)
    {
      this.cconfig = paramConnectionConfig;
      this.incomingContentStrategy = paramContentLengthStrategy1;
      this.outgoingContentStrategy = paramContentLengthStrategy2;
      this.requestParserFactory = paramHttpMessageParserFactory;
      this.responseWriterFactory = paramHttpMessageWriterFactory;
      return;
      paramConnectionConfig = ConnectionConfig.DEFAULT;
    }
  }
  
  public DefaultBHttpServerConnectionFactory(ConnectionConfig paramConnectionConfig, HttpMessageParserFactory paramHttpMessageParserFactory, HttpMessageWriterFactory paramHttpMessageWriterFactory)
  {
    this(paramConnectionConfig, null, null, paramHttpMessageParserFactory, paramHttpMessageWriterFactory);
  }
  
  public DefaultBHttpServerConnection createConnection(Socket paramSocket)
  {
    DefaultBHttpServerConnection localDefaultBHttpServerConnection = new org/apache/http/impl/DefaultBHttpServerConnection;
    int i = this.cconfig.getBufferSize();
    int j = this.cconfig.getFragmentSizeHint();
    CharsetDecoder localCharsetDecoder = ConnSupport.createDecoder(this.cconfig);
    CharsetEncoder localCharsetEncoder = ConnSupport.createEncoder(this.cconfig);
    MessageConstraints localMessageConstraints = this.cconfig.getMessageConstraints();
    ContentLengthStrategy localContentLengthStrategy1 = this.incomingContentStrategy;
    ContentLengthStrategy localContentLengthStrategy2 = this.outgoingContentStrategy;
    HttpMessageParserFactory localHttpMessageParserFactory = this.requestParserFactory;
    HttpMessageWriterFactory localHttpMessageWriterFactory = this.responseWriterFactory;
    localDefaultBHttpServerConnection.<init>(i, j, localCharsetDecoder, localCharsetEncoder, localMessageConstraints, localContentLengthStrategy1, localContentLengthStrategy2, localHttpMessageParserFactory, localHttpMessageWriterFactory);
    localDefaultBHttpServerConnection.bind(paramSocket);
    return localDefaultBHttpServerConnection;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\DefaultBHttpServerConnectionFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */