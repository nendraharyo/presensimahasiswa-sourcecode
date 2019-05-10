package android.arch.lifecycle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class p
{
  private final HashMap a;
  
  public p()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.a = localHashMap;
  }
  
  final n a(String paramString)
  {
    return (n)this.a.get(paramString);
  }
  
  public final void a()
  {
    Object localObject = this.a.values();
    Iterator localIterator = ((Collection)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (n)localIterator.next();
      ((n)localObject).a();
    }
    this.a.clear();
  }
  
  final void a(String paramString, n paramn)
  {
    n localn = (n)this.a.get(paramString);
    if (localn != null) {
      localn.a();
    }
    this.a.put(paramString, paramn);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */