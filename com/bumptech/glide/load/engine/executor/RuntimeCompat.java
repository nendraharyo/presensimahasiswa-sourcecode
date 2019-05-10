package com.bumptech.glide.load.engine.executor;

import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

final class RuntimeCompat
{
  private static final String CPU_LOCATION = "/sys/devices/system/cpu/";
  private static final String CPU_NAME_REGEX = "cpu[0-9]+";
  private static final String TAG = "GlideRuntimeCompat";
  
  static int availableProcessors()
  {
    Runtime localRuntime = Runtime.getRuntime();
    int i = localRuntime.availableProcessors();
    int j = Build.VERSION.SDK_INT;
    int k = 17;
    if (j < k)
    {
      j = getCoreCountPre17();
      i = Math.max(j, i);
    }
    return i;
  }
  
  private static int getCoreCountPre17()
  {
    int i = 0;
    localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      localObject1 = new java/io/File;
      localObject5 = "/sys/devices/system/cpu/";
      ((File)localObject1).<init>((String)localObject5);
      localObject5 = "cpu[0-9]+";
      localObject5 = Pattern.compile((String)localObject5);
      localObject6 = new com/bumptech/glide/load/engine/executor/RuntimeCompat$1;
      ((RuntimeCompat.1)localObject6).<init>((Pattern)localObject5);
      localObject1 = ((File)localObject1).listFiles((FilenameFilter)localObject6);
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
    finally
    {
      for (;;)
      {
        Object localObject1;
        Object localObject6;
        Object localObject5 = "GlideRuntimeCompat";
        int k = 6;
        try
        {
          boolean bool = Log.isLoggable((String)localObject5, k);
          if (bool)
          {
            localObject5 = "GlideRuntimeCompat";
            localObject6 = "Failed to calculate accurate cpu count";
            Log.e((String)localObject5, (String)localObject6, localThrowable);
          }
          StrictMode.setThreadPolicy(localThreadPolicy);
          j = 0;
          Object localObject2 = null;
          continue;
        }
        finally
        {
          StrictMode.setThreadPolicy(localThreadPolicy);
        }
        int j = 0;
        Object localObject4 = null;
      }
    }
    i = 1;
    if (localObject1 != null)
    {
      j = localObject1.length;
      return Math.max(i, j);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\executor\RuntimeCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */