package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.d.a.a;
import android.support.v7.appcompat.R.bool;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MenuBuilder
  implements a
{
  private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
  private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
  private static final String PRESENTER_KEY = "android:menu:presenters";
  private static final String TAG = "MenuBuilder";
  private static final int[] sCategoryToOrder;
  private ArrayList mActionItems;
  private MenuBuilder.Callback mCallback;
  private final Context mContext;
  private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
  private int mDefaultShowAsAction = 0;
  private MenuItemImpl mExpandedItem;
  private SparseArray mFrozenViewStates;
  Drawable mHeaderIcon;
  CharSequence mHeaderTitle;
  View mHeaderView;
  private boolean mIsActionItemsStale;
  private boolean mIsClosing = false;
  private boolean mIsVisibleItemsStale;
  private ArrayList mItems;
  private boolean mItemsChangedWhileDispatchPrevented = false;
  private ArrayList mNonActionItems;
  private boolean mOptionalIconsVisible = false;
  private boolean mOverrideVisibleItems;
  private CopyOnWriteArrayList mPresenters;
  private boolean mPreventDispatchingItemsChanged = false;
  private boolean mQwertyMode;
  private final Resources mResources;
  private boolean mShortcutsVisible;
  private boolean mStructureChangedWhileDispatchPrevented = false;
  private ArrayList mTempShortcutItemList;
  private ArrayList mVisibleItems;
  
  static
  {
    int[] arrayOfInt = new int[6];
    arrayOfInt[0] = 1;
    arrayOfInt[1] = 4;
    arrayOfInt[2] = 5;
    arrayOfInt[3] = 3;
    arrayOfInt[4] = 2;
    arrayOfInt[5] = 0;
    sCategoryToOrder = arrayOfInt;
  }
  
  public MenuBuilder(Context paramContext)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mTempShortcutItemList = ((ArrayList)localObject);
    localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    this.mPresenters = ((CopyOnWriteArrayList)localObject);
    this.mContext = paramContext;
    localObject = paramContext.getResources();
    this.mResources = ((Resources)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mItems = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mVisibleItems = ((ArrayList)localObject);
    this.mIsVisibleItemsStale = bool;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mActionItems = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mNonActionItems = ((ArrayList)localObject);
    this.mIsActionItemsStale = bool;
    setShortcutsVisibleInner(bool);
  }
  
  private MenuItemImpl createNewMenuItem(int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    MenuItemImpl localMenuItemImpl = new android/support/v7/view/menu/MenuItemImpl;
    localMenuItemImpl.<init>(this, paramInt1, paramInt2, paramInt3, paramInt4, paramCharSequence, paramInt5);
    return localMenuItemImpl;
  }
  
  private void dispatchPresenterUpdate(boolean paramBoolean)
  {
    Object localObject1 = this.mPresenters;
    boolean bool = ((CopyOnWriteArrayList)localObject1).isEmpty();
    if (bool) {}
    for (;;)
    {
      return;
      stopDispatchingItemsChanged();
      localObject1 = this.mPresenters;
      Iterator localIterator = ((CopyOnWriteArrayList)localObject1).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (WeakReference)localIterator.next();
        Object localObject2 = (MenuPresenter)((WeakReference)localObject1).get();
        if (localObject2 == null)
        {
          localObject2 = this.mPresenters;
          ((CopyOnWriteArrayList)localObject2).remove(localObject1);
        }
        else
        {
          ((MenuPresenter)localObject2).updateMenuView(paramBoolean);
        }
      }
      startDispatchingItemsChanged();
    }
  }
  
  private void dispatchRestoreInstanceState(Bundle paramBundle)
  {
    Object localObject1 = "android:menu:presenters";
    SparseArray localSparseArray = paramBundle.getSparseParcelableArray((String)localObject1);
    boolean bool;
    if (localSparseArray != null)
    {
      localObject1 = this.mPresenters;
      bool = ((CopyOnWriteArrayList)localObject1).isEmpty();
      if (!bool) {}
    }
    else
    {
      return;
    }
    localObject1 = this.mPresenters;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject1).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (WeakReference)localIterator.next();
      Object localObject2 = (MenuPresenter)((WeakReference)localObject1).get();
      if (localObject2 == null)
      {
        localObject2 = this.mPresenters;
        ((CopyOnWriteArrayList)localObject2).remove(localObject1);
      }
      else
      {
        int i = ((MenuPresenter)localObject2).getId();
        if (i > 0)
        {
          localObject1 = (Parcelable)localSparseArray.get(i);
          if (localObject1 != null) {
            ((MenuPresenter)localObject2).onRestoreInstanceState((Parcelable)localObject1);
          }
        }
      }
    }
  }
  
  private void dispatchSaveInstanceState(Bundle paramBundle)
  {
    Object localObject1 = this.mPresenters;
    boolean bool = ((CopyOnWriteArrayList)localObject1).isEmpty();
    if (bool) {}
    for (;;)
    {
      return;
      SparseArray localSparseArray = new android/util/SparseArray;
      localSparseArray.<init>();
      localObject1 = this.mPresenters;
      Iterator localIterator = ((CopyOnWriteArrayList)localObject1).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (WeakReference)localIterator.next();
        Object localObject2 = (MenuPresenter)((WeakReference)localObject1).get();
        if (localObject2 == null)
        {
          localObject2 = this.mPresenters;
          ((CopyOnWriteArrayList)localObject2).remove(localObject1);
        }
        else
        {
          int i = ((MenuPresenter)localObject2).getId();
          if (i > 0)
          {
            localObject2 = ((MenuPresenter)localObject2).onSaveInstanceState();
            if (localObject2 != null) {
              localSparseArray.put(i, localObject2);
            }
          }
        }
      }
      localObject1 = "android:menu:presenters";
      paramBundle.putSparseParcelableArray((String)localObject1, localSparseArray);
    }
  }
  
  private boolean dispatchSubMenuSelected(SubMenuBuilder paramSubMenuBuilder, MenuPresenter paramMenuPresenter)
  {
    boolean bool1 = false;
    WeakReference localWeakReference = null;
    Object localObject = this.mPresenters;
    boolean bool2 = ((CopyOnWriteArrayList)localObject).isEmpty();
    if (bool2) {
      return bool1;
    }
    if (paramMenuPresenter != null) {
      bool1 = paramMenuPresenter.onSubMenuSelected(paramSubMenuBuilder);
    }
    localObject = this.mPresenters;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    boolean bool3 = bool1;
    label53:
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localWeakReference = (WeakReference)localIterator.next();
      localObject = (MenuPresenter)localWeakReference.get();
      if (localObject == null)
      {
        localObject = this.mPresenters;
        ((CopyOnWriteArrayList)localObject).remove(localWeakReference);
        bool1 = bool3;
      }
    }
    for (;;)
    {
      bool3 = bool1;
      break label53;
      if (!bool3)
      {
        bool3 = ((MenuPresenter)localObject).onSubMenuSelected(paramSubMenuBuilder);
        bool1 = bool3;
        continue;
        bool1 = bool3;
        break;
      }
      bool1 = bool3;
    }
  }
  
  private static int findInsertIndex(ArrayList paramArrayList, int paramInt)
  {
    int i = paramArrayList.size() + -1;
    int j = i;
    MenuItemImpl localMenuItemImpl;
    if (j >= 0)
    {
      localMenuItemImpl = (MenuItemImpl)paramArrayList.get(j);
      i = localMenuItemImpl.getOrdering();
      if (i <= paramInt) {
        i = j + 1;
      }
    }
    for (;;)
    {
      return i;
      i = j + -1;
      j = i;
      break;
      i = 0;
      localMenuItemImpl = null;
    }
  }
  
  private static int getOrdering(int paramInt)
  {
    int i = (0xFFFF0000 & paramInt) >> 16;
    if (i >= 0)
    {
      int[] arrayOfInt = sCategoryToOrder;
      j = arrayOfInt.length;
      if (i < j) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("order does not contain a valid category.");
      throw localIllegalArgumentException;
    }
    i = sCategoryToOrder[i] << 16;
    int j = (char)-1 & paramInt;
    return i | j;
  }
  
  private void removeItemAtInt(int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList;
    int i;
    if (paramInt >= 0)
    {
      localArrayList = this.mItems;
      i = localArrayList.size();
      if (paramInt < i) {
        break label22;
      }
    }
    for (;;)
    {
      return;
      label22:
      localArrayList = this.mItems;
      localArrayList.remove(paramInt);
      if (paramBoolean)
      {
        i = 1;
        onItemsChanged(i);
      }
    }
  }
  
  private void setHeaderInternal(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    Object localObject = getResources();
    if (paramView != null)
    {
      this.mHeaderView = paramView;
      this.mHeaderTitle = null;
      this.mHeaderIcon = null;
      onItemsChanged(false);
      return;
    }
    if (paramInt1 > 0)
    {
      localObject = ((Resources)localObject).getText(paramInt1);
      this.mHeaderTitle = ((CharSequence)localObject);
      label51:
      if (paramInt2 <= 0) {
        break label91;
      }
      localObject = android.support.v4.a.b.a(getContext(), paramInt2);
      this.mHeaderIcon = ((Drawable)localObject);
    }
    for (;;)
    {
      this.mHeaderView = null;
      break;
      if (paramCharSequence == null) {
        break label51;
      }
      this.mHeaderTitle = paramCharSequence;
      break label51;
      label91:
      if (paramDrawable != null) {
        this.mHeaderIcon = paramDrawable;
      }
    }
  }
  
  private void setShortcutsVisibleInner(boolean paramBoolean)
  {
    int i = 1;
    if (paramBoolean)
    {
      Object localObject = this.mResources.getConfiguration();
      int j = ((Configuration)localObject).keyboard;
      if (j != i)
      {
        localObject = this.mResources;
        int k = R.bool.abc_config_showMenuShortcutsWhenKeyboardPresent;
        boolean bool = ((Resources)localObject).getBoolean(k);
        if (!bool) {}
      }
    }
    for (;;)
    {
      this.mShortcutsVisible = i;
      return;
      i = 0;
    }
  }
  
  public MenuItem add(int paramInt)
  {
    String str = this.mResources.getString(paramInt);
    return addInternal(0, 0, 0, str);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    String str = this.mResources.getString(paramInt4);
    return addInternal(paramInt1, paramInt2, paramInt3, str);
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return addInternal(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public MenuItem add(CharSequence paramCharSequence)
  {
    return addInternal(0, 0, 0, paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.mContext.getPackageManager();
    int i = 0;
    ResolveInfo localResolveInfo = null;
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int j;
    int k;
    label72:
    Intent localIntent;
    int m;
    if (localList != null)
    {
      i = localList.size();
      j = i;
      i = paramInt4 & 0x1;
      if (i == 0) {
        removeGroup(paramInt1);
      }
      i = 0;
      localResolveInfo = null;
      k = 0;
      if (k >= j) {
        break label286;
      }
      localResolveInfo = (ResolveInfo)localList.get(k);
      localIntent = new android/content/Intent;
      m = localResolveInfo.specificIndex;
      if (m >= 0) {
        break label269;
      }
    }
    for (Object localObject1 = paramIntent;; localObject1 = paramArrayOfIntent[m])
    {
      localIntent.<init>((Intent)localObject1);
      localObject1 = new android/content/ComponentName;
      Object localObject2 = localResolveInfo.activityInfo.applicationInfo.packageName;
      String str = localResolveInfo.activityInfo.name;
      ((ComponentName)localObject1).<init>((String)localObject2, str);
      localIntent.setComponent((ComponentName)localObject1);
      localObject1 = localResolveInfo.loadLabel(localPackageManager);
      localObject1 = add(paramInt1, paramInt2, paramInt3, (CharSequence)localObject1);
      localObject2 = localResolveInfo.loadIcon(localPackageManager);
      localObject1 = ((MenuItem)localObject1).setIcon((Drawable)localObject2).setIntent(localIntent);
      if (paramArrayOfMenuItem != null)
      {
        int n = localResolveInfo.specificIndex;
        if (n >= 0)
        {
          i = localResolveInfo.specificIndex;
          paramArrayOfMenuItem[i] = localObject1;
        }
      }
      i = k + 1;
      k = i;
      break label72;
      i = 0;
      localResolveInfo = null;
      j = 0;
      break;
      label269:
      m = localResolveInfo.specificIndex;
    }
    label286:
    return j;
  }
  
  protected MenuItem addInternal(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i = getOrdering(paramInt3);
    int j = this.mDefaultShowAsAction;
    Object localObject1 = this;
    int k = paramInt2;
    localObject1 = createNewMenuItem(paramInt1, paramInt2, paramInt3, i, paramCharSequence, j);
    Object localObject2 = this.mCurrentMenuInfo;
    if (localObject2 != null)
    {
      localObject2 = this.mCurrentMenuInfo;
      ((MenuItemImpl)localObject1).setMenuInfo((ContextMenu.ContextMenuInfo)localObject2);
    }
    localObject2 = this.mItems;
    k = findInsertIndex(this.mItems, i);
    ((ArrayList)localObject2).add(k, localObject1);
    onItemsChanged(true);
    return (MenuItem)localObject1;
  }
  
  public void addMenuPresenter(MenuPresenter paramMenuPresenter)
  {
    Context localContext = this.mContext;
    addMenuPresenter(paramMenuPresenter, localContext);
  }
  
  public void addMenuPresenter(MenuPresenter paramMenuPresenter, Context paramContext)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = this.mPresenters;
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramMenuPresenter);
    localCopyOnWriteArrayList.add(localWeakReference);
    paramMenuPresenter.initForMenu(paramContext, this);
    this.mIsActionItemsStale = true;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    String str = this.mResources.getString(paramInt);
    return addSubMenu(0, 0, 0, str);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    String str = this.mResources.getString(paramInt4);
    return addSubMenu(paramInt1, paramInt2, paramInt3, str);
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    MenuItemImpl localMenuItemImpl = (MenuItemImpl)addInternal(paramInt1, paramInt2, paramInt3, paramCharSequence);
    SubMenuBuilder localSubMenuBuilder = new android/support/v7/view/menu/SubMenuBuilder;
    Context localContext = this.mContext;
    localSubMenuBuilder.<init>(localContext, this, localMenuItemImpl);
    localMenuItemImpl.setSubMenu(localSubMenuBuilder);
    return localSubMenuBuilder;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public void changeMenuMode()
  {
    MenuBuilder.Callback localCallback = this.mCallback;
    if (localCallback != null)
    {
      localCallback = this.mCallback;
      localCallback.onMenuModeChange(this);
    }
  }
  
  public void clear()
  {
    MenuItemImpl localMenuItemImpl = this.mExpandedItem;
    if (localMenuItemImpl != null)
    {
      localMenuItemImpl = this.mExpandedItem;
      collapseItemActionView(localMenuItemImpl);
    }
    this.mItems.clear();
    onItemsChanged(true);
  }
  
  public void clearAll()
  {
    boolean bool = true;
    this.mPreventDispatchingItemsChanged = bool;
    clear();
    clearHeader();
    this.mPreventDispatchingItemsChanged = false;
    this.mItemsChangedWhileDispatchPrevented = false;
    this.mStructureChangedWhileDispatchPrevented = false;
    onItemsChanged(bool);
  }
  
  public void clearHeader()
  {
    this.mHeaderIcon = null;
    this.mHeaderTitle = null;
    this.mHeaderView = null;
    onItemsChanged(false);
  }
  
  public void close()
  {
    close(true);
  }
  
  public final void close(boolean paramBoolean)
  {
    boolean bool = this.mIsClosing;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      this.mIsClosing = bool;
      Object localObject1 = this.mPresenters;
      Iterator localIterator = ((CopyOnWriteArrayList)localObject1).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (WeakReference)localIterator.next();
        Object localObject2 = (MenuPresenter)((WeakReference)localObject1).get();
        if (localObject2 == null)
        {
          localObject2 = this.mPresenters;
          ((CopyOnWriteArrayList)localObject2).remove(localObject1);
        }
        else
        {
          ((MenuPresenter)localObject2).onCloseMenu(this, paramBoolean);
        }
      }
      bool = false;
      localObject1 = null;
      this.mIsClosing = false;
    }
  }
  
  public boolean collapseItemActionView(MenuItemImpl paramMenuItemImpl)
  {
    boolean bool1 = false;
    WeakReference localWeakReference = null;
    Object localObject = this.mPresenters;
    boolean bool2 = ((CopyOnWriteArrayList)localObject).isEmpty();
    if (!bool2)
    {
      localObject = this.mExpandedItem;
      if (localObject == paramMenuItemImpl) {}
    }
    else
    {
      return bool1;
    }
    stopDispatchingItemsChanged();
    localObject = this.mPresenters;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    boolean bool3 = false;
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localWeakReference = (WeakReference)localIterator.next();
      localObject = (MenuPresenter)localWeakReference.get();
      if (localObject == null)
      {
        localObject = this.mPresenters;
        ((CopyOnWriteArrayList)localObject).remove(localWeakReference);
        bool1 = bool3;
      }
      do
      {
        bool3 = bool1;
        break;
        bool1 = ((MenuPresenter)localObject).collapseItemActionView(this, paramMenuItemImpl);
      } while (!bool1);
    }
    for (;;)
    {
      startDispatchingItemsChanged();
      if (!bool1) {
        break;
      }
      bool2 = false;
      localObject = null;
      this.mExpandedItem = null;
      break;
      bool1 = bool3;
    }
  }
  
  boolean dispatchMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    MenuBuilder.Callback localCallback = this.mCallback;
    boolean bool;
    if (localCallback != null)
    {
      localCallback = this.mCallback;
      bool = localCallback.onMenuItemSelected(paramMenuBuilder, paramMenuItem);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCallback = null;
    }
  }
  
  public boolean expandItemActionView(MenuItemImpl paramMenuItemImpl)
  {
    boolean bool1 = false;
    WeakReference localWeakReference = null;
    Object localObject = this.mPresenters;
    boolean bool2 = ((CopyOnWriteArrayList)localObject).isEmpty();
    if (bool2) {
      return bool1;
    }
    stopDispatchingItemsChanged();
    localObject = this.mPresenters;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject).iterator();
    boolean bool3 = false;
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localWeakReference = (WeakReference)localIterator.next();
      localObject = (MenuPresenter)localWeakReference.get();
      if (localObject == null)
      {
        localObject = this.mPresenters;
        ((CopyOnWriteArrayList)localObject).remove(localWeakReference);
        bool1 = bool3;
      }
      do
      {
        bool3 = bool1;
        break;
        bool1 = ((MenuPresenter)localObject).expandItemActionView(this, paramMenuItemImpl);
      } while (!bool1);
    }
    for (;;)
    {
      startDispatchingItemsChanged();
      if (!bool1) {
        break;
      }
      this.mExpandedItem = paramMenuItemImpl;
      break;
      bool1 = bool3;
    }
  }
  
  public int findGroupIndex(int paramInt)
  {
    return findGroupIndex(paramInt, 0);
  }
  
  public int findGroupIndex(int paramInt1, int paramInt2)
  {
    int i = size();
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }
    int j = paramInt2;
    if (j < i)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mItems.get(j);
      k = localMenuItemImpl.getGroupId();
      if (k != paramInt1) {}
    }
    for (int k = j;; k = -1)
    {
      return k;
      j += 1;
      break;
    }
  }
  
  public MenuItem findItem(int paramInt)
  {
    int i = size();
    int j = 0;
    Object localObject = null;
    int k = 0;
    if (k < i)
    {
      localObject = (MenuItemImpl)this.mItems.get(k);
      int m = ((MenuItemImpl)localObject).getItemId();
      if (m != paramInt) {}
    }
    for (;;)
    {
      return (MenuItem)localObject;
      boolean bool = ((MenuItemImpl)localObject).hasSubMenu();
      if (bool)
      {
        localObject = ((MenuItemImpl)localObject).getSubMenu().findItem(paramInt);
        if (localObject != null) {}
      }
      else
      {
        j = k + 1;
        k = j;
        break;
        j = 0;
        localObject = null;
      }
    }
  }
  
  public int findItemIndex(int paramInt)
  {
    int i = size();
    int j = 0;
    if (j < i)
    {
      MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mItems.get(j);
      k = localMenuItemImpl.getItemId();
      if (k != paramInt) {}
    }
    for (int k = j;; k = -1)
    {
      return k;
      j += 1;
      break;
    }
  }
  
  MenuItemImpl findItemWithShortcutForKey(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.mTempShortcutItemList;
    localArrayList.clear();
    findItemsWithShortcutForKey(localArrayList, paramInt, paramKeyEvent);
    int i = localArrayList.isEmpty();
    MenuItemImpl localMenuItemImpl;
    if (i != 0)
    {
      i = 0;
      localMenuItemImpl = null;
    }
    for (;;)
    {
      return localMenuItemImpl;
      int k = paramKeyEvent.getMetaState();
      KeyCharacterMap.KeyData localKeyData = new android/view/KeyCharacterMap$KeyData;
      localKeyData.<init>();
      paramKeyEvent.getKeyData(localKeyData);
      int m = localArrayList.size();
      i = 1;
      if (m == i)
      {
        localMenuItemImpl = (MenuItemImpl)localArrayList.get(0);
      }
      else
      {
        boolean bool = isQwertyMode();
        int n = 0;
        label97:
        if (n < m)
        {
          localMenuItemImpl = (MenuItemImpl)localArrayList.get(n);
          if (bool) {}
          for (int i1 = localMenuItemImpl.getAlphabeticShortcut();; i1 = localMenuItemImpl.getNumericShortcut())
          {
            char[] arrayOfChar = localKeyData.meta;
            int i2 = arrayOfChar[0];
            if (i1 == i2)
            {
              i2 = k & 0x2;
              if (i2 == 0) {
                break;
              }
            }
            arrayOfChar = localKeyData.meta;
            int i3 = 2;
            i2 = arrayOfChar[i3];
            if (i1 == i2)
            {
              i2 = k & 0x2;
              if (i2 != 0) {
                break;
              }
            }
            if (bool)
            {
              i2 = 8;
              if (i1 == i2)
              {
                i1 = 67;
                if (paramInt == i1) {
                  break;
                }
              }
            }
            j = n + 1;
            n = j;
            break label97;
          }
        }
        int j = 0;
        localMenuItemImpl = null;
      }
    }
  }
  
  void findItemsWithShortcutForKey(List paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 69647;
    int j = 67;
    boolean bool1 = isQwertyMode();
    int k = paramKeyEvent.getModifiers();
    KeyCharacterMap.KeyData localKeyData = new android/view/KeyCharacterMap$KeyData;
    localKeyData.<init>();
    boolean bool2 = paramKeyEvent.getKeyData(localKeyData);
    if ((!bool2) && (paramInt != j)) {
      return;
    }
    Object localObject1 = this.mItems;
    int n = ((ArrayList)localObject1).size();
    int i1 = 0;
    label67:
    Object localObject2;
    int i2;
    int i4;
    label134:
    label146:
    int i5;
    if (i1 < n)
    {
      localObject1 = (MenuItemImpl)this.mItems.get(i1);
      boolean bool3 = ((MenuItemImpl)localObject1).hasSubMenu();
      if (bool3)
      {
        localObject2 = (MenuBuilder)((MenuItemImpl)localObject1).getSubMenu();
        ((MenuBuilder)localObject2).findItemsWithShortcutForKey(paramList, paramInt, paramKeyEvent);
      }
      if (!bool1) {
        break label280;
      }
      i2 = ((MenuItemImpl)localObject1).getAlphabeticShortcut();
      i4 = i2;
      if (!bool1) {
        break label294;
      }
      i2 = ((MenuItemImpl)localObject1).getAlphabeticModifiers();
      i5 = k & i;
      i2 &= i;
      if (i5 != i2) {
        break label304;
      }
      i2 = 1;
    }
    for (;;)
    {
      if ((i2 != 0) && (i4 != 0))
      {
        localObject2 = localKeyData.meta;
        i2 = localObject2[0];
        if (i4 != i2)
        {
          localObject2 = localKeyData.meta;
          i5 = 2;
          i2 = localObject2[i5];
          if (i4 != i2)
          {
            if (!bool1) {
              break label267;
            }
            i2 = 8;
            if ((i4 != i2) || (paramInt != j)) {
              break label267;
            }
          }
        }
        boolean bool4 = ((MenuItemImpl)localObject1).isEnabled();
        if (bool4) {
          paramList.add(localObject1);
        }
      }
      label267:
      int m = i1 + 1;
      i1 = m;
      break label67;
      break;
      label280:
      int i3 = ((MenuItemImpl)localObject1).getNumericShortcut();
      i4 = i3;
      break label134;
      label294:
      i3 = ((MenuItemImpl)localObject1).getNumericModifiers();
      break label146;
      label304:
      i3 = 0;
      localObject2 = null;
    }
  }
  
  public void flagActionItems()
  {
    ArrayList localArrayList = getVisibleItems();
    int i = this.mIsActionItemsStale;
    if (i == 0) {}
    for (;;)
    {
      return;
      Object localObject1 = this.mPresenters;
      Object localObject2 = ((CopyOnWriteArrayList)localObject1).iterator();
      int k = 0;
      i = ((Iterator)localObject2).hasNext();
      Object localObject3;
      if (i != 0)
      {
        localObject1 = (WeakReference)((Iterator)localObject2).next();
        localObject3 = (MenuPresenter)((WeakReference)localObject1).get();
        if (localObject3 == null)
        {
          localObject3 = this.mPresenters;
          ((CopyOnWriteArrayList)localObject3).remove(localObject1);
        }
        for (i = k;; i = ((MenuPresenter)localObject3).flagActionItems() | k)
        {
          k = i;
          break;
        }
      }
      if (k != 0)
      {
        this.mActionItems.clear();
        localObject1 = this.mNonActionItems;
        ((ArrayList)localObject1).clear();
        k = localArrayList.size();
        int m = 0;
        localObject3 = null;
        if (m < k)
        {
          localObject1 = (MenuItemImpl)localArrayList.get(m);
          boolean bool = ((MenuItemImpl)localObject1).isActionButton();
          if (bool)
          {
            localObject2 = this.mActionItems;
            ((ArrayList)localObject2).add(localObject1);
          }
          for (;;)
          {
            int j = m + 1;
            m = j;
            break;
            localObject2 = this.mNonActionItems;
            ((ArrayList)localObject2).add(localObject1);
          }
        }
      }
      else
      {
        this.mActionItems.clear();
        this.mNonActionItems.clear();
        localObject1 = this.mNonActionItems;
        localObject3 = getVisibleItems();
        ((ArrayList)localObject1).addAll((Collection)localObject3);
      }
      this.mIsActionItemsStale = false;
    }
  }
  
  public ArrayList getActionItems()
  {
    flagActionItems();
    return this.mActionItems;
  }
  
  protected String getActionViewStatesKey()
  {
    return "android:menu:actionviewstates";
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public MenuItemImpl getExpandedItem()
  {
    return this.mExpandedItem;
  }
  
  public Drawable getHeaderIcon()
  {
    return this.mHeaderIcon;
  }
  
  public CharSequence getHeaderTitle()
  {
    return this.mHeaderTitle;
  }
  
  public View getHeaderView()
  {
    return this.mHeaderView;
  }
  
  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.mItems.get(paramInt);
  }
  
  public ArrayList getNonActionItems()
  {
    flagActionItems();
    return this.mNonActionItems;
  }
  
  boolean getOptionalIconsVisible()
  {
    return this.mOptionalIconsVisible;
  }
  
  Resources getResources()
  {
    return this.mResources;
  }
  
  public MenuBuilder getRootMenu()
  {
    return this;
  }
  
  public ArrayList getVisibleItems()
  {
    boolean bool1 = this.mIsVisibleItemsStale;
    if (!bool1) {}
    for (Object localObject = this.mVisibleItems;; localObject = this.mVisibleItems)
    {
      return (ArrayList)localObject;
      this.mVisibleItems.clear();
      localObject = this.mItems;
      int j = ((ArrayList)localObject).size();
      for (int k = 0; k < j; k = i)
      {
        localObject = (MenuItemImpl)this.mItems.get(k);
        boolean bool2 = ((MenuItemImpl)localObject).isVisible();
        if (bool2)
        {
          ArrayList localArrayList = this.mVisibleItems;
          localArrayList.add(localObject);
        }
        i = k + 1;
      }
      this.mIsVisibleItemsStale = false;
      int i = 1;
      this.mIsActionItemsStale = i;
    }
  }
  
  public boolean hasVisibleItems()
  {
    boolean bool1 = true;
    boolean bool2 = this.mOverrideVisibleItems;
    if (bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      int j = size();
      for (int k = 0;; k = i)
      {
        if (k >= j) {
          break label69;
        }
        localMenuItemImpl = (MenuItemImpl)this.mItems.get(k);
        bool2 = localMenuItemImpl.isVisible();
        if (bool2)
        {
          bool2 = bool1;
          break;
        }
        i = k + 1;
      }
      label69:
      int i = 0;
      MenuItemImpl localMenuItemImpl = null;
    }
  }
  
  boolean isQwertyMode()
  {
    return this.mQwertyMode;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    MenuItemImpl localMenuItemImpl = findItemWithShortcutForKey(paramInt, paramKeyEvent);
    boolean bool;
    if (localMenuItemImpl != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMenuItemImpl = null;
    }
  }
  
  public boolean isShortcutsVisible()
  {
    return this.mShortcutsVisible;
  }
  
  void onItemActionRequestChanged(MenuItemImpl paramMenuItemImpl)
  {
    boolean bool = true;
    this.mIsActionItemsStale = bool;
    onItemsChanged(bool);
  }
  
  void onItemVisibleChanged(MenuItemImpl paramMenuItemImpl)
  {
    boolean bool = true;
    this.mIsVisibleItemsStale = bool;
    onItemsChanged(bool);
  }
  
  public void onItemsChanged(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = this.mPreventDispatchingItemsChanged;
    if (!bool2)
    {
      if (paramBoolean)
      {
        this.mIsVisibleItemsStale = bool1;
        this.mIsActionItemsStale = bool1;
      }
      dispatchPresenterUpdate(paramBoolean);
    }
    for (;;)
    {
      return;
      this.mItemsChangedWhileDispatchPrevented = bool1;
      if (paramBoolean) {
        this.mStructureChangedWhileDispatchPrevented = bool1;
      }
    }
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    MenuItem localMenuItem = findItem(paramInt1);
    return performItemAction(localMenuItem, paramInt2);
  }
  
  public boolean performItemAction(MenuItem paramMenuItem, int paramInt)
  {
    return performItemAction(paramMenuItem, null, paramInt);
  }
  
  public boolean performItemAction(MenuItem paramMenuItem, MenuPresenter paramMenuPresenter, int paramInt)
  {
    boolean bool1 = false;
    SubMenuBuilder localSubMenuBuilder = null;
    boolean bool2 = true;
    paramMenuItem = (MenuItemImpl)paramMenuItem;
    boolean bool3;
    if (paramMenuItem != null)
    {
      bool3 = paramMenuItem.isEnabled();
      if (bool3) {
        break label32;
      }
    }
    for (;;)
    {
      return bool1;
      label32:
      int j = paramMenuItem.invoke();
      android.support.v4.view.b localb = paramMenuItem.getSupportActionProvider();
      if (localb != null)
      {
        bool3 = localb.hasSubMenu();
        if (!bool3) {}
      }
      for (bool3 = bool2;; bool3 = false)
      {
        bool4 = paramMenuItem.hasCollapsibleActionView();
        if (!bool4) {
          break label105;
        }
        bool1 = paramMenuItem.expandActionView() | j;
        if (!bool1) {
          break;
        }
        close(bool2);
        break;
      }
      label105:
      boolean bool4 = paramMenuItem.hasSubMenu();
      if ((bool4) || (bool3))
      {
        int k = paramInt & 0x4;
        if (k == 0) {
          close(false);
        }
        bool1 = paramMenuItem.hasSubMenu();
        if (!bool1)
        {
          localSubMenuBuilder = new android/support/v7/view/menu/SubMenuBuilder;
          Context localContext = getContext();
          localSubMenuBuilder.<init>(localContext, this, paramMenuItem);
          paramMenuItem.setSubMenu(localSubMenuBuilder);
        }
        localSubMenuBuilder = (SubMenuBuilder)paramMenuItem.getSubMenu();
        if (bool3) {
          localb.onPrepareSubMenu(localSubMenuBuilder);
        }
        bool1 = dispatchSubMenuSelected(localSubMenuBuilder, paramMenuPresenter) | j;
        if (!bool1) {
          close(bool2);
        }
      }
      else
      {
        int i = paramInt & 0x1;
        if (i == 0) {
          close(bool2);
        }
        i = j;
      }
    }
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    MenuItemImpl localMenuItemImpl = findItemWithShortcutForKey(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (localMenuItemImpl != null) {
      bool = performItemAction(localMenuItemImpl, paramInt2);
    }
    int i = paramInt2 & 0x2;
    if (i != 0)
    {
      i = 1;
      close(i);
    }
    return bool;
  }
  
  public void removeGroup(int paramInt)
  {
    int i = findGroupIndex(paramInt);
    if (i >= 0)
    {
      int j = this.mItems.size() - i;
      int k = 0;
      MenuItemImpl localMenuItemImpl = null;
      for (;;)
      {
        int m = k + 1;
        if (k >= j) {
          break;
        }
        localMenuItemImpl = (MenuItemImpl)this.mItems.get(i);
        k = localMenuItemImpl.getGroupId();
        if (k != paramInt) {
          break;
        }
        removeItemAtInt(i, false);
        k = m;
      }
      k = 1;
      onItemsChanged(k);
    }
  }
  
  public void removeItem(int paramInt)
  {
    int i = findItemIndex(paramInt);
    removeItemAtInt(i, true);
  }
  
  public void removeItemAt(int paramInt)
  {
    removeItemAtInt(paramInt, true);
  }
  
  public void removeMenuPresenter(MenuPresenter paramMenuPresenter)
  {
    Object localObject1 = this.mPresenters;
    Iterator localIterator = ((CopyOnWriteArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (WeakReference)localIterator.next();
      Object localObject2 = (MenuPresenter)((WeakReference)localObject1).get();
      if ((localObject2 == null) || (localObject2 == paramMenuPresenter))
      {
        localObject2 = this.mPresenters;
        ((CopyOnWriteArrayList)localObject2).remove(localObject1);
      }
    }
  }
  
  public void restoreActionViewStates(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    for (;;)
    {
      return;
      Object localObject = getActionViewStatesKey();
      SparseArray localSparseArray = paramBundle.getSparseParcelableArray((String)localObject);
      int i = size();
      int j = 0;
      localObject = null;
      for (int k = 0; k < i; k = j)
      {
        localObject = getItem(k);
        View localView = ((MenuItem)localObject).getActionView();
        if (localView != null)
        {
          int m = localView.getId();
          int n = -1;
          if (m != n) {
            localView.restoreHierarchyState(localSparseArray);
          }
        }
        boolean bool = ((MenuItem)localObject).hasSubMenu();
        if (bool)
        {
          localObject = (SubMenuBuilder)((MenuItem)localObject).getSubMenu();
          ((SubMenuBuilder)localObject).restoreActionViewStates(paramBundle);
        }
        j = k + 1;
      }
      localObject = "android:menu:expandedactionview";
      j = paramBundle.getInt((String)localObject);
      if (j > 0)
      {
        localObject = findItem(j);
        if (localObject != null) {
          ((MenuItem)localObject).expandActionView();
        }
      }
    }
  }
  
  public void restorePresenterStates(Bundle paramBundle)
  {
    dispatchRestoreInstanceState(paramBundle);
  }
  
  public void saveActionViewStates(Bundle paramBundle)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = size();
    int j = 0;
    boolean bool2 = false;
    for (Object localObject2 = null; j < i; localObject2 = localObject1)
    {
      MenuItem localMenuItem = getItem(j);
      localObject1 = localMenuItem.getActionView();
      if (localObject1 != null)
      {
        int m = ((View)localObject1).getId();
        int n = -1;
        if (m != n)
        {
          if (localObject2 == null)
          {
            localObject2 = new android/util/SparseArray;
            ((SparseArray)localObject2).<init>();
          }
          ((View)localObject1).saveHierarchyState((SparseArray)localObject2);
          bool1 = localMenuItem.isActionViewExpanded();
          if (bool1)
          {
            localObject1 = "android:menu:expandedactionview";
            m = localMenuItem.getItemId();
            paramBundle.putInt((String)localObject1, m);
          }
        }
      }
      localObject1 = localObject2;
      bool2 = localMenuItem.hasSubMenu();
      if (bool2)
      {
        localObject2 = (SubMenuBuilder)localMenuItem.getSubMenu();
        ((SubMenuBuilder)localObject2).saveActionViewStates(paramBundle);
      }
      int k = j + 1;
      j = k;
    }
    if (localObject2 != null)
    {
      localObject1 = getActionViewStatesKey();
      paramBundle.putSparseParcelableArray((String)localObject1, (SparseArray)localObject2);
    }
  }
  
  public void savePresenterStates(Bundle paramBundle)
  {
    dispatchSaveInstanceState(paramBundle);
  }
  
  public void setCallback(MenuBuilder.Callback paramCallback)
  {
    this.mCallback = paramCallback;
  }
  
  public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.mCurrentMenuInfo = paramContextMenuInfo;
  }
  
  public MenuBuilder setDefaultShowAsAction(int paramInt)
  {
    this.mDefaultShowAsAction = paramInt;
    return this;
  }
  
  void setExclusiveItemChecked(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getGroupId();
    Object localObject = this.mItems;
    int j = ((ArrayList)localObject).size();
    stopDispatchingItemsChanged();
    int k = 0;
    if (k < j)
    {
      localObject = (MenuItemImpl)this.mItems.get(k);
      int m = ((MenuItemImpl)localObject).getGroupId();
      if (m == i)
      {
        bool = ((MenuItemImpl)localObject).isExclusiveCheckable();
        if (bool) {
          break label81;
        }
      }
      label81:
      do
      {
        int n = k + 1;
        k = n;
        break;
        bool = ((MenuItemImpl)localObject).isCheckable();
      } while (!bool);
      if (localObject == paramMenuItem) {}
      for (boolean bool = true;; bool = false)
      {
        ((MenuItemImpl)localObject).setCheckedInt(bool);
        break;
      }
    }
    startDispatchingItemsChanged();
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = this.mItems.size();
    int j = 0;
    MenuItemImpl localMenuItemImpl = null;
    for (int k = 0; k < i; k = j)
    {
      localMenuItemImpl = (MenuItemImpl)this.mItems.get(k);
      int m = localMenuItemImpl.getGroupId();
      if (m == paramInt)
      {
        localMenuItemImpl.setExclusiveCheckable(paramBoolean2);
        localMenuItemImpl.setCheckable(paramBoolean1);
      }
      j = k + 1;
    }
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i = this.mItems.size();
    int j = 0;
    MenuItemImpl localMenuItemImpl = null;
    for (int k = 0; k < i; k = j)
    {
      localMenuItemImpl = (MenuItemImpl)this.mItems.get(k);
      int m = localMenuItemImpl.getGroupId();
      if (m == paramInt) {
        localMenuItemImpl.setEnabled(paramBoolean);
      }
      j = k + 1;
    }
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f2 = 0.0F;
    MenuItemImpl localMenuItemImpl = null;
    int i = this.mItems.size();
    int j = 0;
    boolean bool3 = false;
    float f3 = 0.0F;
    if (j < i)
    {
      localMenuItemImpl = (MenuItemImpl)this.mItems.get(j);
      int k = localMenuItemImpl.getGroupId();
      if (k != paramInt) {
        break label115;
      }
      bool2 = localMenuItemImpl.setVisibleInt(paramBoolean);
      if (!bool2) {
        break label115;
      }
      bool2 = bool1;
    }
    for (f2 = f1;; f2 = f3)
    {
      j += 1;
      bool3 = bool2;
      f3 = f2;
      break;
      if (bool3) {
        onItemsChanged(bool1);
      }
      return;
      label115:
      bool2 = bool3;
    }
  }
  
  protected MenuBuilder setHeaderIconInt(int paramInt)
  {
    setHeaderInternal(0, null, paramInt, null, null);
    return this;
  }
  
  protected MenuBuilder setHeaderIconInt(Drawable paramDrawable)
  {
    setHeaderInternal(0, null, 0, paramDrawable, null);
    return this;
  }
  
  protected MenuBuilder setHeaderTitleInt(int paramInt)
  {
    setHeaderInternal(paramInt, null, 0, null, null);
    return this;
  }
  
  protected MenuBuilder setHeaderTitleInt(CharSequence paramCharSequence)
  {
    setHeaderInternal(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  protected MenuBuilder setHeaderViewInt(View paramView)
  {
    setHeaderInternal(0, null, 0, null, paramView);
    return this;
  }
  
  public void setOptionalIconsVisible(boolean paramBoolean)
  {
    this.mOptionalIconsVisible = paramBoolean;
  }
  
  public void setOverrideVisibleItems(boolean paramBoolean)
  {
    this.mOverrideVisibleItems = paramBoolean;
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    this.mQwertyMode = paramBoolean;
    onItemsChanged(false);
  }
  
  public void setShortcutsVisible(boolean paramBoolean)
  {
    boolean bool = this.mShortcutsVisible;
    if (bool == paramBoolean) {}
    for (;;)
    {
      return;
      setShortcutsVisibleInner(paramBoolean);
      bool = false;
      onItemsChanged(false);
    }
  }
  
  public int size()
  {
    return this.mItems.size();
  }
  
  public void startDispatchingItemsChanged()
  {
    this.mPreventDispatchingItemsChanged = false;
    boolean bool = this.mItemsChangedWhileDispatchPrevented;
    if (bool)
    {
      this.mItemsChangedWhileDispatchPrevented = false;
      bool = this.mStructureChangedWhileDispatchPrevented;
      onItemsChanged(bool);
    }
  }
  
  public void stopDispatchingItemsChanged()
  {
    boolean bool = this.mPreventDispatchingItemsChanged;
    if (!bool)
    {
      bool = true;
      this.mPreventDispatchingItemsChanged = bool;
      this.mItemsChangedWhileDispatchPrevented = false;
      this.mStructureChangedWhileDispatchPrevented = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */