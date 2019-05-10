package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class k
  extends TreeMap
{
  private final List a;
  private double b;
  
  private void a()
  {
    Object localObject = this.a;
    int i = ((List)localObject).size();
    int j = 2;
    double d1;
    if (i < j)
    {
      d1 = 0.0D;
      this.b = d1;
    }
    for (;;)
    {
      return;
      localObject = this.a;
      j = this.a.size() + -1;
      double d2 = ((Double)((List)localObject).get(j)).doubleValue();
      localObject = this.a;
      List localList = this.a;
      j = localList.size() + -2;
      localObject = (Double)((List)localObject).get(j);
      d1 = ((Double)localObject).doubleValue();
      d1 = Math.abs(d2 - d1);
      d2 = this.b;
      boolean bool = d1 < d2;
      if (bool)
      {
        localObject = this.a;
        j = this.a.size() + -1;
        d2 = ((Double)((List)localObject).get(j)).doubleValue();
        localObject = this.a;
        localList = this.a;
        j = localList.size() + -2;
        localObject = (Double)((List)localObject).get(j);
        d1 = ((Double)localObject).doubleValue();
        d1 = Math.abs(d2 - d1);
        this.b = d1;
      }
    }
  }
  
  public int a(Object paramObject)
  {
    return Collections.binarySearch(this.a, paramObject, null);
  }
  
  public Object a(int paramInt)
  {
    return this.a.get(paramInt);
  }
  
  public Object b(int paramInt)
  {
    Object localObject = this.a.get(paramInt);
    return get(localObject);
  }
  
  public void clear()
  {
    a();
    super.clear();
    this.a.clear();
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    this.a.add(paramObject1);
    a();
    return super.put(paramObject1, paramObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */