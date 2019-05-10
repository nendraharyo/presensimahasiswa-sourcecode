package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v7.cardview.R.color;
import android.support.v7.cardview.R.dimen;

class RoundRectDrawableWithShadow
  extends Drawable
{
  private static final double COS_45 = Math.cos(Math.toRadians(45.0D));
  private static final float SHADOW_MULTIPLIER = 1.5F;
  static RoundRectDrawableWithShadow.RoundRectHelper sRoundRectHelper;
  private boolean mAddPaddingForCorners;
  private ColorStateList mBackground;
  private final RectF mCardBounds;
  private float mCornerRadius;
  private Paint mCornerShadowPaint;
  private Path mCornerShadowPath;
  private boolean mDirty;
  private Paint mEdgeShadowPaint;
  private final int mInsetShadow;
  private Paint mPaint;
  private boolean mPrintedShadowClipWarning;
  private float mRawMaxShadowSize;
  private float mRawShadowSize;
  private final int mShadowEndColor;
  private float mShadowSize;
  private final int mShadowStartColor;
  
  RoundRectDrawableWithShadow(Resources paramResources, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.mDirty = j;
    this.mAddPaddingForCorners = j;
    this.mPrintedShadowClipWarning = false;
    j = R.color.cardview_shadow_start_color;
    j = paramResources.getColor(j);
    this.mShadowStartColor = j;
    j = R.color.cardview_shadow_end_color;
    j = paramResources.getColor(j);
    this.mShadowEndColor = j;
    j = R.dimen.cardview_compat_inset_shadow;
    j = paramResources.getDimensionPixelSize(j);
    this.mInsetShadow = j;
    Object localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>(i);
    this.mPaint = ((Paint)localObject1);
    setBackground(paramColorStateList);
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>(i);
    this.mCornerShadowPaint = ((Paint)localObject1);
    localObject1 = this.mCornerShadowPaint;
    Object localObject2 = Paint.Style.FILL;
    ((Paint)localObject1).setStyle((Paint.Style)localObject2);
    float f = (int)(0.5F + paramFloat1);
    this.mCornerRadius = f;
    localObject1 = new android/graphics/RectF;
    ((RectF)localObject1).<init>();
    this.mCardBounds = ((RectF)localObject1);
    localObject1 = new android/graphics/Paint;
    localObject2 = this.mCornerShadowPaint;
    ((Paint)localObject1).<init>((Paint)localObject2);
    this.mEdgeShadowPaint = ((Paint)localObject1);
    this.mEdgeShadowPaint.setAntiAlias(false);
    setShadowSize(paramFloat2, paramFloat3);
  }
  
  private void buildComponents(Rect paramRect)
  {
    float f1 = this.mRawMaxShadowSize * 1.5F;
    RectF localRectF = this.mCardBounds;
    float f2 = paramRect.left;
    float f3 = this.mRawMaxShadowSize;
    f2 += f3;
    f3 = paramRect.top + f1;
    float f4 = paramRect.right;
    float f5 = this.mRawMaxShadowSize;
    f4 -= f5;
    f1 = paramRect.bottom - f1;
    localRectF.set(f2, f3, f4, f1);
    buildShadowCorners();
  }
  
  private void buildShadowCorners()
  {
    int i = 2;
    int j = 1;
    int k = 3;
    Object localObject1 = new android/graphics/RectF;
    float f1 = -this.mCornerRadius;
    float f2 = -this.mCornerRadius;
    float f3 = this.mCornerRadius;
    float f4 = this.mCornerRadius;
    ((RectF)localObject1).<init>(f1, f2, f3, f4);
    RectF localRectF = new android/graphics/RectF;
    localRectF.<init>((RectF)localObject1);
    f2 = -this.mShadowSize;
    f3 = -this.mShadowSize;
    localRectF.inset(f2, f3);
    Path localPath = this.mCornerShadowPath;
    if (localPath == null)
    {
      localPath = new android/graphics/Path;
      localPath.<init>();
      this.mCornerShadowPath = localPath;
    }
    for (;;)
    {
      localPath = this.mCornerShadowPath;
      Object localObject2 = Path.FillType.EVEN_ODD;
      localPath.setFillType((Path.FillType)localObject2);
      localPath = this.mCornerShadowPath;
      f3 = -this.mCornerRadius;
      localPath.moveTo(f3, 0.0F);
      localPath = this.mCornerShadowPath;
      f3 = -this.mShadowSize;
      localPath.rLineTo(f3, 0.0F);
      this.mCornerShadowPath.arcTo(localRectF, 180.0F, 90.0F, false);
      this.mCornerShadowPath.arcTo((RectF)localObject1, 270.0F, -90.0F, false);
      this.mCornerShadowPath.close();
      float f5 = this.mCornerRadius;
      f1 = this.mCornerRadius;
      f2 = this.mShadowSize;
      f1 += f2;
      f1 = f5 / f1;
      Object localObject3 = this.mCornerShadowPaint;
      localObject1 = new android/graphics/RadialGradient;
      f2 = this.mCornerRadius;
      f3 = this.mShadowSize;
      f2 += f3;
      localObject2 = new int[k];
      int m = this.mShadowStartColor;
      localObject2[0] = m;
      m = this.mShadowStartColor;
      localObject2[j] = m;
      m = this.mShadowEndColor;
      localObject2[i] = m;
      Object localObject4 = new float[k];
      localObject4[0] = 0.0F;
      localObject4[j] = f1;
      localObject4[i] = 1.0F;
      Object localObject5 = Shader.TileMode.CLAMP;
      ((RadialGradient)localObject1).<init>(0.0F, 0.0F, f2, (int[])localObject2, (float[])localObject4, (Shader.TileMode)localObject5);
      ((Paint)localObject3).setShader((Shader)localObject1);
      Paint localPaint = this.mEdgeShadowPaint;
      localObject1 = new android/graphics/LinearGradient;
      f1 = -this.mCornerRadius;
      f2 = this.mShadowSize;
      f1 += f2;
      f2 = -this.mCornerRadius;
      f3 = this.mShadowSize;
      f3 = f2 - f3;
      localObject4 = new int[k];
      int n = this.mShadowStartColor;
      localObject4[0] = n;
      n = this.mShadowStartColor;
      localObject4[j] = n;
      n = this.mShadowEndColor;
      localObject4[i] = n;
      localObject5 = new float[k];
      Object tmp459_457 = localObject5;
      tmp459_457[0] = 0.0F;
      Object tmp463_459 = tmp459_457;
      tmp463_459[1] = 0.5F;
      tmp463_459[2] = 1.0F;
      localObject3 = Shader.TileMode.CLAMP;
      ((LinearGradient)localObject1).<init>(0.0F, f1, 0.0F, f3, (int[])localObject4, (float[])localObject5, (Shader.TileMode)localObject3);
      localPaint.setShader((Shader)localObject1);
      this.mEdgeShadowPaint.setAntiAlias(false);
      return;
      localPath = this.mCornerShadowPath;
      localPath.reset();
    }
  }
  
  static float calculateHorizontalPadding(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      double d1 = paramFloat1;
      double d2 = COS_45;
      double d3 = 1.0D - d2;
      d2 = paramFloat2;
      d3 *= d2;
      d1 += d3;
      paramFloat1 = (float)d1;
    }
    return paramFloat1;
  }
  
  static float calculateVerticalPadding(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f = 1.5F;
    double d1;
    if (paramBoolean)
    {
      d1 = f * paramFloat1;
      double d2 = COS_45;
      double d3 = 1.0D - d2;
      d2 = paramFloat2;
      d3 *= d2;
      d1 += d3;
    }
    for (f = (float)d1;; f *= paramFloat1) {
      return f;
    }
  }
  
  private void drawShadow(Canvas paramCanvas)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    float f2 = 0.0F;
    Paint localPaint1 = null;
    float f3 = 2.0F;
    float f4 = -this.mCornerRadius;
    float f5 = this.mShadowSize;
    f4 -= f5;
    f5 = this.mCornerRadius;
    int j = this.mInsetShadow;
    float f6 = j;
    f5 += f6;
    f6 = this.mRawShadowSize / f3;
    float f7 = f5 + f6;
    RectF localRectF = this.mCardBounds;
    f5 = localRectF.width();
    f6 = f3 * f7;
    f5 -= f6;
    boolean bool = f5 < 0.0F;
    int k;
    if (bool)
    {
      k = i;
      localRectF = this.mCardBounds;
      f5 = localRectF.height();
      f6 = f3 * f7;
      f5 -= f6;
      bool = f5 < 0.0F;
      if (!bool) {
        break label678;
      }
    }
    label678:
    for (int m = i;; m = 0)
    {
      int n = paramCanvas.save();
      f1 = this.mCardBounds.left + f7;
      f2 = this.mCardBounds.top + f7;
      paramCanvas.translate(f1, f2);
      Object localObject = this.mCornerShadowPath;
      localPaint1 = this.mCornerShadowPaint;
      paramCanvas.drawPath((Path)localObject, localPaint1);
      Paint localPaint2;
      if (k != 0)
      {
        f1 = this.mCardBounds.width();
        f2 = f3 * f7;
        f2 = f1 - f2;
        f1 = this.mCornerRadius;
        f5 = -f1;
        localPaint2 = this.mEdgeShadowPaint;
        localObject = paramCanvas;
        paramCanvas.drawRect(0.0F, f4, f2, f5, localPaint2);
      }
      paramCanvas.restoreToCount(n);
      n = paramCanvas.save();
      f1 = this.mCardBounds.right - f7;
      f2 = this.mCardBounds.bottom - f7;
      paramCanvas.translate(f1, f2);
      i = 1127481344;
      f1 = 180.0F;
      paramCanvas.rotate(f1);
      localObject = this.mCornerShadowPath;
      localPaint1 = this.mCornerShadowPaint;
      paramCanvas.drawPath((Path)localObject, localPaint1);
      if (k != 0)
      {
        f1 = this.mCardBounds.width();
        f2 = f3 * f7;
        f2 = f1 - f2;
        f1 = -this.mCornerRadius;
        f5 = this.mShadowSize + f1;
        localPaint2 = this.mEdgeShadowPaint;
        localObject = paramCanvas;
        paramCanvas.drawRect(0.0F, f4, f2, f5, localPaint2);
      }
      paramCanvas.restoreToCount(n);
      k = paramCanvas.save();
      f1 = this.mCardBounds.left + f7;
      f2 = this.mCardBounds.bottom - f7;
      paramCanvas.translate(f1, f2);
      i = 1132920832;
      f1 = 270.0F;
      paramCanvas.rotate(f1);
      localObject = this.mCornerShadowPath;
      localPaint1 = this.mCornerShadowPaint;
      paramCanvas.drawPath((Path)localObject, localPaint1);
      if (m != 0)
      {
        f1 = this.mCardBounds.height();
        f2 = f3 * f7;
        f2 = f1 - f2;
        f1 = this.mCornerRadius;
        f5 = -f1;
        localPaint2 = this.mEdgeShadowPaint;
        localObject = paramCanvas;
        paramCanvas.drawRect(0.0F, f4, f2, f5, localPaint2);
      }
      paramCanvas.restoreToCount(k);
      k = paramCanvas.save();
      f1 = this.mCardBounds.right - f7;
      f2 = this.mCardBounds.top + f7;
      paramCanvas.translate(f1, f2);
      i = 1119092736;
      f1 = 90.0F;
      paramCanvas.rotate(f1);
      localObject = this.mCornerShadowPath;
      localPaint1 = this.mCornerShadowPaint;
      paramCanvas.drawPath((Path)localObject, localPaint1);
      if (m != 0)
      {
        f1 = this.mCardBounds.height();
        f2 = f3 * f7;
        f2 = f1 - f2;
        f1 = this.mCornerRadius;
        f5 = -f1;
        localPaint2 = this.mEdgeShadowPaint;
        localObject = paramCanvas;
        paramCanvas.drawRect(0.0F, f4, f2, f5, localPaint2);
      }
      paramCanvas.restoreToCount(k);
      return;
      k = 0;
      break;
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
  
  private void setShadowSize(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    int i = 0;
    float f1 = 0.0F;
    Object localObject = null;
    boolean bool2 = paramFloat1 < 0.0F;
    IllegalArgumentException localIllegalArgumentException;
    if (bool2)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Invalid shadow size " + paramFloat1 + ". Must be >= 0";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    bool2 = paramFloat2 < 0.0F;
    if (bool2)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Invalid max shadow size " + paramFloat2 + ". Must be >= 0";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    int j = toEven(paramFloat1);
    float f2 = j;
    i = toEven(paramFloat2);
    f1 = i;
    boolean bool4 = f2 < f1;
    if (bool4)
    {
      boolean bool3 = this.mPrintedShadowClipWarning;
      if (!bool3) {
        this.mPrintedShadowClipWarning = bool1;
      }
      f2 = f1;
    }
    float f3 = this.mRawShadowSize;
    bool4 = f3 < f2;
    if (!bool4)
    {
      f3 = this.mRawMaxShadowSize;
      bool4 = f3 < f1;
      if (bool4) {}
    }
    for (;;)
    {
      return;
      this.mRawShadowSize = f2;
      this.mRawMaxShadowSize = f1;
      f2 *= 1.5F;
      f1 = this.mInsetShadow;
      f2 += f1;
      i = 1056964608;
      f1 = 0.5F;
      int k = (int)(f2 + f1);
      f2 = k;
      this.mShadowSize = f2;
      this.mDirty = bool1;
      invalidateSelf();
    }
  }
  
  private int toEven(float paramFloat)
  {
    float f = 0.5F + paramFloat;
    int i = (int)f;
    int j = i % 2;
    int k = 1;
    if (j == k) {
      i += -1;
    }
    return i;
  }
  
  public void draw(Canvas paramCanvas)
  {
    float f1 = 2.0F;
    RectF localRectF = null;
    boolean bool = this.mDirty;
    if (bool)
    {
      localObject = getBounds();
      buildComponents((Rect)localObject);
      bool = false;
      f2 = 0.0F;
      localObject = null;
      this.mDirty = false;
    }
    float f2 = this.mRawShadowSize / f1;
    paramCanvas.translate(0.0F, f2);
    drawShadow(paramCanvas);
    f2 = -this.mRawShadowSize / f1;
    paramCanvas.translate(0.0F, f2);
    Object localObject = sRoundRectHelper;
    localRectF = this.mCardBounds;
    f1 = this.mCornerRadius;
    Paint localPaint = this.mPaint;
    ((RoundRectDrawableWithShadow.RoundRectHelper)localObject).drawRoundRect(paramCanvas, localRectF, f1, localPaint);
  }
  
  ColorStateList getColor()
  {
    return this.mBackground;
  }
  
  float getCornerRadius()
  {
    return this.mCornerRadius;
  }
  
  void getMaxShadowAndCornerPadding(Rect paramRect)
  {
    getPadding(paramRect);
  }
  
  float getMaxShadowSize()
  {
    return this.mRawMaxShadowSize;
  }
  
  float getMinHeight()
  {
    float f1 = 1.5F;
    float f2 = 2.0F;
    float f3 = this.mRawMaxShadowSize;
    float f4 = this.mCornerRadius;
    float f5 = this.mInsetShadow;
    f4 += f5;
    f5 = this.mRawMaxShadowSize * f1 / f2;
    f4 += f5;
    f3 = Math.max(f3, f4) * f2;
    f4 = this.mRawMaxShadowSize * f1;
    f5 = this.mInsetShadow;
    f4 = (f4 + f5) * f2;
    return f3 + f4;
  }
  
  float getMinWidth()
  {
    float f1 = 2.0F;
    float f2 = this.mRawMaxShadowSize;
    float f3 = this.mCornerRadius;
    float f4 = this.mInsetShadow;
    f3 += f4;
    f4 = this.mRawMaxShadowSize / f1;
    f3 += f4;
    f2 = Math.max(f2, f3) * f1;
    f3 = this.mRawMaxShadowSize;
    f4 = this.mInsetShadow;
    f3 = (f3 + f4) * f1;
    return f2 + f3;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean getPadding(Rect paramRect)
  {
    float f1 = this.mRawMaxShadowSize;
    float f2 = this.mCornerRadius;
    boolean bool1 = this.mAddPaddingForCorners;
    int i = (int)Math.ceil(calculateVerticalPadding(f1, f2, bool1));
    f2 = this.mRawMaxShadowSize;
    float f3 = this.mCornerRadius;
    boolean bool2 = this.mAddPaddingForCorners;
    int j = (int)Math.ceil(calculateHorizontalPadding(f2, f3, bool2));
    paramRect.set(j, i, j, i);
    return true;
  }
  
  float getShadowSize()
  {
    return this.mRawShadowSize;
  }
  
  public boolean isStateful()
  {
    ColorStateList localColorStateList = this.mBackground;
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
        break label36;
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label36:
      bool = false;
      localColorStateList = null;
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.mDirty = true;
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    boolean bool = true;
    ColorStateList localColorStateList = this.mBackground;
    int i = this.mBackground.getDefaultColor();
    int j = localColorStateList.getColorForState(paramArrayOfInt, i);
    Paint localPaint = this.mPaint;
    i = localPaint.getColor();
    if (i == j) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      localPaint = this.mPaint;
      localPaint.setColor(j);
      this.mDirty = bool;
      invalidateSelf();
    }
  }
  
  void setAddPaddingForCorners(boolean paramBoolean)
  {
    this.mAddPaddingForCorners = paramBoolean;
    invalidateSelf();
  }
  
  public void setAlpha(int paramInt)
  {
    this.mPaint.setAlpha(paramInt);
    this.mCornerShadowPaint.setAlpha(paramInt);
    this.mEdgeShadowPaint.setAlpha(paramInt);
  }
  
  void setColor(ColorStateList paramColorStateList)
  {
    setBackground(paramColorStateList);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mPaint.setColorFilter(paramColorFilter);
  }
  
  void setCornerRadius(float paramFloat)
  {
    float f1 = 0.0F;
    IllegalArgumentException localIllegalArgumentException = null;
    boolean bool1 = paramFloat < 0.0F;
    if (bool1)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Invalid radius " + paramFloat + ". Must be >= 0";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    int i = (int)(0.5F + paramFloat);
    f1 = i;
    float f2 = this.mCornerRadius;
    boolean bool2 = f2 < f1;
    if (!bool2) {}
    for (;;)
    {
      return;
      this.mCornerRadius = f1;
      i = 1;
      f1 = Float.MIN_VALUE;
      this.mDirty = i;
      invalidateSelf();
    }
  }
  
  void setMaxShadowSize(float paramFloat)
  {
    float f = this.mRawShadowSize;
    setShadowSize(f, paramFloat);
  }
  
  void setShadowSize(float paramFloat)
  {
    float f = this.mRawMaxShadowSize;
    setShadowSize(paramFloat, f);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RoundRectDrawableWithShadow.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */