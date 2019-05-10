package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class VideoConfigurationCreator
  implements Parcelable.Creator
{
  static void zza(VideoConfiguration paramVideoConfiguration, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramVideoConfiguration.zzyd();
    zzb.zzc(paramParcel, 1, j);
    j = paramVideoConfiguration.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    j = paramVideoConfiguration.zzye();
    zzb.zzc(paramParcel, 2, j);
    String str = paramVideoConfiguration.getStreamUrl();
    zzb.zza(paramParcel, 3, str, false);
    str = paramVideoConfiguration.zzyf();
    zzb.zza(paramParcel, 4, str, false);
    zzb.zzI(paramParcel, i);
  }
  
  public VideoConfiguration zzeG(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    String str2 = null;
    int k = 0;
    StringBuilder localStringBuilder = null;
    int m = 0;
    zza.zza localzza = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        k = zza.zzg(paramParcel, n);
        break;
      case 1000: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        i = zza.zzg(paramParcel, n);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/games/video/VideoConfiguration;
    ((VideoConfiguration)localObject).<init>(m, k, i, str2, str1);
    return (VideoConfiguration)localObject;
  }
  
  public VideoConfiguration[] zzhb(int paramInt)
  {
    return new VideoConfiguration[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\video\VideoConfigurationCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */