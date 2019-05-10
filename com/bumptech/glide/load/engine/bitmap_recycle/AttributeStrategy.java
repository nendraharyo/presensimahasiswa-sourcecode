package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.util.Util;

class AttributeStrategy
  implements LruPoolStrategy
{
  private final GroupedLinkedMap groupedMap;
  private final AttributeStrategy.KeyPool keyPool;
  
  AttributeStrategy()
  {
    Object localObject = new com/bumptech/glide/load/engine/bitmap_recycle/AttributeStrategy$KeyPool;
    ((AttributeStrategy.KeyPool)localObject).<init>();
    this.keyPool = ((AttributeStrategy.KeyPool)localObject);
    localObject = new com/bumptech/glide/load/engine/bitmap_recycle/GroupedLinkedMap;
    ((GroupedLinkedMap)localObject).<init>();
    this.groupedMap = ((GroupedLinkedMap)localObject);
  }
  
  static String getBitmapString(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return "[" + paramInt1 + "x" + paramInt2 + "], " + paramConfig;
  }
  
  private static String getBitmapString(Bitmap paramBitmap)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    Bitmap.Config localConfig = paramBitmap.getConfig();
    return getBitmapString(i, j, localConfig);
  }
  
  public Bitmap get(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AttributeStrategy.Key localKey = this.keyPool.get(paramInt1, paramInt2, paramConfig);
    return (Bitmap)this.groupedMap.get(localKey);
  }
  
  public int getSize(Bitmap paramBitmap)
  {
    return Util.getBitmapByteSize(paramBitmap);
  }
  
  public String logBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return getBitmapString(paramInt1, paramInt2, paramConfig);
  }
  
  public String logBitmap(Bitmap paramBitmap)
  {
    return getBitmapString(paramBitmap);
  }
  
  public void put(Bitmap paramBitmap)
  {
    Object localObject = this.keyPool;
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    Bitmap.Config localConfig = paramBitmap.getConfig();
    localObject = ((AttributeStrategy.KeyPool)localObject).get(i, j, localConfig);
    this.groupedMap.put((Poolable)localObject, paramBitmap);
  }
  
  public Bitmap removeLast()
  {
    return (Bitmap)this.groupedMap.removeLast();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("AttributeStrategy:\n  ");
    GroupedLinkedMap localGroupedLinkedMap = this.groupedMap;
    return localGroupedLinkedMap;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\AttributeStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */