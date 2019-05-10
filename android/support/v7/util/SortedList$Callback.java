package android.support.v7.util;

import java.util.Comparator;

public abstract class SortedList$Callback
  implements ListUpdateCallback, Comparator
{
  public abstract boolean areContentsTheSame(Object paramObject1, Object paramObject2);
  
  public abstract boolean areItemsTheSame(Object paramObject1, Object paramObject2);
  
  public abstract int compare(Object paramObject1, Object paramObject2);
  
  public Object getChangePayload(Object paramObject1, Object paramObject2)
  {
    return null;
  }
  
  public abstract void onChanged(int paramInt1, int paramInt2);
  
  public void onChanged(int paramInt1, int paramInt2, Object paramObject)
  {
    onChanged(paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v\\util\SortedList$Callback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */