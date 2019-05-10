package android.support.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

class aj$a
  extends ViewGroup
{
  static Method a;
  ViewGroup b;
  View c;
  ArrayList d = null;
  aj e;
  
  static
  {
    Object localObject = ViewGroup.class;
    String str = "invalidateChildInParentFast";
    int i = 3;
    try
    {
      Class[] arrayOfClass = new Class[i];
      int j = 0;
      Class localClass = Integer.TYPE;
      arrayOfClass[0] = localClass;
      j = 1;
      localClass = Integer.TYPE;
      arrayOfClass[j] = localClass;
      j = 2;
      localClass = Rect.class;
      arrayOfClass[j] = localClass;
      localObject = ((Class)localObject).getDeclaredMethod(str, arrayOfClass);
      a = (Method)localObject;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  aj$a(Context paramContext, ViewGroup paramViewGroup, View paramView, aj paramaj)
  {
    super(paramContext);
    this.b = paramViewGroup;
    this.c = paramView;
    int i = paramViewGroup.getWidth();
    setRight(i);
    i = paramViewGroup.getHeight();
    setBottom(i);
    paramViewGroup.addView(this);
    this.e = paramaj;
  }
  
  private void a(int[] paramArrayOfInt)
  {
    int i = 2;
    int j = 1;
    int[] arrayOfInt1 = new int[i];
    int[] arrayOfInt2 = new int[i];
    this.b.getLocationOnScreen(arrayOfInt1);
    this.c.getLocationOnScreen(arrayOfInt2);
    int k = arrayOfInt2[0];
    int m = arrayOfInt1[0];
    k -= m;
    paramArrayOfInt[0] = k;
    i = arrayOfInt2[j];
    int n = arrayOfInt1[j];
    n = i - n;
    paramArrayOfInt[j] = n;
  }
  
  public void a(Drawable paramDrawable)
  {
    Object localObject = this.d;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.d = ((ArrayList)localObject);
    }
    localObject = this.d;
    boolean bool = ((ArrayList)localObject).contains(paramDrawable);
    if (!bool)
    {
      this.d.add(paramDrawable);
      localObject = paramDrawable.getBounds();
      invalidate((Rect)localObject);
      paramDrawable.setCallback(this);
    }
  }
  
  public void a(View paramView)
  {
    int i = 2;
    int j = 1;
    int k = 0;
    Object localObject1 = paramView.getParent();
    boolean bool1 = localObject1 instanceof ViewGroup;
    if (bool1)
    {
      localObject1 = (ViewGroup)paramView.getParent();
      Object localObject2 = this.b;
      if (localObject1 != localObject2)
      {
        localObject2 = ((ViewGroup)localObject1).getParent();
        if (localObject2 != null)
        {
          boolean bool2 = r.z((View)localObject1);
          if (bool2)
          {
            localObject2 = new int[i];
            int[] arrayOfInt = new int[i];
            ((ViewGroup)localObject1).getLocationOnScreen((int[])localObject2);
            ViewGroup localViewGroup = this.b;
            localViewGroup.getLocationOnScreen(arrayOfInt);
            int i1 = localObject2[0];
            k = arrayOfInt[0];
            i1 -= k;
            r.d(paramView, i1);
            int n = localObject2[j];
            i = arrayOfInt[j];
            n -= i;
            r.c(paramView, n);
          }
        }
      }
      ((ViewGroup)localObject1).removeView(paramView);
      localObject2 = paramView.getParent();
      if (localObject2 != null) {
        ((ViewGroup)localObject1).removeView(paramView);
      }
    }
    int m = getChildCount() + -1;
    super.addView(paramView, m);
  }
  
  boolean a()
  {
    int i = getChildCount();
    ArrayList localArrayList;
    if (i == 0)
    {
      localArrayList = this.d;
      if (localArrayList != null)
      {
        localArrayList = this.d;
        i = localArrayList.size();
        if (i != 0) {}
      }
      else
      {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localArrayList = null;
    }
  }
  
  public void b(Drawable paramDrawable)
  {
    Object localObject = this.d;
    if (localObject != null)
    {
      this.d.remove(paramDrawable);
      localObject = paramDrawable.getBounds();
      invalidate((Rect)localObject);
      localObject = null;
      paramDrawable.setCallback(null);
    }
  }
  
  public void b(View paramView)
  {
    super.removeView(paramView);
    boolean bool = a();
    if (bool)
    {
      ViewGroup localViewGroup = this.b;
      localViewGroup.removeView(this);
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    int i = 2;
    int j = 1;
    int k = 0;
    Drawable localDrawable = null;
    Object localObject1 = new int[i];
    Object localObject2 = new int[i];
    this.b.getLocationOnScreen((int[])localObject1);
    this.c.getLocationOnScreen((int[])localObject2);
    int m = localObject2[0];
    int n = localObject1[0];
    float f1 = m - n;
    i = localObject2[j];
    int i1 = localObject1[j];
    i1 = i - i1;
    float f2 = i1;
    paramCanvas.translate(f1, f2);
    localObject1 = new android/graphics/Rect;
    localObject2 = this.c;
    i = ((View)localObject2).getWidth();
    View localView = this.c;
    m = localView.getHeight();
    ((Rect)localObject1).<init>(0, 0, i, m);
    paramCanvas.clipRect((Rect)localObject1);
    super.dispatchDraw(paramCanvas);
    localObject1 = this.d;
    if (localObject1 == null)
    {
      i1 = 0;
      localObject1 = null;
      f2 = 0.0F;
    }
    for (;;)
    {
      i = 0;
      localObject2 = null;
      while (i < i1)
      {
        localDrawable = (Drawable)this.d.get(i);
        localDrawable.draw(paramCanvas);
        k = i + 1;
        i = k;
      }
      localObject1 = this.d;
      i1 = ((ArrayList)localObject1).size();
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public ViewParent invalidateChildInParent(int[] paramArrayOfInt, Rect paramRect)
  {
    int i = 1;
    Object localObject = this.b;
    int k;
    if (localObject != null)
    {
      int j = paramArrayOfInt[0];
      int m = paramArrayOfInt[i];
      paramRect.offset(j, m);
      localObject = this.b;
      boolean bool = localObject instanceof ViewGroup;
      if (bool)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[i] = 0;
        localObject = new int[2];
        a((int[])localObject);
        m = localObject[0];
        k = localObject[i];
        paramRect.offset(m, k);
      }
    }
    for (localObject = super.invalidateChildInParent(paramArrayOfInt, paramRect);; localObject = null)
    {
      return (ViewParent)localObject;
      invalidate(paramRect);
      k = 0;
    }
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    Rect localRect = paramDrawable.getBounds();
    invalidate(localRect);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool = super.verifyDrawable(paramDrawable);
    ArrayList localArrayList;
    if (!bool)
    {
      localArrayList = this.d;
      if (localArrayList != null)
      {
        localArrayList = this.d;
        bool = localArrayList.contains(paramDrawable);
        if (!bool) {}
      }
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localArrayList = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\aj$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */