package org.apache.http.impl.execchain;

import java.io.InterruptedIOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;

public class ServiceUnavailableRetryExec
  implements ClientExecChain
{
  private final Log log;
  private final ClientExecChain requestExecutor;
  private final ServiceUnavailableRetryStrategy retryStrategy;
  
  public ServiceUnavailableRetryExec(ClientExecChain paramClientExecChain, ServiceUnavailableRetryStrategy paramServiceUnavailableRetryStrategy)
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
    Args.notNull(paramClientExecChain, "HTTP request executor");
    Args.notNull(paramServiceUnavailableRetryStrategy, "Retry strategy");
    this.requestExecutor = paramClientExecChain;
    this.retryStrategy = paramServiceUnavailableRetryStrategy;
  }
  
  public CloseableHttpResponse execute(HttpRoute paramHttpRoute, HttpRequestWrapper paramHttpRequestWrapper, HttpClientContext paramHttpClientContext, HttpExecutionAware paramHttpExecutionAware)
  {
    Header[] arrayOfHeader = paramHttpRequestWrapper.getAllHeaders();
    int i = 1;
    for (;;)
    {
      localCloseableHttpResponse = this.requestExecutor.execute(paramHttpRoute, paramHttpRequestWrapper, paramHttpClientContext, paramHttpExecutionAware);
      try
      {
        Object localObject1 = this.retryStrategy;
        boolean bool = ((ServiceUnavailableRetryStrategy)localObject1).retryRequest(localCloseableHttpResponse, i, paramHttpClientContext);
        if (bool)
        {
          localCloseableHttpResponse.close();
          localObject1 = this.retryStrategy;
          long l1 = ((ServiceUnavailableRetryStrategy)localObject1).getRetryInterval();
          long l2 = 0L;
          bool = l1 < l2;
          if (bool) {}
          try
          {
            localObject1 = this.log;
            Object localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            String str = "Wait for ";
            localObject2 = ((StringBuilder)localObject2).append(str);
            localObject2 = ((StringBuilder)localObject2).append(l1);
            localObject2 = ((StringBuilder)localObject2).toString();
            ((Log)localObject1).trace(localObject2);
            Thread.sleep(l1);
            paramHttpRequestWrapper.setHeaders(arrayOfHeader);
            i += 1;
          }
          catch (InterruptedException localInterruptedException)
          {
            Object localObject3 = Thread.currentThread();
            ((Thread)localObject3).interrupt();
            localObject3 = new java/io/InterruptedIOException;
            ((InterruptedIOException)localObject3).<init>();
            throw ((Throwable)localObject3);
          }
        }
        return localCloseableHttpResponse;
      }
      catch (RuntimeException localRuntimeException)
      {
        localCloseableHttpResponse.close();
        throw localRuntimeException;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\execchain\ServiceUnavailableRetryExec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */