package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.List;

public class zzb
  implements Parcelable.Creator
{
  static void zza(SortOrder paramSortOrder, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    int j = paramSortOrder.mVersionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, j);
    List localList = paramSortOrder.zzaud;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1, localList, false);
    boolean bool = paramSortOrder.zzaue;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 2, bool);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public SortOrder zzck(Parcel paramParcel)
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
        localObject = FieldWithSortOrder.CREATOR;
        localObject = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject);
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
    SortOrder localSortOrder = new com/google/android/gms/drive/query/SortOrder;
    localSortOrder.<init>(j, (List)localObject, bool);
    return localSortOrder;
  }
  
  public SortOrder[] zzef(int paramInt)
  {
    return new SortOrder[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */