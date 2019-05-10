package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzbk
  implements Parcelable.Creator
{
  static void zza(OpenContentsRequest paramOpenContentsRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramOpenContentsRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    DriveId localDriveId = paramOpenContentsRequest.zzaqj;
    zzb.zza(paramParcel, 2, localDriveId, paramInt, false);
    j = paramOpenContentsRequest.zzaoy;
    zzb.zzc(paramParcel, 3, j);
    j = paramOpenContentsRequest.zzasx;
    zzb.zzc(paramParcel, 4, j);
    zzb.zzI(paramParcel, i);
  }
  
  public OpenContentsRequest zzbN(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject2 = null;
    int m = 0;
    Object localObject3 = null;
    int n = 0;
    int i1 = paramParcel.dataPosition();
    if (i1 < j)
    {
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        i1 = i;
        i = m;
        localObject3 = localObject2;
        k = n;
      }
      for (;;)
      {
        n = k;
        localObject2 = localObject3;
        m = i;
        i = i1;
        break;
        i1 = zza.zzg(paramParcel, i1);
        int i3 = i;
        i = m;
        localObject3 = localObject2;
        k = i1;
        i1 = i3;
        continue;
        localObject2 = DriveId.CREATOR;
        localObject4 = (DriveId)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject2);
        k = n;
        i3 = m;
        localObject3 = localObject4;
        i1 = i;
        i = m;
        continue;
        i1 = zza.zzg(paramParcel, i1);
        localObject3 = localObject2;
        k = n;
        i3 = i;
        i = i1;
        i1 = i3;
        continue;
        i1 = zza.zzg(paramParcel, i1);
        i = m;
        localObject3 = localObject2;
        k = n;
      }
    }
    i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/drive/internal/OpenContentsRequest;
    ((OpenContentsRequest)localObject4).<init>(n, (DriveId)localObject2, m, i);
    return (OpenContentsRequest)localObject4;
  }
  
  public OpenContentsRequest[] zzdI(int paramInt)
  {
    return new OpenContentsRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzbk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */