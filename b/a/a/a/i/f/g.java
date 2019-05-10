package b.a.a.a.i.f;

import b.a.a.a.j.f;
import java.io.IOException;
import java.io.InputStream;

public class g
  extends InputStream
{
  private final long a;
  private long b = 0L;
  private boolean c = false;
  private f d = null;
  
  public g(f paramf, long paramLong)
  {
    f localf = (f)b.a.a.a.o.a.a(paramf, "Session input buffer");
    this.d = localf;
    long l = b.a.a.a.o.a.a(paramLong, "Content length");
    this.a = l;
  }
  
  public int available()
  {
    Object localObject = this.d;
    boolean bool = localObject instanceof b.a.a.a.j.a;
    int i;
    if (bool)
    {
      localObject = (b.a.a.a.j.a)this.d;
      i = ((b.a.a.a.j.a)localObject).e();
      long l1 = this.a;
      long l2 = this.b;
      l1 -= l2;
      int j = (int)l1;
      i = Math.min(i, j);
    }
    for (;;)
    {
      return i;
      i = 0;
      localObject = null;
    }
  }
  
  public void close()
  {
    boolean bool1 = true;
    boolean bool2 = this.c;
    if (!bool2) {}
    try
    {
      long l1 = this.b;
      long l2 = this.a;
      bool2 = l1 < l2;
      if (bool2)
      {
        int i = 2048;
        byte[] arrayOfByte = new byte[i];
        int j;
        do
        {
          j = read(arrayOfByte);
        } while (j >= 0);
      }
      return;
    }
    finally
    {
      this.c = bool1;
    }
  }
  
  public int read()
  {
    int i = -1;
    boolean bool2 = this.c;
    Object localObject1;
    if (bool2)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Attempted read from closed stream.");
      throw ((Throwable)localObject1);
    }
    long l1 = this.b;
    long l2 = this.a;
    bool2 = l1 < l2;
    if (!bool2) {}
    for (;;)
    {
      return i;
      Object localObject2 = this.d;
      int j = ((f)localObject2).a();
      if (j == i)
      {
        l1 = this.b;
        l2 = this.a;
        bool1 = l1 < l2;
        if (bool1)
        {
          localObject1 = new b/a/a/a/a;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Premature end of Content-Length delimited message body (expected: ");
          l1 = this.a;
          localObject2 = ((StringBuilder)localObject2).append(l1).append("; received: ");
          l1 = this.b;
          localObject2 = l1;
          ((b.a.a.a.a)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        l1 = this.b;
        l2 = 1L;
        l1 += l2;
        this.b = l1;
      }
      boolean bool1 = j;
    }
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return read(paramArrayOfByte, 0, i);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = -1;
    boolean bool2 = this.c;
    Object localObject1;
    if (bool2)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Attempted read from closed stream.");
      throw ((Throwable)localObject1);
    }
    long l1 = this.b;
    long l2 = this.a;
    bool2 = l1 < l2;
    if (!bool2) {}
    for (;;)
    {
      return i;
      l1 = this.b;
      l2 = paramInt2;
      l1 += l2;
      l2 = this.a;
      bool2 = l1 < l2;
      if (bool2)
      {
        l1 = this.a;
        l2 = this.b;
        l1 -= l2;
        paramInt2 = (int)l1;
      }
      Object localObject2 = this.d;
      int j = ((f)localObject2).a(paramArrayOfByte, paramInt1, paramInt2);
      if (j == i)
      {
        l1 = this.b;
        l2 = this.a;
        bool1 = l1 < l2;
        if (bool1)
        {
          localObject1 = new b/a/a/a/a;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Premature end of Content-Length delimited message body (expected: ");
          l1 = this.a;
          localObject2 = ((StringBuilder)localObject2).append(l1).append("; received: ");
          l1 = this.b;
          localObject2 = l1;
          ((b.a.a.a.a)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      if (j > 0)
      {
        l1 = this.b;
        l2 = j;
        l1 += l2;
        this.b = l1;
      }
      boolean bool1 = j;
    }
  }
  
  public long skip(long paramLong)
  {
    long l1 = 0L;
    boolean bool1 = paramLong < l1;
    if (!bool1) {
      return l1;
    }
    int i = 2048;
    byte[] arrayOfByte = new byte[i];
    long l2 = this.a;
    long l3 = this.b;
    l2 -= l3;
    l3 = Math.min(paramLong, l2);
    l2 = l1;
    for (;;)
    {
      boolean bool2 = l3 < l1;
      int j;
      if (bool2)
      {
        l4 = Math.min(2048L, l3);
        int k = (int)l4;
        j = read(arrayOfByte, 0, k);
        k = -1;
        if (j != k) {}
      }
      else
      {
        l1 = l2;
        break;
      }
      long l4 = j;
      l2 += l4;
      l4 = j;
      l3 -= l4;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */