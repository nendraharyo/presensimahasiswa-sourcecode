package b.a.a.a.n;

import b.a.a.a.ab;
import b.a.a.a.ac;
import b.a.a.a.ae;
import b.a.a.a.n;
import b.a.a.a.o;
import b.a.a.a.o.a;
import b.a.a.a.q;
import b.a.a.a.r;
import b.a.a.a.v;
import java.net.InetAddress;

public class l
  implements r
{
  public void process(q paramq, e parame)
  {
    a.a(paramq, "HTTP request");
    Object localObject1 = f.b(parame);
    ac localac = paramq.getRequestLine().b();
    Object localObject2 = paramq.getRequestLine().a();
    Object localObject3 = "CONNECT";
    boolean bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject3);
    if (bool1)
    {
      localObject2 = v.b;
      bool1 = localac.c((ac)localObject2);
      if (!bool1) {}
    }
    do
    {
      return;
      localObject2 = "Host";
      bool1 = paramq.containsHeader((String)localObject2);
    } while (bool1);
    localObject3 = ((f)localObject1).o();
    boolean bool2;
    if (localObject3 == null)
    {
      localObject2 = ((f)localObject1).l();
      bool2 = localObject2 instanceof o;
      if (!bool2) {
        break label236;
      }
      localObject1 = localObject2;
      localObject1 = ((o)localObject2).f();
      localObject2 = (o)localObject2;
      int i = ((o)localObject2).g();
      if (localObject1 == null) {
        break label236;
      }
      localObject3 = new b/a/a/a/n;
      localObject1 = ((InetAddress)localObject1).getHostName();
      ((n)localObject3).<init>((String)localObject1, i);
    }
    label236:
    for (localObject1 = localObject3;; localObject1 = localObject3)
    {
      if (localObject1 == null)
      {
        localObject1 = v.b;
        bool2 = localac.c((ac)localObject1);
        if (bool2) {
          break;
        }
        localObject1 = new b/a/a/a/ab;
        ((ab)localObject1).<init>("Target host missing");
        throw ((Throwable)localObject1);
        localObject1 = localObject3;
      }
      localObject2 = "Host";
      localObject1 = ((n)localObject1).e();
      paramq.addHeader((String)localObject2, (String)localObject1);
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n\l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */