package org.apache.http.impl.conn;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.config.MessageConstraints;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.DefaultBHttpClientConnection;
import org.apache.http.io.HttpMessageParserFactory;
import org.apache.http.io.HttpMessageWriterFactory;
import org.apache.http.protocol.HttpContext;

public class DefaultManagedHttpClientConnection
  extends DefaultBHttpClientConnection
  implements ManagedHttpClientConnection, HttpContext
{
  private final Map attributes;
  private final String id;
  private volatile boolean shutdown;
  
  public DefaultManagedHttpClientConnection(String paramString, int paramInt)
  {
    this(paramString, paramInt, paramInt, null, null, null, null, null, null, null);
  }
  
  public DefaultManagedHttpClientConnection(String paramString, int paramInt1, int paramInt2, CharsetDecoder paramCharsetDecoder, CharsetEncoder paramCharsetEncoder, MessageConstraints paramMessageConstraints, ContentLengthStrategy paramContentLengthStrategy1, ContentLengthStrategy paramContentLengthStrategy2, HttpMessageWriterFactory paramHttpMessageWriterFactory, HttpMessageParserFactory paramHttpMessageParserFactory)
  {
    super(paramInt1, paramInt2, paramCharsetDecoder, paramCharsetEncoder, paramMessageConstraints, paramContentLengthStrategy1, paramContentLengthStrategy2, paramHttpMessageWriterFactory, paramHttpMessageParserFactory);
    this.id = paramString;
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.attributes = ((Map)localObject);
  }
  
  public void bind(Socket paramSocket)
  {
    boolean bool = this.shutdown;
    if (bool)
    {
      paramSocket.close();
      InterruptedIOException localInterruptedIOException = new java/io/InterruptedIOException;
      localInterruptedIOException.<init>("Connection already shutdown");
      throw localInterruptedIOException;
    }
    super.bind(paramSocket);
  }
  
  public Object getAttribute(String paramString)
  {
    return this.attributes.get(paramString);
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public SSLSession getSSLSession()
  {
    Object localObject = super.getSocket();
    boolean bool = localObject instanceof SSLSocket;
    if (bool) {}
    for (localObject = ((SSLSocket)localObject).getSession();; localObject = null) {
      return (SSLSession)localObject;
    }
  }
  
  public Socket getSocket()
  {
    return super.getSocket();
  }
  
  public Object removeAttribute(String paramString)
  {
    return this.attributes.remove(paramString);
  }
  
  public void setAttribute(String paramString, Object paramObject)
  {
    this.attributes.put(paramString, paramObject);
  }
  
  public void shutdown()
  {
    this.shutdown = true;
    super.shutdown();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\DefaultManagedHttpClientConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */