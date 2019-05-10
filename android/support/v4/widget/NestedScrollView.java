package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v4.view.a;
import android.support.v4.view.j;
import android.support.v4.view.k;
import android.support.v4.view.l;
import android.support.v4.view.n;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.List;

public class NestedScrollView
  extends FrameLayout
  implements j, l
{
  private static final NestedScrollView.a w;
  private static final int[] x;
  private float A;
  private NestedScrollView.b B;
  private long a;
  private final Rect b;
  private OverScroller c;
  private EdgeEffect d;
  private EdgeEffect e;
  private int f;
  private boolean g;
  private boolean h;
  private View i;
  private boolean j;
  private VelocityTracker k;
  private boolean l;
  private boolean m;
  private int n;
  private int o;
  private int p;
  private int q;
  private final int[] r;
  private final int[] s;
  private int t;
  private int u;
  private NestedScrollView.SavedState v;
  private final n y;
  private final k z;
  
  static
  {
    Object localObject = new android/support/v4/widget/NestedScrollView$a;
    ((NestedScrollView.a)localObject).<init>();
    w = (NestedScrollView.a)localObject;
    localObject = new int[1];
    localObject[0] = 16843130;
    x = (int[])localObject;
  }
  
  public NestedScrollView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.b = ((Rect)localObject);
    this.g = bool1;
    this.h = false;
    this.i = null;
    this.j = false;
    this.m = bool1;
    this.q = -1;
    localObject = new int[i1];
    this.r = ((int[])localObject);
    localObject = new int[i1];
    this.s = ((int[])localObject);
    a();
    localObject = x;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt, 0);
    boolean bool2 = ((TypedArray)localObject).getBoolean(0, false);
    setFillViewport(bool2);
    ((TypedArray)localObject).recycle();
    localObject = new android/support/v4/view/n;
    ((n)localObject).<init>(this);
    this.y = ((n)localObject);
    localObject = new android/support/v4/view/k;
    ((k)localObject).<init>(this);
    this.z = ((k)localObject);
    setNestedScrollingEnabled(bool1);
    localObject = w;
    r.a(this, (a)localObject);
  }
  
  private View a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = getFocusables(2);
    Object localObject1 = null;
    int i1 = 0;
    float f1 = 0.0F;
    int i2 = localArrayList.size();
    int i3 = 0;
    float f2 = 0.0F;
    View localView = null;
    int i4 = 0;
    int i5;
    int i6;
    int i7;
    float f3;
    label103:
    Object localObject2;
    if (i4 < i2)
    {
      localView = (View)localArrayList.get(i4);
      i5 = localView.getTop();
      i6 = localView.getBottom();
      if ((paramInt1 >= i6) || (i5 >= paramInt2)) {
        break label278;
      }
      if ((paramInt1 < i5) && (i6 < paramInt2))
      {
        i7 = 1;
        f3 = Float.MIN_VALUE;
        if (localObject1 != null) {
          break label153;
        }
        localObject2 = localView;
        i3 = i7;
        f2 = f3;
      }
    }
    for (;;)
    {
      i4 += 1;
      localObject1 = localObject2;
      i1 = i3;
      f1 = f2;
      break;
      i7 = 0;
      f3 = 0.0F;
      localObject2 = null;
      break label103;
      label153:
      if (paramBoolean)
      {
        int i8 = ((View)localObject1).getTop();
        if (i5 < i8) {}
      }
      else
      {
        if (paramBoolean) {
          break label222;
        }
        i5 = ((View)localObject1).getBottom();
        if (i6 <= i5) {
          break label222;
        }
      }
      label222:
      for (i5 = 1;; i5 = 0)
      {
        if (i1 == 0) {
          break label228;
        }
        if ((i7 == 0) || (i5 == 0)) {
          break label278;
        }
        localObject2 = localView;
        i3 = i1;
        f2 = f1;
        break;
      }
      label228:
      if (i7 != 0)
      {
        i7 = 1;
        f3 = Float.MIN_VALUE;
        localObject2 = localView;
        i3 = i7;
        f2 = f3;
      }
      else if (i5 != 0)
      {
        localObject2 = localView;
        i3 = i1;
        f2 = f1;
        continue;
        return (View)localObject1;
      }
      else
      {
        label278:
        i3 = i1;
        f2 = f1;
        localObject2 = localObject1;
      }
    }
  }
  
  private void a()
  {
    Object localObject = new android/widget/OverScroller;
    Context localContext = getContext();
    ((OverScroller)localObject).<init>(localContext);
    this.c = ((OverScroller)localObject);
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    localObject = ViewConfiguration.get(getContext());
    int i1 = ((ViewConfiguration)localObject).getScaledTouchSlop();
    this.n = i1;
    i1 = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
    this.o = i1;
    int i2 = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
    this.p = i2;
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionIndex();
    int i2 = paramMotionEvent.getPointerId(i1);
    int i3 = this.q;
    if (i2 == i3)
    {
      if (i1 != 0) {
        break label79;
      }
      i1 = 1;
    }
    for (;;)
    {
      float f1 = paramMotionEvent.getY(i1);
      i2 = (int)f1;
      this.f = i2;
      i1 = paramMotionEvent.getPointerId(i1);
      this.q = i1;
      VelocityTracker localVelocityTracker = this.k;
      if (localVelocityTracker != null)
      {
        localVelocityTracker = this.k;
        localVelocityTracker.clear();
      }
      return;
      label79:
      i1 = 0;
      localVelocityTracker = null;
    }
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 1;
    boolean bool = false;
    int i2 = getHeight();
    int i3 = getScrollY();
    int i4 = i3 + i2;
    i2 = 33;
    if (paramInt1 == i2) {
      i2 = i1;
    }
    for (;;)
    {
      Object localObject = a(i2, paramInt2, paramInt3);
      if (localObject == null) {
        localObject = this;
      }
      if ((paramInt2 < i3) || (paramInt3 > i4)) {
        break;
      }
      View localView = findFocus();
      if (localObject != localView) {
        ((View)localObject).requestFocus(paramInt1);
      }
      return bool;
      i2 = 0;
      localView = null;
    }
    if (i2 != 0) {}
    for (i2 = paramInt2 - i3;; i2 = paramInt3 - i4)
    {
      g(i2);
      bool = i1;
      break;
    }
  }
  
  private boolean a(Rect paramRect, boolean paramBoolean)
  {
    int i1 = a(paramRect);
    boolean bool;
    if (i1 != 0)
    {
      bool = true;
      if (bool)
      {
        if (!paramBoolean) {
          break label37;
        }
        scrollBy(0, i1);
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      break;
      label37:
      b(0, i1);
    }
  }
  
  private boolean a(View paramView)
  {
    boolean bool1 = false;
    int i1 = getHeight();
    boolean bool2 = a(paramView, 0, i1);
    if (!bool2) {
      bool1 = true;
    }
    return bool1;
  }
  
  private boolean a(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = this.b;
    paramView.getDrawingRect(localRect);
    localRect = this.b;
    offsetDescendantRectToMyCoords(paramView, localRect);
    localRect = this.b;
    int i1 = localRect.bottom + paramInt1;
    int i3 = getScrollY();
    if (i1 >= i3)
    {
      localRect = this.b;
      i1 = localRect.top - paramInt1;
      int i4 = getScrollY() + paramInt2;
      if (i1 <= i4) {
        i1 = 1;
      }
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      localRect = null;
    }
  }
  
  private static boolean a(View paramView1, View paramView2)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    if (paramView1 == paramView2) {
      return bool1;
    }
    Object localObject = paramView1.getParent();
    boolean bool2 = localObject instanceof ViewGroup;
    boolean bool3;
    float f2;
    if (bool2)
    {
      localObject = (View)localObject;
      bool3 = a((View)localObject, paramView2);
      if (bool3)
      {
        bool3 = bool1;
        f2 = f1;
      }
    }
    for (;;)
    {
      bool1 = bool3;
      f1 = f2;
      break;
      bool3 = false;
      f2 = 0.0F;
      localObject = null;
    }
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 >= paramInt3) || (paramInt1 < 0)) {
      paramInt1 = 0;
    }
    for (;;)
    {
      return paramInt1;
      int i1 = paramInt2 + paramInt1;
      if (i1 > paramInt3) {
        paramInt1 = paramInt3 - paramInt2;
      }
    }
  }
  
  private void b(View paramView)
  {
    Rect localRect = this.b;
    paramView.getDrawingRect(localRect);
    localRect = this.b;
    offsetDescendantRectToMyCoords(paramView, localRect);
    localRect = this.b;
    int i1 = a(localRect);
    if (i1 != 0) {
      scrollBy(0, i1);
    }
  }
  
  private boolean b()
  {
    boolean bool = false;
    View localView = getChildAt(0);
    if (localView != null)
    {
      int i1 = localView.getHeight();
      int i2 = getHeight();
      int i3 = getPaddingTop();
      i1 += i3;
      i3 = getPaddingBottom();
      i1 += i3;
      if (i2 < i1) {
        bool = true;
      }
    }
    return bool;
  }
  
  private void c()
  {
    VelocityTracker localVelocityTracker = this.k;
    if (localVelocityTracker == null)
    {
      localVelocityTracker = VelocityTracker.obtain();
      this.k = localVelocityTracker;
    }
    for (;;)
    {
      return;
      localVelocityTracker = this.k;
      localVelocityTracker.clear();
    }
  }
  
  private void d()
  {
    VelocityTracker localVelocityTracker = this.k;
    if (localVelocityTracker == null)
    {
      localVelocityTracker = VelocityTracker.obtain();
      this.k = localVelocityTracker;
    }
  }
  
  private boolean d(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    int i1 = getChildCount();
    if (i1 > 0)
    {
      i1 = getScrollY();
      View localView = getChildAt(0);
      int i2 = localView.getTop() - i1;
      if (paramInt2 >= i2)
      {
        i2 = localView.getBottom();
        i1 = i2 - i1;
        if (paramInt2 < i1)
        {
          i1 = localView.getLeft();
          if (paramInt1 >= i1)
          {
            i1 = localView.getRight();
            if (paramInt1 < i1) {
              bool = true;
            }
          }
        }
      }
    }
    return bool;
  }
  
  private void e()
  {
    VelocityTracker localVelocityTracker = this.k;
    if (localVelocityTracker != null)
    {
      this.k.recycle();
      localVelocityTracker = null;
      this.k = null;
    }
  }
  
  private void f()
  {
    this.j = false;
    e();
    a(0);
    EdgeEffect localEdgeEffect = this.d;
    if (localEdgeEffect != null)
    {
      this.d.onRelease();
      localEdgeEffect = this.e;
      localEdgeEffect.onRelease();
    }
  }
  
  private void g()
  {
    int i1 = getOverScrollMode();
    int i2 = 2;
    EdgeEffect localEdgeEffect;
    if (i1 != i2)
    {
      Object localObject = this.d;
      if (localObject == null)
      {
        localObject = getContext();
        localEdgeEffect = new android/widget/EdgeEffect;
        localEdgeEffect.<init>((Context)localObject);
        this.d = localEdgeEffect;
        localEdgeEffect = new android/widget/EdgeEffect;
        localEdgeEffect.<init>((Context)localObject);
      }
    }
    for (this.e = localEdgeEffect;; this.e = null)
    {
      return;
      this.d = null;
    }
  }
  
  private void g(int paramInt)
  {
    if (paramInt != 0)
    {
      boolean bool = this.m;
      if (!bool) {
        break label20;
      }
      b(0, paramInt);
    }
    for (;;)
    {
      return;
      label20:
      scrollBy(0, paramInt);
    }
  }
  
  private float getVerticalScrollFactorCompat()
  {
    float f1 = this.A;
    Object localObject1 = null;
    boolean bool1 = f1 < 0.0F;
    if (!bool1)
    {
      Object localObject2 = new android/util/TypedValue;
      ((TypedValue)localObject2).<init>();
      localObject1 = getContext();
      Resources.Theme localTheme = ((Context)localObject1).getTheme();
      int i1 = 16842829;
      boolean bool2 = true;
      boolean bool3 = localTheme.resolveAttribute(i1, (TypedValue)localObject2, bool2);
      if (!bool3)
      {
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>("Expected theme to define listPreferredItemHeight.");
        throw ((Throwable)localObject2);
      }
      localObject1 = ((Context)localObject1).getResources().getDisplayMetrics();
      f1 = ((TypedValue)localObject2).getDimension((DisplayMetrics)localObject1);
      this.A = f1;
    }
    return this.A;
  }
  
  private void h(int paramInt)
  {
    int i1 = getScrollY();
    if ((i1 > 0) || (paramInt > 0))
    {
      int i3 = getScrollRange();
      if ((i1 >= i3) && (paramInt >= 0)) {}
    }
    int i2;
    for (i1 = 1;; i2 = 0)
    {
      float f1 = paramInt;
      boolean bool = dispatchNestedPreFling(0.0F, f1);
      if (!bool)
      {
        f1 = paramInt;
        dispatchNestedFling(0.0F, f1, i1);
        f(paramInt);
      }
      return;
    }
  }
  
  protected int a(Rect paramRect)
  {
    int i1 = 0;
    View localView1 = null;
    int i2 = getChildCount();
    if (i2 == 0) {
      return i1;
    }
    int i3 = getHeight();
    i2 = getScrollY();
    int i4 = i2 + i3;
    int i5 = getVerticalFadingEdgeLength();
    int i6 = paramRect.top;
    if (i6 > 0) {
      i2 += i5;
    }
    i6 = paramRect.bottom;
    View localView2 = getChildAt(0);
    int i7 = localView2.getHeight();
    if (i6 < i7) {
      i4 -= i5;
    }
    i5 = paramRect.bottom;
    if (i5 > i4)
    {
      i5 = paramRect.top;
      if (i5 > i2)
      {
        i5 = paramRect.height();
        if (i5 > i3)
        {
          i3 = paramRect.top;
          i2 = i3 - i2 + 0;
          label148:
          localView1 = getChildAt(0);
          i1 = localView1.getBottom();
          i4 = i1 - i4;
          i2 = Math.min(i2, i4);
        }
      }
    }
    for (;;)
    {
      i1 = i2;
      break;
      i2 = paramRect.bottom - i4 + 0;
      break label148;
      i5 = paramRect.top;
      if (i5 < i2)
      {
        i5 = paramRect.bottom;
        if (i5 < i4)
        {
          i5 = paramRect.height();
          if (i5 > i3)
          {
            i2 = paramRect.bottom;
            i2 = i4 - i2;
          }
          for (i2 = 0 - i2;; i2 = 0 - i2)
          {
            i4 = -getScrollY();
            i2 = Math.max(i2, i4);
            break;
            i4 = paramRect.top;
            i2 -= i4;
          }
        }
      }
      i2 = 0;
    }
  }
  
  public void a(int paramInt)
  {
    this.z.c(paramInt);
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return this.z.a(paramInt1, paramInt2);
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    int i1 = getOverScrollMode();
    int i2 = computeHorizontalScrollRange();
    int i4 = computeHorizontalScrollExtent();
    float f1;
    int i5;
    label58:
    label89:
    label120:
    int i6;
    int i7;
    int i8;
    OverScroller localOverScroller;
    int i9;
    if (i2 > i4)
    {
      i2 = 1;
      f1 = Float.MIN_VALUE;
      i4 = computeVerticalScrollRange();
      i5 = computeVerticalScrollExtent();
      if (i4 <= i5) {
        break label326;
      }
      i4 = 1;
      i5 = i4;
      if (i1 != 0)
      {
        i4 = 1;
        if ((i1 != i4) || (i2 == 0)) {
          break label335;
        }
      }
      i2 = 1;
      f1 = Float.MIN_VALUE;
      i4 = i2;
      if (i1 != 0)
      {
        i2 = 1;
        f1 = Float.MIN_VALUE;
        if ((i1 != i2) || (i5 == 0)) {
          break label350;
        }
      }
      i2 = 1;
      f1 = Float.MIN_VALUE;
      i6 = paramInt3 + paramInt1;
      if (i4 == 0) {
        paramInt7 = 0;
      }
      i7 = paramInt4 + paramInt2;
      if (i2 == 0) {
        paramInt8 = 0;
      }
      i8 = -paramInt7;
      i4 = paramInt7 + paramInt5;
      i1 = -paramInt8;
      i5 = paramInt8 + paramInt6;
      i2 = 0;
      f1 = 0.0F;
      localOverScroller = null;
      if (i6 <= i4) {
        break label362;
      }
      i2 = 1;
      f1 = Float.MIN_VALUE;
      i9 = i2;
    }
    for (;;)
    {
      label198:
      i2 = 0;
      f1 = 0.0F;
      localOverScroller = null;
      int i11;
      if (i7 > i5)
      {
        i2 = 1;
        f1 = Float.MIN_VALUE;
        i11 = i2;
      }
      for (;;)
      {
        label225:
        int i3;
        if (i11 != 0)
        {
          f1 = Float.MIN_VALUE;
          i3 = b(1);
          if (i3 == 0)
          {
            localOverScroller = this.c;
            i1 = 0;
            i7 = 0;
            i8 = 0;
            i6 = getScrollRange();
            localOverScroller.springBack(i4, i5, 0, 0, 0, i6);
          }
        }
        onOverScrolled(i4, i5, i9, i11);
        if ((i9 != 0) || (i11 != 0))
        {
          i3 = 1;
          f1 = Float.MIN_VALUE;
        }
        for (;;)
        {
          return i3;
          i3 = 0;
          f1 = 0.0F;
          localOverScroller = null;
          break;
          label326:
          i4 = 0;
          i5 = 0;
          break label58;
          label335:
          i3 = 0;
          f1 = 0.0F;
          localOverScroller = null;
          i4 = 0;
          break label89;
          label350:
          i3 = 0;
          f1 = 0.0F;
          localOverScroller = null;
          break label120;
          label362:
          if (i6 >= i8) {
            break label434;
          }
          i3 = 1;
          f1 = Float.MIN_VALUE;
          i9 = i3;
          i4 = i8;
          break label198;
          if (i7 >= i1) {
            break label424;
          }
          i3 = 1;
          f1 = Float.MIN_VALUE;
          i11 = i3;
          i5 = i1;
          break label225;
          i3 = 0;
          f1 = 0.0F;
          localOverScroller = null;
        }
        label424:
        int i12 = 0;
        i5 = i7;
      }
      label434:
      int i10 = 0;
      i4 = i6;
    }
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    return this.z.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramInt5);
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    return this.z.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
  }
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    int i1 = 33;
    boolean bool2 = false;
    int i5 = 130;
    float f1 = 1.82E-43F;
    Object localObject = this.b;
    ((Rect)localObject).setEmpty();
    boolean bool3 = b();
    int i6;
    View localView;
    int i3;
    if (!bool3)
    {
      boolean bool1 = isFocused();
      if (bool1)
      {
        int i2 = paramKeyEvent.getKeyCode();
        i6 = 4;
        if (i2 != i6)
        {
          localView = findFocus();
          if (localView == this)
          {
            i2 = 0;
            localView = null;
          }
          localObject = FocusFinder.getInstance();
          localView = ((FocusFinder)localObject).findNextFocus(this, localView, i5);
          if ((localView == null) || (localView == this)) {
            break label123;
          }
          i3 = localView.requestFocus(i5);
          if (i3 == 0) {
            break label123;
          }
          i3 = 1;
          bool2 = i3;
        }
      }
    }
    label123:
    int i4;
    for (;;)
    {
      return bool2;
      i3 = 0;
      localView = null;
      break;
      i6 = paramKeyEvent.getAction();
      if (i6 == 0)
      {
        i6 = paramKeyEvent.getKeyCode();
        switch (i6)
        {
        default: 
          break;
        case 19: 
          bool2 = paramKeyEvent.isAltPressed();
          if (!bool2) {
            bool2 = e(i3);
          } else {
            bool2 = d(i3);
          }
          break;
        case 20: 
          i4 = paramKeyEvent.isAltPressed();
          if (i4 == 0) {
            bool2 = e(i5);
          } else {
            bool2 = d(i5);
          }
          break;
        }
      }
    }
    boolean bool4 = paramKeyEvent.isShiftPressed();
    if (bool4) {}
    for (;;)
    {
      c(i4);
      break;
      i4 = i5;
    }
  }
  
  public void addView(View paramView)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("ScrollView can host only one direct child");
      throw localIllegalStateException;
    }
    super.addView(paramView);
  }
  
  public void addView(View paramView, int paramInt)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("ScrollView can host only one direct child");
      throw localIllegalStateException;
    }
    super.addView(paramView, paramInt);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("ScrollView can host only one direct child");
      throw localIllegalStateException;
    }
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("ScrollView can host only one direct child");
      throw localIllegalStateException;
    }
    super.addView(paramView, paramLayoutParams);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    int i1 = getChildCount();
    if (i1 == 0) {
      return;
    }
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    long l2 = this.a;
    l1 -= l2;
    l2 = 250L;
    boolean bool1 = l1 < l2;
    if (bool1)
    {
      int i2 = getHeight();
      int i3 = getPaddingBottom();
      i2 -= i3;
      i3 = getPaddingTop();
      i2 -= i3;
      View localView = getChildAt(0);
      i2 = localView.getHeight() - i2;
      i2 = Math.max(0, i2);
      i3 = getScrollY();
      int i4 = i3 + paramInt2;
      i2 = Math.min(i4, i2);
      i2 = Math.max(0, i2) - i3;
      OverScroller localOverScroller1 = this.c;
      int i5 = getScrollX();
      localOverScroller1.startScroll(i5, i3, 0, i2);
      r.c(this);
    }
    for (;;)
    {
      l1 = AnimationUtils.currentAnimationTimeMillis();
      this.a = l1;
      break;
      OverScroller localOverScroller2 = this.c;
      boolean bool2 = localOverScroller2.isFinished();
      if (!bool2)
      {
        localOverScroller2 = this.c;
        localOverScroller2.abortAnimation();
      }
      scrollBy(paramInt1, paramInt2);
    }
  }
  
  public boolean b(int paramInt)
  {
    return this.z.a(paramInt);
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    int i1 = getScrollX();
    i1 = paramInt1 - i1;
    int i2 = getScrollY();
    i2 = paramInt2 - i2;
    b(i1, i2);
  }
  
  public boolean c(int paramInt)
  {
    int i1 = 0;
    Rect localRect = null;
    int i2 = 130;
    int i3;
    Object localObject;
    int i4;
    if (paramInt == i2)
    {
      i2 = 1;
      i3 = getHeight();
      if (i2 == 0) {
        break label179;
      }
      localObject = this.b;
      i1 = getScrollY() + i3;
      ((Rect)localObject).top = i1;
      i2 = getChildCount();
      if (i2 > 0)
      {
        i2 += -1;
        localObject = getChildAt(i2);
        localRect = this.b;
        i1 = localRect.top + i3;
        i4 = ((View)localObject).getBottom();
        if (i1 > i4)
        {
          localRect = this.b;
          i2 = ((View)localObject).getBottom() - i3;
          localRect.top = i2;
        }
      }
    }
    for (;;)
    {
      localObject = this.b;
      i1 = this.b.top + i3;
      ((Rect)localObject).bottom = i1;
      i2 = this.b.top;
      i1 = this.b.bottom;
      return a(paramInt, i2, i1);
      i2 = 0;
      localObject = null;
      break;
      label179:
      localObject = this.b;
      i4 = getScrollY() - i3;
      ((Rect)localObject).top = i4;
      localObject = this.b;
      i2 = ((Rect)localObject).top;
      if (i2 < 0)
      {
        localObject = this.b;
        ((Rect)localObject).top = 0;
      }
    }
  }
  
  public int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  public int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  public int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll()
  {
    Object localObject = this.c;
    boolean bool1 = ((OverScroller)localObject).computeScrollOffset();
    int i6;
    int i8;
    float f1;
    OverScroller localOverScroller;
    int i9;
    int i11;
    int i3;
    if (bool1)
    {
      this.c.getCurrX();
      i6 = this.c.getCurrY();
      int i1 = this.u;
      int i7 = i6 - i1;
      i8 = 0;
      f1 = 0.0F;
      localOverScroller = null;
      int[] arrayOfInt = this.s;
      i9 = 0;
      int i10 = 1;
      localObject = this;
      boolean bool2 = a(0, i7, arrayOfInt, null, i10);
      if (bool2)
      {
        localObject = this.s;
        i8 = 1;
        f1 = Float.MIN_VALUE;
        int i2 = localObject[i8];
        i7 -= i2;
      }
      if (i7 != 0)
      {
        i11 = getScrollRange();
        i9 = getScrollY();
        i8 = 0;
        f1 = 0.0F;
        localOverScroller = null;
        int i12 = getScrollX();
        i10 = 0;
        localObject = this;
        a(0, i7, i12, i9, 0, i11, 0, 0, false);
        int i13 = getScrollY() - i9;
        int i14 = i7 - i13;
        int i15 = 1;
        boolean bool3 = a(0, i13, 0, i14, null, i15);
        if (!bool3)
        {
          i3 = getOverScrollMode();
          if (i3 != 0)
          {
            i8 = 1;
            f1 = Float.MIN_VALUE;
            if ((i3 != i8) || (i11 <= 0)) {
              break label280;
            }
          }
          i3 = 1;
          if (i3 != 0)
          {
            g();
            if ((i6 > 0) || (i9 <= 0)) {
              break label287;
            }
            localObject = this.d;
            localOverScroller = this.c;
            f1 = localOverScroller.getCurrVelocity();
            i8 = (int)f1;
            ((EdgeEffect)localObject).onAbsorb(i8);
          }
        }
      }
      label270:
      this.u = i6;
      r.c(this);
    }
    for (;;)
    {
      return;
      label280:
      i3 = 0;
      localObject = null;
      break;
      label287:
      if ((i6 < i11) || (i9 >= i11)) {
        break label270;
      }
      localObject = this.e;
      localOverScroller = this.c;
      f1 = localOverScroller.getCurrVelocity();
      i8 = (int)f1;
      ((EdgeEffect)localObject).onAbsorb(i8);
      break label270;
      int i4 = b(1);
      if (i4 != 0)
      {
        i4 = 1;
        a(i4);
      }
      int i5 = 0;
      localObject = null;
      this.u = 0;
    }
  }
  
  public int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  public int computeVerticalScrollOffset()
  {
    int i1 = super.computeVerticalScrollOffset();
    return Math.max(0, i1);
  }
  
  public int computeVerticalScrollRange()
  {
    int i1 = getChildCount();
    int i2 = getHeight();
    int i3 = getPaddingBottom();
    i2 -= i3;
    i3 = getPaddingTop();
    i2 -= i3;
    if (i1 == 0) {
      i1 = i2;
    }
    for (;;)
    {
      return i1;
      View localView = getChildAt(0);
      i1 = localView.getBottom();
      i3 = getScrollY();
      i2 = i1 - i2;
      i2 = Math.max(0, i2);
      if (i3 < 0)
      {
        i1 -= i3;
      }
      else if (i3 > i2)
      {
        i2 = i3 - i2;
        i1 += i2;
      }
    }
  }
  
  public boolean d(int paramInt)
  {
    int i1 = 0;
    Rect localRect1 = null;
    int i2 = 130;
    if (paramInt == i2) {
      i2 = 1;
    }
    for (;;)
    {
      int i3 = getHeight();
      Rect localRect2 = this.b;
      localRect2.top = 0;
      localRect1 = this.b;
      localRect1.bottom = i3;
      if (i2 != 0)
      {
        i2 = getChildCount();
        if (i2 > 0)
        {
          i2 += -1;
          localObject = getChildAt(i2);
          localRect1 = this.b;
          i2 = ((View)localObject).getBottom();
          int i4 = getPaddingBottom();
          i2 += i4;
          localRect1.bottom = i2;
          localObject = this.b;
          localRect1 = this.b;
          i1 = localRect1.bottom - i3;
          ((Rect)localObject).top = i1;
        }
      }
      i2 = this.b.top;
      i1 = this.b.bottom;
      return a(paramInt, i2, i1);
      i2 = 0;
      Object localObject = null;
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    if (!bool)
    {
      bool = a(paramKeyEvent);
      if (!bool) {
        break label24;
      }
    }
    label24:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.z.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.z.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.z.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.z.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i1 = 0;
    float f1 = 0.0F;
    EdgeEffect localEdgeEffect1 = null;
    int i2 = 21;
    super.draw(paramCanvas);
    EdgeEffect localEdgeEffect2 = this.d;
    int i3;
    int i9;
    int i6;
    int i10;
    int i11;
    int i13;
    int i14;
    if (localEdgeEffect2 != null)
    {
      i3 = getScrollY();
      localEdgeEffect2 = this.d;
      boolean bool3 = localEdgeEffect2.isFinished();
      if (!bool3)
      {
        i9 = paramCanvas.save();
        i6 = getWidth();
        i10 = getHeight();
        i11 = Math.min(0, i3);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= i2)
        {
          boolean bool5 = getClipToPadding();
          if (!bool5) {
            break label513;
          }
        }
        i13 = getPaddingLeft();
        i14 = getPaddingRight();
        i13 += i14;
        i13 = i6 - i13;
        i6 = getPaddingLeft() + 0;
      }
    }
    for (;;)
    {
      i14 = Build.VERSION.SDK_INT;
      if (i14 >= i2)
      {
        boolean bool6 = getClipToPadding();
        if (bool6)
        {
          int i15 = getPaddingTop();
          int i16 = getPaddingBottom();
          i15 += i16;
          i10 -= i15;
          i15 = getPaddingTop();
          i11 += i15;
        }
      }
      float f2 = i6;
      float f3 = i11;
      paramCanvas.translate(f2, f3);
      this.d.setSize(i13, i10);
      localEdgeEffect2 = this.d;
      boolean bool4 = localEdgeEffect2.draw(paramCanvas);
      if (bool4) {
        r.c(this);
      }
      paramCanvas.restoreToCount(i9);
      localEdgeEffect2 = this.e;
      bool4 = localEdgeEffect2.isFinished();
      if (!bool4)
      {
        i10 = paramCanvas.save();
        int i7 = getWidth();
        i11 = getHeight();
        i13 = Math.max(getScrollRange(), i3) + i11;
        i3 = Build.VERSION.SDK_INT;
        if (i3 >= i2)
        {
          boolean bool1 = getClipToPadding();
          if (!bool1) {}
        }
        else
        {
          i4 = getPaddingLeft();
          i9 = getPaddingRight();
          i4 += i9;
          i7 -= i4;
          i4 = getPaddingLeft();
          i1 = 0 + i4;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= i2)
        {
          boolean bool2 = getClipToPadding();
          if (bool2)
          {
            i5 = getPaddingTop();
            i9 = getPaddingBottom();
            i5 += i9;
            i11 -= i5;
            i5 = getPaddingBottom();
            i13 -= i5;
          }
        }
        f1 = i1 - i7;
        float f4 = i13;
        paramCanvas.translate(f1, f4);
        i1 = 1127481344;
        f1 = 180.0F;
        f4 = i7;
        int i5 = 0;
        paramCanvas.rotate(f1, f4, 0.0F);
        localEdgeEffect1 = this.e;
        localEdgeEffect1.setSize(i7, i11);
        localEdgeEffect2 = this.e;
        i8 = localEdgeEffect2.draw(paramCanvas);
        if (i8 != 0) {
          r.c(this);
        }
        paramCanvas.restoreToCount(i10);
      }
      return;
      label513:
      i13 = i8;
      int i8 = 0;
      localEdgeEffect2 = null;
      f2 = 0.0F;
    }
  }
  
  public boolean e(int paramInt)
  {
    int i1 = 130;
    View localView1 = findFocus();
    boolean bool1;
    if (localView1 == this)
    {
      bool1 = false;
      localView1 = null;
    }
    Object localObject = FocusFinder.getInstance();
    View localView2 = ((FocusFinder)localObject).findNextFocus(this, localView1, paramInt);
    int i4 = getMaxScrollAmount();
    int i5;
    if (localView2 != null)
    {
      int i6 = getHeight();
      boolean bool3 = a(localView2, i4, i6);
      if (bool3)
      {
        localObject = this.b;
        localView2.getDrawingRect((Rect)localObject);
        localObject = this.b;
        offsetDescendantRectToMyCoords(localView2, (Rect)localObject);
        localObject = this.b;
        i4 = a((Rect)localObject);
        g(i4);
        localView2.requestFocus(paramInt);
        if (localView1 != null)
        {
          boolean bool2 = localView1.isFocused();
          if (bool2)
          {
            bool1 = a(localView1);
            if (bool1)
            {
              i2 = getDescendantFocusability();
              i5 = 131072;
              setDescendantFocusability(i5);
              requestFocus();
              setDescendantFocusability(i2);
            }
          }
        }
        int i2 = 1;
        return i2;
      }
    }
    int i8 = 33;
    if (paramInt == i8)
    {
      i8 = getScrollY();
      if (i8 < i5) {
        i5 = getScrollY();
      }
    }
    for (;;)
    {
      if (i5 != 0) {
        break label311;
      }
      int i3 = 0;
      localView1 = null;
      break;
      if (paramInt == i1)
      {
        i8 = getChildCount();
        if (i8 > 0)
        {
          localView2 = getChildAt(0);
          i8 = localView2.getBottom();
          int i7 = getScrollY();
          int i9 = getHeight();
          i7 += i9;
          i9 = getPaddingBottom();
          i7 -= i9;
          i9 = i8 - i7;
          if (i9 < i5) {
            i5 = i8 - i7;
          }
        }
      }
    }
    label311:
    if (paramInt == i1) {}
    for (;;)
    {
      g(i5);
      break;
      i5 = -i5;
    }
  }
  
  public void f(int paramInt)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      a(2, 1);
      OverScroller localOverScroller = this.c;
      int i2 = getScrollX();
      int i3 = getScrollY();
      int i4 = -1 << -1;
      int i5 = -1 >>> 1;
      localOverScroller.fling(i2, i3, 0, paramInt, 0, 0, i4, i5, 0, 0);
      i1 = getScrollY();
      this.u = i1;
      r.c(this);
    }
  }
  
  protected float getBottomFadingEdgeStrength()
  {
    int i1 = getChildCount();
    float f1;
    if (i1 == 0)
    {
      i1 = 0;
      f1 = 0.0F;
    }
    for (;;)
    {
      return f1;
      i1 = getVerticalFadingEdgeLength();
      int i2 = getHeight();
      int i3 = getPaddingBottom();
      i2 -= i3;
      View localView = getChildAt(0);
      i3 = localView.getBottom();
      int i4 = getScrollY();
      i3 -= i4;
      i2 = i3 - i2;
      if (i2 < i1)
      {
        float f2 = i2;
        f1 = i1;
        f1 = f2 / f1;
      }
      else
      {
        i1 = 1065353216;
        f1 = 1.0F;
      }
    }
  }
  
  public int getMaxScrollAmount()
  {
    float f1 = getHeight();
    return (int)(0.5F * f1);
  }
  
  public int getNestedScrollAxes()
  {
    return this.y.a();
  }
  
  int getScrollRange()
  {
    int i1 = 0;
    int i2 = getChildCount();
    if (i2 > 0)
    {
      View localView = getChildAt(0);
      i2 = localView.getHeight();
      int i3 = getHeight();
      int i4 = getPaddingBottom();
      i3 -= i4;
      i4 = getPaddingTop();
      i3 -= i4;
      i2 -= i3;
      i1 = Math.max(0, i2);
    }
    return i1;
  }
  
  protected float getTopFadingEdgeStrength()
  {
    int i1 = getChildCount();
    float f1;
    if (i1 == 0)
    {
      i1 = 0;
      f1 = 0.0F;
    }
    for (;;)
    {
      return f1;
      i1 = getVerticalFadingEdgeLength();
      int i2 = getScrollY();
      if (i2 < i1)
      {
        float f2 = i2;
        f1 = i1;
        f1 = f2 / f1;
      }
      else
      {
        i1 = 1065353216;
        f1 = 1.0F;
      }
    }
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.z.b();
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.z.a();
  }
  
  protected void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    i1 += i2;
    int i3 = localLayoutParams.width;
    i3 = getChildMeasureSpec(paramInt1, i1, i3);
    i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    paramView.measure(i3, i1);
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    i1 += i2;
    i2 = localMarginLayoutParams.leftMargin;
    i1 += i2;
    i2 = localMarginLayoutParams.rightMargin;
    i1 = i1 + i2 + paramInt2;
    i2 = localMarginLayoutParams.width;
    i1 = getChildMeasureSpec(paramInt1, i1, i2);
    i2 = localMarginLayoutParams.topMargin;
    int i3 = View.MeasureSpec.makeMeasureSpec(localMarginLayoutParams.bottomMargin + i2, 0);
    paramView.measure(i1, i3);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.h = false;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i2 = paramMotionEvent.getSource() & 0x2;
    if (i2 != 0)
    {
      i2 = paramMotionEvent.getAction();
      switch (i2)
      {
      }
    }
    label149:
    for (;;)
    {
      return bool1;
      boolean bool2 = this.j;
      if (!bool2)
      {
        int i3 = 9;
        float f1 = paramMotionEvent.getAxisValue(i3);
        float f2 = 0.0F;
        boolean bool3 = f1 < 0.0F;
        if (bool3)
        {
          f2 = getVerticalScrollFactorCompat();
          f1 *= f2;
          int i4 = (int)f1;
          i3 = getScrollRange();
          int i5 = getScrollY();
          i4 = i5 - i4;
          if (i4 < 0)
          {
            i3 = 0;
            f1 = 0.0F;
          }
          for (;;)
          {
            if (i3 == i5) {
              break label149;
            }
            int i1 = getScrollX();
            super.scrollTo(i1, i3);
            i1 = 1;
            break;
            if (i4 <= i3) {
              i3 = i4;
            }
          }
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 2;
    int i2 = -1;
    boolean bool1 = true;
    String str = null;
    int i3 = paramMotionEvent.getAction();
    if (i3 == i1)
    {
      boolean bool3 = this.j;
      if (bool3) {
        return bool1;
      }
    }
    i3 &= 0xFF;
    switch (i3)
    {
    }
    for (;;)
    {
      bool1 = this.j;
      break;
      i3 = this.q;
      if (i3 != i2)
      {
        int i5 = paramMotionEvent.findPointerIndex(i3);
        Object localObject1;
        Object localObject3;
        if (i5 == i2)
        {
          localObject1 = "NestedScrollView";
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str = "Invalid pointerId=";
          localObject3 = ((StringBuilder)localObject2).append(str).append(i3);
          localObject2 = " in onInterceptTouchEvent";
          localObject3 = (String)localObject2;
          Log.e((String)localObject1, (String)localObject3);
        }
        else
        {
          float f1 = paramMotionEvent.getY(i5);
          i3 = (int)f1;
          i5 = this.f;
          i5 = Math.abs(i3 - i5);
          i2 = this.n;
          if (i5 > i2)
          {
            i5 = getNestedScrollAxes() & 0x2;
            if (i5 == 0)
            {
              this.j = bool1;
              this.f = i3;
              d();
              this.k.addMovement(paramMotionEvent);
              this.t = 0;
              localObject3 = getParent();
              if (localObject3 != null)
              {
                ((ViewParent)localObject3).requestDisallowInterceptTouchEvent(bool1);
                continue;
                f1 = paramMotionEvent.getY();
                i3 = (int)f1;
                float f2 = paramMotionEvent.getX();
                i5 = (int)f2;
                boolean bool4 = d(i5, i3);
                if (!bool4)
                {
                  this.j = false;
                  e();
                }
                else
                {
                  this.f = i3;
                  i3 = paramMotionEvent.getPointerId(0);
                  this.q = i3;
                  c();
                  this.k.addMovement(paramMotionEvent);
                  this.c.computeScrollOffset();
                  localObject3 = this.c;
                  boolean bool2 = ((OverScroller)localObject3).isFinished();
                  if (!bool2) {}
                  for (;;)
                  {
                    this.j = bool1;
                    a(i1, 0);
                    break;
                    bool1 = false;
                    localObject1 = null;
                  }
                  this.j = false;
                  this.q = i2;
                  e();
                  localObject1 = this.c;
                  int i4 = getScrollX();
                  int i6 = getScrollY();
                  int i7 = getScrollRange();
                  i2 = 0;
                  i1 = 0;
                  bool1 = ((OverScroller)localObject1).springBack(i4, i6, 0, 0, 0, i7);
                  if (bool1) {
                    r.c(this);
                  }
                  a(0);
                  continue;
                  a(paramMotionEvent);
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    int i2 = 0;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.g = false;
    Object localObject = this.i;
    if (localObject != null)
    {
      localObject = this.i;
      bool = a((View)localObject, this);
      if (bool)
      {
        localObject = this.i;
        b((View)localObject);
      }
    }
    this.i = null;
    boolean bool = this.h;
    int i3;
    if (!bool)
    {
      localObject = this.v;
      if (localObject != null)
      {
        i3 = getScrollX();
        NestedScrollView.SavedState localSavedState = this.v;
        i4 = localSavedState.a;
        scrollTo(i3, i4);
        this.v = null;
      }
      i3 = getChildCount();
      if (i3 <= 0) {
        break label248;
      }
      localObject = getChildAt(0);
      i3 = ((View)localObject).getMeasuredHeight();
      int i4 = paramInt4 - paramInt2;
      i1 = getPaddingBottom();
      i4 -= i1;
      i1 = getPaddingTop();
      i4 -= i1;
      i3 -= i4;
      i3 = Math.max(0, i3);
      i4 = getScrollY();
      if (i4 <= i3) {
        break label257;
      }
      i2 = getScrollX();
      scrollTo(i2, i3);
    }
    for (;;)
    {
      i3 = getScrollX();
      i2 = getScrollY();
      scrollTo(i3, i2);
      this.h = true;
      return;
      label248:
      i3 = 0;
      localObject = null;
      break;
      label257:
      i3 = getScrollY();
      if (i3 < 0)
      {
        i3 = getScrollX();
        scrollTo(i3, 0);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    boolean bool = this.l;
    if (!bool) {}
    for (;;)
    {
      return;
      int i1 = View.MeasureSpec.getMode(paramInt2);
      if (i1 != 0)
      {
        i1 = getChildCount();
        if (i1 > 0)
        {
          FrameLayout.LayoutParams localLayoutParams = null;
          View localView = getChildAt(0);
          int i2 = getMeasuredHeight();
          i1 = localView.getMeasuredHeight();
          if (i1 < i2)
          {
            localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
            int i3 = getPaddingLeft();
            int i4 = getPaddingRight();
            i3 += i4;
            i1 = localLayoutParams.width;
            i1 = getChildMeasureSpec(paramInt1, i3, i1);
            i3 = getPaddingTop();
            i2 -= i3;
            i3 = getPaddingBottom();
            i2 -= i3;
            i3 = 1073741824;
            i2 = View.MeasureSpec.makeMeasureSpec(i2, i3);
            localView.measure(i1, i2);
          }
        }
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      i1 = (int)paramFloat2;
      h(i1);
    }
    int i2;
    for (int i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt, null);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getScrollY();
    scrollBy(0, paramInt4);
    int i2 = getScrollY() - i1;
    int i3 = paramInt4 - i2;
    dispatchNestedScroll(0, i2, 0, i3, null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.y.a(paramView1, paramView2, paramInt);
    startNestedScroll(2);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    boolean bool1 = false;
    int i1 = 2;
    Object localObject;
    boolean bool2;
    if (paramInt == i1)
    {
      paramInt = 130;
      if (paramRect != null) {
        break label59;
      }
      localObject = FocusFinder.getInstance();
      bool2 = false;
      localObject = ((FocusFinder)localObject).findNextFocus(this, null, paramInt);
      label37:
      if (localObject != null) {
        break label73;
      }
    }
    for (;;)
    {
      return bool1;
      i1 = 1;
      if (paramInt != i1) {
        break;
      }
      paramInt = 33;
      break;
      label59:
      localObject = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, paramInt);
      break label37;
      label73:
      bool2 = a((View)localObject);
      if (!bool2) {
        bool1 = ((View)localObject).requestFocus(paramInt, paramRect);
      }
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof NestedScrollView.SavedState;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (NestedScrollView.SavedState)paramParcelable;
      Parcelable localParcelable = paramParcelable.getSuperState();
      super.onRestoreInstanceState(localParcelable);
      this.v = paramParcelable;
      requestLayout();
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    NestedScrollView.SavedState localSavedState = new android/support/v4/widget/NestedScrollView$SavedState;
    localSavedState.<init>(localParcelable);
    int i1 = getScrollY();
    localSavedState.a = i1;
    return localSavedState;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    NestedScrollView.b localb = this.B;
    if (localb != null)
    {
      localb = this.B;
      localb.onScrollChange(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = findFocus();
    if ((localObject == null) || (this == localObject)) {}
    for (;;)
    {
      return;
      Rect localRect = null;
      boolean bool = a((View)localObject, 0, paramInt4);
      if (bool)
      {
        localRect = this.b;
        ((View)localObject).getDrawingRect(localRect);
        localRect = this.b;
        offsetDescendantRectToMyCoords((View)localObject, localRect);
        localObject = this.b;
        int i1 = a((Rect)localObject);
        g(i1);
      }
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    int i1 = paramInt & 0x2;
    if (i1 != 0) {}
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.y.a(paramView);
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    d();
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i1 = paramMotionEvent.getActionMasked();
    if (i1 == 0)
    {
      bool8 = false;
      f1 = 0.0F;
      localObject1 = null;
      this.t = 0;
    }
    boolean bool8 = false;
    float f1 = 0.0F;
    Object localObject1 = null;
    int i14 = this.t;
    float f2 = i14;
    localMotionEvent.offsetLocation(0.0F, f2);
    switch (i1)
    {
    }
    for (;;)
    {
      Object localObject2 = this.k;
      if (localObject2 != null)
      {
        localObject2 = this.k;
        ((VelocityTracker)localObject2).addMovement(localMotionEvent);
      }
      localMotionEvent.recycle();
      i1 = 1;
      float f3 = Float.MIN_VALUE;
      for (;;)
      {
        return i1;
        int i2 = getChildCount();
        if (i2 != 0) {
          break;
        }
        i2 = 0;
        f3 = 0.0F;
        localObject2 = null;
      }
      localObject2 = this.c;
      boolean bool1 = ((OverScroller)localObject2).isFinished();
      if (!bool1)
      {
        bool1 = true;
        f3 = Float.MIN_VALUE;
      }
      for (;;)
      {
        this.j = bool1;
        if (bool1)
        {
          localObject2 = getParent();
          if (localObject2 != null)
          {
            bool8 = true;
            f1 = Float.MIN_VALUE;
            ((ViewParent)localObject2).requestDisallowInterceptTouchEvent(bool8);
          }
        }
        localObject2 = this.c;
        bool1 = ((OverScroller)localObject2).isFinished();
        if (!bool1)
        {
          localObject2 = this.c;
          ((OverScroller)localObject2).abortAnimation();
        }
        i3 = (int)paramMotionEvent.getY();
        this.f = i3;
        localObject2 = null;
        i3 = paramMotionEvent.getPointerId(0);
        this.q = i3;
        i3 = 2;
        f3 = 2.8E-45F;
        bool8 = false;
        f1 = 0.0F;
        localObject1 = null;
        a(i3, 0);
        break;
        i3 = 0;
        f3 = 0.0F;
        localObject2 = null;
      }
      int i3 = this.q;
      int i15 = paramMotionEvent.findPointerIndex(i3);
      i3 = -1;
      f3 = 0.0F / 0.0F;
      if (i15 == i3)
      {
        localObject2 = "NestedScrollView";
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Invalid pointerId=");
        i14 = this.q;
        localObject1 = ((StringBuilder)localObject1).append(i14);
        String str = " in onTouchEvent";
        localObject1 = str;
        Log.e((String)localObject2, (String)localObject1);
      }
      else
      {
        f3 = paramMotionEvent.getY(i15);
        int i16 = (int)f3;
        i14 = this.f - i16;
        bool8 = false;
        f1 = 0.0F;
        localObject1 = null;
        int[] arrayOfInt1 = this.s;
        int[] arrayOfInt2 = this.r;
        localObject2 = this;
        boolean bool2 = a(0, i14, arrayOfInt1, arrayOfInt2, 0);
        int i18;
        float f4;
        int i12;
        if (bool2)
        {
          int i4 = this.s[1];
          i14 -= i4;
          f3 = 0.0F;
          localObject2 = null;
          f1 = this.r[1];
          localMotionEvent.offsetLocation(0.0F, f1);
          i4 = this.t;
          localObject1 = this.r;
          i18 = 1;
          f4 = Float.MIN_VALUE;
          i12 = localObject1[i18];
          i4 += i12;
          this.t = i4;
        }
        boolean bool3 = this.j;
        if (!bool3)
        {
          int i5 = Math.abs(i14);
          i12 = this.n;
          if (i5 > i12)
          {
            localObject2 = getParent();
            if (localObject2 != null)
            {
              i12 = 1;
              f1 = Float.MIN_VALUE;
              ((ViewParent)localObject2).requestDisallowInterceptTouchEvent(i12);
            }
            i5 = 1;
            f3 = Float.MIN_VALUE;
            this.j = i5;
            if (i14 <= 0) {
              break label900;
            }
            i5 = this.n;
            i14 -= i5;
          }
        }
        label612:
        boolean bool4 = this.j;
        if (bool4)
        {
          localObject2 = this.r;
          int i13 = 1;
          f1 = Float.MIN_VALUE;
          int i6 = localObject2[i13];
          i6 = i16 - i6;
          this.f = i6;
          int i19 = getScrollY();
          i16 = getScrollRange();
          i6 = getOverScrollMode();
          if (i6 != 0)
          {
            i13 = 1;
            f1 = Float.MIN_VALUE;
            if ((i6 != i13) || (i16 <= 0)) {}
          }
          else
          {
            i6 = 1;
            f3 = Float.MIN_VALUE;
          }
          int i21;
          int i7;
          for (int i20 = i6;; i20 = 0)
          {
            i13 = 0;
            f1 = 0.0F;
            localObject1 = null;
            i18 = 0;
            f4 = 0.0F;
            arrayOfInt1 = null;
            i21 = getScrollY();
            boolean bool9 = true;
            localObject2 = this;
            boolean bool5 = a(0, i14, 0, i21, 0, i16, 0, 0, bool9);
            if (bool5)
            {
              f3 = 0.0F;
              localObject2 = null;
              bool5 = b(0);
              if (!bool5)
              {
                localObject2 = this.k;
                ((VelocityTracker)localObject2).clear();
              }
            }
            int i22 = getScrollY() - i19;
            int i23 = i14 - i22;
            int[] arrayOfInt3 = this.r;
            bool5 = a(0, i22, 0, i23, arrayOfInt3, 0);
            if (!bool5) {
              break label928;
            }
            i7 = this.f;
            i13 = this.r[1];
            i7 -= i13;
            this.f = i7;
            f3 = 0.0F;
            localObject2 = null;
            f1 = this.r[1];
            localMotionEvent.offsetLocation(0.0F, f1);
            i7 = this.t;
            localObject1 = this.r;
            i14 = 1;
            f2 = Float.MIN_VALUE;
            i13 = localObject1[i14];
            i7 += i13;
            this.t = i7;
            break;
            label900:
            i7 = this.n;
            i14 += i7;
            break label612;
            i7 = 0;
            f3 = 0.0F;
            localObject2 = null;
          }
          label928:
          if (i20 != 0)
          {
            g();
            i7 = i19 + i14;
            int i8;
            if (i7 < 0)
            {
              localObject2 = this.d;
              f1 = i14;
              i14 = getHeight();
              f2 = i14;
              f1 /= f2;
              f2 = paramMotionEvent.getX(i15);
              i18 = getWidth();
              f4 = i18;
              f2 /= f4;
              g.a((EdgeEffect)localObject2, f1, f2);
              localObject2 = this.e;
              i8 = ((EdgeEffect)localObject2).isFinished();
              if (i8 == 0)
              {
                localObject2 = this.e;
                ((EdgeEffect)localObject2).onRelease();
              }
            }
            float f5;
            for (;;)
            {
              localObject2 = this.d;
              if (localObject2 == null) {
                break;
              }
              localObject2 = this.d;
              i8 = ((EdgeEffect)localObject2).isFinished();
              if (i8 != 0)
              {
                localObject2 = this.e;
                i8 = ((EdgeEffect)localObject2).isFinished();
                if (i8 != 0) {
                  break;
                }
              }
              r.c(this);
              break;
              if (i8 > i16)
              {
                localObject2 = this.e;
                f1 = i14;
                f2 = getHeight();
                f1 /= f2;
                i14 = 1065353216;
                f4 = paramMotionEvent.getX(i15);
                i21 = getWidth();
                f5 = i21;
                f4 /= f5;
                f2 = 1.0F - f4;
                g.a((EdgeEffect)localObject2, f1, f2);
                localObject2 = this.d;
                i8 = ((EdgeEffect)localObject2).isFinished();
                if (i8 == 0)
                {
                  localObject2 = this.d;
                  ((EdgeEffect)localObject2).onRelease();
                }
              }
            }
            localObject2 = this.k;
            f1 = 1.401E-42F;
            f2 = this.p;
            ((VelocityTracker)localObject2).computeCurrentVelocity(1000, f2);
            i13 = this.q;
            f3 = ((VelocityTracker)localObject2).getYVelocity(i13);
            int i9 = (int)f3;
            i13 = Math.abs(i9);
            i14 = this.o;
            if (i13 > i14)
            {
              i9 = -i9;
              h(i9);
            }
            int i17;
            for (;;)
            {
              i9 = -1;
              f3 = 0.0F / 0.0F;
              this.q = i9;
              f();
              break;
              localObject2 = this.c;
              i13 = getScrollX();
              i14 = getScrollY();
              i18 = 0;
              f4 = 0.0F;
              arrayOfInt1 = null;
              i21 = 0;
              f5 = 0.0F;
              arrayOfInt2 = null;
              i17 = getScrollRange();
              bool6 = ((OverScroller)localObject2).springBack(i13, i14, 0, 0, 0, i17);
              if (bool6) {
                r.c(this);
              }
            }
            boolean bool6 = this.j;
            if (bool6)
            {
              int i10 = getChildCount();
              if (i10 > 0)
              {
                localObject2 = this.c;
                i13 = getScrollX();
                i14 = getScrollY();
                i18 = 0;
                f4 = 0.0F;
                arrayOfInt1 = null;
                i21 = 0;
                f5 = 0.0F;
                arrayOfInt2 = null;
                i17 = getScrollRange();
                boolean bool7 = ((OverScroller)localObject2).springBack(i13, i14, 0, 0, 0, i17);
                if (bool7) {
                  r.c(this);
                }
              }
            }
            int i11 = -1;
            f3 = 0.0F / 0.0F;
            this.q = i11;
            f();
            continue;
            i11 = paramMotionEvent.getActionIndex();
            f1 = paramMotionEvent.getY(i11);
            i13 = (int)f1;
            this.f = i13;
            i11 = paramMotionEvent.getPointerId(i11);
            this.q = i11;
            continue;
            a(paramMotionEvent);
            i11 = this.q;
            i11 = paramMotionEvent.findPointerIndex(i11);
            f3 = paramMotionEvent.getY(i11);
            i11 = (int)f3;
            this.f = i11;
          }
        }
      }
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    boolean bool = this.g;
    if (!bool) {
      b(paramView2);
    }
    for (;;)
    {
      super.requestChildFocus(paramView1, paramView2);
      return;
      this.i = paramView2;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    int i1 = paramView.getLeft();
    int i2 = paramView.getScrollX();
    i1 -= i2;
    i2 = paramView.getTop();
    int i3 = paramView.getScrollY();
    i2 -= i3;
    paramRect.offset(i1, i2);
    return a(paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean) {
      e();
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    this.g = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      View localView = getChildAt(0);
      int i2 = getWidth();
      int i3 = getPaddingRight();
      i2 -= i3;
      i3 = getPaddingLeft();
      i2 -= i3;
      i3 = localView.getWidth();
      i2 = b(paramInt1, i2, i3);
      i3 = getHeight();
      int i4 = getPaddingBottom();
      i3 -= i4;
      i4 = getPaddingTop();
      i3 -= i4;
      i1 = localView.getHeight();
      i1 = b(paramInt2, i3, i1);
      i3 = getScrollX();
      if (i2 == i3)
      {
        i3 = getScrollY();
        if (i1 == i3) {}
      }
      else
      {
        super.scrollTo(i2, i1);
      }
    }
  }
  
  public void setFillViewport(boolean paramBoolean)
  {
    boolean bool = this.l;
    if (paramBoolean != bool)
    {
      this.l = paramBoolean;
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.z.a(paramBoolean);
  }
  
  public void setOnScrollChangeListener(NestedScrollView.b paramb)
  {
    this.B = paramb;
  }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return true;
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.z.b(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.z.c();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\NestedScrollView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */