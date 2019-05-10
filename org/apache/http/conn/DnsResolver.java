package org.apache.http.conn;

import java.net.InetAddress;

public abstract interface DnsResolver
{
  public abstract InetAddress[] resolve(String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\DnsResolver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */