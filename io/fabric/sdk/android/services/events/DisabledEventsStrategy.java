package io.fabric.sdk.android.services.events;

public class DisabledEventsStrategy
  implements EventsStrategy
{
  public void cancelTimeBasedFileRollOver() {}
  
  public void deleteAllEvents() {}
  
  public FilesSender getFilesSender()
  {
    return null;
  }
  
  public void recordEvent(Object paramObject) {}
  
  public boolean rollFileOver()
  {
    return false;
  }
  
  public void scheduleTimeBasedRollOverIfNeeded() {}
  
  public void sendEvents() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\DisabledEventsStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */