package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg
  implements Parcelable.Creator
{
  static void zza(ReceiveContentRequest paramReceiveContentRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramReceiveContentRequest.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramReceiveContentRequest.zzbdk;
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    localObject = paramReceiveContentRequest.zzEQ();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    localObject = paramReceiveContentRequest.packageName;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramReceiveContentRequest.zzED();
    zzb.zza(paramParcel, 5, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ReceiveContentRequest zzgv(Parcel paramParcel)
  {
    IBinder localIBinder1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    String str = null;
    IBinder localIBinder2 = null;
    Object localObject1 = null;
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject1 = zza.zzq(paramParcel, k);
        break;
      case 3: 
        localIBinder2 = zza.zzq(paramParcel, k);
        break;
      case 4: 
        str = zza.zzp(paramParcel, k);
        break;
      case 5: 
        localIBinder1 = zza.zzq(paramParcel, k);
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
    Object localObject2 = new com/google/android/gms/nearby/sharing/internal/ReceiveContentRequest;
    ((ReceiveContentRequest)localObject2).<init>(j, (IBinder)localObject1, localIBinder2, str, localIBinder1);
    return (ReceiveContentRequest)localObject2;
  }
  
  public ReceiveContentRequest[] zzjB(int paramInt)
  {
    return new ReceiveContentRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */