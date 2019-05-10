package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import java.io.File;
import java.io.FileNotFoundException;

class MediaStoreFileLoader$FilePathFetcher
  implements DataFetcher
{
  private static final String[] PROJECTION;
  private final Context context;
  private final Uri uri;
  
  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = "_data";
    PROJECTION = arrayOfString;
  }
  
  MediaStoreFileLoader$FilePathFetcher(Context paramContext, Uri paramUri)
  {
    this.context = paramContext;
    this.uri = paramUri;
  }
  
  public void cancel() {}
  
  public void cleanup() {}
  
  public Class getDataClass()
  {
    return File.class;
  }
  
  public DataSource getDataSource()
  {
    return DataSource.LOCAL;
  }
  
  public void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback)
  {
    String str = null;
    Object localObject1 = this.context.getContentResolver();
    Object localObject3 = this.uri;
    Object localObject4 = PROJECTION;
    localObject3 = ((ContentResolver)localObject1).query((Uri)localObject3, (String[])localObject4, null, null, null);
    if (localObject3 != null) {}
    for (;;)
    {
      try
      {
        boolean bool1 = ((Cursor)localObject3).moveToFirst();
        if (bool1)
        {
          localObject1 = "_data";
          int i = ((Cursor)localObject3).getColumnIndexOrThrow((String)localObject1);
          str = ((Cursor)localObject3).getString(i);
        }
        ((Cursor)localObject3).close();
        boolean bool2 = TextUtils.isEmpty(str);
        if (bool2)
        {
          localObject1 = new java/io/FileNotFoundException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append("Failed to find file path for: ");
          localObject4 = this.uri;
          localObject3 = localObject4;
          ((FileNotFoundException)localObject1).<init>((String)localObject3);
          paramDataCallback.onLoadFailed((Exception)localObject1);
          return;
        }
      }
      finally
      {
        ((Cursor)localObject3).close();
      }
      File localFile = new java/io/File;
      localFile.<init>(str);
      paramDataCallback.onDataReady(localFile);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\MediaStoreFileLoader$FilePathFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */