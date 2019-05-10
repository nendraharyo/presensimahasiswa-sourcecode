package com.bumptech.glide.util;

import com.bumptech.glide.ListPreloader.PreloadSizeProvider;

public class FixedPreloadSizeProvider
  implements ListPreloader.PreloadSizeProvider
{
  private final int[] size;
  
  public FixedPreloadSizeProvider(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = paramInt1;
    arrayOfInt[1] = paramInt2;
    this.size = arrayOfInt;
  }
  
  public int[] getPreloadSize(Object paramObject, int paramInt1, int paramInt2)
  {
    return this.size;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\FixedPreloadSizeProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */