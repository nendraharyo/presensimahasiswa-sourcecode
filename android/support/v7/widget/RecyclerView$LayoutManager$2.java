package android.support.v7.widget;

import android.view.View;

class RecyclerView$LayoutManager$2
  implements ViewBoundsCheck.Callback
{
  RecyclerView$LayoutManager$2(RecyclerView.LayoutManager paramLayoutManager) {}
  
  public View getChildAt(int paramInt)
  {
    return this.this$0.getChildAt(paramInt);
  }
  
  public int getChildCount()
  {
    return this.this$0.getChildCount();
  }
  
  public int getChildEnd(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.this$0.getDecoratedBottom(paramView);
    return localLayoutParams.bottomMargin + i;
  }
  
  public int getChildStart(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.this$0.getDecoratedTop(paramView);
    int j = localLayoutParams.topMargin;
    return i - j;
  }
  
  public View getParent()
  {
    return this.this$0.mRecyclerView;
  }
  
  public int getParentEnd()
  {
    int i = this.this$0.getHeight();
    int j = this.this$0.getPaddingBottom();
    return i - j;
  }
  
  public int getParentStart()
  {
    return this.this$0.getPaddingTop();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$LayoutManager$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */