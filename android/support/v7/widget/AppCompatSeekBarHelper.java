package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.b.a.a;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;

class AppCompatSeekBarHelper
  extends AppCompatProgressBarHelper
{
  private boolean mHasTickMarkTint = false;
  private boolean mHasTickMarkTintMode = false;
  private Drawable mTickMark;
  private ColorStateList mTickMarkTintList = null;
  private PorterDuff.Mode mTickMarkTintMode = null;
  private final SeekBar mView;
  
  AppCompatSeekBarHelper(SeekBar paramSeekBar)
  {
    super(paramSeekBar);
    this.mView = paramSeekBar;
  }
  
  private void applyTickMarkTint()
  {
    Drawable localDrawable = this.mTickMark;
    if (localDrawable != null)
    {
      boolean bool = this.mHasTickMarkTint;
      if (!bool)
      {
        bool = this.mHasTickMarkTintMode;
        if (!bool) {}
      }
      else
      {
        localDrawable = a.g(this.mTickMark.mutate());
        this.mTickMark = localDrawable;
        bool = this.mHasTickMarkTint;
        Object localObject;
        if (bool)
        {
          localDrawable = this.mTickMark;
          localObject = this.mTickMarkTintList;
          a.a(localDrawable, (ColorStateList)localObject);
        }
        bool = this.mHasTickMarkTintMode;
        if (bool)
        {
          localDrawable = this.mTickMark;
          localObject = this.mTickMarkTintMode;
          a.a(localDrawable, (PorterDuff.Mode)localObject);
        }
        localDrawable = this.mTickMark;
        bool = localDrawable.isStateful();
        if (bool)
        {
          localDrawable = this.mTickMark;
          localObject = this.mView.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
      }
    }
  }
  
  void drawTickMarks(Canvas paramCanvas)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject = this.mTickMark;
    if (localObject != null)
    {
      localObject = this.mView;
      int j = ((SeekBar)localObject).getMax();
      if (j > i)
      {
        localObject = this.mTickMark;
        int k = ((Drawable)localObject).getIntrinsicWidth();
        Drawable localDrawable = this.mTickMark;
        int m = localDrawable.getIntrinsicHeight();
        if (k >= 0) {
          k /= 2;
        }
        for (;;)
        {
          if (m >= 0) {
            i = m / 2;
          }
          localDrawable = this.mTickMark;
          int n = -k;
          int i1 = -i;
          localDrawable.setBounds(n, i1, k, i);
          i = this.mView.getWidth();
          k = this.mView.getPaddingLeft();
          i -= k;
          localObject = this.mView;
          k = ((SeekBar)localObject).getPaddingRight();
          f1 = i - k;
          float f2 = j;
          f2 = f1 / f2;
          m = paramCanvas.save();
          f1 = this.mView.getPaddingLeft();
          SeekBar localSeekBar = this.mView;
          n = localSeekBar.getHeight() / 2;
          float f3 = n;
          paramCanvas.translate(f1, f3);
          i = 0;
          f1 = 0.0F;
          while (i <= j)
          {
            this.mTickMark.draw(paramCanvas);
            n = 0;
            f3 = 0.0F;
            localSeekBar = null;
            paramCanvas.translate(f2, 0.0F);
            i += 1;
          }
          k = i;
          f2 = f1;
        }
        paramCanvas.restoreToCount(m);
      }
    }
  }
  
  void drawableStateChanged()
  {
    Drawable localDrawable = this.mTickMark;
    if (localDrawable != null)
    {
      boolean bool = localDrawable.isStateful();
      if (bool)
      {
        Object localObject = this.mView.getDrawableState();
        bool = localDrawable.setState((int[])localObject);
        if (bool)
        {
          localObject = this.mView;
          ((SeekBar)localObject).invalidateDrawable(localDrawable);
        }
      }
    }
  }
  
  Drawable getTickMark()
  {
    return this.mTickMark;
  }
  
  ColorStateList getTickMarkTintList()
  {
    return this.mTickMarkTintList;
  }
  
  PorterDuff.Mode getTickMarkTintMode()
  {
    return this.mTickMarkTintMode;
  }
  
  void jumpDrawablesToCurrentState()
  {
    Drawable localDrawable = this.mTickMark;
    if (localDrawable != null)
    {
      localDrawable = this.mTickMark;
      localDrawable.jumpToCurrentState();
    }
  }
  
  void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    boolean bool1 = true;
    super.loadFromAttributes(paramAttributeSet, paramInt);
    Object localObject1 = this.mView.getContext();
    Object localObject2 = R.styleable.AppCompatSeekBar;
    int i = 0;
    Object localObject3 = null;
    localObject1 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    int j = R.styleable.AppCompatSeekBar_android_thumb;
    localObject2 = ((TintTypedArray)localObject1).getDrawableIfKnown(j);
    if (localObject2 != null)
    {
      localObject3 = this.mView;
      ((SeekBar)localObject3).setThumb((Drawable)localObject2);
    }
    j = R.styleable.AppCompatSeekBar_tickMark;
    localObject2 = ((TintTypedArray)localObject1).getDrawable(j);
    setTickMark((Drawable)localObject2);
    j = R.styleable.AppCompatSeekBar_tickMarkTintMode;
    boolean bool2 = ((TintTypedArray)localObject1).hasValue(j);
    if (bool2)
    {
      k = R.styleable.AppCompatSeekBar_tickMarkTintMode;
      i = -1;
      k = ((TintTypedArray)localObject1).getInt(k, i);
      localObject3 = this.mTickMarkTintMode;
      localObject2 = DrawableUtils.parseTintMode(k, (PorterDuff.Mode)localObject3);
      this.mTickMarkTintMode = ((PorterDuff.Mode)localObject2);
      this.mHasTickMarkTintMode = bool1;
    }
    int k = R.styleable.AppCompatSeekBar_tickMarkTint;
    boolean bool3 = ((TintTypedArray)localObject1).hasValue(k);
    if (bool3)
    {
      int m = R.styleable.AppCompatSeekBar_tickMarkTint;
      localObject2 = ((TintTypedArray)localObject1).getColorStateList(m);
      this.mTickMarkTintList = ((ColorStateList)localObject2);
      this.mHasTickMarkTint = bool1;
    }
    ((TintTypedArray)localObject1).recycle();
    applyTickMarkTint();
  }
  
  void setTickMark(Drawable paramDrawable)
  {
    Object localObject = this.mTickMark;
    if (localObject != null)
    {
      localObject = this.mTickMark;
      ((Drawable)localObject).setCallback(null);
    }
    this.mTickMark = paramDrawable;
    if (paramDrawable != null)
    {
      localObject = this.mView;
      paramDrawable.setCallback((Drawable.Callback)localObject);
      localObject = this.mView;
      int i = r.e((View)localObject);
      a.b(paramDrawable, i);
      boolean bool = paramDrawable.isStateful();
      if (bool)
      {
        localObject = this.mView.getDrawableState();
        paramDrawable.setState((int[])localObject);
      }
      applyTickMarkTint();
    }
    this.mView.invalidate();
  }
  
  void setTickMarkTintList(ColorStateList paramColorStateList)
  {
    this.mTickMarkTintList = paramColorStateList;
    this.mHasTickMarkTint = true;
    applyTickMarkTint();
  }
  
  void setTickMarkTintMode(PorterDuff.Mode paramMode)
  {
    this.mTickMarkTintMode = paramMode;
    this.mHasTickMarkTintMode = true;
    applyTickMarkTint();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatSeekBarHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */