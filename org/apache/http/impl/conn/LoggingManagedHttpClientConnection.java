package org.apache.http.impl.conn;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.logging.Log;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.io.HttpMessageParserFactory;
import org.apache.http.io.HttpMessageWriterFactory;

class LoggingManagedHttpClientConnection
  extends DefaultManagedHttpClientConnection
{
  private final Log headerlog;
  private final Log log;
  private final Wire wire;
  
  public LoggingManagedHttpClientConnection(String paramString, Log paramLog1, Log paramLog2, Log paramLog3, int paramInt1, int paramInt2, CharsetDecoder paramCharsetDecoder, CharsetEncoder paramCharsetEncoder, MessageConstraints paramMessageConstraints, ContentLengthStrategy paramContentLengthStrategy1, ContentLengthStrategy paramContentLengthStrategy2, HttpMessageWriterFactory paramHttpMessageWriterFactory, HttpMessageParserFactory paramHttpMessageParserFactory)
  {
    super(paramString, paramInt1, paramInt2, paramCharsetDecoder, paramCharsetEncoder, paramMessageConstraints, paramContentLengthStrategy1, paramContentLengthStrategy2, paramHttpMessageWriterFactory, paramHttpMessageParserFactory);
    this.log = paramLog1;
    this.headerlog = paramLog2;
    localObject = new org/apache/http/impl/conn/Wire;
    ((Wire)localObject).<init>(paramLog3, paramString);
    this.wire = ((Wire)localObject);
  }
  
  public void close()
  {
    Log localLog = this.log;
    boolean bool = localLog.isDebugEnabled();
    if (bool)
    {
      localLog = this.log;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = getId();
      localObject = ((StringBuilder)localObject).append(str);
      str = ": Close connection";
      localObject = str;
      localLog.debug(localObject);
    }
    super.close();
  }
  
  protected InputStream getSocketInputStream(Socket paramSocket)
  {
    InputStream localInputStream = super.getSocketInputStream(paramSocket);
    Object localObject = this.wire;
    boolean bool = ((Wire)localObject).enabled();
    if (bool)
    {
      localObject = new org/apache/http/impl/conn/LoggingInputStream;
      Wire localWire = this.wire;
      ((LoggingInputStream)localObject).<init>(localInputStream, localWire);
    }
    for (;;)
    {
      return (InputStream)localObject;
      localObject = localInputStream;
    }
  }
  
  protected OutputStream getSocketOutputStream(Socket paramSocket)
  {
    OutputStream localOutputStream = super.getSocketOutputStream(paramSocket);
    Object localObject = this.wire;
    boolean bool = ((Wire)localObject).enabled();
    if (bool)
    {
      localObject = new org/apache/http/impl/conn/LoggingOutputStream;
      Wire localWire = this.wire;
      ((LoggingOutputStream)localObject).<init>(localOutputStream, localWire);
    }
    for (;;)
    {
      return (OutputStream)localObject;
      localObject = localOutputStream;
    }
  }
  
  protected void onRequestSubmitted(HttpRequest paramHttpRequest)
  {
    if (paramHttpRequest != null)
    {
      Log localLog1 = this.headerlog;
      int i = localLog1.isDebugEnabled();
      if (i != 0)
      {
        localLog1 = this.headerlog;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str1 = getId();
        localObject = ((StringBuilder)localObject).append(str1).append(" >> ");
        str1 = paramHttpRequest.getRequestLine().toString();
        localObject = str1;
        localLog1.debug(localObject);
        localObject = paramHttpRequest.getAllHeaders();
        int k = localObject.length;
        i = 0;
        localLog1 = null;
        while (i < k)
        {
          String str2 = localObject[i];
          Log localLog2 = this.headerlog;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str3 = getId();
          localStringBuilder = localStringBuilder.append(str3);
          str3 = " >> ";
          localStringBuilder = localStringBuilder.append(str3);
          str2 = str2.toString();
          str2 = str2;
          localLog2.debug(str2);
          int j;
          i += 1;
        }
      }
    }
  }
  
  protected void onResponseReceived(HttpResponse paramHttpResponse)
  {
    if (paramHttpResponse != null)
    {
      Log localLog1 = this.headerlog;
      int i = localLog1.isDebugEnabled();
      if (i != 0)
      {
        localLog1 = this.headerlog;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str1 = getId();
        localObject = ((StringBuilder)localObject).append(str1).append(" << ");
        str1 = paramHttpResponse.getStatusLine().toString();
        localObject = str1;
        localLog1.debug(localObject);
        localObject = paramHttpResponse.getAllHeaders();
        int k = localObject.length;
        i = 0;
        localLog1 = null;
        while (i < k)
        {
          String str2 = localObject[i];
          Log localLog2 = this.headerlog;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str3 = getId();
          localStringBuilder = localStringBuilder.append(str3);
          str3 = " << ";
          localStringBuilder = localStringBuilder.append(str3);
          str2 = str2.toString();
          str2 = str2;
          localLog2.debug(str2);
          int j;
          i += 1;
        }
      }
    }
  }
  
  public void shutdown()
  {
    Log localLog = this.log;
    boolean bool = localLog.isDebugEnabled();
    if (bool)
    {
      localLog = this.log;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = getId();
      localObject = ((StringBuilder)localObject).append(str);
      str = ": Shutdown connection";
      localObject = str;
      localLog.debug(localObject);
    }
    super.shutdown();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\LoggingManagedHttpClientConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */