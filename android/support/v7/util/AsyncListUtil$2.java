package android.support.v7.util;

import android.util.Log;
import android.util.SparseBooleanArray;

class AsyncListUtil$2
  implements ThreadUtil.BackgroundCallback
{
  private int mFirstRequiredTileStart;
  private int mGeneration;
  private int mItemCount;
  private int mLastRequiredTileStart;
  final SparseBooleanArray mLoadedTiles;
  private TileList.Tile mRecycledRoot;
  
  AsyncListUtil$2(AsyncListUtil paramAsyncListUtil)
  {
    SparseBooleanArray localSparseBooleanArray = new android/util/SparseBooleanArray;
    localSparseBooleanArray.<init>();
    this.mLoadedTiles = localSparseBooleanArray;
  }
  
  private TileList.Tile acquireTile()
  {
    TileList.Tile localTile = this.mRecycledRoot;
    Object localObject;
    if (localTile != null)
    {
      localTile = this.mRecycledRoot;
      localObject = this.mRecycledRoot.mNext;
      this.mRecycledRoot = ((TileList.Tile)localObject);
    }
    for (;;)
    {
      return localTile;
      localTile = new android/support/v7/util/TileList$Tile;
      localObject = this.this$0.mTClass;
      AsyncListUtil localAsyncListUtil = this.this$0;
      int i = localAsyncListUtil.mTileSize;
      localTile.<init>((Class)localObject, i);
    }
  }
  
  private void addTile(TileList.Tile paramTile)
  {
    Object localObject = this.mLoadedTiles;
    int i = paramTile.mStartPosition;
    ((SparseBooleanArray)localObject).put(i, true);
    localObject = this.this$0.mMainThreadProxy;
    i = this.mGeneration;
    ((ThreadUtil.MainThreadCallback)localObject).addTile(i, paramTile);
  }
  
  private void flushTileCache(int paramInt)
  {
    AsyncListUtil.DataCallback localDataCallback = this.this$0.mDataCallback;
    int i = localDataCallback.getMaxCachedTiles();
    for (;;)
    {
      SparseBooleanArray localSparseBooleanArray1 = this.mLoadedTiles;
      int j = localSparseBooleanArray1.size();
      if (j < i) {
        break;
      }
      localSparseBooleanArray1 = this.mLoadedTiles;
      j = localSparseBooleanArray1.keyAt(0);
      SparseBooleanArray localSparseBooleanArray2 = this.mLoadedTiles;
      SparseBooleanArray localSparseBooleanArray3 = this.mLoadedTiles;
      int k = localSparseBooleanArray3.size() + -1;
      int m = localSparseBooleanArray2.keyAt(k);
      k = this.mFirstRequiredTileStart - j;
      int n = this.mLastRequiredTileStart;
      n = m - n;
      if (k > 0) {
        if (k < n)
        {
          int i1 = 2;
          if (paramInt != i1) {}
        }
        else
        {
          removeTile(j);
          continue;
        }
      }
      if (n <= 0) {
        break;
      }
      if (k >= n)
      {
        j = 1;
        if (paramInt != j) {
          break;
        }
      }
      removeTile(m);
    }
  }
  
  private int getTileStart(int paramInt)
  {
    int i = this.this$0.mTileSize;
    i = paramInt % i;
    return paramInt - i;
  }
  
  private boolean isTileLoaded(int paramInt)
  {
    return this.mLoadedTiles.get(paramInt);
  }
  
  private void log(String paramString, Object... paramVarArgs)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("[BKGR] ");
    String str = String.format(paramString, paramVarArgs);
    localObject = str;
    Log.d("AsyncListUtil", (String)localObject);
  }
  
  private void removeTile(int paramInt)
  {
    this.mLoadedTiles.delete(paramInt);
    ThreadUtil.MainThreadCallback localMainThreadCallback = this.this$0.mMainThreadProxy;
    int i = this.mGeneration;
    localMainThreadCallback.removeTile(i, paramInt);
  }
  
  private void requestTiles(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramInt1;
    if (i <= paramInt2)
    {
      if (paramBoolean) {}
      for (int j = paramInt2 + paramInt1 - i;; j = i)
      {
        ThreadUtil.BackgroundCallback localBackgroundCallback = this.this$0.mBackgroundProxy;
        localBackgroundCallback.loadTile(j, paramInt3);
        AsyncListUtil localAsyncListUtil = this.this$0;
        j = localAsyncListUtil.mTileSize;
        i += j;
        break;
      }
    }
  }
  
  public void loadTile(int paramInt1, int paramInt2)
  {
    boolean bool = isTileLoaded(paramInt1);
    if (bool) {}
    for (;;)
    {
      return;
      TileList.Tile localTile = acquireTile();
      localTile.mStartPosition = paramInt1;
      int i = this.this$0.mTileSize;
      int j = this.mItemCount;
      int k = localTile.mStartPosition;
      j -= k;
      i = Math.min(i, j);
      localTile.mItemCount = i;
      AsyncListUtil.DataCallback localDataCallback = this.this$0.mDataCallback;
      Object[] arrayOfObject = localTile.mItems;
      k = localTile.mStartPosition;
      int m = localTile.mItemCount;
      localDataCallback.fillData(arrayOfObject, k, m);
      flushTileCache(paramInt2);
      addTile(localTile);
    }
  }
  
  public void recycleTile(TileList.Tile paramTile)
  {
    Object localObject = this.this$0.mDataCallback;
    Object[] arrayOfObject = paramTile.mItems;
    int i = paramTile.mItemCount;
    ((AsyncListUtil.DataCallback)localObject).recycleData(arrayOfObject, i);
    localObject = this.mRecycledRoot;
    paramTile.mNext = ((TileList.Tile)localObject);
    this.mRecycledRoot = paramTile;
  }
  
  public void refresh(int paramInt)
  {
    this.mGeneration = paramInt;
    this.mLoadedTiles.clear();
    int i = this.this$0.mDataCallback.refreshData();
    this.mItemCount = i;
    ThreadUtil.MainThreadCallback localMainThreadCallback = this.this$0.mMainThreadProxy;
    int j = this.mGeneration;
    int k = this.mItemCount;
    localMainThreadCallback.updateItemCount(j, k);
  }
  
  public void updateRange(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = 1;
    if (paramInt1 > paramInt2) {}
    for (;;)
    {
      return;
      int j = getTileStart(paramInt1);
      int k = getTileStart(paramInt2);
      int m = getTileStart(paramInt3);
      this.mFirstRequiredTileStart = m;
      m = getTileStart(paramInt4);
      this.mLastRequiredTileStart = m;
      if (paramInt5 == i)
      {
        j = this.mFirstRequiredTileStart;
        requestTiles(j, k, paramInt5, i);
        AsyncListUtil localAsyncListUtil1 = this.this$0;
        j = localAsyncListUtil1.mTileSize + k;
        k = this.mLastRequiredTileStart;
        requestTiles(j, k, paramInt5, false);
      }
      else
      {
        k = this.mLastRequiredTileStart;
        requestTiles(j, k, paramInt5, false);
        k = this.mFirstRequiredTileStart;
        AsyncListUtil localAsyncListUtil2 = this.this$0;
        m = localAsyncListUtil2.mTileSize;
        j -= m;
        requestTiles(k, j, paramInt5, i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\AsyncListUtil$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */