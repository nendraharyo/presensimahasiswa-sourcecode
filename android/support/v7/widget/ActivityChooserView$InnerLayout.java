package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ActivityChooserView$InnerLayout
  extends LinearLayout
{
  private static final int[] TINT_ATTRS;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16842964;
    TINT_ATTRS = arrayOfInt;
  }
  
  public ActivityChooserView$InnerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = TINT_ATTRS;
    localObject = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject);
    Drawable localDrawable = ((TintTypedArray)localObject).getDrawable(0);
    setBackgroundDrawable(localDrawable);
    ((TintTypedArray)localObject).recycle();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserView$InnerLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */