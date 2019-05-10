package android.support.v7.util;

import android.util.Log;
import android.util.SparseIntArray;

class AsyncListUtil$1
  implements ThreadUtil.MainThreadCallback
{
  AsyncListUtil$1(AsyncListUtil paramAsyncListUtil) {}
  
  private boolean isRequestedGeneration(int paramInt)
  {
    AsyncListUtil localAsyncListUtil = this.this$0;
    int i = localAsyncListUtil.mRequestedGeneration;
    if (paramInt == i) {
      i = 1;
    }
    for (;;)
    {
      return i;
      i = 0;
      localAsyncListUtil = null;
    }
  }
  
  private void recycleAllTiles()
  {
    int i = 0;
    for (;;)
    {
      Object localObject = this.this$0.mTileList;
      int j = ((TileList)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = this.this$0.mBackgroundProxy;
      TileList.Tile localTile = this.this$0.mTileList.getAtIndex(i);
      ((ThreadUtil.BackgroundCallback)localObject).recycleTile(localTile);
      i += 1;
    }
    this.this$0.mTileList.clear();
  }
  
  public void addTile(int paramInt, TileList.Tile paramTile)
  {
    boolean bool = isRequestedGeneration(paramInt);
    if (!bool)
    {
      localObject1 = this.this$0.mBackgroundProxy;
      ((ThreadUtil.BackgroundCallback)localObject1).recycleTile(paramTile);
      return;
    }
    Object localObject1 = this.this$0.mTileList.addOrReplace(paramTile);
    Object localObject2;
    Object localObject3;
    int j;
    if (localObject1 != null)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = "duplicate tile @";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      j = ((TileList.Tile)localObject1).mStartPosition;
      localObject2 = j;
      Log.e("AsyncListUtil", (String)localObject2);
      ThreadUtil.BackgroundCallback localBackgroundCallback = this.this$0.mBackgroundProxy;
      localBackgroundCallback.recycleTile((TileList.Tile)localObject1);
    }
    int i = paramTile.mStartPosition;
    int k = paramTile.mItemCount + i;
    i = 0;
    localObject1 = null;
    for (;;)
    {
      localObject2 = this.this$0.mMissingPositions;
      int m = ((SparseIntArray)localObject2).size();
      if (i >= m) {
        break;
      }
      localObject2 = this.this$0.mMissingPositions;
      m = ((SparseIntArray)localObject2).keyAt(i);
      j = paramTile.mStartPosition;
      if ((j <= m) && (m < k))
      {
        this.this$0.mMissingPositions.removeAt(i);
        localObject3 = this.this$0.mViewCallback;
        ((AsyncListUtil.ViewCallback)localObject3).onItemLoaded(m);
      }
      else
      {
        i += 1;
      }
    }
  }
  
  public void removeTile(int paramInt1, int paramInt2)
  {
    boolean bool = isRequestedGeneration(paramInt1);
    if (!bool) {}
    for (;;)
    {
      return;
      Object localObject1 = this.this$0.mTileList.removeAtPos(paramInt2);
      Object localObject2;
      if (localObject1 == null)
      {
        localObject1 = "AsyncListUtil";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "tile not found @";
        localObject2 = str + paramInt2;
        Log.e((String)localObject1, (String)localObject2);
      }
      else
      {
        localObject2 = this.this$0.mBackgroundProxy;
        ((ThreadUtil.BackgroundCallback)localObject2).recycleTile((TileList.Tile)localObject1);
      }
    }
  }
  
  public void updateItemCount(int paramInt1, int paramInt2)
  {
    boolean bool = isRequestedGeneration(paramInt1);
    if (!bool) {}
    for (;;)
    {
      return;
      this.this$0.mItemCount = paramInt2;
      this.this$0.mViewCallback.onDataRefresh();
      AsyncListUtil localAsyncListUtil = this.this$0;
      int i = this.this$0.mRequestedGeneration;
      localAsyncListUtil.mDisplayedGeneration = i;
      recycleAllTiles();
      localAsyncListUtil = this.this$0;
      i = 0;
      localAsyncListUtil.mAllowScrollHints = false;
      localAsyncListUtil = this.this$0;
      localAsyncListUtil.updateRange();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\AsyncListUtil$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */