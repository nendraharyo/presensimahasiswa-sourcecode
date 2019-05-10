package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;

public class zzb
  implements Parcelable.Creator
{
  static void zza(ProxyRequest paramProxyRequest, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.zzb.zzav(paramParcel);
    Object localObject = paramProxyRequest.url;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramProxyRequest.versionCode;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 1000, j);
    j = paramProxyRequest.httpMethod;
    com.google.android.gms.common.internal.safeparcel.zzb.zzc(paramParcel, 2, j);
    long l = paramProxyRequest.timeoutMillis;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 3, l);
    localObject = paramProxyRequest.body;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 4, (byte[])localObject, false);
    localObject = paramProxyRequest.zzWB;
    com.google.android.gms.common.internal.safeparcel.zzb.zza(paramParcel, 5, (Bundle)localObject, false);
    com.google.android.gms.common.internal.safeparcel.zzb.zzI(paramParcel, i);
  }
  
  public ProxyRequest zzO(Parcel paramParcel)
  {
    int i = 0;
    Bundle localBundle = null;
    int j = zza.zzau(paramParcel);
    long l = 0L;
    byte[] arrayOfByte = null;
    Object localObject1 = null;
    int k = 0;
    zza.zza localzza = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
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
        localObject1 = zza.zzp(paramParcel, m);
        break;
      case 1000: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        l = zza.zzi(paramParcel, m);
        break;
      case 4: 
        arrayOfByte = zza.zzs(paramParcel, m);
        break;
      case 5: 
        localBundle = zza.zzr(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Overread allowed size end=" + j;
      localzza.<init>((String)localObject2, paramParcel);
      throw localzza;
    }
    Object localObject2 = new com/google/android/gms/auth/api/proxy/ProxyRequest;
    ((ProxyRequest)localObject2).<init>(k, (String)localObject1, i, l, arrayOfByte, localBundle);
    return (ProxyRequest)localObject2;
  }
  
  public ProxyRequest[] zzaJ(int paramInt)
  {
    return new ProxyRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\proxy\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */