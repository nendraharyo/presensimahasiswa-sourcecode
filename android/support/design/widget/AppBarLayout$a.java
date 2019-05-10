package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.a.k;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout.LayoutParams;

public class AppBarLayout$a
  extends LinearLayout.LayoutParams
{
  int a;
  Interpolator b;
  
  public AppBarLayout$a(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.a = 1;
  }
  
  public AppBarLayout$a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i = 1;
    this.a = i;
    Object localObject = a.k.AppBarLayout_Layout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int j = a.k.AppBarLayout_Layout_layout_scrollFlags;
    j = ((TypedArray)localObject).getInt(j, 0);
    this.a = j;
    j = a.k.AppBarLayout_Layout_layout_scrollInterpolator;
    boolean bool = ((TypedArray)localObject).hasValue(j);
    if (bool)
    {
      int k = a.k.AppBarLayout_Layout_layout_scrollInterpolator;
      k = ((TypedArray)localObject).getResourceId(k, 0);
      Interpolator localInterpolator = AnimationUtils.loadInterpolator(paramContext, k);
      this.b = localInterpolator;
    }
    ((TypedArray)localObject).recycle();
  }
  
  public AppBarLayout$a(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.a = 1;
  }
  
  public AppBarLayout$a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    this.a = 1;
  }
  
  public AppBarLayout$a(LinearLayout.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.a = 1;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public Interpolator b()
  {
    return this.b;
  }
  
  boolean c()
  {
    int i = 1;
    int j = this.a & 0x1;
    if (j == i)
    {
      int k = this.a & 0xA;
      if (k == 0) {}
    }
    for (;;)
    {
      return i;
      i = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\AppBarLayout$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */