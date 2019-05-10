package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.a;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public class ActionMenuItem
  implements android.support.v4.d.a.b
{
  private static final int CHECKABLE = 1;
  private static final int CHECKED = 2;
  private static final int ENABLED = 16;
  private static final int EXCLUSIVE = 4;
  private static final int HIDDEN = 8;
  private static final int NO_ICON;
  private final int mCategoryOrder;
  private MenuItem.OnMenuItemClickListener mClickListener;
  private CharSequence mContentDescription;
  private Context mContext;
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
  private final int mOrdering;
  private char mShortcutAlphabeticChar;
  private int mShortcutAlphabeticModifiers;
  private char mShortcutNumericChar;
  private int mShortcutNumericModifiers;
  private CharSequence mTitle;
  private CharSequence mTitleCondensed;
  private CharSequence mTooltipText;
  
  public ActionMenuItem(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence)
  {
    this.mShortcutNumericModifiers = i;
    this.mShortcutAlphabeticModifiers = i;
    this.mIconResId = 0;
    this.mIconTintList = null;
    this.mIconTintMode = null;
    this.mHasIconTint = false;
    this.mHasIconTintMode = false;
    this.mFlags = 16;
    this.mContext = paramContext;
    this.mId = paramInt2;
    this.mGroup = paramInt1;
    this.mCategoryOrder = paramInt3;
    this.mOrdering = paramInt4;
    this.mTitle = paramCharSequence;
  }
  
  private void applyIconTint()
  {
    Drawable localDrawable = this.mIconDrawable;
    if (localDrawable != null)
    {
      boolean bool = this.mHasIconTint;
      if (!bool)
      {
        bool = this.mHasIconTintMode;
        if (!bool) {}
      }
      else
      {
        localDrawable = a.g(this.mIconDrawable);
        this.mIconDrawable = localDrawable;
        localDrawable = this.mIconDrawable.mutate();
        this.mIconDrawable = localDrawable;
        bool = this.mHasIconTint;
        Object localObject;
        if (bool)
        {
          localDrawable = this.mIconDrawable;
          localObject = this.mIconTintList;
          a.a(localDrawable, (ColorStateList)localObject);
        }
        bool = this.mHasIconTintMode;
        if (bool)
        {
          localDrawable = this.mIconDrawable;
          localObject = this.mIconTintMode;
          a.a(localDrawable, (PorterDuff.Mode)localObject);
        }
      }
    }
  }
  
  public boolean collapseActionView()
  {
    return false;
  }
  
  public boolean expandActionView()
  {
    return false;
  }
  
  public ActionProvider getActionProvider()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public View getActionView()
  {
    return null;
  }
  
  public int getAlphabeticModifiers()
  {
    return this.mShortcutAlphabeticModifiers;
  }
  
  public char getAlphabeticShortcut()
  {
    return this.mShortcutAlphabeticChar;
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
    return this.mIconDrawable;
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
    return null;
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
    return this.mOrdering;
  }
  
  public SubMenu getSubMenu()
  {
    return null;
  }
  
  public android.support.v4.view.b getSupportActionProvider()
  {
    return null;
  }
  
  public CharSequence getTitle()
  {
    return this.mTitle;
  }
  
  public CharSequence getTitleCondensed()
  {
    CharSequence localCharSequence = this.mTitleCondensed;
    if (localCharSequence != null) {}
    for (localCharSequence = this.mTitleCondensed;; localCharSequence = this.mTitle) {
      return localCharSequence;
    }
  }
  
  public CharSequence getTooltipText()
  {
    return this.mTooltipText;
  }
  
  public boolean hasSubMenu()
  {
    return false;
  }
  
  public boolean invoke()
  {
    boolean bool1 = true;
    Object localObject = this.mClickListener;
    if (localObject != null)
    {
      localObject = this.mClickListener;
      boolean bool2 = ((MenuItem.OnMenuItemClickListener)localObject).onMenuItemClick(this);
      if (!bool2) {}
    }
    for (;;)
    {
      return bool1;
      localObject = this.mIntent;
      if (localObject != null)
      {
        localObject = this.mContext;
        Intent localIntent = this.mIntent;
        ((Context)localObject).startActivity(localIntent);
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public boolean isActionViewExpanded()
  {
    return false;
  }
  
  public boolean isCheckable()
  {
    int i = this.mFlags & 0x1;
    if (i != 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isChecked()
  {
    int i = this.mFlags & 0x2;
    if (i != 0) {}
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
  
  public boolean isVisible()
  {
    int i = this.mFlags & 0x8;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public android.support.v4.d.a.b setActionView(int paramInt)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public android.support.v4.d.a.b setActionView(View paramView)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    char c = Character.toLowerCase(paramChar);
    this.mShortcutAlphabeticChar = c;
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    int i = Character.toLowerCase(paramChar);
    this.mShortcutAlphabeticChar = i;
    i = KeyEvent.normalizeMetaState(paramInt);
    this.mShortcutAlphabeticModifiers = i;
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    int i = this.mFlags;
    int j = i & 0xFFFFFFFE;
    if (paramBoolean) {}
    for (i = 1;; i = 0)
    {
      i |= j;
      this.mFlags = i;
      return this;
    }
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    int i = this.mFlags;
    int j = i & 0xFFFFFFFD;
    if (paramBoolean) {}
    for (i = 2;; i = 0)
    {
      i |= j;
      this.mFlags = i;
      return this;
    }
  }
  
  public android.support.v4.d.a.b setContentDescription(CharSequence paramCharSequence)
  {
    this.mContentDescription = paramCharSequence;
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    int i = this.mFlags;
    int j = i & 0xFFFFFFEF;
    if (paramBoolean) {}
    for (i = 16;; i = 0)
    {
      i |= j;
      this.mFlags = i;
      return this;
    }
  }
  
  public ActionMenuItem setExclusiveCheckable(boolean paramBoolean)
  {
    int i = this.mFlags;
    int j = i & 0xFFFFFFFB;
    if (paramBoolean) {}
    for (i = 4;; i = 0)
    {
      i |= j;
      this.mFlags = i;
      return this;
    }
  }
  
  public MenuItem setIcon(int paramInt)
  {
    this.mIconResId = paramInt;
    Drawable localDrawable = android.support.v4.a.b.a(this.mContext, paramInt);
    this.mIconDrawable = localDrawable;
    applyIconTint();
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    this.mIconDrawable = paramDrawable;
    this.mIconResId = 0;
    applyIconTint();
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    this.mIconTintList = paramColorStateList;
    this.mHasIconTint = true;
    applyIconTint();
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    this.mIconTintMode = paramMode;
    this.mHasIconTintMode = true;
    applyIconTint();
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    this.mIntent = paramIntent;
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    this.mShortcutNumericChar = paramChar;
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    this.mShortcutNumericChar = paramChar;
    int i = KeyEvent.normalizeMetaState(paramInt);
    this.mShortcutNumericModifiers = i;
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
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
    return this;
  }
  
  public void setShowAsAction(int paramInt) {}
  
  public android.support.v4.d.a.b setShowAsActionFlags(int paramInt)
  {
    setShowAsAction(paramInt);
    return this;
  }
  
  public android.support.v4.d.a.b setSupportActionProvider(android.support.v4.view.b paramb)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    String str = this.mContext.getResources().getString(paramInt);
    this.mTitle = str;
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.mTitle = paramCharSequence;
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.mTitleCondensed = paramCharSequence;
    return this;
  }
  
  public android.support.v4.d.a.b setTooltipText(CharSequence paramCharSequence)
  {
    this.mTooltipText = paramCharSequence;
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    int i = this.mFlags;
    int j = i & 0x8;
    if (paramBoolean) {}
    for (i = 0;; i = 8)
    {
      i |= j;
      this.mFlags = i;
      return this;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\ActionMenuItem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */