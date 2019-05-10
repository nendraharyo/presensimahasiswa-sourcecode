package android.support.c.a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.a;
import android.support.v4.b.a.b;

abstract class h
  extends Drawable
  implements b
{
  Drawable b;
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      a.a(localDrawable, paramTheme);
    }
  }
  
  public void clearColorFilter()
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.clearColorFilter();
    }
    for (;;)
    {
      return;
      super.clearColorFilter();
    }
  }
  
  public ColorFilter getColorFilter()
  {
    Object localObject = this.b;
    if (localObject != null) {}
    for (localObject = a.e(this.b);; localObject = null) {
      return (ColorFilter)localObject;
    }
  }
  
  public Drawable getCurrent()
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null) {}
    for (localDrawable = this.b.getCurrent();; localDrawable = super.getCurrent()) {
      return localDrawable;
    }
  }
  
  public int getMinimumHeight()
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null) {
      localDrawable = this.b;
    }
    for (int i = localDrawable.getMinimumHeight();; i = super.getMinimumHeight()) {
      return i;
    }
  }
  
  public int getMinimumWidth()
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null) {
      localDrawable = this.b;
    }
    for (int i = localDrawable.getMinimumWidth();; i = super.getMinimumWidth()) {
      return i;
    }
  }
  
  public boolean getPadding(Rect paramRect)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null) {
      localDrawable = this.b;
    }
    for (boolean bool = localDrawable.getPadding(paramRect);; bool = super.getPadding(paramRect)) {
      return bool;
    }
  }
  
  public int[] getState()
  {
    Object localObject = this.b;
    if (localObject != null) {}
    for (localObject = this.b.getState();; localObject = super.getState()) {
      return (int[])localObject;
    }
  }
  
  public Region getTransparentRegion()
  {
    Object localObject = this.b;
    if (localObject != null) {}
    for (localObject = this.b.getTransparentRegion();; localObject = super.getTransparentRegion()) {
      return (Region)localObject;
    }
  }
  
  public void jumpToCurrentState()
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      a.a(localDrawable);
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.setBounds(paramRect);
    }
    for (;;)
    {
      return;
      super.onBoundsChange(paramRect);
    }
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null) {
      localDrawable = this.b;
    }
    for (boolean bool = localDrawable.setLevel(paramInt);; bool = super.onLevelChange(paramInt)) {
      return bool;
    }
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.setChangingConfigurations(paramInt);
    }
    for (;;)
    {
      return;
      super.setChangingConfigurations(paramInt);
    }
  }
  
  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.setColorFilter(paramInt, paramMode);
    }
    for (;;)
    {
      return;
      super.setColorFilter(paramInt, paramMode);
    }
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.setFilterBitmap(paramBoolean);
    }
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      a.a(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      a.a(localDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null) {
      localDrawable = this.b;
    }
    for (boolean bool = localDrawable.setState(paramArrayOfInt);; bool = super.setState(paramArrayOfInt)) {
      return bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */