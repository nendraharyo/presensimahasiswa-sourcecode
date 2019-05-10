package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class VideoEntityCreator
  implements Parcelable.Creator
{
  static void zza(VideoEntity paramVideoEntity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramVideoEntity.getDuration();
    zzb.zzc(paramParcel, 1, j);
    j = paramVideoEntity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    String str = paramVideoEntity.zzxX();
    zzb.zza(paramParcel, 2, str, false);
    long l = paramVideoEntity.getFileSize();
    zzb.zza(paramParcel, 3, l);
    l = paramVideoEntity.getStartTime();
    zzb.zza(paramParcel, 4, l);
    str = paramVideoEntity.getPackageName();
    zzb.zza(paramParcel, 5, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public VideoEntity zzeH(Parcel paramParcel)
  {
    long l1 = 0L;
    String str1 = null;
    int i = 0;
    StringBuilder localStringBuilder = null;
    int j = zza.zzau(paramParcel);
    long l2 = l1;
    String str2 = null;
    int k = 0;
    zza.zza localzza = null;
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
        i = zza.zzg(paramParcel, m);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        l2 = zza.zzi(paramParcel, m);
        break;
      case 4: 
        l1 = zza.zzi(paramParcel, m);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/games/video/VideoEntity;
    ((VideoEntity)localObject).<init>(k, i, str2, l2, l1, str1);
    return (VideoEntity)localObject;
  }
  
  public VideoEntity[] zzhc(int paramInt)
  {
    return new VideoEntity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\video\VideoEntityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */