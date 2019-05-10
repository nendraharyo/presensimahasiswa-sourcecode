package com.bumptech.glide.load.model;

import android.content.Context;

public final class MediaStoreFileLoader$Factory
  implements ModelLoaderFactory
{
  private final Context context;
  
  public MediaStoreFileLoader$Factory(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    MediaStoreFileLoader localMediaStoreFileLoader = new com/bumptech/glide/load/model/MediaStoreFileLoader;
    Context localContext = this.context;
    localMediaStoreFileLoader.<init>(localContext);
    return localMediaStoreFileLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\MediaStoreFileLoader$Factory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */