package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(ReferenceShiftedDetails paramReferenceShiftedDetails, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramReferenceShiftedDetails.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramReferenceShiftedDetails.zzavj;
    zzb.zza(paramParcel, 2, str, false);
    str = paramReferenceShiftedDetails.zzavk;
    zzb.zza(paramParcel, 3, str, false);
    j = paramReferenceShiftedDetails.zzavl;
    zzb.zzc(paramParcel, 4, j);
    j = paramReferenceShiftedDetails.zzavm;
    zzb.zzc(paramParcel, 5, j);
    zzb.zzI(paramParcel, i);
  }
  
  public ReferenceShiftedDetails zzcG(Parcel paramParcel)
  {
    String str = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    int k = 0;
    Object localObject1 = null;
    int m = 0;
    zza.zza localzza = null;
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
        localObject1 = zza.zzp(paramParcel, n);
        break;
      case 3: 
        str = zza.zzp(paramParcel, n);
        break;
      case 4: 
        k = zza.zzg(paramParcel, n);
        break;
      case 5: 
        i = zza.zzg(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/drive/realtime/internal/event/ReferenceShiftedDetails;
    ((ReferenceShiftedDetails)localObject2).<init>(m, (String)localObject1, str, k, i);
    return (ReferenceShiftedDetails)localObject2;
  }
  
  public ReferenceShiftedDetails[] zzeC(int paramInt)
  {
    return new ReferenceShiftedDetails[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */