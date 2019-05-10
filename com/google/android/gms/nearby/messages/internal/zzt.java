package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzt
  implements Parcelable.Creator
{
  static void zza(UnpublishRequest paramUnpublishRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramUnpublishRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramUnpublishRequest.zzbcT;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramUnpublishRequest.zzED();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    localObject = paramUnpublishRequest.zzbbF;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramUnpublishRequest.zzbco;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    boolean bool = paramUnpublishRequest.zzbbH;
    zzb.zza(paramParcel, 6, bool);
    localObject = paramUnpublishRequest.zzbcs;
    zzb.zza(paramParcel, 7, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public UnpublishRequest zzgo(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    String str1 = null;
    String str2 = null;
    IBinder localIBinder = null;
    Object localObject2 = null;
    int j = 0;
    Object localObject3 = null;
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
        localObject2 = MessageWrapper.CREATOR;
        localObject4 = (MessageWrapper)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 3: 
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        bool = zza.zzc(paramParcel, k);
        break;
      case 7: 
        localObject1 = ClientAppContext.CREATOR;
        localObject4 = (ClientAppContext)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/nearby/messages/internal/UnpublishRequest;
    ((UnpublishRequest)localObject4).<init>(j, (MessageWrapper)localObject2, localIBinder, str2, str1, bool, (ClientAppContext)localObject1);
    return (UnpublishRequest)localObject4;
  }
  
  public UnpublishRequest[] zzju(int paramInt)
  {
    return new UnpublishRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */