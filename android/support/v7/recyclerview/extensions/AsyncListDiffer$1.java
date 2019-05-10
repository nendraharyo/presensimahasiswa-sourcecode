package android.support.v7.recyclerview.extensions;

import android.support.v7.util.DiffUtil;
import android.support.v7.util.DiffUtil.Callback;
import android.support.v7.util.DiffUtil.DiffResult;
import java.util.List;
import java.util.concurrent.Executor;

class AsyncListDiffer$1
  implements Runnable
{
  AsyncListDiffer$1(AsyncListDiffer paramAsyncListDiffer, List paramList1, List paramList2, int paramInt) {}
  
  public void run()
  {
    Object localObject = new android/support/v7/recyclerview/extensions/AsyncListDiffer$1$1;
    ((AsyncListDiffer.1.1)localObject).<init>(this);
    localObject = DiffUtil.calculateDiff((DiffUtil.Callback)localObject);
    Executor localExecutor = AsyncListDiffer.access$000(this.this$0).getMainThreadExecutor();
    AsyncListDiffer.1.2 local2 = new android/support/v7/recyclerview/extensions/AsyncListDiffer$1$2;
    local2.<init>(this, (DiffUtil.DiffResult)localObject);
    localExecutor.execute(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\recyclerview\extensions\AsyncListDiffer$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */