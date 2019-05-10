package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

class g
  extends f
{
  private InsetDrawable p;
  
  g(t paramt, k paramk)
  {
    super(paramt, paramk);
  }
  
  public float a()
  {
    return this.n.getElevation();
  }
  
  void a(float paramFloat1, float paramFloat2)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject1;
    boolean bool;
    if (i == j)
    {
      localObject1 = this.n;
      bool = ((t)localObject1).isEnabled();
      if (bool)
      {
        this.n.setElevation(paramFloat1);
        localObject1 = this.n;
        bool = ((t)localObject1).isFocused();
        if (!bool)
        {
          localObject1 = this.n;
          bool = ((t)localObject1).isPressed();
          if (!bool) {}
        }
        else
        {
          localObject1 = this.n;
          ((t)localObject1).setTranslationZ(paramFloat2);
        }
      }
    }
    for (;;)
    {
      localObject1 = this.o;
      bool = ((k)localObject1).b();
      if (bool) {
        e();
      }
      return;
      localObject1 = this.n;
      j = 0;
      StateListAnimator localStateListAnimator = null;
      ((t)localObject1).setTranslationZ(0.0F);
      continue;
      this.n.setElevation(0.0F);
      localObject1 = this.n;
      j = 0;
      localStateListAnimator = null;
      ((t)localObject1).setTranslationZ(0.0F);
      continue;
      localStateListAnimator = new android/animation/StateListAnimator;
      localStateListAnimator.<init>();
      localObject1 = new android/animation/AnimatorSet;
      ((AnimatorSet)localObject1).<init>();
      Object localObject2 = this.n;
      Object localObject3 = new float[1];
      localObject3[0] = paramFloat1;
      localObject2 = ObjectAnimator.ofFloat(localObject2, "elevation", (float[])localObject3).setDuration(0L);
      localObject2 = ((AnimatorSet)localObject1).play((Animator)localObject2);
      Object localObject4 = this.n;
      localObject3 = View.TRANSLATION_Z;
      float[] arrayOfFloat = new float[1];
      arrayOfFloat[0] = paramFloat2;
      localObject4 = ObjectAnimator.ofFloat(localObject4, (Property)localObject3, arrayOfFloat).setDuration(100);
      ((AnimatorSet.Builder)localObject2).with((Animator)localObject4);
      localObject2 = a;
      ((AnimatorSet)localObject1).setInterpolator((TimeInterpolator)localObject2);
      localObject2 = j;
      localStateListAnimator.addState((int[])localObject2, (Animator)localObject1);
      localObject1 = new android/animation/AnimatorSet;
      ((AnimatorSet)localObject1).<init>();
      localObject2 = this.n;
      localObject3 = new float[1];
      localObject3[0] = paramFloat1;
      localObject2 = ObjectAnimator.ofFloat(localObject2, "elevation", (float[])localObject3).setDuration(0L);
      localObject2 = ((AnimatorSet)localObject1).play((Animator)localObject2);
      localObject4 = this.n;
      localObject3 = View.TRANSLATION_Z;
      arrayOfFloat = new float[1];
      arrayOfFloat[0] = paramFloat2;
      localObject4 = ObjectAnimator.ofFloat(localObject4, (Property)localObject3, arrayOfFloat).setDuration(100);
      ((AnimatorSet.Builder)localObject2).with((Animator)localObject4);
      localObject2 = a;
      ((AnimatorSet)localObject1).setInterpolator((TimeInterpolator)localObject2);
      localObject2 = k;
      localStateListAnimator.addState((int[])localObject2, (Animator)localObject1);
      localObject2 = new android/animation/AnimatorSet;
      ((AnimatorSet)localObject2).<init>();
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      localObject4 = this.n;
      localObject3 = "elevation";
      int k = 1;
      arrayOfFloat = new float[k];
      arrayOfFloat[0] = paramFloat1;
      localObject4 = ObjectAnimator.ofFloat(localObject4, (String)localObject3, arrayOfFloat);
      long l = 0L;
      localObject4 = ((ObjectAnimator)localObject4).setDuration(l);
      ((List)localObject1).add(localObject4);
      int m = Build.VERSION.SDK_INT;
      int n = 22;
      if (m >= n)
      {
        m = Build.VERSION.SDK_INT;
        n = 24;
        if (m <= n)
        {
          localObject4 = this.n;
          localObject3 = View.TRANSLATION_Z;
          k = 1;
          arrayOfFloat = new float[k];
          localt = this.n;
          f = localt.getTranslationZ();
          arrayOfFloat[0] = f;
          localObject4 = ObjectAnimator.ofFloat(localObject4, (Property)localObject3, arrayOfFloat);
          l = 100;
          localObject4 = ((ObjectAnimator)localObject4).setDuration(l);
          ((List)localObject1).add(localObject4);
        }
      }
      localObject4 = this.n;
      localObject3 = View.TRANSLATION_Z;
      arrayOfFloat = new float[1];
      arrayOfFloat[0] = 0.0F;
      localObject4 = ObjectAnimator.ofFloat(localObject4, (Property)localObject3, arrayOfFloat).setDuration(100);
      ((List)localObject1).add(localObject4);
      m = 0;
      localObject4 = new ObjectAnimator[0];
      localObject1 = (Animator[])((List)localObject1).toArray((Object[])localObject4);
      ((AnimatorSet)localObject2).playSequentially((Animator[])localObject1);
      localObject1 = a;
      ((AnimatorSet)localObject2).setInterpolator((TimeInterpolator)localObject1);
      localObject1 = l;
      localStateListAnimator.addState((int[])localObject1, (Animator)localObject2);
      localObject1 = new android/animation/AnimatorSet;
      ((AnimatorSet)localObject1).<init>();
      localObject2 = this.n;
      n = 1;
      localObject3 = new float[n];
      localObject3[0] = 0.0F;
      localObject2 = ObjectAnimator.ofFloat(localObject2, "elevation", (float[])localObject3).setDuration(0L);
      localObject2 = ((AnimatorSet)localObject1).play((Animator)localObject2);
      localObject4 = this.n;
      localObject3 = View.TRANSLATION_Z;
      k = 1;
      arrayOfFloat = new float[k];
      float f = 0.0F;
      t localt = null;
      arrayOfFloat[0] = 0.0F;
      localObject4 = ObjectAnimator.ofFloat(localObject4, (Property)localObject3, arrayOfFloat);
      l = 0L;
      localObject4 = ((ObjectAnimator)localObject4).setDuration(l);
      ((AnimatorSet.Builder)localObject2).with((Animator)localObject4);
      localObject2 = a;
      ((AnimatorSet)localObject1).setInterpolator((TimeInterpolator)localObject2);
      localObject2 = m;
      localStateListAnimator.addState((int[])localObject2, (Animator)localObject1);
      localObject1 = this.n;
      ((t)localObject1).setStateListAnimator(localStateListAnimator);
    }
  }
  
  void a(int paramInt)
  {
    Object localObject = this.e;
    boolean bool = localObject instanceof RippleDrawable;
    if (bool)
    {
      localObject = (RippleDrawable)this.e;
      ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
      ((RippleDrawable)localObject).setColor(localColorStateList);
    }
    for (;;)
    {
      return;
      super.a(paramInt);
    }
  }
  
  void a(Rect paramRect)
  {
    k localk = this.o;
    boolean bool = localk.b();
    if (bool)
    {
      localk = this.o;
      float f1 = localk.a();
      float f2 = a();
      float f3 = this.i;
      f2 += f3;
      f3 = j.b(f2, f1, false);
      double d1 = Math.ceil(f3);
      int j = (int)d1;
      f1 = j.a(f2, f1, false);
      double d2 = Math.ceil(f1);
      int i = (int)d2;
      paramRect.set(j, i, j, i);
    }
    for (;;)
    {
      return;
      paramRect.set(0, 0, 0, 0);
    }
  }
  
  void a(int[] paramArrayOfInt) {}
  
  void b() {}
  
  void b(Rect paramRect)
  {
    Object localObject1 = this.o;
    boolean bool = ((k)localObject1).b();
    Object localObject2;
    if (bool)
    {
      localObject1 = new android/graphics/drawable/InsetDrawable;
      localObject2 = this.e;
      int i = paramRect.left;
      int j = paramRect.top;
      int k = paramRect.right;
      int m = paramRect.bottom;
      ((InsetDrawable)localObject1).<init>((Drawable)localObject2, i, j, k, m);
      this.p = ((InsetDrawable)localObject1);
      localObject1 = this.o;
      localObject2 = this.p;
      ((k)localObject1).a((Drawable)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.o;
      localObject2 = this.e;
      ((k)localObject1).a((Drawable)localObject2);
    }
  }
  
  void d()
  {
    e();
  }
  
  boolean h()
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */