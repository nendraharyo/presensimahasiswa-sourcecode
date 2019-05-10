package org.apache.http.conn;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.util.Args;

public class BasicManagedEntity
  extends HttpEntityWrapper
  implements ConnectionReleaseTrigger, EofSensorWatcher
{
  protected final boolean attemptReuse;
  protected ManagedClientConnection managedConn;
  
  public BasicManagedEntity(HttpEntity paramHttpEntity, ManagedClientConnection paramManagedClientConnection, boolean paramBoolean)
  {
    super(paramHttpEntity);
    Args.notNull(paramManagedClientConnection, "Connection");
    this.managedConn = paramManagedClientConnection;
    this.attemptReuse = paramBoolean;
  }
  
  /* Error */
  private void ensureConsumed()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	org/apache/http/conn/BasicManagedEntity:managedConn	Lorg/apache/http/conn/ManagedClientConnection;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +4 -> 10
    //   9: return
    //   10: aload_0
    //   11: getfield 28	org/apache/http/conn/BasicManagedEntity:attemptReuse	Z
    //   14: istore_2
    //   15: iload_2
    //   16: ifeq +30 -> 46
    //   19: aload_0
    //   20: getfield 32	org/apache/http/conn/BasicManagedEntity:wrappedEntity	Lorg/apache/http/HttpEntity;
    //   23: astore_1
    //   24: aload_1
    //   25: invokestatic 37	org/apache/http/util/EntityUtils:consume	(Lorg/apache/http/HttpEntity;)V
    //   28: aload_0
    //   29: getfield 26	org/apache/http/conn/BasicManagedEntity:managedConn	Lorg/apache/http/conn/ManagedClientConnection;
    //   32: astore_1
    //   33: aload_1
    //   34: invokeinterface 43 1 0
    //   39: aload_0
    //   40: invokevirtual 46	org/apache/http/conn/BasicManagedEntity:releaseManagedConnection	()V
    //   43: goto -34 -> 9
    //   46: aload_0
    //   47: getfield 26	org/apache/http/conn/BasicManagedEntity:managedConn	Lorg/apache/http/conn/ManagedClientConnection;
    //   50: astore_1
    //   51: aload_1
    //   52: invokeinterface 49 1 0
    //   57: goto -18 -> 39
    //   60: astore_1
    //   61: aload_0
    //   62: invokevirtual 46	org/apache/http/conn/BasicManagedEntity:releaseManagedConnection	()V
    //   65: aload_1
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	BasicManagedEntity
    //   4	48	1	localObject1	Object
    //   60	6	1	localObject2	Object
    //   14	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   10	14	60	finally
    //   19	23	60	finally
    //   24	28	60	finally
    //   28	32	60	finally
    //   33	39	60	finally
    //   46	50	60	finally
    //   51	57	60	finally
  }
  
  public void abortConnection()
  {
    ManagedClientConnection localManagedClientConnection = this.managedConn;
    if (localManagedClientConnection != null) {}
    try
    {
      localManagedClientConnection = this.managedConn;
      localManagedClientConnection.abortConnection();
      return;
    }
    finally
    {
      this.managedConn = null;
    }
  }
  
  public void consumeContent()
  {
    ensureConsumed();
  }
  
  /* Error */
  public boolean eofDetected(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	org/apache/http/conn/BasicManagedEntity:managedConn	Lorg/apache/http/conn/ManagedClientConnection;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +27 -> 33
    //   9: aload_0
    //   10: getfield 28	org/apache/http/conn/BasicManagedEntity:attemptReuse	Z
    //   13: istore_3
    //   14: iload_3
    //   15: ifeq +24 -> 39
    //   18: aload_1
    //   19: invokevirtual 60	java/io/InputStream:close	()V
    //   22: aload_0
    //   23: getfield 26	org/apache/http/conn/BasicManagedEntity:managedConn	Lorg/apache/http/conn/ManagedClientConnection;
    //   26: astore_2
    //   27: aload_2
    //   28: invokeinterface 43 1 0
    //   33: aload_0
    //   34: invokevirtual 46	org/apache/http/conn/BasicManagedEntity:releaseManagedConnection	()V
    //   37: iconst_0
    //   38: ireturn
    //   39: aload_0
    //   40: getfield 26	org/apache/http/conn/BasicManagedEntity:managedConn	Lorg/apache/http/conn/ManagedClientConnection;
    //   43: astore_2
    //   44: aload_2
    //   45: invokeinterface 49 1 0
    //   50: goto -17 -> 33
    //   53: astore_2
    //   54: aload_0
    //   55: invokevirtual 46	org/apache/http/conn/BasicManagedEntity:releaseManagedConnection	()V
    //   58: aload_2
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	BasicManagedEntity
    //   0	60	1	paramInputStream	InputStream
    //   4	41	2	localManagedClientConnection	ManagedClientConnection
    //   53	6	2	localObject	Object
    //   13	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	4	53	finally
    //   9	13	53	finally
    //   18	22	53	finally
    //   22	26	53	finally
    //   27	33	53	finally
    //   39	43	53	finally
    //   44	50	53	finally
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
    ensureConsumed();
  }
  
  protected void releaseManagedConnection()
  {
    ManagedClientConnection localManagedClientConnection = this.managedConn;
    if (localManagedClientConnection != null) {}
    try
    {
      localManagedClientConnection = this.managedConn;
      localManagedClientConnection.releaseConnection();
      return;
    }
    finally
    {
      this.managedConn = null;
    }
  }
  
  public boolean streamAbort(InputStream paramInputStream)
  {
    ManagedClientConnection localManagedClientConnection = this.managedConn;
    if (localManagedClientConnection != null)
    {
      localManagedClientConnection = this.managedConn;
      localManagedClientConnection.abortConnection();
    }
    return false;
  }
  
  public boolean streamClosed(InputStream paramInputStream)
  {
    for (;;)
    {
      try
      {
        ManagedClientConnection localManagedClientConnection1 = this.managedConn;
        if (localManagedClientConnection1 != null)
        {
          boolean bool1 = this.attemptReuse;
          if (bool1)
          {
            localManagedClientConnection1 = this.managedConn;
            bool2 = localManagedClientConnection1.isOpen();
          }
        }
        else
        {
          try
          {
            paramInputStream.close();
            localManagedClientConnection1 = this.managedConn;
            localManagedClientConnection1.markReusable();
          }
          catch (SocketException localSocketException)
          {
            if (!bool2) {
              continue;
            }
            throw localSocketException;
          }
          return false;
        }
      }
      finally
      {
        boolean bool2;
        releaseManagedConnection();
      }
      ManagedClientConnection localManagedClientConnection2 = this.managedConn;
      localManagedClientConnection2.unmarkReusable();
    }
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    super.writeTo(paramOutputStream);
    ensureConsumed();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\BasicManagedEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */