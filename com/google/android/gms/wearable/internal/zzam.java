package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzam
  implements Parcelable.Creator
{
  static void zza(GetCloudSyncOptInStatusResponse paramGetCloudSyncOptInStatusResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetCloudSyncOptInStatusResponse.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramGetCloudSyncOptInStatusResponse.statusCode;
    zzb.zzc(paramParcel, 2, j);
    boolean bool = paramGetCloudSyncOptInStatusResponse.zzbsE;
    zzb.zza(paramParcel, 3, bool);
    bool = paramGetCloudSyncOptInStatusResponse.zzbsF;
    zzb.zza(paramParcel, 4, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public GetCloudSyncOptInStatusResponse zzis(Parcel paramParcel)
  {
    boolean bool1 = false;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    boolean bool2 = false;
    Object localObject = null;
    int j = 0;
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
        bool2 = zza.zzc(paramParcel, m);
        break;
      case 4: 
        bool1 = zza.zzc(paramParcel, m);
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
    GetCloudSyncOptInStatusResponse localGetCloudSyncOptInStatusResponse = new com/google/android/gms/wearable/internal/GetCloudSyncOptInStatusResponse;
    localGetCloudSyncOptInStatusResponse.<init>(k, j, bool2, bool1);
    return localGetCloudSyncOptInStatusResponse;
  }
  
  public GetCloudSyncOptInStatusResponse[] zzlW(int paramInt)
  {
    return new GetCloudSyncOptInStatusResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzam.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */