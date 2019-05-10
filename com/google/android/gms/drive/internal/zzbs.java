package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbs
  implements Parcelable.Creator
{
  static void zza(SetPinnedDownloadPreferencesRequest paramSetPinnedDownloadPreferencesRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramSetPinnedDownloadPreferencesRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    ParcelableTransferPreferences localParcelableTransferPreferences = paramSetPinnedDownloadPreferencesRequest.zzasu;
    zzb.zza(paramParcel, 2, localParcelableTransferPreferences, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SetPinnedDownloadPreferencesRequest zzbU(Parcel paramParcel)
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
        localObject2 = ParcelableTransferPreferences.CREATOR;
        localObject2 = (ParcelableTransferPreferences)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
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
    SetPinnedDownloadPreferencesRequest localSetPinnedDownloadPreferencesRequest = new com/google/android/gms/drive/internal/SetPinnedDownloadPreferencesRequest;
    localSetPinnedDownloadPreferencesRequest.<init>(j, (ParcelableTransferPreferences)localObject2);
    return localSetPinnedDownloadPreferencesRequest;
  }
  
  public SetPinnedDownloadPreferencesRequest[] zzdP(int paramInt)
  {
    return new SetPinnedDownloadPreferencesRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzbs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */