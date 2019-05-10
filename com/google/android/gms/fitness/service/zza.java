package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

public class zza
  implements Parcelable.Creator
{
  static void zza(FitnessSensorServiceRequest paramFitnessSensorServiceRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramFitnessSensorServiceRequest.getDataSource();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramFitnessSensorServiceRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramFitnessSensorServiceRequest.zzvb();
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    long l = paramFitnessSensorServiceRequest.zzux();
    zzb.zza(paramParcel, 3, l);
    l = paramFitnessSensorServiceRequest.zzvs();
    zzb.zza(paramParcel, 4, l);
    zzb.zzI(paramParcel, i);
  }
  
  public FitnessSensorServiceRequest zzdZ(Parcel paramParcel)
  {
    long l1 = 0L;
    IBinder localIBinder = null;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    long l2 = l1;
    Object localObject2 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        localObject2 = DataSource.CREATOR;
        localObject3 = (DataSource)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 1000: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        localIBinder = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 3: 
        l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, k);
        break;
      case 4: 
        l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/fitness/service/FitnessSensorServiceRequest;
    ((FitnessSensorServiceRequest)localObject3).<init>(j, (DataSource)localObject2, localIBinder, l2, l1);
    return (FitnessSensorServiceRequest)localObject3;
  }
  
  public FitnessSensorServiceRequest[] zzga(int paramInt)
  {
    return new FitnessSensorServiceRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\service\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */