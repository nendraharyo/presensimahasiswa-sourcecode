package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;

class GlideExecutor$DefaultThreadFactory$1
  extends Thread
{
  GlideExecutor$DefaultThreadFactory$1(GlideExecutor.DefaultThreadFactory paramDefaultThreadFactory, Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, paramString);
  }
  
  public void run()
  {
    Process.setThreadPriority(9);
    Object localObject = this.this$0;
    boolean bool = ((GlideExecutor.DefaultThreadFactory)localObject).preventNetworkOperations;
    if (bool)
    {
      localObject = new android/os/StrictMode$ThreadPolicy$Builder;
      ((StrictMode.ThreadPolicy.Builder)localObject).<init>();
      localObject = ((StrictMode.ThreadPolicy.Builder)localObject).detectNetwork().penaltyDeath().build();
      StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)localObject);
    }
    try
    {
      super.run();
      return;
    }
    finally
    {
      for (;;)
      {
        GlideExecutor.UncaughtThrowableStrategy localUncaughtThrowableStrategy = this.this$0.uncaughtThrowableStrategy;
        localUncaughtThrowableStrategy.handle(localThrowable);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\executor\GlideExecutor$DefaultThreadFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */