package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;

class g$a
  extends g.b
{
  public void a(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    paramMenuItem.setAlphabeticShortcut(paramChar, paramInt);
  }
  
  public void a(MenuItem paramMenuItem, ColorStateList paramColorStateList)
  {
    paramMenuItem.setIconTintList(paramColorStateList);
  }
  
  public void a(MenuItem paramMenuItem, PorterDuff.Mode paramMode)
  {
    paramMenuItem.setIconTintMode(paramMode);
  }
  
  public void a(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    paramMenuItem.setContentDescription(paramCharSequence);
  }
  
  public void b(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    paramMenuItem.setNumericShortcut(paramChar, paramInt);
  }
  
  public void b(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    paramMenuItem.setTooltipText(paramCharSequence);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\g$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */