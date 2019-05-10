package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.Log;

public final class MemorySizeCalculator
{
  static final int BYTES_PER_ARGB_8888_PIXEL = 4;
  private static final int LOW_MEMORY_BYTE_ARRAY_POOL_DIVISOR = 2;
  private static final String TAG = "MemorySizeCalculator";
  private final int arrayPoolSize;
  private final int bitmapPoolSize;
  private final Context context;
  private final int memoryCacheSize;
  
  MemorySizeCalculator(MemorySizeCalculator.Builder paramBuilder)
  {
    Object localObject1 = paramBuilder.context;
    this.context = ((Context)localObject1);
    localObject1 = paramBuilder.activityManager;
    boolean bool1 = isLowMemoryDevice((ActivityManager)localObject1);
    int i;
    int k;
    Object localObject2;
    float f3;
    float f4;
    int i5;
    label185:
    String str1;
    float f5;
    boolean bool3;
    StringBuilder localStringBuilder;
    if (bool1)
    {
      i = paramBuilder.arrayPoolSizeBytes / 2;
      this.arrayPoolSize = i;
      localObject1 = paramBuilder.activityManager;
      float f1 = paramBuilder.maxSizeMultiplier;
      float f2 = paramBuilder.lowMemoryMaxSizeMultiplier;
      k = getMaxSize((ActivityManager)localObject1, f1, f2);
      localObject1 = paramBuilder.screenDimensions;
      i = ((MemorySizeCalculator.ScreenDimensions)localObject1).getWidthPixels();
      localObject2 = paramBuilder.screenDimensions;
      int n = ((MemorySizeCalculator.ScreenDimensions)localObject2).getHeightPixels();
      i = i * n * 4;
      f2 = i;
      f3 = paramBuilder.bitmapPoolScreens;
      f2 *= f3;
      int i1 = Math.round(f2);
      f4 = i;
      f3 = paramBuilder.memoryCacheScreens;
      f4 *= f3;
      i = Math.round(f4);
      int i2 = this.arrayPoolSize;
      int i3 = k - i2;
      i5 = i + i1;
      if (i5 > i3) {
        break label440;
      }
      this.memoryCacheSize = i;
      this.bitmapPoolSize = i1;
      str1 = "MemorySizeCalculator";
      i5 = 3;
      f5 = 4.2E-45F;
      bool3 = Log.isLoggable(str1, i5);
      if (bool3)
      {
        str1 = "MemorySizeCalculator";
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Calculation complete, Calculated memory cache size: ");
        int i6 = this.memoryCacheSize;
        String str2 = toMb(i6);
        localStringBuilder = localStringBuilder.append(str2).append(", pool size: ");
        i6 = this.bitmapPoolSize;
        str2 = toMb(i6);
        localStringBuilder = localStringBuilder.append(str2).append(", byte array size: ");
        i6 = this.arrayPoolSize;
        str2 = toMb(i6);
        localStringBuilder = localStringBuilder.append(str2);
        str2 = ", memory class limited? ";
        localStringBuilder = localStringBuilder.append(str2);
        i += i1;
        if (i <= k) {
          break label518;
        }
        i = 1;
        f4 = Float.MIN_VALUE;
      }
    }
    for (;;)
    {
      localObject1 = localStringBuilder.append(i);
      localObject2 = ", max size: ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      Object localObject3 = toMb(k);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3).append(", memoryClass: ");
      int m = paramBuilder.activityManager.getMemoryClass();
      localObject1 = ((StringBuilder)localObject1).append(m).append(", isLowMemoryDevice: ");
      localObject3 = paramBuilder.activityManager;
      boolean bool2 = isLowMemoryDevice((ActivityManager)localObject3);
      localObject1 = bool2;
      Log.d(str1, (String)localObject1);
      return;
      int j = paramBuilder.arrayPoolSizeBytes;
      break;
      label440:
      f3 = bool3;
      f5 = paramBuilder.bitmapPoolScreens;
      float f6 = paramBuilder.memoryCacheScreens;
      f5 += f6;
      f3 /= f5;
      i5 = Math.round(paramBuilder.memoryCacheScreens * f3);
      this.memoryCacheSize = i5;
      f5 = paramBuilder.bitmapPoolScreens;
      f3 *= f5;
      int i4 = Math.round(f3);
      this.bitmapPoolSize = i4;
      break label185;
      label518:
      j = 0;
      f4 = 0.0F;
      localObject1 = null;
    }
  }
  
  private static int getMaxSize(ActivityManager paramActivityManager, float paramFloat1, float paramFloat2)
  {
    int i = paramActivityManager.getMemoryClass() * 1024 * 1024;
    boolean bool = isLowMemoryDevice(paramActivityManager);
    float f = i;
    if (bool) {}
    for (;;)
    {
      return Math.round(f * paramFloat2);
      paramFloat2 = paramFloat1;
    }
  }
  
  static boolean isLowMemoryDevice(ActivityManager paramActivityManager)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j) {}
    for (boolean bool = paramActivityManager.isLowRamDevice();; bool = true) {
      return bool;
    }
  }
  
  private String toMb(int paramInt)
  {
    Context localContext = this.context;
    long l = paramInt;
    return Formatter.formatFileSize(localContext, l);
  }
  
  public int getArrayPoolSizeInBytes()
  {
    return this.arrayPoolSize;
  }
  
  public int getBitmapPoolSize()
  {
    return this.bitmapPoolSize;
  }
  
  public int getMemoryCacheSize()
  {
    return this.memoryCacheSize;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\MemorySizeCalculator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */