package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class DefaultItemAnimator$2
  implements Runnable
{
  DefaultItemAnimator$2(DefaultItemAnimator paramDefaultItemAnimator, ArrayList paramArrayList) {}
  
  public void run()
  {
    Object localObject1 = this.val$changes;
    Object localObject2 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (DefaultItemAnimator.ChangeInfo)((Iterator)localObject2).next();
      DefaultItemAnimator localDefaultItemAnimator = this.this$0;
      localDefaultItemAnimator.animateChangeImpl((DefaultItemAnimator.ChangeInfo)localObject1);
    }
    this.val$changes.clear();
    localObject1 = this.this$0.mChangesList;
    localObject2 = this.val$changes;
    ((ArrayList)localObject1).remove(localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DefaultItemAnimator$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */