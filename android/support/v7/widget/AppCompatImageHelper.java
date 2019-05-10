package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.widget.h;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageHelper
{
  private TintInfo mImageTint;
  private TintInfo mInternalImageTint;
  private TintInfo mTmpInfo;
  private final ImageView mView;
  
  public AppCompatImageHelper(ImageView paramImageView)
  {
    this.mView = paramImageView;
  }
  
  private boolean applyFrameworkTintUsingColorFilter(Drawable paramDrawable)
  {
    boolean bool1 = true;
    TintInfo localTintInfo = this.mTmpInfo;
    if (localTintInfo == null)
    {
      localTintInfo = new android/support/v7/widget/TintInfo;
      localTintInfo.<init>();
      this.mTmpInfo = localTintInfo;
    }
    localTintInfo = this.mTmpInfo;
    localTintInfo.clear();
    Object localObject = h.a(this.mView);
    if (localObject != null)
    {
      localTintInfo.mHasTintList = bool1;
      localTintInfo.mTintList = ((ColorStateList)localObject);
    }
    localObject = h.b(this.mView);
    if (localObject != null)
    {
      localTintInfo.mHasTintMode = bool1;
      localTintInfo.mTintMode = ((PorterDuff.Mode)localObject);
    }
    boolean bool2 = localTintInfo.mHasTintList;
    if (!bool2)
    {
      bool2 = localTintInfo.mHasTintMode;
      if (!bool2) {}
    }
    else
    {
      localObject = this.mView.getDrawableState();
      AppCompatDrawableManager.tintDrawable(paramDrawable, localTintInfo, (int[])localObject);
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
    }
  }
  
  private boolean shouldApplyFrameworkTintUsingColorFilter()
  {
    int i = 21;
    boolean bool = true;
    int j = Build.VERSION.SDK_INT;
    if (j > i)
    {
      TintInfo localTintInfo = this.mInternalImageTint;
      if (localTintInfo == null) {}
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      if (j != i) {
        bool = false;
      }
    }
  }
  
  void applySupportImageTint()
  {
    Drawable localDrawable = this.mView.getDrawable();
    if (localDrawable != null) {
      DrawableUtils.fixDrawable(localDrawable);
    }
    if (localDrawable != null)
    {
      boolean bool = shouldApplyFrameworkTintUsingColorFilter();
      if (!bool) {
        break label40;
      }
      bool = applyFrameworkTintUsingColorFilter(localDrawable);
      if (!bool) {
        break label40;
      }
    }
    for (;;)
    {
      return;
      label40:
      TintInfo localTintInfo = this.mImageTint;
      int[] arrayOfInt;
      if (localTintInfo != null)
      {
        localTintInfo = this.mImageTint;
        arrayOfInt = this.mView.getDrawableState();
        AppCompatDrawableManager.tintDrawable(localDrawable, localTintInfo, arrayOfInt);
      }
      else
      {
        localTintInfo = this.mInternalImageTint;
        if (localTintInfo != null)
        {
          localTintInfo = this.mInternalImageTint;
          arrayOfInt = this.mView.getDrawableState();
          AppCompatDrawableManager.tintDrawable(localDrawable, localTintInfo, arrayOfInt);
        }
      }
    }
  }
  
  ColorStateList getSupportImageTintList()
  {
    Object localObject = this.mImageTint;
    if (localObject != null) {}
    for (localObject = this.mImageTint.mTintList;; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  PorterDuff.Mode getSupportImageTintMode()
  {
    Object localObject = this.mImageTint;
    if (localObject != null) {}
    for (localObject = this.mImageTint.mTintMode;; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  boolean hasOverlappingRendering()
  {
    Drawable localDrawable = this.mView.getBackground();
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    boolean bool;
    if (i >= j)
    {
      bool = localDrawable instanceof RippleDrawable;
      if (bool)
      {
        bool = false;
        localDrawable = null;
      }
    }
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
  
  public void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    int i = -1;
    Object localObject1 = this.mView.getContext();
    Object localObject3 = R.styleable.AppCompatImageView;
    int j = 0;
    Object localObject4 = null;
    localObject3 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, (int[])localObject3, paramInt, 0);
    try
    {
      localObject1 = this.mView;
      localObject1 = ((ImageView)localObject1).getDrawable();
      int k;
      if (localObject1 == null)
      {
        j = R.styleable.AppCompatImageView_srcCompat;
        k = -1;
        j = ((TintTypedArray)localObject3).getResourceId(j, k);
        if (j != i)
        {
          localObject1 = this.mView;
          localObject1 = ((ImageView)localObject1).getContext();
          localObject1 = AppCompatResources.getDrawable((Context)localObject1, j);
          if (localObject1 != null)
          {
            localObject4 = this.mView;
            ((ImageView)localObject4).setImageDrawable((Drawable)localObject1);
          }
        }
      }
      if (localObject1 != null) {
        DrawableUtils.fixDrawable((Drawable)localObject1);
      }
      int m = R.styleable.AppCompatImageView_tint;
      boolean bool1 = ((TintTypedArray)localObject3).hasValue(m);
      if (bool1)
      {
        localObject1 = this.mView;
        j = R.styleable.AppCompatImageView_tint;
        localObject4 = ((TintTypedArray)localObject3).getColorStateList(j);
        h.a((ImageView)localObject1, (ColorStateList)localObject4);
      }
      int n = R.styleable.AppCompatImageView_tintMode;
      boolean bool2 = ((TintTypedArray)localObject3).hasValue(n);
      if (bool2)
      {
        localObject1 = this.mView;
        j = R.styleable.AppCompatImageView_tintMode;
        k = -1;
        j = ((TintTypedArray)localObject3).getInt(j, k);
        k = 0;
        localObject4 = DrawableUtils.parseTintMode(j, null);
        h.a((ImageView)localObject1, (PorterDuff.Mode)localObject4);
      }
      return;
    }
    finally
    {
      ((TintTypedArray)localObject3).recycle();
    }
  }
  
  public void setImageResource(int paramInt)
  {
    Object localObject;
    ImageView localImageView;
    if (paramInt != 0)
    {
      localObject = AppCompatResources.getDrawable(this.mView.getContext(), paramInt);
      if (localObject != null) {
        DrawableUtils.fixDrawable((Drawable)localObject);
      }
      localImageView = this.mView;
      localImageView.setImageDrawable((Drawable)localObject);
    }
    for (;;)
    {
      applySupportImageTint();
      return;
      localObject = this.mView;
      localImageView = null;
      ((ImageView)localObject).setImageDrawable(null);
    }
  }
  
  void setInternalImageTint(ColorStateList paramColorStateList)
  {
    TintInfo localTintInfo;
    if (paramColorStateList != null)
    {
      localTintInfo = this.mInternalImageTint;
      if (localTintInfo == null)
      {
        localTintInfo = new android/support/v7/widget/TintInfo;
        localTintInfo.<init>();
        this.mInternalImageTint = localTintInfo;
      }
      this.mInternalImageTint.mTintList = paramColorStateList;
      localTintInfo = this.mInternalImageTint;
      boolean bool = true;
      localTintInfo.mHasTintList = bool;
    }
    for (;;)
    {
      applySupportImageTint();
      return;
      localTintInfo = null;
      this.mInternalImageTint = null;
    }
  }
  
  void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    TintInfo localTintInfo = this.mImageTint;
    if (localTintInfo == null)
    {
      localTintInfo = new android/support/v7/widget/TintInfo;
      localTintInfo.<init>();
      this.mImageTint = localTintInfo;
    }
    this.mImageTint.mTintList = paramColorStateList;
    this.mImageTint.mHasTintList = true;
    applySupportImageTint();
  }
  
  void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    TintInfo localTintInfo = this.mImageTint;
    if (localTintInfo == null)
    {
      localTintInfo = new android/support/v7/widget/TintInfo;
      localTintInfo.<init>();
      this.mImageTint = localTintInfo;
    }
    this.mImageTint.mTintMode = paramMode;
    this.mImageTint.mHasTintMode = true;
    applySupportImageTint();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatImageHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */