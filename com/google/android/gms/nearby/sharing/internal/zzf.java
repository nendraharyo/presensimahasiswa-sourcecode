package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.sharing.SharedContent;
import java.util.List;

public class zzf
  implements Parcelable.Creator
{
  static void zza(ProvideContentRequest paramProvideContentRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramProvideContentRequest.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramProvideContentRequest.zzbdk;
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    localObject = paramProvideContentRequest.zzEP();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    localObject = paramProvideContentRequest.zzbdm;
    zzb.zzc(paramParcel, 4, (List)localObject, false);
    long l = paramProvideContentRequest.zzbdn;
    zzb.zza(paramParcel, 5, l);
    localObject = paramProvideContentRequest.zzED();
    zzb.zza(paramParcel, 6, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ProvideContentRequest zzgu(Parcel paramParcel)
  {
    IBinder localIBinder1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    long l = 0L;
    Object localObject1 = null;
    IBinder localIBinder2 = null;
    IBinder localIBinder3 = null;
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
        localIBinder3 = zza.zzq(paramParcel, k);
        break;
      case 3: 
        localIBinder2 = zza.zzq(paramParcel, k);
        break;
      case 4: 
        localObject1 = SharedContent.CREATOR;
        localObject1 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject1);
        break;
      case 5: 
        l = zza.zzi(paramParcel, k);
        break;
      case 6: 
        localIBinder1 = zza.zzq(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>(str, paramParcel);
      throw ((Throwable)localObject2);
    }
    Object localObject2 = new com/google/android/gms/nearby/sharing/internal/ProvideContentRequest;
    ((ProvideContentRequest)localObject2).<init>(j, localIBinder3, localIBinder2, (List)localObject1, l, localIBinder1);
    return (ProvideContentRequest)localObject2;
  }
  
  public ProvideContentRequest[] zzjA(int paramInt)
  {
    return new ProvideContentRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */