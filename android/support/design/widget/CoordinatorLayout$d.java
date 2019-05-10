package android.support.design.widget;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

class CoordinatorLayout$d
  implements ViewGroup.OnHierarchyChangeListener
{
  CoordinatorLayout$d(CoordinatorLayout paramCoordinatorLayout) {}
  
  public void onChildViewAdded(View paramView1, View paramView2)
  {
    ViewGroup.OnHierarchyChangeListener localOnHierarchyChangeListener = this.a.e;
    if (localOnHierarchyChangeListener != null)
    {
      localOnHierarchyChangeListener = this.a.e;
      localOnHierarchyChangeListener.onChildViewAdded(paramView1, paramView2);
    }
  }
  
  public void onChildViewRemoved(View paramView1, View paramView2)
  {
    Object localObject = this.a;
    int i = 2;
    ((CoordinatorLayout)localObject).a(i);
    localObject = this.a.e;
    if (localObject != null)
    {
      localObject = this.a.e;
      ((ViewGroup.OnHierarchyChangeListener)localObject).onChildViewRemoved(paramView1, paramView2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\CoordinatorLayout$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */