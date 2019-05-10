package b.a.a.a.i.f;

import b.a.a.a.j.g;
import b.a.a.a.o.a;
import java.io.IOException;
import java.io.OutputStream;

public class m
  extends OutputStream
{
  private final g a;
  private boolean b = false;
  
  public m(g paramg)
  {
    g localg = (g)a.a(paramg, "Session output buffer");
    this.a = localg;
  }
  
  public void close()
  {
    boolean bool = this.b;
    if (!bool)
    {
      bool = true;
      this.b = bool;
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
    boolean bool = this.b;
    if (bool)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Attempted write to closed stream.");
      throw localIOException;
    }
    this.a.a(paramInt);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    write(paramArrayOfByte, 0, i);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = this.b;
    if (bool)
    {
      IOException localIOException = new java/io/IOException;
      localIOException.<init>("Attempted write to closed stream.");
      throw localIOException;
    }
    this.a.a(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */