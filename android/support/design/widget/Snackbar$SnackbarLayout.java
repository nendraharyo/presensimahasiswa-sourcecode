package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;

public final class Snackbar$SnackbarLayout
  extends b.f
{
  public Snackbar$SnackbarLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public Snackbar$SnackbarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1073741824;
    super.onMeasure(paramInt1, paramInt2);
    int j = getChildCount();
    int k = getMeasuredWidth();
    int m = getPaddingLeft();
    k -= m;
    m = getPaddingRight();
    m = k - m;
    k = 0;
    while (k < j)
    {
      View localView = getChildAt(k);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      int n = localLayoutParams.width;
      int i1 = -1;
      if (n == i1)
      {
        n = View.MeasureSpec.makeMeasureSpec(m, i);
        i1 = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), i);
        localView.measure(n, i1);
      }
      k += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\Snackbar$SnackbarLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */