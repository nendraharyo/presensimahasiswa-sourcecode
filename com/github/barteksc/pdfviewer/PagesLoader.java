package com.github.barteksc.pdfviewer;

import android.graphics.RectF;
import android.util.Pair;
import com.github.barteksc.pdfviewer.util.Constants;
import com.github.barteksc.pdfviewer.util.Constants.Cache;
import com.github.barteksc.pdfviewer.util.MathUtils;

class PagesLoader
{
  private int cacheOrder;
  private float colWidth;
  private Pair colsRows;
  private float pageRelativePartHeight;
  private float pageRelativePartWidth;
  private float partRenderHeight;
  private float partRenderWidth;
  private PDFView pdfView;
  private float rowHeight;
  private float scaledHeight;
  private float scaledSpacingPx;
  private float scaledWidth;
  private int thumbnailHeight;
  private final RectF thumbnailRect;
  private int thumbnailWidth;
  private float xOffset;
  private float yOffset;
  
  PagesLoader(PDFView paramPDFView)
  {
    RectF localRectF = new android/graphics/RectF;
    localRectF.<init>(0.0F, 0.0F, f, f);
    this.thumbnailRect = localRectF;
    this.pdfView = paramPDFView;
  }
  
  private int documentPage(int paramInt)
  {
    int i = -1;
    int[] arrayOfInt = this.pdfView.getOriginalUserPages();
    int j;
    if (arrayOfInt != null) {
      if (paramInt >= 0)
      {
        arrayOfInt = this.pdfView.getOriginalUserPages();
        j = arrayOfInt.length;
        if (paramInt < j) {
          break label38;
        }
      }
    }
    label38:
    label85:
    for (;;)
    {
      return i;
      arrayOfInt = this.pdfView.getOriginalUserPages();
      for (j = arrayOfInt[paramInt];; j = paramInt)
      {
        if (j < 0) {
          break label85;
        }
        PDFView localPDFView = this.pdfView;
        int k = localPDFView.getDocumentPageCount();
        if (paramInt >= k) {
          break;
        }
        i = j;
        break;
      }
    }
  }
  
  private PagesLoader.Holder getPageAndCoordsByOffset(float paramFloat, boolean paramBoolean)
  {
    PagesLoader.Holder localHolder = new com/github/barteksc/pdfviewer/PagesLoader$Holder;
    localHolder.<init>(this, null);
    int i = 0;
    float f1 = -MathUtils.max(paramFloat, 0.0F);
    PDFView localPDFView = this.pdfView;
    boolean bool = localPDFView.isSwipeVertical();
    float f2;
    float f3;
    int j;
    int k;
    if (bool)
    {
      f2 = this.scaledHeight;
      f3 = this.scaledSpacingPx;
      f2 += f3;
      j = MathUtils.floor(f1 / f2);
      localHolder.page = j;
      f2 = this.scaledHeight;
      f3 = this.scaledSpacingPx;
      f2 += f3;
      k = localHolder.page;
      f3 = k;
      f2 *= f3;
      f1 = Math.abs(f1 - f2);
      f2 = this.rowHeight;
      f2 = f1 / f2;
      f1 = this.xOffset;
      f3 = this.colWidth;
      f1 /= f3;
      if (!paramBoolean) {
        break label302;
      }
      j = MathUtils.ceil(f2);
      localHolder.row = j;
      i = MathUtils.ceil(f1);
    }
    for (localHolder.col = i;; localHolder.col = i)
    {
      return localHolder;
      f2 = this.scaledWidth;
      f3 = this.scaledSpacingPx;
      f2 += f3;
      j = MathUtils.floor(f1 / f2);
      localHolder.page = j;
      f2 = this.scaledWidth;
      f3 = this.scaledSpacingPx;
      f2 += f3;
      k = localHolder.page;
      f3 = k;
      f2 *= f3;
      f1 = Math.abs(f1 - f2);
      f2 = this.colWidth;
      f1 /= f2;
      f2 = this.yOffset;
      f3 = this.rowHeight;
      f2 /= f3;
      break;
      label302:
      j = MathUtils.floor(f2);
      localHolder.row = j;
      i = MathUtils.floor(f1);
    }
  }
  
  private Pair getPageColsRows()
  {
    float f1 = 1.0F;
    float f2 = this.pdfView.getOptimalPageWidth();
    f2 = f1 / f2;
    float f3 = this.pdfView.getOptimalPageHeight();
    f3 = f1 / f3;
    float f4 = Constants.PART_SIZE;
    f3 *= f4;
    f4 = this.pdfView.getZoom();
    f3 /= f4;
    f4 = Constants.PART_SIZE;
    f2 *= f4;
    f4 = this.pdfView.getZoom();
    f2 /= f4;
    int i = MathUtils.ceil(f1 / f3);
    int j = MathUtils.ceil(f1 / f2);
    Pair localPair = new android/util/Pair;
    Integer localInteger1 = Integer.valueOf(j);
    Integer localInteger2 = Integer.valueOf(i);
    localPair.<init>(localInteger1, localInteger2);
    return localPair;
  }
  
  private boolean loadCell(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2)
  {
    float f1 = paramInt4 * paramFloat1;
    float f2 = paramInt3 * paramFloat2;
    float f3 = this.partRenderWidth;
    float f4 = this.partRenderHeight;
    float f5 = f1 + paramFloat1;
    float f6 = 1.0F;
    boolean bool1 = f5 < f6;
    if (bool1)
    {
      int i = 1065353216;
      f5 = 1.0F;
      paramFloat1 = f5 - f1;
    }
    f5 = f2 + paramFloat2;
    f6 = 1.0F;
    boolean bool2 = f5 < f6;
    if (bool2)
    {
      int j = 1065353216;
      f5 = 1.0F;
      paramFloat2 = f5 - f2;
    }
    f5 = f3 * paramFloat1;
    f4 *= paramFloat2;
    RectF localRectF = new android/graphics/RectF;
    f3 = f1 + paramFloat1;
    float f7 = f2 + paramFloat2;
    localRectF.<init>(f1, f2, f3, f7);
    f1 = 0.0F;
    Object localObject = null;
    boolean bool3 = f5 < 0.0F;
    int k;
    if (bool3)
    {
      f1 = 0.0F;
      localObject = null;
      bool3 = f4 < 0.0F;
      if (bool3)
      {
        localObject = this.pdfView.cacheManager;
        int n = this.cacheOrder;
        bool3 = ((CacheManager)localObject).upPartIfContained(paramInt1, paramInt2, f5, f4, localRectF, n);
        if (!bool3)
        {
          localObject = this.pdfView.renderingHandler;
          n = 0;
          f7 = 0.0F;
          int i1 = this.cacheOrder;
          boolean bool4 = this.pdfView.isBestQuality();
          PDFView localPDFView = this.pdfView;
          boolean bool5 = localPDFView.isAnnotationRendering();
          ((RenderingHandler)localObject).addRenderingTask(paramInt1, paramInt2, f5, f4, localRectF, false, i1, bool4, bool5);
        }
        k = this.cacheOrder + 1;
        this.cacheOrder = k;
        k = 1;
        f1 = Float.MIN_VALUE;
      }
    }
    for (;;)
    {
      return k;
      int m = 0;
      f1 = 0.0F;
      localObject = null;
    }
  }
  
  private int loadRelative(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    Object localObject = this.pdfView;
    boolean bool1 = ((PDFView)localObject).isSwipeVertical();
    float f1;
    float f2;
    int i1;
    float f3;
    int j;
    PagesLoader.Holder localHolder;
    if (bool1)
    {
      f1 = this.rowHeight;
      f2 = paramInt1;
      f1 *= f2;
      i1 = 1065353216;
      f2 = 1.0F + f1;
      localObject = this.pdfView;
      f3 = ((PDFView)localObject).getCurrentYOffset();
      if (paramBoolean)
      {
        localObject = this.pdfView;
        j = ((PDFView)localObject).getHeight();
        f1 = j;
        f1 = f3 - f1 - f2;
        localHolder = getPageAndCoordsByOffset(f1, false);
        j = localHolder.page;
        i1 = documentPage(j);
        if (i1 >= 0) {
          break label211;
        }
      }
    }
    label211:
    label352:
    label644:
    label653:
    label658:
    for (;;)
    {
      return i;
      j = 0;
      localObject = null;
      f1 = 0.0F;
      break;
      f1 = this.colWidth;
      f2 = paramInt1 * f1;
      localObject = this.pdfView;
      f3 = ((PDFView)localObject).getCurrentXOffset();
      if (paramBoolean)
      {
        localObject = this.pdfView;
        j = ((PDFView)localObject).getWidth();
      }
      for (;;)
      {
        f1 = j;
        f1 = f3 - f1 - f2;
        break;
        j = 0;
        localObject = null;
        f1 = 0.0F;
      }
      j = localHolder.page;
      loadThumbnail(j, i1);
      localObject = this.pdfView;
      boolean bool2 = ((PDFView)localObject).isSwipeVertical();
      int i2;
      int i3;
      int i4;
      int i5;
      float f4;
      float f5;
      int m;
      if (bool2)
      {
        f1 = this.xOffset;
        f3 = this.colWidth;
        i2 = MathUtils.min(MathUtils.floor(f1 / f3) + -1, 0);
        f1 = this.xOffset;
        PDFView localPDFView1 = this.pdfView;
        f3 = localPDFView1.getWidth();
        f1 += f3;
        f3 = this.colWidth;
        f1 /= f3;
        i3 = MathUtils.ceil(f1) + 1;
        localObject = (Integer)this.colsRows.first;
        int k = ((Integer)localObject).intValue();
        i4 = MathUtils.max(i3, k);
        i5 = 0;
        if (i2 <= i4)
        {
          i = localHolder.page;
          i3 = localHolder.row;
          f4 = this.pageRelativePartWidth;
          f5 = this.pageRelativePartHeight;
          localObject = this;
          m = loadCell(i, i1, i3, i2, f4, f5);
          if (m == 0) {
            break label653;
          }
        }
      }
      for (i = i5 + 1;; i = i5)
      {
        if (i >= paramInt2) {
          break label658;
        }
        i2 += 1;
        i5 = i;
        break label352;
        boolean bool3;
        for (m = i5;; bool3 = i5)
        {
          i = m;
          break;
          f1 = this.yOffset;
          f3 = this.rowHeight;
          i3 = MathUtils.min(MathUtils.floor(f1 / f3) + -1, 0);
          f1 = this.yOffset;
          PDFView localPDFView2 = this.pdfView;
          float f6 = localPDFView2.getHeight();
          f1 += f6;
          f6 = this.rowHeight;
          f1 /= f6;
          i2 = MathUtils.ceil(f1) + 1;
          localObject = (Integer)this.colsRows.second;
          int n = ((Integer)localObject).intValue();
          i4 = MathUtils.max(i2, n);
          i5 = 0;
          if (i3 <= i4)
          {
            i = localHolder.page;
            i2 = localHolder.col;
            f4 = this.pageRelativePartWidth;
            f5 = this.pageRelativePartHeight;
            localObject = this;
            bool3 = loadCell(i, i1, i3, i2, f4, f5);
            if (bool3) {}
            for (i = i5 + 1;; i = i5)
            {
              if (i >= paramInt2) {
                break label644;
              }
              i3 += 1;
              i5 = i;
              break;
            }
            break;
          }
        }
      }
    }
  }
  
  private void loadThumbnail(int paramInt1, int paramInt2)
  {
    Object localObject = this.pdfView.cacheManager;
    float f1 = this.thumbnailWidth;
    float f2 = this.thumbnailHeight;
    RectF localRectF = this.thumbnailRect;
    boolean bool1 = ((CacheManager)localObject).containsThumbnail(paramInt1, paramInt2, f1, f2, localRectF);
    if (!bool1)
    {
      localObject = this.pdfView.renderingHandler;
      f1 = this.thumbnailWidth;
      f2 = this.thumbnailHeight;
      localRectF = this.thumbnailRect;
      boolean bool2 = true;
      boolean bool3 = this.pdfView.isBestQuality();
      PDFView localPDFView = this.pdfView;
      boolean bool4 = localPDFView.isAnnotationRendering();
      ((RenderingHandler)localObject).addRenderingTask(paramInt1, paramInt2, f1, f2, localRectF, bool2, 0, bool3, bool4);
    }
  }
  
  public void loadPages()
  {
    int i = 1;
    float f1 = 1.0F;
    int j = 0;
    Object localObject = this.pdfView;
    float f2 = this.pdfView.getOptimalPageHeight();
    float f3 = ((PDFView)localObject).toCurrentScale(f2);
    this.scaledHeight = f3;
    localObject = this.pdfView;
    f2 = this.pdfView.getOptimalPageWidth();
    f3 = ((PDFView)localObject).toCurrentScale(f2);
    this.scaledWidth = f3;
    f3 = this.pdfView.getOptimalPageWidth();
    f2 = Constants.THUMBNAIL_RATIO;
    int k = (int)(f3 * f2);
    this.thumbnailWidth = k;
    f3 = this.pdfView.getOptimalPageHeight();
    f2 = Constants.THUMBNAIL_RATIO;
    k = (int)(f3 * f2);
    this.thumbnailHeight = k;
    localObject = getPageColsRows();
    this.colsRows = ((Pair)localObject);
    f3 = -MathUtils.max(this.pdfView.getCurrentXOffset(), 0.0F);
    this.xOffset = f3;
    f3 = -MathUtils.max(this.pdfView.getCurrentYOffset(), 0.0F);
    this.yOffset = f3;
    f2 = this.scaledHeight;
    f3 = ((Integer)this.colsRows.second).intValue();
    f3 = f2 / f3;
    this.rowHeight = f3;
    f2 = this.scaledWidth;
    f3 = ((Integer)this.colsRows.first).intValue();
    f3 = f2 / f3;
    this.colWidth = f3;
    f3 = ((Integer)this.colsRows.first).intValue();
    f3 = f1 / f3;
    this.pageRelativePartWidth = f3;
    f3 = ((Integer)this.colsRows.second).intValue();
    f3 = f1 / f3;
    this.pageRelativePartHeight = f3;
    f3 = Constants.PART_SIZE;
    f2 = this.pageRelativePartWidth;
    f3 /= f2;
    this.partRenderWidth = f3;
    f3 = Constants.PART_SIZE;
    f2 = this.pageRelativePartHeight;
    f3 /= f2;
    this.partRenderHeight = f3;
    this.cacheOrder = i;
    localObject = this.pdfView;
    f2 = this.pdfView.getSpacingPx();
    f3 = ((PDFView)localObject).toCurrentScale(f2);
    this.scaledSpacingPx = f3;
    f3 = this.scaledSpacingPx;
    f2 = this.scaledSpacingPx;
    int m = this.pdfView.getPageCount();
    float f4 = m;
    f2 /= f4;
    f3 -= f2;
    this.scaledSpacingPx = f3;
    k = loadVisible();
    PDFView.ScrollDir localScrollDir1 = this.pdfView.getScrollDir();
    PDFView.ScrollDir localScrollDir2 = PDFView.ScrollDir.END;
    boolean bool = localScrollDir1.equals(localScrollDir2);
    if (bool)
    {
      j = k;
      k = 0;
      localObject = null;
      f3 = 0.0F;
      for (;;)
      {
        n = Constants.PRELOAD_COUNT;
        if (k >= n) {
          break;
        }
        n = Constants.Cache.CACHE_SIZE;
        if (j >= n) {
          break;
        }
        n = loadRelative(k, j, i);
        j += n;
        k += 1;
      }
    }
    int n = k;
    k = 0;
    localObject = null;
    f3 = 0.0F;
    for (;;)
    {
      m = -Constants.PRELOAD_COUNT;
      if (k <= m) {
        break;
      }
      m = Constants.Cache.CACHE_SIZE;
      if (n >= m) {
        break;
      }
      m = loadRelative(k, n, false);
      n += m;
      k += -1;
    }
  }
  
  public int loadVisible()
  {
    boolean bool1 = true;
    int k = 1065353216;
    float f1 = 1.0F;
    Object localObject = this.pdfView;
    boolean bool2 = ((PDFView)localObject).isSwipeVertical();
    float f2;
    PagesLoader.Holder localHolder1;
    PDFView localPDFView;
    float f3;
    PagesLoader.Holder localHolder2;
    int m;
    int i;
    int i1;
    if (bool2)
    {
      f2 = this.pdfView.getCurrentYOffset();
      localHolder1 = getPageAndCoordsByOffset(f2, false);
      localObject = this.pdfView;
      f2 = ((PDFView)localObject).getCurrentYOffset();
      localPDFView = this.pdfView;
      f3 = localPDFView.getHeight();
      f2 = f2 - f3 + f1;
      localHolder2 = getPageAndCoordsByOffset(f2, bool1);
      m = localHolder1.page;
      int n = localHolder2.page;
      if (m == n)
      {
        m = localHolder2.row;
        n = localHolder1.row;
      }
      for (m = m - n + 1;; m = localHolder2.row + 1 + k)
      {
        k = 0;
        f1 = 0.0F;
        n = 0;
        localPDFView = null;
        f3 = 0.0F;
        while (k < m)
        {
          i = Constants.Cache.CACHE_SIZE;
          if (n >= i) {
            break;
          }
          i = Constants.Cache.CACHE_SIZE - n;
          i = loadRelative(k, i, false) + n;
          k += 1;
          n = i;
        }
        localObject = (Integer)this.colsRows.second;
        m = ((Integer)localObject).intValue();
        i1 = localHolder1.row;
        m -= i1;
        i1 = 0 + m;
        m = localHolder1.page + 1;
        k = i1;
        for (i1 = m;; i1 = m)
        {
          m = localHolder2.page;
          if (i1 >= m) {
            break;
          }
          localObject = (Integer)this.colsRows.second;
          m = ((Integer)localObject).intValue();
          k += m;
          m = i1 + 1;
        }
      }
    }
    for (localObject = localHolder1;; localObject = localHolder1)
    {
      k = ((PagesLoader.Holder)localObject).page + -1;
      k = documentPage(k);
      if (k >= 0)
      {
        int i2 = ((PagesLoader.Holder)localObject).page + -1;
        loadThumbnail(i2, k);
      }
      k = ((PagesLoader.Holder)localObject).page + 1;
      k = documentPage(k);
      if (k >= 0)
      {
        m = ((PagesLoader.Holder)localObject).page + 1;
        loadThumbnail(m, k);
      }
      return i1;
      f2 = this.pdfView.getCurrentXOffset();
      localHolder1 = getPageAndCoordsByOffset(f2, false);
      localObject = this.pdfView;
      f2 = ((PDFView)localObject).getCurrentXOffset();
      localPDFView = this.pdfView;
      f3 = localPDFView.getWidth();
      f2 = f2 - f3 + f1;
      localHolder2 = getPageAndCoordsByOffset(f2, i);
      m = localHolder1.page;
      i1 = localHolder2.page;
      if (m == i1)
      {
        m = localHolder2.col;
        i1 = localHolder1.col;
      }
      for (m = m - i1 + 1;; m = localHolder2.col + 1 + k)
      {
        k = 0;
        f1 = 0.0F;
        i1 = 0;
        localPDFView = null;
        f3 = 0.0F;
        while (k < m)
        {
          int j = Constants.Cache.CACHE_SIZE;
          if (i1 >= j) {
            break;
          }
          j = Constants.Cache.CACHE_SIZE - i1;
          j = loadRelative(k, j, false) + i1;
          k += 1;
          i1 = j;
        }
        localObject = (Integer)this.colsRows.first;
        m = ((Integer)localObject).intValue();
        i1 = localHolder1.col;
        m -= i1;
        i1 = 0 + m;
        m = localHolder1.page + 1;
        k = i1;
        for (i1 = m;; i1 = m)
        {
          m = localHolder2.page;
          if (i1 >= m) {
            break;
          }
          localObject = (Integer)this.colsRows.first;
          m = ((Integer)localObject).intValue();
          k += m;
          m = i1 + 1;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\PagesLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */