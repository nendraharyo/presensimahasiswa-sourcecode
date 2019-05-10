package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher;

public class UriLoader$FileDescriptorFactory
  implements ModelLoaderFactory, UriLoader.LocalUriFetcherFactory
{
  private final ContentResolver contentResolver;
  
  public UriLoader$FileDescriptorFactory(ContentResolver paramContentResolver)
  {
    this.contentResolver = paramContentResolver;
  }
  
  public DataFetcher build(Uri paramUri)
  {
    FileDescriptorLocalUriFetcher localFileDescriptorLocalUriFetcher = new com/bumptech/glide/load/data/FileDescriptorLocalUriFetcher;
    ContentResolver localContentResolver = this.contentResolver;
    localFileDescriptorLocalUriFetcher.<init>(localContentResolver, paramUri);
    return localFileDescriptorLocalUriFetcher;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    UriLoader localUriLoader = new com/bumptech/glide/load/model/UriLoader;
    localUriLoader.<init>(this);
    return localUriLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\UriLoader$FileDescriptorFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */