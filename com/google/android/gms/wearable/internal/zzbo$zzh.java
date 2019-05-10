package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import java.io.InputStream;

final class zzbo$zzh
  extends zzbo.zzb
{
  private final zzt zzbtd;
  
  public zzbo$zzh(zza.zzb paramzzb, zzt paramzzt)
  {
    super(paramzzb);
    zzt localzzt = (zzt)zzx.zzz(paramzzt);
    this.zzbtd = localzzt;
  }
  
  public void zza(GetChannelInputStreamResponse paramGetChannelInputStreamResponse)
  {
    zzp localzzp = null;
    Object localObject1 = paramGetChannelInputStreamResponse.zzbsC;
    if (localObject1 != null)
    {
      localzzp = new com/google/android/gms/wearable/internal/zzp;
      localObject1 = new android/os/ParcelFileDescriptor$AutoCloseInputStream;
      localObject2 = paramGetChannelInputStreamResponse.zzbsC;
      ((ParcelFileDescriptor.AutoCloseInputStream)localObject1).<init>((ParcelFileDescriptor)localObject2);
      localzzp.<init>((InputStream)localObject1);
      localObject1 = this.zzbtd;
      localObject2 = localzzp.zzIJ();
      ((zzt)localObject1).zza((zzu)localObject2);
    }
    localObject1 = new com/google/android/gms/wearable/internal/ChannelImpl$zza;
    Object localObject2 = new com/google/android/gms/common/api/Status;
    int i = paramGetChannelInputStreamResponse.statusCode;
    ((Status)localObject2).<init>(i);
    ((ChannelImpl.zza)localObject1).<init>((Status)localObject2, localzzp);
    zzX(localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */