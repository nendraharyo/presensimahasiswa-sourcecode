package org.apache.http.pool;

import java.util.concurrent.TimeUnit;
import org.apache.http.util.Args;

public abstract class PoolEntry
{
  private final Object conn;
  private final long created;
  private long expiry;
  private final String id;
  private final Object route;
  private volatile Object state;
  private long updated;
  private final long validUnit;
  
  public PoolEntry(String paramString, Object paramObject1, Object paramObject2)
  {
    this(paramString, paramObject1, paramObject2, 0L, localTimeUnit);
  }
  
  public PoolEntry(String paramString, Object paramObject1, Object paramObject2, long paramLong, TimeUnit paramTimeUnit)
  {
    Args.notNull(paramObject1, "Route");
    Args.notNull(paramObject2, "Connection");
    String str = "Time unit";
    Args.notNull(paramTimeUnit, str);
    this.id = paramString;
    this.route = paramObject1;
    this.conn = paramObject2;
    long l1 = System.currentTimeMillis();
    this.created = l1;
    l1 = 0L;
    boolean bool = paramLong < l1;
    if (bool)
    {
      l1 = this.created;
      long l2 = paramTimeUnit.toMillis(paramLong);
      l1 += l2;
    }
    for (this.validUnit = l1;; this.validUnit = l1)
    {
      l1 = this.validUnit;
      this.expiry = l1;
      return;
      l1 = Long.MAX_VALUE;
    }
  }
  
  public abstract void close();
  
  public Object getConnection()
  {
    return this.conn;
  }
  
  public long getCreated()
  {
    return this.created;
  }
  
  public long getExpiry()
  {
    try
    {
      long l = this.expiry;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public Object getRoute()
  {
    return this.route;
  }
  
  public Object getState()
  {
    return this.state;
  }
  
  public long getUpdated()
  {
    try
    {
      long l = this.updated;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public long getValidUnit()
  {
    return this.validUnit;
  }
  
  public abstract boolean isClosed();
  
  /* Error */
  public boolean isExpired(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 62	org/apache/http/pool/PoolEntry:expiry	J
    //   6: lstore_3
    //   7: lload_1
    //   8: lload_3
    //   9: lcmp
    //   10: istore 5
    //   12: iload 5
    //   14: iflt +11 -> 25
    //   17: iconst_1
    //   18: istore 5
    //   20: aload_0
    //   21: monitorexit
    //   22: iload 5
    //   24: ireturn
    //   25: iconst_0
    //   26: istore 5
    //   28: aconst_null
    //   29: astore 6
    //   31: goto -11 -> 20
    //   34: astore 6
    //   36: aload_0
    //   37: monitorexit
    //   38: aload 6
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	PoolEntry
    //   0	41	1	paramLong	long
    //   6	3	3	l	long
    //   10	17	5	bool	boolean
    //   29	1	6	localObject1	Object
    //   34	5	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	34	finally
  }
  
  public void setState(Object paramObject)
  {
    this.state = paramObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[id:");
    Object localObject = this.id;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("][route:");
    localObject = this.route;
    localStringBuilder.append(localObject);
    localStringBuilder.append("][state:");
    localObject = this.state;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  /* Error */
  public void updateExpiry(long paramLong, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 40
    //   4: astore 4
    //   6: aload_3
    //   7: aload 4
    //   9: invokestatic 36	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   12: pop
    //   13: invokestatic 52	java/lang/System:currentTimeMillis	()J
    //   16: lstore 5
    //   18: aload_0
    //   19: lload 5
    //   21: putfield 68	org/apache/http/pool/PoolEntry:updated	J
    //   24: lconst_0
    //   25: lstore 5
    //   27: lload_1
    //   28: lload 5
    //   30: lcmp
    //   31: istore 7
    //   33: iload 7
    //   35: ifle +47 -> 82
    //   38: aload_0
    //   39: getfield 68	org/apache/http/pool/PoolEntry:updated	J
    //   42: lstore 5
    //   44: aload_3
    //   45: lload_1
    //   46: invokevirtual 58	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   49: lstore 8
    //   51: lload 5
    //   53: lload 8
    //   55: ladd
    //   56: lstore 5
    //   58: aload_0
    //   59: getfield 60	org/apache/http/pool/PoolEntry:validUnit	J
    //   62: lstore 8
    //   64: lload 5
    //   66: lload 8
    //   68: invokestatic 97	java/lang/Math:min	(JJ)J
    //   71: lstore 5
    //   73: aload_0
    //   74: lload 5
    //   76: putfield 62	org/apache/http/pool/PoolEntry:expiry	J
    //   79: aload_0
    //   80: monitorexit
    //   81: return
    //   82: ldc2_w 63
    //   85: lstore 5
    //   87: goto -29 -> 58
    //   90: astore 4
    //   92: aload_0
    //   93: monitorexit
    //   94: aload 4
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	PoolEntry
    //   0	97	1	paramLong	long
    //   0	97	3	paramTimeUnit	TimeUnit
    //   4	4	4	str	String
    //   90	5	4	localObject	Object
    //   16	70	5	l1	long
    //   31	3	7	bool	boolean
    //   49	18	8	l2	long
    // Exception table:
    //   from	to	target	type
    //   7	13	90	finally
    //   13	16	90	finally
    //   19	24	90	finally
    //   38	42	90	finally
    //   45	49	90	finally
    //   58	62	90	finally
    //   66	71	90	finally
    //   74	79	90	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\pool\PoolEntry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */