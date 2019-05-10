package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import java.util.ArrayList;
import java.util.List;

public class zzb
  implements Parcelable.Creator
{
  static void zza(Cart paramCart, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramCart.getVersionCode();
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCart.zzboh;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramCart.zzboi;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramCart.zzboj;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 4, (List)localObject, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public Cart zzhp(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    String str = null;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localObject1 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject2 = LineItem.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    Cart localCart = new com/google/android/gms/wallet/Cart;
    localCart.<init>(j, str, (String)localObject1, (ArrayList)localObject2);
    return localCart;
  }
  
  public Cart[] zzkN(int paramInt)
  {
    return new Cart[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wallet\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */