package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class u$c
{
  public void a(ViewParent paramViewParent, View paramView)
  {
    boolean bool = paramViewParent instanceof l;
    if (bool)
    {
      paramViewParent = (l)paramViewParent;
      paramViewParent.onStopNestedScroll(paramView);
    }
  }
  
  public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = paramViewParent instanceof l;
    if (bool)
    {
      Object localObject = paramViewParent;
      localObject = (l)paramViewParent;
      ((l)localObject).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    boolean bool = paramViewParent instanceof l;
    if (bool)
    {
      paramViewParent = (l)paramViewParent;
      paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
    }
  }
  
  public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool = paramViewParent instanceof l;
    if (bool) {
      paramViewParent = (l)paramViewParent;
    }
    for (bool = paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);; bool = false) {
      return bool;
    }
  }
  
  public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool = paramViewParent instanceof l;
    if (bool) {
      paramViewParent = (l)paramViewParent;
    }
    for (bool = paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);; bool = false) {
      return bool;
    }
  }
  
  public boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    boolean bool = paramViewParent instanceof l;
    if (bool) {
      paramViewParent = (l)paramViewParent;
    }
    for (bool = paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);; bool = false) {
      return bool;
    }
  }
  
  public void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    boolean bool = paramViewParent instanceof l;
    if (bool)
    {
      paramViewParent = (l)paramViewParent;
      paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\vie\\u$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */