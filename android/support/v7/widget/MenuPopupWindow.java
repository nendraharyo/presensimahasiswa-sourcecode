package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.view.menu.MenuBuilder;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class MenuPopupWindow
  extends ListPopupWindow
  implements MenuItemHoverListener
{
  private static final String TAG = "MenuPopupWindow";
  private static Method sSetTouchModalMethod;
  private MenuItemHoverListener mHoverListener;
  
  static
  {
    Object localObject = PopupWindow.class;
    String str2 = "setTouchModal";
    int i = 1;
    try
    {
      Class[] arrayOfClass = new Class[i];
      Class localClass = Boolean.TYPE;
      arrayOfClass[0] = localClass;
      localObject = ((Class)localObject).getDeclaredMethod(str2, arrayOfClass);
      sSetTouchModalMethod = (Method)localObject;
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        String str1 = "MenuPopupWindow";
        str2 = "Could not find method setTouchModal() on PopupWindow. Oh well.";
        Log.i(str1, str2);
      }
    }
  }
  
  public MenuPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  DropDownListView createDropDownListView(Context paramContext, boolean paramBoolean)
  {
    MenuPopupWindow.MenuDropDownListView localMenuDropDownListView = new android/support/v7/widget/MenuPopupWindow$MenuDropDownListView;
    localMenuDropDownListView.<init>(paramContext, paramBoolean);
    localMenuDropDownListView.setHoverListener(this);
    return localMenuDropDownListView;
  }
  
  public void onItemHoverEnter(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    MenuItemHoverListener localMenuItemHoverListener = this.mHoverListener;
    if (localMenuItemHoverListener != null)
    {
      localMenuItemHoverListener = this.mHoverListener;
      localMenuItemHoverListener.onItemHoverEnter(paramMenuBuilder, paramMenuItem);
    }
  }
  
  public void onItemHoverExit(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    MenuItemHoverListener localMenuItemHoverListener = this.mHoverListener;
    if (localMenuItemHoverListener != null)
    {
      localMenuItemHoverListener = this.mHoverListener;
      localMenuItemHoverListener.onItemHoverExit(paramMenuBuilder, paramMenuItem);
    }
  }
  
  public void setEnterTransition(Object paramObject)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j)
    {
      PopupWindow localPopupWindow = this.mPopup;
      paramObject = (Transition)paramObject;
      localPopupWindow.setEnterTransition((Transition)paramObject);
    }
  }
  
  public void setExitTransition(Object paramObject)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    if (i >= j)
    {
      PopupWindow localPopupWindow = this.mPopup;
      paramObject = (Transition)paramObject;
      localPopupWindow.setExitTransition((Transition)paramObject);
    }
  }
  
  public void setHoverListener(MenuItemHoverListener paramMenuItemHoverListener)
  {
    this.mHoverListener = paramMenuItemHoverListener;
  }
  
  public void setTouchModal(boolean paramBoolean)
  {
    Method localMethod = sSetTouchModalMethod;
    if (localMethod != null) {}
    try
    {
      localMethod = sSetTouchModalMethod;
      localObject = this.mPopup;
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      Boolean localBoolean = Boolean.valueOf(paramBoolean);
      arrayOfObject[0] = localBoolean;
      localMethod.invoke(localObject, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = "MenuPopupWindow";
        Object localObject = "Could not invoke setTouchModal() on PopupWindow. Oh well.";
        Log.i(str, (String)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\MenuPopupWindow.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */