package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zze;
import java.util.Map;

public class zzdl
  implements zzdf
{
  static final Map zzzC;
  private final zze zzzA;
  private final zzfn zzzB;
  
  static
  {
    Integer localInteger1 = Integer.valueOf(1);
    Integer localInteger2 = Integer.valueOf(2);
    Integer localInteger3 = Integer.valueOf(3);
    Integer localInteger4 = Integer.valueOf(4);
    Integer localInteger5 = Integer.valueOf(5);
    Integer localInteger6 = Integer.valueOf(6);
    zzzC = zzmr.zza("resize", localInteger1, "playVideo", localInteger2, "storePicture", localInteger3, "createCalendarEvent", localInteger4, "setOrientationProperties", localInteger5, "closeResizedAd", localInteger6);
  }
  
  public zzdl(zze paramzze, zzfn paramzzfn)
  {
    this.zzzA = paramzze;
    this.zzzB = paramzzfn;
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    Object localObject1 = (String)paramMap.get("a");
    Object localObject2 = zzzC;
    localObject1 = (Integer)((Map)localObject2).get(localObject1);
    int i = ((Integer)localObject1).intValue();
    int j = 5;
    boolean bool;
    if (i != j)
    {
      localObject2 = this.zzzA;
      if (localObject2 != null)
      {
        localObject2 = this.zzzA;
        bool = ((zze)localObject2).zzbh();
        if (!bool)
        {
          localObject1 = this.zzzA;
          bool = false;
          localObject2 = null;
          ((zze)localObject1).zzq(null);
        }
      }
    }
    for (;;)
    {
      return;
      switch (i)
      {
      case 2: 
      default: 
        localObject1 = "Unknown MRAID command called.";
        zzin.zzaJ((String)localObject1);
        break;
      case 1: 
        localObject1 = this.zzzB;
        ((zzfn)localObject1).zzi(paramMap);
        break;
      case 4: 
        localObject1 = new com/google/android/gms/internal/zzfm;
        ((zzfm)localObject1).<init>(paramzzjp, paramMap);
        ((zzfm)localObject1).execute();
        break;
      case 3: 
        localObject1 = new com/google/android/gms/internal/zzfp;
        ((zzfp)localObject1).<init>(paramzzjp, paramMap);
        ((zzfp)localObject1).execute();
        break;
      case 5: 
        localObject1 = new com/google/android/gms/internal/zzfo;
        ((zzfo)localObject1).<init>(paramzzjp, paramMap);
        ((zzfo)localObject1).execute();
        break;
      case 6: 
        localObject1 = this.zzzB;
        bool = true;
        ((zzfn)localObject1).zzp(bool);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */