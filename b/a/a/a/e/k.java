package b.a.a.a.e;

import b.a.a.a.o.a;
import java.io.IOException;
import java.io.InputStream;

public class k
  extends InputStream
  implements i
{
  protected InputStream a;
  private boolean b;
  private final l c;
  
  public k(InputStream paramInputStream, l paraml)
  {
    a.a(paramInputStream, "Wrapped stream");
    this.a = paramInputStream;
    this.b = false;
    this.c = paraml;
  }
  
  protected void a(int paramInt)
  {
    Object localObject1 = this.a;
    boolean bool;
    if ((localObject1 != null) && (paramInt < 0)) {
      bool = true;
    }
    try
    {
      Object localObject3 = this.c;
      if (localObject3 != null)
      {
        localObject1 = this.c;
        localObject3 = this.a;
        bool = ((l)localObject1).a((InputStream)localObject3);
      }
      if (bool)
      {
        localObject1 = this.a;
        ((InputStream)localObject1).close();
      }
      return;
    }
    finally
    {
      this.a = null;
    }
  }
  
  public int available()
  {
    int i = 0;
    InputStream localInputStream = null;
    boolean bool = c();
    if (bool) {}
    try
    {
      localInputStream = this.a;
      i = localInputStream.available();
      return i;
    }
    catch (IOException localIOException)
    {
      e();
      throw localIOException;
    }
  }
  
  public void b()
  {
    this.b = true;
    e();
  }
  
  public void b_()
  {
    close();
  }
  
  protected boolean c()
  {
    boolean bool = this.b;
    if (bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Attempted read on closed stream.");
      throw ((Throwable)localObject);
    }
    Object localObject = this.a;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public void close()
  {
    this.b = true;
    d();
  }
  
  protected void d()
  {
    Object localObject1 = this.a;
    boolean bool;
    if (localObject1 != null) {
      bool = true;
    }
    try
    {
      Object localObject3 = this.c;
      if (localObject3 != null)
      {
        localObject1 = this.c;
        localObject3 = this.a;
        bool = ((l)localObject1).b((InputStream)localObject3);
      }
      if (bool)
      {
        localObject1 = this.a;
        ((InputStream)localObject1).close();
      }
      return;
    }
    finally
    {
      this.a = null;
    }
  }
  
  protected void e()
  {
    Object localObject1 = this.a;
    boolean bool;
    if (localObject1 != null) {
      bool = true;
    }
    try
    {
      Object localObject3 = this.c;
      if (localObject3 != null)
      {
        localObject1 = this.c;
        localObject3 = this.a;
        bool = ((l)localObject1).c((InputStream)localObject3);
      }
      if (bool)
      {
        localObject1 = this.a;
        ((InputStream)localObject1).close();
      }
      return;
    }
    finally
    {
      this.a = null;
    }
  }
  
  public int read()
  {
    int i = -1;
    boolean bool = c();
    if (bool) {}
    try
    {
      InputStream localInputStream = this.a;
      i = localInputStream.read();
      a(i);
      return i;
    }
    catch (IOException localIOException)
    {
      e();
      throw localIOException;
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
    boolean bool = c();
    if (bool) {}
    try
    {
      InputStream localInputStream = this.a;
      i = localInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      a(i);
      return i;
    }
    catch (IOException localIOException)
    {
      e();
      throw localIOException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */