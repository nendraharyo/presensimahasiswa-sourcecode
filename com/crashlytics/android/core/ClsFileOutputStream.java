package com.crashlytics.android.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

class ClsFileOutputStream
  extends FileOutputStream
{
  public static final String IN_PROGRESS_SESSION_FILE_EXTENSION = ".cls_temp";
  public static final String SESSION_FILE_EXTENSION = ".cls";
  public static final FilenameFilter TEMP_FILENAME_FILTER;
  private boolean closed = false;
  private File complete;
  private File inProgress;
  private final String root;
  
  static
  {
    ClsFileOutputStream.1 local1 = new com/crashlytics/android/core/ClsFileOutputStream$1;
    local1.<init>();
    TEMP_FILENAME_FILTER = local1;
  }
  
  public ClsFileOutputStream(File paramFile, String paramString)
  {
    super((File)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(paramFile);
    localObject2 = File.separator;
    localObject1 = (String)localObject2 + paramString;
    this.root = ((String)localObject1);
    localObject1 = new java/io/File;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str = this.root;
    localObject2 = str + ".cls_temp";
    ((File)localObject1).<init>((String)localObject2);
    this.inProgress = ((File)localObject1);
  }
  
  public ClsFileOutputStream(String paramString1, String paramString2)
  {
    this(localFile, paramString2);
  }
  
  public void close()
  {
    Object localObject1;
    Object localObject5;
    try
    {
      boolean bool1 = this.closed;
      if (bool1) {}
      for (;;)
      {
        return;
        bool1 = true;
        this.closed = bool1;
        super.flush();
        super.close();
        localObject1 = new java/io/File;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject5 = this.root;
        localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
        localObject5 = ".cls";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((File)localObject1).<init>((String)localObject2);
        localObject2 = this.inProgress;
        bool1 = ((File)localObject2).renameTo((File)localObject1);
        if (!bool1) {
          break;
        }
        bool1 = false;
        localObject2 = null;
        this.inProgress = null;
        this.complete = ((File)localObject1);
      }
      localObject4 = "";
    }
    finally {}
    Object localObject4;
    boolean bool2 = ((File)localObject1).exists();
    if (bool2) {
      localObject4 = " (target already exists)";
    }
    for (;;)
    {
      localObject5 = new java/io/IOException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject6 = "Could not rename temp file: ";
      localStringBuilder = localStringBuilder.append((String)localObject6);
      localObject6 = this.inProgress;
      localStringBuilder = localStringBuilder.append(localObject6);
      localObject6 = " -> ";
      localStringBuilder = localStringBuilder.append((String)localObject6);
      localObject1 = localStringBuilder.append(localObject1);
      localObject4 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject4 = ((StringBuilder)localObject4).toString();
      ((IOException)localObject5).<init>((String)localObject4);
      throw ((Throwable)localObject5);
      localObject5 = this.inProgress;
      bool2 = ((File)localObject5).exists();
      if (!bool2) {
        localObject4 = " (source does not exist)";
      }
    }
  }
  
  public void closeInProgressStream()
  {
    boolean bool = this.closed;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      this.closed = bool;
      super.flush();
      super.close();
    }
  }
  
  public File getCompleteFile()
  {
    return this.complete;
  }
  
  public File getInProgressFile()
  {
    return this.inProgress;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\ClsFileOutputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */