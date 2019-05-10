package android.support.c.a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

class c$1
  implements Drawable.Callback
{
  c$1(c paramc) {}
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    this.a.invalidateSelf();
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    this.a.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    this.a.unscheduleSelf(paramRunnable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\c$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */