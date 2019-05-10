package b.a.a.a.e.d;

import b.a.a.a.e.m;
import b.a.a.a.n;
import b.a.a.a.o.h;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class i
  implements b.a.a.a.e.c.b, b.a.a.a.e.c.c, b.a.a.a.e.c.f
{
  public static final l ALLOW_ALL_HOSTNAME_VERIFIER;
  public static final l BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
  public static final String SSL = "SSL";
  public static final String SSLV2 = "SSLv2";
  public static final l STRICT_HOSTNAME_VERIFIER;
  public static final String TLS = "TLS";
  private volatile l hostnameVerifier;
  private final b.a.a.a.e.c.a nameResolver;
  private final SSLSocketFactory socketfactory;
  private final String[] supportedCipherSuites;
  private final String[] supportedProtocols;
  
  static
  {
    Object localObject = new b/a/a/a/e/d/b;
    ((b)localObject).<init>();
    ALLOW_ALL_HOSTNAME_VERIFIER = (l)localObject;
    localObject = new b/a/a/a/e/d/c;
    ((c)localObject).<init>();
    BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = (l)localObject;
    localObject = new b/a/a/a/e/d/j;
    ((j)localObject).<init>();
    STRICT_HOSTNAME_VERIFIER = (l)localObject;
  }
  
  public i(k paramk)
  {
    this(localSSLContext, locall);
  }
  
  public i(k paramk, l paraml)
  {
    this(localSSLContext, paraml);
  }
  
  public i(String paramString1, KeyStore paramKeyStore1, String paramString2, KeyStore paramKeyStore2, SecureRandom paramSecureRandom, b.a.a.a.e.c.a parama) {}
  
  public i(String paramString1, KeyStore paramKeyStore1, String paramString2, KeyStore paramKeyStore2, SecureRandom paramSecureRandom, k paramk, l paraml) {}
  
  public i(String paramString1, KeyStore paramKeyStore1, String paramString2, KeyStore paramKeyStore2, SecureRandom paramSecureRandom, l paraml) {}
  
  public i(KeyStore paramKeyStore)
  {
    this(localSSLContext, locall);
  }
  
  public i(KeyStore paramKeyStore, String paramString) {}
  
  public i(KeyStore paramKeyStore1, String paramString, KeyStore paramKeyStore2) {}
  
  public i(SSLContext paramSSLContext)
  {
    this(paramSSLContext, locall);
  }
  
  public i(SSLContext paramSSLContext, b.a.a.a.e.c.a parama)
  {
    Object localObject = paramSSLContext.getSocketFactory();
    this.socketfactory = ((SSLSocketFactory)localObject);
    localObject = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    this.hostnameVerifier = ((l)localObject);
    this.nameResolver = parama;
    this.supportedProtocols = null;
    this.supportedCipherSuites = null;
  }
  
  public i(SSLContext paramSSLContext, l paraml)
  {
    this(localSSLSocketFactory, null, null, paraml);
  }
  
  public i(SSLContext paramSSLContext, String[] paramArrayOfString1, String[] paramArrayOfString2, l paraml)
  {
    this(localSSLSocketFactory, paramArrayOfString1, paramArrayOfString2, paraml);
  }
  
  public i(SSLSocketFactory paramSSLSocketFactory, l paraml)
  {
    this(paramSSLSocketFactory, null, null, paraml);
  }
  
  public i(SSLSocketFactory paramSSLSocketFactory, String[] paramArrayOfString1, String[] paramArrayOfString2, l paraml)
  {
    SSLSocketFactory localSSLSocketFactory = (SSLSocketFactory)b.a.a.a.o.a.a(paramSSLSocketFactory, "SSL socket factory");
    this.socketfactory = localSSLSocketFactory;
    this.supportedProtocols = paramArrayOfString1;
    this.supportedCipherSuites = paramArrayOfString2;
    if (paraml != null) {}
    for (;;)
    {
      this.hostnameVerifier = paraml;
      this.nameResolver = null;
      return;
      paraml = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    }
  }
  
  public static i getSocketFactory()
  {
    i locali = new b/a/a/a/e/d/i;
    SSLContext localSSLContext = g.a();
    l locall = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    locali.<init>(localSSLContext, locall);
    return locali;
  }
  
  public static i getSystemSocketFactory()
  {
    i locali = new b/a/a/a/e/d/i;
    SSLSocketFactory localSSLSocketFactory = (SSLSocketFactory)SSLSocketFactory.getDefault();
    String[] arrayOfString1 = split(System.getProperty("https.protocols"));
    String[] arrayOfString2 = split(System.getProperty("https.cipherSuites"));
    l locall = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    locali.<init>(localSSLSocketFactory, arrayOfString1, arrayOfString2, locall);
    return locali;
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
    boolean bool = h.b(paramString);
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
      l locall = this.hostnameVerifier;
      locall.a(paramString, paramSSLSocket);
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
  
  public Socket connectSocket(int paramInt, Socket paramSocket, n paramn, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, b.a.a.a.n.e parame)
  {
    b.a.a.a.o.a.a(paramn, "HTTP host");
    Object localObject = "Remote address";
    b.a.a.a.o.a.a(paramInetSocketAddress1, (String)localObject);
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
        String str2 = paramn.a();
        verifyHostname((SSLSocket)localObject, str2);
        return (Socket)localSocket;
      }
      catch (IOException localIOException1) {}
      localSocket = createSocket(parame);
      break;
      try
      {
        localSocket.close();
        throw localIOException1;
        label115:
        String str1 = paramn.a();
        int i = paramInetSocketAddress1.getPort();
        localSocket = createLayeredSocket(localSocket, str1, i, parame);
      }
      catch (IOException localIOException2)
      {
        for (;;) {}
      }
    }
  }
  
  public Socket connectSocket(Socket paramSocket, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2, b.a.a.a.l.e parame)
  {
    Object localObject1 = this.nameResolver;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.nameResolver.a(paramString);
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
      m localm = new b/a/a/a/e/m;
      n localn = new b/a/a/a/n;
      localn.<init>(paramString, paramInt1);
      localm.<init>(localn, (InetAddress)localObject2, paramInt1);
      return connectSocket(paramSocket, localm, (InetSocketAddress)localObject1, parame);
      localObject1 = InetAddress.getByName(paramString);
      localObject2 = localObject1;
      break;
      label111:
      paramInt2 = 0;
    }
  }
  
  public Socket connectSocket(Socket paramSocket, InetSocketAddress paramInetSocketAddress1, InetSocketAddress paramInetSocketAddress2, b.a.a.a.l.e parame)
  {
    b.a.a.a.o.a.a(paramInetSocketAddress1, "Remote address");
    Object localObject1 = "HTTP parameters";
    b.a.a.a.o.a.a(parame, (String)localObject1);
    boolean bool = paramInetSocketAddress1 instanceof m;
    n localn;
    if (bool)
    {
      localObject1 = paramInetSocketAddress1;
      localObject1 = (m)paramInetSocketAddress1;
      localn = ((m)localObject1).a();
    }
    for (;;)
    {
      int i = b.a.a.a.l.c.a(parame);
      int j = b.a.a.a.l.c.e(parame);
      paramSocket.setSoTimeout(i);
      localObject1 = this;
      Object localObject2 = paramSocket;
      return connectSocket(j, paramSocket, localn, (InetSocketAddress)paramInetSocketAddress1, paramInetSocketAddress2, null);
      localn = new b/a/a/a/n;
      localObject1 = paramInetSocketAddress1.getHostName();
      j = paramInetSocketAddress1.getPort();
      localObject2 = "https";
      localn.<init>((String)localObject1, j, (String)localObject2);
    }
  }
  
  public Socket createLayeredSocket(Socket paramSocket, String paramString, int paramInt, b.a.a.a.l.e parame)
  {
    ((b.a.a.a.n.e)null);
    return createLayeredSocket(paramSocket, paramString, paramInt, null);
  }
  
  public Socket createLayeredSocket(Socket paramSocket, String paramString, int paramInt, b.a.a.a.n.e parame)
  {
    SSLSocket localSSLSocket = (SSLSocket)this.socketfactory.createSocket(paramSocket, paramString, paramInt, true);
    internalPrepareSocket(localSSLSocket);
    localSSLSocket.startHandshake();
    verifyHostname(localSSLSocket, paramString);
    return localSSLSocket;
  }
  
  public Socket createLayeredSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    ((b.a.a.a.n.e)null);
    return createLayeredSocket(paramSocket, paramString, paramInt, null);
  }
  
  public Socket createSocket()
  {
    ((b.a.a.a.n.e)null);
    return createSocket(null);
  }
  
  public Socket createSocket(b.a.a.a.l.e parame)
  {
    ((b.a.a.a.n.e)null);
    return createSocket(null);
  }
  
  public Socket createSocket(b.a.a.a.n.e parame)
  {
    SSLSocket localSSLSocket = (SSLSocket)this.socketfactory.createSocket();
    internalPrepareSocket(localSSLSocket);
    return localSSLSocket;
  }
  
  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return createLayeredSocket(paramSocket, paramString, paramInt, paramBoolean);
  }
  
  public l getHostnameVerifier()
  {
    return this.hostnameVerifier;
  }
  
  public boolean isSecure(Socket paramSocket)
  {
    boolean bool1 = true;
    String str1 = "Socket";
    b.a.a.a.o.a.a(paramSocket, str1);
    boolean bool2 = paramSocket instanceof SSLSocket;
    String str2 = "Socket not created by this factory";
    b.a.a.a.o.b.a(bool2, str2);
    bool2 = paramSocket.isClosed();
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      b.a.a.a.o.b.a(bool2, "Socket is closed");
      return bool1;
      bool2 = false;
      str1 = null;
    }
  }
  
  protected void prepareSocket(SSLSocket paramSSLSocket) {}
  
  public void setHostnameVerifier(l paraml)
  {
    b.a.a.a.o.a.a(paraml, "Hostname verifier");
    this.hostnameVerifier = paraml;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\d\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */