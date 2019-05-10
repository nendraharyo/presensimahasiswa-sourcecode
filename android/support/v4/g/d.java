package android.support.v4.g;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

public final class d
{
  private static final Locale a;
  
  static
  {
    Locale localLocale = new java/util/Locale;
    localLocale.<init>("", "");
    a = localLocale;
  }
  
  public static int a(Locale paramLocale)
  {
    int i = Build.VERSION.SDK_INT;
    int k = 17;
    if (i >= k) {
      i = TextUtils.getLayoutDirectionFromLocale(paramLocale);
    }
    for (;;)
    {
      return i;
      if (paramLocale != null)
      {
        localObject = a;
        boolean bool1 = paramLocale.equals(localObject);
        if (!bool1)
        {
          localObject = a.a(paramLocale);
          if (localObject == null)
          {
            int j = b(paramLocale);
            continue;
          }
          String str = "Arab";
          boolean bool3 = ((String)localObject).equalsIgnoreCase(str);
          if (!bool3)
          {
            str = "Hebr";
            bool2 = ((String)localObject).equalsIgnoreCase(str);
            if (!bool2) {}
          }
          else
          {
            bool2 = true;
            continue;
          }
        }
      }
      boolean bool2 = false;
      Object localObject = null;
    }
  }
  
  private static int b(Locale paramLocale)
  {
    int i = 0;
    String str = paramLocale.getDisplayName(paramLocale);
    int j = Character.getDirectionality(str.charAt(0));
    switch (j)
    {
    }
    for (;;)
    {
      return i;
      i = 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\g\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */