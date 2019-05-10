package org.apache.http.impl.conn;

import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpInetSocketAddress;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeLayeredSocketFactory;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SchemeSocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

public class DefaultClientConnectionOperator
  implements ClientConnectionOperator
{
  protected final DnsResolver dnsResolver;
  private final Log log;
  protected final SchemeRegistry schemeRegistry;
  
  public DefaultClientConnectionOperator(SchemeRegistry paramSchemeRegistry)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    Args.notNull(paramSchemeRegistry, "Scheme registry");
    this.schemeRegistry = paramSchemeRegistry;
    localObject = new org/apache/http/impl/conn/SystemDefaultDnsResolver;
    ((SystemDefaultDnsResolver)localObject).<init>();
    this.dnsResolver = ((DnsResolver)localObject);
  }
  
  public DefaultClientConnectionOperator(SchemeRegistry paramSchemeRegistry, DnsResolver paramDnsResolver)
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
    Args.notNull(paramSchemeRegistry, "Scheme registry");
    Args.notNull(paramDnsResolver, "DNS resolver");
    this.schemeRegistry = paramSchemeRegistry;
    this.dnsResolver = paramDnsResolver;
  }
  
  private SchemeRegistry getSchemeRegistry(HttpContext paramHttpContext)
  {
    SchemeRegistry localSchemeRegistry = (SchemeRegistry)paramHttpContext.getAttribute("http.scheme-registry");
    if (localSchemeRegistry == null) {
      localSchemeRegistry = this.schemeRegistry;
    }
    return localSchemeRegistry;
  }
  
  public OperatedClientConnection createConnection()
  {
    DefaultClientConnection localDefaultClientConnection = new org/apache/http/impl/conn/DefaultClientConnection;
    localDefaultClientConnection.<init>();
    return localDefaultClientConnection;
  }
  
  public void openConnection(OperatedClientConnection paramOperatedClientConnection, HttpHost paramHttpHost, InetAddress paramInetAddress, HttpContext paramHttpContext, HttpParams paramHttpParams)
  {
    Args.notNull(paramOperatedClientConnection, "Connection");
    Args.notNull(paramHttpHost, "Target host");
    Object localObject1 = "HTTP parameters";
    Args.notNull(paramHttpParams, (String)localObject1);
    int i = paramOperatedClientConnection.isOpen();
    Object localObject2;
    SchemeSocketFactory localSchemeSocketFactory;
    label114:
    Object localObject3;
    boolean bool1;
    label150:
    Object localObject5;
    HttpInetSocketAddress localHttpInetSocketAddress;
    boolean bool2;
    if (i == 0)
    {
      i = 1;
      Asserts.check(i, "Connection must not be open");
      localObject1 = getSchemeRegistry(paramHttpContext);
      localObject2 = paramHttpHost.getSchemeName();
      localObject1 = ((SchemeRegistry)localObject1).getScheme((String)localObject2);
      localSchemeSocketFactory = ((Scheme)localObject1).getSchemeSocketFactory();
      localObject2 = paramHttpHost.getHostName();
      InetAddress[] arrayOfInetAddress = resolveHostname((String)localObject2);
      int k = paramHttpHost.getPort();
      int n = ((Scheme)localObject1).resolvePort(k);
      i = 0;
      localObject1 = null;
      k = arrayOfInetAddress.length;
      if (i < k)
      {
        localObject3 = arrayOfInetAddress[i];
        int m = arrayOfInetAddress.length + -1;
        if (i != m) {
          break label353;
        }
        bool1 = true;
        localObject5 = localSchemeSocketFactory.createSocket(paramHttpParams);
        paramOperatedClientConnection.opening((Socket)localObject5, paramHttpHost);
        localHttpInetSocketAddress = new org/apache/http/conn/HttpInetSocketAddress;
        localHttpInetSocketAddress.<init>(paramHttpHost, (InetAddress)localObject3, n);
        bool2 = false;
        localObject3 = null;
        if (paramInetAddress != null)
        {
          localObject3 = new java/net/InetSocketAddress;
          bool3 = false;
          localLog = null;
          ((InetSocketAddress)localObject3).<init>(paramInetAddress, 0);
        }
        Log localLog = this.log;
        boolean bool3 = localLog.isDebugEnabled();
        if (bool3)
        {
          localLog = this.log;
          Object localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          String str = "Connecting to ";
          localObject6 = str + localHttpInetSocketAddress;
          localLog.debug(localObject6);
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject3 = localSchemeSocketFactory.connectSocket((Socket)localObject5, localHttpInetSocketAddress, (InetSocketAddress)localObject3, paramHttpParams);
        if (localObject5 == localObject3) {
          break label471;
        }
        paramOperatedClientConnection.opening((Socket)localObject3, paramHttpHost);
        prepareSocket((Socket)localObject3, paramHttpContext, paramHttpParams);
        bool2 = localSchemeSocketFactory.isSecure((Socket)localObject3);
        paramOperatedClientConnection.openCompleted(bool2, paramHttpParams);
        return;
      }
      catch (ConnectException localConnectException)
      {
        if (!bool1) {
          continue;
        }
        throw localConnectException;
      }
      catch (ConnectTimeoutException localConnectTimeoutException)
      {
        label353:
        if (!bool1) {
          continue;
        }
        throw localConnectTimeoutException;
        localObject2 = this.log;
        bool1 = ((Log)localObject2).isDebugEnabled();
        if (!bool1) {
          continue;
        }
        localObject2 = this.log;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("Connect to ").append(localHttpInetSocketAddress).append(" timed out. ");
        localObject5 = "Connection will be retried using another IP address";
        localObject4 = (String)localObject5;
        ((Log)localObject2).debug(localObject4);
        int j;
        i += 1;
      }
      i = 0;
      localObject1 = null;
      break;
      bool1 = false;
      localObject2 = null;
      break label150;
      break label114;
      label471:
      Object localObject4 = localObject5;
    }
  }
  
  protected void prepareSocket(Socket paramSocket, HttpContext paramHttpContext, HttpParams paramHttpParams)
  {
    boolean bool = HttpConnectionParams.getTcpNoDelay(paramHttpParams);
    paramSocket.setTcpNoDelay(bool);
    int i = HttpConnectionParams.getSoTimeout(paramHttpParams);
    paramSocket.setSoTimeout(i);
    int k = HttpConnectionParams.getLinger(paramHttpParams);
    if (k >= 0) {
      if (k <= 0) {
        break label52;
      }
    }
    label52:
    int j;
    for (i = 1;; j = 0)
    {
      paramSocket.setSoLinger(i, k);
      return;
    }
  }
  
  protected InetAddress[] resolveHostname(String paramString)
  {
    return this.dnsResolver.resolve(paramString);
  }
  
  public void updateSecureConnection(OperatedClientConnection paramOperatedClientConnection, HttpHost paramHttpHost, HttpContext paramHttpContext, HttpParams paramHttpParams)
  {
    Args.notNull(paramOperatedClientConnection, "Connection");
    Args.notNull(paramHttpHost, "Target host");
    Args.notNull(paramHttpParams, "Parameters");
    Asserts.check(paramOperatedClientConnection.isOpen(), "Connection must be open");
    Object localObject1 = getSchemeRegistry(paramHttpContext);
    Object localObject2 = paramHttpHost.getSchemeName();
    localObject2 = ((SchemeRegistry)localObject1).getScheme((String)localObject2);
    Asserts.check(((Scheme)localObject2).getSchemeSocketFactory() instanceof SchemeLayeredSocketFactory, "Socket factory must implement SchemeLayeredSocketFactory");
    localObject1 = (SchemeLayeredSocketFactory)((Scheme)localObject2).getSchemeSocketFactory();
    Socket localSocket = paramOperatedClientConnection.getSocket();
    String str = paramHttpHost.getHostName();
    int i = paramHttpHost.getPort();
    int j = ((Scheme)localObject2).resolvePort(i);
    localObject2 = ((SchemeLayeredSocketFactory)localObject1).createLayeredSocket(localSocket, str, j, paramHttpParams);
    prepareSocket((Socket)localObject2, paramHttpContext, paramHttpParams);
    boolean bool = ((SchemeLayeredSocketFactory)localObject1).isSecure((Socket)localObject2);
    paramOperatedClientConnection.update((Socket)localObject2, paramHttpHost, bool, paramHttpParams);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\DefaultClientConnectionOperator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */