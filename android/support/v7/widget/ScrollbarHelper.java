package android.support.v7.widget;

import android.view.View;

class ScrollbarHelper
{
  static int computeScrollExtent(RecyclerView.State paramState, OrientationHelper paramOrientationHelper, View paramView1, View paramView2, RecyclerView.LayoutManager paramLayoutManager, boolean paramBoolean)
  {
    int i = paramLayoutManager.getChildCount();
    if (i != 0)
    {
      i = paramState.getItemCount();
      if ((i != 0) && (paramView1 != null) && (paramView2 != null)) {}
    }
    else
    {
      i = 0;
    }
    for (;;)
    {
      return i;
      int j;
      if (!paramBoolean)
      {
        i = paramLayoutManager.getPosition(paramView1);
        j = paramLayoutManager.getPosition(paramView2);
        i = Math.abs(i - j) + 1;
      }
      else
      {
        i = paramOrientationHelper.getDecoratedEnd(paramView2);
        j = paramOrientationHelper.getDecoratedStart(paramView1);
        i -= j;
        j = paramOrientationHelper.getTotalSpace();
        i = Math.min(j, i);
      }
    }
  }
  
  static int computeScrollOffset(RecyclerView.State paramState, OrientationHelper paramOrientationHelper, View paramView1, View paramView2, RecyclerView.LayoutManager paramLayoutManager, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    float f1 = 0.0F;
    int j = paramLayoutManager.getChildCount();
    if (j != 0)
    {
      j = paramState.getItemCount();
      if ((j != 0) && (paramView1 != null) && (paramView2 != null)) {
        break label40;
      }
    }
    label40:
    label247:
    for (;;)
    {
      return i;
      j = paramLayoutManager.getPosition(paramView1);
      int k = paramLayoutManager.getPosition(paramView2);
      j = Math.min(j, k);
      k = paramLayoutManager.getPosition(paramView1);
      int m = paramLayoutManager.getPosition(paramView2);
      k = Math.max(k, m);
      if (paramBoolean2) {
        j = paramState.getItemCount() - k + -1;
      }
      for (i = Math.max(0, j);; i = Math.max(0, j))
      {
        if (!paramBoolean1) {
          break label247;
        }
        j = paramOrientationHelper.getDecoratedEnd(paramView2);
        k = paramOrientationHelper.getDecoratedStart(paramView1);
        j = Math.abs(j - k);
        k = paramLayoutManager.getPosition(paramView1);
        m = paramLayoutManager.getPosition(paramView2);
        k = Math.abs(k - m) + 1;
        float f2 = j;
        float f3 = k;
        f2 /= f3;
        f1 = i * f2;
        j = paramOrientationHelper.getStartAfterPadding();
        k = paramOrientationHelper.getDecoratedStart(paramView1);
        j -= k;
        f2 = j;
        f1 += f2;
        i = Math.round(f1);
        break;
      }
    }
  }
  
  static int computeScrollRange(RecyclerView.State paramState, OrientationHelper paramOrientationHelper, View paramView1, View paramView2, RecyclerView.LayoutManager paramLayoutManager, boolean paramBoolean)
  {
    int i = paramLayoutManager.getChildCount();
    float f1;
    if (i != 0)
    {
      i = paramState.getItemCount();
      if ((i != 0) && (paramView1 != null) && (paramView2 != null)) {}
    }
    else
    {
      i = 0;
      f1 = 0.0F;
    }
    for (;;)
    {
      return i;
      if (!paramBoolean)
      {
        i = paramState.getItemCount();
      }
      else
      {
        i = paramOrientationHelper.getDecoratedEnd(paramView2);
        int j = paramOrientationHelper.getDecoratedStart(paramView1);
        i -= j;
        j = paramLayoutManager.getPosition(paramView1);
        int k = paramLayoutManager.getPosition(paramView2);
        j = Math.abs(j - k) + 1;
        f1 = i;
        float f2 = j;
        f1 /= f2;
        j = paramState.getItemCount();
        f2 = j;
        f1 *= f2;
        i = (int)f1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ScrollbarHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */