package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.b.a.a;
import android.support.v7.content.res.AppCompatResources;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;

public final class MenuItemImpl
  implements android.support.v4.d.a.b
{
  private static final int CHECKABLE = 1;
  private static final int CHECKED = 2;
  private static final int ENABLED = 16;
  private static final int EXCLUSIVE = 4;
  private static final int HIDDEN = 8;
  private static final int IS_ACTION = 32;
  static final int NO_ICON = 0;
  private static final int SHOW_AS_ACTION_MASK = 3;
  private static final String TAG = "MenuItemImpl";
  private static String sDeleteShortcutLabel;
  private static String sEnterShortcutLabel;
  private static String sPrependShortcutLabel;
  private static String sSpaceShortcutLabel;
  private android.support.v4.view.b mActionProvider;
  private View mActionView;
  private final int mCategoryOrder;
  private MenuItem.OnMenuItemClickListener mClickListener;
  private CharSequence mContentDescription;
  private int mFlags;
  private final int mGroup;
  private boolean mHasIconTint;
  private boolean mHasIconTintMode;
  private Drawable mIconDrawable;
  private int mIconResId;
  private ColorStateList mIconTintList;
  private PorterDuff.Mode mIconTintMode;
  private final int mId;
  private Intent mIntent;
  private boolean mIsActionViewExpanded;
  private Runnable mItemCallback;
  MenuBuilder mMenu;
  private ContextMenu.ContextMenuInfo mMenuInfo;
  private boolean mNeedToApplyIconTint;
  private MenuItem.OnActionExpandListener mOnActionExpandListener;
  private final int mOrdering;
  private char mShortcutAlphabeticChar;
  private int mShortcutAlphabeticModifiers;
  private char mShortcutNumericChar;
  private int mShortcutNumericModifiers;
  private int mShowAsAction;
  private SubMenuBuilder mSubMenu;
  private CharSequence mTitle;
  private CharSequence mTitleCondensed;
  private CharSequence mTooltipText;
  
  MenuItemImpl(MenuBuilder paramMenuBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    this.mShortcutNumericModifiers = i;
    this.mShortcutAlphabeticModifiers = i;
    this.mIconResId = 0;
    this.mIconTintList = null;
    this.mIconTintMode = null;
    this.mHasIconTint = false;
    this.mHasIconTintMode = false;
    this.mNeedToApplyIconTint = false;
    this.mFlags = 16;
    this.mShowAsAction = 0;
    this.mIsActionViewExpanded = false;
    this.mMenu = paramMenuBuilder;
    this.mId = paramInt2;
    this.mGroup = paramInt1;
    this.mCategoryOrder = paramInt3;
    this.mOrdering = paramInt4;
    this.mTitle = paramCharSequence;
    this.mShowAsAction = paramInt5;
  }
  
  private Drawable applyIconTintIfNecessary(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      boolean bool = this.mNeedToApplyIconTint;
      if (bool)
      {
        bool = this.mHasIconTint;
        if (!bool)
        {
          bool = this.mHasIconTintMode;
          if (!bool) {}
        }
        else
        {
          Object localObject = a.g(paramDrawable);
          paramDrawable = ((Drawable)localObject).mutate();
          bool = this.mHasIconTint;
          if (bool)
          {
            localObject = this.mIconTintList;
            a.a(paramDrawable, (ColorStateList)localObject);
          }
          bool = this.mHasIconTintMode;
          if (bool)
          {
            localObject = this.mIconTintMode;
            a.a(paramDrawable, (PorterDuff.Mode)localObject);
          }
          bool = false;
          localObject = null;
          this.mNeedToApplyIconTint = false;
        }
      }
    }
    return paramDrawable;
  }
  
  public void actionFormatChanged()
  {
    this.mMenu.onItemActionRequestChanged(this);
  }
  
  public boolean collapseActionView()
  {
    boolean bool1 = false;
    MenuBuilder localMenuBuilder = null;
    int i = this.mShowAsAction & 0x8;
    if (i == 0) {}
    for (;;)
    {
      return bool1;
      Object localObject = this.mActionView;
      if (localObject == null)
      {
        bool1 = true;
      }
      else
      {
        localObject = this.mOnActionExpandListener;
        if (localObject != null)
        {
          localObject = this.mOnActionExpandListener;
          boolean bool2 = ((MenuItem.OnActionExpandListener)localObject).onMenuItemActionCollapse(this);
          if (!bool2) {}
        }
        else
        {
          localMenuBuilder = this.mMenu;
          bool1 = localMenuBuilder.collapseItemActionView(this);
        }
      }
    }
  }
  
  public boolean expandActionView()
  {
    boolean bool1 = false;
    MenuBuilder localMenuBuilder = null;
    boolean bool2 = hasCollapsibleActionView();
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      MenuItem.OnActionExpandListener localOnActionExpandListener = this.mOnActionExpandListener;
      if (localOnActionExpandListener != null)
      {
        localOnActionExpandListener = this.mOnActionExpandListener;
        bool2 = localOnActionExpandListener.onMenuItemActionExpand(this);
        if (!bool2) {}
      }
      else
      {
        localMenuBuilder = this.mMenu;
        bool1 = localMenuBuilder.expandItemActionView(this);
      }
    }
  }
  
  public ActionProvider getActionProvider()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("This is not supported, use MenuItemCompat.getActionProvider()");
    throw localUnsupportedOperationException;
  }
  
  public View getActionView()
  {
    Object localObject = this.mActionView;
    if (localObject != null) {
      localObject = this.mActionView;
    }
    for (;;)
    {
      return (View)localObject;
      localObject = this.mActionProvider;
      if (localObject != null)
      {
        localObject = this.mActionProvider.onCreateActionView(this);
        this.mActionView = ((View)localObject);
        localObject = this.mActionView;
      }
      else
      {
        localObject = null;
      }
    }
  }
  
  public int getAlphabeticModifiers()
  {
    return this.mShortcutAlphabeticModifiers;
  }
  
  public char getAlphabeticShortcut()
  {
    return this.mShortcutAlphabeticChar;
  }
  
  Runnable getCallback()
  {
    return this.mItemCallback;
  }
  
  public CharSequence getContentDescription()
  {
    return this.mContentDescription;
  }
  
  public int getGroupId()
  {
    return this.mGroup;
  }
  
  public Drawable getIcon()
  {
    Object localObject = this.mIconDrawable;
    if (localObject != null)
    {
      localObject = this.mIconDrawable;
      localObject = applyIconTintIfNecessary((Drawable)localObject);
    }
    for (;;)
    {
      return (Drawable)localObject;
      int i = this.mIconResId;
      if (i != 0)
      {
        localObject = this.mMenu.getContext();
        int j = this.mIconResId;
        localObject = AppCompatResources.getDrawable((Context)localObject, j);
        j = 0;
        this.mIconResId = 0;
        this.mIconDrawable = ((Drawable)localObject);
        localObject = applyIconTintIfNecessary((Drawable)localObject);
      }
      else
      {
        i = 0;
        localObject = null;
      }
    }
  }
  
  public ColorStateList getIconTintList()
  {
    return this.mIconTintList;
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return this.mIconTintMode;
  }
  
  public Intent getIntent()
  {
    return this.mIntent;
  }
  
  public int getItemId()
  {
    return this.mId;
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.mMenuInfo;
  }
  
  public int getNumericModifiers()
  {
    return this.mShortcutNumericModifiers;
  }
  
  public char getNumericShortcut()
  {
    return this.mShortcutNumericChar;
  }
  
  public int getOrder()
  {
    return this.mCategoryOrder;
  }
  
  public int getOrdering()
  {
    return this.mOrdering;
  }
  
  char getShortcut()
  {
    MenuBuilder localMenuBuilder = this.mMenu;
    boolean bool = localMenuBuilder.isQwertyMode();
    if (bool) {}
    for (char c = this.mShortcutAlphabeticChar;; c = this.mShortcutNumericChar) {
      return c;
    }
  }
  
  String getShortcutLabel()
  {
    char c = getShortcut();
    String str1;
    if (c == 0)
    {
      str1 = "";
      return str1;
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    String str2 = sPrependShortcutLabel;
    localStringBuilder.<init>(str2);
    switch (c)
    {
    default: 
      localStringBuilder.append(c);
    }
    for (;;)
    {
      str1 = localStringBuilder.toString();
      break;
      str1 = sEnterShortcutLabel;
      localStringBuilder.append(str1);
      continue;
      str1 = sDeleteShortcutLabel;
      localStringBuilder.append(str1);
      continue;
      str1 = sSpaceShortcutLabel;
      localStringBuilder.append(str1);
    }
  }
  
  public SubMenu getSubMenu()
  {
    return this.mSubMenu;
  }
  
  public android.support.v4.view.b getSupportActionProvider()
  {
    return this.mActionProvider;
  }
  
  public CharSequence getTitle()
  {
    return this.mTitle;
  }
  
  public CharSequence getTitleCondensed()
  {
    Object localObject = this.mTitleCondensed;
    if (localObject != null) {}
    for (localObject = this.mTitleCondensed;; localObject = this.mTitle)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 18;
      if ((i < j) && (localObject != null))
      {
        boolean bool = localObject instanceof String;
        if (!bool) {
          localObject = ((CharSequence)localObject).toString();
        }
      }
      return (CharSequence)localObject;
    }
  }
  
  CharSequence getTitleForItemView(MenuView.ItemView paramItemView)
  {
    if (paramItemView != null)
    {
      boolean bool = paramItemView.prefersCondensedTitle();
      if (!bool) {}
    }
    for (CharSequence localCharSequence = getTitleCondensed();; localCharSequence = getTitle()) {
      return localCharSequence;
    }
  }
  
  public CharSequence getTooltipText()
  {
    return this.mTooltipText;
  }
  
  public boolean hasCollapsibleActionView()
  {
    boolean bool = false;
    int i = this.mShowAsAction & 0x8;
    if (i != 0)
    {
      Object localObject = this.mActionView;
      if (localObject == null)
      {
        localObject = this.mActionProvider;
        if (localObject != null)
        {
          localObject = this.mActionProvider.onCreateActionView(this);
          this.mActionView = ((View)localObject);
        }
      }
      localObject = this.mActionView;
      if (localObject != null) {
        bool = true;
      }
    }
    return bool;
  }
  
  public boolean hasSubMenu()
  {
    SubMenuBuilder localSubMenuBuilder = this.mSubMenu;
    boolean bool;
    if (localSubMenuBuilder != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localSubMenuBuilder = null;
    }
  }
  
  public boolean invoke()
  {
    boolean bool1 = true;
    Object localObject1 = this.mClickListener;
    boolean bool2;
    if (localObject1 != null)
    {
      localObject1 = this.mClickListener;
      bool2 = ((MenuItem.OnMenuItemClickListener)localObject1).onMenuItemClick(this);
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      localObject1 = this.mMenu;
      Object localObject2 = this.mMenu;
      bool2 = ((MenuBuilder)localObject1).dispatchMenuItemSelected((MenuBuilder)localObject2, this);
      if (!bool2)
      {
        localObject1 = this.mItemCallback;
        if (localObject1 != null)
        {
          localObject1 = this.mItemCallback;
          ((Runnable)localObject1).run();
        }
        else
        {
          localObject1 = this.mIntent;
          if (localObject1 != null)
          {
            try
            {
              localObject1 = this.mMenu;
              localObject1 = ((MenuBuilder)localObject1).getContext();
              localObject2 = this.mIntent;
              ((Context)localObject1).startActivity((Intent)localObject2);
            }
            catch (ActivityNotFoundException localActivityNotFoundException)
            {
              localObject2 = "MenuItemImpl";
              String str = "Can't find activity to handle intent; ignoring";
              Log.e((String)localObject2, str, localActivityNotFoundException);
            }
          }
          else
          {
            android.support.v4.view.b localb = this.mActionProvider;
            if (localb != null)
            {
              localb = this.mActionProvider;
              bool2 = localb.onPerformDefaultAction();
              if (bool2) {}
            }
            else
            {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public boolean isActionButton()
  {
    int i = this.mFlags & 0x20;
    int k = 32;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isActionViewExpanded()
  {
    return this.mIsActionViewExpanded;
  }
  
  public boolean isCheckable()
  {
    int i = 1;
    int j = this.mFlags & 0x1;
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public boolean isChecked()
  {
    int i = this.mFlags & 0x2;
    int k = 2;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isEnabled()
  {
    int i = this.mFlags & 0x10;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isExclusiveCheckable()
  {
    int i = this.mFlags & 0x4;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isVisible()
  {
    boolean bool1 = true;
    android.support.v4.view.b localb = this.mActionProvider;
    if (localb != null)
    {
      localb = this.mActionProvider;
      boolean bool2 = localb.overridesItemVisibility();
      if (bool2)
      {
        int i = this.mFlags & 0x8;
        if (i == 0)
        {
          localb = this.mActionProvider;
          boolean bool3 = localb.isVisible();
          if (!bool3) {}
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      continue;
      int j = this.mFlags & 0x8;
      if (j != 0) {
        bool1 = false;
      }
    }
  }
  
  public boolean requestsActionButton()
  {
    int i = 1;
    int j = this.mShowAsAction & 0x1;
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public boolean requiresActionButton()
  {
    int i = this.mShowAsAction & 0x2;
    int k = 2;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("This is not supported, use MenuItemCompat.setActionProvider()");
    throw localUnsupportedOperationException;
  }
  
  public android.support.v4.d.a.b setActionView(int paramInt)
  {
    Object localObject = this.mMenu.getContext();
    LayoutInflater localLayoutInflater = LayoutInflater.from((Context)localObject);
    LinearLayout localLinearLayout = new android/widget/LinearLayout;
    localLinearLayout.<init>((Context)localObject);
    localObject = localLayoutInflater.inflate(paramInt, localLinearLayout, false);
    setActionView((View)localObject);
    return this;
  }
  
  public android.support.v4.d.a.b setActionView(View paramView)
  {
    this.mActionView = paramView;
    int i = 0;
    this.mActionProvider = null;
    if (paramView != null)
    {
      i = paramView.getId();
      int j = -1;
      if (i == j)
      {
        i = this.mId;
        if (i > 0)
        {
          i = this.mId;
          paramView.setId(i);
        }
      }
    }
    this.mMenu.onItemActionRequestChanged(this);
    return this;
  }
  
  public void setActionViewExpanded(boolean paramBoolean)
  {
    this.mIsActionViewExpanded = paramBoolean;
    this.mMenu.onItemsChanged(false);
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    char c = this.mShortcutAlphabeticChar;
    if (c == paramChar) {}
    for (;;)
    {
      return this;
      c = Character.toLowerCase(paramChar);
      this.mShortcutAlphabeticChar = c;
      MenuBuilder localMenuBuilder = this.mMenu;
      localMenuBuilder.onItemsChanged(false);
    }
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    char c = this.mShortcutAlphabeticChar;
    if (c == paramChar)
    {
      c = this.mShortcutAlphabeticModifiers;
      if (c != paramInt) {}
    }
    for (;;)
    {
      return this;
      c = Character.toLowerCase(paramChar);
      this.mShortcutAlphabeticChar = c;
      c = KeyEvent.normalizeMetaState(paramInt);
      this.mShortcutAlphabeticModifiers = c;
      MenuBuilder localMenuBuilder = this.mMenu;
      localMenuBuilder.onItemsChanged(false);
    }
  }
  
  public MenuItem setCallback(Runnable paramRunnable)
  {
    this.mItemCallback = paramRunnable;
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    int i = this.mFlags;
    int j = this.mFlags;
    int k = j & 0xFFFFFFFE;
    if (paramBoolean) {
      j = 1;
    }
    for (;;)
    {
      j |= k;
      this.mFlags = j;
      j = this.mFlags;
      if (i != j)
      {
        localMenuBuilder = this.mMenu;
        localMenuBuilder.onItemsChanged(false);
      }
      return this;
      j = 0;
      MenuBuilder localMenuBuilder = null;
    }
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    int i = this.mFlags & 0x4;
    if (i != 0)
    {
      MenuBuilder localMenuBuilder = this.mMenu;
      localMenuBuilder.setExclusiveItemChecked(this);
    }
    for (;;)
    {
      return this;
      setCheckedInt(paramBoolean);
    }
  }
  
  void setCheckedInt(boolean paramBoolean)
  {
    int i = this.mFlags;
    int j = this.mFlags;
    int k = j & 0xFFFFFFFD;
    if (paramBoolean) {
      j = 2;
    }
    for (;;)
    {
      j |= k;
      this.mFlags = j;
      j = this.mFlags;
      if (i != j)
      {
        localMenuBuilder = this.mMenu;
        localMenuBuilder.onItemsChanged(false);
      }
      return;
      j = 0;
      MenuBuilder localMenuBuilder = null;
    }
  }
  
  public android.support.v4.d.a.b setContentDescription(CharSequence paramCharSequence)
  {
    this.mContentDescription = paramCharSequence;
    this.mMenu.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = this.mFlags | 0x10;
    }
    for (this.mFlags = i;; this.mFlags = i)
    {
      this.mMenu.onItemsChanged(false);
      return this;
      i = this.mFlags & 0xFFFFFFEF;
    }
  }
  
  public void setExclusiveCheckable(boolean paramBoolean)
  {
    int i = this.mFlags;
    int j = i & 0xFFFFFFFB;
    if (paramBoolean) {}
    for (i = 4;; i = 0)
    {
      i |= j;
      this.mFlags = i;
      return;
    }
  }
  
  public MenuItem setIcon(int paramInt)
  {
    this.mIconDrawable = null;
    this.mIconResId = paramInt;
    this.mNeedToApplyIconTint = true;
    this.mMenu.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    this.mIconResId = 0;
    this.mIconDrawable = paramDrawable;
    this.mNeedToApplyIconTint = true;
    this.mMenu.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    boolean bool = true;
    this.mIconTintList = paramColorStateList;
    this.mHasIconTint = bool;
    this.mNeedToApplyIconTint = bool;
    this.mMenu.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    boolean bool = true;
    this.mIconTintMode = paramMode;
    this.mHasIconTintMode = bool;
    this.mNeedToApplyIconTint = bool;
    this.mMenu.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    this.mIntent = paramIntent;
    return this;
  }
  
  public void setIsActionButton(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = this.mFlags | 0x20;
    }
    for (this.mFlags = i;; this.mFlags = i)
    {
      return;
      i = this.mFlags & 0xFFFFFFDF;
    }
  }
  
  void setMenuInfo(ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.mMenuInfo = paramContextMenuInfo;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    char c = this.mShortcutNumericChar;
    if (c == paramChar) {}
    for (;;)
    {
      return this;
      this.mShortcutNumericChar = paramChar;
      MenuBuilder localMenuBuilder = this.mMenu;
      localMenuBuilder.onItemsChanged(false);
    }
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    char c = this.mShortcutNumericChar;
    if (c == paramChar)
    {
      c = this.mShortcutNumericModifiers;
      if (c != paramInt) {}
    }
    for (;;)
    {
      return this;
      this.mShortcutNumericChar = paramChar;
      c = KeyEvent.normalizeMetaState(paramInt);
      this.mShortcutNumericModifiers = c;
      MenuBuilder localMenuBuilder = this.mMenu;
      localMenuBuilder.onItemsChanged(false);
    }
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    this.mOnActionExpandListener = paramOnActionExpandListener;
    return this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mClickListener = paramOnMenuItemClickListener;
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.mShortcutNumericChar = paramChar1;
    char c = Character.toLowerCase(paramChar2);
    this.mShortcutAlphabeticChar = c;
    this.mMenu.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    this.mShortcutNumericChar = paramChar1;
    int i = KeyEvent.normalizeMetaState(paramInt1);
    this.mShortcutNumericModifiers = i;
    i = Character.toLowerCase(paramChar2);
    this.mShortcutAlphabeticChar = i;
    i = KeyEvent.normalizeMetaState(paramInt2);
    this.mShortcutAlphabeticModifiers = i;
    this.mMenu.onItemsChanged(false);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    int i = paramInt & 0x3;
    switch (i)
    {
    default: 
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
      throw localIllegalArgumentException;
    }
    this.mShowAsAction = paramInt;
    this.mMenu.onItemActionRequestChanged(this);
  }
  
  public android.support.v4.d.a.b setShowAsActionFlags(int paramInt)
  {
    setShowAsAction(paramInt);
    return this;
  }
  
  public void setSubMenu(SubMenuBuilder paramSubMenuBuilder)
  {
    this.mSubMenu = paramSubMenuBuilder;
    CharSequence localCharSequence = getTitle();
    paramSubMenuBuilder.setHeaderTitle(localCharSequence);
  }
  
  public android.support.v4.d.a.b setSupportActionProvider(android.support.v4.view.b paramb)
  {
    Object localObject = this.mActionProvider;
    if (localObject != null)
    {
      localObject = this.mActionProvider;
      ((android.support.v4.view.b)localObject).reset();
    }
    this.mActionView = null;
    this.mActionProvider = paramb;
    localObject = this.mMenu;
    boolean bool = true;
    ((MenuBuilder)localObject).onItemsChanged(bool);
    localObject = this.mActionProvider;
    if (localObject != null)
    {
      localObject = this.mActionProvider;
      MenuItemImpl.1 local1 = new android/support/v7/view/menu/MenuItemImpl$1;
      local1.<init>(this);
      ((android.support.v4.view.b)localObject).setVisibilityListener(local1);
    }
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    String str = this.mMenu.getContext().getString(paramInt);
    return setTitle(str);
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.mTitle = paramCharSequence;
    this.mMenu.onItemsChanged(false);
    SubMenuBuilder localSubMenuBuilder = this.mSubMenu;
    if (localSubMenuBuilder != null)
    {
      localSubMenuBuilder = this.mSubMenu;
      localSubMenuBuilder.setHeaderTitle(paramCharSequence);
    }
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.mTitleCondensed = paramCharSequence;
    if (paramCharSequence == null) {}
    this.mMenu.onItemsChanged(false);
    return this;
  }
  
  public android.support.v4.d.a.b setTooltipText(CharSequence paramCharSequence)
  {
    this.mTooltipText = paramCharSequence;
    this.mMenu.onItemsChanged(false);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    boolean bool = setVisibleInt(paramBoolean);
    if (bool)
    {
      MenuBuilder localMenuBuilder = this.mMenu;
      localMenuBuilder.onItemVisibleChanged(this);
    }
    return this;
  }
  
  boolean setVisibleInt(boolean paramBoolean)
  {
    boolean bool = false;
    int i = this.mFlags;
    int j = this.mFlags;
    int k = j & 0xFFFFFFF7;
    if (paramBoolean) {}
    for (j = 0;; j = 8)
    {
      j |= k;
      this.mFlags = j;
      j = this.mFlags;
      if (i != j) {
        bool = true;
      }
      return bool;
    }
  }
  
  public boolean shouldShowIcon()
  {
    return this.mMenu.getOptionalIconsVisible();
  }
  
  boolean shouldShowShortcut()
  {
    MenuBuilder localMenuBuilder = this.mMenu;
    boolean bool = localMenuBuilder.isShortcutsVisible();
    int i;
    if (bool)
    {
      i = getShortcut();
      if (i != 0) {
        i = 1;
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      localMenuBuilder = null;
    }
  }
  
  public boolean showsTextAsAction()
  {
    int i = this.mShowAsAction & 0x4;
    int k = 4;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public String toString()
  {
    Object localObject = this.mTitle;
    if (localObject != null) {}
    for (localObject = this.mTitle.toString();; localObject = null) {
      return (String)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuItemImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */