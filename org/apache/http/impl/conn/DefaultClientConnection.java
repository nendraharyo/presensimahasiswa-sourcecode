package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.impl.SocketHttpClientConnection;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class DefaultClientConnection
  extends SocketHttpClientConnection
  implements ManagedHttpClientConnection, OperatedClientConnection, HttpContext
{
  private final Map attributes;
  private boolean connSecure;
  private final Log headerLog;
  private final Log log;
  private volatile boolean shutdown;
  private volatile Socket socket;
  private HttpHost targetHost;
  private final Log wireLog;
  
  public DefaultClientConnection()
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    localObject = LogFactory.getLog("org.apache.http.headers");
    this.headerLog = ((Log)localObject);
    localObject = LogFactory.getLog("org.apache.http.wire");
    this.wireLog = ((Log)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.attributes = ((Map)localObject);
  }
  
  public void bind(Socket paramSocket)
  {
    BasicHttpParams localBasicHttpParams = new org/apache/http/params/BasicHttpParams;
    localBasicHttpParams.<init>();
    bind(paramSocket, localBasicHttpParams);
  }
  
  public void close()
  {
    try
    {
      super.close();
      Log localLog = this.log;
      boolean bool = localLog.isDebugEnabled();
      if (bool)
      {
        localLog = this.log;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = "Connection ";
        localObject = ((StringBuilder)localObject).append(str);
        localObject = ((StringBuilder)localObject).append(this);
        str = " closed";
        localObject = ((StringBuilder)localObject).append(str);
        localObject = ((StringBuilder)localObject).toString();
        localLog.debug(localObject);
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject = this.log;
        String str = "I/O error closing connection";
        ((Log)localObject).debug(str, localIOException);
      }
    }
  }
  
  protected HttpMessageParser createResponseParser(SessionInputBuffer paramSessionInputBuffer, HttpResponseFactory paramHttpResponseFactory, HttpParams paramHttpParams)
  {
    DefaultHttpResponseParser localDefaultHttpResponseParser = new org/apache/http/impl/conn/DefaultHttpResponseParser;
    localDefaultHttpResponseParser.<init>(paramSessionInputBuffer, null, paramHttpResponseFactory, paramHttpParams);
    return localDefaultHttpResponseParser;
  }
  
  protected SessionInputBuffer createSessionInputBuffer(Socket paramSocket, int paramInt, HttpParams paramHttpParams)
  {
    SessionInputBuffer localSessionInputBuffer;
    Object localObject1;
    if (paramInt > 0)
    {
      localSessionInputBuffer = super.createSessionInputBuffer(paramSocket, paramInt, paramHttpParams);
      localObject1 = this.wireLog;
      boolean bool = ((Log)localObject1).isDebugEnabled();
      if (!bool) {
        break label83;
      }
      localObject1 = new org/apache/http/impl/conn/LoggingSessionInputBuffer;
      Wire localWire = new org/apache/http/impl/conn/Wire;
      Object localObject2 = this.wireLog;
      localWire.<init>((Log)localObject2);
      localObject2 = HttpProtocolParams.getHttpElementCharset(paramHttpParams);
      ((LoggingSessionInputBuffer)localObject1).<init>(localSessionInputBuffer, localWire, (String)localObject2);
    }
    for (;;)
    {
      return (SessionInputBuffer)localObject1;
      paramInt = 8192;
      break;
      label83:
      localObject1 = localSessionInputBuffer;
    }
  }
  
  protected SessionOutputBuffer createSessionOutputBuffer(Socket paramSocket, int paramInt, HttpParams paramHttpParams)
  {
    SessionOutputBuffer localSessionOutputBuffer;
    Object localObject1;
    if (paramInt > 0)
    {
      localSessionOutputBuffer = super.createSessionOutputBuffer(paramSocket, paramInt, paramHttpParams);
      localObject1 = this.wireLog;
      boolean bool = ((Log)localObject1).isDebugEnabled();
      if (!bool) {
        break label83;
      }
      localObject1 = new org/apache/http/impl/conn/LoggingSessionOutputBuffer;
      Wire localWire = new org/apache/http/impl/conn/Wire;
      Object localObject2 = this.wireLog;
      localWire.<init>((Log)localObject2);
      localObject2 = HttpProtocolParams.getHttpElementCharset(paramHttpParams);
      ((LoggingSessionOutputBuffer)localObject1).<init>(localSessionOutputBuffer, localWire, (String)localObject2);
    }
    for (;;)
    {
      return (SessionOutputBuffer)localObject1;
      paramInt = 8192;
      break;
      label83:
      localObject1 = localSessionOutputBuffer;
    }
  }
  
  public Object getAttribute(String paramString)
  {
    return this.attributes.get(paramString);
  }
  
  public String getId()
  {
    return null;
  }
  
  public SSLSession getSSLSession()
  {
    Object localObject = this.socket;
    boolean bool = localObject instanceof SSLSocket;
    if (bool) {}
    for (localObject = ((SSLSocket)this.socket).getSession();; localObject = null)
    {
      return (SSLSession)localObject;
      bool = false;
    }
  }
  
  public final Socket getSocket()
  {
    return this.socket;
  }
  
  public final HttpHost getTargetHost()
  {
    return this.targetHost;
  }
  
  public final boolean isSecure()
  {
    return this.connSecure;
  }
  
  public void openCompleted(boolean paramBoolean, HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "Parameters");
    assertNotOpen();
    this.connSecure = paramBoolean;
    Socket localSocket = this.socket;
    bind(localSocket, paramHttpParams);
  }
  
  public void opening(Socket paramSocket, HttpHost paramHttpHost)
  {
    assertNotOpen();
    this.socket = paramSocket;
    this.targetHost = paramHttpHost;
    boolean bool = this.shutdown;
    if (bool)
    {
      paramSocket.close();
      InterruptedIOException localInterruptedIOException = new java/io/InterruptedIOException;
      localInterruptedIOException.<init>("Connection already shutdown");
      throw localInterruptedIOException;
    }
  }
  
  public HttpResponse receiveResponseHeader()
  {
    HttpResponse localHttpResponse = super.receiveResponseHeader();
    Log localLog1 = this.log;
    int i = localLog1.isDebugEnabled();
    Object localObject1;
    Object localObject2;
    if (i != 0)
    {
      localLog1 = this.log;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Receiving response: ");
      localObject2 = localHttpResponse.getStatusLine();
      localObject1 = localObject2;
      localLog1.debug(localObject1);
    }
    localLog1 = this.headerLog;
    i = localLog1.isDebugEnabled();
    if (i != 0)
    {
      localLog1 = this.headerLog;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("<< ");
      localObject2 = localHttpResponse.getStatusLine().toString();
      localObject1 = (String)localObject2;
      localLog1.debug(localObject1);
      localObject1 = localHttpResponse.getAllHeaders();
      int k = localObject1.length;
      i = 0;
      localLog1 = null;
      while (i < k)
      {
        String str1 = localObject1[i];
        Log localLog2 = this.headerLog;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str2 = "<< ";
        localStringBuilder = localStringBuilder.append(str2);
        str1 = str1.toString();
        str1 = str1;
        localLog2.debug(str1);
        int j;
        i += 1;
      }
    }
    return localHttpResponse;
  }
  
  public Object removeAttribute(String paramString)
  {
    return this.attributes.remove(paramString);
  }
  
  public void sendRequestHeader(HttpRequest paramHttpRequest)
  {
    Log localLog1 = this.log;
    int i = localLog1.isDebugEnabled();
    Object localObject1;
    Object localObject2;
    if (i != 0)
    {
      localLog1 = this.log;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Sending request: ");
      localObject2 = paramHttpRequest.getRequestLine();
      localObject1 = localObject2;
      localLog1.debug(localObject1);
    }
    super.sendRequestHeader(paramHttpRequest);
    localLog1 = this.headerLog;
    i = localLog1.isDebugEnabled();
    if (i != 0)
    {
      localLog1 = this.headerLog;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(">> ");
      localObject2 = paramHttpRequest.getRequestLine().toString();
      localObject1 = (String)localObject2;
      localLog1.debug(localObject1);
      localObject1 = paramHttpRequest.getAllHeaders();
      int k = localObject1.length;
      i = 0;
      localLog1 = null;
      while (i < k)
      {
        String str1 = localObject1[i];
        Log localLog2 = this.headerLog;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str2 = ">> ";
        localStringBuilder = localStringBuilder.append(str2);
        str1 = str1.toString();
        str1 = str1;
        localLog2.debug(str1);
        int j;
        i += 1;
      }
    }
  }
  
  public void setAttribute(String paramString, Object paramObject)
  {
    this.attributes.put(paramString, paramObject);
  }
  
  public void shutdown()
  {
    boolean bool = true;
    this.shutdown = bool;
    try
    {
      super.shutdown();
      Object localObject1 = this.log;
      bool = ((Log)localObject1).isDebugEnabled();
      if (bool)
      {
        localObject1 = this.log;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Connection ";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject2 = ((StringBuilder)localObject2).append(this);
        str = " shut down";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((Log)localObject1).debug(localObject2);
      }
      localObject1 = this.socket;
      if (localObject1 != null) {
        ((Socket)localObject1).close();
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject2 = this.log;
        String str = "I/O error shutting down connection";
        ((Log)localObject2).debug(str, localIOException);
      }
    }
  }
  
  public void update(Socket paramSocket, HttpHost paramHttpHost, boolean paramBoolean, HttpParams paramHttpParams)
  {
    assertOpen();
    Args.notNull(paramHttpHost, "Target host");
    String str = "Parameters";
    Args.notNull(paramHttpParams, str);
    if (paramSocket != null)
    {
      this.socket = paramSocket;
      bind(paramSocket, paramHttpParams);
    }
    this.targetHost = paramHttpHost;
    this.connSecure = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\DefaultClientConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */