package io.fabric.sdk.android.services.concurrency;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class AsyncTask$3
  extends FutureTask
{
  AsyncTask$3(AsyncTask paramAsyncTask, Callable paramCallable)
  {
    super(paramCallable);
  }
  
  protected void done()
  {
    try
    {
      AsyncTask localAsyncTask1 = this.this$0;
      localObject = get();
      AsyncTask.access$400(localAsyncTask1, localObject);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localObject = "AsyncTask";
        Log.w((String)localObject, localInterruptedException);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      localObject = new java/lang/RuntimeException;
      Throwable localThrowable = localExecutionException.getCause();
      ((RuntimeException)localObject).<init>("An error occured while executing doInBackground()", localThrowable);
      throw ((Throwable)localObject);
    }
    catch (CancellationException localCancellationException)
    {
      for (;;)
      {
        AsyncTask localAsyncTask2 = this.this$0;
        Object localObject = null;
        AsyncTask.access$400(localAsyncTask2, null);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\AsyncTask$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */