package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.a.c;
import android.support.design.a.d;
import android.support.design.a.j;
import android.support.design.a.k;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.design.internal.c;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.attr;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class BottomNavigationView
  extends FrameLayout
{
  private static final int[] a;
  private static final int[] b;
  private final MenuBuilder c;
  private final c d;
  private final BottomNavigationPresenter e;
  private MenuInflater f;
  private BottomNavigationView.b g;
  private BottomNavigationView.a h;
  
  static
  {
    int i = 1;
    int[] arrayOfInt = new int[i];
    arrayOfInt[0] = 16842912;
    a = arrayOfInt;
    arrayOfInt = new int[i];
    arrayOfInt[0] = -16842910;
    b = arrayOfInt;
  }
  
  public BottomNavigationView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public BottomNavigationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public BottomNavigationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/support/design/internal/BottomNavigationPresenter;
    ((BottomNavigationPresenter)localObject1).<init>();
    this.e = ((BottomNavigationPresenter)localObject1);
    o.a(paramContext);
    localObject1 = new android/support/design/internal/b;
    ((android.support.design.internal.b)localObject1).<init>(paramContext);
    this.c = ((MenuBuilder)localObject1);
    localObject1 = new android/support/design/internal/c;
    ((c)localObject1).<init>(paramContext);
    this.d = ((c)localObject1);
    localObject1 = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject1).<init>(j, j);
    j = 17;
    ((FrameLayout.LayoutParams)localObject1).gravity = j;
    this.d.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    Object localObject2 = this.e;
    Object localObject3 = this.d;
    ((BottomNavigationPresenter)localObject2).a((c)localObject3);
    localObject2 = this.e;
    float f1 = Float.MIN_VALUE;
    ((BottomNavigationPresenter)localObject2).a(1);
    localObject2 = this.d;
    localObject3 = this.e;
    ((c)localObject2).setPresenter((BottomNavigationPresenter)localObject3);
    localObject2 = this.c;
    localObject3 = this.e;
    ((MenuBuilder)localObject2).addMenuPresenter((MenuPresenter)localObject3);
    localObject2 = this.e;
    localObject3 = getContext();
    Object localObject4 = this.c;
    ((BottomNavigationPresenter)localObject2).initForMenu((Context)localObject3, (MenuBuilder)localObject4);
    localObject2 = a.k.BottomNavigationView;
    int k = a.j.Widget_Design_BottomNavigationView;
    localObject2 = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject2, paramInt, k);
    k = a.k.BottomNavigationView_itemIconTint;
    boolean bool1 = ((TintTypedArray)localObject2).hasValue(k);
    if (bool1)
    {
      localObject3 = this.d;
      int i3 = a.k.BottomNavigationView_itemIconTint;
      localObject4 = ((TintTypedArray)localObject2).getColorStateList(i3);
      ((c)localObject3).setIconTintList((ColorStateList)localObject4);
      int m = a.k.BottomNavigationView_itemTextColor;
      boolean bool2 = ((TintTypedArray)localObject2).hasValue(m);
      if (!bool2) {
        break label519;
      }
      localObject3 = this.d;
      i3 = a.k.BottomNavigationView_itemTextColor;
      localObject4 = ((TintTypedArray)localObject2).getColorStateList(i3);
      ((c)localObject3).setItemTextColor((ColorStateList)localObject4);
    }
    for (;;)
    {
      int n = a.k.BottomNavigationView_elevation;
      boolean bool3 = ((TintTypedArray)localObject2).hasValue(n);
      if (bool3)
      {
        i1 = a.k.BottomNavigationView_elevation;
        i1 = ((TintTypedArray)localObject2).getDimensionPixelSize(i1, 0);
        f1 = i1;
        r.a(this, f1);
      }
      int i1 = a.k.BottomNavigationView_itemBackground;
      i1 = ((TintTypedArray)localObject2).getResourceId(i1, 0);
      localObject4 = this.d;
      ((c)localObject4).setItemBackgroundRes(i1);
      i1 = a.k.BottomNavigationView_menu;
      boolean bool4 = ((TintTypedArray)localObject2).hasValue(i1);
      if (bool4)
      {
        int i2 = a.k.BottomNavigationView_menu;
        i2 = ((TintTypedArray)localObject2).getResourceId(i2, 0);
        a(i2);
      }
      ((TintTypedArray)localObject2).recycle();
      localObject2 = this.d;
      addView((View)localObject2, (ViewGroup.LayoutParams)localObject1);
      int i4 = Build.VERSION.SDK_INT;
      j = 21;
      if (i4 < j) {
        a(paramContext);
      }
      localObject1 = this.c;
      localObject2 = new android/support/design/widget/BottomNavigationView$1;
      ((BottomNavigationView.1)localObject2).<init>(this);
      ((MenuBuilder)localObject1).setCallback((MenuBuilder.Callback)localObject2);
      return;
      localObject3 = this.d;
      localObject4 = b(i);
      ((c)localObject3).setIconTintList((ColorStateList)localObject4);
      break;
      label519:
      localObject3 = this.d;
      localObject4 = b(i);
      ((c)localObject3).setItemTextColor((ColorStateList)localObject4);
    }
  }
  
  private void a(Context paramContext)
  {
    View localView = new android/view/View;
    localView.<init>(paramContext);
    int i = a.c.design_bottom_navigation_shadow_color;
    i = android.support.v4.a.b.c(paramContext, i);
    localView.setBackgroundColor(i);
    FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
    Resources localResources = getResources();
    int j = a.d.design_bottom_navigation_shadow_height;
    int k = localResources.getDimensionPixelSize(j);
    localLayoutParams.<init>(-1, k);
    localView.setLayoutParams(localLayoutParams);
    addView(localView);
  }
  
  private ColorStateList b(int paramInt)
  {
    ColorStateList localColorStateList = null;
    int i = 3;
    int j = 2;
    boolean bool1 = true;
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    Object localObject = getContext().getTheme();
    boolean bool2 = ((Resources.Theme)localObject).resolveAttribute(paramInt, localTypedValue, bool1);
    if (!bool2) {}
    for (;;)
    {
      return localColorStateList;
      localObject = getContext();
      int m = localTypedValue.resourceId;
      localObject = AppCompatResources.getColorStateList((Context)localObject, m);
      Resources.Theme localTheme = getContext().getTheme();
      int i1 = R.attr.colorPrimary;
      boolean bool3 = localTheme.resolveAttribute(i1, localTypedValue, bool1);
      if (bool3)
      {
        int i2 = localTypedValue.data;
        int n = ((ColorStateList)localObject).getDefaultColor();
        localColorStateList = new android/content/res/ColorStateList;
        int[][] arrayOfInt = new int[i][];
        int[] arrayOfInt1 = b;
        arrayOfInt[0] = arrayOfInt1;
        arrayOfInt1 = a;
        arrayOfInt[bool1] = arrayOfInt1;
        arrayOfInt1 = EMPTY_STATE_SET;
        arrayOfInt[j] = arrayOfInt1;
        arrayOfInt1 = new int[i];
        int[] arrayOfInt2 = b;
        int k = ((ColorStateList)localObject).getColorForState(arrayOfInt2, n);
        arrayOfInt1[0] = k;
        arrayOfInt1[bool1] = i2;
        arrayOfInt1[j] = n;
        localColorStateList.<init>(arrayOfInt, arrayOfInt1);
      }
    }
  }
  
  private MenuInflater getMenuInflater()
  {
    Object localObject = this.f;
    if (localObject == null)
    {
      localObject = new android/support/v7/view/SupportMenuInflater;
      Context localContext = getContext();
      ((SupportMenuInflater)localObject).<init>(localContext);
      this.f = ((MenuInflater)localObject);
    }
    return this.f;
  }
  
  public void a(int paramInt)
  {
    boolean bool = true;
    this.e.a(bool);
    MenuInflater localMenuInflater = getMenuInflater();
    MenuBuilder localMenuBuilder = this.c;
    localMenuInflater.inflate(paramInt, localMenuBuilder);
    this.e.a(false);
    this.e.updateMenuView(bool);
  }
  
  public int getItemBackgroundResource()
  {
    return this.d.getItemBackgroundRes();
  }
  
  public ColorStateList getItemIconTintList()
  {
    return this.d.getIconTintList();
  }
  
  public ColorStateList getItemTextColor()
  {
    return this.d.getItemTextColor();
  }
  
  public int getMaxItemCount()
  {
    return 5;
  }
  
  public Menu getMenu()
  {
    return this.c;
  }
  
  public int getSelectedItemId()
  {
    return this.d.getSelectedItemId();
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof BottomNavigationView.SavedState;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (BottomNavigationView.SavedState)paramParcelable;
      Object localObject = paramParcelable.getSuperState();
      super.onRestoreInstanceState((Parcelable)localObject);
      localObject = this.c;
      Bundle localBundle = paramParcelable.a;
      ((MenuBuilder)localObject).restorePresenterStates(localBundle);
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    Object localObject = super.onSaveInstanceState();
    BottomNavigationView.SavedState localSavedState = new android/support/design/widget/BottomNavigationView$SavedState;
    localSavedState.<init>((Parcelable)localObject);
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    localSavedState.a = ((Bundle)localObject);
    localObject = this.c;
    Bundle localBundle = localSavedState.a;
    ((MenuBuilder)localObject).savePresenterStates(localBundle);
    return localSavedState;
  }
  
  public void setItemBackgroundResource(int paramInt)
  {
    this.d.setItemBackgroundRes(paramInt);
  }
  
  public void setItemIconTintList(ColorStateList paramColorStateList)
  {
    this.d.setIconTintList(paramColorStateList);
  }
  
  public void setItemTextColor(ColorStateList paramColorStateList)
  {
    this.d.setItemTextColor(paramColorStateList);
  }
  
  public void setOnNavigationItemReselectedListener(BottomNavigationView.a parama)
  {
    this.h = parama;
  }
  
  public void setOnNavigationItemSelectedListener(BottomNavigationView.b paramb)
  {
    this.g = paramb;
  }
  
  public void setSelectedItemId(int paramInt)
  {
    MenuItem localMenuItem = this.c.findItem(paramInt);
    if (localMenuItem != null)
    {
      MenuBuilder localMenuBuilder = this.c;
      BottomNavigationPresenter localBottomNavigationPresenter = this.e;
      boolean bool = localMenuBuilder.performItemAction(localMenuItem, localBottomNavigationPresenter, 0);
      if (!bool)
      {
        bool = true;
        localMenuItem.setChecked(bool);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\BottomNavigationView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */