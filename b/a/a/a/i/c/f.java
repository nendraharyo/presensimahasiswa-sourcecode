package b.a.a.a.i.c;

import b.a.a.a.e.p;
import b.a.a.a.h.b;
import b.a.a.a.j.c;
import b.a.a.a.j.g;
import b.a.a.a.o.a;
import b.a.a.a.s;
import b.a.a.a.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

public class f
  extends b.a.a.a.i.f
  implements p, b.a.a.a.e.q, b.a.a.a.n.e
{
  public b a;
  public b b;
  public b c;
  private volatile Socket d;
  private b.a.a.a.n e;
  private boolean f;
  private volatile boolean g;
  private final Map h;
  
  public f()
  {
    Object localObject = new b/a/a/a/h/b;
    Class localClass = getClass();
    ((b)localObject).<init>(localClass);
    this.a = ((b)localObject);
    localObject = new b/a/a/a/h/b;
    ((b)localObject).<init>("cz.msebera.android.httpclient.headers");
    this.b = ((b)localObject);
    localObject = new b/a/a/a/h/b;
    ((b)localObject).<init>("cz.msebera.android.httpclient.wire");
    this.c = ((b)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.h = ((Map)localObject);
  }
  
  protected c a(b.a.a.a.j.f paramf, t paramt, b.a.a.a.l.e parame)
  {
    h localh = new b/a/a/a/i/c/h;
    localh.<init>(paramf, null, paramt, parame);
    return localh;
  }
  
  protected b.a.a.a.j.f a(Socket paramSocket, int paramInt, b.a.a.a.l.e parame)
  {
    b.a.a.a.j.f localf;
    Object localObject1;
    if (paramInt > 0)
    {
      localf = super.a(paramSocket, paramInt, parame);
      localObject1 = this.c;
      boolean bool = ((b)localObject1).a();
      if (!bool) {
        break label81;
      }
      localObject1 = new b/a/a/a/i/c/m;
      r localr = new b/a/a/a/i/c/r;
      Object localObject2 = this.c;
      localr.<init>((b)localObject2);
      localObject2 = b.a.a.a.l.f.a(parame);
      ((m)localObject1).<init>(localf, localr, (String)localObject2);
    }
    for (;;)
    {
      return (b.a.a.a.j.f)localObject1;
      paramInt = 8192;
      break;
      label81:
      localObject1 = localf;
    }
  }
  
  public s a()
  {
    s locals = super.a();
    b localb1 = this.a;
    int i = localb1.a();
    Object localObject1;
    Object localObject2;
    if (i != 0)
    {
      localb1 = this.a;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Receiving response: ");
      localObject2 = locals.a();
      localObject1 = localObject2;
      localb1.a(localObject1);
    }
    localb1 = this.b;
    i = localb1.a();
    if (i != 0)
    {
      localb1 = this.b;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("<< ");
      localObject2 = locals.a().toString();
      localObject1 = (String)localObject2;
      localb1.a(localObject1);
      localObject1 = locals.getAllHeaders();
      int k = localObject1.length;
      i = 0;
      localb1 = null;
      while (i < k)
      {
        String str1 = localObject1[i];
        b localb2 = this.b;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str2 = "<< ";
        localStringBuilder = localStringBuilder.append(str2);
        str1 = str1.toString();
        str1 = str1;
        localb2.a(str1);
        int j;
        i += 1;
      }
    }
    return locals;
  }
  
  public Object a(String paramString)
  {
    return this.h.get(paramString);
  }
  
  public void a(b.a.a.a.q paramq)
  {
    b localb1 = this.a;
    int i = localb1.a();
    Object localObject1;
    Object localObject2;
    if (i != 0)
    {
      localb1 = this.a;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Sending request: ");
      localObject2 = paramq.getRequestLine();
      localObject1 = localObject2;
      localb1.a(localObject1);
    }
    super.a(paramq);
    localb1 = this.b;
    i = localb1.a();
    if (i != 0)
    {
      localb1 = this.b;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(">> ");
      localObject2 = paramq.getRequestLine().toString();
      localObject1 = (String)localObject2;
      localb1.a(localObject1);
      localObject1 = paramq.getAllHeaders();
      int k = localObject1.length;
      i = 0;
      localb1 = null;
      while (i < k)
      {
        String str1 = localObject1[i];
        b localb2 = this.b;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str2 = ">> ";
        localStringBuilder = localStringBuilder.append(str2);
        str1 = str1.toString();
        str1 = str1;
        localb2.a(str1);
        int j;
        i += 1;
      }
    }
  }
  
  public void a(String paramString, Object paramObject)
  {
    this.h.put(paramString, paramObject);
  }
  
  public void a(Socket paramSocket, b.a.a.a.n paramn)
  {
    q();
    this.d = paramSocket;
    this.e = paramn;
    boolean bool = this.g;
    if (bool)
    {
      paramSocket.close();
      InterruptedIOException localInterruptedIOException = new java/io/InterruptedIOException;
      localInterruptedIOException.<init>("Connection already shutdown");
      throw localInterruptedIOException;
    }
  }
  
  public void a(Socket paramSocket, b.a.a.a.n paramn, boolean paramBoolean, b.a.a.a.l.e parame)
  {
    j();
    a.a(paramn, "Target host");
    String str = "Parameters";
    a.a(parame, str);
    if (paramSocket != null)
    {
      this.d = paramSocket;
      a(paramSocket, parame);
    }
    this.e = paramn;
    this.f = paramBoolean;
  }
  
  public void a(boolean paramBoolean, b.a.a.a.l.e parame)
  {
    a.a(parame, "Parameters");
    q();
    this.f = paramBoolean;
    Socket localSocket = this.d;
    a(localSocket, parame);
  }
  
  protected g b(Socket paramSocket, int paramInt, b.a.a.a.l.e parame)
  {
    g localg;
    Object localObject1;
    if (paramInt > 0)
    {
      localg = super.b(paramSocket, paramInt, parame);
      localObject1 = this.c;
      boolean bool = ((b)localObject1).a();
      if (!bool) {
        break label81;
      }
      localObject1 = new b/a/a/a/i/c/n;
      r localr = new b/a/a/a/i/c/r;
      Object localObject2 = this.c;
      localr.<init>((b)localObject2);
      localObject2 = b.a.a.a.l.f.a(parame);
      ((n)localObject1).<init>(localg, localr, (String)localObject2);
    }
    for (;;)
    {
      return (g)localObject1;
      paramInt = 8192;
      break;
      label81:
      localObject1 = localg;
    }
  }
  
  public void close()
  {
    try
    {
      super.close();
      b localb = this.a;
      boolean bool = localb.a();
      if (bool)
      {
        localb = this.a;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = "Connection ";
        localObject = ((StringBuilder)localObject).append(str);
        localObject = ((StringBuilder)localObject).append(this);
        str = " closed";
        localObject = ((StringBuilder)localObject).append(str);
        localObject = ((StringBuilder)localObject).toString();
        localb.a(localObject);
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject = this.a;
        String str = "I/O error closing connection";
        ((b)localObject).a(str, localIOException);
      }
    }
  }
  
  public void e()
  {
    boolean bool = true;
    this.g = bool;
    try
    {
      super.e();
      Object localObject1 = this.a;
      bool = ((b)localObject1).a();
      if (bool)
      {
        localObject1 = this.a;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Connection ";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject2 = ((StringBuilder)localObject2).append(this);
        str = " shut down";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((b)localObject1).a(localObject2);
      }
      localObject1 = this.d;
      if (localObject1 != null) {
        ((Socket)localObject1).close();
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject2 = this.a;
        String str = "I/O error shutting down connection";
        ((b)localObject2).a(str, localIOException);
      }
    }
  }
  
  public final boolean h()
  {
    return this.f;
  }
  
  public final Socket i()
  {
    return this.d;
  }
  
  public SSLSession k()
  {
    Object localObject = this.d;
    boolean bool = localObject instanceof SSLSocket;
    if (bool) {}
    for (localObject = ((SSLSocket)this.d).getSession();; localObject = null)
    {
      return (SSLSession)localObject;
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\c\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */