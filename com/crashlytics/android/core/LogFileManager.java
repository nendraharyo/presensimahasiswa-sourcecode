package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.Set;

class LogFileManager
{
  private static final String COLLECT_CUSTOM_LOGS = "com.crashlytics.CollectCustomLogs";
  private static final String LOGFILE_EXT = ".temp";
  private static final String LOGFILE_PREFIX = "crashlytics-userlog-";
  static final int MAX_LOG_SIZE = 65536;
  private static final LogFileManager.NoopLogStore NOOP_LOG_STORE;
  private final Context context;
  private FileLogStore currentLog;
  private final LogFileManager.DirectoryProvider directoryProvider;
  
  static
  {
    LogFileManager.NoopLogStore localNoopLogStore = new com/crashlytics/android/core/LogFileManager$NoopLogStore;
    localNoopLogStore.<init>(null);
    NOOP_LOG_STORE = localNoopLogStore;
  }
  
  LogFileManager(Context paramContext, LogFileManager.DirectoryProvider paramDirectoryProvider)
  {
    this(paramContext, paramDirectoryProvider, null);
  }
  
  LogFileManager(Context paramContext, LogFileManager.DirectoryProvider paramDirectoryProvider, String paramString)
  {
    this.context = paramContext;
    this.directoryProvider = paramDirectoryProvider;
    LogFileManager.NoopLogStore localNoopLogStore = NOOP_LOG_STORE;
    this.currentLog = localNoopLogStore;
    setCurrentSession(paramString);
  }
  
  private String getSessionIdForFile(File paramFile)
  {
    String str1 = paramFile.getName();
    String str2 = ".temp";
    int i = str1.lastIndexOf(str2);
    int j = -1;
    if (i == j) {}
    for (;;)
    {
      return str1;
      String str3 = "crashlytics-userlog-";
      j = str3.length();
      str1 = str1.substring(j, i);
    }
  }
  
  private File getWorkingFileForSession(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "crashlytics-userlog-" + paramString + ".temp";
    File localFile1 = new java/io/File;
    File localFile2 = this.directoryProvider.getLogFileDir();
    localFile1.<init>(localFile2, (String)localObject);
    return localFile1;
  }
  
  void clearLog()
  {
    this.currentLog.deleteLogFile();
  }
  
  void discardOldLogFiles(Set paramSet)
  {
    File localFile1 = this.directoryProvider.getLogFileDir();
    File[] arrayOfFile = localFile1.listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      int j = 0;
      localFile1 = null;
      while (j < i)
      {
        File localFile2 = arrayOfFile[j];
        String str = getSessionIdForFile(localFile2);
        boolean bool = paramSet.contains(str);
        if (!bool) {
          localFile2.delete();
        }
        j += 1;
      }
    }
  }
  
  ByteString getByteStringForLog()
  {
    return this.currentLog.getLogAsByteString();
  }
  
  byte[] getBytesForLog()
  {
    return this.currentLog.getLogAsBytes();
  }
  
  final void setCurrentSession(String paramString)
  {
    this.currentLog.closeLogFile();
    Object localObject = NOOP_LOG_STORE;
    this.currentLog = ((FileLogStore)localObject);
    if (paramString == null) {}
    for (;;)
    {
      return;
      localObject = this.context;
      String str1 = "com.crashlytics.CollectCustomLogs";
      boolean bool1 = true;
      boolean bool2 = CommonUtils.getBooleanResourceValue((Context)localObject, str1, bool1);
      if (!bool2)
      {
        localObject = Fabric.getLogger();
        str1 = "CrashlyticsCore";
        String str2 = "Preferences requested no custom logs. Aborting log file creation.";
        ((Logger)localObject).d(str1, str2);
      }
      else
      {
        localObject = getWorkingFileForSession(paramString);
        int i = 65536;
        setLogFile((File)localObject, i);
      }
    }
  }
  
  void setLogFile(File paramFile, int paramInt)
  {
    QueueFileLogStore localQueueFileLogStore = new com/crashlytics/android/core/QueueFileLogStore;
    localQueueFileLogStore.<init>(paramFile, paramInt);
    this.currentLog = localQueueFileLogStore;
  }
  
  void writeToLog(long paramLong, String paramString)
  {
    this.currentLog.writeToLog(paramLong, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\LogFileManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */