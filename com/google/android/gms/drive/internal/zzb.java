package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

public class zzb
  implements Parcelable.Creator
{
  static void zza(AddPermissionRequest paramAddPermissionRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramAddPermissionRequest.mVersionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    Object localObject = paramAddPermissionRequest.zzaoz;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramAddPermissionRequest.zzaqa;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    boolean bool = paramAddPermissionRequest.zzaqb;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, bool);
    localObject = paramAddPermissionRequest.zzaqc;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, (String)localObject, false);
    bool = paramAddPermissionRequest.zzaqd;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, bool);
    localObject = paramAddPermissionRequest.zzaoV;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, (String)localObject, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public AddPermissionRequest zzba(Parcel paramParcel)
  {
    boolean bool1 = false;
    String str1 = null;
    int i = zza.zzau(paramParcel);
    String str2 = null;
    boolean bool2 = false;
    Object localObject1 = null;
    Object localObject2 = null;
    int j = 0;
    Object localObject3 = null;
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
        localObject4 = (DriveId)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 3: 
        localObject1 = Permission.CREATOR;
        localObject4 = (Permission)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 4: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 7: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/drive/internal/AddPermissionRequest;
    ((AddPermissionRequest)localObject4).<init>(j, (DriveId)localObject2, (Permission)localObject1, bool2, str2, bool1, str1);
    return (AddPermissionRequest)localObject4;
  }
  
  public AddPermissionRequest[] zzcQ(int paramInt)
  {
    return new AddPermissionRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */