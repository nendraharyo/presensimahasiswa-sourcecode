package org.apache.http.util;

import java.io.Serializable;
import org.apache.http.protocol.HTTP;

public final class CharArrayBuffer
  implements Serializable
{
  private static final long serialVersionUID = -6208952725094867135L;
  private char[] buffer;
  private int len;
  
  public CharArrayBuffer(int paramInt)
  {
    Args.notNegative(paramInt, "Buffer capacity");
    char[] arrayOfChar = new char[paramInt];
    this.buffer = arrayOfChar;
  }
  
  private void expand(int paramInt)
  {
    char[] arrayOfChar1 = new char[Math.max(this.buffer.length << 1, paramInt)];
    char[] arrayOfChar2 = this.buffer;
    int i = this.len;
    System.arraycopy(arrayOfChar2, 0, arrayOfChar1, 0, i);
    this.buffer = arrayOfChar1;
  }
  
  public void append(char paramChar)
  {
    int i = this.len + 1;
    char[] arrayOfChar = this.buffer;
    int j = arrayOfChar.length;
    if (i > j) {
      expand(i);
    }
    arrayOfChar = this.buffer;
    int k = this.len;
    arrayOfChar[k] = paramChar;
    this.len = i;
  }
  
  public void append(Object paramObject)
  {
    String str = String.valueOf(paramObject);
    append(str);
  }
  
  public void append(String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      int i = paramString.length();
      int j = this.len + i;
      char[] arrayOfChar1 = this.buffer;
      int k = arrayOfChar1.length;
      if (j > k) {
        expand(j);
      }
      char[] arrayOfChar2 = this.buffer;
      int m = this.len;
      paramString.getChars(0, i, arrayOfChar2, m);
      this.len = j;
      return;
      paramString = "null";
    }
  }
  
  public void append(ByteArrayBuffer paramByteArrayBuffer, int paramInt1, int paramInt2)
  {
    if (paramByteArrayBuffer == null) {}
    for (;;)
    {
      return;
      byte[] arrayOfByte = paramByteArrayBuffer.buffer();
      append(arrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public void append(CharArrayBuffer paramCharArrayBuffer)
  {
    if (paramCharArrayBuffer == null) {}
    for (;;)
    {
      return;
      char[] arrayOfChar = paramCharArrayBuffer.buffer;
      int i = paramCharArrayBuffer.len;
      append(arrayOfChar, 0, i);
    }
  }
  
  public void append(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2)
  {
    if (paramCharArrayBuffer == null) {}
    for (;;)
    {
      return;
      char[] arrayOfChar = paramCharArrayBuffer.buffer;
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
        i = this.len;
        j = i + paramInt2;
        char[] arrayOfChar = this.buffer;
        k = arrayOfChar.length;
        if (j > k) {
          expand(j);
        }
        while (i < j)
        {
          arrayOfChar = this.buffer;
          int m = (char)(paramArrayOfByte[paramInt1] & 0xFF);
          arrayOfChar[i] = m;
          paramInt1 += 1;
          i += 1;
        }
        this.len = j;
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
        i = this.len + paramInt2;
        localObject = this.buffer;
        j = localObject.length;
        if (i > j) {
          expand(i);
        }
        localObject = this.buffer;
        k = this.len;
        System.arraycopy(paramArrayOfChar, paramInt1, localObject, k, paramInt2);
        this.len = i;
      }
    }
  }
  
  public char[] buffer()
  {
    return this.buffer;
  }
  
  public int capacity()
  {
    return this.buffer.length;
  }
  
  public char charAt(int paramInt)
  {
    return this.buffer[paramInt];
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
      char[] arrayOfChar = this.buffer;
      int i = arrayOfChar.length;
      int j = this.len;
      i -= j;
      if (paramInt > i)
      {
        i = this.len + paramInt;
        expand(i);
      }
    }
  }
  
  public int indexOf(int paramInt)
  {
    int i = this.len;
    return indexOf(paramInt, 0, i);
  }
  
  public int indexOf(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = -1;
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }
    int j = this.len;
    if (paramInt3 > j) {
      paramInt3 = this.len;
    }
    if (paramInt2 > paramInt3) {}
    label76:
    for (;;)
    {
      return i;
      j = paramInt2;
      for (;;)
      {
        if (j >= paramInt3) {
          break label76;
        }
        char[] arrayOfChar = this.buffer;
        int k = arrayOfChar[j];
        if (k == paramInt1)
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
    char[] arrayOfChar = this.buffer;
    int k = arrayOfChar.length;
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
  
  public String substring(int paramInt1, int paramInt2)
  {
    String str = new java/lang/String;
    char[] arrayOfChar = this.buffer;
    int i = paramInt2 - paramInt1;
    str.<init>(arrayOfChar, paramInt1, i);
    return str;
  }
  
  public String substringTrimmed(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Negative beginIndex: " + paramInt1;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int i = this.len;
    if (paramInt2 > i)
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("endIndex: ").append(paramInt2).append(" > length: ");
      j = this.len;
      localObject2 = j;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    if (paramInt1 > paramInt2)
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "beginIndex: " + paramInt1 + " > endIndex: " + paramInt2;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    boolean bool;
    while (paramInt1 < paramInt2)
    {
      localObject1 = this.buffer;
      bool = HTTP.isWhitespace(localObject1[paramInt1]);
      if (!bool) {
        break;
      }
      paramInt1 += 1;
    }
    while (paramInt2 > paramInt1)
    {
      localObject1 = this.buffer;
      int k = paramInt2 + -1;
      bool = HTTP.isWhitespace(localObject1[k]);
      if (!bool) {
        break;
      }
      paramInt2 += -1;
    }
    Object localObject1 = new java/lang/String;
    Object localObject2 = this.buffer;
    int j = paramInt2 - paramInt1;
    ((String)localObject1).<init>((char[])localObject2, paramInt1, j);
    return (String)localObject1;
  }
  
  public char[] toCharArray()
  {
    int i = this.len;
    char[] arrayOfChar1 = new char[i];
    int j = this.len;
    if (j > 0)
    {
      char[] arrayOfChar2 = this.buffer;
      int k = this.len;
      System.arraycopy(arrayOfChar2, 0, arrayOfChar1, 0, k);
    }
    return arrayOfChar1;
  }
  
  public String toString()
  {
    String str = new java/lang/String;
    char[] arrayOfChar = this.buffer;
    int i = this.len;
    str.<init>(arrayOfChar, 0, i);
    return str;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\htt\\util\CharArrayBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */