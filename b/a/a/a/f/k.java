package b.a.a.a.f;

import b.a.a.a.l.e;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public final class k
  implements b.a.a.a.d.a
{
  private final ConcurrentHashMap a;
  
  public k()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.a = localConcurrentHashMap;
  }
  
  public h a(String paramString, e parame)
  {
    b.a.a.a.o.a.a(paramString, "Name");
    Object localObject1 = this.a;
    Object localObject2 = Locale.ENGLISH;
    localObject2 = paramString.toLowerCase((Locale)localObject2);
    localObject1 = (i)((ConcurrentHashMap)localObject1).get(localObject2);
    if (localObject1 != null) {
      return ((i)localObject1).a(parame);
    }
    localObject1 = new java/lang/IllegalStateException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Unsupported cookie spec: " + paramString;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public j a(String paramString)
  {
    k.1 local1 = new b/a/a/a/f/k$1;
    local1.<init>(this, paramString);
    return local1;
  }
  
  public void a(String paramString, i parami)
  {
    b.a.a.a.o.a.a(paramString, "Name");
    b.a.a.a.o.a.a(parami, "Cookie spec factory");
    ConcurrentHashMap localConcurrentHashMap = this.a;
    Object localObject = Locale.ENGLISH;
    localObject = paramString.toLowerCase((Locale)localObject);
    localConcurrentHashMap.put(localObject, parami);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\f\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */