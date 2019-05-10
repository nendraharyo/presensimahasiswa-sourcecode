package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzbi
  implements Parcelable.Creator
{
  static void zza(OnStartStreamSession paramOnStartStreamSession, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramOnStartStreamSession.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramOnStartStreamSession.zzasv;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramOnStartStreamSession.zzasw;
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    localObject = paramOnStartStreamSession.zzsU;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public OnStartStreamSession zzbL(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    Object localObject3 = null;
    int m = paramParcel.dataPosition();
    if (m < i)
    {
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = j;
      }
      for (;;)
      {
        j = k;
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject4;
        break;
        m = zza.zzg(paramParcel, m);
        Object localObject5 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = m;
        localObject4 = localObject5;
        continue;
        localObject3 = ParcelFileDescriptor.CREATOR;
        localObject4 = (ParcelFileDescriptor)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        k = j;
        localObject5 = localObject2;
        localObject2 = localObject4;
        localObject4 = localObject1;
        localObject1 = localObject5;
        continue;
        localObject4 = zza.zzq(paramParcel, m);
        localObject2 = localObject3;
        k = j;
        localObject5 = localObject1;
        localObject1 = localObject4;
        localObject4 = localObject5;
        continue;
        localObject4 = zza.zzp(paramParcel, m);
        localObject1 = localObject2;
        localObject2 = localObject3;
        k = j;
      }
    }
    m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/drive/internal/OnStartStreamSession;
    ((OnStartStreamSession)localObject4).<init>(j, (ParcelFileDescriptor)localObject3, (IBinder)localObject2, (String)localObject1);
    return (OnStartStreamSession)localObject4;
  }
  
  public OnStartStreamSession[] zzdG(int paramInt)
  {
    return new OnStartStreamSession[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzbi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */