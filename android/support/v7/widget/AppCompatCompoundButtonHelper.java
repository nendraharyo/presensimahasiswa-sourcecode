package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.b.a.a;
import android.support.v4.widget.c;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.CompoundButton;

class AppCompatCompoundButtonHelper
{
  private ColorStateList mButtonTintList = null;
  private PorterDuff.Mode mButtonTintMode = null;
  private boolean mHasButtonTint = false;
  private boolean mHasButtonTintMode = false;
  private boolean mSkipNextApply;
  private final CompoundButton mView;
  
  AppCompatCompoundButtonHelper(CompoundButton paramCompoundButton)
  {
    this.mView = paramCompoundButton;
  }
  
  void applyButtonTint()
  {
    Drawable localDrawable = c.a(this.mView);
    if (localDrawable != null)
    {
      boolean bool = this.mHasButtonTint;
      if (!bool)
      {
        bool = this.mHasButtonTintMode;
        if (!bool) {}
      }
      else
      {
        localDrawable = a.g(localDrawable).mutate();
        bool = this.mHasButtonTint;
        if (bool)
        {
          localObject = this.mButtonTintList;
          a.a(localDrawable, (ColorStateList)localObject);
        }
        bool = this.mHasButtonTintMode;
        if (bool)
        {
          localObject = this.mButtonTintMode;
          a.a(localDrawable, (PorterDuff.Mode)localObject);
        }
        bool = localDrawable.isStateful();
        if (bool)
        {
          localObject = this.mView.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
        Object localObject = this.mView;
        ((CompoundButton)localObject).setButtonDrawable(localDrawable);
      }
    }
  }
  
  int getCompoundPaddingLeft(int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i < j)
    {
      Drawable localDrawable = c.a(this.mView);
      if (localDrawable != null)
      {
        i = localDrawable.getIntrinsicWidth();
        paramInt += i;
      }
    }
    return paramInt;
  }
  
  ColorStateList getSupportButtonTintList()
  {
    return this.mButtonTintList;
  }
  
  PorterDuff.Mode getSupportButtonTintMode()
  {
    return this.mButtonTintMode;
  }
  
  void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = this.mView.getContext();
    Object localObject4 = R.styleable.CompoundButton;
    localObject4 = ((Context)localObject2).obtainStyledAttributes(paramAttributeSet, (int[])localObject4, paramInt, 0);
    try
    {
      int j = R.styleable.CompoundButton_android_button;
      boolean bool1 = ((TypedArray)localObject4).hasValue(j);
      Object localObject5;
      if (bool1)
      {
        k = R.styleable.CompoundButton_android_button;
        i = 0;
        localObject1 = null;
        k = ((TypedArray)localObject4).getResourceId(k, 0);
        if (k != 0)
        {
          localObject1 = this.mView;
          localObject5 = this.mView;
          localObject5 = ((CompoundButton)localObject5).getContext();
          localObject2 = AppCompatResources.getDrawable((Context)localObject5, k);
          ((CompoundButton)localObject1).setButtonDrawable((Drawable)localObject2);
        }
      }
      int k = R.styleable.CompoundButton_buttonTint;
      boolean bool2 = ((TypedArray)localObject4).hasValue(k);
      if (bool2)
      {
        localObject2 = this.mView;
        i = R.styleable.CompoundButton_buttonTint;
        localObject1 = ((TypedArray)localObject4).getColorStateList(i);
        c.a((CompoundButton)localObject2, (ColorStateList)localObject1);
      }
      int m = R.styleable.CompoundButton_buttonTintMode;
      boolean bool3 = ((TypedArray)localObject4).hasValue(m);
      if (bool3)
      {
        localObject2 = this.mView;
        i = R.styleable.CompoundButton_buttonTintMode;
        int n = -1;
        i = ((TypedArray)localObject4).getInt(i, n);
        n = 0;
        localObject5 = null;
        localObject1 = DrawableUtils.parseTintMode(i, null);
        c.a((CompoundButton)localObject2, (PorterDuff.Mode)localObject1);
      }
      return;
    }
    finally
    {
      ((TypedArray)localObject4).recycle();
    }
  }
  
  void onSetButtonDrawable()
  {
    boolean bool = this.mSkipNextApply;
    if (bool)
    {
      bool = false;
      this.mSkipNextApply = false;
    }
    for (;;)
    {
      return;
      bool = true;
      this.mSkipNextApply = bool;
      applyButtonTint();
    }
  }
  
  void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    this.mButtonTintList = paramColorStateList;
    this.mHasButtonTint = true;
    applyButtonTint();
  }
  
  void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    this.mButtonTintMode = paramMode;
    this.mHasButtonTintMode = true;
    applyButtonTint();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatCompoundButtonHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */