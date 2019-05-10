package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class RoundRectDrawable
  extends Drawable
{
  private ColorStateList mBackground;
  private final RectF mBoundsF;
  private final Rect mBoundsI;
  private boolean mInsetForPadding = false;
  private boolean mInsetForRadius = true;
  private float mPadding;
  private final Paint mPaint;
  private float mRadius;
  private ColorStateList mTint;
  private PorterDuffColorFilter mTintFilter;
  private PorterDuff.Mode mTintMode;
  
  RoundRectDrawable(ColorStateList paramColorStateList, float paramFloat)
  {
    Object localObject = PorterDuff.Mode.SRC_IN;
    this.mTintMode = ((PorterDuff.Mode)localObject);
    this.mRadius = paramFloat;
    localObject = new android/graphics/Paint;
    ((Paint)localObject).<init>(5);
    this.mPaint = ((Paint)localObject);
    setBackground(paramColorStateList);
    localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.mBoundsF = ((RectF)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mBoundsI = ((Rect)localObject);
  }
  
  private PorterDuffColorFilter createTintFilter(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    Object localObject;
    if ((paramColorStateList == null) || (paramMode == null)) {
      localObject = null;
    }
    for (;;)
    {
      return (PorterDuffColorFilter)localObject;
      localObject = getState();
      int i = paramColorStateList.getColorForState((int[])localObject, 0);
      localObject = new android/graphics/PorterDuffColorFilter;
      ((PorterDuffColorFilter)localObject).<init>(i, paramMode);
    }
  }
  
  private void setBackground(ColorStateList paramColorStateList)
  {
    if (paramColorStateList == null)
    {
      localPaint = null;
      paramColorStateList = ColorStateList.valueOf(0);
    }
    this.mBackground = paramColorStateList;
    Paint localPaint = this.mPaint;
    ColorStateList localColorStateList = this.mBackground;
    int[] arrayOfInt = getState();
    int i = this.mBackground.getDefaultColor();
    int j = localColorStateList.getColorForState(arrayOfInt, i);
    localPaint.setColor(j);
  }
  
  private void updateBounds(Rect paramRect)
  {
    if (paramRect == null) {
      paramRect = getBounds();
    }
    Object localObject = this.mBoundsF;
    int i = paramRect.left;
    float f1 = i;
    int j = paramRect.top;
    float f2 = j;
    int k = paramRect.right;
    float f3 = k;
    int m = paramRect.bottom;
    float f4 = m;
    ((RectF)localObject).set(f1, f2, f3, f4);
    localObject = this.mBoundsI;
    ((Rect)localObject).set(paramRect);
    boolean bool3 = this.mInsetForPadding;
    if (bool3)
    {
      float f5 = this.mPadding;
      f1 = this.mRadius;
      boolean bool1 = this.mInsetForRadius;
      f5 = RoundRectDrawableWithShadow.calculateVerticalPadding(f5, f1, bool1);
      f1 = this.mPadding;
      f2 = this.mRadius;
      boolean bool2 = this.mInsetForRadius;
      f1 = RoundRectDrawableWithShadow.calculateHorizontalPadding(f1, f2, bool2);
      Rect localRect1 = this.mBoundsI;
      i = (int)Math.ceil(f1);
      double d = Math.ceil(f5);
      int n = (int)d;
      localRect1.inset(i, n);
      localObject = this.mBoundsF;
      Rect localRect2 = this.mBoundsI;
      ((RectF)localObject).set(localRect2);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Paint localPaint = this.mPaint;
    Object localObject = this.mTintFilter;
    int i;
    if (localObject != null)
    {
      localObject = localPaint.getColorFilter();
      if (localObject == null)
      {
        localObject = this.mTintFilter;
        localPaint.setColorFilter((ColorFilter)localObject);
        i = 1;
      }
    }
    for (;;)
    {
      RectF localRectF = this.mBoundsF;
      float f1 = this.mRadius;
      float f2 = this.mRadius;
      paramCanvas.drawRoundRect(localRectF, f1, f2, localPaint);
      if (i != 0)
      {
        i = 0;
        localObject = null;
        localPaint.setColorFilter(null);
      }
      return;
      i = 0;
      localObject = null;
    }
  }
  
  public ColorStateList getColor()
  {
    return this.mBackground;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void getOutline(Outline paramOutline)
  {
    Rect localRect = this.mBoundsI;
    float f = this.mRadius;
    paramOutline.setRoundRect(localRect, f);
  }
  
  float getPadding()
  {
    return this.mPadding;
  }
  
  public float getRadius()
  {
    return this.mRadius;
  }
  
  public boolean isStateful()
  {
    ColorStateList localColorStateList = this.mTint;
    if (localColorStateList != null)
    {
      localColorStateList = this.mTint;
      bool = localColorStateList.isStateful();
      if (bool) {}
    }
    else
    {
      localColorStateList = this.mBackground;
      if (localColorStateList != null)
      {
        localColorStateList = this.mBackground;
        bool = localColorStateList.isStateful();
        if (bool) {}
      }
      else
      {
        bool = super.isStateful();
        if (!bool) {
          break label59;
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label59:
      bool = false;
      localColorStateList = null;
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    updateBounds(paramRect);
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject1 = this.mBackground;
    Object localObject2 = this.mBackground;
    int j = ((ColorStateList)localObject2).getDefaultColor();
    j = ((ColorStateList)localObject1).getColorForState(paramArrayOfInt, j);
    localObject1 = this.mPaint;
    int k = ((Paint)localObject1).getColor();
    float f2;
    if (j != k)
    {
      k = i;
      f2 = f1;
      if (k != 0)
      {
        Paint localPaint = this.mPaint;
        localPaint.setColor(j);
      }
      localObject2 = this.mTint;
      if (localObject2 == null) {
        break label142;
      }
      localObject2 = this.mTintMode;
      if (localObject2 == null) {
        break label142;
      }
      localObject1 = this.mTint;
      localObject2 = this.mTintMode;
      localObject1 = createTintFilter((ColorStateList)localObject1, (PorterDuff.Mode)localObject2);
      this.mTintFilter = ((PorterDuffColorFilter)localObject1);
    }
    for (;;)
    {
      return i;
      k = 0;
      f2 = 0.0F;
      localObject1 = null;
      break;
      label142:
      i = k;
      f1 = f2;
    }
  }
  
  public void setAlpha(int paramInt)
  {
    this.mPaint.setAlpha(paramInt);
  }
  
  public void setColor(ColorStateList paramColorStateList)
  {
    setBackground(paramColorStateList);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
  }
  
  void setPadding(float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    float f = this.mPadding;
    boolean bool = paramFloat < f;
    if (!bool)
    {
      bool = this.mInsetForPadding;
      if (bool == paramBoolean1)
      {
        bool = this.mInsetForRadius;
        if (bool != paramBoolean2) {}
      }
    }
    for (;;)
    {
      return;
      this.mPadding = paramFloat;
      this.mInsetForPadding = paramBoolean1;
      this.mInsetForRadius = paramBoolean2;
      bool = false;
      f = 0.0F;
      updateBounds(null);
      invalidateSelf();
    }
  }
  
  void setRadius(float paramFloat)
  {
    float f = this.mRadius;
    boolean bool = paramFloat < f;
    if (!bool) {}
    for (;;)
    {
      return;
      this.mRadius = paramFloat;
      bool = false;
      f = 0.0F;
      updateBounds(null);
      invalidateSelf();
    }
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    this.mTint = paramColorStateList;
    Object localObject = this.mTint;
    PorterDuff.Mode localMode = this.mTintMode;
    localObject = createTintFilter((ColorStateList)localObject, localMode);
    this.mTintFilter = ((PorterDuffColorFilter)localObject);
    invalidateSelf();
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.mTintMode = paramMode;
    Object localObject = this.mTint;
    PorterDuff.Mode localMode = this.mTintMode;
    localObject = createTintFilter((ColorStateList)localObject, localMode);
    this.mTintFilter = ((PorterDuffColorFilter)localObject);
    invalidateSelf();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RoundRectDrawable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */