package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public class AppCompatRatingBar
  extends RatingBar
{
  private final AppCompatProgressBarHelper mAppCompatProgressBarHelper;
  
  public AppCompatRatingBar(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatRatingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatRatingBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppCompatProgressBarHelper localAppCompatProgressBarHelper = new android/support/v7/widget/AppCompatProgressBarHelper;
    localAppCompatProgressBarHelper.<init>(this);
    this.mAppCompatProgressBarHelper = localAppCompatProgressBarHelper;
    this.mAppCompatProgressBarHelper.loadFromAttributes(paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      Object localObject1 = this.mAppCompatProgressBarHelper;
      localObject1 = ((AppCompatProgressBarHelper)localObject1).getSampleTime();
      if (localObject1 != null)
      {
        int i = ((Bitmap)localObject1).getWidth();
        int j = getNumStars();
        i *= j;
        j = 0;
        i = View.resolveSizeAndState(i, paramInt1, 0);
        j = getMeasuredHeight();
        setMeasuredDimension(i, j);
      }
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatRatingBar.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */