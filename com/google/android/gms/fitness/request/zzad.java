package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;
import java.util.List;

public class zzad
  implements Parcelable.Creator
{
  static void zza(StartBleScanRequest paramStartBleScanRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramStartBleScanRequest.getDataTypes();
    zzb.zzc(paramParcel, 1, (List)localObject, false);
    int j = paramStartBleScanRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramStartBleScanRequest.zzvg();
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    j = paramStartBleScanRequest.getTimeoutSecs();
    zzb.zzc(paramParcel, 3, j);
    localObject = paramStartBleScanRequest.getCallbackBinder();
    zzb.zza(paramParcel, 4, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public StartBleScanRequest zzdI(Parcel paramParcel)
  {
    int i = 0;
    IBinder localIBinder1 = null;
    int j = zza.zzau(paramParcel);
    IBinder localIBinder2 = null;
    Object localObject1 = null;
    int k = 0;
    zza.zza localzza = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
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
        localObject1 = DataType.CREATOR;
        localObject1 = zza.zzc(paramParcel, m, (Parcelable.Creator)localObject1);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localIBinder2 = zza.zzq(paramParcel, m);
        break;
      case 3: 
        i = zza.zzg(paramParcel, m);
        break;
      case 4: 
        localIBinder1 = zza.zzq(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/fitness/request/StartBleScanRequest;
    ((StartBleScanRequest)localObject2).<init>(k, (List)localObject1, localIBinder2, i, localIBinder1);
    return (StartBleScanRequest)localObject2;
  }
  
  public StartBleScanRequest[] zzfJ(int paramInt)
  {
    return new StartBleScanRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */