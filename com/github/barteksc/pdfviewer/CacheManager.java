package com.github.barteksc.pdfviewer;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.github.barteksc.pdfviewer.model.PagePart;
import com.github.barteksc.pdfviewer.util.Constants.Cache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

class CacheManager
{
  private final PriorityQueue activeCache;
  private final CacheManager.PagePartComparator comparator;
  private final Object passiveActiveLock;
  private final PriorityQueue passiveCache;
  private final List thumbnails;
  
  public CacheManager()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.passiveActiveLock = localObject;
    localObject = new com/github/barteksc/pdfviewer/CacheManager$PagePartComparator;
    ((CacheManager.PagePartComparator)localObject).<init>(this);
    this.comparator = ((CacheManager.PagePartComparator)localObject);
    localObject = new java/util/PriorityQueue;
    int i = Constants.Cache.CACHE_SIZE;
    CacheManager.PagePartComparator localPagePartComparator = this.comparator;
    ((PriorityQueue)localObject).<init>(i, localPagePartComparator);
    this.activeCache = ((PriorityQueue)localObject);
    localObject = new java/util/PriorityQueue;
    i = Constants.Cache.CACHE_SIZE;
    localPagePartComparator = this.comparator;
    ((PriorityQueue)localObject).<init>(i, localPagePartComparator);
    this.passiveCache = ((PriorityQueue)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.thumbnails = ((List)localObject);
  }
  
  private static PagePart find(PriorityQueue paramPriorityQueue, PagePart paramPagePart)
  {
    Iterator localIterator = paramPriorityQueue.iterator();
    boolean bool1;
    PagePart localPagePart;
    boolean bool2;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localPagePart = (PagePart)localIterator.next();
      bool2 = localPagePart.equals(paramPagePart);
    } while (!bool2);
    for (;;)
    {
      return localPagePart;
      bool1 = false;
      localPagePart = null;
    }
  }
  
  private void makeAFreeSpace()
  {
    PriorityQueue localPriorityQueue;
    int k;
    synchronized (this.passiveActiveLock)
    {
      Object localObject2 = this.activeCache;
      int i = ((PriorityQueue)localObject2).size();
      localPriorityQueue = this.passiveCache;
      k = localPriorityQueue.size();
      i += k;
      k = Constants.Cache.CACHE_SIZE;
      if (i >= k)
      {
        localObject2 = this.passiveCache;
        boolean bool1 = ((PriorityQueue)localObject2).isEmpty();
        if (!bool1)
        {
          localObject2 = this.passiveCache;
          localObject2 = ((PriorityQueue)localObject2).poll();
          localObject2 = (PagePart)localObject2;
          localObject2 = ((PagePart)localObject2).getRenderedBitmap();
          ((Bitmap)localObject2).recycle();
        }
      }
    }
    for (;;)
    {
      Object localObject4 = this.activeCache;
      int j = ((PriorityQueue)localObject4).size();
      localPriorityQueue = this.passiveCache;
      k = localPriorityQueue.size();
      j += k;
      k = Constants.Cache.CACHE_SIZE;
      if (j < k) {
        break;
      }
      localObject4 = this.activeCache;
      boolean bool2 = ((PriorityQueue)localObject4).isEmpty();
      if (bool2) {
        break;
      }
      localObject4 = this.activeCache;
      localObject4 = ((PriorityQueue)localObject4).poll();
      localObject4 = (PagePart)localObject4;
      localObject4 = ((PagePart)localObject4).getRenderedBitmap();
      ((Bitmap)localObject4).recycle();
    }
  }
  
  public void cachePart(PagePart paramPagePart)
  {
    synchronized (this.passiveActiveLock)
    {
      makeAFreeSpace();
      PriorityQueue localPriorityQueue = this.activeCache;
      localPriorityQueue.offer(paramPagePart);
      return;
    }
  }
  
  public void cacheThumbnail(PagePart paramPagePart)
  {
    synchronized (this.thumbnails)
    {
      Object localObject1 = this.thumbnails;
      int i = ((List)localObject1).size();
      int j = Constants.Cache.THUMBNAILS_CACHE_SIZE;
      if (i >= j)
      {
        localObject1 = this.thumbnails;
        j = 0;
        localObject1 = ((List)localObject1).remove(0);
        localObject1 = (PagePart)localObject1;
        localObject1 = ((PagePart)localObject1).getRenderedBitmap();
        ((Bitmap)localObject1).recycle();
      }
      localObject1 = this.thumbnails;
      ((List)localObject1).add(paramPagePart);
      return;
    }
  }
  
  public boolean containsThumbnail(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, RectF paramRectF)
  {
    boolean bool1 = true;
    PagePart localPagePart = new com/github/barteksc/pdfviewer/model/PagePart;
    Iterator localIterator = null;
    int i = paramInt1;
    localPagePart.<init>(paramInt1, paramInt2, null, paramFloat1, paramFloat2, paramRectF, bool1, 0);
    synchronized (this.thumbnails)
    {
      Object localObject2 = this.thumbnails;
      localIterator = ((List)localObject2).iterator();
      boolean bool2;
      do
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = localIterator.next();
        localObject2 = (PagePart)localObject2;
        bool2 = ((PagePart)localObject2).equals(localPagePart);
      } while (!bool2);
      return bool1;
      bool1 = false;
    }
  }
  
  public List getPageParts()
  {
    synchronized (this.passiveActiveLock)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      PriorityQueue localPriorityQueue = this.passiveCache;
      localArrayList.<init>(localPriorityQueue);
      localPriorityQueue = this.activeCache;
      localArrayList.addAll(localPriorityQueue);
      return localArrayList;
    }
  }
  
  public List getThumbnails()
  {
    synchronized (this.thumbnails)
    {
      List localList2 = this.thumbnails;
      return localList2;
    }
  }
  
  public void makeANewSet()
  {
    synchronized (this.passiveActiveLock)
    {
      PriorityQueue localPriorityQueue1 = this.passiveCache;
      PriorityQueue localPriorityQueue2 = this.activeCache;
      localPriorityQueue1.addAll(localPriorityQueue2);
      localPriorityQueue1 = this.activeCache;
      localPriorityQueue1.clear();
      return;
    }
  }
  
  public void recycle()
  {
    boolean bool;
    synchronized (this.passiveActiveLock)
    {
      Object localObject2 = this.passiveCache;
      localIterator = ((PriorityQueue)localObject2).iterator();
      bool = localIterator.hasNext();
      if (bool)
      {
        localObject2 = localIterator.next();
        localObject2 = (PagePart)localObject2;
        localObject2 = ((PagePart)localObject2).getRenderedBitmap();
        ((Bitmap)localObject2).recycle();
      }
    }
    Object localObject4 = this.passiveCache;
    ((PriorityQueue)localObject4).clear();
    localObject4 = this.activeCache;
    Iterator localIterator = ((PriorityQueue)localObject4).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject4 = localIterator.next();
      localObject4 = (PagePart)localObject4;
      localObject4 = ((PagePart)localObject4).getRenderedBitmap();
      ((Bitmap)localObject4).recycle();
    }
    localObject4 = this.activeCache;
    ((PriorityQueue)localObject4).clear();
    synchronized (this.thumbnails)
    {
      localObject4 = this.thumbnails;
      localIterator = ((List)localObject4).iterator();
      bool = localIterator.hasNext();
      if (bool)
      {
        localObject4 = localIterator.next();
        localObject4 = (PagePart)localObject4;
        localObject4 = ((PagePart)localObject4).getRenderedBitmap();
        ((Bitmap)localObject4).recycle();
      }
    }
    List localList = this.thumbnails;
    localList.clear();
  }
  
  public boolean upPartIfContained(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, RectF paramRectF, int paramInt3)
  {
    Object localObject1 = new com/github/barteksc/pdfviewer/model/PagePart;
    ((PagePart)localObject1).<init>(paramInt1, paramInt2, null, paramFloat1, paramFloat2, paramRectF, false, 0);
    for (;;)
    {
      synchronized (this.passiveActiveLock)
      {
        Object localObject5 = this.passiveCache;
        localObject5 = find((PriorityQueue)localObject5, (PagePart)localObject1);
        if (localObject5 != null)
        {
          localObject1 = this.passiveCache;
          ((PriorityQueue)localObject1).remove(localObject5);
          ((PagePart)localObject5).setCacheOrder(paramInt3);
          localObject1 = this.activeCache;
          ((PriorityQueue)localObject1).offer(localObject5);
          bool = true;
          return bool;
        }
        localObject5 = this.activeCache;
        localObject1 = find((PriorityQueue)localObject5, (PagePart)localObject1);
        if (localObject1 != null) {
          bool = true;
        }
      }
      boolean bool = false;
      Object localObject3 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\CacheManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */