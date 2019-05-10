package io.fabric.sdk.android.services.events;

import java.util.Comparator;

class EventsFilesManager$1
  implements Comparator
{
  EventsFilesManager$1(EventsFilesManager paramEventsFilesManager) {}
  
  public int compare(EventsFilesManager.FileWithTimestamp paramFileWithTimestamp1, EventsFilesManager.FileWithTimestamp paramFileWithTimestamp2)
  {
    long l1 = paramFileWithTimestamp1.timestamp;
    long l2 = paramFileWithTimestamp2.timestamp;
    return (int)(l1 - l2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\EventsFilesManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */