package android.support.v7.recyclerview.extensions;

import android.support.v7.util.DiffUtil.ItemCallback;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AsyncDifferConfig$Builder
{
  private static Executor sDiffExecutor;
  private static final Object sExecutorLock;
  private static final Executor sMainThreadExecutor;
  private Executor mBackgroundThreadExecutor;
  private final DiffUtil.ItemCallback mDiffCallback;
  private Executor mMainThreadExecutor;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    sExecutorLock = localObject;
    sDiffExecutor = null;
    localObject = new android/support/v7/recyclerview/extensions/AsyncDifferConfig$Builder$MainThreadExecutor;
    ((AsyncDifferConfig.Builder.MainThreadExecutor)localObject).<init>(null);
    sMainThreadExecutor = (Executor)localObject;
  }
  
  public AsyncDifferConfig$Builder(DiffUtil.ItemCallback paramItemCallback)
  {
    this.mDiffCallback = paramItemCallback;
  }
  
  public AsyncDifferConfig build()
  {
    Object localObject1 = this.mMainThreadExecutor;
    if (localObject1 == null)
    {
      localObject1 = sMainThreadExecutor;
      this.mMainThreadExecutor = ((Executor)localObject1);
    }
    localObject1 = this.mBackgroundThreadExecutor;
    if (localObject1 == null) {}
    synchronized (sExecutorLock)
    {
      localObject1 = sDiffExecutor;
      if (localObject1 == null)
      {
        int i = 2;
        localObject1 = Executors.newFixedThreadPool(i);
        sDiffExecutor = (Executor)localObject1;
      }
      localObject1 = sDiffExecutor;
      this.mBackgroundThreadExecutor = ((Executor)localObject1);
      localObject1 = new android/support/v7/recyclerview/extensions/AsyncDifferConfig;
      ??? = this.mMainThreadExecutor;
      Executor localExecutor = this.mBackgroundThreadExecutor;
      DiffUtil.ItemCallback localItemCallback = this.mDiffCallback;
      ((AsyncDifferConfig)localObject1).<init>((Executor)???, localExecutor, localItemCallback, null);
      return (AsyncDifferConfig)localObject1;
    }
  }
  
  public Builder setBackgroundThreadExecutor(Executor paramExecutor)
  {
    this.mBackgroundThreadExecutor = paramExecutor;
    return this;
  }
  
  public Builder setMainThreadExecutor(Executor paramExecutor)
  {
    this.mMainThreadExecutor = paramExecutor;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\recyclerview\extensions\AsyncDifferConfig$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */