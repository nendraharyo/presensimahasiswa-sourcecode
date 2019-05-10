package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd
  implements Parcelable.Creator
{
  static void zza(HintRequest paramHintRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramHintRequest.getHintPickerConfig();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramHintRequest.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    boolean bool = paramHintRequest.isEmailAddressIdentifierSupported();
    zzb.zza(paramParcel, 2, bool);
    bool = paramHintRequest.zzmy();
    zzb.zza(paramParcel, 3, bool);
    localObject = paramHintRequest.getAccountTypes();
    zzb.zza(paramParcel, 4, (String[])localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public HintRequest zzH(Parcel paramParcel)
  {
    String[] arrayOfString = null;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    boolean bool2 = false;
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
        localObject1 = CredentialPickerConfig.CREATOR;
        localObject3 = (CredentialPickerConfig)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        arrayOfString = zza.zzB(paramParcel, k);
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
    Object localObject3 = new com/google/android/gms/auth/api/credentials/HintRequest;
    ((HintRequest)localObject3).<init>(j, (CredentialPickerConfig)localObject1, bool2, bool1, arrayOfString);
    return (HintRequest)localObject3;
  }
  
  public HintRequest[] zzaC(int paramInt)
  {
    return new HintRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */