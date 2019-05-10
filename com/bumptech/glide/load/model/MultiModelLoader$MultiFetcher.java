package com.bumptech.glide.load.model;

import android.support.v4.h.k.a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MultiModelLoader$MultiFetcher
  implements DataFetcher, DataFetcher.DataCallback
{
  private DataFetcher.DataCallback callback;
  private int currentIndex;
  private List exceptions;
  private final List fetchers;
  private Priority priority;
  private final k.a throwableListPool;
  
  MultiModelLoader$MultiFetcher(List paramList, k.a parama)
  {
    this.throwableListPool = parama;
    Preconditions.checkNotEmpty(paramList);
    this.fetchers = paramList;
    this.currentIndex = 0;
  }
  
  private void startNextOrFail()
  {
    int i = this.currentIndex;
    Object localObject1 = this.fetchers;
    int j = ((List)localObject1).size() + -1;
    Object localObject2;
    if (i < j)
    {
      i = this.currentIndex + 1;
      this.currentIndex = i;
      localObject2 = this.priority;
      localObject1 = this.callback;
      loadData((Priority)localObject2, (DataFetcher.DataCallback)localObject1);
    }
    for (;;)
    {
      return;
      Preconditions.checkNotNull(this.exceptions);
      localObject2 = this.callback;
      localObject1 = new com/bumptech/glide/load/engine/GlideException;
      String str = "Fetch failed";
      ArrayList localArrayList = new java/util/ArrayList;
      List localList = this.exceptions;
      localArrayList.<init>(localList);
      ((GlideException)localObject1).<init>(str, localArrayList);
      ((DataFetcher.DataCallback)localObject2).onLoadFailed((Exception)localObject1);
    }
  }
  
  public void cancel()
  {
    Object localObject = this.fetchers;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataFetcher)localIterator.next();
      ((DataFetcher)localObject).cancel();
    }
  }
  
  public void cleanup()
  {
    Object localObject1 = this.exceptions;
    if (localObject1 != null)
    {
      localObject1 = this.throwableListPool;
      localObject2 = this.exceptions;
      ((k.a)localObject1).release(localObject2);
    }
    boolean bool = false;
    this.exceptions = null;
    localObject1 = this.fetchers;
    Object localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (DataFetcher)((Iterator)localObject2).next();
      ((DataFetcher)localObject1).cleanup();
    }
  }
  
  public Class getDataClass()
  {
    return ((DataFetcher)this.fetchers.get(0)).getDataClass();
  }
  
  public DataSource getDataSource()
  {
    return ((DataFetcher)this.fetchers.get(0)).getDataSource();
  }
  
  public void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback)
  {
    this.priority = paramPriority;
    this.callback = paramDataCallback;
    List localList = (List)this.throwableListPool.acquire();
    this.exceptions = localList;
    localList = this.fetchers;
    int i = this.currentIndex;
    ((DataFetcher)localList.get(i)).loadData(paramPriority, this);
  }
  
  public void onDataReady(Object paramObject)
  {
    if (paramObject != null)
    {
      DataFetcher.DataCallback localDataCallback = this.callback;
      localDataCallback.onDataReady(paramObject);
    }
    for (;;)
    {
      return;
      startNextOrFail();
    }
  }
  
  public void onLoadFailed(Exception paramException)
  {
    ((List)Preconditions.checkNotNull(this.exceptions)).add(paramException);
    startNextOrFail();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\MultiModelLoader$MultiFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */