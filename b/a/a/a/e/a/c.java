package b.a.a.a.e.a;

import b.a.a.a.o.a;
import java.util.concurrent.ConcurrentHashMap;

public final class c
  implements b
{
  private final ConcurrentHashMap a;
  private volatile int b;
  
  public c()
  {
    this(2);
  }
  
  public c(int paramInt)
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.a = localConcurrentHashMap;
    a(paramInt);
  }
  
  public int a(b.a.a.a.e.b.b paramb)
  {
    a.a(paramb, "HTTP route");
    Integer localInteger = (Integer)this.a.get(paramb);
    if (localInteger != null) {}
    for (int i = localInteger.intValue();; i = this.b) {
      return i;
    }
  }
  
  public void a(int paramInt)
  {
    a.a(paramInt, "Defautl max per route");
    this.b = paramInt;
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\a\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */