package android.support.v7.recyclerview.extensions;

import android.support.v7.util.DiffUtil.Callback;
import android.support.v7.util.DiffUtil.ItemCallback;
import java.util.List;

class AsyncListDiffer$1$1
  extends DiffUtil.Callback
{
  AsyncListDiffer$1$1(AsyncListDiffer.1 param1) {}
  
  public boolean areContentsTheSame(int paramInt1, int paramInt2)
  {
    DiffUtil.ItemCallback localItemCallback = AsyncListDiffer.access$000(this.this$1.this$0).getDiffCallback();
    Object localObject1 = this.this$1.val$oldList.get(paramInt1);
    Object localObject2 = this.this$1.val$newList.get(paramInt2);
    return localItemCallback.areContentsTheSame(localObject1, localObject2);
  }
  
  public boolean areItemsTheSame(int paramInt1, int paramInt2)
  {
    DiffUtil.ItemCallback localItemCallback = AsyncListDiffer.access$000(this.this$1.this$0).getDiffCallback();
    Object localObject1 = this.this$1.val$oldList.get(paramInt1);
    Object localObject2 = this.this$1.val$newList.get(paramInt2);
    return localItemCallback.areItemsTheSame(localObject1, localObject2);
  }
  
  public Object getChangePayload(int paramInt1, int paramInt2)
  {
    DiffUtil.ItemCallback localItemCallback = AsyncListDiffer.access$000(this.this$1.this$0).getDiffCallback();
    Object localObject1 = this.this$1.val$oldList.get(paramInt1);
    Object localObject2 = this.this$1.val$newList.get(paramInt2);
    return localItemCallback.getChangePayload(localObject1, localObject2);
  }
  
  public int getNewListSize()
  {
    return this.this$1.val$newList.size();
  }
  
  public int getOldListSize()
  {
    return this.this$1.val$oldList.size();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\recyclerview\extensions\AsyncListDiffer$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */