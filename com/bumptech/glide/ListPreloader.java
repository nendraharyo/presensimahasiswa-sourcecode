package com.bumptech.glide;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.bumptech.glide.request.target.Target;
import java.util.List;

public class ListPreloader
  implements AbsListView.OnScrollListener
{
  private boolean isIncreasing = true;
  private int lastEnd;
  private int lastFirstVisible = -1;
  private int lastStart;
  private final int maxPreload;
  private final ListPreloader.PreloadSizeProvider preloadDimensionProvider;
  private final ListPreloader.PreloadModelProvider preloadModelProvider;
  private final ListPreloader.PreloadTargetQueue preloadTargetQueue;
  private final RequestManager requestManager;
  private int totalItemCount;
  
  public ListPreloader(RequestManager paramRequestManager, ListPreloader.PreloadModelProvider paramPreloadModelProvider, ListPreloader.PreloadSizeProvider paramPreloadSizeProvider, int paramInt)
  {
    this.requestManager = paramRequestManager;
    this.preloadModelProvider = paramPreloadModelProvider;
    this.preloadDimensionProvider = paramPreloadSizeProvider;
    this.maxPreload = paramInt;
    ListPreloader.PreloadTargetQueue localPreloadTargetQueue = new com/bumptech/glide/ListPreloader$PreloadTargetQueue;
    int i = paramInt + 1;
    localPreloadTargetQueue.<init>(i);
    this.preloadTargetQueue = localPreloadTargetQueue;
  }
  
  private void cancelAll()
  {
    int i = 0;
    for (;;)
    {
      int j = this.maxPreload;
      if (i >= j) {
        break;
      }
      RequestManager localRequestManager = this.requestManager;
      ListPreloader.PreloadTarget localPreloadTarget = this.preloadTargetQueue.next(0, 0);
      localRequestManager.clear(localPreloadTarget);
      i += 1;
    }
  }
  
  private void preload(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    int i;
    if (paramInt1 < paramInt2)
    {
      i = Math.max(this.lastEnd, paramInt1);
      j = paramInt2;
    }
    int k;
    List localList;
    for (;;)
    {
      k = Math.min(this.totalItemCount, j);
      j = this.totalItemCount;
      i = Math.max(0, i);
      i = Math.min(j, i);
      if (paramInt1 >= paramInt2) {
        break;
      }
      j = i;
      while (j < k)
      {
        localList = this.preloadModelProvider.getPreloadItems(j);
        bool = true;
        preloadAdapterPosition(localList, j, bool);
        j += 1;
      }
      j = Math.min(this.lastStart, paramInt1);
      i = paramInt2;
    }
    int j = k + -1;
    while (j >= i)
    {
      localList = this.preloadModelProvider.getPreloadItems(j);
      preloadAdapterPosition(localList, j, false);
      j += -1;
    }
    this.lastStart = i;
    this.lastEnd = k;
  }
  
  private void preload(int paramInt, boolean paramBoolean)
  {
    boolean bool = this.isIncreasing;
    if (bool != paramBoolean)
    {
      this.isIncreasing = paramBoolean;
      cancelAll();
    }
    if (paramBoolean) {}
    for (int i = this.maxPreload;; i = -this.maxPreload)
    {
      i += paramInt;
      preload(paramInt, i);
      return;
    }
  }
  
  private void preloadAdapterPosition(List paramList, int paramInt, boolean paramBoolean)
  {
    int i = paramList.size();
    if (paramBoolean)
    {
      j = 0;
      while (j < i)
      {
        Object localObject1 = paramList.get(j);
        preloadItem(localObject1, paramInt, j);
        j += 1;
      }
    }
    int j = i + -1;
    while (j >= 0)
    {
      Object localObject2 = paramList.get(j);
      preloadItem(localObject2, paramInt, j);
      j += -1;
    }
  }
  
  private void preloadItem(Object paramObject, int paramInt1, int paramInt2)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return;
      Object localObject = this.preloadDimensionProvider.getPreloadSize(paramObject, paramInt1, paramInt2);
      if (localObject != null)
      {
        RequestBuilder localRequestBuilder = this.preloadModelProvider.getPreloadRequestBuilder(paramObject);
        if (localRequestBuilder != null)
        {
          ListPreloader.PreloadTargetQueue localPreloadTargetQueue = this.preloadTargetQueue;
          int i = localObject[0];
          int j = 1;
          int k = localObject[j];
          localObject = localPreloadTargetQueue.next(i, k);
          localRequestBuilder.into((Target)localObject);
        }
      }
    }
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.totalItemCount = paramInt3;
    int i = this.lastFirstVisible;
    if (paramInt1 > i)
    {
      i = paramInt1 + paramInt2;
      boolean bool = true;
      preload(i, bool);
    }
    for (;;)
    {
      this.lastFirstVisible = paramInt1;
      return;
      i = this.lastFirstVisible;
      if (paramInt1 < i)
      {
        i = 0;
        preload(paramInt1, false);
      }
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\ListPreloader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */