package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import io.fabric.sdk.android.services.common.QueueFile.ElementReader;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

class QueueFileLogStore
  implements FileLogStore
{
  private QueueFile logFile;
  private final int maxLogSize;
  private final File workingFile;
  
  public QueueFileLogStore(File paramFile, int paramInt)
  {
    this.workingFile = paramFile;
    this.maxLogSize = paramInt;
  }
  
  private void doWriteToLog(long paramLong, String paramString)
  {
    Object localObject1 = this.logFile;
    if (localObject1 == null) {
      return;
    }
    if (paramString == null) {}
    String str;
    for (localObject1 = "null";; str = paramString) {
      try
      {
        int i = this.maxLogSize;
        i /= 4;
        int j = ((String)localObject1).length();
        if (j > i)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = "...";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
          k = ((String)localObject1).length();
          i = k - i;
          localObject1 = ((String)localObject1).substring(i);
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          localObject1 = ((StringBuilder)localObject1).toString();
        }
        localObject4 = "\r";
        localObject2 = " ";
        localObject1 = ((String)localObject1).replaceAll((String)localObject4, (String)localObject2);
        localObject4 = "\n";
        localObject2 = " ";
        localObject1 = ((String)localObject1).replaceAll((String)localObject4, (String)localObject2);
        localObject4 = Locale.US;
        localObject2 = "%d %s%n";
        int k = 2;
        localObject3 = new Object[k];
        int m = 0;
        Long localLong = Long.valueOf(paramLong);
        localObject3[0] = localLong;
        m = 1;
        localObject3[m] = localObject1;
        localObject1 = String.format((Locale)localObject4, (String)localObject2, (Object[])localObject3);
        localObject4 = "UTF-8";
        localObject1 = ((String)localObject1).getBytes((String)localObject4);
        localObject4 = this.logFile;
        ((QueueFile)localObject4).add((byte[])localObject1);
        for (;;)
        {
          localObject1 = this.logFile;
          boolean bool = ((QueueFile)localObject1).isEmpty();
          if (bool) {
            break;
          }
          localObject1 = this.logFile;
          int n = ((QueueFile)localObject1).usedBytes();
          i = this.maxLogSize;
          if (n <= i) {
            break;
          }
          localObject1 = this.logFile;
          ((QueueFile)localObject1).remove();
        }
      }
      catch (IOException localIOException)
      {
        Object localObject4 = Fabric.getLogger();
        Object localObject2 = "CrashlyticsCore";
        Object localObject3 = "There was a problem writing to the Crashlytics log.";
        ((Logger)localObject4).e((String)localObject2, (String)localObject3, localIOException);
      }
    }
  }
  
  private QueueFileLogStore.LogBytes getLogBytes()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = this.workingFile;
    boolean bool = ((File)localObject2).exists();
    if (!bool) {}
    for (;;)
    {
      return (QueueFileLogStore.LogBytes)localObject1;
      openLogFile();
      localObject2 = this.logFile;
      byte[] arrayOfByte;
      if (localObject2 != null)
      {
        localObject2 = new int[1];
        localObject2[0] = 0;
        localObject1 = this.logFile;
        i = ((QueueFile)localObject1).usedBytes();
        arrayOfByte = new byte[i];
      }
      try
      {
        localObject1 = this.logFile;
        localObject3 = new com/crashlytics/android/core/QueueFileLogStore$1;
        ((QueueFileLogStore.1)localObject3).<init>(this, arrayOfByte, (int[])localObject2);
        ((QueueFile)localObject1).forEach((QueueFile.ElementReader)localObject3);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          int j;
          Object localObject3 = Fabric.getLogger();
          String str1 = "CrashlyticsCore";
          String str2 = "A problem occurred while reading the Crashlytics log file.";
          ((Logger)localObject3).e(str1, str2, localIOException);
        }
      }
      localObject1 = new com/crashlytics/android/core/QueueFileLogStore$LogBytes;
      j = localObject2[0];
      ((QueueFileLogStore.LogBytes)localObject1).<init>(this, arrayOfByte, j);
    }
  }
  
  private void openLogFile()
  {
    QueueFile localQueueFile = this.logFile;
    if (localQueueFile == null) {}
    try
    {
      localQueueFile = new io/fabric/sdk/android/services/common/QueueFile;
      localObject1 = this.workingFile;
      localQueueFile.<init>((File)localObject1);
      this.logFile = localQueueFile;
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject1 = Fabric.getLogger();
        String str = "CrashlyticsCore";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Could not open log file: ");
        File localFile = this.workingFile;
        localObject2 = localFile;
        ((Logger)localObject1).e(str, (String)localObject2, localIOException);
      }
    }
  }
  
  public void closeLogFile()
  {
    CommonUtils.closeOrLog(this.logFile, "There was a problem closing the Crashlytics log file.");
    this.logFile = null;
  }
  
  public void deleteLogFile()
  {
    closeLogFile();
    this.workingFile.delete();
  }
  
  public ByteString getLogAsByteString()
  {
    Object localObject = getLogBytes();
    int i;
    if (localObject == null) {
      i = 0;
    }
    byte[] arrayOfByte;
    for (localObject = null;; localObject = ByteString.copyFrom(arrayOfByte, 0, i))
    {
      return (ByteString)localObject;
      arrayOfByte = ((QueueFileLogStore.LogBytes)localObject).bytes;
      i = ((QueueFileLogStore.LogBytes)localObject).offset;
    }
  }
  
  public byte[] getLogAsBytes()
  {
    Object localObject = getLogBytes();
    if (localObject == null) {}
    for (localObject = null;; localObject = ((QueueFileLogStore.LogBytes)localObject).bytes) {
      return (byte[])localObject;
    }
  }
  
  public void writeToLog(long paramLong, String paramString)
  {
    openLogFile();
    doWriteToLog(paramLong, paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\QueueFileLogStore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */