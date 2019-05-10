package android.support.v4.app;

import android.app.Activity;
import android.content.pm.PackageManager;

final class a$1
  implements Runnable
{
  a$1(String[] paramArrayOfString, Activity paramActivity, int paramInt) {}
  
  public void run()
  {
    int[] arrayOfInt = new int[this.a.length];
    PackageManager localPackageManager = this.b.getPackageManager();
    Object localObject = this.b.getPackageName();
    int i = this.a.length;
    int j = 0;
    a.a locala = null;
    while (j < i)
    {
      String str = this.a[j];
      int k = localPackageManager.checkPermission(str, (String)localObject);
      arrayOfInt[j] = k;
      j += 1;
    }
    locala = (a.a)this.b;
    int m = this.c;
    localObject = this.a;
    locala.onRequestPermissionsResult(m, (String[])localObject, arrayOfInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\a$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */