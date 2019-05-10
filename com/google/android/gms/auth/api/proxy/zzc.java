package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator
{
  static void zza(ProxyResponse paramProxyResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramProxyResponse.googlePlayServicesStatusCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramProxyResponse.versionCode;
    zzb.zzc(paramParcel, 1000, j);
    Object localObject = paramProxyResponse.recoveryAction;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    j = paramProxyResponse.statusCode;
    zzb.zzc(paramParcel, 3, j);
    localObject = paramProxyResponse.zzWB;
    zzb.zza(paramParcel, 4, (Bundle)localObject, false);
    localObject = paramProxyResponse.body;
    zzb.zza(paramParcel, 5, (byte[])localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ProxyResponse zzP(Parcel paramParcel)
  {
    byte[] arrayOfByte = null;
    int i = 0;
    int j = zza.zzau(paramParcel);
    Bundle localBundle = null;
    Object localObject1 = null;
    int k = 0;
    int m = 0;
    Object localObject2 = null;
    for (;;)
    {
      n = paramParcel.dataPosition();
      if (n >= j) {
        break;
      }
      n = zza.zzat(paramParcel);
      int i1 = zza.zzca(n);
      switch (i1)
      {
      default: 
        zza.zzb(paramParcel, n);
        break;
      case 1: 
        k = zza.zzg(paramParcel, n);
        break;
      case 1000: 
        m = zza.zzg(paramParcel, n);
        break;
      case 2: 
        localObject1 = PendingIntent.CREATOR;
        localObject3 = (PendingIntent)zza.zza(paramParcel, n, (Parcelable.Creator)localObject1);
        localObject1 = localObject3;
        break;
      case 3: 
        i = zza.zzg(paramParcel, n);
        break;
      case 4: 
        localBundle = zza.zzr(paramParcel, n);
        break;
      case 5: 
        arrayOfByte = zza.zzs(paramParcel, n);
      }
    }
    int n = paramParcel.dataPosition();
    if (n != j)
    {
      localObject3 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Overread allowed size end=" + j;
      ((zza.zza)localObject3).<init>((String)localObject2, paramParcel);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = new com/google/android/gms/auth/api/proxy/ProxyResponse;
    ((ProxyResponse)localObject3).<init>(m, k, (PendingIntent)localObject1, i, localBundle, arrayOfByte);
    return (ProxyResponse)localObject3;
  }
  
  public ProxyResponse[] zzaK(int paramInt)
  {
    return new ProxyResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\proxy\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */