package org.apache.http.impl.client;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class DefaultHttpRequestRetryHandler
  implements HttpRequestRetryHandler
{
  public static final DefaultHttpRequestRetryHandler INSTANCE;
  private final Set nonRetriableClasses;
  private final boolean requestSentRetryEnabled;
  private final int retryCount;
  
  static
  {
    DefaultHttpRequestRetryHandler localDefaultHttpRequestRetryHandler = new org/apache/http/impl/client/DefaultHttpRequestRetryHandler;
    localDefaultHttpRequestRetryHandler.<init>();
    INSTANCE = localDefaultHttpRequestRetryHandler;
  }
  
  public DefaultHttpRequestRetryHandler()
  {
    this(3, false);
  }
  
  public DefaultHttpRequestRetryHandler(int paramInt, boolean paramBoolean)
  {
    this(paramInt, paramBoolean, (Collection)localObject);
  }
  
  protected DefaultHttpRequestRetryHandler(int paramInt, boolean paramBoolean, Collection paramCollection)
  {
    this.retryCount = paramInt;
    this.requestSentRetryEnabled = paramBoolean;
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.nonRetriableClasses = ((Set)localObject);
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Class)localIterator.next();
      Set localSet = this.nonRetriableClasses;
      localSet.add(localObject);
    }
  }
  
  public int getRetryCount()
  {
    return this.retryCount;
  }
  
  protected boolean handleAsIdempotent(HttpRequest paramHttpRequest)
  {
    boolean bool = paramHttpRequest instanceof HttpEntityEnclosingRequest;
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isRequestSentRetryEnabled()
  {
    return this.requestSentRetryEnabled;
  }
  
  protected boolean requestIsAborted(HttpRequest paramHttpRequest)
  {
    boolean bool1 = paramHttpRequest instanceof RequestWrapper;
    if (bool1) {
      paramHttpRequest = (RequestWrapper)paramHttpRequest;
    }
    for (Object localObject = paramHttpRequest.getOriginal();; localObject = paramHttpRequest)
    {
      boolean bool2 = localObject instanceof HttpUriRequest;
      if (bool2)
      {
        localObject = (HttpUriRequest)localObject;
        bool1 = ((HttpUriRequest)localObject).isAborted();
        if (bool1) {
          bool1 = true;
        }
      }
      for (;;)
      {
        return bool1;
        bool1 = false;
        localObject = null;
      }
    }
  }
  
  public boolean retryRequest(IOException paramIOException, int paramInt, HttpContext paramHttpContext)
  {
    boolean bool1 = true;
    Args.notNull(paramIOException, "Exception parameter");
    Object localObject1 = "HTTP context";
    Args.notNull(paramHttpContext, (String)localObject1);
    int i = this.retryCount;
    if (paramInt > i)
    {
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return i;
      localObject1 = this.nonRetriableClasses;
      Object localObject2 = paramIOException.getClass();
      boolean bool2 = ((Set)localObject1).contains(localObject2);
      if (bool2)
      {
        bool2 = false;
        localObject1 = null;
      }
      else
      {
        localObject1 = this.nonRetriableClasses;
        localObject2 = ((Set)localObject1).iterator();
        do
        {
          bool2 = ((Iterator)localObject2).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (Class)((Iterator)localObject2).next();
          bool2 = ((Class)localObject1).isInstance(paramIOException);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        localObject1 = HttpClientContext.adapt(paramHttpContext);
        localObject2 = ((HttpClientContext)localObject1).getRequest();
        boolean bool3 = requestIsAborted((HttpRequest)localObject2);
        if (bool3)
        {
          bool2 = false;
          localObject1 = null;
        }
        else
        {
          boolean bool4 = handleAsIdempotent((HttpRequest)localObject2);
          if (bool4)
          {
            bool2 = bool1;
          }
          else
          {
            bool2 = ((HttpClientContext)localObject1).isRequestSent();
            if (bool2)
            {
              bool2 = this.requestSentRetryEnabled;
              if (!bool2) {}
            }
            else
            {
              bool2 = bool1;
              continue;
            }
            bool2 = false;
            localObject1 = null;
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DefaultHttpRequestRetryHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */