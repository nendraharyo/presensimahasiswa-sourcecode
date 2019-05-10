package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class ad
  implements ae
{
  private final ViewGroupOverlay a;
  
  ad(ViewGroup paramViewGroup)
  {
    ViewGroupOverlay localViewGroupOverlay = paramViewGroup.getOverlay();
    this.a = localViewGroupOverlay;
  }
  
  public void a(Drawable paramDrawable)
  {
    this.a.add(paramDrawable);
  }
  
  public void a(View paramView)
  {
    this.a.add(paramView);
  }
  
  public void b(Drawable paramDrawable)
  {
    this.a.remove(paramDrawable);
  }
  
  public void b(View paramView)
  {
    this.a.remove(paramView);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\ad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */