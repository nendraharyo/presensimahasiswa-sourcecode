package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramAdLauncherIntentInfoParcel.versionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    Object localObject = paramAdLauncherIntentInfoParcel.intentAction;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramAdLauncherIntentInfoParcel.url;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramAdLauncherIntentInfoParcel.mimeType;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramAdLauncherIntentInfoParcel.packageName;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramAdLauncherIntentInfoParcel.zzDK;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramAdLauncherIntentInfoParcel.zzDL;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramAdLauncherIntentInfoParcel.zzDM;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramAdLauncherIntentInfoParcel.intent;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public AdLauncherIntentInfoParcel zzf(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    String str7 = null;
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
        str7 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str6 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        str5 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 9: 
        localObject1 = Intent.CREATOR;
        localObject3 = (Intent)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;
    ((AdLauncherIntentInfoParcel)localObject3).<init>(j, str7, str6, str5, str4, str3, str2, str1, (Intent)localObject1);
    return (AdLauncherIntentInfoParcel)localObject3;
  }
  
  public AdLauncherIntentInfoParcel[] zzv(int paramInt)
  {
    return new AdLauncherIntentInfoParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */