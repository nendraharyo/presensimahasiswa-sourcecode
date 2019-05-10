package org.apache.http.impl;

import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

public class DefaultHttpResponseFactory
  implements HttpResponseFactory
{
  public static final DefaultHttpResponseFactory INSTANCE;
  protected final ReasonPhraseCatalog reasonCatalog;
  
  static
  {
    DefaultHttpResponseFactory localDefaultHttpResponseFactory = new org/apache/http/impl/DefaultHttpResponseFactory;
    localDefaultHttpResponseFactory.<init>();
    INSTANCE = localDefaultHttpResponseFactory;
  }
  
  public DefaultHttpResponseFactory()
  {
    this(localEnglishReasonPhraseCatalog);
  }
  
  public DefaultHttpResponseFactory(ReasonPhraseCatalog paramReasonPhraseCatalog)
  {
    ReasonPhraseCatalog localReasonPhraseCatalog = (ReasonPhraseCatalog)Args.notNull(paramReasonPhraseCatalog, "Reason phrase catalog");
    this.reasonCatalog = localReasonPhraseCatalog;
  }
  
  protected Locale determineLocale(HttpContext paramHttpContext)
  {
    return Locale.getDefault();
  }
  
  public HttpResponse newHttpResponse(ProtocolVersion paramProtocolVersion, int paramInt, HttpContext paramHttpContext)
  {
    Args.notNull(paramProtocolVersion, "HTTP version");
    Locale localLocale = determineLocale(paramHttpContext);
    Object localObject = this.reasonCatalog.getReason(paramInt, localLocale);
    BasicStatusLine localBasicStatusLine = new org/apache/http/message/BasicStatusLine;
    localBasicStatusLine.<init>(paramProtocolVersion, paramInt, (String)localObject);
    localObject = new org/apache/http/message/BasicHttpResponse;
    ReasonPhraseCatalog localReasonPhraseCatalog = this.reasonCatalog;
    ((BasicHttpResponse)localObject).<init>(localBasicStatusLine, localReasonPhraseCatalog, localLocale);
    return (HttpResponse)localObject;
  }
  
  public HttpResponse newHttpResponse(StatusLine paramStatusLine, HttpContext paramHttpContext)
  {
    Args.notNull(paramStatusLine, "Status line");
    BasicHttpResponse localBasicHttpResponse = new org/apache/http/message/BasicHttpResponse;
    ReasonPhraseCatalog localReasonPhraseCatalog = this.reasonCatalog;
    Locale localLocale = determineLocale(paramHttpContext);
    localBasicHttpResponse.<init>(paramStatusLine, localReasonPhraseCatalog, localLocale);
    return localBasicHttpResponse;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\DefaultHttpResponseFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */