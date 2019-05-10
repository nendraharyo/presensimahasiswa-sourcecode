package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.style;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

public final class AppCompatDelegateImplV9$PanelFeatureState
{
  int background;
  View createdPanelView;
  ViewGroup decorView;
  int featureId;
  Bundle frozenActionViewState;
  Bundle frozenMenuState;
  int gravity;
  boolean isHandled;
  boolean isOpen;
  boolean isPrepared;
  ListMenuPresenter listMenuPresenter;
  Context listPresenterContext;
  MenuBuilder menu;
  public boolean qwertyMode;
  boolean refreshDecorView;
  boolean refreshMenuContent;
  View shownPanelView;
  boolean wasLastOpen;
  int windowAnimations;
  int x;
  int y;
  
  AppCompatDelegateImplV9$PanelFeatureState(int paramInt)
  {
    this.featureId = paramInt;
    this.refreshDecorView = false;
  }
  
  void applyFrozenState()
  {
    Object localObject = this.menu;
    if (localObject != null)
    {
      localObject = this.frozenMenuState;
      if (localObject != null)
      {
        localObject = this.menu;
        Bundle localBundle = this.frozenMenuState;
        ((MenuBuilder)localObject).restorePresenterStates(localBundle);
        localObject = null;
        this.frozenMenuState = null;
      }
    }
  }
  
  public void clearMenuPresenters()
  {
    MenuBuilder localMenuBuilder = this.menu;
    if (localMenuBuilder != null)
    {
      localMenuBuilder = this.menu;
      ListMenuPresenter localListMenuPresenter = this.listMenuPresenter;
      localMenuBuilder.removeMenuPresenter(localListMenuPresenter);
    }
    this.listMenuPresenter = null;
  }
  
  MenuView getListMenuView(MenuPresenter.Callback paramCallback)
  {
    Object localObject1 = this.menu;
    if (localObject1 == null) {}
    Object localObject2;
    for (localObject1 = null;; localObject1 = ((ListMenuPresenter)localObject1).getMenuView((ViewGroup)localObject2))
    {
      return (MenuView)localObject1;
      localObject1 = this.listMenuPresenter;
      if (localObject1 == null)
      {
        localObject1 = new android/support/v7/view/menu/ListMenuPresenter;
        localObject2 = this.listPresenterContext;
        int i = R.layout.abc_list_menu_item_layout;
        ((ListMenuPresenter)localObject1).<init>((Context)localObject2, i);
        this.listMenuPresenter = ((ListMenuPresenter)localObject1);
        this.listMenuPresenter.setCallback(paramCallback);
        localObject1 = this.menu;
        localObject2 = this.listMenuPresenter;
        ((MenuBuilder)localObject1).addMenuPresenter((MenuPresenter)localObject2);
      }
      localObject1 = this.listMenuPresenter;
      localObject2 = this.decorView;
    }
  }
  
  public boolean hasPanelItems()
  {
    boolean bool = true;
    Object localObject = this.shownPanelView;
    if (localObject == null) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      localObject = this.createdPanelView;
      if (localObject == null)
      {
        localObject = this.listMenuPresenter.getAdapter();
        int i = ((ListAdapter)localObject).getCount();
        if (i <= 0) {
          bool = false;
        }
      }
    }
  }
  
  void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (AppCompatDelegateImplV9.PanelFeatureState.SavedState)paramParcelable;
    int i = paramParcelable.featureId;
    this.featureId = i;
    boolean bool = paramParcelable.isOpen;
    this.wasLastOpen = bool;
    Bundle localBundle = paramParcelable.menuState;
    this.frozenMenuState = localBundle;
    this.shownPanelView = null;
    this.decorView = null;
  }
  
  Parcelable onSaveInstanceState()
  {
    AppCompatDelegateImplV9.PanelFeatureState.SavedState localSavedState = new android/support/v7/app/AppCompatDelegateImplV9$PanelFeatureState$SavedState;
    localSavedState.<init>();
    int i = this.featureId;
    localSavedState.featureId = i;
    boolean bool = this.isOpen;
    localSavedState.isOpen = bool;
    Object localObject = this.menu;
    if (localObject != null)
    {
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      localSavedState.menuState = ((Bundle)localObject);
      localObject = this.menu;
      Bundle localBundle = localSavedState.menuState;
      ((MenuBuilder)localObject).savePresenterStates(localBundle);
    }
    return localSavedState;
  }
  
  void setMenu(MenuBuilder paramMenuBuilder)
  {
    Object localObject = this.menu;
    if (paramMenuBuilder == localObject) {}
    for (;;)
    {
      return;
      localObject = this.menu;
      if (localObject != null)
      {
        localObject = this.menu;
        ListMenuPresenter localListMenuPresenter = this.listMenuPresenter;
        ((MenuBuilder)localObject).removeMenuPresenter(localListMenuPresenter);
      }
      this.menu = paramMenuBuilder;
      if (paramMenuBuilder != null)
      {
        localObject = this.listMenuPresenter;
        if (localObject != null)
        {
          localObject = this.listMenuPresenter;
          paramMenuBuilder.addMenuPresenter((MenuPresenter)localObject);
        }
      }
    }
  }
  
  void setStyle(Context paramContext)
  {
    boolean bool = true;
    Object localObject1 = new android/util/TypedValue;
    ((TypedValue)localObject1).<init>();
    Object localObject2 = paramContext.getResources().newTheme();
    Resources.Theme localTheme = paramContext.getTheme();
    ((Resources.Theme)localObject2).setTo(localTheme);
    int i = R.attr.actionBarPopupTheme;
    ((Resources.Theme)localObject2).resolveAttribute(i, (TypedValue)localObject1, bool);
    i = ((TypedValue)localObject1).resourceId;
    if (i != 0)
    {
      i = ((TypedValue)localObject1).resourceId;
      ((Resources.Theme)localObject2).applyStyle(i, bool);
    }
    i = R.attr.panelMenuListTheme;
    ((Resources.Theme)localObject2).resolveAttribute(i, (TypedValue)localObject1, bool);
    i = ((TypedValue)localObject1).resourceId;
    int j;
    if (i != 0)
    {
      j = ((TypedValue)localObject1).resourceId;
      ((Resources.Theme)localObject2).applyStyle(j, bool);
    }
    for (;;)
    {
      localObject1 = new android/support/v7/view/ContextThemeWrapper;
      ((ContextThemeWrapper)localObject1).<init>(paramContext, 0);
      ((Context)localObject1).getTheme().setTo((Resources.Theme)localObject2);
      this.listPresenterContext = ((Context)localObject1);
      localObject2 = R.styleable.AppCompatTheme;
      localObject1 = ((Context)localObject1).obtainStyledAttributes((int[])localObject2);
      int k = R.styleable.AppCompatTheme_panelBackground;
      k = ((TypedArray)localObject1).getResourceId(k, 0);
      this.background = k;
      k = R.styleable.AppCompatTheme_android_windowAnimationStyle;
      k = ((TypedArray)localObject1).getResourceId(k, 0);
      this.windowAnimations = k;
      ((TypedArray)localObject1).recycle();
      return;
      j = R.style.Theme_AppCompat_CompactMenu;
      ((Resources.Theme)localObject2).applyStyle(j, bool);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$PanelFeatureState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */