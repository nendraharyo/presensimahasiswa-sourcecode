package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.appcompat.R.styleable;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;

public class DialogTitle
  extends TextView
{
  public DialogTitle(Context paramContext)
  {
    super(paramContext);
  }
  
  public DialogTitle(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public DialogTitle(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    Object localObject = getLayout();
    if (localObject != null)
    {
      int i = ((Layout)localObject).getLineCount();
      if (i > 0)
      {
        i += -1;
        int j = ((Layout)localObject).getEllipsisCount(i);
        if (j > 0)
        {
          setSingleLine(false);
          j = 2;
          setMaxLines(j);
          localObject = getContext();
          float f = 0.0F;
          int[] arrayOfInt = R.styleable.TextAppearance;
          int k = 16842817;
          int m = 16973892;
          localObject = ((Context)localObject).obtainStyledAttributes(null, arrayOfInt, k, m);
          i = R.styleable.TextAppearance_android_textSize;
          i = ((TypedArray)localObject).getDimensionPixelSize(i, 0);
          if (i != 0)
          {
            f = i;
            setTextSize(0, f);
          }
          ((TypedArray)localObject).recycle();
          super.onMeasure(paramInt1, paramInt2);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DialogTitle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */