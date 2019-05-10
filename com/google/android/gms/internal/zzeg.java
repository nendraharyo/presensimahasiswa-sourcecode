package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public class zzeg
{
  private final Context mContext;
  private final String zzAY;
  private zzeg.zzb zzAZ;
  private zzeg.zzb zzBa;
  private zzeg.zze zzBb;
  private int zzBc;
  private final VersionInfoParcel zzpT;
  private final Object zzpV;
  
  public zzeg(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzBc = 1;
    this.zzAY = paramString;
    localObject = paramContext.getApplicationContext();
    this.mContext = ((Context)localObject);
    this.zzpT = paramVersionInfoParcel;
    localObject = new com/google/android/gms/internal/zzeg$zzc;
    ((zzeg.zzc)localObject).<init>();
    this.zzAZ = ((zzeg.zzb)localObject);
    localObject = new com/google/android/gms/internal/zzeg$zzc;
    ((zzeg.zzc)localObject).<init>();
    this.zzBa = ((zzeg.zzb)localObject);
  }
  
  public zzeg(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, zzeg.zzb paramzzb1, zzeg.zzb paramzzb2)
  {
    this(paramContext, paramVersionInfoParcel, paramString);
    this.zzAZ = paramzzb1;
    this.zzBa = paramzzb2;
  }
  
  private zzeg.zze zzep()
  {
    zzeg.zze localzze = new com/google/android/gms/internal/zzeg$zze;
    Object localObject = this.zzBa;
    localzze.<init>((zzeg.zzb)localObject);
    localObject = new com/google/android/gms/internal/zzeg$1;
    ((zzeg.1)localObject).<init>(this, localzze);
    zzir.runOnUiThread((Runnable)localObject);
    return localzze;
  }
  
  protected zzed zza(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    zzef localzzef = new com/google/android/gms/internal/zzef;
    localzzef.<init>(paramContext, paramVersionInfoParcel, null);
    return localzzef;
  }
  
  protected zzeg.zze zzeq()
  {
    zzeg.zze localzze = zzep();
    zzeg.2 local2 = new com/google/android/gms/internal/zzeg$2;
    local2.<init>(this, localzze);
    zzeg.3 local3 = new com/google/android/gms/internal/zzeg$3;
    local3.<init>(this, localzze);
    localzze.zza(local2, local3);
    return localzze;
  }
  
  public zzeg.zzd zzer()
  {
    int i = 2;
    for (;;)
    {
      synchronized (this.zzpV)
      {
        Object localObject2 = this.zzBb;
        if (localObject2 != null)
        {
          localObject2 = this.zzBb;
          j = ((zzeg.zze)localObject2).getStatus();
          k = -1;
          if (j != k) {}
        }
        else
        {
          j = 2;
          this.zzBc = j;
          localObject2 = zzeq();
          this.zzBb = ((zzeg.zze)localObject2);
          localObject2 = this.zzBb;
          localObject2 = ((zzeg.zze)localObject2).zzes();
          return (zzeg.zzd)localObject2;
        }
        j = this.zzBc;
        if (j == 0)
        {
          localObject2 = this.zzBb;
          localObject2 = ((zzeg.zze)localObject2).zzes();
        }
      }
      int j = this.zzBc;
      int k = 1;
      Object localObject4;
      if (j == k)
      {
        j = 2;
        this.zzBc = j;
        zzeq();
        localObject4 = this.zzBb;
        localObject4 = ((zzeg.zze)localObject4).zzes();
      }
      else
      {
        j = this.zzBc;
        if (j == i)
        {
          localObject4 = this.zzBb;
          localObject4 = ((zzeg.zze)localObject4).zzes();
        }
        else
        {
          localObject4 = this.zzBb;
          localObject4 = ((zzeg.zze)localObject4).zzes();
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzeg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */