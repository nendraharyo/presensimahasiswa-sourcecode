package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(PlayLoggerContext paramPlayLoggerContext, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPlayLoggerContext.versionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramPlayLoggerContext.packageName;
    zzb.zza(paramParcel, 2, str, false);
    j = paramPlayLoggerContext.zzbdL;
    zzb.zzc(paramParcel, 3, j);
    j = paramPlayLoggerContext.zzbdM;
    zzb.zzc(paramParcel, 4, j);
    str = paramPlayLoggerContext.zzbdN;
    zzb.zza(paramParcel, 5, str, false);
    str = paramPlayLoggerContext.zzbdO;
    zzb.zza(paramParcel, 6, str, false);
    boolean bool = paramPlayLoggerContext.zzbdP;
    zzb.zza(paramParcel, 7, bool);
    str = paramPlayLoggerContext.zzbdQ;
    zzb.zza(paramParcel, 8, str, false);
    bool = paramPlayLoggerContext.zzbdR;
    zzb.zza(paramParcel, 9, bool);
    int k = paramPlayLoggerContext.zzbdS;
    zzb.zzc(paramParcel, 10, k);
    zzb.zzI(paramParcel, i);
  }
  
  public PlayLoggerContext zzgz(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    boolean bool1 = true;
    boolean bool2 = false;
    String str2 = null;
    String str3 = null;
    int k = 0;
    int m = 0;
    Object localObject1 = null;
    int n = 0;
    zza.zza localzza = null;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= j) {
        break;
      }
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        localObject1 = zza.zzp(paramParcel, i1);
        break;
      case 3: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 4: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 5: 
        str3 = zza.zzp(paramParcel, i1);
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, i1);
        break;
      case 7: 
        bool1 = zza.zzc(paramParcel, i1);
        break;
      case 8: 
        str1 = zza.zzp(paramParcel, i1);
        break;
      case 9: 
        bool2 = zza.zzc(paramParcel, i1);
        break;
      case 10: 
        i = zza.zzg(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/playlog/internal/PlayLoggerContext;
    ((PlayLoggerContext)localObject2).<init>(n, (String)localObject1, m, k, str3, str2, bool1, str1, bool2, i);
    return (PlayLoggerContext)localObject2;
  }
  
  public PlayLoggerContext[] zzjF(int paramInt)
  {
    return new PlayLoggerContext[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\playlog\internal\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */