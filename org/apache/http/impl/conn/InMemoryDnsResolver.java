package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.DnsResolver;
import org.apache.http.util.Args;

public class InMemoryDnsResolver
  implements DnsResolver
{
  private final Map dnsMap;
  private final Log log;
  
  public InMemoryDnsResolver()
  {
    Object localObject = LogFactory.getLog(InMemoryDnsResolver.class);
    this.log = ((Log)localObject);
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.dnsMap = ((Map)localObject);
  }
  
  public void add(String paramString, InetAddress... paramVarArgs)
  {
    Args.notNull(paramString, "Host name");
    Args.notNull(paramVarArgs, "Array of IP addresses");
    this.dnsMap.put(paramString, paramVarArgs);
  }
  
  public InetAddress[] resolve(String paramString)
  {
    Object localObject1 = (InetAddress[])this.dnsMap.get(paramString);
    Object localObject2 = this.log;
    boolean bool = ((Log)localObject2).isInfoEnabled();
    if (bool)
    {
      localObject2 = this.log;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Resolving ").append(paramString).append(" to ");
      String str = Arrays.deepToString((Object[])localObject1);
      localObject3 = str;
      ((Log)localObject2).info(localObject3);
    }
    if (localObject1 == null)
    {
      localObject1 = new java/net/UnknownHostException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = paramString + " cannot be resolved";
      ((UnknownHostException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return (InetAddress[])localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\InMemoryDnsResolver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */