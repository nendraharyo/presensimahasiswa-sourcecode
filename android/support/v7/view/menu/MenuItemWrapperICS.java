package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.d.a.b;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public class MenuItemWrapperICS
  extends BaseMenuWrapper
  implements MenuItem
{
  static final String LOG_TAG = "MenuItemWrapper";
  private Method mSetExclusiveCheckableMethod;
  
  MenuItemWrapperICS(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  public boolean collapseActionView()
  {
    return ((b)this.mWrappedObject).collapseActionView();
  }
  
  MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(ActionProvider paramActionProvider)
  {
    MenuItemWrapperICS.ActionProviderWrapper localActionProviderWrapper = new android/support/v7/view/menu/MenuItemWrapperICS$ActionProviderWrapper;
    Context localContext = this.mContext;
    localActionProviderWrapper.<init>(this, localContext, paramActionProvider);
    return localActionProviderWrapper;
  }
  
  public boolean expandActionView()
  {
    return ((b)this.mWrappedObject).expandActionView();
  }
  
  public ActionProvider getActionProvider()
  {
    Object localObject = ((b)this.mWrappedObject).getSupportActionProvider();
    boolean bool = localObject instanceof MenuItemWrapperICS.ActionProviderWrapper;
    if (bool) {}
    for (localObject = ((MenuItemWrapperICS.ActionProviderWrapper)localObject).mInner;; localObject = null) {
      return (ActionProvider)localObject;
    }
  }
  
  public View getActionView()
  {
    View localView = ((b)this.mWrappedObject).getActionView();
    boolean bool = localView instanceof MenuItemWrapperICS.CollapsibleActionViewWrapper;
    if (bool) {
      localView = ((MenuItemWrapperICS.CollapsibleActionViewWrapper)localView).getWrappedView();
    }
    return localView;
  }
  
  public int getAlphabeticModifiers()
  {
    return ((b)this.mWrappedObject).getAlphabeticModifiers();
  }
  
  public char getAlphabeticShortcut()
  {
    return ((b)this.mWrappedObject).getAlphabeticShortcut();
  }
  
  public CharSequence getContentDescription()
  {
    return ((b)this.mWrappedObject).getContentDescription();
  }
  
  public int getGroupId()
  {
    return ((b)this.mWrappedObject).getGroupId();
  }
  
  public Drawable getIcon()
  {
    return ((b)this.mWrappedObject).getIcon();
  }
  
  public ColorStateList getIconTintList()
  {
    return ((b)this.mWrappedObject).getIconTintList();
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return ((b)this.mWrappedObject).getIconTintMode();
  }
  
  public Intent getIntent()
  {
    return ((b)this.mWrappedObject).getIntent();
  }
  
  public int getItemId()
  {
    return ((b)this.mWrappedObject).getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return ((b)this.mWrappedObject).getMenuInfo();
  }
  
  public int getNumericModifiers()
  {
    return ((b)this.mWrappedObject).getNumericModifiers();
  }
  
  public char getNumericShortcut()
  {
    return ((b)this.mWrappedObject).getNumericShortcut();
  }
  
  public int getOrder()
  {
    return ((b)this.mWrappedObject).getOrder();
  }
  
  public SubMenu getSubMenu()
  {
    SubMenu localSubMenu = ((b)this.mWrappedObject).getSubMenu();
    return getSubMenuWrapper(localSubMenu);
  }
  
  public CharSequence getTitle()
  {
    return ((b)this.mWrappedObject).getTitle();
  }
  
  public CharSequence getTitleCondensed()
  {
    return ((b)this.mWrappedObject).getTitleCondensed();
  }
  
  public CharSequence getTooltipText()
  {
    return ((b)this.mWrappedObject).getTooltipText();
  }
  
  public boolean hasSubMenu()
  {
    return ((b)this.mWrappedObject).hasSubMenu();
  }
  
  public boolean isActionViewExpanded()
  {
    return ((b)this.mWrappedObject).isActionViewExpanded();
  }
  
  public boolean isCheckable()
  {
    return ((b)this.mWrappedObject).isCheckable();
  }
  
  public boolean isChecked()
  {
    return ((b)this.mWrappedObject).isChecked();
  }
  
  public boolean isEnabled()
  {
    return ((b)this.mWrappedObject).isEnabled();
  }
  
  public boolean isVisible()
  {
    return ((b)this.mWrappedObject).isVisible();
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    b localb = (b)this.mWrappedObject;
    if (paramActionProvider != null) {}
    for (MenuItemWrapperICS.ActionProviderWrapper localActionProviderWrapper = createActionProviderWrapper(paramActionProvider);; localActionProviderWrapper = null)
    {
      localb.setSupportActionProvider(localActionProviderWrapper);
      return this;
    }
  }
  
  public MenuItem setActionView(int paramInt)
  {
    ((b)this.mWrappedObject).setActionView(paramInt);
    b localb = (b)this.mWrappedObject;
    View localView = localb.getActionView();
    boolean bool = localView instanceof CollapsibleActionView;
    if (bool)
    {
      localb = (b)this.mWrappedObject;
      MenuItemWrapperICS.CollapsibleActionViewWrapper localCollapsibleActionViewWrapper = new android/support/v7/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper;
      localCollapsibleActionViewWrapper.<init>((View)localView);
      localb.setActionView(localCollapsibleActionViewWrapper);
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    boolean bool = paramView instanceof CollapsibleActionView;
    if (bool)
    {
      MenuItemWrapperICS.CollapsibleActionViewWrapper localCollapsibleActionViewWrapper = new android/support/v7/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper;
      localCollapsibleActionViewWrapper.<init>((View)paramView);
      paramView = localCollapsibleActionViewWrapper;
    }
    ((b)this.mWrappedObject).setActionView(paramView);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    ((b)this.mWrappedObject).setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    ((b)this.mWrappedObject).setAlphabeticShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    ((b)this.mWrappedObject).setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    ((b)this.mWrappedObject).setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    ((b)this.mWrappedObject).setContentDescription(paramCharSequence);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    ((b)this.mWrappedObject).setEnabled(paramBoolean);
    return this;
  }
  
  public void setExclusiveCheckable(boolean paramBoolean)
  {
    try
    {
      Object localObject1 = this.mSetExclusiveCheckableMethod;
      if (localObject1 == null)
      {
        localObject1 = this.mWrappedObject;
        localObject1 = (b)localObject1;
        localObject1 = localObject1.getClass();
        localObject2 = "setExclusiveCheckable";
        i = 1;
        localObject3 = new Class[i];
        localObject4 = Boolean.TYPE;
        localObject3[0] = localObject4;
        localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, (Class[])localObject3);
        this.mSetExclusiveCheckableMethod = ((Method)localObject1);
      }
      localObject1 = this.mSetExclusiveCheckableMethod;
      localObject2 = this.mWrappedObject;
      int i = 1;
      localObject3 = new Object[i];
      Object localObject4 = Boolean.valueOf(paramBoolean);
      localObject3[0] = localObject4;
      ((Method)localObject1).invoke(localObject2, (Object[])localObject3);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = "MenuItemWrapper";
        Object localObject3 = "Error while calling setExclusiveCheckable";
        Log.w((String)localObject2, (String)localObject3, localException);
      }
    }
  }
  
  public MenuItem setIcon(int paramInt)
  {
    ((b)this.mWrappedObject).setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    ((b)this.mWrappedObject).setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    ((b)this.mWrappedObject).setIconTintList(paramColorStateList);
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    ((b)this.mWrappedObject).setIconTintMode(paramMode);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    ((b)this.mWrappedObject).setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    ((b)this.mWrappedObject).setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    ((b)this.mWrappedObject).setNumericShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    b localb = (b)this.mWrappedObject;
    MenuItemWrapperICS.OnActionExpandListenerWrapper localOnActionExpandListenerWrapper;
    if (paramOnActionExpandListener != null)
    {
      localOnActionExpandListenerWrapper = new android/support/v7/view/menu/MenuItemWrapperICS$OnActionExpandListenerWrapper;
      localOnActionExpandListenerWrapper.<init>(this, paramOnActionExpandListener);
    }
    for (;;)
    {
      localb.setOnActionExpandListener(localOnActionExpandListenerWrapper);
      return this;
      localOnActionExpandListenerWrapper = null;
    }
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    b localb = (b)this.mWrappedObject;
    MenuItemWrapperICS.OnMenuItemClickListenerWrapper localOnMenuItemClickListenerWrapper;
    if (paramOnMenuItemClickListener != null)
    {
      localOnMenuItemClickListenerWrapper = new android/support/v7/view/menu/MenuItemWrapperICS$OnMenuItemClickListenerWrapper;
      localOnMenuItemClickListenerWrapper.<init>(this, paramOnMenuItemClickListener);
    }
    for (;;)
    {
      localb.setOnMenuItemClickListener(localOnMenuItemClickListenerWrapper);
      return this;
      localOnMenuItemClickListenerWrapper = null;
    }
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    ((b)this.mWrappedObject).setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    ((b)this.mWrappedObject).setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    ((b)this.mWrappedObject).setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt)
  {
    ((b)this.mWrappedObject).setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    ((b)this.mWrappedObject).setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    ((b)this.mWrappedObject).setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    ((b)this.mWrappedObject).setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    ((b)this.mWrappedObject).setTooltipText(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    return ((b)this.mWrappedObject).setVisible(paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuItemWrapperICS.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */