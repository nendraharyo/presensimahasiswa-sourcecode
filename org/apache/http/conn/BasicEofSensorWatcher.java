package org.apache.http.conn;

import java.io.InputStream;
import org.apache.http.util.Args;

public class BasicEofSensorWatcher
  implements EofSensorWatcher
{
  protected final boolean attemptReuse;
  protected final ManagedClientConnection managedConn;
  
  public BasicEofSensorWatcher(ManagedClientConnection paramManagedClientConnection, boolean paramBoolean)
  {
    Args.notNull(paramManagedClientConnection, "Connection");
    this.managedConn = paramManagedClientConnection;
    this.attemptReuse = paramBoolean;
  }
  
  public boolean eofDetected(InputStream paramInputStream)
  {
    try
    {
      boolean bool = this.attemptReuse;
      if (bool)
      {
        paramInputStream.close();
        ManagedClientConnection localManagedClientConnection = this.managedConn;
        localManagedClientConnection.markReusable();
      }
      return false;
    }
    finally
    {
      this.managedConn.releaseConnection();
    }
  }
  
  public boolean streamAbort(InputStream paramInputStream)
  {
    this.managedConn.abortConnection();
    return false;
  }
  
  public boolean streamClosed(InputStream paramInputStream)
  {
    try
    {
      boolean bool = this.attemptReuse;
      if (bool)
      {
        paramInputStream.close();
        ManagedClientConnection localManagedClientConnection = this.managedConn;
        localManagedClientConnection.markReusable();
      }
      return false;
    }
    finally
    {
      this.managedConn.releaseConnection();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\BasicEofSensorWatcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */