package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator
{
  static void zza(GeneratePasswordRequest paramGeneratePasswordRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    PasswordSpecification localPasswordSpecification = paramGeneratePasswordRequest.zzmr();
    zzb.zza(paramParcel, 1, localPasswordSpecification, paramInt, false);
    int j = paramGeneratePasswordRequest.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    zzb.zzI(paramParcel, i);
  }
  
  public GeneratePasswordRequest zzL(Parcel paramParcel)
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
        localObject2 = PasswordSpecification.CREATOR;
        localObject2 = (PasswordSpecification)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
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
    GeneratePasswordRequest localGeneratePasswordRequest = new com/google/android/gms/auth/api/credentials/internal/GeneratePasswordRequest;
    localGeneratePasswordRequest.<init>(j, (PasswordSpecification)localObject2);
    return localGeneratePasswordRequest;
  }
  
  public GeneratePasswordRequest[] zzaG(int paramInt)
  {
    return new GeneratePasswordRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\internal\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */