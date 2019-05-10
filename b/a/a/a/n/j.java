package b.a.a.a.n;

import b.a.a.a.ab;
import b.a.a.a.ac;
import b.a.a.a.ae;
import b.a.a.a.k;
import b.a.a.a.l;
import b.a.a.a.o.a;
import b.a.a.a.q;
import b.a.a.a.r;
import b.a.a.a.v;

public class j
  implements r
{
  private final boolean a;
  
  public j()
  {
    this(false);
  }
  
  public j(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public void process(q paramq, e parame)
  {
    Object localObject1 = "HTTP request";
    a.a(paramq, (String)localObject1);
    boolean bool1 = paramq instanceof l;
    if (bool1)
    {
      bool1 = this.a;
      if (!bool1) {
        break label107;
      }
      ((q)paramq).removeHeaders("Transfer-Encoding");
      localObject1 = "Content-Length";
      ((q)paramq).removeHeaders((String)localObject1);
    }
    Object localObject2;
    label107:
    do
    {
      localObject2 = ((q)paramq).getRequestLine().b();
      localObject1 = paramq;
      localObject1 = ((l)paramq).getEntity();
      if (localObject1 != null) {
        break;
      }
      localObject1 = "Content-Length";
      localObject2 = "0";
      ((q)paramq).addHeader((String)localObject1, (String)localObject2);
      return;
      localObject1 = "Transfer-Encoding";
      bool1 = ((q)paramq).containsHeader((String)localObject1);
      if (bool1)
      {
        localObject1 = new b/a/a/a/ab;
        ((ab)localObject1).<init>("Transfer-encoding header already present");
        throw ((Throwable)localObject1);
      }
      localObject1 = "Content-Length";
      bool1 = ((q)paramq).containsHeader((String)localObject1);
    } while (!bool1);
    localObject1 = new b/a/a/a/ab;
    ((ab)localObject1).<init>("Content-Length header already present");
    throw ((Throwable)localObject1);
    boolean bool2 = ((k)localObject1).isChunked();
    long l1;
    Object localObject3;
    if (!bool2)
    {
      l1 = ((k)localObject1).getContentLength();
      long l2 = 0L;
      bool2 = l1 < l2;
      if (!bool2) {}
    }
    else
    {
      localObject3 = v.b;
      bool2 = ((ac)localObject2).c((ac)localObject3);
      if (bool2)
      {
        localObject1 = new b/a/a/a/ab;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject2 = "Chunked transfer encoding not allowed for " + localObject2;
        ((ab)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject2 = "Transfer-Encoding";
      localObject3 = "chunked";
      ((q)paramq).addHeader((String)localObject2, (String)localObject3);
    }
    for (;;)
    {
      localObject2 = ((k)localObject1).getContentType();
      if (localObject2 != null)
      {
        localObject2 = "Content-Type";
        bool3 = ((q)paramq).containsHeader((String)localObject2);
        if (!bool3)
        {
          localObject2 = ((k)localObject1).getContentType();
          ((q)paramq).addHeader((b.a.a.a.e)localObject2);
        }
      }
      localObject2 = ((k)localObject1).getContentEncoding();
      if (localObject2 == null) {
        break;
      }
      localObject2 = "Content-Encoding";
      boolean bool3 = ((q)paramq).containsHeader((String)localObject2);
      if (bool3) {
        break;
      }
      localObject1 = ((k)localObject1).getContentEncoding();
      ((q)paramq).addHeader((b.a.a.a.e)localObject1);
      break;
      localObject2 = "Content-Length";
      l1 = ((k)localObject1).getContentLength();
      localObject3 = Long.toString(l1);
      ((q)paramq).addHeader((String)localObject2, (String)localObject3);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n\j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */