package android.support.v7.view;

import android.support.v4.view.w;
import android.support.v4.view.x;
import android.view.View;
import java.util.ArrayList;

class ViewPropertyAnimatorCompatSet$1
  extends x
{
  private int mProxyEndCount = 0;
  private boolean mProxyStarted = false;
  
  ViewPropertyAnimatorCompatSet$1(ViewPropertyAnimatorCompatSet paramViewPropertyAnimatorCompatSet) {}
  
  public void onAnimationEnd(View paramView)
  {
    int i = this.mProxyEndCount + 1;
    this.mProxyEndCount = i;
    ArrayList localArrayList = this.this$0.mAnimators;
    int j = localArrayList.size();
    if (i == j)
    {
      w localw = this.this$0.mListener;
      if (localw != null)
      {
        localw = this.this$0.mListener;
        j = 0;
        localArrayList = null;
        localw.onAnimationEnd(null);
      }
      onEnd();
    }
  }
  
  public void onAnimationStart(View paramView)
  {
    boolean bool = this.mProxyStarted;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      this.mProxyStarted = bool;
      w localw = this.this$0.mListener;
      if (localw != null)
      {
        localw = this.this$0.mListener;
        localw.onAnimationStart(null);
      }
    }
  }
  
  void onEnd()
  {
    this.mProxyEndCount = 0;
    this.mProxyStarted = false;
    this.this$0.onAnimationsEnded();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\ViewPropertyAnimatorCompatSet$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */