package com.bumptech.glide.load.engine.bitmap_recycle;

abstract interface ArrayAdapterInterface
{
  public abstract int getArrayLength(Object paramObject);
  
  public abstract int getElementSizeInBytes();
  
  public abstract String getTag();
  
  public abstract Object newArray(int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\ArrayAdapterInterface.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */