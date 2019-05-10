package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import com.google.gson.Gson;
import com.loopj.android.http.PersistentCookieStore;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.g;
import id.ac.ugm.presensi.presensimahasiswa.Home.response.AccountActivity;

class LogoutService$1
  extends CountDownTimer
{
  LogoutService$1(LogoutService paramLogoutService, long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
  }
  
  public void onFinish()
  {
    Object localObject1 = this.a;
    Object localObject2 = new com/loopj/android/http/PersistentCookieStore;
    LogoutService localLogoutService = this.a;
    ((PersistentCookieStore)localObject2).<init>(localLogoutService);
    LogoutService.a((LogoutService)localObject1, (PersistentCookieStore)localObject2);
    f.a(this.a.getApplicationContext(), "mk_finished", true);
    localObject1 = f.b(this.a, "data_local", "");
    localObject2 = this.a;
    localObject1 = (g)LogoutService.a(this.a).fromJson((String)localObject1, g.class);
    ((LogoutService)localObject2).b = ((g)localObject1);
    LogoutService.b(this.a);
    localObject1 = new android/content/Intent;
    localObject2 = this.a.getApplicationContext();
    ((Intent)localObject1).<init>((Context)localObject2, AccountActivity.class);
    ((Intent)localObject1).setFlags(268468224);
    this.a.startActivity((Intent)localObject1);
  }
  
  public void onTick(long paramLong)
  {
    this.a.a.putExtra("countdown", paramLong);
    LogoutService localLogoutService = this.a;
    Intent localIntent = this.a.a;
    localLogoutService.sendBroadcast(localIntent);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\LogoutService$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */