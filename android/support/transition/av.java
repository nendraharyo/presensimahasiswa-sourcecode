package android.support.transition;

import android.view.View;
import android.view.WindowId;

class av
  implements aw
{
  private final WindowId a;
  
  av(View paramView)
  {
    WindowId localWindowId = paramView.getWindowId();
    this.a = localWindowId;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof av;
    WindowId localWindowId1;
    if (bool)
    {
      paramObject = (av)paramObject;
      localWindowId1 = ((av)paramObject).a;
      WindowId localWindowId2 = this.a;
      bool = localWindowId1.equals(localWindowId2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localWindowId1 = null;
    }
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\av.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */