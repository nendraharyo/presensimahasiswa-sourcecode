package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzr
  implements Parcelable.Creator
{
  static void zza(RegisterStatusCallbackRequest paramRegisterStatusCallbackRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramRegisterStatusCallbackRequest.versionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramRegisterStatusCallbackRequest.zzED();
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    localObject = paramRegisterStatusCallbackRequest.zzEG();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    boolean bool = paramRegisterStatusCallbackRequest.zzbcX;
    zzb.zza(paramParcel, 4, bool);
    localObject = paramRegisterStatusCallbackRequest.zzbbF;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramRegisterStatusCallbackRequest.zzbcs;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public RegisterStatusCallbackRequest zzgm(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    String str = null;
    IBinder localIBinder1 = null;
    IBinder localIBinder2 = null;
    int j = 0;
    Object localObject2 = null;
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
        localIBinder2 = zza.zzq(paramParcel, k);
        break;
      case 3: 
        localIBinder1 = zza.zzq(paramParcel, k);
        break;
      case 4: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 5: 
        str = zza.zzp(paramParcel, k);
        break;
      case 6: 
        localObject1 = ClientAppContext.CREATOR;
        localObject3 = (ClientAppContext)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;
    ((RegisterStatusCallbackRequest)localObject3).<init>(j, localIBinder2, localIBinder1, bool, str, (ClientAppContext)localObject1);
    return (RegisterStatusCallbackRequest)localObject3;
  }
  
  public RegisterStatusCallbackRequest[] zzjs(int paramInt)
  {
    return new RegisterStatusCallbackRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */