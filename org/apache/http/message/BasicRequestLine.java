package org.apache.http.message;

import java.io.Serializable;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class BasicRequestLine
  implements Serializable, Cloneable, RequestLine
{
  private static final long serialVersionUID = 2810581718468737193L;
  private final String method;
  private final ProtocolVersion protoversion;
  private final String uri;
  
  public BasicRequestLine(String paramString1, String paramString2, ProtocolVersion paramProtocolVersion)
  {
    Object localObject = (String)Args.notNull(paramString1, "Method");
    this.method = ((String)localObject);
    localObject = (String)Args.notNull(paramString2, "URI");
    this.uri = ((String)localObject);
    localObject = (ProtocolVersion)Args.notNull(paramProtocolVersion, "Version");
    this.protoversion = ((ProtocolVersion)localObject);
  }
  
  public Object clone()
  {
    return super.clone();
  }
  
  public String getMethod()
  {
    return this.method;
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    return this.protoversion;
  }
  
  public String getUri()
  {
    return this.uri;
  }
  
  public String toString()
  {
    return BasicLineFormatter.INSTANCE.formatRequestLine(null, this).toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\message\BasicRequestLine.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */