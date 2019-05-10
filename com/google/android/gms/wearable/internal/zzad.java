package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzad
  implements DataItem
{
  private Uri mUri;
  private byte[] zzaKm;
  private Map zzbsy;
  
  public zzad(DataItem paramDataItem)
  {
    Object localObject1 = paramDataItem.getUri();
    this.mUri = ((Uri)localObject1);
    localObject1 = paramDataItem.getData();
    this.zzaKm = ((byte[])localObject1);
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localObject1 = paramDataItem.getAssets().entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = ((Map.Entry)localObject1).getKey();
      if (localObject2 != null)
      {
        localObject2 = ((Map.Entry)localObject1).getKey();
        localObject1 = ((DataItemAsset)((Map.Entry)localObject1).getValue()).freeze();
        localHashMap.put(localObject2, localObject1);
      }
    }
    localObject1 = Collections.unmodifiableMap(localHashMap);
    this.zzbsy = ((Map)localObject1);
  }
  
  public Map getAssets()
  {
    return this.zzbsy;
  }
  
  public byte[] getData()
  {
    return this.zzaKm;
  }
  
  public Uri getUri()
  {
    return this.mUri;
  }
  
  public boolean isDataValid()
  {
    return true;
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
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("DataItemEntity{ ");
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("uri=");
    Object localObject2 = this.mUri;
    localObject1 = localObject2;
    localStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append(", dataSz=");
    localObject1 = this.zzaKm;
    if (localObject1 == null) {}
    int j;
    for (localObject1 = "null";; localObject1 = Integer.valueOf(j))
    {
      localObject1 = localObject1;
      localStringBuilder.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", numAssets=");
      localObject2 = this.zzbsy;
      int i = ((Map)localObject2).size();
      localObject1 = i;
      localStringBuilder.append((String)localObject1);
      if (!paramBoolean) {
        break label330;
      }
      localObject1 = this.zzbsy;
      boolean bool = ((Map)localObject1).isEmpty();
      if (bool) {
        break label330;
      }
      localStringBuilder.append(", assets=[");
      localObject1 = "";
      Iterator localIterator = this.zzbsy.entrySet().iterator();
      for (localObject2 = localObject1;; localObject2 = localObject1)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (Map.Entry)localIterator.next();
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject2 = (String)((Map.Entry)localObject1).getKey();
        localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject3 = ": ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject1 = ((DataItemAsset)((Map.Entry)localObject1).getValue()).getId();
        localObject1 = (String)localObject1;
        localStringBuilder.append((String)localObject1);
        localObject1 = ", ";
      }
      j = this.zzaKm.length;
    }
    localObject1 = "]";
    localStringBuilder.append((String)localObject1);
    label330:
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public DataItem zzIM()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */