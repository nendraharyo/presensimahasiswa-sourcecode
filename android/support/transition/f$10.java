package android.support.transition;

import android.view.ViewGroup;

class f$10
  extends v
{
  boolean a = false;
  
  f$10(f paramf, ViewGroup paramViewGroup) {}
  
  public void a(u paramu)
  {
    boolean bool = this.a;
    if (!bool)
    {
      ViewGroup localViewGroup = this.b;
      af.a(localViewGroup, false);
    }
    paramu.b(this);
  }
  
  public void b(u paramu)
  {
    af.a(this.b, false);
  }
  
  public void c(u paramu)
  {
    af.a(this.b, true);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\f$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */