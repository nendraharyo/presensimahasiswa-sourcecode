package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class DefaultItemAnimator$3
  implements Runnable
{
  DefaultItemAnimator$3(DefaultItemAnimator paramDefaultItemAnimator, ArrayList paramArrayList) {}
  
  public void run()
  {
    Object localObject1 = this.val$additions;
    Object localObject2 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (RecyclerView.ViewHolder)((Iterator)localObject2).next();
      DefaultItemAnimator localDefaultItemAnimator = this.this$0;
      localDefaultItemAnimator.animateAddImpl((RecyclerView.ViewHolder)localObject1);
    }
    this.val$additions.clear();
    localObject1 = this.this$0.mAdditionsList;
    localObject2 = this.val$additions;
    ((ArrayList)localObject1).remove(localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DefaultItemAnimator$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */