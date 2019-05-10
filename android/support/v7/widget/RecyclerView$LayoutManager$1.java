package android.support.v7.widget;

import android.view.View;

class RecyclerView$LayoutManager$1
  implements ViewBoundsCheck.Callback
{
  RecyclerView$LayoutManager$1(RecyclerView.LayoutManager paramLayoutManager) {}
  
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
    int i = this.this$0.getDecoratedRight(paramView);
    return localLayoutParams.rightMargin + i;
  }
  
  public int getChildStart(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.this$0.getDecoratedLeft(paramView);
    int j = localLayoutParams.leftMargin;
    return i - j;
  }
  
  public View getParent()
  {
    return this.this$0.mRecyclerView;
  }
  
  public int getParentEnd()
  {
    int i = this.this$0.getWidth();
    int j = this.this$0.getPaddingRight();
    return i - j;
  }
  
  public int getParentStart()
  {
    return this.this$0.getPaddingLeft();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$LayoutManager$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */