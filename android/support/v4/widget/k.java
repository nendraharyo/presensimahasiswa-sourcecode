package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;

public final class k
{
  static final k.d a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 23;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/widget/k$c;
      ((k.c)localObject).<init>();
      a = (k.d)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 21;
      if (i >= j)
      {
        localObject = new android/support/v4/widget/k$b;
        ((k.b)localObject).<init>();
        a = (k.d)localObject;
      }
      else
      {
        i = Build.VERSION.SDK_INT;
        j = 19;
        if (i >= j)
        {
          localObject = new android/support/v4/widget/k$a;
          ((k.a)localObject).<init>();
          a = (k.d)localObject;
        }
        else
        {
          localObject = new android/support/v4/widget/k$d;
          ((k.d)localObject).<init>();
          a = (k.d)localObject;
        }
      }
    }
  }
  
  public static void a(PopupWindow paramPopupWindow, int paramInt)
  {
    a.a(paramPopupWindow, paramInt);
  }
  
  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    a.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3);
  }
  
  public static void a(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    a.a(paramPopupWindow, paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */