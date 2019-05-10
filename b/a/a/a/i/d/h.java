package b.a.a.a.i.d;

import b.a.a.a.f.l;
import b.a.a.a.f.m;
import java.util.Date;

public class h
  extends a
{
  public void a(m paramm, String paramString)
  {
    Object localObject1 = "Cookie";
    b.a.a.a.o.a.a(paramm, (String)localObject1);
    if (paramString == null)
    {
      localObject1 = new b/a/a/a/f/l;
      ((l)localObject1).<init>("Missing value for max-age attribute");
      throw ((Throwable)localObject1);
    }
    int i;
    try
    {
      i = Integer.parseInt(paramString);
      if (i < 0)
      {
        localObject1 = new b/a/a/a/f/l;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Negative max-age attribute: " + paramString;
        ((l)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      l locall = new b/a/a/a/f/l;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Invalid max-age attribute: " + paramString;
      locall.<init>((String)localObject2);
      throw locall;
    }
    Object localObject2 = new java/util/Date;
    long l1 = System.currentTimeMillis();
    long l2 = i * 1000L;
    l1 += l2;
    ((Date)localObject2).<init>(l1);
    paramm.b((Date)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */