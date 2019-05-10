package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzai
  implements Parcelable.Creator
{
  static void zza(GetDriveIdFromUniqueIdentifierRequest paramGetDriveIdFromUniqueIdentifierRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetDriveIdFromUniqueIdentifierRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramGetDriveIdFromUniqueIdentifierRequest.zzaoZ;
    zzb.zza(paramParcel, 2, str, false);
    boolean bool = paramGetDriveIdFromUniqueIdentifierRequest.zzarM;
    zzb.zza(paramParcel, 3, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public GetDriveIdFromUniqueIdentifierRequest zzbs(Parcel paramParcel)
  {
    boolean bool = false;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    Object localObject = null;
    int j = 0;
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
      case 1: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject = zza.zzp(paramParcel, k);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    GetDriveIdFromUniqueIdentifierRequest localGetDriveIdFromUniqueIdentifierRequest = new com/google/android/gms/drive/internal/GetDriveIdFromUniqueIdentifierRequest;
    localGetDriveIdFromUniqueIdentifierRequest.<init>(j, (String)localObject, bool);
    return localGetDriveIdFromUniqueIdentifierRequest;
  }
  
  public GetDriveIdFromUniqueIdentifierRequest[] zzdn(int paramInt)
  {
    return new GetDriveIdFromUniqueIdentifierRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzai.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */