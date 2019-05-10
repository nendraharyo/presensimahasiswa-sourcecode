package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.SpinnerAdapter;

class AppCompatSpinner$DropdownPopup
  extends ListPopupWindow
{
  ListAdapter mAdapter;
  private CharSequence mHintText;
  private final Rect mVisibleRect;
  
  public AppCompatSpinner$DropdownPopup(AppCompatSpinner paramAppCompatSpinner, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mVisibleRect = ((Rect)localObject);
    setAnchorView(paramAppCompatSpinner);
    setModal(true);
    setPromptPosition(0);
    localObject = new android/support/v7/widget/AppCompatSpinner$DropdownPopup$1;
    ((AppCompatSpinner.DropdownPopup.1)localObject).<init>(this, paramAppCompatSpinner);
    setOnItemClickListener((AdapterView.OnItemClickListener)localObject);
  }
  
  void computeContentWidth()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = getBackground();
    int i;
    int k;
    label57:
    int m;
    int n;
    int i1;
    int i2;
    Object localObject3;
    if (localObject2 != null)
    {
      localObject1 = AppCompatSpinner.access$100(this.this$0);
      ((Drawable)localObject2).getPadding((Rect)localObject1);
      localObject1 = this.this$0;
      bool1 = ViewUtils.isLayoutRtl((View)localObject1);
      if (bool1)
      {
        localObject1 = AppCompatSpinner.access$100(this.this$0);
        i = ((Rect)localObject1).right;
        k = i;
        m = this.this$0.getPaddingLeft();
        n = this.this$0.getPaddingRight();
        i1 = this.this$0.getWidth();
        localObject1 = this.this$0;
        i = AppCompatSpinner.access$200((AppCompatSpinner)localObject1);
        i2 = -2;
        if (i != i2) {
          break label312;
        }
        localObject3 = this.this$0;
        localObject1 = (SpinnerAdapter)this.mAdapter;
        Object localObject4 = getBackground();
        i2 = ((AppCompatSpinner)localObject3).compatMeasureContentWidth((SpinnerAdapter)localObject1, (Drawable)localObject4);
        localObject1 = this.this$0.getContext().getResources().getDisplayMetrics();
        i = ((DisplayMetrics)localObject1).widthPixels;
        int i3 = AppCompatSpinner.access$100(this.this$0).left;
        i -= i3;
        localObject4 = AppCompatSpinner.access$100(this.this$0);
        i3 = ((Rect)localObject4).right;
        i -= i3;
        if (i2 <= i) {
          break label375;
        }
      }
    }
    for (;;)
    {
      i2 = i1 - m - n;
      i = Math.max(i, i2);
      setContentWidth(i);
      label219:
      localObject1 = this.this$0;
      boolean bool2 = ViewUtils.isLayoutRtl((View)localObject1);
      if (bool2)
      {
        j = i1 - n;
        i2 = getWidth();
      }
      for (int j = j - i2 + k;; j = k + m)
      {
        setHorizontalOffset(j);
        return;
        localObject1 = AppCompatSpinner.access$100(this.this$0);
        j = -((Rect)localObject1).left;
        break;
        localObject2 = AppCompatSpinner.access$100(this.this$0);
        localObject3 = AppCompatSpinner.access$100(this.this$0);
        ((Rect)localObject3).right = 0;
        ((Rect)localObject2).left = 0;
        k = 0;
        localObject2 = null;
        break label57;
        label312:
        localObject1 = this.this$0;
        j = AppCompatSpinner.access$200((AppCompatSpinner)localObject1);
        i2 = -1;
        if (j == i2)
        {
          j = i1 - m - n;
          setContentWidth(j);
          break label219;
        }
        localObject1 = this.this$0;
        j = AppCompatSpinner.access$200((AppCompatSpinner)localObject1);
        setContentWidth(j);
        break label219;
      }
      label375:
      j = i2;
    }
  }
  
  public CharSequence getHintText()
  {
    return this.mHintText;
  }
  
  boolean isVisibleToUser(View paramView)
  {
    boolean bool = r.z(paramView);
    Rect localRect;
    if (bool)
    {
      localRect = this.mVisibleRect;
      bool = paramView.getGlobalVisibleRect(localRect);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRect = null;
    }
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    super.setAdapter(paramListAdapter);
    this.mAdapter = paramListAdapter;
  }
  
  public void setPromptText(CharSequence paramCharSequence)
  {
    this.mHintText = paramCharSequence;
  }
  
  public void show()
  {
    boolean bool = isShowing();
    computeContentWidth();
    setInputMethodMode(2);
    super.show();
    Object localObject1 = getListView();
    int i = 1;
    ((ListView)localObject1).setChoiceMode(i);
    localObject1 = this.this$0;
    int j = ((AppCompatSpinner)localObject1).getSelectedItemPosition();
    setSelection(j);
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject2 = this.this$0.getViewTreeObserver();
      if (localObject2 != null)
      {
        localObject1 = new android/support/v7/widget/AppCompatSpinner$DropdownPopup$2;
        ((AppCompatSpinner.DropdownPopup.2)localObject1).<init>(this);
        ((ViewTreeObserver)localObject2).addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject1);
        localObject2 = new android/support/v7/widget/AppCompatSpinner$DropdownPopup$3;
        ((AppCompatSpinner.DropdownPopup.3)localObject2).<init>(this, (ViewTreeObserver.OnGlobalLayoutListener)localObject1);
        setOnDismissListener((PopupWindow.OnDismissListener)localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatSpinner$DropdownPopup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */