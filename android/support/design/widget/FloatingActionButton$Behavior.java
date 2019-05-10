package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.a.k;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public class FloatingActionButton$Behavior
  extends CoordinatorLayout.b
{
  private Rect a;
  private FloatingActionButton.a b;
  private boolean c;
  
  public FloatingActionButton$Behavior()
  {
    this.c = true;
  }
  
  public FloatingActionButton$Behavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = a.k.FloatingActionButton_Behavior_Layout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i = a.k.FloatingActionButton_Behavior_Layout_behavior_autoHide;
    boolean bool = ((TypedArray)localObject).getBoolean(i, true);
    this.c = bool;
    ((TypedArray)localObject).recycle();
  }
  
  private void a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton)
  {
    int i = 0;
    Rect localRect = paramFloatingActionButton.c;
    int j;
    CoordinatorLayout.e locale;
    int k;
    int m;
    int n;
    if (localRect != null)
    {
      j = localRect.centerX();
      if (j > 0)
      {
        j = localRect.centerY();
        if (j > 0)
        {
          locale = (CoordinatorLayout.e)paramFloatingActionButton.getLayoutParams();
          k = paramFloatingActionButton.getRight();
          m = paramCoordinatorLayout.getWidth();
          n = locale.rightMargin;
          m -= n;
          if (k < m) {
            break label146;
          }
          k = localRect.right;
        }
      }
    }
    for (;;)
    {
      m = paramFloatingActionButton.getBottom();
      n = paramCoordinatorLayout.getHeight();
      int i1 = locale.bottomMargin;
      n -= i1;
      if (m >= n) {
        i = localRect.bottom;
      }
      for (;;)
      {
        if (i != 0) {
          android.support.v4.view.r.c(paramFloatingActionButton, i);
        }
        if (k != 0) {
          android.support.v4.view.r.d(paramFloatingActionButton, k);
        }
        return;
        label146:
        k = paramFloatingActionButton.getLeft();
        m = locale.leftMargin;
        if (k > m) {
          break label211;
        }
        k = -localRect.left;
        break;
        m = paramFloatingActionButton.getTop();
        j = locale.topMargin;
        if (m <= j)
        {
          j = localRect.top;
          i = -j;
        }
      }
      label211:
      k = 0;
    }
  }
  
  private boolean a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout paramAppBarLayout, FloatingActionButton paramFloatingActionButton)
  {
    boolean bool1 = false;
    boolean bool2 = a(paramAppBarLayout, paramFloatingActionButton);
    if (!bool2) {
      return bool1;
    }
    Object localObject = this.a;
    if (localObject == null)
    {
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>();
      this.a = ((Rect)localObject);
    }
    localObject = this.a;
    android.support.v4.widget.r.b(paramCoordinatorLayout, paramAppBarLayout, (Rect)localObject);
    int i = ((Rect)localObject).bottom;
    int j = paramAppBarLayout.getMinimumHeightForVisibleOverlappingContent();
    if (i <= j)
    {
      localObject = this.b;
      paramFloatingActionButton.b((FloatingActionButton.a)localObject, false);
    }
    for (;;)
    {
      bool1 = true;
      break;
      localObject = this.b;
      paramFloatingActionButton.a((FloatingActionButton.a)localObject, false);
    }
  }
  
  private static boolean a(View paramView)
  {
    Object localObject = paramView.getLayoutParams();
    boolean bool1 = localObject instanceof CoordinatorLayout.e;
    boolean bool2;
    if (bool1)
    {
      localObject = ((CoordinatorLayout.e)localObject).b();
      bool2 = localObject instanceof BottomSheetBehavior;
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject = null;
    }
  }
  
  private boolean a(View paramView, FloatingActionButton paramFloatingActionButton)
  {
    CoordinatorLayout.e locale = (CoordinatorLayout.e)paramFloatingActionButton.getLayoutParams();
    boolean bool1 = this.c;
    boolean bool2;
    if (!bool1)
    {
      bool2 = false;
      locale = null;
    }
    for (;;)
    {
      return bool2;
      int j = locale.a();
      int i = paramView.getId();
      if (j != i)
      {
        j = 0;
        locale = null;
      }
      else
      {
        j = paramFloatingActionButton.getUserSetVisibility();
        if (j != 0)
        {
          j = 0;
          locale = null;
        }
        else
        {
          j = 1;
        }
      }
    }
  }
  
  private boolean b(View paramView, FloatingActionButton paramFloatingActionButton)
  {
    boolean bool = a(paramView, paramFloatingActionButton);
    if (!bool)
    {
      bool = false;
      localObject = null;
      return bool;
    }
    Object localObject = (CoordinatorLayout.e)paramFloatingActionButton.getLayoutParams();
    int j = paramView.getTop();
    int k = paramFloatingActionButton.getHeight() / 2;
    int i = ((CoordinatorLayout.e)localObject).topMargin + k;
    if (j < i)
    {
      localObject = this.b;
      paramFloatingActionButton.b((FloatingActionButton.a)localObject, false);
    }
    for (;;)
    {
      i = 1;
      break;
      localObject = this.b;
      paramFloatingActionButton.a((FloatingActionButton.a)localObject, false);
    }
  }
  
  public void a(CoordinatorLayout.e parame)
  {
    int i = parame.h;
    if (i == 0)
    {
      i = 80;
      parame.h = i;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, int paramInt)
  {
    List localList = paramCoordinatorLayout.c(paramFloatingActionButton);
    boolean bool1 = false;
    Object localObject = null;
    int j = localList.size();
    label94:
    label120:
    int i;
    for (int k = 0;; k = i)
    {
      boolean bool2;
      if (k < j)
      {
        localObject = (View)localList.get(k);
        bool2 = localObject instanceof AppBarLayout;
        if (!bool2) {
          break label94;
        }
        localObject = (AppBarLayout)localObject;
        bool1 = a(paramCoordinatorLayout, (AppBarLayout)localObject, paramFloatingActionButton);
        if (!bool1) {
          break label120;
        }
      }
      do
      {
        paramCoordinatorLayout.a(paramFloatingActionButton, paramInt);
        a(paramCoordinatorLayout, paramFloatingActionButton);
        return true;
        bool2 = a((View)localObject);
        if (!bool2) {
          break;
        }
        bool1 = b((View)localObject, paramFloatingActionButton);
      } while (bool1);
      i = k + 1;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, Rect paramRect)
  {
    Rect localRect = paramFloatingActionButton.c;
    int i = paramFloatingActionButton.getLeft();
    int j = localRect.left;
    i += j;
    j = paramFloatingActionButton.getTop();
    int k = localRect.top;
    j += k;
    k = paramFloatingActionButton.getRight();
    int m = localRect.right;
    k -= m;
    m = paramFloatingActionButton.getBottom();
    int n = localRect.bottom;
    n = m - n;
    paramRect.set(i, j, k, n);
    return true;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, FloatingActionButton paramFloatingActionButton, View paramView)
  {
    boolean bool = paramView instanceof AppBarLayout;
    if (bool)
    {
      paramView = (AppBarLayout)paramView;
      a(paramCoordinatorLayout, paramView, paramFloatingActionButton);
    }
    for (;;)
    {
      return false;
      bool = a(paramView);
      if (bool) {
        b(paramView, paramFloatingActionButton);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\FloatingActionButton$Behavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */