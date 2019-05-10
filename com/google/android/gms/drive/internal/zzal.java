package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Permission;
import java.util.List;

public class zzal
  implements Parcelable.Creator
{
  static void zza(GetPermissionsResponse paramGetPermissionsResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetPermissionsResponse.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    List localList = paramGetPermissionsResponse.zzarO;
    zzb.zzc(paramParcel, 2, localList, false);
    j = paramGetPermissionsResponse.zzzw;
    zzb.zzc(paramParcel, 3, j);
    zzb.zzI(paramParcel, i);
  }
  
  public GetPermissionsResponse zzbv(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    Object localObject = null;
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
        localObject = Permission.CREATOR;
        localObject = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject);
        break;
      case 3: 
        i = zza.zzg(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    GetPermissionsResponse localGetPermissionsResponse = new com/google/android/gms/drive/internal/GetPermissionsResponse;
    localGetPermissionsResponse.<init>(k, (List)localObject, i);
    return localGetPermissionsResponse;
  }
  
  public GetPermissionsResponse[] zzdq(int paramInt)
  {
    return new GetPermissionsResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */