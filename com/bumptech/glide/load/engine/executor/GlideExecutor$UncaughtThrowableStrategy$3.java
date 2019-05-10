package com.bumptech.glide.load.engine.executor;

class GlideExecutor$UncaughtThrowableStrategy$3
  implements GlideExecutor.UncaughtThrowableStrategy
{
  public void handle(Throwable paramThrowable)
  {
    if (paramThrowable != null)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Request threw uncaught throwable", paramThrowable);
      throw localRuntimeException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\executor\GlideExecutor$UncaughtThrowableStrategy$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */