package org.apache.http.conn.ssl;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

public class SSLConnectionSocketFactory
  implements LayeredConnectionSocketFactory
{
  public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER;
  public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
  public static final String SSL = "SSL";
  public static final String SSLV2 = "SSLv2";
  public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER;
  public static final String TLS = "TLS";
  private final X509HostnameVerifier hostnameVerifier;
  private final SSLSocketFactory socketfactory;
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
  
  public SSLConnectionSocketFactory(SSLContext paramSSLContext)
  {
    this(paramSSLContext, localX509HostnameVerifier);
  }
  
  public SSLConnectionSocketFactory(SSLContext paramSSLContext, X509HostnameVerifier paramX509HostnameVerifier)
  {
    this(localSSLSocketFactory, null, null, paramX509HostnameVerifier);
  }
  
  public SSLConnectionSocketFactory(SSLContext paramSSLContext, String[] paramArrayOfString1, String[] paramArrayOfString2, X509HostnameVerifier paramX509HostnameVerifier)
  {
    this(localSSLSocketFactory, paramArrayOfString1, paramArrayOfString2, paramX509HostnameVerifier);
  }
  
  public SSLConnectionSocketFactory(SSLSocketFactory paramSSLSocketFactory, X509HostnameVerifier paramX509HostnameVerifier)
  {
    this(paramSSLSocketFactory, null, null, paramX509HostnameVerifier);
  }
  
  public SSLConnectionSocketFactory(SSLSocketFactory paramSSLSocketFactory, String[] paramArrayOfString1, String[] paramArrayOfString2, X509HostnameVerifier paramX509HostnameVerifier)
  {
    SSLSocketFactory localSSLSocketFactory = (SSLSocketFactory)Args.notNull(paramSSLSocketFactory, "SSL socket factory");
    this.socketfactory = localSSLSocketFactory;
    this.supportedProtocols = paramArrayOfString1;
    this.supportedCipherSuites = paramArrayOfString2;
    if (paramX509HostnameVerifier != null) {}
    for (;;)
    {
      this.hostnameVerifier = paramX509HostnameVerifier;
      return;
      paramX509HostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    }
  }
  
  public static SSLConnectionSocketFactory getSocketFactory()
  {
    SSLConnectionSocketFactory localSSLConnectionSocketFactory = new org/apache/http/conn/ssl/SSLConnectionSocketFactory;
    SSLContext localSSLContext = SSLContexts.createDefault();
    X509HostnameVerifier localX509HostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    localSSLConnectionSocketFactory.<init>(localSSLContext, localX509HostnameVerifier);
    return localSSLConnectionSocketFactory;
  }
  
  public static SSLConnectionSocketFactory getSystemSocketFactory()
  {
    SSLConnectionSocketFactory localSSLConnectionSocketFactory = new org/apache/http/conn/ssl/SSLConnectionSocketFactory;
    SSLSocketFactory localSSLSocketFactory = (SSLSocketFactory)SSLSocketFactory.getDefault();
    String[] arrayOfString1 = split(System.getProperty("https.protocols"));
    String[] arrayOfString2 = split(System.getProperty("https.cipherSuites"));
    X509HostnameVerifier localX509HostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    localSSLConnectionSocketFactory.<init>(localSSLSocketFactory, arrayOfString1, arrayOfString2, localX509HostnameVerifier);
    return localSSLConnectionSocketFactory;
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
      if (paramInt <= 0) {}
    }
    for (;;)
    {
      try
      {
        int i = localSocket.getSoTimeout();
        if (i == 0) {
          localSocket.setSoTimeout(paramInt);
        }
        localSocket.connect(paramInetSocketAddress1, paramInt);
        boolean bool = localSocket instanceof SSLSocket;
        if (!bool) {
          break label137;
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
        label137:
        String str1 = paramHttpHost.getHostName();
        int j = paramInetSocketAddress1.getPort();
        localSocket = createLayeredSocket(localSocket, str1, j, paramHttpContext);
      }
      catch (IOException localIOException2)
      {
        for (;;) {}
      }
    }
  }
  
  public Socket createLayeredSocket(Socket paramSocket, String paramString, int paramInt, HttpContext paramHttpContext)
  {
    Object localObject = this.socketfactory;
    boolean bool1 = true;
    localObject = (SSLSocket)((SSLSocketFactory)localObject).createSocket(paramSocket, paramString, paramInt, bool1);
    String[] arrayOfString1 = this.supportedProtocols;
    if (arrayOfString1 != null)
    {
      arrayOfString1 = this.supportedProtocols;
      ((SSLSocket)localObject).setEnabledProtocols(arrayOfString1);
    }
    for (;;)
    {
      arrayOfString1 = this.supportedCipherSuites;
      if (arrayOfString1 != null)
      {
        arrayOfString1 = this.supportedCipherSuites;
        ((SSLSocket)localObject).setEnabledCipherSuites(arrayOfString1);
      }
      prepareSocket((SSLSocket)localObject);
      ((SSLSocket)localObject).startHandshake();
      verifyHostname((SSLSocket)localObject, paramString);
      return (Socket)localObject;
      String[] arrayOfString2 = ((SSLSocket)localObject).getSupportedProtocols();
      ArrayList localArrayList = new java/util/ArrayList;
      int i = arrayOfString2.length;
      localArrayList.<init>(i);
      int j = arrayOfString2.length;
      i = 0;
      arrayOfString1 = null;
      while (i < j)
      {
        String str1 = arrayOfString2[i];
        String str2 = "SSL";
        boolean bool2 = str1.startsWith(str2);
        if (!bool2) {
          localArrayList.add(str1);
        }
        i += 1;
      }
      i = localArrayList.size();
      arrayOfString1 = new String[i];
      arrayOfString1 = (String[])localArrayList.toArray(arrayOfString1);
      ((SSLSocket)localObject).setEnabledProtocols(arrayOfString1);
    }
  }
  
  public Socket createSocket(HttpContext paramHttpContext)
  {
    return SocketFactory.getDefault().createSocket();
  }
  
  X509HostnameVerifier getHostnameVerifier()
  {
    return this.hostnameVerifier;
  }
  
  protected void prepareSocket(SSLSocket paramSSLSocket) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\ssl\SSLConnectionSocketFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */