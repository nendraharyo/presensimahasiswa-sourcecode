package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzt
  implements Parcelable.Creator
{
  static void zza(ReadRawRequest paramReadRawRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramReadRawRequest.getCallbackBinder();
    zzb.zza(paramParcel, 1, (IBinder)localObject, false);
    int j = paramReadRawRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramReadRawRequest.zzuW();
    zzb.zzc(paramParcel, 3, (List)localObject, false);
    boolean bool = paramReadRawRequest.zzuQ();
    zzb.zza(paramParcel, 4, bool);
    bool = paramReadRawRequest.zzuP();
    zzb.zza(paramParcel, 5, bool);
    zzb.zzI(paramParcel, i);
  }
  
  public ReadRawRequest zzdy(Parcel paramParcel)
  {
    Object localObject1 = null;
    boolean bool1 = false;
    int i = zza.zzau(paramParcel);
    boolean bool2 = false;
    Object localObject2 = null;
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
        localObject2 = zza.zzq(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 3: 
        localObject1 = DataSourceQueryParams.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
        break;
      case 4: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 5: 
        bool1 = zza.zzc(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject3, paramParcel);
      throw localzza;
    }
    Object localObject3 = new com/google/android/gms/fitness/request/ReadRawRequest;
    ((ReadRawRequest)localObject3).<init>(j, (IBinder)localObject2, (List)localObject1, bool2, bool1);
    return (ReadRawRequest)localObject3;
  }
  
  public ReadRawRequest[] zzfy(int paramInt)
  {
    return new ReadRawRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */