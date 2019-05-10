package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class g
  extends at
{
  public g() {}
  
  public g(int paramInt)
  {
    a(paramInt);
  }
  
  private static float a(aa paramaa, float paramFloat)
  {
    if (paramaa != null)
    {
      Object localObject = paramaa.a;
      String str = "android:fade:transitionAlpha";
      localObject = (Float)((Map)localObject).get(str);
      if (localObject != null) {
        paramFloat = ((Float)localObject).floatValue();
      }
    }
    return paramFloat;
  }
  
  private Animator a(View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool = paramFloat1 < paramFloat2;
    Object localObject1;
    if (!bool)
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (Animator)localObject1;
      am.a(paramView, paramFloat1);
      localObject1 = am.a;
      int i = 1;
      Object localObject2 = new float[i];
      localObject2[0] = paramFloat2;
      localObject1 = ObjectAnimator.ofFloat(paramView, (Property)localObject1, (float[])localObject2);
      localObject2 = new android/support/transition/g$a;
      ((g.a)localObject2).<init>(paramView);
      ((ObjectAnimator)localObject1).addListener((Animator.AnimatorListener)localObject2);
      localObject2 = new android/support/transition/g$1;
      ((g.1)localObject2).<init>(this, paramView);
      a((u.c)localObject2);
    }
  }
  
  public Animator a(ViewGroup paramViewGroup, View paramView, aa paramaa1, aa paramaa2)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    float f3 = a(paramaa1, 0.0F);
    boolean bool = f3 < f1;
    if (!bool) {}
    for (;;)
    {
      return a(paramView, f2, f1);
      f2 = f3;
    }
  }
  
  public void a(aa paramaa)
  {
    super.a(paramaa);
    Map localMap = paramaa.a;
    Float localFloat = Float.valueOf(am.c(paramaa.b));
    localMap.put("android:fade:transitionAlpha", localFloat);
  }
  
  public Animator b(ViewGroup paramViewGroup, View paramView, aa paramaa1, aa paramaa2)
  {
    am.d(paramView);
    float f = a(paramaa1, 1.0F);
    return a(paramView, f, 0.0F);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */