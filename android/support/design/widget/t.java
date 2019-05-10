package android.support.design.widget;

import android.widget.ImageButton;

class t
  extends ImageButton
{
  private int a;
  
  final void a(int paramInt, boolean paramBoolean)
  {
    super.setVisibility(paramInt);
    if (paramBoolean) {
      this.a = paramInt;
    }
  }
  
  final int getUserSetVisibility()
  {
    return this.a;
  }
  
  public void setVisibility(int paramInt)
  {
    a(paramInt, true);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */