package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class QueueFileEventStorage
  implements EventsStorage
{
  private final Context context;
  private QueueFile queueFile;
  private File targetDirectory;
  private final String targetDirectoryName;
  private final File workingDirectory;
  private final File workingFile;
  
  public QueueFileEventStorage(Context paramContext, File paramFile, String paramString1, String paramString2)
  {
    this.context = paramContext;
    this.workingDirectory = paramFile;
    this.targetDirectoryName = paramString2;
    Object localObject = new java/io/File;
    File localFile = this.workingDirectory;
    ((File)localObject).<init>(localFile, paramString1);
    this.workingFile = ((File)localObject);
    localObject = new io/fabric/sdk/android/services/common/QueueFile;
    localFile = this.workingFile;
    ((QueueFile)localObject).<init>(localFile);
    this.queueFile = ((QueueFile)localObject);
    createTargetDirectory();
  }
  
  private void createTargetDirectory()
  {
    File localFile1 = new java/io/File;
    File localFile2 = this.workingDirectory;
    String str = this.targetDirectoryName;
    localFile1.<init>(localFile2, str);
    this.targetDirectory = localFile1;
    localFile1 = this.targetDirectory;
    boolean bool = localFile1.exists();
    if (!bool)
    {
      localFile1 = this.targetDirectory;
      localFile1.mkdirs();
    }
  }
  
  private void move(File paramFile1, File paramFile2)
  {
    OutputStream localOutputStream = null;
    try
    {
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      localFileInputStream.<init>(paramFile1);
      int i;
      byte[] arrayOfByte;
      CommonUtils.closeOrLog(localFileInputStream, "Failed to close file input stream");
    }
    finally
    {
      try
      {
        localOutputStream = getMoveOutputStream(paramFile2);
        i = 1024;
        arrayOfByte = new byte[i];
        CommonUtils.copyStream(localFileInputStream, localOutputStream, arrayOfByte);
        CommonUtils.closeOrLog(localFileInputStream, "Failed to close file input stream");
        CommonUtils.closeOrLog(localOutputStream, "Failed to close output stream");
        paramFile1.delete();
        return;
      }
      finally
      {
        for (;;) {}
      }
      localObject1 = finally;
      localFileInputStream = null;
    }
    CommonUtils.closeOrLog(localOutputStream, "Failed to close output stream");
    paramFile1.delete();
    throw ((Throwable)localObject1);
  }
  
  public void add(byte[] paramArrayOfByte)
  {
    this.queueFile.add(paramArrayOfByte);
  }
  
  public boolean canWorkingFileStore(int paramInt1, int paramInt2)
  {
    return this.queueFile.hasSpaceFor(paramInt1, paramInt2);
  }
  
  public void deleteFilesInRollOverDirectory(List paramList)
  {
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      File localFile = (File)localIterator.next();
      Context localContext = this.context;
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      String str1 = localFile.getName();
      arrayOfObject[0] = str1;
      String str2 = String.format("deleting sent analytics file %s", arrayOfObject);
      CommonUtils.logControlled(localContext, str2);
      localFile.delete();
    }
  }
  
  public void deleteWorkingFile()
  {
    try
    {
      QueueFile localQueueFile = this.queueFile;
      localQueueFile.close();
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    this.workingFile.delete();
  }
  
  public List getAllFilesInRollOverDirectory()
  {
    return Arrays.asList(this.targetDirectory.listFiles());
  }
  
  public List getBatchOfFilesToSend(int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    File[] arrayOfFile = this.targetDirectory.listFiles();
    int i = arrayOfFile.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        File localFile = arrayOfFile[j];
        localArrayList.add(localFile);
        int k = localArrayList.size();
        if (k < paramInt) {}
      }
      else
      {
        return localArrayList;
      }
      j += 1;
    }
  }
  
  public OutputStream getMoveOutputStream(File paramFile)
  {
    FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
    localFileOutputStream.<init>(paramFile);
    return localFileOutputStream;
  }
  
  public File getRollOverDirectory()
  {
    return this.targetDirectory;
  }
  
  public File getWorkingDirectory()
  {
    return this.workingDirectory;
  }
  
  public int getWorkingFileUsedSizeInBytes()
  {
    return this.queueFile.usedBytes();
  }
  
  public boolean isWorkingFileEmpty()
  {
    return this.queueFile.isEmpty();
  }
  
  public void rollOver(String paramString)
  {
    this.queueFile.close();
    Object localObject = this.workingFile;
    File localFile1 = new java/io/File;
    File localFile2 = this.targetDirectory;
    localFile1.<init>(localFile2, paramString);
    move((File)localObject, localFile1);
    localObject = new io/fabric/sdk/android/services/common/QueueFile;
    localFile1 = this.workingFile;
    ((QueueFile)localObject).<init>(localFile1);
    this.queueFile = ((QueueFile)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\events\QueueFileEventStorage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */