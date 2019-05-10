package io.fabric.sdk.android.services.concurrency;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

class AsyncTask$2
  extends AsyncTask.WorkerRunnable
{
  AsyncTask$2(AsyncTask paramAsyncTask)
  {
    super(null);
  }
  
  public Object call()
  {
    AsyncTask.access$200(this.this$0).set(true);
    Process.setThreadPriority(10);
    AsyncTask localAsyncTask = this.this$0;
    Object localObject = this.this$0;
    Object[] arrayOfObject = this.params;
    localObject = ((AsyncTask)localObject).doInBackground(arrayOfObject);
    return AsyncTask.access$300(localAsyncTask, localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\AsyncTask$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */