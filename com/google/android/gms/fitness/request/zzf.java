package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;
import java.util.List;

public class zzf
  implements Parcelable.Creator
{
  static void zza(DataReadRequest paramDataReadRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDataReadRequest.getDataTypes();
    zzb.zzc(paramParcel, 1, (List)localObject, false);
    localObject = paramDataReadRequest.getDataSources();
    zzb.zzc(paramParcel, 2, (List)localObject, false);
    long l = paramDataReadRequest.zzlO();
    zzb.zza(paramParcel, 3, l);
    l = paramDataReadRequest.zzud();
    zzb.zza(paramParcel, 4, l);
    localObject = paramDataReadRequest.getAggregatedDataTypes();
    zzb.zzc(paramParcel, 5, (List)localObject, false);
    localObject = paramDataReadRequest.getAggregatedDataSources();
    zzb.zzc(paramParcel, 6, (List)localObject, false);
    int j = paramDataReadRequest.getBucketType();
    zzb.zzc(paramParcel, 7, j);
    l = paramDataReadRequest.zzuR();
    zzb.zza(paramParcel, 8, l);
    localObject = paramDataReadRequest.getActivityDataSource();
    zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    j = paramDataReadRequest.getLimit();
    zzb.zzc(paramParcel, 10, j);
    boolean bool = paramDataReadRequest.zzuQ();
    zzb.zza(paramParcel, 12, bool);
    bool = paramDataReadRequest.zzuP();
    zzb.zza(paramParcel, 13, bool);
    localObject = paramDataReadRequest.getCallbackBinder();
    zzb.zza(paramParcel, 14, (IBinder)localObject, false);
    localObject = paramDataReadRequest.zzuS();
    zzb.zzc(paramParcel, 16, (List)localObject, false);
    int k = paramDataReadRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, k);
    zzb.zzI(paramParcel, i);
  }
  
  public DataReadRequest zzdl(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    long l1 = 0L;
    long l2 = 0L;
    Object localObject4 = null;
    Object localObject5 = null;
    int k = 0;
    long l3 = 0L;
    Object localObject6 = null;
    int m = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    IBinder localIBinder = null;
    Object localObject7 = null;
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
        localObject2 = DataType.CREATOR;
        localObject2 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject2);
        break;
      case 2: 
        localObject3 = DataSource.CREATOR;
        localObject3 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject3);
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, n);
        break;
      case 4: 
        l2 = zza.zzi(paramParcel, n);
        break;
      case 5: 
        localObject4 = DataType.CREATOR;
        localObject4 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject4);
        break;
      case 6: 
        localObject5 = DataSource.CREATOR;
        localObject5 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject5);
        break;
      case 7: 
        k = zza.zzg(paramParcel, n);
        break;
      case 8: 
        l3 = zza.zzi(paramParcel, n);
        break;
      case 9: 
        localObject6 = DataSource.CREATOR;
        localObject8 = (DataSource)zza.zza(paramParcel, n, (Parcelable.Creator)localObject6);
        localObject6 = localObject8;
        break;
      case 10: 
        m = zza.zzg(paramParcel, n);
        break;
      case 12: 
        bool1 = zza.zzc(paramParcel, n);
        break;
      case 13: 
        bool2 = zza.zzc(paramParcel, n);
        break;
      case 14: 
        localIBinder = zza.zzq(paramParcel, n);
        break;
      case 16: 
        localObject7 = Device.CREATOR;
        localObject7 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject7);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject8 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject8).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject8);
    }
    Object localObject8 = new com/google/android/gms/fitness/request/DataReadRequest;
    ((DataReadRequest)localObject8).<init>(j, (List)localObject2, (List)localObject3, l1, l2, (List)localObject4, (List)localObject5, k, l3, (DataSource)localObject6, m, bool1, bool2, localIBinder, (List)localObject7);
    return (DataReadRequest)localObject8;
  }
  
  public DataReadRequest[] zzfl(int paramInt)
  {
    return new DataReadRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */