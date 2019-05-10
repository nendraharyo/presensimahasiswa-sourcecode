package com.bumptech.glide.load.engine.bitmap_recycle;

class SizeStrategy$KeyPool
  extends BaseKeyPool
{
  protected SizeStrategy.Key create()
  {
    SizeStrategy.Key localKey = new com/bumptech/glide/load/engine/bitmap_recycle/SizeStrategy$Key;
    localKey.<init>(this);
    return localKey;
  }
  
  public SizeStrategy.Key get(int paramInt)
  {
    SizeStrategy.Key localKey = (SizeStrategy.Key)super.get();
    localKey.init(paramInt);
    return localKey;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\SizeStrategy$KeyPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */