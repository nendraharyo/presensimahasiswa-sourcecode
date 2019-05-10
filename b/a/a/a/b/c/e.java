package b.a.a.a.b.c;

import b.a.a.a.b.f.a;
import b.a.a.a.l;

public abstract class e
  extends k
  implements l
{
  private b.a.a.a.k entity;
  
  public Object clone()
  {
    e locale = (e)super.clone();
    b.a.a.a.k localk = this.entity;
    if (localk != null)
    {
      localk = (b.a.a.a.k)a.a(this.entity);
      locale.entity = localk;
    }
    return locale;
  }
  
  public boolean expectContinue()
  {
    Object localObject = getFirstHeader("Expect");
    boolean bool;
    if (localObject != null)
    {
      String str = "100-continue";
      localObject = ((b.a.a.a.e)localObject).d();
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
  
  public b.a.a.a.k getEntity()
  {
    return this.entity;
  }
  
  public void setEntity(b.a.a.a.k paramk)
  {
    this.entity = paramk;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\c\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */