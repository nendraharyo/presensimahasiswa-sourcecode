package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.StreamLocalUriFetcher;

public class UriLoader$StreamFactory
  implements ModelLoaderFactory, UriLoader.LocalUriFetcherFactory
{
  private final ContentResolver contentResolver;
  
  public UriLoader$StreamFactory(ContentResolver paramContentResolver)
  {
    this.contentResolver = paramContentResolver;
  }
  
  public DataFetcher build(Uri paramUri)
  {
    StreamLocalUriFetcher localStreamLocalUriFetcher = new com/bumptech/glide/load/data/StreamLocalUriFetcher;
    ContentResolver localContentResolver = this.contentResolver;
    localStreamLocalUriFetcher.<init>(localContentResolver, paramUri);
    return localStreamLocalUriFetcher;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    UriLoader localUriLoader = new com/bumptech/glide/load/model/UriLoader;
    localUriLoader.<init>(this);
    return localUriLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\UriLoader$StreamFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */