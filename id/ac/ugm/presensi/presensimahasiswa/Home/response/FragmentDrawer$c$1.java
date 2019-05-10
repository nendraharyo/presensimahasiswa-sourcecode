package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

class FragmentDrawer$c$1
  extends GestureDetector.SimpleOnGestureListener
{
  FragmentDrawer$c$1(FragmentDrawer.c paramc, RecyclerView paramRecyclerView, FragmentDrawer.a parama) {}
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    Object localObject = this.a;
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    localObject = ((RecyclerView)localObject).findChildViewUnder(f1, f2);
    if (localObject != null)
    {
      FragmentDrawer.a locala = this.b;
      if (locala != null)
      {
        locala = this.b;
        RecyclerView localRecyclerView = this.a;
        int i = localRecyclerView.getChildPosition((View)localObject);
        locala.b((View)localObject, i);
      }
    }
  }
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\FragmentDrawer$c$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */