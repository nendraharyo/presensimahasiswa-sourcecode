package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.q;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

public class AppCompatMultiAutoCompleteTextView
  extends MultiAutoCompleteTextView
  implements q
{
  private static final int[] TINT_ATTRS;
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private final AppCompatTextHelper mTextHelper;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843126;
    TINT_ATTRS = arrayOfInt;
  }
  
  public AppCompatMultiAutoCompleteTextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super((Context)localObject1, paramAttributeSet, paramInt);
    localObject1 = getContext();
    Object localObject2 = TINT_ATTRS;
    localObject1 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    boolean bool = ((TintTypedArray)localObject1).hasValue(0);
    if (bool)
    {
      localObject2 = ((TintTypedArray)localObject1).getDrawable(0);
      setDropDownBackgroundDrawable((Drawable)localObject2);
    }
    ((TintTypedArray)localObject1).recycle();
    localObject1 = new android/support/v7/widget/AppCompatBackgroundHelper;
    ((AppCompatBackgroundHelper)localObject1).<init>(this);
    this.mBackgroundTintHelper = ((AppCompatBackgroundHelper)localObject1);
    this.mBackgroundTintHelper.loadFromAttributes(paramAttributeSet, paramInt);
    localObject1 = AppCompatTextHelper.create(this);
    this.mTextHelper = ((AppCompatTextHelper)localObject1);
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
  
  public void setDropDownBackgroundResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);
    setDropDownBackgroundDrawable(localDrawable);
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatMultiAutoCompleteTextView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */