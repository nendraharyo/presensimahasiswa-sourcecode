package org.apache.http.message;

import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.util.Args;

public class BasicHttpRequest
  extends AbstractHttpMessage
  implements HttpRequest
{
  private final String method;
  private RequestLine requestline;
  private final String uri;
  
  public BasicHttpRequest(String paramString1, String paramString2)
  {
    String str = (String)Args.notNull(paramString1, "Method name");
    this.method = str;
    str = (String)Args.notNull(paramString2, "Request URI");
    this.uri = str;
    this.requestline = null;
  }
  
  public BasicHttpRequest(String paramString1, String paramString2, ProtocolVersion paramProtocolVersion)
  {
    this(localBasicRequestLine);
  }
  
  public BasicHttpRequest(RequestLine paramRequestLine)
  {
    Object localObject = (RequestLine)Args.notNull(paramRequestLine, "Request line");
    this.requestline = ((RequestLine)localObject);
    localObject = paramRequestLine.getMethod();
    this.method = ((String)localObject);
    localObject = paramRequestLine.getUri();
    this.uri = ((String)localObject);
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    return getRequestLine().getProtocolVersion();
  }
  
  public RequestLine getRequestLine()
  {
    Object localObject = this.requestline;
    if (localObject == null)
    {
      localObject = new org/apache/http/message/BasicRequestLine;
      String str1 = this.method;
      String str2 = this.uri;
      HttpVersion localHttpVersion = HttpVersion.HTTP_1_1;
      ((BasicRequestLine)localObject).<init>(str1, str2, localHttpVersion);
      this.requestline = ((RequestLine)localObject);
    }
    return this.requestline;
  }
  
  public String toString()
  {
    char c = ' ';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.method;
    localStringBuilder = localStringBuilder.append((String)localObject).append(c);
    localObject = this.uri;
    localStringBuilder = localStringBuilder.append((String)localObject).append(c);
    localObject = this.headergroup;
    return (String)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicHttpRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */