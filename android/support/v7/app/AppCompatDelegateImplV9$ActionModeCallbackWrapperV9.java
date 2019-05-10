package android.support.v7.app;

import android.support.v4.view.r;
import android.support.v4.view.v;
import android.support.v4.view.w;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

class AppCompatDelegateImplV9$ActionModeCallbackWrapperV9
  implements ActionMode.Callback
{
  private ActionMode.Callback mWrapped;
  
  public AppCompatDelegateImplV9$ActionModeCallbackWrapperV9(AppCompatDelegateImplV9 paramAppCompatDelegateImplV9, ActionMode.Callback paramCallback)
  {
    this.mWrapped = paramCallback;
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return this.mWrapped.onActionItemClicked(paramActionMode, paramMenuItem);
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return this.mWrapped.onCreateActionMode(paramActionMode, paramMenu);
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode)
  {
    this.mWrapped.onDestroyActionMode(paramActionMode);
    Object localObject1 = this.this$0.mActionModePopup;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.this$0.mWindow.getDecorView();
      localObject2 = this.this$0.mShowActionModePopup;
      ((View)localObject1).removeCallbacks((Runnable)localObject2);
    }
    localObject1 = this.this$0.mActionModeView;
    if (localObject1 != null)
    {
      this.this$0.endOnGoingFadeAnimation();
      localObject1 = this.this$0;
      localObject2 = r.k(this.this$0.mActionModeView).a(0.0F);
      ((AppCompatDelegateImplV9)localObject1).mFadeAnim = ((v)localObject2);
      localObject1 = this.this$0.mFadeAnim;
      localObject2 = new android/support/v7/app/AppCompatDelegateImplV9$ActionModeCallbackWrapperV9$1;
      ((AppCompatDelegateImplV9.ActionModeCallbackWrapperV9.1)localObject2).<init>(this);
      ((v)localObject1).a((w)localObject2);
    }
    localObject1 = this.this$0.mAppCompatCallback;
    if (localObject1 != null)
    {
      localObject1 = this.this$0.mAppCompatCallback;
      localObject2 = this.this$0.mActionMode;
      ((AppCompatCallback)localObject1).onSupportActionModeFinished((ActionMode)localObject2);
    }
    this.this$0.mActionMode = null;
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return this.mWrapped.onPrepareActionMode(paramActionMode, paramMenu);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */