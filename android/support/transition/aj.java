package android.support.transition;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

class aj
  implements al
{
  protected aj.a a;
  
  aj(Context paramContext, ViewGroup paramViewGroup, View paramView)
  {
    aj.a locala = new android/support/transition/aj$a;
    locala.<init>(paramContext, paramViewGroup, paramView, this);
    this.a = locala;
  }
  
  static ViewGroup c(View paramView)
  {
    Object localObject = paramView;
    boolean bool;
    if (localObject != null)
    {
      int i = ((View)localObject).getId();
      int j = 16908290;
      if (i == j)
      {
        bool = localObject instanceof ViewGroup;
        if (!bool) {}
      }
    }
    for (localObject = (ViewGroup)localObject;; localObject = null)
    {
      return (ViewGroup)localObject;
      ViewParent localViewParent = ((View)localObject).getParent();
      bool = localViewParent instanceof ViewGroup;
      if (!bool) {
        break;
      }
      localObject = (ViewGroup)((View)localObject).getParent();
      break;
    }
  }
  
  static aj d(View paramView)
  {
    ViewGroup localViewGroup = c(paramView);
    int j;
    Object localObject;
    int k;
    Context localContext;
    if (localViewGroup != null)
    {
      int i = localViewGroup.getChildCount();
      j = 0;
      localObject = null;
      k = 0;
      localContext = null;
      if (k < i)
      {
        localObject = localViewGroup.getChildAt(k);
        boolean bool = localObject instanceof aj.a;
        if (bool) {
          localObject = ((aj.a)localObject).e;
        }
      }
    }
    for (;;)
    {
      return (aj)localObject;
      j = k + 1;
      k = j;
      break;
      localObject = new android/support/transition/ac;
      localContext = localViewGroup.getContext();
      ((ac)localObject).<init>(localContext, localViewGroup, paramView);
      continue;
      j = 0;
      localObject = null;
    }
  }
  
  public void a(Drawable paramDrawable)
  {
    this.a.a(paramDrawable);
  }
  
  public void b(Drawable paramDrawable)
  {
    this.a.b(paramDrawable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\aj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */