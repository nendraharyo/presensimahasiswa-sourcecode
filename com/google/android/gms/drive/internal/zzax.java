package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzax
  implements Parcelable.Creator
{
  static void zza(OnDeviceUsagePreferenceResponse paramOnDeviceUsagePreferenceResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramOnDeviceUsagePreferenceResponse.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    FileUploadPreferencesImpl localFileUploadPreferencesImpl = paramOnDeviceUsagePreferenceResponse.zzasg;
    zzb.zza(paramParcel, 2, localFileUploadPreferencesImpl, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public OnDeviceUsagePreferenceResponse zzbA(Parcel paramParcel)
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
        localObject2 = FileUploadPreferencesImpl.CREATOR;
        localObject2 = (FileUploadPreferencesImpl)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
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
    OnDeviceUsagePreferenceResponse localOnDeviceUsagePreferenceResponse = new com/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;
    localOnDeviceUsagePreferenceResponse.<init>(j, (FileUploadPreferencesImpl)localObject2);
    return localOnDeviceUsagePreferenceResponse;
  }
  
  public OnDeviceUsagePreferenceResponse[] zzdv(int paramInt)
  {
    return new OnDeviceUsagePreferenceResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzax.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */