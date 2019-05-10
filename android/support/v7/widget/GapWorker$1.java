package android.support.v7.widget;

import java.util.Comparator;

final class GapWorker$1
  implements Comparator
{
  public int compare(GapWorker.Task paramTask1, GapWorker.Task paramTask2)
  {
    int i = -1;
    float f1 = 0.0F / 0.0F;
    int j = 1;
    float f2 = Float.MIN_VALUE;
    RecyclerView localRecyclerView1 = paramTask1.view;
    int k;
    RecyclerView localRecyclerView2;
    int n;
    if (localRecyclerView1 == null)
    {
      k = j;
      localRecyclerView2 = paramTask2.view;
      if (localRecyclerView2 != null) {
        break label74;
      }
      n = j;
      label44:
      if (k == n) {
        break label93;
      }
      localRecyclerView1 = paramTask1.view;
      if (localRecyclerView1 != null) {
        break label83;
      }
    }
    for (;;)
    {
      return j;
      k = 0;
      localRecyclerView1 = null;
      break;
      label74:
      n = 0;
      localRecyclerView2 = null;
      break label44;
      label83:
      j = i;
      f2 = f1;
      continue;
      label93:
      boolean bool1 = paramTask1.immediate;
      boolean bool2 = paramTask2.immediate;
      if (bool1 != bool2)
      {
        bool1 = paramTask1.immediate;
        if (bool1) {}
        for (;;)
        {
          j = i;
          f2 = f1;
          break;
          i = j;
          f1 = f2;
        }
      }
      int m = paramTask2.viewVelocity;
      j = paramTask1.viewVelocity;
      j = m - j;
      if (j == 0)
      {
        m = paramTask1.distanceToItem;
        j = paramTask2.distanceToItem;
        j = m - j;
        if (j == 0)
        {
          j = 0;
          f2 = 0.0F;
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\GapWorker$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */