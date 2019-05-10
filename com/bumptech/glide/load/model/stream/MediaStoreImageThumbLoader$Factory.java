package com.bumptech.glide.load.model.stream;

import android.content.Context;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;

public class MediaStoreImageThumbLoader$Factory
  implements ModelLoaderFactory
{
  private final Context context;
  
  public MediaStoreImageThumbLoader$Factory(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    MediaStoreImageThumbLoader localMediaStoreImageThumbLoader = new com/bumptech/glide/load/model/stream/MediaStoreImageThumbLoader;
    Context localContext = this.context;
    localMediaStoreImageThumbLoader.<init>(localContext);
    return localMediaStoreImageThumbLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\stream\MediaStoreImageThumbLoader$Factory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */