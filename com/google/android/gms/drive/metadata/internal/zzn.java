package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzn
  implements Parcelable.Creator
{
  static void zza(PartialDriveId paramPartialDriveId, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPartialDriveId.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramPartialDriveId.zzaoL;
    zzb.zza(paramParcel, 2, str, false);
    long l = paramPartialDriveId.zzaoM;
    zzb.zza(paramParcel, 3, l);
    j = paramPartialDriveId.zzaoN;
    zzb.zzc(paramParcel, 4, j);
    zzb.zzI(paramParcel, i);
  }
  
  public PartialDriveId zzci(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    String str1 = null;
    long l = 0L;
    int k = -1;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
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
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        str1 = zza.zzp(paramParcel, m);
        break;
      case 3: 
        l = zza.zzi(paramParcel, m);
        break;
      case 4: 
        k = zza.zzg(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject).<init>(str2, paramParcel);
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/drive/metadata/internal/PartialDriveId;
    ((PartialDriveId)localObject).<init>(j, str1, l, k);
    return (PartialDriveId)localObject;
  }
  
  public PartialDriveId[] zzed(int paramInt)
  {
    return new PartialDriveId[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\zzn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */