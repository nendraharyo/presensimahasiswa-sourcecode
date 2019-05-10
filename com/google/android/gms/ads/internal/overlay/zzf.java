package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(AdOverlayInfoParcel paramAdOverlayInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAdOverlayInfoParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramAdOverlayInfoParcel.zzEA;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramAdOverlayInfoParcel.zzfs();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    localObject = paramAdOverlayInfoParcel.zzft();
    zzb.zza(paramParcel, 4, (IBinder)localObject, false);
    localObject = paramAdOverlayInfoParcel.zzfu();
    zzb.zza(paramParcel, 5, (IBinder)localObject, false);
    localObject = paramAdOverlayInfoParcel.zzfv();
    zzb.zza(paramParcel, 6, (IBinder)localObject, false);
    localObject = paramAdOverlayInfoParcel.zzEF;
    zzb.zza(paramParcel, 7, (String)localObject, false);
    boolean bool = paramAdOverlayInfoParcel.zzEG;
    zzb.zza(paramParcel, 8, bool);
    localObject = paramAdOverlayInfoParcel.zzEH;
    zzb.zza(paramParcel, 9, (String)localObject, false);
    localObject = paramAdOverlayInfoParcel.zzfx();
    zzb.zza(paramParcel, 10, (IBinder)localObject, false);
    int k = paramAdOverlayInfoParcel.orientation;
    zzb.zzc(paramParcel, 11, k);
    k = paramAdOverlayInfoParcel.zzEJ;
    zzb.zzc(paramParcel, 12, k);
    localObject = paramAdOverlayInfoParcel.url;
    zzb.zza(paramParcel, 13, (String)localObject, false);
    localObject = paramAdOverlayInfoParcel.zzrl;
    zzb.zza(paramParcel, 14, (Parcelable)localObject, paramInt, false);
    localObject = paramAdOverlayInfoParcel.zzfw();
    zzb.zza(paramParcel, 15, (IBinder)localObject, false);
    localObject = paramAdOverlayInfoParcel.zzEM;
    zzb.zza(paramParcel, 17, (Parcelable)localObject, paramInt, false);
    localObject = paramAdOverlayInfoParcel.zzEL;
    zzb.zza(paramParcel, 16, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AdOverlayInfoParcel zzg(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    IBinder localIBinder1 = null;
    IBinder localIBinder2 = null;
    IBinder localIBinder3 = null;
    IBinder localIBinder4 = null;
    String str1 = null;
    boolean bool = false;
    String str2 = null;
    IBinder localIBinder5 = null;
    int k = 0;
    int m = 0;
    String str3 = null;
    Object localObject3 = null;
    IBinder localIBinder6 = null;
    String str4 = null;
    Object localObject4 = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
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
        j = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localObject2 = AdLauncherIntentInfoParcel.CREATOR;
        localObject5 = (AdLauncherIntentInfoParcel)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 3: 
        localIBinder1 = zza.zzq(paramParcel, n);
        break;
      case 4: 
        localIBinder2 = zza.zzq(paramParcel, n);
        break;
      case 5: 
        localIBinder3 = zza.zzq(paramParcel, n);
        break;
      case 6: 
        localIBinder4 = zza.zzq(paramParcel, n);
        break;
      case 7: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 8: 
        bool = zza.zzc(paramParcel, n);
        break;
      case 9: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 10: 
        localIBinder5 = zza.zzq(paramParcel, n);
        break;
      case 11: 
        k = zza.zzg(paramParcel, n);
        break;
      case 12: 
        m = zza.zzg(paramParcel, n);
        break;
      case 13: 
        str3 = zza.zzp(paramParcel, n);
        break;
      case 14: 
        localObject3 = VersionInfoParcel.CREATOR;
        localObject5 = (VersionInfoParcel)zza.zza(paramParcel, n, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 15: 
        localIBinder6 = zza.zzq(paramParcel, n);
        break;
      case 17: 
        localObject4 = InterstitialAdParameterParcel.CREATOR;
        localObject5 = (InterstitialAdParameterParcel)zza.zza(paramParcel, n, (Parcelable.Creator)localObject4);
        localObject4 = localObject5;
        break;
      case 16: 
        str4 = zza.zzp(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    ((AdOverlayInfoParcel)localObject5).<init>(j, (AdLauncherIntentInfoParcel)localObject2, localIBinder1, localIBinder2, localIBinder3, localIBinder4, str1, bool, str2, localIBinder5, k, m, str3, (VersionInfoParcel)localObject3, localIBinder6, str4, (InterstitialAdParameterParcel)localObject4);
    return (AdOverlayInfoParcel)localObject5;
  }
  
  public AdOverlayInfoParcel[] zzz(int paramInt)
  {
    return new AdOverlayInfoParcel[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */