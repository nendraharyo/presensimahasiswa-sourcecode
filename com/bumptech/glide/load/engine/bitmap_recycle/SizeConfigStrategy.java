package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.bumptech.glide.util.Util;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class SizeConfigStrategy
  implements LruPoolStrategy
{
  private static final Bitmap.Config[] ALPHA_8_IN_CONFIGS;
  private static final Bitmap.Config[] ARGB_4444_IN_CONFIGS;
  private static final Bitmap.Config[] ARGB_8888_IN_CONFIGS;
  private static final int MAX_SIZE_MULTIPLE = 8;
  private static final Bitmap.Config[] RGBA_F16_IN_CONFIGS;
  private static final Bitmap.Config[] RGB_565_IN_CONFIGS;
  private final GroupedLinkedMap groupedMap;
  private final SizeConfigStrategy.KeyPool keyPool;
  private final Map sortedSizes;
  
  static
  {
    int i = 1;
    int j = 2;
    Bitmap.Config[] arrayOfConfig = new Bitmap.Config[j];
    Bitmap.Config localConfig1 = Bitmap.Config.ARGB_8888;
    arrayOfConfig[0] = localConfig1;
    localConfig1 = null;
    arrayOfConfig[i] = null;
    int k = Build.VERSION.SDK_INT;
    int m = 26;
    if (k >= m)
    {
      k = arrayOfConfig.length + 1;
      arrayOfConfig = (Bitmap.Config[])Arrays.copyOf(arrayOfConfig, k);
      k = arrayOfConfig.length + -1;
      Bitmap.Config localConfig2 = Bitmap.Config.RGBA_F16;
      arrayOfConfig[k] = localConfig2;
    }
    ARGB_8888_IN_CONFIGS = arrayOfConfig;
    RGBA_F16_IN_CONFIGS = ARGB_8888_IN_CONFIGS;
    arrayOfConfig = new Bitmap.Config[i];
    localConfig1 = Bitmap.Config.RGB_565;
    arrayOfConfig[0] = localConfig1;
    RGB_565_IN_CONFIGS = arrayOfConfig;
    arrayOfConfig = new Bitmap.Config[i];
    localConfig1 = Bitmap.Config.ARGB_4444;
    arrayOfConfig[0] = localConfig1;
    ARGB_4444_IN_CONFIGS = arrayOfConfig;
    arrayOfConfig = new Bitmap.Config[i];
    localConfig1 = Bitmap.Config.ALPHA_8;
    arrayOfConfig[0] = localConfig1;
    ALPHA_8_IN_CONFIGS = arrayOfConfig;
  }
  
  public SizeConfigStrategy()
  {
    Object localObject = new com/bumptech/glide/load/engine/bitmap_recycle/SizeConfigStrategy$KeyPool;
    ((SizeConfigStrategy.KeyPool)localObject).<init>();
    this.keyPool = ((SizeConfigStrategy.KeyPool)localObject);
    localObject = new com/bumptech/glide/load/engine/bitmap_recycle/GroupedLinkedMap;
    ((GroupedLinkedMap)localObject).<init>();
    this.groupedMap = ((GroupedLinkedMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.sortedSizes = ((Map)localObject);
  }
  
  private void decrementBitmapOfSize(Integer paramInteger, Bitmap paramBitmap)
  {
    Object localObject1 = paramBitmap.getConfig();
    Object localObject2 = getSizesForConfig((Bitmap.Config)localObject1);
    localObject1 = (Integer)((NavigableMap)localObject2).get(paramInteger);
    if (localObject1 == null)
    {
      localObject1 = new java/lang/NullPointerException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Tried to decrement empty size, size: ").append(paramInteger).append(", removed: ");
      String str = logBitmap(paramBitmap);
      localObject2 = str + ", this: " + this;
      ((NullPointerException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int i = ((Integer)localObject1).intValue();
    int j = 1;
    if (i == j) {
      ((NavigableMap)localObject2).remove(paramInteger);
    }
    for (;;)
    {
      return;
      int k = ((Integer)localObject1).intValue() + -1;
      localObject1 = Integer.valueOf(k);
      ((NavigableMap)localObject2).put(paramInteger, localObject1);
    }
  }
  
  private SizeConfigStrategy.Key findBestKey(int paramInt, Bitmap.Config paramConfig)
  {
    Object localObject1 = this.keyPool.get(paramInt, paramConfig);
    Bitmap.Config[] arrayOfConfig = getInConfigs(paramConfig);
    int i = arrayOfConfig.length;
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    SizeConfigStrategy.KeyPool localKeyPool = null;
    for (;;)
    {
      Bitmap.Config localConfig;
      if (k < i)
      {
        localConfig = arrayOfConfig[k];
        localObject2 = getSizesForConfig(localConfig);
        Integer localInteger = Integer.valueOf(paramInt);
        localObject2 = (Integer)((NavigableMap)localObject2).ceilingKey(localInteger);
        if (localObject2 == null) {
          break label178;
        }
        int m = ((Integer)localObject2).intValue();
        int n = paramInt * 8;
        if (m > n) {
          break label178;
        }
        k = ((Integer)localObject2).intValue();
        if (k == paramInt)
        {
          if (localConfig == null) {
            if (paramConfig == null) {
              break label172;
            }
          }
        }
        else
        {
          localKeyPool = this.keyPool;
          localKeyPool.offer((Poolable)localObject1);
          localObject1 = this.keyPool;
          j = ((Integer)localObject2).intValue();
        }
      }
      label172:
      for (localObject2 = ((SizeConfigStrategy.KeyPool)localObject1).get(j, localConfig);; localObject2 = localObject1)
      {
        return (SizeConfigStrategy.Key)localObject2;
        bool = localConfig.equals(paramConfig);
        if (!bool) {
          break;
        }
      }
      label178:
      j = bool + true;
      boolean bool = j;
    }
  }
  
  static String getBitmapString(int paramInt, Bitmap.Config paramConfig)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "[" + paramInt + "](" + paramConfig + ")";
  }
  
  private static Bitmap.Config[] getInConfigs(Bitmap.Config paramConfig)
  {
    int i = Build.VERSION.SDK_INT;
    int k = 26;
    Object localObject;
    if (i >= k)
    {
      localObject = Bitmap.Config.RGBA_F16;
      boolean bool = ((Bitmap.Config)localObject).equals(paramConfig);
      if (bool) {
        localObject = RGBA_F16_IN_CONFIGS;
      }
    }
    for (;;)
    {
      return (Bitmap.Config[])localObject;
      localObject = SizeConfigStrategy.1.$SwitchMap$android$graphics$Bitmap$Config;
      k = paramConfig.ordinal();
      int j = localObject[k];
      switch (j)
      {
      default: 
        j = 1;
        localObject = new Bitmap.Config[j];
        k = 0;
        localObject[0] = paramConfig;
        break;
      case 1: 
        localObject = ARGB_8888_IN_CONFIGS;
        break;
      case 2: 
        localObject = RGB_565_IN_CONFIGS;
        break;
      case 3: 
        localObject = ARGB_4444_IN_CONFIGS;
        break;
      case 4: 
        localObject = ALPHA_8_IN_CONFIGS;
      }
    }
  }
  
  private NavigableMap getSizesForConfig(Bitmap.Config paramConfig)
  {
    Object localObject = (NavigableMap)this.sortedSizes.get(paramConfig);
    if (localObject == null)
    {
      localObject = new java/util/TreeMap;
      ((TreeMap)localObject).<init>();
      Map localMap = this.sortedSizes;
      localMap.put(paramConfig, localObject);
    }
    return (NavigableMap)localObject;
  }
  
  public Bitmap get(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    int i = Util.getBitmapByteSize(paramInt1, paramInt2, paramConfig);
    Object localObject = findBestKey(i, paramConfig);
    Bitmap localBitmap = (Bitmap)this.groupedMap.get((Poolable)localObject);
    if (localBitmap != null)
    {
      int j = ((SizeConfigStrategy.Key)localObject).size;
      localObject = Integer.valueOf(j);
      decrementBitmapOfSize((Integer)localObject, localBitmap);
      localObject = localBitmap.getConfig();
      if (localObject == null) {
        break label89;
      }
    }
    label89:
    for (localObject = localBitmap.getConfig();; localObject = Bitmap.Config.ARGB_8888)
    {
      localBitmap.reconfigure(paramInt1, paramInt2, (Bitmap.Config)localObject);
      return localBitmap;
    }
  }
  
  public int getSize(Bitmap paramBitmap)
  {
    return Util.getBitmapByteSize(paramBitmap);
  }
  
  public String logBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return getBitmapString(Util.getBitmapByteSize(paramInt1, paramInt2, paramConfig), paramConfig);
  }
  
  public String logBitmap(Bitmap paramBitmap)
  {
    int i = Util.getBitmapByteSize(paramBitmap);
    Bitmap.Config localConfig = paramBitmap.getConfig();
    return getBitmapString(i, localConfig);
  }
  
  public void put(Bitmap paramBitmap)
  {
    int i = Util.getBitmapByteSize(paramBitmap);
    Object localObject1 = this.keyPool;
    Object localObject2 = paramBitmap.getConfig();
    localObject1 = ((SizeConfigStrategy.KeyPool)localObject1).get(i, (Bitmap.Config)localObject2);
    this.groupedMap.put((Poolable)localObject1, paramBitmap);
    Object localObject3 = paramBitmap.getConfig();
    localObject2 = getSizesForConfig((Bitmap.Config)localObject3);
    i = ((SizeConfigStrategy.Key)localObject1).size;
    localObject3 = Integer.valueOf(i);
    localObject3 = (Integer)((NavigableMap)localObject2).get(localObject3);
    int j = ((SizeConfigStrategy.Key)localObject1).size;
    localObject1 = Integer.valueOf(j);
    if (localObject3 == null) {}
    for (i = 1;; i = ((Integer)localObject3).intValue() + 1)
    {
      localObject3 = Integer.valueOf(i);
      ((NavigableMap)localObject2).put(localObject1, localObject3);
      return;
    }
  }
  
  public Bitmap removeLast()
  {
    Bitmap localBitmap = (Bitmap)this.groupedMap.removeLast();
    if (localBitmap != null)
    {
      int i = Util.getBitmapByteSize(localBitmap);
      Integer localInteger = Integer.valueOf(i);
      decrementBitmapOfSize(localInteger, localBitmap);
    }
    return localBitmap;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("SizeConfigStrategy{groupedMap=");
    Object localObject2 = this.groupedMap;
    localObject2 = ((StringBuilder)localObject1).append(localObject2).append(", sortedSizes=(");
    localObject1 = this.sortedSizes.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    Object localObject3;
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      localObject3 = ((Map.Entry)localObject1).getKey();
      localObject3 = ((StringBuilder)localObject2).append(localObject3);
      char c = '[';
      localObject3 = ((StringBuilder)localObject3).append(c);
      localObject1 = ((Map.Entry)localObject1).getValue();
      localObject1 = ((StringBuilder)localObject3).append(localObject1);
      localObject3 = "], ";
      ((StringBuilder)localObject1).append((String)localObject3);
    }
    localObject1 = this.sortedSizes;
    boolean bool = ((Map)localObject1).isEmpty();
    if (!bool)
    {
      int i = ((StringBuilder)localObject2).length() + -2;
      int j = ((StringBuilder)localObject2).length();
      localObject3 = "";
      ((StringBuilder)localObject2).replace(i, j, (String)localObject3);
    }
    return ")}";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\SizeConfigStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */