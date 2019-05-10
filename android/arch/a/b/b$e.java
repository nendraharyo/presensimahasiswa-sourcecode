package android.arch.a.b;

import java.util.Iterator;
import java.util.Map.Entry;

abstract class b$e
  implements b.f, Iterator
{
  b.c a;
  b.c b;
  
  b$e(b.c paramc1, b.c paramc2)
  {
    this.a = paramc2;
    this.b = paramc1;
  }
  
  private b.c b()
  {
    b.c localc1 = this.b;
    b.c localc2 = this.a;
    if (localc1 != localc2)
    {
      localc1 = this.a;
      if (localc1 != null) {
        break label28;
      }
    }
    for (localc1 = null;; localc1 = a(localc1))
    {
      return localc1;
      label28:
      localc1 = this.b;
    }
  }
  
  abstract b.c a(b.c paramc);
  
  public Map.Entry a()
  {
    b.c localc1 = this.b;
    b.c localc2 = b();
    this.b = localc2;
    return localc1;
  }
  
  public void a_(b.c paramc)
  {
    b.c localc = this.a;
    if (localc == paramc)
    {
      localc = this.b;
      if (paramc == localc)
      {
        this.b = null;
        this.a = null;
      }
    }
    localc = this.a;
    if (localc == paramc)
    {
      localc = this.a;
      localc = b(localc);
      this.a = localc;
    }
    localc = this.b;
    if (localc == paramc)
    {
      localc = b();
      this.b = localc;
    }
  }
  
  abstract b.c b(b.c paramc);
  
  public boolean hasNext()
  {
    b.c localc = this.b;
    boolean bool;
    if (localc != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localc = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\a\b\b$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */