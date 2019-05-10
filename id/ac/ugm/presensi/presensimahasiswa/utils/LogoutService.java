package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.app.Service;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.Base64;
import b.a.a.a.b.h;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.PersistentCookieStore;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.ResponseHandlerInterface;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.g;
import id.ac.ugm.presensi.presensimahasiswa.a;
import java.util.List;

public class LogoutService
  extends Service
{
  Intent a;
  g b;
  CountDownTimer c;
  private PersistentCookieStore d;
  private Gson e;
  
  public LogoutService()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("id.ac.ugm.presensi.presensimahasiswa.countdown_br");
    this.a = localIntent;
    this.c = null;
  }
  
  private void a()
  {
    AsyncHttpClient localAsyncHttpClient = new com/loopj/android/http/AsyncHttpClient;
    localAsyncHttpClient.<init>();
    localAsyncHttpClient.addHeader("UGMFWSERVICE", "1");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = a.a;
    localObject2 = ((StringBuilder)localObject2).append(str).append(":");
    str = a.b;
    localObject2 = Base64.encodeToString(str.getBytes(), 2);
    localObject1 = (String)localObject2;
    localAsyncHttpClient.addHeader("Authorization", (String)localObject1);
    RequestParams localRequestParams = new com/loopj/android/http/RequestParams;
    localRequestParams.<init>();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = a.c;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = a.d;
    localObject1 = (String)localObject2;
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject2 = this.d;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService$2;
    ((LogoutService.2)localObject2).<init>(this);
    localAsyncHttpClient.get((String)localObject1, localRequestParams, (ResponseHandlerInterface)localObject2);
  }
  
  private void a(String paramString1, String paramString2)
  {
    int i = f.b(this, "kode_mk", 0);
    AsyncHttpClient localAsyncHttpClient = new com/loopj/android/http/AsyncHttpClient;
    localAsyncHttpClient.<init>();
    localAsyncHttpClient.addHeader("UGMFWSERVICE", "1");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Basic ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = a.a;
    localObject2 = ((StringBuilder)localObject2).append(str).append(":");
    str = a.b;
    localObject2 = Base64.encodeToString(str.getBytes(), 2);
    localObject1 = (String)localObject2;
    localAsyncHttpClient.addHeader("Authorization", (String)localObject1);
    localObject1 = new com/loopj/android/http/RequestParams;
    ((RequestParams)localObject1).<init>();
    Object localObject3 = (TelephonyManager)getSystemService("phone");
    localObject3 = Settings.Secure.getString(getContentResolver(), "android_id");
    ((RequestParams)localObject1).add(paramString1, paramString2);
    ((RequestParams)localObject1).add("device", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.b.a().get(i)).c();
    ((RequestParams)localObject1).add("dosen", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.b.a().get(i)).e();
    ((RequestParams)localObject1).add("kelas", (String)localObject3);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)this.b.a().get(i)).o();
    ((RequestParams)localObject1).add("pertemuan", (String)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    Object localObject4 = a.c;
    localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
    localObject4 = a.o;
    localObject3 = (String)localObject4;
    localObject4 = this.d;
    localAsyncHttpClient.setCookieStore((h)localObject4);
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject4 = new id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService$3;
    ((LogoutService.3)localObject4).<init>(this);
    localAsyncHttpClient.post((String)localObject3, (RequestParams)localObject1, (ResponseHandlerInterface)localObject4);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    Object localObject = new com/google/gson/Gson;
    ((Gson)localObject).<init>();
    this.e = ((Gson)localObject);
    localObject = new id/ac/ugm/presensi/presensimahasiswa/utils/LogoutService$1;
    ((LogoutService.1)localObject).<init>(this, 3600000L, 1000L);
    this.c = ((CountDownTimer)localObject);
    this.c.start();
  }
  
  public void onDestroy()
  {
    this.c.cancel();
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\LogoutService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */