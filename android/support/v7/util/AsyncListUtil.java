package android.support.v7.util;

import android.util.Log;
import android.util.SparseIntArray;

public class AsyncListUtil
{
  static final boolean DEBUG = false;
  static final String TAG = "AsyncListUtil";
  boolean mAllowScrollHints;
  private final ThreadUtil.BackgroundCallback mBackgroundCallback;
  final ThreadUtil.BackgroundCallback mBackgroundProxy;
  final AsyncListUtil.DataCallback mDataCallback;
  int mDisplayedGeneration;
  int mItemCount;
  private final ThreadUtil.MainThreadCallback mMainThreadCallback;
  final ThreadUtil.MainThreadCallback mMainThreadProxy;
  final SparseIntArray mMissingPositions;
  final int[] mPrevRange;
  int mRequestedGeneration;
  private int mScrollHint;
  final Class mTClass;
  final TileList mTileList;
  final int mTileSize;
  final int[] mTmpRange;
  final int[] mTmpRangeExtended;
  final AsyncListUtil.ViewCallback mViewCallback;
  
  public AsyncListUtil(Class paramClass, int paramInt, AsyncListUtil.DataCallback paramDataCallback, AsyncListUtil.ViewCallback paramViewCallback)
  {
    Object localObject1 = new int[i];
    this.mTmpRange = ((int[])localObject1);
    localObject1 = new int[i];
    this.mPrevRange = ((int[])localObject1);
    localObject1 = new int[i];
    this.mTmpRangeExtended = ((int[])localObject1);
    this.mScrollHint = 0;
    this.mItemCount = 0;
    this.mDisplayedGeneration = 0;
    int j = this.mDisplayedGeneration;
    this.mRequestedGeneration = j;
    localObject1 = new android/util/SparseIntArray;
    ((SparseIntArray)localObject1).<init>();
    this.mMissingPositions = ((SparseIntArray)localObject1);
    localObject1 = new android/support/v7/util/AsyncListUtil$1;
    ((AsyncListUtil.1)localObject1).<init>(this);
    this.mMainThreadCallback = ((ThreadUtil.MainThreadCallback)localObject1);
    localObject1 = new android/support/v7/util/AsyncListUtil$2;
    ((AsyncListUtil.2)localObject1).<init>(this);
    this.mBackgroundCallback = ((ThreadUtil.BackgroundCallback)localObject1);
    this.mTClass = paramClass;
    this.mTileSize = paramInt;
    this.mDataCallback = paramDataCallback;
    this.mViewCallback = paramViewCallback;
    localObject1 = new android/support/v7/util/TileList;
    int k = this.mTileSize;
    ((TileList)localObject1).<init>(k);
    this.mTileList = ((TileList)localObject1);
    localObject1 = new android/support/v7/util/MessageThreadUtil;
    ((MessageThreadUtil)localObject1).<init>();
    Object localObject2 = this.mMainThreadCallback;
    localObject2 = ((ThreadUtil)localObject1).getMainThreadProxy((ThreadUtil.MainThreadCallback)localObject2);
    this.mMainThreadProxy = ((ThreadUtil.MainThreadCallback)localObject2);
    localObject2 = this.mBackgroundCallback;
    localObject1 = ((ThreadUtil)localObject1).getBackgroundProxy((ThreadUtil.BackgroundCallback)localObject2);
    this.mBackgroundProxy = ((ThreadUtil.BackgroundCallback)localObject1);
    refresh();
  }
  
  private boolean isRefreshPending()
  {
    int i = this.mRequestedGeneration;
    int k = this.mDisplayedGeneration;
    if (i != k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public Object getItem(int paramInt)
  {
    Object localObject2;
    int j;
    if (paramInt >= 0)
    {
      int i = this.mItemCount;
      if (paramInt < i) {}
    }
    else
    {
      localObject1 = new java/lang/IndexOutOfBoundsException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramInt).append(" is not within 0 and ");
      j = this.mItemCount;
      localObject2 = j;
      ((IndexOutOfBoundsException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.mTileList.getItemAt(paramInt);
    if (localObject1 == null)
    {
      boolean bool = isRefreshPending();
      if (!bool)
      {
        localObject2 = this.mMissingPositions;
        j = 0;
        ((SparseIntArray)localObject2).put(paramInt, 0);
      }
    }
    return localObject1;
  }
  
  public int getItemCount()
  {
    return this.mItemCount;
  }
  
  void log(String paramString, Object... paramVarArgs)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("[MAIN] ");
    String str = String.format(paramString, paramVarArgs);
    localObject = str;
    Log.d("AsyncListUtil", (String)localObject);
  }
  
  public void onRangeChanged()
  {
    boolean bool = isRefreshPending();
    if (bool) {}
    for (;;)
    {
      return;
      updateRange();
      bool = true;
      this.mAllowScrollHints = bool;
    }
  }
  
  public void refresh()
  {
    this.mMissingPositions.clear();
    ThreadUtil.BackgroundCallback localBackgroundCallback = this.mBackgroundProxy;
    int i = this.mRequestedGeneration + 1;
    this.mRequestedGeneration = i;
    localBackgroundCallback.refresh(i);
  }
  
  void updateRange()
  {
    int i = 1;
    int j = 0;
    int[] arrayOfInt1 = null;
    Object localObject = this.mViewCallback;
    int[] arrayOfInt2 = this.mTmpRange;
    ((AsyncListUtil.ViewCallback)localObject).getItemRangeInto(arrayOfInt2);
    localObject = this.mTmpRange;
    int k = localObject[0];
    arrayOfInt2 = this.mTmpRange;
    int n = arrayOfInt2[i];
    if (k <= n)
    {
      localObject = this.mTmpRange;
      k = localObject[0];
      if (k >= 0) {
        break label74;
      }
    }
    label74:
    do
    {
      return;
      localObject = this.mTmpRange;
      k = localObject[i];
      n = this.mItemCount;
    } while (k >= n);
    boolean bool = this.mAllowScrollHints;
    if (!bool) {
      this.mScrollHint = 0;
    }
    for (;;)
    {
      localObject = this.mPrevRange;
      n = this.mTmpRange[0];
      localObject[0] = n;
      localObject = this.mPrevRange;
      n = this.mTmpRange[i];
      localObject[i] = n;
      localObject = this.mViewCallback;
      arrayOfInt2 = this.mTmpRange;
      int[] arrayOfInt3 = this.mTmpRangeExtended;
      int i1 = this.mScrollHint;
      ((AsyncListUtil.ViewCallback)localObject).extendRangeInto(arrayOfInt2, arrayOfInt3, i1);
      localObject = this.mTmpRangeExtended;
      n = this.mTmpRange[0];
      int i2 = Math.max(this.mTmpRangeExtended[0], 0);
      n = Math.min(n, i2);
      localObject[0] = n;
      localObject = this.mTmpRangeExtended;
      n = this.mTmpRange[i];
      i2 = this.mTmpRangeExtended[i];
      i1 = this.mItemCount + -1;
      i2 = Math.min(i2, i1);
      n = Math.max(n, i2);
      localObject[i] = n;
      localObject = this.mBackgroundProxy;
      arrayOfInt2 = this.mTmpRange;
      n = arrayOfInt2[0];
      arrayOfInt3 = this.mTmpRange;
      i2 = arrayOfInt3[i];
      int[] arrayOfInt4 = this.mTmpRangeExtended;
      i1 = arrayOfInt4[0];
      arrayOfInt1 = this.mTmpRangeExtended;
      j = arrayOfInt1[i];
      i = this.mScrollHint;
      ((ThreadUtil.BackgroundCallback)localObject).updateRange(n, i2, i1, j, i);
      break;
      localObject = this.mTmpRange;
      int m = localObject[0];
      arrayOfInt2 = this.mPrevRange;
      n = arrayOfInt2[i];
      if (m <= n)
      {
        localObject = this.mPrevRange;
        m = localObject[0];
        arrayOfInt2 = this.mTmpRange;
        n = arrayOfInt2[i];
        if (m <= n) {}
      }
      else
      {
        this.mScrollHint = 0;
        continue;
      }
      localObject = this.mTmpRange;
      m = localObject[0];
      arrayOfInt2 = this.mPrevRange;
      n = arrayOfInt2[0];
      if (m < n)
      {
        this.mScrollHint = i;
      }
      else
      {
        localObject = this.mTmpRange;
        m = localObject[0];
        arrayOfInt2 = this.mPrevRange;
        n = arrayOfInt2[0];
        if (m > n)
        {
          m = 2;
          this.mScrollHint = m;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\AsyncListUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */