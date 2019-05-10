package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCache.Writer;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.util.LogTime;
import java.util.Collections;
import java.util.List;

class SourceGenerator
  implements DataFetcher.DataCallback, DataFetcherGenerator, DataFetcherGenerator.FetcherReadyCallback
{
  private static final String TAG = "SourceGenerator";
  private final DataFetcherGenerator.FetcherReadyCallback cb;
  private Object dataToCache;
  private final DecodeHelper helper;
  private volatile ModelLoader.LoadData loadData;
  private int loadDataListIndex;
  private DataCacheKey originalKey;
  private DataCacheGenerator sourceCacheGenerator;
  
  SourceGenerator(DecodeHelper paramDecodeHelper, DataFetcherGenerator.FetcherReadyCallback paramFetcherReadyCallback)
  {
    this.helper = paramDecodeHelper;
    this.cb = paramFetcherReadyCallback;
  }
  
  private void cacheData(Object paramObject)
  {
    long l = LogTime.getLogTime();
    try
    {
      Object localObject1 = this.helper;
      localObject1 = ((DecodeHelper)localObject1).getSourceEncoder(paramObject);
      Object localObject2 = new com/bumptech/glide/load/engine/DataCacheWriter;
      Object localObject3 = this.helper;
      localObject3 = ((DecodeHelper)localObject3).getOptions();
      ((DataCacheWriter)localObject2).<init>((Encoder)localObject1, paramObject, (Options)localObject3);
      localObject3 = new com/bumptech/glide/load/engine/DataCacheKey;
      Object localObject4 = this.loadData;
      localObject4 = ((ModelLoader.LoadData)localObject4).sourceKey;
      Object localObject5 = this.helper;
      localObject5 = ((DecodeHelper)localObject5).getSignature();
      ((DataCacheKey)localObject3).<init>((Key)localObject4, (Key)localObject5);
      this.originalKey = ((DataCacheKey)localObject3);
      localObject3 = this.helper;
      localObject3 = ((DecodeHelper)localObject3).getDiskCache();
      localObject4 = this.originalKey;
      ((DiskCache)localObject3).put((Key)localObject4, (DiskCache.Writer)localObject2);
      localObject2 = "SourceGenerator";
      int i = 2;
      boolean bool = Log.isLoggable((String)localObject2, i);
      if (bool)
      {
        localObject2 = "SourceGenerator";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = "Finished encoding source to cache, key: ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject4 = this.originalKey;
        localObject3 = ((StringBuilder)localObject3).append(localObject4);
        localObject4 = ", data: ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).append(paramObject);
        localObject4 = ", encoder: ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject1 = ((StringBuilder)localObject3).append(localObject1);
        localObject3 = ", duration: ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        double d = LogTime.getElapsedMillis(l);
        localObject6 = ((StringBuilder)localObject1).append(d);
        localObject6 = ((StringBuilder)localObject6).toString();
        Log.v((String)localObject2, (String)localObject6);
      }
      this.loadData.fetcher.cleanup();
      Object localObject6 = new com/bumptech/glide/load/engine/DataCacheGenerator;
      List localList = Collections.singletonList(this.loadData.sourceKey);
      localObject1 = this.helper;
      ((DataCacheGenerator)localObject6).<init>(localList, (DecodeHelper)localObject1, this);
      this.sourceCacheGenerator = ((DataCacheGenerator)localObject6);
      return;
    }
    finally
    {
      this.loadData.fetcher.cleanup();
    }
  }
  
  private boolean hasNextModelLoader()
  {
    int i = this.loadDataListIndex;
    List localList = this.helper.getLoadData();
    int k = localList.size();
    if (i < k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public void cancel()
  {
    Object localObject = this.loadData;
    if (localObject != null)
    {
      localObject = ((ModelLoader.LoadData)localObject).fetcher;
      ((DataFetcher)localObject).cancel();
    }
  }
  
  public void onDataFetcherFailed(Key paramKey, Exception paramException, DataFetcher paramDataFetcher, DataSource paramDataSource)
  {
    DataFetcherGenerator.FetcherReadyCallback localFetcherReadyCallback = this.cb;
    DataSource localDataSource = this.loadData.fetcher.getDataSource();
    localFetcherReadyCallback.onDataFetcherFailed(paramKey, paramException, paramDataFetcher, localDataSource);
  }
  
  public void onDataFetcherReady(Key paramKey1, Object paramObject, DataFetcher paramDataFetcher, DataSource paramDataSource, Key paramKey2)
  {
    DataFetcherGenerator.FetcherReadyCallback localFetcherReadyCallback = this.cb;
    DataSource localDataSource = this.loadData.fetcher.getDataSource();
    localFetcherReadyCallback.onDataFetcherReady(paramKey1, paramObject, paramDataFetcher, localDataSource, paramKey1);
  }
  
  public void onDataReady(Object paramObject)
  {
    Object localObject1 = this.helper.getDiskCacheStrategy();
    Object localObject2;
    if (paramObject != null)
    {
      localObject2 = this.loadData.fetcher.getDataSource();
      boolean bool = ((DiskCacheStrategy)localObject1).isDataCacheable((DataSource)localObject2);
      if (bool)
      {
        this.dataToCache = paramObject;
        localObject1 = this.cb;
        ((DataFetcherGenerator.FetcherReadyCallback)localObject1).reschedule();
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.cb;
      localObject2 = this.loadData.sourceKey;
      DataFetcher localDataFetcher = this.loadData.fetcher;
      DataSource localDataSource = this.loadData.fetcher.getDataSource();
      DataCacheKey localDataCacheKey = this.originalKey;
      ((DataFetcherGenerator.FetcherReadyCallback)localObject1).onDataFetcherReady((Key)localObject2, paramObject, localDataFetcher, localDataSource, localDataCacheKey);
    }
  }
  
  public void onLoadFailed(Exception paramException)
  {
    DataFetcherGenerator.FetcherReadyCallback localFetcherReadyCallback = this.cb;
    DataCacheKey localDataCacheKey = this.originalKey;
    DataFetcher localDataFetcher = this.loadData.fetcher;
    DataSource localDataSource = this.loadData.fetcher.getDataSource();
    localFetcherReadyCallback.onDataFetcherFailed(localDataCacheKey, paramException, localDataFetcher, localDataSource);
  }
  
  public void reschedule()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public boolean startNext()
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    boolean bool2 = false;
    Priority localPriority = null;
    Object localObject1 = this.dataToCache;
    if (localObject1 != null)
    {
      localObject1 = this.dataToCache;
      this.dataToCache = null;
      cacheData(localObject1);
    }
    localObject1 = this.sourceCacheGenerator;
    if (localObject1 != null)
    {
      localObject1 = this.sourceCacheGenerator;
      bool3 = ((DataCacheGenerator)localObject1).startNext();
      if (!bool3) {}
    }
    for (boolean bool3 = bool1;; bool3 = bool2)
    {
      return bool3;
      this.sourceCacheGenerator = null;
      this.loadData = null;
      bool2 = false;
      localPriority = null;
      while (!bool2)
      {
        bool3 = hasNextModelLoader();
        if (!bool3) {
          break;
        }
        localObject1 = this.helper.getLoadData();
        int i = this.loadDataListIndex;
        int j = i + 1;
        this.loadDataListIndex = j;
        localObject1 = (ModelLoader.LoadData)((List)localObject1).get(i);
        this.loadData = ((ModelLoader.LoadData)localObject1);
        localObject1 = this.loadData;
        if (localObject1 != null)
        {
          localObject1 = this.helper.getDiskCacheStrategy();
          Object localObject2 = this.loadData.fetcher.getDataSource();
          bool3 = ((DiskCacheStrategy)localObject1).isDataCacheable((DataSource)localObject2);
          if (!bool3)
          {
            localObject1 = this.helper;
            localObject2 = this.loadData.fetcher.getDataClass();
            bool3 = ((DecodeHelper)localObject1).hasLoadPath((Class)localObject2);
            if (!bool3) {}
          }
          else
          {
            localObject1 = this.loadData.fetcher;
            localPriority = this.helper.getPriority();
            ((DataFetcher)localObject1).loadData(localPriority, this);
            bool2 = bool1;
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\SourceGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */