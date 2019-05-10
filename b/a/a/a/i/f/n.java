package b.a.a.a.i.f;

import b.a.a.a.j.b;
import b.a.a.a.l.e;
import b.a.a.a.o.a;
import java.io.InputStream;
import java.net.Socket;

public class n
  extends c
  implements b
{
  private final Socket a;
  private boolean b;
  
  public n(Socket paramSocket, int paramInt, e parame)
  {
    a.a(paramSocket, "Socket");
    this.a = paramSocket;
    int j = 0;
    InputStream localInputStream = null;
    this.b = false;
    if (paramInt < 0) {}
    for (j = paramSocket.getReceiveBufferSize();; j = paramInt)
    {
      if (j < i) {}
      for (;;)
      {
        localInputStream = paramSocket.getInputStream();
        a(localInputStream, i, parame);
        return;
        i = j;
      }
    }
  }
  
  public boolean a(int paramInt)
  {
    boolean bool = g();
    Socket localSocket1;
    int i;
    if (!bool)
    {
      localSocket1 = this.a;
      i = localSocket1.getSoTimeout();
    }
    try
    {
      localSocket1 = this.a;
      localSocket1.setSoTimeout(paramInt);
      f();
      bool = g();
      Socket localSocket2 = this.a;
      localSocket2.setSoTimeout(i);
      return bool;
    }
    finally
    {
      this.a.setSoTimeout(i);
    }
  }
  
  public boolean c()
  {
    return this.b;
  }
  
  protected int f()
  {
    int i = super.f();
    int j = -1;
    if (i == j) {}
    for (j = 1;; j = 0)
    {
      this.b = j;
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */