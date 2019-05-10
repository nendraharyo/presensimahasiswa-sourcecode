package android.support.v7.app;

import android.support.v4.view.r;
import android.support.v4.view.x;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;

class WindowDecorActionBar$1
  extends x
{
  WindowDecorActionBar$1(WindowDecorActionBar paramWindowDecorActionBar) {}
  
  public void onAnimationEnd(View paramView)
  {
    Object localObject = this.this$0;
    boolean bool = ((WindowDecorActionBar)localObject).mContentAnimations;
    if (bool)
    {
      localObject = this.this$0.mContentView;
      if (localObject != null)
      {
        this.this$0.mContentView.setTranslationY(0.0F);
        localObject = this.this$0.mContainerView;
        ((ActionBarContainer)localObject).setTranslationY(0.0F);
      }
    }
    this.this$0.mContainerView.setVisibility(8);
    this.this$0.mContainerView.setTransitioning(false);
    this.this$0.mCurrentShowAnim = null;
    this.this$0.completeDeferredDestroyActionMode();
    localObject = this.this$0.mOverlayLayout;
    if (localObject != null)
    {
      localObject = this.this$0.mOverlayLayout;
      r.o((View)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\WindowDecorActionBar$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */