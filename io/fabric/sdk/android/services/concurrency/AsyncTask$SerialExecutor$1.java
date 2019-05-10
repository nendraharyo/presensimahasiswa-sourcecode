package io.fabric.sdk.android.services.concurrency;

class AsyncTask$SerialExecutor$1
  implements Runnable
{
  AsyncTask$SerialExecutor$1(AsyncTask.SerialExecutor paramSerialExecutor, Runnable paramRunnable) {}
  
  public void run()
  {
    try
    {
      Runnable localRunnable = this.val$r;
      localRunnable.run();
      return;
    }
    finally
    {
      this.this$0.scheduleNext();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\AsyncTask$SerialExecutor$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */