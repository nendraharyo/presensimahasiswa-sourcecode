package android.support.transition;

import android.view.View;
import android.view.ViewGroup;

public class t
{
  private ViewGroup a;
  private Runnable b;
  
  static t a(View paramView)
  {
    int i = r.a.transition_current_scene;
    return (t)paramView.getTag(i);
  }
  
  static void a(View paramView, t paramt)
  {
    int i = r.a.transition_current_scene;
    paramView.setTag(i, paramt);
  }
  
  public void a()
  {
    Object localObject = a(this.a);
    if (localObject == this)
    {
      localObject = this.b;
      if (localObject != null)
      {
        localObject = this.b;
        ((Runnable)localObject).run();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */