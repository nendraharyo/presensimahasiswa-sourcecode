package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

final class ByteBufferFileLoader$ByteBufferFetcher
  implements DataFetcher
{
  private final File file;
  
  ByteBufferFileLoader$ByteBufferFetcher(File paramFile)
  {
    this.file = paramFile;
  }
  
  public void cancel() {}
  
  public void cleanup() {}
  
  public Class getDataClass()
  {
    return ByteBuffer.class;
  }
  
  public DataSource getDataSource()
  {
    return DataSource.LOCAL;
  }
  
  public void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback)
  {
    try
    {
      Object localObject = this.file;
      localObject = ByteBufferUtil.fromFile((File)localObject);
      paramDataCallback.onDataReady(localObject);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str1 = "ByteBufferFileLoader";
        int i = 3;
        boolean bool = Log.isLoggable(str1, i);
        if (bool)
        {
          str1 = "ByteBufferFileLoader";
          String str2 = "Failed to obtain ByteBuffer for file";
          Log.d(str1, str2, localIOException);
        }
        paramDataCallback.onLoadFailed(localIOException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ByteBufferFileLoader$ByteBufferFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */