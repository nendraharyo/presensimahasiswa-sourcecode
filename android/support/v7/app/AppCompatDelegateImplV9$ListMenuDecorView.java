package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

class AppCompatDelegateImplV9$ListMenuDecorView
  extends ContentFrameLayout
{
  public AppCompatDelegateImplV9$ListMenuDecorView(AppCompatDelegateImplV9 paramAppCompatDelegateImplV9, Context paramContext)
  {
    super(paramContext);
  }
  
  private boolean isOutOfBounds(int paramInt1, int paramInt2)
  {
    int i = -5;
    if ((paramInt1 >= i) && (paramInt2 >= i))
    {
      i = getWidth() + 5;
      if (paramInt1 <= i)
      {
        i = getHeight() + 5;
        if (paramInt2 <= i) {
          break label41;
        }
      }
    }
    label41:
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppCompatDelegateImplV9 localAppCompatDelegateImplV9 = this.this$0;
    boolean bool = localAppCompatDelegateImplV9.dispatchKeyEvent(paramKeyEvent);
    if (!bool)
    {
      bool = super.dispatchKeyEvent(paramKeyEvent);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAppCompatDelegateImplV9 = null;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    boolean bool;
    if (i == 0)
    {
      float f1 = paramMotionEvent.getX();
      i = (int)f1;
      float f2 = paramMotionEvent.getY();
      int j = (int)f2;
      bool = isOutOfBounds(i, j);
      if (bool)
      {
        AppCompatDelegateImplV9 localAppCompatDelegateImplV9 = this.this$0;
        j = 0;
        f2 = 0.0F;
        localAppCompatDelegateImplV9.closePanel(0);
        bool = true;
        f1 = Float.MIN_VALUE;
      }
    }
    for (;;)
    {
      return bool;
      bool = super.onInterceptTouchEvent(paramMotionEvent);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);
    setBackgroundDrawable(localDrawable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$ListMenuDecorView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */