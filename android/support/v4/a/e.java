package android.support.v4.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.support.v4.app.c;

public final class e
{
  public static int a(Context paramContext, String paramString)
  {
    int i = Process.myPid();
    int j = Process.myUid();
    String str = paramContext.getPackageName();
    return a(paramContext, paramString, i, j, str);
  }
  
  public static int a(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    int i = -1;
    int j = paramContext.checkPermission(paramString1, paramInt1, paramInt2);
    if (j == i) {}
    for (;;)
    {
      return i;
      String str = c.a(paramString1);
      if (str == null)
      {
        i = 0;
      }
      else if (paramString2 == null)
      {
        String[] arrayOfString = paramContext.getPackageManager().getPackagesForUid(paramInt2);
        if (arrayOfString != null)
        {
          int k = arrayOfString.length;
          if (k > 0) {
            paramString2 = arrayOfString[0];
          }
        }
      }
      else
      {
        i = c.a(paramContext, str, paramString2);
        if (i != 0) {
          i = -2;
        } else {
          i = 0;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */