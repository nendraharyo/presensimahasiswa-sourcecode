package b.a.a.a.n;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a
  implements e
{
  private final e a;
  private final Map b;
  
  public a()
  {
    this(null);
  }
  
  public a(e parame)
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.b = localConcurrentHashMap;
    this.a = parame;
  }
  
  public Object a(String paramString)
  {
    b.a.a.a.o.a.a(paramString, "Id");
    Object localObject = this.b.get(paramString);
    if (localObject == null)
    {
      e locale = this.a;
      if (locale != null) {
        localObject = this.a.a(paramString);
      }
    }
    return localObject;
  }
  
  public void a(String paramString, Object paramObject)
  {
    Object localObject = "Id";
    b.a.a.a.o.a.a(paramString, (String)localObject);
    if (paramObject != null)
    {
      localObject = this.b;
      ((Map)localObject).put(paramString, paramObject);
    }
    for (;;)
    {
      return;
      localObject = this.b;
      ((Map)localObject).remove(paramString);
    }
  }
  
  public String toString()
  {
    return this.b.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */