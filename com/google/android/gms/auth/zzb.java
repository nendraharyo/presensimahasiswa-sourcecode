package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(AccountChangeEventsRequest paramAccountChangeEventsRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramAccountChangeEventsRequest.mVersion;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, j);
    j = paramAccountChangeEventsRequest.zzVc;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 2, j);
    Object localObject = paramAccountChangeEventsRequest.zzVa;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramAccountChangeEventsRequest.zzTI;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public AccountChangeEventsRequest zzA(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    int k = 0;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        localObject2 = zza.zzp(paramParcel, m);
        break;
      case 4: 
        localObject1 = Account.CREATOR;
        localObject1 = (Account)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    AccountChangeEventsRequest localAccountChangeEventsRequest = new com/google/android/gms/auth/AccountChangeEventsRequest;
    localAccountChangeEventsRequest.<init>(k, i, (String)localObject2, (Account)localObject1);
    return localAccountChangeEventsRequest;
  }
  
  public AccountChangeEventsRequest[] zzav(int paramInt)
  {
    return new AccountChangeEventsRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */