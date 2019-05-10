package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.LangUtils;

public class RouteSpecificPool
{
  protected final ConnPerRoute connPerRoute;
  protected final LinkedList freeEntries;
  private final Log log;
  protected final int maxEntries;
  protected int numEntries;
  protected final HttpRoute route;
  protected final Queue waitingThreads;
  
  public RouteSpecificPool(HttpRoute paramHttpRoute, int paramInt)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    this.route = paramHttpRoute;
    this.maxEntries = paramInt;
    localObject = new org/apache/http/impl/conn/tsccm/RouteSpecificPool$1;
    ((RouteSpecificPool.1)localObject).<init>(this);
    this.connPerRoute = ((ConnPerRoute)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.freeEntries = ((LinkedList)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.waitingThreads = ((Queue)localObject);
    this.numEntries = 0;
  }
  
  public RouteSpecificPool(HttpRoute paramHttpRoute, ConnPerRoute paramConnPerRoute)
  {
    Object localObject = LogFactory.getLog(getClass());
    this.log = ((Log)localObject);
    this.route = paramHttpRoute;
    this.connPerRoute = paramConnPerRoute;
    int i = paramConnPerRoute.getMaxForRoute(paramHttpRoute);
    this.maxEntries = i;
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.freeEntries = ((LinkedList)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.waitingThreads = ((Queue)localObject);
    this.numEntries = 0;
  }
  
  public BasicPoolEntry allocEntry(Object paramObject)
  {
    Object localObject1 = this.freeEntries;
    boolean bool1 = ((LinkedList)localObject1).isEmpty();
    Object localObject2;
    Object localObject3;
    if (!bool1)
    {
      localObject1 = this.freeEntries;
      int j = this.freeEntries.size();
      localObject2 = ((LinkedList)localObject1).listIterator(j);
      boolean bool3;
      do
      {
        bool1 = ((ListIterator)localObject2).hasPrevious();
        if (!bool1) {
          break label98;
        }
        localObject1 = (BasicPoolEntry)((ListIterator)localObject2).previous();
        localObject3 = ((BasicPoolEntry)localObject1).getState();
        if (localObject3 == null) {
          break;
        }
        localObject3 = ((BasicPoolEntry)localObject1).getState();
        bool3 = LangUtils.equals(paramObject, localObject3);
      } while (!bool3);
      ((ListIterator)localObject2).remove();
    }
    for (;;)
    {
      return (BasicPoolEntry)localObject1;
      label98:
      int i = getCapacity();
      if (i == 0)
      {
        localObject1 = this.freeEntries;
        bool2 = ((LinkedList)localObject1).isEmpty();
        if (!bool2)
        {
          localObject1 = (BasicPoolEntry)this.freeEntries.remove();
          ((BasicPoolEntry)localObject1).shutdownEntry();
          localObject2 = ((BasicPoolEntry)localObject1).getConnection();
          try
          {
            ((OperatedClientConnection)localObject2).close();
          }
          catch (IOException localIOException)
          {
            localObject3 = this.log;
            String str = "I/O error closing connection";
            ((Log)localObject3).debug(str, localIOException);
          }
          continue;
        }
      }
      boolean bool2 = false;
      localObject1 = null;
    }
  }
  
  public void createdEntry(BasicPoolEntry paramBasicPoolEntry)
  {
    HttpRoute localHttpRoute1 = this.route;
    HttpRoute localHttpRoute2 = paramBasicPoolEntry.getPlannedRoute();
    Args.check(localHttpRoute1.equals(localHttpRoute2), "Entry not planned for this pool");
    int i = this.numEntries + 1;
    this.numEntries = i;
  }
  
  public boolean deleteEntry(BasicPoolEntry paramBasicPoolEntry)
  {
    LinkedList localLinkedList = this.freeEntries;
    boolean bool = localLinkedList.remove(paramBasicPoolEntry);
    if (bool)
    {
      int i = this.numEntries + -1;
      this.numEntries = i;
    }
    return bool;
  }
  
  public void dropEntry()
  {
    int i = this.numEntries;
    if (i > 0) {}
    int j;
    for (i = 1;; j = 0)
    {
      Asserts.check(i, "There is no entry that could be dropped");
      j = this.numEntries + -1;
      this.numEntries = j;
      return;
    }
  }
  
  public void freeEntry(BasicPoolEntry paramBasicPoolEntry)
  {
    int i = this.numEntries;
    int j = 1;
    IllegalStateException localIllegalStateException;
    HttpRoute localHttpRoute;
    if (i < j)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("No entry created for this pool. ");
      localHttpRoute = this.route;
      localObject = localHttpRoute;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
    i = this.numEntries;
    Object localObject = this.freeEntries;
    j = ((LinkedList)localObject).size();
    if (i <= j)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("No entry allocated from this pool. ");
      localHttpRoute = this.route;
      localObject = localHttpRoute;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
    this.freeEntries.add(paramBasicPoolEntry);
  }
  
  public int getCapacity()
  {
    ConnPerRoute localConnPerRoute = this.connPerRoute;
    HttpRoute localHttpRoute = this.route;
    int i = localConnPerRoute.getMaxForRoute(localHttpRoute);
    int j = this.numEntries;
    return i - j;
  }
  
  public final int getEntryCount()
  {
    return this.numEntries;
  }
  
  public final int getMaxEntries()
  {
    return this.maxEntries;
  }
  
  public final HttpRoute getRoute()
  {
    return this.route;
  }
  
  public boolean hasThread()
  {
    Queue localQueue = this.waitingThreads;
    boolean bool = localQueue.isEmpty();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localQueue = null;
    }
  }
  
  public boolean isUnused()
  {
    int i = 1;
    int j = this.numEntries;
    if (j < i)
    {
      Queue localQueue = this.waitingThreads;
      boolean bool = localQueue.isEmpty();
      if (!bool) {}
    }
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public WaitingThread nextThread()
  {
    return (WaitingThread)this.waitingThreads.peek();
  }
  
  public void queueThread(WaitingThread paramWaitingThread)
  {
    Args.notNull(paramWaitingThread, "Waiting thread");
    this.waitingThreads.add(paramWaitingThread);
  }
  
  public void removeThread(WaitingThread paramWaitingThread)
  {
    if (paramWaitingThread == null) {}
    for (;;)
    {
      return;
      Queue localQueue = this.waitingThreads;
      localQueue.remove(paramWaitingThread);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\tsccm\RouteSpecificPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */