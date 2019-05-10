package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.widget.ListView;

public class AlertController$RecycleListView
  extends ListView
{
  private final int mPaddingBottomNoButtons;
  private final int mPaddingTopNoTitle;
  
  public AlertController$RecycleListView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AlertController$RecycleListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = R.styleable.RecycleListView;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int j = R.styleable.RecycleListView_paddingBottomNoButtons;
    j = ((TypedArray)localObject).getDimensionPixelOffset(j, i);
    this.mPaddingBottomNoButtons = j;
    j = R.styleable.RecycleListView_paddingTopNoTitle;
    int k = ((TypedArray)localObject).getDimensionPixelOffset(j, i);
    this.mPaddingTopNoTitle = k;
  }
  
  public void setHasDecor(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    int j;
    int k;
    if ((!paramBoolean2) || (!paramBoolean1))
    {
      i = getPaddingLeft();
      if (!paramBoolean1) {
        break label51;
      }
      j = getPaddingTop();
      k = getPaddingRight();
      if (!paramBoolean2) {
        break label60;
      }
    }
    label51:
    label60:
    for (int m = getPaddingBottom();; m = this.mPaddingBottomNoButtons)
    {
      setPadding(i, j, k, m);
      return;
      j = this.mPaddingTopNoTitle;
      break;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController$RecycleListView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */