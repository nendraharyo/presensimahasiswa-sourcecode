package id.ac.ugm.presensi.presensimahasiswa;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity
  extends Activity
{
  private TextView a;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131427362);
    int i = 2131296582;
    Object localObject1 = (TextView)findViewById(i);
    this.a = ((TextView)localObject1);
    localObject1 = "";
    try
    {
      localObject2 = getPackageManager();
      String str = getPackageName();
      localObject2 = ((PackageManager)localObject2).getPackageInfo(str, 0);
      localObject1 = ((PackageInfo)localObject2).versionName;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject2;
      for (;;) {}
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = "Versi v" + (String)localObject1;
    this.a.setText((CharSequence)localObject1);
    localObject1 = new id/ac/ugm/presensi/presensimahasiswa/SplashActivity$1;
    ((SplashActivity.1)localObject1).<init>(this);
    ((Thread)localObject1).start();
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\SplashActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */