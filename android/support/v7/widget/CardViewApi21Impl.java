package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

class CardViewApi21Impl
  implements CardViewImpl
{
  private RoundRectDrawable getCardBackground(CardViewDelegate paramCardViewDelegate)
  {
    return (RoundRectDrawable)paramCardViewDelegate.getCardBackground();
  }
  
  public ColorStateList getBackgroundColor(CardViewDelegate paramCardViewDelegate)
  {
    return getCardBackground(paramCardViewDelegate).getColor();
  }
  
  public float getElevation(CardViewDelegate paramCardViewDelegate)
  {
    return paramCardViewDelegate.getCardView().getElevation();
  }
  
  public float getMaxElevation(CardViewDelegate paramCardViewDelegate)
  {
    return getCardBackground(paramCardViewDelegate).getPadding();
  }
  
  public float getMinHeight(CardViewDelegate paramCardViewDelegate)
  {
    return getRadius(paramCardViewDelegate) * 2.0F;
  }
  
  public float getMinWidth(CardViewDelegate paramCardViewDelegate)
  {
    return getRadius(paramCardViewDelegate) * 2.0F;
  }
  
  public float getRadius(CardViewDelegate paramCardViewDelegate)
  {
    return getCardBackground(paramCardViewDelegate).getRadius();
  }
  
  public void initStatic() {}
  
  public void initialize(CardViewDelegate paramCardViewDelegate, Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    Object localObject = new android/support/v7/widget/RoundRectDrawable;
    ((RoundRectDrawable)localObject).<init>(paramColorStateList, paramFloat1);
    paramCardViewDelegate.setCardBackground((Drawable)localObject);
    localObject = paramCardViewDelegate.getCardView();
    ((View)localObject).setClipToOutline(true);
    ((View)localObject).setElevation(paramFloat2);
    setMaxElevation(paramCardViewDelegate, paramFloat3);
  }
  
  public void onCompatPaddingChanged(CardViewDelegate paramCardViewDelegate)
  {
    float f = getMaxElevation(paramCardViewDelegate);
    setMaxElevation(paramCardViewDelegate, f);
  }
  
  public void onPreventCornerOverlapChanged(CardViewDelegate paramCardViewDelegate)
  {
    float f = getMaxElevation(paramCardViewDelegate);
    setMaxElevation(paramCardViewDelegate, f);
  }
  
  public void setBackgroundColor(CardViewDelegate paramCardViewDelegate, ColorStateList paramColorStateList)
  {
    getCardBackground(paramCardViewDelegate).setColor(paramColorStateList);
  }
  
  public void setElevation(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    paramCardViewDelegate.getCardView().setElevation(paramFloat);
  }
  
  public void setMaxElevation(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    RoundRectDrawable localRoundRectDrawable = getCardBackground(paramCardViewDelegate);
    boolean bool1 = paramCardViewDelegate.getUseCompatPadding();
    boolean bool2 = paramCardViewDelegate.getPreventCornerOverlap();
    localRoundRectDrawable.setPadding(paramFloat, bool1, bool2);
    updatePadding(paramCardViewDelegate);
  }
  
  public void setRadius(CardViewDelegate paramCardViewDelegate, float paramFloat)
  {
    getCardBackground(paramCardViewDelegate).setRadius(paramFloat);
  }
  
  public void updatePadding(CardViewDelegate paramCardViewDelegate)
  {
    float f1 = 0.0F;
    boolean bool1 = paramCardViewDelegate.getUseCompatPadding();
    if (!bool1) {
      paramCardViewDelegate.setShadowPadding(0, 0, 0, 0);
    }
    for (;;)
    {
      return;
      float f2 = getMaxElevation(paramCardViewDelegate);
      f1 = getRadius(paramCardViewDelegate);
      boolean bool2 = paramCardViewDelegate.getPreventCornerOverlap();
      float f3 = RoundRectDrawableWithShadow.calculateHorizontalPadding(f2, f1, bool2);
      double d1 = Math.ceil(f3);
      int j = (int)d1;
      boolean bool3 = paramCardViewDelegate.getPreventCornerOverlap();
      f2 = RoundRectDrawableWithShadow.calculateVerticalPadding(f2, f1, bool3);
      double d2 = Math.ceil(f2);
      int i = (int)d2;
      paramCardViewDelegate.setShadowPadding(j, i, j, i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\CardViewApi21Impl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */