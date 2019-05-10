package org.apache.http.conn.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpHost;
import org.apache.http.conn.HttpInetSocketAddress;
import org.apache.http.conn.scheme.HostNameResolver;
import org.apache.http.conn.scheme.LayeredSchemeSocketFactory;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.SchemeLayeredSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.TextUtils;

public class SSLSocketFactory
  implements LayeredSchemeSocketFactory, LayeredSocketFactory, SchemeLayeredSocketFactory, LayeredConnectionSocketFactory
{
  public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER;
  public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
  public static final String SSL = "SSL";
  public static final String SSLV2 = "SSLv2";
  public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER;
  public static final String TLS = "TLS";
  private volatile X509HostnameVerifier hostnameVerifier;
  private final HostNameResolver nameResolver;
  private final javax.net.ssl.SSLSocketFactory socketfactory;
  private final String[] supportedCipherSuites;
  private final String[] supportedProtocols;
  
  static
  {
    Object localObject = new org/apache/http/conn/ssl/AllowAllHostnameVerifier;
    ((AllowAllHostnameVerifier)localObject).<init>();
    ALLOW_ALL_HOSTNAME_VERIFIER = (X509HostnameVerifier)localObject;
    localObject = new org/apache/http/conn/ssl/BrowserCompatHostnameVerifier;
    ((BrowserCompatHostnameVerifier)localObject).<init>();
    BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = (X509HostnameVerifier)localObject;
    localObject = new org/apache/http/conn/ssl/StrictHostnameVerifier;
    ((StrictHostnameVerifier)localObject).<init>();
    STRICT_HOSTNAME_VERIFIER = (X509HostnameVerifier)localObject;
  }
  
  public SSLSocketFactory(String paramString1, KeyStore paramKeyStore1, String paramString2, KeyStore paramKeyStore2, SecureRandom paramSecureRandom, HostNameResolver paramHostNameResolver) {}
  
  public SSLSocketFactory(String paramString1, KeyStore paramKeyStore1, String paramString2, KeyStore paramKeyStore2, SecureRandom paramSecureRandom, TrustStrategy paramTrustStrategy, X509HostnameVerifier paramX509HostnameVerifier) {}
  
  public SSLSocketFactory(String paramString1, KeyStore paramKeyStore1, String paramString2, KeyStore paramKeyStore2, SecureRandom paramSecureRandom, X509HostnameVerifier paramX509HostnameVerifier) {}
  
  public SSLSocketFactory(KeyStore paramKeyStore)
  {
    this(localSSLContext, localX509HostnameVerifier);
  }
  
  public SSLSocketFactory(KeyStore paramKeyStore, String paramString) {}
  
  public SSLSocketFactory(KeyStore paramKeyStore1, String paramString, KeyStore paramKeyStore2) {}
  
  public SSLSocketFactory(SSLContext paramSSLContext)
  {
    this(paramSSLContext, localX509HostnameVerifier);
  }
  
  public SSLSocketFactory(SSLContext paramSSLContext, HostNameResolver paramHostNameResolver)
  {
    Object localObject = paramSSLContext.getSocketFactory();
    this.socketfactory = ((javax.net.ssl.SSLSocketFactory)localObject);
    localObject = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    this.hostnameVerifier = ((X509HostnameVerifier)localObject);
    this.nameResolver = paramHostNameResolver;
    this.supportedProtocols = null;
    this.supportedCipherSuites = null;
  }
  
  public SSLSocketFactory(SSLContext paramSSLContext, X509HostnameVerifier paramX509HostnameVerifier)
  {
    this(localSSLSocketFactory, null, null, paramX509HostnameVerifier);
  }
  
  public SSLSocketFactory(SSLContext paramSSLContext, String[] paramArrayOfString1, String[] paramArrayOfString2, X509HostnameVerifier paramX509HostnameVerifier)
  {
    this(localSSLSocketFactory, paramArrayOfString1, paramArrayOfString2, paramX509HostnameVerifier);
  }
  
  public SSLSocketFactory(javax.net.ssl.SSLSocketFactory paramSSLSocketFactory, X509HostnameVerifier paramX509HostnameVerifier)
  {
    this(paramSSLSocketFactory, null, null, paramX509HostnameVerifier);
  }
  
  public SSLSocketFactory(javax.net.ssl.SSLSocketFactory paramSSLSocketFactory, String[] paramArrayOfString1, String[] paramArrayOfString2, X509HostnameVerifier paramX509HostnameVerifier)
  {
    javax.net.ssl.SSLSocketFactory localSSLSocketFactory = (javax.net.ssl.SSLSocketFactory)Args.notNull(paramSSLSocketFactory, "SSL socket factory");
    this.socketfactory = localSSLSocketFactory;
    this.supportedProtocols = paramArrayOfString1;
    this.supportedCipherSuites = paramArrayOfString2;
    if (paramX509HostnameVerifier != null) {}
    for (;;)
    {
      this.hostnameVerifier = paramX509HostnameVerifier;
      this.nameResolver = null;
      return;
      paramX509HostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    }
  }
  
  public SSLSocketFactory(TrustStrategy paramTrustStrategy)
  {
    this(localSSLContext, localX509HostnameVerifier);
  }
  
  public SSLSocketFactory(TrustStrategy paramTrustStrategy, X509HostnameVerifier paramX509HostnameVerifier)
  {
    this(localSSLContext, paramX509HostnameVerifier);
  }
  
  public static SSLSocketFactory getSocketFactory()
  {
    SSLSocketFactory localSSLSocketFactory = new org/apache/http/conn/ssl/SSLSocketFactory;
    SSLContext localSSLContext = SSLContexts.createDefault();
    X509HostnameVerifier localX509HostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    localSSLSocketFactory.<init>(localSSLContext, localX509HostnameVerifier);
    return localSSLSocketFactory;
  }
  
  public static SSLSocketFactory getSystemSocketFactory()
  {
    SSLSocketFactory localSSLSocketFactory = new org/apache/http/conn/ssl/SSLSocketFactory;
    javax.net.ssl.SSLSocketFactory localSSLSocketFactory1 = (javax.net.ssl.SSLSocketFactory)javax.net.ssl.SSLSocketFactory.getDefault();
    String[] arrayOfString1 = split(System.getProperty("https.protocols"));
    String[] arrayOfString2 = split(System.getProperty("https.cipherSuites"));
    X509HostnameVerifier localX509HostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    localSSLSocketFactory.<init>(localSSLSocketFactory1, arrayOfString1, arrayOfString2, localX509HostnameVerifier);
    return localSSLSocketFactory;
  }
  
  private void internalPrepareSocket(SSLSocket paramSSLSocket)
  {
    String[] arrayOfString = this.supportedProtocols;
    if (arrayOfString != null)
    {
      arrayOfString = this.supportedProtocols;
      paramSSLSocket.setEnabledProtocols(arrayOfString);
    }
    arrayOfString = this.supportedCipherSuites;
    if (arrayOfString != null)
    {
      arrayOfString = this.supportedCipherSuites;
      paramSSLSocket.setEnabledCipherSuites(arrayOfString);
    }
    prepareSocket(paramSSLSocket);
  }
  
  private static String[] split(String paramString)
  {
    boolean bool = TextUtils.isBlank(paramString);
    if (bool) {
      bool = false;
    }
    for (String[] arrayOfString = null;; arrayOfString = paramString.split(" *, *")) {
      return arrayOfString;
    }
  }
  
  private void verifyHostname(SSLSocket paramSSLSocket, String paramString)
  {
    try
    {
      X509HostnameVerifier localX509HostnameVerifier = this.hostnameVerifier;
      localX509HostnameVerifier.verify(paramString, paramSSLSocket);
      return;
    }
    catch (IOException localIOException) {}
    try
    {
      paramSSLSocket.close();
      throw localIOException;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public Socket connectSocket(int paramInt, Socket paramSocket, HttpHost paramHttpHost, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpHost, "HTTP host");
    Object localObject = "Remote address";
    Args.notNull(paramInetSocketAddress1, (String)localObject);
    Socket localSocket;
    if (paramSocket != null)
    {
      localSocket = paramSocket;
      if (paramInetSocketAddress2 != null) {
        localSocket.bind(paramInetSocketAddress2);
      }
    }
    for (;;)
    {
      try
      {
        localSocket.connect(paramInetSocketAddress1, paramInt);
        boolean bool = localSocket instanceof SSLSocket;
        if (!bool) {
          break label115;
        }
        localObject = localSocket;
        localObject = (SSLSocket)localSocket;
        ((SSLSocket)localObject).startHandshake();
        String str2 = paramHttpHost.getHostName();
        verifyHostname((SSLSocket)localObject, str2);
        return (Socket)localSocket;
      }
      catch (IOException localIOException1) {}
      localSocket = createSocket(paramHttpContext);
      break;
      try
      {
        localSocket.close();
        throw localIOException1;
        label115:
        String str1 = paramHttpHost.getHostName();
        int i = paramInetSocketAddress1.getPort();
        localSocket = createLayeredSocket(localSocket, str1, i, paramHttpContext);
      }
      catch (IOException localIOException2)
      {
        for (;;) {}
      }
    }
  }
  
  public Socket connectSocket(Socket paramSocket, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2, HttpParams paramHttpParams)
  {
    Object localObject1 = this.nameResolver;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.nameResolver.resolve(paramString);
      localObject2 = localObject1;
      localObject1 = null;
      if ((paramInetAddress != null) || (paramInt2 > 0))
      {
        localObject1 = new java/net/InetSocketAddress;
        if (paramInt2 <= 0) {
          break label111;
        }
      }
    }
    for (;;)
    {
      ((InetSocketAddress)localObject1).<init>(paramInetAddress, paramInt2);
      HttpInetSocketAddress localHttpInetSocketAddress = new org/apache/http/conn/HttpInetSocketAddress;
      HttpHost localHttpHost = new org/apache/http/HttpHost;
      localHttpHost.<init>(paramString, paramInt1);
      localHttpInetSocketAddress.<init>(localHttpHost, (InetAddress)localObject2, paramInt1);
      return connectSocket(paramSocket, localHttpInetSocketAddress, (InetSocketAddress)localObject1, paramHttpParams);
      localObject1 = InetAddress.getByName(paramString);
      localObject2 = localObject1;
      break;
      label111:
      paramInt2 = 0;
    }
  }
  
  public Socket connectSocket(Socket paramSocket, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, HttpParams paramHttpParams)
  {
    Args.notNull(paramInetSocketAddress1, "Remote address");
    Object localObject1 = "HTTP parameters";
    Args.notNull(paramHttpParams, (String)localObject1);
    boolean bool = paramInetSocketAddress1 instanceof HttpInetSocketAddress;
    HttpHost localHttpHost;
    if (bool)
    {
      localObject1 = paramInetSocketAddress1;
      localObject1 = (HttpInetSocketAddress)paramInetSocketAddress1;
      localHttpHost = ((HttpInetSocketAddress)localObject1).getHttpHost();
    }
    for (;;)
    {
      int i = HttpConnectionParams.getSoTimeout(paramHttpParams);
      int j = HttpConnectionParams.getConnectionTimeout(paramHttpParams);
      paramSocket.setSoTimeout(i);
      localObject1 = this;
      Object localObject2 = paramSocket;
      return connectSocket(j, paramSocket, localHttpHost, (InetSocketAddress)paramInetSocketAddress1, paramInetSocketAddress2, null);
      localHttpHost = new org/apache/http/HttpHost;
      localObject1 = paramInetSocketAddress1.getHostName();
      j = paramInetSocketAddress1.getPort();
      localObject2 = "https";
      localHttpHost.<init>((String)localObject1, j, (String)localObject2);
    }
  }
  
  public Socket createLayeredSocket(Socket paramSocket, String paramString, int paramInt, HttpParams paramHttpParams)
  {
    ((HttpContext)null);
    return createLayeredSocket(paramSocket, paramString, paramInt, null);
  }
  
  public Socket createLayeredSocket(Socket paramSocket, String paramString, int paramInt, HttpContext paramHttpContext)
  {
    SSLSocket localSSLSocket = (SSLSocket)this.socketfactory.createSocket(paramSocket, paramString, paramInt, true);
    internalPrepareSocket(localSSLSocket);
    localSSLSocket.startHandshake();
    verifyHostname(localSSLSocket, paramString);
    return localSSLSocket;
  }
  
  public Socket createLayeredSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    ((HttpContext)null);
    return createLayeredSocket(paramSocket, paramString, paramInt, null);
  }
  
  public Socket createSocket()
  {
    ((HttpContext)null);
    return createSocket(null);
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return createLayeredSocket(paramSocket, paramString, paramInt, paramBoolean);
  }
  
  public Socket createSocket(HttpParams paramHttpParams)
  {
    ((HttpContext)null);
    return createSocket(null);
  }
  
  public Socket createSocket(HttpContext paramHttpContext)
  {
    SSLSocket localSSLSocket = (SSLSocket)this.socketfactory.createSocket();
    internalPrepareSocket(localSSLSocket);
    return localSSLSocket;
  }
  
  public X509HostnameVerifier getHostnameVerifier()
  {
    return this.hostnameVerifier;
  }
  
  public boolean isSecure(Socket paramSocket)
  {
    boolean bool1 = true;
    String str1 = "Socket";
    Args.notNull(paramSocket, str1);
    boolean bool2 = paramSocket instanceof SSLSocket;
    String str2 = "Socket not created by this factory";
    Asserts.check(bool2, str2);
    bool2 = paramSocket.isClosed();
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      Asserts.check(bool2, "Socket is closed");
      return bool1;
      bool2 = false;
      str1 = null;
    }
  }
  
  protected void prepareSocket(SSLSocket paramSSLSocket) {}
  
  public void setHostnameVerifier(X509HostnameVerifier paramX509HostnameVerifier)
  {
    Args.notNull(paramX509HostnameVerifier, "Hostname verifier");
    this.hostnameVerifier = paramX509HostnameVerifier;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\ssl\SSLSocketFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */