package org.apache.http.message;

import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class BasicLineFormatter
  implements LineFormatter
{
  public static final BasicLineFormatter DEFAULT;
  public static final BasicLineFormatter INSTANCE;
  
  static
  {
    BasicLineFormatter localBasicLineFormatter = new org/apache/http/message/BasicLineFormatter;
    localBasicLineFormatter.<init>();
    DEFAULT = localBasicLineFormatter;
    localBasicLineFormatter = new org/apache/http/message/BasicLineFormatter;
    localBasicLineFormatter.<init>();
    INSTANCE = localBasicLineFormatter;
  }
  
  public static String formatHeader(Header paramHeader, LineFormatter paramLineFormatter)
  {
    if (paramLineFormatter != null) {}
    for (;;)
    {
      return paramLineFormatter.formatHeader(null, paramHeader).toString();
      paramLineFormatter = INSTANCE;
    }
  }
  
  public static String formatProtocolVersion(ProtocolVersion paramProtocolVersion, LineFormatter paramLineFormatter)
  {
    if (paramLineFormatter != null) {}
    for (;;)
    {
      return paramLineFormatter.appendProtocolVersion(null, paramProtocolVersion).toString();
      paramLineFormatter = INSTANCE;
    }
  }
  
  public static String formatRequestLine(RequestLine paramRequestLine, LineFormatter paramLineFormatter)
  {
    if (paramLineFormatter != null) {}
    for (;;)
    {
      return paramLineFormatter.formatRequestLine(null, paramRequestLine).toString();
      paramLineFormatter = INSTANCE;
    }
  }
  
  public static String formatStatusLine(StatusLine paramStatusLine, LineFormatter paramLineFormatter)
  {
    if (paramLineFormatter != null) {}
    for (;;)
    {
      return paramLineFormatter.formatStatusLine(null, paramStatusLine).toString();
      paramLineFormatter = INSTANCE;
    }
  }
  
  public CharArrayBuffer appendProtocolVersion(CharArrayBuffer paramCharArrayBuffer, ProtocolVersion paramProtocolVersion)
  {
    String str = "Protocol version";
    Args.notNull(paramProtocolVersion, str);
    int i = estimateProtocolVersionLen(paramProtocolVersion);
    if (paramCharArrayBuffer == null)
    {
      paramCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
      paramCharArrayBuffer.<init>(i);
    }
    for (;;)
    {
      str = paramProtocolVersion.getProtocol();
      paramCharArrayBuffer.append(str);
      paramCharArrayBuffer.append('/');
      str = Integer.toString(paramProtocolVersion.getMajor());
      paramCharArrayBuffer.append(str);
      paramCharArrayBuffer.append('.');
      str = Integer.toString(paramProtocolVersion.getMinor());
      paramCharArrayBuffer.append(str);
      return paramCharArrayBuffer;
      paramCharArrayBuffer.ensureCapacity(i);
    }
  }
  
  protected void doFormatHeader(CharArrayBuffer paramCharArrayBuffer, Header paramHeader)
  {
    String str1 = paramHeader.getName();
    String str2 = paramHeader.getValue();
    int i = str1.length() + 2;
    if (str2 != null)
    {
      int j = str2.length();
      i += j;
    }
    paramCharArrayBuffer.ensureCapacity(i);
    paramCharArrayBuffer.append(str1);
    String str3 = ": ";
    paramCharArrayBuffer.append(str3);
    if (str2 != null) {
      paramCharArrayBuffer.append(str2);
    }
  }
  
  protected void doFormatRequestLine(CharArrayBuffer paramCharArrayBuffer, RequestLine paramRequestLine)
  {
    char c = ' ';
    Object localObject = paramRequestLine.getMethod();
    String str = paramRequestLine.getUri();
    int i = ((String)localObject).length() + 1;
    int j = str.length();
    i = i + j + 1;
    ProtocolVersion localProtocolVersion = paramRequestLine.getProtocolVersion();
    j = estimateProtocolVersionLen(localProtocolVersion);
    i += j;
    paramCharArrayBuffer.ensureCapacity(i);
    paramCharArrayBuffer.append((String)localObject);
    paramCharArrayBuffer.append(c);
    paramCharArrayBuffer.append(str);
    paramCharArrayBuffer.append(c);
    localObject = paramRequestLine.getProtocolVersion();
    appendProtocolVersion(paramCharArrayBuffer, (ProtocolVersion)localObject);
  }
  
  protected void doFormatStatusLine(CharArrayBuffer paramCharArrayBuffer, StatusLine paramStatusLine)
  {
    char c = ' ';
    Object localObject = paramStatusLine.getProtocolVersion();
    int i = estimateProtocolVersionLen((ProtocolVersion)localObject) + 1 + 3 + 1;
    String str = paramStatusLine.getReasonPhrase();
    if (str != null)
    {
      int j = str.length();
      i += j;
    }
    paramCharArrayBuffer.ensureCapacity(i);
    localObject = paramStatusLine.getProtocolVersion();
    appendProtocolVersion(paramCharArrayBuffer, (ProtocolVersion)localObject);
    paramCharArrayBuffer.append(c);
    i = paramStatusLine.getStatusCode();
    localObject = Integer.toString(i);
    paramCharArrayBuffer.append((String)localObject);
    paramCharArrayBuffer.append(c);
    if (str != null) {
      paramCharArrayBuffer.append(str);
    }
  }
  
  protected int estimateProtocolVersionLen(ProtocolVersion paramProtocolVersion)
  {
    return paramProtocolVersion.getProtocol().length() + 4;
  }
  
  public CharArrayBuffer formatHeader(CharArrayBuffer paramCharArrayBuffer, Header paramHeader)
  {
    Object localObject = "Header";
    Args.notNull(paramHeader, (String)localObject);
    boolean bool = paramHeader instanceof FormattedHeader;
    if (bool)
    {
      paramHeader = (FormattedHeader)paramHeader;
      localObject = paramHeader.getBuffer();
    }
    for (;;)
    {
      return (CharArrayBuffer)localObject;
      localObject = initBuffer(paramCharArrayBuffer);
      doFormatHeader((CharArrayBuffer)localObject, paramHeader);
    }
  }
  
  public CharArrayBuffer formatRequestLine(CharArrayBuffer paramCharArrayBuffer, RequestLine paramRequestLine)
  {
    Args.notNull(paramRequestLine, "Request line");
    CharArrayBuffer localCharArrayBuffer = initBuffer(paramCharArrayBuffer);
    doFormatRequestLine(localCharArrayBuffer, paramRequestLine);
    return localCharArrayBuffer;
  }
  
  public CharArrayBuffer formatStatusLine(CharArrayBuffer paramCharArrayBuffer, StatusLine paramStatusLine)
  {
    Args.notNull(paramStatusLine, "Status line");
    CharArrayBuffer localCharArrayBuffer = initBuffer(paramCharArrayBuffer);
    doFormatStatusLine(localCharArrayBuffer, paramStatusLine);
    return localCharArrayBuffer;
  }
  
  protected CharArrayBuffer initBuffer(CharArrayBuffer paramCharArrayBuffer)
  {
    if (paramCharArrayBuffer != null) {
      paramCharArrayBuffer.clear();
    }
    for (;;)
    {
      return paramCharArrayBuffer;
      paramCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
      int i = 64;
      paramCharArrayBuffer.<init>(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicLineFormatter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */