package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpConnection;

public class IdleConnectionHandler
{
  private final Map connectionToTimes;
  private final Log log;
  
  public IdleConnectionHandler()
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.connectionToTimes = ((Map)localObject);
  }
  
  public void add(HttpConnection paramHttpConnection, long paramLong, TimeUnit paramTimeUnit)
  {
    long l = System.currentTimeMillis();
    Object localObject1 = this.log;
    boolean bool = ((Log)localObject1).isDebugEnabled();
    if (bool)
    {
      localObject1 = this.log;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Adding connection at: ";
      localObject2 = str + l;
      ((Log)localObject1).debug(localObject2);
    }
    localObject1 = this.connectionToTimes;
    Object localObject2 = new org/apache/http/impl/conn/IdleConnectionHandler$TimeValues;
    ((IdleConnectionHandler.TimeValues)localObject2).<init>(l, paramLong, paramTimeUnit);
    ((Map)localObject1).put(paramHttpConnection, localObject2);
  }
  
  public void closeExpiredConnections()
  {
    long l1 = System.currentTimeMillis();
    Object localObject1 = this.log;
    boolean bool1 = ((Log)localObject1).isDebugEnabled();
    Object localObject2;
    if (bool1)
    {
      localObject1 = this.log;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Checking for expired connections, now: ";
      localObject2 = (String)localObject3 + l1;
      ((Log)localObject1).debug(localObject2);
    }
    localObject1 = this.connectionToTimes.entrySet();
    Object localObject3 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject3).next();
      localObject2 = (HttpConnection)((Map.Entry)localObject1).getKey();
      localObject1 = (IdleConnectionHandler.TimeValues)((Map.Entry)localObject1).getValue();
      long l2 = IdleConnectionHandler.TimeValues.access$000((IdleConnectionHandler.TimeValues)localObject1);
      boolean bool2 = l2 < l1;
      if (!bool2)
      {
        Object localObject4 = this.log;
        bool2 = ((Log)localObject4).isDebugEnabled();
        if (bool2)
        {
          localObject4 = this.log;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = "Closing connection, expired @: ";
          localStringBuilder = localStringBuilder.append(str);
          long l3 = IdleConnectionHandler.TimeValues.access$000((IdleConnectionHandler.TimeValues)localObject1);
          localObject1 = l3;
          ((Log)localObject4).debug(localObject1);
        }
        try
        {
          ((HttpConnection)localObject2).close();
        }
        catch (IOException localIOException)
        {
          localObject2 = this.log;
          localObject4 = "I/O error closing connection";
          ((Log)localObject2).debug(localObject4, localIOException);
        }
      }
    }
  }
  
  public void closeIdleConnections(long paramLong)
  {
    long l1 = System.currentTimeMillis();
    long l2 = l1 - paramLong;
    Object localObject1 = this.log;
    boolean bool = ((Log)localObject1).isDebugEnabled();
    Object localObject2;
    if (bool)
    {
      localObject1 = this.log;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Checking for connections, idle timeout: ";
      localObject2 = (String)localObject3 + l2;
      ((Log)localObject1).debug(localObject2);
    }
    localObject1 = this.connectionToTimes.entrySet();
    Object localObject3 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject3).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject3).next();
      localObject2 = (HttpConnection)((Map.Entry)localObject1).getKey();
      localObject1 = (IdleConnectionHandler.TimeValues)((Map.Entry)localObject1).getValue();
      long l3 = IdleConnectionHandler.TimeValues.access$100((IdleConnectionHandler.TimeValues)localObject1);
      bool = l3 < l2;
      if (!bool)
      {
        localObject1 = this.log;
        bool = ((Log)localObject1).isDebugEnabled();
        Object localObject4;
        if (bool)
        {
          localObject1 = this.log;
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          String str = "Closing idle connection, connection time: ";
          localObject4 = str + l3;
          ((Log)localObject1).debug(localObject4);
        }
        try
        {
          ((HttpConnection)localObject2).close();
        }
        catch (IOException localIOException)
        {
          localObject2 = this.log;
          localObject4 = "I/O error closing connection";
          ((Log)localObject2).debug(localObject4, localIOException);
        }
      }
    }
  }
  
  public boolean remove(HttpConnection paramHttpConnection)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    Object localObject = (IdleConnectionHandler.TimeValues)this.connectionToTimes.remove(paramHttpConnection);
    if (localObject == null)
    {
      localObject = this.log;
      String str = "Removing a connection that never existed!";
      ((Log)localObject).warn(str);
      return bool1;
    }
    long l1 = System.currentTimeMillis();
    long l2 = IdleConnectionHandler.TimeValues.access$000((IdleConnectionHandler.TimeValues)localObject);
    boolean bool2 = l1 < l2;
    float f2;
    if (!bool2)
    {
      bool2 = bool1;
      f2 = f1;
    }
    for (;;)
    {
      bool1 = bool2;
      f1 = f2;
      break;
      bool2 = false;
      f2 = 0.0F;
      localObject = null;
    }
  }
  
  public void removeAll()
  {
    this.connectionToTimes.clear();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\IdleConnectionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */