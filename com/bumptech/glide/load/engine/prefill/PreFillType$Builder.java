package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap.Config;

public class PreFillType$Builder
{
  private Bitmap.Config config;
  private final int height;
  private int weight;
  private final int width;
  
  public PreFillType$Builder(int paramInt)
  {
    this(paramInt, paramInt);
  }
  
  public PreFillType$Builder(int paramInt1, int paramInt2)
  {
    int i = 1;
    this.weight = i;
    IllegalArgumentException localIllegalArgumentException;
    if (paramInt1 <= 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Width must be > 0");
      throw localIllegalArgumentException;
    }
    if (paramInt2 <= 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Height must be > 0");
      throw localIllegalArgumentException;
    }
    this.width = paramInt1;
    this.height = paramInt2;
  }
  
  PreFillType build()
  {
    PreFillType localPreFillType = new com/bumptech/glide/load/engine/prefill/PreFillType;
    int i = this.width;
    int j = this.height;
    Bitmap.Config localConfig = this.config;
    int k = this.weight;
    localPreFillType.<init>(i, j, localConfig, k);
    return localPreFillType;
  }
  
  Bitmap.Config getConfig()
  {
    return this.config;
  }
  
  public Builder setConfig(Bitmap.Config paramConfig)
  {
    this.config = paramConfig;
    return this;
  }
  
  public Builder setWeight(int paramInt)
  {
    if (paramInt <= 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Weight must be > 0");
      throw localIllegalArgumentException;
    }
    this.weight = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\prefill\PreFillType$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */