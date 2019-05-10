package org.apache.http.impl.execchain;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.conn.EofSensorInputStream;
import org.apache.http.conn.EofSensorWatcher;
import org.apache.http.entity.HttpEntityWrapper;

class ResponseEntityProxy
  extends HttpEntityWrapper
  implements EofSensorWatcher
{
  private final ConnectionHolder connHolder;
  
  ResponseEntityProxy(HttpEntity paramHttpEntity, ConnectionHolder paramConnectionHolder)
  {
    super(paramHttpEntity);
    this.connHolder = paramConnectionHolder;
  }
  
  private void cleanup()
  {
    ConnectionHolder localConnectionHolder = this.connHolder;
    if (localConnectionHolder != null)
    {
      localConnectionHolder = this.connHolder;
      localConnectionHolder.abortConnection();
    }
  }
  
  public static void enchance(HttpResponse paramHttpResponse, ConnectionHolder paramConnectionHolder)
  {
    HttpEntity localHttpEntity = paramHttpResponse.getEntity();
    if (localHttpEntity != null)
    {
      boolean bool = localHttpEntity.isStreaming();
      if ((bool) && (paramConnectionHolder != null))
      {
        ResponseEntityProxy localResponseEntityProxy = new org/apache/http/impl/execchain/ResponseEntityProxy;
        localResponseEntityProxy.<init>(localHttpEntity, paramConnectionHolder);
        paramHttpResponse.setEntity(localResponseEntityProxy);
      }
    }
  }
  
  public void consumeContent()
  {
    releaseConnection();
  }
  
  public boolean eofDetected(InputStream paramInputStream)
  {
    try
    {
      paramInputStream.close();
      releaseConnection();
      return false;
    }
    finally
    {
      cleanup();
    }
  }
  
  public InputStream getContent()
  {
    EofSensorInputStream localEofSensorInputStream = new org/apache/http/conn/EofSensorInputStream;
    InputStream localInputStream = this.wrappedEntity.getContent();
    localEofSensorInputStream.<init>(localInputStream, this);
    return localEofSensorInputStream;
  }
  
  public boolean isRepeatable()
  {
    return false;
  }
  
  public void releaseConnection()
  {
    ConnectionHolder localConnectionHolder = this.connHolder;
    if (localConnectionHolder != null) {}
    try
    {
      localConnectionHolder = this.connHolder;
      boolean bool = localConnectionHolder.isReusable();
      if (bool)
      {
        localConnectionHolder = this.connHolder;
        localConnectionHolder.releaseConnection();
      }
      return;
    }
    finally
    {
      cleanup();
    }
  }
  
  public boolean streamAbort(InputStream paramInputStream)
  {
    cleanup();
    return false;
  }
  
  /* Error */
  public boolean streamClosed(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	org/apache/http/impl/execchain/ResponseEntityProxy:connHolder	Lorg/apache/http/impl/execchain/ConnectionHolder;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +33 -> 39
    //   9: aload_0
    //   10: getfield 14	org/apache/http/impl/execchain/ResponseEntityProxy:connHolder	Lorg/apache/http/impl/execchain/ConnectionHolder;
    //   13: astore_2
    //   14: aload_2
    //   15: invokevirtual 69	org/apache/http/impl/execchain/ConnectionHolder:isReleased	()Z
    //   18: istore_3
    //   19: iload_3
    //   20: ifne +19 -> 39
    //   23: iconst_1
    //   24: istore_3
    //   25: aload_1
    //   26: invokevirtual 46	java/io/InputStream:close	()V
    //   29: aload_0
    //   30: invokevirtual 41	org/apache/http/impl/execchain/ResponseEntityProxy:releaseConnection	()V
    //   33: aload_0
    //   34: invokespecial 49	org/apache/http/impl/execchain/ResponseEntityProxy:cleanup	()V
    //   37: iconst_0
    //   38: ireturn
    //   39: iconst_0
    //   40: istore_3
    //   41: aconst_null
    //   42: astore_2
    //   43: goto -18 -> 25
    //   46: astore 4
    //   48: iload_3
    //   49: ifeq -16 -> 33
    //   52: aload 4
    //   54: athrow
    //   55: astore_2
    //   56: aload_0
    //   57: invokespecial 49	org/apache/http/impl/execchain/ResponseEntityProxy:cleanup	()V
    //   60: aload_2
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	ResponseEntityProxy
    //   0	62	1	paramInputStream	InputStream
    //   4	39	2	localConnectionHolder	ConnectionHolder
    //   55	6	2	localObject	Object
    //   18	31	3	bool	boolean
    //   46	7	4	localSocketException	java.net.SocketException
    // Exception table:
    //   from	to	target	type
    //   25	29	46	java/net/SocketException
    //   29	33	46	java/net/SocketException
    //   0	4	55	finally
    //   9	13	55	finally
    //   14	18	55	finally
    //   25	29	55	finally
    //   29	33	55	finally
    //   52	55	55	finally
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("ResponseEntityProxy{");
    HttpEntity localHttpEntity = this.wrappedEntity;
    localStringBuilder.append(localHttpEntity);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    try
    {
      HttpEntity localHttpEntity = this.wrappedEntity;
      localHttpEntity.writeTo(paramOutputStream);
      releaseConnection();
      return;
    }
    finally
    {
      cleanup();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\execchain\ResponseEntityProxy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */