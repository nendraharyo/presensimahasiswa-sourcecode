package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class LocalUriFetcher
  implements DataFetcher
{
  private static final String TAG = "LocalUriFetcher";
  private final ContentResolver contentResolver;
  private Object data;
  private final Uri uri;
  
  public LocalUriFetcher(ContentResolver paramContentResolver, Uri paramUri)
  {
    this.contentResolver = paramContentResolver;
    this.uri = paramUri;
  }
  
  public void cancel() {}
  
  public void cleanup()
  {
    Object localObject = this.data;
    if (localObject != null) {}
    try
    {
      localObject = this.data;
      close(localObject);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  protected abstract void close(Object paramObject);
  
  public DataSource getDataSource()
  {
    return DataSource.LOCAL;
  }
  
  public final void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback)
  {
    try
    {
      Object localObject1 = this.uri;
      localObject2 = this.contentResolver;
      localObject1 = loadResource((Uri)localObject1, (ContentResolver)localObject2);
      this.data = localObject1;
      localObject1 = this.data;
      paramDataCallback.onDataReady(localObject1);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        Object localObject2 = "LocalUriFetcher";
        int i = 3;
        boolean bool = Log.isLoggable((String)localObject2, i);
        if (bool)
        {
          localObject2 = "LocalUriFetcher";
          String str = "Failed to open Uri";
          Log.d((String)localObject2, str, localFileNotFoundException);
        }
        paramDataCallback.onLoadFailed(localFileNotFoundException);
      }
    }
  }
  
  protected abstract Object loadResource(Uri paramUri, ContentResolver paramContentResolver);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\LocalUriFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */