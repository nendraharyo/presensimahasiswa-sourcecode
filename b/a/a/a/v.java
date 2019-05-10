package b.a.a.a;

import java.io.Serializable;

public final class v
  extends ac
  implements Serializable
{
  public static final v a;
  public static final v b;
  public static final v c;
  
  static
  {
    int i = 1;
    v localv = new b/a/a/a/v;
    localv.<init>(0, 9);
    a = localv;
    localv = new b/a/a/a/v;
    localv.<init>(i, 0);
    b = localv;
    localv = new b/a/a/a/v;
    localv.<init>(i, i);
    c = localv;
  }
  
  public v(int paramInt1, int paramInt2)
  {
    super("HTTP", paramInt1, paramInt2);
  }
  
  public ac a(int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = this.e;
    if (paramInt1 == j)
    {
      j = this.f;
      if (paramInt2 != j) {}
    }
    for (;;)
    {
      return this;
      if (paramInt1 == i)
      {
        if (paramInt2 == 0)
        {
          this = b;
          continue;
        }
        if (paramInt2 == i)
        {
          this = c;
          continue;
        }
      }
      if (paramInt1 == 0)
      {
        j = 9;
        if (paramInt2 == j)
        {
          this = a;
          continue;
        }
      }
      this = new b/a/a/a/v;
      this(paramInt1, paramInt2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */