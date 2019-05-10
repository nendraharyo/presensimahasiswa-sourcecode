package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

public abstract class RecyclerView$ItemAnimator
{
  public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
  public static final int FLAG_CHANGED = 2;
  public static final int FLAG_INVALIDATED = 4;
  public static final int FLAG_MOVED = 2048;
  public static final int FLAG_REMOVED = 8;
  private long mAddDuration;
  private long mChangeDuration;
  private ArrayList mFinishedListeners;
  private RecyclerView.ItemAnimator.ItemAnimatorListener mListener = null;
  private long mMoveDuration;
  private long mRemoveDuration;
  
  public RecyclerView$ItemAnimator()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mFinishedListeners = localArrayList;
    this.mAddDuration = l2;
    this.mRemoveDuration = l2;
    this.mMoveDuration = l1;
    this.mChangeDuration = l1;
  }
  
  static int buildAdapterChangeFlagsForAnimations(RecyclerView.ViewHolder paramViewHolder)
  {
    int i = -1;
    int j = RecyclerView.ViewHolder.access$1600(paramViewHolder) & 0xE;
    boolean bool = paramViewHolder.isInvalid();
    if (bool) {
      j = 4;
    }
    for (;;)
    {
      return j;
      int k = j & 0x4;
      if (k == 0)
      {
        k = paramViewHolder.getOldPosition();
        int m = paramViewHolder.getAdapterPosition();
        if ((k != i) && (m != i) && (k != m)) {
          j |= 0x800;
        }
      }
    }
  }
  
  public abstract boolean animateAppearance(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  
  public abstract boolean animateChange(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  
  public abstract boolean animateDisappearance(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  
  public abstract boolean animatePersistence(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
  
  public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder paramViewHolder)
  {
    return true;
  }
  
  public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder paramViewHolder, List paramList)
  {
    return canReuseUpdatedViewHolder(paramViewHolder);
  }
  
  public final void dispatchAnimationFinished(RecyclerView.ViewHolder paramViewHolder)
  {
    onAnimationFinished(paramViewHolder);
    RecyclerView.ItemAnimator.ItemAnimatorListener localItemAnimatorListener = this.mListener;
    if (localItemAnimatorListener != null)
    {
      localItemAnimatorListener = this.mListener;
      localItemAnimatorListener.onAnimationFinished(paramViewHolder);
    }
  }
  
  public final void dispatchAnimationStarted(RecyclerView.ViewHolder paramViewHolder)
  {
    onAnimationStarted(paramViewHolder);
  }
  
  public final void dispatchAnimationsFinished()
  {
    int i = this.mFinishedListeners.size();
    int j = 0;
    RecyclerView.ItemAnimator.ItemAnimatorFinishedListener localItemAnimatorFinishedListener = null;
    for (int k = 0; k < i; k = j)
    {
      localItemAnimatorFinishedListener = (RecyclerView.ItemAnimator.ItemAnimatorFinishedListener)this.mFinishedListeners.get(k);
      localItemAnimatorFinishedListener.onAnimationsFinished();
      j = k + 1;
    }
    this.mFinishedListeners.clear();
  }
  
  public abstract void endAnimation(RecyclerView.ViewHolder paramViewHolder);
  
  public abstract void endAnimations();
  
  public long getAddDuration()
  {
    return this.mAddDuration;
  }
  
  public long getChangeDuration()
  {
    return this.mChangeDuration;
  }
  
  public long getMoveDuration()
  {
    return this.mMoveDuration;
  }
  
  public long getRemoveDuration()
  {
    return this.mRemoveDuration;
  }
  
  public abstract boolean isRunning();
  
  public final boolean isRunning(RecyclerView.ItemAnimator.ItemAnimatorFinishedListener paramItemAnimatorFinishedListener)
  {
    boolean bool = isRunning();
    if (paramItemAnimatorFinishedListener != null)
    {
      if (bool) {
        break label21;
      }
      paramItemAnimatorFinishedListener.onAnimationsFinished();
    }
    for (;;)
    {
      return bool;
      label21:
      ArrayList localArrayList = this.mFinishedListeners;
      localArrayList.add(paramItemAnimatorFinishedListener);
    }
  }
  
  public RecyclerView.ItemAnimator.ItemHolderInfo obtainHolderInfo()
  {
    RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo = new android/support/v7/widget/RecyclerView$ItemAnimator$ItemHolderInfo;
    localItemHolderInfo.<init>();
    return localItemHolderInfo;
  }
  
  public void onAnimationFinished(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void onAnimationStarted(RecyclerView.ViewHolder paramViewHolder) {}
  
  public RecyclerView.ItemAnimator.ItemHolderInfo recordPostLayoutInformation(RecyclerView.State paramState, RecyclerView.ViewHolder paramViewHolder)
  {
    return obtainHolderInfo().setFrom(paramViewHolder);
  }
  
  public RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation(RecyclerView.State paramState, RecyclerView.ViewHolder paramViewHolder, int paramInt, List paramList)
  {
    return obtainHolderInfo().setFrom(paramViewHolder);
  }
  
  public abstract void runPendingAnimations();
  
  public void setAddDuration(long paramLong)
  {
    this.mAddDuration = paramLong;
  }
  
  public void setChangeDuration(long paramLong)
  {
    this.mChangeDuration = paramLong;
  }
  
  void setListener(RecyclerView.ItemAnimator.ItemAnimatorListener paramItemAnimatorListener)
  {
    this.mListener = paramItemAnimatorListener;
  }
  
  public void setMoveDuration(long paramLong)
  {
    this.mMoveDuration = paramLong;
  }
  
  public void setRemoveDuration(long paramLong)
  {
    this.mRemoveDuration = paramLong;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$ItemAnimator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */