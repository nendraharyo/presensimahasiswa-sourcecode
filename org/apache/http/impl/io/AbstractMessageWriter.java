package org.apache.http.impl.io;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractMessageWriter
  implements HttpMessageWriter
{
  protected final CharArrayBuffer lineBuf;
  protected final LineFormatter lineFormatter;
  protected final SessionOutputBuffer sessionBuffer;
  
  public AbstractMessageWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter)
  {
    Object localObject = (SessionOutputBuffer)Args.notNull(paramSessionOutputBuffer, "Session input buffer");
    this.sessionBuffer = ((SessionOutputBuffer)localObject);
    if (paramLineFormatter != null) {}
    for (;;)
    {
      this.lineFormatter = paramLineFormatter;
      localObject = new org/apache/http/util/CharArrayBuffer;
      ((CharArrayBuffer)localObject).<init>(128);
      this.lineBuf = ((CharArrayBuffer)localObject);
      return;
      paramLineFormatter = BasicLineFormatter.INSTANCE;
    }
  }
  
  public AbstractMessageWriter(SessionOutputBuffer paramSessionOutputBuffer, LineFormatter paramLineFormatter, HttpParams paramHttpParams)
  {
    Args.notNull(paramSessionOutputBuffer, "Session input buffer");
    this.sessionBuffer = paramSessionOutputBuffer;
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = 128;
    localCharArrayBuffer.<init>(i);
    this.lineBuf = localCharArrayBuffer;
    if (paramLineFormatter != null) {}
    for (;;)
    {
      this.lineFormatter = paramLineFormatter;
      return;
      paramLineFormatter = BasicLineFormatter.INSTANCE;
    }
  }
  
  public void write(HttpMessage paramHttpMessage)
  {
    Args.notNull(paramHttpMessage, "HTTP message");
    writeHeadLine(paramHttpMessage);
    Object localObject1 = paramHttpMessage.headerIterator();
    for (;;)
    {
      boolean bool = ((HeaderIterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = ((HeaderIterator)localObject1).nextHeader();
      SessionOutputBuffer localSessionOutputBuffer = this.sessionBuffer;
      LineFormatter localLineFormatter = this.lineFormatter;
      CharArrayBuffer localCharArrayBuffer = this.lineBuf;
      localObject2 = localLineFormatter.formatHeader(localCharArrayBuffer, (Header)localObject2);
      localSessionOutputBuffer.writeLine((CharArrayBuffer)localObject2);
    }
    this.lineBuf.clear();
    localObject1 = this.sessionBuffer;
    Object localObject2 = this.lineBuf;
    ((SessionOutputBuffer)localObject1).writeLine((CharArrayBuffer)localObject2);
  }
  
  protected abstract void writeHeadLine(HttpMessage paramHttpMessage);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\AbstractMessageWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */