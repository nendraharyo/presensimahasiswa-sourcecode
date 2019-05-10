package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(LoyaltyPoints paramLoyaltyPoints, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLoyaltyPoints.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramLoyaltyPoints.label;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramLoyaltyPoints.zzbqI;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramLoyaltyPoints.type;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramLoyaltyPoints.zzboY;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LoyaltyPoints zzhS(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    String str1 = null;
    Object localObject3 = null;
    String str2 = null;
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
        str2 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localObject3 = LoyaltyPointsBalance.CREATOR;
        localObject4 = (LoyaltyPointsBalance)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 4: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        localObject1 = TimeInterval.CREATOR;
        localObject4 = (TimeInterval)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/wallet/wobs/LoyaltyPoints;
    ((LoyaltyPoints)localObject4).<init>(j, str2, (LoyaltyPointsBalance)localObject3, str1, (TimeInterval)localObject1);
    return (LoyaltyPoints)localObject4;
  }
  
  public LoyaltyPoints[] zzlt(int paramInt)
  {
    return new LoyaltyPoints[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\wobs\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */