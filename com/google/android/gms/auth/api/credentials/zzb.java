package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(CredentialPickerConfig paramCredentialPickerConfig, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    boolean bool1 = paramCredentialPickerConfig.shouldShowAddAccountButton();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 1, bool1);
    int j = paramCredentialPickerConfig.mVersionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, j);
    boolean bool2 = paramCredentialPickerConfig.shouldShowCancelButton();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, bool2);
    bool2 = paramCredentialPickerConfig.isForNewAccount();
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, bool2);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public CredentialPickerConfig zzF(Parcel paramParcel)
  {
    boolean bool1 = false;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    boolean bool2 = false;
    Object localObject = null;
    boolean bool3 = false;
    int j = 0;
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
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool1 = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    CredentialPickerConfig localCredentialPickerConfig = new com/google/android/gms/auth/api/credentials/CredentialPickerConfig;
    localCredentialPickerConfig.<init>(j, bool3, bool2, bool1);
    return localCredentialPickerConfig;
  }
  
  public CredentialPickerConfig[] zzaA(int paramInt)
  {
    return new CredentialPickerConfig[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */