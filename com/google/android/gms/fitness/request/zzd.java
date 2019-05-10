package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.List;

public class zzd
  implements Parcelable.Creator
{
  static void zza(DataDeleteRequest paramDataDeleteRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    long l = paramDataDeleteRequest.zzlO();
    zzb.zza(paramParcel, 1, l);
    int j = paramDataDeleteRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    l = paramDataDeleteRequest.zzud();
    zzb.zza(paramParcel, 2, l);
    Object localObject = paramDataDeleteRequest.getDataSources();
    zzb.zzc(paramParcel, 3, (List)localObject, false);
    localObject = paramDataDeleteRequest.getDataTypes();
    zzb.zzc(paramParcel, 4, (List)localObject, false);
    localObject = paramDataDeleteRequest.getSessions();
    zzb.zzc(paramParcel, 5, (List)localObject, false);
    boolean bool = paramDataDeleteRequest.zzuL();
    zzb.zza(paramParcel, 6, bool);
    bool = paramDataDeleteRequest.zzuM();
    zzb.zza(paramParcel, 7, bool);
    localObject = paramDataDeleteRequest.getCallbackBinder();
    zzb.zza(paramParcel, 8, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public DataDeleteRequest zzdj(Parcel paramParcel)
  {
    long l1 = 0L;
    boolean bool1 = false;
    IBinder localIBinder = null;
    int i = zza.zzau(paramParcel);
    boolean bool2 = false;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    long l2 = l1;
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
        l2 = zza.zzi(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        l1 = zza.zzi(paramParcel, k);
        break;
      case 3: 
        localObject3 = DataSource.CREATOR;
        localObject3 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject3);
        break;
      case 4: 
        localObject2 = DataType.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 5: 
        localObject1 = Session.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
        break;
      case 6: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 7: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 8: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject4 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject4, paramParcel);
      throw localzza;
    }
    Object localObject4 = new com/google/android/gms/fitness/request/DataDeleteRequest;
    ((DataDeleteRequest)localObject4).<init>(j, l2, l1, (List)localObject3, (List)localObject2, (List)localObject1, bool2, bool1, localIBinder);
    return (DataDeleteRequest)localObject4;
  }
  
  public DataDeleteRequest[] zzfj(int paramInt)
  {
    return new DataDeleteRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */