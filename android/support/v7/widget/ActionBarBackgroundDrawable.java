package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class ActionBarBackgroundDrawable
  extends Drawable
{
  final ActionBarContainer mContainer;
  
  public ActionBarBackgroundDrawable(ActionBarContainer paramActionBarContainer)
  {
    this.mContainer = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject = this.mContainer;
    boolean bool = ((ActionBarContainer)localObject).mIsSplit;
    if (bool)
    {
      localObject = this.mContainer.mSplitBackground;
      if (localObject != null)
      {
        localObject = this.mContainer.mSplitBackground;
        ((Drawable)localObject).draw(paramCanvas);
      }
    }
    for (;;)
    {
      return;
      localObject = this.mContainer.mBackground;
      if (localObject != null)
      {
        localObject = this.mContainer.mBackground;
        ((Drawable)localObject).draw(paramCanvas);
      }
      localObject = this.mContainer.mStackedBackground;
      if (localObject != null)
      {
        localObject = this.mContainer;
        bool = ((ActionBarContainer)localObject).mIsStacked;
        if (bool)
        {
          localObject = this.mContainer.mStackedBackground;
          ((Drawable)localObject).draw(paramCanvas);
        }
      }
    }
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionBarBackgroundDrawable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */