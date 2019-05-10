package org.apache.http.params;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;

public final class HttpProtocolParams
  implements CoreProtocolPNames
{
  public static String getContentCharset(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    String str = (String)paramHttpParams.getParameter("http.protocol.content-charset");
    if (str == null) {
      str = HTTP.DEF_CONTENT_CHARSET.name();
    }
    return str;
  }
  
  public static String getHttpElementCharset(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    String str = (String)paramHttpParams.getParameter("http.protocol.element-charset");
    if (str == null) {
      str = HTTP.DEF_PROTOCOL_CHARSET.name();
    }
    return str;
  }
  
  public static CodingErrorAction getMalformedInputAction(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    Object localObject = paramHttpParams.getParameter("http.malformed.input.action");
    if (localObject == null) {}
    for (localObject = CodingErrorAction.REPORT;; localObject = (CodingErrorAction)localObject) {
      return (CodingErrorAction)localObject;
    }
  }
  
  public static CodingErrorAction getUnmappableInputAction(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    Object localObject = paramHttpParams.getParameter("http.unmappable.input.action");
    if (localObject == null) {}
    for (localObject = CodingErrorAction.REPORT;; localObject = (CodingErrorAction)localObject) {
      return (CodingErrorAction)localObject;
    }
  }
  
  public static String getUserAgent(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    return (String)paramHttpParams.getParameter("http.useragent");
  }
  
  public static ProtocolVersion getVersion(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    Object localObject = paramHttpParams.getParameter("http.protocol.version");
    if (localObject == null) {}
    for (localObject = HttpVersion.HTTP_1_1;; localObject = (ProtocolVersion)localObject) {
      return (ProtocolVersion)localObject;
    }
  }
  
  public static void setContentCharset(HttpParams paramHttpParams, String paramString)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    paramHttpParams.setParameter("http.protocol.content-charset", paramString);
  }
  
  public static void setHttpElementCharset(HttpParams paramHttpParams, String paramString)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    paramHttpParams.setParameter("http.protocol.element-charset", paramString);
  }
  
  public static void setMalformedInputAction(HttpParams paramHttpParams, CodingErrorAction paramCodingErrorAction)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    paramHttpParams.setParameter("http.malformed.input.action", paramCodingErrorAction);
  }
  
  public static void setUnmappableInputAction(HttpParams paramHttpParams, CodingErrorAction paramCodingErrorAction)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    paramHttpParams.setParameter("http.unmappable.input.action", paramCodingErrorAction);
  }
  
  public static void setUseExpectContinue(HttpParams paramHttpParams, boolean paramBoolean)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    paramHttpParams.setBooleanParameter("http.protocol.expect-continue", paramBoolean);
  }
  
  public static void setUserAgent(HttpParams paramHttpParams, String paramString)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    paramHttpParams.setParameter("http.useragent", paramString);
  }
  
  public static void setVersion(HttpParams paramHttpParams, ProtocolVersion paramProtocolVersion)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    paramHttpParams.setParameter("http.protocol.version", paramProtocolVersion);
  }
  
  public static boolean useExpectContinue(HttpParams paramHttpParams)
  {
    Args.notNull(paramHttpParams, "HTTP parameters");
    return paramHttpParams.getBooleanParameter("http.protocol.expect-continue", false);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\params\HttpProtocolParams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */