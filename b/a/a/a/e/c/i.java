package b.a.a.a.e.c;

import b.a.a.a.n;
import b.a.a.a.o.a;
import java.util.concurrent.ConcurrentHashMap;

public final class i
{
  private final ConcurrentHashMap a;
  
  public i()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.a = localConcurrentHashMap;
  }
  
  public final e a(e parame)
  {
    a.a(parame, "Scheme");
    ConcurrentHashMap localConcurrentHashMap = this.a;
    String str = parame.c();
    return (e)localConcurrentHashMap.put(str, parame);
  }
  
  public final e a(n paramn)
  {
    a.a(paramn, "Host");
    String str = paramn.c();
    return a(str);
  }
  
  public final e a(String paramString)
  {
    Object localObject1 = b(paramString);
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Scheme '" + paramString + "' not registered.";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return (e)localObject1;
  }
  
  public final e b(String paramString)
  {
    a.a(paramString, "Scheme name");
    return (e)this.a.get(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\c\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */