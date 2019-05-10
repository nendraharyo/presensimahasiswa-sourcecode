package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.Field;
import java.util.List;

public class zzi
  implements Parcelable.Creator
{
  static void zza(DataTypeCreateRequest paramDataTypeCreateRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramDataTypeCreateRequest.getName();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramDataTypeCreateRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramDataTypeCreateRequest.getFields();
    zzb.zzc(paramParcel, 2, (List)localObject, false);
    localObject = paramDataTypeCreateRequest.getCallbackBinder();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataTypeCreateRequest zzdo(Parcel paramParcel)
  {
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject2 = null;
    String str = null;
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
        str = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject2 = Field.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 3: 
        localObject1 = zza.zzq(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject1 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject1).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject1);
    }
    DataTypeCreateRequest localDataTypeCreateRequest = new com/google/android/gms/fitness/request/DataTypeCreateRequest;
    localDataTypeCreateRequest.<init>(j, str, (List)localObject2, (IBinder)localObject1);
    return localDataTypeCreateRequest;
  }
  
  public DataTypeCreateRequest[] zzfo(int paramInt)
  {
    return new DataTypeCreateRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */