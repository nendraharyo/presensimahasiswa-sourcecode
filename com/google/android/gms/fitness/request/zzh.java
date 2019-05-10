package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;

public class zzh
  implements Parcelable.Creator
{
  static void zza(DataSourcesRequest paramDataSourcesRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDataSourcesRequest.getDataTypes();
    zzb.zzc(paramParcel, 1, (List)localObject, false);
    int j = paramDataSourcesRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramDataSourcesRequest.zzuT();
    zzb.zza(paramParcel, 2, (List)localObject, false);
    boolean bool = paramDataSourcesRequest.zzuU();
    zzb.zza(paramParcel, 3, bool);
    localObject = paramDataSourcesRequest.getCallbackBinder();
    zzb.zza(paramParcel, 4, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataSourcesRequest zzdn(Parcel paramParcel)
  {
    boolean bool = false;
    IBinder localIBinder = null;
    int i = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    Object localObject1 = null;
    int j = 0;
    zza.zza localzza = null;
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
      case 1: 
        localObject1 = DataType.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localArrayList = zza.zzC(paramParcel, k);
        break;
      case 3: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 4: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/fitness/request/DataSourcesRequest;
    ((DataSourcesRequest)localObject2).<init>(j, (List)localObject1, localArrayList, bool, localIBinder);
    return (DataSourcesRequest)localObject2;
  }
  
  public DataSourcesRequest[] zzfn(int paramInt)
  {
    return new DataSourcesRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */