package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzr
  implements Parcelable.Creator
{
  static void zza(ParcelableIndexReference paramParcelableIndexReference, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramParcelableIndexReference.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramParcelableIndexReference.zzauL;
    zzb.zza(paramParcel, 2, str, false);
    j = paramParcelableIndexReference.mIndex;
    zzb.zzc(paramParcel, 3, j);
    boolean bool = paramParcelableIndexReference.zzauM;
    zzb.zza(paramParcel, 4, bool);
    int k = paramParcelableIndexReference.zzauN;
    zzb.zzc(paramParcel, 5, k);
    zzb.zzI(paramParcel, i);
  }
  
  public ParcelableIndexReference zzcB(Parcel paramParcel)
  {
    boolean bool = false;
    int i = zza.zzau(paramParcel);
    Object localObject1 = null;
    int j = -1;
    int k = 0;
    int m = 0;
    zza.zza localzza = null;
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
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localObject1 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        k = zza.zzg(paramParcel, n);
        break;
      case 4: 
        bool = zza.zzc(paramParcel, n);
        break;
      case 5: 
        j = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/drive/realtime/internal/ParcelableIndexReference;
    ((ParcelableIndexReference)localObject2).<init>(m, (String)localObject1, k, bool, j);
    return (ParcelableIndexReference)localObject2;
  }
  
  public ParcelableIndexReference[] zzex(int paramInt)
  {
    return new ParcelableIndexReference[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\zzr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */