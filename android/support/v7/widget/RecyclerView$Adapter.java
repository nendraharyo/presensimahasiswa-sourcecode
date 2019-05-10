package android.support.v7.widget;

import android.support.v4.os.d;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public abstract class RecyclerView$Adapter
{
  private boolean mHasStableIds;
  private final RecyclerView.AdapterDataObservable mObservable;
  
  public RecyclerView$Adapter()
  {
    RecyclerView.AdapterDataObservable localAdapterDataObservable = new android/support/v7/widget/RecyclerView$AdapterDataObservable;
    localAdapterDataObservable.<init>();
    this.mObservable = localAdapterDataObservable;
    this.mHasStableIds = false;
  }
  
  public final void bindViewHolder(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    int i = 1;
    paramViewHolder.mPosition = paramInt;
    boolean bool1 = hasStableIds();
    if (bool1)
    {
      long l = getItemId(paramInt);
      paramViewHolder.mItemId = l;
    }
    int j = 519;
    paramViewHolder.setFlags(i, j);
    d.a("RV OnBindView");
    Object localObject = paramViewHolder.getUnmodifiedPayloads();
    onBindViewHolder(paramViewHolder, paramInt, (List)localObject);
    paramViewHolder.clearPayload();
    localObject = paramViewHolder.itemView.getLayoutParams();
    boolean bool2 = localObject instanceof RecyclerView.LayoutParams;
    if (bool2)
    {
      localObject = (RecyclerView.LayoutParams)localObject;
      ((RecyclerView.LayoutParams)localObject).mInsetsDirty = i;
    }
    d.a();
  }
  
  public final RecyclerView.ViewHolder createViewHolder(ViewGroup paramViewGroup, int paramInt)
  {
    Object localObject1 = "RV CreateView";
    try
    {
      d.a((String)localObject1);
      localObject1 = onCreateViewHolder(paramViewGroup, paramInt);
      Object localObject2 = ((RecyclerView.ViewHolder)localObject1).itemView;
      localObject2 = ((View)localObject2).getParent();
      if (localObject2 != null)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)";
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    finally
    {
      d.a();
    }
    localViewHolder.mItemViewType = paramInt;
    d.a();
    return localViewHolder;
  }
  
  public abstract int getItemCount();
  
  public long getItemId(int paramInt)
  {
    return -1;
  }
  
  public int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public final boolean hasObservers()
  {
    return this.mObservable.hasObservers();
  }
  
  public final boolean hasStableIds()
  {
    return this.mHasStableIds;
  }
  
  public final void notifyDataSetChanged()
  {
    this.mObservable.notifyChanged();
  }
  
  public final void notifyItemChanged(int paramInt)
  {
    this.mObservable.notifyItemRangeChanged(paramInt, 1);
  }
  
  public final void notifyItemChanged(int paramInt, Object paramObject)
  {
    this.mObservable.notifyItemRangeChanged(paramInt, 1, paramObject);
  }
  
  public final void notifyItemInserted(int paramInt)
  {
    this.mObservable.notifyItemRangeInserted(paramInt, 1);
  }
  
  public final void notifyItemMoved(int paramInt1, int paramInt2)
  {
    this.mObservable.notifyItemMoved(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeChanged(int paramInt1, int paramInt2)
  {
    this.mObservable.notifyItemRangeChanged(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    this.mObservable.notifyItemRangeChanged(paramInt1, paramInt2, paramObject);
  }
  
  public final void notifyItemRangeInserted(int paramInt1, int paramInt2)
  {
    this.mObservable.notifyItemRangeInserted(paramInt1, paramInt2);
  }
  
  public final void notifyItemRangeRemoved(int paramInt1, int paramInt2)
  {
    this.mObservable.notifyItemRangeRemoved(paramInt1, paramInt2);
  }
  
  public final void notifyItemRemoved(int paramInt)
  {
    this.mObservable.notifyItemRangeRemoved(paramInt, 1);
  }
  
  public void onAttachedToRecyclerView(RecyclerView paramRecyclerView) {}
  
  public abstract void onBindViewHolder(RecyclerView.ViewHolder paramViewHolder, int paramInt);
  
  public void onBindViewHolder(RecyclerView.ViewHolder paramViewHolder, int paramInt, List paramList)
  {
    onBindViewHolder(paramViewHolder, paramInt);
  }
  
  public abstract RecyclerView.ViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt);
  
  public void onDetachedFromRecyclerView(RecyclerView paramRecyclerView) {}
  
  public boolean onFailedToRecycleView(RecyclerView.ViewHolder paramViewHolder)
  {
    return false;
  }
  
  public void onViewAttachedToWindow(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void onViewDetachedFromWindow(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void onViewRecycled(RecyclerView.ViewHolder paramViewHolder) {}
  
  public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver paramAdapterDataObserver)
  {
    this.mObservable.registerObserver(paramAdapterDataObserver);
  }
  
  public void setHasStableIds(boolean paramBoolean)
  {
    boolean bool = hasObservers();
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
      throw localIllegalStateException;
    }
    this.mHasStableIds = paramBoolean;
  }
  
  public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver paramAdapterDataObserver)
  {
    this.mObservable.unregisterObserver(paramAdapterDataObserver);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$Adapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */