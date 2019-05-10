package android.support.v7.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

class CardView$1
  implements CardViewDelegate
{
  private Drawable mCardBackground;
  
  CardView$1(CardView paramCardView) {}
  
  public Drawable getCardBackground()
  {
    return this.mCardBackground;
  }
  
  public View getCardView()
  {
    return this.this$0;
  }
  
  public boolean getPreventCornerOverlap()
  {
    return this.this$0.getPreventCornerOverlap();
  }
  
  public boolean getUseCompatPadding()
  {
    return this.this$0.getUseCompatPadding();
  }
  
  public void setCardBackground(Drawable paramDrawable)
  {
    this.mCardBackground = paramDrawable;
    this.this$0.setBackgroundDrawable(paramDrawable);
  }
  
  public void setMinWidthHeightInternal(int paramInt1, int paramInt2)
  {
    CardView localCardView = this.this$0;
    int i = localCardView.mUserSetMinWidth;
    if (paramInt1 > i)
    {
      localCardView = this.this$0;
      CardView.access$101(localCardView, paramInt1);
    }
    localCardView = this.this$0;
    i = localCardView.mUserSetMinHeight;
    if (paramInt2 > i)
    {
      localCardView = this.this$0;
      CardView.access$201(localCardView, paramInt2);
    }
  }
  
  public void setShadowPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.this$0.mShadowBounds.set(paramInt1, paramInt2, paramInt3, paramInt4);
    CardView localCardView = this.this$0;
    int i = this.this$0.mContentPadding.left + paramInt1;
    int j = this.this$0.mContentPadding.top + paramInt2;
    int k = this.this$0.mContentPadding.right + paramInt3;
    int m = this.this$0.mContentPadding.bottom + paramInt4;
    CardView.access$001(localCardView, i, j, k, m);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\CardView$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */