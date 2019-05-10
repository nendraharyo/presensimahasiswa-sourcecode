package io.fabric.sdk.android.services.events;

public abstract interface EventsStrategy
  extends EventsManager, FileRollOverManager
{
  public abstract FilesSender getFilesSender();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\EventsStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */