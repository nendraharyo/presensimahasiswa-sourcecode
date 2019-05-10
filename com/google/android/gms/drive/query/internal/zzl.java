package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl
  implements Parcelable.Creator
{
  static void zza(MatchAllFilter paramMatchAllFilter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramMatchAllFilter.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    zzb.zzI(paramParcel, i);
  }
  
  public MatchAllFilter zzct(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/drive/query/internal/MatchAllFilter;
    ((MatchAllFilter)localObject).<init>(j);
    return (MatchAllFilter)localObject;
  }
  
  public MatchAllFilter[] zzeo(int paramInt)
  {
    return new MatchAllFilter[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */