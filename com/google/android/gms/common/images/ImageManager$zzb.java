package com.google.android.gms.common.images;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.support.v4.h.g;
import com.google.android.gms.internal.zzne;

final class ImageManager$zzb
  extends g
{
  public ImageManager$zzb(Context paramContext)
  {
    super(i);
  }
  
  private static int zzas(Context paramContext)
  {
    int i = 1048576;
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    int j = localApplicationInfo.flags & i;
    boolean bool;
    if (j != 0)
    {
      j = 1;
      if (j == 0) {
        break label73;
      }
      bool = zzne.zzsd();
      if (!bool) {
        break label73;
      }
    }
    label73:
    for (int k = ImageManager.zza.zza(localActivityManager);; k = localActivityManager.getMemoryClass())
    {
      return (int)(k * i * 0.33F);
      bool = false;
      localApplicationInfo = null;
      break;
    }
  }
  
  protected int zza(zza.zza paramzza, Bitmap paramBitmap)
  {
    int i = paramBitmap.getHeight();
    int j = paramBitmap.getRowBytes();
    return i * j;
  }
  
  protected void zza(boolean paramBoolean, zza.zza paramzza, Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    super.entryRemoved(paramBoolean, paramzza, paramBitmap1, paramBitmap2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\ImageManager$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */