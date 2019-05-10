package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

class h$c
  extends h.a
{
  public ColorStateList a(ImageView paramImageView)
  {
    return paramImageView.getImageTintList();
  }
  
  public void a(ImageView paramImageView, ColorStateList paramColorStateList)
  {
    paramImageView.setImageTintList(paramColorStateList);
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Drawable localDrawable;
    Object localObject;
    if (i == j)
    {
      localDrawable = paramImageView.getDrawable();
      localObject = paramImageView.getImageTintList();
      if (localObject == null) {
        break label89;
      }
      localObject = paramImageView.getImageTintMode();
      if (localObject == null) {
        break label89;
      }
      i = 1;
    }
    for (;;)
    {
      if ((localDrawable != null) && (i != 0))
      {
        bool = localDrawable.isStateful();
        if (bool)
        {
          localObject = paramImageView.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
        paramImageView.setImageDrawable(localDrawable);
      }
      return;
      label89:
      boolean bool = false;
      localObject = null;
    }
  }
  
  public void a(ImageView paramImageView, PorterDuff.Mode paramMode)
  {
    paramImageView.setImageTintMode(paramMode);
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Drawable localDrawable;
    Object localObject;
    if (i == j)
    {
      localDrawable = paramImageView.getDrawable();
      localObject = paramImageView.getImageTintList();
      if (localObject == null) {
        break label89;
      }
      localObject = paramImageView.getImageTintMode();
      if (localObject == null) {
        break label89;
      }
      i = 1;
    }
    for (;;)
    {
      if ((localDrawable != null) && (i != 0))
      {
        bool = localDrawable.isStateful();
        if (bool)
        {
          localObject = paramImageView.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
        paramImageView.setImageDrawable(localDrawable);
      }
      return;
      label89:
      boolean bool = false;
      localObject = null;
    }
  }
  
  public PorterDuff.Mode b(ImageView paramImageView)
  {
    return paramImageView.getImageTintMode();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\h$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */