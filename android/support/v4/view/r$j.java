package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewParent;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

class r$j
{
  static Field b;
  static boolean c = false;
  private static Field d;
  private static boolean e;
  private static Field f;
  private static boolean g;
  private static WeakHashMap h;
  private static final AtomicInteger i;
  WeakHashMap a = null;
  
  static
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>(1);
    i = localAtomicInteger;
  }
  
  private static void D(View paramView)
  {
    float f1 = paramView.getTranslationY();
    float f2 = 1.0F + f1;
    paramView.setTranslationY(f2);
    paramView.setTranslationY(f1);
  }
  
  public float A(View paramView)
  {
    float f1 = v(paramView);
    float f2 = u(paramView);
    return f1 + f2;
  }
  
  /* Error */
  public boolean B(View paramView)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: getstatic 28	android/support/v4/view/r$j:c	Z
    //   7: istore 4
    //   9: iload 4
    //   11: ifeq +5 -> 16
    //   14: iload_3
    //   15: ireturn
    //   16: getstatic 54	android/support/v4/view/r$j:b	Ljava/lang/reflect/Field;
    //   19: astore 5
    //   21: aload 5
    //   23: ifnonnull +40 -> 63
    //   26: ldc 35
    //   28: astore 5
    //   30: ldc 56
    //   32: astore 6
    //   34: aload 5
    //   36: aload 6
    //   38: invokevirtual 62	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   41: astore 5
    //   43: aload 5
    //   45: putstatic 54	android/support/v4/view/r$j:b	Ljava/lang/reflect/Field;
    //   48: getstatic 54	android/support/v4/view/r$j:b	Ljava/lang/reflect/Field;
    //   51: astore 5
    //   53: iconst_1
    //   54: istore 7
    //   56: aload 5
    //   58: iload 7
    //   60: invokevirtual 68	java/lang/reflect/Field:setAccessible	(Z)V
    //   63: getstatic 54	android/support/v4/view/r$j:b	Ljava/lang/reflect/Field;
    //   66: astore 5
    //   68: aload 5
    //   70: aload_1
    //   71: invokevirtual 72	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   74: astore 5
    //   76: aload 5
    //   78: ifnull +17 -> 95
    //   81: iload_2
    //   82: istore_3
    //   83: goto -69 -> 14
    //   86: astore 5
    //   88: iload_2
    //   89: putstatic 28	android/support/v4/view/r$j:c	Z
    //   92: goto -78 -> 14
    //   95: iconst_0
    //   96: istore_2
    //   97: goto -16 -> 81
    //   100: astore 5
    //   102: iload_2
    //   103: putstatic 28	android/support/v4/view/r$j:c	Z
    //   106: goto -92 -> 14
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	j
    //   0	109	1	paramView	View
    //   1	102	2	bool1	boolean
    //   3	80	3	bool2	boolean
    //   7	3	4	bool3	boolean
    //   19	58	5	localObject1	Object
    //   86	1	5	localObject2	Object
    //   100	1	5	localObject3	Object
    //   32	5	6	str	String
    //   54	5	7	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   36	41	86	finally
    //   43	48	86	finally
    //   48	51	86	finally
    //   58	63	86	finally
    //   63	66	100	finally
    //   70	74	100	finally
  }
  
  public v C(View paramView)
  {
    Object localObject = this.a;
    if (localObject == null)
    {
      localObject = new java/util/WeakHashMap;
      ((WeakHashMap)localObject).<init>();
      this.a = ((WeakHashMap)localObject);
    }
    localObject = (v)this.a.get(paramView);
    if (localObject == null)
    {
      localObject = new android/support/v4/view/v;
      ((v)localObject).<init>(paramView);
      WeakHashMap localWeakHashMap = this.a;
      localWeakHashMap.put(paramView, localObject);
    }
    return (v)localObject;
  }
  
  long a()
  {
    return ValueAnimator.getFrameDelay();
  }
  
  public z a(View paramView, z paramz)
  {
    return paramz;
  }
  
  public void a(View paramView, float paramFloat) {}
  
  public void a(View paramView, int paramInt) {}
  
  public void a(View paramView, int paramInt1, int paramInt2) {}
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(View paramView, ColorStateList paramColorStateList)
  {
    boolean bool = paramView instanceof q;
    if (bool)
    {
      paramView = (q)paramView;
      paramView.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void a(View paramView, PorterDuff.Mode paramMode)
  {
    boolean bool = paramView instanceof q;
    if (bool)
    {
      paramView = (q)paramView;
      paramView.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void a(View paramView, Rect paramRect) {}
  
  public void a(View paramView, Drawable paramDrawable)
  {
    paramView.setBackgroundDrawable(paramDrawable);
  }
  
  public void a(View paramView, a parama)
  {
    if (parama == null) {}
    for (View.AccessibilityDelegate localAccessibilityDelegate = null;; localAccessibilityDelegate = parama.getBridge())
    {
      paramView.setAccessibilityDelegate(localAccessibilityDelegate);
      return;
    }
  }
  
  public void a(View paramView, o paramo) {}
  
  public void a(View paramView, p paramp) {}
  
  public void a(View paramView, Runnable paramRunnable)
  {
    long l = a();
    paramView.postDelayed(paramRunnable, l);
  }
  
  public void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    long l = a() + paramLong;
    paramView.postDelayed(paramRunnable, l);
  }
  
  public void a(View paramView, String paramString)
  {
    WeakHashMap localWeakHashMap = h;
    if (localWeakHashMap == null)
    {
      localWeakHashMap = new java/util/WeakHashMap;
      localWeakHashMap.<init>();
      h = localWeakHashMap;
    }
    h.put(paramView, paramString);
  }
  
  public void a(View paramView, boolean paramBoolean) {}
  
  public boolean a(View paramView)
  {
    return false;
  }
  
  public void b(View paramView, int paramInt) {}
  
  public boolean b(View paramView)
  {
    return false;
  }
  
  public void c(View paramView)
  {
    paramView.postInvalidate();
  }
  
  public void c(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
    int j = paramView.getVisibility();
    if (j == 0)
    {
      D(paramView);
      Object localObject = paramView.getParent();
      boolean bool = localObject instanceof View;
      if (bool)
      {
        localObject = (View)localObject;
        D((View)localObject);
      }
    }
  }
  
  public int d(View paramView)
  {
    return 0;
  }
  
  public void d(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
    int j = paramView.getVisibility();
    if (j == 0)
    {
      D(paramView);
      Object localObject = paramView.getParent();
      boolean bool = localObject instanceof View;
      if (bool)
      {
        localObject = (View)localObject;
        D((View)localObject);
      }
    }
  }
  
  public ViewParent e(View paramView)
  {
    return paramView.getParent();
  }
  
  public int f(View paramView)
  {
    boolean bool1 = true;
    boolean bool2 = e;
    String str;
    if (!bool2)
    {
      localObject1 = View.class;
      str = "mMinWidth";
    }
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField(str);
      d = (Field)localObject1;
      localObject1 = d;
      boolean bool3 = true;
      ((Field)localObject1).setAccessible(bool3);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
    e = bool1;
    Object localObject1 = d;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = d;
        localObject1 = ((Field)localObject1).get(paramView);
        localObject1 = (Integer)localObject1;
        j = ((Integer)localObject1).intValue();
        return j;
      }
      catch (Exception localException) {}
      int j = 0;
      Object localObject2 = null;
    }
  }
  
  public int g(View paramView)
  {
    boolean bool1 = true;
    boolean bool2 = g;
    String str;
    if (!bool2)
    {
      localObject1 = View.class;
      str = "mMinHeight";
    }
    try
    {
      localObject1 = ((Class)localObject1).getDeclaredField(str);
      f = (Field)localObject1;
      localObject1 = f;
      boolean bool3 = true;
      ((Field)localObject1).setAccessible(bool3);
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;) {}
    }
    g = bool1;
    Object localObject1 = f;
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject1 = f;
        localObject1 = ((Field)localObject1).get(paramView);
        localObject1 = (Integer)localObject1;
        j = ((Integer)localObject1).intValue();
        return j;
      }
      catch (Exception localException) {}
      int j = 0;
      Object localObject2 = null;
    }
  }
  
  public void h(View paramView) {}
  
  public boolean i(View paramView)
  {
    return false;
  }
  
  public boolean j(View paramView)
  {
    return true;
  }
  
  public int k(View paramView)
  {
    return 0;
  }
  
  public int l(View paramView)
  {
    return paramView.getPaddingLeft();
  }
  
  public int m(View paramView)
  {
    return paramView.getPaddingRight();
  }
  
  public int n(View paramView)
  {
    return 0;
  }
  
  public boolean o(View paramView)
  {
    return false;
  }
  
  public Display p(View paramView)
  {
    boolean bool = s(paramView);
    String str;
    if (bool)
    {
      localObject = paramView.getContext();
      str = "window";
    }
    for (Object localObject = ((WindowManager)((Context)localObject).getSystemService(str)).getDefaultDisplay();; localObject = null)
    {
      return (Display)localObject;
      bool = false;
    }
  }
  
  public Rect q(View paramView)
  {
    return null;
  }
  
  public boolean r(View paramView)
  {
    int j = paramView.getWidth();
    if (j > 0)
    {
      j = paramView.getHeight();
      if (j <= 0) {}
    }
    int k;
    for (j = 1;; k = 0) {
      return j;
    }
  }
  
  public boolean s(View paramView)
  {
    IBinder localIBinder = paramView.getWindowToken();
    boolean bool;
    if (localIBinder != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localIBinder = null;
    }
  }
  
  public String t(View paramView)
  {
    Object localObject = h;
    if (localObject == null) {}
    for (localObject = null;; localObject = (String)h.get(paramView)) {
      return (String)localObject;
    }
  }
  
  public float u(View paramView)
  {
    return 0.0F;
  }
  
  public float v(View paramView)
  {
    return 0.0F;
  }
  
  public boolean w(View paramView)
  {
    boolean bool = paramView instanceof i;
    if (bool) {
      paramView = (i)paramView;
    }
    for (bool = paramView.isNestedScrollingEnabled();; bool = false) {
      return bool;
    }
  }
  
  public void x(View paramView)
  {
    boolean bool = paramView instanceof i;
    if (bool)
    {
      paramView = (i)paramView;
      paramView.stopNestedScroll();
    }
  }
  
  public ColorStateList y(View paramView)
  {
    boolean bool = paramView instanceof q;
    if (bool) {
      paramView = (q)paramView;
    }
    for (ColorStateList localColorStateList = paramView.getSupportBackgroundTintList();; localColorStateList = null)
    {
      return localColorStateList;
      bool = false;
    }
  }
  
  public PorterDuff.Mode z(View paramView)
  {
    boolean bool = paramView instanceof q;
    if (bool) {
      paramView = (q)paramView;
    }
    for (PorterDuff.Mode localMode = paramView.getSupportBackgroundTintMode();; localMode = null)
    {
      return localMode;
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\r$j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */