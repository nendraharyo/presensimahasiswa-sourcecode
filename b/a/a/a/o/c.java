package b.a.a.a.o;

import java.io.Serializable;

public final class c
  implements Serializable
{
  private byte[] a;
  private int b;
  
  public c(int paramInt)
  {
    a.b(paramInt, "Buffer capacity");
    byte[] arrayOfByte = new byte[paramInt];
    this.a = arrayOfByte;
  }
  
  private void c(int paramInt)
  {
    byte[] arrayOfByte1 = new byte[Math.max(this.a.length << 1, paramInt)];
    byte[] arrayOfByte2 = this.a;
    int i = this.b;
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, i);
    this.a = arrayOfByte1;
  }
  
  public void a()
  {
    this.b = 0;
  }
  
  public void a(int paramInt)
  {
    int i = this.b + 1;
    byte[] arrayOfByte = this.a;
    int j = arrayOfByte.length;
    if (i > j) {
      c(i);
    }
    arrayOfByte = this.a;
    int k = this.b;
    int m = (byte)paramInt;
    arrayOfByte[k] = m;
    this.b = i;
  }
  
  public void a(d paramd, int paramInt1, int paramInt2)
  {
    if (paramd == null) {}
    for (;;)
    {
      return;
      char[] arrayOfChar = paramd.b();
      a(arrayOfChar, paramInt1, paramInt2);
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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
        i = this.b + paramInt2;
        localObject = this.a;
        j = localObject.length;
        if (i > j) {
          c(i);
        }
        localObject = this.a;
        k = this.b;
        System.arraycopy(paramArrayOfByte, paramInt1, localObject, k, paramInt2);
        this.b = i;
      }
    }
  }
  
  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
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
        i = this.b;
        j = i + paramInt2;
        byte[] arrayOfByte = this.a;
        k = arrayOfByte.length;
        if (j > k) {
          c(j);
        }
        while (i < j)
        {
          arrayOfByte = this.a;
          int m = (byte)paramArrayOfChar[paramInt1];
          arrayOfByte[i] = m;
          paramInt1 += 1;
          i += 1;
        }
        this.b = j;
      }
    }
  }
  
  public int b(int paramInt)
  {
    return this.a[paramInt];
  }
  
  public byte[] b()
  {
    int i = this.b;
    byte[] arrayOfByte1 = new byte[i];
    int j = this.b;
    if (j > 0)
    {
      byte[] arrayOfByte2 = this.a;
      int k = this.b;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, k);
    }
    return arrayOfByte1;
  }
  
  public int c()
  {
    return this.a.length;
  }
  
  public int d()
  {
    return this.b;
  }
  
  public byte[] e()
  {
    return this.a;
  }
  
  public boolean f()
  {
    int i = this.b;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean g()
  {
    int i = this.b;
    byte[] arrayOfByte = this.a;
    int k = arrayOfByte.length;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\o\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */