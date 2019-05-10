package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzn
  implements Parcelable.Creator
{
  static void zza(RawBucket paramRawBucket, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    long l = paramRawBucket.zzRD;
    zzb.zza(paramParcel, 1, l);
    int j = paramRawBucket.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    l = paramRawBucket.zzavV;
    zzb.zza(paramParcel, 2, l);
    Object localObject = paramRawBucket.zzavX;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    j = paramRawBucket.zzaxf;
    zzb.zzc(paramParcel, 4, j);
    localObject = paramRawBucket.zzawg;
    zzb.zzc(paramParcel, 5, (List)localObject, false);
    j = paramRawBucket.zzawh;
    zzb.zzc(paramParcel, 6, j);
    boolean bool = paramRawBucket.zzawi;
    zzb.zza(paramParcel, 7, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public RawBucket zzcY(Parcel paramParcel)
  {
    long l1 = 0L;
    Object localObject1 = null;
    boolean bool = false;
    int i = zza.zzau(paramParcel);
    int j = 0;
    int k = 0;
    Object localObject2 = null;
    long l2 = l1;
    int m = 0;
    Object localObject3 = null;
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
        l2 = zza.zzi(paramParcel, n);
        break;
      case 1000: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        l1 = zza.zzi(paramParcel, n);
        break;
      case 3: 
        localObject2 = Session.CREATOR;
        localObject4 = (Session)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 4: 
        k = zza.zzg(paramParcel, n);
        break;
      case 5: 
        localObject1 = RawDataSet.CREATOR;
        localObject1 = zza.zzc(paramParcel, n, (Parcelable.Creator)localObject1);
        break;
      case 6: 
        j = zza.zzg(paramParcel, n);
        break;
      case 7: 
        bool = zza.zzc(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/fitness/data/RawBucket;
    ((RawBucket)localObject4).<init>(m, l2, l1, (Session)localObject2, k, (List)localObject1, j, bool);
    return (RawBucket)localObject4;
  }
  
  public RawBucket[] zzeX(int paramInt)
  {
    return new RawBucket[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */