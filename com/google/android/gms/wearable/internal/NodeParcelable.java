package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Node;

public class NodeParcelable
  implements SafeParcelable, Node
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  private final String zzWQ;
  private final int zzbsY;
  private final boolean zzbsZ;
  private final String zzyv;
  
  static
  {
    zzbc localzzbc = new com/google/android/gms/wearable/internal/zzbc;
    localzzbc.<init>();
    CREATOR = localzzbc;
  }
  
  NodeParcelable(int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.zzyv = paramString1;
    this.zzWQ = paramString2;
    this.zzbsY = paramInt2;
    this.zzbsZ = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof NodeParcelable;
    String str1;
    if (!bool)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      paramObject = (NodeParcelable)paramObject;
      str1 = ((NodeParcelable)paramObject).zzyv;
      String str2 = this.zzyv;
      bool = str1.equals(str2);
    }
  }
  
  public String getDisplayName()
  {
    return this.zzWQ;
  }
  
  public int getHopCount()
  {
    return this.zzbsY;
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public int hashCode()
  {
    return this.zzyv.hashCode();
  }
  
  public boolean isNearby()
  {
    return this.zzbsZ;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Node{");
    String str = this.zzWQ;
    localStringBuilder = localStringBuilder.append(str).append(", id=");
    str = this.zzyv;
    localStringBuilder = localStringBuilder.append(str).append(", hops=");
    int i = this.zzbsY;
    localStringBuilder = localStringBuilder.append(i).append(", isNearby=");
    boolean bool = this.zzbsZ;
    return bool + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\NodeParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */