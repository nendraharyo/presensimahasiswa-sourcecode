package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzaf
  extends zzc
  implements DataItem
{
  private final int zzaDQ;
  
  public zzaf(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.zzaDQ = paramInt2;
  }
  
  public Map getAssets()
  {
    HashMap localHashMap = new java/util/HashMap;
    int i = this.zzaDQ;
    localHashMap.<init>(i);
    i = 0;
    int j = this.zzaDQ;
    if (i < j)
    {
      zzac localzzac = new com/google/android/gms/wearable/internal/zzac;
      Object localObject = this.zzahi;
      int k = this.zzaje + i;
      localzzac.<init>((DataHolder)localObject, k);
      localObject = localzzac.getDataItemKey();
      if (localObject == null) {}
      for (;;)
      {
        i += 1;
        break;
        localObject = localzzac.getDataItemKey();
        localHashMap.put(localObject, localzzac);
      }
    }
    return localHashMap;
  }
  
  public byte[] getData()
  {
    return getByteArray("data");
  }
  
  public Uri getUri()
  {
    return Uri.parse(getString("path"));
  }
  
  public DataItem setData(byte[] paramArrayOfByte)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public String toString()
  {
    boolean bool = Log.isLoggable("DataItem", 3);
    return toString(bool);
  }
  
  public String toString(boolean paramBoolean)
  {
    Object localObject1 = getData();
    Object localObject2 = getAssets();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("DataItemInternal{ ");
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("uri=");
    Object localObject4 = getUri();
    localObject3 = localObject4;
    localStringBuilder.append((String)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject4 = ", dataSz=";
    localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
    if (localObject1 == null) {}
    int j;
    for (localObject1 = "null";; localObject1 = Integer.valueOf(j))
    {
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = ", numAssets=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      int i = ((Map)localObject2).size();
      localObject1 = i;
      localStringBuilder.append((String)localObject1);
      if (!paramBoolean) {
        break label334;
      }
      boolean bool = ((Map)localObject2).isEmpty();
      if (bool) {
        break label334;
      }
      localStringBuilder.append(", assets=[");
      localObject1 = "";
      localObject3 = ((Map)localObject2).entrySet().iterator();
      for (localObject2 = localObject1;; localObject2 = localObject1)
      {
        bool = ((Iterator)localObject3).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject3).next();
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append((String)localObject2);
        localObject2 = (String)((Map.Entry)localObject1).getKey();
        localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
        localObject4 = ": ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
        localObject1 = ((DataItemAsset)((Map.Entry)localObject1).getValue()).getId();
        localObject1 = (String)localObject1;
        localStringBuilder.append((String)localObject1);
        localObject1 = ", ";
      }
      j = localObject1.length;
    }
    localObject1 = "]";
    localStringBuilder.append((String)localObject1);
    label334:
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public DataItem zzIM()
  {
    zzad localzzad = new com/google/android/gms/wearable/internal/zzad;
    localzzad.<init>(this);
    return localzzad;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzaf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */