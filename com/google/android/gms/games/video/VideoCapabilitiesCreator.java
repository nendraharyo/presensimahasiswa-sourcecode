package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class VideoCapabilitiesCreator
  implements Parcelable.Creator
{
  static void zza(VideoCapabilities paramVideoCapabilities, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    boolean bool1 = paramVideoCapabilities.zzxZ();
    zzb.zza(paramParcel, 1, bool1);
    int j = paramVideoCapabilities.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    boolean bool2 = paramVideoCapabilities.zzxY();
    zzb.zza(paramParcel, 2, bool2);
    bool2 = paramVideoCapabilities.zzya();
    zzb.zza(paramParcel, 3, bool2);
    boolean[] arrayOfBoolean = paramVideoCapabilities.zzyb();
    zzb.zza(paramParcel, 4, arrayOfBoolean, false);
    arrayOfBoolean = paramVideoCapabilities.zzyc();
    zzb.zza(paramParcel, 5, arrayOfBoolean, false);
    zzb.zzI(paramParcel, i);
  }
  
  public VideoCapabilities zzeF(Parcel paramParcel)
  {
    boolean[] arrayOfBoolean1 = null;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    boolean[] arrayOfBoolean2 = null;
    boolean bool2 = false;
    boolean bool3 = false;
    StringBuilder localStringBuilder = null;
    int j = 0;
    zza.zza localzza = null;
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
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        arrayOfBoolean2 = zza.zzu(paramParcel, k);
        break;
      case 5: 
        arrayOfBoolean1 = zza.zzu(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/games/video/VideoCapabilities;
    ((VideoCapabilities)localObject).<init>(j, bool3, bool2, bool1, arrayOfBoolean2, arrayOfBoolean1);
    return (VideoCapabilities)localObject;
  }
  
  public VideoCapabilities[] zzgY(int paramInt)
  {
    return new VideoCapabilities[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\video\VideoCapabilitiesCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */