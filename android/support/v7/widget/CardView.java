package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.cardview.R.color;
import android.support.v7.cardview.R.style;
import android.support.v7.cardview.R.styleable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class CardView
  extends FrameLayout
{
  private static final int[] COLOR_BACKGROUND_ATTR;
  private static final CardViewImpl IMPL;
  private final CardViewDelegate mCardViewDelegate;
  private boolean mCompatPadding;
  final Rect mContentPadding;
  private boolean mPreventCornerOverlap;
  final Rect mShadowBounds;
  int mUserSetMinHeight;
  int mUserSetMinWidth;
  
  static
  {
    Object localObject = new int[1];
    int i = 16842801;
    localObject[0] = i;
    COLOR_BACKGROUND_ATTR = (int[])localObject;
    int j = Build.VERSION.SDK_INT;
    int k = 21;
    if (j >= k)
    {
      localObject = new android/support/v7/widget/CardViewApi21Impl;
      ((CardViewApi21Impl)localObject).<init>();
      IMPL = (CardViewImpl)localObject;
    }
    for (;;)
    {
      IMPL.initStatic();
      return;
      j = Build.VERSION.SDK_INT;
      k = 17;
      if (j >= k)
      {
        localObject = new android/support/v7/widget/CardViewApi17Impl;
        ((CardViewApi17Impl)localObject).<init>();
        IMPL = (CardViewImpl)localObject;
      }
      else
      {
        localObject = new android/support/v7/widget/CardViewBaseImpl;
        ((CardViewBaseImpl)localObject).<init>();
        IMPL = (CardViewImpl)localObject;
      }
    }
  }
  
  public CardView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.mContentPadding = ((Rect)localObject1);
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.mShadowBounds = ((Rect)localObject1);
    localObject1 = new android/support/v7/widget/CardView$1;
    ((CardView.1)localObject1).<init>(this);
    this.mCardViewDelegate = ((CardViewDelegate)localObject1);
    localObject1 = R.styleable.CardView;
    int i = R.style.CardView;
    Object localObject2 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, paramInt, i);
    int j = R.styleable.CardView_cardBackgroundColor;
    boolean bool1 = ((TypedArray)localObject2).hasValue(j);
    ColorStateList localColorStateList;
    if (bool1)
    {
      int k = R.styleable.CardView_cardBackgroundColor;
      localColorStateList = ((TypedArray)localObject2).getColorStateList(k);
      k = R.styleable.CardView_cardCornerRadius;
      float f2 = ((TypedArray)localObject2).getDimension(k, 0.0F);
      k = R.styleable.CardView_cardElevation;
      float f3 = ((TypedArray)localObject2).getDimension(k, 0.0F);
      k = R.styleable.CardView_cardMaxElevation;
      f1 = ((TypedArray)localObject2).getDimension(k, 0.0F);
      k = R.styleable.CardView_cardUseCompatPadding;
      boolean bool2 = ((TypedArray)localObject2).getBoolean(k, false);
      this.mCompatPadding = bool2;
      int m = R.styleable.CardView_cardPreventCornerOverlap;
      boolean bool6 = true;
      f4 = Float.MIN_VALUE;
      boolean bool3 = ((TypedArray)localObject2).getBoolean(m, bool6);
      this.mPreventCornerOverlap = bool3;
      int n = R.styleable.CardView_contentPadding;
      n = ((TypedArray)localObject2).getDimensionPixelSize(n, 0);
      localObject3 = this.mContentPadding;
      int i4 = R.styleable.CardView_contentPaddingLeft;
      i4 = ((TypedArray)localObject2).getDimensionPixelSize(i4, n);
      ((Rect)localObject3).left = i4;
      localObject3 = this.mContentPadding;
      i4 = R.styleable.CardView_contentPaddingTop;
      i4 = ((TypedArray)localObject2).getDimensionPixelSize(i4, n);
      ((Rect)localObject3).top = i4;
      localObject3 = this.mContentPadding;
      i4 = R.styleable.CardView_contentPaddingRight;
      i4 = ((TypedArray)localObject2).getDimensionPixelSize(i4, n);
      ((Rect)localObject3).right = i4;
      localObject3 = this.mContentPadding;
      i4 = R.styleable.CardView_contentPaddingBottom;
      n = ((TypedArray)localObject2).getDimensionPixelSize(i4, n);
      ((Rect)localObject3).bottom = n;
      boolean bool4 = f3 < f1;
      if (bool4) {
        f1 = f3;
      }
      int i1 = R.styleable.CardView_android_minWidth;
      i1 = ((TypedArray)localObject2).getDimensionPixelSize(i1, 0);
      this.mUserSetMinWidth = i1;
      i1 = R.styleable.CardView_android_minHeight;
      i1 = ((TypedArray)localObject2).getDimensionPixelSize(i1, 0);
      this.mUserSetMinHeight = i1;
      ((TypedArray)localObject2).recycle();
      localObject1 = IMPL;
      localObject2 = this.mCardViewDelegate;
      localObject3 = paramContext;
      ((CardViewImpl)localObject1).initialize((CardViewDelegate)localObject2, paramContext, localColorStateList, f2, f3, f1);
      return;
    }
    localObject1 = getContext();
    Object localObject3 = COLOR_BACKGROUND_ATTR;
    localObject1 = ((Context)localObject1).obtainStyledAttributes((int[])localObject3);
    int i3 = ((TypedArray)localObject1).getColor(0, 0);
    ((TypedArray)localObject1).recycle();
    localObject1 = new float[3];
    Color.colorToHSV(i3, (float[])localObject1);
    float f5 = localObject1[2];
    i3 = 1056964608;
    float f4 = 0.5F;
    boolean bool5 = f5 < f4;
    if (bool5)
    {
      localObject1 = getResources();
      i3 = R.color.cardview_light_background;
    }
    for (int i2 = ((Resources)localObject1).getColor(i3);; i2 = ((Resources)localObject1).getColor(i3))
    {
      localColorStateList = ColorStateList.valueOf(i2);
      break;
      localObject1 = getResources();
      i3 = R.color.cardview_dark_background;
    }
  }
  
  public ColorStateList getCardBackgroundColor()
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    return localCardViewImpl.getBackgroundColor(localCardViewDelegate);
  }
  
  public float getCardElevation()
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    return localCardViewImpl.getElevation(localCardViewDelegate);
  }
  
  public int getContentPaddingBottom()
  {
    return this.mContentPadding.bottom;
  }
  
  public int getContentPaddingLeft()
  {
    return this.mContentPadding.left;
  }
  
  public int getContentPaddingRight()
  {
    return this.mContentPadding.right;
  }
  
  public int getContentPaddingTop()
  {
    return this.mContentPadding.top;
  }
  
  public float getMaxCardElevation()
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    return localCardViewImpl.getMaxElevation(localCardViewDelegate);
  }
  
  public boolean getPreventCornerOverlap()
  {
    return this.mPreventCornerOverlap;
  }
  
  public float getRadius()
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    return localCardViewImpl.getRadius(localCardViewDelegate);
  }
  
  public boolean getUseCompatPadding()
  {
    return this.mCompatPadding;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    CardViewImpl localCardViewImpl1 = IMPL;
    boolean bool = localCardViewImpl1 instanceof CardViewApi21Impl;
    int i;
    if (!bool)
    {
      i = View.MeasureSpec.getMode(paramInt1);
      switch (i)
      {
      default: 
        i = View.MeasureSpec.getMode(paramInt2);
        switch (i)
        {
        default: 
          label84:
          super.onMeasure(paramInt1, paramInt2);
        }
        break;
      }
    }
    for (;;)
    {
      return;
      CardViewImpl localCardViewImpl2 = IMPL;
      CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
      float f = localCardViewImpl2.getMinWidth(localCardViewDelegate);
      double d = Math.ceil(f);
      int j = (int)d;
      int k = View.MeasureSpec.getSize(paramInt1);
      j = Math.max(j, k);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(j, i);
      break;
      localCardViewImpl2 = IMPL;
      localCardViewDelegate = this.mCardViewDelegate;
      f = localCardViewImpl2.getMinHeight(localCardViewDelegate);
      d = Math.ceil(f);
      j = (int)d;
      k = View.MeasureSpec.getSize(paramInt2);
      j = Math.max(j, k);
      paramInt2 = View.MeasureSpec.makeMeasureSpec(j, i);
      break label84;
      super.onMeasure(paramInt1, paramInt2);
    }
  }
  
  public void setCardBackgroundColor(int paramInt)
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    localCardViewImpl.setBackgroundColor(localCardViewDelegate, localColorStateList);
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList)
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    localCardViewImpl.setBackgroundColor(localCardViewDelegate, paramColorStateList);
  }
  
  public void setCardElevation(float paramFloat)
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    localCardViewImpl.setElevation(localCardViewDelegate, paramFloat);
  }
  
  public void setContentPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mContentPadding.set(paramInt1, paramInt2, paramInt3, paramInt4);
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    localCardViewImpl.updatePadding(localCardViewDelegate);
  }
  
  public void setMaxCardElevation(float paramFloat)
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    localCardViewImpl.setMaxElevation(localCardViewDelegate, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt)
  {
    this.mUserSetMinHeight = paramInt;
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt)
  {
    this.mUserSetMinWidth = paramInt;
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean)
  {
    boolean bool = this.mPreventCornerOverlap;
    if (paramBoolean != bool)
    {
      this.mPreventCornerOverlap = paramBoolean;
      CardViewImpl localCardViewImpl = IMPL;
      CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
      localCardViewImpl.onPreventCornerOverlapChanged(localCardViewDelegate);
    }
  }
  
  public void setRadius(float paramFloat)
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    localCardViewImpl.setRadius(localCardViewDelegate, paramFloat);
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    boolean bool = this.mCompatPadding;
    if (bool != paramBoolean)
    {
      this.mCompatPadding = paramBoolean;
      CardViewImpl localCardViewImpl = IMPL;
      CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
      localCardViewImpl.onCompatPaddingChanged(localCardViewDelegate);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\CardView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */