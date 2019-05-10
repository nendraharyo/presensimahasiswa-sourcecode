package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.signature.ObjectKey;

public class MediaStoreVideoThumbLoader
  implements ModelLoader
{
  private final Context context;
  
  public MediaStoreVideoThumbLoader(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    this.context = localContext;
  }
  
  private boolean isRequestingDefaultFrame(Options paramOptions)
  {
    Object localObject = VideoDecoder.TARGET_FRAME;
    localObject = (Long)paramOptions.get((Option)localObject);
    boolean bool;
    if (localObject != null)
    {
      long l1 = ((Long)localObject).longValue();
      long l2 = -1;
      bool = l1 < l2;
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public ModelLoader.LoadData buildLoadData(Uri paramUri, int paramInt1, int paramInt2, Options paramOptions)
  {
    boolean bool = MediaStoreUtil.isThumbnailSize(paramInt1, paramInt2);
    ModelLoader.LoadData localLoadData;
    if (bool)
    {
      bool = isRequestingDefaultFrame(paramOptions);
      if (bool)
      {
        localLoadData = new com/bumptech/glide/load/model/ModelLoader$LoadData;
        ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
        localObjectKey.<init>(paramUri);
        ThumbFetcher localThumbFetcher = ThumbFetcher.buildVideoFetcher(this.context, paramUri);
        localLoadData.<init>(localObjectKey, localThumbFetcher);
      }
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
    return MediaStoreUtil.isMediaStoreVideoUri(paramUri);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\stream\MediaStoreVideoThumbLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */