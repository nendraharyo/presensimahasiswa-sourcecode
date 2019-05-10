package com.bumptech.glide.load.engine.bitmap_recycle;

public abstract interface ArrayPool
{
  public static final int STANDARD_BUFFER_SIZE_BYTES = 65536;
  
  public abstract void clearMemory();
  
  public abstract Object get(int paramInt, Class paramClass);
  
  public abstract Object getExact(int paramInt, Class paramClass);
  
  public abstract void put(Object paramObject);
  
  public abstract void put(Object paramObject, Class paramClass);
  
  public abstract void trimMemory(int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\ArrayPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */