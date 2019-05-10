package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(CreateWalletObjectsRequest paramCreateWalletObjectsRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCreateWalletObjectsRequest.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCreateWalletObjectsRequest.zzbol;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramCreateWalletObjectsRequest.zzbom;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramCreateWalletObjectsRequest.zzbon;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CreateWalletObjectsRequest zzhr(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    Object localObject3 = null;
    int m = paramParcel.dataPosition();
    if (m < i)
    {
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = j;
      }
      for (;;)
      {
        j = k;
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject4;
        break;
        m = zza.zzg(paramParcel, m);
        Object localObject5 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = m;
        localObject4 = localObject5;
        continue;
        localObject3 = LoyaltyWalletObject.CREATOR;
        localObject4 = (LoyaltyWalletObject)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        k = j;
        localObject5 = localObject2;
        localObject2 = localObject4;
        localObject4 = localObject1;
        localObject1 = localObject5;
        continue;
        localObject2 = OfferWalletObject.CREATOR;
        localObject4 = (OfferWalletObject)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        k = j;
        localObject5 = localObject1;
        localObject1 = localObject4;
        localObject4 = localObject5;
        continue;
        localObject1 = GiftCardWalletObject.CREATOR;
        localObject4 = (GiftCardWalletObject)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = j;
      }
    }
    m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/wallet/CreateWalletObjectsRequest;
    ((CreateWalletObjectsRequest)localObject4).<init>(j, (LoyaltyWalletObject)localObject3, (OfferWalletObject)localObject2, (GiftCardWalletObject)localObject1);
    return (CreateWalletObjectsRequest)localObject4;
  }
  
  public CreateWalletObjectsRequest[] zzkP(int paramInt)
  {
    return new CreateWalletObjectsRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */