package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.q;
import android.support.v4.widget.b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

public class AppCompatTextView
  extends TextView
  implements q, b
{
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private final AppCompatTextHelper mTextHelper;
  
  public AppCompatTextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public AppCompatTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super((Context)localObject, paramAttributeSet, paramInt);
    localObject = new android/support/v7/widget/AppCompatBackgroundHelper;
    ((AppCompatBackgroundHelper)localObject).<init>(this);
    this.mBackgroundTintHelper = ((AppCompatBackgroundHelper)localObject);
    this.mBackgroundTintHelper.loadFromAttributes(paramAttributeSet, paramInt);
    localObject = AppCompatTextHelper.create(this);
    this.mTextHelper = ((AppCompatTextHelper)localObject);
    this.mTextHelper.loadFromAttributes(paramAttributeSet, paramInt);
    this.mTextHelper.applyCompoundDrawablesTints();
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
    localObject = this.mTextHelper;
    if (localObject != null)
    {
      localObject = this.mTextHelper;
      ((AppCompatTextHelper)localObject).applyCompoundDrawablesTints();
    }
  }
  
  public int getAutoSizeMaxTextSize()
  {
    boolean bool = a;
    int i;
    if (bool) {
      i = super.getAutoSizeMaxTextSize();
    }
    for (;;)
    {
      return i;
      AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null)
      {
        localAppCompatTextHelper = this.mTextHelper;
        i = localAppCompatTextHelper.getAutoSizeMaxTextSize();
      }
      else
      {
        i = -1;
      }
    }
  }
  
  public int getAutoSizeMinTextSize()
  {
    boolean bool = a;
    int i;
    if (bool) {
      i = super.getAutoSizeMinTextSize();
    }
    for (;;)
    {
      return i;
      AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null)
      {
        localAppCompatTextHelper = this.mTextHelper;
        i = localAppCompatTextHelper.getAutoSizeMinTextSize();
      }
      else
      {
        i = -1;
      }
    }
  }
  
  public int getAutoSizeStepGranularity()
  {
    boolean bool = a;
    int i;
    if (bool) {
      i = super.getAutoSizeStepGranularity();
    }
    for (;;)
    {
      return i;
      AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null)
      {
        localAppCompatTextHelper = this.mTextHelper;
        i = localAppCompatTextHelper.getAutoSizeStepGranularity();
      }
      else
      {
        i = -1;
      }
    }
  }
  
  public int[] getAutoSizeTextAvailableSizes()
  {
    boolean bool = a;
    Object localObject;
    if (bool) {
      localObject = super.getAutoSizeTextAvailableSizes();
    }
    for (;;)
    {
      return (int[])localObject;
      localObject = this.mTextHelper;
      if (localObject != null)
      {
        localObject = this.mTextHelper.getAutoSizeTextAvailableSizes();
      }
      else
      {
        bool = false;
        localObject = new int[0];
      }
    }
  }
  
  public int getAutoSizeTextType()
  {
    int i = 1;
    boolean bool = a;
    if (bool)
    {
      int j = super.getAutoSizeTextType();
      if (j != i) {}
    }
    for (;;)
    {
      return i;
      i = 0;
      AppCompatTextHelper localAppCompatTextHelper = null;
      continue;
      localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null)
      {
        localAppCompatTextHelper = this.mTextHelper;
        i = localAppCompatTextHelper.getAutoSizeTextType();
      }
      else
      {
        i = 0;
        localAppCompatTextHelper = null;
      }
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
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, this);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null)
    {
      localAppCompatTextHelper = this.mTextHelper;
      localAppCompatTextHelper.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null)
    {
      boolean bool = a;
      if (!bool)
      {
        localAppCompatTextHelper = this.mTextHelper;
        bool = localAppCompatTextHelper.isAutoSizeEnabled();
        if (bool)
        {
          localAppCompatTextHelper = this.mTextHelper;
          localAppCompatTextHelper.autoSizeText();
        }
      }
    }
  }
  
  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = a;
    if (bool) {
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    for (;;)
    {
      return;
      AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null)
      {
        localAppCompatTextHelper = this.mTextHelper;
        localAppCompatTextHelper.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
  }
  
  public void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool = a;
    if (bool) {
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
    }
    for (;;)
    {
      return;
      AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null)
      {
        localAppCompatTextHelper = this.mTextHelper;
        localAppCompatTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
      }
    }
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    boolean bool = a;
    if (bool) {
      super.setAutoSizeTextTypeWithDefaults(paramInt);
    }
    for (;;)
    {
      return;
      AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null)
      {
        localAppCompatTextHelper = this.mTextHelper;
        localAppCompatTextHelper.setAutoSizeTextTypeWithDefaults(paramInt);
      }
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
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null)
    {
      localAppCompatTextHelper = this.mTextHelper;
      localAppCompatTextHelper.onSetTextAppearance(paramContext, paramInt);
    }
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    boolean bool = a;
    if (bool) {
      super.setTextSize(paramInt, paramFloat);
    }
    for (;;)
    {
      return;
      AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null)
      {
        localAppCompatTextHelper = this.mTextHelper;
        localAppCompatTextHelper.setTextSize(paramInt, paramFloat);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatTextView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */