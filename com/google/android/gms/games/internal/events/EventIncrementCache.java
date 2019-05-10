package com.google.android.gms.games.internal.events;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EventIncrementCache
{
  final Object zzaId;
  private Handler zzaIe;
  private boolean zzaIf;
  private HashMap zzaIg;
  private int zzaIh;
  
  public EventIncrementCache(Looper paramLooper, int paramInt)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzaId = localObject;
    localObject = new android/os/Handler;
    ((Handler)localObject).<init>(paramLooper);
    this.zzaIe = ((Handler)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzaIg = ((HashMap)localObject);
    this.zzaIh = paramInt;
  }
  
  private void zzxl()
  {
    Object localObject1 = this.zzaId;
    Object localObject2 = null;
    try
    {
      this.zzaIf = false;
      flush();
      return;
    }
    finally {}
  }
  
  public void flush()
  {
    synchronized (this.zzaId)
    {
      Object localObject2 = this.zzaIg;
      localObject2 = ((HashMap)localObject2).entrySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject2 = localIterator.next();
        localObject2 = (Map.Entry)localObject2;
        Object localObject4 = ((Map.Entry)localObject2).getKey();
        localObject4 = (String)localObject4;
        localObject2 = ((Map.Entry)localObject2).getValue();
        localObject2 = (AtomicInteger)localObject2;
        int i = ((AtomicInteger)localObject2).get();
        zzs((String)localObject4, i);
      }
    }
    HashMap localHashMap = this.zzaIg;
    localHashMap.clear();
  }
  
  protected abstract void zzs(String paramString, int paramInt);
  
  public void zzw(String paramString, int paramInt)
  {
    synchronized (this.zzaId)
    {
      boolean bool = this.zzaIf;
      Object localObject4;
      if (!bool)
      {
        bool = true;
        this.zzaIf = bool;
        localObject2 = this.zzaIe;
        localObject4 = new com/google/android/gms/games/internal/events/EventIncrementCache$1;
        ((EventIncrementCache.1)localObject4).<init>(this);
        int i = this.zzaIh;
        long l = i;
        ((Handler)localObject2).postDelayed((Runnable)localObject4, l);
      }
      Object localObject2 = this.zzaIg;
      localObject2 = ((HashMap)localObject2).get(paramString);
      localObject2 = (AtomicInteger)localObject2;
      if (localObject2 == null)
      {
        localObject2 = new java/util/concurrent/atomic/AtomicInteger;
        ((AtomicInteger)localObject2).<init>();
        localObject4 = this.zzaIg;
        ((HashMap)localObject4).put(paramString, localObject2);
      }
      ((AtomicInteger)localObject2).addAndGet(paramInt);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\events\EventIncrementCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */