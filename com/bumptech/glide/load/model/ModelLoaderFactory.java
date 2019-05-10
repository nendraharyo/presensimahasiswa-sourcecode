package com.bumptech.glide.load.model;

public abstract interface ModelLoaderFactory
{
  public abstract ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory);
  
  public abstract void teardown();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ModelLoaderFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */