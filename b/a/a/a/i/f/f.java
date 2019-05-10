package b.a.a.a.i.f;

import b.a.a.a.j.g;
import java.io.IOException;
import java.io.OutputStream;

public class f
  extends OutputStream
{
  private final g a;
  private final byte[] b;
  private int c = 0;
  private boolean d = false;
  private boolean e = false;
  
  public f(int paramInt, g paramg)
  {
    byte[] arrayOfByte = new byte[paramInt];
    this.b = arrayOfByte;
    this.a = paramg;
  }
  
  public f(g paramg)
  {
    this(2048, paramg);
  }
  
  protected void a()
  {
    int i = this.c;
    if (i > 0)
    {
      g localg = this.a;
      int j = this.c;
      Object localObject = Integer.toHexString(j);
      localg.a((String)localObject);
      localg = this.a;
      localObject = this.b;
      int k = this.c;
      localg.a((byte[])localObject, 0, k);
      localg = this.a;
      localObject = "";
      localg.a((String)localObject);
      this.c = 0;
    }
  }
  
  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    g localg = this.a;
    Object localObject = Integer.toHexString(this.c + paramInt2);
    localg.a((String)localObject);
    localg = this.a;
    localObject = this.b;
    int i = this.c;
    localg.a((byte[])localObject, 0, i);
    this.a.a(paramArrayOfByte, paramInt1, paramInt2);
    this.a.a("");
    this.c = 0;
  }
  
  protected void b()
  {
    this.a.a("0");
    this.a.a("");
  }
  
  public void c()
  {
    boolean bool = this.d;
    if (!bool)
    {
      a();
      b();
      bool = true;
      this.d = bool;
    }
  }
  
  public void close()
  {
    boolean bool = this.e;
    if (!bool)
    {
      bool = true;
      this.e = bool;
      c();
      g localg = this.a;
      localg.a();
    }
  }
  
  public void flush()
  {
    a();
    this.a.a();
  }
  
  public void write(int paramInt)
  {
    boolean bool = this.e;
    if (bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Attempted write to closed stream.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.b;
    int j = this.c;
    int k = (byte)paramInt;
    localObject[j] = k;
    int i = this.c + 1;
    this.c = i;
    i = this.c;
    byte[] arrayOfByte = this.b;
    j = arrayOfByte.length;
    if (i == j) {
      a();
    }
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    write(paramArrayOfByte, 0, i);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = this.e;
    if (bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Attempted write to closed stream.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.b;
    int i = localObject.length;
    int j = this.c;
    i -= j;
    if (paramInt2 >= i) {
      a(paramArrayOfByte, paramInt1, paramInt2);
    }
    for (;;)
    {
      return;
      localObject = this.b;
      j = this.c;
      System.arraycopy(paramArrayOfByte, paramInt1, localObject, j, paramInt2);
      i = this.c + paramInt2;
      this.c = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */