package io.fabric.sdk.android.services.events;

public abstract interface EventsManager
{
  public abstract void deleteAllEvents();
  
  public abstract void recordEvent(Object paramObject);
  
  public abstract void sendEvents();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\EventsManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */