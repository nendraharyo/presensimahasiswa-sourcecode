package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class SnapshotMetadataChangeCreator
  implements Parcelable.Creator
{
  static void zza(SnapshotMetadataChangeEntity paramSnapshotMetadataChangeEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramSnapshotMetadataChangeEntity.getDescription();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramSnapshotMetadataChangeEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramSnapshotMetadataChangeEntity.getPlayedTimeMillis();
    zzb.zza(paramParcel, 2, (Long)localObject, false);
    localObject = paramSnapshotMetadataChangeEntity.getCoverImageUri();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramSnapshotMetadataChangeEntity.zzxU();
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramSnapshotMetadataChangeEntity.getProgressValue();
    zzb.zza(paramParcel, 6, (Long)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SnapshotMetadataChangeEntity zzeC(Parcel paramParcel)
  {
    Long localLong1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Long localLong2 = null;
    String str = null;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localLong2 = zza.zzj(paramParcel, k);
        break;
      case 4: 
        localObject2 = Uri.CREATOR;
        localObject4 = (Uri)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 5: 
        localObject3 = BitmapTeleporter.CREATOR;
        localObject4 = (BitmapTeleporter)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 6: 
        localLong1 = zza.zzj(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/games/snapshot/SnapshotMetadataChangeEntity;
    ((SnapshotMetadataChangeEntity)localObject4).<init>(j, str, localLong2, (BitmapTeleporter)localObject3, (Uri)localObject2, localLong1);
    return (SnapshotMetadataChangeEntity)localObject4;
  }
  
  public SnapshotMetadataChangeEntity[] zzgT(int paramInt)
  {
    return new SnapshotMetadataChangeEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataChangeCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */