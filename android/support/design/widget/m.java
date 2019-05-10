package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

final class m
{
  ValueAnimator a;
  private final ArrayList b;
  private m.a c;
  private final Animator.AnimatorListener d;
  
  m()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.b = ((ArrayList)localObject);
    this.c = null;
    this.a = null;
    localObject = new android/support/design/widget/m$1;
    ((m.1)localObject).<init>(this);
    this.d = ((Animator.AnimatorListener)localObject);
  }
  
  private void a(m.a parama)
  {
    ValueAnimator localValueAnimator = parama.b;
    this.a = localValueAnimator;
    this.a.start();
  }
  
  private void b()
  {
    ValueAnimator localValueAnimator = this.a;
    if (localValueAnimator != null)
    {
      this.a.cancel();
      localValueAnimator = null;
      this.a = null;
    }
  }
  
  public void a()
  {
    ValueAnimator localValueAnimator = this.a;
    if (localValueAnimator != null)
    {
      this.a.end();
      localValueAnimator = null;
      this.a = null;
    }
  }
  
  void a(int[] paramArrayOfInt)
  {
    m.a locala1 = null;
    int i = this.b.size();
    int j = 0;
    m.a locala2 = null;
    int k = 0;
    if (k < i)
    {
      locala2 = (m.a)this.b.get(k);
      int[] arrayOfInt = locala2.a;
      boolean bool = StateSet.stateSetMatches(arrayOfInt, paramArrayOfInt);
      if (!bool) {}
    }
    for (;;)
    {
      locala1 = this.c;
      if (locala2 == locala1) {}
      for (;;)
      {
        return;
        j = k + 1;
        k = j;
        break;
        locala1 = this.c;
        if (locala1 != null) {
          b();
        }
        this.c = locala2;
        if (locala2 != null) {
          a(locala2);
        }
      }
      j = 0;
      locala2 = null;
    }
  }
  
  public void a(int[] paramArrayOfInt, ValueAnimator paramValueAnimator)
  {
    m.a locala = new android/support/design/widget/m$a;
    locala.<init>(paramArrayOfInt, paramValueAnimator);
    Animator.AnimatorListener localAnimatorListener = this.d;
    paramValueAnimator.addListener(localAnimatorListener);
    this.b.add(locala);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */