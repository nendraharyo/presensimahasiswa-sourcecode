package com.crashlytics.android.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

final class ByteString
{
  public static final ByteString EMPTY;
  private final byte[] bytes;
  private volatile int hash = 0;
  
  static
  {
    ByteString localByteString = new com/crashlytics/android/core/ByteString;
    byte[] arrayOfByte = new byte[0];
    localByteString.<init>(arrayOfByte);
    EMPTY = localByteString;
  }
  
  private ByteString(byte[] paramArrayOfByte)
  {
    this.bytes = paramArrayOfByte;
  }
  
  public static ByteString copyFrom(String paramString1, String paramString2)
  {
    ByteString localByteString = new com/crashlytics/android/core/ByteString;
    byte[] arrayOfByte = paramString1.getBytes(paramString2);
    localByteString.<init>(arrayOfByte);
    return localByteString;
  }
  
  public static ByteString copyFrom(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.remaining();
    return copyFrom(paramByteBuffer, i);
  }
  
  public static ByteString copyFrom(ByteBuffer paramByteBuffer, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramByteBuffer.get(arrayOfByte);
    ByteString localByteString = new com/crashlytics/android/core/ByteString;
    localByteString.<init>(arrayOfByte);
    return localByteString;
  }
  
  public static ByteString copyFrom(List paramList)
  {
    int i = paramList.size();
    ByteString localByteString;
    if (i == 0) {
      localByteString = EMPTY;
    }
    for (;;)
    {
      return localByteString;
      i = paramList.size();
      int m = 1;
      if (i == m)
      {
        localByteString = (ByteString)paramList.get(0);
      }
      else
      {
        Object localObject = paramList.iterator();
        int j;
        for (m = 0;; m = j)
        {
          boolean bool1 = ((Iterator)localObject).hasNext();
          if (!bool1) {
            break;
          }
          localByteString = (ByteString)((Iterator)localObject).next();
          j = localByteString.size() + m;
        }
        localObject = new byte[m];
        Iterator localIterator = paramList.iterator();
        int k;
        for (m = 0;; m = k)
        {
          boolean bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localByteString = (ByteString)localIterator.next();
          byte[] arrayOfByte = localByteString.bytes;
          int n = localByteString.size();
          System.arraycopy(arrayOfByte, 0, localObject, m, n);
          k = localByteString.size() + m;
        }
        localByteString = new com/crashlytics/android/core/ByteString;
        localByteString.<init>((byte[])localObject);
      }
    }
  }
  
  public static ByteString copyFrom(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return copyFrom(paramArrayOfByte, 0, i);
  }
  
  public static ByteString copyFrom(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    ByteString localByteString = new com/crashlytics/android/core/ByteString;
    localByteString.<init>(arrayOfByte);
    return localByteString;
  }
  
  public static ByteString copyFromUtf8(String paramString)
  {
    try
    {
      ByteString localByteString = new com/crashlytics/android/core/ByteString;
      localObject = "UTF-8";
      localObject = paramString.getBytes((String)localObject);
      localByteString.<init>((byte[])localObject);
      return localByteString;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("UTF-8 not supported.", localUnsupportedEncodingException);
      throw ((Throwable)localObject);
    }
  }
  
  static ByteString.CodedBuilder newCodedBuilder(int paramInt)
  {
    ByteString.CodedBuilder localCodedBuilder = new com/crashlytics/android/core/ByteString$CodedBuilder;
    localCodedBuilder.<init>(paramInt, null);
    return localCodedBuilder;
  }
  
  public static ByteString.Output newOutput()
  {
    return newOutput(32);
  }
  
  public static ByteString.Output newOutput(int paramInt)
  {
    ByteString.Output localOutput = new com/crashlytics/android/core/ByteString$Output;
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>(paramInt);
    localOutput.<init>(localByteArrayOutputStream, null);
    return localOutput;
  }
  
  public ByteBuffer asReadOnlyByteBuffer()
  {
    return ByteBuffer.wrap(this.bytes).asReadOnlyBuffer();
  }
  
  public byte byteAt(int paramInt)
  {
    return this.bytes[paramInt];
  }
  
  public void copyTo(ByteBuffer paramByteBuffer)
  {
    byte[] arrayOfByte = this.bytes;
    int i = this.bytes.length;
    paramByteBuffer.put(arrayOfByte, 0, i);
  }
  
  public void copyTo(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = this.bytes;
    int i = this.bytes.length;
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt, i);
  }
  
  public void copyTo(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(this.bytes, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    label108:
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof ByteString;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (ByteString)paramObject;
        int j = this.bytes.length;
        byte[] arrayOfByte1 = ((ByteString)paramObject).bytes;
        int i = arrayOfByte1.length;
        if (j != i)
        {
          bool1 = false;
        }
        else
        {
          byte[] arrayOfByte2 = this.bytes;
          byte[] arrayOfByte3 = ((ByteString)paramObject).bytes;
          i = 0;
          arrayOfByte1 = null;
          for (;;)
          {
            if (i >= j) {
              break label108;
            }
            int k = arrayOfByte2[i];
            int m = arrayOfByte3[i];
            if (k != m)
            {
              bool1 = false;
              break;
            }
            i += 1;
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.hash;
    if (i == 0)
    {
      byte[] arrayOfByte = this.bytes;
      int j = this.bytes.length;
      int k = 0;
      int m;
      for (i = j; k < j; i = m)
      {
        i *= 31;
        m = arrayOfByte[k] + i;
        k += 1;
      }
      if (i == 0) {
        i = 1;
      }
      this.hash = i;
    }
    return i;
  }
  
  public boolean isEmpty()
  {
    byte[] arrayOfByte = this.bytes;
    int i = arrayOfByte.length;
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      arrayOfByte = null;
    }
  }
  
  public InputStream newInput()
  {
    ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
    byte[] arrayOfByte = this.bytes;
    localByteArrayInputStream.<init>(arrayOfByte);
    return localByteArrayInputStream;
  }
  
  public int size()
  {
    return this.bytes.length;
  }
  
  public byte[] toByteArray()
  {
    int i = this.bytes.length;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(this.bytes, 0, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public String toString(String paramString)
  {
    String str = new java/lang/String;
    byte[] arrayOfByte = this.bytes;
    str.<init>(arrayOfByte, paramString);
    return str;
  }
  
  public String toStringUtf8()
  {
    try
    {
      String str1 = new java/lang/String;
      localObject = this.bytes;
      String str2 = "UTF-8";
      str1.<init>((byte[])localObject, str2);
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("UTF-8 not supported?", localUnsupportedEncodingException);
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\ByteString.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */