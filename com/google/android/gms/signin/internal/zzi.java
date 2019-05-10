package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi
  implements Parcelable.Creator
{
  static void zza(SignInRequest paramSignInRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramSignInRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    ResolveAccountRequest localResolveAccountRequest = paramSignInRequest.zzFO();
    zzb.zza(paramParcel, 2, localResolveAccountRequest, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SignInRequest zzgU(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject2 = ResolveAccountRequest.CREATOR;
        localObject2 = (ResolveAccountRequest)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
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
    SignInRequest localSignInRequest = new com/google/android/gms/signin/internal/SignInRequest;
    localSignInRequest.<init>(j, (ResolveAccountRequest)localObject2);
    return localSignInRequest;
  }
  
  public SignInRequest[] zzkc(int paramInt)
  {
    return new SignInRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\signin\internal\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */