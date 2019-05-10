package org.apache.http.params;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.ConnectionConfig.Builder;
import org.apache.http.config.MessageConstraints;
import org.apache.http.config.MessageConstraints.Builder;
import org.apache.http.config.SocketConfig;
import org.apache.http.config.SocketConfig.Builder;

public final class HttpParamConfig
{
  public static ConnectionConfig getConnectionConfig(HttpParams paramHttpParams)
  {
    MessageConstraints localMessageConstraints = getMessageConstraints(paramHttpParams);
    Object localObject = (String)paramHttpParams.getParameter("http.protocol.element-charset");
    ConnectionConfig.Builder localBuilder = ConnectionConfig.custom();
    if (localObject != null) {}
    for (localObject = Charset.forName((String)localObject);; localObject = null)
    {
      localBuilder = localBuilder.setCharset((Charset)localObject);
      localObject = (CodingErrorAction)paramHttpParams.getParameter("http.malformed.input.action");
      localBuilder = localBuilder.setMalformedInputAction((CodingErrorAction)localObject);
      localObject = (CodingErrorAction)paramHttpParams.getParameter("http.unmappable.input.action");
      return localBuilder.setMalformedInputAction((CodingErrorAction)localObject).setMessageConstraints(localMessageConstraints).build();
    }
  }
  
  public static MessageConstraints getMessageConstraints(HttpParams paramHttpParams)
  {
    int i = -1;
    MessageConstraints.Builder localBuilder = MessageConstraints.custom();
    int j = paramHttpParams.getIntParameter("http.connection.max-header-count", i);
    localBuilder = localBuilder.setMaxHeaderCount(j);
    j = paramHttpParams.getIntParameter("http.connection.max-line-length", i);
    return localBuilder.setMaxLineLength(j).build();
  }
  
  public static SocketConfig getSocketConfig(HttpParams paramHttpParams)
  {
    SocketConfig.Builder localBuilder = SocketConfig.custom();
    int i = paramHttpParams.getIntParameter("http.socket.timeout", 0);
    localBuilder = localBuilder.setSoTimeout(i);
    boolean bool1 = paramHttpParams.getBooleanParameter("http.socket.reuseaddr", false);
    localBuilder = localBuilder.setSoReuseAddress(bool1);
    bool1 = paramHttpParams.getBooleanParameter("http.socket.keepalive", false);
    localBuilder = localBuilder.setSoKeepAlive(bool1);
    int j = paramHttpParams.getIntParameter("http.socket.linger", -1);
    localBuilder = localBuilder.setSoLinger(j);
    boolean bool2 = paramHttpParams.getBooleanParameter("http.tcp.nodelay", true);
    return localBuilder.setTcpNoDelay(bool2).build();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\params\HttpParamConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */