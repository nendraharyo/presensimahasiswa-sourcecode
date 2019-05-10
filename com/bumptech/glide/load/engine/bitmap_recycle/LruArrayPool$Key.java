package com.bumptech.glide.load.engine.bitmap_recycle;

final class LruArrayPool$Key
  implements Poolable
{
  private Class arrayClass;
  private final LruArrayPool.KeyPool pool;
  int size;
  
  LruArrayPool$Key(LruArrayPool.KeyPool paramKeyPool)
  {
    this.pool = paramKeyPool;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof Key;
    if (bool2)
    {
      paramObject = (Key)paramObject;
      int i = this.size;
      int j = ((Key)paramObject).size;
      if (i == j)
      {
        Class localClass1 = this.arrayClass;
        Class localClass2 = ((Key)paramObject).arrayClass;
        if (localClass1 == localClass2) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    int i = this.size;
    int j = i * 31;
    Class localClass = this.arrayClass;
    if (localClass != null)
    {
      localClass = this.arrayClass;
      i = localClass.hashCode();
    }
    for (;;)
    {
      return i + j;
      i = 0;
      localClass = null;
    }
  }
  
  void init(int paramInt, Class paramClass)
  {
    this.size = paramInt;
    this.arrayClass = paramClass;
  }
  
  public void offer()
  {
    this.pool.offer(this);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Key{size=");
    int i = this.size;
    localStringBuilder = localStringBuilder.append(i).append("array=");
    Class localClass = this.arrayClass;
    return localClass + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\LruArrayPool$Key.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */