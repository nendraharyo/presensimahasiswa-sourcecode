package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.widget.TextView;

class AppCompatTextHelperV17
  extends AppCompatTextHelper
{
  private TintInfo mDrawableEndTint;
  private TintInfo mDrawableStartTint;
  
  AppCompatTextHelperV17(TextView paramTextView)
  {
    super(paramTextView);
  }
  
  void applyCompoundDrawablesTints()
  {
    super.applyCompoundDrawablesTints();
    Object localObject1 = this.mDrawableStartTint;
    if (localObject1 == null)
    {
      localObject1 = this.mDrawableEndTint;
      if (localObject1 == null) {}
    }
    else
    {
      localObject1 = this.mView.getCompoundDrawablesRelative();
      Object localObject2 = localObject1[0];
      TintInfo localTintInfo = this.mDrawableStartTint;
      applyCompoundDrawableTint((Drawable)localObject2, localTintInfo);
      int i = 2;
      localObject1 = localObject1[i];
      localObject2 = this.mDrawableEndTint;
      applyCompoundDrawableTint((Drawable)localObject1, (TintInfo)localObject2);
    }
  }
  
  void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    super.loadFromAttributes(paramAttributeSet, paramInt);
    Object localObject1 = this.mView.getContext();
    AppCompatDrawableManager localAppCompatDrawableManager = AppCompatDrawableManager.get();
    Object localObject2 = R.styleable.AppCompatTextHelper;
    localObject2 = ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, 0);
    int i = R.styleable.AppCompatTextHelper_android_drawableStart;
    boolean bool1 = ((TypedArray)localObject2).hasValue(i);
    if (bool1)
    {
      j = R.styleable.AppCompatTextHelper_android_drawableStart;
      j = ((TypedArray)localObject2).getResourceId(j, 0);
      TintInfo localTintInfo = createTintInfo((Context)localObject1, localAppCompatDrawableManager, j);
      this.mDrawableStartTint = localTintInfo;
    }
    int j = R.styleable.AppCompatTextHelper_android_drawableEnd;
    boolean bool2 = ((TypedArray)localObject2).hasValue(j);
    if (bool2)
    {
      int k = R.styleable.AppCompatTextHelper_android_drawableEnd;
      k = ((TypedArray)localObject2).getResourceId(k, 0);
      localObject1 = createTintInfo((Context)localObject1, localAppCompatDrawableManager, k);
      this.mDrawableEndTint = ((TintInfo)localObject1);
    }
    ((TypedArray)localObject2).recycle();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatTextHelperV17.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */