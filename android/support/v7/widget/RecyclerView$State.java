package android.support.v7.widget;

import android.util.SparseArray;

public class RecyclerView$State
{
  static final int STEP_ANIMATIONS = 4;
  static final int STEP_LAYOUT = 2;
  static final int STEP_START = 1;
  private SparseArray mData;
  int mDeletedInvisibleItemCountSincePreviousLayout = 0;
  long mFocusedItemId;
  int mFocusedItemPosition;
  int mFocusedSubChildId;
  boolean mInPreLayout = false;
  boolean mIsMeasuring = false;
  int mItemCount = 0;
  int mLayoutStep = 1;
  int mPreviousLayoutItemCount = 0;
  int mRemainingScrollHorizontal;
  int mRemainingScrollVertical;
  boolean mRunPredictiveAnimations = false;
  boolean mRunSimpleAnimations = false;
  boolean mStructureChanged = false;
  private int mTargetPosition = -1;
  boolean mTrackOldChangeHolders = false;
  
  void assertLayoutStep(int paramInt)
  {
    int i = this.mLayoutStep & paramInt;
    if (i == 0)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Layout state should be one of ");
      String str = Integer.toBinaryString(paramInt);
      localObject = ((StringBuilder)localObject).append(str).append(" but it is ");
      str = Integer.toBinaryString(this.mLayoutStep);
      localObject = str;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
  }
  
  public boolean didStructureChange()
  {
    return this.mStructureChanged;
  }
  
  public Object get(int paramInt)
  {
    Object localObject = this.mData;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.mData.get(paramInt)) {
      return localObject;
    }
  }
  
  public int getItemCount()
  {
    boolean bool = this.mInPreLayout;
    int i;
    if (bool)
    {
      i = this.mPreviousLayoutItemCount;
      int j = this.mDeletedInvisibleItemCountSincePreviousLayout;
      i -= j;
    }
    for (;;)
    {
      return i;
      i = this.mItemCount;
    }
  }
  
  public int getRemainingScrollHorizontal()
  {
    return this.mRemainingScrollHorizontal;
  }
  
  public int getRemainingScrollVertical()
  {
    return this.mRemainingScrollVertical;
  }
  
  public int getTargetScrollPosition()
  {
    return this.mTargetPosition;
  }
  
  public boolean hasTargetScrollPosition()
  {
    int i = this.mTargetPosition;
    int k = -1;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public boolean isMeasuring()
  {
    return this.mIsMeasuring;
  }
  
  public boolean isPreLayout()
  {
    return this.mInPreLayout;
  }
  
  void prepareForNestedPrefetch(RecyclerView.Adapter paramAdapter)
  {
    this.mLayoutStep = 1;
    int i = paramAdapter.getItemCount();
    this.mItemCount = i;
    this.mInPreLayout = false;
    this.mTrackOldChangeHolders = false;
    this.mIsMeasuring = false;
  }
  
  public void put(int paramInt, Object paramObject)
  {
    SparseArray localSparseArray = this.mData;
    if (localSparseArray == null)
    {
      localSparseArray = new android/util/SparseArray;
      localSparseArray.<init>();
      this.mData = localSparseArray;
    }
    this.mData.put(paramInt, paramObject);
  }
  
  public void remove(int paramInt)
  {
    SparseArray localSparseArray = this.mData;
    if (localSparseArray == null) {}
    for (;;)
    {
      return;
      localSparseArray = this.mData;
      localSparseArray.remove(paramInt);
    }
  }
  
  State reset()
  {
    int i = -1;
    this.mTargetPosition = i;
    SparseArray localSparseArray = this.mData;
    if (localSparseArray != null)
    {
      localSparseArray = this.mData;
      localSparseArray.clear();
    }
    this.mItemCount = 0;
    this.mStructureChanged = false;
    this.mIsMeasuring = false;
    return this;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("State{mTargetPosition=");
    int i = this.mTargetPosition;
    localStringBuilder = localStringBuilder.append(i).append(", mData=");
    SparseArray localSparseArray = this.mData;
    localStringBuilder = localStringBuilder.append(localSparseArray).append(", mItemCount=");
    i = this.mItemCount;
    localStringBuilder = localStringBuilder.append(i).append(", mIsMeasuring=");
    boolean bool1 = this.mIsMeasuring;
    localStringBuilder = localStringBuilder.append(bool1).append(", mPreviousLayoutItemCount=");
    int j = this.mPreviousLayoutItemCount;
    localStringBuilder = localStringBuilder.append(j).append(", mDeletedInvisibleItemCountSincePreviousLayout=");
    j = this.mDeletedInvisibleItemCountSincePreviousLayout;
    localStringBuilder = localStringBuilder.append(j).append(", mStructureChanged=");
    boolean bool2 = this.mStructureChanged;
    localStringBuilder = localStringBuilder.append(bool2).append(", mInPreLayout=");
    bool2 = this.mInPreLayout;
    localStringBuilder = localStringBuilder.append(bool2).append(", mRunSimpleAnimations=");
    bool2 = this.mRunSimpleAnimations;
    localStringBuilder = localStringBuilder.append(bool2).append(", mRunPredictiveAnimations=");
    bool2 = this.mRunPredictiveAnimations;
    return bool2 + '}';
  }
  
  public boolean willRunPredictiveAnimations()
  {
    return this.mRunPredictiveAnimations;
  }
  
  public boolean willRunSimpleAnimations()
  {
    return this.mRunSimpleAnimations;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$State.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */