package org.apache.http.impl.execchain;

import java.io.IOException;
import java.net.URI;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.util.Args;

public class ProtocolExec
  implements ClientExecChain
{
  private final HttpProcessor httpProcessor;
  private final Log log;
  private final ClientExecChain requestExecutor;
  
  public ProtocolExec(ClientExecChain paramClientExecChain, HttpProcessor paramHttpProcessor)
  {
    Log localLog = LogFactory.getLog(getClass());
    this.log = localLog;
    Args.notNull(paramClientExecChain, "HTTP client request executor");
    Args.notNull(paramHttpProcessor, "HTTP protocol processor");
    this.requestExecutor = paramClientExecChain;
    this.httpProcessor = paramHttpProcessor;
  }
  
  public CloseableHttpResponse execute(HttpRoute paramHttpRoute, HttpRequestWrapper paramHttpRequestWrapper, HttpClientContext paramHttpClientContext, HttpExecutionAware paramHttpExecutionAware)
  {
    Object localObject1 = null;
    int i = -1;
    Args.notNull(paramHttpRoute, "HTTP route");
    Args.notNull(paramHttpRequestWrapper, "HTTP request");
    Args.notNull(paramHttpClientContext, "HTTP context");
    Object localObject2 = paramHttpRequestWrapper.getOriginal();
    boolean bool1 = localObject2 instanceof HttpUriRequest;
    Object localObject4;
    Object localObject6;
    String str;
    boolean bool2;
    Object localObject7;
    if (bool1)
    {
      localObject2 = ((HttpUriRequest)localObject2).getURI();
      localObject4 = localObject2;
      paramHttpRequestWrapper.setURI((URI)localObject4);
      rewriteRequestURI(paramHttpRequestWrapper, paramHttpRoute);
      localObject2 = paramHttpRequestWrapper.getParams();
      localObject6 = "http.virtual-host";
      localObject2 = (HttpHost)((HttpParams)localObject2).getParameter((String)localObject6);
      if (localObject2 != null)
      {
        int j = ((HttpHost)localObject2).getPort();
        if (j == i)
        {
          localObject6 = paramHttpRoute.getTargetHost();
          int m = ((HttpHost)localObject6).getPort();
          if (m != i)
          {
            localObject6 = new org/apache/http/HttpHost;
            str = ((HttpHost)localObject2).getHostName();
            localObject2 = ((HttpHost)localObject2).getSchemeName();
            ((HttpHost)localObject6).<init>(str, m, (String)localObject2);
            localObject2 = localObject6;
          }
          localObject6 = this.log;
          bool2 = ((Log)localObject6).isDebugEnabled();
          if (bool2)
          {
            localObject6 = this.log;
            localObject7 = new java/lang/StringBuilder;
            ((StringBuilder)localObject7).<init>();
            str = "Using virtual host";
            localObject7 = str + localObject2;
            ((Log)localObject6).debug(localObject7);
          }
        }
      }
      if (localObject2 == null) {
        break label540;
      }
    }
    for (;;)
    {
      label241:
      if (localObject2 == null) {
        localObject2 = paramHttpRoute.getTargetHost();
      }
      for (localObject1 = localObject2;; localObject1 = localHttpException)
      {
        if (localObject4 != null)
        {
          localObject4 = ((URI)localObject4).getUserInfo();
          if (localObject4 != null)
          {
            localObject2 = paramHttpClientContext.getCredentialsProvider();
            if (localObject2 == null)
            {
              localObject2 = new org/apache/http/impl/client/BasicCredentialsProvider;
              ((BasicCredentialsProvider)localObject2).<init>();
              paramHttpClientContext.setCredentialsProvider((CredentialsProvider)localObject2);
            }
            localObject6 = new org/apache/http/auth/AuthScope;
            ((AuthScope)localObject6).<init>((HttpHost)localObject1);
            localObject7 = new org/apache/http/auth/UsernamePasswordCredentials;
            ((UsernamePasswordCredentials)localObject7).<init>((String)localObject4);
            ((CredentialsProvider)localObject2).setCredentials((AuthScope)localObject6, (Credentials)localObject7);
          }
        }
        paramHttpClientContext.setAttribute("http.target_host", localObject1);
        paramHttpClientContext.setAttribute("http.route", paramHttpRoute);
        paramHttpClientContext.setAttribute("http.request", paramHttpRequestWrapper);
        this.httpProcessor.process(paramHttpRequestWrapper, paramHttpClientContext);
        localObject4 = this.requestExecutor.execute(paramHttpRoute, paramHttpRequestWrapper, paramHttpClientContext, paramHttpExecutionAware);
        localObject2 = "http.response";
        try
        {
          paramHttpClientContext.setAttribute((String)localObject2, localObject4);
          localObject2 = this.httpProcessor;
          ((HttpProcessor)localObject2).process((HttpResponse)localObject4, paramHttpClientContext);
          return (CloseableHttpResponse)localObject4;
        }
        catch (RuntimeException localRuntimeException)
        {
          int k;
          ((CloseableHttpResponse)localObject5).close();
          throw localRuntimeException;
        }
        catch (IOException localIOException)
        {
          ((CloseableHttpResponse)localObject5).close();
          throw localIOException;
        }
        catch (HttpException localHttpException)
        {
          Object localObject5;
          ((CloseableHttpResponse)localObject5).close();
          throw localHttpException;
        }
        localObject2 = ((HttpRequest)localObject2).getRequestLine().getUri();
        try
        {
          localObject2 = URI.create((String)localObject2);
          localObject4 = localObject2;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          localObject6 = this.log;
          bool2 = ((Log)localObject6).isDebugEnabled();
          if (bool2)
          {
            localObject6 = this.log;
            localObject7 = new java/lang/StringBuilder;
            ((StringBuilder)localObject7).<init>();
            str = "Unable to parse '";
            localObject2 = ((StringBuilder)localObject7).append(str).append((String)localObject2).append("' as a valid URI; ");
            localObject7 = "request URI and Host header may be inconsistent";
            localObject2 = (String)localObject7;
            ((Log)localObject6).debug(localObject2, localIllegalArgumentException);
          }
          bool1 = false;
          localObject5 = null;
        }
        break;
        label540:
        if (localObject5 == null) {
          break label656;
        }
        bool3 = ((URI)localObject5).isAbsolute();
        if (!bool3) {
          break label656;
        }
        localObject2 = ((URI)localObject5).getHost();
        if (localObject2 == null) {
          break label656;
        }
        localObject1 = new org/apache/http/HttpHost;
        localObject2 = ((URI)localObject5).getHost();
        k = ((URI)localObject5).getPort();
        localObject7 = ((URI)localObject5).getScheme();
        ((HttpHost)localObject1).<init>((String)localObject2, k, (String)localObject7);
        localObject2 = localObject1;
        break label241;
      }
      label656:
      boolean bool3 = false;
      Object localObject3 = null;
    }
  }
  
  /* Error */
  void rewriteRequestURI(HttpRequestWrapper paramHttpRequestWrapper, HttpRoute paramHttpRoute)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 234	org/apache/http/client/methods/HttpRequestWrapper:getURI	()Ljava/net/URI;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull +59 -> 65
    //   9: aload_2
    //   10: invokevirtual 237	org/apache/http/conn/routing/HttpRoute:getProxyHost	()Lorg/apache/http/HttpHost;
    //   13: astore 4
    //   15: aload 4
    //   17: ifnull +57 -> 74
    //   20: aload_2
    //   21: invokevirtual 240	org/apache/http/conn/routing/HttpRoute:isTunnelled	()Z
    //   24: istore 5
    //   26: iload 5
    //   28: ifne +46 -> 74
    //   31: aload_3
    //   32: invokevirtual 213	java/net/URI:isAbsolute	()Z
    //   35: istore 5
    //   37: iload 5
    //   39: ifne +27 -> 66
    //   42: aload_2
    //   43: invokevirtual 92	org/apache/http/conn/routing/HttpRoute:getTargetHost	()Lorg/apache/http/HttpHost;
    //   46: astore 4
    //   48: iconst_1
    //   49: istore 6
    //   51: aload_3
    //   52: aload 4
    //   54: iload 6
    //   56: invokestatic 247	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;Lorg/apache/http/HttpHost;Z)Ljava/net/URI;
    //   59: astore_3
    //   60: aload_1
    //   61: aload_3
    //   62: invokevirtual 64	org/apache/http/client/methods/HttpRequestWrapper:setURI	(Ljava/net/URI;)V
    //   65: return
    //   66: aload_3
    //   67: invokestatic 250	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;)Ljava/net/URI;
    //   70: astore_3
    //   71: goto -11 -> 60
    //   74: aload_3
    //   75: invokevirtual 213	java/net/URI:isAbsolute	()Z
    //   78: istore 5
    //   80: iload 5
    //   82: ifeq +23 -> 105
    //   85: iconst_0
    //   86: istore 5
    //   88: aconst_null
    //   89: astore 4
    //   91: iconst_1
    //   92: istore 6
    //   94: aload_3
    //   95: aconst_null
    //   96: iload 6
    //   98: invokestatic 247	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;Lorg/apache/http/HttpHost;Z)Ljava/net/URI;
    //   101: astore_3
    //   102: goto -42 -> 60
    //   105: aload_3
    //   106: invokestatic 250	org/apache/http/client/utils/URIUtils:rewriteURI	(Ljava/net/URI;)Ljava/net/URI;
    //   109: astore_3
    //   110: goto -50 -> 60
    //   113: astore_3
    //   114: new 252	org/apache/http/ProtocolException
    //   117: astore 4
    //   119: new 110	java/lang/StringBuilder
    //   122: astore 7
    //   124: aload 7
    //   126: invokespecial 111	java/lang/StringBuilder:<init>	()V
    //   129: aload 7
    //   131: ldc -2
    //   133: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: astore 7
    //   138: aload_1
    //   139: invokevirtual 255	org/apache/http/client/methods/HttpRequestWrapper:getRequestLine	()Lorg/apache/http/RequestLine;
    //   142: invokeinterface 197 1 0
    //   147: astore 8
    //   149: aload 7
    //   151: aload 8
    //   153: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: astore 7
    //   161: aload 4
    //   163: aload 7
    //   165: aload_3
    //   166: invokespecial 258	org/apache/http/ProtocolException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   169: aload 4
    //   171: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	this	ProtocolExec
    //   0	172	1	paramHttpRequestWrapper	HttpRequestWrapper
    //   0	172	2	paramHttpRoute	HttpRoute
    //   4	106	3	localURI	URI
    //   113	53	3	localURISyntaxException	java.net.URISyntaxException
    //   13	157	4	localObject1	Object
    //   24	63	5	bool1	boolean
    //   49	48	6	bool2	boolean
    //   122	42	7	localObject2	Object
    //   147	5	8	str	String
    // Exception table:
    //   from	to	target	type
    //   0	4	113	java/net/URISyntaxException
    //   9	13	113	java/net/URISyntaxException
    //   20	24	113	java/net/URISyntaxException
    //   31	35	113	java/net/URISyntaxException
    //   42	46	113	java/net/URISyntaxException
    //   54	59	113	java/net/URISyntaxException
    //   61	65	113	java/net/URISyntaxException
    //   66	70	113	java/net/URISyntaxException
    //   74	78	113	java/net/URISyntaxException
    //   96	101	113	java/net/URISyntaxException
    //   105	109	113	java/net/URISyntaxException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\execchain\ProtocolExec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */