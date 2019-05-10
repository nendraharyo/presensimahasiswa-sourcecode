package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.view.q;
import android.support.v4.widget.p;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView
  extends ImageView
  implements q, p
{
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private final AppCompatImageHelper mImageHelper;
  
  public AppCompatImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AppCompatImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super((Context)localObject, paramAttributeSet, paramInt);
    localObject = new android/support/v7/widget/AppCompatBackgroundHelper;
    ((AppCompatBackgroundHelper)localObject).<init>(this);
    this.mBackgroundTintHelper = ((AppCompatBackgroundHelper)localObject);
    this.mBackgroundTintHelper.loadFromAttributes(paramAttributeSet, paramInt);
    localObject = new android/support/v7/widget/AppCompatImageHelper;
    ((AppCompatImageHelper)localObject).<init>(this);
    this.mImageHelper = ((AppCompatImageHelper)localObject);
    this.mImageHelper.loadFromAttributes(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = this.mBackgroundTintHelper;
    if (localObject != null)
    {
      localObject = this.mBackgroundTintHelper;
      ((AppCompatBackgroundHelper)localObject).applySupportBackgroundTint();
    }
    localObject = this.mImageHelper;
    if (localObject != null)
    {
      localObject = this.mImageHelper;
      ((AppCompatImageHelper)localObject).applySupportImageTint();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.mBackgroundTintHelper;
    if (localObject != null) {}
    for (localObject = this.mBackgroundTintHelper.getSupportBackgroundTintList();; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.mBackgroundTintHelper;
    if (localObject != null) {}
    for (localObject = this.mBackgroundTintHelper.getSupportBackgroundTintMode();; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  public ColorStateList getSupportImageTintList()
  {
    Object localObject = this.mImageHelper;
    if (localObject != null) {}
    for (localObject = this.mImageHelper.getSupportImageTintList();; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  public PorterDuff.Mode getSupportImageTintMode()
  {
    Object localObject = this.mImageHelper;
    if (localObject != null) {}
    for (localObject = this.mImageHelper.getSupportImageTintMode();; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  public boolean hasOverlappingRendering()
  {
    AppCompatImageHelper localAppCompatImageHelper = this.mImageHelper;
    boolean bool = localAppCompatImageHelper.hasOverlappingRendering();
    if (bool)
    {
      bool = super.hasOverlappingRendering();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAppCompatImageHelper = null;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null)
    {
      localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
      localAppCompatBackgroundHelper.onSetBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null)
    {
      localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
      localAppCompatBackgroundHelper.onSetBackgroundResource(paramInt);
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    AppCompatImageHelper localAppCompatImageHelper = this.mImageHelper;
    if (localAppCompatImageHelper != null)
    {
      localAppCompatImageHelper = this.mImageHelper;
      localAppCompatImageHelper.applySupportImageTint();
    }
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    AppCompatImageHelper localAppCompatImageHelper = this.mImageHelper;
    if (localAppCompatImageHelper != null)
    {
      localAppCompatImageHelper = this.mImageHelper;
      localAppCompatImageHelper.applySupportImageTint();
    }
  }
  
  public void setImageResource(int paramInt)
  {
    AppCompatImageHelper localAppCompatImageHelper = this.mImageHelper;
    if (localAppCompatImageHelper != null)
    {
      localAppCompatImageHelper = this.mImageHelper;
      localAppCompatImageHelper.setImageResource(paramInt);
    }
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    AppCompatImageHelper localAppCompatImageHelper = this.mImageHelper;
    if (localAppCompatImageHelper != null)
    {
      localAppCompatImageHelper = this.mImageHelper;
      localAppCompatImageHelper.applySupportImageTint();
    }
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null)
    {
      localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
      localAppCompatBackgroundHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null)
    {
      localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
      localAppCompatBackgroundHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    AppCompatImageHelper localAppCompatImageHelper = this.mImageHelper;
    if (localAppCompatImageHelper != null)
    {
      localAppCompatImageHelper = this.mImageHelper;
      localAppCompatImageHelper.setSupportImageTintList(paramColorStateList);
    }
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatImageHelper localAppCompatImageHelper = this.mImageHelper;
    if (localAppCompatImageHelper != null)
    {
      localAppCompatImageHelper = this.mImageHelper;
      localAppCompatImageHelper.setSupportImageTintMode(paramMode);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatImageView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */