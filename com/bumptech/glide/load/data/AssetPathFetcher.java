package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

public abstract class AssetPathFetcher
  implements DataFetcher
{
  private static final String TAG = "AssetPathFetcher";
  private final AssetManager assetManager;
  private final String assetPath;
  private Object data;
  
  public AssetPathFetcher(AssetManager paramAssetManager, String paramString)
  {
    this.assetManager = paramAssetManager;
    this.assetPath = paramString;
  }
  
  public void cancel() {}
  
  public void cleanup()
  {
    Object localObject = this.data;
    if (localObject == null) {}
    for (;;)
    {
      return;
      try
      {
        localObject = this.data;
        close(localObject);
      }
      catch (IOException localIOException) {}
    }
  }
  
  protected abstract void close(Object paramObject);
  
  public DataSource getDataSource()
  {
    return DataSource.LOCAL;
  }
  
  public void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback)
  {
    try
    {
      Object localObject = this.assetManager;
      str1 = this.assetPath;
      localObject = loadResource((AssetManager)localObject, str1);
      this.data = localObject;
      localObject = this.data;
      paramDataCallback.onDataReady(localObject);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str1 = "AssetPathFetcher";
        int i = 3;
        boolean bool = Log.isLoggable(str1, i);
        if (bool)
        {
          str1 = "AssetPathFetcher";
          String str2 = "Failed to load data from asset manager";
          Log.d(str1, str2, localIOException);
        }
        paramDataCallback.onLoadFailed(localIOException);
      }
    }
  }
  
  protected abstract Object loadResource(AssetManager paramAssetManager, String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\AssetPathFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */