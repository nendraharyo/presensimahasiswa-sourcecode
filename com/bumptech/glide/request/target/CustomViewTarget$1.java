package com.bumptech.glide.request.target;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

class CustomViewTarget$1
  implements View.OnAttachStateChangeListener
{
  CustomViewTarget$1(CustomViewTarget paramCustomViewTarget) {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    this.this$0.resumeMyRequest();
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    this.this$0.pauseMyRequest();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\CustomViewTarget$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */