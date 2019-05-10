package android.support.v7.recyclerview.extensions;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

class AsyncDifferConfig$Builder$MainThreadExecutor
  implements Executor
{
  final Handler mHandler;
  
  private AsyncDifferConfig$Builder$MainThreadExecutor()
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    this.mHandler = localHandler;
  }
  
  public void execute(Runnable paramRunnable)
  {
    this.mHandler.post(paramRunnable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\recyclerview\extensions\AsyncDifferConfig$Builder$MainThreadExecutor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */