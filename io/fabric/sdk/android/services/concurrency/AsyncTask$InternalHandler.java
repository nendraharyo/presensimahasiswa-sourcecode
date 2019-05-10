package io.fabric.sdk.android.services.concurrency;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class AsyncTask$InternalHandler
  extends Handler
{
  public AsyncTask$InternalHandler()
  {
    super(localLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject = (AsyncTask.AsyncTaskResult)paramMessage.obj;
    int i = paramMessage.what;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      AsyncTask localAsyncTask = ((AsyncTask.AsyncTaskResult)localObject).task;
      localObject = localObject.data[0];
      AsyncTask.access$500(localAsyncTask, localObject);
      continue;
      localAsyncTask = ((AsyncTask.AsyncTaskResult)localObject).task;
      localObject = ((AsyncTask.AsyncTaskResult)localObject).data;
      localAsyncTask.onProgressUpdate((Object[])localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\AsyncTask$InternalHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */