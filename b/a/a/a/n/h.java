package b.a.a.a.n;

import b.a.a.a.ab;
import b.a.a.a.ac;
import b.a.a.a.ae;
import b.a.a.a.af;
import b.a.a.a.i;
import b.a.a.a.l;
import b.a.a.a.m;
import b.a.a.a.o.a;
import b.a.a.a.q;
import b.a.a.a.s;
import b.a.a.a.v;
import java.io.IOException;

public class h
{
  private final int a;
  
  public h()
  {
    this(3000);
  }
  
  public h(int paramInt)
  {
    int i = a.a(paramInt, "Wait for continue time");
    this.a = i;
  }
  
  private static void a(i parami)
  {
    try
    {
      parami.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public s a(q paramq, i parami, e parame)
  {
    a.a(paramq, "HTTP request");
    a.a(parami, "Client connection");
    Object localObject = "HTTP context";
    a.a(parame, (String)localObject);
    try
    {
      localObject = b(paramq, parami, parame);
      if (localObject == null) {
        localObject = c(paramq, parami, parame);
      }
      return (s)localObject;
    }
    catch (IOException localIOException)
    {
      a(parami);
      throw localIOException;
    }
    catch (m localm)
    {
      a(parami);
      throw localm;
    }
    catch (RuntimeException localRuntimeException)
    {
      a(parami);
      throw localRuntimeException;
    }
  }
  
  public void a(q paramq, g paramg, e parame)
  {
    a.a(paramq, "HTTP request");
    a.a(paramg, "HTTP processor");
    a.a(parame, "HTTP context");
    parame.a("http.request", paramq);
    paramg.process(paramq, parame);
  }
  
  public void a(s params, g paramg, e parame)
  {
    a.a(params, "HTTP response");
    a.a(paramg, "HTTP processor");
    a.a(parame, "HTTP context");
    parame.a("http.response", params);
    paramg.process(params, parame);
  }
  
  protected boolean a(q paramq, s params)
  {
    boolean bool1 = false;
    Object localObject = "HEAD";
    String str = paramq.getRequestLine().a();
    boolean bool2 = ((String)localObject).equalsIgnoreCase(str);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      localObject = params.a();
      int i = ((af)localObject).b();
      int j = 200;
      if (i >= j)
      {
        j = 204;
        if (i != j)
        {
          j = 304;
          if (i != j)
          {
            j = 205;
            if (i != j) {
              bool1 = true;
            }
          }
        }
      }
    }
  }
  
  protected s b(q paramq, i parami, e parame)
  {
    int i = 0;
    Object localObject1 = null;
    a.a(paramq, "HTTP request");
    a.a(parami, "Client connection");
    a.a(parame, "HTTP context");
    parame.a("http.connection", parami);
    Object localObject2 = "http.request_sent";
    Object localObject3 = Boolean.FALSE;
    parame.a((String)localObject2, localObject3);
    parami.a(paramq);
    boolean bool1 = paramq instanceof l;
    int m;
    Object localObject4;
    int k;
    if (bool1)
    {
      m = 1;
      localObject4 = ((q)paramq).getRequestLine().b();
      localObject2 = paramq;
      localObject2 = (l)paramq;
      bool1 = ((l)localObject2).expectContinue();
      if (bool1)
      {
        localObject2 = v.b;
        bool1 = ((ac)localObject4).c((ac)localObject2);
        if (!bool1)
        {
          parami.a_();
          int j = this.a;
          boolean bool2 = parami.a(j);
          if (bool2)
          {
            localObject4 = parami.a();
            bool2 = a((q)paramq, (s)localObject4);
            if (bool2) {
              parami.a((s)localObject4);
            }
            localObject2 = ((s)localObject4).a();
            k = ((af)localObject2).b();
            int n = 200;
            if (k < n)
            {
              n = 100;
              if (k != n)
              {
                localObject2 = new b/a/a/a/ab;
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject1 = ((StringBuilder)localObject1).append("Unexpected response: ");
                localObject3 = ((s)localObject4).a();
                localObject1 = localObject3;
                ((ab)localObject2).<init>((String)localObject1);
                throw ((Throwable)localObject2);
              }
              k = 0;
              localObject2 = null;
              i = m;
              if (i != 0)
              {
                paramq = (l)paramq;
                parami.a(paramq);
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      parami.a_();
      localObject3 = Boolean.TRUE;
      parame.a("http.request_sent", localObject3);
      return (s)localObject2;
      k = 0;
      i = 0;
      localObject1 = null;
      localObject2 = localObject4;
      break;
      k = 0;
      localObject2 = null;
      i = m;
      break;
      k = 0;
      localObject2 = null;
    }
  }
  
  protected s c(q paramq, i parami, e parame)
  {
    a.a(paramq, "HTTP request");
    a.a(parami, "Client connection");
    a.a(parame, "HTTP context");
    s locals = null;
    int i = 0;
    af localaf = null;
    for (;;)
    {
      if (locals != null)
      {
        int k = 200;
        if (i >= k) {
          break;
        }
      }
      locals = parami.a();
      i = a(paramq, locals);
      if (i != 0) {
        parami.a(locals);
      }
      localaf = locals.a();
      int j = localaf.b();
    }
    return locals;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */