package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(SafeParcelResponse paramSafeParcelResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramSafeParcelResponse.getVersionCode();
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramSafeParcelResponse.zzrD();
    zzb.zza(paramParcel, 2, (Parcel)localObject, false);
    localObject = paramSafeParcelResponse.zzrE();
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SafeParcelResponse zzaE(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject2 = zza.zzE(paramParcel, k);
        break;
      case 3: 
        localObject1 = FieldMappingDictionary.CREATOR;
        localObject1 = (FieldMappingDictionary)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    SafeParcelResponse localSafeParcelResponse = new com/google/android/gms/common/server/response/SafeParcelResponse;
    localSafeParcelResponse.<init>(j, (Parcel)localObject2, (FieldMappingDictionary)localObject1);
    return localSafeParcelResponse;
  }
  
  public SafeParcelResponse[] zzck(int paramInt)
  {
    return new SafeParcelResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\response\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */