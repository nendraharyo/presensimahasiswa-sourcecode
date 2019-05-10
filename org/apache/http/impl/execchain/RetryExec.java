package org.apache.http.impl.execchain;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;

public class RetryExec
  implements ClientExecChain
{
  private final Log log;
  private final ClientExecChain requestExecutor;
  private final HttpRequestRetryHandler retryHandler;
  
  public RetryExec(ClientExecChain paramClientExecChain, HttpRequestRetryHandler paramHttpRequestRetryHandler)
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
    Args.notNull(paramClientExecChain, "HTTP request executor");
    Args.notNull(paramHttpRequestRetryHandler, "HTTP request retry handler");
    this.requestExecutor = paramClientExecChain;
    this.retryHandler = paramHttpRequestRetryHandler;
  }
  
  public CloseableHttpResponse execute(HttpRoute paramHttpRoute, HttpRequestWrapper paramHttpRequestWrapper, HttpClientContext paramHttpClientContext, HttpExecutionAware paramHttpExecutionAware)
  {
    Args.notNull(paramHttpRoute, "HTTP route");
    Args.notNull(paramHttpRequestWrapper, "HTTP request");
    Object localObject1 = "HTTP context";
    Args.notNull(paramHttpClientContext, (String)localObject1);
    Object localObject3 = paramHttpRequestWrapper.getAllHeaders();
    int i = 1;
    int k = i;
    try
    {
      localObject1 = this.requestExecutor;
      return ((ClientExecChain)localObject1).execute(paramHttpRoute, paramHttpRequestWrapper, paramHttpClientContext, paramHttpExecutionAware);
    }
    catch (IOException localIOException)
    {
      Object localObject4;
      Object localObject6;
      Object localObject2;
      for (;;)
      {
        if (paramHttpExecutionAware != null)
        {
          bool2 = paramHttpExecutionAware.isAborted();
          if (bool2)
          {
            this.log.debug("Request has been aborted");
            throw localIOException;
          }
        }
        localObject4 = this.retryHandler;
        boolean bool2 = ((HttpRequestRetryHandler)localObject4).retryRequest(localIOException, k, paramHttpClientContext);
        if (!bool2) {
          break;
        }
        localObject4 = this.log;
        bool2 = ((Log)localObject4).isInfoEnabled();
        Object localObject5;
        if (bool2)
        {
          localObject4 = this.log;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject5 = ((StringBuilder)localObject5).append("I/O exception (");
          String str = localIOException.getClass().getName();
          localObject5 = ((StringBuilder)localObject5).append(str).append(") caught when processing request to ").append(paramHttpRoute).append(": ");
          str = localIOException.getMessage();
          localObject5 = str;
          ((Log)localObject4).info(localObject5);
        }
        localObject4 = this.log;
        bool2 = ((Log)localObject4).isDebugEnabled();
        if (bool2)
        {
          localObject4 = this.log;
          localObject5 = localIOException.getMessage();
          ((Log)localObject4).debug(localObject5, localIOException);
        }
        bool2 = RequestEntityProxy.isRepeatable(paramHttpRequestWrapper);
        if (!bool2)
        {
          this.log.debug("Cannot retry non-repeatable request");
          localObject6 = new org/apache/http/client/NonRepeatableRequestException;
          ((NonRepeatableRequestException)localObject6).<init>("Cannot retry request with a non-repeatable request entity", localIOException);
          throw ((Throwable)localObject6);
        }
        paramHttpRequestWrapper.setHeaders((Header[])localObject3);
        localObject2 = this.log;
        i = ((Log)localObject2).isInfoEnabled();
        if (i != 0)
        {
          localObject2 = this.log;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject5 = "Retrying request to ";
          localObject4 = (String)localObject5 + paramHttpRoute;
          ((Log)localObject2).info(localObject4);
        }
        int j = k + 1;
        k = j;
      }
      boolean bool1 = localObject2 instanceof NoHttpResponseException;
      if (bool1)
      {
        localObject6 = new org/apache/http/NoHttpResponseException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = paramHttpRoute.getTargetHost().toHostString();
        localObject3 = (String)localObject4 + " failed to respond";
        ((NoHttpResponseException)localObject6).<init>((String)localObject3);
        localObject2 = ((IOException)localObject2).getStackTrace();
        ((NoHttpResponseException)localObject6).setStackTrace((StackTraceElement[])localObject2);
        throw ((Throwable)localObject6);
      }
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\execchain\RetryExec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */