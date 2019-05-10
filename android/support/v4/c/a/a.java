package android.support.v4.c.a;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.Display;
import java.util.WeakHashMap;

public abstract class a
{
  private static final WeakHashMap a;
  
  static
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    a = localWeakHashMap;
  }
  
  public static a a(Context paramContext)
  {
    synchronized (a)
    {
      Object localObject1 = a;
      localObject1 = ((WeakHashMap)localObject1).get(paramContext);
      localObject1 = (a)localObject1;
      if (localObject1 == null)
      {
        int i = Build.VERSION.SDK_INT;
        int j = 17;
        if (i >= j)
        {
          localObject1 = new android/support/v4/c/a/a$b;
          ((a.b)localObject1).<init>(paramContext);
          WeakHashMap localWeakHashMap2 = a;
          localWeakHashMap2.put(paramContext, localObject1);
        }
      }
      else
      {
        return (a)localObject1;
      }
      localObject1 = new android/support/v4/c/a/a$a;
      ((a.a)localObject1).<init>(paramContext);
    }
  }
  
  public abstract Display a(int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\c\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */