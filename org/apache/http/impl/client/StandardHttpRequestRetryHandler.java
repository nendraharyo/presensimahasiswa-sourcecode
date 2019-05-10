package org.apache.http.impl.client;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;

public class StandardHttpRequestRetryHandler
  extends DefaultHttpRequestRetryHandler
{
  private final Map idempotentMethods;
  
  public StandardHttpRequestRetryHandler()
  {
    this(3, false);
  }
  
  public StandardHttpRequestRetryHandler(int paramInt, boolean paramBoolean)
  {
    super(paramInt, paramBoolean);
    Object localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.idempotentMethods = ((Map)localObject);
    localObject = this.idempotentMethods;
    Boolean localBoolean = Boolean.TRUE;
    ((Map)localObject).put("GET", localBoolean);
    localObject = this.idempotentMethods;
    localBoolean = Boolean.TRUE;
    ((Map)localObject).put("HEAD", localBoolean);
    localObject = this.idempotentMethods;
    localBoolean = Boolean.TRUE;
    ((Map)localObject).put("PUT", localBoolean);
    localObject = this.idempotentMethods;
    localBoolean = Boolean.TRUE;
    ((Map)localObject).put("DELETE", localBoolean);
    localObject = this.idempotentMethods;
    localBoolean = Boolean.TRUE;
    ((Map)localObject).put("OPTIONS", localBoolean);
    localObject = this.idempotentMethods;
    localBoolean = Boolean.TRUE;
    ((Map)localObject).put("TRACE", localBoolean);
  }
  
  protected boolean handleAsIdempotent(HttpRequest paramHttpRequest)
  {
    Object localObject1 = paramHttpRequest.getRequestLine().getMethod();
    Object localObject2 = Locale.ENGLISH;
    localObject1 = ((String)localObject1).toUpperCase((Locale)localObject2);
    localObject2 = this.idempotentMethods;
    localObject1 = (Boolean)((Map)localObject2).get(localObject1);
    boolean bool;
    if (localObject1 != null)
    {
      bool = ((Boolean)localObject1).booleanValue();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\StandardHttpRequestRetryHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */