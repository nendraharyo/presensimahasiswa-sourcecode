package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator
{
  static void zza(TextInsertedDetails paramTextInsertedDetails, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramTextInsertedDetails.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramTextInsertedDetails.mIndex;
    zzb.zzc(paramParcel, 2, j);
    j = paramTextInsertedDetails.zzavn;
    zzb.zzc(paramParcel, 3, j);
    zzb.zzI(paramParcel, i);
  }
  
  public TextInsertedDetails zzcI(Parcel paramParcel)
  {
    int i = 0;
    zza.zza localzza = null;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject = null;
    int m = 0;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
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
        k = zza.zzg(paramParcel, n);
        break;
      case 3: 
        i = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    TextInsertedDetails localTextInsertedDetails = new com/google/android/gms/drive/realtime/internal/event/TextInsertedDetails;
    localTextInsertedDetails.<init>(m, k, i);
    return localTextInsertedDetails;
  }
  
  public TextInsertedDetails[] zzeE(int paramInt)
  {
    return new TextInsertedDetails[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */