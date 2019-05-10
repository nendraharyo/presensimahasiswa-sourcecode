package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

public class SnapshotMetadataEntityCreator
  implements Parcelable.Creator
{
  static void zza(SnapshotMetadataEntity paramSnapshotMetadataEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramSnapshotMetadataEntity.getGame();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramSnapshotMetadataEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramSnapshotMetadataEntity.getOwner();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramSnapshotMetadataEntity.getSnapshotId();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramSnapshotMetadataEntity.getCoverImageUri();
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramSnapshotMetadataEntity.getCoverImageUrl();
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramSnapshotMetadataEntity.getTitle();
    zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramSnapshotMetadataEntity.getDescription();
    zzb.zza(paramParcel, 8, (String)localObject, false);
    long l = paramSnapshotMetadataEntity.getLastModifiedTimestamp();
    zzb.zza(paramParcel, 9, l);
    l = paramSnapshotMetadataEntity.getPlayedTime();
    zzb.zza(paramParcel, 10, l);
    float f = paramSnapshotMetadataEntity.getCoverImageAspectRatio();
    zzb.zza(paramParcel, 11, f);
    localObject = paramSnapshotMetadataEntity.getUniqueName();
    zzb.zza(paramParcel, 12, (String)localObject, false);
    boolean bool = paramSnapshotMetadataEntity.hasChangePending();
    zzb.zza(paramParcel, 13, bool);
    l = paramSnapshotMetadataEntity.getProgressValue();
    zzb.zza(paramParcel, 14, l);
    localObject = paramSnapshotMetadataEntity.getDeviceName();
    zzb.zza(paramParcel, 15, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SnapshotMetadataEntity zzeD(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    Object localObject1 = null;
    Object localObject2 = null;
    String str1 = null;
    Object localObject3 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    long l1 = 0L;
    long l2 = 0L;
    float f = 0.0F;
    String str5 = null;
    boolean bool = false;
    long l3 = 0L;
    String str6 = null;
    Object localObject4;
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
        localObject1 = GameEntity.CREATOR;
        localObject4 = (GameEntity)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject2 = PlayerEntity.CREATOR;
        localObject4 = (PlayerEntity)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 3: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        localObject3 = Uri.CREATOR;
        localObject4 = (Uri)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 9: 
        l1 = zza.zzi(paramParcel, k);
        break;
      case 10: 
        l2 = zza.zzi(paramParcel, k);
        break;
      case 11: 
        f = zza.zzl(paramParcel, k);
        break;
      case 12: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 13: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 14: 
        l3 = zza.zzi(paramParcel, k);
        break;
      case 15: 
        str6 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject5 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject5, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject5 = new com/google/android/gms/games/snapshot/SnapshotMetadataEntity;
    ((SnapshotMetadataEntity)localObject5).<init>(j, (GameEntity)localObject1, (PlayerEntity)localObject2, str1, (Uri)localObject3, str2, str3, str4, l1, l2, f, str5, bool, l3, str6);
    return (SnapshotMetadataEntity)localObject5;
  }
  
  public SnapshotMetadataEntity[] zzgU(int paramInt)
  {
    return new SnapshotMetadataEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\snapshot\SnapshotMetadataEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */