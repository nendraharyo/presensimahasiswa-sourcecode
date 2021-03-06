package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator
{
  static void zza(FullTextSearchFilter paramFullTextSearchFilter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramFullTextSearchFilter.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    String str = paramFullTextSearchFilter.mValue;
    zzb.zza(paramParcel, 1, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public FullTextSearchFilter zzcp(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
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
        break;
      case 1: 
        localObject2 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    FullTextSearchFilter localFullTextSearchFilter = new com/google/android/gms/drive/query/internal/FullTextSearchFilter;
    localFullTextSearchFilter.<init>(j, (String)localObject2);
    return localFullTextSearchFilter;
  }
  
  public FullTextSearchFilter[] zzek(int paramInt)
  {
    return new FullTextSearchFilter[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */