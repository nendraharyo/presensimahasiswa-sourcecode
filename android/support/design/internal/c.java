package android.support.design.internal;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.design.a.d;
import android.support.transition.u;
import android.support.transition.w;
import android.support.transition.y;
import android.support.v4.h.k.a;
import android.support.v4.h.k.c;
import android.support.v4.view.b.b;
import android.support.v4.view.r;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

public class c
  extends ViewGroup
  implements MenuView
{
  private final y a;
  private final int b;
  private final int c;
  private final int d;
  private final int e;
  private final View.OnClickListener f;
  private final k.a g;
  private boolean h;
  private a[] i;
  private int j;
  private int k;
  private ColorStateList l;
  private ColorStateList m;
  private int n;
  private int[] o;
  private BottomNavigationPresenter p;
  private MenuBuilder q;
  
  public c(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public c(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject1 = new android/support/v4/h/k$c;
    ((k.c)localObject1).<init>(i1);
    this.g = ((k.a)localObject1);
    this.h = true;
    this.j = 0;
    this.k = 0;
    localObject1 = getResources();
    int i2 = a.d.design_bottom_navigation_item_max_width;
    i2 = ((Resources)localObject1).getDimensionPixelSize(i2);
    this.b = i2;
    i2 = a.d.design_bottom_navigation_item_min_width;
    i2 = ((Resources)localObject1).getDimensionPixelSize(i2);
    this.c = i2;
    i2 = a.d.design_bottom_navigation_active_item_max_width;
    i2 = ((Resources)localObject1).getDimensionPixelSize(i2);
    this.d = i2;
    i2 = a.d.design_bottom_navigation_height;
    int i3 = ((Resources)localObject1).getDimensionPixelSize(i2);
    this.e = i3;
    localObject1 = new android/support/transition/e;
    ((android.support.transition.e)localObject1).<init>();
    this.a = ((y)localObject1);
    this.a.a(0);
    this.a.c(115);
    localObject1 = this.a;
    Object localObject2 = new android/support/v4/view/b/b;
    ((b)localObject2).<init>();
    ((y)localObject1).b((TimeInterpolator)localObject2);
    localObject1 = this.a;
    localObject2 = new android/support/design/internal/e;
    ((e)localObject2).<init>();
    ((y)localObject1).b((u)localObject2);
    localObject1 = new android/support/design/internal/c$1;
    ((c.1)localObject1).<init>(this);
    this.f = ((View.OnClickListener)localObject1);
    localObject1 = new int[i1];
    this.o = ((int[])localObject1);
  }
  
  private a getNewItem()
  {
    a locala = (a)this.g.acquire();
    if (locala == null)
    {
      locala = new android/support/design/internal/a;
      Context localContext = getContext();
      locala.<init>(localContext);
    }
    return locala;
  }
  
  public void a()
  {
    int i1 = 1;
    int i2 = 0;
    removeAllViews();
    Object localObject = this.i;
    a[] arrayOfa;
    if (localObject != null)
    {
      arrayOfa = this.i;
      int i3 = arrayOfa.length;
      i4 = 0;
      localObject = null;
      while (i4 < i3)
      {
        a locala1 = arrayOfa[i4];
        k.a locala = this.g;
        locala.release(locala1);
        i4 += 1;
      }
    }
    localObject = this.q;
    int i4 = ((MenuBuilder)localObject).size();
    if (i4 == 0)
    {
      this.j = 0;
      this.k = 0;
      i4 = 0;
      localObject = null;
      this.i = null;
    }
    for (;;)
    {
      return;
      localObject = new a[this.q.size()];
      this.i = ((a[])localObject);
      localObject = this.q;
      i4 = ((MenuBuilder)localObject).size();
      int i6 = 3;
      if (i4 > i6) {
        i4 = i1;
      }
      for (;;)
      {
        this.h = i4;
        i6 = 0;
        arrayOfa = null;
        for (;;)
        {
          localObject = this.q;
          i4 = ((MenuBuilder)localObject).size();
          if (i6 >= i4) {
            break;
          }
          this.p.a(i1);
          this.q.getItem(i6).setCheckable(i1);
          this.p.a(false);
          a locala2 = getNewItem();
          this.i[i6] = locala2;
          localObject = this.l;
          locala2.setIconTintList((ColorStateList)localObject);
          localObject = this.m;
          locala2.setTextColor((ColorStateList)localObject);
          i4 = this.n;
          locala2.setItemBackground(i4);
          boolean bool = this.h;
          locala2.setShiftingMode(bool);
          localObject = (MenuItemImpl)this.q.getItem(i6);
          locala2.initialize((MenuItemImpl)localObject, 0);
          locala2.setItemPosition(i6);
          localObject = this.f;
          locala2.setOnClickListener((View.OnClickListener)localObject);
          addView(locala2);
          i5 = i6 + 1;
          i6 = i5;
        }
        i5 = 0;
        localObject = null;
      }
      int i5 = this.q.size() + -1;
      i2 = this.k;
      i5 = Math.min(i5, i2);
      this.k = i5;
      localObject = this.q;
      i2 = this.k;
      localObject = ((MenuBuilder)localObject).getItem(i2);
      ((MenuItem)localObject).setChecked(i1);
    }
  }
  
  void a(int paramInt)
  {
    int i1 = this.q.size();
    int i2 = 0;
    for (;;)
    {
      if (i2 < i1)
      {
        MenuItem localMenuItem = this.q.getItem(i2);
        int i4 = localMenuItem.getItemId();
        if (paramInt == i4)
        {
          this.j = paramInt;
          this.k = i2;
          i2 = 1;
          localMenuItem.setChecked(i2);
        }
      }
      else
      {
        return;
      }
      int i3;
      i2 += 1;
    }
  }
  
  public void b()
  {
    int i1 = this.q.size();
    Object localObject1 = this.i;
    int i2 = localObject1.length;
    if (i1 != i2) {
      a();
    }
    for (;;)
    {
      return;
      int i3 = this.j;
      i2 = 0;
      localObject1 = null;
      Object localObject2;
      int i4;
      while (i2 < i1)
      {
        localObject2 = this.q.getItem(i2);
        boolean bool = ((MenuItem)localObject2).isChecked();
        if (bool)
        {
          i4 = ((MenuItem)localObject2).getItemId();
          this.j = i4;
          this.k = i2;
        }
        i2 += 1;
      }
      i2 = this.j;
      if (i3 != i2)
      {
        localObject1 = this.a;
        w.a(this, (u)localObject1);
      }
      for (i3 = 0; i3 < i1; i3 = i2)
      {
        localObject1 = this.p;
        i4 = 1;
        ((BottomNavigationPresenter)localObject1).a(i4);
        localObject2 = this.i[i3];
        localObject1 = (MenuItemImpl)this.q.getItem(i3);
        ((a)localObject2).initialize((MenuItemImpl)localObject1, 0);
        localObject1 = this.p;
        ((BottomNavigationPresenter)localObject1).a(false);
        i2 = i3 + 1;
      }
    }
  }
  
  public ColorStateList getIconTintList()
  {
    return this.l;
  }
  
  public int getItemBackgroundRes()
  {
    return this.n;
  }
  
  public ColorStateList getItemTextColor()
  {
    return this.m;
  }
  
  public int getSelectedItemId()
  {
    return this.j;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  public void initialize(MenuBuilder paramMenuBuilder)
  {
    this.q = paramMenuBuilder;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = paramInt3 - paramInt1;
    int i3 = paramInt4 - paramInt2;
    int i4 = 0;
    int i5 = 0;
    while (i4 < i1)
    {
      View localView = getChildAt(i4);
      int i6 = localView.getVisibility();
      int i7 = 8;
      if (i6 == i7)
      {
        i4 += 1;
      }
      else
      {
        i6 = r.e(this);
        i7 = 1;
        if (i6 == i7)
        {
          i6 = i2 - i5;
          i7 = localView.getMeasuredWidth();
          i6 -= i7;
          i7 = i2 - i5;
          localView.layout(i6, 0, i7, i3);
        }
        for (;;)
        {
          int i8 = localView.getMeasuredWidth();
          i5 += i8;
          break;
          i6 = localView.getMeasuredWidth() + i5;
          localView.layout(i5, 0, i6, i3);
        }
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 1073741824;
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = getChildCount();
    int i4 = View.MeasureSpec.makeMeasureSpec(this.e, i1);
    boolean bool = this.h;
    int i6;
    int i7;
    int i8;
    label153:
    int[] arrayOfInt2;
    if (bool)
    {
      i5 = i3 + -1;
      i6 = this.c * i5;
      i6 = i2 - i6;
      i7 = this.d;
      i6 = Math.min(i6, i7);
      i7 = (i2 - i6) / i5;
      i8 = this.b;
      i7 = Math.min(i7, i8);
      i2 -= i6;
      i5 *= i7;
      i2 -= i5;
      i8 = 0;
      if (i8 >= i3) {
        break label329;
      }
      int[] arrayOfInt1 = this.o;
      i5 = this.k;
      if (i8 == i5)
      {
        i5 = i6;
        arrayOfInt1[i8] = i5;
        if (i2 <= 0) {
          break label479;
        }
        arrayOfInt2 = this.o;
        int i9 = arrayOfInt2[i8] + 1;
        arrayOfInt2[i8] = i9;
      }
    }
    label329:
    label479:
    for (int i5 = i2 + -1;; i5 = i2)
    {
      i8 += 1;
      i2 = i5;
      break;
      i5 = i7;
      break label153;
      if (i3 == 0) {}
      Object localObject;
      for (i5 = 1;; i5 = i3)
      {
        i5 = i2 / i5;
        i6 = this.d;
        i7 = Math.min(i5, i6);
        i5 = i7 * i3;
        i5 = i2 - i5;
        i6 = 0;
        while (i6 < i3)
        {
          localObject = this.o;
          localObject[i6] = i7;
          if (i5 > 0)
          {
            localObject = this.o;
            i8 = localObject[i6] + 1;
            localObject[i6] = i8;
            i5 += -1;
          }
          i6 += 1;
        }
      }
      i6 = 0;
      i5 = 0;
      arrayOfInt2 = null;
      if (i6 < i3)
      {
        View localView = getChildAt(i6);
        i2 = localView.getVisibility();
        i8 = 8;
        if (i2 == i8) {}
        for (;;)
        {
          i6 += 1;
          break;
          i2 = View.MeasureSpec.makeMeasureSpec(this.o[i6], i1);
          localView.measure(i2, i4);
          localObject = localView.getLayoutParams();
          i8 = localView.getMeasuredWidth();
          ((ViewGroup.LayoutParams)localObject).width = i8;
          i7 = localView.getMeasuredWidth();
          i5 += i7;
        }
      }
      i6 = View.MeasureSpec.makeMeasureSpec(i5, i1);
      i5 = View.resolveSizeAndState(i5, i6, 0);
      i6 = View.resolveSizeAndState(this.e, i4, 0);
      setMeasuredDimension(i5, i6);
      return;
    }
  }
  
  public void setIconTintList(ColorStateList paramColorStateList)
  {
    this.l = paramColorStateList;
    a[] arrayOfa1 = this.i;
    if (arrayOfa1 == null) {}
    for (;;)
    {
      return;
      a[] arrayOfa2 = this.i;
      int i1 = arrayOfa2.length;
      int i2 = 0;
      arrayOfa1 = null;
      while (i2 < i1)
      {
        a locala = arrayOfa2[i2];
        locala.setIconTintList(paramColorStateList);
        i2 += 1;
      }
    }
  }
  
  public void setItemBackgroundRes(int paramInt)
  {
    this.n = paramInt;
    a[] arrayOfa1 = this.i;
    if (arrayOfa1 == null) {}
    for (;;)
    {
      return;
      a[] arrayOfa2 = this.i;
      int i1 = arrayOfa2.length;
      int i2 = 0;
      arrayOfa1 = null;
      while (i2 < i1)
      {
        a locala = arrayOfa2[i2];
        locala.setItemBackground(paramInt);
        i2 += 1;
      }
    }
  }
  
  public void setItemTextColor(ColorStateList paramColorStateList)
  {
    this.m = paramColorStateList;
    a[] arrayOfa1 = this.i;
    if (arrayOfa1 == null) {}
    for (;;)
    {
      return;
      a[] arrayOfa2 = this.i;
      int i1 = arrayOfa2.length;
      int i2 = 0;
      arrayOfa1 = null;
      while (i2 < i1)
      {
        a locala = arrayOfa2[i2];
        locala.setTextColor(paramColorStateList);
        i2 += 1;
      }
    }
  }
  
  public void setPresenter(BottomNavigationPresenter paramBottomNavigationPresenter)
  {
    this.p = paramBottomNavigationPresenter;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\internal\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */