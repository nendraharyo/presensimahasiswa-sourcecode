package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView
  extends LinearLayout
  implements MenuView.ItemView
{
  private static final String TAG = "ListMenuItemView";
  private Drawable mBackground;
  private CheckBox mCheckBox;
  private boolean mForceShowIcon;
  private ImageView mIconView;
  private LayoutInflater mInflater;
  private MenuItemImpl mItemData;
  private int mMenuType;
  private boolean mPreserveIconSpacing;
  private RadioButton mRadioButton;
  private TextView mShortcutView;
  private Drawable mSubMenuArrow;
  private ImageView mSubMenuArrowView;
  private int mTextAppearance;
  private Context mTextAppearanceContext;
  private TextView mTitleView;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    Object localObject1 = getContext();
    Object localObject2 = R.styleable.MenuView;
    localObject1 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    int i = R.styleable.MenuView_android_itemBackground;
    localObject2 = ((TintTypedArray)localObject1).getDrawable(i);
    this.mBackground = ((Drawable)localObject2);
    i = R.styleable.MenuView_android_itemTextAppearance;
    i = ((TintTypedArray)localObject1).getResourceId(i, -1);
    this.mTextAppearance = i;
    i = R.styleable.MenuView_preserveIconSpacing;
    boolean bool = ((TintTypedArray)localObject1).getBoolean(i, false);
    this.mPreserveIconSpacing = bool;
    this.mTextAppearanceContext = paramContext;
    int j = R.styleable.MenuView_subMenuArrow;
    localObject2 = ((TintTypedArray)localObject1).getDrawable(j);
    this.mSubMenuArrow = ((Drawable)localObject2);
    ((TintTypedArray)localObject1).recycle();
  }
  
  private LayoutInflater getInflater()
  {
    LayoutInflater localLayoutInflater = this.mInflater;
    if (localLayoutInflater == null)
    {
      localLayoutInflater = LayoutInflater.from(getContext());
      this.mInflater = localLayoutInflater;
    }
    return this.mInflater;
  }
  
  private void insertCheckBox()
  {
    Object localObject = getInflater();
    int i = R.layout.abc_list_menu_item_checkbox;
    localObject = (CheckBox)((LayoutInflater)localObject).inflate(i, this, false);
    this.mCheckBox = ((CheckBox)localObject);
    localObject = this.mCheckBox;
    addView((View)localObject);
  }
  
  private void insertIconView()
  {
    Object localObject = getInflater();
    int i = R.layout.abc_list_menu_item_icon;
    localObject = (ImageView)((LayoutInflater)localObject).inflate(i, this, false);
    this.mIconView = ((ImageView)localObject);
    localObject = this.mIconView;
    addView((View)localObject, 0);
  }
  
  private void insertRadioButton()
  {
    Object localObject = getInflater();
    int i = R.layout.abc_list_menu_item_radio;
    localObject = (RadioButton)((LayoutInflater)localObject).inflate(i, this, false);
    this.mRadioButton = ((RadioButton)localObject);
    localObject = this.mRadioButton;
    addView((View)localObject);
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean)
  {
    ImageView localImageView1 = this.mSubMenuArrowView;
    ImageView localImageView2;
    int i;
    if (localImageView1 != null)
    {
      localImageView2 = this.mSubMenuArrowView;
      if (!paramBoolean) {
        break label30;
      }
      i = 0;
      localImageView1 = null;
    }
    for (;;)
    {
      localImageView2.setVisibility(i);
      return;
      label30:
      i = 8;
    }
  }
  
  public MenuItemImpl getItemData()
  {
    return this.mItemData;
  }
  
  public void initialize(MenuItemImpl paramMenuItemImpl, int paramInt)
  {
    this.mItemData = paramMenuItemImpl;
    this.mMenuType = paramInt;
    int i = paramMenuItemImpl.isVisible();
    Object localObject;
    if (i != 0)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      setVisibility(i);
      localObject = paramMenuItemImpl.getTitleForItemView(this);
      setTitle((CharSequence)localObject);
      boolean bool = paramMenuItemImpl.isCheckable();
      setCheckable(bool);
      bool = paramMenuItemImpl.shouldShowShortcut();
      char c = paramMenuItemImpl.getShortcut();
      setShortcut(bool, c);
      localObject = paramMenuItemImpl.getIcon();
      setIcon((Drawable)localObject);
      bool = paramMenuItemImpl.isEnabled();
      setEnabled(bool);
      bool = paramMenuItemImpl.hasSubMenu();
      setSubMenuArrowVisible(bool);
      localObject = paramMenuItemImpl.getContentDescription();
      setContentDescription((CharSequence)localObject);
      return;
      int j = 8;
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    Object localObject1 = this.mBackground;
    r.a(this, (Drawable)localObject1);
    int i = R.id.title;
    localObject1 = (TextView)findViewById(i);
    this.mTitleView = ((TextView)localObject1);
    i = this.mTextAppearance;
    int j = -1;
    Object localObject2;
    if (i != j)
    {
      localObject1 = this.mTitleView;
      localObject2 = this.mTextAppearanceContext;
      int k = this.mTextAppearance;
      ((TextView)localObject1).setTextAppearance((Context)localObject2, k);
    }
    i = R.id.shortcut;
    localObject1 = (TextView)findViewById(i);
    this.mShortcutView = ((TextView)localObject1);
    i = R.id.submenuarrow;
    localObject1 = (ImageView)findViewById(i);
    this.mSubMenuArrowView = ((ImageView)localObject1);
    localObject1 = this.mSubMenuArrowView;
    if (localObject1 != null)
    {
      localObject1 = this.mSubMenuArrowView;
      localObject2 = this.mSubMenuArrow;
      ((ImageView)localObject1).setImageDrawable((Drawable)localObject2);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject = this.mIconView;
    if (localObject != null)
    {
      boolean bool = this.mPreserveIconSpacing;
      if (bool)
      {
        ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
        localObject = (LinearLayout.LayoutParams)this.mIconView.getLayoutParams();
        int i = localLayoutParams.height;
        if (i > 0)
        {
          i = ((LinearLayout.LayoutParams)localObject).width;
          if (i <= 0)
          {
            int j = localLayoutParams.height;
            ((LinearLayout.LayoutParams)localObject).width = j;
          }
        }
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public boolean prefersCondensedTitle()
  {
    return false;
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    int i = 8;
    Object localObject1;
    if (!paramBoolean)
    {
      localObject1 = this.mRadioButton;
      if (localObject1 == null)
      {
        localObject1 = this.mCheckBox;
        if (localObject1 != null) {}
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.mItemData;
      int j = ((MenuItemImpl)localObject1).isExclusiveCheckable();
      Object localObject2;
      Object localObject3;
      if (j != 0)
      {
        localObject1 = this.mRadioButton;
        if (localObject1 == null) {
          insertRadioButton();
        }
        localObject2 = this.mRadioButton;
        localObject1 = this.mCheckBox;
        localObject3 = localObject2;
        localObject2 = localObject1;
        label73:
        if (!paramBoolean) {
          break label192;
        }
        localObject1 = this.mItemData;
        j = ((MenuItemImpl)localObject1).isChecked();
        ((CompoundButton)localObject3).setChecked(j);
        if (!paramBoolean) {
          break label186;
        }
        j = 0;
        localObject1 = null;
      }
      for (;;)
      {
        int m = ((CompoundButton)localObject3).getVisibility();
        if (m != j) {
          ((CompoundButton)localObject3).setVisibility(j);
        }
        if (localObject2 == null) {
          break;
        }
        int k = ((CompoundButton)localObject2).getVisibility();
        if (k == i) {
          break;
        }
        ((CompoundButton)localObject2).setVisibility(i);
        break;
        localObject1 = this.mCheckBox;
        if (localObject1 == null) {
          insertCheckBox();
        }
        localObject2 = this.mCheckBox;
        localObject1 = this.mRadioButton;
        localObject3 = localObject2;
        localObject2 = localObject1;
        break label73;
        label186:
        k = i;
      }
      label192:
      localObject1 = this.mCheckBox;
      if (localObject1 != null)
      {
        localObject1 = this.mCheckBox;
        ((CheckBox)localObject1).setVisibility(i);
      }
      localObject1 = this.mRadioButton;
      if (localObject1 != null)
      {
        localObject1 = this.mRadioButton;
        ((RadioButton)localObject1).setVisibility(i);
      }
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    Object localObject = this.mItemData;
    boolean bool = ((MenuItemImpl)localObject).isExclusiveCheckable();
    if (bool)
    {
      localObject = this.mRadioButton;
      if (localObject == null) {
        insertRadioButton();
      }
    }
    for (localObject = this.mRadioButton;; localObject = this.mCheckBox)
    {
      ((CompoundButton)localObject).setChecked(paramBoolean);
      return;
      localObject = this.mCheckBox;
      if (localObject == null) {
        insertCheckBox();
      }
    }
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.mForceShowIcon = paramBoolean;
    this.mPreserveIconSpacing = paramBoolean;
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    int i = 0;
    Object localObject = this.mItemData;
    boolean bool1 = ((MenuItemImpl)localObject).shouldShowIcon();
    boolean bool2;
    if (!bool1)
    {
      bool1 = this.mForceShowIcon;
      if (!bool1) {}
    }
    else
    {
      bool1 = true;
      if (bool1) {
        break label57;
      }
      bool2 = this.mPreserveIconSpacing;
      if (bool2) {
        break label57;
      }
    }
    for (;;)
    {
      return;
      bool1 = false;
      localObject = null;
      break;
      label57:
      ImageView localImageView = this.mIconView;
      if ((localImageView == null) && (paramDrawable == null))
      {
        bool2 = this.mPreserveIconSpacing;
        if (!bool2) {}
      }
      else
      {
        localImageView = this.mIconView;
        if (localImageView == null) {
          insertIconView();
        }
        if (paramDrawable == null)
        {
          bool2 = this.mPreserveIconSpacing;
          if (!bool2) {}
        }
        else
        {
          localImageView = this.mIconView;
          if (bool1) {}
          for (;;)
          {
            localImageView.setImageDrawable(paramDrawable);
            localObject = this.mIconView;
            int j = ((ImageView)localObject).getVisibility();
            if (j == 0) {
              break;
            }
            localObject = this.mIconView;
            ((ImageView)localObject).setVisibility(0);
            break;
            paramDrawable = null;
          }
        }
        localObject = this.mIconView;
        i = 8;
        ((ImageView)localObject).setVisibility(i);
      }
    }
  }
  
  public void setShortcut(boolean paramBoolean, char paramChar)
  {
    int i;
    if (paramBoolean)
    {
      MenuItemImpl localMenuItemImpl = this.mItemData;
      i = localMenuItemImpl.shouldShowShortcut();
      if (i != 0)
      {
        i = 0;
        localMenuItemImpl = null;
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        localTextView = this.mShortcutView;
        String str = this.mItemData.getShortcutLabel();
        localTextView.setText(str);
      }
      TextView localTextView = this.mShortcutView;
      int k = localTextView.getVisibility();
      if (k != i)
      {
        localTextView = this.mShortcutView;
        localTextView.setVisibility(i);
      }
      return;
      int j = 8;
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    int i = 8;
    TextView localTextView;
    int j;
    if (paramCharSequence != null)
    {
      this.mTitleView.setText(paramCharSequence);
      localTextView = this.mTitleView;
      j = localTextView.getVisibility();
      if (j != 0)
      {
        localTextView = this.mTitleView;
        i = 0;
        localTextView.setVisibility(0);
      }
    }
    for (;;)
    {
      return;
      localTextView = this.mTitleView;
      j = localTextView.getVisibility();
      if (j != i)
      {
        localTextView = this.mTitleView;
        localTextView.setVisibility(i);
      }
    }
  }
  
  public boolean showsIcon()
  {
    return this.mForceShowIcon;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\ListMenuItemView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */