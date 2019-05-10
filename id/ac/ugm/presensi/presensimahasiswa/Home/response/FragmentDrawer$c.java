package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

class FragmentDrawer$c
  implements RecyclerView.OnItemTouchListener
{
  private GestureDetector a;
  private FragmentDrawer.a b;
  
  public FragmentDrawer$c(Context paramContext, RecyclerView paramRecyclerView, FragmentDrawer.a parama)
  {
    this.b = parama;
    GestureDetector localGestureDetector = new android/view/GestureDetector;
    FragmentDrawer.c.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/FragmentDrawer$c$1;
    local1.<init>(this, paramRecyclerView, parama);
    localGestureDetector.<init>(paramContext, local1);
    this.a = localGestureDetector;
  }
  
  public boolean onInterceptTouchEvent(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    View localView = paramRecyclerView.findChildViewUnder(f1, f2);
    if (localView != null)
    {
      Object localObject = this.b;
      if (localObject != null)
      {
        localObject = this.a;
        boolean bool = ((GestureDetector)localObject).onTouchEvent(paramMotionEvent);
        if (bool)
        {
          localObject = this.b;
          int i = paramRecyclerView.getChildPosition(localView);
          ((FragmentDrawer.a)localObject).a(localView, i);
        }
      }
    }
    return false;
  }
  
  public void onRequestDisallowInterceptTouchEvent(boolean paramBoolean) {}
  
  public void onTouchEvent(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\FragmentDrawer$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */