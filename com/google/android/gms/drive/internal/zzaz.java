package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzaz
  implements Parcelable.Creator
{
  static void zza(OnDriveIdResponse paramOnDriveIdResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramOnDriveIdResponse.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    DriveId localDriveId = paramOnDriveIdResponse.zzaqj;
    zzb.zza(paramParcel, 2, localDriveId, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public OnDriveIdResponse zzbC(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
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
        localObject2 = DriveId.CREATOR;
        localObject2 = (DriveId)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    OnDriveIdResponse localOnDriveIdResponse = new com/google/android/gms/drive/internal/OnDriveIdResponse;
    localOnDriveIdResponse.<init>(j, (DriveId)localObject2);
    return localOnDriveIdResponse;
  }
  
  public OnDriveIdResponse[] zzdx(int paramInt)
  {
    return new OnDriveIdResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzaz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */