package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.widget.ActionMenuView.ActionMenuChildView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ForwardingListener;
import android.support.v7.widget.TooltipCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

public class ActionMenuItemView
  extends AppCompatTextView
  implements MenuView.ItemView, ActionMenuView.ActionMenuChildView, View.OnClickListener
{
  private static final int MAX_ICON_SIZE = 32;
  private static final String TAG = "ActionMenuItemView";
  private boolean mAllowTextWithIcon;
  private boolean mExpandedFormat;
  private ForwardingListener mForwardingListener;
  private Drawable mIcon;
  MenuItemImpl mItemData;
  MenuBuilder.ItemInvoker mItemInvoker;
  private int mMaxIconSize;
  private int mMinWidth;
  ActionMenuItemView.PopupCallback mPopupCallback;
  private int mSavedPaddingLeft;
  private CharSequence mTitle;
  
  public ActionMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = paramContext.getResources();
    boolean bool = shouldAllowTextWithIcon();
    this.mAllowTextWithIcon = bool;
    Object localObject = R.styleable.ActionMenuItemView;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, paramInt, 0);
    int i = R.styleable.ActionMenuItemView_android_minWidth;
    i = ((TypedArray)localObject).getDimensionPixelSize(i, 0);
    this.mMinWidth = i;
    ((TypedArray)localObject).recycle();
    int j = (int)(localResources.getDisplayMetrics().density * 32.0F + 0.5F);
    this.mMaxIconSize = j;
    setOnClickListener(this);
    this.mSavedPaddingLeft = -1;
    setSaveEnabled(false);
  }
  
  private boolean shouldAllowTextWithIcon()
  {
    int i = 480;
    Configuration localConfiguration = getContext().getResources().getConfiguration();
    int j = localConfiguration.screenWidthDp;
    int k = localConfiguration.screenHeightDp;
    if (j < i)
    {
      int m = 640;
      if ((j < m) || (k < i))
      {
        n = localConfiguration.orientation;
        j = 2;
        if (n != j) {
          break label68;
        }
      }
    }
    int n = 1;
    for (;;)
    {
      return n;
      label68:
      int i1 = 0;
      localConfiguration = null;
    }
  }
  
  private void updateTextButtonVisibility()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    CharSequence localCharSequence = null;
    Object localObject1 = this.mTitle;
    boolean bool3 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool3)
    {
      bool3 = bool1;
      Object localObject2 = this.mIcon;
      if (localObject2 != null)
      {
        localObject2 = this.mItemData;
        boolean bool4 = ((MenuItemImpl)localObject2).showsTextAsAction();
        if (!bool4) {
          break label80;
        }
        bool4 = this.mAllowTextWithIcon;
        if (!bool4)
        {
          bool4 = this.mExpandedFormat;
          if (!bool4) {
            break label80;
          }
        }
      }
      bool2 = bool1;
      label80:
      bool1 = bool3 & bool2;
      if (!bool1) {
        break label174;
      }
      localObject1 = this.mTitle;
      label95:
      setText((CharSequence)localObject1);
      localObject1 = this.mItemData.getContentDescription();
      bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool2) {
        break label195;
      }
      if (!bool1) {
        break label183;
      }
      bool3 = false;
      localObject1 = null;
      label130:
      setContentDescription((CharSequence)localObject1);
      label136:
      localObject1 = this.mItemData.getTooltipText();
      bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool2) {
        break label219;
      }
      if (!bool1) {
        break label204;
      }
      label159:
      TooltipCompat.setTooltipText(this, localCharSequence);
    }
    for (;;)
    {
      return;
      bool3 = false;
      localObject1 = null;
      break;
      label174:
      bool3 = false;
      localObject1 = null;
      break label95;
      label183:
      localObject1 = this.mItemData.getTitle();
      break label130;
      label195:
      setContentDescription((CharSequence)localObject1);
      break label136;
      label204:
      localObject1 = this.mItemData;
      localCharSequence = ((MenuItemImpl)localObject1).getTitle();
      break label159;
      label219:
      TooltipCompat.setTooltipText(this, (CharSequence)localObject1);
    }
  }
  
  public MenuItemImpl getItemData()
  {
    return this.mItemData;
  }
  
  public boolean hasText()
  {
    CharSequence localCharSequence = getText();
    boolean bool = TextUtils.isEmpty(localCharSequence);
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCharSequence = null;
    }
  }
  
  public void initialize(MenuItemImpl paramMenuItemImpl, int paramInt)
  {
    this.mItemData = paramMenuItemImpl;
    Object localObject = paramMenuItemImpl.getIcon();
    setIcon((Drawable)localObject);
    localObject = paramMenuItemImpl.getTitleForItemView(this);
    setTitle((CharSequence)localObject);
    int i = paramMenuItemImpl.getItemId();
    setId(i);
    int j = paramMenuItemImpl.isVisible();
    if (j != 0)
    {
      j = 0;
      localObject = null;
    }
    for (;;)
    {
      setVisibility(j);
      boolean bool = paramMenuItemImpl.isEnabled();
      setEnabled(bool);
      bool = paramMenuItemImpl.hasSubMenu();
      if (bool)
      {
        localObject = this.mForwardingListener;
        if (localObject == null)
        {
          localObject = new android/support/v7/view/menu/ActionMenuItemView$ActionMenuItemForwardingListener;
          ((ActionMenuItemView.ActionMenuItemForwardingListener)localObject).<init>(this);
          this.mForwardingListener = ((ForwardingListener)localObject);
        }
      }
      return;
      int k = 8;
    }
  }
  
  public boolean needsDividerAfter()
  {
    return hasText();
  }
  
  public boolean needsDividerBefore()
  {
    boolean bool = hasText();
    Drawable localDrawable;
    if (bool)
    {
      localDrawable = this.mItemData.getIcon();
      if (localDrawable == null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
  
  public void onClick(View paramView)
  {
    MenuBuilder.ItemInvoker localItemInvoker = this.mItemInvoker;
    if (localItemInvoker != null)
    {
      localItemInvoker = this.mItemInvoker;
      MenuItemImpl localMenuItemImpl = this.mItemData;
      localItemInvoker.invokeItem(localMenuItemImpl);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    boolean bool = shouldAllowTextWithIcon();
    this.mAllowTextWithIcon = bool;
    updateTextButtonVisibility();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1073741824;
    boolean bool = hasText();
    if (bool)
    {
      k = this.mSavedPaddingLeft;
      if (k >= 0)
      {
        k = this.mSavedPaddingLeft;
        m = getPaddingTop();
        n = getPaddingRight();
        i1 = getPaddingBottom();
        super.setPadding(k, m, n, i1);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    int m = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getSize(paramInt1);
    int n = getMeasuredWidth();
    int i1 = -1 << -1;
    if (m == i1) {
      i1 = this.mMinWidth;
    }
    for (k = Math.min(k, i1);; k = this.mMinWidth)
    {
      if (m != i)
      {
        m = this.mMinWidth;
        if ((m > 0) && (n < k))
        {
          k = View.MeasureSpec.makeMeasureSpec(k, i);
          super.onMeasure(k, paramInt2);
        }
      }
      if (!bool)
      {
        Drawable localDrawable = this.mIcon;
        if (localDrawable != null)
        {
          k = getMeasuredWidth();
          Rect localRect = this.mIcon.getBounds();
          int j = localRect.width();
          k = (k - j) / 2;
          j = getPaddingTop();
          m = getPaddingRight();
          n = getPaddingBottom();
          super.setPadding(k, j, m, n);
        }
      }
      return;
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    super.onRestoreInstanceState(null);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    Object localObject = this.mItemData;
    boolean bool = ((MenuItemImpl)localObject).hasSubMenu();
    if (bool)
    {
      localObject = this.mForwardingListener;
      if (localObject != null)
      {
        localObject = this.mForwardingListener;
        bool = ((ForwardingListener)localObject).onTouch(this, paramMotionEvent);
        if (!bool) {}
      }
    }
    for (bool = true;; bool = super.onTouchEvent(paramMotionEvent)) {
      return bool;
    }
  }
  
  public boolean prefersCondensedTitle()
  {
    return true;
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean)
  {
    boolean bool = this.mExpandedFormat;
    if (bool != paramBoolean)
    {
      this.mExpandedFormat = paramBoolean;
      MenuItemImpl localMenuItemImpl = this.mItemData;
      if (localMenuItemImpl != null)
      {
        localMenuItemImpl = this.mItemData;
        localMenuItemImpl.actionFormatChanged();
      }
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.mIcon = paramDrawable;
    if (paramDrawable != null)
    {
      int i = paramDrawable.getIntrinsicWidth();
      int j = paramDrawable.getIntrinsicHeight();
      int k = this.mMaxIconSize;
      float f1;
      float f2;
      float f3;
      if (i > k)
      {
        k = this.mMaxIconSize;
        f1 = k;
        f2 = i;
        f1 /= f2;
        i = this.mMaxIconSize;
        f3 = j * f1;
        j = (int)f3;
      }
      k = this.mMaxIconSize;
      if (j > k)
      {
        k = this.mMaxIconSize;
        f1 = k;
        f3 = j;
        f1 /= f3;
        j = this.mMaxIconSize;
        f2 = i * f1;
        i = (int)f2;
      }
      paramDrawable.setBounds(0, 0, i, j);
    }
    setCompoundDrawables(paramDrawable, null, null, null);
    updateTextButtonVisibility();
  }
  
  public void setItemInvoker(MenuBuilder.ItemInvoker paramItemInvoker)
  {
    this.mItemInvoker = paramItemInvoker;
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mSavedPaddingLeft = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(ActionMenuItemView.PopupCallback paramPopupCallback)
  {
    this.mPopupCallback = paramPopupCallback;
  }
  
  public void setShortcut(boolean paramBoolean, char paramChar) {}
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.mTitle = paramCharSequence;
    updateTextButtonVisibility();
  }
  
  public boolean showsIcon()
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\ActionMenuItemView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */