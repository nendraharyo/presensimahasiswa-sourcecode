package org.apache.http.impl.io;

import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.HttpMessageWriterFactory;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;

public class DefaultHttpResponseWriterFactory
  implements HttpMessageWriterFactory
{
  public static final DefaultHttpResponseWriterFactory INSTANCE;
  private final LineFormatter lineFormatter;
  
  static
  {
    DefaultHttpResponseWriterFactory localDefaultHttpResponseWriterFactory = new org/apache/http/impl/io/DefaultHttpResponseWriterFactory;
    localDefaultHttpResponseWriterFactory.<init>();
    INSTANCE = localDefaultHttpResponseWriterFactory;
  }
  
  public DefaultHttpResponseWriterFactory()
  {
    this(null);
  }
  
  public DefaultHttpResponseWriterFactory(LineFormatter paramLineFormatter)
  {
    if (paramLineFormatter != null) {}
    for (;;)
    {
      this.lineFormatter = paramLineFormatter;
      return;
      paramLineFormatter = BasicLineFormatter.INSTANCE;
    }
  }
  
  public HttpMessageWriter create(SessionOutputBuffer paramSessionOutputBuffer)
  {
    DefaultHttpResponseWriter localDefaultHttpResponseWriter = new org/apache/http/impl/io/DefaultHttpResponseWriter;
    LineFormatter localLineFormatter = this.lineFormatter;
    localDefaultHttpResponseWriter.<init>(paramSessionOutputBuffer, localLineFormatter);
    return localDefaultHttpResponseWriter;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\DefaultHttpResponseWriterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */