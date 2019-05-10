package org.apache.http.impl.client;

import java.nio.charset.Charset;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.protocol.RequestAddCookies;
import org.apache.http.client.protocol.RequestAuthCache;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.protocol.RequestDefaultHeaders;
import org.apache.http.client.protocol.RequestProxyAuthentication;
import org.apache.http.client.protocol.RequestTargetAuthentication;
import org.apache.http.client.protocol.ResponseProcessCookies;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.params.SyncBasicHttpParams;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestExpectContinue;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;

public class DefaultHttpClient
  extends AbstractHttpClient
{
  public DefaultHttpClient()
  {
    super(null, null);
  }
  
  public DefaultHttpClient(ClientConnectionManager paramClientConnectionManager)
  {
    super(paramClientConnectionManager, null);
  }
  
  public DefaultHttpClient(ClientConnectionManager paramClientConnectionManager, HttpParams paramHttpParams)
  {
    super(paramClientConnectionManager, paramHttpParams);
  }
  
  public DefaultHttpClient(HttpParams paramHttpParams)
  {
    super(null, paramHttpParams);
  }
  
  public static void setDefaultHttpParams(HttpParams paramHttpParams)
  {
    Object localObject = HttpVersion.HTTP_1_1;
    HttpProtocolParams.setVersion(paramHttpParams, (ProtocolVersion)localObject);
    localObject = HTTP.DEF_CONTENT_CHARSET.name();
    HttpProtocolParams.setContentCharset(paramHttpParams, (String)localObject);
    HttpConnectionParams.setTcpNoDelay(paramHttpParams, true);
    HttpConnectionParams.setSocketBufferSize(paramHttpParams, 8192);
    localObject = HttpClientBuilder.DEFAULT_USER_AGENT;
    HttpProtocolParams.setUserAgent(paramHttpParams, (String)localObject);
  }
  
  protected HttpParams createHttpParams()
  {
    SyncBasicHttpParams localSyncBasicHttpParams = new org/apache/http/params/SyncBasicHttpParams;
    localSyncBasicHttpParams.<init>();
    setDefaultHttpParams(localSyncBasicHttpParams);
    return localSyncBasicHttpParams;
  }
  
  protected BasicHttpProcessor createHttpProcessor()
  {
    BasicHttpProcessor localBasicHttpProcessor = new org/apache/http/protocol/BasicHttpProcessor;
    localBasicHttpProcessor.<init>();
    Object localObject = new org/apache/http/client/protocol/RequestDefaultHeaders;
    ((RequestDefaultHeaders)localObject).<init>();
    localBasicHttpProcessor.addInterceptor((HttpRequestInterceptor)localObject);
    localObject = new org/apache/http/protocol/RequestContent;
    ((RequestContent)localObject).<init>();
    localBasicHttpProcessor.addInterceptor((HttpRequestInterceptor)localObject);
    localObject = new org/apache/http/protocol/RequestTargetHost;
    ((RequestTargetHost)localObject).<init>();
    localBasicHttpProcessor.addInterceptor((HttpRequestInterceptor)localObject);
    localObject = new org/apache/http/client/protocol/RequestClientConnControl;
    ((RequestClientConnControl)localObject).<init>();
    localBasicHttpProcessor.addInterceptor((HttpRequestInterceptor)localObject);
    localObject = new org/apache/http/protocol/RequestUserAgent;
    ((RequestUserAgent)localObject).<init>();
    localBasicHttpProcessor.addInterceptor((HttpRequestInterceptor)localObject);
    localObject = new org/apache/http/protocol/RequestExpectContinue;
    ((RequestExpectContinue)localObject).<init>();
    localBasicHttpProcessor.addInterceptor((HttpRequestInterceptor)localObject);
    localObject = new org/apache/http/client/protocol/RequestAddCookies;
    ((RequestAddCookies)localObject).<init>();
    localBasicHttpProcessor.addInterceptor((HttpRequestInterceptor)localObject);
    localObject = new org/apache/http/client/protocol/ResponseProcessCookies;
    ((ResponseProcessCookies)localObject).<init>();
    localBasicHttpProcessor.addInterceptor((HttpResponseInterceptor)localObject);
    localObject = new org/apache/http/client/protocol/RequestAuthCache;
    ((RequestAuthCache)localObject).<init>();
    localBasicHttpProcessor.addInterceptor((HttpRequestInterceptor)localObject);
    localObject = new org/apache/http/client/protocol/RequestTargetAuthentication;
    ((RequestTargetAuthentication)localObject).<init>();
    localBasicHttpProcessor.addInterceptor((HttpRequestInterceptor)localObject);
    localObject = new org/apache/http/client/protocol/RequestProxyAuthentication;
    ((RequestProxyAuthentication)localObject).<init>();
    localBasicHttpProcessor.addInterceptor((HttpRequestInterceptor)localObject);
    return localBasicHttpProcessor;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\DefaultHttpClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */