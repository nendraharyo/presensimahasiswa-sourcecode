package com.google.android.gms.games.internal.events;

import java.util.concurrent.atomic.AtomicReference;

public abstract class EventIncrementManager
{
  private final AtomicReference zzaIj;
  
  public EventIncrementManager()
  {
    AtomicReference localAtomicReference = new java/util/concurrent/atomic/AtomicReference;
    localAtomicReference.<init>();
    this.zzaIj = localAtomicReference;
  }
  
  public void flush()
  {
    EventIncrementCache localEventIncrementCache = (EventIncrementCache)this.zzaIj.get();
    if (localEventIncrementCache != null) {
      localEventIncrementCache.flush();
    }
  }
  
  public void zzp(String paramString, int paramInt)
  {
    EventIncrementCache localEventIncrementCache = (EventIncrementCache)this.zzaIj.get();
    if (localEventIncrementCache == null)
    {
      localEventIncrementCache = zzwS();
      AtomicReference localAtomicReference = this.zzaIj;
      boolean bool = localAtomicReference.compareAndSet(null, localEventIncrementCache);
      if (!bool) {
        localEventIncrementCache = (EventIncrementCache)this.zzaIj.get();
      }
    }
    localEventIncrementCache.zzw(paramString, paramInt);
  }
  
  protected abstract EventIncrementCache zzwS();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\events\EventIncrementManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */