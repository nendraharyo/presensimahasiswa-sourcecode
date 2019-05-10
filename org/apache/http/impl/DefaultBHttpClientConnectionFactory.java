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

public class DefaultBHttpClientConnectionFactory
  implements HttpConnectionFactory
{
  public static final DefaultBHttpClientConnectionFactory INSTANCE;
  private final ConnectionConfig cconfig;
  private final ContentLengthStrategy incomingContentStrategy;
  private final ContentLengthStrategy outgoingContentStrategy;
  private final HttpMessageWriterFactory requestWriterFactory;
  private final HttpMessageParserFactory responseParserFactory;
  
  static
  {
    DefaultBHttpClientConnectionFactory localDefaultBHttpClientConnectionFactory = new org/apache/http/impl/DefaultBHttpClientConnectionFactory;
    localDefaultBHttpClientConnectionFactory.<init>();
    INSTANCE = localDefaultBHttpClientConnectionFactory;
  }
  
  public DefaultBHttpClientConnectionFactory()
  {
    this(null, null, null, null, null);
  }
  
  public DefaultBHttpClientConnectionFactory(ConnectionConfig paramConnectionConfig)
  {
    this(paramConnectionConfig, null, null, null, null);
  }
  
  public DefaultBHttpClientConnectionFactory(ConnectionConfig paramConnectionConfig, ContentLengthStrategy paramContentLengthStrategy1, ContentLengthStrategy paramContentLengthStrategy2, HttpMessageWriterFactory paramHttpMessageWriterFactory, HttpMessageParserFactory paramHttpMessageParserFactory)
  {
    if (paramConnectionConfig != null) {}
    for (;;)
    {
      this.cconfig = paramConnectionConfig;
      this.incomingContentStrategy = paramContentLengthStrategy1;
      this.outgoingContentStrategy = paramContentLengthStrategy2;
      this.requestWriterFactory = paramHttpMessageWriterFactory;
      this.responseParserFactory = paramHttpMessageParserFactory;
      return;
      paramConnectionConfig = ConnectionConfig.DEFAULT;
    }
  }
  
  public DefaultBHttpClientConnectionFactory(ConnectionConfig paramConnectionConfig, HttpMessageWriterFactory paramHttpMessageWriterFactory, HttpMessageParserFactory paramHttpMessageParserFactory)
  {
    this(paramConnectionConfig, null, null, paramHttpMessageWriterFactory, paramHttpMessageParserFactory);
  }
  
  public DefaultBHttpClientConnection createConnection(Socket paramSocket)
  {
    DefaultBHttpClientConnection localDefaultBHttpClientConnection = new org/apache/http/impl/DefaultBHttpClientConnection;
    int i = this.cconfig.getBufferSize();
    int j = this.cconfig.getFragmentSizeHint();
    CharsetDecoder localCharsetDecoder = ConnSupport.createDecoder(this.cconfig);
    CharsetEncoder localCharsetEncoder = ConnSupport.createEncoder(this.cconfig);
    MessageConstraints localMessageConstraints = this.cconfig.getMessageConstraints();
    ContentLengthStrategy localContentLengthStrategy1 = this.incomingContentStrategy;
    ContentLengthStrategy localContentLengthStrategy2 = this.outgoingContentStrategy;
    HttpMessageWriterFactory localHttpMessageWriterFactory = this.requestWriterFactory;
    HttpMessageParserFactory localHttpMessageParserFactory = this.responseParserFactory;
    localDefaultBHttpClientConnection.<init>(i, j, localCharsetDecoder, localCharsetEncoder, localMessageConstraints, localContentLengthStrategy1, localContentLengthStrategy2, localHttpMessageWriterFactory, localHttpMessageParserFactory);
    localDefaultBHttpClientConnection.bind(paramSocket);
    return localDefaultBHttpClientConnection;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\DefaultBHttpClientConnectionFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */