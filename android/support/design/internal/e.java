package android.support.design.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.transition.aa;
import android.support.transition.u;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

public class e
  extends u
{
  private void d(aa paramaa)
  {
    Object localObject = paramaa.b;
    boolean bool = localObject instanceof TextView;
    if (bool)
    {
      localObject = (TextView)paramaa.b;
      Map localMap = paramaa.a;
      String str = "android:textscale:scale";
      float f = ((TextView)localObject).getScaleX();
      localObject = Float.valueOf(f);
      localMap.put(str, localObject);
    }
  }
  
  public Animator a(ViewGroup paramViewGroup, aa paramaa1, aa paramaa2)
  {
    int i = 1065353216;
    float f1 = 1.0F;
    if ((paramaa1 != null) && (paramaa2 != null))
    {
      localObject1 = paramaa1.b;
      bool1 = localObject1 instanceof TextView;
      if (bool1)
      {
        localObject1 = paramaa2.b;
        bool1 = localObject1 instanceof TextView;
        if (bool1) {
          break label61;
        }
      }
    }
    boolean bool1 = false;
    Object localObject1 = null;
    for (;;)
    {
      return (Animator)localObject1;
      label61:
      localObject1 = (TextView)paramaa2.b;
      Object localObject2 = paramaa1.a;
      Map localMap = paramaa2.a;
      Object localObject3 = ((Map)localObject2).get("android:textscale:scale");
      if (localObject3 != null)
      {
        localObject3 = "android:textscale:scale";
        localObject2 = (Float)((Map)localObject2).get(localObject3);
        f2 = ((Float)localObject2).floatValue();
      }
      for (float f3 = f2;; f3 = f1)
      {
        localObject2 = localMap.get("android:textscale:scale");
        if (localObject2 != null)
        {
          localObject2 = (Float)localMap.get("android:textscale:scale");
          f1 = ((Float)localObject2).floatValue();
        }
        boolean bool2 = f3 < f1;
        if (bool2) {
          break label196;
        }
        bool1 = false;
        localObject1 = null;
        break;
        k = i;
      }
      label196:
      int j = 2;
      float f2 = 2.8E-45F;
      localObject2 = new float[j];
      localObject2[0] = f3;
      int k = 1;
      f3 = Float.MIN_VALUE;
      localObject2[k] = f1;
      localObject2 = ValueAnimator.ofFloat((float[])localObject2);
      localObject3 = new android/support/design/internal/e$1;
      ((e.1)localObject3).<init>(this, (TextView)localObject1);
      ((ValueAnimator)localObject2).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject3);
      localObject1 = localObject2;
    }
  }
  
  public void a(aa paramaa)
  {
    d(paramaa);
  }
  
  public void b(aa paramaa)
  {
    d(paramaa);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\internal\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */