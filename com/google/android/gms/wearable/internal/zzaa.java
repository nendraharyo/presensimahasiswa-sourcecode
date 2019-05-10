package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class zzaa
  implements DataItemAsset
{
  private final String zzvs;
  private final String zzyv;
  
  public zzaa(DataItemAsset paramDataItemAsset)
  {
    String str = paramDataItemAsset.getId();
    this.zzyv = str;
    str = paramDataItemAsset.getDataItemKey();
    this.zzvs = str;
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
    localStringBuilder.append("DataItemAssetEntity[");
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
  
  public DataItemAsset zzIL()
  {
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzaa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */