package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import java.io.File;
import java.util.List;

class DataCacheGenerator
  implements DataFetcher.DataCallback, DataFetcherGenerator
{
  private File cacheFile;
  private final List cacheKeys;
  private final DataFetcherGenerator.FetcherReadyCallback cb;
  private final DecodeHelper helper;
  private volatile ModelLoader.LoadData loadData;
  private int modelLoaderIndex;
  private List modelLoaders;
  private int sourceIdIndex = -1;
  private Key sourceKey;
  
  DataCacheGenerator(DecodeHelper paramDecodeHelper, DataFetcherGenerator.FetcherReadyCallback paramFetcherReadyCallback)
  {
    this(localList, paramDecodeHelper, paramFetcherReadyCallback);
  }
  
  DataCacheGenerator(List paramList, DecodeHelper paramDecodeHelper, DataFetcherGenerator.FetcherReadyCallback paramFetcherReadyCallback)
  {
    this.cacheKeys = paramList;
    this.helper = paramDecodeHelper;
    this.cb = paramFetcherReadyCallback;
  }
  
  private boolean hasNextModelLoader()
  {
    int i = this.modelLoaderIndex;
    List localList = this.modelLoaders;
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
  
  public void onDataReady(Object paramObject)
  {
    DataFetcherGenerator.FetcherReadyCallback localFetcherReadyCallback = this.cb;
    Key localKey1 = this.sourceKey;
    DataFetcher localDataFetcher = this.loadData.fetcher;
    DataSource localDataSource = DataSource.DATA_DISK_CACHE;
    Key localKey2 = this.sourceKey;
    localFetcherReadyCallback.onDataFetcherReady(localKey1, paramObject, localDataFetcher, localDataSource, localKey2);
  }
  
  public void onLoadFailed(Exception paramException)
  {
    DataFetcherGenerator.FetcherReadyCallback localFetcherReadyCallback = this.cb;
    Key localKey = this.sourceKey;
    DataFetcher localDataFetcher = this.loadData.fetcher;
    DataSource localDataSource = DataSource.DATA_DISK_CACHE;
    localFetcherReadyCallback.onDataFetcherFailed(localKey, paramException, localDataFetcher, localDataSource);
  }
  
  public boolean startNext()
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    DataFetcher localDataFetcher = null;
    Object localObject1 = this.modelLoaders;
    int i;
    if (localObject1 != null)
    {
      boolean bool2 = hasNextModelLoader();
      if (bool2) {}
    }
    else
    {
      i = this.sourceIdIndex + 1;
      this.sourceIdIndex = i;
      i = this.sourceIdIndex;
      localObject2 = this.cacheKeys;
      j = ((List)localObject2).size();
      if (i < j) {}
    }
    float f2;
    label213:
    boolean bool3;
    do
    {
      return bool1;
      localObject1 = this.cacheKeys;
      j = this.sourceIdIndex;
      localObject1 = (Key)((List)localObject1).get(j);
      localObject2 = new com/bumptech/glide/load/engine/DataCacheKey;
      localObject3 = this.helper.getSignature();
      ((DataCacheKey)localObject2).<init>((Key)localObject1, (Key)localObject3);
      localObject3 = this.helper.getDiskCache();
      localObject2 = ((DiskCache)localObject3).get((Key)localObject2);
      this.cacheFile = ((File)localObject2);
      localObject2 = this.cacheFile;
      if (localObject2 == null) {
        break;
      }
      this.sourceKey = ((Key)localObject1);
      localObject1 = this.helper;
      localObject2 = this.cacheFile;
      localObject1 = ((DecodeHelper)localObject1).getModelLoaders((File)localObject2);
      this.modelLoaders = ((List)localObject1);
      this.modelLoaderIndex = 0;
      break;
      i = 0;
      f2 = 0.0F;
      localObject1 = null;
      this.loadData = null;
      if (bool1) {
        break label415;
      }
      bool3 = hasNextModelLoader();
    } while (!bool3);
    localObject1 = this.modelLoaders;
    int j = this.modelLoaderIndex;
    int k = j + 1;
    this.modelLoaderIndex = k;
    localObject1 = (ModelLoader)((List)localObject1).get(j);
    Object localObject2 = this.cacheFile;
    Object localObject3 = this.helper;
    k = ((DecodeHelper)localObject3).getWidth();
    DecodeHelper localDecodeHelper = this.helper;
    int m = localDecodeHelper.getHeight();
    Options localOptions = this.helper.getOptions();
    localObject1 = ((ModelLoader)localObject1).buildLoadData(localObject2, k, m, localOptions);
    this.loadData = ((ModelLoader.LoadData)localObject1);
    localObject1 = this.loadData;
    if (localObject1 != null)
    {
      localObject1 = this.helper;
      localObject2 = this.loadData.fetcher.getDataClass();
      bool3 = ((DecodeHelper)localObject1).hasLoadPath((Class)localObject2);
      if (bool3)
      {
        bool3 = true;
        f2 = Float.MIN_VALUE;
        localDataFetcher = this.loadData.fetcher;
        localObject2 = this.helper.getPriority();
        localDataFetcher.loadData((Priority)localObject2, this);
      }
    }
    for (;;)
    {
      bool1 = bool3;
      f1 = f2;
      break label213;
      label415:
      break;
      bool3 = bool1;
      f2 = f1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DataCacheGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */