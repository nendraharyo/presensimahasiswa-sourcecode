package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(AddListenerRequest paramAddListenerRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramAddListenerRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramAddListenerRequest.zzIy();
    zzb.zza(paramParcel, 2, (IBinder)localObject, false);
    localObject = paramAddListenerRequest.zzbrC;
    zzb.zza(paramParcel, 3, (Parcelable[])localObject, paramInt, false);
    localObject = paramAddListenerRequest.zzbrD;
    zzb.zza(paramParcel, 4, (String)localObject, false);
    localObject = paramAddListenerRequest.zzbrE;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AddListenerRequest zzia(Parcel paramParcel)
  {
    String str1 = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str2 = null;
    Object localObject2 = null;
    IBinder localIBinder = null;
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
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 3: 
        localObject2 = IntentFilter.CREATOR;
        localObject3 = (IntentFilter[])zza.zzb(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject3).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/wearable/internal/AddListenerRequest;
    ((AddListenerRequest)localObject3).<init>(j, localIBinder, (IntentFilter[])localObject2, str2, str1);
    return (AddListenerRequest)localObject3;
  }
  
  public AddListenerRequest[] zzlB(int paramInt)
  {
    return new AddListenerRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */