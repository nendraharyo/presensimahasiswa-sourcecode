package com.google.android.gms.ads.internal.purchase;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(GInAppPurchaseManagerInfoParcel paramGInAppPurchaseManagerInfoParcel, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGInAppPurchaseManagerInfoParcel.versionCode;
    zzb.zzc(paramParcel, 1, j);
    IBinder localIBinder = paramGInAppPurchaseManagerInfoParcel.zzfT();
    zzb.zza(paramParcel, 3, localIBinder, false);
    localIBinder = paramGInAppPurchaseManagerInfoParcel.zzfU();
    zzb.zza(paramParcel, 4, localIBinder, false);
    localIBinder = paramGInAppPurchaseManagerInfoParcel.zzfV();
    zzb.zza(paramParcel, 5, localIBinder, false);
    localIBinder = paramGInAppPurchaseManagerInfoParcel.zzfS();
    zzb.zza(paramParcel, 6, localIBinder, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GInAppPurchaseManagerInfoParcel[] zzA(int paramInt)
  {
    return new GInAppPurchaseManagerInfoParcel[paramInt];
  }
  
  public GInAppPurchaseManagerInfoParcel zzh(Parcel paramParcel)
  {
    IBinder localIBinder1 = null;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    IBinder localIBinder2 = null;
    IBinder localIBinder3 = null;
    Object localObject1 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      case 2: 
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 3: 
        localObject1 = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 4: 
        localIBinder3 = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 5: 
        localIBinder2 = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 6: 
        localIBinder1 = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/ads/internal/purchase/GInAppPurchaseManagerInfoParcel;
    ((GInAppPurchaseManagerInfoParcel)localObject2).<init>(j, (IBinder)localObject1, localIBinder3, localIBinder2, localIBinder1);
    return (GInAppPurchaseManagerInfoParcel)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */