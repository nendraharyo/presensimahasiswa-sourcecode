package b.a.a.a.i.e;

import b.a.a.a.ab;
import b.a.a.a.ac;
import b.a.a.a.e;
import b.a.a.a.o.a;
import b.a.a.a.p;
import b.a.a.a.v;

public class d
  implements b.a.a.a.g.d
{
  public static final d a;
  private final int b;
  
  static
  {
    d locald = new b/a/a/a/i/e/d;
    locald.<init>();
    a = locald;
  }
  
  public d()
  {
    this(-1);
  }
  
  public d(int paramInt)
  {
    this.b = paramInt;
  }
  
  public long a(p paramp)
  {
    a.a(paramp, "HTTP message");
    Object localObject1 = paramp.getFirstHeader("Transfer-Encoding");
    Object localObject2;
    boolean bool1;
    Object localObject3;
    long l1;
    if (localObject1 != null)
    {
      localObject1 = ((e)localObject1).d();
      localObject2 = "chunked";
      bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject1);
      if (bool1)
      {
        localObject1 = paramp.getProtocolVersion();
        localObject2 = v.b;
        boolean bool2 = ((ac)localObject1).c((ac)localObject2);
        if (bool2)
        {
          localObject1 = new b/a/a/a/ab;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Chunked transfer encoding not allowed for ");
          localObject3 = paramp.getProtocolVersion();
          localObject2 = localObject3;
          ((ab)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        l1 = -2;
      }
    }
    for (;;)
    {
      return l1;
      localObject2 = "identity";
      bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject1);
      if (bool1)
      {
        l1 = -1;
      }
      else
      {
        localObject2 = new b/a/a/a/ab;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = "Unsupported transfer encoding: " + (String)localObject1;
        ((ab)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
        localObject1 = paramp.getFirstHeader("Content-Length");
        if (localObject1 != null)
        {
          localObject3 = ((e)localObject1).d();
          try
          {
            l1 = Long.parseLong((String)localObject3);
            long l2 = 0L;
            boolean bool3 = l1 < l2;
            if (!bool3) {
              continue;
            }
            localObject1 = new b/a/a/a/ab;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            String str = "Negative content length: ";
            localObject2 = ((StringBuilder)localObject2).append(str);
            localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
            localObject2 = ((StringBuilder)localObject2).toString();
            ((ab)localObject1).<init>((String)localObject2);
            throw ((Throwable)localObject1);
          }
          catch (NumberFormatException localNumberFormatException)
          {
            ab localab = new b/a/a/a/ab;
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = "Invalid content length: " + (String)localObject3;
            localab.<init>((String)localObject2);
            throw localab;
          }
        }
        else
        {
          int i = this.b;
          l1 = i;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\e\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */