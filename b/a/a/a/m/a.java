package b.a.a.a.m;

import java.util.concurrent.TimeUnit;

public abstract class a
{
  private final String a;
  private final Object b;
  private final Object c;
  private final long d;
  private final long e;
  private long f;
  private long g;
  private volatile Object h;
  
  public a(String paramString, Object paramObject1, Object paramObject2, long paramLong, TimeUnit paramTimeUnit)
  {
    b.a.a.a.o.a.a(paramObject1, "Route");
    b.a.a.a.o.a.a(paramObject2, "Connection");
    String str = "Time unit";
    b.a.a.a.o.a.a(paramTimeUnit, str);
    this.a = paramString;
    this.b = paramObject1;
    this.c = paramObject2;
    long l1 = System.currentTimeMillis();
    this.d = l1;
    l1 = 0L;
    boolean bool = paramLong < l1;
    if (bool)
    {
      l1 = this.d;
      long l2 = paramTimeUnit.toMillis(paramLong);
      l1 += l2;
    }
    for (this.e = l1;; this.e = l1)
    {
      l1 = this.e;
      this.g = l1;
      return;
      l1 = Long.MAX_VALUE;
    }
  }
  
  /* Error */
  public void a(long paramLong, TimeUnit paramTimeUnit)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 30
    //   4: astore 4
    //   6: aload_3
    //   7: aload 4
    //   9: invokestatic 26	b/a/a/a/o/a:a	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   12: pop
    //   13: invokestatic 42	java/lang/System:currentTimeMillis	()J
    //   16: lstore 5
    //   18: aload_0
    //   19: lload 5
    //   21: putfield 58	b/a/a/a/m/a:f	J
    //   24: lconst_0
    //   25: lstore 5
    //   27: lload_1
    //   28: lload 5
    //   30: lcmp
    //   31: istore 7
    //   33: iload 7
    //   35: ifle +47 -> 82
    //   38: aload_0
    //   39: getfield 58	b/a/a/a/m/a:f	J
    //   42: lstore 5
    //   44: aload_3
    //   45: lload_1
    //   46: invokevirtual 50	java/util/concurrent/TimeUnit:toMillis	(J)J
    //   49: lstore 8
    //   51: lload 5
    //   53: lload 8
    //   55: ladd
    //   56: lstore 5
    //   58: aload_0
    //   59: getfield 52	b/a/a/a/m/a:e	J
    //   62: lstore 8
    //   64: lload 5
    //   66: lload 8
    //   68: invokestatic 64	java/lang/Math:min	(JJ)J
    //   71: lstore 5
    //   73: aload_0
    //   74: lload 5
    //   76: putfield 54	b/a/a/a/m/a:g	J
    //   79: aload_0
    //   80: monitorexit
    //   81: return
    //   82: ldc2_w 55
    //   85: lstore 5
    //   87: goto -29 -> 58
    //   90: astore 4
    //   92: aload_0
    //   93: monitorexit
    //   94: aload 4
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	a
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
  
  public void a(Object paramObject)
  {
    this.h = paramObject;
  }
  
  /* Error */
  public boolean a(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 54	b/a/a/a/m/a:g	J
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
    //   0	41	0	this	a
    //   0	41	1	paramLong	long
    //   6	3	3	l	long
    //   10	17	5	bool	boolean
    //   29	1	6	localObject1	Object
    //   34	5	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	34	finally
  }
  
  public Object f()
  {
    return this.b;
  }
  
  public Object g()
  {
    return this.c;
  }
  
  public long h()
  {
    try
    {
      long l = this.g;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[id:");
    Object localObject = this.a;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("][route:");
    localObject = this.b;
    localStringBuilder.append(localObject);
    localStringBuilder.append("][state:");
    localObject = this.h;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\m\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */