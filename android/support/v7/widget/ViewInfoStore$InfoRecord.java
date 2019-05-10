package android.support.v7.widget;

import android.support.v4.h.k.a;
import android.support.v4.h.k.b;

class ViewInfoStore$InfoRecord
{
  static final int FLAG_APPEAR = 2;
  static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
  static final int FLAG_APPEAR_PRE_AND_POST = 14;
  static final int FLAG_DISAPPEARED = 1;
  static final int FLAG_POST = 8;
  static final int FLAG_PRE = 4;
  static final int FLAG_PRE_AND_POST = 12;
  static k.a sPool;
  int flags;
  RecyclerView.ItemAnimator.ItemHolderInfo postInfo;
  RecyclerView.ItemAnimator.ItemHolderInfo preInfo;
  
  static
  {
    k.b localb = new android/support/v4/h/k$b;
    localb.<init>(20);
    sPool = localb;
  }
  
  static void drainCache()
  {
    Object localObject;
    do
    {
      localObject = sPool.acquire();
    } while (localObject != null);
  }
  
  static InfoRecord obtain()
  {
    InfoRecord localInfoRecord = (InfoRecord)sPool.acquire();
    if (localInfoRecord == null)
    {
      localInfoRecord = new android/support/v7/widget/ViewInfoStore$InfoRecord;
      localInfoRecord.<init>();
    }
    return localInfoRecord;
  }
  
  static void recycle(InfoRecord paramInfoRecord)
  {
    paramInfoRecord.flags = 0;
    paramInfoRecord.preInfo = null;
    paramInfoRecord.postInfo = null;
    sPool.release(paramInfoRecord);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ViewInfoStore$InfoRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */