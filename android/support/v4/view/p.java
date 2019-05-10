package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

public final class p
{
  private Object a;
  
  private p(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public static p a(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 24;
    p localp;
    PointerIcon localPointerIcon;
    if (i >= j)
    {
      localp = new android/support/v4/view/p;
      localPointerIcon = PointerIcon.getSystemIcon(paramContext, paramInt);
      localp.<init>(localPointerIcon);
    }
    for (;;)
    {
      return localp;
      localp = new android/support/v4/view/p;
      j = 0;
      localPointerIcon = null;
      localp.<init>(null);
    }
  }
  
  public Object a()
  {
    return this.a;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */