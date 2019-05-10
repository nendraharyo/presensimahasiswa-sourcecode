package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzo
  implements Parcelable.Creator
{
  static void zza(ParcelableGeofence paramParcelableGeofence, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    String str = paramParcelableGeofence.getRequestId();
    zzb.zza(paramParcel, 1, str, false);
    int j = paramParcelableGeofence.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    long l = paramParcelableGeofence.getExpirationTime();
    zzb.zza(paramParcel, 2, l);
    j = paramParcelableGeofence.zzyT();
    zzb.zza(paramParcel, 3, j);
    double d = paramParcelableGeofence.getLatitude();
    zzb.zza(paramParcel, 4, d);
    d = paramParcelableGeofence.getLongitude();
    zzb.zza(paramParcel, 5, d);
    float f = paramParcelableGeofence.zzyU();
    zzb.zza(paramParcel, 6, f);
    int k = paramParcelableGeofence.zzyV();
    zzb.zzc(paramParcel, 7, k);
    k = paramParcelableGeofence.getNotificationResponsiveness();
    zzb.zzc(paramParcel, 8, k);
    k = paramParcelableGeofence.zzyW();
    zzb.zzc(paramParcel, 9, k);
    zzb.zzI(paramParcel, i);
  }
  
  public ParcelableGeofence zzeZ(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    String str1 = null;
    int k = 0;
    short s = 0;
    double d1 = 0.0D;
    double d2 = 0.0D;
    float f = 0.0F;
    long l = 0L;
    int m = 0;
    int n = -1;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= i) {
        break;
      }
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        str1 = zza.zzp(paramParcel, i1);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        l = zza.zzi(paramParcel, i1);
        break;
      case 3: 
        s = zza.zzf(paramParcel, i1);
        break;
      case 4: 
        d1 = zza.zzn(paramParcel, i1);
        break;
      case 5: 
        d2 = zza.zzn(paramParcel, i1);
        break;
      case 6: 
        f = zza.zzl(paramParcel, i1);
        break;
      case 7: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 8: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 9: 
        n = zza.zzg(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != i)
    {
      localObject = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject).<init>(str2, paramParcel);
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/location/internal/ParcelableGeofence;
    ((ParcelableGeofence)localObject).<init>(j, str1, k, s, d1, d2, f, l, m, n);
    return (ParcelableGeofence)localObject;
  }
  
  public ParcelableGeofence[] zzhH(int paramInt)
  {
    return new ParcelableGeofence[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */