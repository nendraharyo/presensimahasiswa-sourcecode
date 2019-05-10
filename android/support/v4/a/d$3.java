package android.support.v4.a;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class d$3
  extends FutureTask
{
  d$3(d paramd, Callable paramCallable)
  {
    super(paramCallable);
  }
  
  protected void done()
  {
    Object localObject2;
    try
    {
      Object localObject1 = get();
      localObject2 = this.a;
      ((d)localObject2).c(localObject1);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localObject2 = "AsyncTask";
        Log.w((String)localObject2, localInterruptedException);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      localObject2 = new java/lang/RuntimeException;
      Throwable localThrowable1 = localExecutionException.getCause();
      ((RuntimeException)localObject2).<init>("An error occurred while executing doInBackground()", localThrowable1);
      throw ((Throwable)localObject2);
    }
    catch (CancellationException localCancellationException)
    {
      for (;;)
      {
        d locald = this.a;
        localObject2 = null;
        locald.c(null);
      }
    }
    finally
    {
      localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>("An error occurred while executing doInBackground()", localThrowable2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\d$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */