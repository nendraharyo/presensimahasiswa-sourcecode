package android.support.v7.widget;

class FastScroller$2
  extends RecyclerView.OnScrollListener
{
  FastScroller$2(FastScroller paramFastScroller) {}
  
  public void onScrolled(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    FastScroller localFastScroller = this.this$0;
    int i = paramRecyclerView.computeHorizontalScrollOffset();
    int j = paramRecyclerView.computeVerticalScrollOffset();
    localFastScroller.updateScrollPosition(i, j);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\FastScroller$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */