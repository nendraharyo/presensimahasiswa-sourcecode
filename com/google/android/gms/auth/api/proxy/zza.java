package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza
  implements Parcelable.Creator
{
  static void zza(ProxyGrpcRequest paramProxyGrpcRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramProxyGrpcRequest.hostname;
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramProxyGrpcRequest.versionCode;
    zzb.zzc(paramParcel, 1000, j);
    j = paramProxyGrpcRequest.port;
    zzb.zzc(paramParcel, 2, j);
    long l = paramProxyGrpcRequest.timeoutMillis;
    zzb.zza(paramParcel, 3, l);
    localObject = paramProxyGrpcRequest.body;
    zzb.zza(paramParcel, 4, (byte[])localObject, false);
    localObject = paramProxyGrpcRequest.method;
    zzb.zza(paramParcel, 5, (String)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ProxyGrpcRequest zzN(Parcel paramParcel)
  {
    int i = 0;
    String str = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
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
      m = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      int n = com.google.android.gms.common.internal.safeparcel.zza.zzca(m);
      switch (n)
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, m);
        break;
      case 1: 
        localObject1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
        break;
      case 1000: 
        k = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, m);
        break;
      case 3: 
        l = com.google.android.gms.common.internal.safeparcel.zza.zzi(paramParcel, m);
        break;
      case 4: 
        arrayOfByte = com.google.android.gms.common.internal.safeparcel.zza.zzs(paramParcel, m);
        break;
      case 5: 
        str = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, m);
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
    Object localObject2 = new com/google/android/gms/auth/api/proxy/ProxyGrpcRequest;
    ((ProxyGrpcRequest)localObject2).<init>(k, (String)localObject1, i, l, arrayOfByte, str);
    return (ProxyGrpcRequest)localObject2;
  }
  
  public ProxyGrpcRequest[] zzaI(int paramInt)
  {
    return new ProxyGrpcRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\proxy\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */