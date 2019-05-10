package com.bumptech.glide.load.engine.executor;

public abstract interface GlideExecutor$UncaughtThrowableStrategy
{
  public static final UncaughtThrowableStrategy DEFAULT = LOG;
  public static final UncaughtThrowableStrategy IGNORE;
  public static final UncaughtThrowableStrategy LOG;
  public static final UncaughtThrowableStrategy THROW;
  
  static
  {
    Object localObject = new com/bumptech/glide/load/engine/executor/GlideExecutor$UncaughtThrowableStrategy$1;
    ((GlideExecutor.UncaughtThrowableStrategy.1)localObject).<init>();
    IGNORE = (UncaughtThrowableStrategy)localObject;
    localObject = new com/bumptech/glide/load/engine/executor/GlideExecutor$UncaughtThrowableStrategy$2;
    ((GlideExecutor.UncaughtThrowableStrategy.2)localObject).<init>();
    LOG = (UncaughtThrowableStrategy)localObject;
    localObject = new com/bumptech/glide/load/engine/executor/GlideExecutor$UncaughtThrowableStrategy$3;
    ((GlideExecutor.UncaughtThrowableStrategy.3)localObject).<init>();
    THROW = (UncaughtThrowableStrategy)localObject;
  }
  
  public abstract void handle(Throwable paramThrowable);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\executor\GlideExecutor$UncaughtThrowableStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */