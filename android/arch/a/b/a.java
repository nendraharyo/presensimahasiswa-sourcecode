package android.arch.a.b;

import java.util.HashMap;
import java.util.Map.Entry;

public class a
  extends b
{
  private HashMap a;
  
  public a()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.a = localHashMap;
  }
  
  protected b.c a(Object paramObject)
  {
    return (b.c)this.a.get(paramObject);
  }
  
  public Object a(Object paramObject1, Object paramObject2)
  {
    Object localObject = a(paramObject1);
    if (localObject != null) {}
    for (localObject = ((b.c)localObject).b;; localObject = null)
    {
      return localObject;
      localObject = this.a;
      b.c localc = b(paramObject1, paramObject2);
      ((HashMap)localObject).put(paramObject1, localc);
    }
  }
  
  public Object b(Object paramObject)
  {
    Object localObject = super.b(paramObject);
    this.a.remove(paramObject);
    return localObject;
  }
  
  public boolean c(Object paramObject)
  {
    return this.a.containsKey(paramObject);
  }
  
  public Map.Entry d(Object paramObject)
  {
    boolean bool = c(paramObject);
    if (bool) {}
    for (b.c localc = ((b.c)this.a.get(paramObject)).d;; localc = null)
    {
      return localc;
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\a\b\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */