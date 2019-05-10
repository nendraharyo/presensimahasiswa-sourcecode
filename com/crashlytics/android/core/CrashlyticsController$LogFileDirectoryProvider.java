package com.crashlytics.android.core;

import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.File;

final class CrashlyticsController$LogFileDirectoryProvider
  implements LogFileManager.DirectoryProvider
{
  private static final String LOG_FILES_DIR = "log-files";
  private final FileStore rootFileStore;
  
  public CrashlyticsController$LogFileDirectoryProvider(FileStore paramFileStore)
  {
    this.rootFileStore = paramFileStore;
  }
  
  public File getLogFileDir()
  {
    File localFile1 = new java/io/File;
    File localFile2 = this.rootFileStore.getFilesDir();
    String str = "log-files";
    localFile1.<init>(localFile2, str);
    boolean bool = localFile1.exists();
    if (!bool) {
      localFile1.mkdirs();
    }
    return localFile1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CrashlyticsController$LogFileDirectoryProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */