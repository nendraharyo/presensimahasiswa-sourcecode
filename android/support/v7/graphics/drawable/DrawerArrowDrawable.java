package android.support.v7.graphics.drawable;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.a;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.style;
import android.support.v7.appcompat.R.styleable;

public class DrawerArrowDrawable
  extends Drawable
{
  public static final int ARROW_DIRECTION_END = 3;
  public static final int ARROW_DIRECTION_LEFT = 0;
  public static final int ARROW_DIRECTION_RIGHT = 1;
  public static final int ARROW_DIRECTION_START = 2;
  private static final float ARROW_HEAD_ANGLE = (float)Math.toRadians(45.0D);
  private float mArrowHeadLength;
  private float mArrowShaftLength;
  private float mBarGap;
  private float mBarLength;
  private int mDirection;
  private float mMaxCutForBarSize;
  private final Paint mPaint;
  private final Path mPath;
  private float mProgress;
  private final int mSize;
  private boolean mSpin;
  private boolean mVerticalMirror;
  
  public DrawerArrowDrawable(Context paramContext)
  {
    Object localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    this.mPaint = ((Paint)localObject1);
    localObject1 = new android/graphics/Path;
    ((Path)localObject1).<init>();
    this.mPath = ((Path)localObject1);
    this.mVerticalMirror = false;
    this.mDirection = 2;
    localObject1 = this.mPaint;
    Object localObject2 = Paint.Style.STROKE;
    ((Paint)localObject1).setStyle((Paint.Style)localObject2);
    localObject1 = this.mPaint;
    localObject2 = Paint.Join.MITER;
    ((Paint)localObject1).setStrokeJoin((Paint.Join)localObject2);
    localObject1 = this.mPaint;
    localObject2 = Paint.Cap.BUTT;
    ((Paint)localObject1).setStrokeCap((Paint.Cap)localObject2);
    this.mPaint.setAntiAlias(bool1);
    localObject1 = paramContext.getTheme();
    int[] arrayOfInt = R.styleable.DrawerArrowToggle;
    int i = R.attr.drawerArrowStyle;
    int j = R.style.Base_Widget_AppCompat_DrawerArrowToggle;
    localObject1 = ((Resources.Theme)localObject1).obtainStyledAttributes(null, arrayOfInt, i, j);
    int k = R.styleable.DrawerArrowToggle_color;
    k = ((TypedArray)localObject1).getColor(k, 0);
    setColor(k);
    k = R.styleable.DrawerArrowToggle_thickness;
    float f = ((TypedArray)localObject1).getDimension(k, 0.0F);
    setBarThickness(f);
    k = R.styleable.DrawerArrowToggle_spinBars;
    boolean bool2 = ((TypedArray)localObject1).getBoolean(k, bool1);
    setSpinEnabled(bool2);
    int m = R.styleable.DrawerArrowToggle_gapBetweenBars;
    f = Math.round(((TypedArray)localObject1).getDimension(m, 0.0F));
    setGapSize(f);
    m = R.styleable.DrawerArrowToggle_drawableSize;
    m = ((TypedArray)localObject1).getDimensionPixelSize(m, 0);
    this.mSize = m;
    m = R.styleable.DrawerArrowToggle_barLength;
    f = Math.round(((TypedArray)localObject1).getDimension(m, 0.0F));
    this.mBarLength = f;
    m = R.styleable.DrawerArrowToggle_arrowHeadLength;
    f = Math.round(((TypedArray)localObject1).getDimension(m, 0.0F));
    this.mArrowHeadLength = f;
    m = R.styleable.DrawerArrowToggle_arrowShaftLength;
    f = ((TypedArray)localObject1).getDimension(m, 0.0F);
    this.mArrowShaftLength = f;
    ((TypedArray)localObject1).recycle();
  }
  
  private static float lerp(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat2 - paramFloat1) * paramFloat3 + paramFloat1;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    int i = this.mDirection;
    int j;
    float f1;
    float f2;
    float f3;
    Paint localPaint1;
    label233:
    label245:
    int m;
    switch (i)
    {
    case 2: 
    default: 
      i = a.i(this);
      j = 1;
      f1 = Float.MIN_VALUE;
      if (i == j)
      {
        i = 1;
        f2 = Float.MIN_VALUE;
        f1 = this.mArrowHeadLength;
        f3 = this.mArrowHeadLength;
        f1 *= f3;
        int k = 1073741824;
        double d1 = Math.sqrt(f1 * 2.0F);
        f1 = (float)d1;
        f3 = this.mBarLength;
        float f4 = this.mProgress;
        f4 = lerp(f3, f1, f4);
        f1 = this.mBarLength;
        f3 = this.mArrowShaftLength;
        float f5 = this.mProgress;
        f5 = lerp(f1, f3, f5);
        f3 = this.mMaxCutForBarSize;
        float f6 = this.mProgress;
        f6 = Math.round(lerp(0.0F, f3, f6));
        j = 0;
        f1 = 0.0F;
        localPaint1 = null;
        f3 = ARROW_HEAD_ANGLE;
        float f7 = this.mProgress;
        f7 = lerp(0.0F, f3, f7);
        if (i == 0) {
          break label765;
        }
        j = 0;
        f1 = 0.0F;
        localPaint1 = null;
        k = 0;
        Paint localPaint2 = null;
        f3 = 0.0F;
        if (i == 0) {
          break label786;
        }
        j = 1127481344;
        f1 = 180.0F;
        float f8 = this.mProgress;
        f1 = lerp(f3, f1, f8);
        double d2 = f4;
        double d3 = Math.cos(f7);
        f3 = (float)Math.round(d2 * d3);
        d2 = f4;
        d3 = Math.sin(f7);
        d2 *= d3;
        long l = Math.round(d2);
        f4 = (float)l;
        Path localPath1 = this.mPath;
        localPath1.rewind();
        f7 = this.mBarGap;
        Paint localPaint3 = this.mPaint;
        f8 = localPaint3.getStrokeWidth();
        f7 += f8;
        f8 = -this.mMaxCutForBarSize;
        float f9 = this.mProgress;
        f7 = lerp(f7, f8, f9);
        f8 = -f5;
        f9 = 2.0F;
        f8 /= f9;
        Path localPath2 = this.mPath;
        float f10 = f8 + f6;
        localPath2.moveTo(f10, 0.0F);
        localPath2 = this.mPath;
        f10 = 2.0F;
        f6 *= f10;
        f5 -= f6;
        localPath2.rLineTo(f5, 0.0F);
        this.mPath.moveTo(f8, f7);
        this.mPath.rLineTo(f3, f4);
        Path localPath3 = this.mPath;
        f6 = -f7;
        localPath3.moveTo(f8, f6);
        localPath3 = this.mPath;
        f4 = -f4;
        localPath3.rLineTo(f3, f4);
        this.mPath.close();
        paramCanvas.save();
        localPaint2 = this.mPaint;
        f3 = localPaint2.getStrokeWidth();
        f4 = localRect.height();
        f5 = 3.0F * f3;
        f4 -= f5;
        f5 = this.mBarGap;
        f6 = 2.0F;
        f5 *= f6;
        int n = (int)(f4 - f5) / 4 * 2;
        f4 = n;
        f3 *= 1.5F;
        f5 = this.mBarGap;
        f3 = f3 + f5 + f4;
        int i1 = localRect.centerX();
        float f11 = i1;
        paramCanvas.translate(f11, f3);
        m = this.mSpin;
        if (m == 0) {
          break label807;
        }
        m = this.mVerticalMirror;
        i ^= m;
        if (i == 0) {
          break label798;
        }
        i = -1;
        f2 = 0.0F / 0.0F;
        label667:
        f2 = i * f1;
        paramCanvas.rotate(f2);
      }
      break;
    }
    for (;;)
    {
      Path localPath4 = this.mPath;
      localPaint1 = this.mPaint;
      paramCanvas.drawPath(localPath4, localPaint1);
      paramCanvas.restore();
      return;
      i = 0;
      f2 = 0.0F;
      localPath4 = null;
      break;
      i = 1;
      f2 = Float.MIN_VALUE;
      break;
      i = a.i(this);
      if (i == 0)
      {
        i = 1;
        f2 = Float.MIN_VALUE;
        break;
      }
      i = 0;
      f2 = 0.0F;
      localPath4 = null;
      break;
      i = 0;
      f2 = 0.0F;
      localPath4 = null;
      break;
      label765:
      j = -1020002304;
      f1 = -180.0F;
      m = j;
      f3 = f1;
      break label233;
      label786:
      j = 0;
      f1 = 0.0F;
      localPaint1 = null;
      break label245;
      label798:
      i = 1;
      f2 = Float.MIN_VALUE;
      break label667;
      label807:
      if (i != 0)
      {
        i = 1127481344;
        f2 = 180.0F;
        paramCanvas.rotate(f2);
      }
    }
  }
  
  public float getArrowHeadLength()
  {
    return this.mArrowHeadLength;
  }
  
  public float getArrowShaftLength()
  {
    return this.mArrowShaftLength;
  }
  
  public float getBarLength()
  {
    return this.mBarLength;
  }
  
  public float getBarThickness()
  {
    return this.mPaint.getStrokeWidth();
  }
  
  public int getColor()
  {
    return this.mPaint.getColor();
  }
  
  public int getDirection()
  {
    return this.mDirection;
  }
  
  public float getGapSize()
  {
    return this.mBarGap;
  }
  
  public int getIntrinsicHeight()
  {
    return this.mSize;
  }
  
  public int getIntrinsicWidth()
  {
    return this.mSize;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public final Paint getPaint()
  {
    return this.mPaint;
  }
  
  public float getProgress()
  {
    return this.mProgress;
  }
  
  public boolean isSpinEnabled()
  {
    return this.mSpin;
  }
  
  public void setAlpha(int paramInt)
  {
    Paint localPaint = this.mPaint;
    int i = localPaint.getAlpha();
    if (paramInt != i)
    {
      localPaint = this.mPaint;
      localPaint.setAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public void setArrowHeadLength(float paramFloat)
  {
    float f = this.mArrowHeadLength;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.mArrowHeadLength = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setArrowShaftLength(float paramFloat)
  {
    float f = this.mArrowShaftLength;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.mArrowShaftLength = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setBarLength(float paramFloat)
  {
    float f = this.mBarLength;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.mBarLength = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setBarThickness(float paramFloat)
  {
    Paint localPaint = this.mPaint;
    float f1 = localPaint.getStrokeWidth();
    boolean bool = f1 < paramFloat;
    if (bool)
    {
      localPaint = this.mPaint;
      localPaint.setStrokeWidth(paramFloat);
      int i = 1073741824;
      double d1 = paramFloat / 2.0F;
      float f2 = ARROW_HEAD_ANGLE;
      double d2 = Math.cos(f2);
      d1 *= d2;
      f1 = (float)d1;
      this.mMaxCutForBarSize = f1;
      invalidateSelf();
    }
  }
  
  public void setColor(int paramInt)
  {
    Paint localPaint = this.mPaint;
    int i = localPaint.getColor();
    if (paramInt != i)
    {
      localPaint = this.mPaint;
      localPaint.setColor(paramInt);
      invalidateSelf();
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setDirection(int paramInt)
  {
    int i = this.mDirection;
    if (paramInt != i)
    {
      this.mDirection = paramInt;
      invalidateSelf();
    }
  }
  
  public void setGapSize(float paramFloat)
  {
    float f = this.mBarGap;
    boolean bool = paramFloat < f;
    if (bool)
    {
      this.mBarGap = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setProgress(float paramFloat)
  {
    float f = this.mProgress;
    boolean bool = f < paramFloat;
    if (bool)
    {
      this.mProgress = paramFloat;
      invalidateSelf();
    }
  }
  
  public void setSpinEnabled(boolean paramBoolean)
  {
    boolean bool = this.mSpin;
    if (bool != paramBoolean)
    {
      this.mSpin = paramBoolean;
      invalidateSelf();
    }
  }
  
  public void setVerticalMirror(boolean paramBoolean)
  {
    boolean bool = this.mVerticalMirror;
    if (bool != paramBoolean)
    {
      this.mVerticalMirror = paramBoolean;
      invalidateSelf();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\graphics\drawable\DrawerArrowDrawable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */