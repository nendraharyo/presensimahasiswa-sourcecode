package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.a.b;
import android.support.v4.view.d;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout
  extends ViewGroup
{
  static final int[] a;
  static final boolean b;
  private static final int[] c;
  private static final boolean d;
  private float A;
  private Drawable B;
  private Drawable C;
  private Drawable D;
  private CharSequence E;
  private CharSequence F;
  private Object G;
  private boolean H;
  private Drawable I;
  private Drawable J;
  private Drawable K;
  private Drawable L;
  private final ArrayList M;
  private final DrawerLayout.b e;
  private float f;
  private int g;
  private int h;
  private float i;
  private Paint j;
  private final q k;
  private final q l;
  private final DrawerLayout.e m;
  private final DrawerLayout.e n;
  private int o;
  private boolean p;
  private boolean q;
  private int r;
  private int s;
  private int t;
  private int u;
  private boolean v;
  private boolean w;
  private DrawerLayout.c x;
  private List y;
  private float z;
  
  static
  {
    int i1 = 1;
    int[] arrayOfInt = new int[i1];
    arrayOfInt[0] = 16843828;
    c = arrayOfInt;
    arrayOfInt = new int[i1];
    arrayOfInt[0] = 16842931;
    a = arrayOfInt;
    int i2 = Build.VERSION.SDK_INT;
    int i3 = 19;
    if (i2 >= i3)
    {
      i2 = i1;
      b = i2;
      i2 = Build.VERSION.SDK_INT;
      i3 = 21;
      if (i2 < i3) {
        break label70;
      }
    }
    for (;;)
    {
      d = i1;
      return;
      i2 = 0;
      arrayOfInt = null;
      break;
      label70:
      i1 = 0;
    }
  }
  
  public DrawerLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/support/v4/widget/DrawerLayout$b;
    ((DrawerLayout.b)localObject1).<init>();
    this.e = ((DrawerLayout.b)localObject1);
    this.h = -1728053248;
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    this.j = ((Paint)localObject1);
    this.q = i1;
    this.r = i2;
    this.s = i2;
    this.t = i2;
    this.u = i2;
    this.I = null;
    this.J = null;
    this.K = null;
    this.L = null;
    int i3 = 262144;
    setDescendantFocusability(i3);
    localObject1 = getResources().getDisplayMetrics();
    float f2 = ((DisplayMetrics)localObject1).density;
    float f3 = 64.0F * f2;
    int i4 = 1056964608;
    float f4 = 0.5F;
    int i5 = (int)(f3 + f4);
    this.g = i5;
    f3 = 400.0F * f2;
    Object localObject3 = new android/support/v4/widget/DrawerLayout$e;
    ((DrawerLayout.e)localObject3).<init>(this, i2);
    this.m = ((DrawerLayout.e)localObject3);
    localObject3 = new android/support/v4/widget/DrawerLayout$e;
    ((DrawerLayout.e)localObject3).<init>(this, 5);
    this.n = ((DrawerLayout.e)localObject3);
    localObject3 = this.m;
    localObject3 = q.a(this, f1, (q.a)localObject3);
    this.k = ((q)localObject3);
    this.k.a(i1);
    this.k.a(f3);
    localObject3 = this.m;
    q localq = this.k;
    ((DrawerLayout.e)localObject3).a(localq);
    localObject3 = this.n;
    localObject3 = q.a(this, f1, (q.a)localObject3);
    this.l = ((q)localObject3);
    localObject3 = this.l;
    i2 = 2;
    ((q)localObject3).a(i2);
    this.l.a(f3);
    Object localObject4 = this.n;
    localObject3 = this.l;
    ((DrawerLayout.e)localObject4).a((q)localObject3);
    setFocusableInTouchMode(i1);
    r.a(this, i1);
    localObject4 = new android/support/v4/widget/DrawerLayout$a;
    ((DrawerLayout.a)localObject4).<init>(this);
    r.a(this, (android.support.v4.view.a)localObject4);
    setMotionEventSplittingEnabled(false);
    boolean bool = r.p(this);
    if (bool)
    {
      int i6 = Build.VERSION.SDK_INT;
      i4 = 21;
      f4 = 2.9E-44F;
      if (i6 < i4) {
        break label507;
      }
      localObject4 = new android/support/v4/widget/DrawerLayout$1;
      ((DrawerLayout.1)localObject4).<init>(this);
      setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)localObject4);
      i6 = 1280;
      f3 = 1.794E-42F;
      setSystemUiVisibility(i6);
      localObject4 = c;
      localObject4 = paramContext.obtainStyledAttributes((int[])localObject4);
      i4 = 0;
      f4 = 0.0F;
      localObject3 = null;
    }
    for (;;)
    {
      try
      {
        localObject3 = ((TypedArray)localObject4).getDrawable(0);
        this.B = ((Drawable)localObject3);
        ((TypedArray)localObject4).recycle();
        f2 *= 10.0F;
        this.f = f2;
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        this.M = ((ArrayList)localObject1);
        return;
      }
      finally
      {
        ((TypedArray)localObject4).recycle();
      }
      label507:
      this.B = null;
    }
  }
  
  private boolean a(Drawable paramDrawable, int paramInt)
  {
    if (paramDrawable != null)
    {
      bool = android.support.v4.b.a.a.b(paramDrawable);
      if (bool) {
        break label17;
      }
    }
    for (boolean bool = false;; bool = true)
    {
      return bool;
      label17:
      android.support.v4.b.a.a.b(paramDrawable, paramInt);
    }
  }
  
  private void c(View paramView, boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i2 < i1)
    {
      View localView = getChildAt(i2);
      if (!paramBoolean)
      {
        i3 = g(localView);
        if (i3 == 0) {}
      }
      else
      {
        if ((!paramBoolean) || (localView != paramView)) {
          break label68;
        }
      }
      int i3 = 1;
      r.a(localView, i3);
      for (;;)
      {
        i2 += 1;
        break;
        label68:
        int i4 = 4;
        r.a(localView, i4);
      }
    }
  }
  
  static String d(int paramInt)
  {
    int i1 = paramInt & 0x3;
    int i2 = 3;
    String str;
    if (i1 == i2) {
      str = "LEFT";
    }
    for (;;)
    {
      return str;
      i1 = paramInt & 0x5;
      i2 = 5;
      if (i1 == i2) {
        str = "RIGHT";
      } else {
        str = Integer.toHexString(paramInt);
      }
    }
  }
  
  private void e()
  {
    boolean bool = d;
    if (bool) {}
    for (;;)
    {
      return;
      Drawable localDrawable = f();
      this.C = localDrawable;
      localDrawable = g();
      this.D = localDrawable;
    }
  }
  
  private Drawable f()
  {
    int i1 = r.e(this);
    Drawable localDrawable1;
    Drawable localDrawable2;
    if (i1 == 0)
    {
      localDrawable1 = this.I;
      if (localDrawable1 == null) {
        break label66;
      }
      localDrawable1 = this.I;
      a(localDrawable1, i1);
      localDrawable2 = this.I;
    }
    for (;;)
    {
      return localDrawable2;
      localDrawable1 = this.J;
      if (localDrawable1 != null)
      {
        localDrawable1 = this.J;
        a(localDrawable1, i1);
        localDrawable2 = this.J;
      }
      else
      {
        label66:
        localDrawable2 = this.K;
      }
    }
  }
  
  private Drawable g()
  {
    int i1 = r.e(this);
    Drawable localDrawable1;
    Drawable localDrawable2;
    if (i1 == 0)
    {
      localDrawable1 = this.J;
      if (localDrawable1 == null) {
        break label66;
      }
      localDrawable1 = this.J;
      a(localDrawable1, i1);
      localDrawable2 = this.J;
    }
    for (;;)
    {
      return localDrawable2;
      localDrawable1 = this.I;
      if (localDrawable1 != null)
      {
        localDrawable1 = this.I;
        a(localDrawable1, i1);
        localDrawable2 = this.I;
      }
      else
      {
        label66:
        localDrawable2 = this.L;
      }
    }
  }
  
  private boolean h()
  {
    int i1 = getChildCount();
    int i2 = 0;
    DrawerLayout.d locald;
    boolean bool;
    if (i2 < i1)
    {
      locald = (DrawerLayout.d)getChildAt(i2).getLayoutParams();
      bool = locald.c;
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      int i3 = i2 + 1;
      i2 = i3;
      break;
      i3 = 0;
      locald = null;
    }
  }
  
  private boolean i()
  {
    View localView = c();
    boolean bool;
    if (localView != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localView = null;
    }
  }
  
  static boolean l(View paramView)
  {
    int i1 = r.d(paramView);
    int i3 = 4;
    if (i1 != i3)
    {
      i1 = r.d(paramView);
      int i4 = 2;
      if (i1 == i4) {}
    }
    int i2;
    for (i1 = 1;; i2 = 0) {
      return i1;
    }
  }
  
  private static boolean m(View paramView)
  {
    boolean bool = false;
    Drawable localDrawable = paramView.getBackground();
    if (localDrawable != null)
    {
      int i1 = localDrawable.getOpacity();
      int i2 = -1;
      if (i1 == i2) {
        bool = true;
      }
    }
    return bool;
  }
  
  public int a(int paramInt)
  {
    int i1 = 3;
    int i2 = r.e(this);
    switch (paramInt)
    {
    }
    label54:
    label211:
    label234:
    for (;;)
    {
      i2 = 0;
      for (;;)
      {
        return i2;
        int i3 = this.r;
        if (i3 != i1)
        {
          i2 = this.r;
        }
        else
        {
          if (i2 == 0) {}
          for (i2 = this.t; i2 != i1; i2 = this.u) {
            break label54;
          }
          i3 = this.s;
          if (i3 != i1)
          {
            i2 = this.s;
          }
          else
          {
            if (i2 == 0) {}
            for (i2 = this.u; i2 != i1; i2 = this.t) {
              break label54;
            }
            i3 = this.t;
            if (i3 != i1)
            {
              i2 = this.t;
            }
            else
            {
              if (i2 == 0) {}
              for (i2 = this.r; i2 != i1; i2 = this.s) {
                break label54;
              }
              i3 = this.u;
              if (i3 == i1) {
                break label211;
              }
              i2 = this.u;
            }
          }
        }
      }
      if (i2 == 0) {}
      for (i2 = this.s;; i2 = this.r)
      {
        if (i2 == i1) {
          break label234;
        }
        break;
      }
    }
  }
  
  public int a(View paramView)
  {
    boolean bool = g(paramView);
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "View " + paramView + " is not a drawer";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    int i1 = ((DrawerLayout.d)paramView.getLayoutParams()).a;
    return a(i1);
  }
  
  View a()
  {
    int i1 = getChildCount();
    int i2 = 0;
    Object localObject = null;
    int i3 = 0;
    View localView;
    if (i3 < i1)
    {
      localView = getChildAt(i3);
      localObject = (DrawerLayout.d)localView.getLayoutParams();
      i2 = ((DrawerLayout.d)localObject).d & 0x1;
      int i4 = 1;
      if (i2 != i4) {}
    }
    for (localObject = localView;; localObject = null)
    {
      return (View)localObject;
      i2 = i3 + 1;
      i3 = i2;
      break;
      i2 = 0;
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = r.e(this);
    int i2 = d.a(paramInt2, i1);
    Object localObject;
    switch (paramInt2)
    {
    default: 
      if (paramInt1 != 0)
      {
        i1 = 3;
        if (i2 == i1)
        {
          localObject = this.k;
          label74:
          ((q)localObject).e();
        }
      }
      else
      {
        switch (paramInt1)
        {
        }
      }
      break;
    }
    for (;;)
    {
      return;
      this.r = paramInt1;
      break;
      this.s = paramInt1;
      break;
      this.t = paramInt1;
      break;
      this.u = paramInt1;
      break;
      localObject = this.l;
      break label74;
      localObject = c(i2);
      if (localObject != null)
      {
        h((View)localObject);
        continue;
        localObject = c(i2);
        if (localObject != null) {
          i((View)localObject);
        }
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, View paramView)
  {
    int i1 = 2;
    float f1 = 2.8E-45F;
    int i2 = 1;
    float f2 = Float.MIN_VALUE;
    q localq1 = this.k;
    int i4 = localq1.a();
    q localq2 = this.l;
    int i6 = localq2.a();
    Object localObject;
    int i7;
    if ((i4 == i2) || (i6 == i2))
    {
      i4 = i2;
      if ((paramView != null) && (paramInt2 == 0))
      {
        localObject = (DrawerLayout.d)paramView.getLayoutParams();
        f2 = ((DrawerLayout.d)localObject).b;
        i7 = 0;
        localq2 = null;
        i2 = f2 < 0.0F;
        if (i2 != 0) {
          break label237;
        }
        b(paramView);
      }
    }
    for (;;)
    {
      i1 = this.o;
      if (i4 == i1) {
        return;
      }
      this.o = i4;
      localObject = this.y;
      if (localObject == null) {
        return;
      }
      localObject = this.y;
      i1 = ((List)localObject).size() + -1;
      for (i2 = i1; i2 >= 0; i2 = i1)
      {
        localObject = (DrawerLayout.c)this.y.get(i2);
        ((DrawerLayout.c)localObject).onDrawerStateChanged(i4);
        i1 = i2 + -1;
      }
      if ((i4 == i1) || (i7 == i1))
      {
        i4 = i1;
        break;
      }
      i1 = 0;
      f1 = 0.0F;
      localObject = null;
      int i5 = 0;
      localq1 = null;
      break;
      label237:
      f1 = ((DrawerLayout.d)localObject).b;
      int i3 = 1065353216;
      f2 = 1.0F;
      boolean bool = f1 < f2;
      if (!bool) {
        c(paramView);
      }
    }
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = c(paramInt);
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("No drawer view found with gravity ");
      String str = d(paramInt);
      localObject2 = str;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    a((View)localObject1, paramBoolean);
  }
  
  public void a(DrawerLayout.c paramc)
  {
    if (paramc == null) {}
    for (;;)
    {
      return;
      Object localObject = this.y;
      if (localObject == null)
      {
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>();
        this.y = ((List)localObject);
      }
      localObject = this.y;
      ((List)localObject).add(paramc);
    }
  }
  
  void a(View paramView, float paramFloat)
  {
    Object localObject = this.y;
    if (localObject != null)
    {
      localObject = this.y;
      int i1 = ((List)localObject).size() + -1;
      for (int i2 = i1; i2 >= 0; i2 = i1)
      {
        localObject = (DrawerLayout.c)this.y.get(i2);
        ((DrawerLayout.c)localObject).onDrawerSlide(paramView, paramFloat);
        i1 = i2 + -1;
      }
    }
  }
  
  public void a(View paramView, boolean paramBoolean)
  {
    int i1 = 1;
    float f1 = 1.0F;
    int i2 = 0;
    boolean bool1 = g(paramView);
    if (!bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "View " + paramView + " is not a sliding drawer";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (DrawerLayout.d)paramView.getLayoutParams();
    boolean bool2 = this.q;
    if (bool2)
    {
      ((DrawerLayout.d)localObject1).b = f1;
      ((DrawerLayout.d)localObject1).d = i1;
      c(paramView, i1);
    }
    for (;;)
    {
      invalidate();
      return;
      if (paramBoolean)
      {
        int i4 = ((DrawerLayout.d)localObject1).d | 0x2;
        ((DrawerLayout.d)localObject1).d = i4;
        bool1 = a(paramView, 3);
        if (bool1)
        {
          localObject1 = this.k;
          i4 = paramView.getTop();
          ((q)localObject1).a(paramView, 0, i4);
        }
        else
        {
          localObject1 = this.l;
          i4 = getWidth();
          i2 = paramView.getWidth();
          i4 -= i2;
          i2 = paramView.getTop();
          ((q)localObject1).a(paramView, i4, i2);
        }
      }
      else
      {
        c(paramView, f1);
        int i3 = ((DrawerLayout.d)localObject1).a;
        a(i3, 0, paramView);
        paramView.setVisibility(0);
      }
    }
  }
  
  public void a(Object paramObject, boolean paramBoolean)
  {
    this.G = paramObject;
    this.H = paramBoolean;
    Drawable localDrawable;
    boolean bool;
    if (!paramBoolean)
    {
      localDrawable = getBackground();
      if (localDrawable == null) {
        bool = true;
      }
    }
    for (;;)
    {
      setWillNotDraw(bool);
      requestLayout();
      return;
      bool = false;
      localDrawable = null;
    }
  }
  
  void a(boolean paramBoolean)
  {
    int i1 = getChildCount();
    int i2 = 0;
    boolean bool1 = false;
    while (i2 < i1)
    {
      View localView = getChildAt(i2);
      localObject = (DrawerLayout.d)localView.getLayoutParams();
      boolean bool2 = g(localView);
      if (bool2)
      {
        if (paramBoolean)
        {
          bool2 = ((DrawerLayout.d)localObject).c;
          if (bool2) {}
        }
      }
      else
      {
        int i4 = i2 + 1;
        i2 = i4;
        continue;
      }
      int i3 = localView.getWidth();
      boolean bool3 = a(localView, 3);
      int i6;
      boolean bool4;
      if (bool3)
      {
        q localq1 = this.k;
        i3 = -i3;
        i6 = localView.getTop();
        bool4 = localq1.a(localView, i3, i6);
        bool1 |= bool4;
      }
      for (;;)
      {
        ((DrawerLayout.d)localObject).c = false;
        break;
        q localq2 = this.l;
        int i5 = getWidth();
        i6 = localView.getTop();
        bool4 = localq2.a(localView, i5, i6);
        bool1 |= bool4;
      }
    }
    this.m.a();
    Object localObject = this.n;
    ((DrawerLayout.e)localObject).a();
    if (bool1) {
      invalidate();
    }
  }
  
  boolean a(View paramView, int paramInt)
  {
    int i1 = e(paramView) & paramInt;
    if (i1 == paramInt) {}
    for (i1 = 1;; i1 = 0) {
      return i1;
    }
  }
  
  public void addFocusables(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int i2 = getDescendantFocusability();
    int i3 = 393216;
    if (i2 == i3) {}
    for (;;)
    {
      return;
      int i4 = getChildCount();
      i3 = 0;
      i2 = 0;
      Object localObject = null;
      if (i3 < i4)
      {
        View localView = getChildAt(i3);
        boolean bool = g(localView);
        if (bool)
        {
          bool = j(localView);
          if (bool)
          {
            i2 = 1;
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
        for (;;)
        {
          i3 += 1;
          break;
          ArrayList localArrayList = this.M;
          localArrayList.add(localView);
        }
      }
      if (i2 == 0)
      {
        localObject = this.M;
        i3 = ((ArrayList)localObject).size();
        while (i1 < i3)
        {
          localObject = (View)this.M.get(i1);
          i4 = ((View)localObject).getVisibility();
          if (i4 == 0) {
            ((View)localObject).addFocusables(paramArrayList, paramInt1, paramInt2);
          }
          i2 = i1 + 1;
          i1 = i2;
        }
      }
      localObject = this.M;
      ((ArrayList)localObject).clear();
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    Object localObject = a();
    if (localObject == null)
    {
      boolean bool = g(paramView);
      if (!bool) {}
    }
    else
    {
      int i1 = 4;
      r.a(paramView, i1);
    }
    for (;;)
    {
      int i2 = b;
      if (i2 == 0)
      {
        localObject = this.e;
        r.a(paramView, (android.support.v4.view.a)localObject);
      }
      return;
      i2 = 1;
      r.a(paramView, i2);
    }
  }
  
  public CharSequence b(int paramInt)
  {
    int i1 = r.e(this);
    i1 = d.a(paramInt, i1);
    int i2 = 3;
    CharSequence localCharSequence;
    if (i1 == i2) {
      localCharSequence = this.E;
    }
    for (;;)
    {
      return localCharSequence;
      i2 = 5;
      if (i1 == i2)
      {
        localCharSequence = this.F;
      }
      else
      {
        i1 = 0;
        localCharSequence = null;
      }
    }
  }
  
  public void b()
  {
    a(false);
  }
  
  public void b(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = c(paramInt);
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("No drawer view found with gravity ");
      String str = d(paramInt);
      localObject2 = str;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    b((View)localObject1, paramBoolean);
  }
  
  public void b(DrawerLayout.c paramc)
  {
    if (paramc == null) {}
    for (;;)
    {
      return;
      List localList = this.y;
      if (localList != null)
      {
        localList = this.y;
        localList.remove(paramc);
      }
    }
  }
  
  void b(View paramView)
  {
    Object localObject = (DrawerLayout.d)paramView.getLayoutParams();
    int i1 = ((DrawerLayout.d)localObject).d & 0x1;
    int i2 = 1;
    if (i1 == i2)
    {
      ((DrawerLayout.d)localObject).d = 0;
      localObject = this.y;
      if (localObject != null)
      {
        localObject = this.y;
        int i3 = ((List)localObject).size() + -1;
        for (i1 = i3; i1 >= 0; i1 = i3)
        {
          localObject = (DrawerLayout.c)this.y.get(i1);
          ((DrawerLayout.c)localObject).onDrawerClosed(paramView);
          i3 = i1 + -1;
        }
      }
      c(paramView, false);
      boolean bool = hasWindowFocus();
      if (bool)
      {
        localObject = getRootView();
        if (localObject != null)
        {
          i1 = 32;
          ((View)localObject).sendAccessibilityEvent(i1);
        }
      }
    }
  }
  
  void b(View paramView, float paramFloat)
  {
    DrawerLayout.d locald = (DrawerLayout.d)paramView.getLayoutParams();
    float f1 = locald.b;
    boolean bool = paramFloat < f1;
    if (!bool) {}
    for (;;)
    {
      return;
      locald.b = paramFloat;
      a(paramView, paramFloat);
    }
  }
  
  public void b(View paramView, boolean paramBoolean)
  {
    int i1 = 0;
    boolean bool1 = g(paramView);
    if (!bool1)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "View " + paramView + " is not a sliding drawer";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (DrawerLayout.d)paramView.getLayoutParams();
    boolean bool2 = this.q;
    if (bool2)
    {
      ((DrawerLayout.d)localObject1).b = 0.0F;
      ((DrawerLayout.d)localObject1).d = 0;
    }
    for (;;)
    {
      invalidate();
      return;
      if (paramBoolean)
      {
        int i3 = ((DrawerLayout.d)localObject1).d | 0x4;
        ((DrawerLayout.d)localObject1).d = i3;
        bool1 = a(paramView, 3);
        if (bool1)
        {
          localObject1 = this.k;
          i3 = -paramView.getWidth();
          i1 = paramView.getTop();
          ((q)localObject1).a(paramView, i3, i1);
        }
        else
        {
          localObject1 = this.l;
          i3 = getWidth();
          i1 = paramView.getTop();
          ((q)localObject1).a(paramView, i3, i1);
        }
      }
      else
      {
        c(paramView, 0.0F);
        int i2 = ((DrawerLayout.d)localObject1).a;
        a(i2, 0, paramView);
        i2 = 4;
        paramView.setVisibility(i2);
      }
    }
  }
  
  View c()
  {
    int i1 = getChildCount();
    int i2 = 0;
    View localView = null;
    int i3 = 0;
    if (i3 < i1)
    {
      localView = getChildAt(i3);
      boolean bool = g(localView);
      if (bool)
      {
        bool = k(localView);
        if (!bool) {}
      }
    }
    for (;;)
    {
      return localView;
      i2 = i3 + 1;
      i3 = i2;
      break;
      i2 = 0;
      localView = null;
    }
  }
  
  View c(int paramInt)
  {
    int i1 = r.e(this);
    int i2 = d.a(paramInt, i1) & 0x7;
    int i3 = getChildCount();
    i1 = 0;
    View localView = null;
    int i4 = 0;
    if (i4 < i3)
    {
      localView = getChildAt(i4);
      int i5 = e(localView) & 0x7;
      if (i5 != i2) {}
    }
    for (;;)
    {
      return localView;
      i1 = i4 + 1;
      i4 = i1;
      break;
      i1 = 0;
      localView = null;
    }
  }
  
  void c(View paramView)
  {
    int i1 = 1;
    Object localObject = (DrawerLayout.d)paramView.getLayoutParams();
    int i2 = ((DrawerLayout.d)localObject).d & 0x1;
    if (i2 == 0)
    {
      ((DrawerLayout.d)localObject).d = i1;
      localObject = this.y;
      if (localObject != null)
      {
        localObject = this.y;
        int i3 = ((List)localObject).size() + -1;
        for (i2 = i3; i2 >= 0; i2 = i3)
        {
          localObject = (DrawerLayout.c)this.y.get(i2);
          ((DrawerLayout.c)localObject).onDrawerOpened(paramView);
          i3 = i2 + -1;
        }
      }
      c(paramView, i1);
      boolean bool = hasWindowFocus();
      if (bool)
      {
        int i4 = 32;
        sendAccessibilityEvent(i4);
      }
    }
  }
  
  void c(View paramView, float paramFloat)
  {
    float f1 = d(paramView);
    int i1 = paramView.getWidth();
    float f2 = i1;
    f1 *= f2;
    int i2 = (int)f1;
    i2 = (int)(i1 * paramFloat) - i2;
    boolean bool = a(paramView, 3);
    if (bool) {}
    for (;;)
    {
      paramView.offsetLeftAndRight(i2);
      b(paramView, paramFloat);
      return;
      i2 = -i2;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof DrawerLayout.d;
    if (bool)
    {
      bool = super.checkLayoutParams((ViewGroup.LayoutParams)paramLayoutParams);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void computeScroll()
  {
    boolean bool1 = true;
    int i1 = getChildCount();
    int i2 = 0;
    float f1 = 0.0F;
    Object localObject = null;
    float f2 = 0.0F;
    int i3 = 0;
    q localq = null;
    while (i3 < i1)
    {
      localObject = (DrawerLayout.d)getChildAt(i3).getLayoutParams();
      f1 = ((DrawerLayout.d)localObject).b;
      f2 = Math.max(f2, f1);
      i2 = i3 + 1;
      i3 = i2;
    }
    this.i = f2;
    localObject = this.k;
    boolean bool2 = ((q)localObject).a(bool1);
    localq = this.l;
    boolean bool3 = localq.a(bool1);
    if ((bool2) || (bool3)) {
      r.c(this);
    }
  }
  
  float d(View paramView)
  {
    return ((DrawerLayout.d)paramView.getLayoutParams()).b;
  }
  
  void d()
  {
    int i1 = 0;
    boolean bool = this.w;
    if (!bool)
    {
      long l1 = SystemClock.uptimeMillis();
      int i2 = 3;
      MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, i2, 0.0F, 0.0F, 0);
      int i3 = getChildCount();
      while (i1 < i3)
      {
        View localView = getChildAt(i1);
        localView.dispatchTouchEvent(localMotionEvent);
        i1 += 1;
      }
      localMotionEvent.recycle();
      bool = true;
      this.w = bool;
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i1 = getHeight();
    boolean bool1 = f(paramView);
    int i3 = 0;
    float f1 = 0.0F;
    int i4 = getWidth();
    int i6 = paramCanvas.save();
    int i8;
    Object localObject1;
    int i11;
    Object localObject2;
    float f2;
    if (bool1)
    {
      int i7 = getChildCount();
      i8 = 0;
      localObject1 = null;
      i11 = 0;
      localObject2 = null;
      f2 = 0.0F;
      for (;;)
      {
        if (i11 < i7)
        {
          localObject1 = getChildAt(i11);
          if (localObject1 != paramView)
          {
            int i12 = ((View)localObject1).getVisibility();
            if (i12 == 0)
            {
              boolean bool6 = m((View)localObject1);
              if (bool6)
              {
                bool6 = g((View)localObject1);
                if (bool6)
                {
                  int i13 = ((View)localObject1).getHeight();
                  if (i13 < i1)
                  {
                    i8 = i4;
                    i11 += 1;
                    i4 = i8;
                    continue;
                  }
                  boolean bool7 = a((View)localObject1, 3);
                  if (bool7)
                  {
                    i8 = ((View)localObject1).getRight();
                    if (i8 <= i3) {
                      break label760;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      i3 = i8;
      i8 = i4;
      break;
      i8 = ((View)localObject1).getLeft();
      if (i8 < i4) {
        break;
      }
      i8 = i4;
      break;
      i8 = 0;
      localObject1 = null;
      i11 = getHeight();
      paramCanvas.clipRect(i3, 0, i4, i11);
      i8 = i4;
      boolean bool3 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i6);
      float f3 = this.i;
      i11 = 0;
      f2 = 0.0F;
      localObject2 = null;
      boolean bool2 = f3 < 0.0F;
      int i5;
      q localq;
      float f4;
      if ((bool2) && (bool1))
      {
        f3 = (this.h & 0xFF000000) >>> 24;
        f2 = this.i;
        i5 = (int)(f3 * f2) << 24;
        i11 = this.h;
        i1 = 16777215;
        i11 &= i1;
        i5 |= i11;
        localObject2 = this.j;
        ((Paint)localObject2).setColor(i5);
        f1 = i3;
        i5 = 0;
        f3 = 0.0F;
        localq = null;
        f2 = i8;
        i8 = getHeight();
        f4 = i8;
        Paint localPaint = this.j;
        localObject1 = paramCanvas;
        paramCanvas.drawRect(f1, 0.0F, f2, f4, localPaint);
      }
      for (;;)
      {
        return bool3;
        localObject1 = this.C;
        int i2;
        if (localObject1 != null)
        {
          boolean bool4 = a(paramView, 3);
          if (bool4)
          {
            int i9 = this.C.getIntrinsicWidth();
            i3 = paramView.getRight();
            localq = this.k;
            i5 = localq.b();
            i11 = 0;
            f2 = 0.0F;
            f4 = i3;
            f3 = i5;
            f3 = f4 / f3;
            f4 = 1.0F;
            f3 = Math.min(f3, f4);
            f3 = Math.max(0.0F, f3);
            localObject2 = this.C;
            i1 = paramView.getTop();
            i9 += i3;
            i2 = paramView.getBottom();
            ((Drawable)localObject2).setBounds(i3, i1, i9, i2);
            localObject1 = this.C;
            f1 = 255.0F * f3;
            i3 = (int)f1;
            ((Drawable)localObject1).setAlpha(i3);
            localObject1 = this.C;
            ((Drawable)localObject1).draw(paramCanvas);
            continue;
          }
        }
        localObject1 = this.D;
        if (localObject1 != null)
        {
          boolean bool5 = a(paramView, 5);
          if (bool5)
          {
            i10 = this.D.getIntrinsicWidth();
            i3 = paramView.getLeft();
            i5 = getWidth() - i3;
            i11 = this.l.b();
            f4 = 0.0F;
            f3 = i5;
            f2 = i11;
            f3 /= f2;
            i11 = 1065353216;
            f2 = 1.0F;
            f3 = Math.min(f3, f2);
            f3 = Math.max(0.0F, f3);
            localObject2 = this.D;
            i10 = i3 - i10;
            i1 = paramView.getTop();
            i2 = paramView.getBottom();
            ((Drawable)localObject2).setBounds(i10, i1, i3, i2);
            localObject1 = this.D;
            f1 = 255.0F * f3;
            i3 = (int)f1;
            ((Drawable)localObject1).setAlpha(i3);
            localObject1 = this.D;
            ((Drawable)localObject1).draw(paramCanvas);
          }
        }
      }
      label760:
      int i10 = i3;
    }
  }
  
  int e(View paramView)
  {
    int i1 = ((DrawerLayout.d)paramView.getLayoutParams()).a;
    int i2 = r.e(this);
    return d.a(i1, i2);
  }
  
  public void e(int paramInt)
  {
    a(paramInt, true);
  }
  
  public void f(int paramInt)
  {
    b(paramInt, true);
  }
  
  boolean f(View paramView)
  {
    DrawerLayout.d locald = (DrawerLayout.d)paramView.getLayoutParams();
    int i1 = locald.a;
    if (i1 == 0) {
      i1 = 1;
    }
    for (;;)
    {
      return i1;
      int i2 = 0;
      locald = null;
    }
  }
  
  public boolean g(int paramInt)
  {
    View localView = c(paramInt);
    boolean bool;
    if (localView != null) {
      bool = j(localView);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localView = null;
    }
  }
  
  boolean g(View paramView)
  {
    int i1 = 1;
    DrawerLayout.d locald = (DrawerLayout.d)paramView.getLayoutParams();
    int i2 = locald.a;
    int i4 = r.e(paramView);
    i2 = d.a(i2, i4);
    i4 = i2 & 0x3;
    if (i4 != 0) {
      i2 = i1;
    }
    for (;;)
    {
      return i2;
      int i3;
      i2 &= 0x5;
      if (i3 != 0)
      {
        i3 = i1;
      }
      else
      {
        i3 = 0;
        locald = null;
      }
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    int i1 = -1;
    DrawerLayout.d locald = new android/support/v4/widget/DrawerLayout$d;
    locald.<init>(i1, i1);
    return locald;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    DrawerLayout.d locald = new android/support/v4/widget/DrawerLayout$d;
    Context localContext = getContext();
    locald.<init>(localContext, paramAttributeSet);
    return locald;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof DrawerLayout.d;
    DrawerLayout.d locald;
    if (bool)
    {
      locald = new android/support/v4/widget/DrawerLayout$d;
      paramLayoutParams = (DrawerLayout.d)paramLayoutParams;
      locald.<init>(paramLayoutParams);
    }
    for (;;)
    {
      return locald;
      bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
      if (bool)
      {
        locald = new android/support/v4/widget/DrawerLayout$d;
        paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
        locald.<init>(paramLayoutParams);
      }
      else
      {
        locald = new android/support/v4/widget/DrawerLayout$d;
        locald.<init>(paramLayoutParams);
      }
    }
  }
  
  public float getDrawerElevation()
  {
    boolean bool = d;
    if (bool) {}
    for (float f1 = this.f;; f1 = 0.0F)
    {
      return f1;
      bool = false;
    }
  }
  
  public Drawable getStatusBarBackgroundDrawable()
  {
    return this.B;
  }
  
  public void h(View paramView)
  {
    a(paramView, true);
  }
  
  public boolean h(int paramInt)
  {
    View localView = c(paramInt);
    boolean bool;
    if (localView != null) {
      bool = k(localView);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localView = null;
    }
  }
  
  public void i(View paramView)
  {
    b(paramView, true);
  }
  
  public boolean j(View paramView)
  {
    int i1 = 1;
    boolean bool = g(paramView);
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "View " + paramView + " is not a drawer";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (DrawerLayout.d)paramView.getLayoutParams();
    int i2 = ((DrawerLayout.d)localObject1).d & 0x1;
    if (i2 == i1) {
      i2 = i1;
    }
    for (;;)
    {
      return i2;
      int i3 = 0;
      localObject1 = null;
    }
  }
  
  public boolean k(View paramView)
  {
    boolean bool = g(paramView);
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "View " + paramView + " is not a drawer";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = (DrawerLayout.d)paramView.getLayoutParams();
    float f1 = ((DrawerLayout.d)localObject1).b;
    Object localObject2 = null;
    bool = f1 < 0.0F;
    if (bool)
    {
      bool = true;
      f1 = Float.MIN_VALUE;
    }
    for (;;)
    {
      return bool;
      bool = false;
      f1 = 0.0F;
      localObject1 = null;
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.q = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.q = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    boolean bool = this.H;
    Object localObject;
    int i1;
    if (bool)
    {
      localObject = this.B;
      if (localObject != null)
      {
        i1 = Build.VERSION.SDK_INT;
        int i2 = 21;
        if (i1 < i2) {
          break label103;
        }
        localObject = this.G;
        if (localObject == null) {
          break label96;
        }
        localObject = (WindowInsets)this.G;
        i1 = ((WindowInsets)localObject).getSystemWindowInsetTop();
      }
    }
    for (;;)
    {
      if (i1 > 0)
      {
        Drawable localDrawable = this.B;
        int i3 = getWidth();
        localDrawable.setBounds(0, 0, i3, i1);
        localObject = this.B;
        ((Drawable)localObject).draw(paramCanvas);
      }
      return;
      label96:
      i1 = 0;
      localObject = null;
      continue;
      label103:
      i1 = 0;
      localObject = null;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    int i1 = paramMotionEvent.getActionMasked();
    q localq1 = this.k;
    boolean bool5 = localq1.a(paramMotionEvent);
    q localq2 = this.l;
    boolean bool6 = localq2.a(paramMotionEvent);
    bool5 |= bool6;
    Object localObject;
    label89:
    label124:
    float f3;
    int i3;
    boolean bool4;
    switch (i1)
    {
    default: 
      i1 = 0;
      localObject = null;
      f2 = 0.0F;
      if ((!bool5) && (i1 == 0))
      {
        boolean bool3 = h();
        if (!bool3)
        {
          bool3 = this.w;
          if (!bool3) {
            break label124;
          }
        }
      }
      bool2 = bool1;
      return bool2;
    case 0: 
      f2 = paramMotionEvent.getX();
      f3 = paramMotionEvent.getY();
      this.z = f2;
      this.A = f3;
      float f4 = this.i;
      boolean bool7 = f4 < 0.0F;
      if (bool7)
      {
        q localq3 = this.k;
        int i2 = (int)f2;
        i3 = (int)f3;
        localObject = localq3.d(i2, i3);
        if (localObject != null)
        {
          bool4 = f((View)localObject);
          if (bool4) {
            bool4 = bool1;
          }
        }
      }
      break;
    }
    for (float f2 = f1;; f2 = 0.0F)
    {
      this.v = false;
      this.w = false;
      break label89;
      localObject = this.k;
      i3 = 3;
      f3 = 4.2E-45F;
      bool4 = ((q)localObject).d(i3);
      if (!bool4) {
        break;
      }
      this.m.a();
      this.n.a();
      bool4 = false;
      localObject = null;
      f2 = 0.0F;
      break label89;
      a(bool1);
      this.v = false;
      this.w = false;
      break;
      bool4 = false;
      localObject = null;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    int i1 = 4;
    if (paramInt == i1)
    {
      bool = i();
      if (bool) {
        paramKeyEvent.startTracking();
      }
    }
    for (boolean bool = true;; bool = super.onKeyDown(paramInt, paramKeyEvent)) {
      return bool;
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    int i1 = 4;
    View localView;
    if (paramInt == i1)
    {
      localView = c();
      if (localView != null)
      {
        int i2 = a(localView);
        if (i2 == 0) {
          b();
        }
      }
      if (localView != null) {
        i1 = 1;
      }
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      localView = null;
      continue;
      boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.p = true;
    int i1 = paramInt3 - paramInt1;
    int i2 = getChildCount();
    int i3 = 0;
    float f1 = 0.0F;
    DrawerLayout.d locald = null;
    int i6 = 0;
    if (i6 < i2)
    {
      View localView = getChildAt(i6);
      i3 = localView.getVisibility();
      int i7 = 8;
      float f2 = 1.1E-44F;
      if (i3 == i7) {}
      int i11;
      int i13;
      for (;;)
      {
        i3 = i6 + 1;
        i6 = i3;
        break;
        locald = (DrawerLayout.d)localView.getLayoutParams();
        boolean bool1 = f(localView);
        if (!bool1) {
          break label175;
        }
        int i8 = locald.leftMargin;
        i11 = locald.topMargin;
        int i12 = locald.leftMargin;
        i13 = localView.getMeasuredWidth();
        i12 += i13;
        i3 = locald.topMargin;
        i13 = localView.getMeasuredHeight();
        i3 += i13;
        localView.layout(i8, i11, i12, i3);
      }
      label175:
      int i14 = localView.getMeasuredWidth();
      int i15 = localView.getMeasuredHeight();
      f2 = 4.2E-45F;
      boolean bool2 = a(localView, 3);
      int i9;
      float f3;
      float f4;
      label263:
      boolean bool3;
      label289:
      int i16;
      label369:
      int i4;
      if (bool2)
      {
        i9 = -i14;
        f3 = i14;
        f4 = locald.b;
        f3 *= f4;
        i11 = (int)f3 + i9;
        i9 = i14 + i11;
        f2 = i9;
        f4 = i14;
        f2 /= f4;
        f4 = locald.b;
        bool3 = f2 < f4;
        if (!bool3) {
          break label493;
        }
        bool3 = true;
        f4 = Float.MIN_VALUE;
        i13 = locald.a & 0x70;
        switch (i13)
        {
        default: 
          i13 = locald.topMargin;
          i14 += i11;
          i16 = locald.topMargin;
          i15 += i16;
          localView.layout(i11, i13, i14, i15);
          if (bool3) {
            b(localView, f2);
          }
          f1 = locald.b;
          i9 = 0;
          f2 = 0.0F;
          i4 = f1 < 0.0F;
          if (i4 > 0)
          {
            i4 = 0;
            f1 = 0.0F;
            locald = null;
          }
          break;
        }
      }
      for (;;)
      {
        i9 = localView.getVisibility();
        if (i9 == i4) {
          break;
        }
        localView.setVisibility(i4);
        break;
        f2 = i14;
        f3 = locald.b;
        int i10 = (int)(f2 * f3);
        i11 = i1 - i10;
        i10 = i1 - i11;
        f2 = i10;
        f4 = i14;
        f2 /= f4;
        break label263;
        label493:
        bool3 = false;
        f4 = 0.0F;
        break label289;
        i13 = paramInt4 - paramInt2;
        i15 = locald.bottomMargin;
        i15 = i13 - i15;
        i16 = localView.getMeasuredHeight();
        i15 -= i16;
        i14 += i11;
        i16 = locald.bottomMargin;
        i13 -= i16;
        localView.layout(i11, i15, i14, i13);
        break label369;
        i16 = paramInt4 - paramInt2;
        i13 = (i16 - i15) / 2;
        int i17 = locald.topMargin;
        if (i13 < i17) {
          i13 = locald.topMargin;
        }
        for (;;)
        {
          i14 += i11;
          i15 += i13;
          localView.layout(i11, i13, i14, i15);
          break;
          i17 = i13 + i15;
          int i18 = locald.bottomMargin;
          i18 = i16 - i18;
          if (i17 > i18)
          {
            i13 = locald.bottomMargin;
            i13 = i16 - i13 - i15;
          }
        }
        int i5 = 4;
        f1 = 5.6E-45F;
      }
    }
    this.p = false;
    this.q = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    int i3 = View.MeasureSpec.getSize(paramInt1);
    int i7 = View.MeasureSpec.getSize(paramInt2);
    int i10 = 1073741824;
    int i11;
    if (i1 == i10)
    {
      i10 = 1073741824;
      if (i2 == i10) {}
    }
    else
    {
      boolean bool4 = isInEditMode();
      if (bool4)
      {
        i11 = -1 << -1;
        if (i1 == i11)
        {
          i1 = -1 << -1;
          if (i2 != i1) {
            break label222;
          }
          i1 = i7;
          i2 = i3;
        }
      }
    }
    for (;;)
    {
      label85:
      setMeasuredDimension(i2, i1);
      Object localObject1 = this.G;
      int i8;
      if (localObject1 != null)
      {
        i8 = r.p(this);
        if (i8 != 0) {
          i8 = 1;
        }
      }
      int i12;
      int i13;
      float f1;
      int i14;
      float f2;
      int i16;
      View localView;
      int i9;
      float f3;
      for (i11 = i8;; i11 = 0)
      {
        i12 = r.e(this);
        i13 = 0;
        f1 = 0.0F;
        i14 = 0;
        f2 = 0.0F;
        int i15 = getChildCount();
        i8 = 0;
        localObject1 = null;
        for (i16 = 0;; i16 = i9)
        {
          if (i16 >= i15) {
            break label1167;
          }
          localView = getChildAt(i16);
          i9 = localView.getVisibility();
          i3 = 8;
          f3 = 1.1E-44F;
          if (i9 != i3) {
            break;
          }
          i9 = i16 + 1;
        }
        if (i1 != 0) {
          break;
        }
        i3 = 300;
        f3 = 4.2E-43F;
        break;
        label222:
        if (i2 != 0) {
          break label1168;
        }
        i9 = 300;
        i1 = i9;
        i2 = i3;
        break label85;
        localObject1 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject1).<init>("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        throw ((Throwable)localObject1);
        i9 = 0;
        localObject1 = null;
      }
      localObject1 = (DrawerLayout.d)localView.getLayoutParams();
      int i17;
      int i19;
      int i20;
      if (i11 != 0)
      {
        i17 = d.a(((DrawerLayout.d)localObject1).a, i12);
        boolean bool1 = r.p(localView);
        if (!bool1) {
          break label549;
        }
        int i4 = Build.VERSION.SDK_INT;
        i18 = 21;
        if (i4 >= i18)
        {
          localObject2 = (WindowInsets)this.G;
          i18 = 3;
          if (i17 != i18) {
            break label495;
          }
          i17 = ((WindowInsets)localObject2).getSystemWindowInsetLeft();
          i18 = ((WindowInsets)localObject2).getSystemWindowInsetTop();
          i19 = 0;
          i20 = ((WindowInsets)localObject2).getSystemWindowInsetBottom();
          localObject2 = ((WindowInsets)localObject2).replaceSystemWindowInsets(i17, i18, 0, i20);
          label382:
          localView.dispatchApplyWindowInsets((WindowInsets)localObject2);
        }
      }
      int i5;
      float f4;
      label495:
      label549:
      do
      {
        boolean bool2 = f(localView);
        if (!bool2) {
          break label735;
        }
        i5 = ((DrawerLayout.d)localObject1).leftMargin;
        i5 = i2 - i5;
        i17 = ((DrawerLayout.d)localObject1).rightMargin;
        i5 = View.MeasureSpec.makeMeasureSpec(i5 - i17, 1073741824);
        i17 = ((DrawerLayout.d)localObject1).topMargin;
        i17 = i1 - i17;
        i9 = ((DrawerLayout.d)localObject1).bottomMargin;
        i9 = i17 - i9;
        i17 = 1073741824;
        f4 = 2.0F;
        i9 = View.MeasureSpec.makeMeasureSpec(i9, i17);
        localView.measure(i5, i9);
        break;
        i18 = 5;
        if (i17 != i18) {
          break label382;
        }
        i17 = 0;
        f4 = 0.0F;
        i18 = ((WindowInsets)localObject2).getSystemWindowInsetTop();
        i19 = ((WindowInsets)localObject2).getSystemWindowInsetRight();
        i20 = ((WindowInsets)localObject2).getSystemWindowInsetBottom();
        localObject2 = ((WindowInsets)localObject2).replaceSystemWindowInsets(0, i18, i19, i20);
        break label382;
        i5 = Build.VERSION.SDK_INT;
        i18 = 21;
      } while (i5 < i18);
      Object localObject2 = (WindowInsets)this.G;
      int i18 = 3;
      if (i17 == i18)
      {
        i17 = ((WindowInsets)localObject2).getSystemWindowInsetLeft();
        i18 = ((WindowInsets)localObject2).getSystemWindowInsetTop();
        i19 = 0;
        i20 = ((WindowInsets)localObject2).getSystemWindowInsetBottom();
        localObject2 = ((WindowInsets)localObject2).replaceSystemWindowInsets(i17, i18, 0, i20);
      }
      for (;;)
      {
        i17 = ((WindowInsets)localObject2).getSystemWindowInsetLeft();
        ((DrawerLayout.d)localObject1).leftMargin = i17;
        i17 = ((WindowInsets)localObject2).getSystemWindowInsetTop();
        ((DrawerLayout.d)localObject1).topMargin = i17;
        i17 = ((WindowInsets)localObject2).getSystemWindowInsetRight();
        ((DrawerLayout.d)localObject1).rightMargin = i17;
        i5 = ((WindowInsets)localObject2).getSystemWindowInsetBottom();
        ((DrawerLayout.d)localObject1).bottomMargin = i5;
        break;
        i18 = 5;
        if (i17 == i18)
        {
          i17 = 0;
          f4 = 0.0F;
          i18 = ((WindowInsets)localObject2).getSystemWindowInsetTop();
          i19 = ((WindowInsets)localObject2).getSystemWindowInsetRight();
          i20 = ((WindowInsets)localObject2).getSystemWindowInsetBottom();
          localObject2 = ((WindowInsets)localObject2).replaceSystemWindowInsets(0, i18, i19, i20);
        }
      }
      label735:
      boolean bool3 = g(localView);
      int i6;
      if (bool3)
      {
        bool3 = d;
        if (bool3)
        {
          f3 = r.l(localView);
          f4 = this.f;
          bool3 = f3 < f4;
          if (bool3)
          {
            f3 = this.f;
            r.a(localView, f3);
          }
        }
        i17 = e(localView) & 0x7;
        i6 = 3;
        f3 = 4.2E-45F;
        if (i17 == i6)
        {
          i6 = 1;
          f3 = Float.MIN_VALUE;
        }
        while (((i6 != 0) && (i13 != 0)) || ((i6 == 0) && (i14 != 0)))
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append("Child drawer has absolute gravity ");
          String str = d(i17);
          localObject2 = str + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge";
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
          i6 = 0;
          f3 = 0.0F;
          localObject2 = null;
        }
        if (i6 != 0)
        {
          int i21 = i14;
          float f5 = f2;
          i14 = 1;
          f2 = Float.MIN_VALUE;
          i6 = i21;
          f3 = f5;
        }
        for (;;)
        {
          i13 = this.g;
          i17 = ((DrawerLayout.d)localObject1).leftMargin;
          i13 += i17;
          i17 = ((DrawerLayout.d)localObject1).rightMargin;
          i13 += i17;
          i17 = ((DrawerLayout.d)localObject1).width;
          i13 = getChildMeasureSpec(paramInt1, i13, i17);
          i17 = ((DrawerLayout.d)localObject1).topMargin;
          i18 = ((DrawerLayout.d)localObject1).bottomMargin;
          i17 += i18;
          i9 = ((DrawerLayout.d)localObject1).height;
          i9 = getChildMeasureSpec(paramInt2, i17, i9);
          localView.measure(i13, i9);
          i13 = i14;
          f1 = f2;
          i14 = i6;
          f2 = f3;
          break;
          i6 = 1;
          f3 = Float.MIN_VALUE;
          i14 = i13;
          f2 = f1;
        }
      }
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Child " + localView + " at index " + i16 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
      label1167:
      return;
      label1168:
      i1 = i9;
      i2 = i6;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    int i1 = 3;
    boolean bool = paramParcelable instanceof DrawerLayout.SavedState;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (DrawerLayout.SavedState)paramParcelable;
      Object localObject = paramParcelable.getSuperState();
      super.onRestoreInstanceState((Parcelable)localObject);
      int i2 = paramParcelable.a;
      if (i2 != 0)
      {
        i2 = paramParcelable.a;
        localObject = c(i2);
        if (localObject != null) {
          h((View)localObject);
        }
      }
      i2 = paramParcelable.b;
      if (i2 != i1)
      {
        i2 = paramParcelable.b;
        a(i2, i1);
      }
      i2 = paramParcelable.c;
      int i3;
      if (i2 != i1)
      {
        i2 = paramParcelable.c;
        i3 = 5;
        a(i2, i3);
      }
      i2 = paramParcelable.d;
      if (i2 != i1)
      {
        i2 = paramParcelable.d;
        i3 = 8388611;
        a(i2, i3);
      }
      i2 = paramParcelable.e;
      if (i2 != i1)
      {
        i2 = paramParcelable.e;
        i3 = 8388613;
        a(i2, i3);
      }
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    e();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    int i1 = 1;
    Object localObject = super.onSaveInstanceState();
    DrawerLayout.SavedState localSavedState = new android/support/v4/widget/DrawerLayout$SavedState;
    localSavedState.<init>((Parcelable)localObject);
    int i2 = getChildCount();
    int i7;
    for (int i3 = 0;; i3 = i7)
    {
      int i4;
      if (i3 < i2)
      {
        localObject = (DrawerLayout.d)getChildAt(i3).getLayoutParams();
        i4 = ((DrawerLayout.d)localObject).d;
        if (i4 != i1) {
          break label151;
        }
        i4 = i1;
        i5 = ((DrawerLayout.d)localObject).d;
        int i6 = 2;
        if (i5 != i6) {
          break label157;
        }
      }
      label151:
      label157:
      for (int i5 = i1;; i5 = 0)
      {
        if ((i4 == 0) && (i5 == 0)) {
          break label163;
        }
        i7 = ((DrawerLayout.d)localObject).a;
        localSavedState.a = i7;
        i7 = this.r;
        localSavedState.b = i7;
        i7 = this.s;
        localSavedState.c = i7;
        i7 = this.t;
        localSavedState.d = i7;
        i7 = this.u;
        localSavedState.e = i7;
        return localSavedState;
        i4 = 0;
        break;
      }
      label163:
      i7 = i3 + 1;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    float f1 = Float.MIN_VALUE;
    this.k.b(paramMotionEvent);
    Object localObject1 = this.l;
    ((q)localObject1).b(paramMotionEvent);
    int i2 = paramMotionEvent.getAction() & 0xFF;
    float f2;
    float f3;
    int i3;
    switch (i2)
    {
    case 2: 
    default: 
    case 0: 
      for (;;)
      {
        return i1;
        f2 = paramMotionEvent.getX();
        f3 = paramMotionEvent.getY();
        this.z = f2;
        this.A = f3;
        this.v = false;
        this.w = false;
      }
    case 1: 
      f2 = paramMotionEvent.getX();
      f3 = paramMotionEvent.getY();
      Object localObject2 = this.k;
      int i5 = (int)f2;
      int i6 = (int)f3;
      localObject2 = ((q)localObject2).d(i5, i6);
      if (localObject2 != null)
      {
        boolean bool2 = f((View)localObject2);
        if (bool2)
        {
          float f4 = this.z;
          f2 -= f4;
          f4 = this.A;
          f3 -= f4;
          localObject2 = this.k;
          int i7 = ((q)localObject2).d();
          f2 *= f2;
          f3 *= f3;
          f2 += f3;
          int i8 = i7 * i7;
          f3 = i8;
          boolean bool1 = f2 < f3;
          if (bool1)
          {
            localObject1 = a();
            if (localObject1 != null)
            {
              i3 = a((View)localObject1);
              i8 = 2;
              f3 = 2.8E-45F;
              if (i3 == i8)
              {
                i3 = i1;
                f2 = f1;
              }
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      a(i3);
      this.v = false;
      break;
      int i4 = 0;
      localObject1 = null;
      f2 = 0.0F;
      continue;
      a(i1);
      this.v = false;
      this.w = false;
      break;
      i4 = i1;
      f2 = f1;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    this.v = paramBoolean;
    if (paramBoolean)
    {
      boolean bool = true;
      a(bool);
    }
  }
  
  public void requestLayout()
  {
    boolean bool = this.p;
    if (!bool) {
      super.requestLayout();
    }
  }
  
  public void setDrawerElevation(float paramFloat)
  {
    this.f = paramFloat;
    int i1 = 0;
    for (;;)
    {
      int i2 = getChildCount();
      if (i1 >= i2) {
        break;
      }
      View localView = getChildAt(i1);
      boolean bool = g(localView);
      if (bool)
      {
        float f1 = this.f;
        r.a(localView, f1);
      }
      i1 += 1;
    }
  }
  
  public void setDrawerListener(DrawerLayout.c paramc)
  {
    DrawerLayout.c localc = this.x;
    if (localc != null)
    {
      localc = this.x;
      b(localc);
    }
    if (paramc != null) {
      a(paramc);
    }
    this.x = paramc;
  }
  
  public void setDrawerLockMode(int paramInt)
  {
    a(paramInt, 3);
    a(paramInt, 5);
  }
  
  public void setScrimColor(int paramInt)
  {
    this.h = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = b.a(getContext(), paramInt);; localDrawable = null)
    {
      this.B = localDrawable;
      invalidate();
      return;
    }
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    this.B = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
    localColorDrawable.<init>(paramInt);
    this.B = localColorDrawable;
    invalidate();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\DrawerLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */