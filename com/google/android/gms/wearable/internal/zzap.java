package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wearable.ConnectionConfiguration;

public class zzap
  implements Parcelable.Creator
{
  static void zza(GetConfigsResponse paramGetConfigsResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetConfigsResponse.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramGetConfigsResponse.statusCode;
    zzb.zzc(paramParcel, 2, j);
    ConnectionConfiguration[] arrayOfConnectionConfiguration = paramGetConfigsResponse.zzbsH;
    zzb.zza(paramParcel, 3, arrayOfConnectionConfiguration, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetConfigsResponse zziv(Parcel paramParcel)
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
        localObject2 = ConnectionConfiguration.CREATOR;
        localObject2 = (ConnectionConfiguration[])zza.zzb(paramParcel, m, (Parcelable.Creator)localObject2);
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
    GetConfigsResponse localGetConfigsResponse = new com/google/android/gms/wearable/internal/GetConfigsResponse;
    localGetConfigsResponse.<init>(k, i, (ConnectionConfiguration[])localObject2);
    return localGetConfigsResponse;
  }
  
  public GetConfigsResponse[] zzlZ(int paramInt)
  {
    return new GetConfigsResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */