package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class CardViewBaseImpl
  implements CardViewImpl
{
  private final RectF mCornerRect;
  
  CardViewBaseImpl()
  {
    RectF localRectF = new android/graphics/RectF;
    localRectF.<init>();
    this.mCornerRect = localRectF;
  }
  
  private RoundRectDrawableWithShadow createBackground(Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    RoundRectDrawableWithShadow localRoundRectDrawableWithShadow = new android/support/v7/widget/RoundRectDrawableWithShadow;
    Resources localResources = paramContext.getResources();
    localRoundRectDrawableWithShadow.<init>(localResources, paramColorStateList, paramFloat1, paramFloat2, paramFloat3);
    return localRoundRectDrawableWithShadow;
  }
  
  private RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate paramCardViewDelegate)
  {
    return (RoundRectDrawableWithShadow)paramCardViewDelegate.getCardBackground();
  }
  
  public ColorStateList getBackgroundColor(CardViewDelegate paramCardViewDelegate)
  {
    return getShadowBackground(paramCardViewDelegate).getColor();
  }
  
  public float getElevation(CardViewDelegate paramCardViewDelegate)
  {
    return getShadowBackground(paramCardViewDelegate).getShadowSize();
  }
  
  public float getMaxElevation(CardViewDelegate paramCardViewDelegate)
  {
    return getShadowBackground(paramCardViewDelegate).getMaxShadowSize();
  }
  
  public float getMinHeight(CardViewDelegate paramCardViewDelegate)
  {
    return getShadowBackground(paramCardViewDelegate).getMinHeight();
  }
  
  public float getMinWidth(CardViewDelegate paramCardViewDelegate)
  {
    return getShadowBackground(paramCardViewDelegate).getMinWidth();
  }
  
  public float getRadius(CardViewDelegate paramCardViewDelegate)
  {
    return getShadowBackground(paramCardViewDelegate).getCornerRadius();
  }
  
  public void initStatic()
  {
    CardViewBaseImpl.1 local1 = new android/support/v7/widget/CardViewBaseImpl$1;
    local1.<init>(this);
    RoundRectDrawableWithShadow.sRoundRectHelper = local1;
  }
  
  public void initialize(CardViewDelegate paramCardViewDelegate, Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    Object localObject = this;
    localObject = createBackground(paramContext, paramColorStateList, paramFloat1, paramFloat2, paramFloat3);
    boolean bool = paramCardViewDelegate.getPreventCornerOverlap();
    ((RoundRectDrawableWithShadow)localObject).setAddPaddingForCorners(bool);
    paramCardViewDelegate.setCardBackground((Drawable)localObject);
    updatePadding(paramCardViewDelegate);
  }
  
  public void onCompatPaddingChanged(CardViewDelegate paramCardViewDelegate) {}
  
  public void onPreventCornerOverlapChanged(CardViewDelegate paramCardViewDelegate)
  {
    RoundRectDrawableWithShadow localRoundRectDrawableWithShadow = getShadowBackground(paramCardViewDelegate);
    boolean bool = paramCardViewDelegate.getPreventCornerOverlap();
    localRoundRectDrawableWithShadow.setAddPaddingForCorners(bool);
    updatePadding(paramCardViewDelegate);
  }
  
  public void setBackgroundColor(CardViewDelegate paramCardViewDelegate, ColorStateList paramColorStateList)
  {
    getShadowBackground(paramCardViewDelegate).setColor(paramColorStateList);
  }
  
  public void setElevation(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    getShadowBackground(paramCardViewDelegate).setShadowSize(paramFloat);
  }
  
  public void setMaxElevation(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    getShadowBackground(paramCardViewDelegate).setMaxShadowSize(paramFloat);
    updatePadding(paramCardViewDelegate);
  }
  
  public void setRadius(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    getShadowBackground(paramCardViewDelegate).setCornerRadius(paramFloat);
    updatePadding(paramCardViewDelegate);
  }
  
  public void updatePadding(CardViewDelegate paramCardViewDelegate)
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    getShadowBackground(paramCardViewDelegate).getMaxShadowAndCornerPadding(localRect);
    int i = (int)Math.ceil(getMinWidth(paramCardViewDelegate));
    int j = (int)Math.ceil(getMinHeight(paramCardViewDelegate));
    paramCardViewDelegate.setMinWidthHeightInternal(i, j);
    i = localRect.left;
    j = localRect.top;
    int k = localRect.right;
    int m = localRect.bottom;
    paramCardViewDelegate.setShadowPadding(i, j, k, m);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\CardViewBaseImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */