package android.support.v7.util;

import android.util.SparseArray;

class TileList
{
  TileList.Tile mLastAccessedTile;
  final int mTileSize;
  private final SparseArray mTiles;
  
  public TileList(int paramInt)
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>(10);
    this.mTiles = localSparseArray;
    this.mTileSize = paramInt;
  }
  
  public TileList.Tile addOrReplace(TileList.Tile paramTile)
  {
    Object localObject = this.mTiles;
    int i = paramTile.mStartPosition;
    i = ((SparseArray)localObject).indexOfKey(i);
    if (i < 0)
    {
      localObject = this.mTiles;
      i = paramTile.mStartPosition;
      ((SparseArray)localObject).put(i, paramTile);
      localObject = null;
    }
    for (;;)
    {
      return (TileList.Tile)localObject;
      localObject = (TileList.Tile)this.mTiles.valueAt(i);
      SparseArray localSparseArray = this.mTiles;
      localSparseArray.setValueAt(i, paramTile);
      TileList.Tile localTile = this.mLastAccessedTile;
      if (localTile == localObject) {
        this.mLastAccessedTile = paramTile;
      }
    }
  }
  
  public void clear()
  {
    this.mTiles.clear();
  }
  
  public TileList.Tile getAtIndex(int paramInt)
  {
    return (TileList.Tile)this.mTiles.valueAt(paramInt);
  }
  
  public Object getItemAt(int paramInt)
  {
    Object localObject = this.mLastAccessedTile;
    int i;
    SparseArray localSparseArray;
    if (localObject != null)
    {
      localObject = this.mLastAccessedTile;
      boolean bool = ((TileList.Tile)localObject).containsPosition(paramInt);
      if (bool) {}
    }
    else
    {
      i = this.mTileSize;
      i = paramInt % i;
      i = paramInt - i;
      localSparseArray = this.mTiles;
      i = localSparseArray.indexOfKey(i);
      if (i < 0) {
        i = 0;
      }
    }
    for (localObject = null;; localObject = this.mLastAccessedTile.getByPosition(paramInt))
    {
      return localObject;
      localSparseArray = this.mTiles;
      localObject = (TileList.Tile)localSparseArray.valueAt(i);
      this.mLastAccessedTile = ((TileList.Tile)localObject);
    }
  }
  
  public TileList.Tile removeAtPos(int paramInt)
  {
    TileList.Tile localTile1 = (TileList.Tile)this.mTiles.get(paramInt);
    TileList.Tile localTile2 = this.mLastAccessedTile;
    if (localTile2 == localTile1)
    {
      localTile2 = null;
      this.mLastAccessedTile = null;
    }
    this.mTiles.delete(paramInt);
    return localTile1;
  }
  
  public int size()
  {
    return this.mTiles.size();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\TileList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */