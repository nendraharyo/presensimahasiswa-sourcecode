package android.support.v7.widget;

import android.os.Build.VERSION;
import android.view.View;

public class TooltipCompat
{
  public static void setTooltipText(View paramView, CharSequence paramCharSequence)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 26;
    if (i >= j) {
      paramView.setTooltipText(paramCharSequence);
    }
    for (;;)
    {
      return;
      TooltipCompatHandler.setTooltipText(paramView, paramCharSequence);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\TooltipCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */