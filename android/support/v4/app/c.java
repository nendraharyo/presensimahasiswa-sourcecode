package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;

public final class c
{
  public static int a(Context paramContext, String paramString1, String paramString2)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    AppOpsManager localAppOpsManager;
    if (i >= j) {
      localAppOpsManager = (AppOpsManager)paramContext.getSystemService(AppOpsManager.class);
    }
    for (i = localAppOpsManager.noteProxyOpNoThrow(paramString1, paramString2);; i = 1) {
      return i;
    }
  }
  
  public static String a(String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j) {}
    for (String str = AppOpsManager.permissionToOp(paramString);; str = null)
    {
      return str;
      i = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */