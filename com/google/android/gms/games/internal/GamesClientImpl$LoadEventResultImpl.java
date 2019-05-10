package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events.LoadEventsResult;

final class GamesClientImpl$LoadEventResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Events.LoadEventsResult
{
  private final EventBuffer zzaEA;
  
  GamesClientImpl$LoadEventResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    EventBuffer localEventBuffer = new com/google/android/gms/games/event/EventBuffer;
    localEventBuffer.<init>(paramDataHolder);
    this.zzaEA = localEventBuffer;
  }
  
  public EventBuffer getEvents()
  {
    return this.zzaEA;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadEventResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */