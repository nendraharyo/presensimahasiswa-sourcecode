package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(BitmapTeleporter paramBitmapTeleporter, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramBitmapTeleporter.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    ParcelFileDescriptor localParcelFileDescriptor = paramBitmapTeleporter.zzIq;
    zzb.zza(paramParcel, 2, localParcelFileDescriptor, paramInt, false);
    j = paramBitmapTeleporter.zzabB;
    zzb.zzc(paramParcel, 3, j);
    zzb.zzI(paramParcel, i);
  }
  
  public BitmapTeleporter zzaj(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int k = 0;
    Object localObject2 = null;
    int m = 0;
    int n = paramParcel.dataPosition();
    if (n < j)
    {
      n = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzca(n);
      switch (i1)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, n);
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
        n = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, n);
        localObject1 = localObject2;
        k = n;
        n = i;
        continue;
        localObject2 = ParcelFileDescriptor.CREATOR;
        localObject3 = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, n, (Parcelable.Creator)localObject2);
        k = m;
        n = i;
        localObject1 = localObject3;
        continue;
        n = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, n);
        localObject1 = localObject2;
        k = m;
      }
    }
    n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/common/data/BitmapTeleporter;
    ((BitmapTeleporter)localObject3).<init>(m, (ParcelFileDescriptor)localObject2, i);
    return (BitmapTeleporter)localObject3;
  }
  
  public BitmapTeleporter[] zzbE(int paramInt)
  {
    return new BitmapTeleporter[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */