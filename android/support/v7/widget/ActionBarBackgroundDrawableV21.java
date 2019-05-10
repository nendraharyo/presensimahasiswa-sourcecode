package android.support.v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

class ActionBarBackgroundDrawableV21
  extends ActionBarBackgroundDrawable
{
  public ActionBarBackgroundDrawableV21(ActionBarContainer paramActionBarContainer)
  {
    super(paramActionBarContainer);
  }
  
  public void getOutline(Outline paramOutline)
  {
    Object localObject = this.mContainer;
    boolean bool = ((ActionBarContainer)localObject).mIsSplit;
    if (bool)
    {
      localObject = this.mContainer.mSplitBackground;
      if (localObject != null)
      {
        localObject = this.mContainer.mSplitBackground;
        ((Drawable)localObject).getOutline(paramOutline);
      }
    }
    for (;;)
    {
      return;
      localObject = this.mContainer.mBackground;
      if (localObject != null)
      {
        localObject = this.mContainer.mBackground;
        ((Drawable)localObject).getOutline(paramOutline);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionBarBackgroundDrawableV21.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */