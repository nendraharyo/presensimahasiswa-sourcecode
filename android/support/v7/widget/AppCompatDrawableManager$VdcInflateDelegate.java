package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.c.a.i;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

class AppCompatDrawableManager$VdcInflateDelegate
  implements AppCompatDrawableManager.InflateDelegate
{
  public Drawable createFromXmlInner(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    try
    {
      localObject1 = paramContext.getResources();
      localObject1 = i.a((Resources)localObject1, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        String str1 = "VdcInflateDelegate";
        String str2 = "Exception while inflating <vector>";
        Log.e(str1, str2, localException);
        Object localObject2 = null;
      }
    }
    return (Drawable)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatDrawableManager$VdcInflateDelegate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */