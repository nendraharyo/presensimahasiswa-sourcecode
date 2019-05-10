package android.support.v7.recyclerview.extensions;

import android.support.v7.util.AdapterListUpdateCallback;
import android.support.v7.util.DiffUtil.ItemCallback;
import android.support.v7.widget.RecyclerView.Adapter;
import java.util.List;

public abstract class ListAdapter
  extends RecyclerView.Adapter
{
  private final AsyncListDiffer mHelper;
  
  protected ListAdapter(AsyncDifferConfig paramAsyncDifferConfig)
  {
    AsyncListDiffer localAsyncListDiffer = new android/support/v7/recyclerview/extensions/AsyncListDiffer;
    AdapterListUpdateCallback localAdapterListUpdateCallback = new android/support/v7/util/AdapterListUpdateCallback;
    localAdapterListUpdateCallback.<init>(this);
    localAsyncListDiffer.<init>(localAdapterListUpdateCallback, paramAsyncDifferConfig);
    this.mHelper = localAsyncListDiffer;
  }
  
  protected ListAdapter(DiffUtil.ItemCallback paramItemCallback)
  {
    AsyncListDiffer localAsyncListDiffer = new android/support/v7/recyclerview/extensions/AsyncListDiffer;
    AdapterListUpdateCallback localAdapterListUpdateCallback = new android/support/v7/util/AdapterListUpdateCallback;
    localAdapterListUpdateCallback.<init>(this);
    Object localObject = new android/support/v7/recyclerview/extensions/AsyncDifferConfig$Builder;
    ((AsyncDifferConfig.Builder)localObject).<init>(paramItemCallback);
    localObject = ((AsyncDifferConfig.Builder)localObject).build();
    localAsyncListDiffer.<init>(localAdapterListUpdateCallback, (AsyncDifferConfig)localObject);
    this.mHelper = localAsyncListDiffer;
  }
  
  protected Object getItem(int paramInt)
  {
    return this.mHelper.getCurrentList().get(paramInt);
  }
  
  public int getItemCount()
  {
    return this.mHelper.getCurrentList().size();
  }
  
  public void submitList(List paramList)
  {
    this.mHelper.submitList(paramList);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\recyclerview\extensions\ListAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */