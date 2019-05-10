package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;

class h$a
  implements h.b
{
  public ColorStateList a(ImageView paramImageView)
  {
    boolean bool = paramImageView instanceof p;
    if (bool) {
      paramImageView = (p)paramImageView;
    }
    for (ColorStateList localColorStateList = paramImageView.getSupportImageTintList();; localColorStateList = null)
    {
      return localColorStateList;
      bool = false;
    }
  }
  
  public void a(ImageView paramImageView, ColorStateList paramColorStateList)
  {
    boolean bool = paramImageView instanceof p;
    if (bool)
    {
      paramImageView = (p)paramImageView;
      paramImageView.setSupportImageTintList(paramColorStateList);
    }
  }
  
  public void a(ImageView paramImageView, PorterDuff.Mode paramMode)
  {
    boolean bool = paramImageView instanceof p;
    if (bool)
    {
      paramImageView = (p)paramImageView;
      paramImageView.setSupportImageTintMode(paramMode);
    }
  }
  
  public PorterDuff.Mode b(ImageView paramImageView)
  {
    boolean bool = paramImageView instanceof p;
    if (bool) {
      paramImageView = (p)paramImageView;
    }
    for (PorterDuff.Mode localMode = paramImageView.getSupportImageTintMode();; localMode = null)
    {
      return localMode;
      bool = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\h$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */