package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(DataHolder paramDataHolder, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDataHolder.zzqe();
    zzb.zza(paramParcel, 1, (String[])localObject, false);
    int j = paramDataHolder.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramDataHolder.zzqf();
    zzb.zza(paramParcel, 2, (Parcelable[])localObject, paramInt, false);
    j = paramDataHolder.getStatusCode();
    zzb.zzc(paramParcel, 3, j);
    localObject = paramDataHolder.zzpZ();
    zzb.zza(paramParcel, 4, (Bundle)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataHolder zzak(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle = null;
    int j = zza.zzau(paramParcel);
    Object localObject1 = null;
    String[] arrayOfString = null;
    int k = 0;
    Object localObject2 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        arrayOfString = zza.zzB(paramParcel, m);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject1 = CursorWindow.CREATOR;
        localObject3 = (CursorWindow[])zza.zzb(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 3: 
        i = zza.zzg(paramParcel, m);
        break;
      case 4: 
        localBundle = zza.zzr(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/common/data/DataHolder;
    ((DataHolder)localObject3).<init>(k, arrayOfString, (CursorWindow[])localObject1, i, localBundle);
    ((DataHolder)localObject3).zzqd();
    return (DataHolder)localObject3;
  }
  
  public DataHolder[] zzbJ(int paramInt)
  {
    return new DataHolder[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */