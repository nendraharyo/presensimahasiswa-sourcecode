package com.google.android.gms.games.event;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface Events$LoadEventsResult
  extends Releasable, Result
{
  public abstract EventBuffer getEvents();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\event\Events$LoadEventsResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */