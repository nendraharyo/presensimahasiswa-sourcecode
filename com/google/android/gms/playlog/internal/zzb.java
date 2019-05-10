package com.google.android.gms.playlog.internal;

import java.util.ArrayList;

public class zzb
{
  private final ArrayList zzbdE;
  private int zzbdF;
  
  public zzb()
  {
    this(100);
  }
  
  public zzb(int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzbdE = localArrayList;
    this.zzbdF = paramInt;
  }
  
  private void zzEV()
  {
    for (;;)
    {
      int i = getSize();
      int j = getCapacity();
      if (i <= j) {
        break;
      }
      ArrayList localArrayList = this.zzbdE;
      j = 0;
      localArrayList.remove(0);
    }
  }
  
  public void clear()
  {
    this.zzbdE.clear();
  }
  
  public int getCapacity()
  {
    return this.zzbdF;
  }
  
  public int getSize()
  {
    return this.zzbdE.size();
  }
  
  public boolean isEmpty()
  {
    return this.zzbdE.isEmpty();
  }
  
  public ArrayList zzEU()
  {
    return this.zzbdE;
  }
  
  public void zza(PlayLoggerContext paramPlayLoggerContext, LogEvent paramLogEvent)
  {
    ArrayList localArrayList = this.zzbdE;
    zzb.zza localzza = new com/google/android/gms/playlog/internal/zzb$zza;
    localzza.<init>(paramPlayLoggerContext, paramLogEvent, null);
    localArrayList.add(localzza);
    zzEV();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\playlog\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */