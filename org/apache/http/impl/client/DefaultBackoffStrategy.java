package org.apache.http.impl.client;

import java.net.ConnectException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ConnectionBackoffStrategy;

public class DefaultBackoffStrategy
  implements ConnectionBackoffStrategy
{
  public boolean shouldBackoff(Throwable paramThrowable)
  {
    boolean bool = paramThrowable instanceof SocketTimeoutException;
    if (!bool)
    {
      bool = paramThrowable instanceof ConnectException;
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean shouldBackoff(HttpResponse paramHttpResponse)
  {
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    int i = localStatusLine.getStatusCode();
    int k = 503;
    if (i == k) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localStatusLine = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DefaultBackoffStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */