package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.zzsi;
import com.google.android.gms.internal.zzsi.zza;
import com.google.android.gms.internal.zzsj;
import com.google.android.gms.internal.zzst;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataMapItem
{
  private final Uri mUri;
  private final DataMap zzbrd;
  
  private DataMapItem(DataItem paramDataItem)
  {
    Object localObject = paramDataItem.getUri();
    this.mUri = ((Uri)localObject);
    localObject = (DataItem)paramDataItem.freeze();
    localObject = zza((DataItem)localObject);
    this.zzbrd = ((DataMap)localObject);
  }
  
  public static DataMapItem fromDataItem(DataItem paramDataItem)
  {
    if (paramDataItem == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("provided dataItem is null");
      throw ((Throwable)localObject);
    }
    Object localObject = new com/google/android/gms/wearable/DataMapItem;
    ((DataMapItem)localObject).<init>(paramDataItem);
    return (DataMapItem)localObject;
  }
  
  private DataMap zza(DataItem paramDataItem)
  {
    Object localObject1 = null;
    Object localObject2 = paramDataItem.getData();
    int i;
    if (localObject2 == null)
    {
      localObject2 = paramDataItem.getAssets();
      i = ((Map)localObject2).size();
      if (i > 0)
      {
        localObject2 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject2).<init>("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        throw ((Throwable)localObject2);
      }
    }
    localObject2 = paramDataItem.getData();
    if (localObject2 == null)
    {
      localObject2 = new com/google/android/gms/wearable/DataMap;
      ((DataMap)localObject2).<init>();
    }
    for (;;)
    {
      return (DataMap)localObject2;
      try
      {
        localObject4 = new java/util/ArrayList;
        ((ArrayList)localObject4).<init>();
        localObject2 = paramDataItem.getAssets();
        int j = ((Map)localObject2).size();
        k = 0;
        localObject5 = null;
        if (k < j)
        {
          localObject2 = paramDataItem.getAssets();
          String str = Integer.toString(k);
          localObject2 = ((Map)localObject2).get(str);
          localObject2 = (DataItemAsset)localObject2;
          if (localObject2 == null)
          {
            localObject2 = new java/lang/IllegalStateException;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject6 = "Cannot find DataItemAsset referenced in data at ";
            localObject4 = ((StringBuilder)localObject4).append((String)localObject6);
            localObject5 = ((StringBuilder)localObject4).append(k);
            localObject4 = " for ";
            localObject5 = ((StringBuilder)localObject5).append((String)localObject4);
            localObject5 = ((StringBuilder)localObject5).append(paramDataItem);
            localObject5 = ((StringBuilder)localObject5).toString();
            ((IllegalStateException)localObject2).<init>((String)localObject5);
            throw ((Throwable)localObject2);
          }
        }
      }
      catch (zzst localzzst)
      {
        Object localObject4;
        for (;;)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject4 = ((StringBuilder)localObject4).append("Unable to parse datamap from dataItem. uri=");
          Object localObject6 = paramDataItem.getUri();
          localObject4 = ((StringBuilder)localObject4).append(localObject6).append(", data=");
          localObject1 = Base64.encodeToString(paramDataItem.getData(), 0);
          localObject1 = (String)localObject1;
          Log.w("DataItem", (String)localObject1);
          localObject5 = new java/lang/IllegalStateException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append("Unable to parse datamap from dataItem.  uri=");
          localObject4 = paramDataItem.getUri();
          localObject1 = localObject4;
          ((IllegalStateException)localObject5).<init>((String)localObject1, localzzst);
          throw ((Throwable)localObject5);
          localObject3 = localzzst.getId();
          localObject3 = Asset.createFromRef((String)localObject3);
          ((List)localObject4).add(localObject3);
          i = k + 1;
          int k = i;
        }
        Object localObject3 = paramDataItem.getData();
        localObject3 = zzsj.zzA((byte[])localObject3);
        Object localObject5 = new com/google/android/gms/internal/zzsi$zza;
        ((zzsi.zza)localObject5).<init>((zzsj)localObject3, (List)localObject4);
        localObject3 = zzsi.zza((zzsi.zza)localObject5);
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;) {}
      }
    }
  }
  
  public DataMap getDataMap()
  {
    return this.zzbrd;
  }
  
  public Uri getUri()
  {
    return this.mUri;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\DataMapItem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */