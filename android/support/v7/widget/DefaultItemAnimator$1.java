package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class DefaultItemAnimator$1
  implements Runnable
{
  DefaultItemAnimator$1(DefaultItemAnimator paramDefaultItemAnimator, ArrayList paramArrayList) {}
  
  public void run()
  {
    Object localObject1 = this.val$moves;
    Iterator localIterator = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = localIterator.next();
      Object localObject2 = localObject1;
      localObject2 = (DefaultItemAnimator.MoveInfo)localObject1;
      localObject1 = this.this$0;
      localObject3 = ((DefaultItemAnimator.MoveInfo)localObject2).holder;
      int i = ((DefaultItemAnimator.MoveInfo)localObject2).fromX;
      int j = ((DefaultItemAnimator.MoveInfo)localObject2).fromY;
      int k = ((DefaultItemAnimator.MoveInfo)localObject2).toX;
      int m = ((DefaultItemAnimator.MoveInfo)localObject2).toY;
      ((DefaultItemAnimator)localObject1).animateMoveImpl((RecyclerView.ViewHolder)localObject3, i, j, k, m);
    }
    this.val$moves.clear();
    localObject1 = this.this$0.mMovesList;
    Object localObject3 = this.val$moves;
    ((ArrayList)localObject1).remove(localObject3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DefaultItemAnimator$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */