package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

class n$b
  extends n.a
{
  public void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    int i = 1;
    int j = paramTextView.getLayoutDirection();
    Drawable localDrawable;
    if (j == i)
    {
      j = i;
      if (j == 0) {
        break label57;
      }
      localDrawable = paramDrawable3;
      label29:
      if (j == 0) {
        break label63;
      }
    }
    for (;;)
    {
      paramTextView.setCompoundDrawables(localDrawable, paramDrawable2, paramDrawable1, paramDrawable4);
      return;
      i = 0;
      localDrawable = null;
      j = 0;
      break;
      label57:
      localDrawable = paramDrawable1;
      break label29;
      label63:
      paramDrawable1 = paramDrawable3;
    }
  }
  
  public Drawable[] a(TextView paramTextView)
  {
    int i = 2;
    int j = 1;
    int k = paramTextView.getLayoutDirection();
    if (k == j) {}
    for (;;)
    {
      Drawable[] arrayOfDrawable = paramTextView.getCompoundDrawables();
      if (j != 0)
      {
        localDrawable1 = arrayOfDrawable[i];
        Drawable localDrawable2 = arrayOfDrawable[0];
        arrayOfDrawable[0] = localDrawable1;
        arrayOfDrawable[i] = localDrawable2;
      }
      return arrayOfDrawable;
      j = 0;
      Drawable localDrawable1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\n$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */