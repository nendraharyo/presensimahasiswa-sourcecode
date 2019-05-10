package org.apache.http.impl.io;

import org.apache.http.HttpRequestFactory;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpRequestFactory;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageParserFactory;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;

public class DefaultHttpRequestParserFactory
  implements HttpMessageParserFactory
{
  public static final DefaultHttpRequestParserFactory INSTANCE;
  private final LineParser lineParser;
  private final HttpRequestFactory requestFactory;
  
  static
  {
    DefaultHttpRequestParserFactory localDefaultHttpRequestParserFactory = new org/apache/http/impl/io/DefaultHttpRequestParserFactory;
    localDefaultHttpRequestParserFactory.<init>();
    INSTANCE = localDefaultHttpRequestParserFactory;
  }
  
  public DefaultHttpRequestParserFactory()
  {
    this(null, null);
  }
  
  public DefaultHttpRequestParserFactory(LineParser paramLineParser, HttpRequestFactory paramHttpRequestFactory)
  {
    if (paramLineParser != null)
    {
      this.lineParser = paramLineParser;
      if (paramHttpRequestFactory == null) {
        break label30;
      }
    }
    for (;;)
    {
      this.requestFactory = paramHttpRequestFactory;
      return;
      paramLineParser = BasicLineParser.INSTANCE;
      break;
      label30:
      paramHttpRequestFactory = DefaultHttpRequestFactory.INSTANCE;
    }
  }
  
  public HttpMessageParser create(SessionInputBuffer paramSessionInputBuffer, MessageConstraints paramMessageConstraints)
  {
    DefaultHttpRequestParser localDefaultHttpRequestParser = new org/apache/http/impl/io/DefaultHttpRequestParser;
    LineParser localLineParser = this.lineParser;
    HttpRequestFactory localHttpRequestFactory = this.requestFactory;
    localDefaultHttpRequestParser.<init>(paramSessionInputBuffer, localLineParser, localHttpRequestFactory, paramMessageConstraints);
    return localDefaultHttpRequestParser;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\DefaultHttpRequestParserFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */