package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.design.a.d;
import android.support.design.a.e;
import android.support.design.a.f;
import android.support.design.a.h;
import android.support.v4.a.b;
import android.support.v4.view.p;
import android.support.v4.view.r;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuView.ItemView;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;

public class a
  extends FrameLayout
  implements MenuView.ItemView
{
  private static final int[] a;
  private final int b;
  private final int c;
  private final float d;
  private final float e;
  private boolean f;
  private ImageView g;
  private final TextView h;
  private final TextView i;
  private int j = -1;
  private MenuItemImpl k;
  private ColorStateList l;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16842912;
    a = arrayOfInt;
  }
  
  public a(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = getResources();
    int m = a.d.design_bottom_navigation_text_size;
    m = ((Resources)localObject).getDimensionPixelSize(m);
    int n = a.d.design_bottom_navigation_active_text_size;
    n = ((Resources)localObject).getDimensionPixelSize(n);
    int i1 = a.d.design_bottom_navigation_margin;
    int i2 = ((Resources)localObject).getDimensionPixelSize(i1);
    this.b = i2;
    i2 = m - n;
    this.c = i2;
    float f2 = n * f1;
    float f3 = m;
    f2 /= f3;
    this.d = f2;
    f2 = m * f1;
    float f4 = n;
    f2 /= f4;
    this.e = f2;
    localObject = LayoutInflater.from(paramContext);
    m = a.h.design_bottom_navigation_item;
    ((LayoutInflater)localObject).inflate(m, this, true);
    i2 = a.e.design_bottom_navigation_item_background;
    setBackgroundResource(i2);
    i2 = a.f.icon;
    localObject = (ImageView)findViewById(i2);
    this.g = ((ImageView)localObject);
    i2 = a.f.smallLabel;
    localObject = (TextView)findViewById(i2);
    this.h = ((TextView)localObject);
    i2 = a.f.largeLabel;
    localObject = (TextView)findViewById(i2);
    this.i = ((TextView)localObject);
  }
  
  public MenuItemImpl getItemData()
  {
    return this.k;
  }
  
  public int getItemPosition()
  {
    return this.j;
  }
  
  public void initialize(MenuItemImpl paramMenuItemImpl, int paramInt)
  {
    this.k = paramMenuItemImpl;
    boolean bool = paramMenuItemImpl.isCheckable();
    setCheckable(bool);
    bool = paramMenuItemImpl.isChecked();
    setChecked(bool);
    bool = paramMenuItemImpl.isEnabled();
    setEnabled(bool);
    Object localObject = paramMenuItemImpl.getIcon();
    setIcon((Drawable)localObject);
    localObject = paramMenuItemImpl.getTitle();
    setTitle((CharSequence)localObject);
    int m = paramMenuItemImpl.getItemId();
    setId(m);
    localObject = paramMenuItemImpl.getContentDescription();
    setContentDescription((CharSequence)localObject);
    localObject = paramMenuItemImpl.getTooltipText();
    TooltipCompat.setTooltipText(this, (CharSequence)localObject);
  }
  
  public int[] onCreateDrawableState(int paramInt)
  {
    int m = paramInt + 1;
    int[] arrayOfInt = super.onCreateDrawableState(m);
    Object localObject = this.k;
    if (localObject != null)
    {
      localObject = this.k;
      boolean bool = ((MenuItemImpl)localObject).isCheckable();
      if (bool)
      {
        localObject = this.k;
        bool = ((MenuItemImpl)localObject).isChecked();
        if (bool)
        {
          localObject = a;
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
  }
  
  public void setChecked(boolean paramBoolean)
  {
    float f1 = 0.5F;
    int m = 49;
    int n = 4;
    float f2 = 1.0F;
    Object localObject1 = this.i;
    float f3 = this.i.getWidth() / 2;
    ((TextView)localObject1).setPivotX(f3);
    localObject1 = this.i;
    f3 = this.i.getBaseline();
    ((TextView)localObject1).setPivotY(f3);
    localObject1 = this.h;
    f3 = this.h.getWidth() / 2;
    ((TextView)localObject1).setPivotX(f3);
    localObject1 = this.h;
    Object localObject2 = this.h;
    int i1 = ((TextView)localObject2).getBaseline();
    f3 = i1;
    ((TextView)localObject1).setPivotY(f3);
    boolean bool = this.f;
    if (bool) {
      if (paramBoolean)
      {
        localObject1 = (FrameLayout.LayoutParams)this.g.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject1).gravity = m;
        i1 = this.b;
        ((FrameLayout.LayoutParams)localObject1).topMargin = i1;
        localObject2 = this.g;
        ((ImageView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        this.i.setVisibility(0);
        this.i.setScaleX(f2);
        localObject1 = this.i;
        ((TextView)localObject1).setScaleY(f2);
        localObject1 = this.h;
        ((TextView)localObject1).setVisibility(n);
      }
    }
    for (;;)
    {
      refreshDrawableState();
      return;
      localObject1 = (FrameLayout.LayoutParams)this.g.getLayoutParams();
      f3 = 2.4E-44F;
      ((FrameLayout.LayoutParams)localObject1).gravity = 17;
      i1 = this.b;
      ((FrameLayout.LayoutParams)localObject1).topMargin = i1;
      localObject2 = this.g;
      ((ImageView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.i.setVisibility(n);
      this.i.setScaleX(f1);
      localObject1 = this.i;
      ((TextView)localObject1).setScaleY(f1);
      break;
      if (paramBoolean)
      {
        localObject1 = (FrameLayout.LayoutParams)this.g.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject1).gravity = m;
        i1 = this.b;
        m = this.c;
        i1 += m;
        ((FrameLayout.LayoutParams)localObject1).topMargin = i1;
        localObject2 = this.g;
        ((ImageView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        this.i.setVisibility(0);
        this.h.setVisibility(n);
        this.i.setScaleX(f2);
        this.i.setScaleY(f2);
        localObject1 = this.h;
        f3 = this.d;
        ((TextView)localObject1).setScaleX(f3);
        localObject1 = this.h;
        f3 = this.d;
        ((TextView)localObject1).setScaleY(f3);
      }
      else
      {
        localObject1 = (FrameLayout.LayoutParams)this.g.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject1).gravity = m;
        i1 = this.b;
        ((FrameLayout.LayoutParams)localObject1).topMargin = i1;
        localObject2 = this.g;
        ((ImageView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        this.i.setVisibility(n);
        this.h.setVisibility(0);
        localObject1 = this.i;
        f3 = this.e;
        ((TextView)localObject1).setScaleX(f3);
        localObject1 = this.i;
        f3 = this.e;
        ((TextView)localObject1).setScaleY(f3);
        this.h.setScaleX(f2);
        localObject1 = this.h;
        ((TextView)localObject1).setScaleY(f2);
      }
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.h.setEnabled(paramBoolean);
    this.i.setEnabled(paramBoolean);
    Object localObject = this.g;
    ((ImageView)localObject).setEnabled(paramBoolean);
    if (paramBoolean)
    {
      localObject = getContext();
      int m = 1002;
      localObject = p.a((Context)localObject, m);
      r.a(this, (p)localObject);
    }
    for (;;)
    {
      return;
      localObject = null;
      r.a(this, null);
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    Object localObject;
    if (paramDrawable != null)
    {
      localObject = paramDrawable.getConstantState();
      if (localObject != null) {
        break label40;
      }
    }
    for (;;)
    {
      paramDrawable = android.support.v4.b.a.a.g(paramDrawable).mutate();
      localObject = this.l;
      android.support.v4.b.a.a.a(paramDrawable, (ColorStateList)localObject);
      this.g.setImageDrawable(paramDrawable);
      return;
      label40:
      paramDrawable = ((Drawable.ConstantState)localObject).newDrawable();
    }
  }
  
  public void setIconTintList(ColorStateList paramColorStateList)
  {
    this.l = paramColorStateList;
    Object localObject = this.k;
    if (localObject != null)
    {
      localObject = this.k.getIcon();
      setIcon((Drawable)localObject);
    }
  }
  
  public void setItemBackground(int paramInt)
  {
    if (paramInt == 0) {}
    for (Drawable localDrawable = null;; localDrawable = b.a(getContext(), paramInt))
    {
      r.a(this, localDrawable);
      return;
    }
  }
  
  public void setItemPosition(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void setShiftingMode(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public void setShortcut(boolean paramBoolean, char paramChar) {}
  
  public void setTextColor(ColorStateList paramColorStateList)
  {
    this.h.setTextColor(paramColorStateList);
    this.i.setTextColor(paramColorStateList);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.h.setText(paramCharSequence);
    this.i.setText(paramCharSequence);
  }
  
  public boolean showsIcon()
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\internal\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */