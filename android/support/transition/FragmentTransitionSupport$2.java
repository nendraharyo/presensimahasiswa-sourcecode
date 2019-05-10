package android.support.transition;

import android.view.View;
import java.util.ArrayList;

class FragmentTransitionSupport$2
  implements u.c
{
  FragmentTransitionSupport$2(FragmentTransitionSupport paramFragmentTransitionSupport, View paramView, ArrayList paramArrayList) {}
  
  public void a(u paramu)
  {
    paramu.b(this);
    this.a.setVisibility(8);
    Object localObject = this.b;
    int i = ((ArrayList)localObject).size();
    int k;
    for (int j = 0; j < i; j = k)
    {
      localObject = (View)this.b.get(j);
      ((View)localObject).setVisibility(0);
      k = j + 1;
    }
  }
  
  public void b(u paramu) {}
  
  public void c(u paramu) {}
  
  public void d(u paramu) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\FragmentTransitionSupport$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */