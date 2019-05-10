package android.support.v7.widget;

class RecyclerView$2
  implements Runnable
{
  RecyclerView$2(RecyclerView paramRecyclerView) {}
  
  public void run()
  {
    RecyclerView.ItemAnimator localItemAnimator = this.this$0.mItemAnimator;
    if (localItemAnimator != null)
    {
      localItemAnimator = this.this$0.mItemAnimator;
      localItemAnimator.runPendingAnimations();
    }
    this.this$0.mPostedAnimatorRunner = false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */