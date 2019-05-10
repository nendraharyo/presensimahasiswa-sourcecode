package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzu
  implements Parcelable.Creator
{
  static void zza(UnsubscribeRequest paramUnsubscribeRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramUnsubscribeRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramUnsubscribeRequest.zzEH();
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    localObject = paramUnsubscribeRequest.zzED();
    zzb.zza(paramParcel, 3, (IBinder)localObject, false);
    localObject = paramUnsubscribeRequest.zzbda;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    j = paramUnsubscribeRequest.zzbdb;
    zzb.zzc(paramParcel, 5, j);
    localObject = paramUnsubscribeRequest.zzbbF;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramUnsubscribeRequest.zzbco;
    zzb.zza(paramParcel, 7, (String)localObject, false);
    boolean bool = paramUnsubscribeRequest.zzbbH;
    zzb.zza(paramParcel, 8, bool);
    localObject = paramUnsubscribeRequest.zzbcs;
    zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public UnsubscribeRequest zzgp(Parcel paramParcel)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = zza.zzau(paramParcel);
    String str1 = null;
    String str2 = null;
    int j = 0;
    Object localObject2 = null;
    IBinder localIBinder1 = null;
    IBinder localIBinder2 = null;
    int k = 0;
    Object localObject3 = null;
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
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localIBinder2 = zza.zzq(paramParcel, m);
        break;
      case 3: 
        localIBinder1 = zza.zzq(paramParcel, m);
        break;
      case 4: 
        localObject2 = PendingIntent.CREATOR;
        localObject4 = (PendingIntent)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject4;
        break;
      case 5: 
        j = zza.zzg(paramParcel, m);
        break;
      case 6: 
        str2 = zza.zzp(paramParcel, m);
        break;
      case 7: 
        str1 = zza.zzp(paramParcel, m);
        break;
      case 8: 
        bool = zza.zzc(paramParcel, m);
        break;
      case 9: 
        localObject1 = ClientAppContext.CREATOR;
        localObject4 = (ClientAppContext)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject4;
      }
    }
    int m = paramParcel.dataPosition();
    if (m != i)
    {
      localObject4 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject4).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject4);
    }
    Object localObject4 = new com/google/android/gms/nearby/messages/internal/UnsubscribeRequest;
    ((UnsubscribeRequest)localObject4).<init>(k, localIBinder2, localIBinder1, (PendingIntent)localObject2, j, str2, str1, bool, (ClientAppContext)localObject1);
    return (UnsubscribeRequest)localObject4;
  }
  
  public UnsubscribeRequest[] zzjv(int paramInt)
  {
    return new UnsubscribeRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */