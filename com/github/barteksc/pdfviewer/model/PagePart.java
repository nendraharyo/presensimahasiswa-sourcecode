package com.github.barteksc.pdfviewer.model;

import android.graphics.Bitmap;
import android.graphics.RectF;

public class PagePart
{
  private int cacheOrder;
  private float height;
  private int page;
  private RectF pageRelativeBounds;
  private Bitmap renderedBitmap;
  private boolean thumbnail;
  private int userPage;
  private float width;
  
  public PagePart(int paramInt1, int paramInt2, Bitmap paramBitmap, float paramFloat1, float paramFloat2, RectF paramRectF, boolean paramBoolean, int paramInt3)
  {
    this.userPage = paramInt1;
    this.page = paramInt2;
    this.renderedBitmap = paramBitmap;
    this.pageRelativeBounds = paramRectF;
    this.thumbnail = paramBoolean;
    this.cacheOrder = paramInt3;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof PagePart;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      paramObject = (PagePart)paramObject;
      int i = ((PagePart)paramObject).getPage();
      int j = this.page;
      if (i == j)
      {
        i = ((PagePart)paramObject).getUserPage();
        j = this.userPage;
        if (i == j)
        {
          float f1 = ((PagePart)paramObject).getWidth();
          float f2 = this.width;
          boolean bool3 = f1 < f2;
          if (!bool3)
          {
            f1 = ((PagePart)paramObject).getHeight();
            f2 = this.height;
            bool3 = f1 < f2;
            if (!bool3)
            {
              RectF localRectF1 = ((PagePart)paramObject).getPageRelativeBounds();
              f1 = localRectF1.left;
              RectF localRectF2 = this.pageRelativeBounds;
              f2 = localRectF2.left;
              bool3 = f1 < f2;
              if (!bool3)
              {
                localRectF1 = ((PagePart)paramObject).getPageRelativeBounds();
                f1 = localRectF1.right;
                localRectF2 = this.pageRelativeBounds;
                f2 = localRectF2.right;
                bool3 = f1 < f2;
                if (!bool3)
                {
                  localRectF1 = ((PagePart)paramObject).getPageRelativeBounds();
                  f1 = localRectF1.top;
                  localRectF2 = this.pageRelativeBounds;
                  f2 = localRectF2.top;
                  bool3 = f1 < f2;
                  if (!bool3)
                  {
                    localRectF1 = ((PagePart)paramObject).getPageRelativeBounds();
                    f1 = localRectF1.bottom;
                    localRectF2 = this.pageRelativeBounds;
                    f2 = localRectF2.bottom;
                    bool3 = f1 < f2;
                    if (!bool3) {
                      bool1 = true;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public int getCacheOrder()
  {
    return this.cacheOrder;
  }
  
  public float getHeight()
  {
    return this.height;
  }
  
  public int getPage()
  {
    return this.page;
  }
  
  public RectF getPageRelativeBounds()
  {
    return this.pageRelativeBounds;
  }
  
  public Bitmap getRenderedBitmap()
  {
    return this.renderedBitmap;
  }
  
  public int getUserPage()
  {
    return this.userPage;
  }
  
  public float getWidth()
  {
    return this.width;
  }
  
  public boolean isThumbnail()
  {
    return this.thumbnail;
  }
  
  public void setCacheOrder(int paramInt)
  {
    this.cacheOrder = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\model\PagePart.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */