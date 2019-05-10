package com.bumptech.glide.load.engine;

public abstract interface Resource
{
  public abstract Object get();
  
  public abstract Class getResourceClass();
  
  public abstract int getSize();
  
  public abstract void recycle();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\Resource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */