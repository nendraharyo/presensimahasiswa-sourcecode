package org.apache.http.impl.client;

import java.util.concurrent.atomic.AtomicLong;

class FutureRequestExecutionMetrics$DurationCounter
{
  private final AtomicLong count;
  private final AtomicLong cumulativeDuration;
  
  FutureRequestExecutionMetrics$DurationCounter()
  {
    AtomicLong localAtomicLong = new java/util/concurrent/atomic/AtomicLong;
    localAtomicLong.<init>(l);
    this.count = localAtomicLong;
    localAtomicLong = new java/util/concurrent/atomic/AtomicLong;
    localAtomicLong.<init>(l);
    this.cumulativeDuration = localAtomicLong;
  }
  
  public long averageDuration()
  {
    long l1 = 0L;
    AtomicLong localAtomicLong1 = this.count;
    long l2 = localAtomicLong1.get();
    boolean bool = l2 < l1;
    if (bool)
    {
      AtomicLong localAtomicLong2 = this.cumulativeDuration;
      l1 = localAtomicLong2.get() / l2;
    }
    return l1;
  }
  
  public long count()
  {
    return this.count.get();
  }
  
  public void increment(long paramLong)
  {
    this.count.incrementAndGet();
    AtomicLong localAtomicLong = this.cumulativeDuration;
    long l = System.currentTimeMillis() - paramLong;
    localAtomicLong.addAndGet(l);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("[count=");
    long l = count();
    localStringBuilder2 = localStringBuilder2.append(l).append(", averageDuration=");
    l = averageDuration();
    localStringBuilder2.append(l).append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\FutureRequestExecutionMetrics$DurationCounter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */