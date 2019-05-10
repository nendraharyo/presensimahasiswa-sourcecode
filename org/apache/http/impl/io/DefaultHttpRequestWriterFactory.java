package org.apache.http.impl.io;

import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.HttpMessageWriterFactory;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;

public class DefaultHttpRequestWriterFactory
  implements HttpMessageWriterFactory
{
  public static final DefaultHttpRequestWriterFactory INSTANCE;
  private final LineFormatter lineFormatter;
  
  static
  {
    DefaultHttpRequestWriterFactory localDefaultHttpRequestWriterFactory = new org/apache/http/impl/io/DefaultHttpRequestWriterFactory;
    localDefaultHttpRequestWriterFactory.<init>();
    INSTANCE = localDefaultHttpRequestWriterFactory;
  }
  
  public DefaultHttpRequestWriterFactory()
  {
    this(null);
  }
  
  public DefaultHttpRequestWriterFactory(LineFormatter paramLineFormatter)
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
    DefaultHttpRequestWriter localDefaultHttpRequestWriter = new org/apache/http/impl/io/DefaultHttpRequestWriter;
    LineFormatter localLineFormatter = this.lineFormatter;
    localDefaultHttpRequestWriter.<init>(paramSessionOutputBuffer, localLineFormatter);
    return localDefaultHttpRequestWriter;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\io\DefaultHttpRequestWriterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */