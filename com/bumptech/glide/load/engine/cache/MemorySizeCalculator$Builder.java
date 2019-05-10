package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.bumptech.glide.util.Preconditions;

public final class MemorySizeCalculator$Builder
{
  static final int ARRAY_POOL_SIZE_BYTES = 4194304;
  static final int BITMAP_POOL_TARGET_SCREENS = 0;
  static final float LOW_MEMORY_MAX_SIZE_MULTIPLIER = 0.33F;
  static final float MAX_SIZE_MULTIPLIER = 0.4F;
  static final int MEMORY_CACHE_TARGET_SCREENS = 2;
  ActivityManager activityManager;
  int arrayPoolSizeBytes;
  float bitmapPoolScreens;
  final Context context;
  float lowMemoryMaxSizeMultiplier;
  float maxSizeMultiplier;
  float memoryCacheScreens = 2.0F;
  MemorySizeCalculator.ScreenDimensions screenDimensions;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 26;
    if (i < j) {}
    for (i = 4;; i = 1)
    {
      BITMAP_POOL_TARGET_SCREENS = i;
      return;
    }
  }
  
  public MemorySizeCalculator$Builder(Context paramContext)
  {
    float f = BITMAP_POOL_TARGET_SCREENS;
    this.bitmapPoolScreens = f;
    this.maxSizeMultiplier = 0.4F;
    this.lowMemoryMaxSizeMultiplier = 0.33F;
    f = 5.877472E-39F;
    this.arrayPoolSizeBytes = 4194304;
    this.context = paramContext;
    Object localObject = (ActivityManager)paramContext.getSystemService("activity");
    this.activityManager = ((ActivityManager)localObject);
    localObject = new com/bumptech/glide/load/engine/cache/MemorySizeCalculator$DisplayMetricsScreenDimensions;
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    ((MemorySizeCalculator.DisplayMetricsScreenDimensions)localObject).<init>(localDisplayMetrics);
    this.screenDimensions = ((MemorySizeCalculator.ScreenDimensions)localObject);
    int i = Build.VERSION.SDK_INT;
    int j = 26;
    if (i >= j)
    {
      localObject = this.activityManager;
      boolean bool = MemorySizeCalculator.isLowMemoryDevice((ActivityManager)localObject);
      if (bool)
      {
        bool = false;
        f = 0.0F;
        localObject = null;
        this.bitmapPoolScreens = 0.0F;
      }
    }
  }
  
  public MemorySizeCalculator build()
  {
    MemorySizeCalculator localMemorySizeCalculator = new com/bumptech/glide/load/engine/cache/MemorySizeCalculator;
    localMemorySizeCalculator.<init>(this);
    return localMemorySizeCalculator;
  }
  
  Builder setActivityManager(ActivityManager paramActivityManager)
  {
    this.activityManager = paramActivityManager;
    return this;
  }
  
  public Builder setArrayPoolSize(int paramInt)
  {
    this.arrayPoolSizeBytes = paramInt;
    return this;
  }
  
  public Builder setBitmapPoolScreens(float paramFloat)
  {
    boolean bool = paramFloat < 0.0F;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      Preconditions.checkArgument(bool, "Bitmap pool screens must be greater than or equal to 0");
      this.bitmapPoolScreens = paramFloat;
      return this;
    }
  }
  
  public Builder setLowMemoryMaxSizeMultiplier(float paramFloat)
  {
    float f = 0.0F;
    boolean bool = paramFloat < 0.0F;
    if (!bool)
    {
      f = 1.0F;
      bool = paramFloat < f;
      if (!bool) {
        bool = true;
      }
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      Preconditions.checkArgument(bool, "Low memory max size multiplier must be between 0 and 1");
      this.lowMemoryMaxSizeMultiplier = paramFloat;
      return this;
      bool = false;
    }
  }
  
  public Builder setMaxSizeMultiplier(float paramFloat)
  {
    float f = 0.0F;
    boolean bool = paramFloat < 0.0F;
    if (!bool)
    {
      f = 1.0F;
      bool = paramFloat < f;
      if (!bool) {
        bool = true;
      }
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      Preconditions.checkArgument(bool, "Size multiplier must be between 0 and 1");
      this.maxSizeMultiplier = paramFloat;
      return this;
      bool = false;
    }
  }
  
  public Builder setMemoryCacheScreens(float paramFloat)
  {
    boolean bool = paramFloat < 0.0F;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      Preconditions.checkArgument(bool, "Memory cache screens must be greater than or equal to 0");
      this.memoryCacheScreens = paramFloat;
      return this;
    }
  }
  
  Builder setScreenDimensions(MemorySizeCalculator.ScreenDimensions paramScreenDimensions)
  {
    this.screenDimensions = paramScreenDimensions;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\MemorySizeCalculator$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */