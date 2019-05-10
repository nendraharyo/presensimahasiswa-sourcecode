package com.loopj.android.http;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Base64OutputStream
  extends FilterOutputStream
{
  private static final byte[] EMPTY = new byte[0];
  private int bpos;
  private byte[] buffer = null;
  private final Base64.Coder coder;
  private final int flags;
  
  public Base64OutputStream(OutputStream paramOutputStream, int paramInt)
  {
    this(paramOutputStream, paramInt, true);
  }
  
  public Base64OutputStream(OutputStream paramOutputStream, int paramInt, boolean paramBoolean)
  {
    super(paramOutputStream);
    Object localObject = null;
    this.bpos = 0;
    this.flags = paramInt;
    if (paramBoolean)
    {
      localObject = new com/loopj/android/http/Base64$Encoder;
      ((Base64.Encoder)localObject).<init>(paramInt, null);
    }
    for (this.coder = ((Base64.Coder)localObject);; this.coder = ((Base64.Coder)localObject))
    {
      return;
      localObject = new com/loopj/android/http/Base64$Decoder;
      ((Base64.Decoder)localObject).<init>(paramInt, null);
    }
  }
  
  private byte[] embiggen(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte != null)
    {
      int i = paramArrayOfByte.length;
      if (i >= paramInt) {}
    }
    else
    {
      paramArrayOfByte = new byte[paramInt];
    }
    return paramArrayOfByte;
  }
  
  private void flushBuffer()
  {
    int i = this.bpos;
    if (i > 0)
    {
      byte[] arrayOfByte = this.buffer;
      int j = this.bpos;
      internalWrite(arrayOfByte, 0, j, false);
      this.bpos = 0;
    }
  }
  
  private void internalWrite(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject = this.coder;
    byte[] arrayOfByte = this.coder.output;
    Base64.Coder localCoder = this.coder;
    int i = localCoder.maxOutputSize(paramInt2);
    arrayOfByte = embiggen(arrayOfByte, i);
    ((Base64.Coder)localObject).output = arrayOfByte;
    localObject = this.coder;
    boolean bool = ((Base64.Coder)localObject).process(paramArrayOfByte, paramInt1, paramInt2, paramBoolean);
    if (!bool)
    {
      localObject = new com/loopj/android/http/Base64DataException;
      ((Base64DataException)localObject).<init>("bad base-64");
      throw ((Throwable)localObject);
    }
    localObject = this.out;
    arrayOfByte = this.coder.output;
    int j = this.coder.op;
    ((OutputStream)localObject).write(arrayOfByte, 0, j);
  }
  
  public void close()
  {
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        flushBuffer();
        localObject2 = EMPTY;
        boolean bool = true;
        internalWrite((byte[])localObject2, 0, 0, bool);
      }
      catch (IOException localIOException1)
      {
        Object localObject2;
        int i;
        localObject1 = localIOException1;
        continue;
        OutputStream localOutputStream = this.out;
        localOutputStream.flush();
        continue;
      }
      try
      {
        i = this.flags & 0x10;
        if (i != 0) {
          continue;
        }
        localObject2 = this.out;
        ((OutputStream)localObject2).close();
        localObject2 = localObject1;
      }
      catch (IOException localIOException2)
      {
        if (localObject1 != null) {
          continue;
        }
        Object localObject3 = localObject1;
      }
    }
    if (localObject2 != null) {
      throw ((Throwable)localObject2);
    }
  }
  
  public void write(int paramInt)
  {
    int i = 0;
    byte[] arrayOfByte1 = this.buffer;
    if (arrayOfByte1 == null)
    {
      j = 1024;
      arrayOfByte1 = new byte[j];
      this.buffer = arrayOfByte1;
    }
    int j = this.bpos;
    byte[] arrayOfByte2 = this.buffer;
    int k = arrayOfByte2.length;
    if (j >= k)
    {
      arrayOfByte1 = this.buffer;
      k = this.bpos;
      internalWrite(arrayOfByte1, 0, k, false);
      this.bpos = 0;
    }
    arrayOfByte1 = this.buffer;
    k = this.bpos;
    i = k + 1;
    this.bpos = i;
    i = (byte)paramInt;
    arrayOfByte1[k] = i;
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0) {}
    for (;;)
    {
      return;
      flushBuffer();
      internalWrite(paramArrayOfByte, paramInt1, paramInt2, false);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\Base64OutputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */