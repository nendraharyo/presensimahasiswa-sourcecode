package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzcb
  implements Parcelable.Creator
{
  static void zza(UpdatePermissionRequest paramUpdatePermissionRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramUpdatePermissionRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramUpdatePermissionRequest.zzaoz;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramUpdatePermissionRequest.zzapk;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    j = paramUpdatePermissionRequest.zzasE;
    zzb.zzc(paramParcel, 4, j);
    boolean bool = paramUpdatePermissionRequest.zzaqd;
    zzb.zza(paramParcel, 5, bool);
    localObject = paramUpdatePermissionRequest.zzaoV;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public UpdatePermissionRequest zzcc(Parcel paramParcel)
  {
    String str1 = null;
    boolean bool = false;
    int i = zza.zzau(paramParcel);
    int j = 0;
    String str2 = null;
    Object localObject1 = null;
    int k = 0;
    Object localObject2 = null;
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
        localObject1 = DriveId.CREATOR;
        localObject3 = (DriveId)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        j = zza.zzg(paramParcel, m);
        break;
      case 5: 
        bool = zza.zzc(paramParcel, m);
        break;
      case 6: 
        str1 = zza.zzp(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/drive/internal/UpdatePermissionRequest;
    ((UpdatePermissionRequest)localObject3).<init>(k, (DriveId)localObject1, str2, j, bool, str1);
    return (UpdatePermissionRequest)localObject3;
  }
  
  public UpdatePermissionRequest[] zzdX(int paramInt)
  {
    return new UpdatePermissionRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzcb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */