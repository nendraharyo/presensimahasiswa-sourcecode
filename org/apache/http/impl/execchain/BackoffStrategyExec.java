package org.apache.http.impl.execchain;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.BackoffManager;
import org.apache.http.client.ConnectionBackoffStrategy;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;

public class BackoffStrategyExec
  implements ClientExecChain
{
  private final BackoffManager backoffManager;
  private final ConnectionBackoffStrategy connectionBackoffStrategy;
  private final ClientExecChain requestExecutor;
  
  public BackoffStrategyExec(ClientExecChain paramClientExecChain, ConnectionBackoffStrategy paramConnectionBackoffStrategy, BackoffManager paramBackoffManager)
  {
    Args.notNull(paramClientExecChain, "HTTP client request executor");
    Args.notNull(paramConnectionBackoffStrategy, "Connection backoff strategy");
    Args.notNull(paramBackoffManager, "Backoff manager");
    this.requestExecutor = paramClientExecChain;
    this.connectionBackoffStrategy = paramConnectionBackoffStrategy;
    this.backoffManager = paramBackoffManager;
  }
  
  public CloseableHttpResponse execute(HttpRoute paramHttpRoute, HttpRequestWrapper paramHttpRequestWrapper, HttpClientContext paramHttpClientContext, HttpExecutionAware paramHttpExecutionAware)
  {
    Args.notNull(paramHttpRoute, "HTTP route");
    Args.notNull(paramHttpRequestWrapper, "HTTP request");
    Object localObject1 = "HTTP context";
    Args.notNull(paramHttpClientContext, (String)localObject1);
    boolean bool = false;
    Object localObject2 = null;
    for (;;)
    {
      try
      {
        localObject1 = this.requestExecutor;
        localObject1 = ((ClientExecChain)localObject1).execute(paramHttpRoute, paramHttpRequestWrapper, paramHttpClientContext, paramHttpExecutionAware);
        localObject2 = this.connectionBackoffStrategy;
        bool = ((ConnectionBackoffStrategy)localObject2).shouldBackoff((HttpResponse)localObject1);
        if (bool)
        {
          localObject2 = this.backoffManager;
          ((BackoffManager)localObject2).backOff(paramHttpRoute);
          return (CloseableHttpResponse)localObject1;
        }
      }
      catch (Exception localException)
      {
        if (0 != 0) {
          null.close();
        }
        localObject2 = this.connectionBackoffStrategy;
        bool = ((ConnectionBackoffStrategy)localObject2).shouldBackoff(localException);
        if (bool)
        {
          localObject2 = this.backoffManager;
          ((BackoffManager)localObject2).backOff(paramHttpRoute);
        }
        bool = localException instanceof RuntimeException;
        if (bool) {
          throw ((RuntimeException)localException);
        }
        bool = localException instanceof HttpException;
        if (bool) {
          throw ((HttpException)localException);
        }
        bool = localException instanceof IOException;
        if (bool) {
          throw ((IOException)localException);
        }
        localObject2 = new java/lang/reflect/UndeclaredThrowableException;
        ((UndeclaredThrowableException)localObject2).<init>(localException);
        throw ((Throwable)localObject2);
      }
      localObject2 = this.backoffManager;
      ((BackoffManager)localObject2).probe(paramHttpRoute);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\execchain\BackoffStrategyExec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */