package android.support.v4.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

class r$3
  implements Transition.TransitionListener
{
  r$3(r paramr, Object paramObject1, ArrayList paramArrayList1, Object paramObject2, ArrayList paramArrayList2, Object paramObject3, ArrayList paramArrayList3) {}
  
  public void onTransitionCancel(Transition paramTransition) {}
  
  public void onTransitionEnd(Transition paramTransition) {}
  
  public void onTransitionPause(Transition paramTransition) {}
  
  public void onTransitionResume(Transition paramTransition) {}
  
  public void onTransitionStart(Transition paramTransition)
  {
    Object localObject1 = this.a;
    Object localObject2;
    ArrayList localArrayList;
    if (localObject1 != null)
    {
      localObject1 = this.g;
      localObject2 = this.a;
      localArrayList = this.b;
      ((r)localObject1).b(localObject2, localArrayList, null);
    }
    localObject1 = this.c;
    if (localObject1 != null)
    {
      localObject1 = this.g;
      localObject2 = this.c;
      localArrayList = this.d;
      ((r)localObject1).b(localObject2, localArrayList, null);
    }
    localObject1 = this.e;
    if (localObject1 != null)
    {
      localObject1 = this.g;
      localObject2 = this.e;
      localArrayList = this.f;
      ((r)localObject1).b(localObject2, localArrayList, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\r$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */