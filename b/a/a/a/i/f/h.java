package b.a.a.a.i.f;

import b.a.a.a.j.g;
import b.a.a.a.o.a;
import java.io.IOException;
import java.io.OutputStream;

public class h
  extends OutputStream
{
  private final g a;
  private final long b;
  private long c = 0L;
  private boolean d = false;
  
  public h(g paramg, long paramLong)
  {
    g localg = (g)a.a(paramg, "Session output buffer");
    this.a = localg;
    long l = a.a(paramLong, "Content length");
    this.b = l;
  }
  
  public void close()
  {
    boolean bool = this.d;
    if (!bool)
    {
      bool = true;
      this.d = bool;
      g localg = this.a;
      localg.a();
    }
  }
  
  public void flush()
  {
    this.a.a();
  }
  
  public void write(int paramInt)
  {
    boolean bool = this.d;
    Object localObject;
    if (bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Attempted write to closed stream.");
      throw ((Throwable)localObject);
    }
    long l1 = this.c;
    long l2 = this.b;
    bool = l1 < l2;
    if (bool)
    {
      localObject = this.a;
      ((g)localObject).a(paramInt);
      l1 = this.c;
      l2 = 1L;
      l1 += l2;
      this.c = l1;
    }
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    write(paramArrayOfByte, 0, i);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool1 = this.d;
    Object localObject;
    if (bool1)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Attempted write to closed stream.");
      throw ((Throwable)localObject);
    }
    long l1 = this.c;
    long l2 = this.b;
    bool1 = l1 < l2;
    if (bool1)
    {
      l1 = this.b;
      l2 = this.c;
      l1 -= l2;
      l2 = paramInt2;
      boolean bool2 = l2 < l1;
      if (bool2) {
        paramInt2 = (int)l1;
      }
      localObject = this.a;
      ((g)localObject).a(paramArrayOfByte, paramInt1, paramInt2);
      l1 = this.c;
      l2 = paramInt2;
      l1 += l2;
      this.c = l1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */