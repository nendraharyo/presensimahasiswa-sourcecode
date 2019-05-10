package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import java.io.IOException;

final class DataUrlLoader$DataUriFetcher
  implements DataFetcher
{
  private Object data;
  private final String dataUri;
  private final DataUrlLoader.DataDecoder reader;
  
  DataUrlLoader$DataUriFetcher(String paramString, DataUrlLoader.DataDecoder paramDataDecoder)
  {
    this.dataUri = paramString;
    this.reader = paramDataDecoder;
  }
  
  public void cancel() {}
  
  public void cleanup()
  {
    try
    {
      DataUrlLoader.DataDecoder localDataDecoder = this.reader;
      Object localObject = this.data;
      localDataDecoder.close(localObject);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public Class getDataClass()
  {
    return this.reader.getDataClass();
  }
  
  public DataSource getDataSource()
  {
    return DataSource.LOCAL;
  }
  
  public void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback)
  {
    try
    {
      Object localObject = this.reader;
      String str = this.dataUri;
      localObject = ((DataUrlLoader.DataDecoder)localObject).decode(str);
      this.data = localObject;
      localObject = this.data;
      paramDataCallback.onDataReady(localObject);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        paramDataCallback.onLoadFailed(localIllegalArgumentException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\DataUrlLoader$DataUriFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */