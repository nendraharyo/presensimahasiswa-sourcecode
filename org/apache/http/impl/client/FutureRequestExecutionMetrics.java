package org.apache.http.impl.client;

import java.util.concurrent.atomic.AtomicLong;

public final class FutureRequestExecutionMetrics
{
  private final AtomicLong activeConnections;
  private final FutureRequestExecutionMetrics.DurationCounter failedConnections;
  private final FutureRequestExecutionMetrics.DurationCounter requests;
  private final AtomicLong scheduledConnections;
  private final FutureRequestExecutionMetrics.DurationCounter successfulConnections;
  private final FutureRequestExecutionMetrics.DurationCounter tasks;
  
  FutureRequestExecutionMetrics()
  {
    Object localObject = new java/util/concurrent/atomic/AtomicLong;
    ((AtomicLong)localObject).<init>();
    this.activeConnections = ((AtomicLong)localObject);
    localObject = new java/util/concurrent/atomic/AtomicLong;
    ((AtomicLong)localObject).<init>();
    this.scheduledConnections = ((AtomicLong)localObject);
    localObject = new org/apache/http/impl/client/FutureRequestExecutionMetrics$DurationCounter;
    ((FutureRequestExecutionMetrics.DurationCounter)localObject).<init>();
    this.successfulConnections = ((FutureRequestExecutionMetrics.DurationCounter)localObject);
    localObject = new org/apache/http/impl/client/FutureRequestExecutionMetrics$DurationCounter;
    ((FutureRequestExecutionMetrics.DurationCounter)localObject).<init>();
    this.failedConnections = ((FutureRequestExecutionMetrics.DurationCounter)localObject);
    localObject = new org/apache/http/impl/client/FutureRequestExecutionMetrics$DurationCounter;
    ((FutureRequestExecutionMetrics.DurationCounter)localObject).<init>();
    this.requests = ((FutureRequestExecutionMetrics.DurationCounter)localObject);
    localObject = new org/apache/http/impl/client/FutureRequestExecutionMetrics$DurationCounter;
    ((FutureRequestExecutionMetrics.DurationCounter)localObject).<init>();
    this.tasks = ((FutureRequestExecutionMetrics.DurationCounter)localObject);
  }
  
  public long getActiveConnectionCount()
  {
    return this.activeConnections.get();
  }
  
  AtomicLong getActiveConnections()
  {
    return this.activeConnections;
  }
  
  public long getFailedConnectionAverageDuration()
  {
    return this.failedConnections.averageDuration();
  }
  
  public long getFailedConnectionCount()
  {
    return this.failedConnections.count();
  }
  
  FutureRequestExecutionMetrics.DurationCounter getFailedConnections()
  {
    return this.failedConnections;
  }
  
  public long getRequestAverageDuration()
  {
    return this.requests.averageDuration();
  }
  
  public long getRequestCount()
  {
    return this.requests.count();
  }
  
  FutureRequestExecutionMetrics.DurationCounter getRequests()
  {
    return this.requests;
  }
  
  public long getScheduledConnectionCount()
  {
    return this.scheduledConnections.get();
  }
  
  AtomicLong getScheduledConnections()
  {
    return this.scheduledConnections;
  }
  
  public long getSuccessfulConnectionAverageDuration()
  {
    return this.successfulConnections.averageDuration();
  }
  
  public long getSuccessfulConnectionCount()
  {
    return this.successfulConnections.count();
  }
  
  FutureRequestExecutionMetrics.DurationCounter getSuccessfulConnections()
  {
    return this.successfulConnections;
  }
  
  public long getTaskAverageDuration()
  {
    return this.tasks.averageDuration();
  }
  
  public long getTaskCount()
  {
    return this.tasks.count();
  }
  
  FutureRequestExecutionMetrics.DurationCounter getTasks()
  {
    return this.tasks;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("[activeConnections=");
    Object localObject = this.activeConnections;
    localStringBuilder2 = localStringBuilder2.append(localObject).append(", scheduledConnections=");
    localObject = this.scheduledConnections;
    localStringBuilder2 = localStringBuilder2.append(localObject).append(", successfulConnections=");
    localObject = this.successfulConnections;
    localStringBuilder2 = localStringBuilder2.append(localObject).append(", failedConnections=");
    localObject = this.failedConnections;
    localStringBuilder2 = localStringBuilder2.append(localObject).append(", requests=");
    localObject = this.requests;
    localStringBuilder2 = localStringBuilder2.append(localObject).append(", tasks=");
    localObject = this.tasks;
    localStringBuilder2.append(localObject).append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\FutureRequestExecutionMetrics.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */