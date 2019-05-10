package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;

public class ChannelImpl
  implements SafeParcelable, Channel
{
  public static final Parcelable.Creator CREATOR;
  private final String mPath;
  final int mVersionCode;
  private final String zzVo;
  private final String zzbrb;
  
  static
  {
    zzo localzzo = new com/google/android/gms/wearable/internal/zzo;
    localzzo.<init>();
    CREATOR = localzzo;
  }
  
  ChannelImpl(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.mVersionCode = paramInt;
    String str = (String)zzx.zzz(paramString1);
    this.zzVo = str;
    str = (String)zzx.zzz(paramString2);
    this.zzbrb = str;
    str = (String)zzx.zzz(paramString3);
    this.mPath = str;
  }
  
  private static zzb.zza zza(String paramString, IntentFilter[] paramArrayOfIntentFilter)
  {
    ChannelImpl.7 local7 = new com/google/android/gms/wearable/internal/ChannelImpl$7;
    local7.<init>(paramString, paramArrayOfIntentFilter);
    return local7;
  }
  
  public PendingResult addListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener)
  {
    Object localObject = new IntentFilter[1];
    IntentFilter localIntentFilter = zzbn.zzgM("com.google.android.gms.wearable.CHANNEL_EVENT");
    localObject[0] = localIntentFilter;
    localObject = zza(this.zzVo, (IntentFilter[])localObject);
    return zzb.zza(paramGoogleApiClient, (zzb.zza)localObject, paramChannelListener);
  }
  
  public PendingResult close(GoogleApiClient paramGoogleApiClient)
  {
    ChannelImpl.1 local1 = new com/google/android/gms/wearable/internal/ChannelImpl$1;
    local1.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult close(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    ChannelImpl.2 local2 = new com/google/android/gms/wearable/internal/ChannelImpl$2;
    local2.<init>(this, paramGoogleApiClient, paramInt);
    return paramGoogleApiClient.zza(local2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof ChannelImpl;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (ChannelImpl)paramObject;
        String str1 = this.zzVo;
        String str2 = ((ChannelImpl)paramObject).zzVo;
        bool2 = str1.equals(str2);
        if (bool2)
        {
          str1 = ((ChannelImpl)paramObject).zzbrb;
          str2 = this.zzbrb;
          bool2 = zzw.equal(str1, str2);
          if (bool2)
          {
            str1 = ((ChannelImpl)paramObject).mPath;
            str2 = this.mPath;
            bool2 = zzw.equal(str1, str2);
            if (bool2)
            {
              int i = ((ChannelImpl)paramObject).mVersionCode;
              int j = this.mVersionCode;
              if (i == j) {
                continue;
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public PendingResult getInputStream(GoogleApiClient paramGoogleApiClient)
  {
    ChannelImpl.3 local3 = new com/google/android/gms/wearable/internal/ChannelImpl$3;
    local3.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local3);
  }
  
  public String getNodeId()
  {
    return this.zzbrb;
  }
  
  public PendingResult getOutputStream(GoogleApiClient paramGoogleApiClient)
  {
    ChannelImpl.4 local4 = new com/google/android/gms/wearable/internal/ChannelImpl$4;
    local4.<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zza(local4);
  }
  
  public String getPath()
  {
    return this.mPath;
  }
  
  public String getToken()
  {
    return this.zzVo;
  }
  
  public int hashCode()
  {
    return this.zzVo.hashCode();
  }
  
  public PendingResult receiveFile(GoogleApiClient paramGoogleApiClient, Uri paramUri, boolean paramBoolean)
  {
    zzx.zzb(paramGoogleApiClient, "client is null");
    zzx.zzb(paramUri, "uri is null");
    ChannelImpl.5 local5 = new com/google/android/gms/wearable/internal/ChannelImpl$5;
    local5.<init>(this, paramGoogleApiClient, paramUri, paramBoolean);
    return paramGoogleApiClient.zza(local5);
  }
  
  public PendingResult removeListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener)
  {
    zzx.zzb(paramGoogleApiClient, "client is null");
    zzx.zzb(paramChannelListener, "listener is null");
    zzl.zzb localzzb = new com/google/android/gms/wearable/internal/zzl$zzb;
    String str = this.zzVo;
    localzzb.<init>(paramGoogleApiClient, paramChannelListener, str);
    return paramGoogleApiClient.zza(localzzb);
  }
  
  public PendingResult sendFile(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return sendFile(paramGoogleApiClient, paramUri, 0L, -1);
  }
  
  public PendingResult sendFile(GoogleApiClient paramGoogleApiClient, Uri paramUri, long paramLong1, long paramLong2)
  {
    long l1 = 0L;
    boolean bool1 = true;
    zzx.zzb(paramGoogleApiClient, "client is null");
    Object localObject1 = this.zzVo;
    Object localObject2 = "token is null";
    zzx.zzb(localObject1, localObject2);
    localObject1 = "uri is null";
    zzx.zzb(paramUri, localObject1);
    boolean bool2 = paramLong1 < l1;
    Object localObject3;
    long l2;
    if (!bool2)
    {
      bool2 = bool1;
      localObject2 = "startOffset is negative: %s";
      localObject3 = new Object[bool1];
      Long localLong = Long.valueOf(paramLong1);
      localObject3[0] = localLong;
      zzx.zzb(bool2, (String)localObject2, (Object[])localObject3);
      bool2 = paramLong2 < l1;
      if (bool2)
      {
        l2 = -1;
        bool2 = paramLong2 < l2;
        if (bool2) {
          break label195;
        }
      }
      bool2 = bool1;
    }
    for (;;)
    {
      Object localObject4 = new Object[bool1];
      localObject3 = Long.valueOf(paramLong2);
      localObject4[0] = localObject3;
      zzx.zzb(bool2, "invalid length: %s", (Object[])localObject4);
      localObject1 = new com/google/android/gms/wearable/internal/ChannelImpl$6;
      localObject4 = this;
      localObject2 = paramUri;
      l2 = paramLong1;
      l1 = paramLong2;
      ((ChannelImpl.6)localObject1).<init>(this, paramGoogleApiClient, paramUri, paramLong1, paramLong2);
      return paramGoogleApiClient.zza((zza.zza)localObject1);
      bool2 = false;
      localObject1 = null;
      break;
      label195:
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public String toString()
  {
    char c = '\'';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("ChannelImpl{versionCode=");
    int i = this.mVersionCode;
    localStringBuilder = localStringBuilder.append(i).append(", token='");
    String str = this.zzVo;
    localStringBuilder = localStringBuilder.append(str).append(c).append(", nodeId='");
    str = this.zzbrb;
    localStringBuilder = localStringBuilder.append(str).append(c).append(", path='");
    str = this.mPath;
    return str + c + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\ChannelImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */