package android.support.v4.h;

import android.os.Build.VERSION;
import java.util.Objects;

public class i
{
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    boolean bool;
    if (i >= j) {
      bool = Objects.equals(paramObject1, paramObject2);
    }
    for (;;)
    {
      return bool;
      if (paramObject1 != paramObject2)
      {
        if (paramObject1 != null)
        {
          bool = paramObject1.equals(paramObject2);
          if (!bool) {}
        }
      }
      else
      {
        bool = true;
        continue;
      }
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */