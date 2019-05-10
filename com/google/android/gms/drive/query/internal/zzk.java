package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzk
  implements Parcelable.Creator
{
  static void zza(LogicalFilter paramLogicalFilter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramLogicalFilter.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    Object localObject = paramLogicalFilter.zzaug;
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    localObject = paramLogicalFilter.zzauv;
    zzb.zzc(paramParcel, 2, (List)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public LogicalFilter zzcs(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    int k = 0;
    Object localObject2 = null;
    int m = paramParcel.dataPosition();
    if (m < i)
    {
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        localObject3 = localObject1;
        localObject1 = localObject2;
        k = j;
      }
      for (;;)
      {
        j = k;
        localObject2 = localObject1;
        localObject1 = localObject3;
        break;
        m = zza.zzg(paramParcel, m);
        Object localObject4 = localObject1;
        localObject1 = localObject2;
        k = m;
        localObject3 = localObject4;
        continue;
        localObject2 = Operator.CREATOR;
        localObject3 = (Operator)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        k = j;
        localObject4 = localObject3;
        localObject3 = localObject1;
        localObject1 = localObject4;
        continue;
        localObject1 = FilterHolder.CREATOR;
        localObject3 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject2;
        k = j;
      }
    }
    m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/drive/query/internal/LogicalFilter;
    ((LogicalFilter)localObject3).<init>(j, (Operator)localObject2, (List)localObject1);
    return (LogicalFilter)localObject3;
  }
  
  public LogicalFilter[] zzen(int paramInt)
  {
    return new LogicalFilter[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */