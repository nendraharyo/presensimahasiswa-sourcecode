package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(LoyaltyPointsBalance paramLoyaltyPointsBalance, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLoyaltyPointsBalance.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    j = paramLoyaltyPointsBalance.zzbqJ;
    zzb.zzc(paramParcel, 2, j);
    String str = paramLoyaltyPointsBalance.zzbqK;
    zzb.zza(paramParcel, 3, str, false);
    double d = paramLoyaltyPointsBalance.zzbqL;
    zzb.zza(paramParcel, 4, d);
    str = paramLoyaltyPointsBalance.zzboF;
    zzb.zza(paramParcel, 5, str, false);
    long l = paramLoyaltyPointsBalance.zzbqM;
    zzb.zza(paramParcel, 6, l);
    j = paramLoyaltyPointsBalance.zzbqN;
    zzb.zzc(paramParcel, 7, j);
    zzb.zzI(paramParcel, i);
  }
  
  public LoyaltyPointsBalance zzhR(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    StringBuilder localStringBuilder = null;
    int j = zza.zzau(paramParcel);
    double d = 0.0D;
    long l = 0L;
    int k = -1;
    String str2 = null;
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
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        i = zza.zzg(paramParcel, n);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, n);
        break;
      case 4: 
        d = zza.zzn(paramParcel, n);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, n);
        break;
      case 6: 
        l = zza.zzi(paramParcel, n);
        break;
      case 7: 
        k = zza.zzg(paramParcel, n);
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
    Object localObject = new com/google/android/gms/wallet/wobs/LoyaltyPointsBalance;
    ((LoyaltyPointsBalance)localObject).<init>(m, i, str2, d, str1, l, k);
    return (LoyaltyPointsBalance)localObject;
  }
  
  public LoyaltyPointsBalance[] zzls(int paramInt)
  {
    return new LoyaltyPointsBalance[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\wobs\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */