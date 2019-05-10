package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.bootstrap.Device;

public class zza
  implements Parcelable.Creator
{
  static void zza(ConnectRequest paramConnectRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramConnectRequest.zzEd();
    zzb.zza(paramParcel, 1, (Parcelable)localObject, paramInt, false);
    int j = paramConnectRequest.versionCode;
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramConnectRequest.getName();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramConnectRequest.getDescription();
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramConnectRequest.zzEg();
    zzb.zza(paramParcel, 4, (IBinder)localObject, false);
    localObject = paramConnectRequest.zzEh();
    zzb.zza(paramParcel, 5, (IBinder)localObject, false);
    localObject = paramConnectRequest.getCallbackBinder();
    zzb.zza(paramParcel, 6, (IBinder)localObject, false);
    j = paramConnectRequest.zzEb();
    zzb.zza(paramParcel, 7, j);
    long l = paramConnectRequest.zzEe();
    zzb.zza(paramParcel, 8, l);
    localObject = paramConnectRequest.getToken();
    zzb.zza(paramParcel, 9, (String)localObject, false);
    byte b = paramConnectRequest.zzEf();
    zzb.zza(paramParcel, 10, b);
    zzb.zzI(paramParcel, i);
  }
  
  public ConnectRequest zzfQ(Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    String str1 = null;
    String str2 = null;
    byte b1 = 0;
    long l = 0L;
    String str3 = null;
    byte b2 = 0;
    IBinder localIBinder1 = null;
    IBinder localIBinder2 = null;
    IBinder localIBinder3 = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int m = com.google.android.gms.common.internal.safeparcel.zza.zzca(k);
      switch (m)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1: 
        localObject2 = Device.CREATOR;
        localObject3 = (Device)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject3;
        break;
      case 1000: 
        j = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 2: 
        str1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 3: 
        str2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 4: 
        localIBinder1 = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 5: 
        localIBinder2 = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 6: 
        localIBinder3 = com.google.android.gms.common.internal.safeparcel.zza.zzq(paramParcel, k);
        break;
      case 7: 
        b1 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, k);
        break;
      case 8: 
        l = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, k);
        break;
      case 9: 
        str3 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 10: 
        b2 = com.google.android.gms.common.internal.safeparcel.zza.zze(paramParcel, k);
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
    Object localObject3 = new com/google/android/gms/nearby/bootstrap/request/ConnectRequest;
    ((ConnectRequest)localObject3).<init>(j, (Device)localObject2, str1, str2, b1, l, str3, b2, localIBinder1, localIBinder2, localIBinder3);
    return (ConnectRequest)localObject3;
  }
  
  public ConnectRequest[] zziM(int paramInt)
  {
    return new ConnectRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\request\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */