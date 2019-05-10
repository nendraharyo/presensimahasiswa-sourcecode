package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

public class AppCompatCheckedTextView
  extends CheckedTextView
{
  private static final int[] TINT_ATTRS;
  private final AppCompatTextHelper mTextHelper;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16843016;
    TINT_ATTRS = arrayOfInt;
  }
  
  public AppCompatCheckedTextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }
  
  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super((Context)localObject1, paramAttributeSet, paramInt);
    localObject1 = AppCompatTextHelper.create(this);
    this.mTextHelper = ((AppCompatTextHelper)localObject1);
    this.mTextHelper.loadFromAttributes(paramAttributeSet, paramInt);
    this.mTextHelper.applyCompoundDrawablesTints();
    localObject1 = getContext();
    Object localObject2 = TINT_ATTRS;
    localObject1 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    localObject2 = ((TintTypedArray)localObject1).getDrawable(0);
    setCheckMarkDrawable((Drawable)localObject2);
    ((TintTypedArray)localObject1).recycle();
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null)
    {
      localAppCompatTextHelper = this.mTextHelper;
      localAppCompatTextHelper.applyCompoundDrawablesTints();
    }
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, this);
  }
  
  public void setCheckMarkDrawable(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);
    setCheckMarkDrawable(localDrawable);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatCheckedTextView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */