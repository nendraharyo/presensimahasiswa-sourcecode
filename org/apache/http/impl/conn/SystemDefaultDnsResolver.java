package org.apache.http.impl.conn;

import java.net.InetAddress;
import org.apache.http.conn.DnsResolver;

public class SystemDefaultDnsResolver
  implements DnsResolver
{
  public static final SystemDefaultDnsResolver INSTANCE;
  
  static
  {
    SystemDefaultDnsResolver localSystemDefaultDnsResolver = new org/apache/http/impl/conn/SystemDefaultDnsResolver;
    localSystemDefaultDnsResolver.<init>();
    INSTANCE = localSystemDefaultDnsResolver;
  }
  
  public InetAddress[] resolve(String paramString)
  {
    return InetAddress.getAllByName(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\SystemDefaultDnsResolver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */