package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.r;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public class q
{
  private static final Interpolator v;
  private int a;
  private int b;
  private int c;
  private float[] d;
  private float[] e;
  private float[] f;
  private float[] g;
  private int[] h;
  private int[] i;
  private int[] j;
  private int k;
  private VelocityTracker l;
  private float m;
  private float n;
  private int o;
  private int p;
  private OverScroller q;
  private final q.a r;
  private View s;
  private boolean t;
  private final ViewGroup u;
  private final Runnable w;
  
  static
  {
    q.1 local1 = new android/support/v4/widget/q$1;
    local1.<init>();
    v = local1;
  }
  
  private q(Context paramContext, ViewGroup paramViewGroup, q.a parama)
  {
    int i1 = -1;
    float f1 = 0.0F / 0.0F;
    this.c = i1;
    Object localObject = new android/support/v4/widget/q$2;
    ((q.2)localObject).<init>(this);
    this.w = ((Runnable)localObject);
    if (paramViewGroup == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Parent view may not be null");
      throw ((Throwable)localObject);
    }
    if (parama == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Callback may not be null");
      throw ((Throwable)localObject);
    }
    this.u = paramViewGroup;
    this.r = parama;
    localObject = ViewConfiguration.get(paramContext);
    int i2 = (int)(paramContext.getResources().getDisplayMetrics().density * 20.0F + 0.5F);
    this.o = i2;
    i2 = ((ViewConfiguration)localObject).getScaledTouchSlop();
    this.b = i2;
    float f2 = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
    this.m = f2;
    f1 = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
    this.n = f1;
    localObject = new android/widget/OverScroller;
    Interpolator localInterpolator = v;
    ((OverScroller)localObject).<init>(paramContext, localInterpolator);
    this.q = ((OverScroller)localObject);
  }
  
  private float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = false;
    float f1 = Math.abs(paramFloat1);
    boolean bool2 = f1 < paramFloat2;
    if (bool2) {
      paramFloat3 = 0.0F;
    }
    for (;;)
    {
      return paramFloat3;
      boolean bool3 = f1 < paramFloat3;
      if (bool3)
      {
        bool1 = paramFloat1 < 0.0F;
        if (!bool1) {
          paramFloat3 = -paramFloat3;
        }
      }
      else
      {
        paramFloat3 = paramFloat1;
      }
    }
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    float f1 = 1.0F;
    if (paramInt1 == 0)
    {
      i1 = 0;
      f2 = 0.0F;
      localViewGroup = null;
      return i1;
    }
    ViewGroup localViewGroup = this.u;
    int i1 = localViewGroup.getWidth();
    int i2 = i1 / 2;
    int i3 = Math.abs(paramInt1);
    float f3 = i3;
    float f2 = i1;
    f2 = f3 / f2;
    f2 = Math.min(f1, f2);
    f3 = i2;
    float f4 = i2;
    f2 = b(f2) * f4 + f3;
    i2 = Math.abs(paramInt2);
    if (i2 > 0)
    {
      i3 = 1148846080;
      f3 = 1000.0F;
      f4 = i2;
      f2 = Math.abs(f2 / f4) * f3;
    }
    for (i1 = Math.round(f2) * 4;; i1 = (int)f2)
    {
      i2 = 600;
      f4 = 8.41E-43F;
      i1 = Math.min(i1, i2);
      break;
      f2 = Math.abs(paramInt1);
      f4 = paramInt3;
      f2 = f2 / f4 + f1;
      i2 = 1132462080;
      f4 = 256.0F;
      f2 *= f4;
    }
  }
  
  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = (int)this.n;
    int i2 = (int)this.m;
    int i3 = b(paramInt3, i1, i2);
    float f1 = this.n;
    i1 = (int)f1;
    float f2 = this.m;
    i2 = (int)f2;
    int i4 = b(paramInt4, i1, i2);
    i1 = Math.abs(paramInt1);
    int i5 = Math.abs(paramInt2);
    i2 = Math.abs(i3);
    int i6 = Math.abs(i4);
    int i7 = i2 + i6;
    int i8 = i1 + i5;
    float f3;
    if (i3 != 0)
    {
      f1 = i2;
      f2 = i7;
      f1 /= f2;
      f2 = f1;
      if (i4 == 0) {
        break label241;
      }
      f1 = i6;
      f3 = i7;
    }
    for (f1 /= f3;; f1 /= f3)
    {
      i5 = this.r.b(paramView);
      i3 = a(paramInt1, i3, i5);
      i5 = this.r.a(paramView);
      i4 = a(paramInt2, i4, i5);
      float f4 = i3;
      f2 *= f4;
      f4 = i4;
      return (int)(f1 * f4 + f2);
      f1 = i1;
      f2 = i8;
      f1 /= f2;
      f2 = f1;
      break;
      label241:
      f1 = i5;
      f3 = i8;
    }
  }
  
  public static q a(ViewGroup paramViewGroup, float paramFloat, q.a parama)
  {
    q localq = a(paramViewGroup, parama);
    float f1 = localq.b;
    float f2 = 1.0F / paramFloat;
    int i1 = (int)(f1 * f2);
    localq.b = i1;
    return localq;
  }
  
  public static q a(ViewGroup paramViewGroup, q.a parama)
  {
    q localq = new android/support/v4/widget/q;
    Context localContext = paramViewGroup.getContext();
    localq.<init>(localContext, paramViewGroup, parama);
    return localq;
  }
  
  private void a(float paramFloat1, float paramFloat2)
  {
    int i1 = 1;
    this.t = i1;
    q.a locala = this.r;
    View localView = this.s;
    locala.a(localView, paramFloat1, paramFloat2);
    this.t = false;
    int i2 = this.a;
    if (i2 == i1) {
      c(0);
    }
  }
  
  private void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    f(paramInt);
    Object localObject = this.d;
    this.f[paramInt] = paramFloat1;
    localObject[paramInt] = paramFloat1;
    localObject = this.e;
    this.g[paramInt] = paramFloat2;
    localObject[paramInt] = paramFloat2;
    localObject = this.h;
    int i1 = (int)paramFloat1;
    int i2 = (int)paramFloat2;
    i1 = e(i1, i2);
    localObject[paramInt] = i1;
    int i3 = this.k;
    i1 = 1 << paramInt;
    i3 |= i1;
    this.k = i3;
  }
  
  private boolean a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    float f1 = Math.abs(paramFloat1);
    float f2 = Math.abs(paramFloat2);
    int[] arrayOfInt1 = this.h;
    int i1 = arrayOfInt1[paramInt1] & paramInt2;
    float f3;
    if (i1 == paramInt2)
    {
      i1 = this.p & paramInt2;
      if (i1 != 0)
      {
        arrayOfInt1 = this.j;
        i1 = arrayOfInt1[paramInt1] & paramInt2;
        if (i1 != paramInt2)
        {
          arrayOfInt1 = this.i;
          i1 = arrayOfInt1[paramInt1] & paramInt2;
          if (i1 != paramInt2)
          {
            f3 = this.b;
            boolean bool2 = f1 < f3;
            if (bool2) {
              break label136;
            }
            f3 = this.b;
            bool2 = f2 < f3;
            if (bool2) {
              break label136;
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      label136:
      int i2 = 1056964608;
      f3 = 0.5F;
      f2 *= f3;
      boolean bool3 = f1 < f2;
      if (bool3)
      {
        localObject = this.r;
        bool3 = ((q.a)localObject).b(paramInt2);
        if (bool3)
        {
          int[] arrayOfInt2 = this.j;
          i3 = arrayOfInt2[paramInt1] | paramInt2;
          arrayOfInt2[paramInt1] = i3;
          continue;
        }
      }
      Object localObject = this.i;
      int i3 = localObject[paramInt1] & paramInt2;
      if (i3 == 0)
      {
        i3 = this.b;
        f2 = i3;
        boolean bool4 = f1 < f2;
        if (bool4) {
          bool1 = true;
        }
      }
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = false;
    int i1 = this.s.getLeft();
    Object localObject = this.s;
    int i2 = ((View)localObject).getTop();
    int i3 = paramInt1 - i1;
    int i4 = paramInt2 - i2;
    if ((i3 == 0) && (i4 == 0))
    {
      localObject = this.q;
      ((OverScroller)localObject).abortAnimation();
      c(0);
    }
    for (;;)
    {
      return bool;
      localObject = this.s;
      int i5 = paramInt4;
      int i6 = a((View)localObject, i3, i4, paramInt3, paramInt4);
      OverScroller localOverScroller = this.q;
      i5 = i1;
      i1 = i3;
      localOverScroller.startScroll(i5, i2, i3, i4, i6);
      c(2);
      bool = true;
    }
  }
  
  private boolean a(View paramView, float paramFloat1, float paramFloat2)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    if (paramView == null)
    {
      i1 = 0;
      f1 = 0.0F;
    }
    for (;;)
    {
      return i1;
      q.a locala1 = this.r;
      int i2 = locala1.b(paramView);
      float f2;
      label47:
      q.a locala2;
      int i3;
      if (i2 > 0)
      {
        i2 = i1;
        f2 = f1;
        locala2 = this.r;
        i3 = locala2.a(paramView);
        if (i3 <= 0) {
          break label158;
        }
        i3 = i1;
      }
      boolean bool;
      for (float f3 = f1;; f3 = 0.0F)
      {
        if ((i2 == 0) || (i3 == 0)) {
          break label170;
        }
        f2 = paramFloat1 * paramFloat1;
        f3 = paramFloat2 * paramFloat2;
        f2 += f3;
        i3 = this.b;
        int i4 = this.b;
        i3 *= i4;
        f3 = i3;
        bool = f2 < f3;
        if (bool) {
          break;
        }
        i1 = 0;
        f1 = 0.0F;
        break;
        bool = false;
        locala1 = null;
        f2 = 0.0F;
        break label47;
        label158:
        i3 = 0;
        locala2 = null;
      }
      label170:
      if (bool)
      {
        f2 = Math.abs(paramFloat1);
        i3 = this.b;
        f3 = i3;
        bool = f2 < f3;
        if (!bool)
        {
          i1 = 0;
          f1 = 0.0F;
        }
      }
      else if (i3 != 0)
      {
        f2 = Math.abs(paramFloat2);
        i3 = this.b;
        f3 = i3;
        bool = f2 < f3;
        if (!bool)
        {
          i1 = 0;
          f1 = 0.0F;
        }
      }
      else
      {
        i1 = 0;
        f1 = 0.0F;
      }
    }
  }
  
  private float b(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.47123894F);
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = Math.abs(paramInt1);
    if (i1 < paramInt2) {
      paramInt3 = 0;
    }
    for (;;)
    {
      return paramInt3;
      if (i1 > paramInt3)
      {
        if (paramInt1 <= 0) {
          paramInt3 = -paramInt3;
        }
      }
      else {
        paramInt3 = paramInt1;
      }
    }
  }
  
  private void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    int i1 = 1;
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = a(paramFloat1, paramFloat2, paramInt, i1);
    if (bool2) {}
    for (;;)
    {
      bool1 = a(paramFloat2, paramFloat1, paramInt, 4);
      if (bool1) {
        i1 |= 0x4;
      }
      bool1 = a(paramFloat1, paramFloat2, paramInt, 2);
      if (bool1) {
        i1 |= 0x2;
      }
      bool1 = a(paramFloat2, paramFloat1, paramInt, 8);
      if (bool1) {
        i1 |= 0x8;
      }
      if (i1 != 0)
      {
        localObject = this.i;
        int i2 = localObject[paramInt] | i1;
        localObject[paramInt] = i2;
        localObject = this.r;
        ((q.a)localObject).b(i1, paramInt);
      }
      return;
      i1 = 0;
    }
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject1 = this.s;
    int i1 = ((View)localObject1).getLeft();
    View localView1 = this.s;
    int i2 = localView1.getTop();
    Object localObject2;
    int i3;
    int i4;
    if (paramInt3 != 0)
    {
      q.a locala = this.r;
      localObject2 = this.s;
      i3 = locala.b((View)localObject2, paramInt1, paramInt3);
      localObject2 = this.s;
      i4 = i3 - i1;
      r.d((View)localObject2, i4);
    }
    for (;;)
    {
      int i5;
      int i6;
      if (paramInt4 != 0)
      {
        localObject2 = this.r;
        View localView2 = this.s;
        i5 = ((q.a)localObject2).a(localView2, paramInt2, paramInt4);
        localView2 = this.s;
        i6 = i5 - i2;
        r.c(localView2, i6);
      }
      for (;;)
      {
        if ((paramInt3 != 0) || (paramInt4 != 0))
        {
          i4 = i3 - i1;
          i6 = i5 - i2;
          localObject1 = this.r;
          localView1 = this.s;
          ((q.a)localObject1).a(localView1, i3, i5, i4, i6);
        }
        return;
        i5 = paramInt2;
      }
      i3 = paramInt1;
    }
  }
  
  private void c(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getPointerCount();
    int i2 = 0;
    if (i2 < i1)
    {
      int i3 = paramMotionEvent.getPointerId(i2);
      boolean bool = g(i3);
      if (!bool) {}
      for (;;)
      {
        i2 += 1;
        break;
        float f1 = paramMotionEvent.getX(i2);
        float f2 = paramMotionEvent.getY(i2);
        float[] arrayOfFloat1 = this.f;
        arrayOfFloat1[i3] = f1;
        float[] arrayOfFloat2 = this.g;
        arrayOfFloat2[i3] = f2;
      }
    }
  }
  
  private int e(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    ViewGroup localViewGroup = this.u;
    int i2 = localViewGroup.getLeft();
    int i3 = this.o;
    i2 += i3;
    if (paramInt1 < i2) {
      i1 = 1;
    }
    localViewGroup = this.u;
    i2 = localViewGroup.getTop();
    i3 = this.o;
    i2 += i3;
    if (paramInt2 < i2) {
      i1 |= 0x4;
    }
    localViewGroup = this.u;
    i2 = localViewGroup.getRight();
    i3 = this.o;
    i2 -= i3;
    if (paramInt1 > i2) {
      i1 |= 0x2;
    }
    localViewGroup = this.u;
    i2 = localViewGroup.getBottom();
    i3 = this.o;
    i2 -= i3;
    if (paramInt2 > i2) {
      i1 |= 0x8;
    }
    return i1;
  }
  
  private void e(int paramInt)
  {
    int i1 = 0;
    Object localObject = this.d;
    if (localObject != null)
    {
      boolean bool = b(paramInt);
      if (bool) {
        break label24;
      }
    }
    for (;;)
    {
      return;
      label24:
      this.d[paramInt] = 0.0F;
      this.e[paramInt] = 0.0F;
      this.f[paramInt] = 0.0F;
      this.g[paramInt] = 0.0F;
      this.h[paramInt] = 0;
      this.i[paramInt] = 0;
      localObject = this.j;
      localObject[paramInt] = 0;
      int i2 = this.k;
      i1 = 1 << paramInt ^ 0xFFFFFFFF;
      i2 &= i1;
      this.k = i2;
    }
  }
  
  private void f()
  {
    Object localObject = this.d;
    if (localObject == null) {}
    for (;;)
    {
      return;
      Arrays.fill(this.d, 0.0F);
      Arrays.fill(this.e, 0.0F);
      Arrays.fill(this.f, 0.0F);
      Arrays.fill(this.g, 0.0F);
      Arrays.fill(this.h, 0);
      Arrays.fill(this.i, 0);
      localObject = this.j;
      Arrays.fill((int[])localObject, 0);
      this.k = 0;
    }
  }
  
  private void f(int paramInt)
  {
    float[] arrayOfFloat1 = this.d;
    int i1;
    if (arrayOfFloat1 != null)
    {
      arrayOfFloat1 = this.d;
      i1 = arrayOfFloat1.length;
      if (i1 > paramInt) {}
    }
    else
    {
      i1 = paramInt + 1;
      arrayOfFloat1 = new float[i1];
      int i2 = paramInt + 1;
      float[] arrayOfFloat2 = new float[i2];
      int i3 = paramInt + 1;
      float[] arrayOfFloat3 = new float[i3];
      int i4 = paramInt + 1;
      float[] arrayOfFloat4 = new float[i4];
      int i5 = paramInt + 1;
      int[] arrayOfInt1 = new int[i5];
      int i6 = paramInt + 1;
      int[] arrayOfInt2 = new int[i6];
      int i7 = paramInt + 1;
      int[] arrayOfInt3 = new int[i7];
      Object localObject = this.d;
      if (localObject != null)
      {
        localObject = this.d;
        int i8 = this.d.length;
        System.arraycopy(localObject, 0, arrayOfFloat1, 0, i8);
        localObject = this.e;
        i8 = this.e.length;
        System.arraycopy(localObject, 0, arrayOfFloat2, 0, i8);
        localObject = this.f;
        i8 = this.f.length;
        System.arraycopy(localObject, 0, arrayOfFloat3, 0, i8);
        localObject = this.g;
        i8 = this.g.length;
        System.arraycopy(localObject, 0, arrayOfFloat4, 0, i8);
        localObject = this.h;
        i8 = this.h.length;
        System.arraycopy(localObject, 0, arrayOfInt1, 0, i8);
        localObject = this.i;
        i8 = this.i.length;
        System.arraycopy(localObject, 0, arrayOfInt2, 0, i8);
        localObject = this.j;
        int[] arrayOfInt4 = this.j;
        i8 = arrayOfInt4.length;
        System.arraycopy(localObject, 0, arrayOfInt3, 0, i8);
      }
      this.d = arrayOfFloat1;
      this.e = arrayOfFloat2;
      this.f = arrayOfFloat3;
      this.g = arrayOfFloat4;
      this.h = arrayOfInt1;
      this.i = arrayOfInt2;
      this.j = arrayOfInt3;
    }
  }
  
  private void g()
  {
    VelocityTracker localVelocityTracker1 = this.l;
    float f1 = this.m;
    localVelocityTracker1.computeCurrentVelocity(1000, f1);
    localVelocityTracker1 = this.l;
    int i1 = this.c;
    float f2 = localVelocityTracker1.getXVelocity(i1);
    float f3 = this.n;
    f1 = this.m;
    f2 = a(f2, f3, f1);
    VelocityTracker localVelocityTracker2 = this.l;
    int i2 = this.c;
    f3 = localVelocityTracker2.getYVelocity(i2);
    f1 = this.n;
    float f4 = this.m;
    f3 = a(f3, f1, f4);
    a(f2, f3);
  }
  
  private boolean g(int paramInt)
  {
    boolean bool = b(paramInt);
    if (!bool)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Ignoring pointerId=").append(paramInt).append(" because ACTION_DOWN was not received ").append("for this pointer before ACTION_MOVE. It likely happened because ");
      String str = " ViewDragHelper did not receive all the events in the event stream.";
      localObject = str;
      Log.e("ViewDragHelper", (String)localObject);
    }
    for (bool = false;; bool = true) {
      return bool;
    }
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(float paramFloat)
  {
    this.n = paramFloat;
  }
  
  public void a(int paramInt)
  {
    this.p = paramInt;
  }
  
  public void a(View paramView, int paramInt)
  {
    Object localObject1 = paramView.getParent();
    Object localObject2 = this.u;
    if (localObject1 != localObject2)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
      ViewGroup localViewGroup = this.u;
      localObject2 = localViewGroup + ")";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.s = paramView;
    this.c = paramInt;
    this.r.b(paramView, paramInt);
    c(1);
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    boolean bool = this.t;
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
      throw ((Throwable)localObject);
    }
    Object localObject = this.l;
    int i2 = this.c;
    int i1 = (int)((VelocityTracker)localObject).getXVelocity(i2);
    VelocityTracker localVelocityTracker = this.l;
    int i3 = this.c;
    i2 = (int)localVelocityTracker.getYVelocity(i3);
    return a(paramInt1, paramInt2, i1, i2);
  }
  
  public boolean a(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionMasked();
    int i5 = paramMotionEvent.getActionIndex();
    if (i1 == 0) {
      e();
    }
    Object localObject1 = this.l;
    if (localObject1 == null)
    {
      localObject1 = VelocityTracker.obtain();
      this.l = ((VelocityTracker)localObject1);
    }
    localObject1 = this.l;
    ((VelocityTracker)localObject1).addMovement(paramMotionEvent);
    float f1;
    float f2;
    switch (i1)
    {
    case 4: 
    default: 
      i1 = this.a;
      i5 = 1;
      f1 = Float.MIN_VALUE;
      if (i1 == i5)
      {
        i1 = 1;
        f2 = Float.MIN_VALUE;
      }
      break;
    }
    for (;;)
    {
      return i1;
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      float f3 = 0.0F;
      localObject1 = null;
      int i7 = paramMotionEvent.getPointerId(0);
      a(f2, f1, i7);
      int i2 = (int)f2;
      int i6 = (int)f1;
      Object localObject2 = d(i2, i6);
      Object localObject3 = this.s;
      if (localObject2 == localObject3)
      {
        i6 = this.a;
        i8 = 2;
        if (i6 == i8) {
          b((View)localObject2, i7);
        }
      }
      localObject2 = this.h;
      i2 = localObject2[i7];
      i6 = this.p & i2;
      if (i6 == 0) {
        break;
      }
      localObject3 = this.r;
      int i8 = this.p;
      i2 &= i8;
      ((q.a)localObject3).a(i2, i7);
      break;
      i2 = paramMotionEvent.getPointerId(i6);
      f3 = paramMotionEvent.getX(i6);
      f1 = paramMotionEvent.getY(i6);
      a(f3, f1, i2);
      i8 = this.a;
      if (i8 == 0)
      {
        localObject3 = this.h;
        i6 = localObject3[i2];
        i7 = this.p & i6;
        if (i7 == 0) {
          break;
        }
        localObject1 = this.r;
        i8 = this.p;
        i6 &= i8;
        ((q.a)localObject1).a(i6, i2);
        break;
      }
      i8 = this.a;
      int i9 = 2;
      float f4 = 2.8E-45F;
      if (i8 != i9) {
        break;
      }
      i7 = (int)f3;
      i6 = (int)f1;
      localObject3 = d(i7, i6);
      localObject1 = this.s;
      if (localObject3 != localObject1) {
        break;
      }
      b((View)localObject3, i2);
      break;
      localObject2 = this.d;
      if (localObject2 == null) {
        break;
      }
      localObject2 = this.e;
      if (localObject2 == null) {
        break;
      }
      i7 = paramMotionEvent.getPointerCount();
      i2 = 0;
      f2 = 0.0F;
      localObject2 = null;
      i6 = 0;
      localObject3 = null;
      f1 = 0.0F;
      label479:
      float f5;
      float f6;
      View localView;
      boolean bool2;
      while (i6 < i7)
      {
        i8 = paramMotionEvent.getPointerId(i6);
        boolean bool1 = g(i8);
        int i3;
        if (!bool1)
        {
          i3 = i6 + 1;
          i6 = i3;
        }
        else
        {
          f2 = paramMotionEvent.getX(i6);
          f4 = paramMotionEvent.getY(i6);
          float[] arrayOfFloat1 = this.d;
          f5 = arrayOfFloat1[i8];
          f5 = f2 - f5;
          float[] arrayOfFloat2 = this.e;
          f6 = arrayOfFloat2[i8];
          f6 = f4 - f6;
          i3 = (int)f2;
          i9 = (int)f4;
          localView = d(i3, i9);
          if (localView == null) {
            break label740;
          }
          bool2 = a(localView, f5, f6);
          if (!bool2) {
            break label740;
          }
          bool2 = true;
          f2 = Float.MIN_VALUE;
          label586:
          if (!bool2) {
            break label751;
          }
          int i10 = localView.getLeft();
          int i11 = (int)f5 + i10;
          q.a locala1 = this.r;
          int i12 = (int)f5;
          i11 = locala1.b(localView, i11, i12);
          int i13 = localView.getTop();
          i12 = (int)f6 + i13;
          q.a locala2 = this.r;
          int i14 = (int)f6;
          i12 = locala2.a(localView, i12, i14);
          locala2 = this.r;
          int i15 = locala2.b(localView);
          q.a locala3 = this.r;
          i14 = locala3.a(localView);
          if (((i15 != 0) && ((i15 <= 0) || (i11 != i10))) || ((i14 != 0) && ((i14 <= 0) || (i12 != i13)))) {
            break label751;
          }
        }
      }
      for (;;)
      {
        c(paramMotionEvent);
        break;
        label740:
        bool2 = false;
        f2 = 0.0F;
        localObject2 = null;
        break label586;
        label751:
        b(f5, f6, i8);
        int i16 = this.a;
        int i17 = 1;
        f6 = Float.MIN_VALUE;
        if (i16 != i17)
        {
          if (!bool2) {
            break label479;
          }
          bool2 = b(localView, i8);
          if (!bool2) {
            break label479;
          }
        }
      }
      int i4 = paramMotionEvent.getPointerId(i6);
      e(i4);
      break;
      e();
      break;
      i4 = 0;
      f2 = 0.0F;
      localObject2 = null;
    }
  }
  
  public boolean a(View paramView, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    View localView = null;
    this.s = paramView;
    this.c = -1;
    boolean bool = a(paramInt1, paramInt2, 0, 0);
    if (!bool)
    {
      i1 = this.a;
      if (i1 == 0)
      {
        localView = this.s;
        if (localView != null)
        {
          i1 = 0;
          localView = null;
          this.s = null;
        }
      }
    }
    return bool;
  }
  
  public boolean a(boolean paramBoolean)
  {
    int i1 = 2;
    int i2 = this.a;
    boolean bool;
    Object localObject1;
    Object localObject2;
    if (i2 == i1)
    {
      bool = this.q.computeScrollOffset();
      int i4 = this.q.getCurrX();
      int i5 = this.q.getCurrY();
      i2 = this.s.getLeft();
      int i6 = i4 - i2;
      localObject1 = this.s;
      i2 = ((View)localObject1).getTop();
      int i7 = i5 - i2;
      if (i6 != 0)
      {
        localObject1 = this.s;
        r.d((View)localObject1, i6);
      }
      if (i7 != 0)
      {
        localObject1 = this.s;
        r.c((View)localObject1, i7);
      }
      if ((i6 != 0) || (i7 != 0))
      {
        localObject1 = this.r;
        localObject2 = this.s;
        ((q.a)localObject1).a((View)localObject2, i4, i5, i6, i7);
      }
      if (!bool) {
        break label255;
      }
      localObject1 = this.q;
      i2 = ((OverScroller)localObject1).getFinalX();
      if (i4 != i2) {
        break label255;
      }
      localObject1 = this.q;
      i2 = ((OverScroller)localObject1).getFinalY();
      if (i5 != i2) {
        break label255;
      }
      this.q.abortAnimation();
      i2 = 0;
      localObject1 = null;
    }
    for (;;)
    {
      if (i2 == 0)
      {
        if (paramBoolean)
        {
          localObject1 = this.u;
          localObject2 = this.w;
          ((ViewGroup)localObject1).post((Runnable)localObject2);
        }
      }
      else
      {
        i2 = this.a;
        if (i2 != i1) {
          break label247;
        }
        i2 = 1;
      }
      for (;;)
      {
        return i2;
        c(0);
        break;
        label247:
        i3 = 0;
        localObject1 = null;
      }
      label255:
      int i3 = bool;
    }
  }
  
  public int b()
  {
    return this.o;
  }
  
  public void b(MotionEvent paramMotionEvent)
  {
    int i1 = -1;
    float f1 = 0.0F / 0.0F;
    int i3 = 0;
    float f2 = 0.0F;
    Object localObject1 = null;
    int i4 = 0;
    float f3 = 0.0F;
    int i6 = 1;
    int i7 = paramMotionEvent.getActionMasked();
    int i9 = paramMotionEvent.getActionIndex();
    if (i7 == 0) {
      e();
    }
    VelocityTracker localVelocityTracker = this.l;
    if (localVelocityTracker == null)
    {
      localVelocityTracker = VelocityTracker.obtain();
      this.l = localVelocityTracker;
    }
    localVelocityTracker = this.l;
    localVelocityTracker.addMovement(paramMotionEvent);
    int i2;
    int i5;
    label592:
    Object localObject4;
    float f7;
    label688:
    int i10;
    int i8;
    switch (i7)
    {
    case 4: 
    default: 
    case 0: 
    case 5: 
    case 2: 
      int i11;
      View localView;
      for (;;)
      {
        return;
        f1 = paramMotionEvent.getX();
        float f4 = paramMotionEvent.getY();
        i4 = paramMotionEvent.getPointerId(0);
        i9 = (int)f1;
        i11 = (int)f4;
        localView = d(i9, i11);
        a(f1, f4, i4);
        b(localView, i4);
        Object localObject2 = this.h;
        i1 = localObject2[i4];
        i7 = this.p & i1;
        if (i7 != 0)
        {
          Object localObject3 = this.r;
          i9 = this.p;
          i1 &= i9;
          ((q.a)localObject3).a(i1, i4);
          continue;
          i4 = paramMotionEvent.getPointerId(i9);
          f1 = paramMotionEvent.getX(i9);
          f4 = paramMotionEvent.getY(i9);
          a(f1, f4, i4);
          i9 = this.a;
          if (i9 == 0)
          {
            i1 = (int)f1;
            i7 = (int)f4;
            localObject2 = d(i1, i7);
            b((View)localObject2, i4);
            localObject2 = this.h;
            i1 = localObject2[i4];
            i7 = this.p & i1;
            if (i7 != 0)
            {
              localObject3 = this.r;
              i9 = this.p;
              i1 &= i9;
              ((q.a)localObject3).a(i1, i4);
            }
          }
          else
          {
            i1 = (int)f1;
            i7 = (int)f4;
            boolean bool1 = c(i1, i7);
            if (bool1)
            {
              localObject2 = this.s;
              b((View)localObject2, i4);
              continue;
              i2 = this.a;
              if (i2 != i6) {
                break;
              }
              i4 = this.c;
              boolean bool2 = g(i4);
              if (bool2)
              {
                i5 = this.c;
                i5 = paramMotionEvent.findPointerIndex(i5);
                f1 = paramMotionEvent.getX(i5);
                f3 = paramMotionEvent.getY(i5);
                localObject3 = this.f;
                i9 = this.c;
                f4 = localObject3[i9];
                f1 -= f4;
                i2 = (int)f1;
                localObject3 = this.g;
                i9 = this.c;
                f4 = localObject3[i9];
                f3 -= f4;
                i5 = (int)f3;
                localObject3 = this.s;
                i7 = ((View)localObject3).getLeft() + i2;
                localView = this.s;
                i9 = localView.getTop() + i5;
                b(i7, i9, i2, i5);
                c(paramMotionEvent);
              }
            }
          }
        }
      }
      i2 = paramMotionEvent.getPointerCount();
      float f5;
      float f6;
      while (i5 < i2)
      {
        i7 = paramMotionEvent.getPointerId(i5);
        boolean bool4 = g(i7);
        if (!bool4)
        {
          i5 += 1;
        }
        else
        {
          f5 = paramMotionEvent.getX(i5);
          f6 = paramMotionEvent.getY(i5);
          localObject1 = this.d;
          f2 = localObject1[i7];
          f2 = f5 - f2;
          localObject4 = this.e;
          f7 = localObject4[i7];
          f7 = f6 - f7;
          b(f2, f7, i7);
          int i13 = this.a;
          if (i13 != i6) {
            break label688;
          }
        }
      }
      for (;;)
      {
        c(paramMotionEvent);
        break;
        i10 = (int)f5;
        i11 = (int)f6;
        localView = d(i10, i11);
        boolean bool5 = a(localView, f2, f7);
        if (!bool5) {
          break label592;
        }
        boolean bool3 = b(localView, i7);
        if (!bool3) {
          break label592;
        }
      }
    case 6: 
      i8 = paramMotionEvent.getPointerId(i10);
      i10 = this.a;
      if (i10 == i6)
      {
        i10 = this.c;
        if (i8 == i10)
        {
          i10 = paramMotionEvent.getPointerCount();
          if (i5 >= i10) {
            break label965;
          }
          int i12 = paramMotionEvent.getPointerId(i5);
          i3 = this.c;
          if (i12 == i3) {}
          boolean bool6;
          do
          {
            do
            {
              i5 += 1;
              break;
              f2 = paramMotionEvent.getX(i5);
              f7 = paramMotionEvent.getY(i5);
              i3 = (int)f2;
              int i14 = (int)f7;
              localObject1 = d(i3, i14);
              localObject4 = this.s;
            } while (localObject1 != localObject4);
            localObject1 = this.s;
            bool6 = b((View)localObject1, i12);
          } while (!bool6);
          i5 = this.c;
        }
      }
      break;
    }
    for (;;)
    {
      if (i5 == i2) {
        g();
      }
      e(i8);
      break;
      i5 = this.a;
      if (i5 == i6) {
        g();
      }
      e();
      break;
      i5 = this.a;
      if (i5 == i6) {
        a(0.0F, 0.0F);
      }
      e();
      break;
      label965:
      i5 = i2;
      f3 = f1;
    }
  }
  
  public boolean b(int paramInt)
  {
    int i1 = 1;
    int i2 = this.k;
    int i3 = i1 << paramInt;
    i2 &= i3;
    if (i2 != 0) {}
    for (;;)
    {
      return i1;
      i1 = 0;
    }
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = b(paramInt2);
    if (!bool1)
    {
      i1 = 0;
      f1 = 0.0F;
    }
    for (;;)
    {
      return i1;
      int i2 = paramInt1 & 0x1;
      int i4;
      float f2;
      label43:
      int i3;
      int i6;
      float f3;
      if (i2 == i1)
      {
        i4 = i1;
        f2 = f1;
        i3 = paramInt1 & 0x2;
        i6 = 2;
        f3 = 2.8E-45F;
        if (i3 != i6) {
          break label211;
        }
        i3 = i1;
      }
      float f5;
      int i5;
      boolean bool2;
      for (float f4 = f1;; f4 = 0.0F)
      {
        float[] arrayOfFloat1 = this.f;
        f3 = arrayOfFloat1[paramInt2];
        f5 = this.d[paramInt2];
        f3 -= f5;
        float[] arrayOfFloat2 = this.g;
        f5 = arrayOfFloat2[paramInt2];
        float[] arrayOfFloat3 = this.e;
        float f6 = arrayOfFloat3[paramInt2];
        f5 -= f6;
        if ((i4 == 0) || (i3 == 0)) {
          break label220;
        }
        f4 = f3 * f3;
        f2 = f5 * f5;
        f4 += f2;
        i5 = this.b;
        i6 = this.b;
        i5 *= i6;
        f2 = i5;
        bool2 = f4 < f2;
        if (bool2) {
          break;
        }
        i1 = 0;
        f1 = 0.0F;
        break;
        i5 = 0;
        f2 = 0.0F;
        break label43;
        label211:
        bool2 = false;
      }
      label220:
      if (i5 != 0)
      {
        f4 = Math.abs(f3);
        i5 = this.b;
        f2 = i5;
        bool2 = f4 < f2;
        if (!bool2)
        {
          i1 = 0;
          f1 = 0.0F;
        }
      }
      else if (bool2)
      {
        f4 = Math.abs(f5);
        i5 = this.b;
        f2 = i5;
        bool2 = f4 < f2;
        if (!bool2)
        {
          i1 = 0;
          f1 = 0.0F;
        }
      }
      else
      {
        i1 = 0;
        f1 = 0.0F;
      }
    }
  }
  
  boolean b(View paramView, int paramInt)
  {
    boolean bool1 = true;
    Object localObject = this.s;
    if (paramView == localObject)
    {
      int i1 = this.c;
      if (i1 != paramInt) {}
    }
    for (;;)
    {
      return bool1;
      if (paramView != null)
      {
        localObject = this.r;
        boolean bool2 = ((q.a)localObject).a(paramView, paramInt);
        if (bool2)
        {
          this.c = paramInt;
          a(paramView, paramInt);
          continue;
        }
      }
      bool1 = false;
    }
  }
  
  public boolean b(View paramView, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    if (paramView == null) {}
    for (;;)
    {
      return bool;
      int i1 = paramView.getLeft();
      if (paramInt1 >= i1)
      {
        i1 = paramView.getRight();
        if (paramInt1 < i1)
        {
          i1 = paramView.getTop();
          if (paramInt2 >= i1)
          {
            i1 = paramView.getBottom();
            if (paramInt2 < i1) {
              bool = true;
            }
          }
        }
      }
    }
  }
  
  public View c()
  {
    return this.s;
  }
  
  void c(int paramInt)
  {
    Object localObject = this.u;
    Runnable localRunnable = this.w;
    ((ViewGroup)localObject).removeCallbacks(localRunnable);
    int i1 = this.a;
    if (i1 != paramInt)
    {
      this.a = paramInt;
      localObject = this.r;
      ((q.a)localObject).a(paramInt);
      i1 = this.a;
      if (i1 == 0)
      {
        i1 = 0;
        localObject = null;
        this.s = null;
      }
    }
  }
  
  public boolean c(int paramInt1, int paramInt2)
  {
    View localView = this.s;
    return b(localView, paramInt1, paramInt2);
  }
  
  public int d()
  {
    return this.b;
  }
  
  public View d(int paramInt1, int paramInt2)
  {
    Object localObject = this.u;
    int i1 = ((ViewGroup)localObject).getChildCount() + -1;
    int i2 = i1;
    if (i2 >= 0)
    {
      localObject = this.u;
      q.a locala = this.r;
      int i3 = locala.c(i2);
      localObject = ((ViewGroup)localObject).getChildAt(i3);
      i3 = ((View)localObject).getLeft();
      if (paramInt1 >= i3)
      {
        i3 = ((View)localObject).getRight();
        if (paramInt1 < i3)
        {
          i3 = ((View)localObject).getTop();
          if (paramInt2 >= i3)
          {
            i3 = ((View)localObject).getBottom();
            if (paramInt2 >= i3) {}
          }
        }
      }
    }
    for (;;)
    {
      return (View)localObject;
      i1 = i2 + -1;
      i2 = i1;
      break;
      i1 = 0;
      localObject = null;
    }
  }
  
  public boolean d(int paramInt)
  {
    boolean bool1 = false;
    int i1 = this.d.length;
    int i2 = 0;
    for (;;)
    {
      if (i2 < i1)
      {
        boolean bool2 = b(paramInt, i2);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i2 += 1;
    }
  }
  
  public void e()
  {
    int i1 = -1;
    this.c = i1;
    f();
    VelocityTracker localVelocityTracker = this.l;
    if (localVelocityTracker != null)
    {
      this.l.recycle();
      i1 = 0;
      localVelocityTracker = null;
      this.l = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */