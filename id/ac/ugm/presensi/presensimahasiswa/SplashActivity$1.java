package id.ac.ugm.presensi.presensimahasiswa;

import android.content.Context;
import android.content.Intent;
import id.ac.ugm.presensi.presensimahasiswa.utils.f;

class SplashActivity$1
  extends Thread
{
  SplashActivity$1(SplashActivity paramSplashActivity) {}
  
  public void run()
  {
    Object localObject1 = null;
    super.run();
    long l = 1333L;
    try
    {
      sleep(l);
      f.a(this.a.getApplicationContext(), "geofence", false);
      f.a(this.a.getApplicationContext(), "all_permission", false);
      SplashActivity localSplashActivity1 = this.a;
      localObject3 = new android/content/Intent;
      localObject4 = this.a.getApplicationContext();
      localObject1 = CheckingActivity.class;
      ((Intent)localObject3).<init>((Context)localObject4, (Class)localObject1);
      localSplashActivity1.startActivity((Intent)localObject3);
      localSplashActivity1 = this.a;
      localSplashActivity1.finish();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localInterruptedException = localInterruptedException;
        f.a(this.a.getApplicationContext(), "geofence", false);
        f.a(this.a.getApplicationContext(), "all_permission", false);
        SplashActivity localSplashActivity2 = this.a;
        localObject3 = new android/content/Intent;
        localObject4 = this.a.getApplicationContext();
        localObject1 = CheckingActivity.class;
        ((Intent)localObject3).<init>((Context)localObject4, (Class)localObject1);
        localSplashActivity2.startActivity((Intent)localObject3);
        localSplashActivity2 = this.a;
        localSplashActivity2.finish();
      }
    }
    finally
    {
      localObject2 = finally;
      f.a(this.a.getApplicationContext(), "geofence", false);
      f.a(this.a.getApplicationContext(), "all_permission", false);
      Object localObject3 = this.a;
      Object localObject4 = new android/content/Intent;
      localObject1 = this.a.getApplicationContext();
      ((Intent)localObject4).<init>((Context)localObject1, CheckingActivity.class);
      ((SplashActivity)localObject3).startActivity((Intent)localObject4);
      this.a.finish();
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\SplashActivity$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */