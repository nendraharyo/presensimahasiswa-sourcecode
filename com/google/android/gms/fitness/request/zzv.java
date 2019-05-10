package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public class zzv
  implements Parcelable.Creator
{
  static void zza(SensorRegistrationRequest paramSensorRegistrationRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramSensorRegistrationRequest.getDataSource();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramSensorRegistrationRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramSensorRegistrationRequest.getDataType();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramSensorRegistrationRequest.zzvb();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    j = paramSensorRegistrationRequest.zzaBi;
    zzb.zzc(paramParcel, 4, j);
    j = paramSensorRegistrationRequest.zzaBj;
    zzb.zzc(paramParcel, 5, j);
    long l = paramSensorRegistrationRequest.zzux();
    zzb.zza(paramParcel, 6, l);
    l = paramSensorRegistrationRequest.zzuY();
    zzb.zza(paramParcel, 7, l);
    localObject = paramSensorRegistrationRequest.getIntent();
    zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    l = paramSensorRegistrationRequest.zzuX();
    zzb.zza(paramParcel, 9, l);
    j = paramSensorRegistrationRequest.getAccuracyMode();
    zzb.zzc(paramParcel, 10, j);
    localObject = paramSensorRegistrationRequest.zzuZ();
    zzb.zzc(paramParcel, 11, (List)localObject, false);
    l = paramSensorRegistrationRequest.zzva();
    zzb.zza(paramParcel, 12, l);
    localObject = paramSensorRegistrationRequest.getCallbackBinder();
    zzb.zza(paramParcel, 13, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SensorRegistrationRequest zzdA(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    IBinder localIBinder1 = null;
    int k = 0;
    int m = 0;
    long l1 = 0L;
    long l2 = 0L;
    Object localObject4 = null;
    long l3 = 0L;
    int n = 0;
    Object localObject5 = null;
    long l4 = 0L;
    IBinder localIBinder2 = null;
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
        localObject2 = DataSource.CREATOR;
        localObject6 = (DataSource)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject2);
        localObject2 = localObject6;
        break;
      case 1000: 
        j = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        localObject3 = DataType.CREATOR;
        localObject6 = (DataType)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject3);
        localObject3 = localObject6;
        break;
      case 3: 
        localIBinder1 = zza.zzq(paramParcel, i1);
        break;
      case 4: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 5: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 6: 
        l1 = zza.zzi(paramParcel, i1);
        break;
      case 7: 
        l2 = zza.zzi(paramParcel, i1);
        break;
      case 8: 
        localObject4 = PendingIntent.CREATOR;
        localObject6 = (PendingIntent)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject4);
        localObject4 = localObject6;
        break;
      case 9: 
        l3 = zza.zzi(paramParcel, i1);
        break;
      case 10: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 11: 
        localObject5 = LocationRequest.CREATOR;
        localObject5 = zza.zzc(paramParcel, i1, (Parcelable.Creator)localObject5);
        break;
      case 12: 
        l4 = zza.zzi(paramParcel, i1);
        break;
      case 13: 
        localIBinder2 = zza.zzq(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != i)
    {
      localObject6 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject6).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject6);
    }
    Object localObject6 = new com/google/android/gms/fitness/request/SensorRegistrationRequest;
    ((SensorRegistrationRequest)localObject6).<init>(j, (DataSource)localObject2, (DataType)localObject3, localIBinder1, k, m, l1, l2, (PendingIntent)localObject4, l3, n, (List)localObject5, l4, localIBinder2);
    return (SensorRegistrationRequest)localObject6;
  }
  
  public SensorRegistrationRequest[] zzfA(int paramInt)
  {
    return new SensorRegistrationRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */