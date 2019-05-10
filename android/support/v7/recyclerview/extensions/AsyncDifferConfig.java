package android.support.v7.recyclerview.extensions;

import android.support.v7.util.DiffUtil.ItemCallback;
import java.util.concurrent.Executor;

public final class AsyncDifferConfig
{
  private final Executor mBackgroundThreadExecutor;
  private final DiffUtil.ItemCallback mDiffCallback;
  private final Executor mMainThreadExecutor;
  
  private AsyncDifferConfig(Executor paramExecutor1, Executor paramExecutor2, DiffUtil.ItemCallback paramItemCallback)
  {
    this.mMainThreadExecutor = paramExecutor1;
    this.mBackgroundThreadExecutor = paramExecutor2;
    this.mDiffCallback = paramItemCallback;
  }
  
  public Executor getBackgroundThreadExecutor()
  {
    return this.mBackgroundThreadExecutor;
  }
  
  public DiffUtil.ItemCallback getDiffCallback()
  {
    return this.mDiffCallback;
  }
  
  public Executor getMainThreadExecutor()
  {
    return this.mMainThreadExecutor;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\recyclerview\extensions\AsyncDifferConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */