package org.apache.http.impl.conn;

import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;

public class SingleClientConnManager$PoolEntry
  extends AbstractPoolEntry
{
  protected SingleClientConnManager$PoolEntry(SingleClientConnManager paramSingleClientConnManager)
  {
    super(localClientConnectionOperator, null);
  }
  
  protected void close()
  {
    shutdownEntry();
    OperatedClientConnection localOperatedClientConnection = this.connection;
    boolean bool = localOperatedClientConnection.isOpen();
    if (bool)
    {
      localOperatedClientConnection = this.connection;
      localOperatedClientConnection.close();
    }
  }
  
  protected void shutdown()
  {
    shutdownEntry();
    OperatedClientConnection localOperatedClientConnection = this.connection;
    boolean bool = localOperatedClientConnection.isOpen();
    if (bool)
    {
      localOperatedClientConnection = this.connection;
      localOperatedClientConnection.shutdown();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\SingleClientConnManager$PoolEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */