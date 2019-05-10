package org.apache.http.message;

import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.util.Args;

public class BasicHttpResponse
  extends AbstractHttpMessage
  implements HttpResponse
{
  private int code;
  private HttpEntity entity;
  private Locale locale;
  private final ReasonPhraseCatalog reasonCatalog;
  private String reasonPhrase;
  private StatusLine statusline;
  private ProtocolVersion ver;
  
  public BasicHttpResponse(ProtocolVersion paramProtocolVersion, int paramInt, String paramString)
  {
    Args.notNegative(paramInt, "Status code");
    this.statusline = null;
    this.ver = paramProtocolVersion;
    this.code = paramInt;
    this.reasonPhrase = paramString;
    this.reasonCatalog = null;
    this.locale = null;
  }
  
  public BasicHttpResponse(StatusLine paramStatusLine)
  {
    Object localObject = (StatusLine)Args.notNull(paramStatusLine, "Status line");
    this.statusline = ((StatusLine)localObject);
    localObject = paramStatusLine.getProtocolVersion();
    this.ver = ((ProtocolVersion)localObject);
    int i = paramStatusLine.getStatusCode();
    this.code = i;
    localObject = paramStatusLine.getReasonPhrase();
    this.reasonPhrase = ((String)localObject);
    this.reasonCatalog = null;
    this.locale = null;
  }
  
  public BasicHttpResponse(StatusLine paramStatusLine, ReasonPhraseCatalog paramReasonPhraseCatalog, Locale paramLocale)
  {
    Object localObject = (StatusLine)Args.notNull(paramStatusLine, "Status line");
    this.statusline = ((StatusLine)localObject);
    localObject = paramStatusLine.getProtocolVersion();
    this.ver = ((ProtocolVersion)localObject);
    int i = paramStatusLine.getStatusCode();
    this.code = i;
    localObject = paramStatusLine.getReasonPhrase();
    this.reasonPhrase = ((String)localObject);
    this.reasonCatalog = paramReasonPhraseCatalog;
    this.locale = paramLocale;
  }
  
  public HttpEntity getEntity()
  {
    return this.entity;
  }
  
  public Locale getLocale()
  {
    return this.locale;
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    return this.ver;
  }
  
  protected String getReason(int paramInt)
  {
    Object localObject = this.reasonCatalog;
    ReasonPhraseCatalog localReasonPhraseCatalog;
    if (localObject != null)
    {
      localReasonPhraseCatalog = this.reasonCatalog;
      localObject = this.locale;
      if (localObject != null) {
        localObject = this.locale;
      }
    }
    for (localObject = localReasonPhraseCatalog.getReason(paramInt, (Locale)localObject);; localObject = null)
    {
      return (String)localObject;
      localObject = Locale.getDefault();
      break;
    }
  }
  
  public StatusLine getStatusLine()
  {
    Object localObject = this.statusline;
    BasicStatusLine localBasicStatusLine;
    int i;
    if (localObject == null)
    {
      localBasicStatusLine = new org/apache/http/message/BasicStatusLine;
      localObject = this.ver;
      if (localObject == null) {
        break label67;
      }
      localObject = this.ver;
      i = this.code;
      str = this.reasonPhrase;
      if (str == null) {
        break label74;
      }
    }
    label67:
    label74:
    int j;
    for (String str = this.reasonPhrase;; str = getReason(j))
    {
      localBasicStatusLine.<init>((ProtocolVersion)localObject, i, str);
      this.statusline = localBasicStatusLine;
      return this.statusline;
      localObject = HttpVersion.HTTP_1_1;
      break;
      j = this.code;
    }
  }
  
  public void setEntity(HttpEntity paramHttpEntity)
  {
    this.entity = paramHttpEntity;
  }
  
  public void setLocale(Locale paramLocale)
  {
    Locale localLocale = (Locale)Args.notNull(paramLocale, "Locale");
    this.locale = localLocale;
    this.statusline = null;
  }
  
  public void setReasonPhrase(String paramString)
  {
    this.statusline = null;
    this.reasonPhrase = paramString;
  }
  
  public void setStatusCode(int paramInt)
  {
    Args.notNegative(paramInt, "Status code");
    this.statusline = null;
    this.code = paramInt;
    this.reasonPhrase = null;
  }
  
  public void setStatusLine(ProtocolVersion paramProtocolVersion, int paramInt)
  {
    Args.notNegative(paramInt, "Status code");
    this.statusline = null;
    this.ver = paramProtocolVersion;
    this.code = paramInt;
    this.reasonPhrase = null;
  }
  
  public void setStatusLine(ProtocolVersion paramProtocolVersion, int paramInt, String paramString)
  {
    Args.notNegative(paramInt, "Status code");
    this.statusline = null;
    this.ver = paramProtocolVersion;
    this.code = paramInt;
    this.reasonPhrase = paramString;
  }
  
  public void setStatusLine(StatusLine paramStatusLine)
  {
    Object localObject = (StatusLine)Args.notNull(paramStatusLine, "Status line");
    this.statusline = ((StatusLine)localObject);
    localObject = paramStatusLine.getProtocolVersion();
    this.ver = ((ProtocolVersion)localObject);
    int i = paramStatusLine.getStatusCode();
    this.code = i;
    localObject = paramStatusLine.getReasonPhrase();
    this.reasonPhrase = ((String)localObject);
  }
  
  public String toString()
  {
    char c = ' ';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = getStatusLine();
    localStringBuilder.append(localObject);
    localStringBuilder.append(c);
    localObject = this.headergroup;
    localStringBuilder.append(localObject);
    localObject = this.entity;
    if (localObject != null)
    {
      localStringBuilder.append(c);
      localObject = this.entity;
      localStringBuilder.append(localObject);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicHttpResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */