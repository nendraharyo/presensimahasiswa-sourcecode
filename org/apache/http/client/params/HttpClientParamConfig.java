package org.apache.http.client.params;

import java.net.InetAddress;
import java.util.Collection;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.config.RequestConfig.Builder;
import org.apache.http.params.HttpParams;

public final class HttpClientParamConfig
{
  public static RequestConfig getRequestConfig(HttpParams paramHttpParams)
  {
    boolean bool1 = true;
    Object localObject = RequestConfig.custom();
    int i = paramHttpParams.getIntParameter("http.socket.timeout", 0);
    localObject = ((RequestConfig.Builder)localObject).setSocketTimeout(i);
    boolean bool2 = paramHttpParams.getBooleanParameter("http.connection.stalecheck", bool1);
    localObject = ((RequestConfig.Builder)localObject).setStaleConnectionCheckEnabled(bool2);
    int j = paramHttpParams.getIntParameter("http.connection.timeout", 0);
    localObject = ((RequestConfig.Builder)localObject).setConnectTimeout(j);
    boolean bool3 = paramHttpParams.getBooleanParameter("http.protocol.expect-continue", false);
    RequestConfig.Builder localBuilder = ((RequestConfig.Builder)localObject).setExpectContinueEnabled(bool3);
    localObject = (HttpHost)paramHttpParams.getParameter("http.route.default-proxy");
    localBuilder = localBuilder.setProxy((HttpHost)localObject);
    localObject = (InetAddress)paramHttpParams.getParameter("http.route.local-address");
    localBuilder = localBuilder.setLocalAddress((InetAddress)localObject);
    localObject = (Collection)paramHttpParams.getParameter("http.auth.proxy-scheme-pref");
    localBuilder = localBuilder.setProxyPreferredAuthSchemes((Collection)localObject);
    localObject = (Collection)paramHttpParams.getParameter("http.auth.target-scheme-pref");
    localObject = localBuilder.setTargetPreferredAuthSchemes((Collection)localObject);
    bool3 = paramHttpParams.getBooleanParameter("http.protocol.handle-authentication", bool1);
    localObject = ((RequestConfig.Builder)localObject).setAuthenticationEnabled(bool3);
    bool3 = paramHttpParams.getBooleanParameter("http.protocol.allow-circular-redirects", false);
    localObject = ((RequestConfig.Builder)localObject).setCircularRedirectsAllowed(bool3);
    long l = paramHttpParams.getLongParameter("http.conn-manager.timeout", 0L);
    int k = (int)l;
    localBuilder = ((RequestConfig.Builder)localObject).setConnectionRequestTimeout(k);
    localObject = (String)paramHttpParams.getParameter("http.protocol.cookie-policy");
    localObject = localBuilder.setCookieSpec((String)localObject);
    int m = 50;
    k = paramHttpParams.getIntParameter("http.protocol.max-redirects", m);
    localObject = ((RequestConfig.Builder)localObject).setMaxRedirects(k);
    boolean bool4 = paramHttpParams.getBooleanParameter("http.protocol.handle-redirects", bool1);
    localBuilder = ((RequestConfig.Builder)localObject).setRedirectsEnabled(bool4);
    localObject = "http.protocol.reject-relative-redirect";
    boolean bool5 = paramHttpParams.getBooleanParameter((String)localObject, false);
    if (!bool5) {
      bool5 = bool1;
    }
    for (;;)
    {
      return localBuilder.setRelativeRedirectsAllowed(bool5).build();
      bool5 = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\client\params\HttpClientParamConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */