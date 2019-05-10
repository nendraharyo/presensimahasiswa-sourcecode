package org.apache.http.util;

import java.io.Serializable;

public final class ByteArrayBuffer
  implements Serializable
{
  private static final long serialVersionUID = 4359112959524048036L;
  private byte[] buffer;
  private int len;
  
  public ByteArrayBuffer(int paramInt)
  {
    Args.notNegative(paramInt, "Buffer capacity");
    byte[] arrayOfByte = new byte[paramInt];
    this.buffer = arrayOfByte;
  }
  
  private void expand(int paramInt)
  {
    byte[] arrayOfByte1 = new byte[Math.max(this.buffer.length << 1, paramInt)];
    byte[] arrayOfByte2 = this.buffer;
    int i = this.len;
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, i);
    this.buffer = arrayOfByte1;
  }
  
  public void append(int paramInt)
  {
    int i = this.len + 1;
    byte[] arrayOfByte = this.buffer;
    int j = arrayOfByte.length;
    if (i > j) {
      expand(i);
    }
    arrayOfByte = this.buffer;
    int k = this.len;
    int m = (byte)paramInt;
    arrayOfByte[k] = m;
    this.len = i;
  }
  
  public void append(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2)
  {
    if (paramCharArrayBuffer == null) {}
    for (;;)
    {
      return;
      char[] arrayOfChar = paramCharArrayBuffer.buffer();
      append(arrayOfChar, paramInt1, paramInt2);
    }
  }
  
  public void append(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      return;
      int i;
      int j;
      if (paramInt1 >= 0)
      {
        i = paramArrayOfByte.length;
        if ((paramInt1 <= i) && (paramInt2 >= 0))
        {
          i = paramInt1 + paramInt2;
          if (i >= 0)
          {
            i = paramInt1 + paramInt2;
            j = paramArrayOfByte.length;
            if (i <= j) {
              break label117;
            }
          }
        }
      }
      IndexOutOfBoundsException localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("off: ").append(paramInt1).append(" len: ").append(paramInt2).append(" b.length: ");
      int k = paramArrayOfByte.length;
      localObject = k;
      localIndexOutOfBoundsException.<init>((String)localObject);
      throw localIndexOutOfBoundsException;
      label117:
      if (paramInt2 != 0)
      {
        i = this.len + paramInt2;
        localObject = this.buffer;
        j = localObject.length;
        if (i > j) {
          expand(i);
        }
        localObject = this.buffer;
        k = this.len;
        System.arraycopy(paramArrayOfByte, paramInt1, localObject, k, paramInt2);
        this.len = i;
      }
    }
  }
  
  public void append(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramArrayOfChar == null) {}
    for (;;)
    {
      return;
      int i;
      int j;
      if (paramInt1 >= 0)
      {
        i = paramArrayOfChar.length;
        if ((paramInt1 <= i) && (paramInt2 >= 0))
        {
          i = paramInt1 + paramInt2;
          if (i >= 0)
          {
            i = paramInt1 + paramInt2;
            j = paramArrayOfChar.length;
            if (i <= j) {
              break label117;
            }
          }
        }
      }
      IndexOutOfBoundsException localIndexOutOfBoundsException = new java/lang/IndexOutOfBoundsException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("off: ").append(paramInt1).append(" len: ").append(paramInt2).append(" b.length: ");
      int k = paramArrayOfChar.length;
      localObject = k;
      localIndexOutOfBoundsException.<init>((String)localObject);
      throw localIndexOutOfBoundsException;
      label117:
      if (paramInt2 != 0)
      {
        i = this.len;
        j = i + paramInt2;
        byte[] arrayOfByte = this.buffer;
        k = arrayOfByte.length;
        if (j > k) {
          expand(j);
        }
        while (i < j)
        {
          arrayOfByte = this.buffer;
          int m = (byte)paramArrayOfChar[paramInt1];
          arrayOfByte[i] = m;
          paramInt1 += 1;
          i += 1;
        }
        this.len = j;
      }
    }
  }
  
  public byte[] buffer()
  {
    return this.buffer;
  }
  
  public int byteAt(int paramInt)
  {
    return this.buffer[paramInt];
  }
  
  public int capacity()
  {
    return this.buffer.length;
  }
  
  public void clear()
  {
    this.len = 0;
  }
  
  public void ensureCapacity(int paramInt)
  {
    if (paramInt <= 0) {}
    for (;;)
    {
      return;
      byte[] arrayOfByte = this.buffer;
      int i = arrayOfByte.length;
      int j = this.len;
      i -= j;
      if (paramInt > i)
      {
        i = this.len + paramInt;
        expand(i);
      }
    }
  }
  
  public int indexOf(byte paramByte)
  {
    int i = this.len;
    return indexOf(paramByte, 0, i);
  }
  
  public int indexOf(byte paramByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    int j = this.len;
    if (paramInt2 > j) {
      paramInt2 = this.len;
    }
    if (paramInt1 > paramInt2) {}
    label76:
    for (;;)
    {
      return i;
      j = paramInt1;
      for (;;)
      {
        if (j >= paramInt2) {
          break label76;
        }
        byte[] arrayOfByte = this.buffer;
        byte b = arrayOfByte[j];
        if (b == paramByte)
        {
          i = j;
          break;
        }
        j += 1;
      }
    }
  }
  
  public boolean isEmpty()
  {
    int i = this.len;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isFull()
  {
    int i = this.len;
    byte[] arrayOfByte = this.buffer;
    int k = arrayOfByte.length;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public int length()
  {
    return this.len;
  }
  
  public void setLength(int paramInt)
  {
    Object localObject1;
    if (paramInt >= 0)
    {
      localObject1 = this.buffer;
      int i = localObject1.length;
      if (paramInt <= i) {}
    }
    else
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("len: ").append(paramInt).append(" < 0 or > buffer len: ");
      int j = this.buffer.length;
      localObject2 = j;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.len = paramInt;
  }
  
  public byte[] toByteArray()
  {
    int i = this.len;
    byte[] arrayOfByte1 = new byte[i];
    int j = this.len;
    if (j > 0)
    {
      byte[] arrayOfByte2 = this.buffer;
      int k = this.len;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, k);
    }
    return arrayOfByte1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\htt\\util\ByteArrayBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */