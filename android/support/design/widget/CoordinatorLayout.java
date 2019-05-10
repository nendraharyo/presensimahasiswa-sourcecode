package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.b.a.b;
import android.support.b.a.c;
import android.support.v4.a.b;
import android.support.v4.h.i;
import android.support.v4.h.k.a;
import android.support.v4.h.k.c;
import android.support.v4.view.d;
import android.support.v4.view.m;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.support.v4.widget.f;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout
  extends ViewGroup
  implements m
{
  static final String a;
  static final Class[] b;
  static final ThreadLocal c;
  static final Comparator d;
  private static final k.a f;
  ViewGroup.OnHierarchyChangeListener e;
  private final List g;
  private final f h;
  private final List i;
  private final List j;
  private final int[] k;
  private Paint l;
  private boolean m;
  private boolean n;
  private int[] o;
  private View p;
  private View q;
  private CoordinatorLayout.f r;
  private boolean s;
  private z t;
  private boolean u;
  private Drawable v;
  private o w;
  private final n x;
  
  static
  {
    Object localObject = CoordinatorLayout.class.getPackage();
    int i1;
    if (localObject != null)
    {
      localObject = ((Package)localObject).getName();
      a = (String)localObject;
      i1 = Build.VERSION.SDK_INT;
      int i2 = 21;
      if (i1 < i2) {
        break label96;
      }
      localObject = new android/support/design/widget/CoordinatorLayout$g;
      ((CoordinatorLayout.g)localObject).<init>();
    }
    label96:
    for (d = (Comparator)localObject;; d = null)
    {
      localObject = new Class[2];
      localObject[0] = Context.class;
      localObject[1] = AttributeSet.class;
      b = (Class[])localObject;
      localObject = new java/lang/ThreadLocal;
      ((ThreadLocal)localObject).<init>();
      c = (ThreadLocal)localObject;
      localObject = new android/support/v4/h/k$c;
      ((k.c)localObject).<init>(12);
      f = (k.a)localObject;
      return;
      i1 = 0;
      localObject = null;
      break;
    }
  }
  
  public CoordinatorLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i1);
  }
  
  public CoordinatorLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.g = ((List)localObject1);
    localObject1 = new android/support/v4/widget/f;
    ((f)localObject1).<init>();
    this.h = ((f)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.i = ((List)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.j = ((List)localObject1);
    int i2 = 2;
    localObject1 = new int[i2];
    this.k = ((int[])localObject1);
    localObject1 = new android/support/v4/view/n;
    ((n)localObject1).<init>(this);
    this.x = ((n)localObject1);
    int i3;
    if (paramInt == 0)
    {
      localObject1 = a.c.CoordinatorLayout;
      i3 = a.b.Widget_Support_CoordinatorLayout;
    }
    for (localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, 0, i3);; localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, paramInt, 0))
    {
      i3 = a.c.CoordinatorLayout_keylines;
      i3 = ((TypedArray)localObject1).getResourceId(i3, 0);
      if (i3 == 0) {
        break;
      }
      Object localObject2 = paramContext.getResources();
      Object localObject3 = ((Resources)localObject2).getIntArray(i3);
      this.o = ((int[])localObject3);
      localObject3 = ((Resources)localObject2).getDisplayMetrics();
      float f1 = ((DisplayMetrics)localObject3).density;
      localObject2 = this.o;
      int i4 = localObject2.length;
      while (i1 < i4)
      {
        int[] arrayOfInt1 = this.o;
        int[] arrayOfInt2 = this.o;
        float f2 = arrayOfInt2[i1] * f1;
        int i5 = (int)f2;
        arrayOfInt1[i1] = i5;
        i1 += 1;
      }
      localObject1 = a.c.CoordinatorLayout;
    }
    i1 = a.c.CoordinatorLayout_statusBarBackground;
    localDrawable = ((TypedArray)localObject1).getDrawable(i1);
    this.v = localDrawable;
    ((TypedArray)localObject1).recycle();
    g();
    localObject1 = new android/support/design/widget/CoordinatorLayout$d;
    ((CoordinatorLayout.d)localObject1).<init>(this);
    super.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener)localObject1);
  }
  
  static CoordinatorLayout.b a(Context paramContext, AttributeSet paramAttributeSet, String paramString)
  {
    int i1 = 46;
    boolean bool1 = TextUtils.isEmpty(paramString);
    if (bool1)
    {
      bool1 = false;
      localObject1 = null;
      return (CoordinatorLayout.b)localObject1;
    }
    Object localObject1 = ".";
    bool1 = paramString.startsWith((String)localObject1);
    Object localObject2;
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = paramContext.getPackageName();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(paramString);
      paramString = ((StringBuilder)localObject1).toString();
    }
    for (;;)
    {
      try
      {
        localObject1 = c;
        localObject1 = ((ThreadLocal)localObject1).get();
        localObject1 = (Map)localObject1;
        if (localObject1 != null) {
          break label356;
        }
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>();
        localObject2 = c;
        ((ThreadLocal)localObject2).set(localObject1);
        localObject2 = localObject1;
        localObject1 = ((Map)localObject2).get(paramString);
        localObject1 = (Constructor)localObject1;
        if (localObject1 == null)
        {
          localObject1 = paramContext.getClassLoader();
          localObject1 = ((ClassLoader)localObject1).loadClass(paramString);
          localObject3 = b;
          localObject1 = ((Class)localObject1).getConstructor((Class[])localObject3);
          i1 = 1;
          ((Constructor)localObject1).setAccessible(i1);
          ((Map)localObject2).put(paramString, localObject1);
        }
        int i3 = 2;
        localObject2 = new Object[i3];
        c1 = '\000';
        localObject3 = null;
        localObject2[0] = paramContext;
        c1 = '\001';
        localObject2[c1] = paramAttributeSet;
        localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject2);
        localObject1 = (CoordinatorLayout.b)localObject1;
      }
      catch (Exception localException)
      {
        char c1;
        int i2;
        boolean bool2;
        localObject2 = new java/lang/RuntimeException;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = "Could not inflate Behavior subclass " + paramString;
        ((RuntimeException)localObject2).<init>((String)localObject3, localException);
        throw ((Throwable)localObject2);
      }
      i2 = paramString.indexOf(c1);
      if (i2 < 0)
      {
        localObject1 = a;
        bool2 = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool2)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = a;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(c1).append(paramString);
          paramString = ((StringBuilder)localObject1).toString();
          continue;
          label356:
          localObject2 = localException;
        }
      }
    }
  }
  
  private static void a(Rect paramRect)
  {
    paramRect.setEmpty();
    f.release(paramRect);
  }
  
  private void a(CoordinatorLayout.e parame, Rect paramRect, int paramInt1, int paramInt2)
  {
    int i1 = getWidth();
    int i2 = getHeight();
    int i3 = getPaddingLeft();
    int i4 = parame.leftMargin;
    i3 += i4;
    i4 = paramRect.left;
    int i5 = getPaddingRight();
    i1 = i1 - i5 - paramInt1;
    i5 = parame.rightMargin;
    i1 -= i5;
    i1 = Math.min(i4, i1);
    i1 = Math.max(i3, i1);
    i3 = getPaddingTop();
    i4 = parame.topMargin;
    i3 += i4;
    i4 = paramRect.top;
    i5 = getPaddingBottom();
    i2 = i2 - i5 - paramInt2;
    i5 = parame.bottomMargin;
    i2 -= i5;
    i2 = Math.min(i4, i2);
    i2 = Math.max(i3, i2);
    i3 = i1 + paramInt1;
    i4 = i2 + paramInt2;
    paramRect.set(i1, i2, i3, i4);
  }
  
  private void a(View paramView, int paramInt1, Rect paramRect1, Rect paramRect2, CoordinatorLayout.e parame, int paramInt2, int paramInt3)
  {
    int i1 = d.a(e(parame.c), paramInt1);
    int i2 = d.a(c(parame.d), paramInt1);
    int i3 = i1 & 0x7;
    int i4 = i1 & 0x70;
    i1 = i2 & 0x7;
    int i5 = i2 & 0x70;
    switch (i1)
    {
    default: 
      i2 = paramRect1.left;
      switch (i5)
      {
      default: 
        i1 = paramRect1.top;
        switch (i3)
        {
        default: 
          i2 -= paramInt2;
        case 5: 
          label126:
          switch (i4)
          {
          default: 
            label163:
            i1 -= paramInt3;
          }
          break;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      i3 = i2 + paramInt2;
      i4 = i1 + paramInt3;
      paramRect2.set(i2, i1, i3, i4);
      return;
      i2 = paramRect1.right;
      break;
      i1 = paramRect1.left;
      i2 = paramRect1.width() / 2 + i1;
      break;
      i1 = paramRect1.bottom;
      break label126;
      i1 = paramRect1.top;
      i5 = paramRect1.height() / 2;
      i1 += i5;
      break label126;
      i3 = paramInt2 / 2;
      i2 -= i3;
      break label163;
      i3 = paramInt3 / 2;
      i1 -= i3;
    }
  }
  
  private void a(View paramView, Rect paramRect, int paramInt)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool1 = android.support.v4.view.r.w(paramView);
    if (!bool1) {}
    int i2;
    Object localObject1;
    Object localObject2;
    Rect localRect1;
    int i4;
    for (;;)
    {
      return;
      i2 = paramView.getWidth();
      if (i2 > 0)
      {
        i2 = paramView.getHeight();
        if (i2 > 0)
        {
          localObject1 = (CoordinatorLayout.e)paramView.getLayoutParams();
          localObject2 = ((CoordinatorLayout.e)localObject1).b();
          localRect1 = e();
          Rect localRect2 = e();
          i3 = paramView.getLeft();
          i4 = paramView.getTop();
          int i5 = paramView.getRight();
          int i6 = paramView.getBottom();
          localRect2.set(i3, i4, i5, i6);
          if (localObject2 != null)
          {
            bool2 = ((CoordinatorLayout.b)localObject2).a(this, paramView, localRect1);
            if (bool2)
            {
              bool2 = localRect2.contains(localRect1);
              if (bool2) {
                break label222;
              }
              localObject1 = new java/lang/IllegalArgumentException;
              Object localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append("Rect should be within the child's bounds. Rect:");
              localObject2 = localRect1.toShortString();
              localObject3 = ((StringBuilder)localObject3).append((String)localObject2).append(" | Bounds:");
              localObject2 = localRect2.toShortString();
              localObject3 = (String)localObject2;
              ((IllegalArgumentException)localObject1).<init>((String)localObject3);
              throw ((Throwable)localObject1);
            }
          }
          localRect1.set(localRect2);
          label222:
          a(localRect2);
          boolean bool2 = localRect1.isEmpty();
          if (!bool2) {
            break;
          }
          a(localRect1);
        }
      }
    }
    int i8 = d.a(((CoordinatorLayout.e)localObject1).h, paramInt);
    int i7 = i8 & 0x30;
    int i3 = 48;
    if (i7 == i3)
    {
      i7 = localRect1.top;
      i3 = ((CoordinatorLayout.e)localObject1).topMargin;
      i7 -= i3;
      i3 = ((CoordinatorLayout.e)localObject1).j;
      i7 -= i3;
      i3 = paramRect.top;
      if (i7 < i3)
      {
        i3 = paramRect.top;
        i7 = i3 - i7;
        f(paramView, i7);
        i7 = i1;
      }
    }
    for (;;)
    {
      i3 = i8 & 0x50;
      i4 = 80;
      if (i3 == i4)
      {
        i3 = getHeight();
        i4 = localRect1.bottom;
        i3 -= i4;
        i4 = ((CoordinatorLayout.e)localObject1).bottomMargin;
        i3 -= i4;
        i4 = ((CoordinatorLayout.e)localObject1).j;
        i3 += i4;
        i4 = paramRect.bottom;
        if (i3 < i4)
        {
          i7 = paramRect.bottom;
          i7 = i3 - i7;
          f(paramView, i7);
          i7 = i1;
        }
      }
      if (i7 == 0) {
        f(paramView, 0);
      }
      i7 = i8 & 0x3;
      i3 = 3;
      if (i7 == i3)
      {
        i7 = localRect1.left;
        i3 = ((CoordinatorLayout.e)localObject1).leftMargin;
        i7 -= i3;
        i3 = ((CoordinatorLayout.e)localObject1).i;
        i7 -= i3;
        i3 = paramRect.left;
        if (i7 < i3)
        {
          i3 = paramRect.left;
          i7 = i3 - i7;
          e(paramView, i7);
          i7 = i1;
        }
      }
      for (;;)
      {
        i8 &= 0x5;
        i3 = 5;
        if (i8 == i3)
        {
          i8 = getWidth();
          i3 = localRect1.right;
          i8 -= i3;
          i3 = ((CoordinatorLayout.e)localObject1).rightMargin;
          i8 -= i3;
          i2 = ((CoordinatorLayout.e)localObject1).i + i8;
          i8 = paramRect.right;
          if (i2 < i8)
          {
            i7 = paramRect.right;
            i2 -= i7;
            e(paramView, i2);
          }
        }
        for (i2 = i1;; i2 = i7)
        {
          if (i2 == 0) {
            e(paramView, 0);
          }
          a(localRect1);
          break;
        }
        i7 = 0;
        localObject2 = null;
      }
      i7 = 0;
      localObject2 = null;
    }
  }
  
  private void a(View paramView1, View paramView2, int paramInt)
  {
    CoordinatorLayout.e locale = (CoordinatorLayout.e)paramView1.getLayoutParams();
    Rect localRect1 = e();
    Rect localRect2 = e();
    try
    {
      a(paramView2, localRect1);
      a(paramView1, paramInt, localRect1, localRect2);
      int i1 = localRect2.left;
      int i2 = localRect2.top;
      int i3 = localRect2.right;
      int i4 = localRect2.bottom;
      paramView1.layout(i1, i2, i3, i4);
      return;
    }
    finally
    {
      a(localRect1);
      a(localRect2);
    }
  }
  
  private void a(List paramList)
  {
    paramList.clear();
    boolean bool = isChildrenDrawingOrderEnabled();
    int i1 = getChildCount();
    int i2 = i1 + -1;
    if (i2 >= 0)
    {
      if (bool) {}
      for (int i3 = getChildDrawingOrder(i1, i2);; i3 = i2)
      {
        localObject = getChildAt(i3);
        paramList.add(localObject);
        i2 += -1;
        break;
      }
    }
    Object localObject = d;
    if (localObject != null)
    {
      localObject = d;
      Collections.sort(paramList, (Comparator)localObject);
    }
  }
  
  private void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    Object localObject;
    int i4;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      localObject = (CoordinatorLayout.e)localView.getLayoutParams();
      CoordinatorLayout.b localb = ((CoordinatorLayout.e)localObject).b();
      if (localb != null)
      {
        long l1 = SystemClock.uptimeMillis();
        int i3 = 3;
        localObject = MotionEvent.obtain(l1, l1, i3, 0.0F, 0.0F, 0);
        if (!paramBoolean) {
          break label94;
        }
        localb.a(this, localView, (MotionEvent)localObject);
      }
      for (;;)
      {
        ((MotionEvent)localObject).recycle();
        i4 = i2 + 1;
        i2 = i4;
        break;
        label94:
        localb.b(this, localView, (MotionEvent)localObject);
      }
    }
    for (int i5 = 0; i5 < i1; i5 = i4)
    {
      localObject = (CoordinatorLayout.e)getChildAt(i5).getLayoutParams();
      ((CoordinatorLayout.e)localObject).f();
      i4 = i5 + 1;
    }
    this.p = null;
    this.m = false;
  }
  
  private boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    boolean bool1 = false;
    int i1 = 0;
    float f1 = 0.0F;
    int i2 = 0;
    float f2 = 0.0F;
    Object localObject1 = null;
    int i3 = paramMotionEvent.getActionMasked();
    List localList = this.i;
    a(localList);
    int i4 = localList.size();
    int i5 = 0;
    float f3 = 0.0F;
    Object localObject2 = null;
    int i6 = 0;
    Object localObject3;
    CoordinatorLayout.b localb;
    boolean bool3;
    if (i6 < i4)
    {
      localObject2 = localList.get(i6);
      localObject3 = localObject2;
      localObject3 = (View)localObject2;
      localObject2 = (CoordinatorLayout.e)((View)localObject3).getLayoutParams();
      localb = ((CoordinatorLayout.e)localObject2).b();
      if (((bool1) || (i1 != 0)) && (i3 != 0))
      {
        if (localb == null) {
          break label399;
        }
        if (localObject1 == null)
        {
          long l1 = SystemClock.uptimeMillis();
          int i7 = 3;
          localObject2 = MotionEvent.obtain(l1, l1, i7, 0.0F, 0.0F, 0);
          switch (paramInt)
          {
          }
          for (;;)
          {
            i2 = i1;
            f2 = f1;
            bool3 = bool1;
            label183:
            int i8 = i6 + 1;
            i6 = i8;
            i1 = i2;
            f1 = f2;
            bool1 = bool3;
            localObject1 = localObject2;
            break;
            localb.a(this, (View)localObject3, (MotionEvent)localObject2);
            continue;
            localb.b(this, (View)localObject3, (MotionEvent)localObject2);
          }
        }
      }
      else
      {
        if ((!bool1) && (localb != null)) {}
        switch (paramInt)
        {
        default: 
          label272:
          if (bool1) {
            this.p = ((View)localObject3);
          }
          bool3 = bool1;
          boolean bool4 = ((CoordinatorLayout.e)localObject2).e();
          boolean bool2 = ((CoordinatorLayout.e)localObject2).a(this, (View)localObject3);
          if ((bool2) && (!bool4))
          {
            i5 = 1;
            f3 = Float.MIN_VALUE;
            label319:
            if ((!bool2) || (i5 != 0)) {
              break label377;
            }
          }
          break;
        }
      }
    }
    for (;;)
    {
      localList.clear();
      return bool3;
      bool1 = localb.a(this, (View)localObject3, paramMotionEvent);
      break label272;
      bool1 = localb.b(this, (View)localObject3, paramMotionEvent);
      break label272;
      i5 = 0;
      f3 = 0.0F;
      localObject2 = null;
      break label319;
      label377:
      i2 = i5;
      f2 = f3;
      localObject2 = localObject1;
      break label183;
      localObject2 = localObject1;
      break;
      label399:
      localObject2 = localObject1;
      bool3 = bool1;
      i2 = i1;
      f2 = f1;
      break label183;
      bool3 = bool1;
    }
  }
  
  private int b(int paramInt)
  {
    int i1 = 0;
    int[] arrayOfInt = null;
    Object localObject1 = this.o;
    Object localObject2;
    String str;
    if (localObject1 == null)
    {
      localObject1 = "CoordinatorLayout";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("No keylines defined for ").append(this);
      str = " - attempted index lookup ";
      localObject2 = str + paramInt;
      Log.e((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return i1;
      if (paramInt >= 0)
      {
        localObject1 = this.o;
        int i2 = localObject1.length;
        if (paramInt < i2) {}
      }
      else
      {
        localObject1 = "CoordinatorLayout";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Keyline index ").append(paramInt);
        str = " out of range for ";
        localObject2 = str + this;
        Log.e((String)localObject1, (String)localObject2);
        continue;
      }
      arrayOfInt = this.o;
      i1 = arrayOfInt[paramInt];
    }
  }
  
  private z b(z paramz)
  {
    boolean bool1 = paramz.e();
    if (bool1) {
      return paramz;
    }
    bool1 = false;
    Object localObject1 = null;
    int i1 = getChildCount();
    int i2 = 0;
    Object localObject2 = paramz;
    label27:
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      bool1 = android.support.v4.view.r.p(localView);
      if (bool1)
      {
        localObject1 = ((CoordinatorLayout.e)localView.getLayoutParams()).b();
        if (localObject1 != null)
        {
          localObject1 = ((CoordinatorLayout.b)localObject1).a(this, localView, (z)localObject2);
          boolean bool2 = ((z)localObject1).e();
          if (!bool2) {
            break label97;
          }
        }
      }
    }
    for (;;)
    {
      paramz = (z)localObject1;
      break;
      localObject1 = localObject2;
      label97:
      int i3 = i2 + 1;
      i2 = i3;
      localObject2 = localObject1;
      break label27;
      localObject1 = localObject2;
    }
  }
  
  private void b(View paramView, int paramInt1, int paramInt2)
  {
    CoordinatorLayout.e locale = (CoordinatorLayout.e)paramView.getLayoutParams();
    int i1 = d.a(d(locale.c), paramInt2);
    int i2 = i1 & 0x7;
    int i3 = i1 & 0x70;
    int i4 = getWidth();
    int i5 = getHeight();
    int i6 = paramView.getMeasuredWidth();
    int i7 = paramView.getMeasuredHeight();
    i1 = 1;
    if (paramInt2 == i1) {
      paramInt1 = i4 - paramInt1;
    }
    int i8 = b(paramInt1) - i6;
    i1 = 0;
    switch (i2)
    {
    default: 
      switch (i3)
      {
      }
      break;
    }
    for (;;)
    {
      i2 = getPaddingLeft();
      i3 = locale.leftMargin;
      i2 += i3;
      i3 = getPaddingRight();
      i3 = i4 - i3 - i6;
      i4 = locale.rightMargin;
      i3 -= i4;
      i8 = Math.min(i8, i3);
      i8 = Math.max(i2, i8);
      i2 = getPaddingTop();
      i3 = locale.topMargin;
      i2 += i3;
      i3 = getPaddingBottom();
      i3 = i5 - i3 - i7;
      int i9 = locale.bottomMargin;
      i9 = i3 - i9;
      i9 = Math.min(i1, i9);
      i9 = Math.max(i2, i9);
      i1 = i8 + i6;
      i2 = i9 + i7;
      paramView.layout(i8, i9, i1, i2);
      return;
      i8 += i6;
      break;
      i2 = i6 / 2;
      i8 += i2;
      break;
      i1 = 0 + i7;
      continue;
      i2 = i7 / 2;
      i1 = 0 + i2;
    }
  }
  
  private static int c(int paramInt)
  {
    int i1 = paramInt & 0x7;
    if (i1 == 0) {}
    for (i1 = 0x800003 | paramInt;; i1 = paramInt)
    {
      int i2 = i1 & 0x70;
      if (i2 == 0) {
        i1 |= 0x30;
      }
      return i1;
    }
  }
  
  private static int d(int paramInt)
  {
    if (paramInt == 0) {
      paramInt = 8388661;
    }
    return paramInt;
  }
  
  private void d(View paramView, int paramInt)
  {
    CoordinatorLayout.e locale = (CoordinatorLayout.e)paramView.getLayoutParams();
    Rect localRect1 = e();
    int i1 = getPaddingLeft();
    int i3 = locale.leftMargin;
    i1 += i3;
    i3 = getPaddingTop();
    int i4 = locale.topMargin;
    i3 += i4;
    i4 = getWidth();
    int i5 = getPaddingRight();
    i4 -= i5;
    i5 = locale.rightMargin;
    i4 -= i5;
    i5 = getHeight();
    int i6 = getPaddingBottom();
    i5 -= i6;
    i6 = locale.bottomMargin;
    i5 -= i6;
    localRect1.set(i1, i3, i4, i5);
    z localz1 = this.t;
    if (localz1 != null)
    {
      boolean bool = android.support.v4.view.r.p(this);
      if (bool)
      {
        bool = android.support.v4.view.r.p(paramView);
        if (!bool)
        {
          i2 = localRect1.left;
          i3 = this.t.a();
          i2 += i3;
          localRect1.left = i2;
          i2 = localRect1.top;
          i3 = this.t.b();
          i2 += i3;
          localRect1.top = i2;
          i2 = localRect1.right;
          i3 = this.t.c();
          i2 -= i3;
          localRect1.right = i2;
          i2 = localRect1.bottom;
          z localz2 = this.t;
          i3 = localz2.d();
          i2 -= i3;
          localRect1.bottom = i2;
        }
      }
    }
    Rect localRect2 = e();
    int i7 = c(locale.c);
    int i2 = paramView.getMeasuredWidth();
    i3 = paramView.getMeasuredHeight();
    i5 = paramInt;
    d.a(i7, i2, i3, localRect1, localRect2, paramInt);
    i7 = localRect2.left;
    i2 = localRect2.top;
    i3 = localRect2.right;
    i5 = localRect2.bottom;
    paramView.layout(i7, i2, i3, i5);
    a(localRect1);
    a(localRect2);
  }
  
  private static int e(int paramInt)
  {
    if (paramInt == 0) {
      paramInt = 17;
    }
    return paramInt;
  }
  
  private static Rect e()
  {
    Rect localRect = (Rect)f.acquire();
    if (localRect == null)
    {
      localRect = new android/graphics/Rect;
      localRect.<init>();
    }
    return localRect;
  }
  
  private void e(View paramView, int paramInt)
  {
    CoordinatorLayout.e locale = (CoordinatorLayout.e)paramView.getLayoutParams();
    int i1 = locale.i;
    if (i1 != paramInt)
    {
      i1 = locale.i;
      i1 = paramInt - i1;
      android.support.v4.view.r.d(paramView, i1);
      locale.i = paramInt;
    }
  }
  
  private boolean e(View paramView)
  {
    return this.h.e(paramView);
  }
  
  private void f()
  {
    ArrayList localArrayList = null;
    this.g.clear();
    Object localObject = this.h;
    ((f)localObject).a();
    int i1 = getChildCount();
    int i3;
    for (int i2 = 0; i2 < i1; i2 = i3)
    {
      View localView1 = getChildAt(i2);
      CoordinatorLayout.e locale = a(localView1);
      locale.b(this, localView1);
      this.h.a(localView1);
      i3 = 0;
      localObject = null;
      if (i3 < i1)
      {
        if (i3 == i2) {}
        for (;;)
        {
          i3 += 1;
          break;
          View localView2 = getChildAt(i3);
          boolean bool = locale.a(this, localView1, localView2);
          if (bool)
          {
            f localf = this.h;
            bool = localf.b(localView2);
            if (!bool)
            {
              localf = this.h;
              localf.a(localView2);
            }
            localf = this.h;
            localf.a(localView2, localView1);
          }
        }
      }
      i3 = i2 + 1;
    }
    localObject = this.g;
    localArrayList = this.h.b();
    ((List)localObject).addAll(localArrayList);
    Collections.reverse(this.g);
  }
  
  private void f(View paramView, int paramInt)
  {
    CoordinatorLayout.e locale = (CoordinatorLayout.e)paramView.getLayoutParams();
    int i1 = locale.j;
    if (i1 != paramInt)
    {
      i1 = locale.j;
      i1 = paramInt - i1;
      android.support.v4.view.r.c(paramView, i1);
      locale.j = paramInt;
    }
  }
  
  private void g()
  {
    int i1 = Build.VERSION.SDK_INT;
    int i3 = 21;
    if (i1 < i3) {}
    for (;;)
    {
      return;
      boolean bool = android.support.v4.view.r.p(this);
      Object localObject;
      int i2;
      if (bool)
      {
        localObject = this.w;
        if (localObject == null)
        {
          localObject = new android/support/design/widget/CoordinatorLayout$1;
          ((CoordinatorLayout.1)localObject).<init>(this);
          this.w = ((o)localObject);
        }
        localObject = this.w;
        android.support.v4.view.r.a(this, (o)localObject);
        i2 = 1280;
        setSystemUiVisibility(i2);
      }
      else
      {
        i2 = 0;
        localObject = null;
        android.support.v4.view.r.a(this, null);
      }
    }
  }
  
  public CoordinatorLayout.e a(AttributeSet paramAttributeSet)
  {
    CoordinatorLayout.e locale = new android/support/design/widget/CoordinatorLayout$e;
    Context localContext = getContext();
    locale.<init>(localContext, paramAttributeSet);
    return locale;
  }
  
  CoordinatorLayout.e a(View paramView)
  {
    boolean bool1 = true;
    CoordinatorLayout.e locale = (CoordinatorLayout.e)paramView.getLayoutParams();
    boolean bool2 = locale.b;
    Object localObject1;
    if (!bool2)
    {
      bool2 = paramView instanceof CoordinatorLayout.a;
      if (!bool2) {
        break label81;
      }
      paramView = (CoordinatorLayout.a)paramView;
      localObject1 = paramView.a();
      if (localObject1 == null)
      {
        localObject2 = "CoordinatorLayout";
        localObject3 = "Attached behavior class is null";
        Log.e((String)localObject2, (String)localObject3);
      }
      locale.a((CoordinatorLayout.b)localObject1);
    }
    for (locale.b = bool1;; locale.b = bool1)
    {
      return locale;
      label81:
      localObject2 = paramView.getClass();
      bool2 = false;
      localObject1 = null;
      while (localObject2 != null)
      {
        localObject1 = (CoordinatorLayout.c)((Class)localObject2).getAnnotation(CoordinatorLayout.c.class);
        if (localObject1 != null) {
          break;
        }
        localObject2 = ((Class)localObject2).getSuperclass();
      }
      localObject2 = localObject1;
      if (localObject1 != null) {}
      try
      {
        localObject1 = ((CoordinatorLayout.c)localObject1).a();
        localObject3 = null;
        localObject3 = new Class[0];
        localObject1 = ((Class)localObject1).getDeclaredConstructor((Class[])localObject3);
        localObject3 = null;
        localObject3 = new Object[0];
        localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject3);
        localObject1 = (CoordinatorLayout.b)localObject1;
        locale.a((CoordinatorLayout.b)localObject1);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localObject3 = "CoordinatorLayout";
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          String str = "Default behavior class ";
          localObject4 = ((StringBuilder)localObject4).append(str);
          localObject2 = ((CoordinatorLayout.c)localObject2).a().getName();
          localObject2 = ((StringBuilder)localObject4).append((String)localObject2).append(" could not be instantiated. Did you forget");
          localObject4 = " a default constructor?";
          localObject2 = (String)localObject4;
          Log.e((String)localObject3, (String)localObject2, localException);
        }
      }
    }
  }
  
  protected CoordinatorLayout.e a(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof CoordinatorLayout.e;
    CoordinatorLayout.e locale;
    if (bool)
    {
      locale = new android/support/design/widget/CoordinatorLayout$e;
      paramLayoutParams = (CoordinatorLayout.e)paramLayoutParams;
      locale.<init>(paramLayoutParams);
    }
    for (;;)
    {
      return locale;
      bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
      if (bool)
      {
        locale = new android/support/design/widget/CoordinatorLayout$e;
        paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
        locale.<init>(paramLayoutParams);
      }
      else
      {
        locale = new android/support/design/widget/CoordinatorLayout$e;
        locale.<init>(paramLayoutParams);
      }
    }
  }
  
  final z a(z paramz)
  {
    int i1 = 1;
    Object localObject = this.t;
    boolean bool1 = i.a(localObject, paramz);
    boolean bool2;
    if (!bool1)
    {
      this.t = paramz;
      if (paramz == null) {
        break label85;
      }
      int i2 = paramz.b();
      if (i2 <= 0) {
        break label85;
      }
      i2 = i1;
      this.u = i2;
      bool2 = this.u;
      if (bool2) {
        break label93;
      }
      localObject = getBackground();
      if (localObject != null) {
        break label93;
      }
    }
    for (;;)
    {
      setWillNotDraw(i1);
      paramz = b(paramz);
      requestLayout();
      return paramz;
      label85:
      bool2 = false;
      localObject = null;
      break;
      label93:
      i1 = 0;
    }
  }
  
  void a()
  {
    boolean bool1 = false;
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool2;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      boolean bool3 = e(localView);
      if (bool3) {
        bool1 = true;
      }
    }
    else
    {
      bool2 = this.s;
      if (bool1 != bool2)
      {
        if (!bool1) {
          break label62;
        }
        b();
      }
    }
    for (;;)
    {
      return;
      int i3;
      bool2 += true;
      break;
      label62:
      c();
    }
  }
  
  final void a(int paramInt)
  {
    int i1 = 1;
    int i2 = android.support.v4.view.r.e(this);
    Object localObject1 = this.g;
    int i3 = ((List)localObject1).size();
    Rect localRect1 = e();
    Rect localRect2 = e();
    Rect localRect3 = e();
    int i4 = 0;
    while (i4 < i3)
    {
      localObject1 = (View)this.g.get(i4);
      Object localObject2 = (CoordinatorLayout.e)((View)localObject1).getLayoutParams();
      if (paramInt == 0)
      {
        i5 = ((View)localObject1).getVisibility();
        i7 = 8;
        if (i5 == i7)
        {
          int i8 = i4 + 1;
          i4 = i8;
          continue;
        }
      }
      Object localObject3;
      Object localObject4;
      for (int i7 = 0; i7 < i4; i7 = i5)
      {
        localObject3 = (View)this.g.get(i7);
        localObject4 = ((CoordinatorLayout.e)localObject2).l;
        if (localObject4 == localObject3) {
          b((View)localObject1, i2);
        }
        i5 = i7 + 1;
      }
      a((View)localObject1, i1, localRect2);
      int i5 = ((CoordinatorLayout.e)localObject2).g;
      int i6;
      if (i5 != 0)
      {
        boolean bool1 = localRect2.isEmpty();
        if (!bool1)
        {
          i6 = d.a(((CoordinatorLayout.e)localObject2).g, i2);
          i7 = i6 & 0x70;
          switch (i7)
          {
          default: 
            label248:
            i6 &= 0x7;
            switch (i6)
            {
            }
            break;
          }
        }
      }
      for (;;)
      {
        int i9 = ((CoordinatorLayout.e)localObject2).h;
        if (i9 != 0)
        {
          i9 = ((View)localObject1).getVisibility();
          if (i9 == 0) {
            a((View)localObject1, localRect1, i2);
          }
        }
        i9 = 2;
        if (paramInt != i9)
        {
          c((View)localObject1, localRect3);
          boolean bool2 = localRect3.equals(localRect2);
          if (bool2) {
            break;
          }
          b((View)localObject1, localRect2);
        }
        int i10 = i4 + 1;
        for (i7 = i10; i7 < i3; i7 = i10)
        {
          localObject2 = (View)this.g.get(i7);
          localObject3 = (CoordinatorLayout.e)((View)localObject2).getLayoutParams();
          localObject4 = ((CoordinatorLayout.e)localObject3).b();
          if (localObject4 != null)
          {
            boolean bool4 = ((CoordinatorLayout.b)localObject4).a(this, (View)localObject2, (View)localObject1);
            if (bool4)
            {
              if (paramInt != 0) {
                break label620;
              }
              bool4 = ((CoordinatorLayout.e)localObject3).g();
              if (!bool4) {
                break label620;
              }
              ((CoordinatorLayout.e)localObject3).h();
            }
          }
          i10 = i7 + 1;
        }
        i7 = localRect1.top;
        int i13 = localRect2.bottom;
        i7 = Math.max(i7, i13);
        localRect1.top = i7;
        break label248;
        i7 = localRect1.bottom;
        i13 = getHeight();
        int i12 = localRect2.top;
        i13 -= i12;
        i7 = Math.max(i7, i13);
        localRect1.bottom = i7;
        break label248;
        i6 = localRect1.left;
        i7 = localRect2.right;
        i6 = Math.max(i6, i7);
        localRect1.left = i6;
        continue;
        i6 = localRect1.right;
        i7 = getWidth();
        i13 = localRect2.left;
        i7 -= i13;
        i6 = Math.max(i6, i7);
        localRect1.right = i6;
      }
      label620:
      switch (paramInt)
      {
      }
      int i11;
      for (boolean bool3 = ((CoordinatorLayout.b)localObject4).b(this, (View)localObject2, (View)localObject1); paramInt == i1; i11 = i1)
      {
        ((CoordinatorLayout.e)localObject3).a(bool3);
        break;
        ((CoordinatorLayout.b)localObject4).d(this, (View)localObject2, (View)localObject1);
      }
    }
    a(localRect1);
    a(localRect2);
    a(localRect3);
  }
  
  public void a(View paramView, int paramInt)
  {
    Object localObject = (CoordinatorLayout.e)paramView.getLayoutParams();
    boolean bool = ((CoordinatorLayout.e)localObject).d();
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
      throw ((Throwable)localObject);
    }
    View localView = ((CoordinatorLayout.e)localObject).k;
    if (localView != null)
    {
      localObject = ((CoordinatorLayout.e)localObject).k;
      a(paramView, (View)localObject, paramInt);
    }
    for (;;)
    {
      return;
      int i1 = ((CoordinatorLayout.e)localObject).e;
      if (i1 >= 0)
      {
        int i2 = ((CoordinatorLayout.e)localObject).e;
        b(paramView, i2, paramInt);
      }
      else
      {
        d(paramView, paramInt);
      }
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i1 = getChildCount();
    int i2 = 0;
    float f1 = 0.0F;
    int i3 = 0;
    float f2 = 0.0F;
    Object localObject = null;
    int i4 = 0;
    View localView;
    if (i4 < i1)
    {
      localView = getChildAt(i4);
      i3 = localView.getVisibility();
      int i5 = 8;
      if (i3 == i5)
      {
        i3 = i2;
        f2 = f1;
      }
    }
    for (;;)
    {
      i4 += 1;
      i2 = i3;
      f1 = f2;
      break;
      localObject = (CoordinatorLayout.e)localView.getLayoutParams();
      boolean bool = ((CoordinatorLayout.e)localObject).b(paramInt5);
      if (!bool)
      {
        i3 = i2;
        f2 = f1;
      }
      else
      {
        localObject = ((CoordinatorLayout.e)localObject).b();
        if (localObject != null)
        {
          ((CoordinatorLayout.b)localObject).a(this, localView, paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
          i3 = 1;
          f2 = Float.MIN_VALUE;
          continue;
          if (i2 != 0)
          {
            i3 = 1;
            f2 = Float.MIN_VALUE;
            a(i3);
          }
        }
        else
        {
          i3 = i2;
          f2 = f1;
        }
      }
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int i4 = getChildCount();
    int i5 = 0;
    float f2 = 0.0F;
    Object localObject2 = null;
    int i6 = 0;
    View localView;
    int i7;
    int i8;
    if (i6 < i4)
    {
      localView = getChildAt(i6);
      i5 = localView.getVisibility();
      i7 = 8;
      if (i5 == i7)
      {
        i5 = i3;
        f2 = f1;
        i8 = i1;
        i3 = i2;
      }
    }
    for (;;)
    {
      i7 = i6 + 1;
      i6 = i7;
      i2 = i3;
      i1 = i8;
      i3 = i5;
      f1 = f2;
      break;
      localObject2 = (CoordinatorLayout.e)localView.getLayoutParams();
      boolean bool = ((CoordinatorLayout.e)localObject2).b(paramInt3);
      if (!bool)
      {
        i5 = i3;
        f2 = f1;
        i8 = i1;
        i3 = i2;
      }
      else
      {
        localObject2 = ((CoordinatorLayout.e)localObject2).b();
        if (localObject2 != null)
        {
          localObject1 = this.k;
          bool = false;
          int[] arrayOfInt1 = this.k;
          arrayOfInt1[1] = 0;
          localObject1[0] = 0;
          int[] arrayOfInt2 = this.k;
          localObject1 = this;
          ((CoordinatorLayout.b)localObject2).a(this, localView, paramView, paramInt1, paramInt2, arrayOfInt2, paramInt3);
          if (paramInt1 > 0)
          {
            localObject2 = this.k;
            i3 = 0;
            f1 = 0.0F;
            localObject1 = null;
            i5 = localObject2[0];
            i8 = Math.max(i1, i5);
            label249:
            if (paramInt2 <= 0) {
              break label337;
            }
            localObject2 = this.k;
            i3 = 1;
            f1 = Float.MIN_VALUE;
            i5 = localObject2[i3];
          }
          for (i5 = Math.max(i2, i5);; i5 = Math.min(i2, i5))
          {
            f1 = Float.MIN_VALUE;
            int i9 = 1;
            i3 = i5;
            i5 = i9;
            f2 = f1;
            break;
            localObject2 = this.k;
            i3 = 0;
            f1 = 0.0F;
            localObject1 = null;
            i5 = localObject2[0];
            i8 = Math.min(i1, i5);
            break label249;
            label337:
            localObject2 = this.k;
            i3 = 1;
            f1 = Float.MIN_VALUE;
            i5 = localObject2[i3];
          }
          localObject2 = null;
          paramArrayOfInt[0] = i1;
          i5 = 1;
          f2 = Float.MIN_VALUE;
          paramArrayOfInt[i5] = i2;
          if (i3 != 0)
          {
            i5 = 1;
            f2 = Float.MIN_VALUE;
            a(i5);
          }
          return;
        }
        i5 = i3;
        f2 = f1;
        i8 = i1;
        i3 = i2;
      }
    }
  }
  
  void a(View paramView, int paramInt, Rect paramRect1, Rect paramRect2)
  {
    CoordinatorLayout.e locale = (CoordinatorLayout.e)paramView.getLayoutParams();
    int i1 = paramView.getMeasuredWidth();
    int i2 = paramView.getMeasuredHeight();
    a(paramView, paramInt, paramRect1, paramRect2, locale, i1, i2);
    a(locale, paramRect2, i1, i2);
  }
  
  void a(View paramView, Rect paramRect)
  {
    android.support.v4.widget.r.b(this, paramView, paramRect);
  }
  
  void a(View paramView, boolean paramBoolean, Rect paramRect)
  {
    boolean bool = paramView.isLayoutRequested();
    int i1;
    int i2;
    if (!bool)
    {
      i1 = paramView.getVisibility();
      i2 = 8;
      if (i1 != i2) {}
    }
    else
    {
      paramRect.setEmpty();
    }
    for (;;)
    {
      return;
      if (paramBoolean)
      {
        a(paramView, paramRect);
      }
      else
      {
        i1 = paramView.getLeft();
        i2 = paramView.getTop();
        int i3 = paramView.getRight();
        int i4 = paramView.getBottom();
        paramRect.set(i1, i2, i3, i4);
      }
    }
  }
  
  public boolean a(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = e();
    a(paramView, localRect);
    try
    {
      boolean bool = localRect.contains(paramInt1, paramInt2);
      return bool;
    }
    finally
    {
      a(localRect);
    }
  }
  
  public boolean a(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int i2 = getChildCount();
    int i3 = 0;
    Object localObject1 = null;
    int i4 = 0;
    if (i4 < i2)
    {
      View localView = getChildAt(i4);
      i3 = localView.getVisibility();
      int i5 = 8;
      if (i3 == i5) {
        i3 = i1;
      }
      for (;;)
      {
        i5 = i4 + 1;
        i4 = i5;
        i1 = i3;
        break;
        localObject1 = localView.getLayoutParams();
        Object localObject2 = localObject1;
        localObject2 = (CoordinatorLayout.e)localObject1;
        localObject1 = ((CoordinatorLayout.e)localObject2).b();
        if (localObject1 != null)
        {
          boolean bool = ((CoordinatorLayout.b)localObject1).a(this, localView, paramView1, paramView2, paramInt1, paramInt2);
          i3 = i1 | bool;
          ((CoordinatorLayout.e)localObject2).a(paramInt2, bool);
        }
        else
        {
          localObject1 = null;
          ((CoordinatorLayout.e)localObject2).a(paramInt2, false);
          i3 = i1;
        }
      }
    }
    return i1;
  }
  
  void b()
  {
    boolean bool = this.n;
    if (bool)
    {
      Object localObject = this.r;
      if (localObject == null)
      {
        localObject = new android/support/design/widget/CoordinatorLayout$f;
        ((CoordinatorLayout.f)localObject).<init>(this);
        this.r = ((CoordinatorLayout.f)localObject);
      }
      localObject = getViewTreeObserver();
      CoordinatorLayout.f localf = this.r;
      ((ViewTreeObserver)localObject).addOnPreDrawListener(localf);
    }
    this.s = true;
  }
  
  public void b(View paramView)
  {
    Object localObject = this.h;
    List localList = ((f)localObject).c(paramView);
    if (localList != null)
    {
      boolean bool = localList.isEmpty();
      if (!bool)
      {
        bool = false;
        localObject = null;
        int i1;
        for (int i2 = 0;; i2 = i1)
        {
          i1 = localList.size();
          if (i2 >= i1) {
            break;
          }
          localObject = (View)localList.get(i2);
          CoordinatorLayout.b localb = ((CoordinatorLayout.e)((View)localObject).getLayoutParams()).b();
          if (localb != null) {
            localb.b(this, (View)localObject, paramView);
          }
          i1 = i2 + 1;
        }
      }
    }
  }
  
  void b(View paramView, int paramInt)
  {
    CoordinatorLayout.e locale = (CoordinatorLayout.e)paramView.getLayoutParams();
    Object localObject = locale.k;
    Rect localRect1;
    Rect localRect2;
    Rect localRect3;
    int i1;
    int i2;
    View localView;
    int i3;
    int i4;
    int i5;
    if (localObject != null)
    {
      localRect1 = e();
      localRect2 = e();
      localRect3 = e();
      localObject = locale.k;
      a((View)localObject, localRect1);
      a(paramView, false, localRect2);
      i1 = paramView.getMeasuredWidth();
      i2 = paramView.getMeasuredHeight();
      localObject = this;
      localView = paramView;
      i3 = paramInt;
      a(paramView, paramInt, localRect1, localRect3, locale, i1, i2);
      i4 = localRect3.left;
      i5 = localRect2.left;
      if (i4 == i5)
      {
        i4 = localRect3.top;
        i5 = localRect2.top;
        if (i4 == i5) {
          break label260;
        }
      }
      i4 = 1;
    }
    for (;;)
    {
      a(locale, localRect3, i1, i2);
      i5 = localRect3.left;
      i3 = localRect2.left;
      i5 -= i3;
      i3 = localRect3.top;
      i1 = localRect2.top;
      i3 -= i1;
      if (i5 != 0) {
        android.support.v4.view.r.d(paramView, i5);
      }
      if (i3 != 0) {
        android.support.v4.view.r.c(paramView, i3);
      }
      if (i4 != 0)
      {
        localObject = locale.b();
        if (localObject != null)
        {
          localView = locale.k;
          ((CoordinatorLayout.b)localObject).b(this, paramView, localView);
        }
      }
      a(localRect1);
      a(localRect2);
      a(localRect3);
      return;
      label260:
      i4 = 0;
      localObject = null;
    }
  }
  
  void b(View paramView, Rect paramRect)
  {
    ((CoordinatorLayout.e)paramView.getLayoutParams()).a(paramRect);
  }
  
  public void b(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    this.x.a(paramView1, paramView2, paramInt1, paramInt2);
    this.q = paramView2;
    int i1 = getChildCount();
    int i2 = 0;
    Object localObject = null;
    int i3 = 0;
    if (i3 < i1)
    {
      View localView = getChildAt(i3);
      localObject = (CoordinatorLayout.e)localView.getLayoutParams();
      boolean bool = ((CoordinatorLayout.e)localObject).b(paramInt2);
      if (!bool) {}
      for (;;)
      {
        i2 = i3 + 1;
        i3 = i2;
        break;
        localObject = ((CoordinatorLayout.e)localObject).b();
        if (localObject != null) {
          ((CoordinatorLayout.b)localObject).b(this, localView, paramView1, paramView2, paramInt1, paramInt2);
        }
      }
    }
  }
  
  public List c(View paramView)
  {
    List localList1 = this.h.d(paramView);
    List localList2 = this.j;
    localList2.clear();
    if (localList1 != null)
    {
      localList2 = this.j;
      localList2.addAll(localList1);
    }
    return this.j;
  }
  
  void c()
  {
    boolean bool = this.n;
    if (bool)
    {
      Object localObject = this.r;
      if (localObject != null)
      {
        localObject = getViewTreeObserver();
        CoordinatorLayout.f localf = this.r;
        ((ViewTreeObserver)localObject).removeOnPreDrawListener(localf);
      }
    }
    this.s = false;
  }
  
  public void c(View paramView, int paramInt)
  {
    this.x.a(paramView, paramInt);
    int i1 = getChildCount();
    int i2 = 0;
    CoordinatorLayout.e locale = null;
    int i3 = 0;
    if (i3 < i1)
    {
      View localView = getChildAt(i3);
      locale = (CoordinatorLayout.e)localView.getLayoutParams();
      boolean bool = locale.b(paramInt);
      if (!bool) {}
      for (;;)
      {
        i2 = i3 + 1;
        i3 = i2;
        break;
        CoordinatorLayout.b localb = locale.b();
        if (localb != null) {
          localb.a(this, localView, paramView, paramInt);
        }
        locale.a(paramInt);
        locale.h();
      }
    }
    this.q = null;
  }
  
  void c(View paramView, Rect paramRect)
  {
    Rect localRect = ((CoordinatorLayout.e)paramView.getLayoutParams()).c();
    paramRect.set(localRect);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof CoordinatorLayout.e;
    if (bool)
    {
      bool = super.checkLayoutParams((ViewGroup.LayoutParams)paramLayoutParams);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected CoordinatorLayout.e d()
  {
    int i1 = -2;
    CoordinatorLayout.e locale = new android/support/design/widget/CoordinatorLayout$e;
    locale.<init>(i1, i1);
    return locale;
  }
  
  public List d(View paramView)
  {
    List localList1 = this.h.c(paramView);
    List localList2 = this.j;
    localList2.clear();
    if (localList1 != null)
    {
      localList2 = this.j;
      localList2.addAll(localList1);
    }
    return this.j;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    Object localObject1 = (CoordinatorLayout.e)paramView.getLayoutParams();
    CoordinatorLayout.b localb = ((CoordinatorLayout.e)localObject1).a;
    if (localb != null)
    {
      localb = ((CoordinatorLayout.e)localObject1).a;
      float f1 = localb.d(this, paramView);
      float f2 = 0.0F;
      Paint localPaint = null;
      boolean bool1 = f1 < 0.0F;
      if (bool1)
      {
        localPaint = this.l;
        if (localPaint == null)
        {
          localPaint = new android/graphics/Paint;
          localPaint.<init>();
          this.l = localPaint;
        }
        localPaint = this.l;
        int i1 = ((CoordinatorLayout.e)localObject1).a.c(this, paramView);
        localPaint.setColor(i1);
        localObject1 = this.l;
        f1 *= 255.0F;
        int i3 = Math.round(f1);
        bool1 = false;
        f2 = 0.0F;
        localPaint = null;
        int i4 = 255;
        float f3 = 3.57E-43F;
        i3 = android.support.v4.e.a.a(i3, 0, i4);
        ((Paint)localObject1).setAlpha(i3);
        int i5 = paramCanvas.save();
        boolean bool2 = paramView.isOpaque();
        if (bool2)
        {
          f1 = paramView.getLeft();
          f2 = paramView.getTop();
          f3 = paramView.getRight();
          i2 = paramView.getBottom();
          f4 = i2;
          localObject2 = Region.Op.DIFFERENCE;
          localObject1 = paramCanvas;
          paramCanvas.clipRect(f1, f2, f3, f4, (Region.Op)localObject2);
        }
        f1 = getPaddingLeft();
        f2 = getPaddingTop();
        int i2 = getWidth();
        i4 = getPaddingRight();
        f3 = i2 - i4;
        i2 = getHeight();
        int i6 = getPaddingBottom();
        i2 -= i6;
        float f4 = i2;
        Object localObject2 = this.l;
        localObject1 = paramCanvas;
        paramCanvas.drawRect(f1, f2, f3, f4, (Paint)localObject2);
        paramCanvas.restoreToCount(i5);
      }
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    int i1 = 0;
    Drawable localDrawable = this.v;
    if (localDrawable != null)
    {
      boolean bool1 = localDrawable.isStateful();
      if (bool1)
      {
        boolean bool2 = localDrawable.setState(arrayOfInt);
        i1 = false | bool2;
      }
    }
    if (i1 != 0) {
      invalidate();
    }
  }
  
  final List getDependencySortedChildren()
  {
    f();
    return Collections.unmodifiableList(this.g);
  }
  
  public final z getLastWindowInsets()
  {
    return this.t;
  }
  
  public int getNestedScrollAxes()
  {
    return this.x.a();
  }
  
  public Drawable getStatusBarBackground()
  {
    return this.v;
  }
  
  protected int getSuggestedMinimumHeight()
  {
    int i1 = super.getSuggestedMinimumHeight();
    int i2 = getPaddingTop();
    int i3 = getPaddingBottom();
    i2 += i3;
    return Math.max(i1, i2);
  }
  
  protected int getSuggestedMinimumWidth()
  {
    int i1 = super.getSuggestedMinimumWidth();
    int i2 = getPaddingLeft();
    int i3 = getPaddingRight();
    i2 += i3;
    return Math.max(i1, i2);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Object localObject = null;
    a(false);
    boolean bool = this.s;
    if (bool)
    {
      localObject = this.r;
      if (localObject == null)
      {
        localObject = new android/support/design/widget/CoordinatorLayout$f;
        ((CoordinatorLayout.f)localObject).<init>(this);
        this.r = ((CoordinatorLayout.f)localObject);
      }
      localObject = getViewTreeObserver();
      CoordinatorLayout.f localf = this.r;
      ((ViewTreeObserver)localObject).addOnPreDrawListener(localf);
    }
    localObject = this.t;
    if (localObject == null)
    {
      bool = android.support.v4.view.r.p(this);
      if (bool) {
        android.support.v4.view.r.o(this);
      }
    }
    this.n = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    a(false);
    boolean bool = this.s;
    if (bool)
    {
      localObject = this.r;
      if (localObject != null)
      {
        localObject = getViewTreeObserver();
        CoordinatorLayout.f localf = this.r;
        ((ViewTreeObserver)localObject).removeOnPreDrawListener(localf);
      }
    }
    Object localObject = this.q;
    if (localObject != null)
    {
      localObject = this.q;
      onStopNestedScroll((View)localObject);
    }
    this.n = false;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    boolean bool = this.u;
    Object localObject;
    int i1;
    if (bool)
    {
      localObject = this.v;
      if (localObject != null)
      {
        localObject = this.t;
        if (localObject == null) {
          break label79;
        }
        localObject = this.t;
        i1 = ((z)localObject).b();
      }
    }
    for (;;)
    {
      if (i1 > 0)
      {
        Drawable localDrawable = this.v;
        int i2 = getWidth();
        localDrawable.setBounds(0, 0, i2, i1);
        localObject = this.v;
        ((Drawable)localObject).draw(paramCanvas);
      }
      return;
      label79:
      i1 = 0;
      localObject = null;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    int i2 = 0;
    int i3 = paramMotionEvent.getActionMasked();
    if (i3 == 0) {
      a(i1);
    }
    boolean bool = a(paramMotionEvent, 0);
    if (0 != 0) {
      null.recycle();
    }
    if (i3 != i1)
    {
      i2 = 3;
      if (i3 != i2) {}
    }
    else
    {
      a(i1);
    }
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = android.support.v4.view.r.e(this);
    int i2 = this.g.size();
    int i3 = 0;
    View localView = null;
    int i4 = 0;
    if (i4 < i2)
    {
      localView = (View)this.g.get(i4);
      int i5 = localView.getVisibility();
      int i6 = 8;
      if (i5 == i6) {}
      for (;;)
      {
        i3 = i4 + 1;
        i4 = i3;
        break;
        CoordinatorLayout.b localb = ((CoordinatorLayout.e)localView.getLayoutParams()).b();
        if (localb != null)
        {
          boolean bool = localb.a(this, localView, i1);
          if (bool) {}
        }
        else
        {
          a(localView, i1);
        }
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    f();
    a();
    int i1 = getPaddingLeft();
    int i2 = getPaddingTop();
    int i3 = getPaddingRight();
    int i4 = getPaddingBottom();
    int i5 = android.support.v4.view.r.e(this);
    int i6 = 1;
    int i10;
    int i11;
    int i12;
    int i13;
    int i14;
    int i15;
    int i16;
    int i17;
    int i18;
    int i19;
    boolean bool1;
    if (i5 == i6)
    {
      i6 = 1;
      i10 = i6;
      i11 = View.MeasureSpec.getMode(paramInt1);
      i12 = View.MeasureSpec.getSize(paramInt1);
      i13 = View.MeasureSpec.getMode(paramInt2);
      i14 = View.MeasureSpec.getSize(paramInt2);
      i15 = i1 + i3;
      i16 = i2 + i4;
      i17 = getSuggestedMinimumWidth();
      i18 = getSuggestedMinimumHeight();
      i19 = 0;
      localObject1 = this.t;
      if (localObject1 == null) {
        break label249;
      }
      bool1 = android.support.v4.view.r.p(this);
      if (!bool1) {
        break label249;
      }
      bool1 = true;
    }
    View localView;
    int i22;
    for (boolean bool4 = bool1;; bool4 = false)
    {
      int i20 = this.g.size();
      bool1 = false;
      localObject1 = null;
      int i21 = 0;
      for (;;)
      {
        if (i21 >= i20) {
          break label720;
        }
        localObject1 = this.g;
        localView = (View)((List)localObject1).get(i21);
        i7 = localView.getVisibility();
        i2 = 8;
        if (i7 != i2) {
          break;
        }
        i7 = i19;
        i2 = i18;
        i4 = i17;
        i22 = i21 + 1;
        i21 = i22;
        i19 = i7;
        i18 = i2;
        i17 = i4;
      }
      i7 = 0;
      localObject1 = null;
      i10 = 0;
      break;
      label249:
      i7 = 0;
      localObject1 = null;
    }
    Object localObject1 = localView.getLayoutParams();
    Object localObject2 = localObject1;
    localObject2 = (CoordinatorLayout.e)localObject1;
    int i23 = 0;
    int i7 = ((CoordinatorLayout.e)localObject2).e;
    Object localObject3;
    label390:
    int i24;
    if ((i7 >= 0) && (i11 != 0))
    {
      i7 = ((CoordinatorLayout.e)localObject2).e;
      i7 = b(i7);
      i2 = d.a(d(((CoordinatorLayout.e)localObject2).c), i5) & 0x7;
      i22 = 3;
      if ((i2 != i22) || (i10 != 0))
      {
        i22 = 5;
        if ((i2 != i22) || (i10 == 0)) {}
      }
      else
      {
        i2 = 0;
        localObject3 = null;
        i22 = i12 - i3;
        i7 = i22 - i7;
        i23 = Math.max(0, i7);
      }
    }
    else
    {
      if (!bool4) {
        break label764;
      }
      boolean bool2 = android.support.v4.view.r.p(localView);
      if (bool2) {
        break label764;
      }
      localObject1 = this.t;
      int i8 = ((z)localObject1).a();
      i2 = this.t.c();
      i8 += i2;
      localObject3 = this.t;
      i2 = ((z)localObject3).b();
      z localz = this.t;
      i22 = localz.d();
      i2 += i22;
      i22 = View.MeasureSpec.makeMeasureSpec(i12 - i8, i11);
      i8 = i14 - i2;
      i24 = View.MeasureSpec.makeMeasureSpec(i8, i13);
    }
    for (;;)
    {
      localObject1 = ((CoordinatorLayout.e)localObject2).b();
      if (localObject1 != null)
      {
        localObject3 = this;
        boolean bool3 = ((CoordinatorLayout.b)localObject1).a(this, localView, i22, i23, i24, 0);
        if (bool3) {}
      }
      else
      {
        localObject3 = this;
        a(localView, i22, i23, i24, 0);
      }
      int i9 = localView.getMeasuredWidth() + i15;
      i2 = ((CoordinatorLayout.e)localObject2).leftMargin;
      i9 += i2;
      i2 = ((CoordinatorLayout.e)localObject2).rightMargin;
      i9 += i2;
      i22 = Math.max(i17, i9);
      i9 = localView.getMeasuredHeight() + i16;
      i2 = ((CoordinatorLayout.e)localObject2).topMargin;
      i9 += i2;
      i2 = ((CoordinatorLayout.e)localObject2).bottomMargin;
      i9 += i2;
      i2 = Math.max(i18, i9);
      i9 = localView.getMeasuredState();
      i9 = View.combineMeasuredStates(i19, i9);
      i4 = i22;
      break;
      i22 = 5;
      if ((i2 != i22) || (i10 != 0))
      {
        i22 = 3;
        if ((i2 != i22) || (i10 == 0)) {
          break label390;
        }
      }
      i2 = 0;
      localObject3 = null;
      i9 -= i1;
      i23 = Math.max(0, i9);
      break label390;
      label720:
      i9 = 0xFF000000 & i19;
      i9 = View.resolveSizeAndState(i17, paramInt1, i9);
      i2 = i19 << 16;
      i2 = View.resolveSizeAndState(i18, paramInt2, i2);
      setMeasuredDimension(i9, i2);
      return;
      label764:
      i24 = paramInt2;
      i22 = paramInt1;
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    int i3 = 0;
    View localView;
    int i4;
    int i6;
    if (i2 < i1)
    {
      localView = getChildAt(i2);
      i4 = localView.getVisibility();
      i6 = 8;
      if (i4 == i6) {
        i4 = i3;
      }
    }
    for (;;)
    {
      i6 = i2 + 1;
      i2 = i6;
      i3 = i4;
      break;
      Object localObject = (CoordinatorLayout.e)localView.getLayoutParams();
      boolean bool = ((CoordinatorLayout.e)localObject).b(0);
      if (!bool)
      {
        i4 = i3;
      }
      else
      {
        localObject = ((CoordinatorLayout.e)localObject).b();
        int i5;
        if (localObject != null)
        {
          i5 = ((CoordinatorLayout.b)localObject).a(this, localView, paramView, paramFloat1, paramFloat2, paramBoolean) | i3;
          continue;
          if (i3 != 0)
          {
            i5 = 1;
            a(i5);
          }
          return i3;
        }
        else
        {
          i5 = i3;
        }
      }
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    int i1 = getChildCount();
    int i2 = 0;
    int i3 = 0;
    View localView;
    int i4;
    int i5;
    if (i2 < i1)
    {
      localView = getChildAt(i2);
      i4 = localView.getVisibility();
      i5 = 8;
      if (i4 == i5) {
        i4 = i3;
      }
    }
    for (;;)
    {
      i5 = i2 + 1;
      i2 = i5;
      i3 = i4;
      break;
      Object localObject = (CoordinatorLayout.e)localView.getLayoutParams();
      boolean bool2 = ((CoordinatorLayout.e)localObject).b(0);
      if (!bool2)
      {
        i4 = i3;
      }
      else
      {
        localObject = ((CoordinatorLayout.e)localObject).b();
        boolean bool1;
        if (localObject != null)
        {
          bool1 = ((CoordinatorLayout.b)localObject).a(this, localView, paramView, paramFloat1, paramFloat2) | i3;
          continue;
          return i3;
        }
        else
        {
          bool1 = i3;
        }
      }
    }
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    a(paramView, paramInt1, paramInt2, paramArrayOfInt, 0);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    b(paramView1, paramView2, paramInt, 0);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof CoordinatorLayout.SavedState;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (CoordinatorLayout.SavedState)paramParcelable;
      Parcelable localParcelable = paramParcelable.getSuperState();
      super.onRestoreInstanceState(localParcelable);
      SparseArray localSparseArray = paramParcelable.a;
      bool = false;
      localParcelable = null;
      int i2 = getChildCount();
      int i1;
      for (int i3 = 0; i3 < i2; i3 = i1)
      {
        View localView = getChildAt(i3);
        i1 = localView.getId();
        CoordinatorLayout.b localb = a(localView).b();
        int i4 = -1;
        if ((i1 != i4) && (localb != null))
        {
          localParcelable = (Parcelable)localSparseArray.get(i1);
          if (localParcelable != null) {
            localb.a(this, localView, localParcelable);
          }
        }
        i1 = i3 + 1;
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    CoordinatorLayout.SavedState localSavedState = new android/support/design/widget/CoordinatorLayout$SavedState;
    Object localObject = super.onSaveInstanceState();
    localSavedState.<init>((Parcelable)localObject);
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    int i1 = 0;
    localObject = null;
    int i2 = getChildCount();
    for (int i3 = 0; i3 < i2; i3 = i1)
    {
      View localView = getChildAt(i3);
      int i4 = localView.getId();
      localObject = ((CoordinatorLayout.e)localView.getLayoutParams()).b();
      int i5 = -1;
      if ((i4 != i5) && (localObject != null))
      {
        localObject = ((CoordinatorLayout.b)localObject).b(this, localView);
        if (localObject != null) {
          localSparseArray.append(i4, localObject);
        }
      }
      i1 = i3 + 1;
    }
    localSavedState.a = localSparseArray;
    return localSavedState;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return a(paramView1, paramView2, paramInt, 0);
  }
  
  public void onStopNestedScroll(View paramView)
  {
    c(paramView, 0);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 3;
    int i2 = 1;
    Object localObject1 = null;
    int i3 = paramMotionEvent.getActionMasked();
    Object localObject2 = this.p;
    boolean bool1;
    if (localObject2 == null)
    {
      bool1 = a(paramMotionEvent, i2);
      if (!bool1) {}
    }
    for (boolean bool2 = bool1;; bool2 = false)
    {
      localObject2 = ((CoordinatorLayout.e)this.p.getLayoutParams()).b();
      boolean bool3;
      if (localObject2 != null)
      {
        View localView = this.p;
        bool1 = ((CoordinatorLayout.b)localObject2).b(this, localView, paramMotionEvent);
        bool3 = bool1;
      }
      for (;;)
      {
        localObject2 = this.p;
        if (localObject2 == null)
        {
          bool1 = super.onTouchEvent(paramMotionEvent);
          bool3 |= bool1;
        }
        while (!bool2)
        {
          if (((bool3) || (i3 != 0)) || (localObject1 != null)) {
            ((MotionEvent)localObject1).recycle();
          }
          if ((i3 == i2) || (i3 == i1)) {
            a(false);
          }
          return bool3;
        }
        long l1;
        if (0 == 0) {
          l1 = SystemClock.uptimeMillis();
        }
        for (localObject2 = MotionEvent.obtain(l1, l1, i1, 0.0F, 0.0F, 0);; localObject2 = null)
        {
          super.onTouchEvent((MotionEvent)localObject2);
          localObject1 = localObject2;
          break;
          bool1 = false;
        }
        bool3 = false;
        continue;
        bool2 = bool1;
        bool3 = false;
      }
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    CoordinatorLayout.b localb = ((CoordinatorLayout.e)paramView.getLayoutParams()).b();
    if (localb != null)
    {
      bool = localb.a(this, paramView, paramRect, paramBoolean);
      if (!bool) {}
    }
    for (boolean bool = true;; bool = super.requestChildRectangleOnScreen(paramView, paramRect, paramBoolean)) {
      return bool;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if (paramBoolean)
    {
      boolean bool = this.m;
      if (!bool)
      {
        a(false);
        bool = true;
        this.m = bool;
      }
    }
  }
  
  public void setFitsSystemWindows(boolean paramBoolean)
  {
    super.setFitsSystemWindows(paramBoolean);
    g();
  }
  
  public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener paramOnHierarchyChangeListener)
  {
    this.e = paramOnHierarchyChangeListener;
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    boolean bool = false;
    Drawable localDrawable = null;
    Object localObject = this.v;
    int i1;
    if (localObject != paramDrawable)
    {
      localObject = this.v;
      if (localObject != null)
      {
        localObject = this.v;
        ((Drawable)localObject).setCallback(null);
      }
      if (paramDrawable != null) {
        localDrawable = paramDrawable.mutate();
      }
      this.v = localDrawable;
      localDrawable = this.v;
      if (localDrawable != null)
      {
        localDrawable = this.v;
        bool = localDrawable.isStateful();
        if (bool)
        {
          localDrawable = this.v;
          localObject = getDrawableState();
          localDrawable.setState((int[])localObject);
        }
        localDrawable = this.v;
        int i3 = android.support.v4.view.r.e(this);
        android.support.v4.b.a.a.b(localDrawable, i3);
        localObject = this.v;
        i1 = getVisibility();
        if (i1 != 0) {
          break label152;
        }
        i1 = 1;
      }
    }
    for (;;)
    {
      ((Drawable)localObject).setVisible(i1, false);
      localDrawable = this.v;
      localDrawable.setCallback(this);
      android.support.v4.view.r.c(this);
      return;
      label152:
      int i2 = 0;
      localDrawable = null;
    }
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
    localColorDrawable.<init>(paramInt);
    setStatusBarBackground(localColorDrawable);
  }
  
  public void setStatusBarBackgroundResource(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = b.a(getContext(), paramInt);; localDrawable = null)
    {
      setStatusBarBackground(localDrawable);
      return;
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      Drawable localDrawable = this.v;
      if (localDrawable != null)
      {
        localDrawable = this.v;
        boolean bool2 = localDrawable.isVisible();
        if (bool2 != bool1)
        {
          localDrawable = this.v;
          localDrawable.setVisible(bool1, false);
        }
      }
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool = super.verifyDrawable(paramDrawable);
    Drawable localDrawable;
    if (!bool)
    {
      localDrawable = this.v;
      if (paramDrawable != localDrawable) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\CoordinatorLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */