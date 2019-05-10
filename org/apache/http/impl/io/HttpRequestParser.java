package org.apache.http.impl.io;

import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequestFactory;
import org.apache.http.RequestLine;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

public class HttpRequestParser
  extends AbstractMessageParser
{
  private final CharArrayBuffer lineBuf;
  private final HttpRequestFactory requestFactory;
  
  public HttpRequestParser(SessionInputBuffer paramSessionInputBuffer, LineParser paramLineParser, HttpRequestFactory paramHttpRequestFactory, HttpParams paramHttpParams)
  {
    super(paramSessionInputBuffer, paramLineParser, paramHttpParams);
    Object localObject = (HttpRequestFactory)Args.notNull(paramHttpRequestFactory, "Request factory");
    this.requestFactory = ((HttpRequestFactory)localObject);
    localObject = new org/apache/http/util/CharArrayBuffer;
    ((CharArrayBuffer)localObject).<init>(128);
    this.lineBuf = ((CharArrayBuffer)localObject);
  }
  
  protected HttpMessage parseHead(SessionInputBuffer paramSessionInputBuffer)
  {
    this.lineBuf.clear();
    Object localObject = this.lineBuf;
    int i = paramSessionInputBuffer.readLine((CharArrayBuffer)localObject);
    int j = -1;
    if (i == j)
    {
      localObject = new org/apache/http/ConnectionClosedException;
      ((ConnectionClosedException)localObject).<init>("Client closed connection");
      throw ((Throwable)localObject);
    }
    localObject = new org/apache/http/message/ParserCursor;
    int k = this.lineBuf.length();
    ((ParserCursor)localObject).<init>(0, k);
    LineParser localLineParser = this.lineParser;
    CharArrayBuffer localCharArrayBuffer = this.lineBuf;
    localObject = localLineParser.parseRequestLine(localCharArrayBuffer, (ParserCursor)localObject);
    return this.requestFactory.newHttpRequest((RequestLine)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\HttpRequestParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */