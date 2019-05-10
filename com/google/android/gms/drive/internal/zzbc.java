package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbc
  implements Parcelable.Creator
{
  static void zza(OnListEntriesResponse paramOnListEntriesResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramOnListEntriesResponse.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    DataHolder localDataHolder = paramOnListEntriesResponse.zzass;
    zzb.zza(paramParcel, 2, localDataHolder, paramInt, false);
    boolean bool = paramOnListEntriesResponse.zzaqJ;
    zzb.zza(paramParcel, 3, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public OnListEntriesResponse zzbF(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject2 = null;
    int m = 0;
    int n = paramParcel.dataPosition();
    if (n < j)
    {
      n = zza.zzat(paramParcel);
      int i2 = zza.zzca(n);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, n);
        n = i;
        localObject1 = localObject2;
        k = m;
      }
      for (;;)
      {
        m = k;
        localObject2 = localObject1;
        i = n;
        break;
        n = zza.zzg(paramParcel, n);
        localObject1 = localObject2;
        k = n;
        n = i;
        continue;
        localObject2 = DataHolder.CREATOR;
        localObject3 = (DataHolder)zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        k = m;
        n = i;
        localObject1 = localObject3;
        continue;
        boolean bool = zza.zzc(paramParcel, n);
        localObject1 = localObject2;
        k = m;
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/drive/internal/OnListEntriesResponse;
    ((OnListEntriesResponse)localObject3).<init>(m, (DataHolder)localObject2, i);
    return (OnListEntriesResponse)localObject3;
  }
  
  public OnListEntriesResponse[] zzdA(int paramInt)
  {
    return new OnListEntriesResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzbc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */