package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.graphics.drawable.DrawableWrapper;

class DropDownListView$GateKeeperDrawable
  extends DrawableWrapper
{
  private boolean mEnabled = true;
  
  DropDownListView$GateKeeperDrawable(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  public void draw(Canvas paramCanvas)
  {
    boolean bool = this.mEnabled;
    if (bool) {
      super.draw(paramCanvas);
    }
  }
  
  void setEnabled(boolean paramBoolean)
  {
    this.mEnabled = paramBoolean;
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    boolean bool = this.mEnabled;
    if (bool) {
      super.setHotspot(paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = this.mEnabled;
    if (bool) {
      super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = this.mEnabled;
    if (bool) {}
    for (bool = super.setState(paramArrayOfInt);; bool = false) {
      return bool;
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = this.mEnabled;
    if (bool) {}
    for (bool = super.setVisible(paramBoolean1, paramBoolean2);; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DropDownListView$GateKeeperDrawable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */