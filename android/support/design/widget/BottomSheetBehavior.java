package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.design.a.d;
import android.support.design.a.k;
import android.support.v4.view.r;
import android.support.v4.widget.q;
import android.support.v4.widget.q.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior
  extends CoordinatorLayout.b
{
  int a;
  int b;
  boolean c;
  int d;
  q e;
  int f;
  WeakReference g;
  WeakReference h;
  int i;
  boolean j;
  private float k;
  private int l;
  private boolean m;
  private int n;
  private boolean o;
  private boolean p;
  private int q;
  private boolean r;
  private BottomSheetBehavior.a s;
  private VelocityTracker t;
  private int u;
  private final q.a v;
  
  public BottomSheetBehavior()
  {
    this.d = 4;
    BottomSheetBehavior.1 local1 = new android/support/design/widget/BottomSheetBehavior$1;
    local1.<init>(this);
    this.v = local1;
  }
  
  public BottomSheetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i2 = 4;
    float f1 = 5.6E-45F;
    this.d = i2;
    Object localObject = new android/support/design/widget/BottomSheetBehavior$1;
    ((BottomSheetBehavior.1)localObject).<init>(this);
    this.v = ((q.a)localObject);
    localObject = a.k.BottomSheetBehavior_Layout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i3 = a.k.BottomSheetBehavior_Layout_behavior_peekHeight;
    TypedValue localTypedValue = ((TypedArray)localObject).peekValue(i3);
    if (localTypedValue != null)
    {
      int i6 = localTypedValue.data;
      if (i6 == i1)
      {
        i3 = localTypedValue.data;
        a(i3);
      }
    }
    for (;;)
    {
      i3 = a.k.BottomSheetBehavior_Layout_behavior_hideable;
      boolean bool1 = ((TypedArray)localObject).getBoolean(i3, false);
      a(bool1);
      int i4 = a.k.BottomSheetBehavior_Layout_behavior_skipCollapsed;
      boolean bool2 = ((TypedArray)localObject).getBoolean(i4, false);
      b(bool2);
      ((TypedArray)localObject).recycle();
      f1 = ViewConfiguration.get(paramContext).getScaledMaximumFlingVelocity();
      this.k = f1;
      return;
      int i5 = a.k.BottomSheetBehavior_Layout_behavior_peekHeight;
      i5 = ((TypedArray)localObject).getDimensionPixelSize(i5, i1);
      a(i5);
    }
  }
  
  private void a()
  {
    int i1 = -1;
    this.i = i1;
    VelocityTracker localVelocityTracker = this.t;
    if (localVelocityTracker != null)
    {
      this.t.recycle();
      i1 = 0;
      localVelocityTracker = null;
      this.t = null;
    }
  }
  
  private float b()
  {
    VelocityTracker localVelocityTracker = this.t;
    float f1 = this.k;
    localVelocityTracker.computeCurrentVelocity(1000, f1);
    localVelocityTracker = this.t;
    int i1 = this.i;
    return localVelocityTracker.getYVelocity(i1);
  }
  
  View a(View paramView)
  {
    boolean bool = r.u(paramView);
    if (bool) {}
    for (;;)
    {
      return paramView;
      bool = paramView instanceof ViewGroup;
      if (bool)
      {
        paramView = (ViewGroup)paramView;
        bool = false;
        View localView = null;
        int i2 = paramView.getChildCount();
        int i1;
        for (int i3 = 0;; i3 = i1)
        {
          if (i3 >= i2) {
            break label78;
          }
          localView = paramView.getChildAt(i3);
          localView = a(localView);
          if (localView != null)
          {
            paramView = localView;
            break;
          }
          i1 = i3 + 1;
        }
      }
      label78:
      paramView = null;
    }
  }
  
  public final void a(int paramInt)
  {
    int i1 = 1;
    int i2 = 0;
    int i3 = -1;
    boolean bool;
    if (paramInt == i3)
    {
      bool = this.m;
      if (bool) {
        break label133;
      }
      this.m = i1;
    }
    for (;;)
    {
      if (i1 != 0)
      {
        i1 = this.d;
        i2 = 4;
        if (i1 == i2)
        {
          localObject = this.g;
          if (localObject != null)
          {
            localObject = (View)this.g.get();
            if (localObject != null) {
              ((View)localObject).requestLayout();
            }
          }
        }
      }
      return;
      bool = this.m;
      if (!bool)
      {
        int i4 = this.l;
        if (i4 == paramInt) {}
      }
      else
      {
        this.m = false;
        i2 = Math.max(0, paramInt);
        this.l = i2;
        i2 = this.f - paramInt;
        this.b = i2;
        continue;
      }
      label133:
      i1 = 0;
      Object localObject = null;
    }
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView, Parcelable paramParcelable)
  {
    paramParcelable = (BottomSheetBehavior.SavedState)paramParcelable;
    Parcelable localParcelable = paramParcelable.getSuperState();
    super.a(paramCoordinatorLayout, paramView, localParcelable);
    int i1 = paramParcelable.a;
    int i2 = 1;
    if (i1 != i2)
    {
      i1 = paramParcelable.a;
      i2 = 2;
      if (i1 != i2) {}
    }
    else
    {
      i1 = 4;
    }
    for (this.d = i1;; this.d = i1)
    {
      return;
      i1 = paramParcelable.a;
    }
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int i1 = 1;
    View localView = (View)this.h.get();
    if (paramView2 != localView) {
      return;
    }
    int i2 = paramView1.getTop();
    int i3 = i2 - paramInt2;
    if (paramInt2 > 0)
    {
      int i5 = this.a;
      if (i3 < i5)
      {
        i3 = this.a;
        i2 -= i3;
        paramArrayOfInt[i1] = i2;
        i2 = -paramArrayOfInt[i1];
        r.c(paramView1, i2);
        i2 = 3;
        b(i2);
      }
    }
    for (;;)
    {
      i2 = paramView1.getTop();
      c(i2);
      this.q = paramInt2;
      this.r = i1;
      break;
      paramArrayOfInt[i1] = paramInt2;
      i2 = -paramInt2;
      r.c(paramView1, i2);
      b(i1);
      continue;
      if (paramInt2 < 0)
      {
        boolean bool2 = paramView2.canScrollVertically(-1);
        if (!bool2)
        {
          int i6 = this.b;
          if (i3 > i6)
          {
            boolean bool1 = this.c;
            if (!bool1) {}
          }
          else
          {
            paramArrayOfInt[i1] = paramInt2;
            i2 = -paramInt2;
            r.c(paramView1, i2);
            b(i1);
            continue;
          }
          int i4 = this.b;
          i2 -= i4;
          paramArrayOfInt[i1] = i2;
          i2 = -paramArrayOfInt[i1];
          r.c(paramView1, i2);
          i2 = 4;
          b(i2);
        }
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    int i1 = 1;
    boolean bool1 = r.p(paramCoordinatorLayout);
    if (bool1)
    {
      bool1 = r.p(paramView);
      if (!bool1) {
        r.b(paramView, i1);
      }
    }
    int i6 = paramView.getTop();
    paramCoordinatorLayout.a(paramView, paramInt);
    int i2 = paramCoordinatorLayout.getHeight();
    this.f = i2;
    boolean bool2 = this.m;
    int i3;
    Object localObject;
    int i7;
    if (bool2)
    {
      i3 = this.n;
      if (i3 == 0)
      {
        localObject = paramCoordinatorLayout.getResources();
        i7 = a.d.design_bottom_sheet_peek_height_min;
        i3 = ((Resources)localObject).getDimensionPixelSize(i7);
        this.n = i3;
      }
      i3 = this.n;
      i7 = this.f;
      int i10 = paramCoordinatorLayout.getWidth() * 9 / 16;
      i7 -= i10;
      i3 = Math.max(i3, i7);
      int i11 = this.f;
      int i12 = paramView.getHeight();
      i11 -= i12;
      i7 = Math.max(0, i11);
      this.a = i7;
      i3 = this.f - i3;
      i7 = this.a;
      i3 = Math.max(i3, i7);
      this.b = i3;
      i3 = this.d;
      i7 = 3;
      if (i3 != i7) {
        break label319;
      }
      i3 = this.a;
      r.c(paramView, i3);
    }
    for (;;)
    {
      localObject = this.e;
      if (localObject == null)
      {
        localObject = this.v;
        localObject = q.a(paramCoordinatorLayout, (q.a)localObject);
        this.e = ((q)localObject);
      }
      localObject = new java/lang/ref/WeakReference;
      ((WeakReference)localObject).<init>(paramView);
      this.g = ((WeakReference)localObject);
      localObject = new java/lang/ref/WeakReference;
      View localView = a(paramView);
      ((WeakReference)localObject).<init>(localView);
      this.h = ((WeakReference)localObject);
      return i1;
      i3 = this.l;
      break;
      label319:
      boolean bool3 = this.c;
      if (bool3)
      {
        i4 = this.d;
        i7 = 5;
        if (i4 == i7)
        {
          i4 = this.f;
          r.c(paramView, i4);
          continue;
        }
      }
      int i4 = this.d;
      int i8 = 4;
      if (i4 == i8)
      {
        i4 = this.b;
        r.c(paramView, i4);
      }
      else
      {
        i4 = this.d;
        int i5;
        if (i4 != i1)
        {
          i5 = this.d;
          int i9 = 2;
          if (i5 != i9) {}
        }
        else
        {
          i5 = paramView.getTop();
          i5 = i6 - i5;
          r.c(paramView, i5);
        }
      }
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    int i1 = -1;
    int i2 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = false;
    boolean bool2 = paramView.isShown();
    if (!bool2) {
      this.p = i2;
    }
    int i5;
    for (;;)
    {
      return bool1;
      i5 = paramMotionEvent.getActionMasked();
      if (i5 == 0) {
        a();
      }
      localObject = this.t;
      if (localObject == null)
      {
        localObject = VelocityTracker.obtain();
        this.t = ((VelocityTracker)localObject);
      }
      localObject = this.t;
      ((VelocityTracker)localObject).addMovement(paramMotionEvent);
      switch (i5)
      {
      case 2: 
      default: 
      case 1: 
      case 3: 
        do
        {
          bool2 = this.p;
          if (bool2) {
            break label360;
          }
          localObject = this.e;
          bool2 = ((q)localObject).a(paramMotionEvent);
          if (!bool2) {
            break label360;
          }
          bool1 = i2;
          break;
          this.j = false;
          this.i = i1;
          bool2 = this.p;
        } while (!bool2);
        this.p = false;
      }
    }
    int i7 = (int)paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    int i3 = (int)f2;
    this.u = i3;
    Object localObject = this.h;
    label230:
    boolean bool4;
    if (localObject != null)
    {
      localObject = (View)this.h.get();
      if (localObject != null)
      {
        int i8 = this.u;
        boolean bool3 = paramCoordinatorLayout.a((View)localObject, i7, i8);
        if (bool3)
        {
          i4 = paramMotionEvent.getActionIndex();
          i4 = paramMotionEvent.getPointerId(i4);
          this.i = i4;
          this.j = i2;
        }
      }
      int i4 = this.i;
      if (i4 != i1) {
        break label348;
      }
      i4 = this.u;
      bool4 = paramCoordinatorLayout.a(paramView, i7, i4);
      if (bool4) {
        break label348;
      }
      bool4 = i2;
    }
    for (f2 = f1;; f2 = 0.0F)
    {
      this.p = bool4;
      break;
      bool4 = false;
      f2 = 0.0F;
      localObject = null;
      break label230;
      label348:
      bool4 = false;
      localObject = null;
    }
    label360:
    localObject = (View)this.h.get();
    i7 = 2;
    float f3 = 2.8E-45F;
    if ((i5 == i7) && (localObject != null))
    {
      boolean bool5 = this.p;
      if (!bool5)
      {
        int i6 = this.d;
        if (i6 != i2)
        {
          float f4 = paramMotionEvent.getX();
          i6 = (int)f4;
          f3 = paramMotionEvent.getY();
          i7 = (int)f3;
          bool4 = paramCoordinatorLayout.a((View)localObject, i6, i7);
          if (!bool4)
          {
            f2 = this.u;
            f4 = paramMotionEvent.getY();
            f2 = Math.abs(f2 - f4);
            q localq = this.e;
            i6 = localq.d();
            f4 = i6;
            bool4 = f2 < f4;
            if (!bool4) {}
          }
        }
      }
    }
    for (;;)
    {
      bool1 = i2;
      break;
      i2 = 0;
      f1 = 0.0F;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, float paramFloat1, float paramFloat2)
  {
    Object localObject = this.h.get();
    boolean bool;
    if (paramView2 == localObject)
    {
      int i1 = this.d;
      int i2 = 3;
      if (i1 == i2)
      {
        bool = super.a(paramCoordinatorLayout, paramView1, paramView2, paramFloat1, paramFloat2);
        if (!bool) {}
      }
      else
      {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, View paramView3, int paramInt)
  {
    boolean bool = false;
    this.q = 0;
    this.r = false;
    int i1 = paramInt & 0x2;
    if (i1 != 0) {
      bool = true;
    }
    return bool;
  }
  
  boolean a(View paramView, float paramFloat)
  {
    boolean bool1 = true;
    boolean bool2 = this.o;
    if (bool2) {}
    for (;;)
    {
      return bool1;
      int i1 = paramView.getTop();
      int i2 = this.b;
      if (i1 < i2)
      {
        bool1 = false;
      }
      else
      {
        float f1 = paramView.getTop();
        float f2 = 0.1F * paramFloat;
        f1 += f2;
        f2 = this.b;
        f1 = Math.abs(f1 - f2);
        f2 = this.l;
        f1 /= f2;
        i2 = 1056964608;
        f2 = 0.5F;
        boolean bool3 = f1 < f2;
        if (!bool3) {
          bool1 = false;
        }
      }
    }
  }
  
  public Parcelable b(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    BottomSheetBehavior.SavedState localSavedState = new android/support/design/widget/BottomSheetBehavior$SavedState;
    Parcelable localParcelable = super.b(paramCoordinatorLayout, paramView);
    int i1 = this.d;
    localSavedState.<init>(localParcelable, i1);
    return localSavedState;
  }
  
  void b(int paramInt)
  {
    int i1 = this.d;
    if (i1 == paramInt) {}
    for (;;)
    {
      return;
      this.d = paramInt;
      View localView = (View)this.g.get();
      if (localView != null)
      {
        BottomSheetBehavior.a locala = this.s;
        if (locala != null)
        {
          locala = this.s;
          locala.a(localView, paramInt);
        }
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    boolean bool1 = paramView.isShown();
    if (!bool1) {
      i1 = 0;
    }
    for (;;)
    {
      return i1;
      int i2 = paramMotionEvent.getActionMasked();
      int i3 = this.d;
      if ((i3 != i1) || (i2 != 0))
      {
        Object localObject = this.e;
        if (localObject != null)
        {
          localObject = this.e;
          ((q)localObject).b(paramMotionEvent);
        }
        if (i2 == 0) {
          a();
        }
        localObject = this.t;
        if (localObject == null)
        {
          localObject = VelocityTracker.obtain();
          this.t = ((VelocityTracker)localObject);
        }
        localObject = this.t;
        ((VelocityTracker)localObject).addMovement(paramMotionEvent);
        int i4 = 2;
        float f1 = 2.8E-45F;
        if (i2 == i4)
        {
          bool2 = this.p;
          if (!bool2)
          {
            float f2 = this.u;
            f1 = paramMotionEvent.getY();
            f2 = Math.abs(f2 - f1);
            localObject = this.e;
            i4 = ((q)localObject).d();
            f1 = i4;
            bool2 = f2 < f1;
            if (bool2)
            {
              q localq = this.e;
              i4 = paramMotionEvent.getActionIndex();
              i4 = paramMotionEvent.getPointerId(i4);
              localq.a(paramView, i4);
            }
          }
        }
        boolean bool2 = this.p;
        if (bool2) {
          i1 = 0;
        }
      }
    }
  }
  
  void c(int paramInt)
  {
    View localView = (View)this.g.get();
    BottomSheetBehavior.a locala;
    int i2;
    float f1;
    int i3;
    int i4;
    float f2;
    if (localView != null)
    {
      locala = this.s;
      if (locala != null)
      {
        int i1 = this.b;
        if (paramInt <= i1) {
          break label93;
        }
        locala = this.s;
        i2 = this.b - paramInt;
        f1 = i2;
        i3 = this.f;
        i4 = this.b;
        i3 -= i4;
        f2 = i3;
        f1 /= f2;
        locala.a(localView, f1);
      }
    }
    for (;;)
    {
      return;
      label93:
      locala = this.s;
      i2 = this.b - paramInt;
      f1 = i2;
      i3 = this.b;
      i4 = this.a;
      i3 -= i4;
      f2 = i3;
      f1 /= f2;
      locala.a(localView, f1);
    }
  }
  
  public void c(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    int i1 = 4;
    int i3 = 3;
    int i4 = paramView1.getTop();
    int i7 = this.a;
    if (i4 == i7) {
      b(i3);
    }
    Object localObject;
    boolean bool2;
    do
    {
      do
      {
        do
        {
          return;
          localObject = this.h;
        } while (localObject == null);
        localObject = this.h.get();
      } while (paramView2 != localObject);
      bool2 = this.r;
    } while (!bool2);
    int i5 = this.q;
    label86:
    int i2;
    if (i5 > 0)
    {
      i1 = this.a;
      localObject = this.e;
      i7 = paramView1.getLeft();
      boolean bool1 = ((q)localObject).a(paramView1, i7, i1);
      if (!bool1) {
        break label305;
      }
      i2 = 2;
      b(i2);
      BottomSheetBehavior.b localb = new android/support/design/widget/BottomSheetBehavior$b;
      localb.<init>(this, paramView1, i3);
      r.a(paramView1, localb);
    }
    for (;;)
    {
      i3 = 0;
      this.r = false;
      break;
      boolean bool3 = this.c;
      if (bool3)
      {
        float f1 = b();
        bool3 = a(paramView1, f1);
        if (bool3)
        {
          i2 = this.f;
          i3 = 5;
          break label86;
        }
      }
      int i6 = this.q;
      if (i6 == 0)
      {
        i6 = paramView1.getTop();
        i7 = this.a;
        i7 = Math.abs(i6 - i7);
        int i8 = this.b;
        i6 = Math.abs(i6 - i8);
        if (i7 < i6)
        {
          i2 = this.a;
          break label86;
        }
        i3 = this.b;
        i9 = i2;
        i2 = i3;
        i3 = i9;
        break label86;
      }
      i3 = this.b;
      int i9 = i2;
      i2 = i3;
      i3 = i9;
      break label86;
      label305:
      b(i3);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\BottomSheetBehavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */