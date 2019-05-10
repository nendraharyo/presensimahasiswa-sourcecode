package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import java.io.File;

final class HardwareConfigState
{
  private static final File FD_SIZE_LIST;
  private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS = 700;
  private static final int MINIMUM_DECODES_BETWEEN_FD_CHECKS = 50;
  private static final int MIN_HARDWARE_DIMENSION = 128;
  private static volatile HardwareConfigState instance;
  private volatile int decodesSinceLastFdCheck;
  private volatile boolean isHardwareConfigAllowed = true;
  
  static
  {
    File localFile = new java/io/File;
    localFile.<init>("/proc/self/fd");
    FD_SIZE_LIST = localFile;
  }
  
  static HardwareConfigState getInstance()
  {
    HardwareConfigState localHardwareConfigState = instance;
    if (localHardwareConfigState == null) {}
    synchronized (HardwareConfigState.class)
    {
      localHardwareConfigState = instance;
      if (localHardwareConfigState == null)
      {
        localHardwareConfigState = new com/bumptech/glide/load/resource/bitmap/HardwareConfigState;
        localHardwareConfigState.<init>();
        instance = localHardwareConfigState;
      }
      return instance;
    }
  }
  
  private boolean isFdSizeBelowHardwareLimit()
  {
    int i = 700;
    boolean bool = false;
    String str1 = null;
    try
    {
      int j = this.decodesSinceLastFdCheck + 1;
      this.decodesSinceLastFdCheck = j;
      int k = 50;
      if (j >= k)
      {
        j = 0;
        Object localObject2 = null;
        this.decodesSinceLastFdCheck = 0;
        localObject2 = FD_SIZE_LIST;
        localObject2 = ((File)localObject2).list();
        j = localObject2.length;
        if (j < i) {
          bool = true;
        }
        this.isHardwareConfigAllowed = bool;
        bool = this.isHardwareConfigAllowed;
        if (!bool)
        {
          str1 = "Downsampler";
          k = 5;
          bool = Log.isLoggable(str1, k);
          if (bool)
          {
            str1 = "Downsampler";
            Object localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            String str2 = "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ";
            localObject3 = ((StringBuilder)localObject3).append(str2);
            localObject2 = ((StringBuilder)localObject3).append(j);
            localObject3 = ", limit ";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
            k = 700;
            localObject2 = ((StringBuilder)localObject2).append(k);
            localObject2 = ((StringBuilder)localObject2).toString();
            Log.w(str1, (String)localObject2);
          }
        }
      }
      bool = this.isHardwareConfigAllowed;
      return bool;
    }
    finally {}
  }
  
  boolean setHardwareConfigIfAllowed(int paramInt1, int paramInt2, BitmapFactory.Options paramOptions, DecodeFormat paramDecodeFormat, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 128;
    int j;
    if (paramBoolean1)
    {
      j = Build.VERSION.SDK_INT;
      int k = 26;
      if ((j >= k) && (!paramBoolean2)) {}
    }
    else
    {
      j = 0;
    }
    label91:
    for (;;)
    {
      return j;
      if ((paramInt1 >= i) && (paramInt2 >= i))
      {
        bool = isFdSizeBelowHardwareLimit();
        if (!bool) {}
      }
      for (boolean bool = true;; bool = false)
      {
        if (!bool) {
          break label91;
        }
        Bitmap.Config localConfig = Bitmap.Config.HARDWARE;
        paramOptions.inPreferredConfig = localConfig;
        paramOptions.inMutable = false;
        break;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\HardwareConfigState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */