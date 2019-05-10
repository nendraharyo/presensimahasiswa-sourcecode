package com.github.barteksc.pdfviewer.util;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils
{
  public static void copy(InputStream paramInputStream, File paramFile)
  {
    int i = 0;
    for (;;)
    {
      try
      {
        localFileOutputStream = new java/io/FileOutputStream;
        localFileOutputStream.<init>(paramFile);
        int j = 1024;
        try
        {
          byte[] arrayOfByte = new byte[j];
          i = paramInputStream.read(arrayOfByte);
          int k = -1;
          if (i != k)
          {
            k = 0;
            localFileOutputStream.write(arrayOfByte, 0, i);
            continue;
            if (paramInputStream == null) {}
          }
        }
        finally {}
      }
      finally
      {
        FileOutputStream localFileOutputStream = null;
        continue;
      }
      try
      {
        paramInputStream.close();
        if (localFileOutputStream != null) {
          localFileOutputStream.close();
        }
        throw ((Throwable)localObject1);
      }
      finally
      {
        if (localFileOutputStream == null) {
          continue;
        }
        localFileOutputStream.close();
      }
    }
    if (paramInputStream != null) {}
    try
    {
      paramInputStream.close();
      return;
    }
    finally
    {
      if (localFileOutputStream != null) {
        localFileOutputStream.close();
      }
    }
  }
  
  public static File fileFromAsset(Context paramContext, String paramString)
  {
    File localFile = new java/io/File;
    Object localObject1 = paramContext.getCacheDir();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append(paramString);
    String str = "-pdfview.pdf";
    localObject2 = str;
    localFile.<init>((File)localObject1, (String)localObject2);
    localObject1 = "/";
    boolean bool = paramString.contains((CharSequence)localObject1);
    if (bool)
    {
      localObject1 = localFile.getParentFile();
      ((File)localObject1).mkdirs();
    }
    copy(paramContext.getAssets().open(paramString), localFile);
    return localFile;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewe\\util\FileUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */