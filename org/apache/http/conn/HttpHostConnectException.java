package org.apache.http.conn;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import org.apache.http.HttpHost;

public class HttpHostConnectException
  extends ConnectException
{
  private static final long serialVersionUID = -3194482710275220224L;
  private final HttpHost host;
  
  public HttpHostConnectException(IOException paramIOException, HttpHost paramHttpHost, InetAddress... paramVarArgs) {}
  
  public HttpHostConnectException(HttpHost paramHttpHost, ConnectException paramConnectException)
  {
    this(paramConnectException, paramHttpHost, null);
  }
  
  public HttpHost getHost()
  {
    return this.host;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\HttpHostConnectException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */