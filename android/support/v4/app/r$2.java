package android.support.v4.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.View;
import java.util.ArrayList;

class r$2
  implements Transition.TransitionListener
{
  r$2(r paramr, View paramView, ArrayList paramArrayList) {}
  
  public void onTransitionCancel(Transition paramTransition) {}
  
  public void onTransitionEnd(Transition paramTransition)
  {
    paramTransition.removeListener(this);
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
  
  public void onTransitionPause(Transition paramTransition) {}
  
  public void onTransitionResume(Transition paramTransition) {}
  
  public void onTransitionStart(Transition paramTransition) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\r$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */