package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap.Config;
import com.bumptech.glide.util.Preconditions;

public final class PreFillType
{
  static final Bitmap.Config DEFAULT_CONFIG = Bitmap.Config.RGB_565;
  private final Bitmap.Config config;
  private final int height;
  private final int weight;
  private final int width;
  
  PreFillType(int paramInt1, int paramInt2, Bitmap.Config paramConfig, int paramInt3)
  {
    Bitmap.Config localConfig = (Bitmap.Config)Preconditions.checkNotNull(paramConfig, "Config must not be null");
    this.config = localConfig;
    this.width = paramInt1;
    this.height = paramInt2;
    this.weight = paramInt3;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof PreFillType;
    if (bool2)
    {
      paramObject = (PreFillType)paramObject;
      int i = this.height;
      int j = ((PreFillType)paramObject).height;
      if (i == j)
      {
        i = this.width;
        j = ((PreFillType)paramObject).width;
        if (i == j)
        {
          i = this.weight;
          j = ((PreFillType)paramObject).weight;
          if (i == j)
          {
            Bitmap.Config localConfig1 = this.config;
            Bitmap.Config localConfig2 = ((PreFillType)paramObject).config;
            if (localConfig1 == localConfig2) {
              bool1 = true;
            }
          }
        }
      }
    }
    return bool1;
  }
  
  Bitmap.Config getConfig()
  {
    return this.config;
  }
  
  int getHeight()
  {
    return this.height;
  }
  
  int getWeight()
  {
    return this.weight;
  }
  
  int getWidth()
  {
    return this.width;
  }
  
  public int hashCode()
  {
    int i = this.width * 31;
    int j = this.height;
    i = (i + j) * 31;
    j = this.config.hashCode();
    i = (i + j) * 31;
    j = this.weight;
    return i + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("PreFillSize{width=");
    int i = this.width;
    localStringBuilder = localStringBuilder.append(i).append(", height=");
    i = this.height;
    localStringBuilder = localStringBuilder.append(i).append(", config=");
    Bitmap.Config localConfig = this.config;
    localStringBuilder = localStringBuilder.append(localConfig).append(", weight=");
    i = this.weight;
    return i + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\prefill\PreFillType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */