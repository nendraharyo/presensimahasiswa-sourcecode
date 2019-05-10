package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk
  implements Parcelable.Creator
{
  static void zza(ValuesSetDetails paramValuesSetDetails, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramValuesSetDetails.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramValuesSetDetails.mIndex;
    zzb.zzc(paramParcel, 2, j);
    j = paramValuesSetDetails.zzauP;
    zzb.zzc(paramParcel, 3, j);
    j = paramValuesSetDetails.zzauQ;
    zzb.zzc(paramParcel, 4, j);
    zzb.zzI(paramParcel, i);
  }
  
  public ValuesSetDetails zzcM(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject = null;
    int m = 0;
    int n = 0;
    for (;;)
    {
      i1 = paramParcel.dataPosition();
      if (i1 >= j) {
        break;
      }
      i1 = zza.zzat(paramParcel);
      int i2 = zza.zzca(i1);
      switch (i2)
      {
      default: 
        zza.zzb(paramParcel, i1);
        break;
      case 1: 
        n = zza.zzg(paramParcel, i1);
        break;
      case 2: 
        m = zza.zzg(paramParcel, i1);
        break;
      case 3: 
        k = zza.zzg(paramParcel, i1);
        break;
      case 4: 
        i = zza.zzg(paramParcel, i1);
      }
    }
    int i1 = paramParcel.dataPosition();
    if (i1 != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    ValuesSetDetails localValuesSetDetails = new com/google/android/gms/drive/realtime/internal/event/ValuesSetDetails;
    localValuesSetDetails.<init>(n, m, k, i);
    return localValuesSetDetails;
  }
  
  public ValuesSetDetails[] zzeI(int paramInt)
  {
    return new ValuesSetDetails[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */