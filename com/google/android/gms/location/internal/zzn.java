package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzn
  implements Parcelable.Creator
{
  static void zza(LocationRequestUpdateData paramLocationRequestUpdateData, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLocationRequestUpdateData.zzaOU;
    zzb.zzc(paramParcel, 1, j);
    j = paramLocationRequestUpdateData.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    Object localObject = paramLocationRequestUpdateData.zzaOV;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramLocationRequestUpdateData.zzyQ();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    localObject = paramLocationRequestUpdateData.mPendingIntent;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramLocationRequestUpdateData.zzyR();
    zzb.zza(paramParcel, 5, (IBinder)localObject, false);
    localObject = paramLocationRequestUpdateData.zzyS();
    zzb.zza(paramParcel, 6, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LocationRequestUpdateData zzeY(Parcel paramParcel)
  {
    IBinder localIBinder1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    int k = 1;
    IBinder localIBinder2 = null;
    Object localObject2 = null;
    IBinder localIBinder3 = null;
    Object localObject3 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
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
      case 1000: 
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject3 = LocationRequestInternal.CREATOR;
        localObject4 = (LocationRequestInternal)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject4;
        break;
      case 3: 
        localIBinder3 = zza.zzq(paramParcel, m);
        break;
      case 4: 
        localObject2 = PendingIntent.CREATOR;
        localObject4 = (PendingIntent)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 5: 
        localIBinder2 = zza.zzq(paramParcel, m);
        break;
      case 6: 
        localIBinder1 = zza.zzq(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/location/internal/LocationRequestUpdateData;
    ((LocationRequestUpdateData)localObject4).<init>(j, k, (LocationRequestInternal)localObject3, localIBinder3, (PendingIntent)localObject2, localIBinder2, localIBinder1);
    return (LocationRequestUpdateData)localObject4;
  }
  
  public LocationRequestUpdateData[] zzhE(int paramInt)
  {
    return new LocationRequestUpdateData[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\internal\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */