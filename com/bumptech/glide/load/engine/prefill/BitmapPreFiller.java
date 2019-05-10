package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.Map;

public final class BitmapPreFiller
{
  private final BitmapPool bitmapPool;
  private BitmapPreFillRunner current;
  private final DecodeFormat defaultFormat;
  private final Handler handler;
  private final MemoryCache memoryCache;
  
  public BitmapPreFiller(MemoryCache paramMemoryCache, BitmapPool paramBitmapPool, DecodeFormat paramDecodeFormat)
  {
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    this.handler = localHandler;
    this.memoryCache = paramMemoryCache;
    this.bitmapPool = paramBitmapPool;
    this.defaultFormat = paramDecodeFormat;
  }
  
  private static int getSizeInBytes(PreFillType paramPreFillType)
  {
    int i = paramPreFillType.getWidth();
    int j = paramPreFillType.getHeight();
    Bitmap.Config localConfig = paramPreFillType.getConfig();
    return Util.getBitmapByteSize(i, j, localConfig);
  }
  
  PreFillQueue generateAllocationOrder(PreFillType... paramVarArgs)
  {
    int i = 0;
    PreFillQueue localPreFillQueue = null;
    long l1 = this.memoryCache.getMaxSize();
    long l2 = this.memoryCache.getCurrentSize();
    l1 -= l2;
    l2 = this.bitmapPool.getMaxSize() + l1;
    int j = paramVarArgs.length;
    int k = 0;
    float f1 = 0.0F;
    int m = 0;
    HashMap localHashMap = null;
    float f2 = 0.0F;
    int n;
    while (k < j)
    {
      PreFillType localPreFillType1 = paramVarArgs[k];
      n = localPreFillType1.getWeight();
      m += n;
      k += 1;
    }
    f1 = (float)l2;
    f2 = m;
    f1 /= f2;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    j = paramVarArgs.length;
    while (i < j)
    {
      PreFillType localPreFillType2 = paramVarArgs[i];
      float f3 = localPreFillType2.getWeight() * f1;
      int i1 = Math.round(f3);
      n = getSizeInBytes(localPreFillType2);
      i1 /= n;
      Integer localInteger = Integer.valueOf(i1);
      localHashMap.put(localPreFillType2, localInteger);
      i += 1;
    }
    localPreFillQueue = new com/bumptech/glide/load/engine/prefill/PreFillQueue;
    localPreFillQueue.<init>(localHashMap);
    return localPreFillQueue;
  }
  
  public void preFill(PreFillType.Builder... paramVarArgs)
  {
    Object localObject1 = this.current;
    if (localObject1 != null)
    {
      localObject1 = this.current;
      ((BitmapPreFillRunner)localObject1).cancel();
    }
    Object localObject2 = new PreFillType[paramVarArgs.length];
    int i = 0;
    localObject1 = null;
    int j = paramVarArgs.length;
    if (i < j)
    {
      localObject3 = paramVarArgs[i];
      localObject4 = ((PreFillType.Builder)localObject3).getConfig();
      if (localObject4 == null)
      {
        localObject4 = this.defaultFormat;
        DecodeFormat localDecodeFormat = DecodeFormat.PREFER_ARGB_8888;
        if (localObject4 != localDecodeFormat) {
          break label111;
        }
      }
      label111:
      for (localObject4 = Bitmap.Config.ARGB_8888;; localObject4 = Bitmap.Config.RGB_565)
      {
        ((PreFillType.Builder)localObject3).setConfig((Bitmap.Config)localObject4);
        localObject4 = ((PreFillType.Builder)localObject3).build();
        localObject2[i] = localObject4;
        i += 1;
        break;
      }
    }
    localObject1 = generateAllocationOrder((PreFillType[])localObject2);
    Object localObject4 = new com/bumptech/glide/load/engine/prefill/BitmapPreFillRunner;
    localObject2 = this.bitmapPool;
    Object localObject3 = this.memoryCache;
    ((BitmapPreFillRunner)localObject4).<init>((BitmapPool)localObject2, (MemoryCache)localObject3, (PreFillQueue)localObject1);
    this.current = ((BitmapPreFillRunner)localObject4);
    localObject1 = this.handler;
    localObject4 = this.current;
    ((Handler)localObject1).post((Runnable)localObject4);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\prefill\BitmapPreFiller.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */