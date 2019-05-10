package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.a.k;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.Gravity;

public class d
  extends LinearLayoutCompat
{
  protected boolean a;
  boolean b;
  private Drawable c;
  private final Rect d;
  private final Rect e;
  private int f;
  
  public d(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public d(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public d(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.d = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.e = ((Rect)localObject);
    int i = 119;
    this.f = i;
    this.a = bool1;
    this.b = false;
    localObject = a.k.ForegroundLinearLayout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt, 0);
    int j = a.k.ForegroundLinearLayout_android_foregroundGravity;
    int k = this.f;
    j = ((TypedArray)localObject).getInt(j, k);
    this.f = j;
    j = a.k.ForegroundLinearLayout_android_foreground;
    Drawable localDrawable = ((TypedArray)localObject).getDrawable(j);
    if (localDrawable != null) {
      setForeground(localDrawable);
    }
    j = a.k.ForegroundLinearLayout_foregroundInsidePadding;
    boolean bool2 = ((TypedArray)localObject).getBoolean(j, bool1);
    this.a = bool2;
    ((TypedArray)localObject).recycle();
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i = 0;
    super.draw(paramCanvas);
    Drawable localDrawable = this.c;
    Rect localRect1;
    Rect localRect2;
    int j;
    int k;
    if (localDrawable != null)
    {
      localDrawable = this.c;
      boolean bool1 = this.b;
      if (bool1)
      {
        this.b = false;
        localRect1 = this.d;
        localRect2 = this.e;
        j = getRight();
        k = getLeft();
        j -= k;
        k = getBottom();
        int m = getTop();
        k -= m;
        boolean bool2 = this.a;
        if (!bool2) {
          break label152;
        }
        localRect1.set(0, 0, j, k);
      }
    }
    for (;;)
    {
      j = this.f;
      k = localDrawable.getIntrinsicWidth();
      int n = localDrawable.getIntrinsicHeight();
      Gravity.apply(j, k, n, localRect1, localRect2);
      localDrawable.setBounds(localRect2);
      localDrawable.draw(paramCanvas);
      return;
      label152:
      n = getPaddingLeft();
      i = getPaddingTop();
      int i1 = getPaddingRight();
      j -= i1;
      i1 = getPaddingBottom();
      k -= i1;
      localRect1.set(n, i, j, k);
    }
  }
  
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    super.drawableHotspotChanged(paramFloat1, paramFloat2);
    Drawable localDrawable = this.c;
    if (localDrawable != null)
    {
      localDrawable = this.c;
      localDrawable.setHotspot(paramFloat1, paramFloat2);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.c;
    if (localDrawable != null)
    {
      localDrawable = this.c;
      boolean bool = localDrawable.isStateful();
      if (bool)
      {
        localDrawable = this.c;
        int[] arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
  }
  
  public Drawable getForeground()
  {
    return this.c;
  }
  
  public int getForegroundGravity()
  {
    return this.f;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Drawable localDrawable = this.c;
    if (localDrawable != null)
    {
      localDrawable = this.c;
      localDrawable.jumpToCurrentState();
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    boolean bool = this.b | paramBoolean;
    this.b = bool;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.b = true;
  }
  
  public void setForeground(Drawable paramDrawable)
  {
    Object localObject = this.c;
    int j;
    if (localObject != paramDrawable)
    {
      localObject = this.c;
      if (localObject != null)
      {
        localObject = this.c;
        i = 0;
        ((Drawable)localObject).setCallback(null);
        localObject = this.c;
        unscheduleDrawable((Drawable)localObject);
      }
      this.c = paramDrawable;
      if (paramDrawable == null) {
        break label122;
      }
      localObject = null;
      setWillNotDraw(false);
      paramDrawable.setCallback(this);
      boolean bool = paramDrawable.isStateful();
      if (bool)
      {
        localObject = getDrawableState();
        paramDrawable.setState((int[])localObject);
      }
      j = this.f;
      int i = 119;
      if (j == i)
      {
        localObject = new android/graphics/Rect;
        ((Rect)localObject).<init>();
        paramDrawable.getPadding((Rect)localObject);
      }
    }
    for (;;)
    {
      requestLayout();
      invalidate();
      return;
      label122:
      j = 1;
      setWillNotDraw(j);
    }
  }
  
  public void setForegroundGravity(int paramInt)
  {
    int i = this.f;
    if (i != paramInt)
    {
      i = 0x800007 & paramInt;
      if (i != 0) {
        break label96;
      }
    }
    label96:
    for (i = 0x800003 | paramInt;; i = paramInt)
    {
      int j = i & 0x70;
      if (j == 0) {
        i |= 0x30;
      }
      this.f = i;
      i = this.f;
      j = 119;
      if (i == j)
      {
        Object localObject = this.c;
        if (localObject != null)
        {
          localObject = new android/graphics/Rect;
          ((Rect)localObject).<init>();
          Drawable localDrawable = this.c;
          localDrawable.getPadding((Rect)localObject);
        }
      }
      requestLayout();
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool = super.verifyDrawable(paramDrawable);
    Drawable localDrawable;
    if (!bool)
    {
      localDrawable = this.c;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\internal\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */