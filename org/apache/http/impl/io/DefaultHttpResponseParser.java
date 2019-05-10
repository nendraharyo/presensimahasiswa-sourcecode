package org.apache.http.impl.io;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.StatusLine;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpResponseFactory;
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
    if (paramHttpResponseFactory != null) {}
    for (;;)
    {
      this.responseFactory = paramHttpResponseFactory;
      CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
      localCharArrayBuffer.<init>(128);
      this.lineBuf = localCharArrayBuffer;
      return;
      paramHttpResponseFactory = DefaultHttpResponseFactory.INSTANCE;
    }
  }
  
  public DefaultHttpResponseParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpResponseFactory paramHttpResponseFactory, HttpParams paramHttpParams)
  {
    super(paramSessionInputBuffer, paramLineParser, paramHttpParams);
    Object localObject = (HttpResponseFactory)Args.notNull(paramHttpResponseFactory, "Response factory");
    this.responseFactory = ((HttpResponseFactory)localObject);
    localObject = new org/apache/http/util/CharArrayBuffer;
    ((CharArrayBuffer)localObject).<init>(128);
    this.lineBuf = ((CharArrayBuffer)localObject);
  }
  
  protected HttpResponse parseHead(SessionInputBuffer paramSessionInputBuffer)
  {
    this.lineBuf.clear();
    Object localObject = this.lineBuf;
    int i = paramSessionInputBuffer.readLine((CharArrayBuffer)localObject);
    int j = -1;
    if (i == j)
    {
      localObject = new org/apache/http/NoHttpResponseException;
      ((NoHttpResponseException)localObject).<init>("The target server failed to respond");
      throw ((Throwable)localObject);
    }
    localObject = new org/apache/http/message/ParserCursor;
    int k = this.lineBuf.length();
    ((ParserCursor)localObject).<init>(0, k);
    LineParser localLineParser = this.lineParser;
    CharArrayBuffer localCharArrayBuffer = this.lineBuf;
    localObject = localLineParser.parseStatusLine(localCharArrayBuffer, (ParserCursor)localObject);
    return this.responseFactory.newHttpResponse((StatusLine)localObject, null);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\DefaultHttpResponseParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */