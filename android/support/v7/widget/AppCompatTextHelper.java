package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.a.a.b.a;
import android.support.v4.widget.b;
import android.support.v7.appcompat.R.styleable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

class AppCompatTextHelper
{
  private static final int MONOSPACE = 3;
  private static final int SANS = 1;
  private static final int SERIF = 2;
  private boolean mAsyncFontPending;
  private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
  private TintInfo mDrawableBottomTint;
  private TintInfo mDrawableLeftTint;
  private TintInfo mDrawableRightTint;
  private TintInfo mDrawableTopTint;
  private Typeface mFontTypeface;
  private int mStyle = 0;
  final TextView mView;
  
  AppCompatTextHelper(TextView paramTextView)
  {
    this.mView = paramTextView;
    AppCompatTextViewAutoSizeHelper localAppCompatTextViewAutoSizeHelper = new android/support/v7/widget/AppCompatTextViewAutoSizeHelper;
    TextView localTextView = this.mView;
    localAppCompatTextViewAutoSizeHelper.<init>(localTextView);
    this.mAutoSizeTextHelper = localAppCompatTextViewAutoSizeHelper;
  }
  
  static AppCompatTextHelper create(TextView paramTextView)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v7/widget/AppCompatTextHelperV17;
      ((AppCompatTextHelperV17)localObject).<init>(paramTextView);
    }
    for (;;)
    {
      return (AppCompatTextHelper)localObject;
      localObject = new android/support/v7/widget/AppCompatTextHelper;
      ((AppCompatTextHelper)localObject).<init>(paramTextView);
    }
  }
  
  protected static TintInfo createTintInfo(Context paramContext, AppCompatDrawableManager paramAppCompatDrawableManager, int paramInt)
  {
    ColorStateList localColorStateList = paramAppCompatDrawableManager.getTintList(paramContext, paramInt);
    TintInfo localTintInfo;
    if (localColorStateList != null)
    {
      localTintInfo = new android/support/v7/widget/TintInfo;
      localTintInfo.<init>();
      boolean bool = true;
      localTintInfo.mHasTintList = bool;
      localTintInfo.mTintList = localColorStateList;
    }
    for (;;)
    {
      return localTintInfo;
      localTintInfo = null;
    }
  }
  
  private void onAsyncTypefaceReceived(WeakReference paramWeakReference, Typeface paramTypeface)
  {
    boolean bool = this.mAsyncFontPending;
    if (bool)
    {
      this.mFontTypeface = paramTypeface;
      TextView localTextView = (TextView)paramWeakReference.get();
      if (localTextView != null)
      {
        int i = this.mStyle;
        localTextView.setTypeface(paramTypeface, i);
      }
    }
  }
  
  private void setTextSizeInternal(int paramInt, float paramFloat)
  {
    this.mAutoSizeTextHelper.setTextSizeInternal(paramInt, paramFloat);
  }
  
  private void updateTypefaceAndStyle(Context paramContext, TintTypedArray paramTintTypedArray)
  {
    int i = 1;
    int j = R.styleable.TextAppearance_android_textStyle;
    int i2 = this.mStyle;
    j = paramTintTypedArray.getInt(j, i2);
    this.mStyle = j;
    j = R.styleable.TextAppearance_android_fontFamily;
    boolean bool1 = paramTintTypedArray.hasValue(j);
    Object localObject1;
    int n;
    Object localObject2;
    Object localObject3;
    if (!bool1)
    {
      int k = R.styleable.TextAppearance_fontFamily;
      boolean bool2 = paramTintTypedArray.hasValue(k);
      if (!bool2) {}
    }
    else
    {
      localObject1 = null;
      this.mFontTypeface = null;
      int m = R.styleable.TextAppearance_fontFamily;
      boolean bool3 = paramTintTypedArray.hasValue(m);
      if (bool3)
      {
        n = R.styleable.TextAppearance_fontFamily;
        boolean bool5 = paramContext.isRestricted();
        if (!bool5)
        {
          localObject2 = new java/lang/ref/WeakReference;
          localObject3 = this.mView;
          ((WeakReference)localObject2).<init>(localObject3);
          localObject3 = new android/support/v7/widget/AppCompatTextHelper$1;
          ((AppCompatTextHelper.1)localObject3).<init>(this, (WeakReference)localObject2);
        }
      }
    }
    try
    {
      int i3 = this.mStyle;
      localObject2 = paramTintTypedArray.getFont(n, i3, (b.a)localObject3);
      this.mFontTypeface = ((Typeface)localObject2);
      localObject2 = this.mFontTypeface;
      if (localObject2 != null) {
        break label230;
      }
      label173:
      this.mAsyncFontPending = i;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      Typeface localTypeface;
      for (;;) {}
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      for (;;) {}
    }
    localTypeface = this.mFontTypeface;
    if (localTypeface == null)
    {
      localObject1 = paramTintTypedArray.getString(n);
      if (localObject1 != null)
      {
        i = this.mStyle;
        localObject1 = Typeface.create((String)localObject1, i);
        this.mFontTypeface = ((Typeface)localObject1);
      }
    }
    for (;;)
    {
      return;
      n = R.styleable.TextAppearance_android_fontFamily;
      break;
      label230:
      i = 0;
      localTypeface = null;
      break label173;
      n = R.styleable.TextAppearance_android_typeface;
      boolean bool4 = paramTintTypedArray.hasValue(n);
      if (bool4)
      {
        this.mAsyncFontPending = false;
        int i1 = R.styleable.TextAppearance_android_typeface;
        i1 = paramTintTypedArray.getInt(i1, i);
        switch (i1)
        {
        default: 
          break;
        case 1: 
          localObject1 = Typeface.SANS_SERIF;
          this.mFontTypeface = ((Typeface)localObject1);
          break;
        case 2: 
          localObject1 = Typeface.SERIF;
          this.mFontTypeface = ((Typeface)localObject1);
          break;
        case 3: 
          localObject1 = Typeface.MONOSPACE;
          this.mFontTypeface = ((Typeface)localObject1);
        }
      }
    }
  }
  
  final void applyCompoundDrawableTint(Drawable paramDrawable, TintInfo paramTintInfo)
  {
    if ((paramDrawable != null) && (paramTintInfo != null))
    {
      int[] arrayOfInt = this.mView.getDrawableState();
      AppCompatDrawableManager.tintDrawable(paramDrawable, paramTintInfo, arrayOfInt);
    }
  }
  
  void applyCompoundDrawablesTints()
  {
    Object localObject1 = this.mDrawableLeftTint;
    if (localObject1 == null)
    {
      localObject1 = this.mDrawableTopTint;
      if (localObject1 == null)
      {
        localObject1 = this.mDrawableRightTint;
        if (localObject1 == null)
        {
          localObject1 = this.mDrawableBottomTint;
          if (localObject1 == null) {
            return;
          }
        }
      }
    }
    localObject1 = this.mView.getCompoundDrawables();
    Object localObject2 = localObject1[0];
    TintInfo localTintInfo = this.mDrawableLeftTint;
    applyCompoundDrawableTint((Drawable)localObject2, localTintInfo);
    localObject2 = localObject1[1];
    localTintInfo = this.mDrawableTopTint;
    applyCompoundDrawableTint((Drawable)localObject2, localTintInfo);
    localObject2 = localObject1[2];
    localTintInfo = this.mDrawableRightTint;
    applyCompoundDrawableTint((Drawable)localObject2, localTintInfo);
    int i = 3;
    localObject1 = localObject1[i];
    localObject2 = this.mDrawableBottomTint;
    applyCompoundDrawableTint((Drawable)localObject1, (TintInfo)localObject2);
  }
  
  void autoSizeText()
  {
    this.mAutoSizeTextHelper.autoSizeText();
  }
  
  int getAutoSizeMaxTextSize()
  {
    return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
  }
  
  int getAutoSizeMinTextSize()
  {
    return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
  }
  
  int getAutoSizeStepGranularity()
  {
    return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
  }
  
  int[] getAutoSizeTextAvailableSizes()
  {
    return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
  }
  
  int getAutoSizeTextType()
  {
    return this.mAutoSizeTextHelper.getAutoSizeTextType();
  }
  
  boolean isAutoSizeEnabled()
  {
    return this.mAutoSizeTextHelper.isAutoSizeEnabled();
  }
  
  void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    int i = 23;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int i2 = -1;
    int i3 = 0;
    ColorStateList localColorStateList = null;
    Context localContext = this.mView.getContext();
    Object localObject1 = AppCompatDrawableManager.get();
    Object localObject2 = R.styleable.AppCompatTextHelper;
    localObject2 = TintTypedArray.obtainStyledAttributes(localContext, paramAttributeSet, (int[])localObject2, paramInt, 0);
    int i4 = R.styleable.AppCompatTextHelper_android_textAppearance;
    i4 = ((TintTypedArray)localObject2).getResourceId(i4, i2);
    int i6 = R.styleable.AppCompatTextHelper_android_drawableLeft;
    boolean bool6 = ((TintTypedArray)localObject2).hasValue(i6);
    Object localObject3;
    if (bool6)
    {
      i7 = R.styleable.AppCompatTextHelper_android_drawableLeft;
      i7 = ((TintTypedArray)localObject2).getResourceId(i7, 0);
      localObject3 = createTintInfo(localContext, (AppCompatDrawableManager)localObject1, i7);
      this.mDrawableLeftTint = ((TintInfo)localObject3);
    }
    int i7 = R.styleable.AppCompatTextHelper_android_drawableTop;
    boolean bool7 = ((TintTypedArray)localObject2).hasValue(i7);
    if (bool7)
    {
      i8 = R.styleable.AppCompatTextHelper_android_drawableTop;
      i8 = ((TintTypedArray)localObject2).getResourceId(i8, 0);
      localObject3 = createTintInfo(localContext, (AppCompatDrawableManager)localObject1, i8);
      this.mDrawableTopTint = ((TintInfo)localObject3);
    }
    int i8 = R.styleable.AppCompatTextHelper_android_drawableRight;
    boolean bool8 = ((TintTypedArray)localObject2).hasValue(i8);
    if (bool8)
    {
      i9 = R.styleable.AppCompatTextHelper_android_drawableRight;
      i9 = ((TintTypedArray)localObject2).getResourceId(i9, 0);
      localObject3 = createTintInfo(localContext, (AppCompatDrawableManager)localObject1, i9);
      this.mDrawableRightTint = ((TintInfo)localObject3);
    }
    int i9 = R.styleable.AppCompatTextHelper_android_drawableBottom;
    boolean bool9 = ((TintTypedArray)localObject2).hasValue(i9);
    int i10;
    if (bool9)
    {
      i10 = R.styleable.AppCompatTextHelper_android_drawableBottom;
      i10 = ((TintTypedArray)localObject2).getResourceId(i10, 0);
      localObject1 = createTintInfo(localContext, (AppCompatDrawableManager)localObject1, i10);
      this.mDrawableBottomTint = ((TintInfo)localObject1);
    }
    ((TintTypedArray)localObject2).recycle();
    localObject1 = this.mView.getTransformationMethod();
    boolean bool11 = localObject1 instanceof PasswordTransformationMethod;
    Object localObject4;
    int i13;
    boolean bool14;
    int i5;
    Object localObject5;
    label409:
    int i11;
    if (i4 != i2)
    {
      localObject1 = R.styleable.TextAppearance;
      localObject4 = TintTypedArray.obtainStyledAttributes(localContext, i4, (int[])localObject1);
      if (!bool11)
      {
        int i12 = R.styleable.TextAppearance_textAllCaps;
        boolean bool12 = ((TintTypedArray)localObject4).hasValue(i12);
        if (bool12)
        {
          i13 = R.styleable.TextAppearance_textAllCaps;
          bool14 = ((TintTypedArray)localObject4).getBoolean(i13, false);
          i13 = j;
          updateTypefaceAndStyle(localContext, (TintTypedArray)localObject4);
          i4 = Build.VERSION.SDK_INT;
          if (i4 < i)
          {
            i4 = R.styleable.TextAppearance_android_textColor;
            boolean bool5 = ((TintTypedArray)localObject4).hasValue(i4);
            if (bool5)
            {
              i5 = R.styleable.TextAppearance_android_textColor;
              localObject5 = ((TintTypedArray)localObject4).getColorStateList(i5);
              i10 = R.styleable.TextAppearance_android_textColorHint;
              boolean bool10 = ((TintTypedArray)localObject4).hasValue(i10);
              if (bool10)
              {
                i11 = R.styleable.TextAppearance_android_textColorHint;
                localObject3 = ((TintTypedArray)localObject4).getColorStateList(i11);
                label442:
                int i16 = R.styleable.TextAppearance_android_textColorLink;
                boolean bool15 = ((TintTypedArray)localObject4).hasValue(i16);
                if (bool15)
                {
                  i3 = R.styleable.TextAppearance_android_textColorLink;
                  localColorStateList = ((TintTypedArray)localObject4).getColorStateList(i3);
                }
                label475:
                ((TintTypedArray)localObject4).recycle();
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      localObject4 = R.styleable.TextAppearance;
      localObject4 = TintTypedArray.obtainStyledAttributes(localContext, paramAttributeSet, (int[])localObject4, paramInt, 0);
      if (!bool11)
      {
        int i17 = R.styleable.TextAppearance_textAllCaps;
        boolean bool16 = ((TintTypedArray)localObject4).hasValue(i17);
        if (bool16)
        {
          i13 = R.styleable.TextAppearance_textAllCaps;
          bool14 = ((TintTypedArray)localObject4).getBoolean(i13, false);
          i13 = j;
        }
      }
      j = Build.VERSION.SDK_INT;
      int n;
      if (j < i)
      {
        j = R.styleable.TextAppearance_android_textColor;
        boolean bool1 = ((TintTypedArray)localObject4).hasValue(j);
        if (bool1)
        {
          k = R.styleable.TextAppearance_android_textColor;
          localObject5 = ((TintTypedArray)localObject4).getColorStateList(k);
        }
        int k = R.styleable.TextAppearance_android_textColorHint;
        boolean bool2 = ((TintTypedArray)localObject4).hasValue(k);
        if (bool2)
        {
          m = R.styleable.TextAppearance_android_textColorHint;
          localObject3 = ((TintTypedArray)localObject4).getColorStateList(m);
        }
        int m = R.styleable.TextAppearance_android_textColorLink;
        boolean bool3 = ((TintTypedArray)localObject4).hasValue(m);
        if (bool3)
        {
          n = R.styleable.TextAppearance_android_textColorLink;
          localColorStateList = ((TintTypedArray)localObject4).getColorStateList(n);
        }
      }
      updateTypefaceAndStyle(localContext, (TintTypedArray)localObject4);
      ((TintTypedArray)localObject4).recycle();
      Object localObject6;
      if (localObject5 != null)
      {
        localObject6 = this.mView;
        ((TextView)localObject6).setTextColor((ColorStateList)localObject5);
      }
      if (localObject3 != null)
      {
        localObject6 = this.mView;
        ((TextView)localObject6).setHintTextColor((ColorStateList)localObject3);
      }
      if (localColorStateList != null)
      {
        localObject6 = this.mView;
        ((TextView)localObject6).setLinkTextColor(localColorStateList);
      }
      if ((!bool11) && (i13 != 0)) {
        setAllCaps(bool14);
      }
      localObject1 = this.mFontTypeface;
      if (localObject1 != null)
      {
        localObject1 = this.mView;
        localObject6 = this.mFontTypeface;
        i15 = this.mStyle;
        ((TextView)localObject1).setTypeface((Typeface)localObject6, i15);
      }
      localObject1 = this.mAutoSizeTextHelper;
      ((AppCompatTextViewAutoSizeHelper)localObject1).loadFromAttributes(paramAttributeSet, paramInt);
      boolean bool13 = b.a;
      if (bool13)
      {
        localObject1 = this.mAutoSizeTextHelper;
        i14 = ((AppCompatTextViewAutoSizeHelper)localObject1).getAutoSizeTextType();
        if (i14 != 0)
        {
          localObject1 = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
          n = localObject1.length;
          if (n > 0)
          {
            localObject6 = this.mView;
            f1 = ((TextView)localObject6).getAutoSizeStepGranularity();
            i15 = -1082130432;
            f2 = -1.0F;
            boolean bool4 = f1 < f2;
            if (!bool4) {
              break label925;
            }
            localObject1 = this.mView;
            localObject6 = this.mAutoSizeTextHelper;
            int i1 = ((AppCompatTextViewAutoSizeHelper)localObject6).getAutoSizeMinTextSize();
            localObject2 = this.mAutoSizeTextHelper;
            i15 = ((AppCompatTextViewAutoSizeHelper)localObject2).getAutoSizeMaxTextSize();
            localObject5 = this.mAutoSizeTextHelper;
            i5 = ((AppCompatTextViewAutoSizeHelper)localObject5).getAutoSizeStepGranularity();
            ((TextView)localObject1).setAutoSizeTextTypeUniformWithConfiguration(i1, i15, i5, 0);
          }
        }
      }
      for (;;)
      {
        return;
        label925:
        localObject6 = this.mView;
        ((TextView)localObject6).setAutoSizeTextTypeUniformWithPresetSizes((int[])localObject1, 0);
      }
      i11 = 0;
      localObject3 = null;
      break label442;
      i5 = 0;
      localObject5 = null;
      break label409;
      i11 = 0;
      localObject3 = null;
      i5 = 0;
      localObject5 = null;
      break label475;
      int i14 = 0;
      localObject1 = null;
      int i15 = 0;
      localObject2 = null;
      float f2 = 0.0F;
      break;
      i11 = 0;
      localObject3 = null;
      i5 = 0;
      localObject5 = null;
      i14 = 0;
      localObject1 = null;
      i15 = 0;
      localObject2 = null;
      f2 = 0.0F;
    }
  }
  
  void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = b.a;
    if (!bool) {
      autoSizeText();
    }
  }
  
  void onSetTextAppearance(Context paramContext, int paramInt)
  {
    Object localObject1 = R.styleable.TextAppearance;
    localObject1 = TintTypedArray.obtainStyledAttributes(paramContext, paramInt, (int[])localObject1);
    int i = R.styleable.TextAppearance_textAllCaps;
    boolean bool1 = ((TintTypedArray)localObject1).hasValue(i);
    TextView localTextView;
    if (bool1)
    {
      int j = R.styleable.TextAppearance_textAllCaps;
      n = 0;
      localTextView = null;
      boolean bool2 = ((TintTypedArray)localObject1).getBoolean(j, false);
      setAllCaps(bool2);
    }
    int k = Build.VERSION.SDK_INT;
    int n = 23;
    Object localObject2;
    if (k < n)
    {
      k = R.styleable.TextAppearance_android_textColor;
      boolean bool3 = ((TintTypedArray)localObject1).hasValue(k);
      if (bool3)
      {
        int m = R.styleable.TextAppearance_android_textColor;
        localObject2 = ((TintTypedArray)localObject1).getColorStateList(m);
        if (localObject2 != null)
        {
          localTextView = this.mView;
          localTextView.setTextColor((ColorStateList)localObject2);
        }
      }
    }
    updateTypefaceAndStyle(paramContext, (TintTypedArray)localObject1);
    ((TintTypedArray)localObject1).recycle();
    localObject1 = this.mFontTypeface;
    if (localObject1 != null)
    {
      localObject1 = this.mView;
      localObject2 = this.mFontTypeface;
      n = this.mStyle;
      ((TextView)localObject1).setTypeface((Typeface)localObject2, n);
    }
  }
  
  void setAllCaps(boolean paramBoolean)
  {
    this.mView.setAllCaps(paramBoolean);
  }
  
  void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
  }
  
  void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(paramInt);
  }
  
  void setTextSize(int paramInt, float paramFloat)
  {
    boolean bool = b.a;
    if (!bool)
    {
      bool = isAutoSizeEnabled();
      if (!bool) {
        setTextSizeInternal(paramInt, paramFloat);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatTextHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */