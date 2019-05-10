package com.bumptech.glide.disklrucache;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

public final class DiskLruCache$Editor
{
  private boolean committed;
  private final DiskLruCache.Entry entry;
  private final boolean[] written;
  
  private DiskLruCache$Editor(DiskLruCache paramDiskLruCache, DiskLruCache.Entry paramEntry)
  {
    this.entry = paramEntry;
    boolean bool = DiskLruCache.Entry.access$700(paramEntry);
    if (bool) {
      bool = false;
    }
    int i;
    for (boolean[] arrayOfBoolean = null;; arrayOfBoolean = new boolean[i])
    {
      this.written = arrayOfBoolean;
      return;
      i = DiskLruCache.access$1900(paramDiskLruCache);
    }
  }
  
  private InputStream newInputStream(int paramInt)
  {
    IllegalStateException localIllegalStateException = null;
    synchronized (this.this$0)
    {
      localObject2 = this.entry;
      localObject2 = DiskLruCache.Entry.access$800((DiskLruCache.Entry)localObject2);
      if (localObject2 != this)
      {
        localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>();
        throw localIllegalStateException;
      }
    }
    Object localObject2 = this.entry;
    boolean bool = DiskLruCache.Entry.access$700((DiskLruCache.Entry)localObject2);
    if (!bool) {}
    for (;;)
    {
      return localInputStream;
      try
      {
        localObject2 = new java/io/FileInputStream;
        Object localObject3 = this.entry;
        localObject3 = ((DiskLruCache.Entry)localObject3).getCleanFile(paramInt);
        ((FileInputStream)localObject2).<init>((File)localObject3);
        Object localObject1 = localObject2;
      }
      catch (FileNotFoundException localFileNotFoundException) {}
    }
  }
  
  public void abort()
  {
    DiskLruCache.access$2100(this.this$0, this, false);
  }
  
  public void abortUnlessCommitted()
  {
    boolean bool = this.committed;
    if (!bool) {}
    try
    {
      abort();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public void commit()
  {
    boolean bool = true;
    DiskLruCache.access$2100(this.this$0, this, bool);
    this.committed = bool;
  }
  
  public File getFile(int paramInt)
  {
    synchronized (this.this$0)
    {
      Object localObject1 = this.entry;
      localObject1 = DiskLruCache.Entry.access$800((DiskLruCache.Entry)localObject1);
      if (localObject1 != this)
      {
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    Object localObject3 = this.entry;
    boolean bool1 = DiskLruCache.Entry.access$700((DiskLruCache.Entry)localObject3);
    if (!bool1)
    {
      localObject3 = this.written;
      bool2 = true;
      localObject3[paramInt] = bool2;
    }
    localObject3 = this.entry;
    localObject3 = ((DiskLruCache.Entry)localObject3).getDirtyFile(paramInt);
    Object localObject4 = this.this$0;
    localObject4 = DiskLruCache.access$2000((DiskLruCache)localObject4);
    boolean bool2 = ((File)localObject4).exists();
    if (!bool2)
    {
      localObject4 = this.this$0;
      localObject4 = DiskLruCache.access$2000((DiskLruCache)localObject4);
      ((File)localObject4).mkdirs();
    }
    return (File)localObject3;
  }
  
  public String getString(int paramInt)
  {
    Object localObject = newInputStream(paramInt);
    if (localObject != null) {}
    for (localObject = DiskLruCache.access$1800((InputStream)localObject);; localObject = null) {
      return (String)localObject;
    }
  }
  
  public void set(int paramInt, String paramString)
  {
    try
    {
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      Object localObject3 = getFile(paramInt);
      localFileOutputStream.<init>((File)localObject3);
      localObject3 = new java/io/OutputStreamWriter;
      Charset localCharset = Util.UTF_8;
      ((OutputStreamWriter)localObject3).<init>(localFileOutputStream, localCharset);
      Util.closeQuietly((Closeable)localObject3);
    }
    finally
    {
      try
      {
        ((Writer)localObject3).write(paramString);
        Util.closeQuietly((Closeable)localObject3);
        return;
      }
      finally {}
      localObject1 = finally;
      localObject3 = null;
    }
    throw ((Throwable)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\disklrucache\DiskLruCache$Editor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */