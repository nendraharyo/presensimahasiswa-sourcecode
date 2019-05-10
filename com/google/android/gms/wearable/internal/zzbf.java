package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbf
  implements Parcelable.Creator
{
  static void zza(PutDataResponse paramPutDataResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPutDataResponse.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramPutDataResponse.statusCode;
    zzb.zzc(paramParcel, 2, j);
    DataItemParcelable localDataItemParcelable = paramPutDataResponse.zzbsJ;
    zzb.zza(paramParcel, 3, localDataItemParcelable, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PutDataResponse zziE(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    int k = 0;
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
        localObject2 = DataItemParcelable.CREATOR;
        localObject2 = (DataItemParcelable)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    PutDataResponse localPutDataResponse = new com/google/android/gms/wearable/internal/PutDataResponse;
    localPutDataResponse.<init>(k, i, (DataItemParcelable)localObject2);
    return localPutDataResponse;
  }
  
  public PutDataResponse[] zzmi(int paramInt)
  {
    return new PutDataResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */