package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class ActivityRecognitionResultCreator
  implements Parcelable.Creator
{
  public static final int CONTENT_DESCRIPTION;
  
  static void zza(ActivityRecognitionResult paramActivityRecognitionResult, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramActivityRecognitionResult.zzaNu;
    zzb.zzc(paramParcel, 1, (List)localObject, false);
    int j = paramActivityRecognitionResult.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    long l = paramActivityRecognitionResult.zzaNv;
    zzb.zza(paramParcel, 2, l);
    l = paramActivityRecognitionResult.zzaNw;
    zzb.zza(paramParcel, 3, l);
    j = paramActivityRecognitionResult.zzaNx;
    zzb.zzc(paramParcel, 4, j);
    localObject = paramActivityRecognitionResult.extras;
    zzb.zza(paramParcel, 5, (Bundle)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ActivityRecognitionResult createFromParcel(Parcel paramParcel)
  {
    long l1 = 0L;
    Bundle localBundle = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    long l2 = l1;
    Object localObject1 = null;
    int k = 0;
    StringBuilder localStringBuilder = null;
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
        localObject1 = DetectedActivity.CREATOR;
        localObject1 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject1);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        l2 = zza.zzi(paramParcel, m);
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, m);
        break;
      case 4: 
        i = zza.zzg(paramParcel, m);
        break;
      case 5: 
        localBundle = zza.zzr(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>(str, paramParcel);
      throw ((Throwable)localObject2);
    }
    Object localObject2 = new com/google/android/gms/location/ActivityRecognitionResult;
    ((ActivityRecognitionResult)localObject2).<init>(k, (List)localObject1, l2, l1, i, localBundle);
    return (ActivityRecognitionResult)localObject2;
  }
  
  public ActivityRecognitionResult[] newArray(int paramInt)
  {
    return new ActivityRecognitionResult[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\ActivityRecognitionResultCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */