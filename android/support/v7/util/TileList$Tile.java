package android.support.v7.util;

import java.lang.reflect.Array;

public class TileList$Tile
{
  public int mItemCount;
  public final Object[] mItems;
  Tile mNext;
  public int mStartPosition;
  
  public TileList$Tile(Class paramClass, int paramInt)
  {
    Object[] arrayOfObject = (Object[])Array.newInstance(paramClass, paramInt);
    this.mItems = arrayOfObject;
  }
  
  boolean containsPosition(int paramInt)
  {
    int i = this.mStartPosition;
    if (i <= paramInt)
    {
      i = this.mStartPosition;
      int j = this.mItemCount;
      i += j;
      if (paramInt >= i) {}
    }
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  Object getByPosition(int paramInt)
  {
    Object[] arrayOfObject = this.mItems;
    int i = this.mStartPosition;
    i = paramInt - i;
    return arrayOfObject[i];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\TileList$Tile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */