package com.sun.pdfview;

import android.graphics.RectF;

public class ImageInfo
{
  int bgColor;
  RectF clip;
  int height;
  int width;
  
  public ImageInfo(int paramInt1, int paramInt2, RectF paramRectF)
  {
    this(paramInt1, paramInt2, paramRectF, -1);
  }
  
  public ImageInfo(int paramInt1, int paramInt2, RectF paramRectF, int paramInt3)
  {
    this.width = paramInt1;
    this.height = paramInt2;
    this.clip = paramRectF;
    this.bgColor = paramInt3;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    RectF localRectF1 = null;
    boolean bool2 = paramObject instanceof ImageInfo;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (ImageInfo)paramObject;
      int i = this.width;
      int j = ((ImageInfo)paramObject).width;
      if (i == j)
      {
        i = this.height;
        j = ((ImageInfo)paramObject).height;
        if (i == j)
        {
          RectF localRectF2 = this.clip;
          if (localRectF2 != null)
          {
            localRectF2 = ((ImageInfo)paramObject).clip;
            if (localRectF2 != null)
            {
              localRectF1 = this.clip;
              localRectF2 = ((ImageInfo)paramObject).clip;
              bool1 = localRectF1.equals(localRectF2);
              continue;
            }
          }
          localRectF2 = this.clip;
          if (localRectF2 == null)
          {
            localRectF2 = ((ImageInfo)paramObject).clip;
            if (localRectF2 == null) {
              bool1 = true;
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.width;
    int j = this.height << 16;
    i ^= j;
    RectF localRectF1 = this.clip;
    if (localRectF1 != null)
    {
      j = (int)this.clip.width();
      int k = (int)this.clip.height();
      j = (j | k) << 8;
      i ^= j;
      localRectF1 = this.clip;
      float f1 = localRectF1.left;
      j = (int)f1;
      RectF localRectF2 = this.clip;
      float f2 = localRectF2.top;
      k = (int)f2;
      j |= k;
      i ^= j;
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\ImageInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */