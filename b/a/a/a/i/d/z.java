package b.a.a.a.i.d;

import b.a.a.a.f.b;
import b.a.a.a.f.e;
import b.a.a.a.f.g;
import b.a.a.a.f.l;
import b.a.a.a.f.m;

public class z
  extends a
{
  public void a(b paramb, e parame)
  {
    Object localObject = "Cookie";
    b.a.a.a.o.a.a(paramb, (String)localObject);
    int i = paramb.j();
    if (i < 0)
    {
      localObject = new b/a/a/a/f/g;
      ((g)localObject).<init>("Cookie version may not be negative");
      throw ((Throwable)localObject);
    }
  }
  
  public void a(m paramm, String paramString)
  {
    Object localObject = "Cookie";
    b.a.a.a.o.a.a(paramm, (String)localObject);
    if (paramString == null)
    {
      localObject = new b/a/a/a/f/l;
      ((l)localObject).<init>("Missing value for version attribute");
      throw ((Throwable)localObject);
    }
    localObject = paramString.trim();
    int i = ((String)localObject).length();
    if (i == 0)
    {
      localObject = new b/a/a/a/f/l;
      ((l)localObject).<init>("Blank value for version attribute");
      throw ((Throwable)localObject);
    }
    try
    {
      i = Integer.parseInt(paramString);
      paramm.a(i);
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      l locall = new b/a/a/a/f/l;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder = localStringBuilder.append("Invalid version: ");
      String str = localNumberFormatException.getMessage();
      str = str;
      locall.<init>(str);
      throw locall;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */