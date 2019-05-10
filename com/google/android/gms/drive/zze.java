package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(DriveId paramDriveId, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramDriveId.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    String str = paramDriveId.zzaoL;
    zzb.zza(paramParcel, 2, str, false);
    long l = paramDriveId.zzaoM;
    zzb.zza(paramParcel, 3, l);
    l = paramDriveId.zzaou;
    zzb.zza(paramParcel, 4, l);
    j = paramDriveId.zzaoN;
    zzb.zzc(paramParcel, 5, j);
    zzb.zzI(paramParcel, i);
  }
  
  public DriveId zzaK(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    String str1 = null;
    int k = -1;
    long l2 = l1;
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
        l2 = zza.zzi(paramParcel, m);
        break;
      case 4: 
        l1 = zza.zzi(paramParcel, m);
        break;
      case 5: 
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
    Object localObject = new com/google/android/gms/drive/DriveId;
    ((DriveId)localObject).<init>(j, str1, l2, l1, k);
    return (DriveId)localObject;
  }
  
  public DriveId[] zzct(int paramInt)
  {
    return new DriveId[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */