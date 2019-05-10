package android.support.design.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout
  extends ViewGroup
{
  private int a = -1;
  
  public BaselineLayout(Context paramContext)
  {
    super(paramContext, null, 0);
  }
  
  public BaselineLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public BaselineLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public int getBaseline()
  {
    return this.a;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    int j = getPaddingLeft();
    int k = paramInt3 - paramInt1;
    int m = getPaddingRight();
    int n = k - m - j;
    m = getPaddingTop();
    k = 0;
    int i1 = 0;
    while (i1 < i)
    {
      View localView = getChildAt(i1);
      k = localView.getVisibility();
      int i2 = 8;
      if (k == i2)
      {
        k = i1 + 1;
        i1 = k;
      }
      else
      {
        i2 = localView.getMeasuredWidth();
        int i3 = localView.getMeasuredHeight();
        k = (n - i2) / 2;
        int i4 = j + k;
        k = this.a;
        int i5 = -1;
        if (k != i5)
        {
          k = localView.getBaseline();
          i5 = -1;
          if (k != i5)
          {
            k = this.a + m;
            i5 = localView.getBaseline();
            k -= i5;
          }
        }
        for (;;)
        {
          i2 += i4;
          i3 += k;
          localView.layout(i4, k, i2, i3);
          break;
          k = m;
        }
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = -1;
    int j = getChildCount();
    int k = 0;
    int m = 0;
    int n = i;
    int i1 = 0;
    int i2 = 0;
    int i3 = i;
    if (k < j)
    {
      View localView = getChildAt(k);
      int i4 = localView.getVisibility();
      int i5 = 8;
      int i6;
      if (i4 == i5)
      {
        i6 = m;
        m = n;
        n = i3;
      }
      for (i3 = i6;; i3 = i6)
      {
        k += 1;
        i6 = i3;
        i3 = n;
        n = m;
        m = i6;
        break;
        measureChild(localView, paramInt1, paramInt2);
        i4 = localView.getBaseline();
        if (i4 != i)
        {
          n = Math.max(n, i4);
          i5 = localView.getMeasuredHeight();
          i4 = i5 - i4;
          i3 = Math.max(i3, i4);
        }
        i4 = localView.getMeasuredWidth();
        i2 = Math.max(i2, i4);
        i4 = localView.getMeasuredHeight();
        i1 = Math.max(i1, i4);
        int i7 = localView.getMeasuredState();
        i6 = View.combineMeasuredStates(m, i7);
        m = n;
        n = i3;
      }
    }
    if (n != i)
    {
      k = getPaddingBottom();
      i3 = Math.max(i3, k) + n;
      i1 = Math.max(i1, i3);
      this.a = n;
    }
    i3 = getSuggestedMinimumHeight();
    i3 = Math.max(i1, i3);
    n = getSuggestedMinimumWidth();
    n = View.resolveSizeAndState(Math.max(i2, n), paramInt1, m);
    m <<= 16;
    i3 = View.resolveSizeAndState(i3, paramInt2, m);
    setMeasuredDimension(n, i3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\internal\BaselineLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */