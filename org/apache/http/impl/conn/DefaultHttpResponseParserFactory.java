package org.apache.http.impl.conn;

import org.apache.http.HttpResponseFactory;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.HttpMessageParserFactory;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;

public class DefaultHttpResponseParserFactory
  implements HttpMessageParserFactory
{
  public static final DefaultHttpResponseParserFactory INSTANCE;
  private final LineParser lineParser;
  private final HttpResponseFactory responseFactory;
  
  static
  {
    DefaultHttpResponseParserFactory localDefaultHttpResponseParserFactory = new org/apache/http/impl/conn/DefaultHttpResponseParserFactory;
    localDefaultHttpResponseParserFactory.<init>();
    INSTANCE = localDefaultHttpResponseParserFactory;
  }
  
  public DefaultHttpResponseParserFactory()
  {
    this(null, null);
  }
  
  public DefaultHttpResponseParserFactory(HttpResponseFactory paramHttpResponseFactory)
  {
    this(null, paramHttpResponseFactory);
  }
  
  public DefaultHttpResponseParserFactory(LineParser paramLineParser, HttpResponseFactory paramHttpResponseFactory)
  {
    if (paramLineParser != null)
    {
      this.lineParser = paramLineParser;
      if (paramHttpResponseFactory == null) {
        break label30;
      }
    }
    for (;;)
    {
      this.responseFactory = paramHttpResponseFactory;
      return;
      paramLineParser = BasicLineParser.INSTANCE;
      break;
      label30:
      paramHttpResponseFactory = DefaultHttpResponseFactory.INSTANCE;
    }
  }
  
  public HttpMessageParser create(SessionInputBuffer paramSessionInputBuffer, MessageConstraints paramMessageConstraints)
  {
    DefaultHttpResponseParser localDefaultHttpResponseParser = new org/apache/http/impl/conn/DefaultHttpResponseParser;
    LineParser localLineParser = this.lineParser;
    HttpResponseFactory localHttpResponseFactory = this.responseFactory;
    localDefaultHttpResponseParser.<init>(paramSessionInputBuffer, localLineParser, localHttpResponseFactory, paramMessageConstraints);
    return localDefaultHttpResponseParser;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\DefaultHttpResponseParserFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */