package b.a.a.a.i.c;

import b.a.a.a.e.c.i;
import b.a.a.a.e.d;
import b.a.a.a.e.m;
import b.a.a.a.l.c;
import b.a.a.a.n;
import b.a.a.a.o.a;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class g
  implements d
{
  public b.a.a.a.h.b a;
  protected final i b;
  protected final b.a.a.a.e.j c;
  
  public g(i parami)
  {
    Object localObject = new b/a/a/a/h/b;
    Class localClass = getClass();
    ((b.a.a.a.h.b)localObject).<init>(localClass);
    this.a = ((b.a.a.a.h.b)localObject);
    a.a(parami, "Scheme registry");
    this.b = parami;
    localObject = new b/a/a/a/i/c/q;
    ((q)localObject).<init>();
    this.c = ((b.a.a.a.e.j)localObject);
  }
  
  private i a(b.a.a.a.n.e parame)
  {
    i locali = (i)parame.a("http.scheme-registry");
    if (locali == null) {
      locali = this.b;
    }
    return locali;
  }
  
  public b.a.a.a.e.q a()
  {
    f localf = new b/a/a/a/i/c/f;
    localf.<init>();
    return localf;
  }
  
  public void a(b.a.a.a.e.q paramq, n paramn, b.a.a.a.n.e parame, b.a.a.a.l.e parame1)
  {
    a.a(paramq, "Connection");
    a.a(paramn, "Target host");
    a.a(parame1, "Parameters");
    b.a.a.a.o.b.a(paramq.c(), "Connection must be open");
    Object localObject1 = a(parame);
    Object localObject2 = paramn.c();
    localObject2 = ((i)localObject1).a((String)localObject2);
    b.a.a.a.o.b.a(((b.a.a.a.e.c.e)localObject2).b() instanceof b.a.a.a.e.c.f, "Socket factory must implement SchemeLayeredSocketFactory");
    localObject1 = (b.a.a.a.e.c.f)((b.a.a.a.e.c.e)localObject2).b();
    Socket localSocket = paramq.i();
    String str = paramn.a();
    int i = paramn.b();
    int j = ((b.a.a.a.e.c.e)localObject2).a(i);
    localObject2 = ((b.a.a.a.e.c.f)localObject1).createLayeredSocket(localSocket, str, j, parame1);
    a((Socket)localObject2, parame, parame1);
    boolean bool = ((b.a.a.a.e.c.f)localObject1).isSecure((Socket)localObject2);
    paramq.a((Socket)localObject2, paramn, bool, parame1);
  }
  
  public void a(b.a.a.a.e.q paramq, n paramn, InetAddress paramInetAddress, b.a.a.a.n.e parame, b.a.a.a.l.e parame1)
  {
    a.a(paramq, "Connection");
    a.a(paramn, "Target host");
    Object localObject1 = "HTTP parameters";
    a.a(parame1, (String)localObject1);
    int i = paramq.c();
    Object localObject2;
    b.a.a.a.e.c.j localj;
    label114:
    Object localObject3;
    boolean bool1;
    label150:
    Object localObject5;
    m localm;
    boolean bool2;
    if (i == 0)
    {
      i = 1;
      b.a.a.a.o.b.a(i, "Connection must not be open");
      localObject1 = a(parame);
      localObject2 = paramn.c();
      localObject1 = ((i)localObject1).a((String)localObject2);
      localj = ((b.a.a.a.e.c.e)localObject1).b();
      localObject2 = paramn.a();
      InetAddress[] arrayOfInetAddress = a((String)localObject2);
      int k = paramn.b();
      int n = ((b.a.a.a.e.c.e)localObject1).a(k);
      i = 0;
      localObject1 = null;
      k = arrayOfInetAddress.length;
      if (i < k)
      {
        localObject3 = arrayOfInetAddress[i];
        int m = arrayOfInetAddress.length + -1;
        if (i != m) {
          break label349;
        }
        bool1 = true;
        localObject5 = localj.createSocket(parame1);
        paramq.a((Socket)localObject5, paramn);
        localm = new b/a/a/a/e/m;
        localm.<init>(paramn, (InetAddress)localObject3, n);
        bool2 = false;
        localObject3 = null;
        if (paramInetAddress != null)
        {
          localObject3 = new java/net/InetSocketAddress;
          bool3 = false;
          localb = null;
          ((InetSocketAddress)localObject3).<init>(paramInetAddress, 0);
        }
        b.a.a.a.h.b localb = this.a;
        boolean bool3 = localb.a();
        if (bool3)
        {
          localb = this.a;
          Object localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          String str = "Connecting to ";
          localObject6 = str + localm;
          localb.a(localObject6);
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject3 = localj.connectSocket((Socket)localObject5, localm, (InetSocketAddress)localObject3, parame1);
        if (localObject5 == localObject3) {
          break label463;
        }
        paramq.a((Socket)localObject3, paramn);
        a((Socket)localObject3, parame, parame1);
        bool2 = localj.isSecure((Socket)localObject3);
        paramq.a(bool2, parame1);
        return;
      }
      catch (ConnectException localConnectException)
      {
        if (!bool1) {
          continue;
        }
        throw localConnectException;
      }
      catch (b.a.a.a.e.f localf)
      {
        label349:
        if (!bool1) {
          continue;
        }
        throw localf;
        localObject2 = this.a;
        bool1 = ((b.a.a.a.h.b)localObject2).a();
        if (!bool1) {
          continue;
        }
        localObject2 = this.a;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("Connect to ").append(localm).append(" timed out. ");
        localObject5 = "Connection will be retried using another IP address";
        localObject4 = (String)localObject5;
        ((b.a.a.a.h.b)localObject2).a(localObject4);
        int j;
        i += 1;
      }
      i = 0;
      localObject1 = null;
      break;
      bool1 = false;
      localObject2 = null;
      break label150;
      break label114;
      label463:
      Object localObject4 = localObject5;
    }
  }
  
  protected void a(Socket paramSocket, b.a.a.a.n.e parame, b.a.a.a.l.e parame1)
  {
    boolean bool = c.c(parame1);
    paramSocket.setTcpNoDelay(bool);
    int i = c.a(parame1);
    paramSocket.setSoTimeout(i);
    int k = c.d(parame1);
    if (k >= 0) {
      if (k <= 0) {
        break label52;
      }
    }
    label52:
    int j;
    for (i = 1;; j = 0)
    {
      paramSocket.setSoLinger(i, k);
      return;
    }
  }
  
  protected InetAddress[] a(String paramString)
  {
    return this.c.a(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */