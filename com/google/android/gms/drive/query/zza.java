package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.ArrayList;
import java.util.List;

public class zza
  implements Parcelable.Creator
{
  static void zza(Query paramQuery, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramQuery.mVersionCode;
    zzb.zzc(paramParcel, 1000, j);
    Object localObject = paramQuery.zzatV;
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    localObject = paramQuery.zzatW;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramQuery.zzatX;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramQuery.zzatY;
    zzb.zzb(paramParcel, 5, (List)localObject, false);
    boolean bool = paramQuery.zzatZ;
    zzb.zza(paramParcel, 6, bool);
    localObject = paramQuery.zzapB;
    zzb.zzc(paramParcel, 7, (List)localObject, false);
    bool = paramQuery.zzarL;
    zzb.zza(paramParcel, 8, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public Query zzcj(Parcel paramParcel)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    boolean bool2 = false;
    ArrayList localArrayList = null;
    Object localObject2 = null;
    String str = null;
    Object localObject3 = null;
    int j = 0;
    Object localObject4 = null;
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
      case 1000: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 1: 
        localObject3 = LogicalFilter.CREATOR;
        localObject5 = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 3: 
        str = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 4: 
        localObject2 = SortOrder.CREATOR;
        localObject5 = (SortOrder)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 5: 
        localArrayList = com.google.android.gms.common.internal.safeparcel.zza.zzD(paramParcel, k);
        break;
      case 6: 
        bool2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
        break;
      case 7: 
        localObject1 = DriveSpace.CREATOR;
        localObject1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
        break;
      case 8: 
        bool1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject4, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/drive/query/Query;
    ((Query)localObject5).<init>(j, (LogicalFilter)localObject3, str, (SortOrder)localObject2, localArrayList, bool2, (List)localObject1, bool1);
    return (Query)localObject5;
  }
  
  public Query[] zzee(int paramInt)
  {
    return new Query[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\query\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */