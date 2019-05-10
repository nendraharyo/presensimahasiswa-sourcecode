package com.bumptech.glide.request.target;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import com.bumptech.glide.util.Preconditions;

public class FixedSizeDrawable
  extends Drawable
{
  private final RectF bounds;
  private final Matrix matrix;
  private boolean mutated;
  private FixedSizeDrawable.State state;
  private Drawable wrapped;
  private final RectF wrappedRect;
  
  public FixedSizeDrawable(Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    this(localState, paramDrawable);
  }
  
  FixedSizeDrawable(FixedSizeDrawable.State paramState, Drawable paramDrawable)
  {
    Object localObject = (FixedSizeDrawable.State)Preconditions.checkNotNull(paramState);
    this.state = ((FixedSizeDrawable.State)localObject);
    localObject = (Drawable)Preconditions.checkNotNull(paramDrawable);
    this.wrapped = ((Drawable)localObject);
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    paramDrawable.setBounds(0, 0, i, j);
    localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.matrix = ((Matrix)localObject);
    localObject = new android/graphics/RectF;
    float f1 = paramDrawable.getIntrinsicWidth();
    float f2 = paramDrawable.getIntrinsicHeight();
    ((RectF)localObject).<init>(0.0F, 0.0F, f1, f2);
    this.wrappedRect = ((RectF)localObject);
    localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.bounds = ((RectF)localObject);
  }
  
  private void updateMatrix()
  {
    Matrix localMatrix = this.matrix;
    RectF localRectF1 = this.wrappedRect;
    RectF localRectF2 = this.bounds;
    Matrix.ScaleToFit localScaleToFit = Matrix.ScaleToFit.CENTER;
    localMatrix.setRectToRect(localRectF1, localRectF2, localScaleToFit);
  }
  
  public void clearColorFilter()
  {
    this.wrapped.clearColorFilter();
  }
  
  public void draw(Canvas paramCanvas)
  {
    paramCanvas.save();
    Matrix localMatrix = this.matrix;
    paramCanvas.concat(localMatrix);
    this.wrapped.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public int getAlpha()
  {
    return this.wrapped.getAlpha();
  }
  
  public Drawable.Callback getCallback()
  {
    return this.wrapped.getCallback();
  }
  
  public int getChangingConfigurations()
  {
    return this.wrapped.getChangingConfigurations();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    return this.state;
  }
  
  public Drawable getCurrent()
  {
    return this.wrapped.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return this.state.height;
  }
  
  public int getIntrinsicWidth()
  {
    return this.state.width;
  }
  
  public int getMinimumHeight()
  {
    return this.wrapped.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return this.wrapped.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return this.wrapped.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return this.wrapped.getPadding(paramRect);
  }
  
  public void invalidateSelf()
  {
    super.invalidateSelf();
    this.wrapped.invalidateSelf();
  }
  
  public Drawable mutate()
  {
    boolean bool = this.mutated;
    if (!bool)
    {
      Object localObject = super.mutate();
      if (localObject == this)
      {
        localObject = this.wrapped.mutate();
        this.wrapped = ((Drawable)localObject);
        localObject = new com/bumptech/glide/request/target/FixedSizeDrawable$State;
        FixedSizeDrawable.State localState = this.state;
        ((FixedSizeDrawable.State)localObject).<init>(localState);
        this.state = ((FixedSizeDrawable.State)localObject);
        bool = true;
        this.mutated = bool;
      }
    }
    return this;
  }
  
  public void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    super.scheduleSelf(paramRunnable, paramLong);
    this.wrapped.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    this.wrapped.setAlpha(paramInt);
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    RectF localRectF = this.bounds;
    float f1 = paramInt1;
    float f2 = paramInt2;
    float f3 = paramInt3;
    float f4 = paramInt4;
    localRectF.set(f1, f2, f3, f4);
    updateMatrix();
  }
  
  public void setBounds(Rect paramRect)
  {
    super.setBounds(paramRect);
    this.bounds.set(paramRect);
    updateMatrix();
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    this.wrapped.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    this.wrapped.setColorFilter(paramInt, paramMode);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.wrapped.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    this.wrapped.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.wrapped.setFilterBitmap(paramBoolean);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    return this.wrapped.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleSelf(Runnable paramRunnable)
  {
    super.unscheduleSelf(paramRunnable);
    this.wrapped.unscheduleSelf(paramRunnable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\FixedSizeDrawable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */