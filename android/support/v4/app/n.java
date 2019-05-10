package android.support.v4.app;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.h.b;
import android.support.v4.h.e;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class n
  extends m
  implements LayoutInflater.Factory2
{
  static final Interpolator F;
  static final Interpolator G;
  static final Interpolator H;
  static final Interpolator I;
  static boolean a;
  static Field q;
  Bundle A;
  SparseArray B;
  ArrayList C;
  o D;
  Runnable E;
  private final CopyOnWriteArrayList J;
  ArrayList b;
  boolean c;
  int d = 0;
  final ArrayList e;
  SparseArray f;
  ArrayList g;
  ArrayList h;
  ArrayList i;
  ArrayList j;
  ArrayList k;
  int l;
  l m;
  j n;
  Fragment o;
  Fragment p;
  boolean r;
  boolean s;
  boolean t;
  boolean u;
  String v;
  boolean w;
  ArrayList x;
  ArrayList y;
  ArrayList z;
  
  static
  {
    float f1 = 2.5F;
    float f2 = 1.5F;
    a = false;
    q = null;
    Object localObject = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject).<init>(f1);
    F = (Interpolator)localObject;
    localObject = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject).<init>(f2);
    G = (Interpolator)localObject;
    localObject = new android/view/animation/AccelerateInterpolator;
    ((AccelerateInterpolator)localObject).<init>(f1);
    H = (Interpolator)localObject;
    localObject = new android/view/animation/AccelerateInterpolator;
    ((AccelerateInterpolator)localObject).<init>(f2);
    I = (Interpolator)localObject;
  }
  
  n()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.e = ((ArrayList)localObject);
    localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    this.J = ((CopyOnWriteArrayList)localObject);
    this.l = 0;
    this.A = null;
    this.B = null;
    localObject = new android/support/v4/app/n$1;
    ((n.1)localObject).<init>(this);
    this.E = ((Runnable)localObject);
  }
  
  private void B()
  {
    boolean bool = g();
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Can not perform this action after onSaveInstanceState");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.v;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Can not perform this action inside of ");
      String str = this.v;
      localObject2 = str;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  /* Error */
  private void C()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 136	android/support/v4/app/n:C	Ljava/util/ArrayList;
    //   10: astore_3
    //   11: aload_3
    //   12: ifnull +113 -> 125
    //   15: aload_0
    //   16: getfield 136	android/support/v4/app/n:C	Ljava/util/ArrayList;
    //   19: astore_3
    //   20: aload_3
    //   21: invokevirtual 139	java/util/ArrayList:isEmpty	()Z
    //   24: istore 4
    //   26: iload 4
    //   28: ifne +97 -> 125
    //   31: iload_2
    //   32: istore 4
    //   34: aload_0
    //   35: getfield 141	android/support/v4/app/n:b	Ljava/util/ArrayList;
    //   38: astore 5
    //   40: aload 5
    //   42: ifnull +91 -> 133
    //   45: aload_0
    //   46: getfield 141	android/support/v4/app/n:b	Ljava/util/ArrayList;
    //   49: astore 5
    //   51: aload 5
    //   53: invokevirtual 145	java/util/ArrayList:size	()I
    //   56: istore 6
    //   58: iload 6
    //   60: iload_2
    //   61: if_icmpne +72 -> 133
    //   64: iload 4
    //   66: ifne +7 -> 73
    //   69: iload_2
    //   70: ifeq +52 -> 122
    //   73: aload_0
    //   74: getfield 147	android/support/v4/app/n:m	Landroid/support/v4/app/l;
    //   77: astore 7
    //   79: aload 7
    //   81: invokevirtual 152	android/support/v4/app/l:j	()Landroid/os/Handler;
    //   84: astore 7
    //   86: aload_0
    //   87: getfield 108	android/support/v4/app/n:E	Ljava/lang/Runnable;
    //   90: astore_1
    //   91: aload 7
    //   93: aload_1
    //   94: invokevirtual 158	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   97: aload_0
    //   98: getfield 147	android/support/v4/app/n:m	Landroid/support/v4/app/l;
    //   101: astore 7
    //   103: aload 7
    //   105: invokevirtual 152	android/support/v4/app/l:j	()Landroid/os/Handler;
    //   108: astore 7
    //   110: aload_0
    //   111: getfield 108	android/support/v4/app/n:E	Ljava/lang/Runnable;
    //   114: astore_1
    //   115: aload 7
    //   117: aload_1
    //   118: invokevirtual 162	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   121: pop
    //   122: aload_0
    //   123: monitorexit
    //   124: return
    //   125: iconst_0
    //   126: istore 4
    //   128: aconst_null
    //   129: astore_3
    //   130: goto -96 -> 34
    //   133: iconst_0
    //   134: istore_2
    //   135: aconst_null
    //   136: astore 7
    //   138: goto -74 -> 64
    //   141: astore 7
    //   143: aload_0
    //   144: monitorexit
    //   145: aload 7
    //   147: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	n
    //   1	117	1	localRunnable	Runnable
    //   3	132	2	i1	int
    //   10	120	3	localArrayList1	ArrayList
    //   24	103	4	bool	boolean
    //   38	14	5	localArrayList2	ArrayList
    //   56	6	6	i2	int
    //   77	60	7	localObject1	Object
    //   141	5	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   6	10	141	finally
    //   15	19	141	finally
    //   20	24	141	finally
    //   34	38	141	finally
    //   45	49	141	finally
    //   51	56	141	finally
    //   73	77	141	finally
    //   79	84	141	finally
    //   86	90	141	finally
    //   93	97	141	finally
    //   97	101	141	finally
    //   103	108	141	finally
    //   110	114	141	finally
    //   117	122	141	finally
    //   122	124	141	finally
    //   143	145	141	finally
  }
  
  private void D()
  {
    this.c = false;
    this.y.clear();
    this.x.clear();
  }
  
  private void E()
  {
    Object localObject = this.C;
    if (localObject != null) {
      for (;;)
      {
        localObject = this.C;
        boolean bool = ((ArrayList)localObject).isEmpty();
        if (bool) {
          break;
        }
        localObject = (n.i)this.C.remove(0);
        ((n.i)localObject).d();
      }
    }
  }
  
  private void F()
  {
    Object localObject = this.f;
    int i1;
    int i2;
    label13:
    Fragment localFragment;
    int i4;
    if (localObject == null)
    {
      i1 = 0;
      i2 = 0;
      if (i2 >= i1) {
        return;
      }
      localObject = this.f;
      localFragment = (Fragment)((SparseArray)localObject).valueAt(i2);
      if (localFragment != null)
      {
        localObject = localFragment.getAnimatingAway();
        if (localObject == null) {
          break label134;
        }
        int i3 = localFragment.getStateAfterAnimating();
        localObject = localFragment.getAnimatingAway();
        Animation localAnimation = ((View)localObject).getAnimation();
        if (localAnimation != null)
        {
          localAnimation.cancel();
          ((View)localObject).clearAnimation();
        }
        i4 = 0;
        localFragment.setAnimatingAway(null);
        localObject = this;
        localAnimation = null;
        a(localFragment, i3, 0, 0, false);
      }
    }
    for (;;)
    {
      i4 = i2 + 1;
      i2 = i4;
      break label13;
      localObject = this.f;
      i4 = ((SparseArray)localObject).size();
      i1 = i4;
      break;
      label134:
      localObject = localFragment.getAnimator();
      if (localObject != null)
      {
        localObject = localFragment.getAnimator();
        ((Animator)localObject).end();
      }
    }
  }
  
  private void G()
  {
    SparseArray localSparseArray1 = this.f;
    if (localSparseArray1 != null)
    {
      localSparseArray1 = this.f;
      int i1 = localSparseArray1.size() + -1;
      while (i1 >= 0)
      {
        Object localObject = this.f.valueAt(i1);
        if (localObject == null)
        {
          localObject = this.f;
          SparseArray localSparseArray2 = this.f;
          int i2 = localSparseArray2.keyAt(i1);
          ((SparseArray)localObject).delete(i2);
        }
        i1 += -1;
      }
    }
  }
  
  private int a(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2, b paramb)
  {
    int i1 = paramInt2 + -1;
    int i2 = i1;
    int i3 = paramInt2;
    d locald;
    Object localObject;
    label87:
    label164:
    int i5;
    if (i2 >= paramInt1)
    {
      locald = (d)paramArrayList1.get(i2);
      localObject = (Boolean)paramArrayList2.get(i2);
      boolean bool1 = ((Boolean)localObject).booleanValue();
      boolean bool2 = locald.g();
      if (bool2)
      {
        int i4 = i2 + 1;
        boolean bool3 = locald.a(paramArrayList1, i4, paramInt2);
        if (!bool3)
        {
          bool3 = true;
          if (!bool3) {
            break label240;
          }
          localObject = this.C;
          if (localObject == null)
          {
            localObject = new java/util/ArrayList;
            ((ArrayList)localObject).<init>();
            this.C = ((ArrayList)localObject);
          }
          localObject = new android/support/v4/app/n$i;
          ((n.i)localObject).<init>(locald, bool1);
          ArrayList localArrayList = this.C;
          localArrayList.add(localObject);
          locald.a((Fragment.c)localObject);
          if (!bool1) {
            break label228;
          }
          locald.f();
          i5 = i3 + -1;
          if (i2 != i5)
          {
            paramArrayList1.remove(i2);
            paramArrayList1.add(i5, locald);
          }
          b(paramb);
        }
      }
    }
    label228:
    label240:
    for (i1 = i5;; i1 = i3)
    {
      i5 = i2 + -1;
      i2 = i5;
      i3 = i1;
      break;
      i5 = 0;
      localObject = null;
      break label87;
      locald.b(false);
      break label164;
      return i3;
    }
  }
  
  static n.c a(Context paramContext, float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new android/view/animation/AlphaAnimation;
    localAlphaAnimation.<init>(paramFloat1, paramFloat2);
    Object localObject = G;
    localAlphaAnimation.setInterpolator((Interpolator)localObject);
    localAlphaAnimation.setDuration(220L);
    localObject = new android/support/v4/app/n$c;
    ((n.c)localObject).<init>(localAlphaAnimation, null);
    return (n.c)localObject;
  }
  
  static n.c a(Context paramContext, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new android/view/animation/AnimationSet;
    localAnimationSet.<init>(false);
    Object localObject = new android/view/animation/ScaleAnimation;
    ((ScaleAnimation)localObject).<init>(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    Interpolator localInterpolator = F;
    ((ScaleAnimation)localObject).setInterpolator(localInterpolator);
    ((ScaleAnimation)localObject).setDuration(220L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new android/view/animation/AlphaAnimation;
    ((AlphaAnimation)localObject).<init>(paramFloat3, paramFloat4);
    localInterpolator = G;
    ((AlphaAnimation)localObject).setInterpolator(localInterpolator);
    ((AlphaAnimation)localObject).setDuration(220L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new android/support/v4/app/n$c;
    ((n.c)localObject).<init>(localAnimationSet, null);
    return (n.c)localObject;
  }
  
  private static Animation.AnimationListener a(Animation paramAnimation)
  {
    try
    {
      localObject1 = q;
      if (localObject1 == null)
      {
        localObject1 = Animation.class;
        str1 = "mListener";
        localObject1 = ((Class)localObject1).getDeclaredField(str1);
        q = (Field)localObject1;
        localObject1 = q;
        boolean bool = true;
        ((Field)localObject1).setAccessible(bool);
      }
      localObject1 = q;
      localObject1 = ((Field)localObject1).get(paramAnimation);
      localObject1 = (Animation.AnimationListener)localObject1;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        Object localObject1;
        str1 = "FragmentManager";
        str2 = "No field with the name mListener is found in Animation class";
        Log.e(str1, str2, localNoSuchFieldException);
        Object localObject2 = null;
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        String str1 = "FragmentManager";
        String str2 = "Cannot access Animation's mListener field";
        Log.e(str1, str2, localIllegalAccessException);
        Object localObject3 = null;
      }
    }
    return (Animation.AnimationListener)localObject1;
  }
  
  private void a(Fragment paramFragment, n.c paramc, int paramInt)
  {
    View localView = paramFragment.mView;
    ViewGroup localViewGroup = paramFragment.mContainer;
    localViewGroup.startViewTransition(localView);
    paramFragment.setStateAfterAnimating(paramInt);
    Object localObject1 = paramc.a;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = new android/support/v4/app/n$e;
      localObject2 = paramc.a;
      ((n.e)localObject1).<init>((Animation)localObject2, localViewGroup, localView);
      localObject2 = paramFragment.mView;
      paramFragment.setAnimatingAway((View)localObject2);
      localObject2 = a((Animation)localObject1);
      n.2 local2 = new android/support/v4/app/n$2;
      local2.<init>(this, (Animation.AnimationListener)localObject2, localViewGroup, paramFragment);
      ((Animation)localObject1).setAnimationListener(local2);
      b(localView, paramc);
      localView = paramFragment.mView;
      localView.startAnimation((Animation)localObject1);
    }
    for (;;)
    {
      return;
      localObject1 = paramc.b;
      localObject2 = paramc.b;
      paramFragment.setAnimator((Animator)localObject2);
      localObject2 = new android/support/v4/app/n$3;
      ((n.3)localObject2).<init>(this, localViewGroup, localView, paramFragment);
      ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject2);
      localView = paramFragment.mView;
      ((Animator)localObject1).setTarget(localView);
      localView = paramFragment.mView;
      b(localView, paramc);
      ((Animator)localObject1).start();
    }
  }
  
  private void a(d paramd, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject;
    int i4;
    int i6;
    if (paramBoolean1)
    {
      paramd.b(paramBoolean3);
      ArrayList localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>(i1);
      ArrayList localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>(i1);
      localArrayList1.add(paramd);
      localObject = Boolean.valueOf(paramBoolean1);
      localArrayList2.add(localObject);
      float f2;
      if (paramBoolean2)
      {
        localObject = this;
        f2 = f1;
        q.a(this, localArrayList1, localArrayList2, 0, i1, i1);
      }
      if (paramBoolean3)
      {
        i4 = this.l;
        a(i4, i1);
      }
      localObject = this.f;
      if (localObject == null) {
        return;
      }
      localObject = this.f;
      int i5 = ((SparseArray)localObject).size();
      i6 = 0;
      localArrayList1 = null;
      label135:
      if (i6 >= i5) {
        return;
      }
      localObject = (Fragment)this.f.valueAt(i6);
      if (localObject != null)
      {
        View localView = ((Fragment)localObject).mView;
        if (localView != null)
        {
          boolean bool1 = ((Fragment)localObject).mIsNewlyAdded;
          if (bool1)
          {
            int i2 = ((Fragment)localObject).mContainerId;
            boolean bool2 = paramd.b(i2);
            if (bool2)
            {
              f1 = ((Fragment)localObject).mPostponedAlpha;
              bool2 = f1 < 0.0F;
              if (bool2)
              {
                localView = ((Fragment)localObject).mView;
                f2 = ((Fragment)localObject).mPostponedAlpha;
                localView.setAlpha(f2);
              }
              if (!paramBoolean3) {
                break label275;
              }
              ((Fragment)localObject).mPostponedAlpha = 0.0F;
            }
          }
        }
      }
    }
    for (;;)
    {
      i4 = i6 + 1;
      i6 = i4;
      break label135;
      paramd.f();
      break;
      label275:
      int i3 = -1082130432;
      f1 = -1.0F;
      ((Fragment)localObject).mPostponedAlpha = f1;
      ((Fragment)localObject).mIsNewlyAdded = false;
    }
  }
  
  private static void a(o paramo)
  {
    if (paramo == null) {}
    Object localObject;
    boolean bool1;
    do
    {
      return;
      localObject = paramo.a();
      if (localObject != null)
      {
        localIterator = ((List)localObject).iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject = (Fragment)localIterator.next();
          boolean bool2 = true;
          ((Fragment)localObject).mRetaining = bool2;
        }
      }
      localObject = paramo.b();
    } while (localObject == null);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (o)localIterator.next();
      a((o)localObject);
    }
  }
  
  private void a(b paramb)
  {
    int i1 = paramb.size();
    int i2 = 0;
    Fragment localFragment = null;
    for (int i3 = 0; i3 < i1; i3 = i2)
    {
      localFragment = (Fragment)paramb.b(i3);
      boolean bool = localFragment.mAdded;
      if (!bool)
      {
        View localView = localFragment.getView();
        float f1 = localView.getAlpha();
        localFragment.mPostponedAlpha = f1;
        i2 = 0;
        localFragment = null;
        localView.setAlpha(0.0F);
      }
      i2 = i3 + 1;
    }
  }
  
  private void a(RuntimeException paramRuntimeException)
  {
    Object localObject1 = paramRuntimeException.getMessage();
    Log.e("FragmentManager", (String)localObject1);
    Log.e("FragmentManager", "Activity state:");
    Object localObject2 = new android/support/v4/h/e;
    ((e)localObject2).<init>("FragmentManager");
    localObject1 = new java/io/PrintWriter;
    ((PrintWriter)localObject1).<init>((Writer)localObject2);
    localObject2 = this.m;
    if (localObject2 != null) {}
    for (;;)
    {
      try
      {
        localObject2 = this.m;
        str2 = "  ";
        arrayOfString1 = null;
        String[] arrayOfString2 = null;
        arrayOfString2 = new String[0];
        ((l)localObject2).a(str2, null, (PrintWriter)localObject1, arrayOfString2);
      }
      catch (Exception localException1)
      {
        localObject1 = "FragmentManager";
        str2 = "Failed dumping state";
        Log.e((String)localObject1, str2, localException1);
        continue;
      }
      throw paramRuntimeException;
      String str1 = "  ";
      String str2 = null;
      String[] arrayOfString1 = null;
      try
      {
        arrayOfString1 = new String[0];
        a(str1, null, (PrintWriter)localObject1, arrayOfString1);
      }
      catch (Exception localException2)
      {
        localObject1 = "FragmentManager";
        str2 = "Failed dumping state";
        Log.e((String)localObject1, str2, localException2);
      }
    }
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i1 = -1;
    Object localObject1 = this.C;
    int i2;
    int i3;
    int i4;
    label26:
    Object localObject2;
    int i6;
    if (localObject1 == null)
    {
      i2 = 0;
      localObject1 = null;
      i3 = 0;
      i4 = i2;
      if (i3 >= i4) {
        return;
      }
      localObject1 = (n.i)this.C.get(i3);
      if (paramArrayList1 == null) {
        break label149;
      }
      boolean bool1 = n.i.a((n.i)localObject1);
      if (bool1) {
        break label149;
      }
      localObject2 = n.i.b((n.i)localObject1);
      int i5 = paramArrayList1.indexOf(localObject2);
      if (i5 == i1) {
        break label149;
      }
      localObject2 = (Boolean)paramArrayList2.get(i5);
      i6 = ((Boolean)localObject2).booleanValue();
      if (i6 == 0) {
        break label149;
      }
      ((n.i)localObject1).e();
      i2 = i3;
      i6 = i4;
    }
    for (;;)
    {
      i3 = i2 + 1;
      i4 = i6;
      break label26;
      localObject1 = this.C;
      i2 = ((ArrayList)localObject1).size();
      break;
      label149:
      i6 = ((n.i)localObject1).c();
      if (i6 == 0)
      {
        if (paramArrayList1 != null)
        {
          localObject2 = n.i.b((n.i)localObject1);
          int i8 = paramArrayList1.size();
          i6 = ((d)localObject2).a(paramArrayList1, 0, i8);
          if (i6 == 0) {}
        }
      }
      else
      {
        localObject2 = this.C;
        ((ArrayList)localObject2).remove(i3);
        i3 += -1;
        i4 += -1;
        if (paramArrayList1 != null)
        {
          i6 = n.i.a((n.i)localObject1);
          if (i6 == 0)
          {
            localObject2 = n.i.b((n.i)localObject1);
            int i7 = paramArrayList1.indexOf(localObject2);
            if (i7 != i1)
            {
              localObject2 = (Boolean)paramArrayList2.get(i7);
              bool2 = ((Boolean)localObject2).booleanValue();
              if (bool2)
              {
                ((n.i)localObject1).e();
                i2 = i3;
                bool2 = i4;
                continue;
              }
            }
          }
        }
        ((n.i)localObject1).d();
      }
      i2 = i3;
      boolean bool2 = i4;
    }
  }
  
  private void a(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    b localb = null;
    boolean bool2 = ((d)paramArrayList1.get(paramInt1)).t;
    Object localObject1 = this.z;
    Object localObject2;
    int i1;
    Object localObject3;
    int i2;
    label86:
    boolean bool3;
    label144:
    boolean bool4;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.z = ((ArrayList)localObject1);
      localObject1 = this.z;
      localObject2 = this.e;
      ((ArrayList)localObject1).addAll((Collection)localObject2);
      localObject2 = z();
      i1 = paramInt1;
      localObject3 = localObject2;
      i2 = 0;
      if (i1 >= paramInt2) {
        break label225;
      }
      localObject1 = (d)paramArrayList1.get(i1);
      localObject2 = (Boolean)paramArrayList2.get(i1);
      bool3 = ((Boolean)localObject2).booleanValue();
      if (bool3) {
        break label196;
      }
      localObject2 = this.z;
      localObject2 = ((d)localObject1).a((ArrayList)localObject2, (Fragment)localObject3);
      if (i2 == 0)
      {
        bool4 = ((d)localObject1).i;
        if (!bool4) {
          break label216;
        }
      }
      bool4 = bool1;
    }
    for (;;)
    {
      i1 += 1;
      localObject3 = localObject2;
      i2 = bool4;
      break label86;
      localObject1 = this.z;
      ((ArrayList)localObject1).clear();
      break;
      label196:
      localObject2 = this.z;
      localObject2 = ((d)localObject1).b((ArrayList)localObject2, (Fragment)localObject3);
      break label144;
      label216:
      bool4 = false;
      localObject1 = null;
    }
    label225:
    localObject1 = this.z;
    ((ArrayList)localObject1).clear();
    int i5;
    if (!bool2)
    {
      localObject1 = this;
      localObject2 = paramArrayList1;
      i5 = paramInt2;
      q.a(this, paramArrayList1, paramArrayList2, paramInt1, paramInt2, false);
    }
    b(paramArrayList1, paramArrayList2, paramInt1, paramInt2);
    if (bool2)
    {
      localb = new android/support/v4/h/b;
      localb.<init>();
      b(localb);
      localObject1 = this;
      localObject2 = paramArrayList1;
      i5 = paramInt2;
      i5 = a(paramArrayList1, paramArrayList2, paramInt1, paramInt2, localb);
      a(localb);
    }
    for (;;)
    {
      if ((i5 != paramInt1) && (bool2))
      {
        localObject1 = this;
        localObject2 = paramArrayList1;
        q.a(this, paramArrayList1, paramArrayList2, paramInt1, i5, bool1);
        int i4 = this.l;
        a(i4, bool1);
      }
      while (paramInt1 < paramInt2)
      {
        localObject1 = (d)paramArrayList1.get(paramInt1);
        localObject2 = (Boolean)paramArrayList2.get(paramInt1);
        bool3 = ((Boolean)localObject2).booleanValue();
        if (bool3)
        {
          int i3 = ((d)localObject1).m;
          if (i3 >= 0)
          {
            i3 = ((d)localObject1).m;
            c(i3);
            i3 = -1;
            ((d)localObject1).m = i3;
          }
        }
        ((d)localObject1).b();
        paramInt1 += 1;
      }
      if (i2 != 0) {
        k();
      }
      return;
      i5 = paramInt2;
    }
  }
  
  static boolean a(Animator paramAnimator)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramAnimator == null) {}
    Animator localAnimator;
    boolean bool3;
    do
    {
      return bool2;
      int i1 = paramAnimator instanceof ValueAnimator;
      if (i1 != 0)
      {
        paramAnimator = (ValueAnimator)paramAnimator;
        arrayOfPropertyValuesHolder = paramAnimator.getValues();
        i1 = 0;
        localAnimator = null;
        for (;;)
        {
          int i5 = arrayOfPropertyValuesHolder.length;
          if (i1 >= i5) {
            break;
          }
          localObject = "alpha";
          String str = arrayOfPropertyValuesHolder[i1].getPropertyName();
          boolean bool5 = ((String)localObject).equals(str);
          if (bool5)
          {
            bool2 = bool1;
            break;
          }
          int i2;
          i1 += 1;
        }
      }
      bool3 = paramAnimator instanceof AnimatorSet;
    } while (!bool3);
    paramAnimator = (AnimatorSet)paramAnimator;
    Object localObject = paramAnimator.getChildAnimations();
    int i6 = 0;
    PropertyValuesHolder[] arrayOfPropertyValuesHolder = null;
    for (;;)
    {
      int i3 = ((List)localObject).size();
      if (i6 >= i3) {
        break;
      }
      localAnimator = (Animator)((List)localObject).get(i6);
      boolean bool4 = a(localAnimator);
      if (bool4)
      {
        bool2 = bool1;
        break;
      }
      int i4 = i6 + 1;
      i6 = i4;
    }
  }
  
  static boolean a(n.c paramc)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = paramc.a;
    int i1 = localObject1 instanceof AlphaAnimation;
    if (i1 != 0) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      localObject1 = paramc.a;
      i1 = localObject1 instanceof AnimationSet;
      if (i1 != 0)
      {
        List localList = ((AnimationSet)paramc.a).getAnimations();
        i1 = 0;
        localObject1 = null;
        for (;;)
        {
          int i3 = localList.size();
          if (i1 >= i3) {
            break;
          }
          Object localObject2 = localList.get(i1);
          boolean bool3 = localObject2 instanceof AlphaAnimation;
          if (bool3)
          {
            bool2 = bool1;
            break;
          }
          int i2;
          i1 += 1;
        }
      }
      localObject1 = paramc.b;
      bool2 = a((Animator)localObject1);
    }
  }
  
  static boolean a(View paramView, n.c paramc)
  {
    boolean bool1 = false;
    if ((paramView == null) || (paramc == null)) {}
    for (;;)
    {
      return bool1;
      int i1 = Build.VERSION.SDK_INT;
      int i2 = 19;
      if (i1 >= i2)
      {
        i1 = paramView.getLayerType();
        if (i1 == 0)
        {
          boolean bool2 = r.q(paramView);
          if (bool2)
          {
            bool2 = a(paramc);
            if (bool2) {
              bool1 = true;
            }
          }
        }
      }
    }
  }
  
  private boolean a(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    i();
    c(bool1);
    Object localObject1 = this.p;
    boolean bool2;
    if ((localObject1 != null) && (paramInt1 < 0) && (paramString == null))
    {
      localObject1 = this.p.peekChildFragmentManager();
      if (localObject1 != null)
      {
        bool2 = ((m)localObject1).c();
        if (bool2) {
          bool2 = bool1;
        }
      }
    }
    for (;;)
    {
      return bool2;
      ArrayList localArrayList1 = this.x;
      ArrayList localArrayList2 = this.y;
      localObject1 = this;
      bool2 = a(localArrayList1, localArrayList2, paramString, paramInt1, paramInt2);
      if (bool2) {
        this.c = bool1;
      }
      try
      {
        localArrayList1 = this.x;
        localArrayList2 = this.y;
        b(localArrayList1, localArrayList2);
        D();
        j();
        G();
      }
      finally
      {
        D();
      }
    }
  }
  
  public static int b(int paramInt, boolean paramBoolean)
  {
    int i1 = -1;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return i1;
      if (paramBoolean)
      {
        i1 = 1;
      }
      else
      {
        i1 = 2;
        continue;
        if (paramBoolean)
        {
          i1 = 3;
        }
        else
        {
          i1 = 4;
          continue;
          if (paramBoolean) {
            i1 = 5;
          } else {
            i1 = 6;
          }
        }
      }
    }
  }
  
  private void b(b paramb)
  {
    int i1 = this.l;
    int i3 = 1;
    if (i1 < i3) {}
    for (;;)
    {
      return;
      i1 = this.l;
      i3 = 4;
      int i4 = Math.min(i1, i3);
      Object localObject = this.e;
      int i5 = ((ArrayList)localObject).size();
      int i2;
      for (int i6 = 0; i6 < i5; i6 = i2)
      {
        localObject = this.e;
        Fragment localFragment = (Fragment)((ArrayList)localObject).get(i6);
        i1 = localFragment.mState;
        if (i1 < i4)
        {
          int i7 = localFragment.getNextAnim();
          int i8 = localFragment.getNextTransition();
          localObject = this;
          a(localFragment, i4, i7, i8, false);
          localObject = localFragment.mView;
          if (localObject != null)
          {
            boolean bool = localFragment.mHidden;
            if (!bool)
            {
              bool = localFragment.mIsNewlyAdded;
              if (bool) {
                paramb.add(localFragment);
              }
            }
          }
        }
        i2 = i6 + 1;
      }
    }
  }
  
  private static void b(View paramView, n.c paramc)
  {
    if ((paramView == null) || (paramc == null)) {}
    for (;;)
    {
      return;
      boolean bool = a(paramView, paramc);
      if (bool)
      {
        Object localObject1 = paramc.b;
        Object localObject2;
        if (localObject1 != null)
        {
          localObject1 = paramc.b;
          localObject2 = new android/support/v4/app/n$d;
          ((n.d)localObject2).<init>(paramView);
          ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject2);
        }
        else
        {
          localObject1 = a(paramc.a);
          int i1 = 2;
          paramView.setLayerType(i1, null);
          localObject2 = paramc.a;
          n.a locala = new android/support/v4/app/n$a;
          locala.<init>(paramView, (Animation.AnimationListener)localObject1);
          ((Animation)localObject2).setAnimationListener(locala);
        }
      }
    }
  }
  
  private void b(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    int i1 = 0;
    if (paramArrayList1 != null)
    {
      boolean bool = paramArrayList1.isEmpty();
      if (!bool) {}
    }
    else
    {
      return;
    }
    Object localObject;
    if (paramArrayList2 != null)
    {
      int i2 = paramArrayList1.size();
      i4 = paramArrayList2.size();
      if (i2 == i4) {}
    }
    else
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Internal error with the back stack records");
      throw ((Throwable)localObject);
    }
    a(paramArrayList1, paramArrayList2);
    int i5 = paramArrayList1.size();
    int i4 = 0;
    label72:
    int i6;
    if (i1 < i5)
    {
      localObject = (d)paramArrayList1.get(i1);
      i3 = ((d)localObject).t;
      if (i3 != 0) {
        break label259;
      }
      if (i4 != i1) {
        a(paramArrayList1, paramArrayList2, i4, i1);
      }
      i4 = i1 + 1;
      localObject = (Boolean)paramArrayList2.get(i1);
      i3 = ((Boolean)localObject).booleanValue();
      if (i3 != 0) {
        while (i4 < i5)
        {
          localObject = (Boolean)paramArrayList2.get(i4);
          i3 = ((Boolean)localObject).booleanValue();
          if (i3 == 0) {
            break;
          }
          localObject = (d)paramArrayList1.get(i4);
          i3 = ((d)localObject).t;
          if (i3 != 0) {
            break;
          }
          i4 += 1;
        }
      }
      i3 = i4;
      a(paramArrayList1, paramArrayList2, i1, i4);
      i6 = i4 + -1;
      i4 = i3;
    }
    label259:
    for (int i3 = i6;; i3 = i1)
    {
      i1 = i3 + 1;
      break label72;
      if (i4 == i5) {
        break;
      }
      a(paramArrayList1, paramArrayList2, i4, i5);
      break;
    }
  }
  
  private static void b(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    int i1 = 1;
    if (paramInt1 < paramInt2)
    {
      d locald = (d)paramArrayList1.get(paramInt1);
      Boolean localBoolean = (Boolean)paramArrayList2.get(paramInt1);
      boolean bool = localBoolean.booleanValue();
      int i2;
      if (bool)
      {
        locald.a(-1);
        i2 = paramInt2 + -1;
        if (paramInt1 == i2)
        {
          i2 = i1;
          label61:
          locald.b(i2);
        }
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        i2 = 0;
        localBoolean = null;
        break label61;
        locald.a(i1);
        locald.f();
      }
    }
  }
  
  private void c(boolean paramBoolean)
  {
    boolean bool = this.c;
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("FragmentManager is already executing transactions");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.m;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Fragment host has been destroyed");
      throw ((Throwable)localObject1);
    }
    localObject1 = Looper.myLooper();
    Looper localLooper = this.m.j().getLooper();
    if (localObject1 != localLooper)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Must be called from main thread of fragment host");
      throw ((Throwable)localObject1);
    }
    if (!paramBoolean) {
      B();
    }
    localObject1 = this.x;
    if (localObject1 == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.x = ((ArrayList)localObject1);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.y = ((ArrayList)localObject1);
    }
    this.c = true;
    bool = false;
    localObject1 = null;
    localLooper = null;
    try
    {
      a(null, null);
      return;
    }
    finally
    {
      this.c = false;
    }
  }
  
  /* Error */
  private boolean c(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 141	android/support/v4/app/n:b	Ljava/util/ArrayList;
    //   11: astore 5
    //   13: aload 5
    //   15: ifnull +21 -> 36
    //   18: aload_0
    //   19: getfield 141	android/support/v4/app/n:b	Ljava/util/ArrayList;
    //   22: astore 5
    //   24: aload 5
    //   26: invokevirtual 145	java/util/ArrayList:size	()I
    //   29: istore 6
    //   31: iload 6
    //   33: ifne +7 -> 40
    //   36: aload_0
    //   37: monitorexit
    //   38: iload_3
    //   39: ireturn
    //   40: aload_0
    //   41: getfield 141	android/support/v4/app/n:b	Ljava/util/ArrayList;
    //   44: astore 5
    //   46: aload 5
    //   48: invokevirtual 145	java/util/ArrayList:size	()I
    //   51: istore 7
    //   53: iconst_0
    //   54: istore 8
    //   56: aconst_null
    //   57: astore 9
    //   59: iconst_0
    //   60: istore 6
    //   62: aconst_null
    //   63: astore 5
    //   65: iload 8
    //   67: iload 7
    //   69: if_icmpge +52 -> 121
    //   72: aload_0
    //   73: getfield 141	android/support/v4/app/n:b	Ljava/util/ArrayList;
    //   76: astore 4
    //   78: aload 4
    //   80: iload 8
    //   82: invokevirtual 237	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   85: astore 4
    //   87: aload 4
    //   89: checkcast 701	android/support/v4/app/n$g
    //   92: astore 4
    //   94: aload 4
    //   96: aload_1
    //   97: aload_2
    //   98: invokeinterface 704 3 0
    //   103: istore_3
    //   104: iload 6
    //   106: iload_3
    //   107: ior
    //   108: istore 6
    //   110: iload 8
    //   112: iconst_1
    //   113: iadd
    //   114: istore_3
    //   115: iload_3
    //   116: istore 8
    //   118: goto -53 -> 65
    //   121: aload_0
    //   122: getfield 141	android/support/v4/app/n:b	Ljava/util/ArrayList;
    //   125: astore 4
    //   127: aload 4
    //   129: invokevirtual 169	java/util/ArrayList:clear	()V
    //   132: aload_0
    //   133: getfield 147	android/support/v4/app/n:m	Landroid/support/v4/app/l;
    //   136: astore 4
    //   138: aload 4
    //   140: invokevirtual 152	android/support/v4/app/l:j	()Landroid/os/Handler;
    //   143: astore 4
    //   145: aload_0
    //   146: getfield 108	android/support/v4/app/n:E	Ljava/lang/Runnable;
    //   149: astore 9
    //   151: aload 4
    //   153: aload 9
    //   155: invokevirtual 158	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   158: aload_0
    //   159: monitorexit
    //   160: iload 6
    //   162: istore_3
    //   163: goto -125 -> 38
    //   166: astore 4
    //   168: aload_0
    //   169: monitorexit
    //   170: aload 4
    //   172: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	n
    //   0	173	1	paramArrayList1	ArrayList
    //   0	173	2	paramArrayList2	ArrayList
    //   1	107	3	i1	int
    //   114	49	3	i2	int
    //   3	149	4	localObject1	Object
    //   166	5	4	localObject2	Object
    //   11	53	5	localArrayList	ArrayList
    //   29	132	6	i3	int
    //   51	19	7	i4	int
    //   54	63	8	i5	int
    //   57	97	9	localRunnable	Runnable
    // Exception table:
    //   from	to	target	type
    //   7	11	166	finally
    //   18	22	166	finally
    //   24	29	166	finally
    //   36	38	166	finally
    //   40	44	166	finally
    //   46	51	166	finally
    //   72	76	166	finally
    //   80	85	166	finally
    //   87	92	166	finally
    //   97	103	166	finally
    //   121	125	166	finally
    //   127	132	166	finally
    //   132	136	166	finally
    //   138	143	166	finally
    //   145	149	166	finally
    //   153	158	166	finally
    //   158	160	166	finally
    //   168	170	166	finally
  }
  
  public static int d(int paramInt)
  {
    int i1 = 0;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return i1;
      i1 = 8194;
      continue;
      i1 = 4097;
      continue;
      i1 = 4099;
    }
  }
  
  private void e(int paramInt)
  {
    boolean bool = true;
    try
    {
      this.c = bool;
      bool = false;
      Object localObject1 = null;
      a(paramInt, false);
      this.c = false;
      i();
      return;
    }
    finally
    {
      this.c = false;
    }
  }
  
  private Fragment p(Fragment paramFragment)
  {
    ViewGroup localViewGroup = paramFragment.mContainer;
    Object localObject1 = paramFragment.mView;
    int i1;
    if ((localViewGroup == null) || (localObject1 == null))
    {
      i1 = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return (Fragment)localObject1;
      localObject1 = this.e;
      i1 = ((ArrayList)localObject1).indexOf(paramFragment) + -1;
      for (int i2 = i1;; i2 = i1)
      {
        if (i2 < 0) {
          break label97;
        }
        localObject1 = (Fragment)this.e.get(i2);
        Object localObject2 = ((Fragment)localObject1).mContainer;
        if (localObject2 == localViewGroup)
        {
          localObject2 = ((Fragment)localObject1).mView;
          if (localObject2 != null) {
            break;
          }
        }
        i1 = i2 + -1;
      }
      label97:
      i1 = 0;
      localObject1 = null;
    }
  }
  
  LayoutInflater.Factory2 A()
  {
    return this;
  }
  
  /* Error */
  public int a(d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 709	android/support/v4/app/n:j	Ljava/util/ArrayList;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +17 -> 25
    //   11: aload_0
    //   12: getfield 709	android/support/v4/app/n:j	Ljava/util/ArrayList;
    //   15: astore_2
    //   16: aload_2
    //   17: invokevirtual 145	java/util/ArrayList:size	()I
    //   20: istore_3
    //   21: iload_3
    //   22: ifgt +136 -> 158
    //   25: aload_0
    //   26: getfield 711	android/support/v4/app/n:i	Ljava/util/ArrayList;
    //   29: astore_2
    //   30: aload_2
    //   31: ifnonnull +16 -> 47
    //   34: new 87	java/util/ArrayList
    //   37: astore_2
    //   38: aload_2
    //   39: invokespecial 88	java/util/ArrayList:<init>	()V
    //   42: aload_0
    //   43: aload_2
    //   44: putfield 711	android/support/v4/app/n:i	Ljava/util/ArrayList;
    //   47: aload_0
    //   48: getfield 711	android/support/v4/app/n:i	Ljava/util/ArrayList;
    //   51: astore_2
    //   52: aload_2
    //   53: invokevirtual 145	java/util/ArrayList:size	()I
    //   56: istore_3
    //   57: getstatic 61	android/support/v4/app/n:a	Z
    //   60: istore 4
    //   62: iload 4
    //   64: ifeq +77 -> 141
    //   67: ldc_w 328
    //   70: astore 5
    //   72: new 122	java/lang/StringBuilder
    //   75: astore 6
    //   77: aload 6
    //   79: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   82: ldc_w 713
    //   85: astore 7
    //   87: aload 6
    //   89: aload 7
    //   91: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: astore 6
    //   96: aload 6
    //   98: iload_3
    //   99: invokevirtual 716	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   102: astore 6
    //   104: ldc_w 718
    //   107: astore 7
    //   109: aload 6
    //   111: aload 7
    //   113: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: astore 6
    //   118: aload 6
    //   120: aload_1
    //   121: invokevirtual 721	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   124: astore 6
    //   126: aload 6
    //   128: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: astore 6
    //   133: aload 5
    //   135: aload 6
    //   137: invokestatic 723	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   140: pop
    //   141: aload_0
    //   142: getfield 711	android/support/v4/app/n:i	Ljava/util/ArrayList;
    //   145: astore 5
    //   147: aload 5
    //   149: aload_1
    //   150: invokevirtual 255	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   153: pop
    //   154: aload_0
    //   155: monitorexit
    //   156: iload_3
    //   157: ireturn
    //   158: aload_0
    //   159: getfield 709	android/support/v4/app/n:j	Ljava/util/ArrayList;
    //   162: astore_2
    //   163: aload_0
    //   164: getfield 709	android/support/v4/app/n:j	Ljava/util/ArrayList;
    //   167: astore 5
    //   169: aload 5
    //   171: invokevirtual 145	java/util/ArrayList:size	()I
    //   174: iconst_m1
    //   175: iadd
    //   176: istore 4
    //   178: aload_2
    //   179: iload 4
    //   181: invokevirtual 175	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   184: astore_2
    //   185: aload_2
    //   186: checkcast 725	java/lang/Integer
    //   189: astore_2
    //   190: aload_2
    //   191: invokevirtual 728	java/lang/Integer:intValue	()I
    //   194: istore_3
    //   195: getstatic 61	android/support/v4/app/n:a	Z
    //   198: istore 4
    //   200: iload 4
    //   202: ifeq +77 -> 279
    //   205: ldc_w 328
    //   208: astore 5
    //   210: new 122	java/lang/StringBuilder
    //   213: astore 6
    //   215: aload 6
    //   217: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   220: ldc_w 730
    //   223: astore 7
    //   225: aload 6
    //   227: aload 7
    //   229: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: astore 6
    //   234: aload 6
    //   236: iload_3
    //   237: invokevirtual 716	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   240: astore 6
    //   242: ldc_w 732
    //   245: astore 7
    //   247: aload 6
    //   249: aload 7
    //   251: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: astore 6
    //   256: aload 6
    //   258: aload_1
    //   259: invokevirtual 721	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   262: astore 6
    //   264: aload 6
    //   266: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: astore 6
    //   271: aload 5
    //   273: aload 6
    //   275: invokestatic 723	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   278: pop
    //   279: aload_0
    //   280: getfield 711	android/support/v4/app/n:i	Ljava/util/ArrayList;
    //   283: astore 5
    //   285: aload 5
    //   287: iload_3
    //   288: aload_1
    //   289: invokevirtual 736	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   292: pop
    //   293: aload_0
    //   294: monitorexit
    //   295: goto -139 -> 156
    //   298: astore_2
    //   299: aload_0
    //   300: monitorexit
    //   301: aload_2
    //   302: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	303	0	this	n
    //   0	303	1	paramd	d
    //   6	185	2	localObject1	Object
    //   298	4	2	localObject2	Object
    //   20	268	3	i1	int
    //   60	3	4	bool1	boolean
    //   176	4	4	i2	int
    //   198	3	4	bool2	boolean
    //   70	216	5	localObject3	Object
    //   75	199	6	localObject4	Object
    //   85	165	7	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	298	finally
    //   11	15	298	finally
    //   16	20	298	finally
    //   25	29	298	finally
    //   34	37	298	finally
    //   38	42	298	finally
    //   43	47	298	finally
    //   47	51	298	finally
    //   52	56	298	finally
    //   57	60	298	finally
    //   72	75	298	finally
    //   77	82	298	finally
    //   89	94	298	finally
    //   98	102	298	finally
    //   111	116	298	finally
    //   120	124	298	finally
    //   126	131	298	finally
    //   135	141	298	finally
    //   141	145	298	finally
    //   149	154	298	finally
    //   154	156	298	finally
    //   158	162	298	finally
    //   163	167	298	finally
    //   169	174	298	finally
    //   179	184	298	finally
    //   185	189	298	finally
    //   190	194	298	finally
    //   195	198	298	finally
    //   210	213	298	finally
    //   215	220	298	finally
    //   227	232	298	finally
    //   236	240	298	finally
    //   249	254	298	finally
    //   258	262	298	finally
    //   264	269	298	finally
    //   273	279	298	finally
    //   279	283	298	finally
    //   288	293	298	finally
    //   293	295	298	finally
    //   299	301	298	finally
  }
  
  public Fragment a(int paramInt)
  {
    Object localObject = this.e;
    int i1 = ((ArrayList)localObject).size() + -1;
    int i2 = i1;
    int i3;
    if (i2 >= 0)
    {
      localObject = (Fragment)this.e.get(i2);
      if (localObject != null)
      {
        i3 = ((Fragment)localObject).mFragmentId;
        if (i3 != paramInt) {}
      }
    }
    for (;;)
    {
      return (Fragment)localObject;
      i1 = i2 + -1;
      i2 = i1;
      break;
      localObject = this.f;
      if (localObject != null)
      {
        localObject = this.f;
        i1 = ((SparseArray)localObject).size() + -1;
        for (i2 = i1;; i2 = i1)
        {
          if (i2 < 0) {
            break label131;
          }
          localObject = (Fragment)this.f.valueAt(i2);
          if (localObject != null)
          {
            i3 = ((Fragment)localObject).mFragmentId;
            if (i3 == paramInt) {
              break;
            }
          }
          i1 = i2 + -1;
        }
      }
      label131:
      i1 = 0;
      localObject = null;
    }
  }
  
  public Fragment a(Bundle paramBundle, String paramString)
  {
    int i1 = -1;
    int i2 = paramBundle.getInt(paramString, i1);
    Fragment localFragment;
    if (i2 == i1)
    {
      i1 = 0;
      localFragment = null;
    }
    for (;;)
    {
      return localFragment;
      localFragment = (Fragment)this.f.get(i2);
      if (localFragment == null)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Fragment no longer exists for key ").append(paramString);
        String str1 = ": index ";
        localStringBuilder = localStringBuilder.append(str1);
        String str2 = i2;
        localIllegalStateException.<init>(str2);
        a(localIllegalStateException);
      }
    }
  }
  
  public Fragment a(String paramString)
  {
    Object localObject;
    int i1;
    int i2;
    String str;
    boolean bool;
    if (paramString != null)
    {
      localObject = this.e;
      i1 = ((ArrayList)localObject).size() + -1;
      i2 = i1;
      if (i2 >= 0)
      {
        localObject = (Fragment)this.e.get(i2);
        if (localObject != null)
        {
          str = ((Fragment)localObject).mTag;
          bool = paramString.equals(str);
          if (!bool) {}
        }
      }
    }
    for (;;)
    {
      return (Fragment)localObject;
      i1 = i2 + -1;
      i2 = i1;
      break;
      localObject = this.f;
      if ((localObject != null) && (paramString != null))
      {
        localObject = this.f;
        i1 = ((SparseArray)localObject).size() + -1;
        for (i2 = i1;; i2 = i1)
        {
          if (i2 < 0) {
            break label153;
          }
          localObject = (Fragment)this.f.valueAt(i2);
          if (localObject != null)
          {
            str = ((Fragment)localObject).mTag;
            bool = paramString.equals(str);
            if (bool) {
              break;
            }
          }
          i1 = i2 + -1;
        }
      }
      label153:
      i1 = 0;
      localObject = null;
    }
  }
  
  n.c a(Fragment paramFragment, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    float f1 = 0.975F;
    float f2 = 0.0F;
    float f3 = 1.0F;
    int i1 = paramFragment.getNextAnim();
    Object localObject1 = paramFragment.onCreateAnimation(paramInt1, paramBoolean, i1);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = new android/support/v4/app/n$c;
      ((n.c)localObject2).<init>((Animation)localObject1, null);
    }
    for (;;)
    {
      return (n.c)localObject2;
      localObject1 = paramFragment.onCreateAnimator(paramInt1, paramBoolean, i1);
      if (localObject1 == null) {
        break;
      }
      localObject2 = new android/support/v4/app/n$c;
      ((n.c)localObject2).<init>((Animator)localObject1, null);
    }
    boolean bool1;
    if (i1 != 0)
    {
      localObject2 = this.m.i().getResources().getResourceTypeName(i1);
      bool1 = "anim".equals(localObject2);
      localObject1 = null;
      if (!bool1) {
        break label553;
      }
    }
    for (;;)
    {
      Object localObject3;
      try
      {
        localObject2 = this.m;
        localObject2 = ((l)localObject2).i();
        localAnimation = AnimationUtils.loadAnimation((Context)localObject2, i1);
        if (localAnimation != null)
        {
          localObject2 = new android/support/v4/app/n$c;
          ((n.c)localObject2).<init>(localAnimation, null);
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        Animation localAnimation;
        throw localNotFoundException;
        i2 = 1;
        if (i2 == 0)
        {
          try
          {
            localObject2 = this.m;
            localObject2 = ((l)localObject2).i();
            localObject1 = AnimatorInflater.loadAnimator((Context)localObject2, i1);
            if (localObject1 == null) {
              break label279;
            }
            localObject2 = new android/support/v4/app/n$c;
            localAnimation = null;
            ((n.c)localObject2).<init>((Animator)localObject1, null);
          }
          catch (RuntimeException localRuntimeException1)
          {
            if (!bool1) {
              continue;
            }
          }
          throw localRuntimeException1;
        }
      }
      catch (RuntimeException localRuntimeException2)
      {
        i2 = 0;
        localObject3 = null;
        continue;
        localObject3 = this.m.i();
        localObject1 = AnimationUtils.loadAnimation((Context)localObject3, i1);
        if (localObject1 != null)
        {
          localObject3 = new android/support/v4/app/n$c;
          ((n.c)localObject3).<init>((Animation)localObject1, null);
        }
      }
      label279:
      if (paramInt1 == 0)
      {
        i2 = 0;
        localObject3 = null;
        break;
      }
      int i2 = b(paramInt1, paramBoolean);
      if (i2 < 0)
      {
        i2 = 0;
        localObject3 = null;
        break;
      }
      boolean bool2;
      switch (i2)
      {
      default: 
        if (paramInt2 == 0)
        {
          localObject3 = this.m;
          bool2 = ((l)localObject3).e();
          if (bool2)
          {
            localObject3 = this.m;
            paramInt2 = ((l)localObject3).f();
          }
        }
        if (paramInt2 == 0)
        {
          bool2 = false;
          localObject3 = null;
        }
        break;
      case 1: 
        localObject3 = this.m.i();
        f2 = 1.125F;
        localObject3 = a((Context)localObject3, f2, f3, 0.0F, f3);
        break;
      case 2: 
        localObject3 = a(this.m.i(), f3, f1, f3, 0.0F);
        break;
      case 3: 
        localObject3 = a(this.m.i(), f1, f3, 0.0F, f3);
        break;
      case 4: 
        localObject3 = this.m.i();
        f2 = 1.075F;
        localObject3 = a((Context)localObject3, f3, f2, f3, 0.0F);
        break;
      case 5: 
        localObject3 = a(this.m.i(), 0.0F, f3);
        break;
      case 6: 
        localObject3 = a(this.m.i(), f3, 0.0F);
        break;
        bool2 = false;
        localObject3 = null;
        break;
        label553:
        bool2 = false;
        localObject3 = null;
      }
    }
  }
  
  public p a()
  {
    d locald = new android/support/v4/app/d;
    locald.<init>(this);
    return locald;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Bad id: " + paramInt1;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new android/support/v4/app/n$h;
    ((n.h)localObject1).<init>(this, null, paramInt1, paramInt2);
    a((n.g)localObject1, false);
  }
  
  /* Error */
  public void a(int paramInt, d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 711	android/support/v4/app/n:i	Ljava/util/ArrayList;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnonnull +16 -> 24
    //   11: new 87	java/util/ArrayList
    //   14: astore_3
    //   15: aload_3
    //   16: invokespecial 88	java/util/ArrayList:<init>	()V
    //   19: aload_0
    //   20: aload_3
    //   21: putfield 711	android/support/v4/app/n:i	Ljava/util/ArrayList;
    //   24: aload_0
    //   25: getfield 711	android/support/v4/app/n:i	Ljava/util/ArrayList;
    //   28: astore_3
    //   29: aload_3
    //   30: invokevirtual 145	java/util/ArrayList:size	()I
    //   33: istore 4
    //   35: iload_1
    //   36: iload 4
    //   38: if_icmpge +100 -> 138
    //   41: getstatic 61	android/support/v4/app/n:a	Z
    //   44: istore 4
    //   46: iload 4
    //   48: ifeq +75 -> 123
    //   51: ldc_w 328
    //   54: astore_3
    //   55: new 122	java/lang/StringBuilder
    //   58: astore 5
    //   60: aload 5
    //   62: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   65: ldc_w 713
    //   68: astore 6
    //   70: aload 5
    //   72: aload 6
    //   74: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: astore 5
    //   79: aload 5
    //   81: iload_1
    //   82: invokevirtual 716	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   85: astore 5
    //   87: ldc_w 718
    //   90: astore 6
    //   92: aload 5
    //   94: aload 6
    //   96: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: astore 5
    //   101: aload 5
    //   103: aload_2
    //   104: invokevirtual 721	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   107: astore 5
    //   109: aload 5
    //   111: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: astore 5
    //   116: aload_3
    //   117: aload 5
    //   119: invokestatic 723	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   122: pop
    //   123: aload_0
    //   124: getfield 711	android/support/v4/app/n:i	Ljava/util/ArrayList;
    //   127: astore_3
    //   128: aload_3
    //   129: iload_1
    //   130: aload_2
    //   131: invokevirtual 736	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   134: pop
    //   135: aload_0
    //   136: monitorexit
    //   137: return
    //   138: iload 4
    //   140: iload_1
    //   141: if_icmpge +139 -> 280
    //   144: aload_0
    //   145: getfield 711	android/support/v4/app/n:i	Ljava/util/ArrayList;
    //   148: astore 5
    //   150: aconst_null
    //   151: astore 6
    //   153: aload 5
    //   155: aconst_null
    //   156: invokevirtual 255	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   159: pop
    //   160: aload_0
    //   161: getfield 709	android/support/v4/app/n:j	Ljava/util/ArrayList;
    //   164: astore 5
    //   166: aload 5
    //   168: ifnonnull +19 -> 187
    //   171: new 87	java/util/ArrayList
    //   174: astore 5
    //   176: aload 5
    //   178: invokespecial 88	java/util/ArrayList:<init>	()V
    //   181: aload_0
    //   182: aload 5
    //   184: putfield 709	android/support/v4/app/n:j	Ljava/util/ArrayList;
    //   187: getstatic 61	android/support/v4/app/n:a	Z
    //   190: istore 7
    //   192: iload 7
    //   194: ifeq +56 -> 250
    //   197: ldc_w 328
    //   200: astore 5
    //   202: new 122	java/lang/StringBuilder
    //   205: astore 6
    //   207: aload 6
    //   209: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   212: ldc_w 835
    //   215: astore 8
    //   217: aload 6
    //   219: aload 8
    //   221: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: astore 6
    //   226: aload 6
    //   228: iload 4
    //   230: invokevirtual 716	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   233: astore 6
    //   235: aload 6
    //   237: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   240: astore 6
    //   242: aload 5
    //   244: aload 6
    //   246: invokestatic 723	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   249: pop
    //   250: aload_0
    //   251: getfield 709	android/support/v4/app/n:j	Ljava/util/ArrayList;
    //   254: astore 5
    //   256: iload 4
    //   258: invokestatic 838	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   261: astore 6
    //   263: aload 5
    //   265: aload 6
    //   267: invokevirtual 255	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   270: pop
    //   271: iload 4
    //   273: iconst_1
    //   274: iadd
    //   275: istore 4
    //   277: goto -139 -> 138
    //   280: getstatic 61	android/support/v4/app/n:a	Z
    //   283: istore 4
    //   285: iload 4
    //   287: ifeq +75 -> 362
    //   290: ldc_w 328
    //   293: astore_3
    //   294: new 122	java/lang/StringBuilder
    //   297: astore 5
    //   299: aload 5
    //   301: invokespecial 123	java/lang/StringBuilder:<init>	()V
    //   304: ldc_w 730
    //   307: astore 6
    //   309: aload 5
    //   311: aload 6
    //   313: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: astore 5
    //   318: aload 5
    //   320: iload_1
    //   321: invokevirtual 716	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   324: astore 5
    //   326: ldc_w 732
    //   329: astore 6
    //   331: aload 5
    //   333: aload 6
    //   335: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: astore 5
    //   340: aload 5
    //   342: aload_2
    //   343: invokevirtual 721	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   346: astore 5
    //   348: aload 5
    //   350: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: astore 5
    //   355: aload_3
    //   356: aload 5
    //   358: invokestatic 723	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   361: pop
    //   362: aload_0
    //   363: getfield 711	android/support/v4/app/n:i	Ljava/util/ArrayList;
    //   366: astore_3
    //   367: aload_3
    //   368: aload_2
    //   369: invokevirtual 255	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   372: pop
    //   373: goto -238 -> 135
    //   376: astore_3
    //   377: aload_0
    //   378: monitorexit
    //   379: aload_3
    //   380: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	381	0	this	n
    //   0	381	1	paramInt	int
    //   0	381	2	paramd	d
    //   6	362	3	localObject1	Object
    //   376	4	3	localObject2	Object
    //   33	6	4	i1	int
    //   44	232	4	i2	int
    //   283	3	4	bool1	boolean
    //   58	299	5	localObject3	Object
    //   68	266	6	localObject4	Object
    //   190	3	7	bool2	boolean
    //   215	5	8	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	376	finally
    //   11	14	376	finally
    //   15	19	376	finally
    //   20	24	376	finally
    //   24	28	376	finally
    //   29	33	376	finally
    //   41	44	376	finally
    //   55	58	376	finally
    //   60	65	376	finally
    //   72	77	376	finally
    //   81	85	376	finally
    //   94	99	376	finally
    //   103	107	376	finally
    //   109	114	376	finally
    //   117	123	376	finally
    //   123	127	376	finally
    //   130	135	376	finally
    //   135	137	376	finally
    //   144	148	376	finally
    //   155	160	376	finally
    //   160	164	376	finally
    //   171	174	376	finally
    //   176	181	376	finally
    //   182	187	376	finally
    //   187	190	376	finally
    //   202	205	376	finally
    //   207	212	376	finally
    //   219	224	376	finally
    //   228	233	376	finally
    //   235	240	376	finally
    //   244	250	376	finally
    //   250	254	376	finally
    //   256	261	376	finally
    //   265	271	376	finally
    //   280	283	376	finally
    //   294	297	376	finally
    //   299	304	376	finally
    //   311	316	376	finally
    //   320	324	376	finally
    //   333	338	376	finally
    //   342	346	376	finally
    //   348	353	376	finally
    //   356	362	376	finally
    //   362	366	376	finally
    //   368	373	376	finally
    //   377	379	376	finally
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    Object localObject = this.m;
    if ((localObject == null) && (paramInt != 0))
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("No activity");
      throw ((Throwable)localObject);
    }
    int i1;
    if (!paramBoolean)
    {
      i1 = this.l;
      if (paramInt != i1) {}
    }
    for (;;)
    {
      return;
      this.l = paramInt;
      localObject = this.f;
      if (localObject != null)
      {
        localObject = this.e;
        int i3 = ((ArrayList)localObject).size();
        for (int i4 = 0; i4 < i3; i4 = i1)
        {
          localObject = (Fragment)this.e.get(i4);
          e((Fragment)localObject);
          i1 = i4 + 1;
        }
        localObject = this.f;
        i3 = ((SparseArray)localObject).size();
        for (i4 = 0; i4 < i3; i4 = i1)
        {
          localObject = (Fragment)this.f.valueAt(i4);
          if (localObject != null)
          {
            boolean bool2 = ((Fragment)localObject).mRemoving;
            if (!bool2)
            {
              bool2 = ((Fragment)localObject).mDetached;
              if (!bool2) {}
            }
            else
            {
              bool2 = ((Fragment)localObject).mIsNewlyAdded;
              if (!bool2) {
                e((Fragment)localObject);
              }
            }
          }
          i1 = i4 + 1;
        }
        h();
        boolean bool1 = this.r;
        if (bool1)
        {
          localObject = this.m;
          if (localObject != null)
          {
            int i2 = this.l;
            i4 = 5;
            if (i2 == i4)
            {
              localObject = this.m;
              ((l)localObject).d();
              this.r = false;
            }
          }
        }
      }
    }
  }
  
  public void a(Configuration paramConfiguration)
  {
    int i1 = 0;
    Object localObject = null;
    for (int i2 = 0;; i2 = i1)
    {
      localObject = this.e;
      i1 = ((ArrayList)localObject).size();
      if (i2 >= i1) {
        break;
      }
      localObject = (Fragment)this.e.get(i2);
      if (localObject != null) {
        ((Fragment)localObject).performConfigurationChanged(paramConfiguration);
      }
      i1 = i2 + 1;
    }
  }
  
  public void a(Bundle paramBundle, String paramString, Fragment paramFragment)
  {
    int i1 = paramFragment.mIndex;
    if (i1 < 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Fragment ").append(paramFragment);
      String str = " is not currently in the FragmentManager";
      localObject = str;
      localIllegalStateException.<init>((String)localObject);
      a(localIllegalStateException);
    }
    i1 = paramFragment.mIndex;
    paramBundle.putInt(paramString, i1);
  }
  
  void a(Parcelable paramParcelable, o paramo)
  {
    if (paramParcelable == null) {}
    Object localObject1;
    do
    {
      return;
      paramParcelable = (FragmentManagerState)paramParcelable;
      localObject1 = paramParcelable.a;
    } while (localObject1 == null);
    Object localObject4;
    Object localObject5;
    Object localObject6;
    int i1;
    int i2;
    int i3;
    Object localObject7;
    Object localObject10;
    int i10;
    int i11;
    Object localObject11;
    if (paramo != null)
    {
      localObject4 = paramo.a();
      localObject5 = paramo.b();
      localObject6 = paramo.c();
      if (localObject4 != null)
      {
        i1 = ((List)localObject4).size();
        i2 = i1;
        i3 = 0;
        localObject7 = null;
      }
      for (;;)
      {
        if (i3 >= i2) {
          break label419;
        }
        localObject1 = (Fragment)((List)localObject4).get(i3);
        int i4 = a;
        if (i4 != 0)
        {
          ??? = "FragmentManager";
          localObject9 = new java/lang/StringBuilder;
          ((StringBuilder)localObject9).<init>();
          localObject10 = "restoreAllState: re-attaching retained ";
          localObject9 = (String)localObject10 + localObject1;
          Log.v((String)???, (String)localObject9);
        }
        i4 = 0;
        ??? = null;
        int i5;
        for (;;)
        {
          localObject9 = paramParcelable.a;
          int i9 = localObject9.length;
          if (i4 >= i9) {
            break;
          }
          localObject9 = paramParcelable.a[i4];
          i10 = ((FragmentState)localObject9).b;
          i11 = ((Fragment)localObject1).mIndex;
          if (i10 == i11) {
            break;
          }
          i4 += 1;
        }
        i2 = 0;
        localObject11 = null;
        break;
        localObject9 = paramParcelable.a;
        i10 = localObject9.length;
        if (i5 == i10)
        {
          localObject9 = new java/lang/IllegalStateException;
          localObject10 = new java/lang/StringBuilder;
          ((StringBuilder)localObject10).<init>();
          String str = "Could not find active fragment with index ";
          localObject10 = ((StringBuilder)localObject10).append(str);
          int i12 = ((Fragment)localObject1).mIndex;
          localObject10 = i12;
          ((IllegalStateException)localObject9).<init>((String)localObject10);
          a((RuntimeException)localObject9);
        }
        ??? = paramParcelable.a[i5];
        ((FragmentState)???).l = ((Fragment)localObject1);
        ((Fragment)localObject1).mSavedViewState = null;
        ((Fragment)localObject1).mBackStackNesting = 0;
        ((Fragment)localObject1).mInLayout = false;
        ((Fragment)localObject1).mAdded = false;
        ((Fragment)localObject1).mTarget = null;
        localObject9 = ((FragmentState)???).k;
        if (localObject9 != null)
        {
          localObject9 = ((FragmentState)???).k;
          localObject10 = this.m.i().getClassLoader();
          ((Bundle)localObject9).setClassLoader((ClassLoader)localObject10);
          localObject9 = ((FragmentState)???).k;
          localObject10 = "android:view_state";
          localObject9 = ((Bundle)localObject9).getSparseParcelableArray((String)localObject10);
          ((Fragment)localObject1).mSavedViewState = ((SparseArray)localObject9);
          ??? = ((FragmentState)???).k;
          ((Fragment)localObject1).mSavedFragmentState = ((Bundle)???);
        }
        i1 = i3 + 1;
        i3 = i1;
      }
      label419:
      localObject4 = localObject6;
    }
    for (Object localObject9 = localObject5;; localObject9 = null)
    {
      localObject1 = new android/util/SparseArray;
      localObject11 = paramParcelable.a;
      i2 = localObject11.length;
      ((SparseArray)localObject1).<init>(i2);
      this.f = ((SparseArray)localObject1);
      i11 = 0;
      localObject10 = null;
      label459:
      localObject1 = paramParcelable.a;
      i1 = localObject1.length;
      if (i11 < i1)
      {
        localObject1 = paramParcelable.a[i11];
        if (localObject1 != null)
        {
          if (localObject9 == null) {
            break label1507;
          }
          i2 = ((List)localObject9).size();
          if (i11 >= i2) {
            break label1507;
          }
          localObject11 = (o)((List)localObject9).get(i11);
        }
      }
      for (localObject5 = localObject11;; localObject5 = null)
      {
        if (localObject4 != null)
        {
          i2 = ((List)localObject4).size();
          if (i11 < i2) {
            localObject11 = (android.arch.lifecycle.p)((List)localObject4).get(i11);
          }
        }
        for (localObject7 = localObject11;; localObject7 = null)
        {
          localObject11 = this.m;
          ??? = this.n;
          localObject6 = this.o;
          localObject11 = ((FragmentState)localObject1).a((l)localObject11, (j)???, (Fragment)localObject6, (o)localObject5, (android.arch.lifecycle.p)localObject7);
          int i6 = a;
          if (i6 != 0)
          {
            ??? = "FragmentManager";
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            localObject6 = ((StringBuilder)localObject6).append("restoreAllState: active #").append(i11);
            localObject5 = ": ";
            localObject6 = (String)localObject5 + localObject11;
            Log.v((String)???, (String)localObject6);
          }
          ??? = this.f;
          int i13 = ((Fragment)localObject11).mIndex;
          ((SparseArray)???).put(i13, localObject11);
          ((FragmentState)localObject1).l = null;
          i1 = i11 + 1;
          i11 = i1;
          break label459;
          if (paramo != null)
          {
            localObject5 = paramo.a();
            if (localObject5 != null)
            {
              i1 = ((List)localObject5).size();
              i6 = i1;
            }
            for (;;)
            {
              i13 = 0;
              localObject6 = null;
              while (i13 < i6)
              {
                localObject1 = (Fragment)((List)localObject5).get(i13);
                i2 = ((Fragment)localObject1).mTargetIndex;
                if (i2 >= 0)
                {
                  localObject11 = this.f;
                  i3 = ((Fragment)localObject1).mTargetIndex;
                  localObject11 = (Fragment)((SparseArray)localObject11).get(i3);
                  ((Fragment)localObject1).mTarget = ((Fragment)localObject11);
                  localObject11 = ((Fragment)localObject1).mTarget;
                  if (localObject11 == null)
                  {
                    localObject11 = "FragmentManager";
                    localObject7 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject7).<init>();
                    localObject7 = ((StringBuilder)localObject7).append("Re-attaching retained fragment ").append(localObject1);
                    localObject4 = " target no longer exists: ";
                    localObject7 = ((StringBuilder)localObject7).append((String)localObject4);
                    i1 = ((Fragment)localObject1).mTargetIndex;
                    localObject1 = i1;
                    Log.w((String)localObject11, (String)localObject1);
                  }
                }
                i1 = i13 + 1;
                i13 = i1;
              }
              i6 = 0;
              ??? = null;
            }
          }
          this.e.clear();
          localObject1 = paramParcelable.b;
          boolean bool;
          if (localObject1 != null)
          {
            i2 = 0;
            localObject11 = null;
            for (;;)
            {
              localObject1 = paramParcelable.b;
              i1 = localObject1.length;
              if (i2 < i1)
              {
                localObject1 = this.f;
                ??? = paramParcelable.b;
                int i7 = ???[i2];
                localObject1 = (Fragment)((SparseArray)localObject1).get(i7);
                if (localObject1 == null)
                {
                  ??? = new java/lang/IllegalStateException;
                  localObject6 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject6).<init>();
                  localObject6 = ((StringBuilder)localObject6).append("No instantiated fragment for index #");
                  localObject5 = paramParcelable.b;
                  i14 = localObject5[i2];
                  localObject6 = i14;
                  ((IllegalStateException)???).<init>((String)localObject6);
                  a((RuntimeException)???);
                }
                ((Fragment)localObject1).mAdded = true;
                bool = a;
                if (bool)
                {
                  ??? = "FragmentManager";
                  localObject6 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject6).<init>();
                  localObject6 = ((StringBuilder)localObject6).append("restoreAllState: added #").append(i2);
                  localObject5 = ": ";
                  localObject6 = (String)localObject5 + localObject1;
                  Log.v((String)???, (String)localObject6);
                }
                ??? = this.e;
                bool = ((ArrayList)???).contains(localObject1);
                if (bool)
                {
                  localObject1 = new java/lang/IllegalStateException;
                  ((IllegalStateException)localObject1).<init>("Already added!");
                  throw ((Throwable)localObject1);
                }
                synchronized (this.e)
                {
                  localObject6 = this.e;
                  ((ArrayList)localObject6).add(localObject1);
                  i1 = i2 + 1;
                  i2 = i1;
                }
              }
            }
          }
          Object localObject3 = paramParcelable.c;
          if (localObject3 != null)
          {
            localObject3 = new java/util/ArrayList;
            localObject11 = paramParcelable.c;
            i2 = localObject11.length;
            ((ArrayList)localObject3).<init>(i2);
            this.g = ((ArrayList)localObject3);
            i1 = 0;
            localObject3 = null;
            for (;;)
            {
              localObject11 = paramParcelable.c;
              i2 = localObject11.length;
              if (i1 >= i2) {
                break;
              }
              localObject11 = paramParcelable.c[i1].a(this);
              bool = a;
              if (bool)
              {
                localObject6 = new java/lang/StringBuilder;
                ((StringBuilder)localObject6).<init>();
                localObject6 = ((StringBuilder)localObject6).append("restoreAllState: back stack #").append(i1).append(" (index ");
                i14 = ((d)localObject11).m;
                localObject6 = ((StringBuilder)localObject6).append(i14);
                localObject5 = "): ";
                localObject6 = (String)localObject5 + localObject11;
                Log.v("FragmentManager", (String)localObject6);
                ??? = new android/support/v4/h/e;
                ((e)???).<init>("FragmentManager");
                localObject6 = new java/io/PrintWriter;
                ((PrintWriter)localObject6).<init>((Writer)???);
                ??? = "  ";
                ((d)localObject11).a((String)???, (PrintWriter)localObject6, false);
                ((PrintWriter)localObject6).close();
              }
              ??? = this.g;
              ((ArrayList)???).add(localObject11);
              int i8 = ((d)localObject11).m;
              if (i8 >= 0)
              {
                i8 = ((d)localObject11).m;
                a(i8, (d)localObject11);
              }
              i1 += 1;
            }
          }
          this.g = null;
          i1 = paramParcelable.d;
          if (i1 >= 0)
          {
            localObject3 = this.f;
            i2 = paramParcelable.d;
            localObject3 = (Fragment)((SparseArray)localObject3).get(i2);
            this.p = ((Fragment)localObject3);
          }
          i1 = paramParcelable.e;
          this.d = i1;
          break;
          i3 = 0;
        }
        label1507:
        int i14 = 0;
      }
      localObject4 = null;
      i10 = 0;
    }
  }
  
  public void a(Fragment paramFragment)
  {
    boolean bool = paramFragment.mDeferStart;
    if (bool)
    {
      bool = this.c;
      if (!bool) {
        break label26;
      }
      bool = true;
      this.w = bool;
    }
    for (;;)
    {
      return;
      label26:
      paramFragment.mDeferStart = false;
      int i1 = this.l;
      a(paramFragment, i1, 0, 0, false);
    }
  }
  
  void a(Fragment paramFragment, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i1 = 4;
    int i2 = 3;
    int i3 = 1;
    boolean bool1 = paramFragment.mAdded;
    if (bool1)
    {
      bool1 = paramFragment.mDetached;
      if (!bool1) {}
    }
    else if (paramInt1 > i3)
    {
      paramInt1 = i3;
    }
    bool1 = paramFragment.mRemoving;
    if (bool1)
    {
      int i4 = paramFragment.mState;
      if (paramInt1 > i4)
      {
        i4 = paramFragment.mState;
        if (i4 != 0) {
          break label156;
        }
        bool2 = paramFragment.isInBackStack();
        if (!bool2) {
          break label156;
        }
        paramInt1 = i3;
      }
    }
    boolean bool2 = paramFragment.mDeferStart;
    if (bool2)
    {
      i5 = paramFragment.mState;
      if ((i5 < i1) && (paramInt1 > i2)) {
        paramInt1 = i2;
      }
    }
    int i5 = paramFragment.mState;
    label156:
    Object localObject1;
    Object localObject2;
    Object localObject5;
    if (i5 <= paramInt1)
    {
      boolean bool3 = paramFragment.mFromLayout;
      if (bool3)
      {
        bool3 = paramFragment.mInLayout;
        if (bool3) {}
      }
      int i16;
      for (;;)
      {
        return;
        paramInt1 = paramFragment.mState;
        break;
        localObject1 = paramFragment.getAnimatingAway();
        if (localObject1 == null)
        {
          localObject1 = paramFragment.getAnimator();
          if (localObject1 == null) {}
        }
        else
        {
          paramFragment.setAnimatingAway(null);
          paramFragment.setAnimator(null);
          i16 = paramFragment.getStateAfterAnimating();
          localObject1 = this;
          localObject2 = paramFragment;
          localObject4 = null;
          a(paramFragment, i16, 0, 0, i3);
        }
        int i6 = paramFragment.mState;
        switch (i6)
        {
        default: 
          i6 = paramFragment.mState;
          if (i6 != paramInt1)
          {
            localObject1 = "FragmentManager";
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("moveToState: Fragment state for ").append(paramFragment).append(" not updated inline; ").append("expected state ").append(paramInt1);
            localObject5 = " found ";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
            i16 = paramFragment.mState;
            localObject2 = i16;
            Log.w((String)localObject1, (String)localObject2);
            paramFragment.mState = paramInt1;
          }
          break;
        }
      }
      int i17;
      label774:
      label817:
      label865:
      boolean bool6;
      if (paramInt1 > 0)
      {
        boolean bool4 = a;
        if (bool4)
        {
          localObject1 = "FragmentManager";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject5 = "moveto CREATED: ";
          localObject2 = (String)localObject5 + paramFragment;
          Log.v((String)localObject1, (String)localObject2);
        }
        localObject1 = paramFragment.mSavedFragmentState;
        boolean bool5;
        if (localObject1 != null)
        {
          localObject1 = paramFragment.mSavedFragmentState;
          localObject2 = this.m.i().getClassLoader();
          ((Bundle)localObject1).setClassLoader((ClassLoader)localObject2);
          localObject1 = paramFragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
          paramFragment.mSavedViewState = ((SparseArray)localObject1);
          localObject1 = paramFragment.mSavedFragmentState;
          localObject2 = "android:target_state";
          localObject1 = a((Bundle)localObject1, (String)localObject2);
          paramFragment.mTarget = ((Fragment)localObject1);
          localObject1 = paramFragment.mTarget;
          if (localObject1 != null)
          {
            localObject1 = paramFragment.mSavedFragmentState;
            localObject2 = "android:target_req_state";
            int i7 = ((Bundle)localObject1).getInt((String)localObject2, 0);
            paramFragment.mTargetRequestCode = i7;
          }
          localObject1 = paramFragment.mSavedUserVisibleHint;
          if (localObject1 == null) {
            break label774;
          }
          localObject1 = paramFragment.mSavedUserVisibleHint;
          bool5 = ((Boolean)localObject1).booleanValue();
          paramFragment.mUserVisibleHint = bool5;
          paramFragment.mSavedUserVisibleHint = null;
          bool5 = paramFragment.mUserVisibleHint;
          if (!bool5)
          {
            paramFragment.mDeferStart = i3;
            if (paramInt1 > i2) {
              paramInt1 = i2;
            }
          }
        }
        localObject1 = this.m;
        paramFragment.mHost = ((l)localObject1);
        localObject1 = this.o;
        paramFragment.mParentFragment = ((Fragment)localObject1);
        localObject1 = this.o;
        if (localObject1 != null) {}
        for (localObject1 = this.o.mChildFragmentManager;; localObject1 = this.m.k())
        {
          paramFragment.mFragmentManager = ((n)localObject1);
          localObject1 = paramFragment.mTarget;
          if (localObject1 == null) {
            break label865;
          }
          localObject1 = this.f;
          i17 = paramFragment.mTarget.mIndex;
          localObject1 = ((SparseArray)localObject1).get(i17);
          localObject2 = paramFragment.mTarget;
          if (localObject1 == localObject2) {
            break label817;
          }
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Fragment ").append(paramFragment).append(" declared target fragment ");
          localObject5 = paramFragment.mTarget;
          localObject2 = localObject5 + " that does not belong to this FragmentManager!";
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
          localObject1 = paramFragment.mSavedFragmentState;
          localObject2 = "android:user_visible_hint";
          bool5 = ((Bundle)localObject1).getBoolean((String)localObject2, i3);
          paramFragment.mUserVisibleHint = bool5;
          break;
        }
        localObject1 = paramFragment.mTarget;
        int i8 = ((Fragment)localObject1).mState;
        if (i8 < i3)
        {
          localObject2 = paramFragment.mTarget;
          localObject1 = this;
          i16 = i3;
          localObject4 = null;
          a((Fragment)localObject2, i3, 0, 0, i3);
        }
        localObject1 = this.m.i();
        a(paramFragment, (Context)localObject1, false);
        paramFragment.mCalled = false;
        localObject1 = this.m.i();
        paramFragment.onAttach((Context)localObject1);
        bool6 = paramFragment.mCalled;
        if (!bool6)
        {
          localObject1 = new android/support/v4/app/ac;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = "Fragment " + paramFragment + " did not call through to super.onAttach()";
          ((ac)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
        localObject1 = paramFragment.mParentFragment;
        if (localObject1 == null)
        {
          localObject1 = this.m;
          ((l)localObject1).b(paramFragment);
          label984:
          localObject1 = this.m.i();
          b(paramFragment, (Context)localObject1, false);
          bool6 = paramFragment.mIsCreated;
          if (bool6) {
            break label1824;
          }
          localObject1 = paramFragment.mSavedFragmentState;
          a(paramFragment, (Bundle)localObject1, false);
          localObject1 = paramFragment.mSavedFragmentState;
          paramFragment.performCreate((Bundle)localObject1);
          localObject1 = paramFragment.mSavedFragmentState;
          b(paramFragment, (Bundle)localObject1, false);
          label1052:
          paramFragment.mRetaining = false;
        }
      }
      else
      {
        c(paramFragment);
        if (paramInt1 > i3)
        {
          bool6 = a;
          if (bool6)
          {
            localObject1 = "FragmentManager";
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject5 = "moveto ACTIVITY_CREATED: ";
            localObject2 = (String)localObject5 + paramFragment;
            Log.v((String)localObject1, (String)localObject2);
          }
          bool6 = paramFragment.mFromLayout;
          if (!bool6)
          {
            int i9 = paramFragment.mContainerId;
            if (i9 == 0) {
              break label2709;
            }
            i9 = paramFragment.mContainerId;
            i17 = -1;
            if (i9 == i17)
            {
              localObject1 = new java/lang/IllegalArgumentException;
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject2 = ((StringBuilder)localObject2).append("Cannot create fragment ").append(paramFragment);
              localObject5 = " for a container view with no id";
              localObject2 = (String)localObject5;
              ((IllegalArgumentException)localObject1).<init>((String)localObject2);
              a((RuntimeException)localObject1);
            }
            localObject1 = this.n;
            i17 = paramFragment.mContainerId;
            localObject1 = (ViewGroup)((j)localObject1).a(i17);
            if (localObject1 == null)
            {
              boolean bool14 = paramFragment.mRestored;
              if (bool14) {}
            }
          }
        }
      }
      try
      {
        localObject2 = paramFragment.getResources();
        i16 = paramFragment.mContainerId;
        localObject2 = ((Resources)localObject2).getResourceName(i16);
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        for (;;)
        {
          int i19;
          String str;
          localObject3 = "unknown";
          continue;
          i3 = 0;
          continue;
          paramFragment.mInnerView = null;
        }
      }
      localObject5 = new java/lang/IllegalArgumentException;
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append("No view found for id 0x");
      i19 = paramFragment.mContainerId;
      str = Integer.toHexString(i19);
      localObject4 = ((StringBuilder)localObject4).append(str);
      str = " (";
      localObject2 = ((StringBuilder)localObject4).append(str).append((String)localObject2);
      localObject4 = ") for fragment ";
      localObject2 = (String)localObject4 + paramFragment;
      ((IllegalArgumentException)localObject5).<init>((String)localObject2);
      a((RuntimeException)localObject5);
    }
    for (;;)
    {
      paramFragment.mContainer = ((ViewGroup)localObject1);
      localObject2 = paramFragment.mSavedFragmentState;
      localObject2 = paramFragment.performGetLayoutInflater((Bundle)localObject2);
      localObject5 = paramFragment.mSavedFragmentState;
      localObject2 = paramFragment.performCreateView((LayoutInflater)localObject2, (ViewGroup)localObject1, (Bundle)localObject5);
      paramFragment.mView = ((View)localObject2);
      localObject2 = paramFragment.mView;
      int i18;
      float f1;
      if (localObject2 != null)
      {
        localObject2 = paramFragment.mView;
        paramFragment.mInnerView = ((View)localObject2);
        localObject2 = paramFragment.mView;
        ((View)localObject2).setSaveFromParentEnabled(false);
        if (localObject1 != null)
        {
          localObject2 = paramFragment.mView;
          ((ViewGroup)localObject1).addView((View)localObject2);
        }
        boolean bool7 = paramFragment.mHidden;
        if (bool7)
        {
          localObject1 = paramFragment.mView;
          i18 = 8;
          ((View)localObject1).setVisibility(i18);
        }
        localObject1 = paramFragment.mView;
        localObject2 = paramFragment.mSavedFragmentState;
        paramFragment.onViewCreated((View)localObject1, (Bundle)localObject2);
        localObject1 = paramFragment.mView;
        localObject2 = paramFragment.mSavedFragmentState;
        a(paramFragment, (View)localObject1, (Bundle)localObject2, false);
        localObject1 = paramFragment.mView;
        int i10 = ((View)localObject1).getVisibility();
        if (i10 == 0)
        {
          localObject1 = paramFragment.mContainer;
          if (localObject1 != null)
          {
            paramFragment.mIsNewlyAdded = i3;
            localObject1 = paramFragment.mSavedFragmentState;
            paramFragment.performActivityCreated((Bundle)localObject1);
            localObject1 = paramFragment.mSavedFragmentState;
            c(paramFragment, (Bundle)localObject1, false);
            localObject1 = paramFragment.mView;
            if (localObject1 != null)
            {
              localObject1 = paramFragment.mSavedFragmentState;
              paramFragment.restoreViewState((Bundle)localObject1);
            }
            paramFragment.mSavedFragmentState = null;
            i10 = 2;
            f1 = 2.8E-45F;
            if (paramInt1 > i10) {
              paramFragment.mState = i2;
            }
            if (paramInt1 > i2)
            {
              bool8 = a;
              if (bool8)
              {
                localObject1 = "FragmentManager";
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                localObject5 = "moveto STARTED: ";
                localObject2 = (String)localObject5 + paramFragment;
                Log.v((String)localObject1, (String)localObject2);
              }
              paramFragment.performStart();
              b(paramFragment, false);
            }
            if (paramInt1 <= i1) {
              break;
            }
            boolean bool8 = a;
            if (bool8)
            {
              localObject1 = "FragmentManager";
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject5 = "moveto RESUMED: ";
              localObject2 = (String)localObject5 + paramFragment;
              Log.v((String)localObject1, (String)localObject2);
            }
            paramFragment.performResume();
            c(paramFragment, false);
            paramFragment.mSavedFragmentState = null;
            paramFragment.mSavedViewState = null;
            break;
            localObject1 = paramFragment.mParentFragment;
            ((Fragment)localObject1).onAttachFragment(paramFragment);
            break label984;
            label1824:
            localObject1 = paramFragment.mSavedFragmentState;
            paramFragment.restoreChildFragmentState((Bundle)localObject1);
            paramFragment.mState = i3;
            break label1052;
          }
        }
      }
      Object localObject3;
      int i11 = paramFragment.mState;
      if (i11 <= paramInt1) {
        break;
      }
      i11 = paramFragment.mState;
      switch (i11)
      {
      default: 
        break;
      case 1: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
        label1927:
        label1971:
        int i13;
        do
        {
          if (paramInt1 >= i3) {
            break;
          }
          boolean bool9 = this.u;
          if (bool9)
          {
            localObject1 = paramFragment.getAnimatingAway();
            if (localObject1 == null) {
              break label2532;
            }
            localObject1 = paramFragment.getAnimatingAway();
            paramFragment.setAnimatingAway(null);
            ((View)localObject1).clearAnimation();
          }
          localObject1 = paramFragment.getAnimatingAway();
          if (localObject1 == null)
          {
            localObject1 = paramFragment.getAnimator();
            if (localObject1 == null) {
              break label2562;
            }
          }
          paramFragment.setStateAfterAnimating(paramInt1);
          paramInt1 = i3;
          break;
          int i12 = 5;
          f1 = 7.0E-45F;
          boolean bool10;
          if (paramInt1 < i12)
          {
            bool10 = a;
            if (bool10)
            {
              localObject1 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject5 = "movefrom RESUMED: ";
              localObject3 = (String)localObject5 + paramFragment;
              Log.v((String)localObject1, (String)localObject3);
            }
            paramFragment.performPause();
            d(paramFragment, false);
          }
          if (paramInt1 < i1)
          {
            bool10 = a;
            if (bool10)
            {
              localObject1 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject5 = "movefrom STARTED: ";
              localObject3 = (String)localObject5 + paramFragment;
              Log.v((String)localObject1, (String)localObject3);
            }
            paramFragment.performStop();
            e(paramFragment, false);
          }
          if (paramInt1 < i2)
          {
            bool10 = a;
            if (bool10)
            {
              localObject1 = "FragmentManager";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject5 = "movefrom STOPPED: ";
              localObject3 = (String)localObject5 + paramFragment;
              Log.v((String)localObject1, (String)localObject3);
            }
            paramFragment.performReallyStop();
          }
          i13 = 2;
          f1 = 2.8E-45F;
        } while (paramInt1 >= i13);
        boolean bool11 = a;
        if (bool11)
        {
          localObject1 = "FragmentManager";
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject5 = "movefrom ACTIVITY_CREATED: ";
          localObject3 = (String)localObject5 + paramFragment;
          Log.v((String)localObject1, (String)localObject3);
        }
        localObject1 = paramFragment.mView;
        if (localObject1 != null)
        {
          localObject1 = this.m;
          bool11 = ((l)localObject1).a(paramFragment);
          if (bool11)
          {
            localObject1 = paramFragment.mSavedViewState;
            if (localObject1 == null) {
              m(paramFragment);
            }
          }
        }
        paramFragment.performDestroyView();
        f(paramFragment, false);
        localObject1 = paramFragment.mView;
        if (localObject1 != null)
        {
          localObject1 = paramFragment.mContainer;
          if (localObject1 != null)
          {
            localObject1 = paramFragment.mContainer;
            localObject3 = paramFragment.mView;
            ((ViewGroup)localObject1).endViewTransition((View)localObject3);
            localObject1 = paramFragment.mView;
            ((View)localObject1).clearAnimation();
            int i14 = this.l;
            if (i14 <= 0) {
              break label2697;
            }
            boolean bool12 = this.u;
            if (bool12) {
              break label2697;
            }
            localObject1 = paramFragment.mView;
            int i15 = ((View)localObject1).getVisibility();
            if (i15 != 0) {
              break label2697;
            }
            f1 = paramFragment.mPostponedAlpha;
            i18 = 0;
            localObject3 = null;
            bool13 = f1 < 0.0F;
            if (bool13) {
              break label2697;
            }
            localObject1 = a(paramFragment, paramInt2, false, paramInt3);
          }
        }
        for (;;)
        {
          i18 = 0;
          localObject3 = null;
          paramFragment.mPostponedAlpha = 0.0F;
          if (localObject1 != null) {
            a(paramFragment, (n.c)localObject1, paramInt1);
          }
          localObject1 = paramFragment.mContainer;
          localObject3 = paramFragment.mView;
          ((ViewGroup)localObject1).removeView((View)localObject3);
          paramFragment.mContainer = null;
          paramFragment.mView = null;
          paramFragment.mInnerView = null;
          paramFragment.mInLayout = false;
          break label1927;
          label2532:
          localObject1 = paramFragment.getAnimator();
          if (localObject1 == null) {
            break label1971;
          }
          localObject1 = paramFragment.getAnimator();
          paramFragment.setAnimator(null);
          ((Animator)localObject1).cancel();
          break label1971;
          label2562:
          bool13 = a;
          if (bool13)
          {
            localObject1 = "FragmentManager";
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject5 = "movefrom CREATED: ";
            localObject3 = (String)localObject5 + paramFragment;
            Log.v((String)localObject1, (String)localObject3);
          }
          bool13 = paramFragment.mRetaining;
          if (!bool13)
          {
            paramFragment.performDestroy();
            g(paramFragment, false);
          }
          for (;;)
          {
            paramFragment.performDetach();
            h(paramFragment, false);
            if (paramBoolean) {
              break;
            }
            bool13 = paramFragment.mRetaining;
            if (bool13) {
              break label2679;
            }
            g(paramFragment);
            break;
            paramFragment.mState = 0;
          }
          label2679:
          paramFragment.mHost = null;
          paramFragment.mParentFragment = null;
          paramFragment.mFragmentManager = null;
          break;
          label2697:
          bool13 = false;
          localObject1 = null;
          f1 = 0.0F;
        }
        label2709:
        boolean bool13 = false;
        localObject1 = null;
        f1 = 0.0F;
      }
    }
  }
  
  void a(Fragment paramFragment, Context paramContext, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).a(paramFragment, paramContext, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).a(this, paramFragment, paramContext);
      }
    }
  }
  
  void a(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).a(paramFragment, paramBundle, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).a(this, paramFragment, paramBundle);
      }
    }
  }
  
  void a(Fragment paramFragment, View paramView, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).a(paramFragment, paramView, paramBundle, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).a(this, paramFragment, paramView, paramBundle);
      }
    }
  }
  
  public void a(Fragment paramFragment, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    Object localObject1;
    if (bool2)
    {
      localObject1 = "FragmentManager";
      ??? = new java/lang/StringBuilder;
      ((StringBuilder)???).<init>();
      String str = "add: ";
      ??? = str + paramFragment;
      Log.v((String)localObject1, (String)???);
    }
    f(paramFragment);
    bool2 = paramFragment.mDetached;
    if (!bool2)
    {
      localObject1 = this.e;
      bool2 = ((ArrayList)localObject1).contains(paramFragment);
      if (bool2)
      {
        localObject1 = new java/lang/IllegalStateException;
        ??? = new java/lang/StringBuilder;
        ((StringBuilder)???).<init>();
        ??? = "Fragment already added: " + paramFragment;
        ((IllegalStateException)localObject1).<init>((String)???);
        throw ((Throwable)localObject1);
      }
    }
    synchronized (this.e)
    {
      localObject1 = this.e;
      ((ArrayList)localObject1).add(paramFragment);
      paramFragment.mAdded = bool1;
      paramFragment.mRemoving = false;
      localObject1 = paramFragment.mView;
      if (localObject1 == null) {
        paramFragment.mHiddenChanged = false;
      }
      bool2 = paramFragment.mHasMenu;
      if (bool2)
      {
        bool2 = paramFragment.mMenuVisible;
        if (bool2) {
          this.r = bool1;
        }
      }
      if (paramBoolean) {
        b(paramFragment);
      }
      return;
    }
  }
  
  public void a(l paraml, j paramj, Fragment paramFragment)
  {
    Object localObject = this.m;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Already attached");
      throw ((Throwable)localObject);
    }
    this.m = paraml;
    this.n = paramj;
    this.o = paramFragment;
  }
  
  public void a(n.g paramg, boolean paramBoolean)
  {
    if (!paramBoolean) {
      B();
    }
    for (;;)
    {
      try
      {
        boolean bool = this.u;
        Object localObject1;
        if (!bool)
        {
          localObject1 = this.m;
          if (localObject1 != null) {}
        }
        else
        {
          if (paramBoolean) {
            return;
          }
          localObject1 = new java/lang/IllegalStateException;
          String str = "Activity has been destroyed";
          ((IllegalStateException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
      finally {}
      ArrayList localArrayList = this.b;
      if (localArrayList == null)
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        this.b = localArrayList;
      }
      localArrayList = this.b;
      localArrayList.add(paramg);
      C();
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i1 = 0;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append(paramString);
    String str1 = "    ";
    String str2 = str1;
    localObject1 = this.f;
    int i4;
    String str3;
    if (localObject1 != null)
    {
      localObject1 = this.f;
      i2 = ((SparseArray)localObject1).size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        i3 = System.identityHashCode(this);
        localObject1 = Integer.toHexString(i3);
        paramPrintWriter.print((String)localObject1);
        localObject1 = ":";
        paramPrintWriter.println((String)localObject1);
        i4 = 0;
        str1 = null;
        while (i4 < i2)
        {
          localObject1 = (Fragment)this.f.valueAt(i4);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i4);
          str3 = ": ";
          paramPrintWriter.print(str3);
          paramPrintWriter.println(localObject1);
          if (localObject1 != null) {
            ((Fragment)localObject1).dump(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
          i3 = i4 + 1;
          i4 = i3;
        }
      }
    }
    localObject1 = this.e;
    int i2 = ((ArrayList)localObject1).size();
    if (i2 > 0)
    {
      paramPrintWriter.print(paramString);
      localObject1 = "Added Fragments:";
      paramPrintWriter.println((String)localObject1);
      i4 = 0;
      str1 = null;
      while (i4 < i2)
      {
        localObject1 = (Fragment)this.e.get(i4);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(i4);
        str3 = ": ";
        paramPrintWriter.print(str3);
        localObject1 = ((Fragment)localObject1).toString();
        paramPrintWriter.println((String)localObject1);
        i3 = i4 + 1;
        i4 = i3;
      }
    }
    localObject1 = this.h;
    if (localObject1 != null)
    {
      localObject1 = this.h;
      i2 = ((ArrayList)localObject1).size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        localObject1 = "Fragments Created Menus:";
        paramPrintWriter.println((String)localObject1);
        i4 = 0;
        str1 = null;
        while (i4 < i2)
        {
          localObject1 = (Fragment)this.h.get(i4);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i4);
          str3 = ": ";
          paramPrintWriter.print(str3);
          localObject1 = ((Fragment)localObject1).toString();
          paramPrintWriter.println((String)localObject1);
          i3 = i4 + 1;
          i4 = i3;
        }
      }
    }
    localObject1 = this.g;
    if (localObject1 != null)
    {
      localObject1 = this.g;
      i2 = ((ArrayList)localObject1).size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        localObject1 = "Back Stack:";
        paramPrintWriter.println((String)localObject1);
        i4 = 0;
        str1 = null;
        while (i4 < i2)
        {
          localObject1 = (d)this.g.get(i4);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i4);
          paramPrintWriter.print(": ");
          str3 = ((d)localObject1).toString();
          paramPrintWriter.println(str3);
          ((d)localObject1).a(str2, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          i3 = i4 + 1;
          i4 = i3;
        }
      }
    }
    try
    {
      localObject1 = this.i;
      if (localObject1 != null)
      {
        localObject1 = this.i;
        int i5 = ((ArrayList)localObject1).size();
        if (i5 > 0)
        {
          paramPrintWriter.print(paramString);
          localObject1 = "Back Stack Indices:";
          paramPrintWriter.println((String)localObject1);
          i4 = 0;
          str1 = null;
          while (i4 < i5)
          {
            localObject1 = this.i;
            localObject1 = ((ArrayList)localObject1).get(i4);
            localObject1 = (d)localObject1;
            paramPrintWriter.print(paramString);
            String str4 = "  #";
            paramPrintWriter.print(str4);
            paramPrintWriter.print(i4);
            str4 = ": ";
            paramPrintWriter.print(str4);
            paramPrintWriter.println(localObject1);
            i3 = i4 + 1;
            i4 = i3;
          }
        }
      }
      localObject1 = this.j;
      if (localObject1 != null)
      {
        localObject1 = this.j;
        i3 = ((ArrayList)localObject1).size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          localObject1 = "mAvailBackStackIndices: ";
          paramPrintWriter.print((String)localObject1);
          localObject1 = this.j;
          localObject1 = ((ArrayList)localObject1).toArray();
          localObject1 = Arrays.toString((Object[])localObject1);
          paramPrintWriter.println((String)localObject1);
        }
      }
      localObject1 = this.b;
      if (localObject1 != null)
      {
        localObject1 = this.b;
        i4 = ((ArrayList)localObject1).size();
        if (i4 > 0)
        {
          paramPrintWriter.print(paramString);
          localObject1 = "Pending Actions:";
          paramPrintWriter.println((String)localObject1);
          while (i1 < i4)
          {
            localObject1 = (n.g)this.b.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            str2 = ": ";
            paramPrintWriter.print(str2);
            paramPrintWriter.println(localObject1);
            i3 = i1 + 1;
            i1 = i3;
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mHost=");
    Object localObject3 = this.m;
    paramPrintWriter.println(localObject3);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    localObject3 = this.n;
    paramPrintWriter.println(localObject3);
    localObject3 = this.o;
    if (localObject3 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      localObject3 = this.o;
      paramPrintWriter.println(localObject3);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    int i3 = this.l;
    paramPrintWriter.print(i3);
    paramPrintWriter.print(" mStateSaved=");
    boolean bool = this.s;
    paramPrintWriter.print(bool);
    paramPrintWriter.print(" mStopped=");
    bool = this.t;
    paramPrintWriter.print(bool);
    localObject3 = " mDestroyed=";
    paramPrintWriter.print((String)localObject3);
    bool = this.u;
    paramPrintWriter.println(bool);
    bool = this.r;
    if (bool)
    {
      paramPrintWriter.print(paramString);
      localObject3 = "  mNeedMenuInvalidate=";
      paramPrintWriter.print((String)localObject3);
      bool = this.r;
      paramPrintWriter.println(bool);
    }
    localObject3 = this.v;
    if (localObject3 != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      localObject3 = this.v;
      paramPrintWriter.println((String)localObject3);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    Object localObject = this.e;
    int i1 = ((ArrayList)localObject).size() + -1;
    for (int i2 = i1; i2 >= 0; i2 = i1)
    {
      localObject = (Fragment)this.e.get(i2);
      if (localObject != null) {
        ((Fragment)localObject).performMultiWindowModeChanged(paramBoolean);
      }
      i1 = i2 + -1;
    }
  }
  
  public boolean a(Menu paramMenu)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    Object localObject = null;
    int i4 = this.l;
    if (i4 < i1) {}
    for (;;)
    {
      return bool1;
      i4 = 0;
      int i5 = 0;
      for (;;)
      {
        localObject = this.e;
        int i2 = ((ArrayList)localObject).size();
        if (i4 >= i2) {
          break;
        }
        localObject = (Fragment)this.e.get(i4);
        if (localObject != null)
        {
          boolean bool2 = ((Fragment)localObject).performPrepareOptionsMenu(paramMenu);
          if (bool2) {
            i5 = i1;
          }
        }
        i3 = i4 + 1;
        i4 = i3;
      }
      int i3 = i5;
    }
  }
  
  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    int i2 = 0;
    int i4 = this.l;
    if (i4 < i1) {
      return i2;
    }
    ArrayList localArrayList = null;
    int i6 = 0;
    int i8 = 0;
    float f2 = 0.0F;
    label36:
    Object localObject = this.e;
    int i5 = ((ArrayList)localObject).size();
    if (i6 < i5)
    {
      localObject = (Fragment)this.e.get(i6);
      if (localObject == null) {
        break label225;
      }
      boolean bool = ((Fragment)localObject).performCreateOptionsMenu(paramMenu, paramMenuInflater);
      if (!bool) {
        break label225;
      }
      if (localArrayList == null)
      {
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
      }
      localArrayList.add(localObject);
      i5 = i1;
    }
    for (float f3 = f1;; f3 = f2)
    {
      int i7;
      i6 += 1;
      i8 = i5;
      f2 = f3;
      break label36;
      localObject = this.h;
      if (localObject != null) {
        for (;;)
        {
          localObject = this.h;
          i5 = ((ArrayList)localObject).size();
          if (i2 >= i5) {
            break;
          }
          localObject = (Fragment)this.h.get(i2);
          if (localArrayList != null)
          {
            i1 = localArrayList.contains(localObject);
            if (i1 != 0) {}
          }
          else
          {
            ((Fragment)localObject).onDestroyOptionsMenu();
          }
          i2 += 1;
        }
      }
      this.h = localArrayList;
      int i3 = i8;
      break;
      label225:
      i5 = i8;
    }
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    int i1 = 1;
    boolean bool1 = false;
    int i2 = this.l;
    if (i2 < i1) {
      return bool1;
    }
    int i3;
    for (int i4 = 0;; i4 = i3)
    {
      Object localObject = this.e;
      i2 = ((ArrayList)localObject).size();
      if (i4 >= i2) {
        break;
      }
      localObject = (Fragment)this.e.get(i4);
      if (localObject != null)
      {
        boolean bool2 = ((Fragment)localObject).performOptionsItemSelected(paramMenuItem);
        if (bool2)
        {
          bool1 = i1;
          break;
        }
      }
      i3 = i4 + 1;
    }
  }
  
  boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2, String paramString, int paramInt1, int paramInt2)
  {
    int i1 = 1;
    Object localObject1 = null;
    Object localObject2 = this.g;
    boolean bool1;
    if (localObject2 == null) {
      bool1 = false;
    }
    int i2;
    for (localObject2 = null;; localObject2 = null)
    {
      return bool1;
      if ((paramString != null) || (paramInt1 >= 0)) {
        break label118;
      }
      i2 = paramInt2 & 0x1;
      if (i2 != 0) {
        break label118;
      }
      localObject2 = this.g;
      i2 = ((ArrayList)localObject2).size() + -1;
      if (i2 >= 0) {
        break;
      }
      i2 = 0;
    }
    ArrayList localArrayList = this.g;
    localObject2 = localArrayList.remove(i2);
    paramArrayList1.add(localObject2);
    localObject2 = Boolean.valueOf(i1);
    paramArrayList2.add(localObject2);
    for (;;)
    {
      i2 = i1;
      break;
      label118:
      i2 = -1;
      if ((paramString != null) || (paramInt1 >= 0))
      {
        localObject2 = this.g;
        i2 = ((ArrayList)localObject2).size();
        i3 = i2 + -1;
        String str;
        boolean bool2;
        for (;;)
        {
          if (i3 >= 0)
          {
            localObject2 = (d)this.g.get(i3);
            if (paramString == null) {
              break label206;
            }
            str = ((d)localObject2).h();
            bool2 = paramString.equals(str);
            if (!bool2) {
              break label206;
            }
          }
          label206:
          do
          {
            if (i3 >= 0) {
              break label234;
            }
            i2 = 0;
            localObject2 = null;
            break;
            if (paramInt1 < 0) {
              break label225;
            }
            i2 = ((d)localObject2).m;
          } while (paramInt1 == i2);
          label225:
          i3 += -1;
        }
        label234:
        i2 = paramInt2 & 0x1;
        if (i2 != 0)
        {
          i3 += -1;
          while (i3 >= 0)
          {
            localObject2 = (d)this.g.get(i3);
            if (paramString != null)
            {
              str = ((d)localObject2).h();
              bool2 = paramString.equals(str);
              if (bool2) {}
            }
            else
            {
              if (paramInt1 < 0) {
                break;
              }
              i2 = ((d)localObject2).m;
              if (paramInt1 != i2) {
                break;
              }
            }
            i3 += -1;
          }
        }
        i2 = i3;
      }
      localArrayList = this.g;
      int i3 = localArrayList.size() + -1;
      if (i2 == i3)
      {
        i2 = 0;
        localObject2 = null;
        break;
      }
      localArrayList = this.g;
      i3 = localArrayList.size() + -1;
      while (i3 > i2)
      {
        localObject1 = this.g.remove(i3);
        paramArrayList1.add(localObject1);
        localObject1 = Boolean.valueOf(i1);
        paramArrayList2.add(localObject1);
        i3 += -1;
      }
    }
  }
  
  public Fragment b(String paramString)
  {
    Object localObject = this.f;
    int i1;
    int i2;
    if ((localObject != null) && (paramString != null))
    {
      localObject = this.f;
      i1 = ((SparseArray)localObject).size() + -1;
      i2 = i1;
      if (i2 >= 0)
      {
        localObject = (Fragment)this.f.valueAt(i2);
        if (localObject != null)
        {
          localObject = ((Fragment)localObject).findFragmentByWho(paramString);
          if (localObject == null) {}
        }
      }
    }
    for (;;)
    {
      return (Fragment)localObject;
      i1 = i2 + -1;
      i2 = i1;
      break;
      i1 = 0;
      localObject = null;
    }
  }
  
  void b(Fragment paramFragment)
  {
    int i1 = this.l;
    a(paramFragment, i1, 0, 0, false);
  }
  
  void b(Fragment paramFragment, Context paramContext, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).b(paramFragment, paramContext, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).b(this, paramFragment, paramContext);
      }
    }
  }
  
  void b(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).b(paramFragment, paramBundle, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).b(this, paramFragment, paramBundle);
      }
    }
  }
  
  void b(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).b(paramFragment, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).a(this, paramFragment);
      }
    }
  }
  
  void b(d paramd)
  {
    ArrayList localArrayList = this.g;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.g = localArrayList;
    }
    this.g.add(paramd);
  }
  
  public void b(n.g paramg, boolean paramBoolean)
  {
    Object localObject1;
    boolean bool;
    if (paramBoolean)
    {
      localObject1 = this.m;
      if (localObject1 != null)
      {
        bool = this.u;
        if (!bool) {
          break label25;
        }
      }
    }
    for (;;)
    {
      return;
      label25:
      c(paramBoolean);
      localObject1 = this.x;
      ArrayList localArrayList = this.y;
      bool = paramg.a((ArrayList)localObject1, localArrayList);
      if (bool)
      {
        bool = true;
        this.c = bool;
      }
      try
      {
        localObject1 = this.x;
        localArrayList = this.y;
        b((ArrayList)localObject1, localArrayList);
        D();
        j();
        G();
      }
      finally
      {
        D();
      }
    }
  }
  
  public void b(Menu paramMenu)
  {
    int i1 = this.l;
    int i2 = 1;
    if (i1 < i2) {
      return;
    }
    i1 = 0;
    Object localObject = null;
    for (i2 = 0;; i2 = i1)
    {
      localObject = this.e;
      i1 = ((ArrayList)localObject).size();
      if (i2 >= i1) {
        break;
      }
      localObject = (Fragment)this.e.get(i2);
      if (localObject != null) {
        ((Fragment)localObject).performOptionsMenuClosed(paramMenu);
      }
      i1 = i2 + 1;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    Object localObject = this.e;
    int i1 = ((ArrayList)localObject).size() + -1;
    for (int i2 = i1; i2 >= 0; i2 = i1)
    {
      localObject = (Fragment)this.e.get(i2);
      if (localObject != null) {
        ((Fragment)localObject).performPictureInPictureModeChanged(paramBoolean);
      }
      i1 = i2 + -1;
    }
  }
  
  public boolean b()
  {
    boolean bool = i();
    E();
    return bool;
  }
  
  boolean b(int paramInt)
  {
    int i1 = this.l;
    if (i1 >= paramInt) {}
    for (i1 = 1;; i1 = 0) {
      return i1;
    }
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    int i1 = 1;
    boolean bool1 = false;
    int i2 = this.l;
    if (i2 < i1) {
      return bool1;
    }
    int i3;
    for (int i4 = 0;; i4 = i3)
    {
      Object localObject = this.e;
      i2 = ((ArrayList)localObject).size();
      if (i4 >= i2) {
        break;
      }
      localObject = (Fragment)this.e.get(i4);
      if (localObject != null)
      {
        boolean bool2 = ((Fragment)localObject).performContextItemSelected(paramMenuItem);
        if (bool2)
        {
          bool1 = i1;
          break;
        }
      }
      i3 = i4 + 1;
    }
  }
  
  public void c(int paramInt)
  {
    try
    {
      Object localObject1 = this.i;
      Object localObject3 = null;
      ((ArrayList)localObject1).set(paramInt, null);
      localObject1 = this.j;
      if (localObject1 == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        this.j = ((ArrayList)localObject1);
      }
      boolean bool = a;
      if (bool)
      {
        localObject1 = "FragmentManager";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "Freeing back stack index ";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject3 = ((StringBuilder)localObject3).append(paramInt);
        localObject3 = ((StringBuilder)localObject3).toString();
        Log.v((String)localObject1, (String)localObject3);
      }
      localObject1 = this.j;
      localObject3 = Integer.valueOf(paramInt);
      ((ArrayList)localObject1).add(localObject3);
      return;
    }
    finally {}
  }
  
  void c(Fragment paramFragment)
  {
    boolean bool = paramFragment.mFromLayout;
    if (bool)
    {
      bool = paramFragment.mPerformedCreateView;
      if (!bool)
      {
        Object localObject = paramFragment.mSavedFragmentState;
        localObject = paramFragment.performGetLayoutInflater((Bundle)localObject);
        Bundle localBundle = paramFragment.mSavedFragmentState;
        localObject = paramFragment.performCreateView((LayoutInflater)localObject, null, localBundle);
        paramFragment.mView = ((View)localObject);
        localObject = paramFragment.mView;
        if (localObject == null) {
          break label141;
        }
        localObject = paramFragment.mView;
        paramFragment.mInnerView = ((View)localObject);
        localObject = paramFragment.mView;
        ((View)localObject).setSaveFromParentEnabled(false);
        bool = paramFragment.mHidden;
        if (bool)
        {
          localObject = paramFragment.mView;
          int i1 = 8;
          ((View)localObject).setVisibility(i1);
        }
        localObject = paramFragment.mView;
        localBundle = paramFragment.mSavedFragmentState;
        paramFragment.onViewCreated((View)localObject, localBundle);
        localObject = paramFragment.mView;
        localBundle = paramFragment.mSavedFragmentState;
        a(paramFragment, (View)localObject, localBundle, false);
      }
    }
    for (;;)
    {
      return;
      label141:
      paramFragment.mInnerView = null;
    }
  }
  
  void c(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).c(paramFragment, paramBundle, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).c(this, paramFragment, paramBundle);
      }
    }
  }
  
  void c(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).c(paramFragment, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).b(this, paramFragment);
      }
    }
  }
  
  public boolean c()
  {
    B();
    return a(null, -1, 0);
  }
  
  public int d()
  {
    ArrayList localArrayList = this.g;
    int i1;
    if (localArrayList != null)
    {
      localArrayList = this.g;
      i1 = localArrayList.size();
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      localArrayList = null;
    }
  }
  
  void d(Fragment paramFragment)
  {
    boolean bool1 = true;
    Object localObject1 = paramFragment.mView;
    Object localObject2;
    Object localObject3;
    if (localObject1 != null)
    {
      int i1 = paramFragment.getNextTransition();
      bool3 = paramFragment.mHidden;
      if (bool3) {
        break label187;
      }
      bool3 = bool1;
      int i3 = paramFragment.getNextTransitionStyle();
      localObject1 = a(paramFragment, i1, bool3, i3);
      if (localObject1 == null) {
        break label261;
      }
      localObject2 = ((n.c)localObject1).b;
      if (localObject2 == null) {
        break label261;
      }
      localObject2 = ((n.c)localObject1).b;
      localObject3 = paramFragment.mView;
      ((Animator)localObject2).setTarget(localObject3);
      boolean bool2 = paramFragment.mHidden;
      if (!bool2) {
        break label246;
      }
      bool2 = paramFragment.isHideReplaced();
      if (!bool2) {
        break label195;
      }
      paramFragment.setHideReplaced(false);
    }
    for (;;)
    {
      localObject2 = paramFragment.mView;
      b((View)localObject2, (n.c)localObject1);
      localObject1 = ((n.c)localObject1).b;
      ((Animator)localObject1).start();
      bool3 = paramFragment.mAdded;
      if (bool3)
      {
        bool3 = paramFragment.mHasMenu;
        if (bool3)
        {
          bool3 = paramFragment.mMenuVisible;
          if (bool3) {
            this.r = bool1;
          }
        }
      }
      paramFragment.mHiddenChanged = false;
      bool3 = paramFragment.mHidden;
      paramFragment.onHiddenChanged(bool3);
      return;
      label187:
      bool3 = false;
      localObject1 = null;
      break;
      label195:
      localObject2 = paramFragment.mContainer;
      localObject3 = paramFragment.mView;
      ((ViewGroup)localObject2).startViewTransition((View)localObject3);
      Animator localAnimator = ((n.c)localObject1).b;
      n.4 local4 = new android/support/v4/app/n$4;
      local4.<init>(this, (ViewGroup)localObject2, (View)localObject3, paramFragment);
      localAnimator.addListener(local4);
      continue;
      label246:
      localObject2 = paramFragment.mView;
      ((View)localObject2).setVisibility(0);
    }
    label261:
    if (localObject1 != null)
    {
      b(paramFragment.mView, (n.c)localObject1);
      localObject2 = paramFragment.mView;
      localObject3 = ((n.c)localObject1).a;
      ((View)localObject2).startAnimation((Animation)localObject3);
      localObject1 = ((n.c)localObject1).a;
      ((Animation)localObject1).start();
    }
    boolean bool3 = paramFragment.mHidden;
    int i2;
    if (bool3)
    {
      bool3 = paramFragment.isHideReplaced();
      if (!bool3) {
        i2 = 8;
      }
    }
    for (;;)
    {
      localObject2 = paramFragment.mView;
      ((View)localObject2).setVisibility(i2);
      boolean bool4 = paramFragment.isHideReplaced();
      if (!bool4) {
        break;
      }
      paramFragment.setHideReplaced(false);
      break;
      bool4 = false;
      localObject1 = null;
    }
  }
  
  void d(Fragment paramFragment, Bundle paramBundle, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).d(paramFragment, paramBundle, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).d(this, paramFragment, paramBundle);
      }
    }
  }
  
  void d(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).d(paramFragment, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).c(this, paramFragment);
      }
    }
  }
  
  public List e()
  {
    Object localObject1 = this.e;
    boolean bool = ((ArrayList)localObject1).isEmpty();
    if (bool) {
      localObject1 = Collections.EMPTY_LIST;
    }
    for (;;)
    {
      return (List)localObject1;
      synchronized (this.e)
      {
        localObject1 = this.e;
        localObject1 = ((ArrayList)localObject1).clone();
        localObject1 = (List)localObject1;
      }
    }
  }
  
  void e(Fragment paramFragment)
  {
    int i1 = 1;
    if (paramFragment == null) {
      return;
    }
    int i2 = this.l;
    boolean bool1 = paramFragment.mRemoving;
    label40:
    Object localObject1;
    Object localObject2;
    View localView;
    if (bool1)
    {
      bool1 = paramFragment.isInBackStack();
      if (bool1) {
        i2 = Math.min(i2, i1);
      }
    }
    else
    {
      int i5 = paramFragment.getNextTransition();
      int i6 = paramFragment.getNextTransitionStyle();
      localObject1 = this;
      localObject2 = paramFragment;
      a(paramFragment, i2, i5, i6, false);
      localObject1 = paramFragment.mView;
      if (localObject1 != null)
      {
        localObject1 = p(paramFragment);
        if (localObject1 != null)
        {
          localObject1 = ((Fragment)localObject1).mView;
          localObject2 = paramFragment.mContainer;
          int i3 = ((ViewGroup)localObject2).indexOfChild((View)localObject1);
          localView = paramFragment.mView;
          i2 = ((ViewGroup)localObject2).indexOfChild(localView);
          if (i2 < i3)
          {
            ((ViewGroup)localObject2).removeViewAt(i2);
            localView = paramFragment.mView;
            ((ViewGroup)localObject2).addView(localView, i3);
          }
        }
        boolean bool2 = paramFragment.mIsNewlyAdded;
        if (bool2)
        {
          localObject1 = paramFragment.mContainer;
          if (localObject1 != null)
          {
            float f1 = paramFragment.mPostponedAlpha;
            bool2 = f1 < 0.0F;
            if (bool2)
            {
              localObject1 = paramFragment.mView;
              float f2 = paramFragment.mPostponedAlpha;
              ((View)localObject1).setAlpha(f2);
            }
            paramFragment.mPostponedAlpha = 0.0F;
            paramFragment.mIsNewlyAdded = false;
            int i4 = paramFragment.getNextTransition();
            int i7 = paramFragment.getNextTransitionStyle();
            localObject1 = a(paramFragment, i4, i1, i7);
            if (localObject1 != null)
            {
              b(paramFragment.mView, (n.c)localObject1);
              localObject2 = ((n.c)localObject1).a;
              if (localObject2 == null) {
                break label321;
              }
              localObject2 = paramFragment.mView;
              localObject1 = ((n.c)localObject1).a;
              ((View)localObject2).startAnimation((Animation)localObject1);
            }
          }
        }
      }
    }
    for (;;)
    {
      boolean bool3 = paramFragment.mHiddenChanged;
      if (!bool3) {
        break;
      }
      d(paramFragment);
      break;
      i2 = Math.min(i2, 0);
      break label40;
      label321:
      localObject2 = ((n.c)localObject1).b;
      localView = paramFragment.mView;
      ((Animator)localObject2).setTarget(localView);
      localObject1 = ((n.c)localObject1).b;
      ((Animator)localObject1).start();
    }
  }
  
  void e(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).e(paramFragment, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).d(this, paramFragment);
      }
    }
  }
  
  void f(Fragment paramFragment)
  {
    int i1 = paramFragment.mIndex;
    if (i1 >= 0) {}
    for (;;)
    {
      return;
      i1 = this.d;
      int i2 = i1 + 1;
      this.d = i2;
      Object localObject1 = this.o;
      paramFragment.setIndex(i1, (Fragment)localObject1);
      Object localObject2 = this.f;
      if (localObject2 == null)
      {
        localObject2 = new android/util/SparseArray;
        ((SparseArray)localObject2).<init>();
        this.f = ((SparseArray)localObject2);
      }
      localObject2 = this.f;
      i2 = paramFragment.mIndex;
      ((SparseArray)localObject2).put(i2, paramFragment);
      boolean bool = a;
      if (bool)
      {
        localObject2 = "FragmentManager";
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        String str = "Allocated fragment index ";
        localObject1 = str + paramFragment;
        Log.v((String)localObject2, (String)localObject1);
      }
    }
  }
  
  void f(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).f(paramFragment, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).e(this, paramFragment);
      }
    }
  }
  
  public boolean f()
  {
    return this.u;
  }
  
  void g(Fragment paramFragment)
  {
    int i1 = paramFragment.mIndex;
    if (i1 < 0) {}
    for (;;)
    {
      return;
      boolean bool = a;
      if (bool)
      {
        localObject1 = "FragmentManager";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "Freeing fragment index ";
        localObject2 = str + paramFragment;
        Log.v((String)localObject1, (String)localObject2);
      }
      Object localObject1 = this.f;
      int i2 = paramFragment.mIndex;
      String str = null;
      ((SparseArray)localObject1).put(i2, null);
      paramFragment.initState();
    }
  }
  
  void g(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).g(paramFragment, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).f(this, paramFragment);
      }
    }
  }
  
  public boolean g()
  {
    boolean bool = this.s;
    if (!bool)
    {
      bool = this.t;
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  void h()
  {
    Object localObject = this.f;
    if (localObject == null) {
      return;
    }
    int i1 = 0;
    localObject = null;
    for (int i2 = 0;; i2 = i1)
    {
      localObject = this.f;
      i1 = ((SparseArray)localObject).size();
      if (i2 >= i1) {
        break;
      }
      localObject = (Fragment)this.f.valueAt(i2);
      if (localObject != null) {
        a((Fragment)localObject);
      }
      i1 = i2 + 1;
    }
  }
  
  public void h(Fragment paramFragment)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    Object localObject1;
    if (bool2)
    {
      localObject1 = "FragmentManager";
      ??? = new java/lang/StringBuilder;
      ((StringBuilder)???).<init>();
      ??? = ((StringBuilder)???).append("remove: ").append(paramFragment);
      String str = " nesting=";
      ??? = ((StringBuilder)???).append(str);
      int i1 = paramFragment.mBackStackNesting;
      ??? = i1;
      Log.v((String)localObject1, (String)???);
    }
    bool2 = paramFragment.isInBackStack();
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      boolean bool3 = paramFragment.mDetached;
      if ((!bool3) || (bool2)) {}
      synchronized (this.e)
      {
        localObject1 = this.e;
        ((ArrayList)localObject1).remove(paramFragment);
        bool2 = paramFragment.mHasMenu;
        if (bool2)
        {
          bool2 = paramFragment.mMenuVisible;
          if (bool2) {
            this.r = bool1;
          }
        }
        paramFragment.mAdded = false;
        paramFragment.mRemoving = bool1;
        return;
        bool2 = false;
        localObject1 = null;
      }
    }
  }
  
  void h(Fragment paramFragment, boolean paramBoolean)
  {
    Object localObject = this.o;
    boolean bool1;
    if (localObject != null)
    {
      localObject = this.o.getFragmentManager();
      bool1 = localObject instanceof n;
      if (bool1)
      {
        localObject = (n)localObject;
        bool1 = true;
        ((n)localObject).h(paramFragment, bool1);
      }
    }
    localObject = this.J;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (android.support.v4.h.j)localIterator.next();
      if (paramBoolean)
      {
        Boolean localBoolean = (Boolean)((android.support.v4.h.j)localObject).b;
        bool1 = localBoolean.booleanValue();
        if (!bool1) {}
      }
      else
      {
        localObject = (m.a)((android.support.v4.h.j)localObject).a;
        ((m.a)localObject).g(this, paramFragment);
      }
    }
  }
  
  public void i(Fragment paramFragment)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2)
    {
      String str1 = "FragmentManager";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "hide: ";
      localObject = str2 + paramFragment;
      Log.v(str1, (String)localObject);
    }
    bool2 = paramFragment.mHidden;
    if (!bool2)
    {
      paramFragment.mHidden = bool1;
      bool2 = paramFragment.mHiddenChanged;
      if (bool2) {
        break label83;
      }
    }
    for (;;)
    {
      paramFragment.mHiddenChanged = bool1;
      return;
      label83:
      bool1 = false;
    }
  }
  
  public boolean i()
  {
    boolean bool1 = true;
    c(bool1);
    boolean bool2 = false;
    ArrayList localArrayList1 = null;
    for (;;)
    {
      ArrayList localArrayList2 = this.x;
      ArrayList localArrayList3 = this.y;
      boolean bool3 = c(localArrayList2, localArrayList3);
      if (bool3)
      {
        this.c = bool1;
        try
        {
          localArrayList1 = this.x;
          localArrayList2 = this.y;
          b(localArrayList1, localArrayList2);
          D();
          bool2 = bool1;
        }
        finally
        {
          D();
        }
      }
    }
    j();
    G();
    return bool2;
  }
  
  void j()
  {
    boolean bool = this.w;
    if (bool)
    {
      bool = false;
      this.w = false;
      h();
    }
  }
  
  public void j(Fragment paramFragment)
  {
    boolean bool1 = false;
    boolean bool2 = a;
    if (bool2)
    {
      String str1 = "FragmentManager";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = "show: ";
      localObject = str2 + paramFragment;
      Log.v(str1, (String)localObject);
    }
    bool2 = paramFragment.mHidden;
    if (bool2)
    {
      paramFragment.mHidden = false;
      bool2 = paramFragment.mHiddenChanged;
      if (!bool2) {
        bool1 = true;
      }
      paramFragment.mHiddenChanged = bool1;
    }
  }
  
  void k()
  {
    Object localObject = this.k;
    if (localObject != null)
    {
      int i1 = 0;
      localObject = null;
      for (int i2 = 0;; i2 = i1)
      {
        localObject = this.k;
        i1 = ((ArrayList)localObject).size();
        if (i2 >= i1) {
          break;
        }
        localObject = (m.b)this.k.get(i2);
        ((m.b)localObject).a();
        i1 = i2 + 1;
      }
    }
  }
  
  public void k(Fragment paramFragment)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    Object localObject1;
    String str;
    if (bool2)
    {
      localObject1 = "FragmentManager";
      ??? = new java/lang/StringBuilder;
      ((StringBuilder)???).<init>();
      str = "detach: ";
      ??? = str + paramFragment;
      Log.v((String)localObject1, (String)???);
    }
    bool2 = paramFragment.mDetached;
    if (!bool2)
    {
      paramFragment.mDetached = bool1;
      bool2 = paramFragment.mAdded;
      if (bool2)
      {
        bool2 = a;
        if (bool2)
        {
          localObject1 = "FragmentManager";
          ??? = new java/lang/StringBuilder;
          ((StringBuilder)???).<init>();
          str = "remove from detach: ";
          ??? = str + paramFragment;
          Log.v((String)localObject1, (String)???);
        }
      }
    }
    synchronized (this.e)
    {
      localObject1 = this.e;
      ((ArrayList)localObject1).remove(paramFragment);
      bool2 = paramFragment.mHasMenu;
      if (bool2)
      {
        bool2 = paramFragment.mMenuVisible;
        if (bool2) {
          this.r = bool1;
        }
      }
      bool2 = false;
      localObject1 = null;
      paramFragment.mAdded = false;
      return;
    }
  }
  
  o l()
  {
    a(this.D);
    return this.D;
  }
  
  public void l(Fragment paramFragment)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    Object localObject1;
    String str;
    if (bool2)
    {
      localObject1 = "FragmentManager";
      ??? = new java/lang/StringBuilder;
      ((StringBuilder)???).<init>();
      str = "attach: ";
      ??? = str + paramFragment;
      Log.v((String)localObject1, (String)???);
    }
    bool2 = paramFragment.mDetached;
    if (bool2)
    {
      localObject1 = null;
      paramFragment.mDetached = false;
      bool2 = paramFragment.mAdded;
      if (!bool2)
      {
        localObject1 = this.e;
        bool2 = ((ArrayList)localObject1).contains(paramFragment);
        if (bool2)
        {
          localObject1 = new java/lang/IllegalStateException;
          ??? = new java/lang/StringBuilder;
          ((StringBuilder)???).<init>();
          ??? = "Fragment already added: " + paramFragment;
          ((IllegalStateException)localObject1).<init>((String)???);
          throw ((Throwable)localObject1);
        }
        bool2 = a;
        if (bool2)
        {
          localObject1 = "FragmentManager";
          ??? = new java/lang/StringBuilder;
          ((StringBuilder)???).<init>();
          str = "add from attach: ";
          ??? = str + paramFragment;
          Log.v((String)localObject1, (String)???);
        }
      }
    }
    synchronized (this.e)
    {
      localObject1 = this.e;
      ((ArrayList)localObject1).add(paramFragment);
      paramFragment.mAdded = bool1;
      bool2 = paramFragment.mHasMenu;
      if (bool2)
      {
        bool2 = paramFragment.mMenuVisible;
        if (bool2) {
          this.r = bool1;
        }
      }
      return;
    }
  }
  
  void m()
  {
    Object localObject1 = this.f;
    if (localObject1 != null)
    {
      int i1 = 0;
      localObject2 = null;
      localObject3 = null;
      i2 = 0;
      localArrayList = null;
      for (;;)
      {
        localObject1 = this.f;
        int i3 = ((SparseArray)localObject1).size();
        if (i1 >= i3) {
          break;
        }
        localObject1 = (Fragment)this.f.valueAt(i1);
        if (localObject1 != null)
        {
          boolean bool1 = ((Fragment)localObject1).mRetainInstance;
          if (bool1)
          {
            if (localArrayList == null)
            {
              localArrayList = new java/util/ArrayList;
              localArrayList.<init>();
            }
            localArrayList.add(localObject1);
            localObject4 = ((Fragment)localObject1).mTarget;
            if (localObject4 == null) {
              break label262;
            }
            localObject4 = ((Fragment)localObject1).mTarget;
            int i4 = ((Fragment)localObject4).mIndex;
            ((Fragment)localObject1).mTargetIndex = i4;
            boolean bool2 = a;
            if (bool2)
            {
              localObject4 = "FragmentManager";
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>();
              String str = "retainNonConfig: keeping retained ";
              localObject5 = str + localObject1;
              Log.v((String)localObject4, (String)localObject5);
            }
          }
          Object localObject4 = ((Fragment)localObject1).mChildFragmentManager;
          if (localObject4 != null)
          {
            ((Fragment)localObject1).mChildFragmentManager.m();
            localObject4 = ((Fragment)localObject1).mChildFragmentManager.D;
          }
          int i5;
          for (Object localObject5 = localObject4;; localObject5 = localObject4)
          {
            if ((localObject3 != null) || (localObject5 == null)) {
              break label281;
            }
            localObject3 = new java/util/ArrayList;
            i5 = this.f.size();
            ((ArrayList)localObject3).<init>(i5);
            i5 = 0;
            localObject4 = null;
            while (i5 < i1)
            {
              ((ArrayList)localObject3).add(null);
              i5 += 1;
            }
            label262:
            i5 = -1;
            break;
            localObject4 = ((Fragment)localObject1).mChildNonConfig;
          }
          label281:
          if (localObject3 != null) {
            ((ArrayList)localObject3).add(localObject5);
          }
          if (localObject2 == null)
          {
            localObject4 = ((Fragment)localObject1).mViewModelStore;
            if (localObject4 != null)
            {
              localObject2 = new java/util/ArrayList;
              i5 = this.f.size();
              ((ArrayList)localObject2).<init>(i5);
              i5 = 0;
              localObject4 = null;
              while (i5 < i1)
              {
                ((ArrayList)localObject2).add(null);
                i5 += 1;
              }
            }
          }
          if (localObject2 != null)
          {
            localObject1 = ((Fragment)localObject1).mViewModelStore;
            ((ArrayList)localObject2).add(localObject1);
          }
        }
        localObject1 = localObject2;
        localObject2 = localObject3;
        localObject3 = localArrayList;
        i2 = i1 + 1;
        i1 = i2;
        localObject3 = localObject2;
        localObject2 = localObject1;
      }
    }
    Object localObject2 = null;
    Object localObject3 = null;
    int i2 = 0;
    ArrayList localArrayList = null;
    if ((localArrayList == null) && (localObject3 == null) && (localObject2 == null)) {}
    for (this.D = null;; this.D = ((o)localObject1))
    {
      return;
      localObject1 = new android/support/v4/app/o;
      ((o)localObject1).<init>(localArrayList, (List)localObject3, (List)localObject2);
    }
  }
  
  void m(Fragment paramFragment)
  {
    Object localObject = paramFragment.mInnerView;
    if (localObject == null) {
      return;
    }
    localObject = this.B;
    if (localObject == null)
    {
      localObject = new android/util/SparseArray;
      ((SparseArray)localObject).<init>();
      this.B = ((SparseArray)localObject);
    }
    for (;;)
    {
      localObject = paramFragment.mInnerView;
      SparseArray localSparseArray = this.B;
      ((View)localObject).saveHierarchyState(localSparseArray);
      localObject = this.B;
      int i1 = ((SparseArray)localObject).size();
      if (i1 <= 0) {
        break;
      }
      localObject = this.B;
      paramFragment.mSavedViewState = ((SparseArray)localObject);
      i1 = 0;
      localObject = null;
      this.B = null;
      break;
      localObject = this.B;
      ((SparseArray)localObject).clear();
    }
  }
  
  Bundle n(Fragment paramFragment)
  {
    boolean bool1 = false;
    Object localObject = null;
    Bundle localBundle = this.A;
    if (localBundle == null)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      this.A = localBundle;
    }
    localBundle = this.A;
    paramFragment.performSaveInstanceState(localBundle);
    localBundle = this.A;
    boolean bool2 = false;
    SparseArray localSparseArray = null;
    d(paramFragment, localBundle, false);
    localBundle = this.A;
    boolean bool3 = localBundle.isEmpty();
    if (!bool3)
    {
      localBundle = this.A;
      this.A = null;
    }
    for (;;)
    {
      localObject = paramFragment.mView;
      if (localObject != null) {
        m(paramFragment);
      }
      localObject = paramFragment.mSavedViewState;
      if (localObject != null)
      {
        if (localBundle == null)
        {
          localBundle = new android/os/Bundle;
          localBundle.<init>();
        }
        localObject = "android:view_state";
        localSparseArray = paramFragment.mSavedViewState;
        localBundle.putSparseParcelableArray((String)localObject, localSparseArray);
      }
      bool1 = paramFragment.mUserVisibleHint;
      if (!bool1)
      {
        if (localBundle == null)
        {
          localBundle = new android/os/Bundle;
          localBundle.<init>();
        }
        localObject = "android:user_visible_hint";
        bool2 = paramFragment.mUserVisibleHint;
        localBundle.putBoolean((String)localObject, bool2);
      }
      return localBundle;
      bool3 = false;
      localBundle = null;
    }
  }
  
  Parcelable n()
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject1 = null;
    Object localObject2 = null;
    E();
    F();
    i();
    this.s = i1;
    this.D = null;
    Object localObject3 = this.f;
    int i2;
    if (localObject3 != null)
    {
      localObject3 = this.f;
      i2 = ((SparseArray)localObject3).size();
      if (i2 > 0) {}
    }
    else
    {
      return (Parcelable)localObject2;
    }
    localObject3 = this.f;
    int i6 = ((SparseArray)localObject3).size();
    FragmentState[] arrayOfFragmentState = new FragmentState[i6];
    int i7 = 0;
    int i8 = 0;
    Object localObject4 = null;
    float f2 = 0.0F;
    label97:
    Object localObject5;
    if (i7 < i6)
    {
      localObject3 = (Fragment)this.f.valueAt(i7);
      if (localObject3 == null) {
        break label1142;
      }
      i8 = ((Fragment)localObject3).mIndex;
      Object localObject6;
      if (i8 < 0)
      {
        localObject4 = new java/lang/IllegalStateException;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Failure saving state: active ").append(localObject3);
        localObject6 = " has cleared index: ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject6);
        int i9 = ((Fragment)localObject3).mIndex;
        localObject5 = i9;
        ((IllegalStateException)localObject4).<init>((String)localObject5);
        a((RuntimeException)localObject4);
      }
      localObject4 = new android/support/v4/app/FragmentState;
      ((FragmentState)localObject4).<init>((Fragment)localObject3);
      arrayOfFragmentState[i7] = localObject4;
      int i10 = ((Fragment)localObject3).mState;
      if (i10 > 0)
      {
        localObject5 = ((FragmentState)localObject4).k;
        if (localObject5 == null)
        {
          localObject5 = n((Fragment)localObject3);
          ((FragmentState)localObject4).k = ((Bundle)localObject5);
          localObject5 = ((Fragment)localObject3).mTarget;
          Object localObject7;
          if (localObject5 != null)
          {
            localObject5 = ((Fragment)localObject3).mTarget;
            i10 = ((Fragment)localObject5).mIndex;
            if (i10 < 0)
            {
              localObject5 = new java/lang/IllegalStateException;
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>();
              localObject6 = ((StringBuilder)localObject6).append("Failure saving state: ").append(localObject3).append(" has target not in fragment manager: ");
              localObject7 = ((Fragment)localObject3).mTarget;
              localObject6 = localObject7;
              ((IllegalStateException)localObject5).<init>((String)localObject6);
              a((RuntimeException)localObject5);
            }
            localObject5 = ((FragmentState)localObject4).k;
            if (localObject5 == null)
            {
              localObject5 = new android/os/Bundle;
              ((Bundle)localObject5).<init>();
              ((FragmentState)localObject4).k = ((Bundle)localObject5);
            }
            localObject5 = ((FragmentState)localObject4).k;
            localObject6 = "android:target_state";
            localObject7 = ((Fragment)localObject3).mTarget;
            a((Bundle)localObject5, (String)localObject6, (Fragment)localObject7);
            i10 = ((Fragment)localObject3).mTargetRequestCode;
            if (i10 != 0)
            {
              localObject5 = ((FragmentState)localObject4).k;
              localObject6 = "android:target_req_state";
              int i12 = ((Fragment)localObject3).mTargetRequestCode;
              ((Bundle)localObject5).putInt((String)localObject6, i12);
            }
          }
          label466:
          boolean bool4 = a;
          if (bool4)
          {
            localObject5 = "FragmentManager";
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            localObject7 = "Saved state of ";
            localObject3 = ((StringBuilder)localObject6).append((String)localObject7).append(localObject3);
            localObject6 = ": ";
            localObject3 = ((StringBuilder)localObject3).append((String)localObject6);
            localObject4 = ((FragmentState)localObject4).k;
            localObject3 = localObject4;
            Log.v((String)localObject5, (String)localObject3);
          }
          i2 = i1;
        }
      }
    }
    for (float f3 = f1;; f3 = f2)
    {
      i7 += 1;
      i8 = i2;
      f2 = f3;
      break label97;
      localObject5 = ((Fragment)localObject3).mSavedFragmentState;
      ((FragmentState)localObject4).k = ((Bundle)localObject5);
      break label466;
      if (i8 == 0)
      {
        boolean bool1 = a;
        if (!bool1) {
          break;
        }
        localObject3 = "FragmentManager";
        localObject8 = "saveAllState: no fragments!";
        Log.v((String)localObject3, (String)localObject8);
        break;
      }
      localObject3 = this.e;
      i7 = ((ArrayList)localObject3).size();
      Object localObject9;
      if (i7 > 0)
      {
        localObject8 = new int[i7];
        i8 = 0;
        localObject4 = null;
        f2 = 0.0F;
        while (i8 < i7)
        {
          localObject3 = (Fragment)this.e.get(i8);
          int i3 = ((Fragment)localObject3).mIndex;
          localObject8[i8] = i3;
          i3 = localObject8[i8];
          if (i3 < 0)
          {
            localObject3 = new java/lang/IllegalStateException;
            localObject9 = new java/lang/StringBuilder;
            ((StringBuilder)localObject9).<init>();
            localObject9 = ((StringBuilder)localObject9).append("Failure saving state: active ");
            localObject5 = this.e.get(i8);
            localObject9 = ((StringBuilder)localObject9).append(localObject5);
            localObject5 = " has cleared index: ";
            localObject9 = ((StringBuilder)localObject9).append((String)localObject5);
            int i11 = localObject8[i8];
            localObject9 = i11;
            ((IllegalStateException)localObject3).<init>((String)localObject9);
            a((RuntimeException)localObject3);
          }
          boolean bool2 = a;
          if (bool2)
          {
            localObject3 = "FragmentManager";
            localObject9 = new java/lang/StringBuilder;
            ((StringBuilder)localObject9).<init>();
            localObject9 = ((StringBuilder)localObject9).append("saveAllState: adding fragment #").append(i8).append(": ");
            localObject5 = this.e.get(i8);
            localObject9 = localObject5;
            Log.v((String)localObject3, (String)localObject9);
          }
          int i4 = i8 + 1;
          i8 = i4;
        }
      }
      i1 = 0;
      Object localObject8 = null;
      f1 = 0.0F;
      localObject3 = this.g;
      if (localObject3 != null)
      {
        localObject3 = this.g;
        i7 = ((ArrayList)localObject3).size();
        if (i7 > 0)
        {
          localObject2 = new BackStackState[i7];
          i8 = 0;
          localObject4 = null;
          f2 = 0.0F;
          while (i8 < i7)
          {
            localObject1 = new android/support/v4/app/BackStackState;
            localObject3 = (d)this.g.get(i8);
            ((BackStackState)localObject1).<init>((d)localObject3);
            localObject2[i8] = localObject1;
            boolean bool3 = a;
            if (bool3)
            {
              localObject3 = "FragmentManager";
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject1 = ((StringBuilder)localObject1).append("saveAllState: adding back stack #").append(i8).append(": ");
              localObject9 = this.g.get(i8);
              localObject1 = localObject9;
              Log.v((String)localObject3, (String)localObject1);
            }
            i5 = i8 + 1;
            i8 = i5;
          }
        }
      }
      localObject3 = new android/support/v4/app/FragmentManagerState;
      ((FragmentManagerState)localObject3).<init>();
      ((FragmentManagerState)localObject3).a = arrayOfFragmentState;
      ((FragmentManagerState)localObject3).b = ((int[])localObject8);
      ((FragmentManagerState)localObject3).c = ((BackStackState[])localObject2);
      localObject8 = this.p;
      if (localObject8 != null)
      {
        localObject8 = this.p;
        i1 = ((Fragment)localObject8).mIndex;
        ((FragmentManagerState)localObject3).d = i1;
      }
      i1 = this.d;
      ((FragmentManagerState)localObject3).e = i1;
      m();
      localObject2 = localObject3;
      break;
      label1142:
      int i5 = i8;
    }
  }
  
  public void o()
  {
    int i1 = 0;
    Fragment localFragment = null;
    this.D = null;
    this.s = false;
    this.t = false;
    int i2 = this.e.size();
    for (int i3 = 0; i3 < i2; i3 = i1)
    {
      localFragment = (Fragment)this.e.get(i3);
      if (localFragment != null) {
        localFragment.noteStateNotSaved();
      }
      i1 = i3 + 1;
    }
  }
  
  public void o(Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      Object localObject1 = this.f;
      int i1 = paramFragment.mIndex;
      localObject1 = ((SparseArray)localObject1).get(i1);
      if (localObject1 == paramFragment)
      {
        localObject1 = paramFragment.mHost;
        if (localObject1 != null)
        {
          localObject1 = paramFragment.getFragmentManager();
          if (localObject1 == this) {}
        }
      }
      else
      {
        localObject1 = new java/lang/IllegalArgumentException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Fragment " + paramFragment + " is not an active fragment of FragmentManager " + this;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    this.p = paramFragment;
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    String str1 = null;
    int i1 = -1;
    int i2 = 1;
    Object localObject2 = "fragment";
    int i3 = ((String)localObject2).equals(paramString);
    if (i3 == 0)
    {
      i3 = 0;
      localObject2 = null;
      return (View)localObject2;
    }
    localObject2 = paramAttributeSet.getAttributeValue(null, "class");
    Object localObject3 = n.f.a;
    localObject3 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject3);
    if (localObject2 == null) {
      localObject2 = ((TypedArray)localObject3).getString(0);
    }
    for (Object localObject4 = localObject2;; localObject4 = localObject2)
    {
      int i5 = ((TypedArray)localObject3).getResourceId(i2, i1);
      String str2 = ((TypedArray)localObject3).getString(2);
      ((TypedArray)localObject3).recycle();
      localObject2 = this.m.i();
      i3 = Fragment.isSupportFragmentClass((Context)localObject2, (String)localObject4);
      if (i3 == 0)
      {
        i3 = 0;
        localObject2 = null;
        break;
      }
      int i6;
      if (paramView != null) {
        i6 = paramView.getId();
      }
      Object localObject5;
      while ((i6 == i1) && (i5 == i1) && (str2 == null))
      {
        localObject2 = new java/lang/IllegalArgumentException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject5 = paramAttributeSet.getPositionDescription();
        localObject3 = (String)localObject5 + ": Must specify unique android:id, android:tag, or have a parent with an id for " + (String)localObject4;
        ((IllegalArgumentException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
        i6 = 0;
        localObject3 = null;
      }
      label421:
      label507:
      boolean bool3;
      if (i5 != i1)
      {
        localObject2 = a(i5);
        if ((localObject2 == null) && (str2 != null)) {
          localObject2 = a(str2);
        }
        if ((localObject2 == null) && (i6 != i1)) {
          localObject2 = a(i6);
        }
        boolean bool2 = a;
        if (bool2)
        {
          str3 = "FragmentManager";
          Object localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          localObject6 = ((StringBuilder)localObject6).append("onCreateView: id=0x");
          String str4 = Integer.toHexString(i5);
          localObject6 = ((StringBuilder)localObject6).append(str4).append(" fname=").append((String)localObject4);
          str4 = " existing=";
          localObject6 = str4 + localObject2;
          Log.v(str3, (String)localObject6);
        }
        if (localObject2 != null) {
          break label635;
        }
        localObject2 = this.n;
        localObject1 = ((j)localObject2).a(paramContext, (String)localObject4, null);
        ((Fragment)localObject1).mFromLayout = i2;
        if (i5 == 0) {
          break label628;
        }
        i3 = i5;
        ((Fragment)localObject1).mFragmentId = i3;
        ((Fragment)localObject1).mContainerId = i6;
        ((Fragment)localObject1).mTag = str2;
        ((Fragment)localObject1).mInLayout = i2;
        ((Fragment)localObject1).mFragmentManager = this;
        localObject2 = this.m;
        ((Fragment)localObject1).mHost = ((l)localObject2);
        localObject2 = this.m.i();
        localObject3 = ((Fragment)localObject1).mSavedFragmentState;
        ((Fragment)localObject1).onInflate((Context)localObject2, paramAttributeSet, (Bundle)localObject3);
        a((Fragment)localObject1, i2);
        localObject3 = localObject1;
        int i4 = this.l;
        if (i4 >= i2) {
          break label825;
        }
        bool3 = ((Fragment)localObject3).mFromLayout;
        if (!bool3) {
          break label825;
        }
        localObject2 = this;
        bool1 = false;
        localObject1 = null;
        bool2 = false;
        String str3 = null;
        a((Fragment)localObject3, i2, 0, 0, false);
      }
      for (;;)
      {
        localObject2 = ((Fragment)localObject3).mView;
        if (localObject2 != null) {
          break label834;
        }
        localObject2 = new java/lang/IllegalStateException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = "Fragment " + (String)localObject4 + " did not create a view.";
        ((IllegalStateException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
        bool3 = false;
        localObject2 = null;
        break;
        label628:
        bool3 = i6;
        break label421;
        label635:
        bool1 = ((Fragment)localObject2).mInLayout;
        if (bool1)
        {
          localObject2 = new java/lang/IllegalArgumentException;
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          str1 = paramAttributeSet.getPositionDescription();
          localObject5 = ((StringBuilder)localObject5).append(str1).append(": Duplicate id 0x");
          str1 = Integer.toHexString(i5);
          localObject5 = ((StringBuilder)localObject5).append(str1).append(", tag ").append(str2).append(", or parent id 0x");
          localObject3 = Integer.toHexString(i6);
          localObject3 = (String)localObject3 + " with another fragment for " + (String)localObject4;
          ((IllegalArgumentException)localObject2).<init>((String)localObject3);
          throw ((Throwable)localObject2);
        }
        ((Fragment)localObject2).mInLayout = i2;
        localObject3 = this.m;
        ((Fragment)localObject2).mHost = ((l)localObject3);
        boolean bool4 = ((Fragment)localObject2).mRetaining;
        if (!bool4)
        {
          localObject3 = this.m.i();
          localObject1 = ((Fragment)localObject2).mSavedFragmentState;
          ((Fragment)localObject2).onInflate((Context)localObject3, paramAttributeSet, (Bundle)localObject1);
        }
        localObject3 = localObject2;
        break label507;
        label825:
        b((Fragment)localObject3);
      }
      label834:
      if (i5 != 0)
      {
        localObject2 = ((Fragment)localObject3).mView;
        ((View)localObject2).setId(i5);
      }
      localObject2 = ((Fragment)localObject3).mView.getTag();
      if (localObject2 == null)
      {
        localObject2 = ((Fragment)localObject3).mView;
        ((View)localObject2).setTag(str2);
      }
      localObject2 = ((Fragment)localObject3).mView;
      break;
    }
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public void p()
  {
    this.s = false;
    this.t = false;
    e(1);
  }
  
  public void q()
  {
    this.s = false;
    this.t = false;
    e(2);
  }
  
  public void r()
  {
    this.s = false;
    this.t = false;
    e(4);
  }
  
  public void s()
  {
    this.s = false;
    this.t = false;
    e(5);
  }
  
  public void t()
  {
    e(4);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("FragmentManager{");
    int i1 = System.identityHashCode(this);
    Object localObject = Integer.toHexString(i1);
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" in ");
    localObject = this.o;
    if (localObject != null)
    {
      localObject = this.o;
      android.support.v4.h.d.a(localObject, localStringBuilder);
    }
    for (;;)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      localObject = this.m;
      android.support.v4.h.d.a(localObject, localStringBuilder);
    }
  }
  
  public void u()
  {
    this.t = true;
    e(3);
  }
  
  public void v()
  {
    e(2);
  }
  
  public void w()
  {
    e(1);
  }
  
  public void x()
  {
    this.u = true;
    i();
    e(0);
    this.m = null;
    this.n = null;
    this.o = null;
  }
  
  public void y()
  {
    int i1 = 0;
    Object localObject = null;
    for (int i2 = 0;; i2 = i1)
    {
      localObject = this.e;
      i1 = ((ArrayList)localObject).size();
      if (i2 >= i1) {
        break;
      }
      localObject = (Fragment)this.e.get(i2);
      if (localObject != null) {
        ((Fragment)localObject).performLowMemory();
      }
      i1 = i2 + 1;
    }
  }
  
  public Fragment z()
  {
    return this.p;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */