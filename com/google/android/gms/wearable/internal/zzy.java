package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class zzy
  implements DataEvent
{
  private int zzabB;
  private DataItem zzbsv;
  
  public zzy(DataEvent paramDataEvent)
  {
    int i = paramDataEvent.getType();
    this.zzabB = i;
    DataItem localDataItem = (DataItem)paramDataEvent.getDataItem().freeze();
    this.zzbsv = localDataItem;
  }
  
  public DataItem getDataItem()
  {
    return this.zzbsv;
  }
  
  public int getType()
  {
    return this.zzabB;
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    int i = getType();
    int j = 1;
    Object localObject1;
    if (i == j) {
      localObject1 = "changed";
    }
    for (;;)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append("DataEventEntity{ type=").append((String)localObject1).append(", dataitem=");
      localObject2 = getDataItem();
      return localObject2 + " }";
      i = getType();
      j = 2;
      if (i == j) {
        localObject1 = "deleted";
      } else {
        localObject1 = "unknown";
      }
    }
  }
  
  public DataEvent zzIK()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */