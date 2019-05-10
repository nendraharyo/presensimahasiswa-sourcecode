package b.a.a.a.i.d;

import b.a.a.a.f.n;
import java.util.Date;

public class d
  extends c
  implements n
{
  private String a;
  private int[] b;
  private boolean c;
  
  public d(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
  }
  
  public void a(int[] paramArrayOfInt)
  {
    this.b = paramArrayOfInt;
  }
  
  public boolean a(Date paramDate)
  {
    boolean bool = this.c;
    if (!bool)
    {
      bool = super.a(paramDate);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void a_(String paramString)
  {
    this.a = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public Object clone()
  {
    d locald = (d)super.clone();
    int[] arrayOfInt = this.b;
    if (arrayOfInt != null)
    {
      arrayOfInt = (int[])this.b.clone();
      locald.b = arrayOfInt;
    }
    return locald;
  }
  
  public boolean e()
  {
    boolean bool = this.c;
    if (!bool)
    {
      bool = super.e();
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int[] h()
  {
    return this.b;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\d\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */