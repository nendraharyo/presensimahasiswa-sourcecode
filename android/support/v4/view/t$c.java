package android.support.v4.view;

import android.support.a.a.a;
import android.view.ViewGroup;

class t$c
{
  public boolean a(ViewGroup paramViewGroup)
  {
    int i = a.a.tag_transition_group;
    Object localObject = (Boolean)paramViewGroup.getTag(i);
    if (localObject != null)
    {
      bool = ((Boolean)localObject).booleanValue();
      if (bool) {}
    }
    else
    {
      localObject = paramViewGroup.getBackground();
      if (localObject == null)
      {
        localObject = r.m(paramViewGroup);
        if (localObject == null) {
          break label48;
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label48:
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\t$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */