package org.apache.http.impl.conn;

import java.util.concurrent.TimeUnit;

class IdleConnectionHandler$TimeValues
{
  private final long timeAdded;
  private final long timeExpires;
  
  IdleConnectionHandler$TimeValues(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    this.timeAdded = paramLong1;
    long l = 0L;
    boolean bool = paramLong2 < l;
    if (bool) {
      l = paramTimeUnit.toMillis(paramLong2) + paramLong1;
    }
    for (this.timeExpires = l;; this.timeExpires = l)
    {
      return;
      l = Long.MAX_VALUE;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\IdleConnectionHandler$TimeValues.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */