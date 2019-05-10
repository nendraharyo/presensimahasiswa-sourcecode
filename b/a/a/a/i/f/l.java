package b.a.a.a.i.f;

import b.a.a.a.j.f;
import java.io.InputStream;

public class l
  extends InputStream
{
  private final f a;
  private boolean b = false;
  
  public l(f paramf)
  {
    f localf = (f)b.a.a.a.o.a.a(paramf, "Session input buffer");
    this.a = localf;
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
    this.b = true;
  }
  
  public int read()
  {
    boolean bool = this.b;
    if (bool) {}
    f localf;
    for (int i = -1;; i = localf.a())
    {
      return i;
      localf = this.a;
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = this.b;
    if (bool) {}
    f localf;
    for (int i = -1;; i = localf.a(paramArrayOfByte, paramInt1, paramInt2))
    {
      return i;
      localf = this.a;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */