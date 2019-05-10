package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public class zzm
  implements Parcelable.Creator
{
  static void zza(LocationRequestInternal paramLocationRequestInternal, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramLocationRequestInternal.zzaBp;
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramLocationRequestInternal.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    boolean bool = paramLocationRequestInternal.zzaOP;
    zzb.zza(paramParcel, 2, bool);
    bool = paramLocationRequestInternal.zzaOQ;
    zzb.zza(paramParcel, 3, bool);
    bool = paramLocationRequestInternal.zzaOR;
    zzb.zza(paramParcel, 4, bool);
    localObject = paramLocationRequestInternal.zzaOS;
    zzb.zzc(paramParcel, 5, (List)localObject, false);
    localObject = paramLocationRequestInternal.mTag;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    bool = paramLocationRequestInternal.zzaOT;
    zzb.zza(paramParcel, 7, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public LocationRequestInternal zzeX(Parcel paramParcel)
  {
    String str = null;
    boolean bool1 = true;
    boolean bool2 = false;
    int i = zza.zzau(paramParcel);
    Object localObject1 = LocationRequestInternal.zzaOO;
    boolean bool3 = bool1;
    boolean bool4 = false;
    Object localObject2 = null;
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
        localObject2 = LocationRequest.CREATOR;
        localObject4 = (LocationRequest)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        bool4 = zza.zzc(paramParcel, k);
        break;
      case 3: 
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 4: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 5: 
        localObject1 = ClientIdentity.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
        break;
      case 6: 
        str = zza.zzp(paramParcel, k);
        break;
      case 7: 
        bool2 = zza.zzc(paramParcel, k);
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
    Object localObject4 = new com/google/android/gms/location/internal/LocationRequestInternal;
    ((LocationRequestInternal)localObject4).<init>(j, (LocationRequest)localObject2, bool4, bool3, bool1, (List)localObject1, str, bool2);
    return (LocationRequestInternal)localObject4;
  }
  
  public LocationRequestInternal[] zzhD(int paramInt)
  {
    return new LocationRequestInternal[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */