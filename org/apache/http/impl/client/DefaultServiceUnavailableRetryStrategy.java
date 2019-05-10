package org.apache.http.impl.client;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class DefaultServiceUnavailableRetryStrategy
  implements ServiceUnavailableRetryStrategy
{
  private final int maxRetries;
  private final long retryInterval;
  
  public DefaultServiceUnavailableRetryStrategy()
  {
    this(1, 1000);
  }
  
  public DefaultServiceUnavailableRetryStrategy(int paramInt1, int paramInt2)
  {
    Args.positive(paramInt1, "Max retries");
    Args.positive(paramInt2, "Retry interval");
    this.maxRetries = paramInt1;
    long l = paramInt2;
    this.retryInterval = l;
  }
  
  public long getRetryInterval()
  {
    return this.retryInterval;
  }
  
  public boolean retryRequest(HttpResponse paramHttpResponse, int paramInt, HttpContext paramHttpContext)
  {
    int i = this.maxRetries;
    StatusLine localStatusLine;
    if (paramInt <= i)
    {
      localStatusLine = paramHttpResponse.getStatusLine();
      i = localStatusLine.getStatusCode();
      int j = 503;
      if (i == j) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      i = 0;
      localStatusLine = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DefaultServiceUnavailableRetryStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */