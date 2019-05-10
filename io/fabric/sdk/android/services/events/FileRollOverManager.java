package io.fabric.sdk.android.services.events;

public abstract interface FileRollOverManager
{
  public abstract void cancelTimeBasedFileRollOver();
  
  public abstract boolean rollFileOver();
  
  public abstract void scheduleTimeBasedRollOverIfNeeded();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\FileRollOverManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */