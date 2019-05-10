package org.apache.http.impl.pool;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.HttpHost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.DefaultBHttpClientConnection;
import org.apache.http.impl.DefaultBHttpClientConnectionFactory;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.pool.ConnFactory;
import org.apache.http.util.Args;

public class BasicConnFactory
  implements ConnFactory
{
  private final HttpConnectionFactory connFactory;
  private final int connectTimeout;
  private final SocketFactory plainfactory;
  private final SocketConfig sconfig;
  private final SSLSocketFactory sslfactory;
  
  public BasicConnFactory()
  {
    this(null, null, 0, localSocketConfig, localConnectionConfig);
  }
  
  public BasicConnFactory(int paramInt, SocketConfig paramSocketConfig, ConnectionConfig paramConnectionConfig)
  {
    this(null, null, paramInt, paramSocketConfig, paramConnectionConfig);
  }
  
  public BasicConnFactory(SocketFactory paramSocketFactory, SSLSocketFactory paramSSLSocketFactory, int paramInt, SocketConfig paramSocketConfig, ConnectionConfig paramConnectionConfig)
  {
    this.plainfactory = paramSocketFactory;
    this.sslfactory = paramSSLSocketFactory;
    this.connectTimeout = paramInt;
    DefaultBHttpClientConnectionFactory localDefaultBHttpClientConnectionFactory;
    if (paramSocketConfig != null)
    {
      this.sconfig = paramSocketConfig;
      localDefaultBHttpClientConnectionFactory = new org/apache/http/impl/DefaultBHttpClientConnectionFactory;
      if (paramConnectionConfig == null) {
        break label62;
      }
    }
    for (;;)
    {
      localDefaultBHttpClientConnectionFactory.<init>(paramConnectionConfig);
      this.connFactory = localDefaultBHttpClientConnectionFactory;
      return;
      paramSocketConfig = SocketConfig.DEFAULT;
      break;
      label62:
      paramConnectionConfig = ConnectionConfig.DEFAULT;
    }
  }
  
  public BasicConnFactory(SSLSocketFactory paramSSLSocketFactory, HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP params");
    this.plainfactory = null;
    this.sslfactory = paramSSLSocketFactory;
    int i = paramHttpParams.getIntParameter("http.connection.timeout", 0);
    this.connectTimeout = i;
    Object localObject = HttpParamConfig.getSocketConfig(paramHttpParams);
    this.sconfig = ((SocketConfig)localObject);
    localObject = new org/apache/http/impl/DefaultBHttpClientConnectionFactory;
    ConnectionConfig localConnectionConfig = HttpParamConfig.getConnectionConfig(paramHttpParams);
    ((DefaultBHttpClientConnectionFactory)localObject).<init>(localConnectionConfig);
    this.connFactory = ((HttpConnectionFactory)localObject);
  }
  
  public BasicConnFactory(SocketConfig paramSocketConfig, ConnectionConfig paramConnectionConfig)
  {
    this(null, null, 0, paramSocketConfig, paramConnectionConfig);
  }
  
  public BasicConnFactory(HttpParams paramHttpParams)
  {
    this(null, paramHttpParams);
  }
  
  protected HttpClientConnection create(Socket paramSocket, HttpParams paramHttpParams)
  {
    int i = paramHttpParams.getIntParameter("http.socket.buffer-size", 8192);
    DefaultBHttpClientConnection localDefaultBHttpClientConnection = new org/apache/http/impl/DefaultBHttpClientConnection;
    localDefaultBHttpClientConnection.<init>(i);
    localDefaultBHttpClientConnection.bind(paramSocket);
    return localDefaultBHttpClientConnection;
  }
  
  public HttpClientConnection create(HttpHost paramHttpHost)
  {
    Object localObject1 = paramHttpHost.getSchemeName();
    int i = 0;
    Object localObject2 = null;
    Object localObject3 = "http";
    boolean bool1 = ((String)localObject3).equalsIgnoreCase((String)localObject1);
    if (bool1)
    {
      localObject2 = this.plainfactory;
      if (localObject2 != null) {
        localObject2 = this.plainfactory.createSocket();
      }
    }
    else
    {
      localObject3 = "https";
      bool1 = ((String)localObject3).equalsIgnoreCase((String)localObject1);
      if (!bool1) {
        break label358;
      }
      localObject2 = this.sslfactory;
      if (localObject2 == null) {
        break label149;
      }
      localObject2 = this.sslfactory;
      label81:
      localObject2 = ((SocketFactory)localObject2).createSocket();
    }
    label149:
    label350:
    label358:
    for (localObject3 = localObject2;; localObject3 = localObject2)
    {
      if (localObject3 == null)
      {
        localObject2 = new java/io/IOException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = (String)localObject1 + " scheme is not supported";
        ((IOException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
        localObject2 = new java/net/Socket;
        ((Socket)localObject2).<init>();
        break;
        localObject2 = SSLSocketFactory.getDefault();
        break label81;
      }
      String str1 = paramHttpHost.getHostName();
      i = paramHttpHost.getPort();
      int j = -1;
      String str2;
      boolean bool3;
      int m;
      if (i == j)
      {
        localObject1 = paramHttpHost.getSchemeName();
        str2 = "http";
        boolean bool2 = ((String)localObject1).equalsIgnoreCase(str2);
        if (bool2) {
          i = 80;
        }
      }
      else
      {
        int k = this.sconfig.getSoTimeout();
        ((Socket)localObject3).setSoTimeout(k);
        bool3 = this.sconfig.isTcpNoDelay();
        ((Socket)localObject3).setTcpNoDelay(bool3);
        localObject1 = this.sconfig;
        m = ((SocketConfig)localObject1).getSoLinger();
        if (m >= 0)
        {
          if (m <= 0) {
            break label350;
          }
          bool3 = true;
        }
      }
      for (;;)
      {
        ((Socket)localObject3).setSoLinger(bool3, m);
        bool3 = this.sconfig.isSoKeepAlive();
        ((Socket)localObject3).setKeepAlive(bool3);
        localObject1 = new java/net/InetSocketAddress;
        ((InetSocketAddress)localObject1).<init>(str1, i);
        i = this.connectTimeout;
        ((Socket)localObject3).connect((SocketAddress)localObject1, i);
        return (HttpClientConnection)this.connFactory.createConnection((Socket)localObject3);
        localObject1 = paramHttpHost.getSchemeName();
        str2 = "https";
        bool3 = ((String)localObject1).equalsIgnoreCase(str2);
        if (!bool3) {
          break;
        }
        i = 443;
        break;
        bool3 = false;
        localObject1 = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\pool\BasicConnFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */