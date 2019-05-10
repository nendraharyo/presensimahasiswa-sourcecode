package android.support.v7.widget;

abstract interface AdapterHelper$Callback
{
  public abstract RecyclerView.ViewHolder findViewHolder(int paramInt);
  
  public abstract void markViewHoldersUpdated(int paramInt1, int paramInt2, Object paramObject);
  
  public abstract void offsetPositionsForAdd(int paramInt1, int paramInt2);
  
  public abstract void offsetPositionsForMove(int paramInt1, int paramInt2);
  
  public abstract void offsetPositionsForRemovingInvisible(int paramInt1, int paramInt2);
  
  public abstract void offsetPositionsForRemovingLaidOutOrNewView(int paramInt1, int paramInt2);
  
  public abstract void onDispatchFirstPass(AdapterHelper.UpdateOp paramUpdateOp);
  
  public abstract void onDispatchSecondPass(AdapterHelper.UpdateOp paramUpdateOp);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AdapterHelper$Callback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */