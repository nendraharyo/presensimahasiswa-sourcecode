package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ContentLengthInputStream
  extends FilterInputStream
{
  private static final String TAG = "ContentLengthStream";
  private static final int UNKNOWN = 255;
  private final long contentLength;
  private int readSoFar;
  
  private ContentLengthInputStream(InputStream paramInputStream, long paramLong)
  {
    super(paramInputStream);
    this.contentLength = paramLong;
  }
  
  private int checkReadSoFarOrThrow(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = this.readSoFar + paramInt;
      this.readSoFar = i;
    }
    boolean bool;
    do
    {
      return paramInt;
      long l1 = this.contentLength;
      j = this.readSoFar;
      l2 = j;
      l1 -= l2;
      l2 = 0L;
      bool = l1 < l2;
    } while (!bool);
    IOException localIOException = new java/io/IOException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Failed to read all expected data, expected: ");
    long l2 = this.contentLength;
    localObject = ((StringBuilder)localObject).append(l2).append(", but read: ");
    int j = this.readSoFar;
    localObject = j;
    localIOException.<init>((String)localObject);
    throw localIOException;
  }
  
  public static InputStream obtain(InputStream paramInputStream, long paramLong)
  {
    ContentLengthInputStream localContentLengthInputStream = new com/bumptech/glide/util/ContentLengthInputStream;
    localContentLengthInputStream.<init>(paramInputStream, paramLong);
    return localContentLengthInputStream;
  }
  
  public static InputStream obtain(InputStream paramInputStream, String paramString)
  {
    long l = parseContentLength(paramString);
    return obtain(paramInputStream, l);
  }
  
  private static int parseContentLength(String paramString)
  {
    int i = -1;
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (!bool1) {}
    try
    {
      i = Integer.parseInt(paramString);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        String str1 = "ContentLengthStream";
        int j = 3;
        boolean bool2 = Log.isLoggable(str1, j);
        if (bool2)
        {
          str1 = "ContentLengthStream";
          Object localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          String str2 = "failed to parse content length header: ";
          localObject = str2 + paramString;
          Log.d(str1, (String)localObject, localNumberFormatException);
        }
      }
    }
    return i;
  }
  
  public int available()
  {
    try
    {
      long l1 = this.contentLength;
      int i = this.readSoFar;
      long l2 = i;
      l1 -= l2;
      InputStream localInputStream = this.in;
      i = localInputStream.available();
      l2 = i;
      int j = (int)Math.max(l1, l2);
      return j;
    }
    finally {}
  }
  
  /* Error */
  public int read()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 107	java/io/FilterInputStream:read	()I
    //   6: istore_1
    //   7: iload_1
    //   8: iflt +15 -> 23
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: iload_2
    //   15: invokespecial 112	com/bumptech/glide/util/ContentLengthInputStream:checkReadSoFarOrThrow	(I)I
    //   18: pop
    //   19: aload_0
    //   20: monitorexit
    //   21: iload_1
    //   22: ireturn
    //   23: iconst_m1
    //   24: istore_2
    //   25: goto -12 -> 13
    //   28: astore_3
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_3
    //   32: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	ContentLengthInputStream
    //   6	16	1	i	int
    //   12	13	2	j	int
    //   28	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	28	finally
    //   14	19	28	finally
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return read(paramArrayOfByte, 0, i);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      int i = super.read(paramArrayOfByte, paramInt1, paramInt2);
      i = checkReadSoFarOrThrow(i);
      return i;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\ContentLengthInputStream.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */