package b.a.a.a.n;

import b.a.a.a.q;
import b.a.a.a.r;
import b.a.a.a.s;
import b.a.a.a.u;

public final class i
  implements g
{
  private final r[] a;
  private final u[] b;
  
  public i(r[] paramArrayOfr, u[] paramArrayOfu)
  {
    if (paramArrayOfr != null)
    {
      int i = paramArrayOfr.length;
      Object localObject1 = new r[i];
      this.a = ((r[])localObject1);
      localObject1 = this.a;
      System.arraycopy(paramArrayOfr, 0, localObject1, 0, i);
      if (paramArrayOfu == null) {
        break label88;
      }
      i = paramArrayOfu.length;
      localObject1 = new u[i];
      this.b = ((u[])localObject1);
      localObject1 = this.b;
      System.arraycopy(paramArrayOfu, 0, localObject1, 0, i);
    }
    for (;;)
    {
      return;
      Object localObject2 = new r[0];
      this.a = ((r[])localObject2);
      break;
      label88:
      localObject2 = new u[0];
      this.b = ((u[])localObject2);
    }
  }
  
  public void process(q paramq, e parame)
  {
    r[] arrayOfr = this.a;
    int i = arrayOfr.length;
    int j = 0;
    while (j < i)
    {
      r localr = arrayOfr[j];
      localr.process(paramq, parame);
      j += 1;
    }
  }
  
  public void process(s params, e parame)
  {
    u[] arrayOfu = this.b;
    int i = arrayOfu.length;
    int j = 0;
    while (j < i)
    {
      u localu = arrayOfu[j];
      localu.process(params, parame);
      j += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */