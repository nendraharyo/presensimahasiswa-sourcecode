package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class LocationRequestCreator
  implements Parcelable.Creator
{
  public static final int CONTENT_DESCRIPTION;
  
  static void zza(LocationRequest paramLocationRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLocationRequest.mPriority;
    zzb.zzc(paramParcel, 1, j);
    j = paramLocationRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    long l = paramLocationRequest.zzaNY;
    zzb.zza(paramParcel, 2, l);
    l = paramLocationRequest.zzaNZ;
    zzb.zza(paramParcel, 3, l);
    boolean bool = paramLocationRequest.zzaBr;
    zzb.zza(paramParcel, 4, bool);
    l = paramLocationRequest.zzaND;
    zzb.zza(paramParcel, 5, l);
    int k = paramLocationRequest.zzaOa;
    zzb.zzc(paramParcel, 6, k);
    float f = paramLocationRequest.zzaOb;
    zzb.zza(paramParcel, 7, f);
    l = paramLocationRequest.zzaOc;
    zzb.zza(paramParcel, 8, l);
    zzb.zzI(paramParcel, i);
  }
  
  public LocationRequest createFromParcel(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    int k = 102;
    long l1 = 3600000L;
    long l2 = 600000L;
    boolean bool = false;
    long l3 = Long.MAX_VALUE;
    int m = -1 >>> 1;
    float f = 0.0F;
    long l4 = 0L;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= i) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        k = zza.zzg(paramParcel, n);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, n);
        break;
      case 2: 
        l1 = zza.zzi(paramParcel, n);
        break;
      case 3: 
        l2 = zza.zzi(paramParcel, n);
        break;
      case 4: 
        bool = zza.zzc(paramParcel, n);
        break;
      case 5: 
        l3 = zza.zzi(paramParcel, n);
        break;
      case 6: 
        m = zza.zzg(paramParcel, n);
        break;
      case 7: 
        f = zza.zzl(paramParcel, n);
        break;
      case 8: 
        l4 = zza.zzi(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/location/LocationRequest;
    ((LocationRequest)localObject).<init>(j, k, l1, l2, bool, l3, m, f, l4);
    return (LocationRequest)localObject;
  }
  
  public LocationRequest[] newArray(int paramInt)
  {
    return new LocationRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\LocationRequestCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */