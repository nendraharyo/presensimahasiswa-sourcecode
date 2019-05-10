package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.AssetFileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.DataFetcher;

public final class UriLoader$AssetFileDescriptorFactory
  implements ModelLoaderFactory, UriLoader.LocalUriFetcherFactory
{
  private final ContentResolver contentResolver;
  
  public UriLoader$AssetFileDescriptorFactory(ContentResolver paramContentResolver)
  {
    this.contentResolver = paramContentResolver;
  }
  
  public DataFetcher build(Uri paramUri)
  {
    AssetFileDescriptorLocalUriFetcher localAssetFileDescriptorLocalUriFetcher = new com/bumptech/glide/load/data/AssetFileDescriptorLocalUriFetcher;
    ContentResolver localContentResolver = this.contentResolver;
    localAssetFileDescriptorLocalUriFetcher.<init>(localContentResolver, paramUri);
    return localAssetFileDescriptorLocalUriFetcher;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    UriLoader localUriLoader = new com/bumptech/glide/load/model/UriLoader;
    localUriLoader.<init>(this);
    return localUriLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\UriLoader$AssetFileDescriptorFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */