package com.bumptech.glide.load.engine.cache;

import android.util.DisplayMetrics;

final class MemorySizeCalculator$DisplayMetricsScreenDimensions
  implements MemorySizeCalculator.ScreenDimensions
{
  private final DisplayMetrics displayMetrics;
  
  MemorySizeCalculator$DisplayMetricsScreenDimensions(DisplayMetrics paramDisplayMetrics)
  {
    this.displayMetrics = paramDisplayMetrics;
  }
  
  public int getHeightPixels()
  {
    return this.displayMetrics.heightPixels;
  }
  
  public int getWidthPixels()
  {
    return this.displayMetrics.widthPixels;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\MemorySizeCalculator$DisplayMetricsScreenDimensions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */