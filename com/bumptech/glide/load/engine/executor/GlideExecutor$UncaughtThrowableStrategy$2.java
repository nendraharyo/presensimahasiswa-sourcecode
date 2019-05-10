package com.bumptech.glide.load.engine.executor;

import android.util.Log;

class GlideExecutor$UncaughtThrowableStrategy$2
  implements GlideExecutor.UncaughtThrowableStrategy
{
  public void handle(Throwable paramThrowable)
  {
    if (paramThrowable != null)
    {
      String str1 = "GlideExecutor";
      int i = 6;
      boolean bool = Log.isLoggable(str1, i);
      if (bool)
      {
        str1 = "GlideExecutor";
        String str2 = "Request threw uncaught throwable";
        Log.e(str1, str2, paramThrowable);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\executor\GlideExecutor$UncaughtThrowableStrategy$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */