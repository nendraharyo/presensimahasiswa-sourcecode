package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.k;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

class AppCompatPopupWindow
  extends PopupWindow
{
  private static final boolean COMPAT_OVERLAP_ANCHOR;
  private boolean mOverlapAnchor;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i < j) {}
    for (i = 1;; i = 0)
    {
      COMPAT_OVERLAP_ANCHOR = i;
      return;
    }
  }
  
  public AppCompatPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public AppCompatPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private void init(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    Object localObject = R.styleable.PopupWindow;
    localObject = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject, paramInt1, paramInt2);
    int i = R.styleable.PopupWindow_overlapAnchor;
    boolean bool1 = ((TintTypedArray)localObject).hasValue(i);
    if (bool1)
    {
      int j = R.styleable.PopupWindow_overlapAnchor;
      boolean bool2 = ((TintTypedArray)localObject).getBoolean(j, false);
      setSupportOverlapAnchor(bool2);
    }
    int k = R.styleable.PopupWindow_android_popupBackground;
    Drawable localDrawable = ((TintTypedArray)localObject).getDrawable(k);
    setBackgroundDrawable(localDrawable);
    ((TintTypedArray)localObject).recycle();
  }
  
  private void setSupportOverlapAnchor(boolean paramBoolean)
  {
    boolean bool = COMPAT_OVERLAP_ANCHOR;
    if (bool) {
      this.mOverlapAnchor = paramBoolean;
    }
    for (;;)
    {
      return;
      k.a(this, paramBoolean);
    }
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    boolean bool = COMPAT_OVERLAP_ANCHOR;
    if (bool)
    {
      bool = this.mOverlapAnchor;
      if (bool)
      {
        int i = paramView.getHeight();
        paramInt2 -= i;
      }
    }
    super.showAsDropDown(paramView, paramInt1, paramInt2);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = COMPAT_OVERLAP_ANCHOR;
    if (bool)
    {
      bool = this.mOverlapAnchor;
      if (bool)
      {
        int i = paramView.getHeight();
        paramInt2 -= i;
      }
    }
    super.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = COMPAT_OVERLAP_ANCHOR;
    if (bool)
    {
      bool = this.mOverlapAnchor;
      if (bool)
      {
        int i = paramView.getHeight();
        paramInt2 -= i;
      }
    }
    for (int j = paramInt2;; j = paramInt2)
    {
      super.update(paramView, paramInt1, j, paramInt3, paramInt4);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatPopupWindow.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */