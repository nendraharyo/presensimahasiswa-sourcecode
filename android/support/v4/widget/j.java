package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.ListView;

public final class j
{
  public static void a(ListView paramListView, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    if (i >= j) {
      paramListView.scrollListBy(paramInt);
    }
    for (;;)
    {
      return;
      i = paramListView.getFirstVisiblePosition();
      j = -1;
      if (i != j)
      {
        j = 0;
        View localView = paramListView.getChildAt(0);
        if (localView != null)
        {
          j = localView.getTop() - paramInt;
          paramListView.setSelectionFromTop(i, j);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */