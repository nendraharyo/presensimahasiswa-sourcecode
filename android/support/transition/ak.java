package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class ak
  implements al
{
  private final ViewOverlay a;
  
  ak(View paramView)
  {
    ViewOverlay localViewOverlay = paramView.getOverlay();
    this.a = localViewOverlay;
  }
  
  public void a(Drawable paramDrawable)
  {
    this.a.add(paramDrawable);
  }
  
  public void b(Drawable paramDrawable)
  {
    this.a.remove(paramDrawable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\ak.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */