package android.support.v4.f;

import android.support.v4.h.m;
import java.util.ArrayList;

final class b$3
  implements c.a
{
  b$3(String paramString) {}
  
  public void a(b.c paramc)
  {
    synchronized ()
    {
      Object localObject2 = b.c();
      Object localObject4 = this.a;
      localObject2 = ((m)localObject2).get(localObject4);
      localObject2 = (ArrayList)localObject2;
      if (localObject2 == null) {}
      do
      {
        return;
        localObject4 = b.c();
        String str = this.a;
        ((m)localObject4).remove(str);
        i = 0;
        ??? = null;
        j = 0;
        localObject4 = null;
        i = ((ArrayList)localObject2).size();
      } while (j >= i);
      ??? = (c.a)((ArrayList)localObject2).get(j);
      ((c.a)???).a(paramc);
      int i = j + 1;
      int j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\f\b$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */