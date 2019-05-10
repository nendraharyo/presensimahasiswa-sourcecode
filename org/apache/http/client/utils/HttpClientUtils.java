package org.apache.http.client.utils;

import java.io.Closeable;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.util.EntityUtils;

public class HttpClientUtils
{
  public static void closeQuietly(HttpResponse paramHttpResponse)
  {
    HttpEntity localHttpEntity;
    if (paramHttpResponse != null)
    {
      localHttpEntity = paramHttpResponse.getEntity();
      if (localHttpEntity == null) {}
    }
    try
    {
      EntityUtils.consume(localHttpEntity);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static void closeQuietly(HttpClient paramHttpClient)
  {
    if (paramHttpClient != null)
    {
      boolean bool = paramHttpClient instanceof Closeable;
      if (!bool) {}
    }
    try
    {
      paramHttpClient = (Closeable)paramHttpClient;
      paramHttpClient.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public static void closeQuietly(org.apache.http.client.methods.CloseableHttpResponse paramCloseableHttpResponse)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +20 -> 21
    //   4: aload_0
    //   5: invokeinterface 30 1 0
    //   10: astore_1
    //   11: aload_1
    //   12: invokestatic 20	org/apache/http/util/EntityUtils:consume	(Lorg/apache/http/HttpEntity;)V
    //   15: aload_0
    //   16: invokeinterface 31 1 0
    //   21: return
    //   22: astore_1
    //   23: aload_0
    //   24: invokeinterface 31 1 0
    //   29: aload_1
    //   30: athrow
    //   31: astore_1
    //   32: goto -11 -> 21
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	paramCloseableHttpResponse	org.apache.http.client.methods.CloseableHttpResponse
    //   10	2	1	localHttpEntity	HttpEntity
    //   22	8	1	localObject	Object
    //   31	1	1	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   4	10	22	finally
    //   11	15	22	finally
    //   15	21	31	java/io/IOException
    //   23	29	31	java/io/IOException
    //   29	31	31	java/io/IOException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\clien\\utils\HttpClientUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */