package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.File;
import java.io.IOException;

class CrashlyticsFileMarker
{
  private final FileStore fileStore;
  private final String markerName;
  
  public CrashlyticsFileMarker(String paramString, FileStore paramFileStore)
  {
    this.markerName = paramString;
    this.fileStore = paramFileStore;
  }
  
  private File getMarkerFile()
  {
    File localFile1 = new java/io/File;
    File localFile2 = this.fileStore.getFilesDir();
    String str = this.markerName;
    localFile1.<init>(localFile2, str);
    return localFile1;
  }
  
  public boolean create()
  {
    boolean bool = false;
    try
    {
      File localFile = getMarkerFile();
      bool = localFile.createNewFile();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str1 = "CrashlyticsCore";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("Error creating marker: ");
        String str2 = this.markerName;
        localObject = str2;
        localLogger.e(str1, (String)localObject, localIOException);
      }
    }
    return bool;
  }
  
  public boolean isPresent()
  {
    return getMarkerFile().exists();
  }
  
  public boolean remove()
  {
    return getMarkerFile().delete();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsFileMarker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */