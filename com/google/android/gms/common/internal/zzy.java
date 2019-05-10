package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzy
  implements Parcelable.Creator
{
  static void zza(ResolveAccountRequest paramResolveAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramResolveAccountRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramResolveAccountRequest.getAccount();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    j = paramResolveAccountRequest.getSessionId();
    zzb.zzc(paramParcel, 3, j);
    localObject = paramResolveAccountRequest.zzqW();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ResolveAccountRequest zzap(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int k = zza.zzau(paramParcel);
    int m = 0;
    Object localObject3 = null;
    int n = 0;
    int i1 = paramParcel.dataPosition();
    if (i1 < k)
    {
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        localObject4 = localObject1;
        i = j;
        localObject2 = localObject3;
        m = n;
      }
      for (;;)
      {
        n = m;
        localObject3 = localObject2;
        j = i;
        localObject1 = localObject4;
        break;
        i1 = zza.zzg(paramParcel, i1);
        i = j;
        localObject2 = localObject3;
        m = i1;
        localObject4 = localObject1;
        continue;
        localObject3 = Account.CREATOR;
        localObject4 = (Account)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject3);
        m = n;
        localObject2 = localObject4;
        localObject4 = localObject1;
        i = j;
        continue;
        i1 = zza.zzg(paramParcel, i1);
        localObject2 = localObject3;
        m = n;
        i = i1;
        localObject4 = localObject1;
        continue;
        localObject1 = GoogleSignInAccount.CREATOR;
        localObject4 = (GoogleSignInAccount)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject1);
        i = j;
        localObject2 = localObject3;
        m = n;
      }
    }
    i1 = paramParcel.dataPosition();
    if (i1 != k)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + k;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/common/internal/ResolveAccountRequest;
    ((ResolveAccountRequest)localObject4).<init>(n, (Account)localObject3, j, (GoogleSignInAccount)localObject1);
    return (ResolveAccountRequest)localObject4;
  }
  
  public ResolveAccountRequest[] zzbW(int paramInt)
  {
    return new ResolveAccountRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */