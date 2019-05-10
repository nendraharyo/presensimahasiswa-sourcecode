package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.StreamAssetPathFetcher;

public class AssetUriLoader$StreamFactory
  implements AssetUriLoader.AssetFetcherFactory, ModelLoaderFactory
{
  private final AssetManager assetManager;
  
  public AssetUriLoader$StreamFactory(AssetManager paramAssetManager)
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
    StreamAssetPathFetcher localStreamAssetPathFetcher = new com/bumptech/glide/load/data/StreamAssetPathFetcher;
    localStreamAssetPathFetcher.<init>(paramAssetManager, paramString);
    return localStreamAssetPathFetcher;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\AssetUriLoader$StreamFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */