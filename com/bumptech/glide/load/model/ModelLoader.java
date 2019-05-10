package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Options;

public abstract interface ModelLoader
{
  public abstract ModelLoader.LoadData buildLoadData(Object paramObject, int paramInt1, int paramInt2, Options paramOptions);
  
  public abstract boolean handles(Object paramObject);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ModelLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */