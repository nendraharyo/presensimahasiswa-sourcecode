package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(CredentialRequest paramCredentialRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    boolean bool = paramCredentialRequest.isPasswordLoginSupported();
    zzb.zza(paramParcel, 1, bool);
    int j = paramCredentialRequest.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    Object localObject = paramCredentialRequest.getAccountTypes();
    zzb.zza(paramParcel, 2, (String[])localObject, false);
    localObject = paramCredentialRequest.getCredentialPickerConfig();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramCredentialRequest.getCredentialHintPickerConfig();
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CredentialRequest zzG(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    Object localObject2 = null;
    String[] arrayOfString = null;
    int j = 0;
    Object localObject3 = null;
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
        bool = zza.zzc(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        arrayOfString = zza.zzB(paramParcel, k);
        break;
      case 3: 
        localObject2 = CredentialPickerConfig.CREATOR;
        localObject4 = (CredentialPickerConfig)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 4: 
        localObject1 = CredentialPickerConfig.CREATOR;
        localObject4 = (CredentialPickerConfig)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/auth/api/credentials/CredentialRequest;
    ((CredentialRequest)localObject4).<init>(j, bool, arrayOfString, (CredentialPickerConfig)localObject2, (CredentialPickerConfig)localObject1);
    return (CredentialRequest)localObject4;
  }
  
  public CredentialRequest[] zzaB(int paramInt)
  {
    return new CredentialRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */