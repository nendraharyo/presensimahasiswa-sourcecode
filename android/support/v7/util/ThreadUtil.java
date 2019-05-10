package android.support.v7.util;

abstract interface ThreadUtil
{
  public abstract ThreadUtil.BackgroundCallback getBackgroundProxy(ThreadUtil.BackgroundCallback paramBackgroundCallback);
  
  public abstract ThreadUtil.MainThreadCallback getMainThreadProxy(ThreadUtil.MainThreadCallback paramMainThreadCallback);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\ThreadUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */