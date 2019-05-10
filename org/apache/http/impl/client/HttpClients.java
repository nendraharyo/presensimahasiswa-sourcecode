package org.apache.http.impl.client;

import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class HttpClients
{
  public static CloseableHttpClient createDefault()
  {
    return HttpClientBuilder.create().build();
  }
  
  public static CloseableHttpClient createMinimal()
  {
    MinimalHttpClient localMinimalHttpClient = new org/apache/http/impl/client/MinimalHttpClient;
    PoolingHttpClientConnectionManager localPoolingHttpClientConnectionManager = new org/apache/http/impl/conn/PoolingHttpClientConnectionManager;
    localPoolingHttpClientConnectionManager.<init>();
    localMinimalHttpClient.<init>(localPoolingHttpClientConnectionManager);
    return localMinimalHttpClient;
  }
  
  public static CloseableHttpClient createMinimal(HttpClientConnectionManager paramHttpClientConnectionManager)
  {
    MinimalHttpClient localMinimalHttpClient = new org/apache/http/impl/client/MinimalHttpClient;
    localMinimalHttpClient.<init>(paramHttpClientConnectionManager);
    return localMinimalHttpClient;
  }
  
  public static CloseableHttpClient createSystem()
  {
    return HttpClientBuilder.create().useSystemProperties().build();
  }
  
  public static HttpClientBuilder custom()
  {
    return HttpClientBuilder.create();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\HttpClients.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */