package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(FieldChangedDetails paramFieldChangedDetails, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramFieldChangedDetails.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramFieldChangedDetails.zzauO;
    zzb.zzc(paramParcel, 2, j);
    zzb.zzI(paramParcel, i);
  }
  
  public FieldChangedDetails zzcC(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int k = 0;
    Object localObject = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int n = com.google.android.gms.common.internal.safeparcel.zza.zzca(m);
      switch (n)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    FieldChangedDetails localFieldChangedDetails = new com/google/android/gms/drive/realtime/internal/event/FieldChangedDetails;
    localFieldChangedDetails.<init>(k, i);
    return localFieldChangedDetails;
  }
  
  public FieldChangedDetails[] zzey(int paramInt)
  {
    return new FieldChangedDetails[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */