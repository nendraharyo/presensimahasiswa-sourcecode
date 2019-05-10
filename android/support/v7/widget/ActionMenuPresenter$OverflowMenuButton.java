package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.a;
import android.view.View.OnTouchListener;

class ActionMenuPresenter$OverflowMenuButton
  extends AppCompatImageView
  implements ActionMenuView.ActionMenuChildView
{
  private final float[] mTempPts;
  
  public ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter paramActionMenuPresenter, Context paramContext)
  {
    super(paramContext, null, i);
    Object localObject = new float[2];
    this.mTempPts = ((float[])localObject);
    setClickable(bool);
    setFocusable(bool);
    setVisibility(0);
    setEnabled(bool);
    localObject = getContentDescription();
    TooltipCompat.setTooltipText(this, (CharSequence)localObject);
    localObject = new android/support/v7/widget/ActionMenuPresenter$OverflowMenuButton$1;
    ((ActionMenuPresenter.OverflowMenuButton.1)localObject).<init>(this, this, paramActionMenuPresenter);
    setOnTouchListener((View.OnTouchListener)localObject);
  }
  
  public boolean needsDividerAfter()
  {
    return false;
  }
  
  public boolean needsDividerBefore()
  {
    return false;
  }
  
  public boolean performClick()
  {
    boolean bool1 = true;
    boolean bool2 = super.performClick();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = false;
      playSoundEffect(0);
      ActionMenuPresenter localActionMenuPresenter = this.this$0;
      localActionMenuPresenter.showOverflowMenu();
    }
  }
  
  protected boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable1 = getDrawable();
    Drawable localDrawable2 = getBackground();
    if ((localDrawable1 != null) && (localDrawable2 != null))
    {
      int i = getWidth();
      int j = getHeight();
      int k = Math.max(i, j) / 2;
      int m = getPaddingLeft();
      int n = getPaddingRight();
      m -= n;
      n = getPaddingTop();
      int i1 = getPaddingBottom();
      n -= i1;
      i = (i + m) / 2;
      j = (j + n) / 2;
      m = i - k;
      n = j - k;
      i += k;
      j += k;
      a.a(localDrawable2, m, n, i, j);
    }
    return bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionMenuPresenter$OverflowMenuButton.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */