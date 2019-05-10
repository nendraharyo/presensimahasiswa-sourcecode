package c.a.a.c.a;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
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
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;

public class a
  extends FrameLayout
{
  private long a;
  private final Rect b;
  private Scroller c;
  protected int d;
  protected int e;
  private boolean f;
  private float g;
  private float h;
  private boolean i;
  private View j;
  private boolean k;
  private boolean l;
  private VelocityTracker m;
  private boolean n;
  private boolean o;
  private boolean p;
  
  public a(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842880);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.b = localRect;
    this.i = bool;
    this.j = null;
    this.k = false;
    this.l = false;
    this.p = bool;
    a();
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
    if (i4 >= i2) {
      return (View)localObject1;
    }
    localView = (View)localArrayList.get(i4);
    int i5 = localView.getLeft();
    int i6 = localView.getRight();
    int i7;
    float f3;
    label106:
    Object localObject2;
    if ((paramInt1 < i6) && (i5 < paramInt2)) {
      if ((paramInt1 < i5) && (i6 < paramInt2))
      {
        i7 = 1;
        f3 = Float.MIN_VALUE;
        if (localObject1 != null) {
          break label156;
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
      break label106;
      label156:
      if (paramBoolean)
      {
        int i8 = ((View)localObject1).getLeft();
        if (i5 < i8) {}
      }
      else if (!paramBoolean)
      {
        i5 = ((View)localObject1).getRight();
        if (i6 > i5) {
          break label225;
        }
      }
      label225:
      for (i5 = 0;; i5 = 1)
      {
        if (i1 == 0) {
          break label231;
        }
        if ((i7 == 0) || (i5 == 0)) {
          break label278;
        }
        localObject2 = localView;
        i3 = i1;
        f2 = f1;
        break;
      }
      label231:
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
  
  private View a(boolean paramBoolean, int paramInt, View paramView)
  {
    int i1 = getHorizontalFadingEdgeLength() / 2;
    int i2 = paramInt + i1;
    int i3 = getWidth() + paramInt;
    i1 = i3 - i1;
    if (paramView != null)
    {
      i3 = paramView.getLeft();
      if (i3 < i1)
      {
        i3 = paramView.getRight();
        if (i3 <= i2) {}
      }
    }
    for (;;)
    {
      return paramView;
      paramView = a(paramBoolean, i2, i1);
    }
  }
  
  private void a()
  {
    Scroller localScroller = new android/widget/Scroller;
    Context localContext = getContext();
    localScroller.<init>(localContext);
    this.c = localScroller;
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 1;
    int i2 = getHeight();
    int i3 = getScrollY();
    int i4 = i3 + i2;
    i2 = 33;
    if (paramInt1 == i2) {}
    for (i2 = i1;; i2 = 0)
    {
      Object localObject = b(i2, paramInt2, paramInt3);
      if (localObject == null) {
        localObject = this;
      }
      if ((paramInt2 < i3) || (paramInt3 > i4)) {
        break;
      }
      i2 = 0;
      View localView = findFocus();
      if (localObject != localView)
      {
        boolean bool = ((View)localObject).requestFocus(paramInt1);
        if (bool)
        {
          this.f = i1;
          this.f = false;
        }
      }
      return i2;
    }
    if (i2 != 0) {}
    for (i2 = paramInt2 - i3;; i2 = paramInt3 - i4)
    {
      g(i2);
      i2 = i1;
      break;
    }
  }
  
  private boolean a(Rect paramRect, boolean paramBoolean)
  {
    int i1 = a(paramRect);
    int i2 = b(paramRect);
    boolean bool;
    if ((i1 == 0) && (i2 == 0))
    {
      bool = false;
      if (bool)
      {
        if (!paramBoolean) {
          break label50;
        }
        scrollBy(i1, i2);
      }
    }
    for (;;)
    {
      return bool;
      bool = true;
      break;
      label50:
      a(i1, i2);
    }
  }
  
  private boolean a(View paramView)
  {
    boolean bool1 = false;
    boolean bool2 = a(paramView, 0);
    if (!bool2)
    {
      bool2 = b(paramView, 0);
      if (!bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private boolean a(View paramView, int paramInt)
  {
    Rect localRect = this.b;
    paramView.getDrawingRect(localRect);
    localRect = this.b;
    offsetDescendantRectToMyCoords(paramView, localRect);
    localRect = this.b;
    int i1 = localRect.right + paramInt;
    int i3 = getScrollX();
    if (i1 >= i3)
    {
      localRect = this.b;
      i1 = localRect.left - paramInt;
      int i4 = getScrollX();
      int i5 = getWidth();
      i4 += i5;
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
  
  private boolean a(View paramView1, View paramView2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramView1 == paramView2) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      Object localObject = paramView1.getParent();
      boolean bool3 = localObject instanceof ViewGroup;
      if (bool3)
      {
        localObject = (View)localObject;
        bool2 = a((View)localObject, paramView2);
        if (bool2)
        {
          bool2 = bool1;
          continue;
        }
      }
      bool2 = false;
      localObject = null;
    }
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3)
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
  
  private View b(boolean paramBoolean, int paramInt1, int paramInt2)
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
    if (i4 >= i2) {
      return (View)localObject1;
    }
    localView = (View)localArrayList.get(i4);
    int i5 = localView.getTop();
    int i6 = localView.getBottom();
    int i7;
    float f3;
    label106:
    Object localObject2;
    if ((paramInt1 < i6) && (i5 < paramInt2)) {
      if ((paramInt1 < i5) && (i6 < paramInt2))
      {
        i7 = 1;
        f3 = Float.MIN_VALUE;
        if (localObject1 != null) {
          break label156;
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
      break label106;
      label156:
      if (paramBoolean)
      {
        int i8 = ((View)localObject1).getTop();
        if (i5 < i8) {}
      }
      else if (!paramBoolean)
      {
        i5 = ((View)localObject1).getBottom();
        if (i6 > i5) {
          break label225;
        }
      }
      label225:
      for (i5 = 0;; i5 = 1)
      {
        if (i1 == 0) {
          break label231;
        }
        if ((i7 == 0) || (i5 == 0)) {
          break label278;
        }
        localObject2 = localView;
        i3 = i1;
        f2 = f1;
        break;
      }
      label231:
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
  
  private View b(boolean paramBoolean, int paramInt, View paramView)
  {
    int i1 = getVerticalFadingEdgeLength() / 2;
    int i2 = paramInt + i1;
    int i3 = getHeight() + paramInt;
    i1 = i3 - i1;
    if (paramView != null)
    {
      i3 = paramView.getTop();
      if (i3 < i1)
      {
        i3 = paramView.getBottom();
        if (i3 <= i2) {}
      }
    }
    for (;;)
    {
      return paramView;
      paramView = b(paramBoolean, i2, i1);
    }
  }
  
  private void b(View paramView)
  {
    Rect localRect1 = this.b;
    paramView.getDrawingRect(localRect1);
    localRect1 = this.b;
    offsetDescendantRectToMyCoords(paramView, localRect1);
    localRect1 = this.b;
    int i1 = a(localRect1);
    Rect localRect2 = this.b;
    int i2 = b(localRect2);
    if ((i2 != 0) || (i1 != 0)) {
      scrollBy(i1, i2);
    }
  }
  
  private boolean b()
  {
    boolean bool = false;
    View localView = getChildAt(0);
    if (localView != null)
    {
      int i1 = localView.getWidth();
      int i2 = getWidth();
      int i3 = getPaddingLeft();
      i1 += i3;
      i3 = getPaddingRight();
      i1 += i3;
      if (i2 < i1) {
        bool = true;
      }
    }
    return bool;
  }
  
  private boolean b(View paramView, int paramInt)
  {
    Rect localRect = this.b;
    paramView.getDrawingRect(localRect);
    localRect = this.b;
    offsetDescendantRectToMyCoords(paramView, localRect);
    localRect = this.b;
    int i1 = localRect.bottom + paramInt;
    int i3 = getScrollY();
    if (i1 >= i3)
    {
      localRect = this.b;
      i1 = localRect.top - paramInt;
      int i4 = getScrollY();
      int i5 = getHeight();
      i4 += i5;
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
  
  private boolean c()
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
  
  private void f(int paramInt)
  {
    if (paramInt != 0)
    {
      boolean bool = this.p;
      if (!bool) {
        break label20;
      }
      a(paramInt, 0);
    }
    for (;;)
    {
      return;
      label20:
      scrollBy(paramInt, 0);
    }
  }
  
  private void g(int paramInt)
  {
    if (paramInt != 0)
    {
      boolean bool = this.p;
      if (!bool) {
        break label20;
      }
      a(0, paramInt);
    }
    for (;;)
    {
      return;
      label20:
      scrollBy(0, paramInt);
    }
  }
  
  protected int a(Rect paramRect)
  {
    int i1 = 0;
    View localView1 = null;
    int i2 = getWidth();
    int i3 = getScrollX();
    int i4 = i3 + i2;
    int i5 = getHorizontalFadingEdgeLength();
    int i6 = paramRect.left;
    if (i6 > 0) {
      i3 += i5;
    }
    i6 = paramRect.right;
    View localView2 = getChildAt(0);
    int i7 = localView2.getWidth();
    if (i6 < i7) {
      i4 -= i5;
    }
    i5 = paramRect.right;
    if (i5 > i4)
    {
      i5 = paramRect.left;
      if (i5 > i3)
      {
        i5 = paramRect.width();
        if (i5 > i2)
        {
          i2 = paramRect.left;
          i3 = i2 - i3 + 0;
          i1 = getChildCount() + -1;
          localView1 = getChildAt(i1);
          i1 = localView1.getRight();
          i4 = i1 - i4;
          i3 = Math.min(i3, i4);
        }
      }
    }
    for (;;)
    {
      return i3;
      i3 = paramRect.right - i4 + 0;
      break;
      i5 = paramRect.left;
      if (i5 < i3)
      {
        i5 = paramRect.right;
        if (i5 < i4)
        {
          i5 = paramRect.width();
          if (i5 > i2)
          {
            i3 = paramRect.right;
            i3 = i4 - i3;
          }
          for (i3 = 0 - i3;; i3 = 0 - i3)
          {
            i4 = -getScrollX();
            i3 = Math.max(i3, i4);
            break;
            i4 = paramRect.left;
            i3 -= i4;
          }
        }
      }
      i3 = 0;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    long l2 = this.a;
    l1 -= l2;
    l2 = 250L;
    boolean bool = l1 < l2;
    Scroller localScroller;
    if (bool)
    {
      localScroller = this.c;
      int i1 = this.d;
      int i2 = this.e;
      localScroller.startScroll(i1, i2, paramInt1, paramInt2);
      invalidate();
    }
    for (;;)
    {
      l1 = AnimationUtils.currentAnimationTimeMillis();
      this.a = l1;
      return;
      localScroller = this.c;
      bool = localScroller.isFinished();
      if (!bool)
      {
        localScroller = this.c;
        localScroller.abortAnimation();
      }
      scrollBy(paramInt1, paramInt2);
    }
  }
  
  public boolean a(int paramInt)
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
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    int i1 = 66;
    int i2 = 17;
    int i3 = 33;
    boolean bool2 = false;
    int i7 = 130;
    Object localObject = this.b;
    ((Rect)localObject).setEmpty();
    boolean bool4 = b();
    int i4;
    View localView;
    if (bool4)
    {
      bool4 = c();
      if (bool4) {}
    }
    else
    {
      i4 = isFocused();
      if (i4 != 0)
      {
        localView = findFocus();
        if (localView == this)
        {
          i4 = 0;
          localView = null;
        }
        localObject = FocusFinder.getInstance();
        localView = ((FocusFinder)localObject).findNextFocus(this, localView, i7);
        if ((localView != null) && (localView != this))
        {
          i4 = localView.requestFocus(i7);
          if (i4 != 0) {
            bool2 = true;
          }
        }
      }
      return bool2;
    }
    bool4 = c();
    int i10;
    if (bool4)
    {
      i10 = paramKeyEvent.getAction();
      if (i10 == 0) {
        i10 = paramKeyEvent.getKeyCode();
      }
    }
    switch (i10)
    {
    default: 
      i4 = 0;
      localView = null;
      label198:
      boolean bool3 = b();
      if (bool3)
      {
        int i8 = paramKeyEvent.getAction();
        if (i8 == 0)
        {
          i8 = paramKeyEvent.getKeyCode();
          switch (i8)
          {
          }
        }
      }
      break;
    }
    for (;;)
    {
      bool2 = i4;
      break;
      int i9 = paramKeyEvent.isAltPressed();
      int i5;
      if (i9 == 0)
      {
        i5 = c(i4);
        break label198;
      }
      int i6 = b(i5);
      break label198;
      i6 = paramKeyEvent.isAltPressed();
      if (i6 == 0)
      {
        i6 = c(i9);
        break label198;
      }
      i6 = b(i9);
      break label198;
      boolean bool5 = paramKeyEvent.isShiftPressed();
      if (bool5) {}
      for (;;)
      {
        a(i6);
        break;
        i6 = i9;
      }
      boolean bool1 = paramKeyEvent.isAltPressed();
      if (!bool1)
      {
        bool1 = c(i2);
      }
      else
      {
        bool1 = b(i2);
        continue;
        bool1 = paramKeyEvent.isAltPressed();
        if (!bool1) {
          bool1 = c(i1);
        } else {
          bool1 = b(i1);
        }
      }
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
  
  protected int b(Rect paramRect)
  {
    int i1 = 0;
    View localView1 = null;
    int i2 = getHeight();
    int i3 = getScrollY();
    int i4 = i3 + i2;
    int i5 = getVerticalFadingEdgeLength();
    int i6 = paramRect.top;
    if (i6 > 0) {
      i3 += i5;
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
      if (i5 > i3)
      {
        i5 = paramRect.height();
        if (i5 > i2)
        {
          i2 = paramRect.top;
          i3 = i2 - i3 + 0;
          i1 = getChildCount() + -1;
          localView1 = getChildAt(i1);
          i1 = localView1.getBottom();
          i4 = i1 - i4;
          i3 = Math.min(i3, i4);
        }
      }
    }
    for (;;)
    {
      return i3;
      i3 = paramRect.bottom - i4 + 0;
      break;
      i5 = paramRect.top;
      if (i5 < i3)
      {
        i5 = paramRect.bottom;
        if (i5 < i4)
        {
          i5 = paramRect.height();
          if (i5 > i2)
          {
            i3 = paramRect.bottom;
            i3 = i4 - i3;
          }
          for (i3 = 0 - i3;; i3 = 0 - i3)
          {
            i4 = -getScrollY();
            i3 = Math.max(i3, i4);
            break;
            i4 = paramRect.top;
            i3 -= i4;
          }
        }
      }
      i3 = 0;
    }
  }
  
  public boolean b(int paramInt)
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
  
  public boolean c(int paramInt)
  {
    int i1 = 33;
    int i2 = 130;
    View localView1 = findFocus();
    boolean bool1;
    if (localView1 == this)
    {
      bool1 = false;
      localView1 = null;
    }
    Object localObject = FocusFinder.getInstance();
    View localView2 = ((FocusFinder)localObject).findNextFocus(this, localView1, paramInt);
    int i5 = getMaxScrollAmountX();
    int i6 = getMaxScrollAmountY();
    if (localView2 != null)
    {
      boolean bool3 = a(localView2, i5);
      if (bool3)
      {
        bool3 = b(localView2, i6);
        if (bool3)
        {
          localObject = this.b;
          localView2.getDrawingRect((Rect)localObject);
          localObject = this.b;
          offsetDescendantRectToMyCoords(localView2, (Rect)localObject);
          localObject = this.b;
          i6 = a((Rect)localObject);
          f(i6);
          localObject = this.b;
          i6 = b((Rect)localObject);
          g(i6);
          localView2.requestFocus(paramInt);
        }
      }
    }
    label250:
    label364:
    label435:
    do
    {
      if (localView1 != null)
      {
        boolean bool2 = localView1.isFocused();
        if (bool2)
        {
          bool1 = a(localView1);
          if (bool1)
          {
            i3 = getDescendantFocusability();
            i7 = 131072;
            setDescendantFocusability(i7);
            requestFocus();
            setDescendantFocusability(i3);
          }
        }
      }
      int i3 = 1;
      return i3;
      int i9;
      if (paramInt == i1)
      {
        i9 = getScrollX();
        if (i9 < i5)
        {
          i5 = getScrollX();
          if (paramInt != i1) {
            break label364;
          }
          i9 = getScrollY();
          if (i9 >= i7) {
            break label364;
          }
          i7 = getScrollY();
        }
      }
      for (;;)
      {
        if ((i5 != 0) || (i7 != 0)) {
          break label435;
        }
        int i4 = 0;
        localView1 = null;
        break;
        if (paramInt != i2) {
          break label250;
        }
        i9 = getChildCount() + -1;
        localView2 = getChildAt(i9);
        i9 = localView2.getRight();
        int i8 = getScrollX();
        int i10 = getWidth();
        i8 += i10;
        i10 = i9 - i8;
        if (i10 >= i5) {
          break label250;
        }
        i5 = i9 - i8;
        break label250;
        if (paramInt == i2)
        {
          i9 = getChildCount() + -1;
          localView2 = getChildAt(i9);
          i9 = localView2.getBottom();
          i8 = getScrollY();
          i10 = getHeight();
          i8 += i10;
          i10 = i9 - i8;
          if (i10 < i7) {
            i7 = i9 - i8;
          }
        }
      }
      if (i5 == 0)
      {
        if (paramInt == i2) {}
        for (;;)
        {
          g(i7);
          break;
          i7 = -i7;
        }
      }
    } while (i7 != 0);
    if (paramInt == i2) {}
    for (int i7 = i5;; i7 = -i5)
    {
      f(i7);
      break;
    }
  }
  
  protected int computeHorizontalScrollRange()
  {
    int i1 = getChildCount();
    if (i1 == 0) {}
    View localView;
    for (i1 = getWidth();; i1 = localView.getRight())
    {
      return i1;
      localView = getChildAt(0);
    }
  }
  
  public void computeScroll()
  {
    Scroller localScroller1 = this.c;
    boolean bool = localScroller1.computeScrollOffset();
    int i1;
    int i2;
    int i3;
    int i4;
    if (bool)
    {
      i1 = this.d;
      i2 = this.e;
      Scroller localScroller2 = this.c;
      i3 = localScroller2.getCurrX();
      Scroller localScroller3 = this.c;
      i4 = localScroller3.getCurrY();
      int i5 = getChildCount();
      if (i5 <= 0) {
        break label181;
      }
      View localView = getChildAt(0);
      int i6 = getWidth();
      int i7 = localView.getWidth();
      i3 = b(i3, i6, i7);
      this.d = i3;
      i3 = getHeight();
      i5 = localView.getHeight();
      i3 = b(i4, i3, i5);
    }
    for (this.e = i3;; this.e = i4)
    {
      i3 = this.d;
      if (i1 == i3)
      {
        i3 = this.e;
        if (i2 == i3) {}
      }
      else
      {
        i3 = this.d;
        i4 = this.e;
        onScrollChanged(i3, i4, i1, i2);
      }
      postInvalidate();
      return;
      label181:
      this.d = i3;
    }
  }
  
  protected int computeVerticalScrollRange()
  {
    int i1 = getChildCount();
    if (i1 == 0) {}
    View localView;
    for (i1 = getHeight();; i1 = localView.getBottom())
    {
      return i1;
      localView = getChildAt(0);
    }
  }
  
  public void d(int paramInt)
  {
    int i1 = 1;
    int i2 = getWidth();
    int i3 = getChildCount() + -1;
    int i6 = getChildAt(i3).getRight();
    Scroller localScroller = this.c;
    int i7 = this.d;
    int i8 = this.e;
    int i9 = i6 - i2;
    i2 = paramInt;
    i6 = 0;
    localScroller.fling(i7, i8, paramInt, 0, 0, 0, 0, i9);
    Object localObject;
    if (paramInt > 0)
    {
      i3 = i1;
      i7 = this.c.getFinalX();
      View localView = findFocus();
      localObject = a(i3, i7, localView);
      if (localObject == null) {
        localObject = this;
      }
      localView = findFocus();
      if (localObject != localView) {
        if (i3 == 0) {
          break label174;
        }
      }
    }
    label174:
    int i5;
    for (int i4 = 130;; i5 = 33)
    {
      boolean bool = ((View)localObject).requestFocus(i4);
      if (bool)
      {
        this.f = i1;
        this.f = false;
      }
      invalidate();
      return;
      bool = false;
      localScroller = null;
      break;
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    if (bool) {}
    for (bool = true;; bool = a(paramKeyEvent)) {
      return bool;
    }
  }
  
  public void e(int paramInt)
  {
    int i1 = 1;
    int i2 = getHeight();
    int i3 = getChildCount() + -1;
    int i6 = getChildAt(i3).getBottom();
    Scroller localScroller = this.c;
    int i7 = this.d;
    int i8 = this.e;
    int i9 = i6 - i2;
    i2 = paramInt;
    i6 = 0;
    localScroller.fling(i7, i8, 0, paramInt, 0, 0, 0, i9);
    Object localObject;
    if (paramInt > 0)
    {
      i3 = i1;
      i7 = this.c.getFinalY();
      View localView = findFocus();
      localObject = b(i3, i7, localView);
      if (localObject == null) {
        localObject = this;
      }
      localView = findFocus();
      if (localObject != localView) {
        if (i3 == 0) {
          break label174;
        }
      }
    }
    label174:
    int i5;
    for (int i4 = 130;; i5 = 33)
    {
      boolean bool = ((View)localObject).requestFocus(i4);
      if (bool)
      {
        this.f = i1;
        this.f = false;
      }
      invalidate();
      return;
      bool = false;
      localScroller = null;
      break;
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
      float f2 = 0.0F;
      View localView = getChildAt(0);
      int i2 = localView.getBottom();
      int i3 = this.e;
      i2 -= i3;
      i3 = getHeight();
      i2 -= i3;
      if (i2 < i1)
      {
        f2 = i2;
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
  
  protected float getLeftFadingEdgeStrength()
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
      i1 = getHorizontalFadingEdgeLength();
      int i2 = this.d;
      if (i2 < i1)
      {
        i2 = this.d;
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
  
  public int getMaxScrollAmountX()
  {
    int i1 = getRight();
    int i2 = getLeft();
    float f1 = i1 - i2;
    return (int)(0.5F * f1);
  }
  
  public int getMaxScrollAmountY()
  {
    int i1 = getBottom();
    int i2 = getTop();
    float f1 = i1 - i2;
    return (int)(0.5F * f1);
  }
  
  protected float getRightFadingEdgeStrength()
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
      i1 = getHorizontalFadingEdgeLength();
      float f2 = 0.0F;
      View localView = getChildAt(0);
      int i2 = localView.getRight();
      int i3 = this.d;
      i2 -= i3;
      i3 = getWidth();
      i2 -= i3;
      if (i2 < i1)
      {
        f2 = i2;
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
      int i2 = this.e;
      if (i2 < i1)
      {
        i2 = this.e;
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
  
  protected void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
    int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    paramView.measure(i1, i2);
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = localMarginLayoutParams.leftMargin;
    int i2 = localMarginLayoutParams.rightMargin;
    i1 = View.MeasureSpec.makeMeasureSpec(i1 + i2, 0);
    i2 = localMarginLayoutParams.topMargin;
    int i3 = View.MeasureSpec.makeMeasureSpec(localMarginLayoutParams.bottomMargin + i2, 0);
    paramView.measure(i1, i3);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    int i1 = paramMotionEvent.getAction();
    int i3 = 2;
    float f2 = 2.8E-45F;
    boolean bool4;
    if (i1 == i3)
    {
      bool4 = this.k;
      if (!bool4)
      {
        bool4 = this.l;
        if (!bool4) {
          break label49;
        }
      }
    }
    for (;;)
    {
      return bool1;
      label49:
      bool4 = b();
      if (!bool4) {
        this.k = false;
      }
      bool4 = c();
      if (!bool4) {
        this.l = false;
      }
      bool4 = c();
      if (bool4) {
        break;
      }
      bool4 = b();
      if (bool4) {
        break;
      }
      bool1 = false;
      f1 = 0.0F;
    }
    f2 = paramMotionEvent.getX();
    float f3 = paramMotionEvent.getY();
    switch (i1)
    {
    }
    for (;;)
    {
      boolean bool2 = this.k;
      if (bool2) {
        break;
      }
      bool2 = this.l;
      if (bool2) {
        break;
      }
      bool1 = false;
      f1 = 0.0F;
      break;
      float f4 = this.g;
      f4 = Math.abs(f2 - f4);
      int i2 = (int)f4;
      int i4 = ViewConfiguration.getTouchSlop();
      if (i2 > i4) {
        this.k = bool1;
      }
      f4 = this.h;
      f4 = Math.abs(f3 - f4);
      i2 = (int)f4;
      i4 = ViewConfiguration.getTouchSlop();
      if (i2 > i4)
      {
        this.l = bool1;
        continue;
        this.g = f2;
        this.h = f3;
        Scroller localScroller = this.c;
        boolean bool3 = localScroller.isFinished();
        if (bool3)
        {
          bool3 = false;
          localScroller = null;
          f4 = 0.0F;
          label303:
          this.k = bool3;
          localScroller = this.c;
          bool3 = localScroller.isFinished();
          if (!bool3) {
            break label354;
          }
          bool3 = false;
          localScroller = null;
        }
        for (f4 = 0.0F;; f4 = f1)
        {
          this.l = bool3;
          break;
          bool3 = bool1;
          f4 = f1;
          break label303;
          label354:
          bool3 = bool1;
        }
        this.k = false;
        this.l = false;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    boolean bool = false;
    this.i = false;
    View localView = this.j;
    if (localView != null)
    {
      localView = this.j;
      bool = a(localView, this);
      if (bool)
      {
        localView = this.j;
        b(localView);
      }
    }
    this.j = null;
    int i1 = this.d;
    int i2 = this.e;
    scrollTo(i1, i2);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1073741824;
    super.onMeasure(paramInt1, paramInt2);
    boolean bool1 = this.n;
    if (!bool1)
    {
      bool1 = this.o;
      if (bool1) {}
    }
    for (;;)
    {
      return;
      int i2 = View.MeasureSpec.getMode(paramInt1);
      int i4 = View.MeasureSpec.getMode(paramInt2);
      if ((i4 != 0) || (i2 != 0))
      {
        View localView = getChildAt(0);
        int i6 = getMeasuredWidth();
        int i7 = getMeasuredHeight();
        int i8 = localView.getMeasuredWidth();
        if (i8 < i6)
        {
          i8 = localView.getMeasuredHeight();
          if ((i8 < i7) && (i4 != 0) && (i2 != 0))
          {
            boolean bool4 = this.n;
            if (bool4)
            {
              bool4 = this.o;
              if (bool4)
              {
                i2 = getPaddingLeft();
                i2 = i6 - i2;
                i4 = getPaddingRight();
                i2 = View.MeasureSpec.makeMeasureSpec(i2 - i4, i1);
                i4 = getPaddingTop();
                i4 = i7 - i4;
                i6 = getPaddingBottom();
                i4 = View.MeasureSpec.makeMeasureSpec(i4 - i6, i1);
                localView.measure(i2, i4);
                continue;
              }
            }
          }
        }
        int i9 = localView.getMeasuredHeight();
        FrameLayout.LayoutParams localLayoutParams;
        if ((i9 < i7) && (i4 != 0))
        {
          boolean bool3 = this.o;
          if (bool3)
          {
            localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
            i5 = getPaddingLeft();
            i6 = getPaddingRight();
            i5 += i6;
            i2 = localLayoutParams.width;
            i2 = getChildMeasureSpec(paramInt1, i5, i2);
            i5 = getPaddingTop();
            i5 = i7 - i5;
            i6 = getPaddingBottom();
            i5 = View.MeasureSpec.makeMeasureSpec(i5 - i6, i1);
            localView.measure(i2, i5);
            continue;
          }
        }
        int i5 = localView.getMeasuredWidth();
        if ((i5 < i6) && (i2 != 0))
        {
          boolean bool2 = this.n;
          if (bool2)
          {
            localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
            i5 = getPaddingTop();
            i7 = getPaddingBottom();
            i5 += i7;
            int i3 = localLayoutParams.height;
            i3 = getChildMeasureSpec(paramInt2, i5, i3);
            i5 = getPaddingLeft();
            i5 = i6 - i5;
            i6 = getPaddingRight();
            i5 = View.MeasureSpec.makeMeasureSpec(i5 - i6, i1);
            localView.measure(i5, i3);
          }
        }
      }
    }
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
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = findFocus();
    if ((localObject == null) || (this == localObject)) {}
    for (;;)
    {
      return;
      int i1 = getRight();
      int i3 = getLeft();
      i1 -= i3;
      i3 = getBottom();
      int i4 = getTop();
      i3 -= i4;
      boolean bool1 = a((View)localObject, i1);
      Rect localRect;
      if (bool1)
      {
        localRect = this.b;
        ((View)localObject).getDrawingRect(localRect);
        localRect = this.b;
        offsetDescendantRectToMyCoords((View)localObject, localRect);
        localRect = this.b;
        int i2 = a(localRect);
        f(i2);
      }
      boolean bool2 = b((View)localObject, i3);
      if (bool2)
      {
        localRect = this.b;
        ((View)localObject).getDrawingRect(localRect);
        localRect = this.b;
        offsetDescendantRectToMyCoords((View)localObject, localRect);
        localObject = this.b;
        int i5 = b((Rect)localObject);
        g(i5);
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    Object localObject = null;
    int i2 = paramMotionEvent.getAction();
    if (i2 == 0)
    {
      i2 = paramMotionEvent.getEdgeFlags();
      if (i2 == 0) {}
    }
    boolean bool2;
    do
    {
      return bool1;
      bool2 = b();
      if (bool2) {
        break;
      }
      bool2 = c();
    } while (!bool2);
    VelocityTracker localVelocityTracker = this.m;
    if (localVelocityTracker == null)
    {
      localVelocityTracker = VelocityTracker.obtain();
      this.m = localVelocityTracker;
    }
    localVelocityTracker = this.m;
    localVelocityTracker.addMovement(paramMotionEvent);
    int i3 = paramMotionEvent.getAction();
    float f2 = paramMotionEvent.getX();
    float f3 = paramMotionEvent.getY();
    switch (i3)
    {
    }
    for (;;)
    {
      bool1 = true;
      f1 = Float.MIN_VALUE;
      break;
      localObject = this.c;
      bool1 = ((Scroller)localObject).isFinished();
      if (!bool1)
      {
        localObject = this.c;
        ((Scroller)localObject).abortAnimation();
      }
      this.g = f2;
      this.h = f3;
      continue;
      float f4 = this.g - f2;
      i3 = (int)f4;
      this.g = f2;
      f2 = this.h - f3;
      int i4 = (int)f2;
      this.h = f3;
      int i5;
      if (i3 < 0)
      {
        i5 = this.d;
        if (i5 >= 0) {
          scrollBy(i3, 0);
        }
      }
      int i6;
      for (;;)
      {
        if (i4 >= 0) {
          break label353;
        }
        i3 = this.e;
        if (i3 < 0) {
          break;
        }
        scrollBy(0, i4);
        break;
        if (i3 > 0)
        {
          i5 = getWidth();
          i6 = getPaddingRight();
          i5 -= i6;
          View localView1 = getChildAt(0);
          i6 = localView1.getRight();
          int i7 = this.d;
          i6 -= i7;
          i5 = i6 - i5;
          if (i5 > 0)
          {
            i3 = Math.min(i5, i3);
            scrollBy(i3, 0);
          }
        }
      }
      label353:
      if (i4 > 0)
      {
        i3 = getHeight();
        i5 = getPaddingBottom();
        i3 -= i5;
        View localView2 = getChildAt(0);
        i5 = localView2.getBottom();
        i6 = this.e;
        i5 -= i6;
        i3 = i5 - i3;
        if (i3 > 0)
        {
          i3 = Math.min(i3, i4);
          scrollBy(0, i3);
          continue;
          localObject = this.m;
          ((VelocityTracker)localObject).computeCurrentVelocity(1000);
          f4 = ((VelocityTracker)localObject).getXVelocity();
          i3 = (int)f4;
          f1 = ((VelocityTracker)localObject).getYVelocity();
          int i1 = (int)f1;
          i4 = Math.abs(i3);
          i5 = ViewConfiguration.getMinimumFlingVelocity();
          if (i4 > i5)
          {
            i4 = getChildCount();
            if (i4 > 0)
            {
              i3 = -i3;
              d(i3);
            }
          }
          i3 = Math.abs(i1);
          i4 = ViewConfiguration.getMinimumFlingVelocity();
          if (i3 > i4)
          {
            i3 = getChildCount();
            if (i3 > 0)
            {
              i1 = -i1;
              e(i1);
            }
          }
          localObject = this.m;
          if (localObject != null)
          {
            this.m.recycle();
            i1 = 0;
            f1 = 0.0F;
            localObject = null;
            this.m = null;
          }
        }
      }
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    boolean bool = this.f;
    if (!bool)
    {
      bool = this.i;
      if (bool) {
        break label30;
      }
      b(paramView2);
    }
    for (;;)
    {
      super.requestChildFocus(paramView1, paramView2);
      return;
      label30:
      this.j = paramView2;
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
  
  public void requestLayout()
  {
    this.i = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      View localView = getChildAt(0);
      int i2 = getWidth();
      int i3 = localView.getWidth();
      i2 = b(paramInt1, i2, i3);
      i3 = getHeight();
      i1 = localView.getHeight();
      i1 = b(paramInt2, i3, i1);
      i3 = this.d;
      if (i2 == i3)
      {
        i3 = this.e;
        if (i1 == i3) {}
      }
      else
      {
        super.scrollTo(i2, i1);
        this.d = i2;
        this.e = i1;
      }
    }
  }
  
  public void setFillViewportX(boolean paramBoolean)
  {
    boolean bool = this.n;
    if (paramBoolean != bool)
    {
      this.n = paramBoolean;
      requestLayout();
    }
  }
  
  public void setFillViewportY(boolean paramBoolean)
  {
    boolean bool = this.o;
    if (paramBoolean != bool)
    {
      this.o = paramBoolean;
      requestLayout();
    }
  }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\c\a\a\c\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */