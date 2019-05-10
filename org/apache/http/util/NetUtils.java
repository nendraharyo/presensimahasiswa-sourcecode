package org.apache.http.util;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public final class NetUtils
{
  public static void formatAddress(StringBuilder paramStringBuilder, SocketAddress paramSocketAddress)
  {
    Args.notNull(paramStringBuilder, "Buffer");
    Object localObject = "Socket address";
    Args.notNull(paramSocketAddress, (String)localObject);
    boolean bool = paramSocketAddress instanceof InetSocketAddress;
    if (bool)
    {
      paramSocketAddress = (InetSocketAddress)paramSocketAddress;
      localObject = paramSocketAddress.getAddress();
      if (localObject != null) {
        localObject = ((InetAddress)localObject).getHostAddress();
      }
      localObject = paramStringBuilder.append(localObject).append(':');
      int i = paramSocketAddress.getPort();
      ((StringBuilder)localObject).append(i);
    }
    for (;;)
    {
      return;
      paramStringBuilder.append(paramSocketAddress);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\htt\\util\NetUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */