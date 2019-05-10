package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wearable.ConnectionConfiguration;

public class zzao
  implements Parcelable.Creator
{
  static void zza(GetConfigResponse paramGetConfigResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetConfigResponse.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramGetConfigResponse.statusCode;
    zzb.zzc(paramParcel, 2, j);
    ConnectionConfiguration localConnectionConfiguration = paramGetConfigResponse.zzbsG;
    zzb.zza(paramParcel, 3, localConnectionConfiguration, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetConfigResponse zziu(Parcel paramParcel)
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
        localObject2 = (ConnectionConfiguration)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
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
    GetConfigResponse localGetConfigResponse = new com/google/android/gms/wearable/internal/GetConfigResponse;
    localGetConfigResponse.<init>(k, i, (ConnectionConfiguration)localObject2);
    return localGetConfigResponse;
  }
  
  public GetConfigResponse[] zzlY(int paramInt)
  {
    return new GetConfigResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzao.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */