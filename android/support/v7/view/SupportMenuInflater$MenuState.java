package android.support.v7.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.v4.view.b;
import android.support.v4.view.g;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuItemWrapperICS;
import android.support.v7.widget.DrawableUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

class SupportMenuInflater$MenuState
{
  private static final int defaultGroupId = 0;
  private static final int defaultItemCategory = 0;
  private static final int defaultItemCheckable = 0;
  private static final boolean defaultItemChecked = false;
  private static final boolean defaultItemEnabled = true;
  private static final int defaultItemId = 0;
  private static final int defaultItemOrder = 0;
  private static final boolean defaultItemVisible = true;
  private int groupCategory;
  private int groupCheckable;
  private boolean groupEnabled;
  private int groupId;
  private int groupOrder;
  private boolean groupVisible;
  b itemActionProvider;
  private String itemActionProviderClassName;
  private String itemActionViewClassName;
  private int itemActionViewLayout;
  private boolean itemAdded;
  private int itemAlphabeticModifiers;
  private char itemAlphabeticShortcut;
  private int itemCategoryOrder;
  private int itemCheckable;
  private boolean itemChecked;
  private CharSequence itemContentDescription;
  private boolean itemEnabled;
  private int itemIconResId;
  private ColorStateList itemIconTintList = null;
  private PorterDuff.Mode itemIconTintMode = null;
  private int itemId;
  private String itemListenerMethodName;
  private int itemNumericModifiers;
  private char itemNumericShortcut;
  private int itemShowAsAction;
  private CharSequence itemTitle;
  private CharSequence itemTitleCondensed;
  private CharSequence itemTooltipText;
  private boolean itemVisible;
  private Menu menu;
  
  public SupportMenuInflater$MenuState(SupportMenuInflater paramSupportMenuInflater, Menu paramMenu)
  {
    this.menu = paramMenu;
    resetGroup();
  }
  
  private char getShortcut(String paramString)
  {
    char c = '\000';
    if (paramString == null) {}
    for (;;)
    {
      return c;
      c = paramString.charAt(0);
    }
  }
  
  private Object newInstance(String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      localObject1 = this.this$0;
      localObject1 = ((SupportMenuInflater)localObject1).mContext;
      localObject1 = ((Context)localObject1).getClassLoader();
      localObject1 = ((ClassLoader)localObject1).loadClass(paramString);
      localObject1 = ((Class)localObject1).getConstructor(paramArrayOfClass);
      boolean bool = true;
      ((Constructor)localObject1).setAccessible(bool);
      localObject1 = ((Constructor)localObject1).newInstance(paramArrayOfObject);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        String str1 = "SupportMenuInflater";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str2 = "Cannot instantiate class: ";
        localObject3 = str2 + paramString;
        Log.w(str1, (String)localObject3, localException);
        Object localObject2 = null;
      }
    }
    return localObject1;
  }
  
  private void setItem(MenuItem paramMenuItem)
  {
    Class[] arrayOfClass = null;
    int i = 1;
    boolean bool1 = this.itemChecked;
    Object localObject1 = paramMenuItem.setChecked(bool1);
    boolean bool5 = this.itemVisible;
    localObject1 = ((MenuItem)localObject1).setVisible(bool5);
    bool5 = this.itemEnabled;
    Object localObject2 = ((MenuItem)localObject1).setEnabled(bool5);
    int m = this.itemCheckable;
    if (m >= i) {
      m = i;
    }
    for (;;)
    {
      localObject1 = ((MenuItem)localObject2).setCheckable(m);
      localObject2 = this.itemTitleCondensed;
      localObject1 = ((MenuItem)localObject1).setTitleCondensed((CharSequence)localObject2);
      i3 = this.itemIconResId;
      ((MenuItem)localObject1).setIcon(i3);
      int n = this.itemShowAsAction;
      if (n >= 0)
      {
        n = this.itemShowAsAction;
        paramMenuItem.setShowAsAction(n);
      }
      localObject1 = this.itemListenerMethodName;
      if (localObject1 == null) {
        break label232;
      }
      localObject1 = this.this$0.mContext;
      bool2 = ((Context)localObject1).isRestricted();
      if (!bool2) {
        break;
      }
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("The android:onClick attribute cannot be used within a restricted context");
      throw ((Throwable)localObject1);
      bool2 = false;
      localObject1 = null;
    }
    localObject1 = new android/support/v7/view/SupportMenuInflater$InflatedOnMenuItemClickListener;
    localObject2 = this.this$0.getRealOwner();
    String str1 = this.itemListenerMethodName;
    ((SupportMenuInflater.InflatedOnMenuItemClickListener)localObject1).<init>(localObject2, str1);
    paramMenuItem.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)localObject1);
    label232:
    boolean bool2 = paramMenuItem instanceof MenuItemImpl;
    if (bool2)
    {
      localObject1 = paramMenuItem;
      localObject1 = (MenuItemImpl)paramMenuItem;
    }
    int i1 = this.itemCheckable;
    int i3 = 2;
    if (i1 >= i3)
    {
      boolean bool3 = paramMenuItem instanceof MenuItemImpl;
      if (bool3)
      {
        localObject1 = paramMenuItem;
        localObject1 = (MenuItemImpl)paramMenuItem;
        ((MenuItemImpl)localObject1).setExclusiveCheckable(i);
      }
    }
    else
    {
      localObject1 = this.itemActionViewClassName;
      if (localObject1 == null) {
        break label584;
      }
      localObject1 = this.itemActionViewClassName;
      arrayOfClass = SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
      localObject2 = this.this$0.mActionViewConstructorArguments;
      localObject1 = (View)newInstance((String)localObject1, arrayOfClass, (Object[])localObject2);
      ((MenuItem)paramMenuItem).setActionView((View)localObject1);
    }
    for (;;)
    {
      int i2 = this.itemActionViewLayout;
      if (i2 > 0)
      {
        if (i != 0) {
          break label564;
        }
        i2 = this.itemActionViewLayout;
        ((MenuItem)paramMenuItem).setActionView(i2);
      }
      for (;;)
      {
        localObject1 = this.itemActionProvider;
        if (localObject1 != null)
        {
          localObject1 = this.itemActionProvider;
          g.a((MenuItem)paramMenuItem, (b)localObject1);
        }
        localObject1 = this.itemContentDescription;
        g.a((MenuItem)paramMenuItem, (CharSequence)localObject1);
        localObject1 = this.itemTooltipText;
        g.b((MenuItem)paramMenuItem, (CharSequence)localObject1);
        i2 = this.itemAlphabeticShortcut;
        int j = this.itemAlphabeticModifiers;
        g.b((MenuItem)paramMenuItem, i2, j);
        char c = this.itemNumericShortcut;
        j = this.itemNumericModifiers;
        g.a((MenuItem)paramMenuItem, c, j);
        localObject1 = this.itemIconTintMode;
        if (localObject1 != null)
        {
          localObject1 = this.itemIconTintMode;
          g.a((MenuItem)paramMenuItem, (PorterDuff.Mode)localObject1);
        }
        localObject1 = this.itemIconTintList;
        if (localObject1 != null)
        {
          localObject1 = this.itemIconTintList;
          g.a((MenuItem)paramMenuItem, (ColorStateList)localObject1);
        }
        return;
        boolean bool4 = paramMenuItem instanceof MenuItemWrapperICS;
        if (!bool4) {
          break;
        }
        localObject1 = paramMenuItem;
        localObject1 = (MenuItemWrapperICS)paramMenuItem;
        ((MenuItemWrapperICS)localObject1).setExclusiveCheckable(j);
        break;
        label564:
        localObject1 = "SupportMenuInflater";
        str2 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified.";
        Log.w((String)localObject1, str2);
      }
      label584:
      int k = 0;
      String str2 = null;
    }
  }
  
  public void addItem()
  {
    this.itemAdded = true;
    Object localObject = this.menu;
    int i = this.groupId;
    int j = this.itemId;
    int k = this.itemCategoryOrder;
    CharSequence localCharSequence = this.itemTitle;
    localObject = ((Menu)localObject).add(i, j, k, localCharSequence);
    setItem((MenuItem)localObject);
  }
  
  public SubMenu addSubMenuItem()
  {
    this.itemAdded = true;
    Object localObject = this.menu;
    int i = this.groupId;
    int j = this.itemId;
    int k = this.itemCategoryOrder;
    CharSequence localCharSequence = this.itemTitle;
    localObject = ((Menu)localObject).addSubMenu(i, j, k, localCharSequence);
    MenuItem localMenuItem = ((SubMenu)localObject).getItem();
    setItem(localMenuItem);
    return (SubMenu)localObject;
  }
  
  public boolean hasAddedItem()
  {
    return this.itemAdded;
  }
  
  public void readGroup(AttributeSet paramAttributeSet)
  {
    boolean bool1 = true;
    Object localObject = this.this$0.mContext;
    int[] arrayOfInt = R.styleable.MenuGroup;
    localObject = ((Context)localObject).obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int i = R.styleable.MenuGroup_android_id;
    i = ((TypedArray)localObject).getResourceId(i, 0);
    this.groupId = i;
    i = R.styleable.MenuGroup_android_menuCategory;
    i = ((TypedArray)localObject).getInt(i, 0);
    this.groupCategory = i;
    i = R.styleable.MenuGroup_android_orderInCategory;
    i = ((TypedArray)localObject).getInt(i, 0);
    this.groupOrder = i;
    i = R.styleable.MenuGroup_android_checkableBehavior;
    i = ((TypedArray)localObject).getInt(i, 0);
    this.groupCheckable = i;
    i = R.styleable.MenuGroup_android_visible;
    boolean bool2 = ((TypedArray)localObject).getBoolean(i, bool1);
    this.groupVisible = bool2;
    int j = R.styleable.MenuGroup_android_enabled;
    boolean bool3 = ((TypedArray)localObject).getBoolean(j, bool1);
    this.groupEnabled = bool3;
    ((TypedArray)localObject).recycle();
  }
  
  public void readItem(AttributeSet paramAttributeSet)
  {
    int i = 4096;
    int j = 1;
    int k = -1;
    Object localObject1 = this.this$0.mContext;
    Object localObject2 = R.styleable.MenuItem;
    localObject2 = ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, (int[])localObject2);
    int m = R.styleable.MenuItem_android_id;
    m = ((TypedArray)localObject2).getResourceId(m, 0);
    this.itemId = m;
    m = R.styleable.MenuItem_android_menuCategory;
    int i8 = this.groupCategory;
    m = ((TypedArray)localObject2).getInt(m, i8);
    i8 = R.styleable.MenuItem_android_orderInCategory;
    int i9 = this.groupOrder;
    i8 = ((TypedArray)localObject2).getInt(i8, i9);
    m &= 0xFFFF0000;
    i9 = (char)-1;
    i8 &= i9;
    m |= i8;
    this.itemCategoryOrder = m;
    m = R.styleable.MenuItem_android_title;
    localObject1 = ((TypedArray)localObject2).getText(m);
    this.itemTitle = ((CharSequence)localObject1);
    m = R.styleable.MenuItem_android_titleCondensed;
    localObject1 = ((TypedArray)localObject2).getText(m);
    this.itemTitleCondensed = ((CharSequence)localObject1);
    m = R.styleable.MenuItem_android_icon;
    m = ((TypedArray)localObject2).getResourceId(m, 0);
    this.itemIconResId = m;
    m = R.styleable.MenuItem_android_alphabeticShortcut;
    localObject1 = ((TypedArray)localObject2).getString(m);
    m = getShortcut((String)localObject1);
    this.itemAlphabeticShortcut = m;
    m = R.styleable.MenuItem_alphabeticModifiers;
    m = ((TypedArray)localObject2).getInt(m, i);
    this.itemAlphabeticModifiers = m;
    m = R.styleable.MenuItem_android_numericShortcut;
    localObject1 = ((TypedArray)localObject2).getString(m);
    m = getShortcut((String)localObject1);
    this.itemNumericShortcut = m;
    m = R.styleable.MenuItem_numericModifiers;
    m = ((TypedArray)localObject2).getInt(m, i);
    this.itemNumericModifiers = m;
    m = R.styleable.MenuItem_android_checkable;
    boolean bool1 = ((TypedArray)localObject2).hasValue(m);
    label337:
    label528:
    Object localObject3;
    label595:
    label691:
    int i7;
    if (bool1)
    {
      int n = R.styleable.MenuItem_android_checkable;
      int i1 = ((TypedArray)localObject2).getBoolean(n, false);
      if (i1 != 0)
      {
        i1 = j;
        this.itemCheckable = i1;
        int i2 = R.styleable.MenuItem_android_checked;
        boolean bool2 = ((TypedArray)localObject2).getBoolean(i2, false);
        this.itemChecked = bool2;
        int i3 = R.styleable.MenuItem_android_visible;
        boolean bool7 = this.groupVisible;
        boolean bool3 = ((TypedArray)localObject2).getBoolean(i3, bool7);
        this.itemVisible = bool3;
        int i4 = R.styleable.MenuItem_android_enabled;
        bool7 = this.groupEnabled;
        boolean bool4 = ((TypedArray)localObject2).getBoolean(i4, bool7);
        this.itemEnabled = bool4;
        int i5 = R.styleable.MenuItem_showAsAction;
        i5 = ((TypedArray)localObject2).getInt(i5, k);
        this.itemShowAsAction = i5;
        i5 = R.styleable.MenuItem_android_onClick;
        localObject1 = ((TypedArray)localObject2).getString(i5);
        this.itemListenerMethodName = ((String)localObject1);
        i5 = R.styleable.MenuItem_actionLayout;
        i5 = ((TypedArray)localObject2).getResourceId(i5, 0);
        this.itemActionViewLayout = i5;
        i5 = R.styleable.MenuItem_actionViewClass;
        localObject1 = ((TypedArray)localObject2).getString(i5);
        this.itemActionViewClassName = ((String)localObject1);
        i5 = R.styleable.MenuItem_actionProviderClass;
        localObject1 = ((TypedArray)localObject2).getString(i5);
        this.itemActionProviderClassName = ((String)localObject1);
        localObject1 = this.itemActionProviderClassName;
        if (localObject1 == null) {
          break label765;
        }
        if (j == 0) {
          break label773;
        }
        i5 = this.itemActionViewLayout;
        if (i5 != 0) {
          break label773;
        }
        localObject1 = this.itemActionViewClassName;
        if (localObject1 != null) {
          break label773;
        }
        localObject1 = this.itemActionProviderClassName;
        localObject3 = SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
        Object[] arrayOfObject = this.this$0.mActionProviderConstructorArguments;
        localObject1 = (b)newInstance((String)localObject1, (Class[])localObject3, arrayOfObject);
        this.itemActionProvider = ((b)localObject1);
        i5 = R.styleable.MenuItem_contentDescription;
        localObject1 = ((TypedArray)localObject2).getText(i5);
        this.itemContentDescription = ((CharSequence)localObject1);
        i5 = R.styleable.MenuItem_tooltipText;
        localObject1 = ((TypedArray)localObject2).getText(i5);
        this.itemTooltipText = ((CharSequence)localObject1);
        i5 = R.styleable.MenuItem_iconTintMode;
        boolean bool5 = ((TypedArray)localObject2).hasValue(i5);
        if (!bool5) {
          break label802;
        }
        int i6 = R.styleable.MenuItem_iconTintMode;
        i6 = ((TypedArray)localObject2).getInt(i6, k);
        localObject3 = this.itemIconTintMode;
        localObject1 = DrawableUtils.parseTintMode(i6, (PorterDuff.Mode)localObject3);
        this.itemIconTintMode = ((PorterDuff.Mode)localObject1);
        i6 = R.styleable.MenuItem_iconTint;
        boolean bool6 = ((TypedArray)localObject2).hasValue(i6);
        if (!bool6) {
          break label810;
        }
        i7 = R.styleable.MenuItem_iconTint;
        localObject1 = ((TypedArray)localObject2).getColorStateList(i7);
      }
    }
    label765:
    label773:
    label802:
    label810:
    for (this.itemIconTintList = ((ColorStateList)localObject1);; this.itemIconTintList = null)
    {
      ((TypedArray)localObject2).recycle();
      this.itemAdded = false;
      return;
      i7 = 0;
      localObject1 = null;
      break;
      i7 = this.groupCheckable;
      this.itemCheckable = i7;
      break label337;
      j = 0;
      localObject3 = null;
      break label528;
      if (j != 0)
      {
        localObject1 = "SupportMenuInflater";
        localObject3 = "Ignoring attribute 'actionProviderClass'. Action view already specified.";
        Log.w((String)localObject1, (String)localObject3);
      }
      this.itemActionProvider = null;
      break label595;
      this.itemIconTintMode = null;
      break label691;
    }
  }
  
  public void resetGroup()
  {
    boolean bool = true;
    this.groupId = 0;
    this.groupCategory = 0;
    this.groupOrder = 0;
    this.groupCheckable = 0;
    this.groupVisible = bool;
    this.groupEnabled = bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\SupportMenuInflater$MenuState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */