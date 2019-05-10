package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzmd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class ImageManager$zzf
  implements Runnable
{
  private final Bitmap mBitmap;
  private final Uri mUri;
  private boolean zzajN;
  private final CountDownLatch zzpJ;
  
  public ImageManager$zzf(ImageManager paramImageManager, Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
  {
    this.mUri = paramUri;
    this.mBitmap = paramBitmap;
    this.zzajN = paramBoolean;
    this.zzpJ = paramCountDownLatch;
  }
  
  private void zza(ImageManager.ImageReceiver paramImageReceiver, boolean paramBoolean)
  {
    ArrayList localArrayList = ImageManager.ImageReceiver.zza(paramImageReceiver);
    int i = localArrayList.size();
    int j = 0;
    if (j < i)
    {
      zza localzza = (zza)localArrayList.get(j);
      Object localObject1;
      Object localObject2;
      if (paramBoolean)
      {
        localObject1 = ImageManager.zzb(this.zzajK);
        localObject2 = this.mBitmap;
        localzza.zza((Context)localObject1, (Bitmap)localObject2, false);
      }
      for (;;)
      {
        boolean bool = localzza instanceof zza.zzc;
        if (!bool)
        {
          localObject1 = ImageManager.zza(this.zzajK);
          ((Map)localObject1).remove(localzza);
        }
        int k = j + 1;
        j = k;
        break;
        localObject1 = ImageManager.zzd(this.zzajK);
        localObject2 = this.mUri;
        long l = SystemClock.elapsedRealtime();
        Long localLong = Long.valueOf(l);
        ((Map)localObject1).put(localObject2, localLong);
        localObject1 = ImageManager.zzb(this.zzajK);
        localObject2 = ImageManager.zzc(this.zzajK);
        localzza.zza((Context)localObject1, (zzmd)localObject2, false);
      }
    }
  }
  
  public void run()
  {
    Object localObject1 = null;
    zzb.zzcD("OnBitmapLoadedRunnable must be executed in the main thread");
    Object localObject2 = this.mBitmap;
    boolean bool2;
    if (localObject2 != null)
    {
      boolean bool1 = true;
      bool2 = bool1;
      localObject2 = ImageManager.zzh(this.zzajK);
      if (localObject2 == null) {
        break label127;
      }
      bool1 = this.zzajN;
      if (!bool1) {
        break label84;
      }
      ImageManager.zzh(this.zzajK).evictAll();
      System.gc();
      this.zzajN = false;
      localObject2 = ImageManager.zzg(this.zzajK);
      ((Handler)localObject2).post(this);
    }
    for (;;)
    {
      return;
      bool2 = false;
      ??? = null;
      break;
      label84:
      if (bool2)
      {
        localObject2 = ImageManager.zzh(this.zzajK);
        localObject1 = new com/google/android/gms/common/images/zza$zza;
        Object localObject5 = this.mUri;
        ((zza.zza)localObject1).<init>((Uri)localObject5);
        localObject5 = this.mBitmap;
        ((ImageManager.zzb)localObject2).put(localObject1, localObject5);
      }
      label127:
      localObject2 = ImageManager.zze(this.zzajK);
      localObject1 = this.mUri;
      localObject2 = (ImageManager.ImageReceiver)((Map)localObject2).remove(localObject1);
      if (localObject2 != null) {
        zza((ImageManager.ImageReceiver)localObject2, bool2);
      }
      localObject2 = this.zzpJ;
      ((CountDownLatch)localObject2).countDown();
      synchronized (ImageManager.zzqk())
      {
        localObject2 = ImageManager.zzql();
        localObject1 = this.mUri;
        ((HashSet)localObject2).remove(localObject1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\ImageManager$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */