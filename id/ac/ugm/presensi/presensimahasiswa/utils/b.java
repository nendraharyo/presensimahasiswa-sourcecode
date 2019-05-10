package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.target.ImageViewTarget;

public class b
  extends ImageViewTarget
{
  private int a = -1;
  
  public b(ImageView paramImageView, int paramInt)
  {
    super(paramImageView);
    this.a = paramInt;
  }
  
  protected void a(Drawable paramDrawable)
  {
    boolean bool = paramDrawable instanceof GifDrawable;
    if (bool)
    {
      Object localObject = paramDrawable;
      localObject = (GifDrawable)paramDrawable;
      int i = this.a;
      ((GifDrawable)localObject).setLoopCount(i);
    }
    ((ImageView)this.view).setImageDrawable((Drawable)paramDrawable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */