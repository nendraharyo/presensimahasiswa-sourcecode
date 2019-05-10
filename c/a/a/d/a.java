package c.a.a.d;

import java.util.ArrayList;
import java.util.Iterator;

public class a
{
  public static boolean a = false;
  private static ArrayList b;
  private Object c;
  
  static
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    b = localArrayList;
  }
  
  public a(Object paramObject)
  {
    this.c = paramObject;
    b.add(this);
  }
  
  public static void a()
  {
    ArrayList localArrayList = b;
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    b = (ArrayList)localObject;
    Iterator localIterator = localArrayList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool)
      {
        localArrayList.clear();
        return;
      }
      localObject = (a)localIterator.next();
      ((a)localObject).c();
    }
  }
  
  public Object b()
  {
    return this.c;
  }
  
  public void c()
  {
    this.c = null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\c\a\a\d\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */