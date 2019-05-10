package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzag
  implements Parcelable.Creator
{
  static void zza(DeleteDataItemsResponse paramDeleteDataItemsResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramDeleteDataItemsResponse.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramDeleteDataItemsResponse.statusCode;
    zzb.zzc(paramParcel, 2, j);
    j = paramDeleteDataItemsResponse.zzbsz;
    zzb.zzc(paramParcel, 3, j);
    zzb.zzI(paramParcel, i);
  }
  
  public DeleteDataItemsResponse zzim(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject = null;
    int m = 0;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        k = zza.zzg(paramParcel, n);
        break;
      case 3: 
        i = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    DeleteDataItemsResponse localDeleteDataItemsResponse = new com/google/android/gms/wearable/internal/DeleteDataItemsResponse;
    localDeleteDataItemsResponse.<init>(m, k, i);
    return localDeleteDataItemsResponse;
  }
  
  public DeleteDataItemsResponse[] zzlQ(int paramInt)
  {
    return new DeleteDataItemsResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */