package b.a.a.a.a;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public final class f
  implements b.a.a.a.d.a
{
  private final ConcurrentHashMap a;
  
  public f()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.a = localConcurrentHashMap;
  }
  
  public c a(String paramString, b.a.a.a.l.e parame)
  {
    b.a.a.a.o.a.a(paramString, "Name");
    Object localObject1 = this.a;
    Object localObject2 = Locale.ENGLISH;
    localObject2 = paramString.toLowerCase((Locale)localObject2);
    localObject1 = (d)((ConcurrentHashMap)localObject1).get(localObject2);
    if (localObject1 != null) {
      return ((d)localObject1).a(parame);
    }
    localObject1 = new java/lang/IllegalStateException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Unsupported authentication scheme: " + paramString;
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public e a(String paramString)
  {
    f.1 local1 = new b/a/a/a/a/f$1;
    local1.<init>(this, paramString);
    return local1;
  }
  
  public void a(String paramString, d paramd)
  {
    b.a.a.a.o.a.a(paramString, "Name");
    b.a.a.a.o.a.a(paramd, "Authentication scheme factory");
    ConcurrentHashMap localConcurrentHashMap = this.a;
    Object localObject = Locale.ENGLISH;
    localObject = paramString.toLowerCase((Locale)localObject);
    localConcurrentHashMap.put(localObject, paramd);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\a\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */