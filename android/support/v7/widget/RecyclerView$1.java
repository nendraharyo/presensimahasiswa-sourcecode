package android.support.v7.widget;

class RecyclerView$1
  implements Runnable
{
  RecyclerView$1(RecyclerView paramRecyclerView) {}
  
  public void run()
  {
    RecyclerView localRecyclerView = this.this$0;
    boolean bool1 = localRecyclerView.mFirstLayoutComplete;
    if (bool1)
    {
      localRecyclerView = this.this$0;
      bool1 = localRecyclerView.isLayoutRequested();
      if (!bool1) {
        break label29;
      }
    }
    for (;;)
    {
      return;
      label29:
      localRecyclerView = this.this$0;
      bool1 = localRecyclerView.mIsAttached;
      if (!bool1)
      {
        localRecyclerView = this.this$0;
        localRecyclerView.requestLayout();
      }
      else
      {
        localRecyclerView = this.this$0;
        bool1 = localRecyclerView.mLayoutFrozen;
        if (bool1)
        {
          localRecyclerView = this.this$0;
          boolean bool2 = true;
          localRecyclerView.mLayoutWasDefered = bool2;
        }
        else
        {
          localRecyclerView = this.this$0;
          localRecyclerView.consumePendingUpdateOperations();
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */