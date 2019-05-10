package com.bumptech.glide.load.engine.bitmap_recycle;

final class SizeStrategy$Key
  implements Poolable
{
  private final SizeStrategy.KeyPool pool;
  int size;
  
  SizeStrategy$Key(SizeStrategy.KeyPool paramKeyPool)
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
      if (i == j) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return this.size;
  }
  
  public void init(int paramInt)
  {
    this.size = paramInt;
  }
  
  public void offer()
  {
    this.pool.offer(this);
  }
  
  public String toString()
  {
    return SizeStrategy.getBitmapString(this.size);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\SizeStrategy$Key.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */