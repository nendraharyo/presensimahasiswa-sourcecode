package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzmd;
import java.util.HashSet;
import java.util.Map;

final class ImageManager$zzd
  implements Runnable
{
  private final zza zzajM;
  
  public ImageManager$zzd(ImageManager paramImageManager, zza paramzza)
  {
    this.zzajM = paramzza;
  }
  
  public void run()
  {
    boolean bool1 = true;
    zzb.zzcD("LoadImageRunnable must be executed on the main thread");
    Object localObject1 = ImageManager.zza(this.zzajK);
    Object localObject3 = this.zzajM;
    localObject1 = (ImageManager.ImageReceiver)((Map)localObject1).get(localObject3);
    if (localObject1 != null)
    {
      localObject3 = ImageManager.zza(this.zzajK);
      ??? = this.zzajM;
      ((Map)localObject3).remove(???);
      localObject3 = this.zzajM;
      ((ImageManager.ImageReceiver)localObject1).zzc((zza)localObject3);
    }
    localObject3 = this.zzajM.zzajO;
    localObject1 = ((zza.zza)localObject3).uri;
    if (localObject1 == null)
    {
      localObject1 = this.zzajM;
      localObject3 = ImageManager.zzb(this.zzajK);
      ??? = ImageManager.zzc(this.zzajK);
      ((zza)localObject1).zza((Context)localObject3, (zzmd)???, bool1);
    }
    for (;;)
    {
      return;
      localObject1 = ImageManager.zza(this.zzajK, (zza.zza)localObject3);
      if (localObject1 != null)
      {
        localObject3 = this.zzajM;
        ??? = ImageManager.zzb(this.zzajK);
        ((zza)localObject3).zza((Context)???, (Bitmap)localObject1, bool1);
        continue;
      }
      localObject1 = ImageManager.zzd(this.zzajK);
      ??? = ((zza.zza)localObject3).uri;
      localObject1 = (Long)((Map)localObject1).get(???);
      if (localObject1 != null)
      {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = ((Long)localObject1).longValue();
        l1 -= l2;
        l2 = 3600000L;
        boolean bool2 = l1 < l2;
        if (bool2)
        {
          localObject1 = this.zzajM;
          localObject3 = ImageManager.zzb(this.zzajK);
          ??? = ImageManager.zzc(this.zzajK);
          ((zza)localObject1).zza((Context)localObject3, (zzmd)???, bool1);
          continue;
        }
        localObject1 = ImageManager.zzd(this.zzajK);
        ??? = ((zza.zza)localObject3).uri;
        ((Map)localObject1).remove(???);
      }
      localObject1 = this.zzajM;
      ??? = ImageManager.zzb(this.zzajK);
      Object localObject5 = ImageManager.zzc(this.zzajK);
      ((zza)localObject1).zza((Context)???, (zzmd)localObject5);
      localObject1 = ImageManager.zze(this.zzajK);
      ??? = ((zza.zza)localObject3).uri;
      localObject1 = (ImageManager.ImageReceiver)((Map)localObject1).get(???);
      if (localObject1 == null)
      {
        localObject1 = new com/google/android/gms/common/images/ImageManager$ImageReceiver;
        ??? = this.zzajK;
        localObject5 = ((zza.zza)localObject3).uri;
        ((ImageManager.ImageReceiver)localObject1).<init>((ImageManager)???, (Uri)localObject5);
        ??? = ImageManager.zze(this.zzajK);
        localObject5 = ((zza.zza)localObject3).uri;
        ((Map)???).put(localObject5, localObject1);
      }
      ??? = this.zzajM;
      ((ImageManager.ImageReceiver)localObject1).zzb((zza)???);
      ??? = this.zzajM;
      boolean bool3 = ??? instanceof zza.zzc;
      if (!bool3)
      {
        ??? = ImageManager.zza(this.zzajK);
        localObject5 = this.zzajM;
        ((Map)???).put(localObject5, localObject1);
      }
      synchronized (ImageManager.zzqk())
      {
        localObject5 = ImageManager.zzql();
        Uri localUri = ((zza.zza)localObject3).uri;
        boolean bool4 = ((HashSet)localObject5).contains(localUri);
        if (!bool4)
        {
          localObject5 = ImageManager.zzql();
          localObject3 = ((zza.zza)localObject3).uri;
          ((HashSet)localObject5).add(localObject3);
          ((ImageManager.ImageReceiver)localObject1).zzqm();
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\ImageManager$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */