package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public final class zzz
  extends zzc
  implements DataEvent
{
  private final int zzaDQ;
  
  public zzz(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.zzaDQ = paramInt2;
  }
  
  public DataItem getDataItem()
  {
    zzaf localzzaf = new com/google/android/gms/wearable/internal/zzaf;
    DataHolder localDataHolder = this.zzahi;
    int i = this.zzaje;
    int j = this.zzaDQ;
    localzzaf.<init>(localDataHolder, i, j);
    return localzzaf;
  }
  
  public int getType()
  {
    return getInteger("event_type");
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
      localObject1 = ((StringBuilder)localObject2).append("DataEventRef{ type=").append((String)localObject1).append(", dataitem=");
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
    zzy localzzy = new com/google/android/gms/wearable/internal/zzy;
    localzzy.<init>(this);
    return localzzy;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */