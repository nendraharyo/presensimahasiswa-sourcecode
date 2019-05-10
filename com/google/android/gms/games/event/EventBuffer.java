package com.google.android.gms.games.event;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class EventBuffer
  extends AbstractDataBuffer
{
  public EventBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public Event get(int paramInt)
  {
    EventRef localEventRef = new com/google/android/gms/games/event/EventRef;
    DataHolder localDataHolder = this.zzahi;
    localEventRef.<init>(localDataHolder, paramInt);
    return localEventRef;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\event\EventBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */