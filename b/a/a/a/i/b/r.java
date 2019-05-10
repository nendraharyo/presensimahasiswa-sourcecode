package b.a.a.a.i.b;

import b.a.a.a.e;
import b.a.a.a.k;
import b.a.a.a.l;

public class r
  extends w
  implements l
{
  private k a;
  private boolean b;
  
  public r(l paraml)
  {
    super(paraml);
    k localk = paraml.getEntity();
    a(localk);
  }
  
  public void a(k paramk)
  {
    r.a locala;
    if (paramk != null)
    {
      locala = new b/a/a/a/i/b/r$a;
      locala.<init>(this, paramk);
    }
    for (;;)
    {
      this.a = locala;
      this.b = false;
      return;
      locala = null;
    }
  }
  
  public boolean a()
  {
    k localk = this.a;
    if (localk != null)
    {
      localk = this.a;
      bool = localk.isRepeatable();
      if (!bool)
      {
        bool = this.b;
        if (bool) {
          break label38;
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label38:
      bool = false;
      localk = null;
    }
  }
  
  public boolean expectContinue()
  {
    Object localObject = getFirstHeader("Expect");
    boolean bool;
    if (localObject != null)
    {
      String str = "100-continue";
      localObject = ((e)localObject).d();
      bool = str.equalsIgnoreCase((String)localObject);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public k getEntity()
  {
    return this.a;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\b\r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */