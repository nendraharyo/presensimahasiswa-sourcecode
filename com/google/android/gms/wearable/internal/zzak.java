package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzak
  implements Parcelable.Creator
{
  static void zza(GetChannelOutputStreamResponse paramGetChannelOutputStreamResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramGetChannelOutputStreamResponse.versionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramGetChannelOutputStreamResponse.statusCode;
    zzb.zzc(paramParcel, 2, j);
    ParcelFileDescriptor localParcelFileDescriptor = paramGetChannelOutputStreamResponse.zzbsC;
    zzb.zza(paramParcel, 3, localParcelFileDescriptor, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public GetChannelOutputStreamResponse zziq(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    int k = 0;
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
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        localObject2 = ParcelFileDescriptor.CREATOR;
        localObject2 = (ParcelFileDescriptor)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject2 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + j;
      ((zza.zza)localObject2).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject2);
    }
    GetChannelOutputStreamResponse localGetChannelOutputStreamResponse = new com/google/android/gms/wearable/internal/GetChannelOutputStreamResponse;
    localGetChannelOutputStreamResponse.<init>(k, i, (ParcelFileDescriptor)localObject2);
    return localGetChannelOutputStreamResponse;
  }
  
  public GetChannelOutputStreamResponse[] zzlU(int paramInt)
  {
    return new GetChannelOutputStreamResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzak.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */