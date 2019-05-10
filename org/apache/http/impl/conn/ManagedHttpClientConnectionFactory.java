package org.apache.http.impl.conn;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.MessageConstraints;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.io.DefaultHttpRequestWriterFactory;
import org.apache.http.io.HttpMessageParserFactory;
import org.apache.http.io.HttpMessageWriterFactory;

public class ManagedHttpClientConnectionFactory
  implements HttpConnectionFactory
{
  private static final AtomicLong COUNTER;
  public static final ManagedHttpClientConnectionFactory INSTANCE;
  private final Log headerlog;
  private final Log log;
  private final HttpMessageWriterFactory requestWriterFactory;
  private final HttpMessageParserFactory responseParserFactory;
  private final Log wirelog;
  
  static
  {
    Object localObject = new java/util/concurrent/atomic/AtomicLong;
    ((AtomicLong)localObject).<init>();
    COUNTER = (AtomicLong)localObject;
    localObject = new org/apache/http/impl/conn/ManagedHttpClientConnectionFactory;
    ((ManagedHttpClientConnectionFactory)localObject).<init>();
    INSTANCE = (ManagedHttpClientConnectionFactory)localObject;
  }
  
  public ManagedHttpClientConnectionFactory()
  {
    this(null, null);
  }
  
  public ManagedHttpClientConnectionFactory(HttpMessageParserFactory paramHttpMessageParserFactory)
  {
    this(null, paramHttpMessageParserFactory);
  }
  
  public ManagedHttpClientConnectionFactory(HttpMessageWriterFactory paramHttpMessageWriterFactory, HttpMessageParserFactory paramHttpMessageParserFactory)
  {
    Log localLog = LogFactory.getLog(DefaultManagedHttpClientConnection.class);
    this.log = localLog;
    localLog = LogFactory.getLog("org.apache.http.headers");
    this.headerlog = localLog;
    localLog = LogFactory.getLog("org.apache.http.wire");
    this.wirelog = localLog;
    if (paramHttpMessageWriterFactory != null)
    {
      this.requestWriterFactory = paramHttpMessageWriterFactory;
      if (paramHttpMessageParserFactory == null) {
        break label63;
      }
    }
    for (;;)
    {
      this.responseParserFactory = paramHttpMessageParserFactory;
      return;
      paramHttpMessageWriterFactory = DefaultHttpRequestWriterFactory.INSTANCE;
      break;
      label63:
      paramHttpMessageParserFactory = DefaultHttpResponseParserFactory.INSTANCE;
    }
  }
  
  public ManagedHttpClientConnection create(HttpRoute paramHttpRoute, ConnectionConfig paramConnectionConfig)
  {
    CharsetDecoder localCharsetDecoder;
    CharsetEncoder localCharsetEncoder;
    Object localObject1;
    Object localObject2;
    if (paramConnectionConfig != null)
    {
      localCharsetDecoder = null;
      localCharsetEncoder = null;
      localObject1 = paramConnectionConfig.getCharset();
      localObject2 = paramConnectionConfig.getMalformedInputAction();
      if (localObject2 == null) {
        break label230;
      }
      localObject2 = paramConnectionConfig.getMalformedInputAction();
      label32:
      localObject3 = paramConnectionConfig.getUnmappableInputAction();
      if (localObject3 == null) {
        break label238;
      }
    }
    label230:
    label238:
    for (Object localObject3 = paramConnectionConfig.getUnmappableInputAction();; localObject3 = CodingErrorAction.REPORT)
    {
      if (localObject1 != null)
      {
        localCharsetDecoder = ((Charset)localObject1).newDecoder();
        localCharsetDecoder.onMalformedInput((CodingErrorAction)localObject2);
        localCharsetDecoder.onUnmappableCharacter((CodingErrorAction)localObject3);
        localCharsetEncoder = ((Charset)localObject1).newEncoder();
        localCharsetEncoder.onMalformedInput((CodingErrorAction)localObject2);
        localCharsetEncoder.onUnmappableCharacter((CodingErrorAction)localObject3);
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("http-outgoing-");
      localObject3 = Long.toString(COUNTER.getAndIncrement());
      localObject3 = (String)localObject3;
      localObject2 = new org/apache/http/impl/conn/LoggingManagedHttpClientConnection;
      localObject1 = this.log;
      Log localLog1 = this.headerlog;
      Log localLog2 = this.wirelog;
      int i = paramConnectionConfig.getBufferSize();
      int j = paramConnectionConfig.getFragmentSizeHint();
      MessageConstraints localMessageConstraints = paramConnectionConfig.getMessageConstraints();
      HttpMessageWriterFactory localHttpMessageWriterFactory = this.requestWriterFactory;
      HttpMessageParserFactory localHttpMessageParserFactory = this.responseParserFactory;
      ((LoggingManagedHttpClientConnection)localObject2).<init>((String)localObject3, (Log)localObject1, localLog1, localLog2, i, j, localCharsetDecoder, localCharsetEncoder, localMessageConstraints, null, null, localHttpMessageWriterFactory, localHttpMessageParserFactory);
      return (ManagedHttpClientConnection)localObject2;
      paramConnectionConfig = ConnectionConfig.DEFAULT;
      break;
      localObject2 = CodingErrorAction.REPORT;
      break label32;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\ManagedHttpClientConnectionFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */