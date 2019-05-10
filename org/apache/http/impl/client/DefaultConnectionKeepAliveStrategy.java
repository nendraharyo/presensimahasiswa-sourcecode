package org.apache.http.impl.client;

import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class DefaultConnectionKeepAliveStrategy
  implements ConnectionKeepAliveStrategy
{
  public static final DefaultConnectionKeepAliveStrategy INSTANCE;
  
  static
  {
    DefaultConnectionKeepAliveStrategy localDefaultConnectionKeepAliveStrategy = new org/apache/http/impl/client/DefaultConnectionKeepAliveStrategy;
    localDefaultConnectionKeepAliveStrategy.<init>();
    INSTANCE = localDefaultConnectionKeepAliveStrategy;
  }
  
  public long getKeepAliveDuration(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    BasicHeaderElementIterator localBasicHeaderElementIterator = new org/apache/http/message/BasicHeaderElementIterator;
    Object localObject = paramHttpResponse.headerIterator("Keep-Alive");
    localBasicHeaderElementIterator.<init>((HeaderIterator)localObject);
    for (;;)
    {
      boolean bool1 = localBasicHeaderElementIterator.hasNext();
      if (bool1)
      {
        localObject = localBasicHeaderElementIterator.nextElement();
        String str1 = ((HeaderElement)localObject).getName();
        localObject = ((HeaderElement)localObject).getValue();
        if (localObject != null)
        {
          String str2 = "timeout";
          boolean bool2 = str1.equalsIgnoreCase(str2);
          if (!bool2) {}
        }
      }
      else
      {
        for (;;)
        {
          try
          {
            l1 = Long.parseLong((String)localObject);
            long l2 = 1000L;
            l1 *= l2;
            return l1;
          }
          catch (NumberFormatException localNumberFormatException) {}
          long l1 = -1;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DefaultConnectionKeepAliveStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */