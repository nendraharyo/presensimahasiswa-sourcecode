package com.bumptech.glide.load.model;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.signature.ObjectKey;

public final class MediaStoreFileLoader
  implements ModelLoader
{
  private final Context context;
  
  public MediaStoreFileLoader(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public ModelLoader.LoadData buildLoadData(Uri paramUri, int paramInt1, int paramInt2, Options paramOptions)
  {
    ModelLoader.LoadData localLoadData = new com/bumptech/glide/load/model/ModelLoader$LoadData;
    ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
    localObjectKey.<init>(paramUri);
    MediaStoreFileLoader.FilePathFetcher localFilePathFetcher = new com/bumptech/glide/load/model/MediaStoreFileLoader$FilePathFetcher;
    Context localContext = this.context;
    localFilePathFetcher.<init>(localContext, paramUri);
    localLoadData.<init>(localObjectKey, localFilePathFetcher);
    return localLoadData;
  }
  
  public boolean handles(Uri paramUri)
  {
    return MediaStoreUtil.isMediaStoreUri(paramUri);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\MediaStoreFileLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */