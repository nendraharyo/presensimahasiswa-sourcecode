package io.fabric.sdk.android.services.persistence;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import java.io.File;

public class FileStoreImpl
  implements FileStore
{
  private final String contentPath;
  private final Context context;
  private final String legacySupport;
  
  public FileStoreImpl(Kit paramKit)
  {
    Object localObject = paramKit.getContext();
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot get directory before context has been set. Call Fabric.with() first");
      throw ((Throwable)localObject);
    }
    localObject = paramKit.getContext();
    this.context = ((Context)localObject);
    localObject = paramKit.getPath();
    this.contentPath = ((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Android/");
    String str = this.context.getPackageName();
    localObject = str;
    this.legacySupport = ((String)localObject);
  }
  
  public File getCacheDir()
  {
    File localFile = this.context.getCacheDir();
    return prepare(localFile);
  }
  
  public File getExternalCacheDir()
  {
    int i = 0;
    File localFile1 = null;
    boolean bool = isExternalStorageAvailable();
    if (bool)
    {
      i = Build.VERSION.SDK_INT;
      int j = 8;
      if (i < j) {
        break label39;
      }
      localFile1 = this.context.getExternalCacheDir();
    }
    for (;;)
    {
      return prepare(localFile1);
      label39:
      localFile1 = new java/io/File;
      File localFile2 = Environment.getExternalStorageDirectory();
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = this.legacySupport;
      localObject = ((StringBuilder)localObject).append(str).append("/cache/");
      str = this.contentPath;
      localObject = str;
      localFile1.<init>(localFile2, (String)localObject);
    }
  }
  
  public File getExternalFilesDir()
  {
    File localFile = null;
    boolean bool = isExternalStorageAvailable();
    Object localObject1;
    if (bool)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 8;
      if (i < j) {
        break label42;
      }
      localObject1 = this.context;
      localFile = ((Context)localObject1).getExternalFilesDir(null);
    }
    for (;;)
    {
      return prepare(localFile);
      label42:
      localFile = new java/io/File;
      localObject1 = Environment.getExternalStorageDirectory();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = this.legacySupport;
      localObject2 = ((StringBuilder)localObject2).append(str).append("/files/");
      str = this.contentPath;
      localObject2 = str;
      localFile.<init>((File)localObject1, (String)localObject2);
    }
  }
  
  public File getFilesDir()
  {
    File localFile = this.context.getFilesDir();
    return prepare(localFile);
  }
  
  boolean isExternalStorageAvailable()
  {
    Object localObject = Environment.getExternalStorageState();
    String str1 = "mounted";
    boolean bool = str1.equals(localObject);
    if (!bool)
    {
      localObject = Fabric.getLogger();
      str1 = "Fabric";
      String str2 = "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?";
      ((Logger)localObject).w(str1, str2);
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
  
  File prepare(File paramFile)
  {
    Logger localLogger;
    String str1;
    String str2;
    if (paramFile != null)
    {
      boolean bool = paramFile.exists();
      if (!bool)
      {
        bool = paramFile.mkdirs();
        if (!bool) {}
      }
      else
      {
        return paramFile;
      }
      localLogger = Fabric.getLogger();
      str1 = "Fabric";
      str2 = "Couldn't create file";
      localLogger.w(str1, str2);
    }
    for (;;)
    {
      paramFile = null;
      break;
      localLogger = Fabric.getLogger();
      str1 = "Fabric";
      str2 = "Null File";
      localLogger.d(str1, str2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\persistence\FileStoreImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */