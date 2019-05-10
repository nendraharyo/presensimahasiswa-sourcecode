package com.bumptech.glide.load.model.stream;

import android.content.Context;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;

public class MediaStoreVideoThumbLoader$Factory
  implements ModelLoaderFactory
{
  private final Context context;
  
  public MediaStoreVideoThumbLoader$Factory(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    MediaStoreVideoThumbLoader localMediaStoreVideoThumbLoader = new com/bumptech/glide/load/model/stream/MediaStoreVideoThumbLoader;
    Context localContext = this.context;
    localMediaStoreVideoThumbLoader.<init>(localContext);
    return localMediaStoreVideoThumbLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\stream\MediaStoreVideoThumbLoader$Factory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */