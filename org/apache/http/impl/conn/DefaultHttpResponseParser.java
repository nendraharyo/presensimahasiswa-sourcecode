package org.apache.http.impl.conn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.StatusLine;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.impl.io.AbstractMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class DefaultHttpResponseParser
  extends AbstractMessageParser
{
  private final CharArrayBuffer lineBuf;
  private final Log log;
  private final HttpResponseFactory responseFactory;
  
  public DefaultHttpResponseParser(SessionInputBuffer paramSessionInputBuffer)
  {
    this(paramSessionInputBuffer, null, null, localMessageConstraints);
  }
  
  public DefaultHttpResponseParser(SessionInputBuffer paramSessionInputBuffer, MessageConstraints paramMessageConstraints)
  {
    this(paramSessionInputBuffer, null, null, paramMessageConstraints);
  }
  
  public DefaultHttpResponseParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpResponseFactory paramHttpResponseFactory, MessageConstraints paramMessageConstraints)
  {
    super(paramSessionInputBuffer, paramLineParser, paramMessageConstraints);
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    if (paramHttpResponseFactory != null) {}
    for (;;)
    {
      this.responseFactory = paramHttpResponseFactory;
      localObject = new org/apache/http/util/CharArrayBuffer;
      ((CharArrayBuffer)localObject).<init>(128);
      this.lineBuf = ((CharArrayBuffer)localObject);
      return;
      paramHttpResponseFactory = DefaultHttpResponseFactory.INSTANCE;
    }
  }
  
  public DefaultHttpResponseParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpResponseFactory paramHttpResponseFactory, HttpParams paramHttpParams)
  {
    super(paramSessionInputBuffer, paramLineParser, paramHttpParams);
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    Args.notNull(paramHttpResponseFactory, "Response factory");
    this.responseFactory = paramHttpResponseFactory;
    localObject = new org/apache/http/util/CharArrayBuffer;
    ((CharArrayBuffer)localObject).<init>(128);
    this.lineBuf = ((CharArrayBuffer)localObject);
  }
  
  protected HttpResponse parseHead(SessionInputBuffer paramSessionInputBuffer)
  {
    CharArrayBuffer localCharArrayBuffer1 = null;
    int i = -1;
    int j = 0;
    Object localObject1 = null;
    for (;;)
    {
      this.lineBuf.clear();
      Object localObject2 = this.lineBuf;
      int k = paramSessionInputBuffer.readLine((CharArrayBuffer)localObject2);
      if ((k == i) && (j == 0))
      {
        localObject1 = new org/apache/http/NoHttpResponseException;
        ((NoHttpResponseException)localObject1).<init>("The target server failed to respond");
        throw ((Throwable)localObject1);
      }
      Object localObject3 = new org/apache/http/message/ParserCursor;
      int m = this.lineBuf.length();
      ((ParserCursor)localObject3).<init>(0, m);
      Object localObject4 = this.lineParser;
      CharArrayBuffer localCharArrayBuffer2 = this.lineBuf;
      boolean bool2 = ((LineParser)localObject4).hasProtocolVersion(localCharArrayBuffer2, (ParserCursor)localObject3);
      if (bool2)
      {
        localObject1 = this.lineParser;
        localCharArrayBuffer1 = this.lineBuf;
        localObject1 = ((LineParser)localObject1).parseStatusLine(localCharArrayBuffer1, (ParserCursor)localObject3);
        return this.responseFactory.newHttpResponse((StatusLine)localObject1, null);
      }
      if (k != i)
      {
        localObject2 = this.lineBuf;
        bool1 = reject((CharArrayBuffer)localObject2, j);
        if (!bool1) {}
      }
      else
      {
        localObject1 = new org/apache/http/ProtocolException;
        ((ProtocolException)localObject1).<init>("The server failed to respond with a valid HTTP response");
        throw ((Throwable)localObject1);
      }
      localObject2 = this.log;
      boolean bool1 = ((Log)localObject2).isDebugEnabled();
      if (bool1)
      {
        localObject2 = this.log;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Garbage in response: ");
        localObject4 = this.lineBuf.toString();
        localObject3 = (String)localObject4;
        ((Log)localObject2).debug(localObject3);
      }
      j += 1;
    }
  }
  
  protected boolean reject(CharArrayBuffer paramCharArrayBuffer, int paramInt)
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\DefaultHttpResponseParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */