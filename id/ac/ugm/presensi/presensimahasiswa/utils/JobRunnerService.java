package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.Message;
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

public class JobRunnerService
  extends JobService
{
  private PersistentCookieStore a;
  private String b;
  private Gson c;
  private Handler d;
  
  public JobRunnerService()
  {
    Handler localHandler = new android/os/Handler;
    JobRunnerService.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/utils/JobRunnerService$1;
    local1.<init>(this);
    localHandler.<init>(local1);
    this.d = localHandler;
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
    localObject2 = this.a;
    localAsyncHttpClient.setCookieStore((h)localObject2);
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/utils/JobRunnerService$2;
    ((JobRunnerService.2)localObject2).<init>(this);
    localAsyncHttpClient.get((String)localObject1, localRequestParams, (ResponseHandlerInterface)localObject2);
  }
  
  private void a(String paramString1, String paramString2)
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
    localObject2 = new com/loopj/android/http/RequestParams;
    ((RequestParams)localObject2).<init>();
    Object localObject3 = (TelephonyManager)getSystemService("phone");
    localObject1 = Settings.Secure.getString(getContentResolver(), "android_id");
    localObject3 = f.b(this, "data_local", "");
    localObject3 = (g)this.c.fromJson((String)localObject3, g.class);
    ((RequestParams)localObject2).add(paramString1, paramString2);
    ((RequestParams)localObject2).add("device", (String)localObject1);
    str = this.b;
    ((RequestParams)localObject2).add("mahasiswa", str);
    localObject1 = ((g)localObject3).a();
    int i = f.b(getApplicationContext(), "kode_mk", 0);
    localObject1 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject1).get(i)).c();
    ((RequestParams)localObject2).add("dosen", (String)localObject1);
    localObject1 = ((g)localObject3).a();
    i = f.b(getApplicationContext(), "kode_mk", 0);
    localObject1 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject1).get(i)).e();
    ((RequestParams)localObject2).add("kelas", (String)localObject1);
    localObject1 = ((g)localObject3).a();
    i = f.b(getApplicationContext(), "kode_mk", 0);
    localObject1 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject1).get(i)).o();
    ((RequestParams)localObject2).add("pertemuan", (String)localObject1);
    localObject3 = ((g)localObject3).a();
    int j = f.b(getApplicationContext(), "kode_mk", 0);
    localObject3 = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.f)((List)localObject3).get(j)).n();
    ((RequestParams)localObject2).add("user", (String)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject1 = a.c;
    localObject3 = ((StringBuilder)localObject3).append((String)localObject1);
    localObject1 = a.j;
    localObject3 = (String)localObject1;
    localObject1 = this.a;
    localAsyncHttpClient.setCookieStore((h)localObject1);
    localAsyncHttpClient.setMaxRetriesAndTimeout(1, 999);
    localObject1 = new id/ac/ugm/presensi/presensimahasiswa/utils/JobRunnerService$3;
    ((JobRunnerService.3)localObject1).<init>(this);
    localAsyncHttpClient.post((String)localObject3, (RequestParams)localObject2, (ResponseHandlerInterface)localObject1);
  }
  
  public boolean onStartJob(JobParameters paramJobParameters)
  {
    int i = 1;
    Handler localHandler = this.d;
    Message localMessage = Message.obtain(this.d, i, paramJobParameters);
    localHandler.sendMessage(localMessage);
    return i;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters)
  {
    this.d.removeMessages(1);
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\JobRunnerService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */