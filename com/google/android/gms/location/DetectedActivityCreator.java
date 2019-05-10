package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class DetectedActivityCreator
  implements Parcelable.Creator
{
  public static final int CONTENT_DESCRIPTION;
  
  static void zza(DetectedActivity paramDetectedActivity, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramDetectedActivity.zzaNA;
    zzb.zzc(paramParcel, 1, j);
    j = paramDetectedActivity.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    j = paramDetectedActivity.zzaNB;
    zzb.zzc(paramParcel, 2, j);
    zzb.zzI(paramParcel, i);
  }
  
  public DetectedActivity createFromParcel(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject = null;
    int m = 0;
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
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    DetectedActivity localDetectedActivity = new com/google/android/gms/location/DetectedActivity;
    localDetectedActivity.<init>(m, k, i);
    return localDetectedActivity;
  }
  
  public DetectedActivity[] newArray(int paramInt)
  {
    return new DetectedActivity[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\DetectedActivityCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */