package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl
  implements Parcelable.Creator
{
  static void zza(QueryResultEventParcelable paramQueryResultEventParcelable, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramQueryResultEventParcelable.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    DataHolder localDataHolder = paramQueryResultEventParcelable.zzahi;
    zzb.zza(paramParcel, 2, localDataHolder, paramInt, false);
    boolean bool = paramQueryResultEventParcelable.zzapQ;
    zzb.zza(paramParcel, 3, bool);
    int k = paramQueryResultEventParcelable.zzapR;
    zzb.zzc(paramParcel, 4, k);
    zzb.zzI(paramParcel, i);
  }
  
  public QueryResultEventParcelable zzaT(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject2 = null;
    int m = 0;
    Object localObject3 = null;
    int n = 0;
    int i1 = paramParcel.dataPosition();
    if (i1 < j)
    {
      i1 = zza.zzat(paramParcel);
      int i4 = zza.zzca(i1);
      switch (i4)
      {
      default: 
        zza.zzb(paramParcel, i1);
        i1 = i;
        i = m;
        localObject3 = localObject2;
        k = n;
      }
      for (;;)
      {
        n = k;
        localObject2 = localObject3;
        m = i;
        i = i1;
        break;
        i1 = zza.zzg(paramParcel, i1);
        int i5 = i;
        i = m;
        localObject3 = localObject2;
        k = i1;
        i1 = i5;
        continue;
        localObject2 = DataHolder.CREATOR;
        localObject4 = (DataHolder)zza.zza(paramParcel, i1, (Parcelable.Creator)localObject2);
        k = n;
        i5 = m;
        localObject3 = localObject4;
        i1 = i;
        i = m;
        continue;
        int i2 = zza.zzc(paramParcel, i1);
        localObject3 = localObject2;
        k = n;
        i5 = i;
        i = i2;
        i2 = i5;
        continue;
        i3 = zza.zzg(paramParcel, i2);
        i = m;
        localObject3 = localObject2;
        k = n;
      }
    }
    int i3 = paramParcel.dataPosition();
    if (i3 != j)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/drive/events/QueryResultEventParcelable;
    ((QueryResultEventParcelable)localObject4).<init>(n, (DataHolder)localObject2, m, i);
    return (QueryResultEventParcelable)localObject4;
  }
  
  public QueryResultEventParcelable[] zzcI(int paramInt)
  {
    return new QueryResultEventParcelable[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */