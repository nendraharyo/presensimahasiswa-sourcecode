package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import java.io.File;
import java.util.List;

class ResourceCacheGenerator
  implements DataFetcher.DataCallback, DataFetcherGenerator
{
  private File cacheFile;
  private final DataFetcherGenerator.FetcherReadyCallback cb;
  private ResourceCacheKey currentKey;
  private final DecodeHelper helper;
  private volatile ModelLoader.LoadData loadData;
  private int modelLoaderIndex;
  private List modelLoaders;
  private int resourceClassIndex = -1;
  private int sourceIdIndex;
  private Key sourceKey;
  
  ResourceCacheGenerator(DecodeHelper paramDecodeHelper, DataFetcherGenerator.FetcherReadyCallback paramFetcherReadyCallback)
  {
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
    Key localKey = this.sourceKey;
    DataFetcher localDataFetcher = this.loadData.fetcher;
    DataSource localDataSource = DataSource.RESOURCE_DISK_CACHE;
    ResourceCacheKey localResourceCacheKey = this.currentKey;
    localFetcherReadyCallback.onDataFetcherReady(localKey, paramObject, localDataFetcher, localDataSource, localResourceCacheKey);
  }
  
  public void onLoadFailed(Exception paramException)
  {
    DataFetcherGenerator.FetcherReadyCallback localFetcherReadyCallback = this.cb;
    ResourceCacheKey localResourceCacheKey = this.currentKey;
    DataFetcher localDataFetcher = this.loadData.fetcher;
    DataSource localDataSource = DataSource.RESOURCE_DISK_CACHE;
    localFetcherReadyCallback.onDataFetcherFailed(localResourceCacheKey, paramException, localDataFetcher, localDataSource);
  }
  
  public boolean startNext()
  {
    Object localObject1 = this.helper;
    List localList1 = ((DecodeHelper)localObject1).getCacheKeys();
    boolean bool1 = localList1.isEmpty();
    boolean bool3;
    Object localObject2;
    float f1;
    if (bool1)
    {
      bool3 = false;
      localObject2 = null;
      f1 = 0.0F;
    }
    int m;
    float f2;
    label409:
    int k;
    do
    {
      for (;;)
      {
        return bool3;
        localObject1 = this.helper;
        List localList2 = ((DecodeHelper)localObject1).getRegisteredResourceClasses();
        bool1 = localList2.isEmpty();
        if (bool1)
        {
          localObject1 = File.class;
          localObject2 = this.helper.getTranscodeClass();
          bool1 = localObject1.equals(localObject2);
          if (bool1)
          {
            bool3 = false;
            localObject2 = null;
            f1 = 0.0F;
            continue;
          }
        }
        do
        {
          this.resourceClassIndex = 0;
          do
          {
            int i = this.sourceIdIndex;
            localObject3 = (Key)localList1.get(i);
            i = this.resourceClassIndex;
            Class localClass = (Class)localList2.get(i);
            Transformation localTransformation = this.helper.getTransformation(localClass);
            localObject1 = new com/bumptech/glide/load/engine/ResourceCacheKey;
            localObject2 = this.helper.getArrayPool();
            localObject4 = this.helper.getSignature();
            localDecodeHelper = this.helper;
            n = localDecodeHelper.getWidth();
            localObject5 = this.helper;
            int i1 = ((DecodeHelper)localObject5).getHeight();
            Options localOptions = this.helper.getOptions();
            ((ResourceCacheKey)localObject1).<init>((ArrayPool)localObject2, (Key)localObject3, (Key)localObject4, n, i1, localTransformation, localClass, localOptions);
            this.currentKey = ((ResourceCacheKey)localObject1);
            localObject1 = this.helper.getDiskCache();
            localObject2 = this.currentKey;
            localObject1 = ((DiskCache)localObject1).get((Key)localObject2);
            this.cacheFile = ((File)localObject1);
            localObject1 = this.cacheFile;
            if (localObject1 != null)
            {
              this.sourceKey = ((Key)localObject3);
              localObject1 = this.helper;
              localObject2 = this.cacheFile;
              localObject1 = ((DecodeHelper)localObject1).getModelLoaders((File)localObject2);
              this.modelLoaders = ((List)localObject1);
              this.modelLoaderIndex = 0;
            }
            localObject1 = this.modelLoaders;
            if (localObject1 != null)
            {
              boolean bool2 = hasNextModelLoader();
              if (bool2) {
                break;
              }
            }
            j = this.resourceClassIndex + 1;
            this.resourceClassIndex = j;
            j = this.resourceClassIndex;
            m = localList2.size();
          } while (j < m);
          j = this.sourceIdIndex + 1;
          this.sourceIdIndex = j;
          j = this.sourceIdIndex;
          m = localList1.size();
        } while (j < m);
        m = 0;
        localObject2 = null;
        f1 = 0.0F;
      }
      int j = 0;
      f2 = 0.0F;
      localObject1 = null;
      this.loadData = null;
      m = 0;
      localObject2 = null;
      f1 = 0.0F;
      if (m != 0) {
        break;
      }
      k = hasNextModelLoader();
    } while (k == 0);
    localObject1 = this.modelLoaders;
    int i2 = this.modelLoaderIndex;
    int i3 = i2 + 1;
    this.modelLoaderIndex = i3;
    localObject1 = (ModelLoader)((List)localObject1).get(i2);
    Object localObject3 = this.cacheFile;
    Object localObject4 = this.helper;
    i3 = ((DecodeHelper)localObject4).getWidth();
    DecodeHelper localDecodeHelper = this.helper;
    int n = localDecodeHelper.getHeight();
    Object localObject5 = this.helper.getOptions();
    localObject1 = ((ModelLoader)localObject1).buildLoadData(localObject3, i3, n, (Options)localObject5);
    this.loadData = ((ModelLoader.LoadData)localObject1);
    localObject1 = this.loadData;
    if (localObject1 != null)
    {
      localObject1 = this.helper;
      localObject3 = this.loadData.fetcher.getDataClass();
      k = ((DecodeHelper)localObject1).hasLoadPath((Class)localObject3);
      if (k != 0)
      {
        k = 1;
        f2 = Float.MIN_VALUE;
        localObject2 = this.loadData.fetcher;
        localObject3 = this.helper.getPriority();
        ((DataFetcher)localObject2).loadData((Priority)localObject3, this);
      }
    }
    for (;;)
    {
      m = k;
      f1 = f2;
      break label409;
      break;
      k = m;
      f2 = f1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\ResourceCacheGenerator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */