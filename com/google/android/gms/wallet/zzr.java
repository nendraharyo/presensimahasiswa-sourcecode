package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzr
  implements Parcelable.Creator
{
  static void zza(ProxyCard paramProxyCard, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramProxyCard.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    String str = paramProxyCard.zzbpF;
    zzb.zza(paramParcel, 2, str, false);
    str = paramProxyCard.zzbpG;
    zzb.zza(paramParcel, 3, str, false);
    j = paramProxyCard.zzbpH;
    zzb.zzc(paramParcel, 4, j);
    j = paramProxyCard.zzbpI;
    zzb.zzc(paramParcel, 5, j);
    zzb.zzI(paramParcel, i);
  }
  
  public ProxyCard zzhF(Parcel paramParcel)
  {
    String str = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject1 = null;
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
        localObject1 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        str = zza.zzp(paramParcel, n);
        break;
      case 4: 
        k = zza.zzg(paramParcel, n);
        break;
      case 5: 
        i = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/wallet/ProxyCard;
    ((ProxyCard)localObject2).<init>(m, (String)localObject1, str, k, i);
    return (ProxyCard)localObject2;
  }
  
  public ProxyCard[] zzld(int paramInt)
  {
    return new ProxyCard[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */