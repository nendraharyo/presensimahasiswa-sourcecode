package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

class ForwardingListener$DisallowIntercept
  implements Runnable
{
  ForwardingListener$DisallowIntercept(ForwardingListener paramForwardingListener) {}
  
  public void run()
  {
    ViewParent localViewParent = this.this$0.mSrc.getParent();
    if (localViewParent != null)
    {
      boolean bool = true;
      localViewParent.requestDisallowInterceptTouchEvent(bool);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ForwardingListener$DisallowIntercept.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */