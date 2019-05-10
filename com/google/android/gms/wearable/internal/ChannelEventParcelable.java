package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

public final class ChannelEventParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int type;
  final int zzbsa;
  final int zzbsb;
  final ChannelImpl zzbsc;
  
  static
  {
    zzn localzzn = new com/google/android/gms/wearable/internal/zzn;
    localzzn.<init>();
    CREATOR = localzzn;
  }
  
  ChannelEventParcelable(int paramInt1, ChannelImpl paramChannelImpl, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mVersionCode = paramInt1;
    this.zzbsc = paramChannelImpl;
    this.type = paramInt2;
    this.zzbsa = paramInt3;
    this.zzbsb = paramInt4;
  }
  
  private static String zzlG(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = Integer.toString(paramInt);
    }
    for (;;)
    {
      return str;
      str = "CHANNEL_OPENED";
      continue;
      str = "CHANNEL_CLOSED";
      continue;
      str = "OUTPUT_CLOSED";
      continue;
      str = "INPUT_CLOSED";
    }
  }
  
  private static String zzlH(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = Integer.toString(paramInt);
    }
    for (;;)
    {
      return str;
      str = "CLOSE_REASON_DISCONNECTED";
      continue;
      str = "CLOSE_REASON_REMOTE_CLOSE";
      continue;
      str = "CLOSE_REASON_LOCAL_CLOSE";
      continue;
      str = "CLOSE_REASON_NORMAL";
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("ChannelEventParcelable[versionCode=");
    int i = this.mVersionCode;
    localStringBuilder = localStringBuilder.append(i).append(", channel=");
    Object localObject = this.zzbsc;
    localStringBuilder = localStringBuilder.append(localObject).append(", type=");
    localObject = zzlG(this.type);
    localStringBuilder = localStringBuilder.append((String)localObject).append(", closeReason=");
    localObject = zzlH(this.zzbsa);
    localStringBuilder = localStringBuilder.append((String)localObject).append(", appErrorCode=");
    i = this.zzbsb;
    return i + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
  
  public void zza(ChannelApi.ChannelListener paramChannelListener)
  {
    int i = this.type;
    Object localObject1;
    int j;
    switch (i)
    {
    default: 
      localObject1 = "ChannelEventParcelable";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Unknown type: ";
      localObject2 = ((StringBuilder)localObject2).append(str);
      j = this.type;
      localObject2 = j;
      Log.w((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = this.zzbsc;
      paramChannelListener.onChannelOpened((Channel)localObject1);
      continue;
      localObject1 = this.zzbsc;
      int k = this.zzbsa;
      j = this.zzbsb;
      paramChannelListener.onChannelClosed((Channel)localObject1, k, j);
      continue;
      localObject1 = this.zzbsc;
      k = this.zzbsa;
      j = this.zzbsb;
      paramChannelListener.onInputClosed((Channel)localObject1, k, j);
      continue;
      localObject1 = this.zzbsc;
      k = this.zzbsa;
      j = this.zzbsb;
      paramChannelListener.onOutputClosed((Channel)localObject1, k, j);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\ChannelEventParcelable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */