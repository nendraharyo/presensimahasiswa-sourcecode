package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzaa
  implements Parcelable.Creator
{
  static void zza(SignInButtonConfig paramSignInButtonConfig, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramSignInButtonConfig.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramSignInButtonConfig.zzrb();
    zzb.zzc(paramParcel, 2, j);
    j = paramSignInButtonConfig.zzrc();
    zzb.zzc(paramParcel, 3, j);
    Scope[] arrayOfScope = paramSignInButtonConfig.zzrd();
    zzb.zza(paramParcel, 4, arrayOfScope, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SignInButtonConfig zzar(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    int k = 0;
    int m = 0;
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
        k = zza.zzg(paramParcel, n);
        break;
      case 3: 
        i = zza.zzg(paramParcel, n);
        break;
      case 4: 
        localObject2 = Scope.CREATOR;
        localObject2 = (Scope[])zza.zzb(paramParcel, n, (Parcelable.Creator)localObject2);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    SignInButtonConfig localSignInButtonConfig = new com/google/android/gms/common/internal/SignInButtonConfig;
    localSignInButtonConfig.<init>(m, k, i, (Scope[])localObject2);
    return localSignInButtonConfig;
  }
  
  public SignInButtonConfig[] zzbY(int paramInt)
  {
    return new SignInButtonConfig[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzaa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */