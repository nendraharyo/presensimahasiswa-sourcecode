package b.a.a.a.i.f;

import b.a.a.a.ah;
import b.a.a.a.j.f;
import b.a.a.a.m;
import b.a.a.a.o.d;
import b.a.a.a.w;
import java.io.IOException;
import java.io.InputStream;

public class e
  extends InputStream
{
  private final f a;
  private final d b;
  private int c;
  private int d;
  private int e;
  private boolean f = false;
  private boolean g = false;
  private b.a.a.a.e[] h;
  
  public e(f paramf)
  {
    Object localObject = new b.a.a.a.e[0];
    this.h = ((b.a.a.a.e[])localObject);
    localObject = (f)b.a.a.a.o.a.a(paramf, "Session input buffer");
    this.a = ((f)localObject);
    this.e = 0;
    localObject = new b/a/a/a/o/d;
    ((d)localObject).<init>(16);
    this.b = ((d)localObject);
    this.c = 1;
  }
  
  private void a()
  {
    int i = b();
    this.d = i;
    i = this.d;
    if (i < 0)
    {
      localw = new b/a/a/a/w;
      localw.<init>("Negative chunk size");
      throw localw;
    }
    this.c = 2;
    w localw = null;
    this.e = 0;
    i = this.d;
    if (i == 0)
    {
      i = 1;
      this.f = i;
      c();
    }
  }
  
  private int b()
  {
    int i = -1;
    int j = 0;
    Object localObject1 = null;
    int k = this.c;
    Object localObject2;
    d locald;
    switch (k)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Inconsistent codec state");
      throw ((Throwable)localObject1);
    case 3: 
      this.b.a();
      localObject2 = this.a;
      locald = this.b;
      k = ((f)localObject2).a(locald);
      if (k != i) {
        break;
      }
    }
    for (;;)
    {
      return j;
      localObject2 = this.b;
      int m = ((d)localObject2).d();
      if (m == 0)
      {
        localObject1 = new b/a/a/a/w;
        ((w)localObject1).<init>("Unexpected content at the end of chunk");
        throw ((Throwable)localObject1);
      }
      m = 1;
      this.c = m;
      this.b.a();
      localObject2 = this.a;
      locald = this.b;
      int n = ((f)localObject2).a(locald);
      if (n == i) {
        continue;
      }
      localObject1 = this.b;
      n = 59;
      j = ((d)localObject1).c(n);
      if (j < 0)
      {
        localObject1 = this.b;
        j = ((d)localObject1).c();
      }
      try
      {
        localObject2 = this.b;
        locald = null;
        localObject1 = ((d)localObject2).b(0, j);
        n = 16;
        j = Integer.parseInt((String)localObject1, n);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        w localw = new b/a/a/a/w;
        localw.<init>("Bad chunk header");
        throw localw;
      }
    }
  }
  
  private void c()
  {
    try
    {
      Object localObject1 = this.a;
      int i = -1;
      int j = -1;
      str = null;
      localObject1 = a.a((f)localObject1, i, j, null);
      this.h = ((b.a.a.a.e[])localObject1);
      return;
    }
    catch (m localm)
    {
      w localw = new b/a/a/a/w;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Invalid footer: ");
      String str = localm.getMessage();
      localObject2 = str;
      localw.<init>((String)localObject2);
      localw.initCause(localm);
      throw localw;
    }
  }
  
  public int available()
  {
    Object localObject = this.a;
    boolean bool = localObject instanceof b.a.a.a.j.a;
    int i;
    if (bool)
    {
      localObject = (b.a.a.a.j.a)this.a;
      i = ((b.a.a.a.j.a)localObject).e();
      int j = this.d;
      int k = this.e;
      j -= k;
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
    boolean bool2 = this.g;
    if (!bool2) {}
    try
    {
      bool2 = this.f;
      if (!bool2)
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
      this.f = bool1;
      this.g = bool1;
    }
  }
  
  public int read()
  {
    int i = -1;
    boolean bool1 = this.g;
    if (bool1)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Attempted read from closed stream.");
      throw localIOException;
    }
    bool1 = this.f;
    if (bool1) {}
    for (;;)
    {
      return i;
      int j = this.c;
      int m = 2;
      if (j != m)
      {
        a();
        boolean bool2 = this.f;
        if (bool2) {}
      }
      else
      {
        f localf = this.a;
        int k = localf.a();
        if (k != i)
        {
          i = this.e + 1;
          this.e = i;
          i = this.e;
          m = this.d;
          if (i >= m)
          {
            i = 3;
            this.c = i;
          }
        }
        i = k;
      }
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
    boolean bool1 = this.g;
    if (bool1)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Attempted read from closed stream.");
      throw ((Throwable)localObject1);
    }
    bool1 = this.f;
    if (bool1) {}
    for (;;)
    {
      return i;
      int j = this.c;
      m = 2;
      if (j != m)
      {
        a();
        boolean bool2 = this.f;
        if (bool2) {}
      }
      else
      {
        localObject2 = this.a;
        m = this.d;
        int n = this.e;
        m -= n;
        m = Math.min(paramInt2, m);
        int k = ((f)localObject2).a(paramArrayOfByte, paramInt1, m);
        if (k == i) {
          break;
        }
        i = this.e + k;
        this.e = i;
        i = this.e;
        m = this.d;
        if (i >= m)
        {
          i = 3;
          this.c = i;
        }
        i = k;
      }
    }
    this.f = true;
    Object localObject1 = new b/a/a/a/ah;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Truncated chunk ( expected size: ");
    int m = this.d;
    localObject2 = ((StringBuilder)localObject2).append(m).append("; actual size: ");
    m = this.e;
    localObject2 = m + ")";
    ((ah)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */