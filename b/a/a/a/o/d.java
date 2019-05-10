package b.a.a.a.o;

import java.io.Serializable;

public final class d
  implements Serializable
{
  private char[] a;
  private int b;
  
  public d(int paramInt)
  {
    a.b(paramInt, "Buffer capacity");
    char[] arrayOfChar = new char[paramInt];
    this.a = arrayOfChar;
  }
  
  private void d(int paramInt)
  {
    char[] arrayOfChar1 = new char[Math.max(this.a.length << 1, paramInt)];
    char[] arrayOfChar2 = this.a;
    int i = this.b;
    System.arraycopy(arrayOfChar2, 0, arrayOfChar1, 0, i);
    this.a = arrayOfChar1;
  }
  
  public char a(int paramInt)
  {
    return this.a[paramInt];
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = -1;
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }
    int j = this.b;
    if (paramInt3 > j) {
      paramInt3 = this.b;
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
        char[] arrayOfChar = this.a;
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
  
  public String a(int paramInt1, int paramInt2)
  {
    String str = new java/lang/String;
    char[] arrayOfChar = this.a;
    int i = paramInt2 - paramInt1;
    str.<init>(arrayOfChar, paramInt1, i);
    return str;
  }
  
  public void a()
  {
    this.b = 0;
  }
  
  public void a(char paramChar)
  {
    int i = this.b + 1;
    char[] arrayOfChar = this.a;
    int j = arrayOfChar.length;
    if (i > j) {
      d(i);
    }
    arrayOfChar = this.a;
    int k = this.b;
    arrayOfChar[k] = paramChar;
    this.b = i;
  }
  
  public void a(c paramc, int paramInt1, int paramInt2)
  {
    if (paramc == null) {}
    for (;;)
    {
      return;
      byte[] arrayOfByte = paramc.e();
      a(arrayOfByte, paramInt1, paramInt2);
    }
  }
  
  public void a(d paramd, int paramInt1, int paramInt2)
  {
    if (paramd == null) {}
    for (;;)
    {
      return;
      char[] arrayOfChar = paramd.a;
      a(arrayOfChar, paramInt1, paramInt2);
    }
  }
  
  public void a(String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      int i = paramString.length();
      int j = this.b + i;
      char[] arrayOfChar1 = this.a;
      int k = arrayOfChar1.length;
      if (j > k) {
        d(j);
      }
      char[] arrayOfChar2 = this.a;
      int m = this.b;
      paramString.getChars(0, i, arrayOfChar2, m);
      this.b = j;
      return;
      paramString = "null";
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
        i = this.b;
        j = i + paramInt2;
        char[] arrayOfChar = this.a;
        k = arrayOfChar.length;
        if (j > k) {
          d(j);
        }
        while (i < j)
        {
          arrayOfChar = this.a;
          int m = (char)(paramArrayOfByte[paramInt1] & 0xFF);
          arrayOfChar[i] = m;
          paramInt1 += 1;
          i += 1;
        }
        this.b = j;
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
        i = this.b + paramInt2;
        localObject = this.a;
        j = localObject.length;
        if (i > j) {
          d(i);
        }
        localObject = this.a;
        k = this.b;
        System.arraycopy(paramArrayOfChar, paramInt1, localObject, k, paramInt2);
        this.b = i;
      }
    }
  }
  
  public String b(int paramInt1, int paramInt2)
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
    int i = this.b;
    if (paramInt2 > i)
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("endIndex: ").append(paramInt2).append(" > length: ");
      j = this.b;
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
      localObject1 = this.a;
      bool = b.a.a.a.n.d.a(localObject1[paramInt1]);
      if (!bool) {
        break;
      }
      paramInt1 += 1;
    }
    while (paramInt2 > paramInt1)
    {
      localObject1 = this.a;
      int k = paramInt2 + -1;
      bool = b.a.a.a.n.d.a(localObject1[k]);
      if (!bool) {
        break;
      }
      paramInt2 += -1;
    }
    Object localObject1 = new java/lang/String;
    Object localObject2 = this.a;
    int j = paramInt2 - paramInt1;
    ((String)localObject1).<init>((char[])localObject2, paramInt1, j);
    return (String)localObject1;
  }
  
  public void b(int paramInt)
  {
    if (paramInt <= 0) {}
    for (;;)
    {
      return;
      char[] arrayOfChar = this.a;
      int i = arrayOfChar.length;
      int j = this.b;
      i -= j;
      if (paramInt > i)
      {
        i = this.b + paramInt;
        d(i);
      }
    }
  }
  
  public char[] b()
  {
    return this.a;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public int c(int paramInt)
  {
    int i = this.b;
    return a(paramInt, 0, i);
  }
  
  public boolean d()
  {
    int i = this.b;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public String toString()
  {
    String str = new java/lang/String;
    char[] arrayOfChar = this.a;
    int i = this.b;
    str.<init>(arrayOfChar, 0, i);
    return str;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\o\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */