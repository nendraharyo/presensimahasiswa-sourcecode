package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.View;

class AppCompatBackgroundHelper
{
  private int mBackgroundResId = -1;
  private TintInfo mBackgroundTint;
  private final AppCompatDrawableManager mDrawableManager;
  private TintInfo mInternalBackgroundTint;
  private TintInfo mTmpInfo;
  private final View mView;
  
  AppCompatBackgroundHelper(View paramView)
  {
    this.mView = paramView;
    AppCompatDrawableManager localAppCompatDrawableManager = AppCompatDrawableManager.get();
    this.mDrawableManager = localAppCompatDrawableManager;
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
    Object localObject = r.s(this.mView);
    if (localObject != null)
    {
      localTintInfo.mHasTintList = bool1;
      localTintInfo.mTintList = ((ColorStateList)localObject);
    }
    localObject = r.t(this.mView);
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
      TintInfo localTintInfo = this.mInternalBackgroundTint;
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
  
  void applySupportBackgroundTint()
  {
    Drawable localDrawable = this.mView.getBackground();
    if (localDrawable != null)
    {
      boolean bool = shouldApplyFrameworkTintUsingColorFilter();
      if (!bool) {
        break label32;
      }
      bool = applyFrameworkTintUsingColorFilter(localDrawable);
      if (!bool) {
        break label32;
      }
    }
    for (;;)
    {
      return;
      label32:
      TintInfo localTintInfo = this.mBackgroundTint;
      int[] arrayOfInt;
      if (localTintInfo != null)
      {
        localTintInfo = this.mBackgroundTint;
        arrayOfInt = this.mView.getDrawableState();
        AppCompatDrawableManager.tintDrawable(localDrawable, localTintInfo, arrayOfInt);
      }
      else
      {
        localTintInfo = this.mInternalBackgroundTint;
        if (localTintInfo != null)
        {
          localTintInfo = this.mInternalBackgroundTint;
          arrayOfInt = this.mView.getDrawableState();
          AppCompatDrawableManager.tintDrawable(localDrawable, localTintInfo, arrayOfInt);
        }
      }
    }
  }
  
  ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.mBackgroundTint;
    if (localObject != null) {}
    for (localObject = this.mBackgroundTint.mTintList;; localObject = null) {
      return (ColorStateList)localObject;
    }
  }
  
  PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.mBackgroundTint;
    if (localObject != null) {}
    for (localObject = this.mBackgroundTint.mTintMode;; localObject = null) {
      return (PorterDuff.Mode)localObject;
    }
  }
  
  void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = this.mView.getContext();
    Object localObject3 = R.styleable.ViewBackgroundHelper;
    int i = 0;
    Object localObject4 = null;
    localObject3 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, (int[])localObject3, paramInt, 0);
    try
    {
      int j = R.styleable.ViewBackgroundHelper_android_background;
      boolean bool1 = ((TintTypedArray)localObject3).hasValue(j);
      int n;
      if (bool1)
      {
        k = R.styleable.ViewBackgroundHelper_android_background;
        i = -1;
        k = ((TintTypedArray)localObject3).getResourceId(k, i);
        this.mBackgroundResId = k;
        localObject1 = this.mDrawableManager;
        localObject4 = this.mView;
        localObject4 = ((View)localObject4).getContext();
        n = this.mBackgroundResId;
        localObject1 = ((AppCompatDrawableManager)localObject1).getTintList((Context)localObject4, n);
        if (localObject1 != null) {
          setInternalBackgroundTint((ColorStateList)localObject1);
        }
      }
      int k = R.styleable.ViewBackgroundHelper_backgroundTint;
      boolean bool2 = ((TintTypedArray)localObject3).hasValue(k);
      if (bool2)
      {
        localObject1 = this.mView;
        i = R.styleable.ViewBackgroundHelper_backgroundTint;
        localObject4 = ((TintTypedArray)localObject3).getColorStateList(i);
        r.a((View)localObject1, (ColorStateList)localObject4);
      }
      int m = R.styleable.ViewBackgroundHelper_backgroundTintMode;
      boolean bool3 = ((TintTypedArray)localObject3).hasValue(m);
      if (bool3)
      {
        localObject1 = this.mView;
        i = R.styleable.ViewBackgroundHelper_backgroundTintMode;
        n = -1;
        i = ((TintTypedArray)localObject3).getInt(i, n);
        n = 0;
        localObject4 = DrawableUtils.parseTintMode(i, null);
        r.a((View)localObject1, (PorterDuff.Mode)localObject4);
      }
      return;
    }
    finally
    {
      ((TintTypedArray)localObject3).recycle();
    }
  }
  
  void onSetBackgroundDrawable(Drawable paramDrawable)
  {
    this.mBackgroundResId = -1;
    setInternalBackgroundTint(null);
    applySupportBackgroundTint();
  }
  
  void onSetBackgroundResource(int paramInt)
  {
    this.mBackgroundResId = paramInt;
    Object localObject = this.mDrawableManager;
    Context localContext;
    if (localObject != null)
    {
      localObject = this.mDrawableManager;
      localContext = this.mView.getContext();
    }
    for (localObject = ((AppCompatDrawableManager)localObject).getTintList(localContext, paramInt);; localObject = null)
    {
      setInternalBackgroundTint((ColorStateList)localObject);
      applySupportBackgroundTint();
      return;
    }
  }
  
  void setInternalBackgroundTint(ColorStateList paramColorStateList)
  {
    TintInfo localTintInfo;
    if (paramColorStateList != null)
    {
      localTintInfo = this.mInternalBackgroundTint;
      if (localTintInfo == null)
      {
        localTintInfo = new android/support/v7/widget/TintInfo;
        localTintInfo.<init>();
        this.mInternalBackgroundTint = localTintInfo;
      }
      this.mInternalBackgroundTint.mTintList = paramColorStateList;
      localTintInfo = this.mInternalBackgroundTint;
      boolean bool = true;
      localTintInfo.mHasTintList = bool;
    }
    for (;;)
    {
      applySupportBackgroundTint();
      return;
      localTintInfo = null;
      this.mInternalBackgroundTint = null;
    }
  }
  
  void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    TintInfo localTintInfo = this.mBackgroundTint;
    if (localTintInfo == null)
    {
      localTintInfo = new android/support/v7/widget/TintInfo;
      localTintInfo.<init>();
      this.mBackgroundTint = localTintInfo;
    }
    this.mBackgroundTint.mTintList = paramColorStateList;
    this.mBackgroundTint.mHasTintList = true;
    applySupportBackgroundTint();
  }
  
  void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    TintInfo localTintInfo = this.mBackgroundTint;
    if (localTintInfo == null)
    {
      localTintInfo = new android/support/v7/widget/TintInfo;
      localTintInfo.<init>();
      this.mBackgroundTint = localTintInfo;
    }
    this.mBackgroundTint.mTintMode = paramMode;
    this.mBackgroundTint.mHasTintMode = true;
    applySupportBackgroundTint();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatBackgroundHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */