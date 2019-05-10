package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;

public class zza
  implements Parcelable.Creator
{
  static void zza(GeofencingRequest paramGeofencingRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    List localList = paramGeofencingRequest.zzyI();
    zzb.zzc(paramParcel, 1, localList, false);
    int j = paramGeofencingRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    j = paramGeofencingRequest.getInitialTrigger();
    zzb.zzc(paramParcel, 2, j);
    zzb.zzI(paramParcel, i);
  }
  
  public GeofencingRequest zzeP(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    Object localObject = null;
    int k = 0;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int n = com.google.android.gms.common.internal.safeparcel.zza.zzca(m);
      switch (n)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        localObject = ParcelableGeofence.CREATOR;
        localObject = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, m, (Parcelable.Creator)localObject);
        break;
      case 1000: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    GeofencingRequest localGeofencingRequest = new com/google/android/gms/location/GeofencingRequest;
    localGeofencingRequest.<init>(k, (List)localObject, i);
    return localGeofencingRequest;
  }
  
  public GeofencingRequest[] zzhq(int paramInt)
  {
    return new GeofencingRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */