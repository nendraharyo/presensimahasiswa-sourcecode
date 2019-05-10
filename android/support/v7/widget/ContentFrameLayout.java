package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout
  extends FrameLayout
{
  private ContentFrameLayout.OnAttachListener mAttachListener;
  private final Rect mDecorPadding;
  private TypedValue mFixedHeightMajor;
  private TypedValue mFixedHeightMinor;
  private TypedValue mFixedWidthMajor;
  private TypedValue mFixedWidthMinor;
  private TypedValue mMinWidthMajor;
  private TypedValue mMinWidthMinor;
  
  public ContentFrameLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.mDecorPadding = localRect;
  }
  
  public void dispatchFitSystemWindows(Rect paramRect)
  {
    fitSystemWindows(paramRect);
  }
  
  public TypedValue getFixedHeightMajor()
  {
    TypedValue localTypedValue = this.mFixedHeightMajor;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.mFixedHeightMajor = localTypedValue;
    }
    return this.mFixedHeightMajor;
  }
  
  public TypedValue getFixedHeightMinor()
  {
    TypedValue localTypedValue = this.mFixedHeightMinor;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.mFixedHeightMinor = localTypedValue;
    }
    return this.mFixedHeightMinor;
  }
  
  public TypedValue getFixedWidthMajor()
  {
    TypedValue localTypedValue = this.mFixedWidthMajor;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.mFixedWidthMajor = localTypedValue;
    }
    return this.mFixedWidthMajor;
  }
  
  public TypedValue getFixedWidthMinor()
  {
    TypedValue localTypedValue = this.mFixedWidthMinor;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.mFixedWidthMinor = localTypedValue;
    }
    return this.mFixedWidthMinor;
  }
  
  public TypedValue getMinWidthMajor()
  {
    TypedValue localTypedValue = this.mMinWidthMajor;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.mMinWidthMajor = localTypedValue;
    }
    return this.mMinWidthMajor;
  }
  
  public TypedValue getMinWidthMinor()
  {
    TypedValue localTypedValue = this.mMinWidthMinor;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.mMinWidthMinor = localTypedValue;
    }
    return this.mMinWidthMinor;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ContentFrameLayout.OnAttachListener localOnAttachListener = this.mAttachListener;
    if (localOnAttachListener != null)
    {
      localOnAttachListener = this.mAttachListener;
      localOnAttachListener.onAttachedFromWindow();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ContentFrameLayout.OnAttachListener localOnAttachListener = this.mAttachListener;
    if (localOnAttachListener != null)
    {
      localOnAttachListener = this.mAttachListener;
      localOnAttachListener.onDetachedFromWindow();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 5;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = -1 << -1;
    int m = 1073741824;
    int n = 0;
    Object localObject1 = getContext().getResources();
    Object localObject2 = ((Resources)localObject1).getDisplayMetrics();
    int i1 = ((DisplayMetrics)localObject2).widthPixels;
    int i2 = ((DisplayMetrics)localObject2).heightPixels;
    float f2;
    int i3;
    int i4;
    TypedValue localTypedValue;
    label96:
    int i5;
    float f3;
    if (i1 < i2)
    {
      i1 = j;
      f2 = f1;
      i3 = View.MeasureSpec.getMode(paramInt1);
      i4 = View.MeasureSpec.getMode(paramInt2);
      if (i3 != k) {
        break label773;
      }
      if (i1 == 0) {
        break label524;
      }
      localTypedValue = this.mFixedWidthMinor;
      if (localTypedValue == null) {
        break label773;
      }
      i5 = localTypedValue.type;
      if (i5 == 0) {
        break label773;
      }
      i5 = localTypedValue.type;
      if (i5 != i) {
        break label533;
      }
      f3 = localTypedValue.getDimension((DisplayMetrics)localObject2);
      i2 = (int)f3;
    }
    for (;;)
    {
      label140:
      Rect localRect1;
      Rect localRect2;
      int i6;
      if (i2 > 0)
      {
        localRect1 = this.mDecorPadding;
        i5 = localRect1.left;
        localRect2 = this.mDecorPadding;
        i6 = localRect2.right;
        i5 += i6;
        i2 -= i5;
        i5 = View.MeasureSpec.getSize(paramInt1);
        i2 = Math.min(i2, i5);
        paramInt1 = View.MeasureSpec.makeMeasureSpec(i2, m);
        i5 = j;
      }
      for (float f4 = f1;; f4 = 0.0F)
      {
        if (i4 == k)
        {
          if (i1 == 0) {
            break label598;
          }
          localTypedValue = this.mFixedHeightMajor;
          label234:
          if (localTypedValue != null)
          {
            i4 = localTypedValue.type;
            if (i4 != 0)
            {
              i4 = localTypedValue.type;
              if (i4 != i) {
                break label607;
              }
              f3 = localTypedValue.getDimension((DisplayMetrics)localObject2);
              i2 = (int)f3;
            }
          }
        }
        for (;;)
        {
          label278:
          if (i2 > 0)
          {
            Rect localRect3 = this.mDecorPadding;
            i4 = localRect3.top;
            localRect2 = this.mDecorPadding;
            i6 = localRect2.bottom;
            i4 += i6;
            i2 -= i4;
            i4 = View.MeasureSpec.getSize(paramInt2);
            i2 = Math.min(i2, i4);
            paramInt2 = View.MeasureSpec.makeMeasureSpec(i2, m);
          }
          super.onMeasure(paramInt1, paramInt2);
          i4 = getMeasuredWidth();
          i2 = View.MeasureSpec.makeMeasureSpec(i4, m);
          if ((i5 == 0) && (i3 == k)) {
            if (i1 != 0)
            {
              localObject1 = this.mMinWidthMinor;
              label390:
              if (localObject1 == null) {
                break label742;
              }
              i5 = ((TypedValue)localObject1).type;
              if (i5 == 0) {
                break label742;
              }
              i5 = ((TypedValue)localObject1).type;
              if (i5 != i) {
                break label681;
              }
              f2 = ((TypedValue)localObject1).getDimension((DisplayMetrics)localObject2);
              i1 = (int)f2;
            }
          }
          for (;;)
          {
            label434:
            int i7;
            if (i1 > 0)
            {
              localRect1 = this.mDecorPadding;
              i5 = localRect1.left;
              localObject2 = this.mDecorPadding;
              i7 = ((Rect)localObject2).right;
              i5 += i7;
              i1 -= i5;
            }
            if (i4 < i1)
            {
              i1 = View.MeasureSpec.makeMeasureSpec(i1, m);
              n = j;
            }
            for (;;)
            {
              if (n != 0) {
                super.onMeasure(i1, paramInt2);
              }
              return;
              i1 = 0;
              localObject1 = null;
              f2 = 0.0F;
              break;
              label524:
              localTypedValue = this.mFixedWidthMajor;
              break label96;
              label533:
              i5 = localTypedValue.type;
              i6 = 6;
              float f5 = 8.4E-45F;
              if (i5 != i6) {
                break label785;
              }
              i5 = ((DisplayMetrics)localObject2).widthPixels;
              f4 = i5;
              i6 = ((DisplayMetrics)localObject2).widthPixels;
              f5 = i6;
              f3 = localTypedValue.getFraction(f4, f5);
              i2 = (int)f3;
              break label140;
              label598:
              localTypedValue = this.mFixedHeightMinor;
              break label234;
              label607:
              i4 = localTypedValue.type;
              i6 = 6;
              f5 = 8.4E-45F;
              if (i4 != i6) {
                break label761;
              }
              i4 = ((DisplayMetrics)localObject2).heightPixels;
              float f6 = i4;
              i6 = ((DisplayMetrics)localObject2).heightPixels;
              f5 = i6;
              f3 = localTypedValue.getFraction(f6, f5);
              i2 = (int)f3;
              break label278;
              localObject1 = this.mMinWidthMajor;
              break label390;
              label681:
              i5 = ((TypedValue)localObject1).type;
              i3 = 6;
              if (i5 != i3) {
                break label749;
              }
              i5 = ((DisplayMetrics)localObject2).widthPixels;
              f4 = i5;
              i7 = ((DisplayMetrics)localObject2).widthPixels;
              float f7 = i7;
              f2 = ((TypedValue)localObject1).getFraction(f4, f7);
              i1 = (int)f2;
              break label434;
              label742:
              i1 = i2;
            }
            label749:
            i1 = 0;
            localObject1 = null;
            f2 = 0.0F;
          }
          label761:
          i2 = 0;
          localTypedValue = null;
          f3 = 0.0F;
        }
        label773:
        i5 = 0;
        localRect1 = null;
      }
      label785:
      i2 = 0;
      localTypedValue = null;
      f3 = 0.0F;
    }
  }
  
  public void setAttachListener(ContentFrameLayout.OnAttachListener paramOnAttachListener)
  {
    this.mAttachListener = paramOnAttachListener;
  }
  
  public void setDecorPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = this.mDecorPadding;
    localRect.set(paramInt1, paramInt2, paramInt3, paramInt4);
    boolean bool = r.w(this);
    if (bool) {
      requestLayout();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ContentFrameLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */