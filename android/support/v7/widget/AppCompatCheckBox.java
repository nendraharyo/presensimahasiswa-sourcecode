package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.o;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class AppCompatCheckBox
  extends CheckBox
  implements o
{
  private final AppCompatCompoundButtonHelper mCompoundButtonHelper;
  
  public AppCompatCheckBox(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatCheckBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatCheckBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super((Context)localObject, paramAttributeSet, paramInt);
    localObject = new android/support/v7/widget/AppCompatCompoundButtonHelper;
    ((AppCompatCompoundButtonHelper)localObject).<init>(this);
    this.mCompoundButtonHelper = ((AppCompatCompoundButtonHelper)localObject);
    this.mCompoundButtonHelper.loadFromAttributes(paramAttributeSet, paramInt);
  }
  
  public int getCompoundPaddingLeft()
  {
    int i = super.getCompoundPaddingLeft();
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = this.mCompoundButtonHelper;
    if (localAppCompatCompoundButtonHelper != null)
    {
      localAppCompatCompoundButtonHelper = this.mCompoundButtonHelper;
      i = localAppCompatCompoundButtonHelper.getCompoundPaddingLeft(i);
    }
    return i;
  }
  
  public ColorStateList getSupportButtonTintList()
  {
    Object localObject = this.mCompoundButtonHelper;
    if (localObject != null) {}
    for (localObject = this.mCompoundButtonHelper.getSupportButtonTintList();; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  public PorterDuff.Mode getSupportButtonTintMode()
  {
    Object localObject = this.mCompoundButtonHelper;
    if (localObject != null) {}
    for (localObject = this.mCompoundButtonHelper.getSupportButtonTintMode();; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  public void setButtonDrawable(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);
    setButtonDrawable(localDrawable);
  }
  
  public void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = this.mCompoundButtonHelper;
    if (localAppCompatCompoundButtonHelper != null)
    {
      localAppCompatCompoundButtonHelper = this.mCompoundButtonHelper;
      localAppCompatCompoundButtonHelper.onSetButtonDrawable();
    }
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = this.mCompoundButtonHelper;
    if (localAppCompatCompoundButtonHelper != null)
    {
      localAppCompatCompoundButtonHelper = this.mCompoundButtonHelper;
      localAppCompatCompoundButtonHelper.setSupportButtonTintList(paramColorStateList);
    }
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = this.mCompoundButtonHelper;
    if (localAppCompatCompoundButtonHelper != null)
    {
      localAppCompatCompoundButtonHelper = this.mCompoundButtonHelper;
      localAppCompatCompoundButtonHelper.setSupportButtonTintMode(paramMode);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatCheckBox.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */