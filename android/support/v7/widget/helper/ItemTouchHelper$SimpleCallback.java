package android.support.v7.widget.helper;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;

public abstract class ItemTouchHelper$SimpleCallback
  extends ItemTouchHelper.Callback
{
  private int mDefaultDragDirs;
  private int mDefaultSwipeDirs;
  
  public ItemTouchHelper$SimpleCallback(int paramInt1, int paramInt2)
  {
    this.mDefaultSwipeDirs = paramInt2;
    this.mDefaultDragDirs = paramInt1;
  }
  
  public int getDragDirs(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
  {
    return this.mDefaultDragDirs;
  }
  
  public int getMovementFlags(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
  {
    int i = getDragDirs(paramRecyclerView, paramViewHolder);
    int j = getSwipeDirs(paramRecyclerView, paramViewHolder);
    return makeMovementFlags(i, j);
  }
  
  public int getSwipeDirs(RecyclerView paramRecyclerView, RecyclerView.ViewHolder paramViewHolder)
  {
    return this.mDefaultSwipeDirs;
  }
  
  public void setDefaultDragDirs(int paramInt)
  {
    this.mDefaultDragDirs = paramInt;
  }
  
  public void setDefaultSwipeDirs(int paramInt)
  {
    this.mDefaultSwipeDirs = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchHelper$SimpleCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */