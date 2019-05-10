package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.signature.ObjectKey;

public class MediaStoreImageThumbLoader
  implements ModelLoader
{
  private final Context context;
  
  public MediaStoreImageThumbLoader(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    this.context = localContext;
  }
  
  public ModelLoader.LoadData buildLoadData(Uri paramUri, int paramInt1, int paramInt2, Options paramOptions)
  {
    boolean bool = MediaStoreUtil.isThumbnailSize(paramInt1, paramInt2);
    ModelLoader.LoadData localLoadData;
    if (bool)
    {
      localLoadData = new com/bumptech/glide/load/model/ModelLoader$LoadData;
      ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
      localObjectKey.<init>(paramUri);
      ThumbFetcher localThumbFetcher = ThumbFetcher.buildImageFetcher(this.context, paramUri);
      localLoadData.<init>(localObjectKey, localThumbFetcher);
    }
    for (;;)
    {
      return localLoadData;
      bool = false;
      localLoadData = null;
    }
  }
  
  public boolean handles(Uri paramUri)
  {
    return MediaStoreUtil.isMediaStoreImageUri(paramUri);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\stream\MediaStoreImageThumbLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */