package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzan
  implements Parcelable.Creator
{
  static void zza(GetCloudSyncSettingResponse paramGetCloudSyncSettingResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetCloudSyncSettingResponse.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramGetCloudSyncSettingResponse.statusCode;
    zzb.zzc(paramParcel, 2, j);
    boolean bool = paramGetCloudSyncSettingResponse.enabled;
    zzb.zza(paramParcel, 3, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public GetCloudSyncSettingResponse zzit(Parcel paramParcel)
  {
    boolean bool = false;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject = null;
    int k = 0;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
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
        j = zza.zzg(paramParcel, m);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    GetCloudSyncSettingResponse localGetCloudSyncSettingResponse = new com/google/android/gms/wearable/internal/GetCloudSyncSettingResponse;
    localGetCloudSyncSettingResponse.<init>(k, j, bool);
    return localGetCloudSyncSettingResponse;
  }
  
  public GetCloudSyncSettingResponse[] zzlX(int paramInt)
  {
    return new GetCloudSyncSettingResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzan.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */