package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(WalletObjectMessage paramWalletObjectMessage, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramWalletObjectMessage.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramWalletObjectMessage.zzbqO;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramWalletObjectMessage.body;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramWalletObjectMessage.zzbqR;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramWalletObjectMessage.zzbqS;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramWalletObjectMessage.zzbqT;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public WalletObjectMessage zzhW(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    String str1 = null;
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
        str1 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject4 = TimeInterval.CREATOR;
        localObject5 = (TimeInterval)zza.zza(paramParcel, k, (Parcelable.Creator)localObject4);
        localObject4 = localObject5;
        break;
      case 5: 
        localObject3 = UriData.CREATOR;
        localObject5 = (UriData)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 6: 
        localObject1 = UriData.CREATOR;
        localObject5 = (UriData)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject5;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/wallet/wobs/WalletObjectMessage;
    ((WalletObjectMessage)localObject5).<init>(j, str2, str1, (TimeInterval)localObject4, (UriData)localObject3, (UriData)localObject1);
    return (WalletObjectMessage)localObject5;
  }
  
  public WalletObjectMessage[] zzlx(int paramInt)
  {
    return new WalletObjectMessage[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\wobs\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */