package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj
  implements Parcelable.Creator
{
  static void zza(ValuesRemovedDetails paramValuesRemovedDetails, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramValuesRemovedDetails.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramValuesRemovedDetails.mIndex;
    zzb.zzc(paramParcel, 2, j);
    j = paramValuesRemovedDetails.zzauP;
    zzb.zzc(paramParcel, 3, j);
    j = paramValuesRemovedDetails.zzauQ;
    zzb.zzc(paramParcel, 4, j);
    String str = paramValuesRemovedDetails.zzavq;
    zzb.zza(paramParcel, 5, str, false);
    j = paramValuesRemovedDetails.zzavr;
    zzb.zzc(paramParcel, 6, j);
    zzb.zzI(paramParcel, i);
  }
  
  public ValuesRemovedDetails zzcL(Parcel paramParcel)
  {
    int i = 0;
    int j = zza.zzau(paramParcel);
    String str = null;
    int k = 0;
    int m = 0;
    int n = 0;
    StringBuilder localStringBuilder = null;
    int i1 = 0;
    zza.zza localzza = null;
    for (;;)
    {
      i2 = paramParcel.dataPosition();
      if (i2 >= j) {
        break;
      }
      i2 = zza.zzat(paramParcel);
      int i3 = zza.zzca(i2);
      switch (i3)
      {
      default: 
        zza.zzb(paramParcel, i2);
        break;
      case 1: 
        i1 = zza.zzg(paramParcel, i2);
        break;
      case 2: 
        n = zza.zzg(paramParcel, i2);
        break;
      case 3: 
        m = zza.zzg(paramParcel, i2);
        break;
      case 4: 
        k = zza.zzg(paramParcel, i2);
        break;
      case 5: 
        str = zza.zzp(paramParcel, i2);
        break;
      case 6: 
        i = zza.zzg(paramParcel, i2);
      }
    }
    int i2 = paramParcel.dataPosition();
    if (i2 != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;
    ((ValuesRemovedDetails)localObject).<init>(i1, n, m, k, str, i);
    return (ValuesRemovedDetails)localObject;
  }
  
  public ValuesRemovedDetails[] zzeH(int paramInt)
  {
    return new ValuesRemovedDetails[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */