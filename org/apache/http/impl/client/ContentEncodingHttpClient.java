package org.apache.http.impl.client;

import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.client.protocol.RequestAcceptEncoding;
import org.apache.http.client.protocol.ResponseContentEncoding;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpProcessor;

public class ContentEncodingHttpClient
  extends DefaultHttpClient
{
  public ContentEncodingHttpClient()
  {
    this(null);
  }
  
  public ContentEncodingHttpClient(ClientConnectionManager paramClientConnectionManager, HttpParams paramHttpParams)
  {
    super(paramClientConnectionManager, paramHttpParams);
  }
  
  public ContentEncodingHttpClient(HttpParams paramHttpParams)
  {
    this(null, paramHttpParams);
  }
  
  protected BasicHttpProcessor createHttpProcessor()
  {
    BasicHttpProcessor localBasicHttpProcessor = super.createHttpProcessor();
    Object localObject = new org/apache/http/client/protocol/RequestAcceptEncoding;
    ((RequestAcceptEncoding)localObject).<init>();
    localBasicHttpProcessor.addRequestInterceptor((HttpRequestInterceptor)localObject);
    localObject = new org/apache/http/client/protocol/ResponseContentEncoding;
    ((ResponseContentEncoding)localObject).<init>();
    localBasicHttpProcessor.addResponseInterceptor((HttpResponseInterceptor)localObject);
    return localBasicHttpProcessor;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\ContentEncodingHttpClient.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */