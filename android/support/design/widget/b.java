package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.design.a.a;
import android.support.v4.view.r;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.List;

public abstract class b
{
  static final Handler a;
  private static final boolean d;
  final b.f b;
  final l.a c;
  private final ViewGroup e;
  private final b.c f;
  private List g;
  private final AccessibilityManager h;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j)
    {
      i = Build.VERSION.SDK_INT;
      j = 19;
      if (i <= j) {
        i = 1;
      }
    }
    for (;;)
    {
      d = i;
      Handler localHandler = new android/os/Handler;
      Looper localLooper = Looper.getMainLooper();
      b.1 local1 = new android/support/design/widget/b$1;
      local1.<init>();
      localHandler.<init>(localLooper, local1);
      a = localHandler;
      return;
      i = 0;
      localHandler = null;
    }
  }
  
  private void d(int paramInt)
  {
    long l = 250L;
    int i = 0;
    int j = Build.VERSION.SDK_INT;
    int k = 12;
    Object localObject1;
    Object localObject2;
    if (j >= k)
    {
      localObject1 = new android/animation/ValueAnimator;
      ((ValueAnimator)localObject1).<init>();
      k = 2;
      localObject2 = new int[k];
      localObject2[0] = 0;
      i = 1;
      b.f localf = this.b;
      int m = localf.getHeight();
      localObject2[i] = m;
      ((ValueAnimator)localObject1).setIntValues((int[])localObject2);
      localObject2 = a.b;
      ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
      ((ValueAnimator)localObject1).setDuration(l);
      localObject2 = new android/support/design/widget/b$2;
      ((b.2)localObject2).<init>(this, paramInt);
      ((ValueAnimator)localObject1).addListener((Animator.AnimatorListener)localObject2);
      localObject2 = new android/support/design/widget/b$3;
      ((b.3)localObject2).<init>(this);
      ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
      ((ValueAnimator)localObject1).start();
    }
    for (;;)
    {
      return;
      localObject1 = this.b.getContext();
      k = a.a.design_snackbar_out;
      localObject1 = AnimationUtils.loadAnimation((Context)localObject1, k);
      localObject2 = a.b;
      ((Animation)localObject1).setInterpolator((Interpolator)localObject2);
      ((Animation)localObject1).setDuration(l);
      localObject2 = new android/support/design/widget/b$4;
      ((b.4)localObject2).<init>(this, paramInt);
      ((Animation)localObject1).setAnimationListener((Animation.AnimationListener)localObject2);
      localObject2 = this.b;
      ((b.f)localObject2).startAnimation((Animation)localObject1);
    }
  }
  
  void a(int paramInt)
  {
    l locall = l.a();
    l.a locala = this.c;
    locall.a(locala, paramInt);
  }
  
  public boolean a()
  {
    l locall = l.a();
    l.a locala = this.c;
    return locall.e(locala);
  }
  
  final void b()
  {
    Object localObject1 = this.b.getParent();
    if (localObject1 == null)
    {
      localObject1 = this.b.getLayoutParams();
      boolean bool1 = localObject1 instanceof CoordinatorLayout.e;
      if (bool1)
      {
        localObject1 = (CoordinatorLayout.e)localObject1;
        localObject2 = new android/support/design/widget/b$b;
        ((b.b)localObject2).<init>(this);
        ((b.b)localObject2).a(0.1F);
        ((b.b)localObject2).b(0.6F);
        ((b.b)localObject2).a(0);
        b.5 local5 = new android/support/design/widget/b$5;
        local5.<init>(this);
        ((b.b)localObject2).a(local5);
        ((CoordinatorLayout.e)localObject1).a((CoordinatorLayout.b)localObject2);
        int i = 80;
        ((CoordinatorLayout.e)localObject1).g = i;
      }
      localObject1 = this.e;
      localObject2 = this.b;
      ((ViewGroup)localObject1).addView((View)localObject2);
    }
    localObject1 = this.b;
    Object localObject2 = new android/support/design/widget/b$6;
    ((b.6)localObject2).<init>(this);
    ((b.f)localObject1).setOnAttachStateChangeListener((b.d)localObject2);
    localObject1 = this.b;
    boolean bool2 = r.w((View)localObject1);
    if (bool2)
    {
      bool2 = e();
      if (bool2) {
        c();
      }
    }
    for (;;)
    {
      return;
      d();
      continue;
      localObject1 = this.b;
      localObject2 = new android/support/design/widget/b$7;
      ((b.7)localObject2).<init>(this);
      ((b.f)localObject1).setOnLayoutChangeListener((b.e)localObject2);
    }
  }
  
  final void b(int paramInt)
  {
    boolean bool = e();
    if (bool)
    {
      b.f localf = this.b;
      int i = localf.getVisibility();
      if (i == 0) {
        d(paramInt);
      }
    }
    for (;;)
    {
      return;
      c(paramInt);
    }
  }
  
  void c()
  {
    long l = 250L;
    int i = Build.VERSION.SDK_INT;
    int j = 12;
    Object localObject1;
    Object localObject2;
    float f1;
    if (i >= j)
    {
      localObject1 = this.b;
      i = ((b.f)localObject1).getHeight();
      boolean bool = d;
      if (bool)
      {
        localObject2 = this.b;
        r.c((View)localObject2, i);
        localObject2 = new android/animation/ValueAnimator;
        ((ValueAnimator)localObject2).<init>();
        int m = 2;
        f1 = 2.8E-45F;
        Object localObject3 = new int[m];
        localObject3[0] = i;
        int n = 1;
        localObject3[n] = 0;
        ((ValueAnimator)localObject2).setIntValues((int[])localObject3);
        localObject3 = a.b;
        ((ValueAnimator)localObject2).setInterpolator((TimeInterpolator)localObject3);
        ((ValueAnimator)localObject2).setDuration(l);
        localObject3 = new android/support/design/widget/b$8;
        ((b.8)localObject3).<init>(this);
        ((ValueAnimator)localObject2).addListener((Animator.AnimatorListener)localObject3);
        localObject3 = new android/support/design/widget/b$9;
        ((b.9)localObject3).<init>(this, i);
        ((ValueAnimator)localObject2).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject3);
        ((ValueAnimator)localObject2).start();
      }
    }
    for (;;)
    {
      return;
      localObject2 = this.b;
      f1 = i;
      ((b.f)localObject2).setTranslationY(f1);
      break;
      localObject1 = this.b.getContext();
      int k = a.a.design_snackbar_in;
      localObject1 = AnimationUtils.loadAnimation((Context)localObject1, k);
      localObject2 = a.b;
      ((Animation)localObject1).setInterpolator((Interpolator)localObject2);
      ((Animation)localObject1).setDuration(l);
      localObject2 = new android/support/design/widget/b$10;
      ((b.10)localObject2).<init>(this);
      ((Animation)localObject1).setAnimationListener((Animation.AnimationListener)localObject2);
      localObject2 = this.b;
      ((b.f)localObject2).startAnimation((Animation)localObject1);
    }
  }
  
  void c(int paramInt)
  {
    Object localObject1 = l.a();
    Object localObject2 = this.c;
    ((l)localObject1).a((l.a)localObject2);
    localObject1 = this.g;
    if (localObject1 != null)
    {
      localObject1 = this.g;
      i = ((List)localObject1).size() + -1;
      for (j = i; j >= 0; j = i)
      {
        localObject1 = (b.a)this.g.get(j);
        ((b.a)localObject1).a(this, paramInt);
        i = j + -1;
      }
    }
    int i = Build.VERSION.SDK_INT;
    int j = 11;
    if (i < j)
    {
      localObject1 = this.b;
      j = 8;
      ((b.f)localObject1).setVisibility(j);
    }
    localObject1 = this.b.getParent();
    boolean bool = localObject1 instanceof ViewGroup;
    if (bool)
    {
      localObject1 = (ViewGroup)localObject1;
      localObject2 = this.b;
      ((ViewGroup)localObject1).removeView((View)localObject2);
    }
  }
  
  void d()
  {
    Object localObject = l.a();
    l.a locala = this.c;
    ((l)localObject).b(locala);
    localObject = this.g;
    if (localObject != null)
    {
      localObject = this.g;
      int i = ((List)localObject).size() + -1;
      for (int j = i; j >= 0; j = i)
      {
        localObject = (b.a)this.g.get(j);
        ((b.a)localObject).a(this);
        i = j + -1;
      }
    }
  }
  
  boolean e()
  {
    AccessibilityManager localAccessibilityManager = this.h;
    boolean bool = localAccessibilityManager.isEnabled();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAccessibilityManager = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */