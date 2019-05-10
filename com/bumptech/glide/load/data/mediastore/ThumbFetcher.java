package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.ExifOrientationStream;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ThumbFetcher
  implements DataFetcher
{
  private static final String TAG = "MediaStoreThumbFetcher";
  private InputStream inputStream;
  private final Uri mediaStoreImageUri;
  private final ThumbnailStreamOpener opener;
  
  ThumbFetcher(Uri paramUri, ThumbnailStreamOpener paramThumbnailStreamOpener)
  {
    this.mediaStoreImageUri = paramUri;
    this.opener = paramThumbnailStreamOpener;
  }
  
  private static ThumbFetcher build(Context paramContext, Uri paramUri, ThumbnailQuery paramThumbnailQuery)
  {
    Object localObject = Glide.get(paramContext).getArrayPool();
    ThumbnailStreamOpener localThumbnailStreamOpener = new com/bumptech/glide/load/data/mediastore/ThumbnailStreamOpener;
    List localList = Glide.get(paramContext).getRegistry().getImageHeaderParsers();
    ContentResolver localContentResolver = paramContext.getContentResolver();
    localThumbnailStreamOpener.<init>(localList, paramThumbnailQuery, (ArrayPool)localObject, localContentResolver);
    localObject = new com/bumptech/glide/load/data/mediastore/ThumbFetcher;
    ((ThumbFetcher)localObject).<init>(paramUri, localThumbnailStreamOpener);
    return (ThumbFetcher)localObject;
  }
  
  public static ThumbFetcher buildImageFetcher(Context paramContext, Uri paramUri)
  {
    ThumbFetcher.ImageThumbnailQuery localImageThumbnailQuery = new com/bumptech/glide/load/data/mediastore/ThumbFetcher$ImageThumbnailQuery;
    ContentResolver localContentResolver = paramContext.getContentResolver();
    localImageThumbnailQuery.<init>(localContentResolver);
    return build(paramContext, paramUri, localImageThumbnailQuery);
  }
  
  public static ThumbFetcher buildVideoFetcher(Context paramContext, Uri paramUri)
  {
    ThumbFetcher.VideoThumbnailQuery localVideoThumbnailQuery = new com/bumptech/glide/load/data/mediastore/ThumbFetcher$VideoThumbnailQuery;
    ContentResolver localContentResolver = paramContext.getContentResolver();
    localVideoThumbnailQuery.<init>(localContentResolver);
    return build(paramContext, paramUri, localVideoThumbnailQuery);
  }
  
  private InputStream openThumbInputStream()
  {
    int i = -1;
    Object localObject1 = this.opener;
    Object localObject2 = this.mediaStoreImageUri;
    localObject2 = ((ThumbnailStreamOpener)localObject1).open((Uri)localObject2);
    int j;
    if (localObject2 != null)
    {
      localObject1 = this.opener;
      Uri localUri = this.mediaStoreImageUri;
      j = ((ThumbnailStreamOpener)localObject1).getOrientation(localUri);
    }
    for (int k = j;; k = i)
    {
      if (k != i)
      {
        localObject1 = new com/bumptech/glide/load/data/ExifOrientationStream;
        ((ExifOrientationStream)localObject1).<init>((InputStream)localObject2, k);
      }
      for (;;)
      {
        return (InputStream)localObject1;
        localObject1 = localObject2;
      }
    }
  }
  
  public void cancel() {}
  
  public void cleanup()
  {
    InputStream localInputStream = this.inputStream;
    if (localInputStream != null) {}
    try
    {
      localInputStream = this.inputStream;
      localInputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public Class getDataClass()
  {
    return InputStream.class;
  }
  
  public DataSource getDataSource()
  {
    return DataSource.LOCAL;
  }
  
  public void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback)
  {
    try
    {
      InputStream localInputStream = openThumbInputStream();
      this.inputStream = localInputStream;
      localInputStream = this.inputStream;
      paramDataCallback.onDataReady(localInputStream);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        String str1 = "MediaStoreThumbFetcher";
        int i = 3;
        boolean bool = Log.isLoggable(str1, i);
        if (bool)
        {
          str1 = "MediaStoreThumbFetcher";
          String str2 = "Failed to find thumbnail file";
          Log.d(str1, str2, localFileNotFoundException);
        }
        paramDataCallback.onLoadFailed(localFileNotFoundException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\mediastore\ThumbFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */