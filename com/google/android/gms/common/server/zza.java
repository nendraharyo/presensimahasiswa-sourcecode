package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(FavaDiagnosticsEntity paramFavaDiagnosticsEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramFavaDiagnosticsEntity.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramFavaDiagnosticsEntity.zzamD;
    zzb.zza(paramParcel, 2, str, false);
    j = paramFavaDiagnosticsEntity.zzamE;
    zzb.zzc(paramParcel, 3, j);
    zzb.zzI(paramParcel, i);
  }
  
  public FavaDiagnosticsEntity zzaw(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    Object localObject = null;
    int k = 0;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int n = com.google.android.gms.common.internal.safeparcel.zza.zzca(m);
      switch (n)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 3: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    FavaDiagnosticsEntity localFavaDiagnosticsEntity = new com/google/android/gms/common/server/FavaDiagnosticsEntity;
    localFavaDiagnosticsEntity.<init>(k, (String)localObject, i);
    return localFavaDiagnosticsEntity;
  }
  
  public FavaDiagnosticsEntity[] zzcc(int paramInt)
  {
    return new FavaDiagnosticsEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */