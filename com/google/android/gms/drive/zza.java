package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(ChangeSequenceNumber paramChangeSequenceNumber, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramChangeSequenceNumber.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    long l = paramChangeSequenceNumber.zzaot;
    zzb.zza(paramParcel, 2, l);
    l = paramChangeSequenceNumber.zzaou;
    zzb.zza(paramParcel, 3, l);
    l = paramChangeSequenceNumber.zzaov;
    zzb.zza(paramParcel, 4, l);
    zzb.zzI(paramParcel, i);
  }
  
  public ChangeSequenceNumber zzaH(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    long l2 = l1;
    long l3 = l1;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, k);
        break;
      case 3: 
        l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, k);
        break;
      case 4: 
        l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    Object localObject = new com/google/android/gms/drive/ChangeSequenceNumber;
    ((ChangeSequenceNumber)localObject).<init>(j, l3, l2, l1);
    return (ChangeSequenceNumber)localObject;
  }
  
  public ChangeSequenceNumber[] zzcq(int paramInt)
  {
    return new ChangeSequenceNumber[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */