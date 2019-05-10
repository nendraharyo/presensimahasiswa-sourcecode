package com.google.android.gms.cast.internal;

import android.os.SystemClock;

public final class zzp
{
  private static final zzl zzaaf;
  public static final Object zzaeB;
  private long zzacY;
  private zzo zzaeA;
  private long zzaey;
  private long zzaez;
  
  static
  {
    Object localObject = new com/google/android/gms/cast/internal/zzl;
    ((zzl)localObject).<init>("RequestTracker");
    zzaaf = (zzl)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    zzaeB = localObject;
  }
  
  public zzp(long paramLong)
  {
    this.zzaey = paramLong;
    this.zzacY = -1;
    this.zzaez = 0L;
  }
  
  private void zzoz()
  {
    this.zzacY = -1;
    this.zzaeA = null;
    this.zzaez = 0L;
  }
  
  public void clear()
  {
    synchronized (zzaeB)
    {
      long l1 = this.zzacY;
      long l2 = -1;
      boolean bool = l1 < l2;
      if (bool) {
        zzoz();
      }
      return;
    }
  }
  
  public boolean zzB(long paramLong)
  {
    synchronized (zzaeB)
    {
      long l1 = this.zzacY;
      long l2 = -1;
      boolean bool = l1 < l2;
      if (bool)
      {
        l1 = this.zzacY;
        bool = l1 < paramLong;
        if (!bool)
        {
          bool = true;
          return bool;
        }
      }
      bool = false;
      Object localObject2 = null;
    }
  }
  
  public void zza(long paramLong, zzo paramzzo)
  {
    synchronized (zzaeB)
    {
      zzo localzzo = this.zzaeA;
      long l1 = this.zzacY;
      this.zzacY = paramLong;
      this.zzaeA = paramzzo;
      long l2 = SystemClock.elapsedRealtime();
      this.zzaez = l2;
      if (localzzo != null) {
        localzzo.zzy(l1);
      }
      return;
    }
  }
  
  public boolean zzc(long paramLong, int paramInt)
  {
    return zzc(paramLong, paramInt, null);
  }
  
  public boolean zzc(long paramLong, int paramInt, Object paramObject)
  {
    boolean bool1 = true;
    String str = null;
    Object localObject1 = null;
    for (;;)
    {
      synchronized (zzaeB)
      {
        long l1 = this.zzacY;
        long l2 = -1;
        boolean bool2 = l1 < l2;
        if (bool2)
        {
          l1 = this.zzacY;
          bool2 = l1 < paramLong;
          if (!bool2)
          {
            localObject1 = zzaaf;
            str = "request %d completed";
            bool2 = true;
            Object[] arrayOfObject = new Object[bool2];
            l2 = this.zzacY;
            Long localLong = Long.valueOf(l2);
            arrayOfObject[0] = localLong;
            ((zzl)localObject1).zzb(str, arrayOfObject);
            localObject1 = this.zzaeA;
            zzoz();
            if (localObject1 != null) {
              ((zzo)localObject1).zza(paramLong, paramInt, paramObject);
            }
            return bool1;
          }
        }
      }
      bool1 = false;
    }
  }
  
  public boolean zzd(long paramLong, int paramInt)
  {
    boolean bool1 = true;
    int i = 0;
    Object localObject1 = null;
    long l1 = 0L;
    for (;;)
    {
      synchronized (zzaeB)
      {
        long l2 = this.zzacY;
        long l3 = -1;
        boolean bool2 = l2 < l3;
        if (bool2)
        {
          l2 = this.zzaez;
          l2 = paramLong - l2;
          l3 = this.zzaey;
          bool2 = l2 < l3;
          if (!bool2)
          {
            zzl localzzl = zzaaf;
            String str = "request %d timed out";
            i = 1;
            localObject1 = new Object[i];
            bool2 = false;
            l3 = this.zzacY;
            Long localLong = Long.valueOf(l3);
            localObject1[0] = localLong;
            localzzl.zzb(str, (Object[])localObject1);
            l1 = this.zzacY;
            localObject1 = this.zzaeA;
            zzoz();
            if (localObject1 != null) {
              ((zzo)localObject1).zza(l1, paramInt, null);
            }
            return bool1;
          }
        }
      }
      bool1 = false;
      i = 0;
      localObject1 = null;
    }
  }
  
  public boolean zzoA()
  {
    synchronized (zzaeB)
    {
      long l1 = this.zzacY;
      long l2 = -1;
      boolean bool = l1 < l2;
      if (bool)
      {
        bool = true;
        return bool;
      }
      bool = false;
      Object localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */