package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.Strategy;

public class zzq
  implements Parcelable.Creator
{
  static void zza(PublishRequest paramPublishRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPublishRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramPublishRequest.zzbcT;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramPublishRequest.zzbcU;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramPublishRequest.zzED();
    zzb.zza(paramParcel, 4, (IBinder)localObject, false);
    localObject = paramPublishRequest.zzbbF;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    localObject = paramPublishRequest.zzbco;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    boolean bool = paramPublishRequest.zzbbG;
    zzb.zza(paramParcel, 7, bool);
    localObject = paramPublishRequest.zzEF();
    zzb.zza(paramParcel, 8, (IBinder)localObject, false);
    bool = paramPublishRequest.zzbbH;
    zzb.zza(paramParcel, 9, bool);
    localObject = paramPublishRequest.zzbcs;
    zzb.zza(paramParcel, 10, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public PublishRequest zzgl(Parcel paramParcel)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    IBinder localIBinder1 = null;
    boolean bool2 = false;
    String str1 = null;
    String str2 = null;
    IBinder localIBinder2 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    int j = 0;
    Object localObject4 = null;
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
        localObject3 = MessageWrapper.CREATOR;
        localObject5 = (MessageWrapper)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject5;
        break;
      case 3: 
        localObject2 = Strategy.CREATOR;
        localObject5 = (Strategy)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject5;
        break;
      case 4: 
        localIBinder2 = zza.zzq(paramParcel, k);
        break;
      case 5: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 8: 
        localIBinder1 = zza.zzq(paramParcel, k);
        break;
      case 9: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 10: 
        localObject1 = ClientAppContext.CREATOR;
        localObject5 = (ClientAppContext)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject5;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject5 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "Overread allowed size end=" + i;
      ((zza.zza)localObject5).<init>((String)localObject4, paramParcel);
      throw ((Throwable)localObject5);
    }
    Object localObject5 = new com/google/android/gms/nearby/messages/internal/PublishRequest;
    ((PublishRequest)localObject5).<init>(j, (MessageWrapper)localObject3, (Strategy)localObject2, localIBinder2, str2, str1, bool2, localIBinder1, bool1, (ClientAppContext)localObject1);
    return (PublishRequest)localObject5;
  }
  
  public PublishRequest[] zzjr(int paramInt)
  {
    return new PublishRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */