package android.support.v7.recyclerview.extensions;

import android.support.v7.util.DiffUtil.DiffResult;
import java.util.List;

class AsyncListDiffer$1$2
  implements Runnable
{
  AsyncListDiffer$1$2(AsyncListDiffer.1 param1, DiffUtil.DiffResult paramDiffResult) {}
  
  public void run()
  {
    AsyncListDiffer localAsyncListDiffer = this.this$1.this$0;
    int i = AsyncListDiffer.access$100(localAsyncListDiffer);
    Object localObject = this.this$1;
    int j = ((AsyncListDiffer.1)localObject).val$runGeneration;
    if (i == j)
    {
      localAsyncListDiffer = this.this$1.this$0;
      localObject = this.this$1.val$newList;
      DiffUtil.DiffResult localDiffResult = this.val$result;
      AsyncListDiffer.access$200(localAsyncListDiffer, (List)localObject, localDiffResult);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\recyclerview\extensions\AsyncListDiffer$1$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */