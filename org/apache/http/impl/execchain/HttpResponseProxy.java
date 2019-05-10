package org.apache.http.impl.execchain;

import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.params.HttpParams;

class HttpResponseProxy
  implements CloseableHttpResponse
{
  private final ConnectionHolder connHolder;
  private final HttpResponse original;
  
  public HttpResponseProxy(HttpResponse paramHttpResponse, ConnectionHolder paramConnectionHolder)
  {
    this.original = paramHttpResponse;
    this.connHolder = paramConnectionHolder;
    ResponseEntityProxy.enchance(paramHttpResponse, paramConnectionHolder);
  }
  
  public void addHeader(String paramString1, String paramString2)
  {
    this.original.addHeader(paramString1, paramString2);
  }
  
  public void addHeader(Header paramHeader)
  {
    this.original.addHeader(paramHeader);
  }
  
  public void close()
  {
    ConnectionHolder localConnectionHolder = this.connHolder;
    if (localConnectionHolder != null)
    {
      localConnectionHolder = this.connHolder;
      localConnectionHolder.abortConnection();
    }
  }
  
  public boolean containsHeader(String paramString)
  {
    return this.original.containsHeader(paramString);
  }
  
  public Header[] getAllHeaders()
  {
    return this.original.getAllHeaders();
  }
  
  public HttpEntity getEntity()
  {
    return this.original.getEntity();
  }
  
  public Header getFirstHeader(String paramString)
  {
    return this.original.getFirstHeader(paramString);
  }
  
  public Header[] getHeaders(String paramString)
  {
    return this.original.getHeaders(paramString);
  }
  
  public Header getLastHeader(String paramString)
  {
    return this.original.getLastHeader(paramString);
  }
  
  public Locale getLocale()
  {
    return this.original.getLocale();
  }
  
  public HttpParams getParams()
  {
    return this.original.getParams();
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    return this.original.getProtocolVersion();
  }
  
  public StatusLine getStatusLine()
  {
    return this.original.getStatusLine();
  }
  
  public HeaderIterator headerIterator()
  {
    return this.original.headerIterator();
  }
  
  public HeaderIterator headerIterator(String paramString)
  {
    return this.original.headerIterator(paramString);
  }
  
  public void removeHeader(Header paramHeader)
  {
    this.original.removeHeader(paramHeader);
  }
  
  public void removeHeaders(String paramString)
  {
    this.original.removeHeaders(paramString);
  }
  
  public void setEntity(HttpEntity paramHttpEntity)
  {
    this.original.setEntity(paramHttpEntity);
  }
  
  public void setHeader(String paramString1, String paramString2)
  {
    this.original.setHeader(paramString1, paramString2);
  }
  
  public void setHeader(Header paramHeader)
  {
    this.original.setHeader(paramHeader);
  }
  
  public void setHeaders(Header[] paramArrayOfHeader)
  {
    this.original.setHeaders(paramArrayOfHeader);
  }
  
  public void setLocale(Locale paramLocale)
  {
    this.original.setLocale(paramLocale);
  }
  
  public void setParams(HttpParams paramHttpParams)
  {
    this.original.setParams(paramHttpParams);
  }
  
  public void setReasonPhrase(String paramString)
  {
    this.original.setReasonPhrase(paramString);
  }
  
  public void setStatusCode(int paramInt)
  {
    this.original.setStatusCode(paramInt);
  }
  
  public void setStatusLine(ProtocolVersion paramProtocolVersion, int paramInt)
  {
    this.original.setStatusLine(paramProtocolVersion, paramInt);
  }
  
  public void setStatusLine(ProtocolVersion paramProtocolVersion, int paramInt, String paramString)
  {
    this.original.setStatusLine(paramProtocolVersion, paramInt, paramString);
  }
  
  public void setStatusLine(StatusLine paramStatusLine)
  {
    this.original.setStatusLine(paramStatusLine);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("HttpResponseProxy{");
    HttpResponse localHttpResponse = this.original;
    localStringBuilder.append(localHttpResponse);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\execchain\HttpResponseProxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */