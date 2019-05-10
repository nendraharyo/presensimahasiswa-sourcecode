package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class ExpandedMenuView
  extends ListView
  implements MenuBuilder.ItemInvoker, MenuView, AdapterView.OnItemClickListener
{
  private static final int[] TINT_ATTRS;
  private int mAnimations;
  private MenuBuilder mMenu;
  
  static
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 16842964;
    arrayOfInt[1] = 16843049;
    TINT_ATTRS = arrayOfInt;
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    Object localObject = TINT_ATTRS;
    localObject = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject, paramInt, 0);
    boolean bool = ((TintTypedArray)localObject).hasValue(0);
    Drawable localDrawable;
    if (bool)
    {
      localDrawable = ((TintTypedArray)localObject).getDrawable(0);
      setBackgroundDrawable(localDrawable);
    }
    bool = ((TintTypedArray)localObject).hasValue(i);
    if (bool)
    {
      localDrawable = ((TintTypedArray)localObject).getDrawable(i);
      setDivider(localDrawable);
    }
    ((TintTypedArray)localObject).recycle();
  }
  
  public int getWindowAnimations()
  {
    return this.mAnimations;
  }
  
  public void initialize(MenuBuilder paramMenuBuilder)
  {
    this.mMenu = paramMenuBuilder;
  }
  
  public boolean invokeItem(MenuItemImpl paramMenuItemImpl)
  {
    return this.mMenu.performItemAction(paramMenuItemImpl, 0);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    MenuItemImpl localMenuItemImpl = (MenuItemImpl)getAdapter().getItem(paramInt);
    invokeItem(localMenuItemImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\ExpandedMenuView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */