package org.apache.http.client;

import org.apache.http.HttpResponse;

public abstract interface ConnectionBackoffStrategy
{
  public abstract boolean shouldBackoff(Throwable paramThrowable);
  
  public abstract boolean shouldBackoff(HttpResponse paramHttpResponse);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\ConnectionBackoffStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */