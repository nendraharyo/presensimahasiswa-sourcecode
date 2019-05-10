package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.util.Util;
import java.util.NavigableMap;

final class SizeStrategy
  implements LruPoolStrategy
{
  private static final int MAX_SIZE_MULTIPLE = 8;
  private final GroupedLinkedMap groupedMap;
  private final SizeStrategy.KeyPool keyPool;
  private final NavigableMap sortedSizes;
  
  SizeStrategy()
  {
    Object localObject = new com/bumptech/glide/load/engine/bitmap_recycle/SizeStrategy$KeyPool;
    ((SizeStrategy.KeyPool)localObject).<init>();
    this.keyPool = ((SizeStrategy.KeyPool)localObject);
    localObject = new com/bumptech/glide/load/engine/bitmap_recycle/GroupedLinkedMap;
    ((GroupedLinkedMap)localObject).<init>();
    this.groupedMap = ((GroupedLinkedMap)localObject);
    localObject = new com/bumptech/glide/load/engine/bitmap_recycle/PrettyPrintTreeMap;
    ((PrettyPrintTreeMap)localObject).<init>();
    this.sortedSizes = ((NavigableMap)localObject);
  }
  
  private void decrementBitmapOfSize(Integer paramInteger)
  {
    Object localObject = (Integer)this.sortedSizes.get(paramInteger);
    int i = ((Integer)localObject).intValue();
    int j = 1;
    if (i == j)
    {
      localObject = this.sortedSizes;
      ((NavigableMap)localObject).remove(paramInteger);
    }
    for (;;)
    {
      return;
      NavigableMap localNavigableMap = this.sortedSizes;
      int k = ((Integer)localObject).intValue() + -1;
      localObject = Integer.valueOf(k);
      localNavigableMap.put(paramInteger, localObject);
    }
  }
  
  static String getBitmapString(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "[" + paramInt + "]";
  }
  
  private static String getBitmapString(Bitmap paramBitmap)
  {
    return getBitmapString(Util.getBitmapByteSize(paramBitmap));
  }
  
  public Bitmap get(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    int i = Util.getBitmapByteSize(paramInt1, paramInt2, paramConfig);
    Object localObject1 = this.keyPool.get(i);
    Object localObject2 = this.sortedSizes;
    Integer localInteger = Integer.valueOf(i);
    localObject2 = (Integer)((NavigableMap)localObject2).ceilingKey(localInteger);
    if (localObject2 != null)
    {
      int j = ((Integer)localObject2).intValue();
      if (j != i)
      {
        j = ((Integer)localObject2).intValue();
        i *= 8;
        if (j <= i)
        {
          localObject3 = this.keyPool;
          ((SizeStrategy.KeyPool)localObject3).offer((Poolable)localObject1);
          localObject1 = this.keyPool;
          i = ((Integer)localObject2).intValue();
          localObject1 = ((SizeStrategy.KeyPool)localObject1).get(i);
        }
      }
    }
    Object localObject3 = this.groupedMap;
    localObject1 = (Bitmap)((GroupedLinkedMap)localObject3).get((Poolable)localObject1);
    if (localObject1 != null)
    {
      ((Bitmap)localObject1).reconfigure(paramInt1, paramInt2, paramConfig);
      decrementBitmapOfSize((Integer)localObject2);
    }
    return (Bitmap)localObject1;
  }
  
  public int getSize(Bitmap paramBitmap)
  {
    return Util.getBitmapByteSize(paramBitmap);
  }
  
  public String logBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return getBitmapString(Util.getBitmapByteSize(paramInt1, paramInt2, paramConfig));
  }
  
  public String logBitmap(Bitmap paramBitmap)
  {
    return getBitmapString(paramBitmap);
  }
  
  public void put(Bitmap paramBitmap)
  {
    int i = Util.getBitmapByteSize(paramBitmap);
    Object localObject1 = this.keyPool.get(i);
    this.groupedMap.put((Poolable)localObject1, paramBitmap);
    Object localObject2 = this.sortedSizes;
    int j = ((SizeStrategy.Key)localObject1).size;
    Object localObject3 = Integer.valueOf(j);
    localObject2 = (Integer)((NavigableMap)localObject2).get(localObject3);
    localObject3 = this.sortedSizes;
    int k = ((SizeStrategy.Key)localObject1).size;
    localObject1 = Integer.valueOf(k);
    if (localObject2 == null) {}
    for (i = 1;; i = ((Integer)localObject2).intValue() + 1)
    {
      localObject2 = Integer.valueOf(i);
      ((NavigableMap)localObject3).put(localObject1, localObject2);
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
      decrementBitmapOfSize(localInteger);
    }
    return localBitmap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("SizeStrategy:\n  ");
    Object localObject = this.groupedMap;
    localStringBuilder = localStringBuilder.append(localObject).append("\n  SortedSizes");
    localObject = this.sortedSizes;
    return (String)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\SizeStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */