package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorAssetPathFetcher;

public class AssetUriLoader$FileDescriptorFactory
  implements AssetUriLoader.AssetFetcherFactory, ModelLoaderFactory
{
  private final AssetManager assetManager;
  
  public AssetUriLoader$FileDescriptorFactory(AssetManager paramAssetManager)
  {
    this.assetManager = paramAssetManager;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    AssetUriLoader localAssetUriLoader = new com/bumptech/glide/load/model/AssetUriLoader;
    AssetManager localAssetManager = this.assetManager;
    localAssetUriLoader.<init>(localAssetManager, this);
    return localAssetUriLoader;
  }
  
  public DataFetcher buildFetcher(AssetManager paramAssetManager, String paramString)
  {
    FileDescriptorAssetPathFetcher localFileDescriptorAssetPathFetcher = new com/bumptech/glide/load/data/FileDescriptorAssetPathFetcher;
    localFileDescriptorAssetPathFetcher.<init>(paramAssetManager, paramString);
    return localFileDescriptorAssetPathFetcher;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\AssetUriLoader$FileDescriptorFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */