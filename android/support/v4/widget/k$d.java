package android.support.v4.widget;

import android.support.v4.view.d;
import android.support.v4.view.r;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

class k$d
{
  private static Method a;
  private static boolean b;
  
  public void a(PopupWindow paramPopupWindow, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = b;
    Object localObject2;
    int i;
    if (!bool2)
    {
      localObject1 = PopupWindow.class;
      localObject2 = "setWindowLayoutType";
      i = 1;
    }
    try
    {
      arrayOfClass = new Class[i];
      localInteger = null;
      Class localClass = Integer.TYPE;
      arrayOfClass[0] = localClass;
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      a = (Method)localObject1;
      localObject1 = a;
      bool3 = true;
      ((Method)localObject1).setAccessible(bool3);
    }
    catch (Exception localException2)
    {
      Class[] arrayOfClass;
      Integer localInteger;
      boolean bool3;
      for (;;) {}
    }
    b = bool1;
    Object localObject1 = a;
    if (localObject1 != null) {}
    try
    {
      localObject1 = a;
      bool3 = true;
      localObject2 = new Object[bool3];
      i = 0;
      arrayOfClass = null;
      localInteger = Integer.valueOf(paramInt);
      localObject2[0] = localInteger;
      ((Method)localObject1).invoke(paramPopupWindow, (Object[])localObject2);
      return;
    }
    catch (Exception localException1)
    {
      for (;;) {}
    }
  }
  
  public void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = r.e(paramView);
    i = d.a(paramInt3, i) & 0x7;
    int j = 5;
    if (i == j)
    {
      i = paramPopupWindow.getWidth();
      j = paramView.getWidth();
      i -= j;
      paramInt1 -= i;
    }
    paramPopupWindow.showAsDropDown(paramView, paramInt1, paramInt2);
  }
  
  public void a(PopupWindow paramPopupWindow, boolean paramBoolean) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\k$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */