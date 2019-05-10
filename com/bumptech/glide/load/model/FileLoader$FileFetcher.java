package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

final class FileLoader$FileFetcher
  implements DataFetcher
{
  private Object data;
  private final File file;
  private final FileLoader.FileOpener opener;
  
  FileLoader$FileFetcher(File paramFile, FileLoader.FileOpener paramFileOpener)
  {
    this.file = paramFile;
    this.opener = paramFileOpener;
  }
  
  public void cancel() {}
  
  public void cleanup()
  {
    Object localObject1 = this.data;
    if (localObject1 != null) {}
    try
    {
      localObject1 = this.opener;
      Object localObject2 = this.data;
      ((FileLoader.FileOpener)localObject1).close(localObject2);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public Class getDataClass()
  {
    return this.opener.getDataClass();
  }
  
  public DataSource getDataSource()
  {
    return DataSource.LOCAL;
  }
  
  public void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback)
  {
    try
    {
      Object localObject1 = this.opener;
      localObject2 = this.file;
      localObject1 = ((FileLoader.FileOpener)localObject1).open((File)localObject2);
      this.data = localObject1;
      localObject1 = this.data;
      paramDataCallback.onDataReady(localObject1);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        Object localObject2 = "FileLoader";
        int i = 3;
        boolean bool = Log.isLoggable((String)localObject2, i);
        if (bool)
        {
          localObject2 = "FileLoader";
          String str = "Failed to open file";
          Log.d((String)localObject2, str, localFileNotFoundException);
        }
        paramDataCallback.onLoadFailed(localFileNotFoundException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\FileLoader$FileFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */