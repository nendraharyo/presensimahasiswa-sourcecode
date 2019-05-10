package com.bumptech.glide.load.engine.executor;

import java.util.concurrent.ThreadFactory;

final class GlideExecutor$DefaultThreadFactory
  implements ThreadFactory
{
  private static final int DEFAULT_PRIORITY = 9;
  private final String name;
  final boolean preventNetworkOperations;
  private int threadNum;
  final GlideExecutor.UncaughtThrowableStrategy uncaughtThrowableStrategy;
  
  GlideExecutor$DefaultThreadFactory(String paramString, GlideExecutor.UncaughtThrowableStrategy paramUncaughtThrowableStrategy, boolean paramBoolean)
  {
    this.name = paramString;
    this.uncaughtThrowableStrategy = paramUncaughtThrowableStrategy;
    this.preventNetworkOperations = paramBoolean;
  }
  
  public Thread newThread(Runnable paramRunnable)
  {
    try
    {
      GlideExecutor.DefaultThreadFactory.1 local1 = new com/bumptech/glide/load/engine/executor/GlideExecutor$DefaultThreadFactory$1;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "glide-";
      localObject2 = ((StringBuilder)localObject2).append(str);
      str = this.name;
      localObject2 = ((StringBuilder)localObject2).append(str);
      str = "-thread-";
      localObject2 = ((StringBuilder)localObject2).append(str);
      int i = this.threadNum;
      localObject2 = ((StringBuilder)localObject2).append(i);
      localObject2 = ((StringBuilder)localObject2).toString();
      local1.<init>(this, paramRunnable, (String)localObject2);
      int j = this.threadNum + 1;
      this.threadNum = j;
      return local1;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\executor\GlideExecutor$DefaultThreadFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */