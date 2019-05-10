package org.apache.http.impl.io;

import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.util.CharArrayBuffer;

public class DefaultHttpRequestWriter
  extends AbstractMessageWriter
{
  public DefaultHttpRequestWriter(SessionOutputBuffer paramSessionOutputBuffer)
  {
    this(paramSessionOutputBuffer, null);
  }
  
  public DefaultHttpRequestWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter)
  {
    super(paramSessionOutputBuffer, paramLineFormatter);
  }
  
  protected void writeHeadLine(HttpRequest paramHttpRequest)
  {
    Object localObject = this.lineFormatter;
    CharArrayBuffer localCharArrayBuffer = this.lineBuf;
    RequestLine localRequestLine = paramHttpRequest.getRequestLine();
    ((LineFormatter)localObject).formatRequestLine(localCharArrayBuffer, localRequestLine);
    localObject = this.sessionBuffer;
    localCharArrayBuffer = this.lineBuf;
    ((SessionOutputBuffer)localObject).writeLine(localCharArrayBuffer);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\DefaultHttpRequestWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */