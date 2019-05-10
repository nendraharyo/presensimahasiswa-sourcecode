package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(FieldWithSortOrder paramFieldWithSortOrder, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramFieldWithSortOrder.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    String str = paramFieldWithSortOrder.zzasF;
    zzb.zza(paramParcel, 1, str, false);
    boolean bool = paramFieldWithSortOrder.zzauj;
    zzb.zza(paramParcel, 2, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public FieldWithSortOrder zzcn(Parcel paramParcel)
  {
    boolean bool = false;
    zza.zza localzza = null;
    int i = zza.zzau(paramParcel);
    Object localObject = null;
    int j = 0;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 1: 
        localObject = zza.zzp(paramParcel, k);
        break;
      case 2: 
        bool = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject, paramParcel);
      throw localzza;
    }
    FieldWithSortOrder localFieldWithSortOrder = new com/google/android/gms/drive/query/internal/FieldWithSortOrder;
    localFieldWithSortOrder.<init>(j, (String)localObject, bool);
    return localFieldWithSortOrder;
  }
  
  public FieldWithSortOrder[] zzei(int paramInt)
  {
    return new FieldWithSortOrder[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */