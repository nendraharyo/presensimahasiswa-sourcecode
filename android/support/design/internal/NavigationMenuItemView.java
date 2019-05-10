package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.design.a.d;
import android.support.design.a.e;
import android.support.design.a.f;
import android.support.design.a.h;
import android.support.v4.a.a.b;
import android.support.v4.view.r;
import android.support.v4.widget.n;
import android.support.v7.appcompat.R.attr;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView.ItemView;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView
  extends d
  implements MenuView.ItemView
{
  private static final int[] d;
  boolean c;
  private final int e;
  private boolean f;
  private final CheckedTextView g;
  private FrameLayout h;
  private MenuItemImpl i;
  private ColorStateList j;
  private boolean k;
  private Drawable l;
  private final android.support.v4.view.a m;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16842912;
    d = arrayOfInt;
  }
  
  public NavigationMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = new android/support/design/internal/NavigationMenuItemView$1;
    ((NavigationMenuItemView.1)localObject).<init>(this);
    this.m = ((android.support.v4.view.a)localObject);
    setOrientation(0);
    localObject = LayoutInflater.from(paramContext);
    int n = a.h.design_navigation_menu_item;
    ((LayoutInflater)localObject).inflate(n, this, bool);
    localObject = paramContext.getResources();
    n = a.d.design_navigation_icon_size;
    int i1 = ((Resources)localObject).getDimensionPixelSize(n);
    this.e = i1;
    i1 = a.f.design_menu_item_text;
    localObject = (CheckedTextView)findViewById(i1);
    this.g = ((CheckedTextView)localObject);
    this.g.setDuplicateParentStateEnabled(bool);
    localObject = this.g;
    android.support.v4.view.a locala = this.m;
    r.a((View)localObject, locala);
  }
  
  private boolean a()
  {
    Object localObject = this.i.getTitle();
    boolean bool;
    if (localObject == null)
    {
      localObject = this.i.getIcon();
      if (localObject == null)
      {
        localObject = this.i.getActionView();
        if (localObject != null) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private void b()
  {
    boolean bool = a();
    Object localObject;
    int n;
    FrameLayout localFrameLayout;
    if (bool)
    {
      localObject = this.g;
      n = 8;
      ((CheckedTextView)localObject).setVisibility(n);
      localObject = this.h;
      if (localObject != null)
      {
        localObject = (LinearLayoutCompat.LayoutParams)this.h.getLayoutParams();
        n = -1;
        ((LinearLayoutCompat.LayoutParams)localObject).width = n;
        localFrameLayout = this.h;
        localFrameLayout.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
    }
    for (;;)
    {
      return;
      localObject = this.g;
      n = 0;
      localFrameLayout = null;
      ((CheckedTextView)localObject).setVisibility(0);
      localObject = this.h;
      if (localObject != null)
      {
        localObject = (LinearLayoutCompat.LayoutParams)this.h.getLayoutParams();
        n = -2;
        ((LinearLayoutCompat.LayoutParams)localObject).width = n;
        localFrameLayout = this.h;
        localFrameLayout.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
    }
  }
  
  private StateListDrawable c()
  {
    Object localObject1 = new android/util/TypedValue;
    ((TypedValue)localObject1).<init>();
    Object localObject2 = getContext().getTheme();
    int n = R.attr.colorControlHighlight;
    boolean bool1 = true;
    boolean bool2 = ((Resources.Theme)localObject2).resolveAttribute(n, (TypedValue)localObject1, bool1);
    if (bool2)
    {
      localObject2 = new android/graphics/drawable/StateListDrawable;
      ((StateListDrawable)localObject2).<init>();
      Object localObject3 = d;
      ColorDrawable localColorDrawable = new android/graphics/drawable/ColorDrawable;
      int i1 = ((TypedValue)localObject1).data;
      localColorDrawable.<init>(i1);
      ((StateListDrawable)localObject2).addState((int[])localObject3, localColorDrawable);
      localObject1 = EMPTY_STATE_SET;
      localObject3 = new android/graphics/drawable/ColorDrawable;
      bool1 = false;
      localColorDrawable = null;
      ((ColorDrawable)localObject3).<init>(0);
      ((StateListDrawable)localObject2).addState((int[])localObject1, (Drawable)localObject3);
    }
    for (;;)
    {
      return (StateListDrawable)localObject2;
      bool2 = false;
      localObject2 = null;
    }
  }
  
  private void setActionView(View paramView)
  {
    if (paramView != null)
    {
      FrameLayout localFrameLayout = this.h;
      if (localFrameLayout == null)
      {
        int n = a.f.design_menu_item_action_area_stub;
        localFrameLayout = (FrameLayout)((ViewStub)findViewById(n)).inflate();
        this.h = localFrameLayout;
      }
      this.h.removeAllViews();
      localFrameLayout = this.h;
      localFrameLayout.addView(paramView);
    }
  }
  
  public MenuItemImpl getItemData()
  {
    return this.i;
  }
  
  public void initialize(MenuItemImpl paramMenuItemImpl, int paramInt)
  {
    this.i = paramMenuItemImpl;
    int n = paramMenuItemImpl.isVisible();
    Object localObject;
    if (n != 0)
    {
      n = 0;
      localObject = null;
    }
    for (;;)
    {
      setVisibility(n);
      localObject = getBackground();
      if (localObject == null)
      {
        localObject = c();
        r.a(this, (Drawable)localObject);
      }
      boolean bool = paramMenuItemImpl.isCheckable();
      setCheckable(bool);
      bool = paramMenuItemImpl.isChecked();
      setChecked(bool);
      bool = paramMenuItemImpl.isEnabled();
      setEnabled(bool);
      localObject = paramMenuItemImpl.getTitle();
      setTitle((CharSequence)localObject);
      localObject = paramMenuItemImpl.getIcon();
      setIcon((Drawable)localObject);
      localObject = paramMenuItemImpl.getActionView();
      setActionView((View)localObject);
      localObject = paramMenuItemImpl.getContentDescription();
      setContentDescription((CharSequence)localObject);
      localObject = paramMenuItemImpl.getTooltipText();
      TooltipCompat.setTooltipText(this, (CharSequence)localObject);
      b();
      return;
      int i1 = 8;
    }
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int n = paramInt + 1;
    int[] arrayOfInt = super.onCreateDrawableState(n);
    Object localObject = this.i;
    if (localObject != null)
    {
      localObject = this.i;
      boolean bool = ((MenuItemImpl)localObject).isCheckable();
      if (bool)
      {
        localObject = this.i;
        bool = ((MenuItemImpl)localObject).isChecked();
        if (bool)
        {
          localObject = d;
          mergeDrawableStates(arrayOfInt, (int[])localObject);
        }
      }
    }
    return arrayOfInt;
  }
  
  public boolean prefersCondensedTitle()
  {
    return false;
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    refreshDrawableState();
    boolean bool = this.c;
    if (bool != paramBoolean)
    {
      this.c = paramBoolean;
      android.support.v4.view.a locala = this.m;
      CheckedTextView localCheckedTextView = this.g;
      int n = 2048;
      locala.sendAccessibilityEvent(localCheckedTextView, n);
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    refreshDrawableState();
    this.g.setChecked(paramBoolean);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    Object localObject;
    int i1;
    if (paramDrawable != null)
    {
      boolean bool1 = this.k;
      if (bool1)
      {
        localObject = paramDrawable.getConstantState();
        if (localObject == null)
        {
          paramDrawable = android.support.v4.b.a.a.g(paramDrawable).mutate();
          localObject = this.j;
          android.support.v4.b.a.a.a(paramDrawable, (ColorStateList)localObject);
        }
      }
      else
      {
        int n = this.e;
        i1 = this.e;
        paramDrawable.setBounds(0, 0, n, i1);
      }
    }
    for (;;)
    {
      n.a(this.g, paramDrawable, null, null, null);
      return;
      paramDrawable = ((Drawable.ConstantState)localObject).newDrawable();
      break;
      boolean bool2 = this.f;
      if (bool2)
      {
        localObject = this.l;
        if (localObject == null)
        {
          localObject = getResources();
          i1 = a.e.navigation_empty_icon;
          Resources.Theme localTheme = getContext().getTheme();
          localObject = b.a((Resources)localObject, i1, localTheme);
          this.l = ((Drawable)localObject);
          localObject = this.l;
          if (localObject != null)
          {
            localObject = this.l;
            i1 = this.e;
            int i2 = this.e;
            ((Drawable)localObject).setBounds(0, 0, i1, i2);
          }
        }
        paramDrawable = this.l;
      }
    }
  }
  
  void setIconTintList(ColorStateList paramColorStateList)
  {
    this.j = paramColorStateList;
    Object localObject = this.j;
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      this.k = bool;
      localObject = this.i;
      if (localObject != null)
      {
        localObject = this.i.getIcon();
        setIcon((Drawable)localObject);
      }
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public void setNeedsEmptyIcon(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public void setShortcut(boolean paramBoolean, char paramChar) {}
  
  public void setTextAppearance(int paramInt)
  {
    n.a(this.g, paramInt);
  }
  
  public void setTextColor(ColorStateList paramColorStateList)
  {
    this.g.setTextColor(paramColorStateList);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.g.setText(paramCharSequence);
  }
  
  public boolean showsIcon()
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\internal\NavigationMenuItemView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */