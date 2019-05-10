package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzal
  implements Parcelable.Creator
{
  static void zza(GetCloudSyncOptInOutDoneResponse paramGetCloudSyncOptInOutDoneResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetCloudSyncOptInOutDoneResponse.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramGetCloudSyncOptInOutDoneResponse.statusCode;
    zzb.zzc(paramParcel, 2, j);
    boolean bool = paramGetCloudSyncOptInOutDoneResponse.zzbsD;
    zzb.zza(paramParcel, 3, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public GetCloudSyncOptInOutDoneResponse zzir(Parcel paramParcel)
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
    GetCloudSyncOptInOutDoneResponse localGetCloudSyncOptInOutDoneResponse = new com/google/android/gms/wearable/internal/GetCloudSyncOptInOutDoneResponse;
    localGetCloudSyncOptInOutDoneResponse.<init>(k, j, bool);
    return localGetCloudSyncOptInOutDoneResponse;
  }
  
  public GetCloudSyncOptInOutDoneResponse[] zzlV(int paramInt)
  {
    return new GetCloudSyncOptInOutDoneResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */