package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DataItemParcelable
  implements SafeParcelable, DataItem
{
  public static final Parcelable.Creator CREATOR;
  private final Uri mUri;
  final int mVersionCode;
  private byte[] zzaKm;
  private final Map zzbsy;
  
  static
  {
    zzae localzzae = new com/google/android/gms/wearable/internal/zzae;
    localzzae.<init>();
    CREATOR = localzzae;
  }
  
  DataItemParcelable(int paramInt, Uri paramUri, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this.mVersionCode = paramInt;
    this.mUri = paramUri;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = DataItemAssetParcelable.class.getClassLoader();
    paramBundle.setClassLoader((ClassLoader)localObject);
    localObject = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      DataItemAssetParcelable localDataItemAssetParcelable = (DataItemAssetParcelable)paramBundle.getParcelable((String)localObject);
      localHashMap.put(localObject, localDataItemAssetParcelable);
    }
    this.zzbsy = localHashMap;
    this.zzaKm = paramArrayOfByte;
  }
  
  public int describeContents()
  {
    return 0;
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
  
  public String toString()
  {
    boolean bool = Log.isLoggable("DataItem", 3);
    return toString(bool);
  }
  
  public String toString(boolean paramBoolean)
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>("DataItemParcelable[");
    localStringBuilder1.append("@");
    int i = hashCode();
    Object localObject1 = Integer.toHexString(i);
    localStringBuilder1.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = ((StringBuilder)localObject1).append(",dataSz=");
    localObject1 = this.zzaKm;
    if (localObject1 == null)
    {
      localObject1 = "null";
      localObject1 = localObject1;
      localStringBuilder1.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", numAssets=");
      int j = this.zzbsy.size();
      localObject1 = j;
      localStringBuilder1.append((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(", uri=");
      localObject2 = this.mUri;
      localObject1 = localObject2;
      localStringBuilder1.append((String)localObject1);
      if (paramBoolean) {
        break label216;
      }
      localStringBuilder1.append("]");
    }
    for (localObject1 = localStringBuilder1.toString();; localObject1 = localStringBuilder1.toString())
    {
      return (String)localObject1;
      i = this.zzaKm.length;
      localObject1 = Integer.valueOf(i);
      break;
      label216:
      localStringBuilder1.append("]\n  assets: ");
      localObject1 = this.zzbsy.keySet();
      localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
        localStringBuilder2.<init>();
        localStringBuilder2 = localStringBuilder2.append("\n    ").append((String)localObject1).append(": ");
        Map localMap = this.zzbsy;
        localObject1 = localMap.get(localObject1);
        localObject1 = localObject1;
        localStringBuilder1.append((String)localObject1);
      }
      localStringBuilder1.append("\n  ]");
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzae.zza(this, paramParcel, paramInt);
  }
  
  public DataItemParcelable zzIN()
  {
    return this;
  }
  
  public Bundle zzIv()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject = DataItemAssetParcelable.class.getClassLoader();
    localBundle.setClassLoader((ClassLoader)localObject);
    localObject = this.zzbsy.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      DataItemAssetParcelable localDataItemAssetParcelable = new com/google/android/gms/wearable/internal/DataItemAssetParcelable;
      localObject = (DataItemAsset)((Map.Entry)localObject).getValue();
      localDataItemAssetParcelable.<init>((DataItemAsset)localObject);
      localBundle.putParcelable(str, localDataItemAssetParcelable);
    }
    return localBundle;
  }
  
  public DataItemParcelable zzz(byte[] paramArrayOfByte)
  {
    this.zzaKm = paramArrayOfByte;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\DataItemParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */