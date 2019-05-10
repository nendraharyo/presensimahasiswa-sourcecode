package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.r;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.widget.Checkable;

public class CheckableImageButton
  extends AppCompatImageButton
  implements Checkable
{
  private static final int[] a;
  private boolean b;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16842912;
    a = arrayOfInt;
  }
  
  public CheckableImageButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    CheckableImageButton.1 local1 = new android/support/design/widget/CheckableImageButton$1;
    local1.<init>(this);
    r.a(this, local1);
  }
  
  public boolean isChecked()
  {
    return this.b;
  }
  
  public int[] onCreateDrawableState(int paramInt)
  {
    boolean bool = this.b;
    int[] arrayOfInt2;
    if (bool)
    {
      int i = a.length + paramInt;
      arrayOfInt1 = super.onCreateDrawableState(i);
      arrayOfInt2 = a;
    }
    for (int[] arrayOfInt1 = mergeDrawableStates(arrayOfInt1, arrayOfInt2);; arrayOfInt1 = super.onCreateDrawableState(paramInt)) {
      return arrayOfInt1;
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    boolean bool = this.b;
    if (bool != paramBoolean)
    {
      this.b = paramBoolean;
      refreshDrawableState();
      int i = 2048;
      sendAccessibilityEvent(i);
    }
  }
  
  public void toggle()
  {
    boolean bool = this.b;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\CheckableImageButton.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */