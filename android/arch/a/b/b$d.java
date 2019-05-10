package android.arch.a.b;

import java.util.Iterator;
import java.util.Map.Entry;

class b$d
  implements b.f, Iterator
{
  private b.c b;
  private boolean c = true;
  
  private b$d(b paramb) {}
  
  public Map.Entry a()
  {
    boolean bool = this.c;
    if (bool)
    {
      bool = false;
      this.c = false;
      localc = b.a(this.a);
      this.b = localc;
      return this.b;
    }
    b.c localc = this.b;
    if (localc != null) {}
    for (localc = this.b.c;; localc = null)
    {
      this.b = localc;
      break;
      bool = false;
    }
  }
  
  public void a_(b.c paramc)
  {
    b.c localc = this.b;
    boolean bool;
    if (paramc == localc)
    {
      localc = this.b.d;
      this.b = localc;
      localc = this.b;
      if (localc != null) {
        break label40;
      }
      bool = true;
    }
    for (;;)
    {
      this.c = bool;
      return;
      label40:
      bool = false;
      localc = null;
    }
  }
  
  public boolean hasNext()
  {
    boolean bool1 = true;
    boolean bool2 = this.c;
    b.c localc;
    if (bool2)
    {
      localc = b.a(this.a);
      if (localc == null) {}
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      continue;
      localc = this.b;
      if (localc != null)
      {
        localc = this.b.c;
        if (localc != null) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\a\b\b$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */