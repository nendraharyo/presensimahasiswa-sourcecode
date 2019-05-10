package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator
{
  static void zza(GetRecentContextCall.Request paramRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramRequest.zzTT;
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramRequest.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    boolean bool = paramRequest.zzTU;
    zzb.zza(paramParcel, 2, bool);
    bool = paramRequest.zzTV;
    zzb.zza(paramParcel, 3, bool);
    bool = paramRequest.zzTW;
    zzb.zza(paramParcel, 4, bool);
    localObject = paramRequest.zzTX;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetRecentContextCall.Request[] zzam(int paramInt)
  {
    return new GetRecentContextCall.Request[paramInt];
  }
  
  public GetRecentContextCall.Request zzv(Parcel paramParcel)
  {
    String str = null;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    boolean bool2 = false;
    boolean bool3 = false;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
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
        localObject1 = Account.CREATOR;
        localObject3 = (Account)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 5: 
        str = zza.zzp(paramParcel, k);
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
    Object localObject3 = new com/google/android/gms/appdatasearch/GetRecentContextCall$Request;
    ((GetRecentContextCall.Request)localObject3).<init>(j, (Account)localObject1, bool3, bool2, bool1, str);
    return (GetRecentContextCall.Request)localObject3;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appdatasearch\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */