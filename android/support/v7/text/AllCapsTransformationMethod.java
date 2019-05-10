package android.support.v7.text;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public class AllCapsTransformationMethod
  implements TransformationMethod
{
  private Locale mLocale;
  
  public AllCapsTransformationMethod(Context paramContext)
  {
    Locale localLocale = paramContext.getResources().getConfiguration().locale;
    this.mLocale = localLocale;
  }
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    Locale localLocale;
    if (paramCharSequence != null)
    {
      str = paramCharSequence.toString();
      localLocale = this.mLocale;
    }
    for (String str = str.toUpperCase(localLocale);; str = null) {
      return str;
    }
  }
  
  public void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\text\AllCapsTransformationMethod.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */