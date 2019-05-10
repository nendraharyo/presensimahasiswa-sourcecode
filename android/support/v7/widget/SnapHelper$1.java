package android.support.v7.widget;

class SnapHelper$1
  extends RecyclerView.OnScrollListener
{
  boolean mScrolled = false;
  
  SnapHelper$1(SnapHelper paramSnapHelper) {}
  
  public void onScrollStateChanged(RecyclerView paramRecyclerView, int paramInt)
  {
    super.onScrollStateChanged(paramRecyclerView, paramInt);
    if (paramInt == 0)
    {
      boolean bool = this.mScrolled;
      if (bool)
      {
        bool = false;
        this.mScrolled = false;
        SnapHelper localSnapHelper = this.this$0;
        localSnapHelper.snapToTargetExistingView();
      }
    }
  }
  
  public void onScrolled(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      boolean bool = true;
      this.mScrolled = bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SnapHelper$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */