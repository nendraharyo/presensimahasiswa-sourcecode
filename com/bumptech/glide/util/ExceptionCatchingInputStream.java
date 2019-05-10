package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class ExceptionCatchingInputStream
  extends InputStream
{
  private static final Queue QUEUE = Util.createQueue(0);
  private IOException exception;
  private InputStream wrapped;
  
  static void clearQueue()
  {
    for (;;)
    {
      Queue localQueue = QUEUE;
      boolean bool = localQueue.isEmpty();
      if (bool) {
        break;
      }
      localQueue = QUEUE;
      localQueue.remove();
    }
  }
  
  public static ExceptionCatchingInputStream obtain(InputStream paramInputStream)
  {
    synchronized (QUEUE)
    {
      Object localObject1 = QUEUE;
      localObject1 = ((Queue)localObject1).poll();
      localObject1 = (ExceptionCatchingInputStream)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new com/bumptech/glide/util/ExceptionCatchingInputStream;
        ((ExceptionCatchingInputStream)localObject1).<init>();
      }
      ((ExceptionCatchingInputStream)localObject1).setInputStream(paramInputStream);
      return (ExceptionCatchingInputStream)localObject1;
    }
  }
  
  public int available()
  {
    return this.wrapped.available();
  }
  
  public void close()
  {
    this.wrapped.close();
  }
  
  public IOException getException()
  {
    return this.exception;
  }
  
  public void mark(int paramInt)
  {
    this.wrapped.mark(paramInt);
  }
  
  public boolean markSupported()
  {
    return this.wrapped.markSupported();
  }
  
  public int read()
  {
    try
    {
      InputStream localInputStream = this.wrapped;
      i = localInputStream.read();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        this.exception = localIOException;
        int i = -1;
      }
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    try
    {
      InputStream localInputStream = this.wrapped;
      i = localInputStream.read(paramArrayOfByte);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        this.exception = localIOException;
        int i = -1;
      }
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      InputStream localInputStream = this.wrapped;
      i = localInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        this.exception = localIOException;
        int i = -1;
      }
    }
    return i;
  }
  
  public void release()
  {
    Queue localQueue1 = null;
    this.exception = null;
    this.wrapped = null;
    synchronized (QUEUE)
    {
      localQueue1 = QUEUE;
      localQueue1.offer(this);
      return;
    }
  }
  
  public void reset()
  {
    try
    {
      InputStream localInputStream = this.wrapped;
      localInputStream.reset();
      return;
    }
    finally {}
  }
  
  void setInputStream(InputStream paramInputStream)
  {
    this.wrapped = paramInputStream;
  }
  
  public long skip(long paramLong)
  {
    try
    {
      InputStream localInputStream = this.wrapped;
      l = localInputStream.skip(paramLong);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        this.exception = localIOException;
        long l = 0L;
      }
    }
    return l;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\ExceptionCatchingInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */