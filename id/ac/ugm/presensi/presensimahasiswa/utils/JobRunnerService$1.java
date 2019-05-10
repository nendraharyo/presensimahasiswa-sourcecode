package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.app.job.JobParameters;
import android.content.Context;
import android.os.Handler.Callback;
import android.os.Message;
import com.google.gson.Gson;
import com.loopj.android.http.PersistentCookieStore;

class JobRunnerService$1
  implements Handler.Callback
{
  JobRunnerService$1(JobRunnerService paramJobRunnerService) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    Object localObject1 = this.a;
    Object localObject2 = new com/loopj/android/http/PersistentCookieStore;
    Object localObject3 = this.a;
    ((PersistentCookieStore)localObject2).<init>((Context)localObject3);
    JobRunnerService.a((JobRunnerService)localObject1, (PersistentCookieStore)localObject2);
    localObject1 = this.a;
    localObject2 = new com/google/gson/Gson;
    ((Gson)localObject2).<init>();
    JobRunnerService.a((JobRunnerService)localObject1, (Gson)localObject2);
    localObject1 = this.a;
    localObject2 = this.a.getApplicationContext();
    localObject3 = "data_history";
    String str = "";
    localObject2 = f.b((Context)localObject2, (String)localObject3, str);
    JobRunnerService.a((JobRunnerService)localObject1, (String)localObject2);
    localObject1 = JobRunnerService.a(this.a);
    localObject2 = "";
    boolean bool = ((String)localObject1).equals(localObject2);
    if (!bool)
    {
      localObject1 = this.a;
      JobRunnerService.b((JobRunnerService)localObject1);
    }
    localObject2 = this.a;
    localObject1 = (JobParameters)paramMessage.obj;
    ((JobRunnerService)localObject2).jobFinished((JobParameters)localObject1, false);
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\JobRunnerService$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */