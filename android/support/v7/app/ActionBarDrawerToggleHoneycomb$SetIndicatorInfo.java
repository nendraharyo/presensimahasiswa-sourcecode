package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb$SetIndicatorInfo
{
  public Method setHomeActionContentDescription;
  public Method setHomeAsUpIndicator;
  public ImageView upIndicatorView;
  
  ActionBarDrawerToggleHoneycomb$SetIndicatorInfo(Activity paramActivity)
  {
    Object localObject1 = ActionBar.class;
    Object localObject3 = "setHomeAsUpIndicator";
    int k = 1;
    Object localObject2;
    try
    {
      Class[] arrayOfClass = new Class[k];
      Class localClass = Drawable.class;
      arrayOfClass[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject3, arrayOfClass);
      this.setHomeAsUpIndicator = ((Method)localObject1);
      localObject1 = ActionBar.class;
      localObject3 = "setHomeActionContentDescription";
      k = 1;
      arrayOfClass = new Class[k];
      localClass = Integer.TYPE;
      arrayOfClass[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject3, arrayOfClass);
      this.setHomeActionContentDescription = ((Method)localObject1);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      int m;
      do
      {
        do
        {
          localObject2 = paramActivity.findViewById(i);
        } while (localObject2 == null);
        localObject2 = (ViewGroup)((View)localObject2).getParent();
        m = ((ViewGroup)localObject2).getChildCount();
        k = 2;
      } while (m != k);
      localObject3 = ((ViewGroup)localObject2).getChildAt(0);
      localObject2 = ((ViewGroup)localObject2).getChildAt(j);
      k = ((View)localObject3).getId();
      if (k != i) {}
    }
    for (;;)
    {
      boolean bool = localObject2 instanceof ImageView;
      if (!bool) {
        break;
      }
      localObject2 = (ImageView)localObject2;
      this.upIndicatorView = ((ImageView)localObject2);
      break;
      localObject2 = localObject3;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\ActionBarDrawerToggleHoneycomb$SetIndicatorInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */