package android.support.v7.recyclerview.extensions;

import android.support.v7.util.AdapterListUpdateCallback;
import android.support.v7.util.DiffUtil.DiffResult;
import android.support.v7.util.DiffUtil.ItemCallback;
import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView.Adapter;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public class AsyncListDiffer
{
  private final AsyncDifferConfig mConfig;
  private List mList;
  private int mMaxScheduledGeneration;
  private List mReadOnlyList;
  private final ListUpdateCallback mUpdateCallback;
  
  public AsyncListDiffer(ListUpdateCallback paramListUpdateCallback, AsyncDifferConfig paramAsyncDifferConfig)
  {
    List localList = Collections.emptyList();
    this.mReadOnlyList = localList;
    this.mUpdateCallback = paramListUpdateCallback;
    this.mConfig = paramAsyncDifferConfig;
  }
  
  public AsyncListDiffer(RecyclerView.Adapter paramAdapter, DiffUtil.ItemCallback paramItemCallback)
  {
    Object localObject = Collections.emptyList();
    this.mReadOnlyList = ((List)localObject);
    localObject = new android/support/v7/util/AdapterListUpdateCallback;
    ((AdapterListUpdateCallback)localObject).<init>(paramAdapter);
    this.mUpdateCallback = ((ListUpdateCallback)localObject);
    localObject = new android/support/v7/recyclerview/extensions/AsyncDifferConfig$Builder;
    ((AsyncDifferConfig.Builder)localObject).<init>(paramItemCallback);
    localObject = ((AsyncDifferConfig.Builder)localObject).build();
    this.mConfig = ((AsyncDifferConfig)localObject);
  }
  
  private void latchList(List paramList, DiffUtil.DiffResult paramDiffResult)
  {
    this.mList = paramList;
    Object localObject = Collections.unmodifiableList(paramList);
    this.mReadOnlyList = ((List)localObject);
    localObject = this.mUpdateCallback;
    paramDiffResult.dispatchUpdatesTo((ListUpdateCallback)localObject);
  }
  
  public List getCurrentList()
  {
    return this.mReadOnlyList;
  }
  
  public void submitList(List paramList)
  {
    Executor localExecutor = null;
    Object localObject1 = this.mList;
    if (paramList == localObject1) {}
    for (;;)
    {
      return;
      int i = this.mMaxScheduledGeneration + 1;
      this.mMaxScheduledGeneration = i;
      int j;
      Object localObject2;
      if (paramList == null)
      {
        localObject1 = this.mList;
        i = ((List)localObject1).size();
        j = 0;
        this.mList = null;
        localObject2 = Collections.emptyList();
        this.mReadOnlyList = ((List)localObject2);
        localObject2 = this.mUpdateCallback;
        ((ListUpdateCallback)localObject2).onRemoved(0, i);
      }
      else
      {
        localObject2 = this.mList;
        if (localObject2 == null)
        {
          this.mList = paramList;
          localObject1 = Collections.unmodifiableList(paramList);
          this.mReadOnlyList = ((List)localObject1);
          localObject1 = this.mUpdateCallback;
          j = paramList.size();
          ((ListUpdateCallback)localObject1).onInserted(0, j);
        }
        else
        {
          localObject2 = this.mList;
          localExecutor = this.mConfig.getBackgroundThreadExecutor();
          AsyncListDiffer.1 local1 = new android/support/v7/recyclerview/extensions/AsyncListDiffer$1;
          local1.<init>(this, (List)localObject2, paramList, i);
          localExecutor.execute(local1);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\recyclerview\extensions\AsyncListDiffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */