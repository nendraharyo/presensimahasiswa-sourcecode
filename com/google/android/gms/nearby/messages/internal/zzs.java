package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

public class zzs
  implements Parcelable.Creator
{
  static void zza(SubscribeRequest paramSubscribeRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramSubscribeRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramSubscribeRequest.zzEH();
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    localObject = paramSubscribeRequest.zzbcU;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramSubscribeRequest.zzED();
    zzb.zza(paramParcel, 4, (IBinder)localObject, false);
    localObject = paramSubscribeRequest.zzbcZ;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramSubscribeRequest.zzbda;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    j = paramSubscribeRequest.zzbdb;
    zzb.zzc(paramParcel, 7, j);
    localObject = paramSubscribeRequest.zzbbF;
    zzb.zza(paramParcel, 8, (String)localObject, false);
    localObject = paramSubscribeRequest.zzbco;
    zzb.zza(paramParcel, 9, (String)localObject, false);
    localObject = paramSubscribeRequest.zzbdc;
    zzb.zza(paramParcel, 10, (byte[])localObject, false);
    boolean bool = paramSubscribeRequest.zzbbG;
    zzb.zza(paramParcel, 11, bool);
    localObject = paramSubscribeRequest.zzEI();
    zzb.zza(paramParcel, 12, (IBinder)localObject, false);
    bool = paramSubscribeRequest.zzbbH;
    zzb.zza(paramParcel, 13, bool);
    localObject = paramSubscribeRequest.zzbcs;
    zzb.zza(paramParcel, 14, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SubscribeRequest zzgn(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    IBinder localIBinder1 = null;
    Object localObject2 = null;
    IBinder localIBinder2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    int k = 0;
    String str1 = null;
    String str2 = null;
    byte[] arrayOfByte = null;
    boolean bool1 = false;
    IBinder localIBinder3 = null;
    boolean bool2 = false;
    Object localObject5 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= i) {
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
        j = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localIBinder1 = zza.zzq(paramParcel, m);
        break;
      case 3: 
        localObject2 = Strategy.CREATOR;
        localObject6 = (Strategy)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject6;
        break;
      case 4: 
        localIBinder2 = zza.zzq(paramParcel, m);
        break;
      case 5: 
        localObject3 = MessageFilter.CREATOR;
        localObject6 = (MessageFilter)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject6;
        break;
      case 6: 
        localObject4 = PendingIntent.CREATOR;
        localObject6 = (PendingIntent)zza.zza(paramParcel, m, (Parcelable.Creator)localObject4);
        localObject4 = localObject6;
        break;
      case 7: 
        k = zza.zzg(paramParcel, m);
        break;
      case 8: 
        str1 = zza.zzp(paramParcel, m);
        break;
      case 9: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 10: 
        arrayOfByte = zza.zzs(paramParcel, m);
        break;
      case 11: 
        bool1 = zza.zzc(paramParcel, m);
        break;
      case 12: 
        localIBinder3 = zza.zzq(paramParcel, m);
        break;
      case 13: 
        bool2 = zza.zzc(paramParcel, m);
        break;
      case 14: 
        localObject5 = ClientAppContext.CREATOR;
        localObject6 = (ClientAppContext)zza.zza(paramParcel, m, (Parcelable.Creator)localObject5);
        localObject5 = localObject6;
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject6 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject6).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject6);
    }
    Object localObject6 = new com/google/android/gms/nearby/messages/internal/SubscribeRequest;
    ((SubscribeRequest)localObject6).<init>(j, localIBinder1, (Strategy)localObject2, localIBinder2, (MessageFilter)localObject3, (PendingIntent)localObject4, k, str1, str2, arrayOfByte, bool1, localIBinder3, bool2, (ClientAppContext)localObject5);
    return (SubscribeRequest)localObject6;
  }
  
  public SubscribeRequest[] zzjt(int paramInt)
  {
    return new SubscribeRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */