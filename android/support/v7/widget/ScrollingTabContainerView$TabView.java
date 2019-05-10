package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.appcompat.R.attr;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

class ScrollingTabContainerView$TabView
  extends LinearLayout
{
  private final int[] BG_ATTRS;
  private View mCustomView;
  private ImageView mIconView;
  private ActionBar.Tab mTab;
  private TextView mTextView;
  
  public ScrollingTabContainerView$TabView(ScrollingTabContainerView paramScrollingTabContainerView, Context paramContext, ActionBar.Tab paramTab, boolean paramBoolean)
  {
    super(paramContext, null, i);
    i = 1;
    Object localObject = new int[i];
    localObject[0] = 16842964;
    this.BG_ATTRS = ((int[])localObject);
    this.mTab = paramTab;
    localObject = this.BG_ATTRS;
    int j = R.attr.actionBarTabStyle;
    localObject = TintTypedArray.obtainStyledAttributes(paramContext, null, (int[])localObject, j, 0);
    boolean bool = ((TintTypedArray)localObject).hasValue(0);
    if (bool)
    {
      Drawable localDrawable = ((TintTypedArray)localObject).getDrawable(0);
      setBackgroundDrawable(localDrawable);
    }
    ((TintTypedArray)localObject).recycle();
    if (paramBoolean)
    {
      i = 8388627;
      setGravity(i);
    }
    update();
  }
  
  public void bindTab(ActionBar.Tab paramTab)
  {
    this.mTab = paramTab;
    update();
  }
  
  public ActionBar.Tab getTab()
  {
    return this.mTab;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    String str = ActionBar.Tab.class.getName();
    paramAccessibilityEvent.setClassName(str);
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    String str = ActionBar.Tab.class.getName();
    paramAccessibilityNodeInfo.setClassName(str);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    ScrollingTabContainerView localScrollingTabContainerView1 = this.this$0;
    int i = localScrollingTabContainerView1.mMaxTabWidth;
    if (i > 0)
    {
      i = getMeasuredWidth();
      ScrollingTabContainerView localScrollingTabContainerView2 = this.this$0;
      int j = localScrollingTabContainerView2.mMaxTabWidth;
      if (i > j)
      {
        localScrollingTabContainerView1 = this.this$0;
        i = localScrollingTabContainerView1.mMaxTabWidth;
        j = 1073741824;
        i = View.MeasureSpec.makeMeasureSpec(i, j);
        super.onMeasure(i, paramInt2);
      }
    }
  }
  
  public void setSelected(boolean paramBoolean)
  {
    boolean bool = isSelected();
    if (bool != paramBoolean) {}
    int i;
    for (bool = true;; i = 0)
    {
      super.setSelected(paramBoolean);
      if ((bool) && (paramBoolean))
      {
        i = 4;
        sendAccessibilityEvent(i);
      }
      return;
    }
  }
  
  public void update()
  {
    int i = 16;
    int j = 8;
    Object localObject1 = null;
    int k = -2;
    ActionBar.Tab localTab = this.mTab;
    Object localObject2 = localTab.getCustomView();
    if (localObject2 != null)
    {
      localObject3 = ((View)localObject2).getParent();
      if (localObject3 != this)
      {
        if (localObject3 != null)
        {
          localObject3 = (ViewGroup)localObject3;
          ((ViewGroup)localObject3).removeView((View)localObject2);
        }
        addView((View)localObject2);
      }
      this.mCustomView = ((View)localObject2);
      localObject3 = this.mTextView;
      if (localObject3 != null)
      {
        localObject3 = this.mTextView;
        ((TextView)localObject3).setVisibility(j);
      }
      localObject3 = this.mIconView;
      if (localObject3 != null)
      {
        this.mIconView.setVisibility(j);
        localObject3 = this.mIconView;
        ((ImageView)localObject3).setImageDrawable(null);
      }
      return;
    }
    Object localObject3 = this.mCustomView;
    if (localObject3 != null)
    {
      localObject3 = this.mCustomView;
      removeView((View)localObject3);
      this.mCustomView = null;
    }
    localObject3 = localTab.getIcon();
    localObject2 = localTab.getText();
    label270:
    boolean bool;
    if (localObject3 != null)
    {
      Object localObject4 = this.mIconView;
      Object localObject5;
      if (localObject4 == null)
      {
        localObject4 = new android/support/v7/widget/AppCompatImageView;
        localObject5 = getContext();
        ((AppCompatImageView)localObject4).<init>((Context)localObject5);
        localObject5 = new android/widget/LinearLayout$LayoutParams;
        ((LinearLayout.LayoutParams)localObject5).<init>(k, k);
        ((LinearLayout.LayoutParams)localObject5).gravity = i;
        ((ImageView)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject5);
        addView((View)localObject4, 0);
        this.mIconView = ((ImageView)localObject4);
      }
      localObject4 = this.mIconView;
      ((ImageView)localObject4).setImageDrawable((Drawable)localObject3);
      localObject3 = this.mIconView;
      ((ImageView)localObject3).setVisibility(0);
      bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool) {
        break label482;
      }
      bool = true;
      label285:
      if (!bool) {
        break label491;
      }
      localObject4 = this.mTextView;
      if (localObject4 == null)
      {
        localObject4 = new android/support/v7/widget/AppCompatTextView;
        localObject5 = getContext();
        j = R.attr.actionBarTabTextStyle;
        ((AppCompatTextView)localObject4).<init>((Context)localObject5, null, j);
        localObject5 = TextUtils.TruncateAt.END;
        ((TextView)localObject4).setEllipsize((TextUtils.TruncateAt)localObject5);
        localObject5 = new android/widget/LinearLayout$LayoutParams;
        ((LinearLayout.LayoutParams)localObject5).<init>(k, k);
        ((LinearLayout.LayoutParams)localObject5).gravity = i;
        ((TextView)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject5);
        addView((View)localObject4);
        this.mTextView = ((TextView)localObject4);
      }
      localObject4 = this.mTextView;
      ((TextView)localObject4).setText((CharSequence)localObject2);
      localObject2 = this.mTextView;
      ((TextView)localObject2).setVisibility(0);
      label401:
      localObject1 = this.mIconView;
      if (localObject1 != null)
      {
        localObject1 = this.mIconView;
        localObject2 = localTab.getContentDescription();
        ((ImageView)localObject1).setContentDescription((CharSequence)localObject2);
      }
      if (!bool) {
        break label521;
      }
      bool = false;
    }
    label482:
    label491:
    label521:
    for (localObject3 = null;; localObject3 = localTab.getContentDescription())
    {
      TooltipCompat.setTooltipText(this, (CharSequence)localObject3);
      break;
      localObject3 = this.mIconView;
      if (localObject3 == null) {
        break label270;
      }
      this.mIconView.setVisibility(j);
      localObject3 = this.mIconView;
      ((ImageView)localObject3).setImageDrawable(null);
      break label270;
      bool = false;
      localObject3 = null;
      break label285;
      localObject1 = this.mTextView;
      if (localObject1 == null) {
        break label401;
      }
      this.mTextView.setVisibility(j);
      localObject1 = this.mTextView;
      ((TextView)localObject1).setText(null);
      break label401;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ScrollingTabContainerView$TabView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */