package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

public class i
  extends a
{
  private final ListView f;
  
  public i(ListView paramListView)
  {
    super(paramListView);
    this.f = paramListView;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    j.a(this.f, paramInt2);
  }
  
  public boolean e(int paramInt)
  {
    return false;
  }
  
  public boolean f(int paramInt)
  {
    boolean bool = false;
    Object localObject = this.f;
    int i = ((ListView)localObject).getCount();
    if (i == 0) {}
    for (;;)
    {
      return bool;
      int j = ((ListView)localObject).getChildCount();
      int k = ((ListView)localObject).getFirstVisiblePosition();
      int m = k + j;
      int n;
      if (paramInt > 0) {
        if (m >= i)
        {
          i = j + -1;
          View localView = ((ListView)localObject).getChildAt(i);
          i = localView.getBottom();
          n = ((ListView)localObject).getHeight();
          if (i <= n) {
            continue;
          }
        }
      }
      do
      {
        do
        {
          bool = true;
          break;
          if (paramInt >= 0) {
            break;
          }
        } while (k > 0);
        localObject = ((ListView)localObject).getChildAt(0);
        n = ((View)localObject).getTop();
      } while (n < 0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */