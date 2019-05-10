package b.a.a.a.i;

import b.a.a.a.i.f.n;
import b.a.a.a.j.g;
import b.a.a.a.l.e;
import b.a.a.a.o.b;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

public class f
  extends a
  implements b.a.a.a.o
{
  private volatile boolean a;
  private volatile Socket b = null;
  
  private static void a(StringBuilder paramStringBuilder, SocketAddress paramSocketAddress)
  {
    boolean bool = paramSocketAddress instanceof InetSocketAddress;
    Object localObject;
    if (bool)
    {
      paramSocketAddress = (InetSocketAddress)paramSocketAddress;
      localObject = paramSocketAddress.getAddress();
      if (localObject != null)
      {
        localObject = paramSocketAddress.getAddress().getHostAddress();
        localObject = paramStringBuilder.append(localObject).append(':');
        int i = paramSocketAddress.getPort();
        ((StringBuilder)localObject).append(i);
      }
    }
    for (;;)
    {
      return;
      localObject = paramSocketAddress.getAddress();
      break;
      paramStringBuilder.append(paramSocketAddress);
    }
  }
  
  protected b.a.a.a.j.f a(Socket paramSocket, int paramInt, e parame)
  {
    n localn = new b/a/a/a/i/f/n;
    localn.<init>(paramSocket, paramInt, parame);
    return localn;
  }
  
  protected void a(Socket paramSocket, e parame)
  {
    b.a.a.a.o.a.a(paramSocket, "Socket");
    b.a.a.a.o.a.a(parame, "HTTP parameters");
    this.b = paramSocket;
    int i = parame.a("http.socket.buffer-size", -1);
    b.a.a.a.j.f localf = a(paramSocket, i, parame);
    g localg = b(paramSocket, i, parame);
    a(localf, localg, parame);
    this.a = true;
  }
  
  protected g b(Socket paramSocket, int paramInt, e parame)
  {
    b.a.a.a.i.f.o localo = new b/a/a/a/i/f/o;
    localo.<init>(paramSocket, paramInt, parame);
    return localo;
  }
  
  public void b(int paramInt)
  {
    j();
    Socket localSocket = this.b;
    if (localSocket != null) {}
    try
    {
      localSocket = this.b;
      localSocket.setSoTimeout(paramInt);
      return;
    }
    catch (SocketException localSocketException)
    {
      for (;;) {}
    }
  }
  
  public boolean c()
  {
    return this.a;
  }
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 78	b/a/a/a/i/f:a	Z
    //   4: istore_1
    //   5: iload_1
    //   6: ifne +4 -> 10
    //   9: return
    //   10: iconst_0
    //   11: istore_1
    //   12: aconst_null
    //   13: astore_2
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield 78	b/a/a/a/i/f:a	Z
    //   19: aload_0
    //   20: getfield 16	b/a/a/a/i/f:b	Ljava/net/Socket;
    //   23: astore_3
    //   24: aload_0
    //   25: invokevirtual 95	b/a/a/a/i/f:o	()V
    //   28: aload_3
    //   29: invokevirtual 98	java/net/Socket:shutdownOutput	()V
    //   32: aload_3
    //   33: invokevirtual 101	java/net/Socket:shutdownInput	()V
    //   36: aload_3
    //   37: invokevirtual 104	java/net/Socket:close	()V
    //   40: goto -31 -> 9
    //   43: astore_2
    //   44: aload_3
    //   45: invokevirtual 104	java/net/Socket:close	()V
    //   48: aload_2
    //   49: athrow
    //   50: astore_2
    //   51: goto -19 -> 32
    //   54: astore_2
    //   55: goto -19 -> 36
    //   58: astore_2
    //   59: goto -23 -> 36
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	f
    //   4	8	1	bool	boolean
    //   13	1	2	localObject1	Object
    //   43	6	2	localObject2	Object
    //   50	1	2	localIOException1	java.io.IOException
    //   54	1	2	localIOException2	java.io.IOException
    //   58	1	2	localUnsupportedOperationException	UnsupportedOperationException
    //   23	22	3	localSocket	Socket
    // Exception table:
    //   from	to	target	type
    //   24	28	43	finally
    //   28	32	43	finally
    //   32	36	43	finally
    //   28	32	50	java/io/IOException
    //   32	36	54	java/io/IOException
    //   28	32	58	java/lang/UnsupportedOperationException
    //   32	36	58	java/lang/UnsupportedOperationException
  }
  
  public void e()
  {
    this.a = false;
    Socket localSocket = this.b;
    if (localSocket != null) {
      localSocket.close();
    }
  }
  
  public InetAddress f()
  {
    Object localObject = this.b;
    if (localObject != null) {}
    for (localObject = this.b.getInetAddress();; localObject = null) {
      return (InetAddress)localObject;
    }
  }
  
  public int g()
  {
    Socket localSocket = this.b;
    if (localSocket != null) {
      localSocket = this.b;
    }
    for (int i = localSocket.getPort();; i = -1) {
      return i;
    }
  }
  
  protected Socket i()
  {
    return this.b;
  }
  
  protected void j()
  {
    b.a(this.a, "Connection is not open");
  }
  
  protected void q()
  {
    boolean bool = this.a;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      b.a(bool, "Connection is already open");
      return;
    }
  }
  
  public String toString()
  {
    Object localObject1 = this.b;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      SocketAddress localSocketAddress = this.b.getRemoteSocketAddress();
      Object localObject2 = this.b.getLocalSocketAddress();
      if ((localSocketAddress != null) && (localObject2 != null))
      {
        a((StringBuilder)localObject1, (SocketAddress)localObject2);
        localObject2 = "<->";
        ((StringBuilder)localObject1).append((String)localObject2);
        a((StringBuilder)localObject1, localSocketAddress);
      }
    }
    for (localObject1 = ((StringBuilder)localObject1).toString();; localObject1 = super.toString()) {
      return (String)localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */