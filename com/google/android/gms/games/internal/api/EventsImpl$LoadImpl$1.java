package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events.LoadEventsResult;

class EventsImpl$LoadImpl$1
  implements Events.LoadEventsResult
{
  EventsImpl$LoadImpl$1(EventsImpl.LoadImpl paramLoadImpl, Status paramStatus) {}
  
  public EventBuffer getEvents()
  {
    EventBuffer localEventBuffer = new com/google/android/gms/games/event/EventBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(14);
    localEventBuffer.<init>(localDataHolder);
    return localEventBuffer;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\EventsImpl$LoadImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */