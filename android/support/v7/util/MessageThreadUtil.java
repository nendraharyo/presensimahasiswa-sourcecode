package android.support.v7.util;

class MessageThreadUtil
  implements ThreadUtil
{
  public ThreadUtil.BackgroundCallback getBackgroundProxy(ThreadUtil.BackgroundCallback paramBackgroundCallback)
  {
    MessageThreadUtil.2 local2 = new android/support/v7/util/MessageThreadUtil$2;
    local2.<init>(this, paramBackgroundCallback);
    return local2;
  }
  
  public ThreadUtil.MainThreadCallback getMainThreadProxy(ThreadUtil.MainThreadCallback paramMainThreadCallback)
  {
    MessageThreadUtil.1 local1 = new android/support/v7/util/MessageThreadUtil$1;
    local1.<init>(this, paramMainThreadCallback);
    return local1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\MessageThreadUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */