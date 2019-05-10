package b.a.a.a.i.d;

import b.a.a.a.b.f.b;
import b.a.a.a.f.l;
import b.a.a.a.f.m;
import java.util.Date;

public class g
  extends a
{
  private final String[] a;
  
  public g(String[] paramArrayOfString)
  {
    b.a.a.a.o.a.a(paramArrayOfString, "Array of date patterns");
    this.a = paramArrayOfString;
  }
  
  public void a(m paramm, String paramString)
  {
    Object localObject1 = "Cookie";
    b.a.a.a.o.a.a(paramm, (String)localObject1);
    if (paramString == null)
    {
      localObject1 = new b/a/a/a/f/l;
      ((l)localObject1).<init>("Missing value for expires attribute");
      throw ((Throwable)localObject1);
    }
    localObject1 = this.a;
    localObject1 = b.a(paramString, (String[])localObject1);
    if (localObject1 == null)
    {
      localObject1 = new b/a/a/a/f/l;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Unable to parse expires attribute: " + paramString;
      ((l)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    paramm.b((Date)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */