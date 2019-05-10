package org.apache.http.impl.io;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

public class HttpResponseWriter
  extends AbstractMessageWriter
{
  public HttpResponseWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter, HttpParams paramHttpParams)
  {
    super(paramSessionOutputBuffer, paramLineFormatter, paramHttpParams);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\HttpResponseWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */