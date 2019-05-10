package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import java.io.OutputStream;

final class zzbo$zzi
  extends zzbo.zzb
{
  private final zzt zzbtd;
  
  public zzbo$zzi(zza.zzb paramzzb, zzt paramzzt)
  {
    super(paramzzb);
    zzt localzzt = (zzt)zzx.zzz(paramzzt);
    this.zzbtd = localzzt;
  }
  
  public void zza(GetChannelOutputStreamResponse paramGetChannelOutputStreamResponse)
  {
    zzq localzzq = null;
    Object localObject1 = paramGetChannelOutputStreamResponse.zzbsC;
    if (localObject1 != null)
    {
      localzzq = new com/google/android/gms/wearable/internal/zzq;
      localObject1 = new android/os/ParcelFileDescriptor$AutoCloseOutputStream;
      localObject2 = paramGetChannelOutputStreamResponse.zzbsC;
      ((ParcelFileDescriptor.AutoCloseOutputStream)localObject1).<init>((ParcelFileDescriptor)localObject2);
      localzzq.<init>((OutputStream)localObject1);
      localObject1 = this.zzbtd;
      localObject2 = localzzq.zzIJ();
      ((zzt)localObject1).zza((zzu)localObject2);
    }
    localObject1 = new com/google/android/gms/wearable/internal/ChannelImpl$zzb;
    Object localObject2 = new com/google/android/gms/common/api/Status;
    int i = paramGetChannelOutputStreamResponse.statusCode;
    ((Status)localObject2).<init>(i);
    ((ChannelImpl.zzb)localObject1).<init>((Status)localObject2, localzzq);
    zzX(localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbo$zzi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */