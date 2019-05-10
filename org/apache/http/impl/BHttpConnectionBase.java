package org.apache.http.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.Header;
import org.apache.http.HttpConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntity;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpMessage;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.ChunkedInputStream;
import org.apache.http.impl.io.ChunkedOutputStream;
import org.apache.http.impl.io.ContentLengthInputStream;
import org.apache.http.impl.io.ContentLengthOutputStream;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.impl.io.IdentityInputStream;
import org.apache.http.impl.io.IdentityOutputStream;
import org.apache.http.impl.io.SessionInputBufferImpl;
import org.apache.http.impl.io.SessionOutputBufferImpl;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.NetUtils;

public class BHttpConnectionBase
  implements HttpConnection, HttpInetConnection
{
  private final HttpConnectionMetricsImpl connMetrics;
  private final SessionInputBufferImpl inbuffer;
  private final ContentLengthStrategy incomingContentStrategy;
  private final SessionOutputBufferImpl outbuffer;
  private final ContentLengthStrategy outgoingContentStrategy;
  private final AtomicReference socketHolder;
  
  protected BHttpConnectionBase(int paramInt1, int paramInt2, CharsetDecoder paramCharsetDecoder, CharsetEncoder paramCharsetEncoder, MessageConstraints paramMessageConstraints, ContentLengthStrategy paramContentLengthStrategy1, ContentLengthStrategy paramContentLengthStrategy2)
  {
    Args.positive(paramInt1, "Buffer size");
    HttpTransportMetricsImpl localHttpTransportMetricsImpl1 = new org/apache/http/impl/io/HttpTransportMetricsImpl;
    localHttpTransportMetricsImpl1.<init>();
    HttpTransportMetricsImpl localHttpTransportMetricsImpl2 = new org/apache/http/impl/io/HttpTransportMetricsImpl;
    localHttpTransportMetricsImpl2.<init>();
    Object localObject = new org/apache/http/impl/io/SessionInputBufferImpl;
    int i = -1;
    MessageConstraints localMessageConstraints;
    if (paramMessageConstraints != null)
    {
      localMessageConstraints = paramMessageConstraints;
      ((SessionInputBufferImpl)localObject).<init>(localHttpTransportMetricsImpl1, paramInt1, i, localMessageConstraints, paramCharsetDecoder);
      this.inbuffer = ((SessionInputBufferImpl)localObject);
      localObject = new org/apache/http/impl/io/SessionOutputBufferImpl;
      ((SessionOutputBufferImpl)localObject).<init>(localHttpTransportMetricsImpl2, paramInt1, paramInt2, paramCharsetEncoder);
      this.outbuffer = ((SessionOutputBufferImpl)localObject);
      localObject = new org/apache/http/impl/HttpConnectionMetricsImpl;
      ((HttpConnectionMetricsImpl)localObject).<init>(localHttpTransportMetricsImpl1, localHttpTransportMetricsImpl2);
      this.connMetrics = ((HttpConnectionMetricsImpl)localObject);
      if (paramContentLengthStrategy1 == null) {
        break label156;
      }
      label114:
      this.incomingContentStrategy = paramContentLengthStrategy1;
      if (paramContentLengthStrategy2 == null) {
        break label164;
      }
    }
    for (;;)
    {
      this.outgoingContentStrategy = paramContentLengthStrategy2;
      localObject = new java/util/concurrent/atomic/AtomicReference;
      ((AtomicReference)localObject).<init>();
      this.socketHolder = ((AtomicReference)localObject);
      return;
      localMessageConstraints = MessageConstraints.DEFAULT;
      break;
      label156:
      paramContentLengthStrategy1 = LaxContentLengthStrategy.INSTANCE;
      break label114;
      label164:
      paramContentLengthStrategy2 = StrictContentLengthStrategy.INSTANCE;
    }
  }
  
  private int fillInputBuffer(int paramInt)
  {
    Socket localSocket = (Socket)this.socketHolder.get();
    int i = localSocket.getSoTimeout();
    try
    {
      localSocket.setSoTimeout(paramInt);
      SessionInputBufferImpl localSessionInputBufferImpl = this.inbuffer;
      int j = localSessionInputBufferImpl.fillBuffer();
      return j;
    }
    finally
    {
      localSocket.setSoTimeout(i);
    }
  }
  
  protected boolean awaitInput(int paramInt)
  {
    SessionInputBufferImpl localSessionInputBufferImpl = this.inbuffer;
    boolean bool = localSessionInputBufferImpl.hasBufferedData();
    if (bool) {}
    for (bool = true;; bool = localSessionInputBufferImpl.hasBufferedData())
    {
      return bool;
      fillInputBuffer(paramInt);
      localSessionInputBufferImpl = this.inbuffer;
    }
  }
  
  protected void bind(Socket paramSocket)
  {
    Args.notNull(paramSocket, "Socket");
    this.socketHolder.set(paramSocket);
    this.inbuffer.bind(null);
    this.outbuffer.bind(null);
  }
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 64	org/apache/http/impl/BHttpConnectionBase:socketHolder	Ljava/util/concurrent/atomic/AtomicReference;
    //   4: astore_1
    //   5: aconst_null
    //   6: astore_2
    //   7: aload_1
    //   8: aconst_null
    //   9: invokevirtual 128	java/util/concurrent/atomic/AtomicReference:getAndSet	(Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast 87	java/net/Socket
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull +33 -> 50
    //   20: aload_0
    //   21: getfield 41	org/apache/http/impl/BHttpConnectionBase:inbuffer	Lorg/apache/http/impl/io/SessionInputBufferImpl;
    //   24: astore_2
    //   25: aload_2
    //   26: invokevirtual 131	org/apache/http/impl/io/SessionInputBufferImpl:clear	()V
    //   29: aload_0
    //   30: getfield 48	org/apache/http/impl/BHttpConnectionBase:outbuffer	Lorg/apache/http/impl/io/SessionOutputBufferImpl;
    //   33: astore_2
    //   34: aload_2
    //   35: invokevirtual 134	org/apache/http/impl/io/SessionOutputBufferImpl:flush	()V
    //   38: aload_1
    //   39: invokevirtual 137	java/net/Socket:shutdownOutput	()V
    //   42: aload_1
    //   43: invokevirtual 140	java/net/Socket:shutdownInput	()V
    //   46: aload_1
    //   47: invokevirtual 143	java/net/Socket:close	()V
    //   50: return
    //   51: astore_2
    //   52: aload_1
    //   53: invokevirtual 143	java/net/Socket:close	()V
    //   56: aload_2
    //   57: athrow
    //   58: astore_2
    //   59: goto -17 -> 42
    //   62: astore_2
    //   63: goto -17 -> 46
    //   66: astore_2
    //   67: goto -21 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	BHttpConnectionBase
    //   4	49	1	localObject1	Object
    //   6	29	2	localObject2	Object
    //   51	6	2	localObject3	Object
    //   58	1	2	localIOException1	IOException
    //   62	1	2	localIOException2	IOException
    //   66	1	2	localUnsupportedOperationException	UnsupportedOperationException
    // Exception table:
    //   from	to	target	type
    //   20	24	51	finally
    //   25	29	51	finally
    //   29	33	51	finally
    //   34	38	51	finally
    //   38	42	51	finally
    //   42	46	51	finally
    //   38	42	58	java/io/IOException
    //   42	46	62	java/io/IOException
    //   38	42	66	java/lang/UnsupportedOperationException
    //   42	46	66	java/lang/UnsupportedOperationException
  }
  
  protected InputStream createInputStream(long paramLong, SessionInputBuffer paramSessionInputBuffer)
  {
    long l = -2;
    boolean bool = paramLong < l;
    Object localObject;
    if (!bool)
    {
      localObject = new org/apache/http/impl/io/ChunkedInputStream;
      ((ChunkedInputStream)localObject).<init>(paramSessionInputBuffer);
    }
    for (;;)
    {
      return (InputStream)localObject;
      l = -1;
      bool = paramLong < l;
      if (!bool)
      {
        localObject = new org/apache/http/impl/io/IdentityInputStream;
        ((IdentityInputStream)localObject).<init>(paramSessionInputBuffer);
      }
      else
      {
        localObject = new org/apache/http/impl/io/ContentLengthInputStream;
        ((ContentLengthInputStream)localObject).<init>(paramSessionInputBuffer, paramLong);
      }
    }
  }
  
  protected OutputStream createOutputStream(long paramLong, SessionOutputBuffer paramSessionOutputBuffer)
  {
    long l = -2;
    boolean bool = paramLong < l;
    Object localObject;
    if (!bool)
    {
      localObject = new org/apache/http/impl/io/ChunkedOutputStream;
      int i = 2048;
      ((ChunkedOutputStream)localObject).<init>(i, paramSessionOutputBuffer);
    }
    for (;;)
    {
      return (OutputStream)localObject;
      l = -1;
      bool = paramLong < l;
      if (!bool)
      {
        localObject = new org/apache/http/impl/io/IdentityOutputStream;
        ((IdentityOutputStream)localObject).<init>(paramSessionOutputBuffer);
      }
      else
      {
        localObject = new org/apache/http/impl/io/ContentLengthOutputStream;
        ((ContentLengthOutputStream)localObject).<init>(paramSessionOutputBuffer, paramLong);
      }
    }
  }
  
  protected void doFlush()
  {
    this.outbuffer.flush();
  }
  
  protected void ensureOpen()
  {
    Object localObject1 = (Socket)this.socketHolder.get();
    boolean bool;
    if (localObject1 != null) {
      bool = true;
    }
    for (;;)
    {
      Object localObject2 = "Connection is not open";
      Asserts.check(bool, (String)localObject2);
      Object localObject3 = this.inbuffer;
      bool = ((SessionInputBufferImpl)localObject3).isBound();
      if (!bool)
      {
        localObject3 = this.inbuffer;
        localObject2 = getSocketInputStream((Socket)localObject1);
        ((SessionInputBufferImpl)localObject3).bind((InputStream)localObject2);
      }
      localObject3 = this.outbuffer;
      bool = ((SessionOutputBufferImpl)localObject3).isBound();
      if (!bool)
      {
        localObject3 = this.outbuffer;
        localObject1 = getSocketOutputStream((Socket)localObject1);
        ((SessionOutputBufferImpl)localObject3).bind((OutputStream)localObject1);
      }
      return;
      bool = false;
      localObject3 = null;
    }
  }
  
  public InetAddress getLocalAddress()
  {
    Object localObject = (Socket)this.socketHolder.get();
    if (localObject != null) {}
    for (localObject = ((Socket)localObject).getLocalAddress();; localObject = null) {
      return (InetAddress)localObject;
    }
  }
  
  public int getLocalPort()
  {
    Socket localSocket = (Socket)this.socketHolder.get();
    if (localSocket != null) {}
    for (int i = localSocket.getLocalPort();; i = -1) {
      return i;
    }
  }
  
  public HttpConnectionMetrics getMetrics()
  {
    return this.connMetrics;
  }
  
  public InetAddress getRemoteAddress()
  {
    Object localObject = (Socket)this.socketHolder.get();
    if (localObject != null) {}
    for (localObject = ((Socket)localObject).getInetAddress();; localObject = null) {
      return (InetAddress)localObject;
    }
  }
  
  public int getRemotePort()
  {
    Socket localSocket = (Socket)this.socketHolder.get();
    if (localSocket != null) {}
    for (int i = localSocket.getPort();; i = -1) {
      return i;
    }
  }
  
  protected SessionInputBuffer getSessionInputBuffer()
  {
    return this.inbuffer;
  }
  
  protected SessionOutputBuffer getSessionOutputBuffer()
  {
    return this.outbuffer;
  }
  
  protected Socket getSocket()
  {
    return (Socket)this.socketHolder.get();
  }
  
  protected InputStream getSocketInputStream(Socket paramSocket)
  {
    return paramSocket.getInputStream();
  }
  
  protected OutputStream getSocketOutputStream(Socket paramSocket)
  {
    return paramSocket.getOutputStream();
  }
  
  public int getSocketTimeout()
  {
    int i = -1;
    Socket localSocket = (Socket)this.socketHolder.get();
    if (localSocket != null) {}
    for (;;)
    {
      try
      {
        j = localSocket.getSoTimeout();
      }
      catch (SocketException localSocketException)
      {
        j = i;
        continue;
      }
      return j;
      int j = i;
    }
  }
  
  protected void incrementRequestCount()
  {
    this.connMetrics.incrementRequestCount();
  }
  
  protected void incrementResponseCount()
  {
    this.connMetrics.incrementResponseCount();
  }
  
  public boolean isOpen()
  {
    Object localObject = this.socketHolder.get();
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean isStale()
  {
    boolean bool = true;
    int i = isOpen();
    if (i == 0) {}
    for (;;)
    {
      return bool;
      i = 1;
      try
      {
        int j = fillInputBuffer(i);
        if (j >= 0) {
          bool = false;
        }
      }
      catch (SocketTimeoutException localSocketTimeoutException)
      {
        bool = false;
      }
      catch (IOException localIOException) {}
    }
  }
  
  protected HttpEntity prepareInput(HttpMessage paramHttpMessage)
  {
    long l1 = -1;
    BasicHttpEntity localBasicHttpEntity = new org/apache/http/entity/BasicHttpEntity;
    localBasicHttpEntity.<init>();
    long l2 = this.incomingContentStrategy.determineLength(paramHttpMessage);
    Object localObject = this.inbuffer;
    localObject = createInputStream(l2, (SessionInputBuffer)localObject);
    long l3 = -2;
    boolean bool1 = l2 < l3;
    if (!bool1)
    {
      boolean bool2 = true;
      localBasicHttpEntity.setChunked(bool2);
      localBasicHttpEntity.setContentLength(l1);
      localBasicHttpEntity.setContent((InputStream)localObject);
    }
    for (;;)
    {
      localObject = paramHttpMessage.getFirstHeader("Content-Type");
      if (localObject != null) {
        localBasicHttpEntity.setContentType((Header)localObject);
      }
      localObject = paramHttpMessage.getFirstHeader("Content-Encoding");
      if (localObject != null) {
        localBasicHttpEntity.setContentEncoding((Header)localObject);
      }
      return localBasicHttpEntity;
      bool1 = l2 < l1;
      if (!bool1)
      {
        localBasicHttpEntity.setChunked(false);
        localBasicHttpEntity.setContentLength(l1);
        localBasicHttpEntity.setContent((InputStream)localObject);
      }
      else
      {
        localBasicHttpEntity.setChunked(false);
        localBasicHttpEntity.setContentLength(l2);
        localBasicHttpEntity.setContent((InputStream)localObject);
      }
    }
  }
  
  protected OutputStream prepareOutput(HttpMessage paramHttpMessage)
  {
    long l = this.outgoingContentStrategy.determineLength(paramHttpMessage);
    SessionOutputBufferImpl localSessionOutputBufferImpl = this.outbuffer;
    return createOutputStream(l, localSessionOutputBufferImpl);
  }
  
  public void setSocketTimeout(int paramInt)
  {
    Socket localSocket = (Socket)this.socketHolder.get();
    if (localSocket != null) {}
    try
    {
      localSocket.setSoTimeout(paramInt);
      return;
    }
    catch (SocketException localSocketException)
    {
      for (;;) {}
    }
  }
  
  public void shutdown()
  {
    Socket localSocket = (Socket)this.socketHolder.getAndSet(null);
    if (localSocket != null) {
      localSocket.close();
    }
  }
  
  public String toString()
  {
    Object localObject = (Socket)this.socketHolder.get();
    StringBuilder localStringBuilder;
    if (localObject != null)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      SocketAddress localSocketAddress = ((Socket)localObject).getRemoteSocketAddress();
      localObject = ((Socket)localObject).getLocalSocketAddress();
      if ((localSocketAddress != null) && (localObject != null))
      {
        NetUtils.formatAddress(localStringBuilder, (SocketAddress)localObject);
        localObject = "<->";
        localStringBuilder.append((String)localObject);
        NetUtils.formatAddress(localStringBuilder, localSocketAddress);
      }
    }
    for (localObject = localStringBuilder.toString();; localObject = "[Not bound]") {
      return (String)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\BHttpConnectionBase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */