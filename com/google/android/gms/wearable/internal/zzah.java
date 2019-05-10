package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzah
  implements Parcelable.Creator
{
  static void zza(GetAllCapabilitiesResponse paramGetAllCapabilitiesResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetAllCapabilitiesResponse.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramGetAllCapabilitiesResponse.statusCode;
    zzb.zzc(paramParcel, 2, j);
    List localList = paramGetAllCapabilitiesResponse.zzbsA;
    zzb.zzc(paramParcel, 3, localList, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetAllCapabilitiesResponse zzin(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    int k = 0;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        localObject2 = CapabilityInfoParcelable.CREATOR;
        localObject2 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject2);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    GetAllCapabilitiesResponse localGetAllCapabilitiesResponse = new com/google/android/gms/wearable/internal/GetAllCapabilitiesResponse;
    localGetAllCapabilitiesResponse.<init>(k, i, (List)localObject2);
    return localGetAllCapabilitiesResponse;
  }
  
  public GetAllCapabilitiesResponse[] zzlR(int paramInt)
  {
    return new GetAllCapabilitiesResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzah.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */