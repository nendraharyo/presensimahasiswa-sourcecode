package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.util.Args;

public class HttpRequestExecutor
{
  public static final int DEFAULT_WAIT_FOR_CONTINUE = 3000;
  private final int waitForContinue;
  
  public HttpRequestExecutor()
  {
    this(3000);
  }
  
  public HttpRequestExecutor(int paramInt)
  {
    int i = Args.positive(paramInt, "Wait for continue time");
    this.waitForContinue = i;
  }
  
  private static void closeConnection(HttpClientConnection paramHttpClientConnection)
  {
    try
    {
      paramHttpClientConnection.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  protected boolean canResponseHaveBody(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse)
  {
    boolean bool1 = false;
    Object localObject = "HEAD";
    String str = paramHttpRequest.getRequestLine().getMethod();
    boolean bool2 = ((String)localObject).equalsIgnoreCase(str);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      localObject = paramHttpResponse.getStatusLine();
      int i = ((StatusLine)localObject).getStatusCode();
      int j = 200;
      if (i >= j)
      {
        j = 204;
        if (i != j)
        {
          j = 304;
          if (i != j)
          {
            j = 205;
            if (i != j) {
              bool1 = true;
            }
          }
        }
      }
    }
  }
  
  protected HttpResponse doReceiveResponse(HttpRequest paramHttpRequest, HttpClientConnection paramHttpClientConnection, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Args.notNull(paramHttpClientConnection, "Client connection");
    Args.notNull(paramHttpContext, "HTTP context");
    HttpResponse localHttpResponse = null;
    int i = 0;
    StatusLine localStatusLine = null;
    for (;;)
    {
      if (localHttpResponse != null)
      {
        int k = 200;
        if (i >= k) {
          break;
        }
      }
      localHttpResponse = paramHttpClientConnection.receiveResponseHeader();
      i = canResponseHaveBody(paramHttpRequest, localHttpResponse);
      if (i != 0) {
        paramHttpClientConnection.receiveResponseEntity(localHttpResponse);
      }
      localStatusLine = localHttpResponse.getStatusLine();
      int j = localStatusLine.getStatusCode();
    }
    return localHttpResponse;
  }
  
  protected HttpResponse doSendRequest(HttpRequest paramHttpRequest, HttpClientConnection paramHttpClientConnection, HttpContext paramHttpContext)
  {
    int i = 0;
    Object localObject1 = null;
    Args.notNull(paramHttpRequest, "HTTP request");
    Args.notNull(paramHttpClientConnection, "Client connection");
    Args.notNull(paramHttpContext, "HTTP context");
    paramHttpContext.setAttribute("http.connection", paramHttpClientConnection);
    Object localObject2 = "http.request_sent";
    Object localObject3 = Boolean.FALSE;
    paramHttpContext.setAttribute((String)localObject2, localObject3);
    paramHttpClientConnection.sendRequestHeader(paramHttpRequest);
    boolean bool1 = paramHttpRequest instanceof HttpEntityEnclosingRequest;
    int m;
    Object localObject4;
    int k;
    if (bool1)
    {
      m = 1;
      localObject4 = ((HttpRequest)paramHttpRequest).getRequestLine().getProtocolVersion();
      localObject2 = paramHttpRequest;
      localObject2 = (HttpEntityEnclosingRequest)paramHttpRequest;
      bool1 = ((HttpEntityEnclosingRequest)localObject2).expectContinue();
      if (bool1)
      {
        localObject2 = HttpVersion.HTTP_1_0;
        bool1 = ((ProtocolVersion)localObject4).lessEquals((ProtocolVersion)localObject2);
        if (!bool1)
        {
          paramHttpClientConnection.flush();
          int j = this.waitForContinue;
          boolean bool2 = paramHttpClientConnection.isResponseAvailable(j);
          if (bool2)
          {
            localObject4 = paramHttpClientConnection.receiveResponseHeader();
            bool2 = canResponseHaveBody((HttpRequest)paramHttpRequest, (HttpResponse)localObject4);
            if (bool2) {
              paramHttpClientConnection.receiveResponseEntity((HttpResponse)localObject4);
            }
            localObject2 = ((HttpResponse)localObject4).getStatusLine();
            k = ((StatusLine)localObject2).getStatusCode();
            int n = 200;
            if (k < n)
            {
              n = 100;
              if (k != n)
              {
                localObject2 = new org/apache/http/ProtocolException;
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject1 = ((StringBuilder)localObject1).append("Unexpected response: ");
                localObject3 = ((HttpResponse)localObject4).getStatusLine();
                localObject1 = localObject3;
                ((ProtocolException)localObject2).<init>((String)localObject1);
                throw ((Throwable)localObject2);
              }
              k = 0;
              localObject2 = null;
              i = m;
              if (i != 0)
              {
                paramHttpRequest = (HttpEntityEnclosingRequest)paramHttpRequest;
                paramHttpClientConnection.sendRequestEntity(paramHttpRequest);
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      paramHttpClientConnection.flush();
      localObject3 = Boolean.TRUE;
      paramHttpContext.setAttribute("http.request_sent", localObject3);
      return (HttpResponse)localObject2;
      k = 0;
      i = 0;
      localObject1 = null;
      localObject2 = localObject4;
      break;
      k = 0;
      localObject2 = null;
      i = m;
      break;
      k = 0;
      localObject2 = null;
    }
  }
  
  public HttpResponse execute(HttpRequest paramHttpRequest, HttpClientConnection paramHttpClientConnection, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Args.notNull(paramHttpClientConnection, "Client connection");
    Object localObject = "HTTP context";
    Args.notNull(paramHttpContext, (String)localObject);
    try
    {
      localObject = doSendRequest(paramHttpRequest, paramHttpClientConnection, paramHttpContext);
      if (localObject == null) {
        localObject = doReceiveResponse(paramHttpRequest, paramHttpClientConnection, paramHttpContext);
      }
      return (HttpResponse)localObject;
    }
    catch (IOException localIOException)
    {
      closeConnection(paramHttpClientConnection);
      throw localIOException;
    }
    catch (HttpException localHttpException)
    {
      closeConnection(paramHttpClientConnection);
      throw localHttpException;
    }
    catch (RuntimeException localRuntimeException)
    {
      closeConnection(paramHttpClientConnection);
      throw localRuntimeException;
    }
  }
  
  public void postProcess(HttpResponse paramHttpResponse, HttpProcessor paramHttpProcessor, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpResponse, "HTTP response");
    Args.notNull(paramHttpProcessor, "HTTP processor");
    Args.notNull(paramHttpContext, "HTTP context");
    paramHttpContext.setAttribute("http.response", paramHttpResponse);
    paramHttpProcessor.process(paramHttpResponse, paramHttpContext);
  }
  
  public void preProcess(HttpRequest paramHttpRequest, HttpProcessor paramHttpProcessor, HttpContext paramHttpContext)
  {
    Args.notNull(paramHttpRequest, "HTTP request");
    Args.notNull(paramHttpProcessor, "HTTP processor");
    Args.notNull(paramHttpContext, "HTTP context");
    paramHttpContext.setAttribute("http.request", paramHttpRequest);
    paramHttpProcessor.process(paramHttpRequest, paramHttpContext);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\protocol\HttpRequestExecutor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */