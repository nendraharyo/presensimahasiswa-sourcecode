package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator
{
  static void zza(PutDataRequest paramPutDataRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramPutDataRequest.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramPutDataRequest.getUri();
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramPutDataRequest.zzIv();
    zzb.zza(paramParcel, 4, (Bundle)localObject, false);
    localObject = paramPutDataRequest.getData();
    zzb.zza(paramParcel, 5, (byte[])localObject, false);
    long l = paramPutDataRequest.zzIw();
    zzb.zza(paramParcel, 6, l);
    zzb.zzI(paramParcel, i);
  }
  
  public PutDataRequest zzhZ(Parcel paramParcel)
  {
    byte[] arrayOfByte = null;
    int i = zza.zzau(paramParcel);
    int j = 0;
    StringBuilder localStringBuilder = null;
    long l = 0L;
    Bundle localBundle = null;
    Object localObject1 = null;
    Object localObject2;
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
      case 3: 
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localObject1 = Uri.CREATOR;
        localObject2 = (Uri)zza.zza(paramParcel, k, (Parcelable.Creator)localObject1);
        localObject1 = localObject2;
        break;
      case 4: 
        localBundle = zza.zzr(paramParcel, k);
        break;
      case 5: 
        arrayOfByte = zza.zzs(paramParcel, k);
        break;
      case 6: 
        l = zza.zzi(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject3 = "Overread allowed size end=" + i;
      ((zza.zza)localObject2).<init>((String)localObject3, paramParcel);
      throw ((Throwable)localObject2);
    }
    Object localObject3 = new com/google/android/gms/wearable/PutDataRequest;
    ((PutDataRequest)localObject3).<init>(j, (Uri)localObject1, localBundle, arrayOfByte, l);
    return (PutDataRequest)localObject3;
  }
  
  public PutDataRequest[] zzlA(int paramInt)
  {
    return new PutDataRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */