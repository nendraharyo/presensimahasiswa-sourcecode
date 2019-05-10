package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bumptech.glide.disklrucache.DiskLruCache.Editor;
import com.bumptech.glide.disklrucache.DiskLruCache.Value;
import com.bumptech.glide.load.Key;
import java.io.File;
import java.io.IOException;

public class DiskLruCacheWrapper
  implements DiskCache
{
  private static final int APP_VERSION = 1;
  private static final String TAG = "DiskLruCacheWrapper";
  private static final int VALUE_COUNT = 1;
  private static DiskLruCacheWrapper wrapper;
  private final File directory;
  private DiskLruCache diskLruCache;
  private final long maxSize;
  private final SafeKeyGenerator safeKeyGenerator;
  private final DiskCacheWriteLocker writeLocker;
  
  protected DiskLruCacheWrapper(File paramFile, long paramLong)
  {
    Object localObject = new com/bumptech/glide/load/engine/cache/DiskCacheWriteLocker;
    ((DiskCacheWriteLocker)localObject).<init>();
    this.writeLocker = ((DiskCacheWriteLocker)localObject);
    this.directory = paramFile;
    this.maxSize = paramLong;
    localObject = new com/bumptech/glide/load/engine/cache/SafeKeyGenerator;
    ((SafeKeyGenerator)localObject).<init>();
    this.safeKeyGenerator = ((SafeKeyGenerator)localObject);
  }
  
  public static DiskCache create(File paramFile, long paramLong)
  {
    DiskLruCacheWrapper localDiskLruCacheWrapper = new com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper;
    localDiskLruCacheWrapper.<init>(paramFile, paramLong);
    return localDiskLruCacheWrapper;
  }
  
  public static DiskCache get(File paramFile, long paramLong)
  {
    synchronized (DiskLruCacheWrapper.class)
    {
      DiskLruCacheWrapper localDiskLruCacheWrapper = wrapper;
      if (localDiskLruCacheWrapper == null)
      {
        localDiskLruCacheWrapper = new com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper;
        localDiskLruCacheWrapper.<init>(paramFile, paramLong);
        wrapper = localDiskLruCacheWrapper;
      }
      localDiskLruCacheWrapper = wrapper;
      return localDiskLruCacheWrapper;
    }
  }
  
  private DiskLruCache getDiskCache()
  {
    try
    {
      Object localObject1 = this.diskLruCache;
      if (localObject1 == null)
      {
        localObject1 = this.directory;
        int i = 1;
        int j = 1;
        long l = this.maxSize;
        localObject1 = DiskLruCache.open((File)localObject1, i, j, l);
        this.diskLruCache = ((DiskLruCache)localObject1);
      }
      localObject1 = this.diskLruCache;
      return (DiskLruCache)localObject1;
    }
    finally {}
  }
  
  private void resetDiskCache()
  {
    Object localObject1 = null;
    try
    {
      this.diskLruCache = null;
      return;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  /* Error */
  public void clear()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 63	com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper:getDiskCache	()Lcom/bumptech/glide/disklrucache/DiskLruCache;
    //   6: astore_1
    //   7: aload_1
    //   8: invokevirtual 66	com/bumptech/glide/disklrucache/DiskLruCache:delete	()V
    //   11: aload_0
    //   12: invokespecial 69	com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper:resetDiskCache	()V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: astore_1
    //   19: ldc 14
    //   21: astore_2
    //   22: iconst_5
    //   23: istore_3
    //   24: aload_2
    //   25: iload_3
    //   26: invokestatic 76	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   29: istore 4
    //   31: iload 4
    //   33: ifeq +18 -> 51
    //   36: ldc 14
    //   38: astore_2
    //   39: ldc 78
    //   41: astore 5
    //   43: aload_2
    //   44: aload 5
    //   46: aload_1
    //   47: invokestatic 82	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   50: pop
    //   51: aload_0
    //   52: invokespecial 69	com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper:resetDiskCache	()V
    //   55: goto -40 -> 15
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    //   63: astore_1
    //   64: aload_0
    //   65: invokespecial 69	com/bumptech/glide/load/engine/cache/DiskLruCacheWrapper:resetDiskCache	()V
    //   68: aload_1
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	DiskLruCacheWrapper
    //   6	2	1	localDiskLruCache	DiskLruCache
    //   18	29	1	localIOException	IOException
    //   58	4	1	localObject1	Object
    //   63	6	1	localObject2	Object
    //   21	23	2	str1	String
    //   23	3	3	i	int
    //   29	3	4	bool	boolean
    //   41	4	5	str2	String
    // Exception table:
    //   from	to	target	type
    //   2	6	18	java/io/IOException
    //   7	11	18	java/io/IOException
    //   11	15	58	finally
    //   51	55	58	finally
    //   64	68	58	finally
    //   68	70	58	finally
    //   2	6	63	finally
    //   7	11	63	finally
    //   25	29	63	finally
    //   46	51	63	finally
  }
  
  public void delete(Key paramKey)
  {
    String str1 = this.safeKeyGenerator.getSafeKey(paramKey);
    try
    {
      localObject = getDiskCache();
      ((DiskLruCache)localObject).remove(str1);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject = "DiskLruCacheWrapper";
        int i = 5;
        boolean bool = Log.isLoggable((String)localObject, i);
        if (bool)
        {
          localObject = "DiskLruCacheWrapper";
          String str2 = "Unable to delete from disk cache";
          Log.w((String)localObject, str2, localIOException);
        }
      }
    }
  }
  
  public File get(Key paramKey)
  {
    Object localObject1 = this.safeKeyGenerator.getSafeKey(paramKey);
    Object localObject2 = "DiskLruCacheWrapper";
    int i = 2;
    boolean bool2 = Log.isLoggable((String)localObject2, i);
    if (bool2)
    {
      localObject2 = "DiskLruCacheWrapper";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("Get: Obtained: ").append((String)localObject1);
      str = " for for Key: ";
      localObject3 = str + paramKey;
      Log.v((String)localObject2, (String)localObject3);
    }
    bool2 = false;
    localObject2 = null;
    try
    {
      localObject3 = getDiskCache();
      localObject1 = ((DiskLruCache)localObject3).get((String)localObject1);
      if (localObject1 != null)
      {
        i = 0;
        localObject3 = null;
        localObject2 = ((DiskLruCache.Value)localObject1).getFile(0);
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localObject3 = "DiskLruCacheWrapper";
        int j = 5;
        boolean bool1 = Log.isLoggable((String)localObject3, j);
        if (bool1)
        {
          localObject3 = "DiskLruCacheWrapper";
          str = "Unable to get from disk cache";
          Log.w((String)localObject3, str, localIOException);
        }
      }
    }
    return (File)localObject2;
  }
  
  public void put(Key paramKey, DiskCache.Writer paramWriter)
  {
    str1 = this.safeKeyGenerator.getSafeKey(paramKey);
    this.writeLocker.acquire(str1);
    Object localObject1 = "DiskLruCacheWrapper";
    int i = 2;
    for (;;)
    {
      try
      {
        bool2 = Log.isLoggable((String)localObject1, i);
        if (bool2)
        {
          localObject1 = "DiskLruCacheWrapper";
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          str2 = "Put: Obtained: ";
          localObject5 = ((StringBuilder)localObject5).append(str2);
          localObject5 = ((StringBuilder)localObject5).append(str1);
          str2 = " for for Key: ";
          localObject5 = ((StringBuilder)localObject5).append(str2);
          localObject5 = ((StringBuilder)localObject5).append(paramKey);
          localObject5 = ((StringBuilder)localObject5).toString();
          Log.v((String)localObject1, (String)localObject5);
        }
      }
      finally
      {
        try
        {
          String str2;
          int j;
          boolean bool1;
          Object localObject2 = ((DiskLruCache.Editor)localObject5).getFile(0);
          boolean bool2 = paramWriter.write((File)localObject2);
          if (bool2) {
            ((DiskLruCache.Editor)localObject5).commit();
          }
          ((DiskLruCache.Editor)localObject5).abortUnlessCommitted();
          continue;
        }
        finally
        {
          Object localObject5;
          ((DiskLruCache.Editor)localObject5).abortUnlessCommitted();
        }
        localObject3 = finally;
        this.writeLocker.release(str1);
      }
      try
      {
        localObject1 = getDiskCache();
        localObject5 = ((DiskLruCache)localObject1).get(str1);
        if (localObject5 != null)
        {
          localObject1 = this.writeLocker;
          ((DiskCacheWriteLocker)localObject1).release(str1);
          return;
        }
      }
      catch (IOException localIOException)
      {
        localObject5 = "DiskLruCacheWrapper";
        j = 5;
        bool1 = Log.isLoggable((String)localObject5, j);
        if (!bool1) {
          continue;
        }
        localObject5 = "DiskLruCacheWrapper";
        str2 = "Unable to put to disk cache";
        Log.w((String)localObject5, str2, localIOException);
        localObject2 = this.writeLocker;
        ((DiskCacheWriteLocker)localObject2).release(str1);
        continue;
        bool2 = false;
        localObject2 = null;
      }
    }
    localObject5 = ((DiskLruCache)localObject1).edit(str1);
    if (localObject5 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      str2 = "Had two simultaneous puts for: ";
      localObject5 = ((StringBuilder)localObject5).append(str2);
      localObject5 = ((StringBuilder)localObject5).append(str1);
      localObject5 = ((StringBuilder)localObject5).toString();
      ((IllegalStateException)localObject1).<init>((String)localObject5);
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\DiskLruCacheWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */