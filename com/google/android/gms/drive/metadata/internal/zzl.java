package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzl
  implements Parcelable.Creator
{
  static void zza(ParentDriveIdSet paramParentDriveIdSet, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramParentDriveIdSet.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    List localList = paramParentDriveIdSet.zzasS;
    zzb.zzc(paramParcel, 2, localList, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ParentDriveIdSet zzch(Parcel paramParcel)
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
        localObject2 = PartialDriveId.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
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
    ParentDriveIdSet localParentDriveIdSet = new com/google/android/gms/drive/metadata/internal/ParentDriveIdSet;
    localParentDriveIdSet.<init>(j, (List)localObject2);
    return localParentDriveIdSet;
  }
  
  public ParentDriveIdSet[] zzec(int paramInt)
  {
    return new ParentDriveIdSet[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */