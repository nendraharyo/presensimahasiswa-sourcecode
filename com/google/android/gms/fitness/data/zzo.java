package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzo
  implements Parcelable.Creator
{
  static void zza(RawDataPoint paramRawDataPoint, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    long l = paramRawDataPoint.zzawj;
    zzb.zza(paramParcel, 1, l);
    int j = paramRawDataPoint.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    l = paramRawDataPoint.zzawk;
    zzb.zza(paramParcel, 2, l);
    Value[] arrayOfValue = paramRawDataPoint.zzawl;
    zzb.zza(paramParcel, 3, arrayOfValue, paramInt, false);
    j = paramRawDataPoint.zzaxg;
    zzb.zzc(paramParcel, 4, j);
    j = paramRawDataPoint.zzaxh;
    zzb.zzc(paramParcel, 5, j);
    l = paramRawDataPoint.zzawn;
    zzb.zza(paramParcel, 6, l);
    l = paramRawDataPoint.zzawo;
    zzb.zza(paramParcel, 7, l);
    zzb.zzI(paramParcel, i);
  }
  
  public RawDataPoint zzcZ(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    long l1 = 0L;
    long l2 = 0L;
    Object localObject2 = null;
    int k = 0;
    int m = 0;
    long l3 = 0L;
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
        l1 = zza.zzi(paramParcel, n);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, n);
        break;
      case 2: 
        l2 = zza.zzi(paramParcel, n);
        break;
      case 3: 
        localObject2 = Value.CREATOR;
        localObject3 = (Value[])zza.zzb(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 4: 
        k = zza.zzg(paramParcel, n);
        break;
      case 5: 
        m = zza.zzg(paramParcel, n);
        break;
      case 6: 
        l3 = zza.zzi(paramParcel, n);
        break;
      case 7: 
        l4 = zza.zzi(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/fitness/data/RawDataPoint;
    ((RawDataPoint)localObject3).<init>(j, l1, l2, (Value[])localObject2, k, m, l3, l4);
    return (RawDataPoint)localObject3;
  }
  
  public RawDataPoint[] zzeY(int paramInt)
  {
    return new RawDataPoint[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */