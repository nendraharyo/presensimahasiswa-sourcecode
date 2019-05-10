package android.support.v4.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

class n$g
{
  public void a(TextView paramTextView, int paramInt)
  {
    Context localContext = paramTextView.getContext();
    paramTextView.setTextAppearance(localContext, paramInt);
  }
  
  public void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    paramTextView.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public Drawable[] a(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawables();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\n$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */