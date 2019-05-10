package com.loopj.android.http;

import android.content.Context;
import b.a.a.a.e;
import b.a.a.a.k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

public abstract class FileAsyncHttpResponseHandler
  extends AsyncHttpResponseHandler
{
  private static final String LOG_TAG = "FileAsyncHttpRH";
  protected final boolean append;
  protected final File file;
  protected File frontendFile;
  protected final boolean renameIfExists;
  
  public FileAsyncHttpResponseHandler(Context paramContext)
  {
    File localFile = getTemporaryFile(paramContext);
    this.file = localFile;
    this.append = false;
    this.renameIfExists = false;
  }
  
  public FileAsyncHttpResponseHandler(File paramFile)
  {
    this(paramFile, false);
  }
  
  public FileAsyncHttpResponseHandler(File paramFile, boolean paramBoolean)
  {
    this(paramFile, paramBoolean, false);
  }
  
  public FileAsyncHttpResponseHandler(File paramFile, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paramFile, paramBoolean1, paramBoolean2, false);
  }
  
  public FileAsyncHttpResponseHandler(File paramFile, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramBoolean3);
    boolean bool;
    if (paramFile != null) {
      bool = true;
    }
    for (;;)
    {
      String str1 = "File passed into FileAsyncHttpResponseHandler constructor must not be null";
      Utils.asserts(bool, str1);
      bool = paramFile.isDirectory();
      if (!bool)
      {
        localObject = paramFile.getParentFile();
        bool = ((File)localObject).isDirectory();
        if (!bool)
        {
          localObject = paramFile.getParentFile();
          bool = ((File)localObject).mkdirs();
          str1 = "Cannot create parent directories for requested File location";
          Utils.asserts(bool, str1);
        }
      }
      bool = paramFile.isDirectory();
      if (bool)
      {
        bool = paramFile.mkdirs();
        if (!bool)
        {
          localObject = AsyncHttpClient.log;
          str1 = "FileAsyncHttpRH";
          String str2 = "Cannot create directories for requested Directory location, might not be a problem";
          ((LogInterface)localObject).d(str1, str2);
        }
      }
      this.file = paramFile;
      this.append = paramBoolean1;
      this.renameIfExists = paramBoolean2;
      return;
      bool = false;
      Object localObject = null;
    }
  }
  
  public boolean deleteTargetFile()
  {
    File localFile = getTargetFile();
    boolean bool;
    if (localFile != null)
    {
      localFile = getTargetFile();
      bool = localFile.delete();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localFile = null;
    }
  }
  
  protected File getOriginalFile()
  {
    File localFile = this.file;
    boolean bool;
    if (localFile != null) {
      bool = true;
    }
    for (;;)
    {
      Utils.asserts(bool, "Target file is null, fatal!");
      return this.file;
      bool = false;
      localFile = null;
    }
  }
  
  protected byte[] getResponseData(k paramk)
  {
    int i = 0;
    Object localObject1 = null;
    if (paramk != null)
    {
      InputStream localInputStream = paramk.getContent();
      long l1 = paramk.getContentLength();
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      Object localObject3 = getTargetFile();
      boolean bool1 = this.append;
      localFileOutputStream.<init>((File)localObject3, bool1);
      if (localInputStream != null)
      {
        int k = 4096;
        try
        {
          localObject3 = new byte[k];
          for (;;)
          {
            int j = localInputStream.read((byte[])localObject3);
            int m = -1;
            if (j == m) {
              break;
            }
            Thread localThread = Thread.currentThread();
            boolean bool2 = localThread.isInterrupted();
            if (bool2) {
              break;
            }
            i += j;
            bool2 = false;
            localThread = null;
            localFileOutputStream.write((byte[])localObject3, 0, j);
            long l2 = i;
            sendProgressMessage(l2, l1);
          }
          AsyncHttpClient.silentCloseInputStream(localInputStream);
        }
        finally
        {
          AsyncHttpClient.silentCloseInputStream(localInputStream);
          localFileOutputStream.flush();
          AsyncHttpClient.silentCloseOutputStream(localFileOutputStream);
        }
        localFileOutputStream.flush();
        AsyncHttpClient.silentCloseOutputStream(localFileOutputStream);
      }
    }
    return null;
  }
  
  public File getTargetFile()
  {
    File localFile = this.frontendFile;
    if (localFile == null)
    {
      localFile = getOriginalFile();
      boolean bool = localFile.isDirectory();
      if (!bool) {
        break label38;
      }
    }
    label38:
    for (localFile = getTargetFileByParsingURL();; localFile = getOriginalFile())
    {
      this.frontendFile = localFile;
      return this.frontendFile;
    }
  }
  
  protected File getTargetFileByParsingURL()
  {
    int i = 46;
    boolean bool1 = true;
    boolean bool2 = getOriginalFile().isDirectory();
    String str = "Target file is not a directory, cannot proceed";
    Utils.asserts(bool2, str);
    Object localObject1 = getRequestURI();
    int m;
    Object localObject2;
    if (localObject1 != null)
    {
      bool2 = bool1;
      Utils.asserts(bool2, "RequestURI is null, cannot proceed");
      localObject1 = getRequestURI().toString();
      m = ((String)localObject1).lastIndexOf('/') + 1;
      int n = ((String)localObject1).length();
      str = ((String)localObject1).substring(m, n);
      localObject1 = new java/io/File;
      localObject2 = getOriginalFile();
      ((File)localObject1).<init>((File)localObject2, str);
      boolean bool3 = ((File)localObject1).exists();
      if (bool3)
      {
        bool3 = this.renameIfExists;
        if (bool3)
        {
          localObject1 = ".";
          bool2 = str.contains((CharSequence)localObject1);
          if (bool2) {
            break label253;
          }
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append(str);
          str = " (%d)";
          localObject1 = str;
          label174:
          m = 0;
          str = null;
        }
      }
    }
    for (;;)
    {
      localObject2 = new java/io/File;
      File localFile = getOriginalFile();
      Object localObject3 = new Object[bool1];
      Integer localInteger = Integer.valueOf(m);
      localObject3[0] = localInteger;
      localObject3 = String.format((String)localObject1, (Object[])localObject3);
      ((File)localObject2).<init>(localFile, (String)localObject3);
      int j = ((File)localObject2).exists();
      if (j == 0)
      {
        localObject1 = localObject2;
        return (File)localObject1;
        bool2 = false;
        localObject1 = null;
        break;
        label253:
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        int i1 = str.lastIndexOf(j);
        localObject2 = str.substring(0, i1);
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = " (%d)";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        i1 = str.lastIndexOf(j);
        int k = str.length();
        str = str.substring(i1, k);
        localObject1 = str;
        break label174;
      }
      m += 1;
    }
  }
  
  protected File getTemporaryFile(Context paramContext)
  {
    if (paramContext != null) {
      bool = true;
    }
    for (;;)
    {
      Utils.asserts(bool, "Tried creating temporary file without having Context");
      Object localObject1 = "temp_";
      localObject3 = "_handled";
      try
      {
        localObject4 = paramContext.getCacheDir();
        localObject1 = File.createTempFile((String)localObject1, (String)localObject3, (File)localObject4);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localObject3 = AsyncHttpClient.log;
          Object localObject4 = "FileAsyncHttpRH";
          String str = "Cannot create temporary file";
          ((LogInterface)localObject3).e((String)localObject4, str, localIOException);
          bool = false;
          Object localObject2 = null;
        }
      }
      return (File)localObject1;
      bool = false;
      localObject1 = null;
    }
  }
  
  public abstract void onFailure(int paramInt, e[] paramArrayOfe, Throwable paramThrowable, File paramFile);
  
  public final void onFailure(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    File localFile = getTargetFile();
    onFailure(paramInt, paramArrayOfe, paramThrowable, localFile);
  }
  
  public abstract void onSuccess(int paramInt, e[] paramArrayOfe, File paramFile);
  
  public final void onSuccess(int paramInt, e[] paramArrayOfe, byte[] paramArrayOfByte)
  {
    File localFile = getTargetFile();
    onSuccess(paramInt, paramArrayOfe, localFile);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\FileAsyncHttpResponseHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */