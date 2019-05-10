package org.apache.http.impl.pool;

import java.io.IOException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.pool.PoolEntry;

public class BasicPoolEntry
  extends PoolEntry
{
  public BasicPoolEntry(String paramString, HttpHost paramHttpHost, HttpClientConnection paramHttpClientConnection)
  {
    super(paramString, paramHttpHost, paramHttpClientConnection);
  }
  
  public void close()
  {
    try
    {
      Object localObject = getConnection();
      localObject = (HttpClientConnection)localObject;
      ((HttpClientConnection)localObject).close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public boolean isClosed()
  {
    HttpClientConnection localHttpClientConnection = (HttpClientConnection)getConnection();
    boolean bool = localHttpClientConnection.isOpen();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localHttpClientConnection = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\pool\BasicPoolEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */