package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzbl
  implements Parcelable.Creator
{
  static void zza(StorageInfoResponse paramStorageInfoResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramStorageInfoResponse.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramStorageInfoResponse.statusCode;
    zzb.zzc(paramParcel, 2, j);
    long l = paramStorageInfoResponse.zzbta;
    zzb.zza(paramParcel, 3, l);
    List localList = paramStorageInfoResponse.zzbtc;
    zzb.zzc(paramParcel, 4, localList, false);
    zzb.zzI(paramParcel, i);
  }
  
  public StorageInfoResponse zziI(Parcel paramParcel)
  {
    int i = 0;
    int j = zza.zzau(paramParcel);
    long l = 0L;
    Object localObject1 = null;
    int k = 0;
    StringBuilder localStringBuilder = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        l = zza.zzi(paramParcel, m);
        break;
      case 4: 
        localObject1 = PackageStorageInfo.CREATOR;
        localObject1 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject1);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>(str, paramParcel);
      throw ((Throwable)localObject2);
    }
    Object localObject2 = new com/google/android/gms/wearable/internal/StorageInfoResponse;
    ((StorageInfoResponse)localObject2).<init>(k, i, l, (List)localObject1);
    return (StorageInfoResponse)localObject2;
  }
  
  public StorageInfoResponse[] zzmm(int paramInt)
  {
    return new StorageInfoResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */