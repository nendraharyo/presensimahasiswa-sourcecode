package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;

public class zzeg$zze
  extends zzjj
{
  private zzeg.zzb zzBa;
  private boolean zzBr;
  private int zzBs;
  private final Object zzpV;
  
  public zzeg$zze(zzeg.zzb paramzzb)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzBa = paramzzb;
    this.zzBr = false;
    this.zzBs = 0;
  }
  
  public zzeg.zzd zzes()
  {
    zzeg.zzd localzzd = new com/google/android/gms/internal/zzeg$zzd;
    localzzd.<init>(this);
    synchronized (this.zzpV)
    {
      zzeg.zze.1 local1 = new com/google/android/gms/internal/zzeg$zze$1;
      local1.<init>(this, localzzd);
      zzeg.zze.2 local2 = new com/google/android/gms/internal/zzeg$zze$2;
      local2.<init>(this, localzzd);
      zza(local1, local2);
      int i = this.zzBs;
      if (i >= 0)
      {
        i = 1;
        zzx.zzab(i);
        j = this.zzBs + 1;
        this.zzBs = j;
        return localzzd;
      }
      int j = 0;
      local1 = null;
    }
  }
  
  protected void zzet()
  {
    int i = 1;
    synchronized (this.zzpV)
    {
      int k = this.zzBs;
      if (k >= i)
      {
        zzx.zzab(i);
        str = "Releasing 1 reference for JS Engine";
        zzin.v(str);
        j = this.zzBs + -1;
        this.zzBs = j;
        zzev();
        return;
      }
      int j = 0;
      String str = null;
    }
  }
  
  public void zzeu()
  {
    boolean bool = true;
    synchronized (this.zzpV)
    {
      int i = this.zzBs;
      if (i >= 0)
      {
        zzx.zzab(bool);
        str = "Releasing root reference. JS Engine will be destroyed once other references are released.";
        zzin.v(str);
        bool = true;
        this.zzBr = bool;
        zzev();
        return;
      }
      bool = false;
      String str = null;
    }
  }
  
  protected void zzev()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzBs;
      if (i >= 0) {
        i = 1;
      }
      for (;;)
      {
        zzx.zzab(i);
        boolean bool = this.zzBr;
        if (!bool) {
          break;
        }
        int j = this.zzBs;
        if (j != 0) {
          break;
        }
        localObject2 = "No reference is left (including root). Cleaning up engine.";
        zzin.v((String)localObject2);
        localObject2 = new com/google/android/gms/internal/zzeg$zze$3;
        ((zzeg.zze.3)localObject2).<init>(this);
        zzji.zzb localzzb = new com/google/android/gms/internal/zzji$zzb;
        localzzb.<init>();
        zza((zzji.zzc)localObject2, localzzb);
        return;
        j = 0;
        localObject2 = null;
      }
      Object localObject2 = "There are still references to the engine. Not destroying.";
      zzin.v((String)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzeg$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */