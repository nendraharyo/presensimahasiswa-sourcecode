package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

public abstract class AbstractHttpMessage
  implements HttpMessage
{
  protected HeaderGroup headergroup;
  protected HttpParams params;
  
  protected AbstractHttpMessage()
  {
    this(null);
  }
  
  protected AbstractHttpMessage(HttpParams paramHttpParams)
  {
    HeaderGroup localHeaderGroup = new org/apache/http/message/HeaderGroup;
    localHeaderGroup.<init>();
    this.headergroup = localHeaderGroup;
    this.params = paramHttpParams;
  }
  
  public void addHeader(String paramString1, String paramString2)
  {
    Args.notNull(paramString1, "Header name");
    HeaderGroup localHeaderGroup = this.headergroup;
    BasicHeader localBasicHeader = new org/apache/http/message/BasicHeader;
    localBasicHeader.<init>(paramString1, paramString2);
    localHeaderGroup.addHeader(localBasicHeader);
  }
  
  public void addHeader(Header paramHeader)
  {
    this.headergroup.addHeader(paramHeader);
  }
  
  public boolean containsHeader(String paramString)
  {
    return this.headergroup.containsHeader(paramString);
  }
  
  public Header[] getAllHeaders()
  {
    return this.headergroup.getAllHeaders();
  }
  
  public Header getFirstHeader(String paramString)
  {
    return this.headergroup.getFirstHeader(paramString);
  }
  
  public Header[] getHeaders(String paramString)
  {
    return this.headergroup.getHeaders(paramString);
  }
  
  public Header getLastHeader(String paramString)
  {
    return this.headergroup.getLastHeader(paramString);
  }
  
  public HttpParams getParams()
  {
    Object localObject = this.params;
    if (localObject == null)
    {
      localObject = new org/apache/http/params/BasicHttpParams;
      ((BasicHttpParams)localObject).<init>();
      this.params = ((HttpParams)localObject);
    }
    return this.params;
  }
  
  public HeaderIterator headerIterator()
  {
    return this.headergroup.iterator();
  }
  
  public HeaderIterator headerIterator(String paramString)
  {
    return this.headergroup.iterator(paramString);
  }
  
  public void removeHeader(Header paramHeader)
  {
    this.headergroup.removeHeader(paramHeader);
  }
  
  public void removeHeaders(String paramString)
  {
    if (paramString == null) {
      return;
    }
    HeaderIterator localHeaderIterator = this.headergroup.iterator();
    for (;;)
    {
      boolean bool = localHeaderIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = localHeaderIterator.nextHeader().getName();
      bool = paramString.equalsIgnoreCase(str);
      if (bool) {
        localHeaderIterator.remove();
      }
    }
  }
  
  public void setHeader(String paramString1, String paramString2)
  {
    Args.notNull(paramString1, "Header name");
    HeaderGroup localHeaderGroup = this.headergroup;
    BasicHeader localBasicHeader = new org/apache/http/message/BasicHeader;
    localBasicHeader.<init>(paramString1, paramString2);
    localHeaderGroup.updateHeader(localBasicHeader);
  }
  
  public void setHeader(Header paramHeader)
  {
    this.headergroup.updateHeader(paramHeader);
  }
  
  public void setHeaders(Header[] paramArrayOfHeader)
  {
    this.headergroup.setHeaders(paramArrayOfHeader);
  }
  
  public void setParams(HttpParams paramHttpParams)
  {
    HttpParams localHttpParams = (HttpParams)Args.notNull(paramHttpParams, "HTTP parameters");
    this.params = localHttpParams;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\AbstractHttpMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */