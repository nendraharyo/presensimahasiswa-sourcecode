package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

public class MessageEventParcelable
  implements SafeParcelable, MessageEvent
{
  public static final Parcelable.Creator CREATOR;
  private final String mPath;
  final int mVersionCode;
  private final byte[] zzaKm;
  private final String zzaPI;
  private final int zzaox;
  
  static
  {
    zzba localzzba = new com/google/android/gms/wearable/internal/zzba;
    localzzba.<init>();
    CREATOR = localzzba;
  }
  
  MessageEventParcelable(int paramInt1, int paramInt2, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    this.mVersionCode = paramInt1;
    this.zzaox = paramInt2;
    this.mPath = paramString1;
    this.zzaKm = paramArrayOfByte;
    this.zzaPI = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public byte[] getData()
  {
    return this.zzaKm;
  }
  
  public String getPath()
  {
    return this.mPath;
  }
  
  public int getRequestId()
  {
    return this.zzaox;
  }
  
  public String getSourceNodeId()
  {
    return this.zzaPI;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("MessageEventParcelable[");
    int i = this.zzaox;
    localObject1 = ((StringBuilder)localObject1).append(i).append(",");
    Object localObject2 = this.mPath;
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append(", size=");
    localObject1 = this.zzaKm;
    if (localObject1 == null) {}
    int j;
    for (localObject1 = "null";; localObject1 = Integer.valueOf(j))
    {
      return localObject1 + "]";
      j = this.zzaKm.length;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzba.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\MessageEventParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */