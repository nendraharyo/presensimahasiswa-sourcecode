package org.apache.http.impl.io;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.util.CharArrayBuffer;

public class DefaultHttpResponseWriter
  extends AbstractMessageWriter
{
  public DefaultHttpResponseWriter(SessionOutputBuffer paramSessionOutputBuffer)
  {
    super(paramSessionOutputBuffer, null);
  }
  
  public DefaultHttpResponseWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter)
  {
    super(paramSessionOutputBuffer, paramLineFormatter);
  }
  
  protected void writeHeadLine(HttpResponse paramHttpResponse)
  {
    Object localObject = this.lineFormatter;
    CharArrayBuffer localCharArrayBuffer = this.lineBuf;
    StatusLine localStatusLine = paramHttpResponse.getStatusLine();
    ((LineFormatter)localObject).formatStatusLine(localCharArrayBuffer, localStatusLine);
    localObject = this.sessionBuffer;
    localCharArrayBuffer = this.lineBuf;
    ((SessionOutputBuffer)localObject).writeLine(localCharArrayBuffer);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\DefaultHttpResponseWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */