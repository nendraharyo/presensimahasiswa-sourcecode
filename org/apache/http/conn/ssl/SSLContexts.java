package org.apache.http.conn.ssl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

public class SSLContexts
{
  public static SSLContext createDefault()
  {
    Object localObject = "TLS";
    try
    {
      localObject = SSLContext.getInstance((String)localObject);
      localSSLInitializationException = null;
      str = null;
      ((SSLContext)localObject).init(null, null, null);
      return (SSLContext)localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localSSLInitializationException = new org/apache/http/conn/ssl/SSLInitializationException;
      str = localNoSuchAlgorithmException.getMessage();
      localSSLInitializationException.<init>(str, localNoSuchAlgorithmException);
      throw localSSLInitializationException;
    }
    catch (KeyManagementException localKeyManagementException)
    {
      SSLInitializationException localSSLInitializationException = new org/apache/http/conn/ssl/SSLInitializationException;
      String str = localKeyManagementException.getMessage();
      localSSLInitializationException.<init>(str, localKeyManagementException);
      throw localSSLInitializationException;
    }
  }
  
  public static SSLContext createSystemDefault()
  {
    Object localObject = "Default";
    try
    {
      localObject = SSLContext.getInstance((String)localObject);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        SSLContext localSSLContext = createDefault();
      }
    }
    return (SSLContext)localObject;
  }
  
  public static SSLContextBuilder custom()
  {
    SSLContextBuilder localSSLContextBuilder = new org/apache/http/conn/ssl/SSLContextBuilder;
    localSSLContextBuilder.<init>();
    return localSSLContextBuilder;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\ssl\SSLContexts.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */