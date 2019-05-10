package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.DataItemAsset;

public class DataItemAssetParcelable
  implements SafeParcelable, DataItemAsset
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final String zzvs;
  private final String zzyv;
  
  static
  {
    zzab localzzab = new com/google/android/gms/wearable/internal/zzab;
    localzzab.<init>();
    CREATOR = localzzab;
  }
  
  DataItemAssetParcelable(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.zzyv = paramString1;
    this.zzvs = paramString2;
  }
  
  public DataItemAssetParcelable(DataItemAsset paramDataItemAsset)
  {
    this.mVersionCode = 1;
    String str = (String)zzx.zzz(paramDataItemAsset.getId());
    this.zzyv = str;
    str = (String)zzx.zzz(paramDataItemAsset.getDataItemKey());
    this.zzvs = str;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getDataItemKey()
  {
    return this.zzvs;
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("DataItemAssetParcelable[");
    localStringBuilder.append("@");
    int i = hashCode();
    String str = Integer.toHexString(i);
    localStringBuilder.append(str);
    str = this.zzyv;
    if (str == null)
    {
      str = ",noid";
      localStringBuilder.append(str);
    }
    for (;;)
    {
      localStringBuilder.append(", key=");
      str = this.zzvs;
      localStringBuilder.append(str);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(",");
      str = this.zzyv;
      localStringBuilder.append(str);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzab.zza(this, paramParcel, paramInt);
  }
  
  public DataItemAsset zzIL()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\DataItemAssetParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */