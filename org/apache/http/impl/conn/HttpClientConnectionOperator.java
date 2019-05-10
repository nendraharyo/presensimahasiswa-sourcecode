package org.apache.http.impl.conn;

import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Lookup;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

class HttpClientConnectionOperator
{
  static final String SOCKET_FACTORY_REGISTRY = "http.socket-factory-registry";
  private final DnsResolver dnsResolver;
  private final Log log;
  private final SchemePortResolver schemePortResolver;
  private final Lookup socketFactoryRegistry;
  
  HttpClientConnectionOperator(Lookup paramLookup, SchemePortResolver paramSchemePortResolver, DnsResolver paramDnsResolver)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    localObject = "Socket factory registry";
    Args.notNull(paramLookup, (String)localObject);
    this.socketFactoryRegistry = paramLookup;
    if (paramSchemePortResolver != null)
    {
      this.schemePortResolver = paramSchemePortResolver;
      if (paramDnsResolver == null) {
        break label61;
      }
    }
    for (;;)
    {
      this.dnsResolver = paramDnsResolver;
      return;
      paramSchemePortResolver = DefaultSchemePortResolver.INSTANCE;
      break;
      label61:
      paramDnsResolver = SystemDefaultDnsResolver.INSTANCE;
    }
  }
  
  private Lookup getSocketFactoryRegistry(HttpContext paramHttpContext)
  {
    Lookup localLookup = (Lookup)paramHttpContext.getAttribute("http.socket-factory-registry");
    if (localLookup == null) {
      localLookup = this.socketFactoryRegistry;
    }
    return localLookup;
  }
  
  public void connect(ManagedHttpClientConnection paramManagedHttpClientConnection, HttpHost paramHttpHost, InetSocketAddress paramInetSocketAddress, int paramInt, SocketConfig paramSocketConfig, HttpContext paramHttpContext)
  {
    Object localObject1 = getSocketFactoryRegistry(paramHttpContext);
    Object localObject2 = paramHttpHost.getSchemeName();
    localObject1 = (ConnectionSocketFactory)((Lookup)localObject1).lookup((String)localObject2);
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = new org/apache/http/conn/UnsupportedSchemeException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = paramHttpHost.getSchemeName();
      localObject2 = (String)localObject3 + " protocol is not supported";
      ((UnsupportedSchemeException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject2 = paramHttpHost.getAddress();
    int i;
    Object localObject4;
    Object localObject5;
    int m;
    int n;
    if (localObject2 != null)
    {
      i = 1;
      localObject2 = new InetAddress[i];
      localObject3 = null;
      localObject4 = paramHttpHost.getAddress();
      localObject2[0] = localObject4;
      localObject5 = localObject2;
      m = this.schemePortResolver.resolve(paramHttpHost);
      i = 0;
      localObject2 = null;
      n = 0;
    }
    int i1;
    label182:
    InetSocketAddress localInetSocketAddress;
    label507:
    label519:
    label603:
    label631:
    label711:
    for (;;)
    {
      i = localObject5.length;
      boolean bool1;
      int i2;
      if (n < i)
      {
        localObject4 = localObject5[n];
        i = localObject5.length + -1;
        if (n != i) {
          break label507;
        }
        i = 1;
        i1 = i;
        localObject3 = ((ConnectionSocketFactory)localObject1).createSocket(paramHttpContext);
        i = paramSocketConfig.getSoTimeout();
        ((Socket)localObject3).setSoTimeout(i);
        bool1 = paramSocketConfig.isSoReuseAddress();
        ((Socket)localObject3).setReuseAddress(bool1);
        bool1 = paramSocketConfig.isTcpNoDelay();
        ((Socket)localObject3).setTcpNoDelay(bool1);
        bool1 = paramSocketConfig.isSoKeepAlive();
        ((Socket)localObject3).setKeepAlive(bool1);
        i2 = paramSocketConfig.getSoLinger();
        if (i2 >= 0)
        {
          if (i2 <= 0) {
            break label519;
          }
          bool1 = true;
        }
      }
      for (;;)
      {
        ((Socket)localObject3).setSoLinger(bool1, i2);
        paramManagedHttpClientConnection.bind((Socket)localObject3);
        localInetSocketAddress = new java/net/InetSocketAddress;
        localInetSocketAddress.<init>((InetAddress)localObject4, m);
        localObject2 = this.log;
        bool1 = ((Log)localObject2).isDebugEnabled();
        if (bool1)
        {
          localObject2 = this.log;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject6 = "Connecting to ";
          localObject4 = (String)localObject6 + localInetSocketAddress;
          ((Log)localObject2).debug(localObject4);
        }
        int j = paramInt;
        localObject4 = paramHttpHost;
        Object localObject6 = paramInetSocketAddress;
        try
        {
          localObject2 = ((ConnectionSocketFactory)localObject1).connectSocket(paramInt, (Socket)localObject3, paramHttpHost, localInetSocketAddress, paramInetSocketAddress, paramHttpContext);
          paramManagedHttpClientConnection.bind((Socket)localObject2);
          localObject2 = this.log;
          bool2 = ((Log)localObject2).isDebugEnabled();
          if (bool2)
          {
            localObject2 = this.log;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject4 = "Connection established ";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
            localObject3 = ((StringBuilder)localObject3).append(paramManagedHttpClientConnection);
            localObject3 = ((StringBuilder)localObject3).toString();
            ((Log)localObject2).debug(localObject3);
          }
          return;
        }
        catch (SocketTimeoutException localSocketTimeoutException)
        {
          if (i1 == 0) {
            break label631;
          }
          localObject1 = new org/apache/http/conn/ConnectTimeoutException;
          ((ConnectTimeoutException)localObject1).<init>(localSocketTimeoutException, paramHttpHost, (InetAddress[])localObject5);
          throw ((Throwable)localObject1);
        }
        catch (ConnectException localConnectException)
        {
          if (i1 == 0) {
            break label631;
          }
          localObject1 = localConnectException.getMessage();
          localObject3 = "Connection timed out";
          boolean bool3 = ((String)localObject3).equals(localObject1);
          if (!bool3) {
            break label603;
          }
          localObject1 = new org/apache/http/conn/ConnectTimeoutException;
          ((ConnectTimeoutException)localObject1).<init>(localConnectException, paramHttpHost, (InetAddress[])localObject5);
          throw ((Throwable)localObject1);
          localObject1 = new org/apache/http/conn/HttpHostConnectException;
          ((HttpHostConnectException)localObject1).<init>(localConnectException, paramHttpHost, (InetAddress[])localObject5);
          throw ((Throwable)localObject1);
        }
        catch (NoRouteToHostException localNoRouteToHostException)
        {
          if (i1 == 0) {
            break label631;
          }
          throw localNoRouteToHostException;
          Log localLog = this.log;
          boolean bool2 = localLog.isDebugEnabled();
          if (!bool2) {
            break label711;
          }
          localLog = this.log;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append("Connect to ").append(localInetSocketAddress).append(" timed out. ");
          localObject4 = "Connection will be retried using another IP address";
          localObject3 = (String)localObject4;
          localLog.debug(localObject3);
          int k = n + 1;
          n = k;
        }
        localObject2 = this.dnsResolver;
        localObject3 = paramHttpHost.getHostName();
        localObject2 = ((DnsResolver)localObject2).resolve((String)localObject3);
        localObject5 = localObject2;
        break;
        bool2 = false;
        localObject2 = null;
        i1 = 0;
        break label182;
        bool2 = false;
        localObject2 = null;
      }
    }
  }
  
  public void upgrade(ManagedHttpClientConnection paramManagedHttpClientConnection, HttpHost paramHttpHost, HttpContext paramHttpContext)
  {
    Object localObject1 = HttpClientContext.adapt(paramHttpContext);
    localObject1 = getSocketFactoryRegistry((HttpContext)localObject1);
    Object localObject2 = paramHttpHost.getSchemeName();
    localObject1 = (ConnectionSocketFactory)((Lookup)localObject1).lookup((String)localObject2);
    String str1;
    if (localObject1 == null)
    {
      localObject1 = new org/apache/http/conn/UnsupportedSchemeException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str1 = paramHttpHost.getSchemeName();
      localObject2 = str1 + " protocol is not supported";
      ((UnsupportedSchemeException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    boolean bool = localObject1 instanceof LayeredConnectionSocketFactory;
    if (!bool)
    {
      localObject1 = new org/apache/http/conn/UnsupportedSchemeException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str1 = paramHttpHost.getSchemeName();
      localObject2 = str1 + " protocol does not support connection upgrade";
      ((UnsupportedSchemeException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = (LayeredConnectionSocketFactory)localObject1;
    localObject2 = paramManagedHttpClientConnection.getSocket();
    int i = this.schemePortResolver.resolve(paramHttpHost);
    String str2 = paramHttpHost.getHostName();
    localObject1 = ((LayeredConnectionSocketFactory)localObject1).createLayeredSocket((Socket)localObject2, str2, i, paramHttpContext);
    paramManagedHttpClientConnection.bind((Socket)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\HttpClientConnectionOperator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */