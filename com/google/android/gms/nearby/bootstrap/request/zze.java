package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze
  implements Parcelable.Creator
{
  static void zza(EnableTargetRequest paramEnableTargetRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramEnableTargetRequest.getName();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramEnableTargetRequest.versionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramEnableTargetRequest.getDescription();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramEnableTargetRequest.zzEg();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    localObject = paramEnableTargetRequest.zzEh();
    zzb.zza(paramParcel, 4, (IBinder)localObject, false);
    localObject = paramEnableTargetRequest.getCallbackBinder();
    zzb.zza(paramParcel, 5, (IBinder)localObject, false);
    j = paramEnableTargetRequest.zzEb();
    zzb.zza(paramParcel, 6, j);
    zzb.zzI(paramParcel, i);
  }
  
  public EnableTargetRequest zzfU(Parcel paramParcel)
  {
    byte b = 0;
    IBinder localIBinder1 = null;
    int i = zza.zzau(paramParcel);
    IBinder localIBinder2 = null;
    IBinder localIBinder3 = null;
    String str = null;
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
        localObject1 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        localIBinder3 = zza.zzq(paramParcel, k);
        break;
      case 4: 
        localIBinder2 = zza.zzq(paramParcel, k);
        break;
      case 5: 
        localIBinder1 = zza.zzq(paramParcel, k);
        break;
      case 6: 
        b = zza.zze(paramParcel, k);
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
    Object localObject2 = new com/google/android/gms/nearby/bootstrap/request/EnableTargetRequest;
    ((EnableTargetRequest)localObject2).<init>(j, (String)localObject1, str, b, localIBinder3, localIBinder2, localIBinder1);
    return (EnableTargetRequest)localObject2;
  }
  
  public EnableTargetRequest[] zziQ(int paramInt)
  {
    return new EnableTargetRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\request\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */