package android.support.v7.widget;

import java.util.ArrayList;

class RecyclerView$RecycledViewPool$ScrapData
{
  long mBindRunningAverageNs;
  long mCreateRunningAverageNs;
  int mMaxScrap;
  final ArrayList mScrapHeap;
  
  RecyclerView$RecycledViewPool$ScrapData()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mScrapHeap = localArrayList;
    this.mMaxScrap = 5;
    this.mCreateRunningAverageNs = l;
    this.mBindRunningAverageNs = l;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\RecyclerView$RecycledViewPool$ScrapData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */