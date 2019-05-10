package org.apache.http.conn;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.apache.http.HttpHost;
import org.apache.http.util.Args;

public class HttpInetSocketAddress
  extends InetSocketAddress
{
  private static final long serialVersionUID = -6650701828361907957L;
  private final HttpHost httphost;
  
  public HttpInetSocketAddress(HttpHost paramHttpHost, InetAddress paramInetAddress, int paramInt)
  {
    super(paramInetAddress, paramInt);
    Args.notNull(paramHttpHost, "HTTP host");
    this.httphost = paramHttpHost;
  }
  
  public HttpHost getHttpHost()
  {
    return this.httphost;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.httphost.getHostName();
    localStringBuilder = localStringBuilder.append(str).append(":");
    int i = getPort();
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\HttpInetSocketAddress.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */